/*
 * Copyright (c) 2023 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

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
        if (paramCType != null) {
            context.checkIgnoredType(paramCType)
            context.checkIgnoredType(paramCType.removeSuffix("*"))
            context.checkIgnoredType(paramCType.removeSuffix("**"))
        }

        when {
            girParam.direction == GirDirection.OUT -> {
                // support OUT parameters if the param is a record and callerAllocates
                val record = if (girParam.type is GirType) {
                        context.findRecordByNameOrNull(girNamespace, girParam.type.name ?: error("unknown type name"))
                } else {
                    null
                }
                if (record == null || girParam.callerAllocates != true) {
                    throw UnresolvableTypeException("${girParam.name}: Out parameter is not supported")
                }
            }

            girParam.direction == GirDirection.IN_OUT -> {
                throw UnresolvableTypeException("${girParam.name}: In/Out parameter is not supported")
            }

            girParam.type is GirVarArgs -> {
                throw UnresolvableTypeException("${girParam.name}: Varargs parameter is not supported")
            }
        }

        val paramKotlinName = context.kotlinizeParameterName(girParam.name)

        val typeInfo = when (girParam.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, girParam.type, girParam.isNullable())
            is GirType -> context.resolveTypeInfo(girNamespace, girParam.type, girParam.isNullable())
            GirVarArgs -> throw UnresolvableTypeException("Varargs parameter is not supported")
        }

        return ParameterBlueprint(
            kotlinName = paramKotlinName,
            nativeName = girParam.name,
            typeInfo = typeInfo,
            defaultNull = girParam.isDefaultNull(),
            kdoc = context.processKdoc(girParam.docs.doc?.text),
        )
    }
}
