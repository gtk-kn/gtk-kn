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

package org.gtkkn.gir.parser.metadata

/**
 * A specialized type of `Metadata` that represents a collection of metadata elements.
 *
 * The `MetadataSet` is designed to group multiple `Metadata` objects that match
 * the same pattern and selector. It allows combining child elements and arguments
 * from multiple `Metadata` objects into a single cohesive structure.
 *
 * **Usage**:
 * - Typically used in scenarios where multiple `Metadata` objects need to be
 *   treated as a single logical entity while retaining their individual characteristics.
 * - Arguments from added siblings take precedence and overwrite existing arguments.
 *
 * @param selector An optional selector associated with this metadata set, allowing
 *                 for finer-grained matching.
 */
class MetadataSet(selector: String? = null) : Metadata("", selector) {
    /**
     * Adds a sibling `Metadata` to this `MetadataSet`.
     *
     * This method integrates the child elements and arguments of the given
     * `metadata` into the current `MetadataSet`. Child elements are appended,
     * and arguments are merged, with the incoming arguments taking precedence
     * over existing ones.
     *
     * **Behavior**:
     * - Child elements of the sibling `Metadata` are added as direct children of this set.
     * - Arguments of the sibling `Metadata` overwrite any existing arguments with the same key.
     *
     * @param metadata The `Metadata` object to add as a sibling.
     */
    fun addSibling(metadata: Metadata) {
        // Add all children of the sibling `metadata` as children of this set.
        metadata.children.forEach { child ->
            addChild(child)
        }

        // Merge arguments, giving precedence to those from the sibling `metadata`.
        metadata.args.forEach { (key, value) ->
            args[key] = value
        }
    }
}
