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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkMenuButton
import org.gtkkn.native.gtk.gtk_menu_button_get_active
import org.gtkkn.native.gtk.gtk_menu_button_get_always_show_arrow
import org.gtkkn.native.gtk.gtk_menu_button_get_can_shrink
import org.gtkkn.native.gtk.gtk_menu_button_get_child
import org.gtkkn.native.gtk.gtk_menu_button_get_direction
import org.gtkkn.native.gtk.gtk_menu_button_get_has_frame
import org.gtkkn.native.gtk.gtk_menu_button_get_icon_name
import org.gtkkn.native.gtk.gtk_menu_button_get_label
import org.gtkkn.native.gtk.gtk_menu_button_get_menu_model
import org.gtkkn.native.gtk.gtk_menu_button_get_popover
import org.gtkkn.native.gtk.gtk_menu_button_get_primary
import org.gtkkn.native.gtk.gtk_menu_button_get_type
import org.gtkkn.native.gtk.gtk_menu_button_get_use_underline
import org.gtkkn.native.gtk.gtk_menu_button_new
import org.gtkkn.native.gtk.gtk_menu_button_popdown
import org.gtkkn.native.gtk.gtk_menu_button_popup
import org.gtkkn.native.gtk.gtk_menu_button_set_active
import org.gtkkn.native.gtk.gtk_menu_button_set_always_show_arrow
import org.gtkkn.native.gtk.gtk_menu_button_set_can_shrink
import org.gtkkn.native.gtk.gtk_menu_button_set_child
import org.gtkkn.native.gtk.gtk_menu_button_set_create_popup_func
import org.gtkkn.native.gtk.gtk_menu_button_set_direction
import org.gtkkn.native.gtk.gtk_menu_button_set_has_frame
import org.gtkkn.native.gtk.gtk_menu_button_set_icon_name
import org.gtkkn.native.gtk.gtk_menu_button_set_label
import org.gtkkn.native.gtk.gtk_menu_button_set_menu_model
import org.gtkkn.native.gtk.gtk_menu_button_set_popover
import org.gtkkn.native.gtk.gtk_menu_button_set_primary
import org.gtkkn.native.gtk.gtk_menu_button_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkMenuButton` widget is used to display a popup when clicked.
 *
 * ![An example GtkMenuButton](menu-button.png)
 *
 * This popup can be provided either as a `GtkPopover` or as an abstract
 * `GMenuModel`.
 *
 * The `GtkMenuButton` widget can show either an icon (set with the
 * [property@Gtk.MenuButton:icon-name] property) or a label (set with the
 * [property@Gtk.MenuButton:label] property). If neither is explicitly set,
 * a [class@Gtk.Image] is automatically created, using an arrow image oriented
 * according to [property@Gtk.MenuButton:direction] or the generic
 * “open-menu-symbolic” icon if the direction is not set.
 *
 * The positioning of the popup is determined by the
 * [property@Gtk.MenuButton:direction] property of the menu button.
 *
 * For menus, the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties of the menu are also taken into account. For example, when the
 * direction is %GTK_ARROW_DOWN and the horizontal alignment is %GTK_ALIGN_START,
 * the menu will be positioned below the button, with the starting edge
 * (depending on the text direction) of the menu aligned with the starting
 * edge of the button. If there is not enough space below the button, the
 * menu is popped up above the button instead. If the alignment would move
 * part of the menu offscreen, it is “pushed in”.
 *
 * |           | start                | center                | end                |
 * | -         | ---                  | ---                   | ---                |
 * | **down**  | ![](down-start.png)  | ![](down-center.png)  | ![](down-end.png)  |
 * | **up**    | ![](up-start.png)    | ![](up-center.png)    | ![](up-end.png)    |
 * | **left**  | ![](left-start.png)  | ![](left-center.png)  | ![](left-end.png)  |
 * | **right** | ![](right-start.png) | ![](right-center.png) | ![](right-end.png) |
 *
 * # CSS nodes
 *
 * ```
 * menubutton
 * ╰── button.toggle
 *     ╰── <content>
 *          ╰── [arrow]
 * ```
 *
 * `GtkMenuButton` has a single CSS node with name `menubutton`
 * which contains a `button` node with a `.toggle` style class.
 *
 * If the button contains an icon, it will have the `.image-button` style class,
 * if it contains text, it will have `.text-button` style class. If an arrow is
 * visible in addition to an icon, text or a custom child, it will also have
 * `.arrow-button` style class.
 *
 * Inside the toggle button content, there is an `arrow` node for
 * the indicator, which will carry one of the `.none`, `.up`, `.down`,
 * `.left` or `.right` style classes to indicate the direction that
 * the menu will appear in. The CSS is expected to provide a suitable
 * image for each of these cases using the `-gtk-icon-source` property.
 *
 * Optionally, the `menubutton` node can carry the `.circular` style class
 * to request a round appearance.
 *
 * # Accessibility
 *
 * `GtkMenuButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 *
 * ## Skipped during bindings generation
 *
 * - method `icon-name`: Property TypeInfo of getter and setter do not match
 * - method `label`: Property TypeInfo of getter and setter do not match
 * - method `popover`: Property TypeInfo of getter and setter do not match
 */
