// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwExpanderRow
import org.gtkkn.native.adw.adw_expander_row_add_action
import org.gtkkn.native.adw.adw_expander_row_add_prefix
import org.gtkkn.native.adw.adw_expander_row_add_row
import org.gtkkn.native.adw.adw_expander_row_add_suffix
import org.gtkkn.native.adw.adw_expander_row_get_enable_expansion
import org.gtkkn.native.adw.adw_expander_row_get_expanded
import org.gtkkn.native.adw.adw_expander_row_get_icon_name
import org.gtkkn.native.adw.adw_expander_row_get_show_enable_switch
import org.gtkkn.native.adw.adw_expander_row_get_subtitle
import org.gtkkn.native.adw.adw_expander_row_get_subtitle_lines
import org.gtkkn.native.adw.adw_expander_row_get_title_lines
import org.gtkkn.native.adw.adw_expander_row_get_type
import org.gtkkn.native.adw.adw_expander_row_new
import org.gtkkn.native.adw.adw_expander_row_remove
import org.gtkkn.native.adw.adw_expander_row_set_enable_expansion
import org.gtkkn.native.adw.adw_expander_row_set_expanded
import org.gtkkn.native.adw.adw_expander_row_set_icon_name
import org.gtkkn.native.adw.adw_expander_row_set_show_enable_switch
import org.gtkkn.native.adw.adw_expander_row_set_subtitle
import org.gtkkn.native.adw.adw_expander_row_set_subtitle_lines
import org.gtkkn.native.adw.adw_expander_row_set_title_lines
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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
 * supports adding a child as an suffix widget by specifying “suffix” as the
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
 *
 * ## Style classes
 *
 * `AdwExpanderRow` can use the [`.`](style-classes.html#property-rows)
 * style class to emphasize the row subtitle instead of the row title, which is
 * useful for displaying read-only properties.
 *
 * When used together with the `.monospace` style class, only the subtitle
 * becomes monospace, not the title or any extra widgets.
 */
public open class ExpanderRow(public val adwExpanderRowPointer: CPointer<AdwExpanderRow>) :
    PreferencesRow(adwExpanderRowPointer.reinterpret()),
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
     * Whether expansion is enabled.
     */
    public open var enableExpansion: Boolean
        /**
         * Gets whether the expansion of @self is enabled.
         *
         * @return whether the expansion of @self is enabled.
         */
        get() = adw_expander_row_get_enable_expansion(adwExpanderRowPointer).asBoolean()

        /**
         * Sets whether the expansion of @self is enabled.
         *
         * @param enableExpansion whether to enable the expansion
         */
        set(
            enableExpansion
        ) = adw_expander_row_set_enable_expansion(adwExpanderRowPointer, enableExpansion.asGBoolean())

    /**
     * Whether the row is expanded.
     */
    public open var expanded: Boolean
        /**
         * Gets whether @self is expanded.
         *
         * @return whether @self is expanded
         */
        get() = adw_expander_row_get_expanded(adwExpanderRowPointer).asBoolean()

        /**
         * Sets whether @self is expanded.
         *
         * @param expanded whether to expand the row
         */
        set(expanded) = adw_expander_row_set_expanded(adwExpanderRowPointer, expanded.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.3.
     *
     * Use [method@ExpanderRow.add_prefix] to add an icon.
     * ---
     *
     * The icon name for this row.
     */
    public open var iconName: String?
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.3.
         *
         * Use [method@ExpanderRow.add_prefix] to add an icon.
         * ---
         *
         * Gets the icon name for @self.
         *
         * @return the icon name for @self
         */
        get() = adw_expander_row_get_icon_name(adwExpanderRowPointer)?.toKString()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.3.
         *
         * Use [method@ExpanderRow.add_prefix] to add an icon.
         * ---
         *
         * Sets the icon name for @self.
         *
         * @param iconName the icon name
         */
        set(iconName) = adw_expander_row_set_icon_name(adwExpanderRowPointer, iconName)

    /**
     * Whether the switch enabling the expansion is visible.
     */
    public open var showEnableSwitch: Boolean
        /**
         * Gets whether the switch enabling the expansion of @self is visible.
         *
         * @return whether the switch enabling the expansion is visible
         */
        get() = adw_expander_row_get_show_enable_switch(adwExpanderRowPointer).asBoolean()

        /**
         * Sets whether the switch enabling the expansion of @self is visible.
         *
         * @param showEnableSwitch whether to show the switch enabling the expansion
         */
        set(
            showEnableSwitch
        ) = adw_expander_row_set_show_enable_switch(adwExpanderRowPointer, showEnableSwitch.asGBoolean())

    /**
     * The subtitle for this row.
     *
     * The subtitle is interpreted as Pango markup unless
     * [property@PreferencesRow:use-markup] is set to `FALSE`.
     */
    public open var subtitle: String
        /**
         * Gets the subtitle for @self.
         *
         * @return the subtitle for @self
         */
        get() = adw_expander_row_get_subtitle(adwExpanderRowPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the subtitle for @self.
         *
         * The subtitle is interpreted as Pango markup unless
         * [property@PreferencesRow:use-markup] is set to `FALSE`.
         *
         * @param subtitle the subtitle
         */
        set(subtitle) = adw_expander_row_set_subtitle(adwExpanderRowPointer, subtitle)

    /**
     * The number of lines at the end of which the subtitle label will be
     * ellipsized.
     *
     * If the value is 0, the number of lines won't be limited.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public open var subtitleLines: gint
        /**
         * Gets the number of lines at the end of which the subtitle label will be
         * ellipsized.
         *
         * @return the number of lines at the end of which the subtitle label will be
         *   ellipsized
         * @since 1.3
         */
        get() = adw_expander_row_get_subtitle_lines(adwExpanderRowPointer)

        /**
         * Sets the number of lines at the end of which the subtitle label will be
         * ellipsized.
         *
         * If the value is 0, the number of lines won't be limited.
         *
         * @param subtitleLines the number of lines at the end of which the subtitle label will be ellipsized
         * @since 1.3
         */
        @AdwVersion1_3
        set(subtitleLines) = adw_expander_row_set_subtitle_lines(adwExpanderRowPointer, subtitleLines)

    /**
     * The number of lines at the end of which the title label will be ellipsized.
     *
     * If the value is 0, the number of lines won't be limited.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public open var titleLines: gint
        /**
         * Gets the number of lines at the end of which the title label will be
         * ellipsized.
         *
         * @return the number of lines at the end of which the title label will be
         *   ellipsized
         * @since 1.3
         */
        get() = adw_expander_row_get_title_lines(adwExpanderRowPointer)

        /**
         * Sets the number of lines at the end of which the title label will be
         * ellipsized.
         *
         * If the value is 0, the number of lines won't be limited.
         *
         * @param titleLines the number of lines at the end of which the title label will be ellipsized
         * @since 1.3
         */
        @AdwVersion1_3
        set(titleLines) = adw_expander_row_set_title_lines(adwExpanderRowPointer, titleLines)

    /**
     * Creates a new `AdwExpanderRow`.
     *
     * @return the newly created `AdwExpanderRow`
     */
    public constructor() : this(adw_expander_row_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * Use [method@ExpanderRow.add_suffix] to add a suffix.
     * ---
     *
     * Adds an action widget to @self.
     *
     * @param widget a widget
     */
    public open fun addAction(widget: Widget): Unit =
        adw_expander_row_add_action(adwExpanderRowPointer, widget.gtkWidgetPointer)

    /**
     * Adds a prefix widget to @self.
     *
     * @param widget a widget
     */
    public open fun addPrefix(widget: Widget): Unit =
        adw_expander_row_add_prefix(adwExpanderRowPointer, widget.gtkWidgetPointer)

    /**
     * Adds a widget to @self.
     *
     * The widget will appear in the expanding list below @self.
     *
     * @param child a widget
     */
    public open fun addRow(child: Widget): Unit =
        adw_expander_row_add_row(adwExpanderRowPointer, child.gtkWidgetPointer)

    /**
     * Adds an suffix widget to @self.
     *
     * @param widget a widget
     * @since 1.4
     */
    @AdwVersion1_4
    public open fun addSuffix(widget: Widget): Unit =
        adw_expander_row_add_suffix(adwExpanderRowPointer, widget.gtkWidgetPointer)

    /**
     * Removes a child from @self.
     *
     * @param child the child to be removed
     */
    public open fun remove(child: Widget): Unit = adw_expander_row_remove(adwExpanderRowPointer, child.gtkWidgetPointer)

    public companion object : TypeCompanion<ExpanderRow> {
        override val type: GeneratedClassKGType<ExpanderRow> =
            GeneratedClassKGType(getTypeOrNull()!!) { ExpanderRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ExpanderRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_expander_row_get_type()

        /**
         * Gets the GType of from the symbol `adw_expander_row_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_expander_row_get_type")
    }
}
