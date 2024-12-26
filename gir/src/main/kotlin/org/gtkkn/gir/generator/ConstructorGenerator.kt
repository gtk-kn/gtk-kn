/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
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
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.FieldBlueprint
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

/**
 * Provides functions to generate class constructors, factory methods, and
 * related initialization code for classes, records, and unions.
 */
interface ConstructorGenerator : FieldGenerator, MethodGenerator, ConversionBlockGenerator, KDocGenerator {
    /**
     * Builds the primary pointer constructor for a class.
     *
     * If the class has a parent, it calls the superclass constructor to pass the pointer.
     * Otherwise, it initializes the `gPointer` property. For the special `Object` class,
     * it also associates the custom object.
     *
     * @param builder The [TypeSpec.Builder] to which this constructor is added.
     * @param clazz The [ClassBlueprint] describing the class.
     */
    fun buildPointerConstructor(builder: TypeSpec.Builder, clazz: ClassBlueprint) {
        val constructorSpecBuilder = FunSpec.constructorBuilder()
            .addParameter("pointer", clazz.objectPointerTypeName)

        if (clazz.hasParent) {
            // If class has a parent, pass the pointer to the superclass constructor
            builder.addSuperclassConstructorParameter(CodeBlock.of("pointer.%M()", BindingsGenerator.REINTERPRET_FUNC))
        } else {
            if (clazz.kotlinName == "Object") {
                constructorSpecBuilder.addStatement("%M()", BindingsGenerator.GOBJECT_ASSOCIATE_CUSTOM_OBJECT)
            }
        }

        builder.primaryConstructor(constructorSpecBuilder.build())
    }

