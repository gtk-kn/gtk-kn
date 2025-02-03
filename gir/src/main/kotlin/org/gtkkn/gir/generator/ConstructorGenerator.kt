/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.FieldBlueprint
import org.gtkkn.gir.blueprints.HasConstructorsBlueprint
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.MemoryManagement
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

/**
 * Provides functions to generate class constructors, factory methods, and
 * related initialization code for classes, records, and unions.
 */
interface ConstructorGenerator : FieldGenerator, MethodGenerator {
    /**
     * Builds the initializer block and ensure that the TypeCache will be populated by the repository object
     */
    fun TypeSpec.Builder.addRepositoryObjectInitializerBlock(repository: RepositoryBlueprint) =
        addInitializerBlock(CodeBlock.of("%T\n", repository.repositoryObjectName))

    /**
     * Builds the primary pointer constructor for a class/record/union.
     */
    fun TypeSpec.Builder.addPrimaryPointerConstructor(
        blueprint: HasConstructorsBlueprint,
    ) {
        addProperty(buildClassObjectPointerProperty(blueprint))
        val builder = FunSpec.constructorBuilder()
            .addParameter(blueprint.objectPointerName, blueprint.objectPointerTypeName)

        if (blueprint.hasParent) {
            // If class has a parent, pass the pointer to the superclass constructor
            addSuperclassConstructorParameter(
                CodeBlock.of("%L.%M()", blueprint.objectPointerName, BindingsGenerator.REINTERPRET_FUNC),
            )
        } else {
            if (blueprint.objectPointerName == "gobjectObjectPointer") {
                builder.addStatement("%M()", BindingsGenerator.GOBJECT_ASSOCIATE_CUSTOM_OBJECT)
            }
        }
        primaryConstructor(builder.build())
    }

    /**
     * Builds a property representing the object's pointer.
     *
     * @param blueprint The [HasConstructorsBlueprint] blueprint.
     */
    fun buildClassObjectPointerProperty(blueprint: HasConstructorsBlueprint): PropertySpec =
        PropertySpec.builder(blueprint.objectPointerName, blueprint.objectPointerTypeName)
            .initializer(blueprint.objectPointerName)
            .build()

    fun TypeSpec.Builder.addGirConstructors(
        blueprint: HasConstructorsBlueprint,
        companionSpecBuilder: TypeSpec.Builder
    ): Boolean {
        val (noArgConstructors, argumentConstructors) = blueprint.constructors.partition { it.parameters.isEmpty() }
        addNoArgConstructors(noArgConstructors, blueprint, companionSpecBuilder)
        addArgumentConstructors(argumentConstructors, blueprint, companionSpecBuilder)
        return noArgConstructors.isNotEmpty()
    }

    /**
     * Handles no-arg constructors (some may be conflicting).
     * The first no-arg constructor becomes the main no-arg constructor,
     * subsequent ones are added as factory methods in the companion.
     */
    fun TypeSpec.Builder.addNoArgConstructors(
        noArgConstructors: List<ConstructorBlueprint>,
        blueprint: HasConstructorsBlueprint,
        companionSpecBuilder: TypeSpec.Builder
    ) {
        noArgConstructors
            .sortedBy { it.nativeName.length }
            .forEachIndexed { index, constructor ->
                if (index == 0) {
                    // main no-arg constructor
                    val mainNoArgConstructor = buildClassConstructor(blueprint, constructor)
                    addFunction(mainNoArgConstructor)
                } else {
                    // conflicting no-arg constructor -> factory method
                    val factory = buildClassConstructorFactoryMethod(blueprint, constructor)
                    companionSpecBuilder.addFunction(factory)
                }
            }
    }

    /**
     * Handles argument constructors, grouped by signature to detect conflicts.
     * The first in each group is created as a regular constructor, subsequent ones
     * become factory methods in the companion.
     */
    fun TypeSpec.Builder.addArgumentConstructors(
        argumentConstructors: List<ConstructorBlueprint>,
        blueprint: HasConstructorsBlueprint,
        companionSpecBuilder: TypeSpec.Builder
    ) {
        val groupBySignature = argumentConstructors.groupBy { constructor ->
            constructor.parameters.joinToString(",") { it.typeInfo.kotlinTypeName.toString() }
        }

        groupBySignature.values.forEach { group ->
            when (group.size) {
                0 -> error("Should not happen")
                1 -> {
                    // Single, non-conflicting constructor
                    val primaryConstructor = buildClassConstructor(blueprint, group.first())
                    addFunction(primaryConstructor)
                }

                else -> {
                    // Conflicting constructors with the same signature
                    group.sortedBy { it.nativeName.length }.forEachIndexed { index, constructor ->
                        if (index == 0) {
                            // shortest method name as the actual constructor
                            val primaryConstructor = buildClassConstructor(blueprint, constructor)
                            addFunction(primaryConstructor)
                        } else {
                            // add conflicting ones as factory methods
                            val factory = buildClassConstructorFactoryMethod(blueprint, constructor)
                            companionSpecBuilder.addFunction(factory)
                        }
                    }
                }
            }
        }
    }

