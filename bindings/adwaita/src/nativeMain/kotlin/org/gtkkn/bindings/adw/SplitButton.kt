// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Actionable
import org.gtkkn.bindings.gtk.ArrowType
import org.gtkkn.bindings.gtk.Popover
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwSplitButton
import org.gtkkn.native.adw.adw_split_button_get_can_shrink
import org.gtkkn.native.adw.adw_split_button_get_child
import org.gtkkn.native.adw.adw_split_button_get_direction
import org.gtkkn.native.adw.adw_split_button_get_dropdown_tooltip
import org.gtkkn.native.adw.adw_split_button_get_icon_name
import org.gtkkn.native.adw.adw_split_button_get_label
import org.gtkkn.native.adw.adw_split_button_get_menu_model
import org.gtkkn.native.adw.adw_split_button_get_popover
import org.gtkkn.native.adw.adw_split_button_get_type
import org.gtkkn.native.adw.adw_split_button_get_use_underline
import org.gtkkn.native.adw.adw_split_button_new
import org.gtkkn.native.adw.adw_split_button_popdown
import org.gtkkn.native.adw.adw_split_button_popup
import org.gtkkn.native.adw.adw_split_button_set_can_shrink
import org.gtkkn.native.adw.adw_split_button_set_child
import org.gtkkn.native.adw.adw_split_button_set_direction
import org.gtkkn.native.adw.adw_split_button_set_dropdown_tooltip
import org.gtkkn.native.adw.adw_split_button_set_icon_name
import org.gtkkn.native.adw.adw_split_button_set_label
import org.gtkkn.native.adw.adw_split_button_set_menu_model
import org.gtkkn.native.adw.adw_split_button_set_popover
import org.gtkkn.native.adw.adw_split_button_set_use_underline
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A combined button and dropdown widget.
 *
 * <picture>
 *   <source srcset="split-button-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="split-button.png" alt="split-button">
 * </picture>
 *
 * `AdwSplitButton` is typically used to present a set of actions in a menu,
 * but allow access to one of them with a single click.
 *
 * The API is very similar to [class@Gtk.Button] and [class@Gtk.MenuButton], see
 * their documentation for details.
 *
 * ## CSS nodes
 *
 * ```
 * splitbutton[.image-button][.text-button]
 * ├── button
 * │   ╰── <content>
 * ├── separator
 * ╰── menubutton
 *     ╰── button.toggle
 *         ╰── arrow
 * ```
 *
 * `AdwSplitButton`'s CSS node is called `splitbutton`. It contains the css
 * nodes: `button`, `separator`, `menubutton`. See [class@Gtk.MenuButton]
 * documentation for the `menubutton` contents.
 *
 * The main CSS node will contain the `.image-button` or `.text-button` style
 * classes matching the button contents. The nested button nodes will never
 * contain them.
 *
 * ## Accessibility
 *
 * `AdwSplitButton` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * ## Skipped during bindings generation
 *
 * - method `icon-name`: Property TypeInfo of getter and setter do not match
 * - method `label`: Property TypeInfo of getter and setter do not match
 */