    /**
     * Builds a class constructor based on the given [ConstructorBlueprint].
     *
     * If the constructor requires no parameters and does not throw, it's straightforward.
     * Otherwise, it may require preparing a GError pointer, handling memory scoping,
     * and error conditions.
     *
     * @param constructor The blueprint describing the constructor.
     * @param callThisConstructor A lambda used to delegate the constructed code block
     *        to `callThisConstructor()`, effectively chaining constructors.
     */
    fun buildClassConstructor(
        constructor: ConstructorBlueprint,
        callThisConstructor: FunSpec.Builder.(CodeBlock) -> Unit
    ): FunSpec {
        val funBuilder = FunSpec.constructorBuilder()

        ensureReturnTypeIsObjectPointer(constructor)

        addConstructorKDocAndAnnotations(funBuilder, constructor)

        if (constructor.parameters.isEmpty()) {
            // No-arg constructor
            if (constructor.throws) error("Throwing no-argument constructors are not supported")
            funBuilder.callThisConstructor(CodeBlock.of("%M()!!.reinterpret()", constructor.nativeMemberName))
        } else {
            // Constructor with arguments
            appendSignatureParameters(funBuilder, constructor.parameters)

            val codeBlockBuilder = CodeBlock.builder()
            if (constructor.needsMemscoped) {
                codeBlockBuilder.beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
            }

            if (constructor.throws) {
                codeBlockBuilder.addStatement(
                    "val gError = %M<%M>()",
                    BindingsGenerator.ALLOC_POINTER_TO,
                    BindingsGenerator.G_ERROR_MEMBER,
                )
                codeBlockBuilder.add("val gResult = %M(", constructor.nativeMemberName)
            } else {
                codeBlockBuilder.add("%M(", constructor.nativeMemberName)
            }

            // Append parameters
            constructor.parameters.forEachIndexed { index, param ->
                if (index > 0) codeBlockBuilder.add(", ")
                codeBlockBuilder.add(buildParameterConversionBlock(param))
            }

            if (constructor.throws) {
                codeBlockBuilder.add(", gError.%M", BindingsGenerator.PTR_FUNC)
            }
            codeBlockBuilder.add(")")

            if (constructor.throws) {
                codeBlockBuilder.addStatement("")
                codeBlockBuilder.beginControlFlow("if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
                codeBlockBuilder.addStatement(
                    "throw %M(%T(gError.%M!!.%M))",
                    constructor.exceptionResolvingFunctionMember,
                    BindingsGenerator.GLIB_ERROR_TYPE,
                    BindingsGenerator.POINTED_FUNC,
                    BindingsGenerator.PTR_FUNC,
                )
                codeBlockBuilder.endControlFlow()
                codeBlockBuilder.addStatement("gResult!!.reinterpret()")
            } else {
                codeBlockBuilder.add("!!.reinterpret()")
            }

            if (constructor.needsMemscoped) {
                codeBlockBuilder.endControlFlow()
            }

            funBuilder.callThisConstructor(codeBlockBuilder.build())
        }

        return funBuilder.build()
    }

    /**
     * Builds a factory method for a class constructor.
     *
     * This creates a function that calls the native constructor function
     * with the given parameters, handling memory scoping, errors, and
     * returning a [Result] if `throws` is true.
     *
     * @param clazz The class blueprint.
     * @param constructor The constructor blueprint describing the native constructor.
     * @param appendSignatureParameters A function to append parameters to the signature.
     * @param addGErrorAllocation A function to allocate and initialize a GError pointer.
     * @param addErrorHandling A function to handle GError after calling the native constructor.
     */
    fun buildClassConstructorFactoryMethod(
        clazz: ClassBlueprint,
        constructor: ConstructorBlueprint,
        appendSignatureParameters: FunSpec.Builder.(List<ParameterBlueprint>) -> Unit,
        addGErrorAllocation: FunSpec.Builder.() -> Unit,
        addErrorHandling: FunSpec.Builder.(ConstructorBlueprint, String) -> Unit,
    ): FunSpec {
        val funBuilder = FunSpec.builder(constructor.kotlinName)
        val returnTypeName = determineConstructorReturnType(clazz, constructor)
        funBuilder.returns(returnTypeName)

        ensureReturnTypeIsObjectPointer(constructor)
        addConstructorKDocIfAny(funBuilder, constructor)

        // If memscoped is needed
        if (constructor.needsMemscoped) {
            funBuilder.beginControlFlow("return %M", BindingsGenerator.MEMSCOPED)
        }

        if (constructor.parameters.isEmpty()) {
            // No-arg factory constructor
            if (constructor.throws) {
                funBuilder.addGErrorAllocation()
                funBuilder.addStatement(
                    "val gResult = %M(gError.%M)",
                    constructor.nativeMemberName,
                    BindingsGenerator.PTR_FUNC,
                )
                funBuilder.addErrorHandling(constructor, "gResult")
            } else {
                funBuilder.addStatement(
                    "return %T(%M()!!.%M())",
                    clazz.typeName,
                    constructor.nativeMemberName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
            }

            if (constructor.needsMemscoped) {
                funBuilder.endControlFlow()
            }
        } else {
            // Factory constructor with arguments
            funBuilder.appendSignatureParameters(constructor.parameters)

            if (constructor.throws) {
                funBuilder.addGErrorAllocation()
                funBuilder.addCode("val gResult = %M(", constructor.nativeMemberName)
            } else {
                funBuilder.addCode("return %T(%M(", clazz.typeName, constructor.nativeMemberName)
            }

            // Append parameters
            constructor.parameters.forEachIndexed { index, param ->
                if (index > 0) {
                    funBuilder.addCode(", ")
                }
                funBuilder.addCode(buildParameterConversionBlock(param))
            }

            if (constructor.throws) {
                funBuilder.addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
                funBuilder.addCode(")\n")
                funBuilder.addErrorHandling(constructor, "gResult")
            } else {
                funBuilder.addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC)
            }

            if (constructor.needsMemscoped) {
                funBuilder.endControlFlow()
            }
        }

        return funBuilder.build()
    }

    /**
     * Builds a property representing the object's pointer.
     *
     * If the class has a parent, the pointer is accessed via a getter that reinterprets `gPointer`.
     * Otherwise, it's set directly.
     *
     * @param clazz The class blueprint.
     */
    fun buildClassObjectPointerProperty(clazz: ClassBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(clazz.objectPointerName, clazz.objectPointerTypeName)
        if (clazz.hasParent) {
            // if class has a parent, use a getter
            propertyBuilder.getter(
                FunSpec.getterBuilder().apply {
                    addStatement("return gPointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
                }.build(),
            )
        } else {
            propertyBuilder.initializer("pointer")
        }
        return propertyBuilder.build()
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
                    .addStatement("return gPointer.%M()", BindingsGenerator.REINTERPRET_FUNC)
                    .build(),
            )
            .build()

    /**
     * Allocates and initializes a GError pointer.
     *
     * This is typically used before calling a native constructor that may throw errors.
     */
    fun FunSpec.Builder.addGErrorAllocation() {
        addStatement("val gError = %M<%M>()", BindingsGenerator.ALLOC_POINTER_TO, BindingsGenerator.G_ERROR_MEMBER)
        addStatement("gError.%M = null", BindingsGenerator.VALUE_PROPERTY)
    }

    /**
     * Handles GError after calling a native constructor function.
     *
     * If `gError` is set, returns a failure [Result].
     * Otherwise, returns a success [Result] wrapping the constructed object.
     *
     * @param constructor The constructor blueprint.
     * @param gResultVariableName The name of the variable holding the native result.
     */
    fun FunSpec.Builder.addErrorHandling(constructor: ConstructorBlueprint, gResultVariableName: String = "gResult") {
        beginControlFlow("return if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        addStatement(
            "%T.failure(%M(%T(gError.%M!!.%M)))",
            BindingsGenerator.RESULT_TYPE,
            constructor.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        endControlFlow()
        beginControlFlow("else")
        val nonNullReturnType = determineNonNullReturnType(constructor)
        addStatement(
            "%T.success(%T(checkNotNull($gResultVariableName).%M()))",
            BindingsGenerator.RESULT_TYPE,
            nonNullReturnType,
            BindingsGenerator.REINTERPRET_FUNC,
        )
        endControlFlow()
    }

    /**
     * Creates a simple primary constructor with a single parameter.
     */
    fun buildSimplePrimaryConstructor(paramName: String, paramType: TypeName): FunSpec =
        FunSpec.constructorBuilder()
            .addParameter(paramName, paramType)
            .build()

    /**
     * Adds a primary constructor with `pointer` and optionally `cleaner`.
     */
    fun addPrimaryConstructorWithCleaner(
        builder: TypeSpec.Builder,
        objectPointerTypeName: TypeName,
        addCleaner: Boolean
    ) {
        val constructorBuilder = FunSpec.constructorBuilder()
            .addParameter("pointer", objectPointerTypeName)

        if (addCleaner) {
            constructorBuilder.addParameter(
                com.squareup.kotlinpoet.ParameterSpec.builder(
                    "cleaner",
                    BindingsGenerator.CLEANER.copy(nullable = true),
                )
                    .defaultValue("null")
                    .build(),
            )
        }

        builder.primaryConstructor(constructorBuilder.build())
    }

    /**
     * Adds a no-argument constructor that allocates the object on the native heap.
     *
     * The allocated memory is freed automatically when the object is GCed.
     */
    fun addNoArgConstructor(
        builder: TypeSpec.Builder,
        kotlinName: String,
        nativeTypeName: TypeName,
        objectPointerTypeName: TypeName,
    ) {
        builder.addFunction(
            FunSpec.constructorBuilder().apply {
                buildMethodKDoc(getNoArgConstructorKdoc(kotlinName))?.let { addKdoc(it) }
                callThisConstructor(buildNoArgAllocationCodeBlock(nativeTypeName))
            }.build(),
        )
    }

    /**
     * Builds a CodeBlock that allocates a structure on the native heap and associates a cleaner.
     */
    fun buildNoArgAllocationCodeBlock(nativeTypeName: TypeName): CodeBlock =
        CodeBlock.builder()
            .beginControlFlow(
                "%T.%T<%T>().run",
                BindingsGenerator.NATIVE_HEAP_OBJECT,
                BindingsGenerator.NATIVE_PLACEMENT_ALLOC,
                nativeTypeName,
            )
            .addStatement(
                "val cleaner = %M(rawPtr) { %T.free(it) }",
                BindingsGenerator.CREATE_CLEANER,
                BindingsGenerator.NATIVE_HEAP_OBJECT,
            )
            .addStatement("ptr to cleaner")
            .endControlFlow()
            .build()

    /**
     * Adds a private constructor that takes a Pair<CPointer, Cleaner> and unpacks it.
     */
    fun addPairConstructor(builder: TypeSpec.Builder, kotlinTypeName: ClassName, objectPointerTypeName: TypeName) {
        builder.addFunction(
            FunSpec.constructorBuilder()
                .addModifiers(KModifier.PRIVATE)
                .addKdoc(
                    """
                        Private constructor that unpacks the pair into pointer and cleaner.

                        @param pair A pair containing the pointer to %T and a [Cleaner] instance.
                    """.trimIndent(),
                    kotlinTypeName,
                )
                .addParameter(
                    "pair",
                    BindingsGenerator.PAIR_TYPE.parameterizedBy(objectPointerTypeName, BindingsGenerator.CLEANER),
                )
                .callThisConstructor(CodeBlock.of("pointer = pair.first, cleaner = pair.second"))
                .build(),
        )
    }

    /**
     * Adds a constructor that allocates the object in the given AutofreeScope.
     *
     * The AutofreeScope manages memory lifetime, commonly used with `memScoped`.
     */
    fun addAutofreeScopeConstructor(builder: TypeSpec.Builder, kotlinName: String, nativeTypeName: TypeName) {
        builder.addFunction(
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
    fun addFieldConstructorsIfAny(builder: TypeSpec.Builder, kotlinName: String, fields: List<FieldBlueprint>) {
        val settableFields = fields.filter { isFieldSetterSupported(it) }
        if (settableFields.isEmpty()) return

        // No-arg field constructor
        builder.addFunction(
            createFieldConstructor(kotlinName, settableFields, noArg = true),
        )

        // Autofree scope field constructor
        builder.addFunction(
            createFieldConstructor(kotlinName, settableFields, noArg = false),
        )
    }

    /**
     * Adds logic for non-throwable factory constructors.
     *
     * This directly calls the native constructor and returns a success result.
     */
    fun addNonThrowableFactoryConstructorLogic(
        builder: FunSpec.Builder,
        kotlinTypeName: ClassName,
        constructor: ConstructorBlueprint
    ) {
        builder.addCode("return %T(%M(", kotlinTypeName, constructor.nativeMemberName)
        constructor.parameters.forEachIndexed { index, param ->
            if (index > 0) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param))
        }
        builder.addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC)
    }

    /**
     * Adds logic for throwable factory constructors, handling GError and returning [Result].
     */
    fun addThrowableFactoryConstructorLogic(builder: FunSpec.Builder, constructor: ConstructorBlueprint) {
        builder.addStatement(
            "val gError = %M<%M>()",
            BindingsGenerator.ALLOC_POINTER_TO,
            BindingsGenerator.G_ERROR_MEMBER,
        )
        builder.addCode("val gResult = %M(", constructor.nativeMemberName)

        constructor.parameters.forEachIndexed { index, param ->
            if (index > 0) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param))
        }

        builder.addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
        builder.addCode(")\n")

        builder.beginControlFlow("return if (gError.%M != null)", BindingsGenerator.POINTED_FUNC)
        builder.addStatement(
            "%T.failure(%M(%T(gError.%M!!.%M)))",
            BindingsGenerator.RESULT_TYPE,
            constructor.exceptionResolvingFunctionMember,
            BindingsGenerator.GLIB_ERROR_TYPE,
            BindingsGenerator.POINTED_FUNC,
            BindingsGenerator.PTR_FUNC,
        )
        builder.endControlFlow()
        builder.beginControlFlow("else")

        val nonNullReturnType = determineNonNullReturnType(constructor)
        builder.addStatement(
            "%T.success(%T(checkNotNull(gResult)))",
            BindingsGenerator.RESULT_TYPE,
            nonNullReturnType,
        )
        builder.endControlFlow()
    }

    private fun ensureReturnTypeIsObjectPointer(constructor: ConstructorBlueprint) {
        if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
            error("Invalid constructor return type")
        }
    }

    private fun addConstructorKDocAndAnnotations(funBuilder: FunSpec.Builder, constructor: ConstructorBlueprint) {
        buildMethodKDoc(
            kdoc = constructor.kdoc,
            parameters = constructor.parameters,
            optInVersionBlueprint = constructor.optInVersionBlueprint,
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
            constructor.kdoc,
            constructor.parameters,
            constructor.optInVersionBlueprint,
            constructor.returnTypeKDoc,
        )?.let { builder.addKdoc(it) }
    }

    private fun determineConstructorReturnType(clazz: ClassBlueprint, constructor: ConstructorBlueprint) =
        if (constructor.throws) BindingsGenerator.RESULT_TYPE.parameterizedBy(clazz.typeName) else clazz.typeName

    private fun determineNonNullReturnType(constructor: ConstructorBlueprint) =
        if (!constructor.returnTypeInfo.kotlinTypeName.isNullable) {
            constructor.returnTypeInfo.kotlinTypeName
        } else {
            constructor.returnTypeInfo.withNullable(false).kotlinTypeName
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
