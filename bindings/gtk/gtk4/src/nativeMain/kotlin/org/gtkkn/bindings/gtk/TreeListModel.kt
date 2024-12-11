// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkTreeListModel
import org.gtkkn.native.gtk.gtk_tree_list_model_get_autoexpand
import org.gtkkn.native.gtk.gtk_tree_list_model_get_child_row
import org.gtkkn.native.gtk.gtk_tree_list_model_get_model
import org.gtkkn.native.gtk.gtk_tree_list_model_get_passthrough
import org.gtkkn.native.gtk.gtk_tree_list_model_get_row
import org.gtkkn.native.gtk.gtk_tree_list_model_get_type
import org.gtkkn.native.gtk.gtk_tree_list_model_new
import org.gtkkn.native.gtk.gtk_tree_list_model_set_autoexpand
import kotlin.Boolean

/**
 * `GtkTreeListModel` is a list model that can create child models on demand.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class TreeListModel(pointer: CPointer<GtkTreeListModel>) :
    Object(pointer.reinterpret()),
    ListModel,
    KGTyped {
    public val gtkTreeListModelPointer: CPointer<GtkTreeListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    /**
     * If all rows should be expanded by default.
     */
    public open var autoexpand: Boolean
        /**
         * Gets whether the model is set to automatically expand new rows
         * that get added.
         *
         * This can be either rows added by changes to the underlying
         * models or via [method@Gtk.TreeListRow.set_expanded].
         *
         * @return true if the model is set to autoexpand
         */
        get() = gtk_tree_list_model_get_autoexpand(gtkTreeListModelPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the model should autoexpand.
         *
         * If set to true, the model will recursively expand all rows that
         * get added to the model. This can be either rows added by changes
         * to the underlying models or via [method@Gtk.TreeListRow.set_expanded].
         *
         * @param autoexpand true to make the model autoexpand its rows
         */
        set(
            autoexpand
        ) = gtk_tree_list_model_set_autoexpand(gtkTreeListModelPointer.reinterpret(), autoexpand.asGBoolean())

    /**
     * The root model displayed.
     */
    public open val model: ListModel
        /**
         * Gets the root model that @self was created with.
         *
         * @return the root model
         */
        get() = gtk_tree_list_model_get_model(gtkTreeListModelPointer.reinterpret())!!.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Gets whether the model is in passthrough mode.
     *
     * If false, the `GListModel` functions for this object return custom
     * [class@Gtk.TreeListRow] objects. If true, the values of the child
     * models are pass through unmodified.
     */
    public open val passthrough: Boolean
        /**
         * Gets whether the model is passing through original row items.
         *
         * If this function returns false, the `GListModel` functions for @self
         * return custom `GtkTreeListRow` objects. You need to call
         * [method@Gtk.TreeListRow.get_item] on these objects to get the original
         * item.
         *
         * If true, the values of the child models are passed through in their
         * original state. You then need to call [method@Gtk.TreeListModel.get_row]
         * to get the custom `GtkTreeListRow`s.
         *
         * @return true if the model is passing through original row items
         */
        get() = gtk_tree_list_model_get_passthrough(gtkTreeListModelPointer.reinterpret()).asBoolean()

    /**
     * Creates a new empty `GtkTreeListModel` displaying @root
     * with all rows collapsed.
     *
     * @param root The `GListModel` to use as root
     * @param passthrough true to pass through items from the models
     * @param autoexpand true to set the autoexpand property and expand the @root model
     * @param createFunc Function to call to create the `GListModel` for the children
     *   of an item
     * @return a newly created `GtkTreeListModel`.
     */
    public constructor(
        root: ListModel,
        passthrough: Boolean,
        autoexpand: Boolean,
        createFunc: TreeListModelCreateModelFunc,
    ) : this(
        gtk_tree_list_model_new(
            root.gioListModelPointer,
            passthrough.asGBoolean(),
            autoexpand.asGBoolean(),
            TreeListModelCreateModelFuncFunc.reinterpret(),
            StableRef.create(createFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets the row item corresponding to the child at index @position for
     * @self's root model.
     *
     * If @position is greater than the number of children in the root model,
     * null is returned.
     *
     * Do not confuse this function with [method@Gtk.TreeListModel.get_row].
     *
     * @param position position of the child to get
     * @return the child in @position
     */
    public open fun getChildRow(position: guint): TreeListRow? =
        gtk_tree_list_model_get_child_row(gtkTreeListModelPointer.reinterpret(), position)?.run {
            TreeListRow(reinterpret())
        }

    /**
     * Gets the row object for the given row.
     *
     * If @position is greater than the number of items in @self,
     * null is returned.
     *
     * The row object can be used to expand and collapse rows as
     * well as to inspect its position in the tree. See its
     * documentation for details.
     *
     * This row object is persistent and will refer to the current
     * item as long as the row is present in @self, independent of
     * other rows being added or removed.
     *
     * If @self is set to not be passthrough, this function is
     * equivalent to calling g_list_model_get_item().
     *
     * Do not confuse this function with [method@Gtk.TreeListModel.get_child_row].
     *
     * @param position the position of the row to fetch
     * @return The row item
     */
    public open fun getRow(position: guint): TreeListRow? =
        gtk_tree_list_model_get_row(gtkTreeListModelPointer.reinterpret(), position)?.run {
            TreeListRow(reinterpret())
        }

    public companion object : TypeCompanion<TreeListModel> {
        override val type: GeneratedClassKGType<TreeListModel> =
            GeneratedClassKGType(gtk_tree_list_model_get_type()) { TreeListModel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeListModel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_list_model_get_type()
    }
}
