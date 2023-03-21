package org.gtkkn.gir.blueprints

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class ParameterBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girParam: GirParameter,
) : BlueprintBuilder<ParameterBlueprint>(context) {

    override fun blueprintObjectType(): String = "parameter"

    override fun blueprintObjectName(): String = girParam.name

    override fun buildInternal(): ParameterBlueprint {
        val paramCType = when (girParam.type) {
            is GirArrayType -> girParam.type.cType
            is GirType -> girParam.type.cType
            GirVarArgs -> null
        }
        if (paramCType != null) context.checkIgnoredType(paramCType)

        when {
            girParam.direction == GirDirection.OUT -> {
                throw UnresolvableTypeException("${girParam.name}: Out parameter is not supported")
            }

            girParam.direction == GirDirection.IN_OUT -> {
                throw UnresolvableTypeException("${girParam.name}: InOut parameter is not supported")
            }

            girParam.type is GirVarArgs -> {
                throw UnresolvableTypeException("${girParam.name}: Varargs parameter is not supported")
            }

            girParam.type is GirArrayType -> {
                throw UnresolvableTypeException("${girParam.name}: Array parameter is not supported")
            }
        }

        val paramKotlinName = context.kotlinizeParameterName(girParam.name)

        val typeInfo = when (girParam.type) {
            is GirArrayType -> throw UnresolvableTypeException("Array parameter is not supported")
            is GirType -> context.resolveTypeInfo(girNamespace, girParam.type, girParam.isNullable())
            GirVarArgs -> throw UnresolvableTypeException("Varargs parameter is not supported")
        }

        return ParameterBlueprint(
            kotlinName = paramKotlinName,
            nativeName = girParam.name,
            typeInfo,
        )
    }
}
