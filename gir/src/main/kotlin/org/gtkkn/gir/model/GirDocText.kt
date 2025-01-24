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
 * Documentation text for an element.
 *
 * @constructor Creates a GirDocVersion.
 * @param xmlSpace Preserve the original formatting of the documentation from the source code.
 * @param xmlWhitespace Preserve the original formatting of the documentation from the source code.
 * @property filename Name of the file containing this documentation.
 * @property line Line number in the source code where the documentation starts.
 * @property column Column number in the source code where the documentation starts.
 * @property text The actual text of the documentation.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirDocText(
    /** Preserve the original formatting of the documentation from the source code */
    private val xmlSpace: String? = null,
    /** Preserve the original formatting of the documentation from the source code */
    private val xmlWhitespace: String? = null,
    /** The file containing this documentation */
    val filename: String,
    /** The first line of the documentation in the source code */
    val line: String,
    /** The first column of the documentation in the source code */
    val column: String? = null,
    /** The text of the documentation */
    override val text: String,
) : GirDocumentation {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    val preserveSpace = xmlSpace == "preserve"
    val preserveWhitespace = xmlWhitespace == "preserve"
    override fun initializeChildren(namespace: GirNamespace) {
        // No children
    }
}
