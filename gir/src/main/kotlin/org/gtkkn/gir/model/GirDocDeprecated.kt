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
 * Deprecated documentation of an element.
 *
 * @constructor Creates a GirDocVersion.
 * @param xmlSpace Preserve the original formatting of the documentation from the source code.
 * @param xmlWhitespace Preserve the original formatting of the documentation from the source code.
 * @property text Text of the deprecated documentation.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirDocDeprecated(
    /** Preserve the original formatting of the documentation from the source code */
    private val xmlSpace: String? = null,
    /** Preserve the original formatting of the documentation from the source code */
    private val xmlWhitespace: String? = null,
    /** The text of the deprecated documentation */
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
