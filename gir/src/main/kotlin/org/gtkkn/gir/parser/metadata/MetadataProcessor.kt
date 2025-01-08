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

package org.gtkkn.gir.parser.metadata

import org.gtkkn.gir.ext.setAttribute
import org.w3c.dom.Document
import org.w3c.dom.Node

/**
 * A processor for applying metadata-driven transformations to a GIR XML document.
 *
 * This class takes metadata rules and applies them to an XML document, enabling the patching of
 * GIR files for compatibility with specific requirements (e.g., Kotlin/Native).
 * The transformations are managed using a stack of metadata that adapts to the current context
 * within the XML structure.
 *
 * @constructor Creates a MetadataProcessor.
 * @param metadata The root metadata containing the rules to be applied to the XML document.
 * @param document The XML document representing the GIR file to be patched.
 */
class MetadataProcessor(
    private val metadata: Metadata,
    private val document: Document
) {
    /**
     * A stack of metadata used to manage context during traversal of the XML document.
     *
     * The stack ensures that metadata is scoped to the relevant XML node. When processing begins,
     * the root metadata is pushed onto the stack. As child nodes are encountered, metadata is pushed
     * or popped from the stack to adapt to the current XML context.
     *
     * **Why is this necessary?**
     * XML nodes can inherit or override metadata from their parent. By using a stack, we can:
     * - Keep track of parent metadata while processing child nodes.
     * - Ensure that metadata application respects the hierarchical structure of the XML.
     * - Avoid global metadata state, ensuring transformations are scoped and predictable.
     */
    private val metadataStack = mutableListOf<Metadata>()

    /**
     * A set of XML node types considered relevant for metadata application.
     *
     * Only nodes with these tags are processed for metadata matching and transformation.
     */
    private val relevantTypes = setOf(
        "alias", "bitfield", "glib:boxed", "callback", "constructor",
        "class", "enumeration", "field", "function", "instance-parameter",
        "interface", "method", "namespace", "parameter", "property", "record",
        "glib:signal", "union", "virtual-method",
    )

    /**
     * Applies metadata transformations to the XML document.
     *
     * This function begins by pushing the root metadata onto the stack and recursively processes
     * the XML document from the root element. After processing, the metadata stack is cleared.
     */
    fun apply() {
        metadataStack.add(metadata)
        processNode(document.documentElement)
        metadataStack.clear()
    }

    /**
     * Recursively processes an XML node and applies relevant metadata transformations.
     *
     * @param node The current XML node being processed.
     */
    private fun processNode(node: Node) {
        val tag = node.nodeName

        // If the node is of a relevant type, push its metadata and apply transformations
        if (tag in relevantTypes) {
            val name = node.attributes?.getNamedItem("name")?.nodeValue
            pushMetadata(name, tag)
            applyMetadata(node, tag)
        }

        // Special handling for "namespace" nodes
        if (tag == "namespace") {
            popMetadata()
        }

        // Copy the child nodes into a list to avoid issues with modifications during iteration
        val childNodes = node.childNodes
        val nodesList = mutableListOf<Node>()
        for (i in 0 until childNodes.length) {
            val childNode = childNodes.item(i)
            nodesList.add(childNode)
        }

        for (childNode in nodesList) {
            if (childNode.nodeType == Node.ELEMENT_NODE) {
                processNode(childNode)
            }
        }

        if (tag in relevantTypes) {
            popMetadata()
        }
    }

    /**
     * Pushes metadata for the current node onto the stack.
     *
     * @param name The name attribute of the current XML node.
     * @param tag The tag name of the current XML node.
     */
    private fun pushMetadata(name: String?, tag: String) {
        metadataStack.add(getCurrentMetadata(name, tag))
    }

    /**
     * Pops the most recent metadata from the stack.
     */
    private fun popMetadata() {
        if (metadataStack.isNotEmpty()) {
            metadataStack.removeAt(metadataStack.size - 1)
        }
    }

    /**
     * Retrieves the metadata at the top of the stack without removing it.
     *
     * @return The current metadata.
     */
    private fun peekMetadata(): Metadata = metadataStack.last()

    /**
     * Applies metadata transformations to a specific XML node.
     *
     * @param node The XML node to transform.
     * @param tag The tag name of the XML node.
     */
    private fun applyMetadata(node: Node, tag: String) {
        val metadata = peekMetadata()

        applyAbstract(node, metadata)
        applyArray(node, metadata)
        applyArrayLengthIdx(node, metadata)
        applyArrayNullTerminated(node, metadata)
        applyBaseType(node, tag, metadata)
        applyCHeaderFilename(node, tag, metadata)
        applyCopyFunction(node, metadata)
        applyCType(node, tag, metadata)
        applyDefault(node, tag, metadata)
        applyDelegateTarget(node, metadata)
        applyDelegateTargetCName(node, metadata)
        applyDeprecated(node, metadata)
        applyDeprecatedSince(node, metadata)
        applyDestroyNotifyCName(node, metadata)
        applyEnumRawValue(node, metadata)
        applyErrorDomain(node, metadata)
        applyFloating(node, metadata)
        applyFreeFunction(node, metadata)
        applyIgnore(node, metadata)
        applyInstanceIdx(node, metadata)
        applyIntrospectable(node, metadata)
        applyName(node, metadata)
        applyNoAccessorMethod(node, metadata)
        applyNoStringConversion(node, metadata)
        applyNullable(node, tag, metadata)
        applyOut(node, metadata)
        applyOwned(node, tag, metadata)
        applyParent(node, metadata)
        applyRef(node, metadata)
        applyRefFunction(node, metadata)
        applyRefSinkFunction(node, metadata)
        applyReinterpret(node, tag, metadata)
        applyReplacement(node, metadata)
        applyReturnsModifiedPointer(node, metadata)
        applyScope(node, metadata)
        applySealed(node, metadata)
        applySince(node, metadata)
        applyShadows(node, metadata)
        applyThrows(node, metadata)
        applyTypeCType(node, tag, metadata)
        applyTypeId(node, metadata)
        applyTypeName(node, tag, metadata)
        applyUnowned(node, tag, metadata)
        applyUnrefFunction(node, metadata)
        applyVirtual(node, metadata)
    }

    private fun applyAbstract(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.ABSTRACT)) {
            val isAbstract = metadata.getBool(ArgumentType.ABSTRACT)
            setBooleanAttribute(node, "abstract", isAbstract)
        }
    }

    private fun applyArray(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.ARRAY)) {
            var currentType = getChildNode(node, "type") ?: getChildNode(node, "array")
            if (currentType == null && hasChildNode(node, "return-value")) {
                currentType = getChildNode(checkNotNull(getChildNode(node, "return-value")), "type") ?: getChildNode(
                    checkNotNull(getChildNode(node, "return-value")),
                    "array",
                )
            }

            if (currentType != null) {
                val arrayNode = document.createElement("array")
                arrayNode.appendChild(currentType.cloneNode(true))

                val parent = currentType.parentNode
                parent?.removeChild(currentType)
                parent?.appendChild(arrayNode)
            }
        }
    }

    private fun applyArrayLengthIdx(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.ARRAY_LENGTH_IDX)) {
            var arrayNode = getChildNode(node, "array")
            if (arrayNode == null && hasChildNode(node, "return-value")) {
                arrayNode = getChildNode(checkNotNull(getChildNode(node, "return-value")), "array")
            }

            if (arrayNode != null) {
                val arrayLengthIdx = metadata.getInteger(ArgumentType.ARRAY_LENGTH_IDX)
                arrayNode.setAttribute("length", arrayLengthIdx.toString())
            }
        }
    }

    private fun applyArrayNullTerminated(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.ARRAY_NULL_TERMINATED)) {
            var arrayNode = getChildNode(node, "array")
            if (arrayNode == null && hasChildNode(node, "return-value")) {
                arrayNode = getChildNode(checkNotNull(getChildNode(node, "return-value")), "array")
            }

            if (arrayNode != null) {
                val nullTerminated = metadata.getBool(ArgumentType.ARRAY_NULL_TERMINATED)
                setBooleanAttribute(arrayNode, "zero-terminated", nullTerminated)
            }
        }
    }

    private fun applyBaseType(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.BASE_TYPE) && (tag == "alias" || tag == "glib:boxed")) {
            val baseType = metadata.getString(ArgumentType.BASE_TYPE)
            node.setAttribute("parent", baseType)
        }
    }

    private fun applyCHeaderFilename(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.CHEADER_FILENAME) && tag == "namespace") {
            val repoNode = node.parentNode ?: return
            val cIncludeNodes = getChildNodesByName(repoNode, "c:include")
            cIncludeNodes.forEach { repoNode.removeChild(it) }

            val headers = metadata.getString(ArgumentType.CHEADER_FILENAME).orEmpty()
            headers.split(",").map(String::trim).forEach { cInclude ->
                val cIncludeNode = document.createElement("c:include")
                cIncludeNode.setAttribute("name", cInclude)
                repoNode.appendChild(cIncludeNode)
            }
        }
    }

    private fun applyCopyFunction(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.COPY_FUNCTION)) {
            val copyFunc = metadata.getString(ArgumentType.COPY_FUNCTION)
            node.setAttribute("copy-function", copyFunc)
        }
    }

    private fun applyCType(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.CTYPE)) {
            val cType = metadata.getString(ArgumentType.CTYPE)
            if (tag == "method") {
                val typeNode = getChildNode(node, "return-value")?.let { getChildNode(it, "type") }
                typeNode?.setAttribute("c:type", cType) ?: node.setAttribute("c:type", cType)
            } else {
                node.setAttribute("c:type", cType)
            }
        }
    }

    private fun applyDefault(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.DEFAULT) && tag == "parameter") {
            val defaultValue = metadata.getString(ArgumentType.DEFAULT)
            node.setAttribute("gtk-kn-default", defaultValue)
        }
    }

    private fun applyDelegateTarget(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.DELEGATE_TARGET)) {
            val delegateTarget = metadata.getBool(ArgumentType.DELEGATE_TARGET)
            setBooleanAttribute(node, "gtk-kn-delegate-target", delegateTarget)
        }
    }

    private fun applyDelegateTargetCName(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.DELEGATE_TARGET_CNAME)) {
            val cname = metadata.getString(ArgumentType.DELEGATE_TARGET_CNAME)
            node.setAttribute("gtk-kn-delegate-target-cname", cname)
        }
    }

    private fun applyDestroyNotifyCName(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.DESTROY_NOTIFY_CNAME)) {
            val cname = metadata.getString(ArgumentType.DESTROY_NOTIFY_CNAME)
            node.setAttribute("gtk-kn-destroy-notify-cname", cname)
        }
    }

    private fun applyDeprecated(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.DEPRECATED)) {
            val deprecated = metadata.getBool(ArgumentType.DEPRECATED)
            setBooleanAttribute(node, "deprecated", deprecated)
        }
    }

    private fun applyDeprecatedSince(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.DEPRECATED_SINCE)) {
            val deprecatedSince = metadata.getString(ArgumentType.DEPRECATED_SINCE)
            node.setAttribute("deprecated-version", deprecatedSince)
        }
    }

    private fun applyEnumRawValue(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.ENUM_RAW_VALUE)) {
            val isRawValue = metadata.getBool(ArgumentType.ENUM_RAW_VALUE)
            setBooleanAttribute(node, "gtk-kn-enum-raw-value", isRawValue)
        }
    }

    private fun applyErrorDomain(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.ERRORDOMAIN)) {
            val errorDomain = metadata.getString(ArgumentType.ERRORDOMAIN)
            node.setAttribute("glib:error-domain", errorDomain)
        }
    }

    private fun applyFloating(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.FLOATING)) {
            val floating = metadata.getBool(ArgumentType.FLOATING)
            setBooleanAttribute(node, "gtk-kn-floating", floating)
        }
    }

    private fun applyFreeFunction(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.FREE_FUNCTION)) {
            val freeFunc = metadata.getString(ArgumentType.FREE_FUNCTION)
            node.setAttribute("free-function", freeFunc)
        }
    }

    private fun applyIgnore(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.IGNORE)) {
            val ignore = metadata.getBool(ArgumentType.IGNORE)
            setBooleanAttribute(node, "gtk-kn-ignore", ignore)
        }
    }

    private fun applyInstanceIdx(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.INSTANCE_IDX)) {
            val instanceIdx = metadata.getInteger(ArgumentType.INSTANCE_IDX)
            node.setAttribute("instance-idx", instanceIdx.toString())
        }
    }

    private fun applyIntrospectable(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.INTROSPECTABLE)) {
            val introspectable = metadata.getBool(ArgumentType.INTROSPECTABLE)
            setBooleanAttribute(node, "introspectable", introspectable)
        }
    }

    private fun applyName(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.NAME)) {
            val pattern = metadata.getString(ArgumentType.NAME)
            val nameAttr = node.attributes?.getNamedItem("name")
            if (pattern != null && nameAttr != null) {
                val originalName = nameAttr.nodeValue
                val newName = replaceNameWithPattern(originalName, pattern)
                nameAttr.nodeValue = newName
            }
        }
    }

    private fun applyNoAccessorMethod(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.NO_ACCESSOR_METHOD)) {
            val noAccessorMethod = metadata.getBool(ArgumentType.NO_ACCESSOR_METHOD)
            setBooleanAttribute(node, "gtk-kn-no-accessor-method", noAccessorMethod)
        }
    }

    private fun applyNoStringConversion(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.NO_STRING_CONVERSION)) {
            val noAccessorMethod = metadata.getBool(ArgumentType.NO_STRING_CONVERSION)
            setBooleanAttribute(node, "gtk-kn-no-string-conversion", noAccessorMethod)
        }
    }

    private fun applyNullable(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.NULLABLE)) {
            val nullable = metadata.getBool(ArgumentType.NULLABLE)
            if (tag == "parameter") {
                setBooleanAttribute(node, "nullable", nullable)
            } else {
                val returnValueNode = getChildNode(node, "return-value")
                returnValueNode?.let { setBooleanAttribute(it, "nullable", nullable) }
            }
        }
    }

    private fun applyOut(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.OUT)) {
            val isOut = metadata.getBool(ArgumentType.OUT)
            node.setAttribute("direction", if (isOut) "out" else "in")
        }
    }

    private fun applyOwned(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.OWNED)) {
            if (tag == "parameter") {
                node.setAttribute("transfer-ownership", "full")
            } else {
                val returnValueNode = getChildNode(node, "return-value")
                returnValueNode?.setAttribute("transfer-ownership", "full")
            }
        }
    }

    private fun applyParent(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.PARENT)) {
            val path = metadata.getString(ArgumentType.PARENT)
            if (path != null) {
                val location = findGirNode(path)
                val parentNode = node.parentNode
                parentNode?.removeChild(node)
                location.appendChild(node)
            }
        }
    }

    private fun applyRef(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.REF)) {
            val isRef = metadata.getBool(ArgumentType.REF)
            node.setAttribute("direction", if (isRef) "inout" else "in")
        }
    }

    private fun applyRefFunction(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.REF_FUNCTION)) {
            val refFunc = metadata.getString(ArgumentType.REF_FUNCTION)
            node.setAttribute("glib:ref-func", refFunc)
        }
    }

    private fun applyRefSinkFunction(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.REF_SINK_FUNCTION)) {
            val refSinkFunc = metadata.getString(ArgumentType.REF_SINK_FUNCTION)
            node.setAttribute("gtk-kn-ref-sink-function", refSinkFunc)
        }
    }

    private fun applyReinterpret(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.REINTERPRET)) {
            val isReinterpret = metadata.getBool(ArgumentType.REINTERPRET)
            if (tag == "parameter") {
                setBooleanAttribute(node, "gtk-kn-reinterpret", isReinterpret)
            } else {
                val returnValueNode = getChildNode(node, "return-value")
                returnValueNode?.let { setBooleanAttribute(it, "gtk-kn-reinterpret", isReinterpret) }
            }
        }
    }

    private fun applyReplacement(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.REPLACEMENT)) {
            val replacement = metadata.getString(ArgumentType.REPLACEMENT)
            node.setAttribute("moved-to", replacement)
        }
    }

    private fun applyReturnsModifiedPointer(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.RETURNS_MODIFIED_POINTER)) {
            val retModPointer = metadata.getBool(ArgumentType.RETURNS_MODIFIED_POINTER)
            setBooleanAttribute(node, "gtk-kn-returns-modified-pointer", retModPointer)
        }
    }

    private fun applyScope(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.SCOPE)) {
            val scopeValue = metadata.getString(ArgumentType.SCOPE)
            node.setAttribute("scope", scopeValue)
        }
    }

    private fun applySealed(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.SEALED)) {
            val isSealed = metadata.getBool(ArgumentType.SEALED)
            setBooleanAttribute(node, "final", isSealed)
        }
    }

    private fun applySince(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.SINCE)) {
            val sinceVersion = metadata.getString(ArgumentType.SINCE)
            node.setAttribute("version", sinceVersion)
        }
    }

    private fun applyShadows(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.SHADOWS)) {
            val shadows = metadata.getString(ArgumentType.SHADOWS)
            node.setAttribute("shadows", shadows)
        }
    }

    private fun applyThrows(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.THROWS)) {
            val throwsValue = metadata.getBool(ArgumentType.THROWS)
            setBooleanAttribute(node, "throws", throwsValue)
        }
    }

    private fun applyTypeCType(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.TYPE_CTYPE)) {
            val typeCType = metadata.getString(ArgumentType.TYPE_CTYPE)
            val typeNode = if (tag == "method") {
                getChildNode(node, "return-value")?.let { getChildNode(it, "type") }
            } else {
                getChildNode(node, "type")
            }
            typeNode?.setAttribute("c:type", typeCType)
        }
    }

    private fun applyTypeId(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.TYPE_ID)) {
            val typeId = metadata.getString(ArgumentType.TYPE_ID)
            node.setAttribute("glib:get-type", typeId)
        }
    }

    private fun applyTypeName(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.TYPE_NAME)) {
            val typeName = metadata.getString(ArgumentType.TYPE_NAME)
            val typeNode = if (tag == "method") {
                getChildNode(node, "return-value")?.let { getChildNode(it, "type") }
            } else {
                getChildNode(node, "type")
            }
            typeNode?.setAttribute("name", typeName)
        }
    }

    private fun applyUnowned(node: Node, tag: String, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.UNOWNED)) {
            if (tag == "parameter") {
                node.setAttribute("transfer-ownership", "none")
            } else {
                val returnValueNode = getChildNode(node, "return-value")
                returnValueNode?.setAttribute("transfer-ownership", "none")
            }
        }
    }

    private fun applyUnrefFunction(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.UNREF_FUNCTION)) {
            val unrefFunc = metadata.getString(ArgumentType.UNREF_FUNCTION)
            node.setAttribute("glib:unref-func", unrefFunc)
        }
    }

    private fun applyVirtual(node: Node, metadata: Metadata) {
        if (metadata.hasArgument(ArgumentType.VIRTUAL)) {
            val isVirtual = metadata.getBool(ArgumentType.VIRTUAL)
            setBooleanAttribute(node, "gtk-kn-virtual", isVirtual)
        }
    }

    /**
     * Sets a boolean attribute on an XML node.
     *
     * If the attribute exists, its value is updated. If it doesn't exist, a new attribute is created.
     *
     * @param node The XML node to modify.
     * @param attributeName The name of the attribute to set.
     * @param value The boolean value to set.
     */
    private fun setBooleanAttribute(node: Node, attributeName: String, value: Boolean) {
        val attr = node.attributes?.getNamedItem(attributeName)
        if (attr != null) {
            attr.nodeValue = value.toString()
        } else {
            val attrNode = node.ownerDocument.createAttribute(attributeName)
            attrNode.value = value.toString()
            node.attributes.setNamedItem(attrNode)
        }
    }

    /**
     * Retrieves metadata for the current node based on its name and tag.
     *
     * @param name The name attribute of the node (may be null).
     * @param tag The tag name of the node.
     * @return The matched metadata or an empty metadata object if no match is found.
     */
    private fun getCurrentMetadata(name: String?, tag: String): Metadata {
        val selector = tag.replace("glib:", "")

        // Assign a default name for transparent unions
        var adjustedName = name
        if (selector == "union" && name == null) {
            adjustedName = "union"
        }

        if (adjustedName == null) {
            return Metadata.empty
        }

        val childSelector = selector.replace("-", "_")
        val childName = adjustedName.replace("-", "_")

        // Match metadata or return an empty object
        return peekMetadata().matchChild(childName, childSelector) ?: Metadata.empty
    }

    /**
     * Retrieves the first child node of a given name.
     *
     * @param node The parent XML node.
     * @param nodeName The name of the child node to find.
     * @return The first matching child node, or null if no match is found.
     */
    fun getChildNode(node: Node, nodeName: String): Node? {
        val childNodes = node.childNodes
        for (i in 0 until childNodes.length) {
            val child = childNodes.item(i)
            if (child.nodeType == Node.ELEMENT_NODE && child.nodeName == nodeName) {
                return child
            }
        }
        return null
    }

    private fun hasChildNode(node: Node, nodeName: String): Boolean = getChildNode(node, nodeName) != null

    /**
     * Retrieves all child nodes of a given name.
     *
     * @param node The parent XML node.
     * @param nodeName The name of the child nodes to find.
     * @return A list of matching child nodes.
     */
    fun getChildNodesByName(node: Node, nodeName: String): List<Node> {
        val nodes = mutableListOf<Node>()
        val childNodes = node.childNodes
        for (i in 0 until childNodes.length) {
            val child = childNodes.item(i)
            if (child.nodeType == Node.ELEMENT_NODE && child.nodeName == nodeName) {
                nodes.add(child)
            }
        }
        return nodes
    }

    /**
     * Replaces the `name` based on a given `pattern`, which can include regex syntax.
     *
     * This method supports:
     * - Direct replacement when the pattern contains neither `/` nor `(`.
     * - Regex replacement without a specified replacement string (defaults to capturing group `$1`) when the
     *   pattern contains `(` but not `/`.
     * - Regex replacement with a specified replacement string when the pattern contains `/`.
     *
     * @param name The original name of the node.
     * @param pattern The replacement pattern, which can be:
     *   - A direct replacement string (no `/` or `(`), e.g., `"new_method"`.
     *   - A regex pattern without a replacement (contains `(` but no `/`), e.g., `"new_(.+)"`.
     *   - A regex pattern with a replacement (contains `/`), e.g., `"-/_"` or `"(old)_(method)/new_$1"`.
     *
     * @return The transformed name. If the pattern cannot be applied (e.g., regex fails),
     *         the original pattern string is returned.
     */
    private fun replaceNameWithPattern(name: String, pattern: String): String {
        if (!pattern.contains("/") && !pattern.contains("(")) {
            // No '/' or '(' detected, replace the name directly with the pattern
            return pattern
        } else {
            try {
                // Split the pattern into regex and replacement parts
                val split = pattern.split("/", limit = 2)
                val patternPart = split[0]  // The regex pattern
                val replacement = if (split.size > 1) split[1] else "$1"  // Default to capturing the first group

                // Create a regex object from the pattern
                val regex = Regex(patternPart)

                // Replace occurrences of the pattern in the name
                return regex.replace(name, replacement)
            } catch (@Suppress("TooGenericExceptionCaught") e: Exception) {
                // If regex processing fails (invalid regex, etc.), return the original pattern
                return pattern
            }
        }
    }

    /**
     * Finds a node within the XML document based on a hierarchical path.
     *
     * This method navigates through the XML tree, descending into child nodes by their names.
     * If a node does not exist for a given name, an error is thrown.
     *
     * @param path A dot-separated string representing the hierarchy of nodes to traverse.
     *             For example: `"namespace.ClassName.method"`.
     * @return The deepest node in the specified path.
     * @throws IllegalStateException If a node in the path is not found.
     *
     */
    private fun findGirNode(path: String): Node {
        var currentNode: Node = document.documentElement
        val names = path.split(".")  // Split the path into components
        for (name in names) {
            // Try to move to the child node with the given name
            val childNode = moveDownGirTree(currentNode, name)
            currentNode = childNode ?: error("The node ${currentNode.nodeName} does not have a child with name $name")
        }
        return currentNode
    }

    /**
     * Attempts to find a child node of the current node with the specified name.
     *
     * This method iterates through the child nodes of `currentNode` and checks if
     * any match the given `name`. Only nodes of specific relevant types are considered.
     *
     * @param currentNode The node whose children are being searched.
     * @param name The name of the child node to find.
     * @return The matching child node if found, or `null` if no such node exists.
     */
    private fun moveDownGirTree(currentNode: Node, name: String): Node? {
        val children = currentNode.childNodes
        for (i in 0 until children.length) {
            val child = children.item(i)
            // Check if the child node is an element, has a relevant type, and matches the given name
            if (child.nodeType == Node.ELEMENT_NODE &&
                child.nodeName in relevantTypes &&
                child.attributes?.getNamedItem("name")?.nodeValue == name
            ) {
                return child
            }
        }
        // Return null if no matching child node is found
        return null
    }
}
