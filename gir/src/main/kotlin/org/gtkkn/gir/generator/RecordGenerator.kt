package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.FieldBlueprint
import org.gtkkn.gir.blueprints.RecordBlueprint
import org.gtkkn.gir.blueprints.TypeInfo

interface RecordGenerator : MiscGenerator, KDocGenerator {

    fun buildRecord(record: RecordBlueprint): TypeSpec =
        TypeSpec.classBuilder(record.kotlinTypeName).apply {
            // kdoc
            addKdoc(buildTypeKDoc(record.kdoc, record.version, record.skippedObjects))

            // companion object
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()

            // object pointer
            addProperty(buildRecordObjectPointerProperty(record))

            // pointer constructor
            buildPointerConstructor(this, record)

            // constructors
            record.constructors.forEach { companionSpecBuilder.addFunction(buildRecordConstructor(record, it)) }

            // functions
            record.functions.forEach { companionSpecBuilder.addFunction(buildFunction(it)) }

            // methods
            record.methods.forEach { addFunction(buildMethod(it, record.objectPointerName)) }

            // fields
            record.fields.forEach { addProperty(buildRecordFieldProperty(record, it)) }

            if (companionSpecBuilder.propertySpecs.isNotEmpty() || companionSpecBuilder.funSpecs.isNotEmpty()) {
                addType(companionSpecBuilder.build())
            }
        }.build()

    /**
     * Build the pointer property for a record.
     */
    private fun buildRecordObjectPointerProperty(record: RecordBlueprint): PropertySpec =
        PropertySpec.builder(record.objectPointerName, record.objectPointerTypeName)
            .initializer("pointer")
            .build()

    /**
     * Build the constructor for pointer wrapping.
     */
    private fun buildPointerConstructor(builder: TypeSpec.Builder, record: RecordBlueprint) {
        val constructorSpecBuilder = FunSpec.constructorBuilder()

        val pointerParamSpec = ParameterSpec.builder("pointer", record.objectPointerTypeName).build()
        constructorSpecBuilder.addParameter(pointerParamSpec)

        builder.primaryConstructor(constructorSpecBuilder.build())
    }

    private fun buildRecordConstructor(record: RecordBlueprint, constructor: ConstructorBlueprint): FunSpec =
        FunSpec.builder(constructor.kotlinName).apply {
            // kdoc
            addKdoc(
                buildMethodKDoc(
                    constructor.kdoc,
                    constructor.parameters,
                    constructor.version,
                    constructor.returnTypeKDoc,
                ),
            )

            // return type
            returns(record.kotlinTypeName)

            if (constructor.needsMemscoped) {
                beginControlFlow("%M", BindingsGenerator.MEMSCOPED)
            }

            if (constructor.parameters.isEmpty()) {
                // no-arg factory method
                addStatement(
                    "return %T(%M()!!.%M())",
                    record.kotlinTypeName,
                    constructor.nativeMemberName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
            } else {
                appendSignatureParameters(constructor.parameters)

                // open native function call
                addCode("return %T(%M(", record.kotlinTypeName, constructor.nativeMemberName)

                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        addCode(", ")
                    }
                    addCode(buildParameterConversionBlock(param))
                }

                addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC) // close native function call
            }

            if (constructor.needsMemscoped) {
                endControlFlow()
            }
        }.build()

    private fun buildRecordFieldProperty(record: RecordBlueprint, field: FieldBlueprint): PropertySpec =
        PropertySpec.builder(field.kotlinName, field.typeInfo.kotlinTypeName).apply {
            // kdoc
            addKdoc(buildPropertyKDoc(field.kdoc, field.version))

            // getter
            getter(
                FunSpec.getterBuilder().apply {
                    addCode(
                        "return %L.%M.%L",
                        record.objectPointerName,
                        BindingsGenerator.POINTED,
                        field.nativeName,
                    )
                    addCode(buildNativeToKotlinConversionsBlock(field.typeInfo))
                }.build(),
            )

            // setter
            if (field.writeable) {
                if (isFieldSetterSupported(field)) {
                    mutable(true)
                    setter(
                        FunSpec.setterBuilder().apply {
                            addParameter("value", field.typeInfo.kotlinTypeName)
                            addCode(
                                "%L.%M.%L = value",
                                record.objectPointerName,
                                BindingsGenerator.POINTED,
                                field.nativeName,
                            )
                            addCode(buildKotlinToNativeTypeConversionBlock(field.typeInfo))
                        }.build(),
                    )
                } else {
                    addKdoc("\n\nNote: this property is writeable but the setter binding is not supported yet.")
                }
            }
        }.build()

    /**
     * Check if we can generate a setter for the field type.
     * Not all field types are supported yet, but we cannot filter them out in Phase 2,
     * so we do the additional filtering here.
     */
    private fun isFieldSetterSupported(field: FieldBlueprint): Boolean = when (field.typeInfo) {
        is TypeInfo.Bitfield,
        is TypeInfo.Enumeration,
        is TypeInfo.GBoolean,
        is TypeInfo.GChar,
        is TypeInfo.Primitive -> true

        is TypeInfo.CallbackWithDestroy,
        is TypeInfo.InterfacePointer,
        is TypeInfo.KString,
        is TypeInfo.ObjectPointer,
        is TypeInfo.RecordPointer,
        is TypeInfo.StringList -> false
    }
}
