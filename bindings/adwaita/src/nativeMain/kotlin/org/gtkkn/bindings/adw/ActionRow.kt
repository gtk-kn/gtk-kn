// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwActionRow
import org.gtkkn.native.adw.adw_action_row_activate
import org.gtkkn.native.adw.adw_action_row_add_prefix
import org.gtkkn.native.adw.adw_action_row_add_suffix
import org.gtkkn.native.adw.adw_action_row_get_activatable_widget
import org.gtkkn.native.adw.adw_action_row_get_icon_name
import org.gtkkn.native.adw.adw_action_row_get_subtitle
import org.gtkkn.native.adw.adw_action_row_get_subtitle_lines
import org.gtkkn.native.adw.adw_action_row_get_subtitle_selectable
import org.gtkkn.native.adw.adw_action_row_get_title_lines
import org.gtkkn.native.adw.adw_action_row_get_type
import org.gtkkn.native.adw.adw_action_row_new
import org.gtkkn.native.adw.adw_action_row_remove
import org.gtkkn.native.adw.adw_action_row_set_activatable_widget
import org.gtkkn.native.adw.adw_action_row_set_icon_name
import org.gtkkn.native.adw.adw_action_row_set_subtitle
import org.gtkkn.native.adw.adw_action_row_set_subtitle_lines
import org.gtkkn.native.adw.adw_action_row_set_subtitle_selectable
import org.gtkkn.native.adw.adw_action_row_set_title_lines
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A [class@Gtk.ListBoxRow] used to present actions.
 *
 * <picture>
 *   <source srcset="action-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="action-row.png" alt="action-row">
 * </picture>
 *
 * The `AdwActionRow` widget can have a title, a subtitle and an icon. The row
 * can receive additional widgets at its end, or prefix widgets at its start.
 *
 * It is convenient to present a preference and its related actions.
 *
 * `AdwActionRow` is unactivatable by default, giving it an activatable widget
 * will automatically make it activatable, but unsetting it won't change the
 * row's activatability.
 *
 * ## AdwActionRow as GtkBuildable
 *
 * The `AdwActionRow` implementation of the [iface@Gtk.Buildable] interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a <child> element.
 *
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a <child> element.
 *
 * ## CSS nodes
 *
 * `AdwActionRow` has a main CSS node with name `row`.
 *
 * It contains the subnode `box.header` for its main horizontal box, and
 * `box.title` for the vertical box containing the title and subtitle labels.
 *
 * It contains subnodes `label.title` and `label.subtitle` representing
 * respectively the title label and subtitle label.
 *
 * ## Skipped during bindings generation
 *
 * - method `subtitle`: Property TypeInfo of getter and setter do not match
 */
