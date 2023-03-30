package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.FieldBlueprint
import org.gtkkn.gir.blueprints.RecordBlueprint

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

            addType(companionSpecBuilder.build())
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

                // open native function paren
                addCode("return %T(%M(", record.kotlinTypeName, constructor.nativeMemberName)

                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        addCode(", ")
                    }
                    addCode(buildParameterConversionBlock(param))
                }

                addCode(")!!.%M())", BindingsGenerator.REINTERPRET_FUNC) // close native function paren
            }

            if (constructor.needsMemscoped) {
                endControlFlow()
            }
        }.build()

    private fun buildRecordFieldProperty(record: RecordBlueprint, field: FieldBlueprint): PropertySpec =
        // TODO check writeable for setter
        PropertySpec.builder(field.kotlinName, field.typeInfo.kotlinTypeName)
            .getter(
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
            .addKdoc(buildPropertyKDoc(field.kdoc, field.version))
            .build()
}
