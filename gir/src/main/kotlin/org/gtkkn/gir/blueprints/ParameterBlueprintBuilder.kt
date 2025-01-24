/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.blueprints

import net.pearx.kasechange.toCamelCase
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
    private val girNode: GirParameter,
    private val noStringConversion: Boolean = false
) : BlueprintBuilder<ParameterBlueprint>(context) {
    override fun blueprintObjectType(): String = "parameter"

    override fun blueprintObjectName(): String = checkNotNull(girNode.name)

    override fun buildInternal(): ParameterBlueprint {
        val paramCType = when (girNode.type) {
            is GirArrayType -> girNode.type.cType
            is GirType -> girNode.type.cType
            is GirVarArgs -> null
        }
        if (paramCType != null) {
            context.checkIgnoredType(paramCType)
            context.checkIgnoredType(paramCType.removeSuffix("*"))
            context.checkIgnoredType(paramCType.removeSuffix("**"))
        }

        when {
            girNode.direction == GirDirection.OUT -> {
                // support OUT parameters if the param is a record and callerAllocates
                val record = if (girNode.type is GirType) {
                    context.findRecordByNameOrNull(girNamespace, girNode.type.name ?: error("unknown type name"))
                } else {
                    null
                }
                if (record == null || girNode.callerAllocates != true) {
                    throw UnresolvableTypeException("${girNode.name}: Out parameter is not supported")
                }
            }

            girNode.direction == GirDirection.IN_OUT -> {
                throw UnresolvableTypeException("${girNode.name}: In/Out parameter is not supported")
            }

            girNode.type is GirVarArgs -> {
                throw UnresolvableTypeException("${girNode.name}: Varargs parameter is not supported")
            }
        }

        val paramKotlinName = checkNotNull(girNode.name).toCamelCase()

        var typeInfo = when (girNode.type) {
            is GirArrayType -> context.resolveTypeInfo(girNamespace, girNode.type, girNode.isNullable())
            is GirType -> context.resolveTypeInfo(girNamespace, girNode.type, girNode.isNullable())
            GirVarArgs -> throw UnresolvableTypeException("Varargs parameter is not supported")
        }

        if (typeInfo is TypeInfo.KString && noStringConversion) {
            typeInfo = typeInfo.copy(noStringConversion = noStringConversion)
        }

        return ParameterBlueprint(
            kotlinName = paramKotlinName,
            nativeName = girNode.name,
            typeInfo = typeInfo,
            defaultNull = girNode.isDefaultNull(),
            isUserData = girNode.closure != null,
            isDestroyData = girNode.destroy != null,
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
            needsRawValueForEnums = girNode.gtkKnEnumRawValue == true,
        )
    }
}
