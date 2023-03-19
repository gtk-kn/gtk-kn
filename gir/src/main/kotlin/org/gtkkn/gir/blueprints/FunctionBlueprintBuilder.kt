package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girFunction: GirFunction,
) : BlueprintBuilder<FunctionBlueprint>(context) {
    override fun blueprintObjectType(): String = "function"
    override fun blueprintObjectName(): String = girFunction.name

    override fun buildInternal(): FunctionBlueprint {
        if (girFunction.info.introspectable == false) {
            throw NotIntrospectableException(girFunction.cIdentifier ?: girFunction.name)
        }

        girNamespace.also { throw UnresolvableTypeException("Functions not supported") }
    }
}