    /**
     * Builds a factory method for a class constructor.
     *
     * This creates a function that calls the native constructor function
     * with the given parameters, handling memory scoping, errors, and
     * returning a [Result] if `throws` is true.
     *
     * @param blueprint The class [HasConstructorsBlueprint].
     * @param constructor The constructor blueprint describing the native constructor.
     */
    fun buildClassConstructorFactoryMethod(
        blueprint: HasConstructorsBlueprint,
        constructor: ConstructorBlueprint,
    ): FunSpec {
        val builder = FunSpec.builder(constructor.kotlinName)

        val returnTypeName = determineConstructorReturnType(blueprint.instanceTypeName, constructor)
        builder.returns(returnTypeName)
        addConstructorKDocIfAny(builder, constructor)

        if (constructor.parameters.isNotEmpty()) {
            appendSignatureParameters(builder, constructor.parameters)
        }

        val codeBlock = buildNativeCallCodeBlock(
            blueprint = blueprint,
            constructorBlueprint = constructor,
            isFactory = true,
        ) { param -> buildParameterConversionBlock(param.typeInfo, param.kotlinName) }

        builder.addCode(codeBlock)
        return builder.build()
    }

    /**
     * Builds a class constructor based on the given [ConstructorBlueprint].
     *
     * If the constructor requires no parameters and does not throw, it's straightforward.
     * Otherwise, it may require preparing a GError pointer, handling memory scoping,
     * and error conditions.
     *
     * @param blueprint the [HasConstructorsBlueprint]
     * @param constructor The blueprint describing the constructor.
     */
    fun buildClassConstructor(
        blueprint: HasConstructorsBlueprint,
        constructor: ConstructorBlueprint,
    ): FunSpec {
        val builder = FunSpec.constructorBuilder()
        addConstructorKDocAndAnnotations(builder, constructor)

        if (constructor.parameters.isNotEmpty()) {
            appendSignatureParameters(builder, constructor.parameters)
        }

        val codeBlock = buildNativeCallCodeBlock(
            blueprint = blueprint,
            constructorBlueprint = constructor,
            isFactory = false,
        ) { param -> buildParameterConversionBlock(param.typeInfo, param.kotlinName) }

        builder.callThisConstructor(codeBlock)
        builder.addCode(buildConstructorMemoryManagementBlock(constructor, false))
        return builder.build()
    }

    fun buildConstructorMemoryManagementBlock(
        constructor: ConstructorBlueprint,
        useInstance: Boolean,
    ): CodeBlock {
        val code = CodeBlock.builder()
        val target = if (useInstance) "instance" else "this"
        when (constructor.memoryManagement) {
            is MemoryManagement.InstanceCache -> code.addStatement(
                "%T.put(%L)",
                BindingsGenerator.INSTANCE_CACHE_TYPE,
                target,
            )

            is MemoryManagement.MemoryCleaner -> {
                when (constructor.memoryManagement.freeOperation) {
                    MemoryManagement.MemoryCleaner.FreeOperation.BoxedType ->
                        code.addStatement(
                            "%T.setBoxedType(%L, getType(), owned = true)",
                            BindingsGenerator.MEMORY_CLEANER_TYPE,
                            target,
                        )

                    is MemoryManagement.MemoryCleaner.FreeOperation.CustomFreeFunction ->
                        code.addStatement(
                            "%T.setFreeFunc(%L, owned = true) { %M(it.%M()) }",
                            BindingsGenerator.MEMORY_CLEANER_TYPE,
                            target,
                            constructor.memoryManagement.freeOperation.memberName,
                            BindingsGenerator.REINTERPRET_FUNC,
                        )

                    null -> code.addStatement("%T.takeOwnership(%L)", BindingsGenerator.MEMORY_CLEANER_TYPE, target)
                }
            }
        }
        return code.build()
    }

