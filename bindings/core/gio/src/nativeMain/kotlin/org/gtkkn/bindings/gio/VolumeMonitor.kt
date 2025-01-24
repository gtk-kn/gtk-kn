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
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDrive
import org.gtkkn.native.gio.GMount
import org.gtkkn.native.gio.GVolume
import org.gtkkn.native.gio.GVolumeMonitor
import org.gtkkn.native.gio.g_volume_monitor_adopt_orphan_mount
import org.gtkkn.native.gio.g_volume_monitor_get
import org.gtkkn.native.gio.g_volume_monitor_get_connected_drives
import org.gtkkn.native.gio.g_volume_monitor_get_mount_for_uuid
import org.gtkkn.native.gio.g_volume_monitor_get_mounts
import org.gtkkn.native.gio.g_volume_monitor_get_type
import org.gtkkn.native.gio.g_volume_monitor_get_volume_for_uuid
import org.gtkkn.native.gio.g_volume_monitor_get_volumes
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GVolumeMonitor` is for listing the user interesting devices and volumes
 * on the computer. In other words, what a file selector or file manager
 * would show in a sidebar.
 *
 * `GVolumeMonitor` is not
 * thread-default-context aware (see
 * [method@GLib.MainContext.push_thread_default]), and so should not be used
 * other than from the main thread, with no thread-default-context active.
 *
 * In order to receive updates about volumes and mounts monitored through GVFS,
 * a main loop must be running.
 */
public open class VolumeMonitor(public val gioVolumeMonitorPointer: CPointer<GVolumeMonitor>) :
    Object(gioVolumeMonitorPointer.reinterpret()),
    KGTyped {
    /**
     * Gets a list of drives connected to the system.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return a #GList of connected #GDrive objects.
     */
    public open fun getConnectedDrives(): List = g_volume_monitor_get_connected_drives(gioVolumeMonitorPointer)!!.run {
        List(this)
    }

    /**
     * Finds a #GMount object by its UUID (see g_mount_get_uuid())
     *
     * @param uuid the UUID to look for
     * @return a #GMount or null if no such mount is available.
     *     Free the returned object with g_object_unref().
     */
    public open fun getMountForUuid(uuid: String): Mount? =
        g_volume_monitor_get_mount_for_uuid(gioVolumeMonitorPointer, uuid)?.run {
            Mount.MountImpl(reinterpret())
        }

    /**
     * Gets a list of the mounts on the system.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return a #GList of #GMount objects.
     */
    public open fun getMounts(): List = g_volume_monitor_get_mounts(gioVolumeMonitorPointer)!!.run {
        List(this)
    }

    /**
     * Finds a #GVolume object by its UUID (see g_volume_get_uuid())
     *
     * @param uuid the UUID to look for
     * @return a #GVolume or null if no such volume is available.
     *     Free the returned object with g_object_unref().
     */
    public open fun getVolumeForUuid(uuid: String): Volume? =
        g_volume_monitor_get_volume_for_uuid(gioVolumeMonitorPointer, uuid)?.run {
            Volume.VolumeImpl(reinterpret())
        }

    /**
     * Gets a list of the volumes on the system.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return a #GList of #GVolume objects.
     */
    public open fun getVolumes(): List = g_volume_monitor_get_volumes(gioVolumeMonitorPointer)!!.run {
        List(this)
    }

    /**
     * Emitted when a drive changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` the drive that changed
     */
    public fun onDriveChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (drive: Drive) -> Unit): ULong =
        g_signal_connect_data(
            gioVolumeMonitorPointer,
            "drive-changed",
            onDriveChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "drive-changed" signal. See [onDriveChanged].
     *
     * @param drive the drive that changed
     */
    public fun emitDriveChanged(drive: Drive) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "drive-changed", drive.gioDrivePointer)
    }

    /**
     * Emitted when a drive is connected to the system.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` a #GDrive that was connected.
     */
    public fun onDriveConnected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (drive: Drive) -> Unit): ULong =
        g_signal_connect_data(
            gioVolumeMonitorPointer,
            "drive-connected",
            onDriveConnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "drive-connected" signal. See [onDriveConnected].
     *
     * @param drive a #GDrive that was connected.
     */
    public fun emitDriveConnected(drive: Drive) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "drive-connected", drive.gioDrivePointer)
    }

    /**
     * Emitted when a drive is disconnected from the system.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` a #GDrive that was disconnected.
     */
    public fun onDriveDisconnected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong = g_signal_connect_data(
        gioVolumeMonitorPointer,
        "drive-disconnected",
        onDriveDisconnectedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "drive-disconnected" signal. See [onDriveDisconnected].
     *
     * @param drive a #GDrive that was disconnected.
     */
    public fun emitDriveDisconnected(drive: Drive) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "drive-disconnected", drive.gioDrivePointer)
    }

    /**
     * Emitted when the eject button is pressed on @drive.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` the drive where the eject button was pressed
     * @since 2.18
     */
    @GioVersion2_18
    public fun onDriveEjectButton(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong = g_signal_connect_data(
        gioVolumeMonitorPointer,
        "drive-eject-button",
        onDriveEjectButtonFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "drive-eject-button" signal. See [onDriveEjectButton].
     *
     * @param drive the drive where the eject button was pressed
     * @since 2.18
     */
    @GioVersion2_18
    public fun emitDriveEjectButton(drive: Drive) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "drive-eject-button", drive.gioDrivePointer)
    }

    /**
     * Emitted when the stop button is pressed on @drive.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` the drive where the stop button was pressed
     * @since 2.22
     */
    @GioVersion2_22
    public fun onDriveStopButton(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong = g_signal_connect_data(
        gioVolumeMonitorPointer,
        "drive-stop-button",
        onDriveStopButtonFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "drive-stop-button" signal. See [onDriveStopButton].
     *
     * @param drive the drive where the stop button was pressed
     * @since 2.22
     */
    @GioVersion2_22
    public fun emitDriveStopButton(drive: Drive) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "drive-stop-button", drive.gioDrivePointer)
    }

    /**
     * Emitted when a mount is added.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that was added.
     */
    public fun onMountAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (mount: Mount) -> Unit): ULong =
        g_signal_connect_data(
            gioVolumeMonitorPointer,
            "mount-added",
            onMountAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "mount-added" signal. See [onMountAdded].
     *
     * @param mount a #GMount that was added.
     */
    public fun emitMountAdded(mount: Mount) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "mount-added", mount.gioMountPointer)
    }

    /**
     * Emitted when a mount changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that changed.
     */
    public fun onMountChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (mount: Mount) -> Unit): ULong =
        g_signal_connect_data(
            gioVolumeMonitorPointer,
            "mount-changed",
            onMountChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "mount-changed" signal. See [onMountChanged].
     *
     * @param mount a #GMount that changed.
     */
    public fun emitMountChanged(mount: Mount) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "mount-changed", mount.gioMountPointer)
    }

    /**
     * May be emitted when a mount is about to be removed.
     *
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that is being unmounted.
     */
    public fun onMountPreUnmount(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mount: Mount) -> Unit,
    ): ULong = g_signal_connect_data(
        gioVolumeMonitorPointer,
        "mount-pre-unmount",
        onMountPreUnmountFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "mount-pre-unmount" signal. See [onMountPreUnmount].
     *
     * @param mount a #GMount that is being unmounted.
     */
    public fun emitMountPreUnmount(mount: Mount) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "mount-pre-unmount", mount.gioMountPointer)
    }

    /**
     * Emitted when a mount is removed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that was removed.
     */
    public fun onMountRemoved(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (mount: Mount) -> Unit): ULong =
        g_signal_connect_data(
            gioVolumeMonitorPointer,
            "mount-removed",
            onMountRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "mount-removed" signal. See [onMountRemoved].
     *
     * @param mount a #GMount that was removed.
     */
    public fun emitMountRemoved(mount: Mount) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "mount-removed", mount.gioMountPointer)
    }

    /**
     * Emitted when a mountable volume is added to the system.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `volume` a #GVolume that was added.
     */
    public fun onVolumeAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (volume: Volume) -> Unit): ULong =
        g_signal_connect_data(
            gioVolumeMonitorPointer,
            "volume-added",
            onVolumeAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "volume-added" signal. See [onVolumeAdded].
     *
     * @param volume a #GVolume that was added.
     */
    public fun emitVolumeAdded(volume: Volume) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "volume-added", volume.gioVolumePointer)
    }

    /**
     * Emitted when mountable volume is changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `volume` a #GVolume that changed.
     */
    public fun onVolumeChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (volume: Volume) -> Unit,
    ): ULong = g_signal_connect_data(
        gioVolumeMonitorPointer,
        "volume-changed",
        onVolumeChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "volume-changed" signal. See [onVolumeChanged].
     *
     * @param volume a #GVolume that changed.
     */
    public fun emitVolumeChanged(volume: Volume) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "volume-changed", volume.gioVolumePointer)
    }

    /**
     * Emitted when a mountable volume is removed from the system.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `volume` a #GVolume that was removed.
     */
    public fun onVolumeRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (volume: Volume) -> Unit,
    ): ULong = g_signal_connect_data(
        gioVolumeMonitorPointer,
        "volume-removed",
        onVolumeRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "volume-removed" signal. See [onVolumeRemoved].
     *
     * @param volume a #GVolume that was removed.
     */
    public fun emitVolumeRemoved(volume: Volume) {
        g_signal_emit_by_name(gioVolumeMonitorPointer.reinterpret(), "volume-removed", volume.gioVolumePointer)
    }

    public companion object : TypeCompanion<VolumeMonitor> {
        override val type: GeneratedClassKGType<VolumeMonitor> =
            GeneratedClassKGType(g_volume_monitor_get_type()) { VolumeMonitor(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * This function should be called by any #GVolumeMonitor
         * implementation when a new #GMount object is created that is not
         * associated with a #GVolume object. It must be called just before
         * emitting the @mount_added signal.
         *
         * If the return value is not null, the caller must associate the
         * returned #GVolume object with the #GMount. This involves returning
         * it in its g_mount_get_volume() implementation. The caller must
         * also listen for the "removed" signal on the returned object
         * and give up its reference when handling that signal
         *
         * Similarly, if implementing g_volume_monitor_adopt_orphan_mount(),
         * the implementor must take a reference to @mount and return it in
         * its g_volume_get_mount() implemented. Also, the implementor must
         * listen for the "unmounted" signal on @mount and give up its
         * reference upon handling that signal.
         *
         * There are two main use cases for this function.
         *
         * One is when implementing a user space file system driver that reads
         * blocks of a block device that is already represented by the native
         * volume monitor (for example a CD Audio file system driver). Such
         * a driver will generate its own #GMount object that needs to be
         * associated with the #GVolume object that represents the volume.
         *
         * The other is for implementing a #GVolumeMonitor whose sole purpose
         * is to return #GVolume objects representing entries in the users
         * "favorite servers" list or similar.
         *
         * @param mount a #GMount object to find a parent for
         * @return the #GVolume object that is the parent for @mount or null
         * if no wants to adopt the #GMount.
         */
        public fun adoptOrphanMount(mount: Mount): Volume =
            g_volume_monitor_adopt_orphan_mount(mount.gioMountPointer)!!.run {
                Volume.VolumeImpl(reinterpret())
            }

        /**
         * Gets the volume monitor used by gio.
         *
         * @return a reference to the #GVolumeMonitor used by gio. Call
         *    g_object_unref() when done with it.
         */
        public fun `get`(): VolumeMonitor = g_volume_monitor_get()!!.run {
            VolumeMonitor(this)
        }

        /**
         * Get the GType of VolumeMonitor
         *
         * @return the GType
         */
        public fun getType(): GType = g_volume_monitor_get_type()
    }
}

private val onDriveChangedFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        drive: CPointer<GDrive>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
        drive!!.run {
            Drive.DriveImpl(reinterpret())
        }
    )
}
    .reinterpret()