public open class ActionRow(pointer: CPointer<AdwActionRow>) :
    PreferencesRow(pointer.reinterpret()),
    KGTyped {
    public val adwActionRowPointer: CPointer<AdwActionRow>
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
     * The widget to activate when the row is activated.
     *
     * The row can be activated either by clicking on it, calling
     * [method@ActionRow.activate], or via mnemonics in the title.
     * See the [property@PreferencesRow:use-underline] property to enable
     * mnemonics.
     *
     * The target widget will be activated by emitting the
     * [signal@Gtk.Widget::mnemonic-activate] signal on it.
     */
    public open var activatableWidget: Widget?
        /**
         * Gets the widget activated when @self is activated.
         *
         * @return the activatable widget for @self
         */
        get() = adw_action_row_get_activatable_widget(adwActionRowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the widget to activate when @self is activated.
         *
         * The row can be activated either by clicking on it, calling
         * [method@ActionRow.activate], or via mnemonics in the title.
         * See the [property@PreferencesRow:use-underline] property to enable mnemonics.
         *
         * The target widget will be activated by emitting the
         * [signal@Gtk.Widget::mnemonic-activate] signal on it.
         *
         * @param widget the target widget
         */
        set(
            widget
        ) = adw_action_row_set_activatable_widget(
            adwActionRowPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * The icon name for this row.
     */
    public open var iconName: String?
        /**
         * Gets the icon name for @self.
         *
         * @return the icon name for @self
         */
        get() = adw_action_row_get_icon_name(adwActionRowPointer.reinterpret())?.toKString()

        /**
         * Sets the icon name for @self.
         *
         * @param iconName the icon name
         */
        set(iconName) = adw_action_row_set_icon_name(adwActionRowPointer.reinterpret(), iconName)

    /**
     * The number of lines at the end of which the subtitle label will be
     * ellipsized.
     *
     * If the value is 0, the number of lines won't be limited.
     */
    public open var subtitleLines: gint
        /**
         * Gets the number of lines at the end of which the subtitle label will be
         * ellipsized.
         *
         * @return the number of lines at the end of which the subtitle label will be
         *   ellipsized
         */
        get() = adw_action_row_get_subtitle_lines(adwActionRowPointer.reinterpret())

        /**
         * Sets the number of lines at the end of which the subtitle label will be
         * ellipsized.
         *
         * If the value is 0, the number of lines won't be limited.
         *
         * @param subtitleLines the number of lines at the end of which the subtitle label will be ellipsized
         */
        set(subtitleLines) = adw_action_row_set_subtitle_lines(adwActionRowPointer.reinterpret(), subtitleLines)

    /**
     * Whether the user can copy the subtitle from the label.
     *
     * See also [property@Gtk.Label:selectable].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public open var subtitleSelectable: Boolean
        /**
         * Gets whether the user can copy the subtitle from the label
         *
         * @return whether the user can copy the subtitle from the label
         * @since 1.3
         */
        get() = adw_action_row_get_subtitle_selectable(adwActionRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the user can copy the subtitle from the label
         *
         * See also [property@Gtk.Label:selectable].
         *
         * @param subtitleSelectable `TRUE` if the user can copy the subtitle from the label
         * @since 1.3
         */
        @AdwVersion1_3
        set(
            subtitleSelectable
        ) = adw_action_row_set_subtitle_selectable(adwActionRowPointer.reinterpret(), subtitleSelectable.asGBoolean())

    /**
     * The number of lines at the end of which the title label will be ellipsized.
     *
     * If the value is 0, the number of lines won't be limited.
     */
    public open var titleLines: gint
        /**
         * Gets the number of lines at the end of which the title label will be
         * ellipsized.
         *
         * @return the number of lines at the end of which the title label will be
         *   ellipsized
         */
        get() = adw_action_row_get_title_lines(adwActionRowPointer.reinterpret())

        /**
         * Sets the number of lines at the end of which the title label will be
         * ellipsized.
         *
         * If the value is 0, the number of lines won't be limited.
         *
         * @param titleLines the number of lines at the end of which the title label will be ellipsized
         */
        set(titleLines) = adw_action_row_set_title_lines(adwActionRowPointer.reinterpret(), titleLines)

    /**
     * Creates a new `AdwActionRow`.
     *
     * @return the newly created `AdwActionRow`
     */
    public constructor() : this(adw_action_row_new()!!.reinterpret())

    /**
     * Activates @self.
     */
    public open fun activate(): Unit = adw_action_row_activate(adwActionRowPointer.reinterpret())

    /**
     * Adds a prefix widget to @self.
     *
     * @param widget a widget
     */
    public open fun addPrefix(widget: Widget): Unit =
        adw_action_row_add_prefix(adwActionRowPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Adds a suffix widget to @self.
     *
     * @param widget a widget
     */
    public open fun addSuffix(widget: Widget): Unit =
        adw_action_row_add_suffix(adwActionRowPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Gets the subtitle for @self.
     *
     * @return the subtitle for @self
     */
    public open fun getSubtitle(): String? = adw_action_row_get_subtitle(adwActionRowPointer.reinterpret())?.toKString()

    /**
     * Removes a child from @self.
     *
     * @param widget the child to be removed
     */
    public open fun remove(widget: Widget): Unit =
        adw_action_row_remove(adwActionRowPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Sets the subtitle for @self.
     *
     * The subtitle is interpreted as Pango markup unless
     * [property@PreferencesRow:use-markup] is set to `FALSE`.
     *
     * @param subtitle the subtitle
     */
    public open fun setSubtitle(subtitle: String): Unit =
        adw_action_row_set_subtitle(adwActionRowPointer.reinterpret(), subtitle)

    /**
     * This signal is emitted after the row has been activated.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivated(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activated",
            connectActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ActionRow> {
        override val type: GeneratedClassKGType<ActionRow> =
            GeneratedClassKGType(adw_action_row_get_type()) { ActionRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ActionRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_action_row_get_type()
    }
}

private val connectActivatedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
