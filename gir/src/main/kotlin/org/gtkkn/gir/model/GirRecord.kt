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
 * Record definition, equivalent to a C struct, that is a simple structure, not a class.
 *
 * @property info a [GirInfo] that a record can contain.
 * @property name name of the record.
 * @property cType corresponding C type of the record.
 * @property disguised deprecated. Binary attribute to tell if the record is disguised, i.e. whether the c:type is a
 *                     typedef that doesn't look like a pointer, but is one internally. Its second meaning is "private"
 *                     and is set when any typedef struct is parsed which doesn't also include a full struct with fields
 *                     (https://gitlab.gnome.org/GNOME/gobject-introspection/issues/101).
 *                     Replaced by "opaque" and "pointer".
 * @property opaque true for a typedef struct that does not have a corresponding public structure definition.
 * @property pointer true for a typedef struct pointer, e.g. `typedef struct Foo* FooPtr`.
 * @property glibTypeName GObject compatible C type of the record.
 * @property glibGetType function to get the GObject compatible type of the record.
 * @property cSymbolPrefix prefix to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property foreign true if the record is foreign, that it is not available in a g-i supported library.
 * @property glibIsGtypeStructFor name of the GObject compatible gtype this record represents. If empty, this record
 *                                will be hidden from generated public APIs.
 * @property copyFunction name of the function used to copy the record.
 * @property freeFunction name of the function used to free the record.
 * @property fields a list of [GirField] that a record can contain.
 * @property functions a list of [GirFunction] that a record can contain.
 * @property unions a list of [GirUnion] that a record can contain.
 * @property methods a list of [GirMethod] that a record can contain.
 * @property constructors a list of [GirConstructor] that a record can contain.
 */
data class GirRecord(
    val info: GirInfo,
    val name: String,
    val cType: String?,
    val disguised: Boolean?,
    val opaque: Boolean?,
    val pointer: Boolean?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val cSymbolPrefix: String?,
    val foreign: Boolean?,
    val glibIsGtypeStructFor: String?,
    val copyFunction: String?,
    val freeFunction: String?,
    val fields: List<GirField>,
    val functions: List<GirFunction>,
    val unions: List<GirUnion>,
    val methods: List<GirMethod>,
    val constructors: List<GirConstructor>,
)
