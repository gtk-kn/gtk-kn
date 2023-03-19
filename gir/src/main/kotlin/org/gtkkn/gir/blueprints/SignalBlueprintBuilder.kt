package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class SignalBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girSignal: GirSignal,
) : BlueprintBuilder<SignalBlueprint>(context) {

    private val signalParameters = mutableListOf<MethodParameterBlueprint>()

    override fun blueprintObjectType(): String = "signal"

    override fun blueprintObjectName(): String = girSignal.name

    override fun buildInternal(): SignalBlueprint {
        context.checkIgnoredSignal(girSignal.name)

        if (girSignal.parameters != null) {
            addParams(girSignal.parameters)
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

        val handlerLamdaTypeName =
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
            handlerLambdaTypeName = handlerLamdaTypeName,
        )
    }

    // TODO this is a copy of the MethodBlueprintBuilder -> extract
    private fun addParams(parameters: GirParameters) {
        for (param in parameters.parameters) {
            // skip method if parameter is not supported
            val paramCType = when (param.type) {
                is GirArrayType -> param.type.cType
                is GirType -> param.type.cType
                GirVarArgs -> null
            }
            if (paramCType != null) context.checkIgnoredType(paramCType)
            skipParameterForReason(param)?.let { reason ->
                throw UnresolvableTypeException(reason)
            }

            val paramKotlinName = context.kotlinizeParameterName(param.name)

            val typeInfo = when (param.type) {
                is GirArrayType -> throw UnresolvableTypeException("Array parameter is not supported")
                is GirType -> context.resolveTypeInfo(girNamespace, param.type, param.isNullable())
                GirVarArgs -> throw UnresolvableTypeException("Varargs parameter is not supported")
            }

            // build parameter
            val paramBlueprint = MethodParameterBlueprint(
                kotlinName = paramKotlinName,
                nativeName = param.name,
                typeInfo,
            )

            signalParameters.add(paramBlueprint)
        }
    }

    // TODO this is a copy of the MethodBlueprintBuilder -> extract
    /**
     * Check if the parameter is supported.
     *
     * @return null if the parameter is supported, and skip reason if unsupported.
     */
    private fun skipParameterForReason(param: GirParameter): String? = when {
        param.direction == GirDirection.OUT -> "Out parameter is not supported"
        param.direction == GirDirection.IN_OUT -> "InOut parameter is not supported"
        param.type is GirVarArgs -> "Varargs parameter is not supported"
        param.type is GirArrayType -> "Array parameter is not supported"
        else -> null
    }

}
