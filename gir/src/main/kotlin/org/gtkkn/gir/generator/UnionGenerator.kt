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

package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.UnionBlueprint

/**
 * A generator that produces Kotlin code for unions.
 */
interface UnionGenerator : RecordUnionGenerator {
    fun buildUnion(union: UnionBlueprint): TypeSpec =
        TypeSpec.classBuilder(union.kotlinTypeName).apply {
            addCommonTopLevelKdocAndAnnotations(union)
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()
            addPrimaryPointerConstructor(union)
            setupInheritance(union)
            val addEmptyConstructors =
                !addGirConstructors(union, companionSpecBuilder) && union.cStructTypeName.simpleName != "GTypeCValue"
            // Add default constructors if needed
            if (addEmptyConstructors) {
                addRecordUnionNoArgConstructor(union.kotlinName, union.nativeTypeName, union.objectPointerTypeName)
                addRecordUnionAutofreeScopeConstructor(union.kotlinName, union.nativeTypeName)
                addFieldConstructorsIfAny(union.kotlinName, union.fields)
            }

            // Methods and Fields
            addMethodsAndFields(union)

            // toString if needed
            addToStringIfNeeded(union)

            // Companion object
            buildCompanionObject(companionSpecBuilder, union, union.kotlinTypeName)?.let { addType(it) }
        }.build()
}
