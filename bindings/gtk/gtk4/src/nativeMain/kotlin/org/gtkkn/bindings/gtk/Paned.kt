// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkPaned
import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.gtk_paned_get_end_child
import org.gtkkn.native.gtk.gtk_paned_get_position
import org.gtkkn.native.gtk.gtk_paned_get_resize_end_child
import org.gtkkn.native.gtk.gtk_paned_get_resize_start_child
import org.gtkkn.native.gtk.gtk_paned_get_shrink_end_child
import org.gtkkn.native.gtk.gtk_paned_get_shrink_start_child
import org.gtkkn.native.gtk.gtk_paned_get_start_child
import org.gtkkn.native.gtk.gtk_paned_get_type
import org.gtkkn.native.gtk.gtk_paned_get_wide_handle
import org.gtkkn.native.gtk.gtk_paned_new
import org.gtkkn.native.gtk.gtk_paned_set_end_child
import org.gtkkn.native.gtk.gtk_paned_set_position
import org.gtkkn.native.gtk.gtk_paned_set_resize_end_child
import org.gtkkn.native.gtk.gtk_paned_set_resize_start_child
import org.gtkkn.native.gtk.gtk_paned_set_shrink_end_child
import org.gtkkn.native.gtk.gtk_paned_set_shrink_start_child
import org.gtkkn.native.gtk.gtk_paned_set_start_child
import org.gtkkn.native.gtk.gtk_paned_set_wide_handle
import kotlin.Boolean
import kotlin.ULong

/**
 * A widget with two panes, arranged either horizontally or vertically.
 *
 * ![An example GtkPaned](panes.png)
 *
 * The division between the two panes is adjustable by the user
 * by dragging a handle.
 *
 * Child widgets are added to the panes of the widget with
 * [method@Gtk.Paned.set_start_child] and [method@Gtk.Paned.set_end_child].
 * The division between the two children is set by default from the size
 * requests of the children, but it can be adjusted by the user.
 *
 * A paned widget draws a separator between the two child widgets and a
 * small handle that the user can drag to adjust the division. It does not
 * draw any relief around the children or around the separator. (The space
 * in which the separator is called the gutter.) Often, it is useful to put
 * each child inside a [class@Gtk.Frame] so that the gutter appears as a
 * ridge. No separator is drawn if one of the children is missing.
 *
 * Each child has two options that can be set, "resize" and "shrink". If
 * "resize" is true then, when the `GtkPaned` is resized, that child will
 * expand or shrink along with the paned widget. If "shrink" is true, then
 * that child can be made smaller than its requisition by the user.
 * Setting "shrink" to false allows the application to set a minimum size.
 * If "resize" is false for both children, then this is treated as if
 * "resize" is true for both children.
 *
 * The application can set the position of the slider as if it were set
 * by the user, by calling [method@Gtk.Paned.set_position].
 *
 * # CSS nodes
 *
 * ```
 * paned
 * ├── <child>
 * ├── separator[.wide]
 * ╰── <child>
 * ```
 *
 * `GtkPaned` has a main CSS node with name paned, and a subnode for
 * the separator with name separator. The subnode gets a .wide style
 * class when the paned is supposed to be wide.
 *
 * In horizontal orientation, the nodes are arranged based on the text
 * direction, so in left-to-right mode, :first-child will select the
 * leftmost child, while it will select the rightmost child in
 * RTL layouts.
 *
 * ## Creating a paned widget with minimum sizes.
 *
 * ```c
 * GtkWidget *hpaned = gtk_paned_new (GTK_ORIENTATION_HORIZONTAL);
 * GtkWidget *frame1 = gtk_frame_new (NULL);
 * GtkWidget *frame2 = gtk_frame_new (NULL);
 *
 * gtk_widget_set_size_request (hpaned, 200, -1);
 *
 * gtk_paned_set_start_child (GTK_PANED (hpaned), frame1);
 * gtk_paned_set_resize_start_child (GTK_PANED (hpaned), TRUE);
 * gtk_paned_set_shrink_start_child (GTK_PANED (hpaned), FALSE);
 * gtk_widget_set_size_request (frame1, 50, -1);
 *
 * gtk_paned_set_end_child (GTK_PANED (hpaned), frame2);
 * gtk_paned_set_resize_end_child (GTK_PANED (hpaned), FALSE);
 * gtk_paned_set_shrink_end_child (GTK_PANED (hpaned), FALSE);
 * gtk_widget_set_size_request (frame2, 50, -1);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `max-position`: Property has no getter nor setter
 * - method `min-position`: Property has no getter nor setter
 * - method `position-set`: Property has no getter nor setter
 */
