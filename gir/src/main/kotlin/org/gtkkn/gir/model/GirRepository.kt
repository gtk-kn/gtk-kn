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
 * Root node of a GIR repository.
 *
 * It contains  namespaces, which can in turn be implemented in several libraries.
 *
 * @property version version number of the repository.
 * @property cIdentifierPrefixes prefixes to filter out from C identifiers for data structures and types. For example,
 *                               GtkWindow will be Window. If c:symbol-prefixes is not used, then this element is used
 *                               for both.
 * @property cSymbolPrefixes prefixes to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property includes a list of [GirInclude] that a repository can contain.
 * @property cIncludes a list of [GirCInclude] that a repository can contain.
 * @property packages a list of [GirPackage] that a repository can contain.
 * @property namespace a list of [GirNamespace] that a repository can contain.
 */
data class GirRepository(
    val version: String,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    val includes: List<GirInclude>,
    val cIncludes: List<GirCInclude>,
    val packages: List<GirPackage>,
    val namespace: GirNamespace,
)
