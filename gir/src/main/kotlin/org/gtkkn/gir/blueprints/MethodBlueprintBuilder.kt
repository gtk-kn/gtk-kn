package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class MethodBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girMethod: GirMethod
) : BlueprintBuilder<MethodBlueprint>(context) {
    private val methodParameters = mutableListOf<MethodParameterBlueprint>()

    override fun blueprintObjectType(): String = "method"
    override fun blueprintObjectName(): String = girMethod.name

    override fun build(): BlueprintResult<MethodBlueprint> {
        val kotlinName = context.kotlinizeMethodName(girMethod.name)

        // early skips for unsupported methods

        if (girMethod.parameters == null) {
            return skip("Method has no parameters object")
        }

        if (girMethod.parameters.instanceParameter == null) {
            return skip("Method has no instance parameter")
        }

        if (girMethod.throws) {
            return skip("Throwing methods are not supported")
        }

        if (girMethod.name == "to_string") {
            return skip("to_string method conflicts with Object.toString")
        }

        if (girMethod.name == "get_direction") {
            return skip("get_direction method conflicts in multiple classes")
        }

        if (girMethod.name == "get_settings") {
            return skip("get_settings method conflicts in multiple classes")
        }

        if (girMethod.name == "get_media_stream") {
            return skip("get_media_stream method conflicts in multiple classes")
        }

        if (girMethod.name == "set_media_stream") {
            return skip("set_media_stream method conflicts in multiple classes")
        }

        if (girMethod.name == "snapshot_child") {
            return skip("set_media_stream method conflicts in multiple classes")
        }

        if (girMethod.name == "get_data") {
            return skip("memory_output_stream_get_data method conflicts in multiple classes")
        }

        if (girMethod.name == "steal_data") {
            return skip("memory_output_stream_steal_data method conflicts in multiple classes")
        }

        if (girMethod.name == "set_direction") {
            return skip("memory_output_stream_steal_data method conflicts in multiple classes")
        }

        // parameters

        for (param in girMethod.parameters.parameters) {
            // skip method if parameter is not supported
            skipParameterForReason(param)?.let { reason ->
                return skip(reason)
            }

            val kotlinName = context.kotlinizeParameterName(param.name)

            try {
                val typeInfo = when (param.type) {
                    is GirArrayType -> return skip("Array parameter is not supported")
                    is GirType -> context.resolveTypeNamePair(girNamespace, param.type)
                    GirVarArgs -> return skip("Varargs parameter is not supported")
                }

                // build parameter
                val paramBlueprint = MethodParameterBlueprint(
                    kotlinName = kotlinName,
                    nativeName = param.name,
                    typeInfo,
                )

                methodParameters.add(paramBlueprint)
            } catch (ex: UnresolvableTypeException) {
                return skip(ex.message)
            }
        }

        // return value

        val returnValue = girMethod.returnValue ?: return skip("Method has no return value")

        val returnTypeInfo = try {
            when (val type = returnValue.type) {
                is GirArrayType -> return skip("Methods with array return types are unsupported")
                is GirType -> {
                    context.resolveTypeNamePair(girNamespace, type)
                }
            }

        } catch (ex: UnresolvableTypeException) {
            return skip("Method return type ${returnValue.type} could not be resolved")
        }


        // method name

        val nativeMethodName = girMethod.cIdentifier
            ?: return skip("native method ${girMethod.name} does not have cIdentifier")

        val nativeMemberName = MemberName(context.namespaceNativePackageName(girNamespace), nativeMethodName)

        return ok(
            MethodBlueprint(
                kotlinName = kotlinName,
                nativeName = nativeMethodName,
                nativeMemberName = nativeMemberName,
                parameterBlueprints = methodParameters,
                returnTypeInfo = returnTypeInfo,
            ),
        )
    }

    /**
     * Check if the parameter is supported.
     *
     * @return null if the parameter is supported, and skip reason if unsupported.
     */
    private fun skipParameterForReason(param: GirParameter): String? = when {
        param.direction == GirDirection.Out -> "Out parameter is not supported"
        param.direction == GirDirection.InOut -> "InOut parameter is not supported"
        param.type is GirVarArgs -> "Varargs parameter is not supported"
        param.type is GirArrayType -> "Array parameter is not supported"
        else -> null
    }
}

