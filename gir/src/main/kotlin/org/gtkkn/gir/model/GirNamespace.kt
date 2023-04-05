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
 * Namespace which maps metadata entries to C functionality.
 *
 * This a similar concept to namespace in C++, but for GObject-based C libraries.
 *
 * @property name name of the namespace. For example, 'Gtk'.
 * @property version version number of the namespace.
 * @property cIdentifierPrefixes prefixes to filter out from C identifiers for data structures and types. For example,
 *                               GtkWindow will be Window. If c:symbol-prefixes is not used, then this element is used
 *                               for both.
 * @property cSymbolPrefixes prefixes to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property cPrefix deprecated: the same as c:identifier-prefixes. Only used for backward compatibility.
 * @property sharedLibrary path to the shared library implementing the namespace. It can be a comma-separated list,
 *                         with relative path only.
 * @property aliases a list of [GirAlias] that a namespace can contain.
 * @property interfaces a list of [GirAlias] that a namespace can contain.
 * @property classes a list of [GirClass] that a namespace can contain.
 * @property unions a list of [GirUnion] that a namespace can contain.
 * @property records a list of [GirRecord] that a namespace can contain.
 * @property functions a list of [GirFunction] that a namespace can contain.
 * @property callbacks a list of [GirCallback] that a namespace can contain.
 * @property constants a list of [GirConstant] that a namespace can contain.
 * @property enums a list of [GirEnum] that a namespace can contain.
 * @property bitfields a list of [GirBitField] that a namespace can contain.
 * @property boxes a list of [GirBoxed] that a namespace can contain.
 */
data class GirNamespace(
    val name: String,
    val version: String,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    val cPrefix: String?,
    val sharedLibrary: String?,
    val aliases: List<GirAlias>,
    val interfaces: List<GirInterface>,
    val classes: List<GirClass>,
    val unions: List<GirUnion>,
    val records: List<GirRecord>,
    val functions: List<GirFunction>,
    val callbacks: List<GirCallback>,
    val constants: List<GirConstant>,
    val enums: List<GirEnum>,
    val bitfields: List<GirBitField>,
    val boxes: List<GirBoxed>,
)
