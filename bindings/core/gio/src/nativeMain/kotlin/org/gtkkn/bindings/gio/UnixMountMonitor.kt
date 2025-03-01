// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GUnixMountMonitor
import org.gtkkn.native.gio.g_unix_mount_monitor_get
import org.gtkkn.native.gio.g_unix_mount_monitor_get_type
import org.gtkkn.native.gio.g_unix_mount_monitor_new
import org.gtkkn.native.gio.g_unix_mount_monitor_set_rate_limit
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.ULong
import kotlin.Unit

/**
 * Watches #GUnixMounts for changes.
 */
public open class UnixMountMonitor(public val gioUnixMountMonitorPointer: CPointer<GUnixMountMonitor>) :
    Object(gioUnixMountMonitorPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.44.
     *
     * Use g_unix_mount_monitor_get() instead.
     * ---
     *
     * Deprecated alias for g_unix_mount_monitor_get().
     *
     * This function was never a true constructor, which is why it was
     * renamed.
     *
     * @return a #GUnixMountMonitor.
     */
    public constructor() : this(g_unix_mount_monitor_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.44.
     *
     * This function does nothing.  Don't call it.
     * ---
     *
     * This function does nothing.
     *
     * Before 2.44, this was a partially-effective way of controlling the
     * rate at which events would be reported under some uncommon
     * circumstances.  Since @mount_monitor is a singleton, it also meant
     * that calling this function would have side effects for other users of
     * the monitor.
     *
     * @param limitMsec a integer with the limit in milliseconds to
     *     poll for changes.
     * @since 2.18
     */
    @GioVersion2_18
    public open fun setRateLimit(limitMsec: gint): Unit =
        g_unix_mount_monitor_set_rate_limit(gioUnixMountMonitorPointer, limitMsec)

    /**
     * Emitted when the unix mount points have changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onMountpointsChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioUnixMountMonitorPointer,
            "mountpoints-changed",
            onMountpointsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "mountpoints-changed" signal. See [onMountpointsChanged].
     */
    public fun emitMountpointsChanged() {
        g_signal_emit_by_name(gioUnixMountMonitorPointer.reinterpret(), "mountpoints-changed")
    }

    /**
     * Emitted when the unix mounts have changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onMountsChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioUnixMountMonitorPointer,
            "mounts-changed",
            onMountsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "mounts-changed" signal. See [onMountsChanged].
     */
    public fun emitMountsChanged() {
        g_signal_emit_by_name(gioUnixMountMonitorPointer.reinterpret(), "mounts-changed")
    }

    public companion object : TypeCompanion<UnixMountMonitor> {
        override val type: GeneratedClassKGType<UnixMountMonitor> =
            GeneratedClassKGType(getTypeOrNull()!!) { UnixMountMonitor(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets the #GUnixMountMonitor for the current thread-default main
         * context.
         *
         * The mount monitor can be used to monitor for changes to the list of
         * mounted filesystems as well as the list of mount points (ie: fstab
         * entries).
         *
         * You must only call g_object_unref() on the return value from under
         * the same main context as you called this function.
         *
         * @return the #GUnixMountMonitor.
         * @since 2.44
         */
        @GioVersion2_44
        public fun `get`(): UnixMountMonitor = g_unix_mount_monitor_get()!!.run {
            InstanceCache.get(this, true) { UnixMountMonitor(reinterpret()) }!!
        }

        /**
         * Get the GType of UnixMountMonitor
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_mount_monitor_get_type()

        /**
         * Gets the GType of from the symbol `g_unix_mount_monitor_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_unix_mount_monitor_get_type")
    }
}

private val onMountpointsChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onMountsChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
