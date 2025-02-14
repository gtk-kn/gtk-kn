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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_2
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.Direction
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkDevice
import org.gtkkn.native.gdk.GdkDeviceTool
import org.gtkkn.native.gdk.gdk_device_get_caps_lock_state
import org.gtkkn.native.gdk.gdk_device_get_device_tool
import org.gtkkn.native.gdk.gdk_device_get_direction
import org.gtkkn.native.gdk.gdk_device_get_display
import org.gtkkn.native.gdk.gdk_device_get_has_cursor
import org.gtkkn.native.gdk.gdk_device_get_modifier_state
import org.gtkkn.native.gdk.gdk_device_get_name
import org.gtkkn.native.gdk.gdk_device_get_num_lock_state
import org.gtkkn.native.gdk.gdk_device_get_num_touches
import org.gtkkn.native.gdk.gdk_device_get_product_id
import org.gtkkn.native.gdk.gdk_device_get_scroll_lock_state
import org.gtkkn.native.gdk.gdk_device_get_seat
import org.gtkkn.native.gdk.gdk_device_get_source
import org.gtkkn.native.gdk.gdk_device_get_timestamp
import org.gtkkn.native.gdk.gdk_device_get_type
import org.gtkkn.native.gdk.gdk_device_get_vendor_id
import org.gtkkn.native.gdk.gdk_device_has_bidi_layouts
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GdkDevice` object represents an input device, such
 * as a keyboard, a mouse, or a touchpad.
 *
 * See the [class@Gdk.Seat] documentation for more information
 * about the various kinds of devices, and their relationships.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `win_x`: win_x: Out parameter is not supported
 * - method `has-bidi-layouts`: Property has no getter nor setter
 * - method `n-axes`: Property has no getter nor setter
 */
public abstract class Device(public val gdkDevicePointer: CPointer<GdkDevice>) :
    Object(gdkDevicePointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * Whether Caps Lock is on.
     *
     * This is only relevant for keyboard devices.
     */
    public open val capsLockState: Boolean
        /**
         * Retrieves whether the Caps Lock modifier of the keyboard is locked.
         *
         * This is only relevant for keyboard devices.
         *
         * @return true if Caps Lock is on for @device
         */
        get() = gdk_device_get_caps_lock_state(gdkDevicePointer).asBoolean()

    /**
     * The direction of the current layout.
     *
     * This is only relevant for keyboard devices.
     */
    public open val direction: Direction
        /**
         * Returns the direction of effective layout of the keyboard.
         *
         * This is only relevant for keyboard devices.
         *
         * The direction of a layout is the direction of the majority
         * of its symbols. See [func@Pango.unichar_direction].
         *
         * @return %PANGO_DIRECTION_LTR or %PANGO_DIRECTION_RTL
         *   if it can determine the direction. %PANGO_DIRECTION_NEUTRAL
         *   otherwise
         */
        get() = gdk_device_get_direction(gdkDevicePointer).run {
            Direction.fromNativeValue(this)
        }

    /**
     * The `GdkDisplay` the `GdkDevice` pertains to.
     */
    public open val display: Display
        /**
         * Returns the `GdkDisplay` to which @device pertains.
         *
         * @return a `GdkDisplay`
         */
        get() = gdk_device_get_display(gdkDevicePointer)!!.run {
            InstanceCache.get(this, true) { Display(reinterpret()) }!!
        }

    /**
     * Whether the device is represented by a cursor on the screen.
     */
    public open val hasCursor: Boolean
        /**
         * Determines whether the pointer follows device motion.
         *
         * This is not meaningful for keyboard devices, which
         * don't have a pointer.
         *
         * @return true if the pointer follows device motion
         */
        get() = gdk_device_get_has_cursor(gdkDevicePointer).asBoolean()

    /**
     * The current modifier state of the device.
     *
     * This is only relevant for keyboard devices.
     */
    public open val modifierState: ModifierType
        /**
         * Retrieves the current modifier state of the keyboard.
         *
         * This is only relevant for keyboard devices.
         *
         * @return the current modifier state
         */
        get() = gdk_device_get_modifier_state(gdkDevicePointer).run {
            ModifierType(this)
        }

    /**
     * The device name.
     */
    public open val name: String
        /**
         * The name of the device, suitable for showing in a user interface.
         *
         * @return a name
         */
        get() = gdk_device_get_name(gdkDevicePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Whether Num Lock is on.
     *
     * This is only relevant for keyboard devices.
     */
    public open val numLockState: Boolean
        /**
         * Retrieves whether the Num Lock modifier of the keyboard is locked.
         *
         * This is only relevant for keyboard devices.
         *
         * @return true if Num Lock is on for @device
         */
        get() = gdk_device_get_num_lock_state(gdkDevicePointer).asBoolean()

    /**
     * The maximal number of concurrent touches on a touch device.
     *
     * Will be 0 if the device is not a touch device or if the number
     * of touches is unknown.
     */
    public open val numTouches: guint
        /**
         * Retrieves the number of touch points associated to @device.
         *
         * @return the number of touch points
         */
        get() = gdk_device_get_num_touches(gdkDevicePointer)

    /**
     * Product ID of this device.
     *
     * See [method@Gdk.Device.get_product_id].
     */
    public open val productId: String?
        /**
         * Returns the product ID of this device.
         *
         * This ID is retrieved from the device, and does not change.
         * See [method@Gdk.Device.get_vendor_id] for more information.
         *
         * @return the product ID
         */
        get() = gdk_device_get_product_id(gdkDevicePointer)?.toKString()

    /**
     * Whether Scroll Lock is on.
     *
     * This is only relevant for keyboard devices.
     */
    public open val scrollLockState: Boolean
        /**
         * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
         *
         * This is only relevant for keyboard devices.
         *
         * @return true if Scroll Lock is on for @device
         */
        get() = gdk_device_get_scroll_lock_state(gdkDevicePointer).asBoolean()

    /**
     * `GdkSeat` of this device.
     */
    public open val seat: Seat
        /**
         * Returns the `GdkSeat` the device belongs to.
         *
         * @return a `GdkSeat`
         */
        get() = gdk_device_get_seat(gdkDevicePointer)!!.run {
            InstanceCache.get(this, true) { Seat.SeatImpl(reinterpret()) }!!
        }

    /**
     * Source type for the device.
     */
    public open val source: InputSource
        /**
         * Determines the type of the device.
         *
         * @return a `GdkInputSource`
         */
        get() = gdk_device_get_source(gdkDevicePointer).run {
            InputSource.fromNativeValue(this)
        }

    /**
     * The `GdkDeviceTool` that is currently used with this device.
     */
    public open val tool: DeviceTool?
        /**
         * Retrieves the current tool for @device.
         *
         * @return the `GdkDeviceTool`
         */
        get() = gdk_device_get_device_tool(gdkDevicePointer)?.run {
            InstanceCache.get(this, true) { DeviceTool(reinterpret()) }!!
        }

    /**
     * Vendor ID of this device.
     *
     * See [method@Gdk.Device.get_vendor_id].
     */
    public open val vendorId: String?
        /**
         * Returns the vendor ID of this device.
         *
         * This ID is retrieved from the device, and does not change.
         *
         * This function, together with [method@Gdk.Device.get_product_id],
         * can be used to eg. compose `GSettings` paths to store settings
         * for this device.
         *
         * ```c
         *  static GSettings *
         *  get_device_settings (GdkDevice *device)
         *  {
         *    const char *vendor, *product;
         *    GSettings *settings;
         *    GdkDevice *device;
         *    char *path;
         *
         *    vendor = gdk_device_get_vendor_id (device);
         *    product = gdk_device_get_product_id (device);
         *
         *    path = g_strdup_printf ("/org/example/app/devices/%s:%s/", vendor, product);
         *    settings = g_settings_new_with_path (DEVICE_SCHEMA, path);
         *    g_free (path);
         *
         *    return settings;
         *  }
         * ```
         *
         * @return the vendor ID
         */
        get() = gdk_device_get_vendor_id(gdkDevicePointer)?.toKString()

    /**
     * Returns the timestamp of the last activity for this device.
     *
     * In practice, this means the timestamp of the last event that was
     * received from the OS for this device. (GTK may occasionally produce
     * events for a device that are not received from the OS, and will not
     * update the timestamp).
     *
     * @return the timestamp of the last activity for this device
     * @since 4.2
     */
    @GdkVersion4_2
    public open fun getTimestamp(): guint = gdk_device_get_timestamp(gdkDevicePointer)

    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     *
     * This is only relevant for keyboard devices.
     *
     * @return true if there are layouts with both directions, false otherwise
     */
    public open fun hasBidiLayouts(): Boolean = gdk_device_has_bidi_layouts(gdkDevicePointer).asBoolean()

    /**
     * Emitted either when the number of either axes or keys changes.
     *
     * On X11 this will normally happen when the physical device
     * routing events through the logical device changes (for
     * example, user switches from the USB mouse to a tablet); in
     * that case the logical device will change to reflect the axes
     * and keys on the new physical device.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkDevicePointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     */
    public fun emitChanged() {
        g_signal_emit_by_name(gdkDevicePointer.reinterpret(), "changed")
    }

    /**
     * Emitted on pen/eraser devices whenever tools enter or leave proximity.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tool` The new current tool
     */
    public fun onToolChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tool: DeviceTool) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkDevicePointer,
        "tool-changed",
        onToolChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "tool-changed" signal. See [onToolChanged].
     *
     * @param tool The new current tool
     */
    public fun emitToolChanged(tool: DeviceTool) {
        g_signal_emit_by_name(gdkDevicePointer.reinterpret(), "tool-changed", tool.gdkDeviceToolPointer)
    }

    /**
     * The DeviceImpl type represents a native instance of the abstract Device class.
     *
     * @constructor Creates a new instance of Device for the provided [CPointer].
     */
    public class DeviceImpl(pointer: CPointer<GdkDevice>) : Device(pointer)

    public companion object : TypeCompanion<Device> {
        override val type: GeneratedClassKGType<Device> =
            GeneratedClassKGType(getTypeOrNull()!!) { DeviceImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Device
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_device_get_type()

        /**
         * Gets the GType of from the symbol `gdk_device_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_device_get_type")
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onToolChangedFunc: CPointer<CFunction<(CPointer<GdkDeviceTool>) -> Unit>> =
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
