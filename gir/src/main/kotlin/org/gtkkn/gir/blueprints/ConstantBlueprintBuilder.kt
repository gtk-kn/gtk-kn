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

import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirConstant
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class ConstantBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirConstant,
) : BlueprintBuilder<ConstantBlueprint>(context) {
    override fun blueprintObjectType(): String = "constant"

    override fun blueprintObjectName(): String = girNode.name

    override fun buildInternal(): ConstantBlueprint {
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.name)
        }

        if (girNode.type == null) {
            error("Constant without type")
        }

        if (girNode.cType == null) {
            error("Constant without cType")
        }

        // we don't kotlinize these because these constants can reference uppercase and lowercase key values as well
        val kotlinName = girNode.name
        val typeInfo = when (girNode.type) {
            is GirArrayType -> error("Array constants are not supported")
            is GirType -> context.resolveTypeInfo(girNamespace, girNode.type, false)
        }

        return ConstantBlueprint(
            kotlinName = kotlinName,
            typeInfo = typeInfo,
            constantValue = girNode.value,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
            deprecatedBlueprint = DeprecatedBlueprintBuilder(context, girNode.info, girNode.doc).build().getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }
}
