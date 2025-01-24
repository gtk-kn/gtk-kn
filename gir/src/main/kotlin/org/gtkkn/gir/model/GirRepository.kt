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
 * Root node of a GIR repository. It contains namespaces, which can in turn be implemented in several libraries.
 *
 * @property version Version number of the repository.
 * @property cIdentifierPrefixes Prefixes to filter out from C identifiers for data structures and types.
 * For example, GtkWindow will be Window. If c:symbol-prefixes is not used, then this element is used for both.
 * @property cSymbolPrefixes Prefixes to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property includes Dependent namespaces to include with the current namespace.
 * @property cIncludes Dependent C header files which should be included in C programs.
 * @property packages Deprecated: package names containing the library.
 * @property namespaces Namespaces which map metadata entries to C functionality.
 */
data class GirRepository(
    val version: String? = null,
    val cIdentifierPrefixes: String? = null,
    val cSymbolPrefixes: String? = null,
    val includes: List<GirInclude> = emptyList(),
    val cIncludes: List<GirCInclude> = emptyList(),
    val packages: List<GirPackage> = emptyList(),
    val namespaces: List<GirNamespace> = emptyList()
)
