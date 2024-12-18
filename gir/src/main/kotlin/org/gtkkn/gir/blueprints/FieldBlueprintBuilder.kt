/*
 * Copyright (c) 2024 gtk-kn
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
    private val girField: GirField,
    private val accessPath: String? = null,
) : BlueprintBuilder<FieldBlueprint>(context) {
    override fun blueprintObjectType(): String = "field"

    override fun blueprintObjectName(): String = checkNotNull(girField.name)

    override fun buildInternal(): FieldBlueprint {
        checkNotNull(girField.name)
        if (!girField.shouldBeGenerated()) {
            throw NotIntrospectableException(girField.name)
        }

        val typeInfo = when (girField.type) {
            is GirType -> {
                // assuming not nullable here, we might need to revisit this when adding array, callback and
                // embedded structs
                val typeInfo = context.resolveTypeInfo(girNamespace, girField.type, false)
                typeInfo.withNullable(typeInfo.isCinteropNullable)
            }

            is GirArrayType -> {
                val typeInfo = context.resolveTypeInfo(girNamespace, girField.type, false)
                typeInfo.withNullable(typeInfo.isCinteropNullable)
            }

            is GirCallback -> throw UnresolvableTypeException("Fields with callbacks are not supported")
        }

        return FieldBlueprint(
            kotlinName = girField.name.toCamelCase(),
            nativeName = girField.name,
            typeInfo = typeInfo,
            writeable = girField.writable == true,
            accessPath = accessPath,
            kdoc = context.processKdoc(girField.doc?.doc?.text),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girField.info)
                .build()
                .getOrNull(),
        )
    }
}
