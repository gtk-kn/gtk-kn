// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Rectangle
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
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkPopover
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_popover_get_autohide
import org.gtkkn.native.gtk.gtk_popover_get_cascade_popdown
import org.gtkkn.native.gtk.gtk_popover_get_child
import org.gtkkn.native.gtk.gtk_popover_get_has_arrow
import org.gtkkn.native.gtk.gtk_popover_get_mnemonics_visible
import org.gtkkn.native.gtk.gtk_popover_get_pointing_to
import org.gtkkn.native.gtk.gtk_popover_get_position
import org.gtkkn.native.gtk.gtk_popover_get_type
import org.gtkkn.native.gtk.gtk_popover_new
import org.gtkkn.native.gtk.gtk_popover_popdown
import org.gtkkn.native.gtk.gtk_popover_popup
import org.gtkkn.native.gtk.gtk_popover_present
import org.gtkkn.native.gtk.gtk_popover_set_autohide
import org.gtkkn.native.gtk.gtk_popover_set_cascade_popdown
import org.gtkkn.native.gtk.gtk_popover_set_child
import org.gtkkn.native.gtk.gtk_popover_set_default_widget
import org.gtkkn.native.gtk.gtk_popover_set_has_arrow
import org.gtkkn.native.gtk.gtk_popover_set_mnemonics_visible
import org.gtkkn.native.gtk.gtk_popover_set_offset
import org.gtkkn.native.gtk.gtk_popover_set_pointing_to
import org.gtkkn.native.gtk.gtk_popover_set_position
import kotlin.Boolean
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkPopover` is a bubble-like context popup.
 *
 * ![An example GtkPopover](popover.png)
 *
 * It is primarily meant to provide context-dependent information
 * or options. Popovers are attached to a parent widget. By default,
 * they point to the whole widget area, although this behavior can be
 * changed with [method@Gtk.Popover.set_pointing_to].
 *
 * The position of a popover relative to the widget it is attached to
 * can also be changed with [method@Gtk.Popover.set_position]
 *
 * By default, `GtkPopover` performs a grab, in order to ensure input
 * events get redirected to it while it is shown, and also so the popover
 * is dismissed in the expected situations (clicks outside the popover,
 * or the Escape key being pressed). If no such modal behavior is desired
 * on a popover, [method@Gtk.Popover.set_autohide] may be called on it to
 * tweak its behavior.
 *
 * ## GtkPopover as menu replacement
 *
 * `GtkPopover` is often used to replace menus. The best was to do this
 * is to use the [class@Gtk.PopoverMenu] subclass which supports being
 * populated from a `GMenuModel` with [ctor@Gtk.PopoverMenu.new_from_model].
 *
 * ```xml
 * <section>
 *   <attribute name="display-hint">horizontal-buttons</attribute>
 *   <item>
 *     <attribute name="label">Cut</attribute>
 *     <attribute name="action">app.cut</attribute>
 *     <attribute name="verb-icon">edit-cut-symbolic</attribute>
 *   </item>
 *   <item>
 *     <attribute name="label">Copy</attribute>
 *     <attribute name="action">app.copy</attribute>
 *     <attribute name="verb-icon">edit-copy-symbolic</attribute>
 *   </item>
 *   <item>
 *     <attribute name="label">Paste</attribute>
 *     <attribute name="action">app.paste</attribute>
 *     <attribute name="verb-icon">edit-paste-symbolic</attribute>
 *   </item>
 * </section>
 * ```
 *
 * # CSS nodes
 *
 * ```
 * popover.background[.menu]
 * ├── arrow
 * ╰── contents
 *     ╰── <child>
 * ```
 *
 * `GtkPopover` has a main node with name `popover`, an arrow with name `arrow`,
 * and another node for the content named `contents`. The `popover` node always
 * gets the `.background` style class. It also gets the `.menu` style class
 * if the popover is menu-like, e.g. is a [class@Gtk.PopoverMenu].
 *
 * Particular uses of `GtkPopover`, such as touch selection popups or
 * magnifiers in `GtkEntry` or `GtkTextView` get style classes like
 * `.touch-selection` or `.magnifier` to differentiate from plain popovers.
 *
 * When styling a popover directly, the `popover` node should usually
 * not have any background. The visible part of the popover can have
 * a shadow. To specify it in CSS, set the box-shadow of the `contents` node.
 *
 * Note that, in order to accomplish appropriate arrow visuals, `GtkPopover`
 * uses custom drawing for the `arrow` node. This makes it possible for the
 * arrow to change its shape dynamically, but it also limits the possibilities
 * of styling it using CSS. In particular, the `arrow` gets drawn over the
 * `content` node's border and shadow, so they look like one shape, which
 * means that the border width of the `content` node and the `arrow` node should
 * be the same. The arrow also does not support any border shape other than
 * solid, no border-radius, only one border width (border-bottom-width is
 * used) and no box-shadow.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x_offset`: x_offset: Out parameter is not supported
 * - method `default-widget`: Property has no getter
 * - method `pointing-to`: Property has no getter
 */
