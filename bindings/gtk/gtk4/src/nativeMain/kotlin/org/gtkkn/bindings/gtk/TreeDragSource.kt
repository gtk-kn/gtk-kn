// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    Interface,
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
        gtk_tree_drag_source_drag_data_delete(
            gtkTreeDragSourcePointer.reinterpret(),
            path.gtkTreePathPointer.reinterpret()
        ).asBoolean()

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
        gtk_tree_drag_source_drag_data_get(
            gtkTreeDragSourcePointer.reinterpret(),
            path.gtkTreePathPointer.reinterpret()
        )?.run {
            ContentProvider(reinterpret())
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
        gtk_tree_drag_source_row_draggable(
            gtkTreeDragSourcePointer.reinterpret(),
            path.gtkTreePathPointer.reinterpret()
        ).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<GtkTreeDragSource>,
    ) : TreeDragSource {
        override val gtkTreeDragSourcePointer: CPointer<GtkTreeDragSource> = pointer
    }

    public companion object : TypeCompanion<TreeDragSource> {
        override val type: GeneratedInterfaceKGType<TreeDragSource> =
            GeneratedInterfaceKGType(gtk_tree_drag_source_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkTreeDragSource>): TreeDragSource = Wrapper(pointer)
    }
}
