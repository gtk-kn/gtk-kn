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
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class FieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirField,
    private val accessPath: String? = null,
) : BlueprintBuilder<FieldBlueprint>(context) {
    override fun blueprintObjectType(): String = "field"

    override fun blueprintObjectName(): String = checkNotNull(girNode.name)

    override fun buildInternal(): FieldBlueprint {
        checkNotNull(girNode.name)
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.name)
        }

        val typeInfo = when (girNode.type) {
            is GirType -> {
                // assuming not nullable here, we might need to revisit this when adding array, callback and
                // embedded structs
                val typeInfo = context.resolveTypeInfo(girNamespace, girNode.type, false)
                typeInfo.withNullable(typeInfo.isCinteropNullable)
            }

            is GirArrayType -> {
                val typeInfo = context.resolveTypeInfo(girNamespace, girNode.type, false)
                typeInfo.withNullable(typeInfo.isCinteropNullable)
            }

            is GirCallback -> throw UnresolvableTypeException("Fields with callbacks are not supported")
        }

        if (typeInfo is TypeInfo.RecordUnionPointer &&
            girNode.type is GirType &&
            girNode.type.cType != null &&
            girNode.type.cType != "gpointer" &&
            !girNode.type.cType.endsWith("*")
        ) {
            throw UnresolvableTypeException(
                "Field with not-pointer record/union ${girNode.type.cType} is not supported",
            )
        }

        return FieldBlueprint(
            kotlinName = girNode.name.toCamelCase(),
            nativeName = girNode.name,
            typeInfo = typeInfo,
            writeable = girNode.writable == true,
            accessPath = accessPath,
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
        )
    }
}
