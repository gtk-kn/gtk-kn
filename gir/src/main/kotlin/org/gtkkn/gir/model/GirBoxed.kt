/*
 * Copyright (c) 2023 gtk-kn
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
 * Boxed type (wrapper to opaque C structures registered by the type system).
 *
 * @property info attributes of a Boxed type (see [GirInfo]).
 * @property glibName GObject compatible type name of the boxed type.
 * @property cSymbolPrefix prefix to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property glibTypeName GObject compatible type name of the boxed type.
 * @property glibGetType function to get the GObject compatible type of the boxed type.
 * @property functions a list of [GirFunction] that a Boxed type can contain.
 */
data class GirBoxed(
    val info: GirInfo,
    val glibName: String,
    val cSymbolPrefix: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val functions: List<GirFunction>,
)
