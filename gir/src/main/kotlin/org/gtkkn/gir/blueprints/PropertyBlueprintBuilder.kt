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

import com.squareup.kotlinpoet.UNIT
import net.pearx.kasechange.toCamelCase
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

class PropertyBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girNode: GirProperty,
    private val methodsMap: HashMap<String, MethodBlueprint>,
    private val superClasses: List<GirClass> = emptyList(),
    private val superInterfaces: List<GirInterface> = emptyList(),
    private val isOpen: Boolean = false,
) : BlueprintBuilder<PropertyBlueprint>(context) {
    override fun blueprintObjectType(): String = "method"

    override fun blueprintObjectName(): String = girNode.name

    override fun buildInternal(): PropertyBlueprint {
        val getter = methodsMap[girNode.getter]
        val setter = methodsMap[girNode.setter]

        checkSkippedProperty(getter, setter)

        val kotlinName = girNode.name.toCamelCase()

        // check for overrides
        val superProperties = superClasses.flatMap { it.properties } + superInterfaces.flatMap { it.properties }
        val nameMatchingSuperProperties =
            superProperties.filter { it.shouldBeGenerated() && it.name == girNode.name }

        val isOverride = nameMatchingSuperProperties.isNotEmpty()
        if (isOverride) {
            logger.warn { "Detected property override: ${girNode.name}" }
        }

        return PropertyBlueprint(
            kotlinName = kotlinName,
            typeInfo = checkNotNull(getter).returnTypeInfo,
            getter = getter,
            setter = setter,
            isOverride = isOverride,
            isOpen = isOpen,
            optInVersionBlueprint = OptInVersionsBlueprintBuilder(context, girNamespace, girNode.info)
                .build()
                .getOrNull(),
            deprecatedBlueprint = DeprecatedBlueprintBuilder(context, girNode.info, girNode.doc).build().getOrNull(),
            kdoc = context.processKdoc(girNode.doc?.doc?.text),
        )
    }

    private fun checkSkippedProperty(getter: MethodBlueprint?, setter: MethodBlueprint?) {
        // Properties that fail validation will still be generated as regular methods instead of properties.
        if (!girNode.shouldBeGenerated()) {
            throw NotIntrospectableException(girNode.name)
        }

        if (getter == null && setter == null) {
            throw UnresolvableTypeException("Property has no getter nor setter")
        }

        if (getter == null) {
            throw UnresolvableTypeException("Property has no getter")
        }

        if (setter != null && !setter.parameters.first().typeInfo.sameType(getter.returnTypeInfo)) {
            throw UnresolvableTypeException("Property TypeInfo of getter and setter do not match")
        }

        if (setter != null && setter.returnTypeInfo.kotlinTypeName != UNIT) {
            throw UnresolvableTypeException("Property setter does not return Unit")
        }

        if (getter.throws) {
            throw UnresolvableTypeException("Property getter throws")
        }

        if (setter?.throws == true) {
            throw UnresolvableTypeException("Property setter throws")
        }
    }
}
