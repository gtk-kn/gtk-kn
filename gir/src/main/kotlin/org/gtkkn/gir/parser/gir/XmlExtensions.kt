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

package org.gtkkn.gir.parser.gir

class MultipleChildNodesError(
    nodeName: String,
    count: Int,
) : Error("Expected single child with name $nodeName but node has $count child nodes with this name")

class ChildNodeNotFoundError(nodeName: String) : Error(
    "Expected single child node with name $nodeName but node has none",
)

class MissingNodeAttributeError(
    nodeName: String,
    attributeName: String,
) : Error("Expected attribute with name '$attributeName' on node '$nodeName but the attribute does not exist.")
