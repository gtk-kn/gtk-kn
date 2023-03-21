package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
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

    private val signalParameters = mutableListOf<ParameterBlueprint>()

    override fun blueprintObjectType(): String = "signal"

    override fun blueprintObjectName(): String = girSignal.name

    private fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> signalParameters.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): SignalBlueprint {
        context.checkIgnoredSignal(girSignal.name)

        girSignal.parameters?.parameters.orEmpty().forEach { addParameter(it) }

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

        val handlerLambdaTypeName =
            LambdaTypeName.get(
                parameters = signalParameters.map { param ->
                    ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName).build()
                },
                returnType = returnTypeInfo.kotlinTypeName,
            )

        val kotlinConnectName = context.kotlinizeSignalConnectName(girSignal.name)
        return SignalBlueprint(
            signalName = girSignal.name,
            kotlinConnectName = kotlinConnectName,
            returnTypeInfo = returnTypeInfo,
            parameters = signalParameters,
            handlerLambdaTypeName = handlerLambdaTypeName,
        )
    }
}
