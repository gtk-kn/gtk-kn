// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Expression
import org.gtkkn.bindings.gtk.ListItemFactory
import org.gtkkn.bindings.gtk.StringFilterMatchMode
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwComboRow
import org.gtkkn.native.adw.adw_combo_row_get_enable_search
import org.gtkkn.native.adw.adw_combo_row_get_expression
import org.gtkkn.native.adw.adw_combo_row_get_factory
import org.gtkkn.native.adw.adw_combo_row_get_header_factory
import org.gtkkn.native.adw.adw_combo_row_get_list_factory
import org.gtkkn.native.adw.adw_combo_row_get_model
import org.gtkkn.native.adw.adw_combo_row_get_search_match_mode
import org.gtkkn.native.adw.adw_combo_row_get_selected
import org.gtkkn.native.adw.adw_combo_row_get_selected_item
import org.gtkkn.native.adw.adw_combo_row_get_type
import org.gtkkn.native.adw.adw_combo_row_get_use_subtitle
import org.gtkkn.native.adw.adw_combo_row_new
import org.gtkkn.native.adw.adw_combo_row_set_enable_search
import org.gtkkn.native.adw.adw_combo_row_set_expression
import org.gtkkn.native.adw.adw_combo_row_set_factory
import org.gtkkn.native.adw.adw_combo_row_set_header_factory
import org.gtkkn.native.adw.adw_combo_row_set_list_factory
import org.gtkkn.native.adw.adw_combo_row_set_model
import org.gtkkn.native.adw.adw_combo_row_set_search_match_mode
import org.gtkkn.native.adw.adw_combo_row_set_selected
import org.gtkkn.native.adw.adw_combo_row_set_use_subtitle
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean

/**
 * A [class@Gtk.ListBoxRow] used to choose from a list of items.
 *
 * <picture>
 *   <source srcset="combo-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="combo-row.png" alt="combo-row">
 * </picture>
 *
 * The `AdwComboRow` widget allows the user to choose from a list of valid
 * choices. The row displays the selected choice. When activated, the row
 * displays a popover which allows the user to make a new choice.
 *
 * Example of an `AdwComboRow` UI definition:
 * ```xml
 * <object class="AdwComboRow">
 *   <property name="title" translatable="yes">Combo Row</property>
 *   <property name="model">
 *     <object class="GtkStringList">
 *       <items>
 *         <item translatable="yes">Foo</item>
 *         <item translatable="yes">Bar</item>
 *         <item translatable="yes">Baz</item>
 *       </items>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * The [property@ComboRow:selected] and [property@ComboRow:selected-item]
 * properties can be used to keep track of the selected item and react to their
 * changes.
 *
 * `AdwComboRow` mirrors [class@Gtk.DropDown], see that widget for details.
 *
 * `AdwComboRow` is [property@Gtk.ListBoxRow:activatable] if a model is set.
 *
 * ## CSS nodes
 *
 * `AdwComboRow` has a main CSS node with name `row` and the `.combo` style
 * class.
 *
 * Its popover has the node named `popover` with the `.menu` style class, it
 * contains a [class@Gtk.ScrolledWindow], which in turn contains a
 * [class@Gtk.ListView], both are accessible via their regular nodes.
 *
 * ## Accessibility
 *
 * `AdwComboRow` uses the `GTK_ACCESSIBLE_ROLE_COMBO_BOX` role.
 */
