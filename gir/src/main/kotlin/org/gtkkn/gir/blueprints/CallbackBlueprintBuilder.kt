package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class CallbackBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girCallback: GirCallback
) : BlueprintBuilder<CallbackBlueprint>(context) {
    override fun blueprintObjectType(): String = "callback"

    override fun blueprintObjectName(): String = girCallback.name

    override fun buildInternal(): CallbackBlueprint {
        girNamespace.also { throw UnresolvableTypeException("Callbacks are not supported") }
    }
}
