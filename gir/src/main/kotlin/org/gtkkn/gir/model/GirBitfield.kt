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
 * Element defining a bit field (as in C).
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the bit field.
 * @property cType Corresponding C type of the bit field.
 * @property glibTypeName GObject compatible type name of the bit field.
 * @property glibGetType Function to retrieve the GObject compatible type of the bit field.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the bit field.
 * @property members Members of the bit field.
 * @property functions Functions within the bit field.
 * @property functionInlines Inline functions within the bit field.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirBitfield(
    val info: GirInfo,
    override val name: String,
    override val cType: String,
    val glibTypeName: String? = null,
    val glibGetType: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val members: List<GirMember> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        members.forEach { it.initialize(this, namespace) }
        functions.forEach { it.initialize(this, namespace) }
        functionInlines.forEach { it.initialize(this, namespace) }
    }

    override fun shouldBeGenerated() = info.gtkKnIgnore != true
}
