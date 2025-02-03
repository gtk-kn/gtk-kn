// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_TREE_MODEL_ITERS_PERSIST
import org.gtkkn.native.gtk.GTK_TREE_MODEL_LIST_ONLY
import org.gtkkn.native.gtk.GtkTreeModelFlags
import org.gtkkn.native.gtk.gtk_tree_model_flags_get_type

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 * ---
 *
 * These flags indicate various properties of a `GtkTreeModel`.
 *
 * They are returned by [method@Gtk.TreeModel.get_flags], and must be
 * static for the lifetime of the object. A more complete description
 * of %GTK_TREE_MODEL_ITERS_PERSIST can be found in the overview of
 * this section.
 */
public class TreeModelFlags(public val mask: GtkTreeModelFlags) : Bitfield<TreeModelFlags> {
    override infix fun or(other: TreeModelFlags): TreeModelFlags = TreeModelFlags(mask or other.mask)

    public companion object {
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * iterators survive all signals
         *   emitted by the tree
         */
        public val ITERS_PERSIST: TreeModelFlags = TreeModelFlags(GTK_TREE_MODEL_ITERS_PERSIST)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * the model is a list only, and never
         *   has children
         */
        public val LIST_ONLY: TreeModelFlags = TreeModelFlags(GTK_TREE_MODEL_LIST_ONLY)

        /**
         * Get the GType of TreeModelFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_model_flags_get_type()
    }
}
