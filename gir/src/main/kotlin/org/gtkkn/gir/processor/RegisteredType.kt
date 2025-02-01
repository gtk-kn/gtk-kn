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
        get() = fullName == "GObject.Object" || allAncestors.any { it.fullName == "GObject.Object" }

    /**
     * Returns the first `RegisteredType` in the ancestry chain with a non-null `cType`.
     * If the current type has a non-null `cType`, it returns itself.
     * Otherwise, it checks its ancestors recursively.
     */
    fun findFirstWithCType(): RegisteredType? {
        if (cType != null) return this
        return allAncestors.firstOrNull { it.cType != null }
    }

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
