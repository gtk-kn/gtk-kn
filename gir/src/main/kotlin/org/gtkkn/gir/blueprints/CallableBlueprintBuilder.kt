package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.SkippedObjectException
import org.gtkkn.gir.processor.UnresolvableTypeException

/**
 * An interface containing common behavior for all callable blueprints like Signals, Methods,
 * Functions and Constructors.
 */
abstract class CallableBlueprintBuilder<T : Any>(
    context: ProcessorContext,
    protected val girNamespace: GirNamespace,
) : BlueprintBuilder<T>(context) {

    protected val parameterBlueprints = mutableListOf<ParameterBlueprint>()

    protected fun addParameters(parameters: GirParameters) {
        val processedParams = processParameters(parameters)
        processedParams.forEach {
            when (it) {
                is SimpleParam -> addParameter(it.param)
                is CallbackParamWithDestroy -> {
                    // TODO construct the Callback TypeInfo somewhere else
                    val cbTypeInfo = TypeInfo.CallbackWithDestroy(
                        it,
                        context.resolveCallbackTypeName(girNamespace, it.callbackType.name ?: error("unknown callback type name")),
//                        ClassName("bindings.glib", "SourceFunc"), // TODO proper resolving
                        ClassName("native.glib", "SourceFunc"), // TODO proper resolving, this is not right?
                    )
                    val cbParamBluePrint = ParameterBlueprint(
                        kotlinName = it.callbackParam.name, // TODO kotlinize
                        nativeName = it.callbackParam.name,
                        typeInfo = cbTypeInfo,
                        kdoc = "TODO KDOC for callback arguments",
                    )
                    parameterBlueprints.add(cbParamBluePrint)
//                        throw UnresolvableTypeException("Callback params not supported")
//                        error("Callback params not supported")
                }
            }
        }
    }

    /**
     * Process the parameters by transforming them into [ProcessedParam] subtypes.
     *
     * The return list can be smaller than the input list because callback parameters combine multiple
     * native params into one combined param.
     */
    private fun processParameters(parameters: GirParameters): List<ProcessedParam> {
        if (parameters.parameters.none { it.closure != null }) {
            // no closures found, return all params as [SimpleParam]
            return parameters.parameters.map { SimpleParam(it) }
        }

        if (parameters.parameters.count { it.closure != null } > 1) {
            val closureParams = parameters.parameters.filter { it.closure != null }.map { it.name }.joinToString(", ")
            throw UnresolvableTypeException(
                "function ${blueprintObjectName()} has multiple closure params: ${closureParams}",
            )
        }

        // we have 1 closure param, find its user data and destroy function
        val closureParam = parameters.parameters.first { it.closure != null }
        logger.warn("Found function ${blueprintObjectName()} with closure/callback: ${closureParam.name}")

        if (closureParam.type !is GirType) error("Callback type is not a GirType")
        closureParam.type.cType?.let { context.checkIgnoredType(it) }

        val closureParamIndex = parameters.parameters.indexOf(closureParam)
        val remainingParams = parameters.parameters.drop(closureParamIndex + 1)
        val remainingParamNames = remainingParams.map { it.name }.joinToString(", ")
        logger.warn("REMAINING PARAMS for Found function ${blueprintObjectName()} :: $remainingParamNames")

        // currently assumed to be the first gpointer param after the closure param
        val userDataParam = remainingParams.firstOrNull() {
            it.type is GirType && it.type.name == "gpointer"
        }
        if (userDataParam == null) {
            logger.error("!!!!!!! DID NOT FIND user data param for Found function ${blueprintObjectName()}")
            throw UnresolvableTypeException("Could not resolve user_data param")
        }

        val destroyDataParam = remainingParams.firstOrNull() {
            it.type is GirType && it.type.cType == "GDestroyNotify"
        }
        if (destroyDataParam == null) {
            logger.error("!!!!!!! DID NOT FIND destroy data param for Found function ${blueprintObjectName()}")
            throw UnresolvableTypeException("Could not resolve destroy data param")
        }

        return parameters.parameters.mapNotNull {
            when (it) {
                destroyDataParam -> null // bundled into callback param
                userDataParam -> null  // bundled into callback param
                closureParam -> CallbackParamWithDestroy(closureParam.type, it, userDataParam, closureParam)
                else -> SimpleParam(it)
            }
        }
    }

    protected fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> parameterBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> throw SkippedObjectException(result.skippedObject)
        }
    }
}

sealed class ProcessedParam

data class SimpleParam(val param: GirParameter) : ProcessedParam()

data class CallbackParamWithDestroy(
    val callbackType: GirType,
    val callbackParam: GirParameter,
    val userDataParam: GirParameter,
    val destroyParam: GirParameter
) : ProcessedParam()