public open class Popover(
    pointer: CPointer<GtkPopover>,
) : Widget(pointer.reinterpret()),
    Native,
    ShortcutManager,
    KGTyped {
    public val gtkPopoverPointer: CPointer<GtkPopover>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether to dismiss the popover on outside clicks.
     */
    public open var autohide: Boolean
        /**
         * Returns whether the popover is modal.
         *
         * See [method@Gtk.Popover.set_autohide] for the
         * implications of this.
         *
         * @return true if @popover is modal
         */
        get() = gtk_popover_get_autohide(gtkPopoverPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @popover is modal.
         *
         * A modal popover will grab the keyboard focus on it when being
         * displayed. Focus will wrap around within the popover. Clicking
         * outside the popover area or pressing Esc will dismiss the popover.
         *
         * Called this function on an already showing popup with a new
         * autohide value different from the current one, will cause the
         * popup to be hidden.
         *
         * @param autohide true to dismiss the popover on outside clicks
         */
        set(autohide) = gtk_popover_set_autohide(gtkPopoverPointer.reinterpret(), autohide.asGBoolean())

    /**
     * Whether the popover pops down after a child popover.
     *
     * This is used to implement the expected behavior of submenus.
     */
    public open var cascadePopdown: Boolean
        /**
         * Returns whether the popover will close after a modal child is closed.
         *
         * @return true if @popover will close after a modal child.
         */
        get() = gtk_popover_get_cascade_popdown(gtkPopoverPointer.reinterpret()).asBoolean()

        /**
         * If @cascade_popdown is true, the popover will be
         * closed when a child modal popover is closed.
         *
         * If false, @popover will stay visible.
         *
         * @param cascadePopdown true if the popover should follow a child closing
         */
        set(
            cascadePopdown
        ) = gtk_popover_set_cascade_popdown(gtkPopoverPointer.reinterpret(), cascadePopdown.asGBoolean())

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @popover.
         *
         * @return the child widget of @popover
         */
        get() =
            gtk_popover_get_child(gtkPopoverPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @popover.
         *
         * @param child the child widget
         */
        set(child) = gtk_popover_set_child(gtkPopoverPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether to draw an arrow.
     */
    public open var hasArrow: Boolean
        /**
         * Gets whether this popover is showing an arrow
         * pointing at the widget that it is relative to.
         *
         * @return whether the popover has an arrow
         */
        get() = gtk_popover_get_has_arrow(gtkPopoverPointer.reinterpret()).asBoolean()

        /**
         * Sets whether this popover should draw an arrow
         * pointing at the widget it is relative to.
         *
         * @param hasArrow true to draw an arrow
         */
        set(hasArrow) = gtk_popover_set_has_arrow(gtkPopoverPointer.reinterpret(), hasArrow.asGBoolean())

    /**
     * Whether mnemonics are currently visible in this popover.
     */
    public open var mnemonicsVisible: Boolean
        /**
         * Gets whether mnemonics are visible.
         *
         * @return true if mnemonics are supposed to be visible
         *   in this popover
         */
        get() = gtk_popover_get_mnemonics_visible(gtkPopoverPointer.reinterpret()).asBoolean()

        /**
         * Sets whether mnemonics should be visible.
         *
         * @param mnemonicsVisible the new value
         */
        set(
            mnemonicsVisible
        ) = gtk_popover_set_mnemonics_visible(gtkPopoverPointer.reinterpret(), mnemonicsVisible.asGBoolean())

    /**
     * How to place the popover, relative to its parent.
     */
    public open var position: PositionType
        /**
         * Returns the preferred position of @popover.
         *
         * @return The preferred position.
         */
        get() =
            gtk_popover_get_position(gtkPopoverPointer.reinterpret()).run {
                PositionType.fromNativeValue(this)
            }

        /**
         * Sets the preferred position for @popover to appear.
         *
         * If the @popover is currently visible, it will be immediately
         * updated.
         *
         * This preference will be respected where possible, although
         * on lack of space (eg. if close to the window edges), the
         * `GtkPopover` may choose to appear on the opposite side.
         *
         * @param position preferred popover position
         */
        set(position) = gtk_popover_set_position(gtkPopoverPointer.reinterpret(), position.nativeValue)

    /**
     * Creates a new `GtkPopover`.
     *
     * @return the new `GtkPopover`
     */
    public constructor() : this(gtk_popover_new()!!.reinterpret())

    /**
     * Returns whether the popover is modal.
     *
     * See [method@Gtk.Popover.set_autohide] for the
     * implications of this.
     *
     * @return true if @popover is modal
     */
    public open fun getAutohide(): Boolean = gtk_popover_get_autohide(gtkPopoverPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the popover will close after a modal child is closed.
     *
     * @return true if @popover will close after a modal child.
     */
    public open fun getCascadePopdown(): Boolean =
        gtk_popover_get_cascade_popdown(gtkPopoverPointer.reinterpret()).asBoolean()

    /**
     * Gets the child widget of @popover.
     *
     * @return the child widget of @popover
     */
    public open fun getChild(): Widget? =
        gtk_popover_get_child(gtkPopoverPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether this popover is showing an arrow
     * pointing at the widget that it is relative to.
     *
     * @return whether the popover has an arrow
     */
    public open fun getHasArrow(): Boolean = gtk_popover_get_has_arrow(gtkPopoverPointer.reinterpret()).asBoolean()

    /**
     * Gets whether mnemonics are visible.
     *
     * @return true if mnemonics are supposed to be visible
     *   in this popover
     */
    public open fun getMnemonicsVisible(): Boolean =
        gtk_popover_get_mnemonics_visible(gtkPopoverPointer.reinterpret()).asBoolean()

    /**
     * Gets the rectangle that the popover points to.
     *
     * If a rectangle to point to has been set, this function will
     * return true and fill in @rect with such rectangle, otherwise
     * it will return false and fill in @rect with the parent
     * widget coordinates.
     *
     * @param rect location to store the rectangle
     * @return true if a rectangle to point to was set.
     */
    public open fun getPointingTo(rect: Rectangle): Boolean =
        gtk_popover_get_pointing_to(gtkPopoverPointer.reinterpret(), rect.gdkRectanglePointer.reinterpret()).asBoolean()

    /**
     * Returns the preferred position of @popover.
     *
     * @return The preferred position.
     */
    public open fun getPosition(): PositionType =
        gtk_popover_get_position(gtkPopoverPointer.reinterpret()).run {
            PositionType.fromNativeValue(this)
        }

    /**
     * Pops @popover down.
     *
     * This may have the side-effect of closing a parent popover
     * as well. See [property@Gtk.Popover:cascade-popdown].
     */
    public open fun popdown(): Unit = gtk_popover_popdown(gtkPopoverPointer.reinterpret())

    /**
     * Pops @popover up.
     */
    public open fun popup(): Unit = gtk_popover_popup(gtkPopoverPointer.reinterpret())

    /**
     * Allocate a size for the `GtkPopover`.
     *
     * This function needs to be called in size-allocate by widgets
     * who have a `GtkPopover` as child. When using a layout manager,
     * this is happening automatically.
     *
     * To make a popover appear on screen, use [method@Gtk.Popover.popup].
     */
    public open fun present(): Unit = gtk_popover_present(gtkPopoverPointer.reinterpret())

    /**
     * Sets whether @popover is modal.
     *
     * A modal popover will grab the keyboard focus on it when being
     * displayed. Focus will wrap around within the popover. Clicking
     * outside the popover area or pressing Esc will dismiss the popover.
     *
     * Called this function on an already showing popup with a new
     * autohide value different from the current one, will cause the
     * popup to be hidden.
     *
     * @param autohide true to dismiss the popover on outside clicks
     */
    public open fun setAutohide(autohide: Boolean): Unit =
        gtk_popover_set_autohide(gtkPopoverPointer.reinterpret(), autohide.asGBoolean())

    /**
     * If @cascade_popdown is true, the popover will be
     * closed when a child modal popover is closed.
     *
     * If false, @popover will stay visible.
     *
     * @param cascadePopdown true if the popover should follow a child closing
     */
    public open fun setCascadePopdown(cascadePopdown: Boolean): Unit =
        gtk_popover_set_cascade_popdown(gtkPopoverPointer.reinterpret(), cascadePopdown.asGBoolean())

    /**
     * Sets the child widget of @popover.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_popover_set_child(gtkPopoverPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets the default widget of a `GtkPopover`.
     *
     * The default widget is the widget that’s activated when the user
     * presses Enter in a dialog (for example). This function sets or
     * unsets the default widget for a `GtkPopover`.
     *
     * @param widget a child widget of @popover to set as
     *   the default, or null to unset the default widget for the popover
     */
    public open fun setDefaultWidget(widget: Widget? = null): Unit =
        gtk_popover_set_default_widget(gtkPopoverPointer.reinterpret(), widget?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets whether this popover should draw an arrow
     * pointing at the widget it is relative to.
     *
     * @param hasArrow true to draw an arrow
     */
    public open fun setHasArrow(hasArrow: Boolean): Unit =
        gtk_popover_set_has_arrow(gtkPopoverPointer.reinterpret(), hasArrow.asGBoolean())

    /**
     * Sets whether mnemonics should be visible.
     *
     * @param mnemonicsVisible the new value
     */
    public open fun setMnemonicsVisible(mnemonicsVisible: Boolean): Unit =
        gtk_popover_set_mnemonics_visible(gtkPopoverPointer.reinterpret(), mnemonicsVisible.asGBoolean())

    /**
     * Sets the offset to use when calculating the position
     * of the popover.
     *
     * These values are used when preparing the [struct@Gdk.PopupLayout]
     * for positioning the popover.
     *
     * @param xOffset the x offset to adjust the position by
     * @param yOffset the y offset to adjust the position by
     */
    public open fun setOffset(
        xOffset: Int,
        yOffset: Int,
    ): Unit = gtk_popover_set_offset(gtkPopoverPointer.reinterpret(), xOffset, yOffset)

    /**
     * Sets the rectangle that @popover points to.
     *
     * This is in the coordinate space of the @popover parent.
     *
     * @param rect rectangle to point to
     */
    public open fun setPointingTo(rect: Rectangle? = null): Unit =
        gtk_popover_set_pointing_to(gtkPopoverPointer.reinterpret(), rect?.gdkRectanglePointer?.reinterpret())

    /**
     * Sets the preferred position for @popover to appear.
     *
     * If the @popover is currently visible, it will be immediately
     * updated.
     *
     * This preference will be respected where possible, although
     * on lack of space (eg. if close to the window edges), the
     * `GtkPopover` may choose to appear on the opposite side.
     *
     * @param position preferred popover position
     */
    public open fun setPosition(position: PositionType): Unit =
        gtk_popover_set_position(gtkPopoverPointer.reinterpret(), position.nativeValue)

    /**
     * Emitted whend the user activates the default widget.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivateDefault(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-default",
            connectActivateDefaultFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the popover is closed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClosed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "closed",
            connectClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Popover> {
        override val type: GeneratedClassKGType<Popover> =
            GeneratedClassKGType(gtk_popover_get_type()) { Popover(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateDefaultFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectClosedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
