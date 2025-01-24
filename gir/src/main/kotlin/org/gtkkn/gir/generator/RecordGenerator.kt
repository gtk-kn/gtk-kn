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

import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.RecordBlueprint

/**
 * A generator that produces Kotlin code for GObject-based records.
 */
interface RecordGenerator : RecordUnionGenerator {
    fun buildRecord(record: RecordBlueprint): TypeSpec =
        TypeSpec.classBuilder(record.kotlinTypeName).apply {
            addCommonTopLevelKdocAndAnnotations(record)
            if (record.cStructTypeName.simpleName == "GTypeInstance") {
                addModifiers(KModifier.OPEN)
            }
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()
            addPrimaryPointerConstructor(record)
            setupInheritance(record)
            val addEmptyConstructors =
                !addGirConstructors(record, companionSpecBuilder) && !record.isOpaque && !record.isDisguised
            // Add default constructors if needed
            if (addEmptyConstructors) {
                addRecordUnionNoArgConstructor(record.kotlinName, record.nativeTypeName, record.objectPointerTypeName)
                addRecordUnionAutofreeScopeConstructor(record.kotlinName, record.nativeTypeName)
                addFieldConstructorsIfAny(record.kotlinName, record.fields)
            }

            // Methods and Fields
            addMethodsAndFields(record)

            // toString if needed
            addToStringIfNeeded(record, isDisguised = record.isDisguised)

            // Companion object
            buildCompanionObject(companionSpecBuilder, record, record.kotlinTypeName)?.let { addType(it) }
        }.build()
}
