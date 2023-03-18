package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girMethod: GirMethod,
) : BlueprintBuilder<MethodBlueprint>(context) {
    private val methodParameters = mutableListOf<MethodParameterBlueprint>()

    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girMethod.name

    override fun buildInternal(): MethodBlueprint {
        girMethod.cIdentifier?.let { context.checkIgnoredFunction(it) }
        val kotlinName = context.kotlinizeMethodName(girMethod.name)

        // early skips for unsupported methods
        if (girMethod.parameters == null) {
            throw UnresolvableTypeException("Method has no parameters object")
        }

        if (girMethod.parameters.instanceParameter == null) {
            throw UnresolvableTypeException("Method has no instance parameter")
        }

        if (girMethod.throws) {
            throw UnresolvableTypeException("Throwing methods are not supported")
        }

        // parameters
        for (param in girMethod.parameters.parameters) {
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

            methodParameters.add(paramBlueprint)
        }

        // return value
        val returnValue = girMethod.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> throw UnresolvableTypeException("Methods with array return types are unsupported")
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        // method name
        val nativeMethodName = girMethod.cIdentifier
            ?: throw UnresolvableTypeException("native method ${girMethod.name} does not have cIdentifier")

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return MethodBlueprint(
            kotlinName = kotlinName,
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            parameterBlueprints = methodParameters,
            returnTypeInfo = returnTypeInfo,
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
