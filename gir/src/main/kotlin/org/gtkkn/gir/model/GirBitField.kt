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

package org.gtkkn.gir.model

/**
 * Element defining a bit field (as in C).
 *
 * @property info attributes of a bit field (see [GirInfo]).
 * @property name name of the bit field.
 * @property cType corresponding C type.
 * @property glibTypeName type name compatible with the GObject type system.
 * @property glibGetType function to get the GObject compatible type of the bit field.
 * @property members a list of [GirMember] that a bit field can contain.
 * @property functions a list of [GirFunction] that a bit field can contain.
 */
data class GirBitField(
    val info: GirInfo,
    val name: String,
    val cType: String,
    val glibTypeName: String?,
    val glibGetType: String?,
    val members: List<GirMember>,
    val functions: List<GirFunction>,
)
