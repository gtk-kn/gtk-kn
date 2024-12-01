// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDevice
import org.gtkkn.native.gdk.GdkDeviceTool
import org.gtkkn.native.gdk.GdkSeat
import org.gtkkn.native.gdk.gdk_seat_get_capabilities
import org.gtkkn.native.gdk.gdk_seat_get_devices
import org.gtkkn.native.gdk.gdk_seat_get_display
import org.gtkkn.native.gdk.gdk_seat_get_keyboard
import org.gtkkn.native.gdk.gdk_seat_get_pointer
import org.gtkkn.native.gdk.gdk_seat_get_tools
import org.gtkkn.native.gdk.gdk_seat_get_type
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.ULong
import kotlin.Unit

/**
 * The `GdkSeat` object represents a collection of input devices
 * that belong to a user.
 */
public open class Seat(
    pointer: CPointer<GdkSeat>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gdkSeatPointer: CPointer<GdkSeat>
        get() = gPointer.reinterpret()

    /**
     * `GdkDisplay` of this seat.
     */
    public open val display: Display
        /**
         * Returns the `GdkDisplay` this seat belongs to.
         *
         * @return a `GdkDisplay`. This object
         *   is owned by GTK and must not be freed.
         */
        get() =
            gdk_seat_get_display(gdkSeatPointer.reinterpret())!!.run {
                Display(reinterpret())
            }

    /**
     * Returns the capabilities this `GdkSeat` currently has.
     *
     * @return the seat capabilities
     */
    public open fun getCapabilities(): SeatCapabilities =
        gdk_seat_get_capabilities(gdkSeatPointer.reinterpret()).run {
            SeatCapabilities(this)
        }

    /**
     * Returns the devices that match the given capabilities.
     *
     * @param capabilities capabilities to get devices for
     * @return A list
     *   of `GdkDevices`. The list must be freed with g_list_free(),
     *   the elements are owned by GTK and must not be freed.
     */
    public open fun getDevices(capabilities: SeatCapabilities): List =
        gdk_seat_get_devices(gdkSeatPointer.reinterpret(), capabilities.mask)!!.run {
            List(reinterpret())
        }

    /**
     * Returns the `GdkDisplay` this seat belongs to.
     *
     * @return a `GdkDisplay`. This object
     *   is owned by GTK and must not be freed.
     */
    public open fun getDisplay(): Display =
        gdk_seat_get_display(gdkSeatPointer.reinterpret())!!.run {
            Display(reinterpret())
        }

    /**
     * Returns the device that routes keyboard events.
     *
     * @return a `GdkDevice` with keyboard
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public open fun getKeyboard(): Device? =
        gdk_seat_get_keyboard(gdkSeatPointer.reinterpret())?.run {
            Device(reinterpret())
        }

    /**
     * Returns the device that routes pointer events.
     *
     * @return a `GdkDevice` with pointer
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public open fun getPointer(): Device? =
        gdk_seat_get_pointer(gdkSeatPointer.reinterpret())?.run {
            Device(reinterpret())
        }

    /**
     * Returns all `GdkDeviceTools` that are known to the application.
     *
     * @return A list of tools. Free with g_list_free().
     */
    public open fun getTools(): List =
        gdk_seat_get_tools(gdkSeatPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Emitted when a new input device is related to this seat.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `device` the newly added `GdkDevice`.
     */
    public fun connectDeviceAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (device: Device) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "device-added",
            connectDeviceAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when an input device is removed (e.g. unplugged).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `device` the just removed `GdkDevice`.
     */
    public fun connectDeviceRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (device: Device) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "device-removed",
            connectDeviceRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever a new tool is made known to the seat.
     *
     * The tool may later be assigned to a device (i.e. on
     * proximity with a tablet). The device will emit the
     * [signal@Gdk.Device::tool-changed] signal accordingly.
     *
     * A same tool may be used by several devices.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tool` the new `GdkDeviceTool` known to the seat
     */
    public fun connectToolAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tool: DeviceTool) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tool-added",
            connectToolAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever a tool is no longer known to this @seat.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tool` the just removed `GdkDeviceTool`
     */
    public fun connectToolRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tool: DeviceTool) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tool-removed",
            connectToolRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Seat> {
        override val type: GeneratedClassKGType<Seat> =
            GeneratedClassKGType(gdk_seat_get_type()) { Seat(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}

private val connectDeviceAddedFunc: CPointer<CFunction<(CPointer<GdkDevice>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            device: CPointer<GdkDevice>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(device: Device) -> Unit>().get().invoke(
            device!!.run {
                Device(reinterpret())
            }
        )
    }.reinterpret()

private val connectDeviceRemovedFunc: CPointer<CFunction<(CPointer<GdkDevice>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            device: CPointer<GdkDevice>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(device: Device) -> Unit>().get().invoke(
            device!!.run {
                Device(reinterpret())
            }
        )
    }.reinterpret()

private val connectToolAddedFunc: CPointer<CFunction<(CPointer<GdkDeviceTool>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tool: CPointer<GdkDeviceTool>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tool: DeviceTool) -> Unit>().get().invoke(
            tool!!.run {
                DeviceTool(reinterpret())
            }
        )
    }.reinterpret()

private val connectToolRemovedFunc: CPointer<CFunction<(CPointer<GdkDeviceTool>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tool: CPointer<GdkDeviceTool>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tool: DeviceTool) -> Unit>().get().invoke(
            tool!!.run {
                DeviceTool(reinterpret())
            }
        )
    }.reinterpret()
