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
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDragAction
import org.gtkkn.native.gdk.GdkDrop
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkDropTargetAsync
import org.gtkkn.native.gtk.gtk_drop_target_async_get_actions
import org.gtkkn.native.gtk.gtk_drop_target_async_get_formats
import org.gtkkn.native.gtk.gtk_drop_target_async_get_type
import org.gtkkn.native.gtk.gtk_drop_target_async_new
import org.gtkkn.native.gtk.gtk_drop_target_async_reject_drop
import org.gtkkn.native.gtk.gtk_drop_target_async_set_actions
import org.gtkkn.native.gtk.gtk_drop_target_async_set_formats
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkDropTargetAsync` is an event controller to receive Drag-and-Drop
 * operations, asynchronously.
 *
 * It is the more complete but also more complex method of handling drop
 * operations compared to [class@Gtk.DropTarget], and you should only use
 * it if `GtkDropTarget` doesn't provide all the features you need.
 *
 * To use a `GtkDropTargetAsync` to receive drops on a widget, you create
 * a `GtkDropTargetAsync` object, configure which data formats and actions
 * you support, connect to its signals, and then attach it to the widget
 * with [method@Gtk.Widget.add_controller].
 *
 * During a drag operation, the first signal that a `GtkDropTargetAsync`
 * emits is [signal@Gtk.DropTargetAsync::accept], which is meant to determine
 * whether the target is a possible drop site for the ongoing drop. The
 * default handler for the ::accept signal accepts the drop if it finds
 * a compatible data format and an action that is supported on both sides.
 *
 * If it is, and the widget becomes a target, you will receive a
 * [signal@Gtk.DropTargetAsync::drag-enter] signal, followed by
 * [signal@Gtk.DropTargetAsync::drag-motion] signals as the pointer moves,
 * optionally a [signal@Gtk.DropTargetAsync::drop] signal when a drop happens,
 * and finally a [signal@Gtk.DropTargetAsync::drag-leave] signal when the
 * pointer moves off the widget.
 *
 * The ::drag-enter and ::drag-motion handler return a `GdkDragAction`
 * to update the status of the ongoing operation. The ::drop handler
 * should decide if it ultimately accepts the drop and if it does, it
 * should initiate the data transfer and finish the operation by calling
 * [method@Gdk.Drop.finish].
 *
 * Between the ::drag-enter and ::drag-leave signals the widget is a
 * current drop target, and will receive the %GTK_STATE_FLAG_DROP_ACTIVE
 * state, which can be used by themes to style the widget as a drop target.
 */
public open class DropTargetAsync(pointer: CPointer<GtkDropTargetAsync>) :
    EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkDropTargetAsyncPointer: CPointer<GtkDropTargetAsync>
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
        get() = gtk_drop_target_async_get_actions(gtkDropTargetAsyncPointer.reinterpret()).run {
            DragAction(this)
        }

        /**
         * Sets the actions that this drop target supports.
         *
         * @param actions the supported actions
         */
        set(actions) = gtk_drop_target_async_set_actions(gtkDropTargetAsyncPointer.reinterpret(), actions.mask)

    /**
     * The `GdkContentFormats` that determines the supported data formats.
     */
    public open var formats: ContentFormats?
        /**
         * Gets the data formats that this drop target accepts.
         *
         * If the result is null, all formats are expected to be supported.
         *
         * @return the supported data formats
         */
        get() = gtk_drop_target_async_get_formats(gtkDropTargetAsyncPointer.reinterpret())?.run {
            ContentFormats(reinterpret())
        }

        /**
         * Sets the data formats that this drop target will accept.
         *
         * @param formats the supported data formats or null for any format
         */
        set(
            formats
        ) = gtk_drop_target_async_set_formats(gtkDropTargetAsyncPointer.reinterpret(), formats?.gPointer?.reinterpret())

    /**
     * Creates a new `GtkDropTargetAsync` object.
     *
     * @param formats the supported data formats
     * @param actions the supported actions
     * @return the new `GtkDropTargetAsync`
     */
    public constructor(
        formats: ContentFormats? = null,
        actions: DragAction,
    ) : this(gtk_drop_target_async_new(formats?.gPointer?.reinterpret(), actions.mask)!!.reinterpret())

    /**
     * Sets the @drop as not accepted on this drag site.
     *
     * This function should be used when delaying the decision
     * on whether to accept a drag or not until after reading
     * the data.
     *
     * @param drop the `GdkDrop` of an ongoing drag operation
     */
    public open fun rejectDrop(drop: Drop): Unit =
        gtk_drop_target_async_reject_drop(gtkDropTargetAsyncPointer.reinterpret(), drop.gdkDropPointer.reinterpret())

    /**
     * Emitted on the drop site when a drop operation is about to begin.
     *
     * If the drop is not accepted, false will be returned and the drop target
     * will ignore the drop. If true is returned, the drop is accepted for now
     * but may be rejected later via a call to [method@Gtk.DropTargetAsync.reject_drop]
     * or ultimately by returning false from a [signal@Gtk.DropTargetAsync::drop]
     * handler.
     *
     * The default handler for this signal decides whether to accept the drop
     * based on the formats provided by the @drop.
     *
     * If the decision whether the drop will be accepted or rejected needs
     * further processing, such as inspecting the data, this function should
     * return true and proceed as is @drop was accepted and if it decides to
     * reject the drop later, it should call [method@Gtk.DropTargetAsync.reject_drop].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drop` the `GdkDrop`. Returns true if @drop is accepted
     */
    public fun connectAccept(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (drop: Drop) -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "accept",
            connectAcceptFunc.reinterpret(),
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
     * @param handler the Callback to connect. Params: `drop` the `GdkDrop`; `x` the x coordinate of the current pointer position; `y` the y coordinate of the current pointer position. Returns Preferred action for this drag operation.
     */
    public fun connectDragEnter(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            drop: Drop,
            x: gdouble,
            y: gdouble,
        ) -> DragAction,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "drag-enter",
        connectDragEnterFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted on the drop site when the pointer leaves the widget.
     *
     * Its main purpose it to undo things done in
     * `GtkDropTargetAsync`::drag-enter.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drop` the `GdkDrop`
     */
    public fun connectDragLeave(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (drop: Drop) -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drag-leave",
            connectDragLeaveFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted while the pointer is moving over the drop target.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drop` the `GdkDrop`; `x` the x coordinate of the current pointer position; `y` the y coordinate of the current pointer position. Returns Preferred action for this drag operation.
     */
    public fun connectDragMotion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            drop: Drop,
            x: gdouble,
            y: gdouble,
        ) -> DragAction,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "drag-motion",
        connectDragMotionFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted on the drop site when the user drops the data onto the widget.
     *
     * The signal handler must determine whether the pointer position is in a
     * drop zone or not. If it is not in a drop zone, it returns false and no
     * further processing is necessary.
     *
     * Otherwise, the handler returns true. In this case, this handler will
     * accept the drop. The handler must ensure that [method@Gdk.Drop.finish]
     * is called to let the source know that the drop is done. The call to
     * [method@Gdk.Drop.finish] must only be done when all data has been received.
     *
     * To receive the data, use one of the read functions provided by
     * [class@Gdk.Drop] such as [method@Gdk.Drop.read_async] or
     * [method@Gdk.Drop.read_value_async].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drop` the `GdkDrop`; `x` the x coordinate of the current pointer position; `y` the y coordinate of the current pointer position. Returns whether the drop is accepted at the given pointer position
     */
    public fun connectDrop(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            drop: Drop,
            x: gdouble,
            y: gdouble,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "drop",
        connectDropFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<DropTargetAsync> {
        override val type: GeneratedClassKGType<DropTargetAsync> =
            GeneratedClassKGType(gtk_drop_target_async_get_type()) { DropTargetAsync(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of DropTargetAsync
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_drop_target_async_get_type()
    }
}

private val connectAcceptFunc: CPointer<CFunction<(CPointer<GdkDrop>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            drop: CPointer<GdkDrop>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drop: Drop) -> Boolean>().get().invoke(
            drop!!.run {
                Drop(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectDragEnterFunc: CPointer<
    CFunction<
        (
            CPointer<GdkDrop>,
            gdouble,
            gdouble,
        ) -> GdkDragAction
        >
    > = staticCFunction {
        _: COpaquePointer,
        drop: CPointer<GdkDrop>?,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            drop: Drop,
            x: gdouble,
            y: gdouble,
        ) -> DragAction
        >().get().invoke(
        drop!!.run {
            Drop(reinterpret())
        },
        x,
        y
    ).mask
}
    .reinterpret()

private val connectDragLeaveFunc: CPointer<CFunction<(CPointer<GdkDrop>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drop: CPointer<GdkDrop>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drop: Drop) -> Unit>().get().invoke(
            drop!!.run {
                Drop(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectDragMotionFunc: CPointer<
    CFunction<
        (
            CPointer<GdkDrop>,
            gdouble,
            gdouble,
        ) -> GdkDragAction
        >
    > = staticCFunction {
        _: COpaquePointer,
        drop: CPointer<GdkDrop>?,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            drop: Drop,
            x: gdouble,
            y: gdouble,
        ) -> DragAction
        >().get().invoke(
        drop!!.run {
            Drop(reinterpret())
        },
        x,
        y
    ).mask
}
    .reinterpret()

private val connectDropFunc: CPointer<
    CFunction<
        (
            CPointer<GdkDrop>,
            gdouble,
            gdouble,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        drop: CPointer<GdkDrop>?,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            drop: Drop,
            x: gdouble,
            y: gdouble,
        ) -> Boolean
        >().get().invoke(
        drop!!.run {
            Drop(reinterpret())
        },
        x,
        y
    ).asGBoolean()
}
    .reinterpret()