public open class Paned(pointer: CPointer<GtkPaned>) :
    Widget(pointer.reinterpret()),
    AccessibleRange,
    Orientable,
    KGTyped {
    public val gtkPanedPointer: CPointer<GtkPaned>
        get() = gPointer.reinterpret()

    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The second child.
     */
    public open var endChild: Widget?
        /**
         * Retrieves the end child of the given `GtkPaned`.
         *
         * @return the end child widget
         */
        get() = gtk_paned_get_end_child(gtkPanedPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the end child of @paned to @child.
         *
         * If @child is `NULL`, the existing child will be removed.
         *
         * @param child the widget to add
         */
        set(child) = gtk_paned_set_end_child(gtkPanedPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Position of the separator in pixels, from the left/top.
     */
    public open var position: gint
        /**
         * Obtains the position of the divider between the two panes.
         *
         * @return the position of the divider, in pixels
         */
        get() = gtk_paned_get_position(gtkPanedPointer.reinterpret())

        /**
         * Sets the position of the divider between the two panes.
         *
         * @param position pixel position of divider, a negative value means that the position
         *   is unset
         */
        set(position) = gtk_paned_set_position(gtkPanedPointer.reinterpret(), position)

    /**
     * Determines whether the second child expands and shrinks
     * along with the paned widget.
     */
    public open var resizeEndChild: Boolean
        /**
         * Returns whether the [property@Gtk.Paned:end-child] can be resized.
         *
         * @return true if the end child is resizable
         */
        get() = gtk_paned_get_resize_end_child(gtkPanedPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the [property@Gtk.Paned:end-child] can be resized.
         *
         * @param resize true to let the end child be resized
         */
        set(resize) = gtk_paned_set_resize_end_child(gtkPanedPointer.reinterpret(), resize.asGBoolean())

    /**
     * Determines whether the first child expands and shrinks
     * along with the paned widget.
     */
    public open var resizeStartChild: Boolean
        /**
         * Returns whether the [property@Gtk.Paned:start-child] can be resized.
         *
         * @return true if the start child is resizable
         */
        get() = gtk_paned_get_resize_start_child(gtkPanedPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the [property@Gtk.Paned:start-child] can be resized.
         *
         * @param resize true to let the start child be resized
         */
        set(resize) = gtk_paned_set_resize_start_child(gtkPanedPointer.reinterpret(), resize.asGBoolean())

    /**
     * Determines whether the second child can be made smaller
     * than its requisition.
     */
    public open var shrinkEndChild: Boolean
        /**
         * Returns whether the [property@Gtk.Paned:end-child] can shrink.
         *
         * @return true if the end child is shrinkable
         */
        get() = gtk_paned_get_shrink_end_child(gtkPanedPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the [property@Gtk.Paned:end-child] can shrink.
         *
         * @param resize true to let the end child be shrunk
         */
        set(resize) = gtk_paned_set_shrink_end_child(gtkPanedPointer.reinterpret(), resize.asGBoolean())

    /**
     * Determines whether the first child can be made smaller
     * than its requisition.
     */
    public open var shrinkStartChild: Boolean
        /**
         * Returns whether the [property@Gtk.Paned:start-child] can shrink.
         *
         * @return true if the start child is shrinkable
         */
        get() = gtk_paned_get_shrink_start_child(gtkPanedPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the [property@Gtk.Paned:start-child] can shrink.
         *
         * @param resize true to let the start child be shrunk
         */
        set(resize) = gtk_paned_set_shrink_start_child(gtkPanedPointer.reinterpret(), resize.asGBoolean())

    /**
     * The first child.
     */
    public open var startChild: Widget?
        /**
         * Retrieves the start child of the given `GtkPaned`.
         *
         * @return the start child widget
         */
        get() = gtk_paned_get_start_child(gtkPanedPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the start child of @paned to @child.
         *
         * If @child is `NULL`, the existing child will be removed.
         *
         * @param child the widget to add
         */
        set(child) = gtk_paned_set_start_child(gtkPanedPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether the `GtkPaned` should provide a stronger visual separation.
     *
     * For example, this could be set when a paned contains two
     * [class@Gtk.Notebook]s, whose tab rows would otherwise merge visually.
     */
    public open var wideHandle: Boolean
        /**
         * Gets whether the separator should be wide.
         *
         * @return true if the paned should have a wide handle
         */
        get() = gtk_paned_get_wide_handle(gtkPanedPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the separator should be wide.
         *
         * @param wide the new value for the [property@Gtk.Paned:wide-handle] property
         */
        set(wide) = gtk_paned_set_wide_handle(gtkPanedPointer.reinterpret(), wide.asGBoolean())

    /**
     * Creates a new `GtkPaned` widget.
     *
     * @param orientation the paned’s orientation.
     * @return the newly created paned widget
     */
    public constructor(orientation: Orientation) : this(gtk_paned_new(orientation.nativeValue)!!.reinterpret())

    /**
     * Emitted to accept the current position of the handle when
     * moving it using key bindings.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Return</kbd> or
     * <kbd>Space</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectAcceptPosition(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "accept-position",
            connectAcceptPositionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to cancel moving the position of the handle using key
     * bindings.
     *
     * The position of the handle will be reset to the value prior to
     * moving it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Escape</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectCancelPosition(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cancel-position",
            connectCancelPositionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to cycle the focus between the children of the paned.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding is <kbd>F6</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `reversed` whether cycling backward or forward
     */
    public fun connectCycleChildFocus(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (reversed: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "cycle-child-focus",
        connectCycleChildFocusFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted to cycle whether the paned should grab focus to allow
     * the user to change position of the handle by using key bindings.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>F8</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `reversed` whether cycling backward or forward
     */
    public fun connectCycleHandleFocus(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (reversed: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "cycle-handle-focus",
        connectCycleHandleFocusFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted to move the handle with key bindings.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `scrollType` a `GtkScrollType`
     */
    public fun connectMoveHandle(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (scrollType: ScrollType) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "move-handle",
        connectMoveHandleFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted to accept the current position of the handle and then
     * move focus to the next widget in the focus chain.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding is <kbd>Tab</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectToggleHandleFocus(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "toggle-handle-focus",
            connectToggleHandleFocusFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Paned> {
        override val type: GeneratedClassKGType<Paned> =
            GeneratedClassKGType(gtk_paned_get_type()) { Paned(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Paned
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_paned_get_type()
    }
}

private val connectAcceptPositionFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val connectCancelPositionFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val connectCycleChildFocusFunc: CPointer<CFunction<(gboolean) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            reversed: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(reversed: Boolean) -> Boolean>().get().invoke(reversed.asBoolean()).asGBoolean()
    }
        .reinterpret()

private val connectCycleHandleFocusFunc: CPointer<CFunction<(gboolean) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            reversed: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(reversed: Boolean) -> Boolean>().get().invoke(reversed.asBoolean()).asGBoolean()
    }
        .reinterpret()

private val connectMoveHandleFunc: CPointer<CFunction<(GtkScrollType) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            scrollType: GtkScrollType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(scrollType: ScrollType) -> Boolean>().get().invoke(
            scrollType.run {
                ScrollType.fromNativeValue(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectToggleHandleFocusFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()