    /**
     * Core method that constructs the code block to call the native function with parameters,
     * handle GError, memscoped, reinterpret, etc.
     */
    private fun buildNativeCallCodeBlock(
        blueprint: HasConstructorsBlueprint,
        constructorBlueprint: ConstructorBlueprint,
        isFactory: Boolean,
        parameterConversion: (ParameterBlueprint) -> CodeBlock
    ): CodeBlock {
        val code = CodeBlock.builder()
        beginMemScopedIfNeeded(code, constructorBlueprint)
        beginNativeFunctionCall(code, blueprint, constructorBlueprint, isFactory)
        appendParameters(code, constructorBlueprint, parameterConversion)
        passGErrorPointerIfNeeded(code, constructorBlueprint)
        endNativeFunctionCall(code)
        handleResult(code, blueprint, constructorBlueprint, isFactory)
        endMemScopedIfNeeded(code, constructorBlueprint)
        return code.build()
    }

    private fun beginMemScopedIfNeeded(code: CodeBlock.Builder, constructorBlueprint: ConstructorBlueprint) {
        if (constructorBlueprint.needsMemscoped) {
            code.beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
        }
    }

    private fun beginNativeFunctionCall(
        code: CodeBlock.Builder,
        blueprint: HasConstructorsBlueprint,
        constructorBlueprint: ConstructorBlueprint,
        isFactory: Boolean,
    ) {
        if (constructorBlueprint.throws) {
            // Throwing => allocate GError, store in gResult
            code.addStatement(
                "val gError = %M<%M>()",
                BindingsGenerator.ALLOC_POINTER_TO,
                BindingsGenerator.G_ERROR_MEMBER,
            )
            code.addStatement("gError.%M = null", BindingsGenerator.VALUE_PROPERTY)
            code.add("val gResult = %M(", constructorBlueprint.nativeMemberName)
        } else {
            // Non-throwing => either "return SomeClass(...)" or direct call
            if (isFactory) {
                code.add("return %T(%M(", blueprint.instanceTypeName, constructorBlueprint.nativeMemberName)
            } else {
                code.add("%M(", constructorBlueprint.nativeMemberName) // e.g. callThisConstructor(...)
            }
        }
    }

    private fun appendParameters(
        code: CodeBlock.Builder,
        constructorBlueprint: ConstructorBlueprint,
        parameterConversion: (ParameterBlueprint) -> CodeBlock
    ) {
        constructorBlueprint.parameters.forEachIndexed { index, param ->
            if (index > 0) code.add(", ")
            code.add(parameterConversion(param))
        }
    }

    private fun passGErrorPointerIfNeeded(code: CodeBlock.Builder, constructorBlueprint: ConstructorBlueprint) {
        if (constructorBlueprint.throws) {
            code.add(", gError.%M", BindingsGenerator.PTR_FUNC)
        }
    }

    private fun endNativeFunctionCall(code: CodeBlock.Builder) {
        code.add(")")
    }

    private fun handleResult(
        code: CodeBlock.Builder,
        blueprint: HasConstructorsBlueprint,
        constructorBlueprint: ConstructorBlueprint,
        isFactory: Boolean
    ) {
        if (constructorBlueprint.throws) {
            code.add("\n")
            if (isFactory) {
                handleThrowingFactoryResult(code, constructorBlueprint, blueprint)
            } else {
                handleThrowingConstructorResult(code, constructorBlueprint, blueprint)
            }
        } else {
            handleNonThrowingResult(code, blueprint, constructorBlueprint, isFactory)
        }
    }

