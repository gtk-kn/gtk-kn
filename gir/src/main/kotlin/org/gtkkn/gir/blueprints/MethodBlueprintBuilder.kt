package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.processor.ProcessorContext

class MethodBlueprintBuilder(
    context: ProcessorContext,
    private val girMethod: GirMethod
) : BlueprintBuilder<MethodBlueprint>(context) {
    override fun blueprintObjectType(): String = "method"
    override fun blueprintObjectName(): String = girMethod.name

    override fun build(): BlueprintResult<MethodBlueprint> {
        val kotlinName = context.kotlinizeMethodName(girMethod.name)
        return ok(
            MethodBlueprint(
                kotlinName = kotlinName,
                nativeName = girMethod.name,
            ),
        )
    }
}
