// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
public open class MenuButton(
    pointer: CPointer<GtkMenuButton>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkMenuButtonPointer: CPointer<GtkMenuButton>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the menu button is active.
     *
     * @since 4.10
     */
    public open var active: Boolean
        /**
         * Returns whether the menu button is active.
         *
         * @return TRUE if the button is active
         * @since 4.10
         */
        get() = gtk_menu_button_get_active(gtkMenuButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the menu button is active.
         *
         * @param active whether the menu button is active
         * @since 4.10
         */
        set(active) = gtk_menu_button_set_active(gtkMenuButtonPointer.reinterpret(), active.asGBoolean())

    /**
     * Whether to show a dropdown arrow even when using an icon or a custom child.
     *
     * @since 4.4
     */
    public open var alwaysShowArrow: Boolean
        /**
         * Gets whether to show a dropdown arrow even when using an icon or a custom
         * child.
         *
         * @return whether to show a dropdown arrow even when using an icon or a custom
         * child.
         * @since 4.4
         */
        get() = gtk_menu_button_get_always_show_arrow(gtkMenuButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to show a dropdown arrow even when using an icon or a custom
         * child.
         *
         * @param alwaysShowArrow whether to show a dropdown arrow even when using an icon
         * or a custom child
         * @since 4.4
         */
        set(
            alwaysShowArrow
        ) = gtk_menu_button_set_always_show_arrow(gtkMenuButtonPointer.reinterpret(), alwaysShowArrow.asGBoolean())

    /**
     * Whether the size of the button can be made smaller than the natural
     * size of its contents.
     *
     * @since 4.12
     */
    public open var canShrink: Boolean
        /**
         * Retrieves whether the button can be smaller than the natural
         * size of its contents.
         *
         * @return true if the button can shrink, and false otherwise
         * @since 4.12
         */
        get() = gtk_menu_button_get_can_shrink(gtkMenuButtonPointer.reinterpret()).asBoolean()

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
        set(canShrink) = gtk_menu_button_set_can_shrink(gtkMenuButtonPointer.reinterpret(), canShrink.asGBoolean())

    /**
     * The child widget.
     *
     * @since 4.6
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @menu_button.
         *
         * @return the child widget of @menu_button
         * @since 4.6
         */
        get() =
            gtk_menu_button_get_child(gtkMenuButtonPointer.reinterpret())?.run {
                Widget(reinterpret())
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
        set(
            child
        ) = gtk_menu_button_set_child(gtkMenuButtonPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

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
        get() =
            gtk_menu_button_get_direction(gtkMenuButtonPointer.reinterpret()).run {
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
        set(direction) = gtk_menu_button_set_direction(gtkMenuButtonPointer.reinterpret(), direction.nativeValue)

    /**
     * Whether the button has a frame.
     */
    public open var hasFrame: Boolean
        /**
         * Returns whether the button has a frame.
         *
         * @return true if the button has a frame
         */
        get() = gtk_menu_button_get_has_frame(gtkMenuButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets the style of the button.
         *
         * @param hasFrame whether the button should have a visible frame
         */
        set(hasFrame) = gtk_menu_button_set_has_frame(gtkMenuButtonPointer.reinterpret(), hasFrame.asGBoolean())

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
        get() =
            gtk_menu_button_get_menu_model(gtkMenuButtonPointer.reinterpret())?.run {
                MenuModel(reinterpret())
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
        set(
            menuModel
        ) =
            gtk_menu_button_set_menu_model(
                gtkMenuButtonPointer.reinterpret(),
                menuModel?.gioMenuModelPointer?.reinterpret()
            )

    /**
     * Whether the menu button acts as a primary menu.
     *
     * Primary menus can be opened using the <kbd>F10</kbd> key
     *
     * @since 4.4
     */
    public open var primary: Boolean
        /**
         * Returns whether the menu button acts as a primary menu.
         *
         * @return true if the button is a primary menu
         * @since 4.4
         */
        get() = gtk_menu_button_get_primary(gtkMenuButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets whether menu button acts as a primary menu.
         *
         * Primary menus can be opened with the <kbd>F10</kbd> key.
         *
         * @param primary whether the menubutton should act as a primary menu
         * @since 4.4
         */
        set(primary) = gtk_menu_button_set_primary(gtkMenuButtonPointer.reinterpret(), primary.asGBoolean())

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
        get() = gtk_menu_button_get_use_underline(gtkMenuButtonPointer.reinterpret()).asBoolean()

        /**
         * If true, an underline in the text indicates a mnemonic.
         *
         * @param useUnderline true if underlines in the text indicate mnemonics
         */
        set(
            useUnderline
        ) = gtk_menu_button_set_use_underline(gtkMenuButtonPointer.reinterpret(), useUnderline.asGBoolean())

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
     * Returns whether the menu button is active.
     *
     * @return TRUE if the button is active
     * @since 4.10
     */
    public open fun getActive(): Boolean = gtk_menu_button_get_active(gtkMenuButtonPointer.reinterpret()).asBoolean()

    /**
     * Gets whether to show a dropdown arrow even when using an icon or a custom
     * child.
     *
     * @return whether to show a dropdown arrow even when using an icon or a custom
     * child.
     * @since 4.4
     */
    public open fun getAlwaysShowArrow(): Boolean =
        gtk_menu_button_get_always_show_arrow(gtkMenuButtonPointer.reinterpret()).asBoolean()

    /**
     * Retrieves whether the button can be smaller than the natural
     * size of its contents.
     *
     * @return true if the button can shrink, and false otherwise
     * @since 4.12
     */
    public open fun getCanShrink(): Boolean =
        gtk_menu_button_get_can_shrink(gtkMenuButtonPointer.reinterpret()).asBoolean()

    /**
     * Gets the child widget of @menu_button.
     *
     * @return the child widget of @menu_button
     * @since 4.6
     */
    public open fun getChild(): Widget? =
        gtk_menu_button_get_child(gtkMenuButtonPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the direction the popup will be pointing at when popped up.
     *
     * @return a `GtkArrowType` value
     */
    public open fun getDirection_(): ArrowType =
        gtk_menu_button_get_direction(gtkMenuButtonPointer.reinterpret()).run {
            ArrowType.fromNativeValue(this)
        }

    /**
     * Returns whether the button has a frame.
     *
     * @return true if the button has a frame
     */
    public open fun getHasFrame(): Boolean =
        gtk_menu_button_get_has_frame(gtkMenuButtonPointer.reinterpret()).asBoolean()

    /**
     * Gets the name of the icon shown in the button.
     *
     * @return the name of the icon shown in the button
     */
    public open fun getIconName(): String? =
        gtk_menu_button_get_icon_name(gtkMenuButtonPointer.reinterpret())?.toKString()

    /**
     * Gets the label shown in the button
     *
     * @return the label shown in the button
     */
    public open fun getLabel(): String? = gtk_menu_button_get_label(gtkMenuButtonPointer.reinterpret())?.toKString()

    /**
     * Returns the `GMenuModel` used to generate the popup.
     *
     * @return a `GMenuModel`
     */
    public open fun getMenuModel(): MenuModel? =
        gtk_menu_button_get_menu_model(gtkMenuButtonPointer.reinterpret())?.run {
            MenuModel(reinterpret())
        }

    /**
     * Returns the `GtkPopover` that pops out of the button.
     *
     * If the button is not using a `GtkPopover`, this function
     * returns null.
     *
     * @return a `GtkPopover` or null
     */
    public open fun getPopover(): Popover? =
        gtk_menu_button_get_popover(gtkMenuButtonPointer.reinterpret())?.run {
            Popover(reinterpret())
        }

    /**
     * Returns whether the menu button acts as a primary menu.
     *
     * @return true if the button is a primary menu
     * @since 4.4
     */
    public open fun getPrimary(): Boolean = gtk_menu_button_get_primary(gtkMenuButtonPointer.reinterpret()).asBoolean()

    /**
     * Returns whether an embedded underline in the text indicates a
     * mnemonic.
     *
     * @return true whether an embedded underline in the text indicates
     *   the mnemonic accelerator keys.
     */
    public open fun getUseUnderline(): Boolean =
        gtk_menu_button_get_use_underline(gtkMenuButtonPointer.reinterpret()).asBoolean()

    /**
     * Dismiss the menu.
     */
    public open fun popdown(): Unit = gtk_menu_button_popdown(gtkMenuButtonPointer.reinterpret())

    /**
     * Pop up the menu.
     */
    public open fun popup(): Unit = gtk_menu_button_popup(gtkMenuButtonPointer.reinterpret())

    /**
     * Sets whether the menu button is active.
     *
     * @param active whether the menu button is active
     * @since 4.10
     */
    public open fun setActive(active: Boolean): Unit =
        gtk_menu_button_set_active(gtkMenuButtonPointer.reinterpret(), active.asGBoolean())

    /**
     * Sets whether to show a dropdown arrow even when using an icon or a custom
     * child.
     *
     * @param alwaysShowArrow whether to show a dropdown arrow even when using an icon
     * or a custom child
     * @since 4.4
     */
    public open fun setAlwaysShowArrow(alwaysShowArrow: Boolean): Unit =
        gtk_menu_button_set_always_show_arrow(gtkMenuButtonPointer.reinterpret(), alwaysShowArrow.asGBoolean())

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
    public open fun setCanShrink(canShrink: Boolean): Unit =
        gtk_menu_button_set_can_shrink(gtkMenuButtonPointer.reinterpret(), canShrink.asGBoolean())

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
    public open fun setChild(child: Widget? = null): Unit =
        gtk_menu_button_set_child(gtkMenuButtonPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

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
    public open fun setCreatePopupFunc(func: MenuButtonCreatePopupFunc): Unit =
        gtk_menu_button_set_create_popup_func(
            gtkMenuButtonPointer.reinterpret(),
            MenuButtonCreatePopupFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

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
    public open fun setDirection_(direction: ArrowType): Unit =
        gtk_menu_button_set_direction(gtkMenuButtonPointer.reinterpret(), direction.nativeValue)

    /**
     * Sets the style of the button.
     *
     * @param hasFrame whether the button should have a visible frame
     */
    public open fun setHasFrame(hasFrame: Boolean): Unit =
        gtk_menu_button_set_has_frame(gtkMenuButtonPointer.reinterpret(), hasFrame.asGBoolean())

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
    public open fun setIconName(iconName: String): Unit =
        gtk_menu_button_set_icon_name(gtkMenuButtonPointer.reinterpret(), iconName)

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
    public open fun setLabel(label: String): Unit = gtk_menu_button_set_label(gtkMenuButtonPointer.reinterpret(), label)

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
    public open fun setMenuModel(menuModel: MenuModel? = null): Unit =
        gtk_menu_button_set_menu_model(
            gtkMenuButtonPointer.reinterpret(),
            menuModel?.gioMenuModelPointer?.reinterpret()
        )

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
        gtk_menu_button_set_popover(gtkMenuButtonPointer.reinterpret(), popover?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets whether menu button acts as a primary menu.
     *
     * Primary menus can be opened with the <kbd>F10</kbd> key.
     *
     * @param primary whether the menubutton should act as a primary menu
     * @since 4.4
     */
    public open fun setPrimary(primary: Boolean): Unit =
        gtk_menu_button_set_primary(gtkMenuButtonPointer.reinterpret(), primary.asGBoolean())

    /**
     * If true, an underline in the text indicates a mnemonic.
     *
     * @param useUnderline true if underlines in the text indicate mnemonics
     */
    public open fun setUseUnderline(useUnderline: Boolean): Unit =
        gtk_menu_button_set_use_underline(gtkMenuButtonPointer.reinterpret(), useUnderline.asGBoolean())

    /**
     * Emitted to when the menu button is activated.
     *
     * The `::activate` signal on `GtkMenuButton` is an action signal and
     * emitting it causes the button to pop up its menu.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.4
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<MenuButton> {
        override val type: GeneratedClassKGType<MenuButton> =
            GeneratedClassKGType(gtk_menu_button_get_type()) { MenuButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
