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

package org.gtkkn.gir.parser

import org.w3c.dom.Node
import org.w3c.dom.NodeList

/**
 * Get the value of attribute with name [attributeName].
 *
 * @throws IllegalStateException when the attribute does not exist.
 * @return the atttribute value
 */
fun Node.attributeValue(attributeName: String): String =
    attributeValueOrNull(attributeName) ?: throw MissingNodeAttributeError(nodeName, attributeName)

/**
 * Get the value of attribute with name [attributeName] or null.
 *
 * @return the attribute value or null when the attribute does not exist.
 */
fun Node.attributeValueOrNull(attributeName: String): String? = attributes.getNamedItem(attributeName)?.nodeValue

/**
 * Convert all nodes in the [NodeList] to a List.
 */
fun NodeList.asList(): List<Node> = sequence<Node> {
    for (i in 0 until length) {
        yield(item(i))
    }
}.toList()

/**
 * Get the child node with given [nodeName].
 *
 * @throws MultipleChildNodesError when [Node] has more than 1 child with this name.
 * @throws ChildNodeNotFoundError when [Node] does not have a child node with this name.
 * @return the child node.
 */
fun Node.singleChildWithName(nodeName: String): Node =
    singleChildWithNameOrNull(nodeName) ?: throw ChildNodeNotFoundError(nodeName)

/**
 * Get the child node with given [nodeName] or null.
 *
 * @throws MultipleChildNodesError when [Node] has more than 1 child with this name.
 * @return the child node or null when the node does not have a child node with this name.
 */
fun Node.singleChildWithNameOrNull(nodeName: String): Node? {
    val matchingNodes = childNodesWithName(nodeName)
    return when (matchingNodes.size) {
        0 -> null
        1 -> matchingNodes.first()
        else -> throw MultipleChildNodesError(nodeName, matchingNodes.size)
    }
}

/**
 * Get all child nodes with given [nodeName].
 *
 * @return List of child nodes or [emptyList] when no child nodes match.
 */
fun Node.childNodesWithName(nodeName: String): List<Node> = this.childNodes.asList().filter { it.nodeName == nodeName }

/**
 * Get all child nodes matching any of given [nodeNames]
 *
 * @return List of child nodes or [emptyList] when no child nodes match.
 */
fun Node.childNodesWithNames(vararg nodeNames: String): List<Node> = this.childNodes.asList().filter {
    nodeNames.contains(
        it.nodeName,
    )
}

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
