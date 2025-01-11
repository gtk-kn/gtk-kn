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

import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.UnionBlueprint

/**
 * A generator that produces Kotlin code for unions.
 */
interface UnionGenerator : RecordUnionGenerator {
    fun buildUnion(union: UnionBlueprint): TypeSpec =
        TypeSpec.classBuilder(union.kotlinTypeName).apply {
            addCommonTopLevelKdocAndAnnotations(union)

            val addEmptyConstructors = !union.hasNewConstructor &&
                union.cStructTypeName.simpleName != "GTypeCValue"

            addPrimaryConstructorWithCleaner(union.objectPointerTypeName, union.objectPointerName, addEmptyConstructors)
            superclass(BindingsGenerator.PROXY_INSTANCE_TYPE)
            addSuperclassConstructorParameter(union.objectPointerName)

            // Pointer property
            addProperty(
                PropertySpec.builder(union.objectPointerName, union.objectPointerTypeName)
                    .initializer(union.objectPointerName)
                    .build(),
            )

            // Add default constructors if needed
            if (addEmptyConstructors) {
                addNoArgConstructor(union.kotlinName, union.nativeTypeName, union.objectPointerTypeName)
                addPairConstructor(union.kotlinTypeName, union.objectPointerName, union.objectPointerTypeName)
                addAutofreeScopeConstructor(union.kotlinName, union.nativeTypeName)

                addFieldConstructorsIfAny(
                    union.kotlinName,
                    union.fields,
                )
            }

            // Methods and Fields
            addMethodsAndFields(union)

            // toString if needed
            addToStringIfNeeded(union)

            // Companion object
            buildCompanionObject(union, union.kotlinTypeName)?.let { addType(it) }
        }.build()
}