private val onDriveConnectedFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.DriveImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onDriveDisconnectedFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.DriveImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onDriveEjectButtonFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.DriveImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onDriveStopButtonFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.DriveImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onMountAddedFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        mount: CPointer<GMount>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
        mount!!.run {
            Mount.MountImpl(reinterpret())
        }
    )
}
    .reinterpret()

private val onMountChangedFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        mount: CPointer<GMount>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
        mount!!.run {
            Mount.MountImpl(reinterpret())
        }
    )
}
    .reinterpret()

private val onMountPreUnmountFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mount: CPointer<GMount>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
            mount!!.run {
                Mount.MountImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onMountRemovedFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        mount: CPointer<GMount>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
        mount!!.run {
            Mount.MountImpl(reinterpret())
        }
    )
}
    .reinterpret()

private val onVolumeAddedFunc: CPointer<CFunction<(CPointer<GVolume>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        volume: CPointer<GVolume>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(volume: Volume) -> Unit>().get().invoke(
        volume!!.run {
            Volume.VolumeImpl(reinterpret())
        }
    )
}
    .reinterpret()

private val onVolumeChangedFunc: CPointer<CFunction<(CPointer<GVolume>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            volume: CPointer<GVolume>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(volume: Volume) -> Unit>().get().invoke(
            volume!!.run {
                Volume.VolumeImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onVolumeRemovedFunc: CPointer<CFunction<(CPointer<GVolume>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            volume: CPointer<GVolume>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(volume: Volume) -> Unit>().get().invoke(
            volume!!.run {
                Volume.VolumeImpl(reinterpret())
            }
        )
    }
        .reinterpret()
