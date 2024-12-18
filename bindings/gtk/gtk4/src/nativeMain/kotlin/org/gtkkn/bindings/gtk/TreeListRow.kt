// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkTreeListRow
import org.gtkkn.native.gtk.gtk_tree_list_row_get_child_row
import org.gtkkn.native.gtk.gtk_tree_list_row_get_children
import org.gtkkn.native.gtk.gtk_tree_list_row_get_depth
import org.gtkkn.native.gtk.gtk_tree_list_row_get_expanded
import org.gtkkn.native.gtk.gtk_tree_list_row_get_item
import org.gtkkn.native.gtk.gtk_tree_list_row_get_parent
import org.gtkkn.native.gtk.gtk_tree_list_row_get_position
import org.gtkkn.native.gtk.gtk_tree_list_row_get_type
import org.gtkkn.native.gtk.gtk_tree_list_row_is_expandable
import org.gtkkn.native.gtk.gtk_tree_list_row_set_expanded
import kotlin.Boolean

/**
 * `GtkTreeListRow` is used by `GtkTreeListModel` to represent items.
 *
 * It allows navigating the model as a tree and modify the state of rows.
 *
 * `GtkTreeListRow` instances are created by a `GtkTreeListModel` only
 * when the [property@Gtk.TreeListModel:passthrough] property is not set.
 *
 * There are various support objects that can make use of `GtkTreeListRow`
 * objects, such as the [class@Gtk.TreeExpander] widget that allows displaying
 * an icon to expand or collapse a row or [class@Gtk.TreeListRowSorter] that
 * makes it possible to sort trees properly.
 *
 * ## Skipped during bindings generation
 *
 * - method `expandable`: Property has no getter nor setter
 */
public open class TreeListRow(pointer: CPointer<GtkTreeListRow>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkTreeListRowPointer: CPointer<GtkTreeListRow>
        get() = gPointer.reinterpret()

    /**
     * The model holding the row's children.
     */
    public open val children: ListModel?
        /**
         * If the row is expanded, gets the model holding the children of @self.
         *
         * This model is the model created by the
         * [callback@Gtk.TreeListModelCreateModelFunc]
         * and contains the original items, no matter what value
         * [property@Gtk.TreeListModel:passthrough] is set to.
         *
         * @return The model containing the children
         */
        get() = gtk_tree_list_row_get_children(gtkTreeListRowPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * The depth in the tree of this row.
     */
    public open val depth: guint
        /**
         * Gets the depth of this row.
         *
         * Rows that correspond to items in the root model have a depth
         * of zero, rows corresponding to items of models of direct children
         * of the root model have a depth of 1 and so on.
         *
         * The depth of a row never changes until the row is removed from its model
         * at which point it will forever return 0.
         *
         * @return The depth of this row
         */
        get() = gtk_tree_list_row_get_depth(gtkTreeListRowPointer.reinterpret())

    /**
     * If this row is currently expanded.
     */
    public open var expanded: Boolean
        /**
         * Gets if a row is currently expanded.
         *
         * @return true if the row is expanded
         */
        get() = gtk_tree_list_row_get_expanded(gtkTreeListRowPointer.reinterpret()).asBoolean()

        /**
         * Expands or collapses a row.
         *
         * If a row is expanded, the model of calling the
         * [callback@Gtk.TreeListModelCreateModelFunc] for the row's
         * item will be inserted after this row. If a row is collapsed,
         * those items will be removed from the model.
         *
         * If the row is not expandable, this function does nothing.
         *
         * @param expanded true if the row should be expanded
         */
        set(expanded) = gtk_tree_list_row_set_expanded(gtkTreeListRowPointer.reinterpret(), expanded.asGBoolean())

    /**
     * The item held in this row.
     */
    public open val item: Object?
        /**
         * Gets the item corresponding to this row,
         *
         * @return The item
         *   of this row. This function is only marked as nullable for backwards
         *   compatibility reasons.
         */
        get() = gtk_tree_list_row_get_item(gtkTreeListRowPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * If @self is not expanded or @position is greater than the
     * number of children, null is returned.
     *
     * @param position position of the child to get
     * @return the child in @position
     */
    public open fun getChildRow(position: guint): TreeListRow? =
        gtk_tree_list_row_get_child_row(gtkTreeListRowPointer.reinterpret(), position)?.run {
            TreeListRow(reinterpret())
        }

    /**
     * Gets the row representing the parent for @self.
     *
     * That is the row that would need to be collapsed
     * to make this row disappear.
     *
     * If @self is a row corresponding to the root model,
     * null is returned.
     *
     * The value returned by this function never changes
     * until the row is removed from its model at which point
     * it will forever return null.
     *
     * @return The parent of @self
     */
    public open fun getParent(): TreeListRow? = gtk_tree_list_row_get_parent(gtkTreeListRowPointer.reinterpret())?.run {
        TreeListRow(reinterpret())
    }

    /**
     * Returns the position in the `GtkTreeListModel` that @self occupies
     * at the moment.
     *
     * @return The position in the model
     */
    public open fun getPosition(): guint = gtk_tree_list_row_get_position(gtkTreeListRowPointer.reinterpret())

    /**
     * Checks if a row can be expanded.
     *
     * This does not mean that the row is actually expanded,
     * this can be checked with [method@Gtk.TreeListRow.get_expanded].
     *
     * If a row is expandable never changes until the row is removed
     * from its model at which point it will forever return false.
     *
     * @return true if the row is expandable
     */
    public open fun isExpandable(): Boolean =
        gtk_tree_list_row_is_expandable(gtkTreeListRowPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<TreeListRow> {
        override val type: GeneratedClassKGType<TreeListRow> =
            GeneratedClassKGType(gtk_tree_list_row_get_type()) { TreeListRow(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeListRow
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_list_row_get_type()
    }
}