public class SplitButton(public val adwSplitButtonPointer: CPointer<AdwSplitButton>) :
    Widget(adwSplitButtonPointer.reinterpret()),
    Actionable,
    KGTyped {
    init {
        Adw
    }

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the button can be smaller than the natural size of its contents.
     *
     * If set to `TRUE`, the label will ellipsize.
     *
     * See [property@Gtk.Button:can-shrink] and
     * [property@Gtk.MenuButton:can-shrink].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var canShrink: Boolean
        /**
         * gets whether the button can be smaller than the natural size of its contents.
         *
         * @return whether the button can shrink
         * @since 1.4
         */
        get() = adw_split_button_get_can_shrink(adwSplitButtonPointer).asBoolean()

        /**
         * Sets whether the button can be smaller than the natural size of its contents.
         *
         * If set to `TRUE`, the label will ellipsize.
         *
         * See [method@Gtk.Button.set_can_shrink] and
         * [method@Gtk.MenuButton.set_can_shrink].
         *
         * @param canShrink whether the button can shrink
         * @since 1.4
         */
        @AdwVersion1_4
        set(canShrink) = adw_split_button_set_can_shrink(adwSplitButtonPointer, canShrink.asGBoolean())

    /**
     * The child widget.
     *
     * Setting the child widget will set [property@SplitButton:label] and
     * [property@SplitButton:icon-name] to `NULL`.
     */
    public var child: Widget?
        /**
         * Gets the child widget.
         *
         * @return the child widget
         */
        get() = adw_split_button_get_child(adwSplitButtonPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget.
         *
         * Setting the child widget will set [property@SplitButton:label] and
         * [property@SplitButton:icon-name] to `NULL`.
         *
         * @param child the new child widget
         */
        set(child) = adw_split_button_set_child(adwSplitButtonPointer, child?.gtkWidgetPointer)

    /**
     * The direction in which the popup will be popped up.
     *
     * The dropdown arrow icon will point at the same direction.
     *
     * If the does not fit in the available space in the given direction, GTK will
     * try its best to keep it inside the screen and fully visible.
     *
     * If you pass `GTK_ARROW_NONE`, it's equivalent to `GTK_ARROW_DOWN`.
     */
    public var direction: ArrowType
        /**
         * Gets the direction in which the popup will be popped up.
         *
         * @return the direction
         */
        get() = adw_split_button_get_direction(adwSplitButtonPointer).run {
            ArrowType.fromNativeValue(this)
        }

        /**
         * Sets the direction in which the popup will be popped up.
         *
         * The dropdown arrow icon will point at the same direction.
         *
         * If the does not fit in the available space in the given direction, GTK will
         * try its best to keep it inside the screen and fully visible.
         *
         * If you pass `GTK_ARROW_NONE`, it's equivalent to `GTK_ARROW_DOWN`.
         *
         * @param direction the direction
         */
        set(direction) = adw_split_button_set_direction(adwSplitButtonPointer, direction.nativeValue)

    /**
     * The tooltip of the dropdown button.
     *
     * The tooltip can be marked up with the Pango text markup language.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public var dropdownTooltip: String
        /**
         * Gets the tooltip of the dropdown button of @self.
         *
         * @return the dropdown tooltip of @self
         * @since 1.2
         */
        get() = adw_split_button_get_dropdown_tooltip(adwSplitButtonPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the tooltip of the dropdown button of @self.
         *
         * The tooltip can be marked up with the Pango text markup language.
         *
         * @param tooltip the dropdown tooltip of @self
         * @since 1.2
         */
        @AdwVersion1_2
        set(tooltip) = adw_split_button_set_dropdown_tooltip(adwSplitButtonPointer, tooltip)

    /**
     * The `GMenuModel` from which the popup will be created.
     *
     * If the menu model is `NULL`, the dropdown is disabled.
     *
     * A [class@Gtk.Popover] will be created from the menu model with
     * [ctor@Gtk.PopoverMenu.new_from_model]. Actions will be connected as
     * documented for this function.
     *
     * If [property@SplitButton:popover] is already set, it will be dissociated
     * from the button, and the property is set to `NULL`.
     */
    public var menuModel: MenuModel?
        /**
         * Gets the menu model from which the popup will be created.
         *
         * @return the menu model
         */
        get() = adw_split_button_get_menu_model(adwSplitButtonPointer)?.run {
            InstanceCache.get(this, true) { MenuModel.MenuModelImpl(reinterpret()) }!!
        }

        /**
         * Sets the menu model from which the popup will be created.
         *
         * If the menu model is `NULL`, the dropdown is disabled.
         *
         * A [class@Gtk.Popover] will be created from the menu model with
         * [ctor@Gtk.PopoverMenu.new_from_model]. Actions will be connected as
         * documented for this function.
         *
         * If [property@SplitButton:popover] is already set, it will be dissociated from
         * the button, and the property is set to `NULL`.
         *
         * @param menuModel the menu model
         */
        set(menuModel) = adw_split_button_set_menu_model(adwSplitButtonPointer, menuModel?.gioMenuModelPointer)

    /**
     * The `GtkPopover` that will be popped up when the dropdown is clicked.
     *
     * If the popover is `NULL`, the dropdown is disabled.
     *
     * If [property@SplitButton:menu-model] is set, the menu model is dissociated
     * from the button, and the property is set to `NULL`.
     */
    public var popover: Popover?
        /**
         * Gets the popover that will be popped up when the dropdown is clicked.
         *
         * @return the popover
         */
        get() = adw_split_button_get_popover(adwSplitButtonPointer)?.run {
            InstanceCache.get(this, true) { Popover(reinterpret()) }!!
        }

        /**
         * Sets the popover that will be popped up when the dropdown is clicked.
         *
         * If the popover is `NULL`, the dropdown is disabled.
         *
         * If [property@SplitButton:menu-model] is set, the menu model is dissociated
         * from the button, and the property is set to `NULL`.
         *
         * @param popover the popover
         */
        set(popover) = adw_split_button_set_popover(adwSplitButtonPointer, popover?.gtkPopoverPointer)

    /**
     * Whether an underline in the text indicates a mnemonic.
     *
     * See [property@SplitButton:label].
     */
    public var useUnderline: Boolean
        /**
         * Gets whether an underline in the text indicates a mnemonic.
         *
         * @return whether an underline in the text indicates a mnemonic
         */
        get() = adw_split_button_get_use_underline(adwSplitButtonPointer).asBoolean()

        /**
         * Sets whether an underline in the text indicates a mnemonic.
         *
         * See [property@SplitButton:label].
         *
         * @param useUnderline whether an underline in the text indicates a mnemonic
         */
        set(useUnderline) = adw_split_button_set_use_underline(adwSplitButtonPointer, useUnderline.asGBoolean())

    /**
     * Creates a new `AdwSplitButton`.
     *
     * @return the newly created `AdwSplitButton`
     */
    public constructor() : this(adw_split_button_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Gets the name of the icon used to automatically populate the button.
     *
     * @return the icon name
     */
    public fun getIconName(): String? = adw_split_button_get_icon_name(adwSplitButtonPointer)?.toKString()

    /**
     * Gets the label for @self.
     *
     * @return the label for @self
     */
    public fun getLabel(): String? = adw_split_button_get_label(adwSplitButtonPointer)?.toKString()

    /**
     * Dismisses the menu.
     */
    public fun popdown(): Unit = adw_split_button_popdown(adwSplitButtonPointer)

    /**
     * Pops up the menu.
     */
    public fun popup(): Unit = adw_split_button_popup(adwSplitButtonPointer)

    /**
     * Sets the name of the icon used to automatically populate the button.
     *
     * Setting the icon name will set [property@SplitButton:label] and
     * [property@SplitButton:child] to `NULL`.
     *
     * @param iconName the icon name to set
     */
    public fun setIconName(iconName: String): Unit = adw_split_button_set_icon_name(adwSplitButtonPointer, iconName)

    /**
     * Sets the label for @self.
     *
     * Setting the label will set [property@SplitButton:icon-name] and
     * [property@SplitButton:child] to `NULL`.
     *
     * @param label the label to set
     */
    public fun setLabel(label: String): Unit = adw_split_button_set_label(adwSplitButtonPointer, label)

    /**
     * Emitted to animate press then release.
     *
     * This is an action signal. Applications should never connect to this signal,
     * but use the [signal@SplitButton::clicked] signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwSplitButtonPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(adwSplitButtonPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the button has been activated (pressed and released).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClicked(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwSplitButtonPointer,
            "clicked",
            onClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "clicked" signal. See [onClicked].
     */
    public fun emitClicked() {
        g_signal_emit_by_name(adwSplitButtonPointer.reinterpret(), "clicked")
    }

    public companion object : TypeCompanion<SplitButton> {
        override val type: GeneratedClassKGType<SplitButton> =
            GeneratedClassKGType(getTypeOrNull()!!) { SplitButton(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SplitButton
         *
         * @return the GType
         */
        public fun getType(): GType = adw_split_button_get_type()

        /**
         * Gets the GType of from the symbol `adw_split_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_split_button_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onClickedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
