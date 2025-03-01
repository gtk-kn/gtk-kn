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

package org.gtkkn.gir.model

/**
 * A field of a struct or union structure, such as a C bit field.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the field.
 * @property writable Indicates if the field is writable.
 * @property readable Indicates if the field is readable.
 * @property private Indicates if the field is private to the structure.
 * @property bits Number of bits for the field.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the field.
 * @property type The type of the field.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirField(
    val info: GirInfo,
    val name: String? = null,
    val writable: Boolean? = null,
    val readable: Boolean? = null,
    val private: Boolean? = null,
    val bits: Int? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val type: GirFieldType,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        type.initialize(this, namespace)
    }

    fun shouldBeGenerated(): Boolean = info.gtkKnIgnore != true && private != true && readable != false
}
