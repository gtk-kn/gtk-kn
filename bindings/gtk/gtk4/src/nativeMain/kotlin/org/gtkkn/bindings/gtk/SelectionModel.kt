// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkSelectionModel
import org.gtkkn.native.gtk.gtk_selection_model_get_selection
import org.gtkkn.native.gtk.gtk_selection_model_get_selection_in_range
import org.gtkkn.native.gtk.gtk_selection_model_get_type
import org.gtkkn.native.gtk.gtk_selection_model_is_selected
import org.gtkkn.native.gtk.gtk_selection_model_select_all
import org.gtkkn.native.gtk.gtk_selection_model_select_item
import org.gtkkn.native.gtk.gtk_selection_model_select_range
import org.gtkkn.native.gtk.gtk_selection_model_selection_changed
import org.gtkkn.native.gtk.gtk_selection_model_set_selection
import org.gtkkn.native.gtk.gtk_selection_model_unselect_all
import org.gtkkn.native.gtk.gtk_selection_model_unselect_item
import org.gtkkn.native.gtk.gtk_selection_model_unselect_range
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkSelectionModel` is an interface that add support for selection to list models.
 *
 * This support is then used by widgets using list models to add the ability
 * to select and unselect various items.
 *
 * GTK provides default implementations of the most common selection modes such
 * as [class@Gtk.SingleSelection], so you will only need to implement this
 * interface if you want detailed control about how selections should be handled.
 *
 * A `GtkSelectionModel` supports a single boolean per item indicating if an item is
 * selected or not. This can be queried via [method@Gtk.SelectionModel.is_selected].
 * When the selected state of one or more items changes, the model will emit the
 * [signal@Gtk.SelectionModel::selection-changed] signal by calling the
 * [method@Gtk.SelectionModel.selection_changed] function. The positions given
 * in that signal may have their selection state changed, though that is not a
 * requirement. If new items added to the model via the
 * [signal@Gio.ListModel::items-changed] signal are selected or not is up to the
 * implementation.
 *
 * Note that items added via [signal@Gio.ListModel::items-changed] may already
 * be selected and no [signal@Gtk.SelectionModel::selection-changed] will be
 * emitted for them. So to track which items are selected, it is necessary to
 * listen to both signals.
 *
 * Additionally, the interface can expose functionality to select and unselect
 * items. If these functions are implemented, GTK's list widgets will allow users
 * to select and unselect items. However, `GtkSelectionModel`s are free to only
 * implement them partially or not at all. In that case the widgets will not
 * support the unimplemented operations.
 *
 * When selecting or unselecting is supported by a model, the return values of
 * the selection functions do *not* indicate if selection or unselection happened.
 * They are only meant to indicate complete failure, like when this mode of
 * selecting is not supported by the model.
 *
 * Selections may happen asynchronously, so the only reliable way to find out
 * when an item was selected is to listen to the signals that indicate selection.
 */
public interface SelectionModel :
    Proxy,
    ListModel,
    KGTyped {
    public val gtkSelectionModelPointer: CPointer<GtkSelectionModel>

    override val gioListModelPointer: CPointer<GListModel>
        get() = gtkSelectionModelPointer.reinterpret()

    /**
     * Gets the set containing all currently selected items in the model.
     *
     * This function may be slow, so if you are only interested in single item,
     * consider using [method@Gtk.SelectionModel.is_selected] or if you are only
     * interested in a few, consider [method@Gtk.SelectionModel.get_selection_in_range].
     *
     * @return a `GtkBitset` containing all the values currently
     *   selected in @model. If no items are selected, the bitset is empty.
     *   The bitset must not be modified.
     */
    public fun getSelection(): Bitset = gtk_selection_model_get_selection(gtkSelectionModelPointer)!!.run {
        Bitset(this)
    }

    /**
     * Gets the set of selected items in a range.
     *
     * This function is an optimization for
     * [method@Gtk.SelectionModel.get_selection] when you are only
     * interested in part of the model's selected state. A common use
     * case is in response to the [signal@Gtk.SelectionModel::selection-changed]
     * signal.
     *
     * @param position start of the queried range
     * @param nItems number of items in the queried range
     * @return A `GtkBitset` that matches the selection state
     *   for the given range with all other values being undefined.
     *   The bitset must not be modified.
     */
    public fun getSelectionInRange(position: guint, nItems: guint): Bitset =
        gtk_selection_model_get_selection_in_range(gtkSelectionModelPointer, position, nItems)!!.run {
            Bitset(this)
        }

    /**
     * Checks if the given item is selected.
     *
     * @param position the position of the item to query
     * @return true if the item is selected
     */
    public fun isSelected(position: guint): Boolean =
        gtk_selection_model_is_selected(gtkSelectionModelPointer, position).asBoolean()

    /**
     * Requests to select all items in the model.
     *
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean that all items are now selected.
     */
    public fun selectAll(): Boolean = gtk_selection_model_select_all(gtkSelectionModelPointer).asBoolean()

    /**
     * Requests to select an item in the model.
     *
     * @param position the position of the item to select
     * @param unselectRest whether previously selected items should be unselected
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean the item was selected.
     */
    public fun selectItem(position: guint, unselectRest: Boolean): Boolean =
        gtk_selection_model_select_item(gtkSelectionModelPointer, position, unselectRest.asGBoolean()).asBoolean()

    /**
     * Requests to select a range of items in the model.
     *
     * @param position the first item to select
     * @param nItems the number of items to select
     * @param unselectRest whether previously selected items should be unselected
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean the range was selected.
     */
    public fun selectRange(position: guint, nItems: guint, unselectRest: Boolean): Boolean =
        gtk_selection_model_select_range(
            gtkSelectionModelPointer,
            position,
            nItems,
            unselectRest.asGBoolean()
        ).asBoolean()

    /**
     * Helper function for implementations of `GtkSelectionModel`.
     *
     * Call this when the selection changes to emit the
     * [signal@Gtk.SelectionModel::selection-changed] signal.
     *
     * @param position the first changed item
     * @param nItems the number of changed items
     */
    public fun selectionChanged(position: guint, nItems: guint): Unit =
        gtk_selection_model_selection_changed(gtkSelectionModelPointer, position, nItems)

    /**
     * Make selection changes.
     *
     * This is the most advanced selection updating method that allows
     * the most fine-grained control over selection changes. If you can,
     * you should try the simpler versions, as implementations are more
     * likely to implement support for those.
     *
     * Requests that the selection state of all positions set in @mask
     * be updated to the respective value in the @selected bitmask.
     *
     * In pseudocode, it would look something like this:
     *
     * ```c
     * for (i = 0; i < n_items; i++)
     *   {
     *     // don't change values not in the mask
     *     if (!gtk_bitset_contains (mask, i))
     *       continue;
     *
     *     if (gtk_bitset_contains (selected, i))
     *       select_item (i);
     *     else
     *       unselect_item (i);
     *   }
     *
     * gtk_selection_model_selection_changed (model,
     *                                        first_changed_item,
     *                                        n_changed_items);
     * ```
     *
     * @mask and @selected must not be modified. They may refer to the
     * same bitset, which would mean that every item in the set should
     * be selected.
     *
     * @param selected bitmask specifying if items should be selected or unselected
     * @param mask bitmask specifying which items should be updated
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean that all items were updated according
     *   to the inputs.
     */
    public fun setSelection(selected: Bitset, mask: Bitset): Boolean = gtk_selection_model_set_selection(
        gtkSelectionModelPointer,
        selected.gtkBitsetPointer,
        mask.gtkBitsetPointer
    ).asBoolean()

    /**
     * Requests to unselect all items in the model.
     *
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean that all items are now unselected.
     */
    public fun unselectAll(): Boolean = gtk_selection_model_unselect_all(gtkSelectionModelPointer).asBoolean()

    /**
     * Requests to unselect an item in the model.
     *
     * @param position the position of the item to unselect
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean the item was unselected.
     */
    public fun unselectItem(position: guint): Boolean =
        gtk_selection_model_unselect_item(gtkSelectionModelPointer, position).asBoolean()

    /**
     * Requests to unselect a range of items in the model.
     *
     * @param position the first item to unselect
     * @param nItems the number of items to unselect
     * @return true if this action was supported and no fallback should be
     *   tried. This does not mean the range was unselected.
     */
    public fun unselectRange(position: guint, nItems: guint): Boolean =
        gtk_selection_model_unselect_range(gtkSelectionModelPointer, position, nItems).asBoolean()

    /**
     * Emitted when the selection state of some of the items in @model changes.
     *
     * Note that this signal does not specify the new selection state of the
     * items, they need to be queried manually. It is also not necessary for
     * a model to change the selection state of any of the items in the selection
     * model, though it would be rather useless to emit such a signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` The first item that may have changed; `nItems` number of items with changes
     */
    public fun onSelectionChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (position: guint, nItems: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkSelectionModelPointer,
        "selection-changed",
        onSelectionChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The SelectionModelImpl type represents a native instance of the SelectionModel interface.
     *
     * @constructor Creates a new instance of SelectionModel for the provided [CPointer].
     */
    public class SelectionModelImpl(gtkSelectionModelPointer: CPointer<GtkSelectionModel>) :
        Object(gtkSelectionModelPointer.reinterpret()),
        SelectionModel {
        init {
            Gtk
        }

        override val gtkSelectionModelPointer: CPointer<GtkSelectionModel> =
            gtkSelectionModelPointer
    }

    public companion object : TypeCompanion<SelectionModel> {
        override val type: GeneratedInterfaceKGType<SelectionModel> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { SelectionModelImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SelectionModel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_selection_model_get_type()

        /**
         * Gets the GType of from the symbol `gtk_selection_model_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_selection_model_get_type")
    }
}

private val onSelectionChangedFunc: CPointer<CFunction<(guint, guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        position: guint,
        nItems: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(position: guint, nItems: guint) -> Unit>().get().invoke(position, nItems)
}
    .reinterpret()
