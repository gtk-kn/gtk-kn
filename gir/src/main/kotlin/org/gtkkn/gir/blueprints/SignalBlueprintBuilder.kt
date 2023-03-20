package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

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

        // return value
        val returnValue = girSignal.returnValue ?: throw UnresolvableTypeException("Signal has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> throw UnresolvableTypeException("signals with array return types are unsupported")
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        val kotlinConnectName = context.kotlinizeSignalConnectName(girSignal.name)
        return SignalBlueprint(
            signalName = girSignal.name,
            kotlinConnectName = kotlinConnectName,
            returnTypeInfo = returnTypeInfo,
        )
    }

}
