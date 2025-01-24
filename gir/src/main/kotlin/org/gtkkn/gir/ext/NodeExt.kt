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

package org.gtkkn.gir.ext

import org.gtkkn.gir.parser.gir.ChildNodeNotFoundError
import org.gtkkn.gir.parser.gir.MissingNodeAttributeError
import org.gtkkn.gir.parser.gir.MultipleChildNodesError
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.StringWriter
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

/**
 * Get the value of attribute with name [attributeName].
 *
 * @throws IllegalStateException when the attribute does not exist.
 * @return the attribute value
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
fun Node.childNodesWithNames(vararg nodeNames: String): List<Node> = this.childNodes.asList().filter { node ->
    nodeNames.contains(
        node.nodeName,
    )
}

/**
 * Safely sets an attribute on a Node if it is an Element.
 * If the value is null or blank, the attribute will be removed instead.
 *
 * @param name The name of the attribute.
 * @param value The value of the attribute, or null to remove the attribute.
 */
fun Node.setAttribute(name: String, value: String?) {
    require(name.isNotBlank()) { "Attribute name must not be blank." }

    if (this is Element) {
        if (value.isNullOrBlank()) {
            // Remove the attribute if the value is null or blank
            removeAttribute(name)
        } else {
            setAttribute(name, value)
        }
    } else {
        error(
            "Cannot set attribute '$name' on a Node that is not an Element. " +
                "Node type: ${this.nodeType}, Node name: ${this.nodeName}",
        )
    }
}

fun Node.attributeBooleanValueOrNull(attributeName: String): Boolean? =
    attributeValueOrNull(attributeName)?.let { bool ->
        when (bool.lowercase()) {
            "1", "true" -> true
            "0", "false" -> false
            else -> error("String '$this' is not a valid boolean value")
        }
    }

/**
 * Converts the current [Document] to its XML representation as a string.
 *
 * This function ensures that the output closely resembles the original XML structure
 * without adding unnecessary whitespace or new lines. The XML declaration is included,
 * and the encoding is set to UTF-8.
 *
 * Example usage:
 * ```
 * val xmlString = document.toXmlString()
 * println(xmlString)
 * ```
 *
 * @return The XML string representation of the [Document].
 */
fun Document.toXmlString(): String {
    val transformer = TransformerFactory.newInstance().newTransformer()
    transformer.setOutputProperty(OutputKeys.INDENT, "no")
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no")
    transformer.setOutputProperty(OutputKeys.METHOD, "xml")
    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8")
    transformer.setOutputProperty(OutputKeys.STANDALONE, "yes")

    // Normalize the document to clean up any redundant whitespaces
    normalizeDocument()

    val writer = StringWriter()
    transformer.transform(DOMSource(this), StreamResult(writer))
    return writer.toString()
}
