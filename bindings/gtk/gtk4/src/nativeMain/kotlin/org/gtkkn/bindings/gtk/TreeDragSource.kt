// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeDragSource
import org.gtkkn.native.gtk.gtk_tree_drag_source_drag_data_delete
import org.gtkkn.native.gtk.gtk_tree_drag_source_drag_data_get
import org.gtkkn.native.gtk.gtk_tree_drag_source_get_type
import org.gtkkn.native.gtk.gtk_tree_drag_source_row_draggable
import kotlin.Boolean

/**
 * Interface for Drag-and-Drop destinations in `GtkTreeView`.
 */
public interface TreeDragSource :
    Proxy,
    KGTyped {
    public val gtkTreeDragSourcePointer: CPointer<GtkTreeDragSource>

    /**
     * Asks the `GtkTreeDragSource` to delete the row at @path, because
     * it was moved somewhere else via drag-and-drop. Returns false
     * if the deletion fails because @path no longer exists, or for
     * some model-specific reason. Should robustly handle a @path no
     * longer found in the model!
     *
     * @param path row that was being dragged
     * @return true if the row was successfully deleted
     */
    public fun dragDataDelete(path: TreePath): Boolean =
        gtk_tree_drag_source_drag_data_delete(gtkTreeDragSourcePointer, path.gtkTreePathPointer).asBoolean()

    /**
     * Asks the `GtkTreeDragSource` to return a `GdkContentProvider` representing
     * the row at @path. Should robustly handle a @path no
     * longer found in the model!
     *
     * @param path row that was dragged
     * @return a `GdkContentProvider` for the
     *    given @path
     */
    public fun dragDataGet(path: TreePath): ContentProvider? =
        gtk_tree_drag_source_drag_data_get(gtkTreeDragSourcePointer, path.gtkTreePathPointer)?.run {
            ContentProvider(this)
        }

    /**
     * Asks the `GtkTreeDragSource` whether a particular row can be used as
     * the source of a DND operation. If the source doesn’t implement
     * this interface, the row is assumed draggable.
     *
     * @param path row on which user is initiating a drag
     * @return true if the row can be dragged
     */
    public fun rowDraggable(path: TreePath): Boolean =
        gtk_tree_drag_source_row_draggable(gtkTreeDragSourcePointer, path.gtkTreePathPointer).asBoolean()

    /**
     * The TreeDragSourceImpl type represents a native instance of the TreeDragSource interface.
     *
     * @constructor Creates a new instance of TreeDragSource for the provided [CPointer].
     */
    public data class TreeDragSourceImpl(override val gtkTreeDragSourcePointer: CPointer<GtkTreeDragSource>) :
        Object(gtkTreeDragSourcePointer.reinterpret()),
        TreeDragSource

    public companion object : TypeCompanion<TreeDragSource> {
        override val type: GeneratedInterfaceKGType<TreeDragSource> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_tree_drag_source_get_type")!!) {
                TreeDragSourceImpl(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeDragSource
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_drag_source_get_type()
    }
}
