package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.ShadowedFunctionException
import org.gtkkn.gir.processor.UnresolvableTypeException

class FunctionBlueprintBuilder(
    context: ProcessorContext,
    girNamespace: GirNamespace,
    private val girFunction: GirFunction,
) : CallableBlueprintBuilder<FunctionBlueprint>(context, girNamespace) {

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

        girFunction.parameters?.let {addParameters(it) }

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
