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
import org.gtkkn.gir.blueprints.RecordBlueprint

/**
 * A generator that produces Kotlin code for GObject-based records.
 */
interface RecordGenerator : RecordUnionGenerator {
    fun buildRecord(record: RecordBlueprint): TypeSpec =
        TypeSpec.classBuilder(record.kotlinTypeName).apply {
            addCommonTopLevelKdocAndAnnotations(record)
            val addEmptyConstructors = !record.hasNewConstructor && !record.isOpaque && !record.isDisguised

            addPrimaryConstructorWithCleaner(this, record.objectPointerTypeName, addEmptyConstructors)
            superclass(BindingsGenerator.PROXY_INSTANCE_TYPE)
            addSuperclassConstructorParameter("pointer")

            // Pointer property
            addProperty(
                PropertySpec.builder(record.objectPointerName, record.objectPointerTypeName)
                    .initializer("pointer")
                    .build(),
            )

            // Add default constructors if needed
            if (addEmptyConstructors) {
                addNoArgConstructor(this, record.kotlinName, record.nativeTypeName, record.objectPointerTypeName)
                addPairConstructor(this, record.kotlinTypeName, record.objectPointerTypeName)
                addAutofreeScopeConstructor(this, record.kotlinName, record.nativeTypeName)

                addFieldConstructorsIfAny(
                    this,
                    record.kotlinName,
                    record.fields,
                )
            }

            // Methods and Fields
            addMethodsAndFields(record)

            // toString if needed
            addToStringIfNeeded(record, isDisguised = record.isDisguised)

            // Companion object
            buildCompanionObject(record, record.kotlinTypeName)?.let { addType(it) }
        }.build()
}
