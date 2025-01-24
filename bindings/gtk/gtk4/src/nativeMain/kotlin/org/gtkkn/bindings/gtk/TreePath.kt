// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreePath
import org.gtkkn.native.gtk.gtk_tree_path_append_index
import org.gtkkn.native.gtk.gtk_tree_path_compare
import org.gtkkn.native.gtk.gtk_tree_path_copy
import org.gtkkn.native.gtk.gtk_tree_path_down
import org.gtkkn.native.gtk.gtk_tree_path_free
import org.gtkkn.native.gtk.gtk_tree_path_get_depth
import org.gtkkn.native.gtk.gtk_tree_path_get_type
import org.gtkkn.native.gtk.gtk_tree_path_is_ancestor
import org.gtkkn.native.gtk.gtk_tree_path_is_descendant
import org.gtkkn.native.gtk.gtk_tree_path_new
import org.gtkkn.native.gtk.gtk_tree_path_new_first
import org.gtkkn.native.gtk.gtk_tree_path_new_from_string
import org.gtkkn.native.gtk.gtk_tree_path_next
import org.gtkkn.native.gtk.gtk_tree_path_prepend_index
import org.gtkkn.native.gtk.gtk_tree_path_prev
import org.gtkkn.native.gtk.gtk_tree_path_to_string
import org.gtkkn.native.gtk.gtk_tree_path_up
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * An opaque structure representing a path to a row in a model.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `depth`: depth: Out parameter is not supported
 * - parameter `indices`: Array parameter of type gint is not supported
 */
public class TreePath(public val gtkTreePathPointer: CPointer<GtkTreePath>) : ProxyInstance(gtkTreePathPointer) {
    /**
     * Appends a new index to a path.
     *
     * As a result, the depth of the path is increased.
     *
     * @param index the index
     */
    public fun appendIndex(index: gint): Unit = gtk_tree_path_append_index(gtkTreePathPointer, index)

    /**
     * Compares two paths.
     *
     * If @a appears before @b in a tree, then -1 is returned.
     * If @b appears before @a, then 1 is returned.
     * If the two nodes are equal, then 0 is returned.
     *
     * @param b a `GtkTreePath` to compare with
     * @return the relative positions of @a and @b
     */
    public fun compare(b: TreePath): gint = gtk_tree_path_compare(gtkTreePathPointer, b.gtkTreePathPointer)

    /**
     * Creates a new `GtkTreePath` as a copy of @path.
     *
     * @return a new `GtkTreePath`
     */
    public fun copy(): TreePath = gtk_tree_path_copy(gtkTreePathPointer)!!.run {
        TreePath(this)
    }

    /**
     * Moves @path to point to the first child of the current path.
     */
    public fun down(): Unit = gtk_tree_path_down(gtkTreePathPointer)

    /**
     * Frees @path. If @path is null, it simply returns.
     */
    public fun free(): Unit = gtk_tree_path_free(gtkTreePathPointer)

    /**
     * Returns the current depth of @path.
     *
     * @return The depth of @path
     */
    public fun getDepth(): gint = gtk_tree_path_get_depth(gtkTreePathPointer)

    /**
     * Returns true if @descendant is a descendant of @path.
     *
     * @param descendant another `GtkTreePath`
     * @return true if @descendant is contained inside @path
     */
    public fun isAncestor(descendant: TreePath): Boolean =
        gtk_tree_path_is_ancestor(gtkTreePathPointer, descendant.gtkTreePathPointer).asBoolean()

    /**
     * Returns true if @path is a descendant of @ancestor.
     *
     * @param ancestor another `GtkTreePath`
     * @return true if @ancestor contains @path somewhere below it
     */
    public fun isDescendant(ancestor: TreePath): Boolean =
        gtk_tree_path_is_descendant(gtkTreePathPointer, ancestor.gtkTreePathPointer).asBoolean()

    /**
     * Moves the @path to point to the next node at the current depth.
     */
    public fun next(): Unit = gtk_tree_path_next(gtkTreePathPointer)

    /**
     * Prepends a new index to a path.
     *
     * As a result, the depth of the path is increased.
     *
     * @param index the index
     */
    public fun prependIndex(index: gint): Unit = gtk_tree_path_prepend_index(gtkTreePathPointer, index)

    /**
     * Moves the @path to point to the previous node at the
     * current depth, if it exists.
     *
     * @return true if @path has a previous node, and
     *   the move was made
     */
    public fun prev(): Boolean = gtk_tree_path_prev(gtkTreePathPointer).asBoolean()

    /**
     * Generates a string representation of the path.
     *
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string. If the path has
     * depth 0, null is returned.
     *
     * @return A newly-allocated string
     */
    public fun toStringTreePath(): String? = gtk_tree_path_to_string(gtkTreePathPointer)?.toKString()

    /**
     * Moves the @path to point to its parent node, if it has a parent.
     *
     * @return true if @path has a parent, and the move was made
     */
    public fun up(): Boolean = gtk_tree_path_up(gtkTreePathPointer).asBoolean()

    public companion object {
        /**
         * Creates a new `GtkTreePath`
         * This refers to a row.
         *
         * @return A newly created `GtkTreePath`.
         */
        public fun new(): TreePath = TreePath(gtk_tree_path_new()!!)

        /**
         * Creates a new `GtkTreePath`.
         *
         * The string representation of this path is “0”.
         *
         * @return A new `GtkTreePath`
         */
        public fun newFirst(): TreePath = TreePath(gtk_tree_path_new_first()!!)

        /**
         * Creates a new `GtkTreePath` initialized to @path.
         *
         * @path is expected to be a colon separated list of numbers.
         * For example, the string “10:4:0” would create a path of depth
         * 3 pointing to the 11th child of the root node, the 5th
         * child of that 11th child, and the 1st child of that 5th child.
         * If an invalid path string is passed in, null is returned.
         *
         * @param path The string representation of a path
         * @return A newly-created `GtkTreePath`
         */
        public fun newFromString(path: String): TreePath? =
            TreePath(gtk_tree_path_new_from_string(path)!!.reinterpret())

        /**
         * Get the GType of TreePath
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_path_get_type()
    }
}
