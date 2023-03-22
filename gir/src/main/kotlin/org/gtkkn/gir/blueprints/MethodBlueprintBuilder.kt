package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAnyTypeOrVarargs
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girMethod: GirMethod,
    private val superClasses: List<GirClass> = emptyList(),
    private val superInterfaces: List<GirInterface> = emptyList(),
) : BlueprintBuilder<MethodBlueprint>(context) {
    private val methodParameters = mutableListOf<MethodParameterBlueprint>()

    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girMethod.name

    override fun buildInternal(): MethodBlueprint {
        if (girMethod.info.introspectable == false) {
            throw NotIntrospectableException(girMethod.cIdentifier ?: girMethod.name)
        }

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
        addParams(girMethod.parameters)

        // return value
        val returnValue = girMethod.returnValue ?: throw UnresolvableTypeException("Method has no return value")

        val returnTypeInfo: TypeInfo = when (val type = returnValue.type) {
            is GirArrayType -> throw UnresolvableTypeException("Methods with array return types are unsupported")
            is GirType -> {
                try {
                    context.resolveTypeInfo(girNamespace, type, returnValue.isNullable())
                } catch (ex: BlueprintException) {
                    throw UnresolvableTypeException("Return type ${type.name} is unsupported")
                }
            }
        }

        // check for overrides
        val superMethods = superClasses.flatMap { it.methods } + superInterfaces.flatMap { it.methods }
        val nameMatchingSuperMethods = superMethods
            .filterNot { it.info.introspectable == false }
            .filter { it.name == girMethod.name }

        val isOverride = nameMatchingSuperMethods.any {
            it.debugParameterSignature() == girMethod.debugParameterSignature()
        }
        if (isOverride) {
            logger.warn("Detected method override: ${girMethod.name}")
        }

        val isNameClash = nameMatchingSuperMethods.any {
            it.debugParameterSignature() != girMethod.debugParameterSignature()
        }

        // method name
        val nativeMethodName = girMethod.cIdentifier
            ?: throw UnresolvableTypeException("native method ${girMethod.name} does not have cIdentifier")

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return MethodBlueprint(
            kotlinName = if (isNameClash) {
                resolveNameClash(kotlinName)
            } else {
                kotlinName
            },
            nativeName = nativeMethodName,
            nativeMemberName = nativeMemberName,
            parameterBlueprints = methodParameters,
            returnTypeInfo = returnTypeInfo,
            isOverride = isOverride,
            kdoc = context.processKdoc(girMethod.info.docs.doc?.text),
            returnTypeKDoc = context.processKdoc(girMethod.returnValue.docs.doc?.text),
        )
    }

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
                typeInfo = typeInfo,
                kdoc = context.processKdoc(param.docs.doc?.text),
            )

            methodParameters.add(paramBlueprint)
        }
    }

    private fun resolveNameClash(originalName: String): String {
        val result = "${originalName}_"
        logger.error("Name clash: renaming method $originalName to $result")
        return result
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

/**
 * A debug string containing parameter details for comparing methods for override purposes.
 */
private fun GirMethod.debugParameterSignature(): String {
    val paramsSignature = parameters?.parameters.orEmpty().map { it.debugSignature() }.joinToString(",")
    val returnSignature = checkNotNull(returnValue).type.debugSignature()
    return "$paramsSignature -> $returnSignature"
}

private fun GirParameter.debugSignature(): String = when (type) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> type.debugSignature()
    GirVarArgs -> "varargs"
}

private fun GirAnyTypeOrVarargs.debugSignature(): String = when (this) {
    is GirArrayType -> "array[${type.debugSignature()}]"
    is GirType -> this.cType ?: "unknown"
    GirVarArgs -> "varargs"
}
