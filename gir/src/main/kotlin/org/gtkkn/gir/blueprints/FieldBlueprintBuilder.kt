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

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.IgnoredFieldException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class FieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girField: GirField,
) : BlueprintBuilder<FieldBlueprint>(context) {
    override fun blueprintObjectType(): String = "field"

    override fun blueprintObjectName(): String = girField.name

    override fun buildInternal(): FieldBlueprint {
        if (girField.private == true) {
            throw IgnoredFieldException(girField.name, "private")
        }
        if (girField.readable == false) {
            throw IgnoredFieldException(girField.name, "not readable")
        }

        val typeInfo = when (girField.type) {
            is GirType -> {
                // assuming not nullable here, we might need to revisit this when adding array, callback and
                // embedded structs
                val typeInfo = context.resolveTypeInfo(girNamespace, girField.type, false)
                typeInfo.withNullable(typeInfo.isCinteropNullable)
            }

            is GirArrayType -> throw UnresolvableTypeException("Fields with arrays are not supported")
            is GirCallback -> throw UnresolvableTypeException("Fields with callbacks are not supported")
        }

        return FieldBlueprint(
            kotlinName = context.kotlinizeFieldName(girField.name),
            nativeName = girField.name,
            typeInfo = typeInfo,
            writeable = girField.writable == true,
            kdoc = context.processKdoc(girField.info.docs.doc?.text),
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girField.info)
                .build()
                .getOrNull(),
        )
    }
}
