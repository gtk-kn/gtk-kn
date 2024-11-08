// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.xdp.Xdp.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.xdp.XdpSession
import org.gtkkn.native.xdp.xdp_session_close
import org.gtkkn.native.xdp.xdp_session_connect_to_eis
import org.gtkkn.native.xdp.xdp_session_get_devices
import org.gtkkn.native.xdp.xdp_session_get_persist_mode
import org.gtkkn.native.xdp.xdp_session_get_restore_token
import org.gtkkn.native.xdp.xdp_session_get_session_state
import org.gtkkn.native.xdp.xdp_session_get_session_type
import org.gtkkn.native.xdp.xdp_session_get_streams
import org.gtkkn.native.xdp.xdp_session_get_type
import org.gtkkn.native.xdp.xdp_session_keyboard_key
import org.gtkkn.native.xdp.xdp_session_open_pipewire_remote
import org.gtkkn.native.xdp.xdp_session_pointer_axis
import org.gtkkn.native.xdp.xdp_session_pointer_axis_discrete
import org.gtkkn.native.xdp.xdp_session_pointer_button
import org.gtkkn.native.xdp.xdp_session_pointer_motion
import org.gtkkn.native.xdp.xdp_session_pointer_position
import org.gtkkn.native.xdp.xdp_session_start
import org.gtkkn.native.xdp.xdp_session_start_finish
import org.gtkkn.native.xdp.xdp_session_touch_down
import org.gtkkn.native.xdp.xdp_session_touch_position
import org.gtkkn.native.xdp.xdp_session_touch_up
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A representation of long-lived screencast portal interactions.
 *
 * The XdpSession object is used to represent portal interactions with the
 * screencast or remote desktop portals that extend over multiple portal calls.
 *
 * To find out what kind of session an XdpSession object represents and whether
 * it is still active, you can use [method@Session.get_session_type] and
 * [method@Session.get_session_state].
 *
 * All sessions start in an initial state. They can be made active by calling
 * [method@Session.start], and ended by calling [method@Session.close].
 */
