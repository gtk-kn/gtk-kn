package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class ConstructorBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girClass: GirClass,
    private val girConstructor: GirConstructor,
) : BlueprintBuilder<ConstructorBlueprint>(context) {

    private val parameters = mutableListOf<MethodParameterBlueprint>()

    override fun blueprintObjectType(): String = "constructor"

    override fun blueprintObjectName(): String = girConstructor.name

    override fun buildInternal(): ConstructorBlueprint {
        girConstructor.cIdentifier?.let { context.checkIgnoredFunction(it) }
        if (girConstructor.throws == true) {
            throw UnresolvableTypeException("Throwing constructors are not supported")
        }

        // parameters
        for (param in girConstructor.parameters?.parameters.orEmpty()) {
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

            parameters.add(paramBlueprint)
        }

        // return value
        val returnValue = girConstructor.returnValue
        if (returnValue == null) {
            logger.error("Constructor ${girNamespace.name}.${girClass.name}.${girConstructor.name} has no return value")
            throw UnresolvableTypeException("Constructor has no return value")
        }

        val returnTypeInfo = try {
            when (val type = returnValue.type) {
                is GirArrayType -> throw UnresolvableTypeException(
                    "Constructors with array return types are unsupported",
                )

                is GirType -> context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
            }
        } catch (ex: UnresolvableTypeException) {
            throw UnresolvableTypeException("Constructor return type ${returnValue.type} could not be resolved")
        }

        // method name
        val nativeMethodName = girConstructor.cIdentifier ?: throw UnresolvableTypeException(
            "Constructor ${girConstructor.name} for ${girClass.name} does not have cIdentifier",
        )

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return ConstructorBlueprint(
            kotlinName = context.kotlinizeMethodName(girConstructor.name),
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            returnTypeInfo = returnTypeInfo,
            parameters = parameters,
        )
    }

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
