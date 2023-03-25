package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.SkippedObjectException
import org.gtkkn.gir.processor.UnresolvableTypeException

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girFunction: GirFunction,
) : BlueprintBuilder<FunctionBlueprint>(context) {
    private val parameterBlueprints = mutableListOf<ParameterBlueprint>()

    override fun blueprintObjectType(): String = "function"
    override fun blueprintObjectName(): String = girFunction.name


    override fun buildInternal(): FunctionBlueprint {
        if (girFunction.info.introspectable == false) {
            throw NotIntrospectableException(girFunction.cIdentifier ?: girFunction.name)
        }

        if (girFunction.shadowedBy != null) {
            throw ShadowedFunctionException(girFunction.cIdentifier ?: girFunction.name, girFunction.shadowedBy)
        }

        if (girFunction.cIdentifier == null) {
            throw UnresolvableTypeException("Function ${girFunction.name} does not have cIdentifier")
        }

        context.checkIgnoredFunction(girFunction.cIdentifier)

        if (girFunction.throws) {
            throw UnresolvableTypeException("Functions that throw are not supported")
        }

        girFunction.parameters?.let {
            val processedParams = processParameters(it)
            processedParams.forEach {
                when (it) {
                    is SimpleParam -> addParameter(it.param)
                    is CallbackParamWithDestroy -> {
                        // TODO construct the Callback TypeInfo somewhere else
                        val cbTypeInfo = TypeInfo.CallbackWithDestroy(
                            it,
                            ClassName("bindings.glib", "SourceFunc"), // TODO proper resolving
                            ClassName("native.glib", "SourceFunc") // TODO proper resolving, this is not right?
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

        val returnValue = girFunction.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        val nativeName = girFunction.cIdentifier
        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeName)
        val kotlinName = context.kotlinizeMethodName(girFunction.name)

        return FunctionBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeName,
            nativeMemberName = nativeMemberName,
            parameters = parameterBlueprints,
            returnTypeInfo = returnTypeInfo,
            version = girFunction.info.version,
            kdoc = context.processKdoc(girFunction.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girFunction.returnValue.docs.doc?.text),
        )
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
                "function ${girFunction.cIdentifier} has multiple closure params: ${closureParams}",
            )
        }

        // we have 1 closure param, find its user data and destroy function
        val closureParam = parameters.parameters.first { it.closure != null }
        logger.warn("Found function ${girFunction.cIdentifier} with closure/callback: ${closureParam.name}")

        val closureParamIndex = parameters.parameters.indexOf(closureParam)
        val remainingParams = parameters.parameters.drop(closureParamIndex + 1)
        val remainingParamNames = remainingParams.map { it.name }.joinToString(", ")
        logger.warn("REMAINING PARAMS for Found function ${girFunction.cIdentifier} :: $remainingParamNames")

        // currently assumed to be the first gpointer param after the closure param
        val userDataParam = remainingParams.firstOrNull() {
            it.type is GirType && it.type.name == "gpointer"
        }
        if (userDataParam == null) {
            logger.error("!!!!!!! DID NOT FIND user data param for Found function ${girFunction.cIdentifier}")
            throw UnresolvableTypeException("Could not resolve user_data param")
        }

        val destroyDataParam = remainingParams.firstOrNull() {
            it.type is GirType && it.type.cType == "GDestroyNotify"
        }
        if (destroyDataParam == null) {
            logger.error("!!!!!!! DID NOT FIND destroy data param for Found function ${girFunction.cIdentifier}")
            throw UnresolvableTypeException("Could not resolve destroy data param")
        }

        return parameters.parameters.mapNotNull {
            when (it) {
                destroyDataParam -> null // bundled into callback param
                userDataParam -> null  // bundled into callback param
                closureParam -> CallbackParamWithDestroy(it, userDataParam, closureParam)
                else -> SimpleParam(it)
            }
        }
    }

    private fun addParameter(param: GirParameter) {
        when (val result = ParameterBlueprintBuilder(context, girNamespace, param).build()) {
            is BlueprintResult.Ok -> parameterBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> throw SkippedObjectException(result.skippedObject)
        }
    }

    private fun hasCallback(parameters: GirParameters): Boolean {
        if (parameters.parameters.isEmpty()) {
            return false
        }

        // check by param names
        val containsUserData = parameters.parameters.any { it.name == "user_data" }
        val containsUserDestroy = parameters.parameters.any { it.name == "user_destroy" }

        if (containsUserData && containsUserDestroy) {
            val paramList = parameters.parameters.map { it.name }.joinToString(", ")
            val func = girFunction.cIdentifier ?: girFunction.name
            logger.error("@@@@ found function $func with user data : $paramList")
        }

        // check by destroyNotify
        val containsDestroyParam = parameters.parameters.any { it.destroy != null }
        if (containsDestroyParam) {
            val paramList = parameters.parameters.map { it.name }.joinToString(", ")
            val func = girFunction.cIdentifier ?: girFunction.name
            logger.error("@@@@@@ found function WITH DESTROY PARAM $func with user data : $paramList")
        }

        val containsDestroyNotify =
            parameters.parameters.map { it.type }.filterIsInstance<GirType>().any { it.cType == "GDestroyNotify" }
        if (containsDestroyNotify) {
            val paramList = parameters.parameters.map { it.name }.joinToString(", ")
            val func = girFunction.cIdentifier ?: girFunction.name
            logger.error("@@@@@@@@@@ found function WITH DESTROY NOTIFY PARAM $func with user data : $paramList")
        }

        val containsClosure = parameters.parameters.any { it.closure != null }
        if (containsClosure) {
            val paramList = parameters.parameters.map { it.name }.joinToString(", ")
            val func = girFunction.cIdentifier ?: girFunction.name
            logger.error("@@@@@@@@@@@@@@ found function WITH CLOSURE PARAM $func with user data : $paramList")
        }
        return false // TODO
    }
}

sealed class ProcessedParam

data class SimpleParam(val param: GirParameter) : ProcessedParam()

data class CallbackParamWithDestroy(
    val callbackParam: GirParameter,
    val userDataParam: GirParameter,
    val destroyParam: GirParameter
) : ProcessedParam()

