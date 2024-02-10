// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwExpanderRow
import org.gtkkn.native.adw.adw_expander_row_add_action
import org.gtkkn.native.adw.adw_expander_row_add_prefix
import org.gtkkn.native.adw.adw_expander_row_add_row
import org.gtkkn.native.adw.adw_expander_row_get_enable_expansion
import org.gtkkn.native.adw.adw_expander_row_get_expanded
import org.gtkkn.native.adw.adw_expander_row_get_icon_name
import org.gtkkn.native.adw.adw_expander_row_get_show_enable_switch
import org.gtkkn.native.adw.adw_expander_row_get_subtitle
import org.gtkkn.native.adw.adw_expander_row_get_type
import org.gtkkn.native.adw.adw_expander_row_new
import org.gtkkn.native.adw.adw_expander_row_remove
import org.gtkkn.native.adw.adw_expander_row_set_enable_expansion
import org.gtkkn.native.adw.adw_expander_row_set_expanded
import org.gtkkn.native.adw.adw_expander_row_set_icon_name
import org.gtkkn.native.adw.adw_expander_row_set_show_enable_switch
import org.gtkkn.native.adw.adw_expander_row_set_subtitle
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A [class@Gtk.ListBoxRow] used to reveal widgets.
 *
 * <picture>
 *   <source srcset="expander-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="expander-row.png" alt="expander-row">
 * </picture>
 *
 * The `AdwExpanderRow` widget allows the user to reveal or hide widgets below
 * it. It also allows the user to enable the expansion of the row, allowing to
 * disable all that the row contains.
 *
 * ## AdwExpanderRow as GtkBuildable
 *
 * The `AdwExpanderRow` implementation of the [iface@Gtk.Buildable] interface
 * supports adding a child as an action widget by specifying “action” as the
 * “type” attribute of a <child> element.
 *
 * It also supports adding it as a prefix widget by specifying “prefix” as the
 * “type” attribute of a <child> element.
 *
 * ## CSS nodes
 *
 * `AdwExpanderRow` has a main CSS node with name `row` and the `.expander`
 * style class. It has the `.empty` style class when it contains no children.
 *
 * It contains the subnodes `row.header` for its main embedded row,
 * `list.nested` for the list it can expand, and `image.expander-row-arrow` for
 * its arrow.
 * @since 1.0
 */
