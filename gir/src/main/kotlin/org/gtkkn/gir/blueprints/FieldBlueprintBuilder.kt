package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.IgnoredFieldException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class FieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girField: GirField,
) : BlueprintBuilder<FieldBlueprint>(context) {
    override fun blueprintObjectType(): String = "field"

    override fun blueprintObjectName(): String = girField.name

    override fun buildInternal(): FieldBlueprint {
        if (girField.private == true) {
            throw IgnoredFieldException(girField.name, "private")
        }
        if (girField.readable == false) {
            throw IgnoredFieldException(girField.name, "not readable")
        }

        val typeInfo = when (girField.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, girField.type, true) // TODO check nullable?
            is GirType -> context.resolveTypeInfo(girNamespace, girField.type, false, false) // TODO check nullable?
            is GirCallback -> throw UnresolvableTypeException("Fields with callbacks are not supported") // TODO
        }

        return FieldBlueprint(
            kotlinName = context.kotlinizeFieldName(girField.name),
            nativeName = girField.name,
            typeInfo = typeInfo,
            kdoc = context.processKdoc(girField.info.docs.doc?.text),
            version = girField.info.version,
        )
    }
}
