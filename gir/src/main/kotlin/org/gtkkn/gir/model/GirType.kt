/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.model

/**
 * A simple type of data (as opposed to an array).
 *
 * @property name name of the type.
 * @property cType the C representation of the type.
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property types a list of [GirAnyType] that a simple type can contain.
 * @property docs a [GirDocElements].
 */
data class GirType(
    val name: String?,
    val cType: String?,
    val introspectable: Boolean?,
    val types: List<GirAnyType>,
    val docs: GirDocElements,
) : GirAnyType
