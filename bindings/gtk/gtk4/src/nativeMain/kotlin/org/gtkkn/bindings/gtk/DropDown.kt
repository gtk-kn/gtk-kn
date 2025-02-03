// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDropDown
import org.gtkkn.native.gtk.gtk_drop_down_get_enable_search
import org.gtkkn.native.gtk.gtk_drop_down_get_expression
import org.gtkkn.native.gtk.gtk_drop_down_get_factory
import org.gtkkn.native.gtk.gtk_drop_down_get_header_factory
import org.gtkkn.native.gtk.gtk_drop_down_get_list_factory
import org.gtkkn.native.gtk.gtk_drop_down_get_model
import org.gtkkn.native.gtk.gtk_drop_down_get_search_match_mode
import org.gtkkn.native.gtk.gtk_drop_down_get_selected
import org.gtkkn.native.gtk.gtk_drop_down_get_selected_item
import org.gtkkn.native.gtk.gtk_drop_down_get_show_arrow
import org.gtkkn.native.gtk.gtk_drop_down_get_type
import org.gtkkn.native.gtk.gtk_drop_down_new
import org.gtkkn.native.gtk.gtk_drop_down_new_from_strings
import org.gtkkn.native.gtk.gtk_drop_down_set_enable_search
import org.gtkkn.native.gtk.gtk_drop_down_set_expression
import org.gtkkn.native.gtk.gtk_drop_down_set_factory
import org.gtkkn.native.gtk.gtk_drop_down_set_header_factory
import org.gtkkn.native.gtk.gtk_drop_down_set_list_factory
import org.gtkkn.native.gtk.gtk_drop_down_set_model
import org.gtkkn.native.gtk.gtk_drop_down_set_search_match_mode
import org.gtkkn.native.gtk.gtk_drop_down_set_selected
import org.gtkkn.native.gtk.gtk_drop_down_set_show_arrow
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GtkDropDown` is a widget that allows the user to choose an item
 * from a list of options.
 *
 * ![An example GtkDropDown](drop-down.png)
 *
 * The `GtkDropDown` displays the [selected][property@Gtk.DropDown:selected]
 * choice.
 *
 * The options are given to `GtkDropDown` in the form of `GListModel`
 * and how the individual options are represented is determined by
 * a [class@Gtk.ListItemFactory]. The default factory displays simple strings,
 * and adds a checkmark to the selected item in the popup.
 *
 * To set your own factory, use [method@Gtk.DropDown.set_factory]. It is
 * possible to use a separate factory for the items in the popup, with
 * [method@Gtk.DropDown.set_list_factory].
 *
 * `GtkDropDown` knows how to obtain strings from the items in a
 * [class@Gtk.StringList]; for other models, you have to provide an expression
 * to find the strings via [method@Gtk.DropDown.set_expression].
 *
 * `GtkDropDown` can optionally allow search in the popup, which is
 * useful if the list of options is long. To enable the search entry,
 * use [method@Gtk.DropDown.set_enable_search].
 *
 * Here is a UI definition example for `GtkDropDown` with a simple model:
 *
 * ```xml
 * <object class="GtkDropDown">
 *   <property name="model">
 *     <object class="GtkStringList">
 *       <items>
 *         <item translatable="yes">Factory</item>
 *         <item translatable="yes">Home</item>
 *         <item translatable="yes">Subway</item>
 *       </items>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * If a `GtkDropDown` is created in this manner, or with
 * [ctor@Gtk.DropDown.new_from_strings], for instance, the object returned from
 * [method@Gtk.DropDown.get_selected_item] will be a [class@Gtk.StringObject].
 *
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 *
 * ## CSS nodes
 *
 * `GtkDropDown` has a single CSS node with name dropdown,
 * with the button and popover nodes as children.
 *
 * ## Accessibility
 *
 * `GtkDropDown` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
 */
