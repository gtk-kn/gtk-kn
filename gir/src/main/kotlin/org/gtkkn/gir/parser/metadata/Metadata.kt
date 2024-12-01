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

// https://gnome.pages.gitlab.gnome.org/vala/manual/gir-metadata-format.html

package org.gtkkn.gir.parser.metadata

import java.util.Locale

/**
 * Represents a metadata node for pattern matching, argument handling, and hierarchical relationships.
 *
 * This class supports storing arguments, matching patterns, managing child metadata nodes,
 * and retrieving argument values in various forms. It is designed to work with hierarchical
 * metadata structures and supports pattern matching with optional selectors.
 *
 * @property pattern The pattern associated with this metadata node.
 * @property selector The optional selector associated with this metadata node.
 * @property sourceReference The source reference that points to the location in the original source where this
 *                           metadata is defined.
 */
open class Metadata(
    val pattern: String,
    val selector: String? = null,
    val sourceReference: SourceReference? = null
) {
    /** Precomputed specification for matching patterns against strings. */
    val patternSpec: PatternSpec = PatternSpec(pattern)

    /** Indicates whether this metadata has been matched or used. */
    var used: Boolean = false

    /** Stores the arguments associated with this metadata node. */
    val args: MutableMap<ArgumentType, Argument> = mutableMapOf()

    /** Stores the child metadata nodes. */
    val children: MutableList<Metadata> = mutableListOf()

    /**
     * Produces a string representation of the metadata and its hierarchy.
     *
     * The output can be customized to either show all metadata or focus only on unused metadata.
     * When focusing on unused metadata (`onlyUnused = true`), the method ensures that parents
     * are included if any of their arguments or descendants are unused, even if the parent itself is marked as used.
     *
     * @param indent The indentation level for the string representation. Defaults to 0.
     * @param onlyUnused If `true`, only unused metadata and its hierarchy are included in the output.
     *                   Defaults to `false`, showing all metadata.
     * @return A formatted string representation of this metadata.
     */
    fun toString(indent: Int = 0, onlyUnused: Boolean = false): String {
        // Helper function to determine if the node or any of its descendants have unused content
        fun hasUnusedContent(metadata: Metadata): Boolean {
            val hasUnusedArguments = metadata.args.values.any { !it.used }
            val hasUnusedChildren = metadata.children.any { hasUnusedContent(it) }
            return !metadata.used || hasUnusedArguments || hasUnusedChildren
        }

        val hasUnusedContent = hasUnusedContent(this)
        val shouldInclude = if (onlyUnused) hasUnusedContent else true

        if (!shouldInclude) {
            return ""
        }

        val builder = StringBuilder()

        // If the pattern is empty, skip printing the root element and process its children as root elements
        if (pattern.isEmpty()) {
            val childrenToShow = if (onlyUnused) {
                children.filter { hasUnusedContent(it) }
            } else {
                children
            }
            for (child in childrenToShow) {
                builder.append(child.toString(0, onlyUnused)) // Reset indentation to 0 for root-level children
            }
            return builder.toString()
        }

        // Add indentation
        if (indent > 0) {
            builder.append(" ".repeat(indent))
        }

        // Add dot prefix for child elements
        if (indent > 0) {
            // Add a dot in front of every child
            builder.append(".")
        }

        // Append pattern
        builder.append(pattern)

        // Append selector if not null
        if (selector != null) {
            builder.append("#").append(selector)
        }

        // Build arguments string with values
        val argsToShow = if (onlyUnused) {
            args.filter { (_, arg) -> !arg.used }
        } else {
            args
        }

        val argsString = argsToShow.entries.joinToString(" ") { (key, arg) ->
            val argName = key.name.replace("_", "-").lowercase(Locale.ROOT)
            val argValue = arg.expression.toString()
            "$argName=$argValue"
        }
        if (argsString.isNotEmpty()) builder.append(" ").append(argsString)

        builder.append("\n")

        // Filter children to display
        val childrenToShow = if (onlyUnused) {
            children.filter { hasUnusedContent(it) }
        } else {
            children
        }

        // Iterate over children and add them to the builder
        for ((index, child) in childrenToShow.withIndex()) {
            if (index > 0) builder.append("\n") // Ensure newline before each child
            builder.append(child.toString(indent + 2, onlyUnused))
        }

        return builder.toString().trimEnd()
    }

    override fun toString(): String = toString(0)

    fun getUnusedRules(): String = toString(0, onlyUnused = true)

    /**
     * Adds a child metadata node.
     *
     * @param metadata The metadata node to add as a child.
     */
    fun addChild(metadata: Metadata) {
        children.add(metadata)
    }

    /**
     * Matches a child metadata node based on a given name and optional selector.
     *
     * This function attempts to find child metadata nodes that match the provided `name` and,
     * optionally, a `selector`. The matching is performed using the child node's `patternSpec`
     * and its selector.
     *
     * - If no children match, the `null` metadata object is returned.
     * - If exactly one child matches, that child is returned.
     * - If multiple children match, a [MetadataSet] containing all matching children is returned.
     *
     * The `used` property of all matching children is set to `true`.
     *
     * @param name The name to match against the patterns of the children.
     * @param selector The optional selector to match against the children.
     * @return A matching [Metadata] node, a [MetadataSet] if multiple matches are found, or `null`
     *         if no match is found.
     */
    open fun matchChild(name: String, selector: String? = null): Metadata? {
        // Find all matching children
        val matchingChildren: List<Metadata> = children.filter { metadata ->
            (selector == null || metadata.selector == null || metadata.selector == selector) &&
                metadata.patternSpec.matchString(name)
        }

        // Mark all matching children as used
        matchingChildren.forEach { it.used = true }

        return when (matchingChildren.size) {
            0 -> null
            1 -> matchingChildren.first()
            else -> {
                val metadataSet = MetadataSet(selector)
                matchingChildren.forEach { metadataSet.addSibling(it) }
                metadataSet
            }
        }
    }

    /**
     * Adds an argument to the metadata.
     *
     * If the argument key already exists, its value will be replaced.
     *
     * @param key The type of the argument.
     * @param value The argument to add.
     */
    fun addArgument(key: ArgumentType, value: Argument) {
        args[key] = value
    }

    /**
     * Checks whether the metadata contains a specific argument.
     *
     * @param key The type of the argument to check for.
     * @return `true` if the argument exists, `false` otherwise.
     */
    fun hasArgument(key: ArgumentType): Boolean = key in args

    /**
     * Retrieves the expression associated with an argument.
     *
     * Marks the argument as `used` if it exists.
     *
     * @param arg The type of the argument to retrieve.
     * @return The [Expression] of the argument, or `null` if not found.
     */
    fun getExpression(arg: ArgumentType): Expression? =
        args[arg]?.apply { used = true }?.expression

    /**
     * Retrieves the string value of an argument, if available.
     *
     * @param arg The type of the argument to retrieve.
     * @return The string value of the argument, or `null` if not a string or not found.
     */
    fun getString(arg: ArgumentType): String? =
        (getExpression(arg) as? StringLiteral)?.eval()

    /**
     * Retrieves the integer value of an argument.
     *
     * Supports unary negative values and defaults to `0` if not found or not an integer.
     *
     * @param arg The type of the argument to retrieve.
     * @return The integer value of the argument, or `0` if not found or invalid.
     */
    fun getInteger(arg: ArgumentType): Int = when (val expr = getExpression(arg)) {
        is UnaryExpression -> if (expr.operator == UnaryOperator.MINUS) {
            (expr.inner as? IntegerLiteral)?.value?.toInt()?.unaryMinus()
        } else {
            null
        }

        is IntegerLiteral -> expr.value.toInt()
        else -> null
    } ?: 0

    /**
     * Retrieves the boolean value of an argument.
     *
     * Defaults to `defaultValue` if the argument is not found or not a boolean.
     *
     * @param arg The type of the argument to retrieve.
     * @param defaultValue The default value to return if the argument is not found.
     * @return The boolean value of the argument, or `defaultValue` if not found or invalid.
     */
    fun getBool(arg: ArgumentType, defaultValue: Boolean = false): Boolean =
        (getExpression(arg) as? BooleanLiteral)?.value ?: defaultValue

    /**
     * Retrieves the source reference of an argument.
     *
     * @param arg The type of the argument to retrieve.
     * @return The [SourceReference] of the argument, or `null` if not found.
     */
    fun getSourceReference(arg: ArgumentType): SourceReference? =
        args[arg]?.sourceReference

    companion object {
        /**
         * A singleton instance representing an empty metadata object.
         */
        val empty: Metadata by lazy { Metadata("") }
    }
}
