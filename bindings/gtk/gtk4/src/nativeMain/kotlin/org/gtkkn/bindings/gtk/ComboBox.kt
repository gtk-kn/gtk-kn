// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Device
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkComboBox
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.gtk_combo_box_get_active
import org.gtkkn.native.gtk.gtk_combo_box_get_active_id
import org.gtkkn.native.gtk.gtk_combo_box_get_active_iter
import org.gtkkn.native.gtk.gtk_combo_box_get_button_sensitivity
import org.gtkkn.native.gtk.gtk_combo_box_get_child
import org.gtkkn.native.gtk.gtk_combo_box_get_entry_text_column
import org.gtkkn.native.gtk.gtk_combo_box_get_has_entry
import org.gtkkn.native.gtk.gtk_combo_box_get_id_column
import org.gtkkn.native.gtk.gtk_combo_box_get_model
import org.gtkkn.native.gtk.gtk_combo_box_get_popup_fixed_width
import org.gtkkn.native.gtk.gtk_combo_box_get_type
import org.gtkkn.native.gtk.gtk_combo_box_new
import org.gtkkn.native.gtk.gtk_combo_box_new_with_entry
import org.gtkkn.native.gtk.gtk_combo_box_new_with_model
import org.gtkkn.native.gtk.gtk_combo_box_new_with_model_and_entry
import org.gtkkn.native.gtk.gtk_combo_box_popdown
import org.gtkkn.native.gtk.gtk_combo_box_popup
import org.gtkkn.native.gtk.gtk_combo_box_popup_for_device
import org.gtkkn.native.gtk.gtk_combo_box_set_active
import org.gtkkn.native.gtk.gtk_combo_box_set_active_id
import org.gtkkn.native.gtk.gtk_combo_box_set_active_iter
import org.gtkkn.native.gtk.gtk_combo_box_set_button_sensitivity
import org.gtkkn.native.gtk.gtk_combo_box_set_child
import org.gtkkn.native.gtk.gtk_combo_box_set_entry_text_column
import org.gtkkn.native.gtk.gtk_combo_box_set_id_column
import org.gtkkn.native.gtk.gtk_combo_box_set_model
import org.gtkkn.native.gtk.gtk_combo_box_set_popup_fixed_width
import org.gtkkn.native.gtk.gtk_combo_box_set_row_separator_func
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkComboBox` is a widget that allows the user to choose from a list of
 * valid choices.
 *
 * ![An example GtkComboBox](combo-box.png)
 *
 * The `GtkComboBox` displays the selected choice; when activated, the
 * `GtkComboBox` displays a popup which allows the user to make a new choice.
 *
 * The `GtkComboBox` uses the model-view pattern; the list of valid choices
 * is specified in the form of a tree model, and the display of the choices
 * can be adapted to the data in the model by using cell renderers, as you
 * would in a tree view. This is possible since `GtkComboBox` implements the
 * [iface@Gtk.CellLayout] interface. The tree model holding the valid
 * choices is not restricted to a flat list, it can be a real tree, and the
 * popup will reflect the tree structure.
 *
 * To allow the user to enter values not in the model, the
 * [property@Gtk.ComboBox:has-entry] property allows the `GtkComboBox` to
 * contain a [class@Gtk.Entry]. This entry can be accessed by calling
 * [method@Gtk.ComboBox.get_child] on the combo box.
 *
 * For a simple list of textual choices, the model-view API of `GtkComboBox`
 * can be a bit overwhelming. In this case, [class@Gtk.ComboBoxText] offers
 * a simple alternative. Both `GtkComboBox` and `GtkComboBoxText` can contain
 * an entry.
 *
 * ## CSS nodes
 *
 * ```
 * combobox
 * ├── box.linked
 * │   ╰── button.combo
 * │       ╰── box
 * │           ├── cellview
 * │           ╰── arrow
 * ╰── window.popup
 * ```
 *
 * A normal combobox contains a box with the .linked class, a button
 * with the .combo class and inside those buttons, there are a cellview and
 * an arrow.
 *
 * ```
 * combobox
 * ├── box.linked
 * │   ├── entry.combo
 * │   ╰── button.combo
 * │       ╰── box
 * │           ╰── arrow
 * ╰── window.popup
 * ```
 *
 * A `GtkComboBox` with an entry has a single CSS node with name combobox.
 * It contains a box with the .linked class. That box contains an entry and
 * a button, both with the .combo class added. The button also contains another
 * node with name arrow.
 *
 * ## Accessibility
 *
 * `GtkComboBox` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_row_separator_func`: Return type TreeViewRowSeparatorFunc is not supported
 * - method `active-id`: Property setter does not return Unit
 * - method `has-frame`: Property has no getter nor setter
 * - method `popup-shown`: Property has no getter nor setter
 */
