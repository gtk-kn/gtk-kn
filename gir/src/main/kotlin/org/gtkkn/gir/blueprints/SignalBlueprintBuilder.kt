package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext

class SignalBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girSignal: GirSignal,
) : BlueprintBuilder<SignalBlueprint>(context) {

    override fun blueprintObjectType(): String = "signal"

    override fun blueprintObjectName(): String = girSignal.name

    override fun buildInternal(): SignalBlueprint {

        if (!girSignal.parameters?.parameters.isNullOrEmpty()) {
            throw BlueprintException("Signals with arguments are not supported")
        }

        val kotlinConnectName = context.kotlinizeSignalConnectName(girSignal.name)
        return SignalBlueprint(
            signalName = girSignal.name,
            kotlinConnectName = kotlinConnectName
        )
    }

}
