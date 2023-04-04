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
 * Element defining a enumeration type similar to enum in C/C++.
 *
 * @property info attributes of an enumeration (see [GirInfo]).
 * @property name name of the enumeration.
 * @property cType corresponding C type.
 * @property glibTypeName type name compatible with the GObject type system.
 * @property glibGetType function to get the GObject compatible type of the enumeration.
 * @property glibErrorDomain error domain of this enumeration in a stringified form.
 * @property members a list of [GirMember] that an enumeration can contain.
 * @property functions a list of [GirFunction] that an enumeration can contain.
 */
data class GirEnum(
    val info: GirInfo,
    val name: String,
    val cType: String,
    val glibTypeName: String?,
    val glibGetType: String?,
    val glibErrorDomain: String?,
    val members: List<GirMember>,
    val functions: List<GirFunction>,
)
