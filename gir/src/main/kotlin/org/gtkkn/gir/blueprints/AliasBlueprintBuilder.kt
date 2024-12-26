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

import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.model.GirAlias
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class AliasBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirAlias,
) : BlueprintBuilder<AliasBlueprint>(context) {
    override fun blueprintObjectType(): String = "alias"

    override fun blueprintObjectName(): String = girNode.name

    override fun buildInternal(): AliasBlueprint {
        context.checkIgnoredType(girNode.cType)

        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.cType)
        }

        val parentTypeName = context.resolveTypeInfo(girNamespace, girNode.type, false).kotlinTypeName

        return AliasBlueprint(
            kotlinName = girNode.name.toPascalCase(),
            parentTypeName = parentTypeName,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }
}
