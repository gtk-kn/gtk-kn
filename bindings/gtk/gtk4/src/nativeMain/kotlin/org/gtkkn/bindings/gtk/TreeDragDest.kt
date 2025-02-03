// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeDragDest
import org.gtkkn.native.gtk.gtk_tree_drag_dest_drag_data_received
import org.gtkkn.native.gtk.gtk_tree_drag_dest_get_type
import org.gtkkn.native.gtk.gtk_tree_drag_dest_row_drop_possible
import kotlin.Boolean

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * List views use widgets to display their contents.
 *   You can use [class@Gtk.DropTarget] to implement a drop destination
 * ---
 *
 * Interface for Drag-and-Drop destinations in `GtkTreeView`.
 */
public interface TreeDragDest :
    Proxy,
    KGTyped {
    public val gtkTreeDragDestPointer: CPointer<GtkTreeDragDest>

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use list models instead
     * ---
     *
     * Asks the `GtkTreeDragDest` to insert a row before the path @dest,
     * deriving the contents of the row from @value. If @dest is
     * outside the tree so that inserting before it is impossible, false
     * will be returned. Also, false may be returned if the new row is
     * not created for some model-specific reason.  Should robustly handle
     * a @dest no longer found in the model!
     *
     * @param dest row to drop in front of
     * @param value data to drop
     * @return whether a new row was created before position @dest
     */
    public fun dragDataReceived(dest: TreePath, `value`: Value): Boolean = gtk_tree_drag_dest_drag_data_received(
        gtkTreeDragDestPointer,
        dest.gtkTreePathPointer,
        `value`.gobjectValuePointer
    ).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use list models instead
     * ---
     *
     * Determines whether a drop is possible before the given @dest_path,
     * at the same depth as @dest_path. i.e., can we drop the data in
     * @value at that location. @dest_path does not have to
     * exist; the return value will almost certainly be false if the
     * parent of @dest_path doesn’t exist, though.
     *
     * @param destPath destination row
     * @param value the data being dropped
     * @return true if a drop is possible before @dest_path
     */
    public fun rowDropPossible(destPath: TreePath, `value`: Value): Boolean = gtk_tree_drag_dest_row_drop_possible(
        gtkTreeDragDestPointer,
        destPath.gtkTreePathPointer,
        `value`.gobjectValuePointer
    ).asBoolean()

    /**
     * The TreeDragDestImpl type represents a native instance of the TreeDragDest interface.
     *
     * @constructor Creates a new instance of TreeDragDest for the provided [CPointer].
     */
    public class TreeDragDestImpl(gtkTreeDragDestPointer: CPointer<GtkTreeDragDest>) :
        Object(gtkTreeDragDestPointer.reinterpret()),
        TreeDragDest {
        init {
            Gtk
        }

        override val gtkTreeDragDestPointer: CPointer<GtkTreeDragDest> = gtkTreeDragDestPointer
    }

    public companion object : TypeCompanion<TreeDragDest> {
        override val type: GeneratedInterfaceKGType<TreeDragDest> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { TreeDragDestImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeDragDest
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_drag_dest_get_type()

        /**
         * Gets the GType of from the symbol `gtk_tree_drag_dest_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_tree_drag_dest_get_type")
    }
}
