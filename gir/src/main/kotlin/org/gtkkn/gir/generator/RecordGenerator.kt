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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.FieldBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.RecordBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

/**
 * A generator that produces Kotlin code for GObject-based records.
 */
interface RecordGenerator : MiscGenerator, KDocGenerator {
    /**
     * Generates a [TypeSpec] for the given [record].
     * This includes:
     * - Primary constructor with optional cleaner
     * - Additional constructors (no-arg, autofree scope, pair)
     * - Field-initializing constructors if fields are present
     * - Overridden `toString()` if fields are present and no `toString` method exists
     * - Companion object with factory constructors and functions
     */
    fun buildRecord(record: RecordBlueprint): TypeSpec =
        TypeSpec.classBuilder(record.kotlinTypeName).apply {
            addRecordKdocAndAnnotations(record)

            val addEmptyConstructors = !record.hasNewConstructor && !record.isOpaque && !record.isDisguised
            addPrimaryConstructorWithCleaner(record, addEmptyConstructors)

            superclass(BindingsGenerator.PROXY_INSTANCE_TYPE)
            addSuperclassConstructorParameter("pointer")

            // Add the pointer property
            addProperty(buildRecordObjectPointerProperty(record))

            // Add default constructors if needed
            if (addEmptyConstructors) {
                addNoArgConstructor(record)
                addPairConstructor(record)
                addAutofreeScopeConstructor(record)
                addFieldConstructorsIfAny(record)
            }

            // Add instance methods
            addRecordMethods(record)

            // Add fields as properties
            addRecordFields(record)

            // Add toString if fields are present and no toString method exists
            addToStringIfNeeded(record)

            // Add companion object
            buildCompanionObject(record)?.let { addType(it) }
        }.build()

    /**
     * Adds top-level KDoc and annotations for the record.
     */
    private fun TypeSpec.Builder.addRecordKdocAndAnnotations(record: RecordBlueprint) {
        addKdoc(buildTypeKDoc(record.kdoc, record.optInVersionBlueprint, record.skippedObjects))
        record.optInVersionBlueprint?.typeName?.let { addAnnotation(it) }
    }

    /**
     * Adds the primary constructor that always takes `pointer`,
     * and optionally takes a `cleaner` parameter if `addCleaner` is true.
     */
    private fun TypeSpec.Builder.addPrimaryConstructorWithCleaner(record: RecordBlueprint, addCleaner: Boolean) {
        primaryConstructor(
            FunSpec.constructorBuilder().apply {
                addParameter("pointer", record.objectPointerTypeName)
                if (addCleaner) {
                    addParameter(
                        ParameterSpec.builder("cleaner", BindingsGenerator.CLEANER.copy(nullable = true))
                            .defaultValue("null")
                            .build(),
                    )
                }
            }.build(),
        )
    }

    /**
     * Adds a no-argument constructor that allocates the record on the native heap.
     * The allocated memory is automatically freed when the object is GCed.
     */
    private fun TypeSpec.Builder.addNoArgConstructor(record: RecordBlueprint) {
        addFunction(
            FunSpec.constructorBuilder().apply {
                buildMethodKDoc(getNoArgConstructorKdoc(record))?.let { addKdoc(it) }
                callThisConstructor(buildNoArgAllocationCodeBlock(record))
            }.build(),
        )
    }

