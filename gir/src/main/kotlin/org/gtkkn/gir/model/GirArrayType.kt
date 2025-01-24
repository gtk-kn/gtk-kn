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

import org.gtkkn.gir.blueprints.ListSize

/**
 * An array type of data where each element is of the same type.
 *
 * @property name Name of the array type.
 * @property zeroTerminated Indicates if the last element of the array is zero (or `null` in Kotlin). If neither
 *                          `zeroTerminated` nor `fixedSize` is set, this property should be treated as `true`.
 * @property fixedSize Fixed size of the array, if predetermined.
 * @property introspectable Indicates if the array type is introspectable.
 * @property length Index of the parameter element specifying the array's length.
 * @property cType C representation of the array type.
 * @property type The type of the values contained in the array.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirArrayType(
    val name: String? = null,
    val zeroTerminated: Boolean? = null,
    val fixedSize: Int? = null,
    val introspectable: Boolean? = null,
    val length: Int? = null,
    val cType: String? = null,
    val type: GirAnyType,
) : GirAnyType {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        type.initialize(this, namespace)
    }

    fun toListSize(): ListSize = if (fixedSize != null) ListSize.FixedSize(fixedSize) else ListSize.NullTerminated
}
