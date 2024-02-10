// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Expression
import org.gtkkn.bindings.gtk.ListItemFactory
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwComboRow
import org.gtkkn.native.adw.adw_combo_row_get_expression
import org.gtkkn.native.adw.adw_combo_row_get_factory
import org.gtkkn.native.adw.adw_combo_row_get_list_factory
import org.gtkkn.native.adw.adw_combo_row_get_model
import org.gtkkn.native.adw.adw_combo_row_get_selected
import org.gtkkn.native.adw.adw_combo_row_get_selected_item
import org.gtkkn.native.adw.adw_combo_row_get_type
import org.gtkkn.native.adw.adw_combo_row_get_use_subtitle
import org.gtkkn.native.adw.adw_combo_row_new
import org.gtkkn.native.adw.adw_combo_row_set_expression
import org.gtkkn.native.adw.adw_combo_row_set_factory
import org.gtkkn.native.adw.adw_combo_row_set_list_factory
import org.gtkkn.native.adw.adw_combo_row_set_model
import org.gtkkn.native.adw.adw_combo_row_set_selected
import org.gtkkn.native.adw.adw_combo_row_set_use_subtitle
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit

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
 * @since 1.0
 */
public open class ComboRow(
    pointer: CPointer<AdwComboRow>,
) : ActionRow(pointer.reinterpret()), KGTyped {
    public val adwComboRowPointer: CPointer<AdwComboRow>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * An expression used to obtain strings from items.
     *
     * It's used to bind strings to labels produced by the default factory.
     *
     * If [property@ComboRow:factory] is not set, the expression is also used to
     * bind strings to labels produced by a default factory.
     *
     * @since 1.0
     */
    public open var expression: Expression?
        /**
         * Gets the expression used to obtain strings from items.
         *
         * @return the expression used to obtain strings from items
         * @since 1.0
         */
        get() =
            adw_combo_row_get_expression(adwComboRowPointer.reinterpret())?.run {
                Expression(reinterpret())
            }

        /**
         * Sets the expression used to obtain strings from items.
         *
         * The expression must have a value type of `G_TYPE_STRING`.
         *
         * @param expression an expression
         * @since 1.0
         */
        set(expression) =
            adw_combo_row_set_expression(
                adwComboRowPointer.reinterpret(),
                expression?.gPointer?.reinterpret()
            )

    /**
     * Factory for populating list items.
     *
     * This factory is always used for the item in the row. It is also used for
     * items in the popup unless [property@ComboRow:list-factory] is set.
     *
     * @since 1.0
     */
    public open var factory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items.
         *
         * @return the factory in use
         * @since 1.0
         */
        get() =
            adw_combo_row_get_factory(adwComboRowPointer.reinterpret())?.run {
                ListItemFactory(reinterpret())
            }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items.
         *
         * @param factory the factory to use
         * @since 1.0
         */
        set(factory) =
            adw_combo_row_set_factory(
                adwComboRowPointer.reinterpret(),
                factory?.gtkListItemFactoryPointer?.reinterpret()
            )

    /**
     * The factory for populating list items in the popup.
     *
     * If this is not set, [property@ComboRow:factory] is used.
     *
     * @since 1.0
     */
    public open var listFactory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items in the popup.
         *
         * @return the factory in use
         * @since 1.0
         */
        get() =
            adw_combo_row_get_list_factory(adwComboRowPointer.reinterpret())?.run {
                ListItemFactory(reinterpret())
            }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items in the popup.
         *
         * @param factory the factory to use
         * @since 1.0
         */
        set(factory) =
            adw_combo_row_set_list_factory(
                adwComboRowPointer.reinterpret(),
                factory?.gtkListItemFactoryPointer?.reinterpret()
            )

    /**
     * Model for the displayed items.
     *
     * @since 1.0
     */
    public open var model: ListModel?
        /**
         * Gets the model that provides the displayed items.
         *
         * @return The model in use
         * @since 1.0
         */
        get() =
            adw_combo_row_get_model(adwComboRowPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

        /**
         * Sets the [iface@Gio.ListModel] to use.
         *
         * @param model the model to use
         * @since 1.0
         */
        set(model) =
            adw_combo_row_set_model(
                adwComboRowPointer.reinterpret(),
                model?.gioListModelPointer
            )

    /**
     * The position of the selected item.
     *
     * If no item is selected, the property has the value
     * [const@Gtk.INVALID_LIST_POSITION]
     *
     * @since 1.0
     */
    public open var selected: UInt
        /**
         * Gets the position of the selected item.
         *
         * @return the position of the selected item, or
         *   [const@Gtk.INVALID_LIST_POSITION] if no item is selected
         * @since 1.0
         */
        get() = adw_combo_row_get_selected(adwComboRowPointer.reinterpret())

        /**
         * Selects the item at the given position.
         *
         * @param position the position of the item to select, or
         *   [const@Gtk.INVALID_LIST_POSITION]
         * @since 1.0
         */
        set(position) = adw_combo_row_set_selected(adwComboRowPointer.reinterpret(), position)

    /**
     * The selected item.
     *
     * @since 1.0
     */
    public open val selectedItem: Object?
        /**
         * Gets the selected item.
         *
         * @return the selected item
         * @since 1.0
         */
        get() =
            adw_combo_row_get_selected_item(adwComboRowPointer.reinterpret())?.run {
                Object(reinterpret())
            }

    /**
     * Whether to use the current value as the subtitle.
     *
     * If you use a custom list item factory, you will need to give the row a
     * name conversion expression with [property@ComboRow:expression].
     *
     * If `TRUE`, you should not access [property@ActionRow:subtitle].
     *
     * @since 1.0
     */
    public open var useSubtitle: Boolean
        /**
         * Gets whether to use the current value as the subtitle.
         *
         * @return whether to use the current value as the subtitle
         * @since 1.0
         */
        get() = adw_combo_row_get_use_subtitle(adwComboRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to use the current value as the subtitle.
         *
         * @param useSubtitle whether to use the current value as the subtitle
         * @since 1.0
         */
        set(useSubtitle) =
            adw_combo_row_set_use_subtitle(
                adwComboRowPointer.reinterpret(),
                useSubtitle.asGBoolean()
            )

    /**
     * Creates a new `AdwComboRow`.
     *
     * @return the newly created `AdwComboRow`
     * @since 1.0
     */
    public constructor() : this(adw_combo_row_new()!!.reinterpret())

    /**
     * Gets the expression used to obtain strings from items.
     *
     * @return the expression used to obtain strings from items
     * @since 1.0
     */
    public open fun getExpression(): Expression? =
        adw_combo_row_get_expression(adwComboRowPointer.reinterpret())?.run {
            Expression(reinterpret())
        }

    /**
     * Gets the factory that's currently used to populate list items.
     *
     * @return the factory in use
     * @since 1.0
     */
    public open fun getFactory(): ListItemFactory? =
        adw_combo_row_get_factory(adwComboRowPointer.reinterpret())?.run {
            ListItemFactory(reinterpret())
        }

    /**
     * Gets the factory that's currently used to populate list items in the popup.
     *
     * @return the factory in use
     * @since 1.0
     */
    public open fun getListFactory(): ListItemFactory? =
        adw_combo_row_get_list_factory(adwComboRowPointer.reinterpret())?.run {
            ListItemFactory(reinterpret())
        }

    /**
     * Gets the model that provides the displayed items.
     *
     * @return The model in use
     * @since 1.0
     */
    public open fun getModel(): ListModel? =
        adw_combo_row_get_model(adwComboRowPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Gets the position of the selected item.
     *
     * @return the position of the selected item, or
     *   [const@Gtk.INVALID_LIST_POSITION] if no item is selected
     * @since 1.0
     */
    public open fun getSelected(): UInt = adw_combo_row_get_selected(adwComboRowPointer.reinterpret())

    /**
     * Gets the selected item.
     *
     * @return the selected item
     * @since 1.0
     */
    public open fun getSelectedItem(): Object? =
        adw_combo_row_get_selected_item(adwComboRowPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Gets whether to use the current value as the subtitle.
     *
     * @return whether to use the current value as the subtitle
     * @since 1.0
     */
    public open fun getUseSubtitle(): Boolean =
        adw_combo_row_get_use_subtitle(adwComboRowPointer.reinterpret()).asBoolean()

    /**
     * Sets the expression used to obtain strings from items.
     *
     * The expression must have a value type of `G_TYPE_STRING`.
     *
     * @param expression an expression
     * @since 1.0
     */
    public open fun setExpression(expression: Expression? = null): Unit =
        adw_combo_row_set_expression(
            adwComboRowPointer.reinterpret(),
            expression?.gPointer?.reinterpret()
        )

    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     *
     * @param factory the factory to use
     * @since 1.0
     */
    public open fun setFactory(factory: ListItemFactory? = null): Unit =
        adw_combo_row_set_factory(
            adwComboRowPointer.reinterpret(),
            factory?.gtkListItemFactoryPointer?.reinterpret()
        )

    /**
     * Sets the `GtkListItemFactory` to use for populating list items in the popup.
     *
     * @param factory the factory to use
     * @since 1.0
     */
    public open fun setListFactory(factory: ListItemFactory? = null): Unit =
        adw_combo_row_set_list_factory(
            adwComboRowPointer.reinterpret(),
            factory?.gtkListItemFactoryPointer?.reinterpret()
        )

    /**
     * Sets the [iface@Gio.ListModel] to use.
     *
     * @param model the model to use
     * @since 1.0
     */
    public open fun setModel(model: ListModel? = null): Unit =
        adw_combo_row_set_model(adwComboRowPointer.reinterpret(), model?.gioListModelPointer)

    /**
     * Selects the item at the given position.
     *
     * @param position the position of the item to select, or
     *   [const@Gtk.INVALID_LIST_POSITION]
     * @since 1.0
     */
    public open fun setSelected(position: UInt): Unit =
        adw_combo_row_set_selected(adwComboRowPointer.reinterpret(), position)

    /**
     * Sets whether to use the current value as the subtitle.
     *
     * @param useSubtitle whether to use the current value as the subtitle
     * @since 1.0
     */
    public open fun setUseSubtitle(useSubtitle: Boolean): Unit =
        adw_combo_row_set_use_subtitle(
            adwComboRowPointer.reinterpret(),
            useSubtitle.asGBoolean()
        )

    public companion object : TypeCompanion<ComboRow> {
        override val type: GeneratedClassKGType<ComboRow> =
            GeneratedClassKGType(adw_combo_row_get_type()) { ComboRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
