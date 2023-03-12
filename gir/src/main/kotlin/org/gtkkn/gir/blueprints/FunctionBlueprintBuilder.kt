package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girFunction: GirFunction
) : BlueprintBuilder<FunctionBlueprint>(context) {
    override fun blueprintObjectType(): String = "function"
    override fun blueprintObjectName(): String = girFunction.name

    override fun build(): BlueprintResult<FunctionBlueprint> = skip("Functions not supported")
}