public open class ExpanderRow(
    pointer: CPointer<AdwExpanderRow>,
) : PreferencesRow(pointer.reinterpret()), KGTyped {
    public val adwExpanderRowPointer: CPointer<AdwExpanderRow>
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
     * Whether expansion is enabled.
     *
     * @since 1.0
     */
    public open var enableExpansion: Boolean
        /**
         * Gets whether the expansion of @self is enabled.
         *
         * @return whether the expansion of @self is enabled.
         * @since 1.0
         */
        get() =
            adw_expander_row_get_enable_expansion(adwExpanderRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the expansion of @self is enabled.
         *
         * @param enableExpansion whether to enable the expansion
         * @since 1.0
         */
        set(enableExpansion) =
            adw_expander_row_set_enable_expansion(
                adwExpanderRowPointer.reinterpret(),
                enableExpansion.asGBoolean()
            )

    /**
     * Whether the row is expanded.
     *
     * @since 1.0
     */
    public open var expanded: Boolean
        /**
         * Gets whether @self is expanded.
         *
         * @return whether @self is expanded
         * @since 1.0
         */
        get() = adw_expander_row_get_expanded(adwExpanderRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self is expanded.
         *
         * @param expanded whether to expand the row
         * @since 1.0
         */
        set(expanded) =
            adw_expander_row_set_expanded(
                adwExpanderRowPointer.reinterpret(),
                expanded.asGBoolean()
            )

    /**
     * The icon name for this row.
     *
     * @since 1.0
     */
    public open var iconName: String?
        /**
         * Gets the icon name for @self.
         *
         * @return the icon name for @self
         * @since 1.0
         */
        get() = adw_expander_row_get_icon_name(adwExpanderRowPointer.reinterpret())?.toKString()

        /**
         * Sets the icon name for @self.
         *
         * @param iconName the icon name
         * @since 1.0
         */
        set(iconName) =
            adw_expander_row_set_icon_name(
                adwExpanderRowPointer.reinterpret(),
                iconName
            )

    /**
     * Whether the switch enabling the expansion is visible.
     *
     * @since 1.0
     */
    public open var showEnableSwitch: Boolean
        /**
         * Gets whether the switch enabling the expansion of @self is visible.
         *
         * @return whether the switch enabling the expansion is visible
         * @since 1.0
         */
        get() =
            adw_expander_row_get_show_enable_switch(adwExpanderRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the switch enabling the expansion of @self is visible.
         *
         * @param showEnableSwitch whether to show the switch enabling the expansion
         * @since 1.0
         */
        set(showEnableSwitch) =
            adw_expander_row_set_show_enable_switch(
                adwExpanderRowPointer.reinterpret(),
                showEnableSwitch.asGBoolean()
            )

    /**
     * The subtitle for this row.
     *
     * @since 1.0
     */
    public open var subtitle: String
        /**
         * Gets the subtitle for @self.
         *
         * @return the subtitle for @self
         * @since 1.0
         */
        get() =
            adw_expander_row_get_subtitle(adwExpanderRowPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the subtitle for @self.
         *
         * @param subtitle the subtitle
         * @since 1.0
         */
        set(subtitle) = adw_expander_row_set_subtitle(adwExpanderRowPointer.reinterpret(), subtitle)

    /**
     * Creates a new `AdwExpanderRow`.
     *
     * @return the newly created `AdwExpanderRow`
     * @since 1.0
     */
    public constructor() : this(adw_expander_row_new()!!.reinterpret())

    /**
     * Adds an action widget to @self.
     *
     * @param widget a widget
     * @since 1.0
     */
    public open fun addAction(widget: Widget): Unit =
        adw_expander_row_add_action(
            adwExpanderRowPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Adds a prefix widget to @self.
     *
     * @param widget a widget
     * @since 1.0
     */
    public open fun addPrefix(widget: Widget): Unit =
        adw_expander_row_add_prefix(
            adwExpanderRowPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Adds a widget to @self.
     *
     * The widget will appear in the expanding list below @self.
     *
     * @param child a widget
     * @since 1.0
     */
    public open fun addRow(child: Widget): Unit =
        adw_expander_row_add_row(
            adwExpanderRowPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Gets whether the expansion of @self is enabled.
     *
     * @return whether the expansion of @self is enabled.
     * @since 1.0
     */
    public open fun getEnableExpansion(): Boolean =
        adw_expander_row_get_enable_expansion(adwExpanderRowPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is expanded.
     *
     * @return whether @self is expanded
     * @since 1.0
     */
    public open fun getExpanded(): Boolean =
        adw_expander_row_get_expanded(adwExpanderRowPointer.reinterpret()).asBoolean()

    /**
     * Gets the icon name for @self.
     *
     * @return the icon name for @self
     * @since 1.0
     */
    public open fun getIconName(): String? =
        adw_expander_row_get_icon_name(adwExpanderRowPointer.reinterpret())?.toKString()

    /**
     * Gets whether the switch enabling the expansion of @self is visible.
     *
     * @return whether the switch enabling the expansion is visible
     * @since 1.0
     */
    public open fun getShowEnableSwitch(): Boolean =
        adw_expander_row_get_show_enable_switch(adwExpanderRowPointer.reinterpret()).asBoolean()

    /**
     * Gets the subtitle for @self.
     *
     * @return the subtitle for @self
     * @since 1.0
     */
    public open fun getSubtitle(): String =
        adw_expander_row_get_subtitle(adwExpanderRowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param child
     */
    public open fun remove(child: Widget): Unit =
        adw_expander_row_remove(
            adwExpanderRowPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Sets whether the expansion of @self is enabled.
     *
     * @param enableExpansion whether to enable the expansion
     * @since 1.0
     */
    public open fun setEnableExpansion(enableExpansion: Boolean): Unit =
        adw_expander_row_set_enable_expansion(
            adwExpanderRowPointer.reinterpret(),
            enableExpansion.asGBoolean()
        )

    /**
     * Sets whether @self is expanded.
     *
     * @param expanded whether to expand the row
     * @since 1.0
     */
    public open fun setExpanded(expanded: Boolean): Unit =
        adw_expander_row_set_expanded(
            adwExpanderRowPointer.reinterpret(),
            expanded.asGBoolean()
        )

    /**
     * Sets the icon name for @self.
     *
     * @param iconName the icon name
     * @since 1.0
     */
    public open fun setIconName(iconName: String? = null): Unit =
        adw_expander_row_set_icon_name(adwExpanderRowPointer.reinterpret(), iconName)

    /**
     * Sets whether the switch enabling the expansion of @self is visible.
     *
     * @param showEnableSwitch whether to show the switch enabling the expansion
     * @since 1.0
     */
    public open fun setShowEnableSwitch(showEnableSwitch: Boolean): Unit =
        adw_expander_row_set_show_enable_switch(
            adwExpanderRowPointer.reinterpret(),
            showEnableSwitch.asGBoolean()
        )

    /**
     * Sets the subtitle for @self.
     *
     * @param subtitle the subtitle
     * @since 1.0
     */
    public open fun setSubtitle(subtitle: String): Unit =
        adw_expander_row_set_subtitle(adwExpanderRowPointer.reinterpret(), subtitle)

    public companion object : TypeCompanion<ExpanderRow> {
        override val type: GeneratedClassKGType<ExpanderRow> =
            GeneratedClassKGType(adw_expander_row_get_type()) { ExpanderRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