public open class ComboBox(public val gtkComboBoxPointer: CPointer<GtkComboBox>) :
    Widget(gtkComboBoxPointer.reinterpret()),
    CellEditable,
    CellLayout,
    KGTyped {
    override val gtkCellEditablePointer: CPointer<GtkCellEditable>
        get() = handle.reinterpret()

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The item which is currently active.
     *
     * If the model is a non-flat treemodel, and the active item is not an
     * immediate child of the root of the tree, this property has the value
     * `gtk_tree_path_get_indices (path)[0]`, where `path` is the
     * [struct@Gtk.TreePath] of the active item.
     */
    public open var active: gint
        /**
         * Returns the index of the currently active item.
         *
         * If the model is a non-flat treemodel, and the active item is not
         * an immediate child of the root of the tree, this function returns
         * `gtk_tree_path_get_indices (path)[0]`, where `path` is the
         * [struct@Gtk.TreePath] of the active item.
         *
         * @return An integer which is the index of the currently active item,
         *   or -1 if there’s no active item
         */
        get() = gtk_combo_box_get_active(gtkComboBoxPointer)

        /**
         * Sets the active item of @combo_box to be the item at @index.
         *
         * @param index An index in the model passed during construction,
         *   or -1 to have no active item
         */
        set(index) = gtk_combo_box_set_active(gtkComboBoxPointer, index)

    /**
     * Whether the dropdown button is sensitive when
     * the model is empty.
     */
    public open var buttonSensitivity: SensitivityType
        /**
         * Returns whether the combo box sets the dropdown button
         * sensitive or not when there are no items in the model.
         *
         * @return %GTK_SENSITIVITY_ON if the dropdown button
         *   is sensitive when the model is empty, %GTK_SENSITIVITY_OFF
         *   if the button is always insensitive or %GTK_SENSITIVITY_AUTO
         *   if it is only sensitive as long as the model has one item to
         *   be selected.
         */
        get() = gtk_combo_box_get_button_sensitivity(gtkComboBoxPointer).run {
            SensitivityType.fromNativeValue(this)
        }

        /**
         * Sets whether the dropdown button of the combo box should update
         * its sensitivity depending on the model contents.
         *
         * @param sensitivity specify the sensitivity of the dropdown button
         */
        set(sensitivity) = gtk_combo_box_set_button_sensitivity(gtkComboBoxPointer, sensitivity.nativeValue)

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @combo_box.
         *
         * @return the child widget of @combo_box
         */
        get() = gtk_combo_box_get_child(gtkComboBoxPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @combo_box.
         *
         * @param child the child widget
         */
        set(child) = gtk_combo_box_set_child(gtkComboBoxPointer, child?.gtkWidgetPointer)

    /**
     * The model column to associate with strings from the entry.
     *
     * This is property only relevant if the combo was created with
     * [property@Gtk.ComboBox:has-entry] is true.
     */
    public open var entryTextColumn: gint
        /**
         * Returns the column which @combo_box is using to get the strings
         * from to display in the internal entry.
         *
         * @return A column in the data source model of @combo_box.
         */
        get() = gtk_combo_box_get_entry_text_column(gtkComboBoxPointer)

        /**
         * Sets the model column which @combo_box should use to get strings
         * from to be @text_column.
         *
         * For this column no separate
         * [class@Gtk.CellRenderer] is needed.
         *
         * The column @text_column in the model of @combo_box must be of
         * type %G_TYPE_STRING.
         *
         * This is only relevant if @combo_box has been created with
         * [property@Gtk.ComboBox:has-entry] as true.
         *
         * @param textColumn A column in @model to get the strings from for
         *   the internal entry
         */
        set(textColumn) = gtk_combo_box_set_entry_text_column(gtkComboBoxPointer, textColumn)

    /**
     * Whether the combo box has an entry.
     */
    public open val hasEntry: Boolean
        /**
         * Returns whether the combo box has an entry.
         *
         * @return whether there is an entry in @combo_box.
         */
        get() = gtk_combo_box_get_has_entry(gtkComboBoxPointer).asBoolean()

    /**
     * The model column that provides string IDs for the values
     * in the model, if != -1.
     */
    public open var idColumn: gint
        /**
         * Returns the column which @combo_box is using to get string IDs
         * for values from.
         *
         * @return A column in the data source model of @combo_box.
         */
        get() = gtk_combo_box_get_id_column(gtkComboBoxPointer)

        /**
         * Sets the model column which @combo_box should use to get string IDs
         * for values from.
         *
         * The column @id_column in the model of @combo_box must be of type
         * %G_TYPE_STRING.
         *
         * @param idColumn A column in @model to get string IDs for values from
         */
        set(idColumn) = gtk_combo_box_set_id_column(gtkComboBoxPointer, idColumn)

    /**
     * The model from which the combo box takes its values.
     */
    public open var model: TreeModel?
        /**
         * Returns the `GtkTreeModel` of @combo_box.
         *
         * @return A `GtkTreeModel` which was passed
         *   during construction.
         */
        get() = gtk_combo_box_get_model(gtkComboBoxPointer)?.run {
            TreeModel.TreeModelImpl(reinterpret())
        }

        /**
         * Sets the model used by @combo_box to be @model.
         *
         * Will unset a previously set model (if applicable). If model is null,
         * then it will unset the model.
         *
         * Note that this function does not clear the cell renderers, you have to
         * call [method@Gtk.CellLayout.clear] yourself if you need to set up different
         * cell renderers for the new model.
         *
         * @param model A `GtkTreeModel`
         */
        set(model) = gtk_combo_box_set_model(gtkComboBoxPointer, model?.gtkTreeModelPointer)

    /**
     * Whether the popup's width should be a fixed width matching the
     * allocated width of the combo box.
     */
    public open var popupFixedWidth: Boolean
        /**
         * Gets whether the popup uses a fixed width.
         *
         * @return true if the popup uses a fixed width
         */
        get() = gtk_combo_box_get_popup_fixed_width(gtkComboBoxPointer).asBoolean()

        /**
         * Specifies whether the popup’s width should be a fixed width.
         *
         * If @fixed is true, the popup's width is set to match the
         * allocated width of the combo box.
         *
         * @param fixed whether to use a fixed popup width
         */
        set(fixed) = gtk_combo_box_set_popup_fixed_width(gtkComboBoxPointer, fixed.asGBoolean())

    /**
     * Creates a new empty `GtkComboBox`.
     *
     * @return A new `GtkComboBox`
     */
    public constructor() : this(gtk_combo_box_new()!!.reinterpret())

    /**
     * Creates a new `GtkComboBox` with a model.
     *
     * @param model a `GtkTreeModel`
     * @return A new `GtkComboBox`
     */
    public constructor(model: TreeModel) : this(gtk_combo_box_new_with_model(model.gtkTreeModelPointer)!!.reinterpret())

    /**
     * Returns the ID of the active row of @combo_box.
     *
     * This value is taken from the active row and the column specified
     * by the [property@Gtk.ComboBox:id-column] property of @combo_box
     * (see [method@Gtk.ComboBox.set_id_column]).
     *
     * The returned value is an interned string which means that you can
     * compare the pointer by value to other interned strings and that you
     * must not free it.
     *
     * If the [property@Gtk.ComboBox:id-column] property of @combo_box is
     * not set, or if no row is active, or if the active row has a null
     * ID value, then null is returned.
     *
     * @return the ID of the active row
     */
    public open fun getActiveId(): String? = gtk_combo_box_get_active_id(gtkComboBoxPointer)?.toKString()

    /**
     * Sets @iter to point to the currently active item.
     *
     * If no item is active, @iter is left unchanged.
     *
     * @param iter A `GtkTreeIter`
     * @return true if @iter was set, false otherwise
     */
    public open fun getActiveIter(iter: TreeIter): Boolean =
        gtk_combo_box_get_active_iter(gtkComboBoxPointer, iter.gtkTreeIterPointer).asBoolean()

    /**
     * Hides the menu or dropdown list of @combo_box.
     *
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     */
    public open fun popdown(): Unit = gtk_combo_box_popdown(gtkComboBoxPointer)

    /**
     * Pops up the menu or dropdown list of @combo_box.
     *
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     *
     * Before calling this, @combo_box must be mapped, or nothing will happen.
     */
    public open fun popup(): Unit = gtk_combo_box_popup(gtkComboBoxPointer)

    /**
     * Pops up the menu of @combo_box.
     *
     * Note that currently this does not do anything with the device, as it was
     * previously only used for list-mode combo boxes, and those were removed
     * in GTK 4. However, it is retained in case similar functionality is added
     * back later.
     *
     * @param device a `GdkDevice`
     */
    public open fun popupForDevice(device: Device): Unit =
        gtk_combo_box_popup_for_device(gtkComboBoxPointer, device.gdkDevicePointer)

    /**
     * Changes the active row of @combo_box to the one that has an ID equal to
     * @active_id.
     *
     * If @active_id is null, the active row is unset. Rows having
     * a null ID string cannot be made active by this function.
     *
     * If the [property@Gtk.ComboBox:id-column] property of @combo_box is
     * unset or if no row has the given ID then the function does nothing
     * and returns false.
     *
     * @param activeId the ID of the row to select
     * @return true if a row with a matching ID was found. If a null
     *   @active_id was given to unset the active row, the function
     *   always returns true.
     */
    public open fun setActiveId(activeId: String? = null): Boolean =
        gtk_combo_box_set_active_id(gtkComboBoxPointer, activeId).asBoolean()

    /**
     * Sets the current active item to be the one referenced by @iter.
     *
     * If @iter is null, the active item is unset.
     *
     * @param iter The `GtkTreeIter`
     */
    public open fun setActiveIter(iter: TreeIter? = null): Unit =
        gtk_combo_box_set_active_iter(gtkComboBoxPointer, iter?.gtkTreeIterPointer)

    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator.
     *
     * If the row separator function is null, no separators are drawn.
     * This is the default value.
     *
     * @param func a `GtkTreeViewRowSeparatorFunc`
     */
    public open fun setRowSeparatorFunc(func: TreeViewRowSeparatorFunc?): Unit = gtk_combo_box_set_row_separator_func(
        gtkComboBoxPointer,
        func?.let {
            TreeViewRowSeparatorFuncFunc.reinterpret()
        },
        func?.let { StableRef.create(func).asCPointer() },
        func?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Emitted to when the combo box is activated.
     *
     * The `::activate` signal on `GtkComboBox` is an action signal and
     * emitting it causes the combo box to pop up its dropdown.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.6
     */
    @GtkVersion4_6
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkComboBoxPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     *
     * @since 4.6
     */
    @GtkVersion4_6
    public fun emitActivate() {
        g_signal_emit_by_name(gtkComboBoxPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the active item is changed.
     *
     * The can be due to the user selecting a different item from the list,
     * or due to a call to [method@Gtk.ComboBox.set_active_iter]. It will
     * also be emitted while typing into the entry of a combo box with an entry.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkComboBoxPointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     */
    public fun emitChanged() {
        g_signal_emit_by_name(gtkComboBoxPointer.reinterpret(), "changed")
    }

    /**
     * Emitted to allow changing how the text in a combo box's entry is displayed.
     *
     * See [property@Gtk.ComboBox:has-entry].
     *
     * Connect a signal handler which returns an allocated string representing
     * @path. That string will then be used to set the text in the combo box's
     * entry. The default signal handler uses the text from the
     * [property@Gtk.ComboBox:entry-text-column] model column.
     *
     * Here's an example signal handler which fetches data from the model and
     * displays it in the entry.
     * ```c
     * static char *
     * format_entry_text_callback (GtkComboBox *combo,
     *                             const char *path,
     *                             gpointer     user_data)
     * {
     *   GtkTreeIter iter;
     *   GtkTreeModel model;
     *   double       value;
     *
     *   model = gtk_combo_box_get_model (combo);
     *
     *   gtk_tree_model_get_iter_from_string (model, &iter, path);
     *   gtk_tree_model_get (model, &iter,
     *                       THE_DOUBLE_VALUE_COLUMN, &value,
     *                       -1);
     *
     *   return g_strdup_printf ("%g", value);
     * }
     * ```
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` the [struct@Gtk.TreePath] string from the combo box's current model
     *   to format text for. Returns a newly allocated string representing @path
     *   for the current `GtkComboBox` model.
     */
    public fun onFormatEntryText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: String) -> String,
    ): ULong = g_signal_connect_data(
        gtkComboBoxPointer,
        "format-entry-text",
        onFormatEntryTextFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted to move the active selection.
     *
     * This is an [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `scrollType` a `GtkScrollType`
     */
    public fun onMoveActive(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (scrollType: ScrollType) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkComboBoxPointer,
        "move-active",
        onMoveActiveFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-active" signal. See [onMoveActive].
     *
     * @param scrollType a `GtkScrollType`
     */
    public fun emitMoveActive(scrollType: ScrollType) {
        g_signal_emit_by_name(gtkComboBoxPointer.reinterpret(), "move-active", scrollType.nativeValue)
    }

    /**
     * Emitted to popdown the combo box list.
     *
     * This is an [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are Alt+Up and Escape.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPopdown(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gtkComboBoxPointer,
            "popdown",
            onPopdownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to popup the combo box list.
     *
     * This is an [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is Alt+Down.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPopup(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkComboBoxPointer,
            "popup",
            onPopupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "popup" signal. See [onPopup].
     */
    public fun emitPopup() {
        g_signal_emit_by_name(gtkComboBoxPointer.reinterpret(), "popup")
    }

    public companion object : TypeCompanion<ComboBox> {
        override val type: GeneratedClassKGType<ComboBox> =
            GeneratedClassKGType(gtk_combo_box_get_type()) { ComboBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new empty `GtkComboBox` with an entry.
         *
         * In order to use a combo box with entry, you need to tell it
         * which column of the model contains the text for the entry
         * by calling [method@Gtk.ComboBox.set_entry_text_column].
         *
         * @return A new `GtkComboBox`
         */
        public fun newWithEntry(): ComboBox = ComboBox(gtk_combo_box_new_with_entry()!!.reinterpret())

        /**
         * Creates a new `GtkComboBox` with a model.
         *
         * @param model a `GtkTreeModel`
         * @return A new `GtkComboBox`
         */
        public fun newWithModel(model: TreeModel): ComboBox =
            ComboBox(gtk_combo_box_new_with_model(model.gtkTreeModelPointer)!!.reinterpret())

        /**
         * Creates a new empty `GtkComboBox` with an entry and a model.
         *
         * See also [ctor@Gtk.ComboBox.new_with_entry].
         *
         * @param model A `GtkTreeModel`
         * @return A new `GtkComboBox`
         */
        public fun newWithModelAndEntry(model: TreeModel): ComboBox =
            ComboBox(gtk_combo_box_new_with_model_and_entry(model.gtkTreeModelPointer)!!.reinterpret())

        /**
         * Get the GType of ComboBox
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_combo_box_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onFormatEntryTextFunc: CPointer<CFunction<(CPointer<ByteVar>) -> CPointer<ByteVar>>> =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                path: String,
            ) -> String
            >().get().invoke(path?.toKString() ?: error("Expected not null string")).let { g_strdup(it) }
    }
        .reinterpret()

private val onMoveActiveFunc: CPointer<CFunction<(GtkScrollType) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        scrollType: GtkScrollType,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(scrollType: ScrollType) -> Unit>().get().invoke(
        scrollType.run {
            ScrollType.fromNativeValue(this)
        }
    )
}
    .reinterpret()

private val onPopdownFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onPopupFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