public open class ComboRow(public val adwComboRowPointer: CPointer<AdwComboRow>) :
    ActionRow(adwComboRowPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether to show a search entry in the popup.
     *
     * If set to `TRUE`, a search entry will be shown in the popup that
     * allows to search for items in the list.
     *
     * Search requires [property@ComboRow:expression] to be set.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open var enableSearch: Boolean
        /**
         * Gets whether search is enabled.
         *
         * If set to `TRUE`, a search entry will be shown in the popup that
         * allows to search for items in the list.
         *
         * Search requires [property@ComboRow:expression] to be set.
         *
         * @return whether the popup includes a search entry
         * @since 1.4
         */
        get() = adw_combo_row_get_enable_search(adwComboRowPointer).asBoolean()

        /**
         * Sets whether to enable search.
         *
         * If set to `TRUE`, a search entry will be shown in the popup that
         * allows to search for items in the list.
         *
         * Search requires [property@ComboRow:expression] to be set.
         *
         * @param enableSearch whether to enable search
         * @since 1.4
         */
        @AdwVersion1_4
        set(enableSearch) = adw_combo_row_set_enable_search(adwComboRowPointer, enableSearch.asGBoolean())

    /**
     * An expression used to obtain strings from items.
     *
     * The expression must have a value type of `G_TYPE_STRING`.
     *
     * It's used to bind strings to labels produced by the default factory if
     * [property@ComboRow:factory] is not set, or when
     * [property@ComboRow:use-subtitle] is set to `TRUE`.
     */
    public open var expression: Expression?
        /**
         * Gets the expression used to obtain strings from items.
         *
         * @return the expression used to obtain strings from items
         */
        get() = adw_combo_row_get_expression(adwComboRowPointer)?.run {
            Expression.ExpressionImpl(this)
        }

        /**
         * Sets the expression used to obtain strings from items.
         *
         * The expression must have a value type of `G_TYPE_STRING`.
         *
         * It's used to bind strings to labels produced by the default factory if
         * [property@ComboRow:factory] is not set, or when
         * [property@ComboRow:use-subtitle] is set to `TRUE`.
         *
         * @param expression an expression
         */
        set(expression) = adw_combo_row_set_expression(adwComboRowPointer, expression?.gtkExpressionPointer)

    /**
     * Factory for populating list items.
     *
     * This factory is always used for the item in the row. It is also used for
     * items in the popup unless [property@ComboRow:list-factory] is set.
     */
    public open var factory: ListItemFactory?
        /**
         * Gets the factory for populating list items.
         *
         * @return the factory in use
         */
        get() = adw_combo_row_get_factory(adwComboRowPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the factory for populating list items.
         *
         * This factory is always used for the item in the row. It is also used for
         * items in the popup unless [property@ComboRow:list-factory] is set.
         *
         * @param factory the factory to use
         */
        set(factory) = adw_combo_row_set_factory(adwComboRowPointer, factory?.gtkListItemFactoryPointer)

    /**
     * The factory for creating header widgets for the popup.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public open var headerFactory: ListItemFactory?
        /**
         * Gets the factory that's currently used to create header widgets for the popup.
         *
         * @return The factory in use
         * @since 1.6
         */
        get() = adw_combo_row_get_header_factory(adwComboRowPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the factory to use for creating header widgets for the popup.
         *
         * @param factory the factory to use
         * @since 1.6
         */
        @AdwVersion1_6
        set(factory) = adw_combo_row_set_header_factory(adwComboRowPointer, factory?.gtkListItemFactoryPointer)

    /**
     * The factory for populating list items in the popup.
     *
     * If this is not set, [property@ComboRow:factory] is used.
     */
    public open var listFactory: ListItemFactory?
        /**
         * Gets the factory for populating list items in the popup.
         *
         * @return the factory in use
         */
        get() = adw_combo_row_get_list_factory(adwComboRowPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the factory for populating list items in the popup.
         *
         * If this is not set, [property@ComboRow:factory] is used.
         *
         * @param factory the factory to use
         */
        set(factory) = adw_combo_row_set_list_factory(adwComboRowPointer, factory?.gtkListItemFactoryPointer)

    /**
     * The model that provides the displayed items.
     */
    public open var model: ListModel?
        /**
         * Gets the model that provides the displayed items.
         *
         * @return The model in use
         */
        get() = adw_combo_row_get_model(adwComboRowPointer)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        /**
         * Sets the model that provides the displayed items.
         *
         * @param model the model to use
         */
        set(model) = adw_combo_row_set_model(adwComboRowPointer, model?.gioListModelPointer)

    /**
     * The match mode for the search filter.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public open var searchMatchMode: StringFilterMatchMode
        /**
         * Returns the match mode that the search filter is using.
         *
         * @return the match mode of the search filter
         * @since 1.6
         */
        get() = adw_combo_row_get_search_match_mode(adwComboRowPointer).run {
            StringFilterMatchMode.fromNativeValue(this)
        }

        /**
         * Sets the match mode for the search filter.
         *
         * @param searchMatchMode the new match mode
         * @since 1.6
         */
        @AdwVersion1_6
        set(searchMatchMode) = adw_combo_row_set_search_match_mode(adwComboRowPointer, searchMatchMode.nativeValue)

    /**
     * The position of the selected item.
     *
     * If no item is selected, the property has the value
     * [const@Gtk.INVALID_LIST_POSITION]
     */
    public open var selected: guint
        /**
         * Gets the position of the selected item.
         *
         * @return the position of the selected item, or
         *   [const@Gtk.INVALID_LIST_POSITION] if no item is selected
         */
        get() = adw_combo_row_get_selected(adwComboRowPointer)

        /**
         * Selects the item at the given position.
         *
         * @param position the position of the item to select, or
         *   [const@Gtk.INVALID_LIST_POSITION]
         */
        set(position) = adw_combo_row_set_selected(adwComboRowPointer, position)

    /**
     * The selected item.
     */
    public open val selectedItem: Object?
        /**
         * Gets the selected item.
         *
         * @return the selected item
         */
        get() = adw_combo_row_get_selected_item(adwComboRowPointer)?.run {
            InstanceCache.get(reinterpret(), true) { Object(reinterpret()) }!!
        }

    /**
     * Whether to use the current value as the subtitle.
     *
     * If you use a custom list item factory, you will need to give the row a
     * name conversion expression with [property@ComboRow:expression].
     *
     * If set to `TRUE`, you should not access [property@ActionRow:subtitle].
     *
     * The subtitle is interpreted as Pango markup if
     * [property@PreferencesRow:use-markup] is set to `TRUE`.
     */
    public open var useSubtitle: Boolean
        /**
         * Gets whether to use the current value as the subtitle.
         *
         * @return whether to use the current value as the subtitle
         */
        get() = adw_combo_row_get_use_subtitle(adwComboRowPointer).asBoolean()

        /**
         * Sets whether to use the current value as the subtitle.
         *
         * If you use a custom list item factory, you will need to give the row a
         * name conversion expression with [property@ComboRow:expression].
         *
         * If set to `TRUE`, you should not access [property@ActionRow:subtitle].
         *
         * The subtitle is interpreted as Pango markup if
         * [property@PreferencesRow:use-markup] is set to `TRUE`.
         *
         * @param useSubtitle whether to use the current value as the subtitle
         */
        set(useSubtitle) = adw_combo_row_set_use_subtitle(adwComboRowPointer, useSubtitle.asGBoolean())

    /**
     * Creates a new `AdwComboRow`.
     *
     * @return the newly created `AdwComboRow`
     */
    public constructor() : this(adw_combo_row_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ComboRow> {
        override val type: GeneratedClassKGType<ComboRow> =
            GeneratedClassKGType(getTypeOrNull()!!) { ComboRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ComboRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_combo_row_get_type()

        /**
         * Gets the GType of from the symbol `adw_combo_row_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_combo_row_get_type")
    }
}