public open class DropDown(public val gtkDropDownPointer: CPointer<GtkDropDown>) :
    Widget(gtkDropDownPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether to show a search entry in the popup.
     *
     * Note that search requires [property@Gtk.DropDown:expression]
     * to be set.
     */
    public open var enableSearch: Boolean
        /**
         * Returns whether search is enabled.
         *
         * @return true if the popup includes a search entry
         */
        get() = gtk_drop_down_get_enable_search(gtkDropDownPointer).asBoolean()

        /**
         * Sets whether a search entry will be shown in the popup that
         * allows to search for items in the list.
         *
         * Note that [property@Gtk.DropDown:expression] must be set for
         * search to work.
         *
         * @param enableSearch whether to enable search
         */
        set(enableSearch) = gtk_drop_down_set_enable_search(gtkDropDownPointer, enableSearch.asGBoolean())

    /**
     * An expression to evaluate to obtain strings to match against the search
     * term.
     *
     * See [property@Gtk.DropDown:enable-search] for how to enable search.
     * If [property@Gtk.DropDown:factory] is not set, the expression is also
     * used to bind strings to labels produced by a default factory.
     */
    public open var expression: Expression?
        /**
         * Gets the expression set that is used to obtain strings from items.
         *
         * See [method@Gtk.DropDown.set_expression].
         *
         * @return a `GtkExpression`
         */
        get() = gtk_drop_down_get_expression(gtkDropDownPointer)?.run {
            Expression.ExpressionImpl(this)
        }

        /**
         * Sets the expression that gets evaluated to obtain strings from items.
         *
         * This is used for search in the popup. The expression must have
         * a value type of %G_TYPE_STRING.
         *
         * @param expression a `GtkExpression`
         */
        set(expression) = gtk_drop_down_set_expression(gtkDropDownPointer, expression?.gtkExpressionPointer)

    /**
     * Factory for populating list items.
     */
    public open var factory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items.
         *
         * The factory returned by this function is always used for the
         * item in the button. It is also used for items in the popup
         * if [property@Gtk.DropDown:list-factory] is not set.
         *
         * @return The factory in use
         */
        get() = gtk_drop_down_get_factory(gtkDropDownPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items.
         *
         * @param factory the factory to use
         */
        set(factory) = gtk_drop_down_set_factory(gtkDropDownPointer, factory?.gtkListItemFactoryPointer)

    /**
     * The factory for creating header widgets for the popup.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var headerFactory: ListItemFactory?
        /**
         * Gets the factory that's currently used to create header widgets for the popup.
         *
         * @return The factory in use
         * @since 4.12
         */
        get() = gtk_drop_down_get_header_factory(gtkDropDownPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the `GtkListItemFactory` to use for creating header widgets for the popup.
         *
         * @param factory the factory to use
         * @since 4.12
         */
        @GtkVersion4_12
        set(factory) = gtk_drop_down_set_header_factory(gtkDropDownPointer, factory?.gtkListItemFactoryPointer)

    /**
     * The factory for populating list items in the popup.
     *
     * If this is not set, [property@Gtk.DropDown:factory] is used.
     */
    public open var listFactory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items in the popup.
         *
         * @return The factory in use
         */
        get() = gtk_drop_down_get_list_factory(gtkDropDownPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items in the popup.
         *
         * @param factory the factory to use
         */
        set(factory) = gtk_drop_down_set_list_factory(gtkDropDownPointer, factory?.gtkListItemFactoryPointer)

    /**
     * Model for the displayed items.
     */
    public open var model: ListModel?
        /**
         * Gets the model that provides the displayed items.
         *
         * @return The model in use
         */
        get() = gtk_drop_down_get_model(gtkDropDownPointer)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        /**
         * Sets the `GListModel` to use.
         *
         * @param model the model to use
         */
        set(model) = gtk_drop_down_set_model(gtkDropDownPointer, model?.gioListModelPointer)

    /**
     * The match mode for the search filter.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var searchMatchMode: StringFilterMatchMode
        /**
         * Returns the match mode that the search filter is using.
         *
         * @return the match mode of the search filter
         * @since 4.12
         */
        get() = gtk_drop_down_get_search_match_mode(gtkDropDownPointer).run {
            StringFilterMatchMode.fromNativeValue(this)
        }

        /**
         * Sets the match mode for the search filter.
         *
         * @param searchMatchMode the new match mode
         * @since 4.12
         */
        @GtkVersion4_12
        set(searchMatchMode) = gtk_drop_down_set_search_match_mode(gtkDropDownPointer, searchMatchMode.nativeValue)

    /**
     * The position of the selected item.
     *
     * If no item is selected, the property has the value
     * %GTK_INVALID_LIST_POSITION.
     */
    public open var selected: guint
        /**
         * Gets the position of the selected item.
         *
         * @return the position of the selected item, or %GTK_INVALID_LIST_POSITION
         *   if not item is selected
         */
        get() = gtk_drop_down_get_selected(gtkDropDownPointer)

        /**
         * Selects the item at the given position.
         *
         * @param position the position of the item to select, or %GTK_INVALID_LIST_POSITION
         */
        set(position) = gtk_drop_down_set_selected(gtkDropDownPointer, position)

    /**
     * The selected item.
     */
    public open val selectedItem: Object?
        /**
         * Gets the selected item. If no item is selected, null is returned.
         *
         * @return The selected item
         */
        get() = gtk_drop_down_get_selected_item(gtkDropDownPointer)?.run {
            InstanceCache.get(reinterpret(), true) { Object(reinterpret()) }!!
        }

    /**
     * Whether to show an arrow within the GtkDropDown widget.
     *
     * @since 4.6
     */
    @GtkVersion4_6
    public open var showArrow: Boolean
        /**
         * Returns whether to show an arrow within the widget.
         *
         * @return true if an arrow will be shown.
         * @since 4.6
         */
        get() = gtk_drop_down_get_show_arrow(gtkDropDownPointer).asBoolean()

        /**
         * Sets whether an arrow will be displayed within the widget.
         *
         * @param showArrow whether to show an arrow within the widget
         * @since 4.6
         */
        @GtkVersion4_6
        set(showArrow) = gtk_drop_down_set_show_arrow(gtkDropDownPointer, showArrow.asGBoolean())

    /**
     * Creates a new `GtkDropDown`.
     *
     * You may want to call [method@Gtk.DropDown.set_factory]
     * to set up a way to map its items to widgets.
     *
     * @param model the model to use
     * @param expression the expression to use
     * @return a new `GtkDropDown`
     */
    public constructor(
        model: ListModel? = null,
        expression: Expression? = null,
    ) : this(gtk_drop_down_new(model?.gioListModelPointer, expression?.gtkExpressionPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new `GtkDropDown` that is populated with
     * the strings.
     *
     * @param strings The strings to put in the dropdown
     * @return a new `GtkDropDown`
     */
    public constructor(strings: List<String>) : this(
        memScoped {
            gtk_drop_down_new_from_strings(strings.toCStringList(this))!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

    /**
     * Emitted to when the drop down is activated.
     *
     * The `::activate` signal on `GtkDropDown` is an action signal and
     * emitting it causes the drop down to pop up its dropdown.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.6
     */
    @GtkVersion4_6
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkDropDownPointer,
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
        g_signal_emit_by_name(gtkDropDownPointer.reinterpret(), "activate")
    }

    public companion object : TypeCompanion<DropDown> {
        override val type: GeneratedClassKGType<DropDown> =
            GeneratedClassKGType(getTypeOrNull()!!) { DropDown(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of DropDown
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_drop_down_get_type()

        /**
         * Gets the GType of from the symbol `gtk_drop_down_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_drop_down_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
