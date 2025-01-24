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
 * A constant entity, similar to a `const` variable in C.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the constant.
 * @property value Value of the constant.
 * @property cType Corresponding C type of the constant.
 * @property cIdentifier Corresponding C identifier in the source code.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the constant.
 * @property type The type of the constant.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirConstant(
    val info: GirInfo,
    override val name: String,
    val value: String,
    override val cType: String? = null,
    val cIdentifier: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val type: GirAnyType? = null,
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        type?.initialize(this, namespace)
    }

    override fun shouldBeGenerated() = info.gtkKnIgnore != true
}