    /**
     * Builds the CodeBlock for no-arg allocation (native heap + cleaner).
     */
    private fun buildNoArgAllocationCodeBlock(record: RecordBlueprint): CodeBlock =
        CodeBlock.builder()
            .beginControlFlow(
                "%T.%T<%T>().run",
                BindingsGenerator.NATIVE_HEAP_OBJECT,
                BindingsGenerator.NATIVE_PLACEMENT_ALLOC,
                record.nativeTypeName,
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
    private fun TypeSpec.Builder.addPairConstructor(record: RecordBlueprint) {
        addFunction(
            FunSpec.constructorBuilder()
                .addModifiers(KModifier.PRIVATE)
                .addKdoc(
                    """
                        Private constructor that unpacks the pair into pointer and cleaner.

                        @param pair A pair containing the pointer to %T and a [Cleaner] instance.
                    """.trimIndent(),
                    record.kotlinTypeName,
                )
                .addParameter(
                    "pair",
                    BindingsGenerator.PAIR_TYPE.parameterizedBy(
                        record.objectPointerTypeName,
                        BindingsGenerator.CLEANER,
                    ),
                )
                .callThisConstructor(CodeBlock.of("pointer = pair.first, cleaner = pair.second"))
                .build(),
        )
    }

    /**
     * Adds a constructor that allocates the record in the given AutofreeScope.
     * The AutofreeScope manages memory lifetime, commonly used with `memScoped`.
     */
    private fun TypeSpec.Builder.addAutofreeScopeConstructor(record: RecordBlueprint) {
        addFunction(
            FunSpec.constructorBuilder().apply {
                val kdoc = getAutofreeScopeConstructorKdoc(record)
                buildMethodKDoc(kdoc, listOf(getAutofreeScopeParamForKdoc()))?.let { addKdoc(it) }
                addParameter("scope", BindingsGenerator.AUTOFREE_SCOPE)
                callThisConstructor(
                    CodeBlock.of(
                        "scope.%T<%T>().%M",
                        BindingsGenerator.NATIVE_PLACEMENT_ALLOC,
                        record.nativeTypeName,
                        BindingsGenerator.PTR_FUNC,
                    ),
                )
            }.build(),
        )
    }

    /**
     * If fields exist, adds two additional constructors:
     * - A no-arg field constructor that sets fields
     * - An autofree scope field constructor that sets fields
     */
    private fun TypeSpec.Builder.addFieldConstructorsIfAny(record: RecordBlueprint) {
        if (record.fields.isNotEmpty()) {
            addNoArgFieldConstructor(record)
            addAutofreeScopeFieldConstructor(record)
        }
    }

    /**
     * Adds a no-arg constructor that also initializes the record fields.
     */
    private fun TypeSpec.Builder.addNoArgFieldConstructor(record: RecordBlueprint) {
        val fields = record.fields.filter { isFieldSetterSupported(it) }
        if (fields.isNotEmpty()) {
            addFunction(
                FunSpec.constructorBuilder().apply {
                    val kdoc = getNoArgConstructorKdoc(record)
                    val parametersForKdoc = fields.map { field ->
                        ParameterBlueprint(
                            kotlinName = field.kotlinName,
                            nativeName = field.kotlinName,
                            typeInfo = field.typeInfo,
                            defaultNull = false,
                            kdoc = field.kdoc,
                        )
                    }
                    buildMethodKDoc(kdoc, parametersForKdoc)?.let { addKdoc(it) }

                    // Add parameters for all fields
                    fields.forEach { addParameter(it.kotlinName, it.typeInfo.kotlinTypeName) }

                    // Delegate to no-arg constructor (which allocates on native heap)
                    callThisConstructor()

                    // Initialize fields
                    fields.forEach { addStatement("this.%L = %L", it.kotlinName, it.kotlinName) }
                }.build(),
            )
        }
    }

    /**
     * Adds an autofree scope constructor that also initializes the record fields.
     */
    private fun TypeSpec.Builder.addAutofreeScopeFieldConstructor(record: RecordBlueprint) {
        val fields = record.fields.filter { isFieldSetterSupported(it) }
        if (fields.isNotEmpty()) {
            addFunction(
                FunSpec.constructorBuilder().apply {
                    val kdoc = getAutofreeScopeConstructorKdoc(record)
                    val parametersForKdoc = fields.map { field ->
                        ParameterBlueprint(
                            kotlinName = field.kotlinName,
                            nativeName = field.kotlinName,
                            typeInfo = field.typeInfo,
                            defaultNull = false,
                            kdoc = field.kdoc,
                        )
                    } + getAutofreeScopeParamForKdoc()

                    buildMethodKDoc(kdoc, parametersForKdoc)?.let { addKdoc(it) }

                    // Add parameters for all fields plus `scope`
                    fields.forEach { addParameter(it.kotlinName, it.typeInfo.kotlinTypeName) }
                    addParameter("scope", BindingsGenerator.AUTOFREE_SCOPE)

                    // Delegate to scope constructor (allocates in AutofreeScope)
                    callThisConstructor("scope")

                    // Initialize fields
                    fields.forEach { addStatement("this.%L = %L", it.kotlinName, it.kotlinName) }
                }.build(),
            )
        }
    }

    /**
     * Adds instance methods defined in the record blueprint.
     */
    private fun TypeSpec.Builder.addRecordMethods(record: RecordBlueprint) {
        record.methods.forEach { addFunction(buildMethod(it, record.objectPointerName)) }
    }

    /**
     * Adds field properties for the record.
     */
    private fun TypeSpec.Builder.addRecordFields(record: RecordBlueprint) {
        if (!record.isDisguised) {
            record.fields.forEach { addProperty(buildRecordFieldProperty(record, it)) }
        }
    }

    /**
     * Adds a toString() override if fields exist and no toString method is defined.
     */
    private fun TypeSpec.Builder.addToStringIfNeeded(record: RecordBlueprint) {
        if (record.fields.isNotEmpty() && record.methods.none { it.kotlinName == "toString" }) {
            addFunction(buildToStringFunction(record))
        } else if ((record.nativeTypeName as ClassName).simpleName == "GValue") {
            addFunction(buildGValueToStringFunction())
        }
    }

    /**
     * Builds the code for the companion object if there are constructors or functions.
     */
    private fun buildCompanionObject(record: RecordBlueprint): TypeSpec? =
        if (record.constructors.isEmpty() && record.functions.isEmpty()) {
            null
        } else {
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()
            record.constructors.forEach {
                companionSpecBuilder.addFunction(buildFactoryConstructorFunction(record, it))
            }
            record.functions.forEach {
                companionSpecBuilder.addFunction(buildFunction(it))
            }
            companionSpecBuilder.build()
        }

    private fun buildRecordObjectPointerProperty(record: RecordBlueprint): PropertySpec =
        PropertySpec.builder(record.objectPointerName, record.objectPointerTypeName)
            .initializer("pointer")
            .build()

    /**
     * Builds a factory constructor function for the companion object based on the given constructor blueprint.
     */
    @Suppress("LongMethod")
    private fun buildFactoryConstructorFunction(record: RecordBlueprint, constructor: ConstructorBlueprint): FunSpec {
        val funSpecBuilder = FunSpec.builder(constructor.kotlinName)

        // Add KDoc for the factory constructor
        buildMethodKDoc(
            constructor.kdoc,
            constructor.parameters,
            constructor.optInVersionBlueprint,
            constructor.returnTypeKDoc,
        )?.let { funSpecBuilder.addKdoc(it) }

        // Determine return type (Result if throws, otherwise a direct type)
        val returnTypeName = if (constructor.throws) {
            BindingsGenerator.RESULT_TYPE.parameterizedBy(constructor.returnTypeInfo.kotlinTypeName)
        } else {
            constructor.returnTypeInfo.kotlinTypeName
        }
        funSpecBuilder.returns(returnTypeName)

        // If memscoped is needed, wrap the native call
        if (constructor.needsMemscoped) {
            funSpecBuilder.beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
        }

        if (constructor.parameters.isEmpty()) {
            // No-arg factory
            if (constructor.throws) {
                error("Throwing no-argument constructors are not supported")
            }
            funSpecBuilder.addStatement(
                "return·%T(%M()!!.%M())",
                record.kotlinTypeName,
                constructor.nativeMemberName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        } else {
            // Constructors with parameters
            funSpecBuilder.appendSignatureParameters(constructor.parameters)
            if (constructor.throws) {
                addThrowableConstructorLogic(funSpecBuilder, constructor)
            } else {
                addNonThrowableConstructorLogic(funSpecBuilder, record, constructor)
            }
        }

        if (constructor.needsMemscoped) {
            funSpecBuilder.endControlFlow()
        }

        return funSpecBuilder.build()
    }

    /**
     * Adds logic for constructors that don't throw exceptions.
     */
    private fun addNonThrowableConstructorLogic(
        builder: FunSpec.Builder,
        record: RecordBlueprint,
        constructor: ConstructorBlueprint
    ) {
        builder.addCode("return·%T(%M(", record.kotlinTypeName, constructor.nativeMemberName)
        constructor.parameters.forEachIndexed { index, param ->
            if (index > 0) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param))
        }
        builder.addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC)
    }

    /**
     * Adds logic for constructors that can throw exceptions.
     */
    private fun addThrowableConstructorLogic(
        builder: FunSpec.Builder,
        constructor: ConstructorBlueprint
    ) {
        builder.addStatement(
            "val·gError = %M<%M>()",
            BindingsGenerator.ALLOC_POINTER_TO,
            BindingsGenerator.G_ERROR_MEMBER,
        )
        builder.addCode("val gResult = %M(", constructor.nativeMemberName)

        constructor.parameters.forEachIndexed { index, param ->
            if (index > 0) builder.addCode(", ")
            builder.addCode(buildParameterConversionBlock(param))
        }

        // Add error parameter
        builder.addCode(", gError.%M", BindingsGenerator.PTR_FUNC)
        builder.addCode(")\n")

        builder.beginControlFlow("return·if·(gError.%M != null)", BindingsGenerator.POINTED_FUNC)
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

        val nonNullReturnType = if (!constructor.returnTypeInfo.kotlinTypeName.isNullable) {
            constructor.returnTypeInfo.kotlinTypeName
        } else {
            constructor.returnTypeInfo.withNullable(false).kotlinTypeName
        }

        builder.addStatement(
            "%T.success(%T(checkNotNull(gResult)))",
            BindingsGenerator.RESULT_TYPE,
            nonNullReturnType,
        )
        builder.endControlFlow()
    }

    /**
     * Builds a property for a field, including getter and possibly setter if supported.
     */
    private fun buildRecordFieldProperty(record: RecordBlueprint, field: FieldBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(field.kotlinName, field.typeInfo.kotlinTypeName)
            .addKdoc(buildPropertyKDoc(field.kdoc, field.optInVersionBlueprint))

        // Getter
        propertyBuilder.getter(
            FunSpec.getterBuilder()
                .addCode("return·${record.objectPointerName}.%M.${field.nativeName}", BindingsGenerator.POINTED)
                .addCode(buildNativeToKotlinConversionsBlock(field.typeInfo))
                .build(),
        )

        // Setter if supported
        if (isFieldSetterSupported(field)) {
            propertyBuilder.mutable(true)
            propertyBuilder.setter(
                FunSpec.setterBuilder().apply {
                    addAnnotation(BindingsGenerator.UNSAFE_FIELD_SETTER_TYPE)
                    addParameter("value", field.typeInfo.kotlinTypeName)
                    if (field.typeInfo is TypeInfo.KString) {
                        if (field.typeInfo.isCinteropNullable) {
                            addCode(
                                "${record.objectPointerName}.%M.${field.nativeName}?.let { %M(it) }\n",
                                BindingsGenerator.POINTED,
                                BindingsGenerator.G_FREE_FUNC,
                            )
                        } else {
                            addCode(
                                "%M(${record.objectPointerName}.%M.${field.nativeName})",
                                BindingsGenerator.G_FREE_FUNC,
                                BindingsGenerator.POINTED,
                            )
                        }
                    }
                    addCode("${record.objectPointerName}.%M.${field.nativeName} = value", BindingsGenerator.POINTED)
                    addCode(buildKotlinToNativeTypeConversionBlock(field.typeInfo))
                    if (field.typeInfo is TypeInfo.ObjectPointer) {
                        val isParamNullable = field.typeInfo.kotlinTypeName.isNullable
                        val safeCall = if (isParamNullable) "?" else ""
                        addCode("$safeCall.%M()", BindingsGenerator.REINTERPRET_FUNC)
                    }
                }.build(),
            )
        } else if (field.writeable) {
            // Writeable but not supported
            propertyBuilder.addKdoc("\n\nNote: this property is writeable but the setter binding is not supported yet.")
        }

        return propertyBuilder.build()
    }

    /**
     * Check if we can generate a setter for the field type.
     * Not all field types are supported yet, but we cannot filter them out in Phase 2,
     * so we do the additional filtering here.
     */
    private fun isFieldSetterSupported(field: FieldBlueprint): Boolean = field.writeable && when (field.typeInfo) {
        is TypeInfo.Alias,
        is TypeInfo.Bitfield,
        is TypeInfo.Enumeration,
        is TypeInfo.GBoolean,
        is TypeInfo.GChar,
        is TypeInfo.KString,
        is TypeInfo.ObjectPointer,
        is TypeInfo.Primitive,
        is TypeInfo.RecordPointer -> true

        is TypeInfo.CallbackWithDestroy,
        is TypeInfo.InterfacePointer,
        is TypeInfo.StringList -> false
    }

    /**
     * Builds the toString() function for records with fields.
     */
    private fun buildToStringFunction(record: RecordBlueprint): FunSpec {
        val fieldValues = record.fields.joinToString(", ") { "${it.kotlinName}=\$${it.kotlinName}" }
        return FunSpec.builder("toString")
            .addModifiers(KModifier.OVERRIDE)
            .returns(String::class)
            .addCode("return·\"${record.kotlinName}($fieldValues)\"")
            .build()
    }

    /**
     * Builds the toString() function for records with fields.
     */
    private fun buildGValueToStringFunction(): FunSpec = FunSpec.builder("toString")
        .addModifiers(KModifier.OVERRIDE)
        .returns(String::class)
        .addCode("return·%T.strdupValueContents(this)", BindingsGenerator.G_OBJECT)
        .build()

    fun getAutofreeScopeConstructorKdoc(record: RecordBlueprint) =
        """
            Allocate a new ${record.kotlinName} using the provided [AutofreeScope].

            The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
        """.trimIndent()

    fun getNoArgConstructorKdoc(record: RecordBlueprint) =
        """
            Allocate a new ${record.kotlinName}.

            This instance will be allocated on the native heap and automatically freed when
            this class instance is garbage collected.
        """.trimIndent()

    fun getAutofreeScopeParamForKdoc() = ParameterBlueprint(
        kotlinName = "scope",
        nativeName = "scope",
        typeInfo = TypeInfo.Primitive(BindingsGenerator.AUTOFREE_SCOPE),
        defaultNull = false,
        kdoc = "The [AutofreeScope] to allocate this structure in.",
    )
}