    private fun handleThrowingFactoryResult(
        code: CodeBlock.Builder,
        constructorBlueprint: ConstructorBlueprint,
        blueprint: HasConstructorsBlueprint
    ) {
        // if (gError != null) => failure(...) else => success(...)
        code.beginControlFlow("return if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        code.addStatement(
            "%T.failure(%M(%T(gError.%M!!.%M)))",
            BindingsGenerator.RESULT_TYPE,
            constructorBlueprint.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        code.nextControlFlow("else")
        if (blueprint.objectPointerTypeName != constructorBlueprint.returnTypeInfo.nativeTypeName) {
            code.addStatement(
                "val instance = %T(checkNotNull(gResult).%M())",
                determineNonNullReturnType(constructorBlueprint),
                BindingsGenerator.REINTERPRET_FUNC,
            )
        } else {
            code.addStatement(
                "val instance = %T(checkNotNull(gResult))",
                determineNonNullReturnType(constructorBlueprint),
            )
        }
        code.add(buildConstructorMemoryManagementBlock(constructorBlueprint, true))
        code.addStatement(
            "%T.success(instance)",
            BindingsGenerator.RESULT_TYPE,
        )
        code.endControlFlow()
    }

    private fun handleThrowingConstructorResult(
        code: CodeBlock.Builder,
        constructorBlueprint: ConstructorBlueprint,
        blueprint: HasConstructorsBlueprint
    ) {
        code.beginControlFlow("if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        code.addStatement(
            "throw %M(%T(gError.%M!!.%M))",
            constructorBlueprint.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        code.endControlFlow()

        code.add("gResult!!")
        if (blueprint.objectPointerTypeName != constructorBlueprint.returnTypeInfo.nativeTypeName) {
            code.add(".%M()", BindingsGenerator.REINTERPRET_FUNC)
        }
    }

    private fun handleNonThrowingResult(
        code: CodeBlock.Builder,
        blueprint: HasConstructorsBlueprint,
        constructorBlueprint: ConstructorBlueprint,
        isFactory: Boolean
    ) {
        code.add("!!")
        if (blueprint.objectPointerTypeName != constructorBlueprint.returnTypeInfo.nativeTypeName) {
            code.add(".%M()", BindingsGenerator.REINTERPRET_FUNC)
        }
        if (isFactory) {
            code.add(")")
            val codeBlock = buildConstructorMemoryManagementBlock(constructorBlueprint, false)
            if (codeBlock.isNotEmpty()) {
                code.beginControlFlow(".apply ")
                code.add(codeBlock)
                code.endControlFlow()
            }
        }
    }

    private fun endMemScopedIfNeeded(code: CodeBlock.Builder, ctor: ConstructorBlueprint) {
        if (ctor.needsMemscoped) {
            code.add("\n")
            code.endControlFlow() // close memScoped
        }
    }

    /**
     * Builds a property for an interface pointer on a class that implements an interface.
     *
     * The property overrides a pointer from a parent interface and provides a getter
     * that reinterprets `gPointer`.
     *
     * @param iface The blueprint describing the implemented interface.
     */
    fun buildClassInterfacePointerProperty(iface: ImplementsInterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.interfacePointerName, iface.interfacePointerTypeName)
            .addModifiers(KModifier.OVERRIDE)
            .getter(
                FunSpec.getterBuilder()
                    .addStatement("return handle.%M()", BindingsGenerator.REINTERPRET_FUNC)
                    .build(),
            )
            .build()

    /**
     * Creates a simple primary constructor with a single parameter.
     */
    fun buildSimplePrimaryConstructor(paramName: String, paramType: TypeName): FunSpec =
        FunSpec.constructorBuilder()
            .addParameter(paramName, paramType)
            .build()

    /**
     * Adds a no-argument constructor that allocates the object on the native heap.
     *
     * The allocated memory is freed automatically when the object is GCed.
     */
    fun TypeSpec.Builder.addRecordUnionNoArgConstructor(
        kotlinName: String,
        nativeTypeName: TypeName,
        objectPointerTypeName: TypeName,
    ) {
        addFunction(
            FunSpec.constructorBuilder().apply {
                buildMethodKDoc(getNoArgConstructorKdoc(kotlinName))?.let { addKdoc(it) }
                callThisConstructor(
                    CodeBlock.of(
                        "%T.%T<%T>().%M",
                        BindingsGenerator.NATIVE_HEAP_OBJECT,
                        BindingsGenerator.NATIVE_PLACEMENT_ALLOC,
                        nativeTypeName,
                        BindingsGenerator.PTR_FUNC,
                    ),
                )
                addStatement("%T.setNativeHeap(this, owned = true)", BindingsGenerator.MEMORY_CLEANER_TYPE)
            }.build(),
        )
    }

    /**
     * Adds a constructor that allocates the object in the given AutofreeScope.
     *
     * The AutofreeScope manages memory lifetime, commonly used with `memScoped`.
     */
    fun TypeSpec.Builder.addRecordUnionAutofreeScopeConstructor(kotlinName: String, nativeTypeName: TypeName) {
        addFunction(
            FunSpec.constructorBuilder().apply {
                val kdoc = getAutofreeScopeConstructorKdoc(kotlinName)
                buildMethodKDoc(kdoc, listOf(getAutofreeScopeParamForKdoc()))?.let { addKdoc(it) }
                addParameter("scope", BindingsGenerator.AUTOFREE_SCOPE)
                callThisConstructor(
                    CodeBlock.of(
                        "scope.%T<%T>().%M",
                        BindingsGenerator.NATIVE_PLACEMENT_ALLOC,
                        nativeTypeName,
                        BindingsGenerator.PTR_FUNC,
                    ),
                )
            }.build(),
        )
    }

    /**
     * Adds constructors that also initialize fields (if fields are setter-supported).
     *
     * Adds both a no-arg and an autofree scope constructor that set fields from parameters, after
     * delegating to the base constructors.
     */
    fun TypeSpec.Builder.addFieldConstructorsIfAny(kotlinName: String, fields: List<FieldBlueprint>) {
        val settableFields = fields.filter { isFieldSetterSupported(it) }
        if (settableFields.isNotEmpty()) {
            // No-arg field constructor
            addFunction(
                createFieldConstructor(kotlinName, settableFields, noArg = true),
            )

            // Autofree scope field constructor
            addFunction(
                createFieldConstructor(kotlinName, settableFields, noArg = false),
            )
        }
    }

    private fun addConstructorKDocAndAnnotations(funBuilder: FunSpec.Builder, constructor: ConstructorBlueprint) {
        buildMethodKDoc(
            kdoc = constructor.kdoc,
            parameters = constructor.parameters,
            optInVersionBlueprint = constructor.optInVersionBlueprint,
            deprecatedBlueprint = constructor.deprecatedBlueprint,
            returnTypeKDoc = constructor.returnTypeKDoc,
        )?.let { funBuilder.addKdoc(it) }

        if (constructor.throws) {
            funBuilder.addAnnotation(
                AnnotationSpec.builder(BindingsGenerator.THROWS_TYPE)
                    .addMember("%T::class", BindingsGenerator.GLIB_EXCEPTION_TYPE)
                    .build(),
            )
        }
    }

    private fun addConstructorKDocIfAny(builder: FunSpec.Builder, constructor: ConstructorBlueprint) {
        buildMethodKDoc(
            kdoc = constructor.kdoc,
            parameters = constructor.parameters,
            optInVersionBlueprint = constructor.optInVersionBlueprint,
            deprecatedBlueprint = constructor.deprecatedBlueprint,
            returnTypeKDoc = constructor.returnTypeKDoc,
        )?.let { builder.addKdoc(it) }
    }

    private fun determineConstructorReturnType(typeName: ClassName, constructor: ConstructorBlueprint) =
        if (constructor.throws) BindingsGenerator.RESULT_TYPE.parameterizedBy(typeName) else typeName

    private fun determineNonNullReturnType(constructor: ConstructorBlueprint) =
        if (!constructor.returnTypeInfo.kotlinTypeName.isNullable) {
            constructor.returnTypeInfo
        } else {
            constructor.returnTypeInfo.withNullable(false)
        }.run {
            if (this is TypeInfo.ObjectPointer) {
                kotlinTypeNameImpl ?: kotlinTypeName
            } else {
                kotlinTypeName
            }
        }

    private fun appendSignatureParameters(funBuilder: FunSpec.Builder, parameters: List<ParameterBlueprint>) {
        parameters.forEach { param ->
            val paramSpecBuilder = ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName)
            if (param.typeInfo.kotlinTypeName.isNullable && param.defaultNull) {
                paramSpecBuilder.defaultValue("null")
            }
            funBuilder.addParameter(paramSpecBuilder.build())
        }
    }

    private fun createFieldConstructor(
        kotlinName: String,
        settableFields: List<FieldBlueprint>,
        noArg: Boolean
    ): FunSpec {
        val constructorBuilder = FunSpec.constructorBuilder()
        val kdoc = if (noArg) getNoArgConstructorKdoc(kotlinName) else getAutofreeScopeConstructorKdoc(kotlinName)
        val parametersForKdoc = settableFields.map { field ->
            ParameterBlueprint(
                kotlinName = field.kotlinName,
                nativeName = field.kotlinName,
                typeInfo = field.typeInfo,
                defaultNull = false,
                kdoc = field.kdoc,
            )
        } + if (!noArg) listOf(getAutofreeScopeParamForKdoc()) else emptyList()

        buildMethodKDoc(kdoc, parametersForKdoc)?.let { constructorBuilder.addKdoc(it) }

        settableFields.forEach { constructorBuilder.addParameter(it.kotlinName, it.typeInfo.kotlinTypeName) }
        if (!noArg) constructorBuilder.addParameter("scope", BindingsGenerator.AUTOFREE_SCOPE)

        // Delegate to the appropriate constructor (no-arg or scope)
        if (noArg) {
            constructorBuilder.callThisConstructor()
        } else {
            constructorBuilder.callThisConstructor("scope")
        }

        // Initialize fields
        settableFields.forEach { constructorBuilder.addStatement("this.%L = %L", it.kotlinName, it.kotlinName) }

        return constructorBuilder.build()
    }
}
