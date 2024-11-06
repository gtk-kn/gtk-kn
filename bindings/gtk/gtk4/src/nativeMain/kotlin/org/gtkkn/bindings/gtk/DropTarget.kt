// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ContentFormats
import org.gtkkn.bindings.gdk.DragAction
import org.gtkkn.bindings.gdk.Drop
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDragAction
import org.gtkkn.native.gdk.GdkDrop
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkDropTarget
import org.gtkkn.native.gtk.gtk_drop_target_get_actions
import org.gtkkn.native.gtk.gtk_drop_target_get_current_drop
import org.gtkkn.native.gtk.gtk_drop_target_get_drop
import org.gtkkn.native.gtk.gtk_drop_target_get_formats
import org.gtkkn.native.gtk.gtk_drop_target_get_preload
import org.gtkkn.native.gtk.gtk_drop_target_get_type
import org.gtkkn.native.gtk.gtk_drop_target_get_value
import org.gtkkn.native.gtk.gtk_drop_target_new
import org.gtkkn.native.gtk.gtk_drop_target_reject
import org.gtkkn.native.gtk.gtk_drop_target_set_actions
import org.gtkkn.native.gtk.gtk_drop_target_set_preload
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkDropTarget` is an event controller to receive Drag-and-Drop operations.
 *
 * The most basic way to use a `GtkDropTarget` to receive drops on a
 * widget is to create it via [ctor@Gtk.DropTarget.new], passing in the
 * `GType` of the data you want to receive and connect to the
 * [signal@Gtk.DropTarget::drop] signal to receive the data:
 *
 * ```c
 * static gboolean
 * on_drop (GtkDropTarget *target,
 *          const GValue  *value,
 *          double         x,
 *          double         y,
 *          gpointer       data)
 * {
 *   MyWidget *self = data;
 *
 *   // Call the appropriate setter depending on the type of data
 *   // that we received
 *   if (G_VALUE_HOLDS (value, G_TYPE_FILE))
 *     my_widget_set_file (self, g_value_get_object (value));
 *   else if (G_VALUE_HOLDS (value, GDK_TYPE_PIXBUF))
 *     my_widget_set_pixbuf (self, g_value_get_object (value));
 *   else
 *     return FALSE;
 *
 *   return TRUE;
 * }
 *
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   GtkDropTarget *target =
 *     gtk_drop_target_new (G_TYPE_INVALID, GDK_ACTION_COPY);
 *
 *   // This widget accepts two types of drop types: GFile objects
 *   // and GdkPixbuf objects
 *   gtk_drop_target_set_gtypes (target, (GType [2]) {
 *     G_TYPE_FILE,
 *     GDK_TYPE_PIXBUF,
 *   }, 2);
 *
 *   g_signal_connect (target, "drop", G_CALLBACK (on_drop), self);
 *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (target));
 * }
 * ```
 *
 * `GtkDropTarget` supports more options, such as:
 *
 *  * rejecting potential drops via the [signal@Gtk.DropTarget::accept] signal
 *    and the [method@Gtk.DropTarget.reject] function to let other drop
 *    targets handle the drop
 *  * tracking an ongoing drag operation before the drop via the
 *    [signal@Gtk.DropTarget::enter], [signal@Gtk.DropTarget::motion] and
 *    [signal@Gtk.DropTarget::leave] signals
 *  * configuring how to receive data by setting the
 *    [property@Gtk.DropTarget:preload] property and listening for its
 *    availability via the [property@Gtk.DropTarget:value] property
 *
 * However, `GtkDropTarget` is ultimately modeled in a synchronous way
 * and only supports data transferred via `GType`. If you want full control
 * over an ongoing drop, the [class@Gtk.DropTargetAsync] object gives you
 * this ability.
 *
 * While a pointer is dragged over the drop target's widget and the drop
 * has not been rejected, that widget will receive the
 * %GTK_STATE_FLAG_DROP_ACTIVE state, which can be used to style the widget.
 *
 * If you are not interested in receiving the drop, but just want to update
 * UI state during a Drag-and-Drop operation (e.g. switching tabs), you can
 * use [class@Gtk.DropControllerMotion].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_types`: n_types: Out parameter is not supported
 * - parameter `types`: Array parameter of type GType is not supported
 */
