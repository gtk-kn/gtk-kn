package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirConstant
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class ConstantBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girConstant: GirConstant,
) : BlueprintBuilder<ConstantBlueprint>(context) {
    override fun blueprintObjectType(): String = "constant"

    override fun blueprintObjectName(): String = girConstant.name

    override fun buildInternal(): ConstantBlueprint {
        if (girConstant.info.introspectable == false) {
            throw NotIntrospectableException(girConstant.name)
        }

        if (girConstant.type == null) {
            error("Constant without type")
        }

        if (girConstant.cType == null) {
            error("Constant without cType")
        }

        // we don't kotlinize these because these constants can reference uppercase and lowercase key values as well
        val kotlinName = girConstant.name
        val typeInfo = when (girConstant.type) {
            is GirArrayType -> error("Array constants are not supported")
            is GirType -> context.resolveTypeInfo(girNamespace, girConstant.type, false)
        }

        return ConstantBlueprint(
            kotlinName = kotlinName,
            typeInfo = typeInfo,
            constantValue = girConstant.value,
            kdoc = context.processKdoc(girConstant.info.docs.doc?.text),
        )
    }
}
