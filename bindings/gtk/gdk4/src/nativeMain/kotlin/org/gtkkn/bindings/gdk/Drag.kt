// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDrag
import org.gtkkn.native.gdk.GdkDragCancelReason
import org.gtkkn.native.gdk.gdk_drag_begin
import org.gtkkn.native.gdk.gdk_drag_drop_done
import org.gtkkn.native.gdk.gdk_drag_get_actions
import org.gtkkn.native.gdk.gdk_drag_get_content
import org.gtkkn.native.gdk.gdk_drag_get_device
import org.gtkkn.native.gdk.gdk_drag_get_display
import org.gtkkn.native.gdk.gdk_drag_get_drag_surface
import org.gtkkn.native.gdk.gdk_drag_get_formats
import org.gtkkn.native.gdk.gdk_drag_get_selected_action
import org.gtkkn.native.gdk.gdk_drag_get_surface
import org.gtkkn.native.gdk.gdk_drag_get_type
import org.gtkkn.native.gdk.gdk_drag_set_hotspot
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * The `GdkDrag` object represents the source of an ongoing DND operation.
 *
 * A `GdkDrag` is created when a drag is started, and stays alive for duration of
 * the DND operation. After a drag has been started with [func@Gdk.Drag.begin],
 * the caller gets informed about the status of the ongoing drag operation
 * with signals on the `GdkDrag` object.
 *
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public abstract class Drag(public val gdkDragPointer: CPointer<GdkDrag>) :
    Object(gdkDragPointer.reinterpret()),
    KGTyped {
    /**
     * The possible actions of this drag.
     */
    public open val actions: DragAction
        /**
         * Determines the bitmask of possible actions proposed by the source.
         *
         * @return the `GdkDragAction` flags
         */
        get() = gdk_drag_get_actions(gdkDragPointer).run {
            DragAction(this)
        }

    /**
     * The `GdkContentProvider`.
     */
    public open val content: ContentProvider
        /**
         * Returns the `GdkContentProvider` associated to the `GdkDrag` object.
         *
         * @return The `GdkContentProvider` associated to @drag.
         */
        get() = gdk_drag_get_content(gdkDragPointer)!!.run {
            ContentProvider(this)
        }

    /**
     * The `GdkDevice` that is performing the drag.
     */
    public open val device: Device
        /**
         * Returns the `GdkDevice` associated to the `GdkDrag` object.
         *
         * @return The `GdkDevice` associated to @drag.
         */
        get() = gdk_drag_get_device(gdkDragPointer)!!.run {
            Device.DeviceImpl(this)
        }

    /**
     * The `GdkDisplay` that the drag belongs to.
     */
    public open val display: Display
        /**
         * Gets the `GdkDisplay` that the drag object was created for.
         *
         * @return a `GdkDisplay`
         */
        get() = gdk_drag_get_display(gdkDragPointer)!!.run {
            Display(this)
        }

    /**
     * The possible formats that the drag can provide its data in.
     */
    public open val formats: ContentFormats
        /**
         * Retrieves the formats supported by this `GdkDrag` object.
         *
         * @return a `GdkContentFormats`
         */
        get() = gdk_drag_get_formats(gdkDragPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * The currently selected action of the drag.
     */
    public open val selectedAction: DragAction
        /**
         * Determines the action chosen by the drag destination.
         *
         * @return a `GdkDragAction` value
         */
        get() = gdk_drag_get_selected_action(gdkDragPointer).run {
            DragAction(this)
        }

    /**
     * The surface where the drag originates.
     */
    public open val surface: Surface
        /**
         * Returns the `GdkSurface` where the drag originates.
         *
         * @return The `GdkSurface` where the drag originates
         */
        get() = gdk_drag_get_surface(gdkDragPointer)!!.run {
            Surface.SurfaceImpl(this)
        }

    /**
     * Informs GDK that the drop ended.
     *
     * Passing false for @success may trigger a drag cancellation
     * animation.
     *
     * This function is called by the drag source, and should be the
     * last call before dropping the reference to the @drag.
     *
     * The `GdkDrag` will only take the first [method@Gdk.Drag.drop_done]
     * call as effective, if this function is called multiple times,
     * all subsequent calls will be ignored.
     *
     * @param success whether the drag was ultimatively successful
     */
    public open fun dropDone(success: Boolean): Unit = gdk_drag_drop_done(gdkDragPointer, success.asGBoolean())

    /**
     * Returns the surface on which the drag icon should be rendered
     * during the drag operation.
     *
     * Note that the surface may not be available until the drag operation
     * has begun. GDK will move the surface in accordance with the ongoing
     * drag operation. The surface is owned by @drag and will be destroyed
     * when the drag operation is over.
     *
     * @return the drag surface
     */
    public open fun getDragSurface(): Surface? = gdk_drag_get_drag_surface(gdkDragPointer)?.run {
        Surface.SurfaceImpl(this)
    }

    /**
     * Sets the position of the drag surface that will be kept
     * under the cursor hotspot.
     *
     * Initially, the hotspot is at the top left corner of the drag surface.
     *
     * @param hotX x coordinate of the drag surface hotspot
     * @param hotY y coordinate of the drag surface hotspot
     */
    public open fun setHotspot(hotX: gint, hotY: gint): Unit = gdk_drag_set_hotspot(gdkDragPointer, hotX, hotY)

    /**
     * Emitted when the drag operation is cancelled.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `reason` The reason the drag was cancelled
     */
    public fun onCancel(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (reason: DragCancelReason) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkDragPointer,
        "cancel",
        onCancelFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "cancel" signal. See [onCancel].
     *
     * @param reason The reason the drag was cancelled
     */
    public fun emitCancel(reason: DragCancelReason) {
        g_signal_emit_by_name(gdkDragPointer.reinterpret(), "cancel", reason.nativeValue)
    }

    /**
     * Emitted when the destination side has finished reading all data.
     *
     * The drag object can now free all miscellaneous data.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDndFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkDragPointer,
            "dnd-finished",
            onDndFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "dnd-finished" signal. See [onDndFinished].
     */
    public fun emitDndFinished() {
        g_signal_emit_by_name(gdkDragPointer.reinterpret(), "dnd-finished")
    }

    /**
     * Emitted when the drop operation is performed on an accepting client.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDropPerformed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkDragPointer,
            "drop-performed",
            onDropPerformedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "drop-performed" signal. See [onDropPerformed].
     */
    public fun emitDropPerformed() {
        g_signal_emit_by_name(gdkDragPointer.reinterpret(), "drop-performed")
    }

    /**
     * The DragImpl type represents a native instance of the abstract Drag class.
     *
     * @constructor Creates a new instance of Drag for the provided [CPointer].
     */
    public class DragImpl(pointer: CPointer<GdkDrag>) : Drag(pointer)

    public companion object : TypeCompanion<Drag> {
        override val type: GeneratedClassKGType<Drag> =
            GeneratedClassKGType(gdk_drag_get_type()) { DragImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Starts a drag and creates a new drag context for it.
         *
         * This function is called by the drag source. After this call, you
         * probably want to set up the drag icon using the surface returned
         * by [method@Gdk.Drag.get_drag_surface].
         *
         * This function returns a reference to the [class@Gdk.Drag] object,
         * but GTK keeps its own reference as well, as long as the DND operation
         * is going on.
         *
         * Note: if @actions include %GDK_ACTION_MOVE, you need to listen for
         * the [signal@Gdk.Drag::dnd-finished] signal and delete the data at
         * the source if [method@Gdk.Drag.get_selected_action] returns
         * %GDK_ACTION_MOVE.
         *
         * @param surface the source surface for this drag
         * @param device the device that controls this drag
         * @param content the offered content
         * @param actions the actions supported by this drag
         * @param dx the x offset to @device's position where the drag nominally started
         * @param dy the y offset to @device's position where the drag nominally started
         * @return a newly created `GdkDrag`
         */
        public fun begin(
            surface: Surface,
            device: Device,
            content: ContentProvider,
            actions: DragAction,
            dx: gdouble,
            dy: gdouble,
        ): Drag? = gdk_drag_begin(
            surface.gdkSurfacePointer,
            device.gdkDevicePointer,
            content.gdkContentProviderPointer,
            actions.mask,
            dx,
            dy
        )?.run {
            DragImpl(this)
        }

        /**
         * Get the GType of Drag
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_drag_get_type()
    }
}

private val onCancelFunc: CPointer<CFunction<(GdkDragCancelReason) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        reason: GdkDragCancelReason,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(reason: DragCancelReason) -> Unit>().get().invoke(
        reason.run {
            DragCancelReason.fromNativeValue(this)
        }
    )
}
    .reinterpret()

private val onDndFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDropPerformedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