public open class DropTarget(
    pointer: CPointer<GtkDropTarget>,
) : EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkDropTargetPointer: CPointer<GtkDropTarget>
        get() = gPointer.reinterpret()

    /**
     * The `GdkDragActions` that this drop target supports.
     */
    public open var actions: DragAction
        /**
         * Gets the actions that this drop target supports.
         *
         * @return the actions that this drop target supports
         */
        get() =
            gtk_drop_target_get_actions(gtkDropTargetPointer.reinterpret()).run {
                DragAction(this)
            }

        /**
         * Sets the actions that this drop target supports.
         *
         * @param actions the supported actions
         */
        set(actions) = gtk_drop_target_set_actions(gtkDropTargetPointer.reinterpret(), actions.mask)

    /**
     * The `GdkDrop` that is currently being performed.
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public open val currentDrop: Drop?
        /**
         * Gets the currently handled drop operation.
         *
         * If no drop operation is going on, null is returned.
         *
         * @return The current drop
         * @since 4.4
         */
        get() =
            gtk_drop_target_get_current_drop(gtkDropTargetPointer.reinterpret())?.run {
                Drop(reinterpret())
            }

    /**
     * The `GdkContentFormats` that determine the supported data formats.
     */
    public open val formats: ContentFormats?
        /**
         * Gets the data formats that this drop target accepts.
         *
         * If the result is null, all formats are expected to be supported.
         *
         * @return the supported data formats
         */
        get() =
            gtk_drop_target_get_formats(gtkDropTargetPointer.reinterpret())?.run {
                ContentFormats(reinterpret())
            }

    /**
     * Whether the drop data should be preloaded when the pointer is only
     * hovering over the widget but has not been released.
     *
     * Setting this property allows finer grained reaction to an ongoing
     * drop at the cost of loading more data.
     *
     * The default value for this property is false to avoid downloading
     * huge amounts of data by accident.
     *
     * For example, if somebody drags a full document of gigabytes of text
     * from a text editor across a widget with a preloading drop target,
     * this data will be downloaded, even if the data is ultimately dropped
     * elsewhere.
     *
     * For a lot of data formats, the amount of data is very small (like
     * %GDK_TYPE_RGBA), so enabling this property does not hurt at all.
     * And for local-only Drag-and-Drop operations, no data transfer is done,
     * so enabling it there is free.
     */
    public open var preload: Boolean
        /**
         * Gets whether data should be preloaded on hover.
         *
         * @return true if drop data should be preloaded
         */
        get() = gtk_drop_target_get_preload(gtkDropTargetPointer.reinterpret()).asBoolean()

        /**
         * Sets whether data should be preloaded on hover.
         *
         * @param preload true to preload drop data
         */
        set(preload) = gtk_drop_target_set_preload(gtkDropTargetPointer.reinterpret(), preload.asGBoolean())

    /**
     * The value for this drop operation.
     *
     * This is null if the data has not been loaded yet or no drop
     * operation is going on.
     *
     * Data may be available before the [signal@Gtk.DropTarget::drop]
     * signal gets emitted - for example when the [property@Gtk.DropTarget:preload]
     * property is set. You can use the ::notify signal to be notified
     * of available data.
     */
    public open val `value`: Value?
        /**
         * Gets the current drop data, as a `GValue`.
         *
         * @return The current drop data
         */
        get() =
            gtk_drop_target_get_value(gtkDropTargetPointer.reinterpret())?.run {
                Value(reinterpret())
            }

    /**
     * Creates a new `GtkDropTarget` object.
     *
     * If the drop target should support more than 1 type, pass
     * %G_TYPE_INVALID for @type and then call
     * [method@Gtk.DropTarget.set_gtypes].
     *
     * @param type The supported type or %G_TYPE_INVALID
     * @param actions the supported actions
     * @return the new `GtkDropTarget`
     */
    public constructor(type: ULong, actions: DragAction) : this(gtk_drop_target_new(type, actions.mask)!!.reinterpret())

    /**
     * Gets the actions that this drop target supports.
     *
     * @return the actions that this drop target supports
     */
    public open fun getActions(): DragAction =
        gtk_drop_target_get_actions(gtkDropTargetPointer.reinterpret()).run {
            DragAction(this)
        }

    /**
     * Gets the currently handled drop operation.
     *
     * If no drop operation is going on, null is returned.
     *
     * @return The current drop
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun getCurrentDrop(): Drop? =
        gtk_drop_target_get_current_drop(gtkDropTargetPointer.reinterpret())?.run {
            Drop(reinterpret())
        }

    /**
     * Gets the currently handled drop operation.
     *
     * If no drop operation is going on, null is returned.
     *
     * @return The current drop
     */
    public open fun getDrop(): Drop? =
        gtk_drop_target_get_drop(gtkDropTargetPointer.reinterpret())?.run {
            Drop(reinterpret())
        }

    /**
     * Gets the data formats that this drop target accepts.
     *
     * If the result is null, all formats are expected to be supported.
     *
     * @return the supported data formats
     */
    public open fun getFormats(): ContentFormats? =
        gtk_drop_target_get_formats(gtkDropTargetPointer.reinterpret())?.run {
            ContentFormats(reinterpret())
        }

    /**
     * Gets whether data should be preloaded on hover.
     *
     * @return true if drop data should be preloaded
     */
    public open fun getPreload(): Boolean = gtk_drop_target_get_preload(gtkDropTargetPointer.reinterpret()).asBoolean()

    /**
     * Gets the current drop data, as a `GValue`.
     *
     * @return The current drop data
     */
    public open fun getValue(): Value? =
        gtk_drop_target_get_value(gtkDropTargetPointer.reinterpret())?.run {
            Value(reinterpret())
        }

    /**
     * Rejects the ongoing drop operation.
     *
     * If no drop operation is ongoing, i.e when [property@Gtk.DropTarget:current-drop]
     * is null, this function does nothing.
     *
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     */
    public open fun reject(): Unit = gtk_drop_target_reject(gtkDropTargetPointer.reinterpret())

    /**
     * Sets the actions that this drop target supports.
     *
     * @param actions the supported actions
     */
    public open fun setActions(actions: DragAction): Unit =
        gtk_drop_target_set_actions(gtkDropTargetPointer.reinterpret(), actions.mask)

    /**
     * Sets whether data should be preloaded on hover.
     *
     * @param preload true to preload drop data
     */
    public open fun setPreload(preload: Boolean): Unit =
        gtk_drop_target_set_preload(gtkDropTargetPointer.reinterpret(), preload.asGBoolean())

    /**
     * Emitted on the drop site when a drop operation is about to begin.
     *
     * If the drop is not accepted, false will be returned and the drop target
     * will ignore the drop. If true is returned, the drop is accepted for now
     * but may be rejected later via a call to [method@Gtk.DropTarget.reject]
     * or ultimately by returning false from a [signal@Gtk.DropTarget::drop]
     * handler.
     *
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the @drop.
     *
     * If the decision whether the drop will be accepted or rejected depends
     * on the data, this function should return true, the
     * [property@Gtk.DropTarget:preload] property should be set and the value
     * should be inspected via the ::notify:value signal, calling
     * [method@Gtk.DropTarget.reject] if required.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drop` the `GdkDrop`. Returns true if @drop is accepted
     */
    public fun connectAccept(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drop: Drop) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "accept",
            connectAcceptFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     *
     * The signal handler must determine whether the pointer position is in
     * a drop zone or not. If it is not in a drop zone, it returns false
     * and no further processing is necessary.
     *
     * Otherwise, the handler returns true. In this case, this handler will
     * accept the drop. The handler is responsible for using the given @value
     * and performing the drop operation.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the `GValue` being dropped; `x` the x coordinate of the current pointer position; `y` the y coordinate of the current pointer position. Returns whether the drop was accepted at the given pointer position
     */
    public fun connectDrop(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            `value`: Value,
            x: Double,
            y: Double,
        ) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drop",
            connectDropFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted on the drop site when the pointer enters the widget.
     *
     * It can be used to set up custom highlighting.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the x coordinate of the current pointer position; `y` the y coordinate of the current pointer position. Returns Preferred action for this drag operation or 0 if
     *   dropping is not supported at the current @x,@y location.
     */
    public fun connectEnter(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: Double, y: Double) -> DragAction,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "enter",
            connectEnterFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted on the drop site when the pointer leaves the widget.
     *
     * Its main purpose it to undo things done in
     * [signal@Gtk.DropTarget::enter].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLeave(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "leave",
            connectLeaveFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted while the pointer is moving over the drop target.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the x coordinate of the current pointer position; `y` the y coordinate of the current pointer position. Returns Preferred action for this drag operation or 0 if
     *   dropping is not supported at the current @x,@y location.
     */
    public fun connectMotion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: Double, y: Double) -> DragAction,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "motion",
            connectMotionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<DropTarget> {
        override val type: GeneratedClassKGType<DropTarget> =
            GeneratedClassKGType(gtk_drop_target_get_type()) { DropTarget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectAcceptFunc: CPointer<CFunction<(CPointer<GdkDrop>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            drop: CPointer<GdkDrop>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(drop: Drop) -> Boolean>()
            .get()
            .invoke(
                drop!!.run {
                    Drop(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

private val connectDropFunc: CPointer<
    CFunction<
        (
            CPointer<GValue>,
            Double,
            Double,
        ) -> Int
    >
> =
    staticCFunction {
            _: COpaquePointer,
            `value`: CPointer<GValue>?,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    `value`: Value,
                    x: Double,
                    y: Double,
                ) -> Boolean
            >()
            .get()
            .invoke(
                `value`!!.run {
                    Value(reinterpret())
                },
                x,
                y
            ).asGBoolean()
    }.reinterpret()

private val connectEnterFunc: CPointer<CFunction<(Double, Double) -> GdkDragAction>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(x: Double, y: Double) -> DragAction>()
            .get()
            .invoke(x, y)
            .mask
    }.reinterpret()

private val connectLeaveFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectMotionFunc: CPointer<CFunction<(Double, Double) -> GdkDragAction>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(x: Double, y: Double) -> DragAction>()
            .get()
            .invoke(x, y)
            .mask
    }.reinterpret()