public open class Session(
    pointer: CPointer<XdpSession>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val xdpSessionPointer: CPointer<XdpSession>
        get() = gPointer.reinterpret()

    /**
     * Closes the session.
     */
    public open fun close(): Unit = xdp_session_close(xdpSessionPointer.reinterpret())

    /**
     * Connect this XdpRemoteDesktopSession to an EIS implementation and return the fd.
     * This fd can be passed into ei_setup_backend_fd(). See the libei
     * documentation for details.
     *
     * This call must be issued before xdp_session_start(). If successful, all input
     * event emulation must be handled via the EIS connection and calls to
     * xdp_session_pointer_motion() etc. are silently ignored.
     *
     * @return the file descriptor to the EIS implementation
     */
    public open fun connectToEis(): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = xdp_session_connect_to_eis(xdpSessionPointer.reinterpret(), gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Obtains the devices that the user selected.
     *
     * Unless the session is active, this function returns `XDP_DEVICE_NONE`.
     *
     * @return the selected devices
     */
    public open fun getDevices(): DeviceType =
        xdp_session_get_devices(xdpSessionPointer.reinterpret()).run {
            DeviceType(this)
        }

    /**
     * Retrieves the effective persist mode of @session.
     *
     * May only be called after @session is successfully started, i.e. after
     * [method@Session.start_finish].
     *
     * @return the effective persist mode of @session
     */
    public open fun getPersistMode(): PersistMode =
        xdp_session_get_persist_mode(xdpSessionPointer.reinterpret()).run {
            PersistMode.fromNativeValue(this)
        }

    /**
     * Retrieves the restore token of @session.
     *
     * A restore token will only be available if `XDP_PERSIST_MODE_TRANSIENT`
     * or `XDP_PERSIST_MODE_PERSISTENT` was passed when creating the screencast
     * session.
     *
     * Remote desktop sessions cannot be restored.
     *
     * May only be called after @session is successfully started, i.e. after
     * [method@Session.start_finish].
     *
     * @return the restore token of @session
     */
    public open fun getRestoreToken(): String? =
        xdp_session_get_restore_token(xdpSessionPointer.reinterpret())?.toKString()

    /**
     * Obtains information about the state of the session that is represented
     * by @session.
     *
     * @return the state of @session
     */
    public open fun getSessionState(): SessionState =
        xdp_session_get_session_state(xdpSessionPointer.reinterpret()).run {
            SessionState.fromNativeValue(this)
        }

    /**
     * Obtains information about the type of session that is represented
     * by @session.
     *
     * @return the type of @session
     */
    public open fun getSessionType(): SessionType =
        xdp_session_get_session_type(xdpSessionPointer.reinterpret()).run {
            SessionType.fromNativeValue(this)
        }

    /**
     * Obtains the streams that the user selected.
     *
     * The information in the returned [struct@GLib.Variant] has the format
     * `a(ua{sv})`. Each item in the array is describing a stream. The first member
     * is the pipewire node ID, the second is a dictionary of stream properties,
     * including:
     *
     * - position, `(ii)`: a tuple consisting of the position `(x, y)` in the compositor
     *     coordinate space. Note that the position may not be equivalent to a
     *     position in a pixel coordinate space. Only available for monitor streams.
     * - size, `(ii)`: a tuple consisting of (width, height). The size represents the size
     *     of the stream as it is displayed in the compositor coordinate space.
     *     Note that this size may not be equivalent to a size in a pixel coordinate
     *     space. The size may differ from the size of the stream.
     *
     * Unless the session is active, this function returns `NULL`.
     *
     * @return the selected streams
     */
    public open fun getStreams(): Variant =
        xdp_session_get_streams(xdpSessionPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Changes the state of the key to @state.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_KEYBOARD` access.
     *
     * @param keysym whether to interpret @key as a keysym instead of a keycode
     * @param key the keysym or keycode to change
     * @param state the new state
     */
    public open fun keyboardKey(
        keysym: Boolean,
        key: Int,
        state: KeyState,
    ): Unit = xdp_session_keyboard_key(xdpSessionPointer.reinterpret(), keysym.asGBoolean(), key, state.nativeValue)

    /**
     * Opens a file descriptor to the pipewire remote where the screencast
     * streams are available.
     *
     * The file descriptor should be used to create a pw_remote object, by using
     * pw_remote_connect_fd(). Only the screencast stream nodes will be available
     * from this pipewire node.
     *
     * @return the file descriptor
     */
    public open fun openPipewireRemote(): Int = xdp_session_open_pipewire_remote(xdpSessionPointer.reinterpret())

    /**
     * The axis movement from a smooth scroll device, such as a touchpad.
     * When applicable, the size of the motion delta should be equivalent to
     * the motion vector of a pointer motion done using the same advice.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_POINTER` access.
     *
     * @param finish whether this is the last in a series of related events
     * @param dx relative axis movement on the X axis
     * @param dy relative axis movement on the Y axis
     */
    public open fun pointerAxis(
        finish: Boolean,
        dx: Double,
        dy: Double,
    ): Unit = xdp_session_pointer_axis(xdpSessionPointer.reinterpret(), finish.asGBoolean(), dx, dy)

    /**
     * The axis movement from a discrete scroll device.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_POINTER` access.
     *
     * @param axis the axis to change
     * @param steps number of steps scrolled
     */
    public open fun pointerAxisDiscrete(
        axis: DiscreteAxis,
        steps: Int,
    ): Unit = xdp_session_pointer_axis_discrete(xdpSessionPointer.reinterpret(), axis.nativeValue, steps)

    /**
     * Changes the state of the button to @state.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_POINTER` access.
     *
     * @param button the button
     * @param state the new state
     */
    public open fun pointerButton(
        button: Int,
        state: ButtonState,
    ): Unit = xdp_session_pointer_button(xdpSessionPointer.reinterpret(), button, state.nativeValue)

    /**
     * Moves the pointer from its current position.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_POINTER` access.
     *
     * @param dx relative horizontal movement
     * @param dy relative vertical movement
     */
    public open fun pointerMotion(
        dx: Double,
        dy: Double,
    ): Unit = xdp_session_pointer_motion(xdpSessionPointer.reinterpret(), dx, dy)

    /**
     * Moves the pointer to a new position in the given streams logical
     * coordinate space.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_POINTER` access.
     *
     * @param stream the node ID of the pipewire stream the position is relative to
     * @param x new X position
     * @param y new Y position
     */
    public open fun pointerPosition(
        stream: UInt,
        x: Double,
        y: Double,
    ): Unit = xdp_session_pointer_position(xdpSessionPointer.reinterpret(), stream, x, y)

    /**
     * Starts the session.
     *
     * When the request is done, @callback will be called. You can then
     * call [method@Session.start_finish] to get the results.
     *
     * @param parent parent window information
     * @param cancellable optional [class@Gio.Cancellable]
     * @param callback a callback to call when the request is done
     */
    public open fun start(
        parent: Parent? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        xdp_session_start(
            xdpSessionPointer.reinterpret(),
            parent?.xdpParentPointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the session-start request.
     *
     * @param result a [iface@Gio.AsyncResult]
     * @return `TRUE` if the session was started successfully.
     */
    public open fun startFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                xdp_session_start_finish(
                    xdpSessionPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Notify about a new touch down event.
     *
     * The `(x, y)` position represents the new touch point position in the streams
     * logical coordinate space.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_TOUCHSCREEN` access.
     *
     * @param stream the node ID of the pipewire stream the position is relative to
     * @param slot touch slot where the touch point appeared
     * @param x new X position
     * @param y new Y position
     */
    public open fun touchDown(
        stream: UInt,
        slot: UInt,
        x: Double,
        y: Double,
    ): Unit = xdp_session_touch_down(xdpSessionPointer.reinterpret(), stream, slot, x, y)

    /**
     * Notify about a new touch motion event.
     *
     * The `(x, y)` position represents where the touch point position in the
     * streams logical coordinate space moved.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_TOUCHSCREEN` access.
     *
     * @param stream the node ID of the pipewire stream the position is relative to
     * @param slot touch slot that is changing position
     * @param x new X position
     * @param y new Y position
     */
    public open fun touchPosition(
        stream: UInt,
        slot: UInt,
        x: Double,
        y: Double,
    ): Unit = xdp_session_touch_position(xdpSessionPointer.reinterpret(), stream, slot, x, y)

    /**
     * Notify about a new touch up event.
     *
     * May only be called on a remote desktop session
     * with `XDP_DEVICE_TOUCHSCREEN` access.
     *
     * @param slot touch slot that changed
     */
    public open fun touchUp(slot: UInt): Unit = xdp_session_touch_up(xdpSessionPointer.reinterpret(), slot)

    /**
     * Emitted when a session is closed externally.
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

    public companion object : TypeCompanion<Session> {
        override val type: GeneratedClassKGType<Session> =
            GeneratedClassKGType(xdp_session_get_type()) { Session(it.reinterpret()) }

        init {
            XdpTypeProvider.register()
        }
    }
}

private val connectClosedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
