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

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import org.gtkkn.gir.blueprints.PropertyBlueprint

interface PropertyGenerator : MethodGenerator, ConversionBlockGenerator, KDocGenerator {
    fun buildProperty(property: PropertyBlueprint, instancePointer: String?): PropertySpec =
        PropertySpec.builder(property.kotlinName, property.typeInfo.kotlinTypeName, KModifier.PUBLIC).apply {
            addKdoc(buildPropertyKDoc(property.kdoc, property.optInVersionBlueprint))

            // optInVersion
            property.optInVersionBlueprint?.typeName?.let { annotationClassName ->
                addAnnotation(annotationClassName)
            }

            if (property.isOverride) {
                addModifiers(KModifier.OVERRIDE)
            }

            if (property.isOpen && !property.isOverride) {
                addModifiers(KModifier.OPEN)
            }

            getter(buildMethod(property.getter, instancePointer, FunSpecBuilderType.GETTER))

            property.setter?.let { setter ->
                mutable(true)
                setter(buildMethod(setter, instancePointer, FunSpecBuilderType.SETTER))
            }
        }.build()
}
