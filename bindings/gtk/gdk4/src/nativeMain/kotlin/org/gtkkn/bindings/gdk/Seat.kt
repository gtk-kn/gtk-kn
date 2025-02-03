// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.ULong
import kotlin.Unit

/**
 * The `GdkSeat` object represents a collection of input devices
 * that belong to a user.
 */
public abstract class Seat(public val gdkSeatPointer: CPointer<GdkSeat>) :
    Object(gdkSeatPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

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
        get() = gdk_seat_get_display(gdkSeatPointer)!!.run {
            InstanceCache.get(this, true) { Display(reinterpret()) }!!
        }

    /**
     * Returns the capabilities this `GdkSeat` currently has.
     *
     * @return the seat capabilities
     */
    public open fun getCapabilities(): SeatCapabilities = gdk_seat_get_capabilities(gdkSeatPointer).run {
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
        gdk_seat_get_devices(gdkSeatPointer, capabilities.mask)!!.run {
            List(this)
        }

    /**
     * Returns the device that routes keyboard events.
     *
     * @return a `GdkDevice` with keyboard
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public open fun getKeyboard(): Device? = gdk_seat_get_keyboard(gdkSeatPointer)?.run {
        InstanceCache.get(this, true) { Device.DeviceImpl(reinterpret()) }!!
    }

    /**
     * Returns the device that routes pointer events.
     *
     * @return a `GdkDevice` with pointer
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public open fun getPointer(): Device? = gdk_seat_get_pointer(gdkSeatPointer)?.run {
        InstanceCache.get(this, true) { Device.DeviceImpl(reinterpret()) }!!
    }

    /**
     * Returns all `GdkDeviceTools` that are known to the application.
     *
     * @return A list of tools. Free with g_list_free().
     */
    public open fun getTools(): List = gdk_seat_get_tools(gdkSeatPointer)!!.run {
        List(this)
    }

    /**
     * Emitted when a new input device is related to this seat.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `device` the newly added `GdkDevice`.
     */
    public fun onDeviceAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (device: Device) -> Unit): ULong =
        g_signal_connect_data(
            gdkSeatPointer,
            "device-added",
            onDeviceAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "device-added" signal. See [onDeviceAdded].
     *
     * @param device the newly added `GdkDevice`.
     */
    public fun emitDeviceAdded(device: Device) {
        g_signal_emit_by_name(gdkSeatPointer.reinterpret(), "device-added", device.gdkDevicePointer)
    }

    /**
     * Emitted when an input device is removed (e.g. unplugged).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `device` the just removed `GdkDevice`.
     */
    public fun onDeviceRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (device: Device) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkSeatPointer,
        "device-removed",
        onDeviceRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "device-removed" signal. See [onDeviceRemoved].
     *
     * @param device the just removed `GdkDevice`.
     */
    public fun emitDeviceRemoved(device: Device) {
        g_signal_emit_by_name(gdkSeatPointer.reinterpret(), "device-removed", device.gdkDevicePointer)
    }

    /**
     * Emitted whenever a new tool is made known to the seat.
     *
     * The tool may later be assigned to a device (i.e. on
     * proximity with a tablet). The device will emit the
     * [signal@Gdk.Device::tool-changed] signal accordingly.
     *
     * A same tool may be used by several devices.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tool` the new `GdkDeviceTool` known to the seat
     */
    public fun onToolAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (tool: DeviceTool) -> Unit): ULong =
        g_signal_connect_data(
            gdkSeatPointer,
            "tool-added",
            onToolAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "tool-added" signal. See [onToolAdded].
     *
     * @param tool the new `GdkDeviceTool` known to the seat
     */
    public fun emitToolAdded(tool: DeviceTool) {
        g_signal_emit_by_name(gdkSeatPointer.reinterpret(), "tool-added", tool.gdkDeviceToolPointer)
    }

    /**
     * Emitted whenever a tool is no longer known to this @seat.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tool` the just removed `GdkDeviceTool`
     */
    public fun onToolRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tool: DeviceTool) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkSeatPointer,
        "tool-removed",
        onToolRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "tool-removed" signal. See [onToolRemoved].
     *
     * @param tool the just removed `GdkDeviceTool`
     */
    public fun emitToolRemoved(tool: DeviceTool) {
        g_signal_emit_by_name(gdkSeatPointer.reinterpret(), "tool-removed", tool.gdkDeviceToolPointer)
    }

    /**
     * The SeatImpl type represents a native instance of the abstract Seat class.
     *
     * @constructor Creates a new instance of Seat for the provided [CPointer].
     */
    public class SeatImpl(pointer: CPointer<GdkSeat>) : Seat(pointer)

    public companion object : TypeCompanion<Seat> {
        override val type: GeneratedClassKGType<Seat> =
            GeneratedClassKGType(getTypeOrNull()!!) { SeatImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Seat
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_seat_get_type()

        /**
         * Gets the GType of from the symbol `gdk_seat_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_seat_get_type")
    }
}

private val onDeviceAddedFunc: CPointer<CFunction<(CPointer<GdkDevice>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            device: CPointer<GdkDevice>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(device: Device) -> Unit>().get().invoke(
            device!!.run {
                InstanceCache.get(this, false) { Device.DeviceImpl(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

private val onDeviceRemovedFunc: CPointer<CFunction<(CPointer<GdkDevice>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            device: CPointer<GdkDevice>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(device: Device) -> Unit>().get().invoke(
            device!!.run {
                InstanceCache.get(this, false) { Device.DeviceImpl(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

private val onToolAddedFunc: CPointer<CFunction<(CPointer<GdkDeviceTool>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tool: CPointer<GdkDeviceTool>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tool: DeviceTool) -> Unit>().get().invoke(
            tool!!.run {
                InstanceCache.get(this, false) { DeviceTool(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

private val onToolRemovedFunc: CPointer<CFunction<(CPointer<GdkDeviceTool>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tool: CPointer<GdkDeviceTool>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tool: DeviceTool) -> Unit>().get().invoke(
            tool!!.run {
                InstanceCache.get(this, false) { DeviceTool(reinterpret()) }!!
            }
        )
    }
        .reinterpret()