public open class MenuButton(public val gtkMenuButtonPointer: CPointer<GtkMenuButton>) :
    Widget(gtkMenuButtonPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the menu button is active.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open var active: Boolean
        /**
         * Returns whether the menu button is active.
         *
         * @return TRUE if the button is active
         * @since 4.10
         */
        get() = gtk_menu_button_get_active(gtkMenuButtonPointer).asBoolean()

        /**
         * Sets whether the menu button is active.
         *
         * @param active whether the menu button is active
         * @since 4.10
         */
        @GtkVersion4_10
        set(active) = gtk_menu_button_set_active(gtkMenuButtonPointer, active.asGBoolean())

    /**
     * Whether to show a dropdown arrow even when using an icon or a custom child.
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public open var alwaysShowArrow: Boolean
        /**
         * Gets whether to show a dropdown arrow even when using an icon or a custom
         * child.
         *
         * @return whether to show a dropdown arrow even when using an icon or a custom
         * child.
         * @since 4.4
         */
        get() = gtk_menu_button_get_always_show_arrow(gtkMenuButtonPointer).asBoolean()

        /**
         * Sets whether to show a dropdown arrow even when using an icon or a custom
         * child.
         *
         * @param alwaysShowArrow whether to show a dropdown arrow even when using an icon
         * or a custom child
         * @since 4.4
         */
        @GtkVersion4_4
        set(alwaysShowArrow) = gtk_menu_button_set_always_show_arrow(gtkMenuButtonPointer, alwaysShowArrow.asGBoolean())

    /**
     * Whether the size of the button can be made smaller than the natural
     * size of its contents.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var canShrink: Boolean
        /**
         * Retrieves whether the button can be smaller than the natural
         * size of its contents.
         *
         * @return true if the button can shrink, and false otherwise
         * @since 4.12
         */
        get() = gtk_menu_button_get_can_shrink(gtkMenuButtonPointer).asBoolean()

        /**
         * Sets whether the button size can be smaller than the natural size of
         * its contents.
         *
         * For text buttons, setting @can_shrink to true will ellipsize the label.
         *
         * For icon buttons, this function has no effect.
         *
         * @param canShrink whether the button can shrink
         * @since 4.12
         */
        @GtkVersion4_12
        set(canShrink) = gtk_menu_button_set_can_shrink(gtkMenuButtonPointer, canShrink.asGBoolean())

    /**
     * The child widget.
     *
     * @since 4.6
     */
    @GtkVersion4_6
    public open var child: Widget?
        /**
         * Gets the child widget of @menu_button.
         *
         * @return the child widget of @menu_button
         * @since 4.6
         */
        get() = gtk_menu_button_get_child(gtkMenuButtonPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @menu_button.
         *
         * Setting a child resets [property@Gtk.MenuButton:label] and
         * [property@Gtk.MenuButton:icon-name].
         *
         * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
         * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
         * will be shown next to the child.
         *
         * @param child the child widget
         * @since 4.6
         */
        @GtkVersion4_6
        set(child) = gtk_menu_button_set_child(gtkMenuButtonPointer, child?.gtkWidgetPointer)

    /**
     * The `GtkArrowType` representing the direction in which the
     * menu or popover will be popped out.
     */
    public open var direction: ArrowType
        /**
         * Returns the direction the popup will be pointing at when popped up.
         *
         * @return a `GtkArrowType` value
         */
        get() = gtk_menu_button_get_direction(gtkMenuButtonPointer).run {
            ArrowType.fromNativeValue(this)
        }

        /**
         * Sets the direction in which the popup will be popped up.
         *
         * If the button is automatically populated with an arrow icon,
         * its direction will be changed to match.
         *
         * If the does not fit in the available space in the given direction,
         * GTK will its best to keep it inside the screen and fully visible.
         *
         * If you pass %GTK_ARROW_NONE for a @direction, the popup will behave
         * as if you passed %GTK_ARROW_DOWN (although you won’t see any arrows).
         *
         * @param direction a `GtkArrowType`
         */
        set(direction) = gtk_menu_button_set_direction(gtkMenuButtonPointer, direction.nativeValue)

    /**
     * Whether the button has a frame.
     */
    public open var hasFrame: Boolean
        /**
         * Returns whether the button has a frame.
         *
         * @return true if the button has a frame
         */
        get() = gtk_menu_button_get_has_frame(gtkMenuButtonPointer).asBoolean()

        /**
         * Sets the style of the button.
         *
         * @param hasFrame whether the button should have a visible frame
         */
        set(hasFrame) = gtk_menu_button_set_has_frame(gtkMenuButtonPointer, hasFrame.asGBoolean())

    /**
     * The `GMenuModel` from which the popup will be created.
     *
     * See [method@Gtk.MenuButton.set_menu_model] for the interaction
     * with the [property@Gtk.MenuButton:popover] property.
     */
    public open var menuModel: MenuModel?
        /**
         * Returns the `GMenuModel` used to generate the popup.
         *
         * @return a `GMenuModel`
         */
        get() = gtk_menu_button_get_menu_model(gtkMenuButtonPointer)?.run {
            MenuModel.MenuModelImpl(this)
        }

        /**
         * Sets the `GMenuModel` from which the popup will be constructed.
         *
         * If @menu_model is null, the button is disabled.
         *
         * A [class@Gtk.Popover] will be created from the menu model with
         * [ctor@Gtk.PopoverMenu.new_from_model]. Actions will be connected
         * as documented for this function.
         *
         * If [property@Gtk.MenuButton:popover] is already set, it will be
         * dissociated from the @menu_button, and the property is set to null.
         *
         * @param menuModel a `GMenuModel`, or null to unset and disable the
         *   button
         */
        set(menuModel) = gtk_menu_button_set_menu_model(gtkMenuButtonPointer, menuModel?.gioMenuModelPointer)

    /**
     * Whether the menu button acts as a primary menu.
     *
     * Primary menus can be opened using the <kbd>F10</kbd> key
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public open var primary: Boolean
        /**
         * Returns whether the menu button acts as a primary menu.
         *
         * @return true if the button is a primary menu
         * @since 4.4
         */
        get() = gtk_menu_button_get_primary(gtkMenuButtonPointer).asBoolean()

        /**
         * Sets whether menu button acts as a primary menu.
         *
         * Primary menus can be opened with the <kbd>F10</kbd> key.
         *
         * @param primary whether the menubutton should act as a primary menu
         * @since 4.4
         */
        @GtkVersion4_4
        set(primary) = gtk_menu_button_set_primary(gtkMenuButtonPointer, primary.asGBoolean())

    /**
     * If set an underscore in the text indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Returns whether an embedded underline in the text indicates a
         * mnemonic.
         *
         * @return true whether an embedded underline in the text indicates
         *   the mnemonic accelerator keys.
         */
        get() = gtk_menu_button_get_use_underline(gtkMenuButtonPointer).asBoolean()

        /**
         * If true, an underline in the text indicates a mnemonic.
         *
         * @param useUnderline true if underlines in the text indicate mnemonics
         */
        set(useUnderline) = gtk_menu_button_set_use_underline(gtkMenuButtonPointer, useUnderline.asGBoolean())

    /**
     * Creates a new `GtkMenuButton` widget with downwards-pointing
     * arrow as the only child.
     *
     * You can replace the child widget with another `GtkWidget`
     * should you wish to.
     *
     * @return The newly created `GtkMenuButton`
     */
    public constructor() : this(gtk_menu_button_new()!!.reinterpret())

    /**
     * Gets the name of the icon shown in the button.
     *
     * @return the name of the icon shown in the button
     */
    public open fun getIconName(): String? = gtk_menu_button_get_icon_name(gtkMenuButtonPointer)?.toKString()

    /**
     * Gets the label shown in the button
     *
     * @return the label shown in the button
     */
    public open fun getLabel(): String? = gtk_menu_button_get_label(gtkMenuButtonPointer)?.toKString()

    /**
     * Returns the `GtkPopover` that pops out of the button.
     *
     * If the button is not using a `GtkPopover`, this function
     * returns null.
     *
     * @return a `GtkPopover` or null
     */
    public open fun getPopover(): Popover? = gtk_menu_button_get_popover(gtkMenuButtonPointer)?.run {
        Popover(this)
    }

    /**
     * Dismiss the menu.
     */
    public open fun popdown(): Unit = gtk_menu_button_popdown(gtkMenuButtonPointer)

    /**
     * Pop up the menu.
     */
    public open fun popup(): Unit = gtk_menu_button_popup(gtkMenuButtonPointer)

    /**
     * Sets @func to be called when a popup is about to be shown.
     *
     * @func should use one of
     *
     *  - [method@Gtk.MenuButton.set_popover]
     *  - [method@Gtk.MenuButton.set_menu_model]
     *
     * to set a popup for @menu_button.
     * If @func is non-null, @menu_button will always be sensitive.
     *
     * Using this function will not reset the menu widget attached to
     * @menu_button. Instead, this can be done manually in @func.
     *
     * @param func function to call when a popup is about to
     *   be shown, but none has been provided via other means, or null
     *   to reset to default behavior.
     */
    public open fun setCreatePopupFunc(func: MenuButtonCreatePopupFunc?): Unit = gtk_menu_button_set_create_popup_func(
        gtkMenuButtonPointer,
        func?.let {
            MenuButtonCreatePopupFuncFunc.reinterpret()
        },
        func?.let { StableRef.create(func).asCPointer() },
        func?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Sets the name of an icon to show inside the menu button.
     *
     * Setting icon name resets [property@Gtk.MenuButton:label] and
     * [property@Gtk.MenuButton:child].
     *
     * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
     * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
     * will be shown next to the icon.
     *
     * @param iconName the icon name
     */
    public open fun setIconName(iconName: String): Unit = gtk_menu_button_set_icon_name(gtkMenuButtonPointer, iconName)

    /**
     * Sets the label to show inside the menu button.
     *
     * Setting a label resets [property@Gtk.MenuButton:icon-name] and
     * [property@Gtk.MenuButton:child].
     *
     * If [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
     * arrow will be shown next to the label.
     *
     * @param label the label
     */
    public open fun setLabel(label: String): Unit = gtk_menu_button_set_label(gtkMenuButtonPointer, label)

    /**
     * Sets the `GtkPopover` that will be popped up when the @menu_button is clicked.
     *
     * If @popover is null, the button is disabled.
     *
     * If [property@Gtk.MenuButton:menu-model] is set, the menu model is dissociated
     * from the @menu_button, and the property is set to null.
     *
     * @param popover a `GtkPopover`, or null to unset and disable the button
     */
    public open fun setPopover(popover: Widget? = null): Unit =
        gtk_menu_button_set_popover(gtkMenuButtonPointer, popover?.gtkWidgetPointer)

    /**
     * Emitted to when the menu button is activated.
     *
     * The `::activate` signal on `GtkMenuButton` is an action signal and
     * emitting it causes the button to pop up its menu.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.4
     */
    @GtkVersion4_4
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkMenuButtonPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public fun emitActivate() {
        g_signal_emit_by_name(gtkMenuButtonPointer.reinterpret(), "activate")
    }

    public companion object : TypeCompanion<MenuButton> {
        override val type: GeneratedClassKGType<MenuButton> =
            GeneratedClassKGType(getTypeOrNull("gtk_menu_button_get_type")!!) { MenuButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MenuButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_menu_button_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
