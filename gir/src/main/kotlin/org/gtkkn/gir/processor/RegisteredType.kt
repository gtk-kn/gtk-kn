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

package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.model.GirNamedElement
import org.gtkkn.gir.model.GirNamespace

@Suppress("DataClassShouldBeImmutable", "LateinitUsage")
data class RegisteredType(
    val className: ClassName,
    val namespace: GirNamespace,
    val cType: String?,
    val rawName: String,
    val girNamedElement: GirNamedElement,
    val rawParentName: String? = null,
) {
    val fullName: String = buildFullName(checkNotNull(namespace.name), rawName)
    val parentFullName: String? = buildParentFullName(checkNotNull(namespace.name), rawParentName)

    lateinit var allAncestors: List<RegisteredType>

    val isGObject: Boolean
        get() = allAncestors.any { it.fullName == "GObject.Object" }

    companion object {
        private fun buildFullName(namespace: String, rawName: String): String =
            "$namespace.$rawName"

        private fun buildParentFullName(namespace: String, rawParentName: String?): String? {
            if (rawParentName == null) return null
            return if ('.' in rawParentName) {
                rawParentName // already has a namespace
            } else {
                "$namespace.$rawParentName"
            }
        }
    }
}
