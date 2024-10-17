// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

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
import org.gtkkn.native.gobject.g_signal_connect_data
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
public open class VolumeMonitor(
    pointer: CPointer<GVolumeMonitor>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioVolumeMonitorPointer: CPointer<GVolumeMonitor>
        get() = gPointer.reinterpret()

    /**
     * Gets a list of drives connected to the system.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return a #GList of connected #GDrive objects.
     */
    public open fun getConnectedDrives(): List =
        g_volume_monitor_get_connected_drives(gioVolumeMonitorPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Finds a #GMount object by its UUID (see g_mount_get_uuid())
     *
     * @param uuid the UUID to look for
     * @return a #GMount or null if no such mount is available.
     *     Free the returned object with g_object_unref().
     */
    public open fun getMountForUuid(uuid: String): Mount? =
        g_volume_monitor_get_mount_for_uuid(gioVolumeMonitorPointer.reinterpret(), uuid)?.run {
            Mount.wrap(reinterpret())
        }

    /**
     * Gets a list of the mounts on the system.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return a #GList of #GMount objects.
     */
    public open fun getMounts(): List =
        g_volume_monitor_get_mounts(gioVolumeMonitorPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Finds a #GVolume object by its UUID (see g_volume_get_uuid())
     *
     * @param uuid the UUID to look for
     * @return a #GVolume or null if no such volume is available.
     *     Free the returned object with g_object_unref().
     */
    public open fun getVolumeForUuid(uuid: String): Volume? =
        g_volume_monitor_get_volume_for_uuid(gioVolumeMonitorPointer.reinterpret(), uuid)?.run {
            Volume.wrap(reinterpret())
        }

    /**
     * Gets a list of the volumes on the system.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return a #GList of #GVolume objects.
     */
    public open fun getVolumes(): List =
        g_volume_monitor_get_volumes(gioVolumeMonitorPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Emitted when a drive changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` the drive that changed
     */
    public fun connectDriveChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drive-changed",
            connectDriveChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a drive is connected to the system.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` a #GDrive that was connected.
     */
    public fun connectDriveConnected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drive-connected",
            connectDriveConnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a drive is disconnected from the system.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` a #GDrive that was disconnected.
     */
    public fun connectDriveDisconnected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drive-disconnected",
            connectDriveDisconnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the eject button is pressed on @drive.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` the drive where the eject button was
     * pressed
     * @since 2.18
     */
    public fun connectDriveEjectButton(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drive-eject-button",
            connectDriveEjectButtonFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the stop button is pressed on @drive.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drive` the drive where the stop button was
     * pressed
     * @since 2.22
     */
    public fun connectDriveStopButton(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drive: Drive) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drive-stop-button",
            connectDriveStopButtonFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a mount is added.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that was added.
     */
    public fun connectMountAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mount: Mount) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mount-added",
            connectMountAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a mount changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that changed.
     */
    public fun connectMountChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mount: Mount) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mount-changed",
            connectMountChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * May be emitted when a mount is about to be removed.
     *
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that is being unmounted.
     */
    public fun connectMountPreUnmount(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mount: Mount) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mount-pre-unmount",
            connectMountPreUnmountFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a mount is removed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mount` a #GMount that was removed.
     */
    public fun connectMountRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mount: Mount) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mount-removed",
            connectMountRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a mountable volume is added to the system.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `volume` a #GVolume that was added.
     */
    public fun connectVolumeAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (volume: Volume) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "volume-added",
            connectVolumeAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when mountable volume is changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `volume` a #GVolume that changed.
     */
    public fun connectVolumeChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (volume: Volume) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "volume-changed",
            connectVolumeChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a mountable volume is removed from the system.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `volume` a #GVolume that was removed.
     */
    public fun connectVolumeRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (volume: Volume) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "volume-removed",
            connectVolumeRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<VolumeMonitor> {
        override val type: GeneratedClassKGType<VolumeMonitor> =
            GeneratedClassKGType(g_volume_monitor_get_type()) {
                VolumeMonitor(it.reinterpret())
            }

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
                Volume.wrap(reinterpret())
            }

        /**
         * Gets the volume monitor used by gio.
         *
         * @return a reference to the #GVolumeMonitor used by gio. Call
         *    g_object_unref() when done with it.
         */
        public fun `get`(): VolumeMonitor =
            g_volume_monitor_get()!!.run {
                VolumeMonitor(reinterpret())
            }
    }
}

private val connectDriveChangedFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectDriveConnectedFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectDriveDisconnectedFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectDriveEjectButtonFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectDriveStopButtonFunc: CPointer<CFunction<(CPointer<GDrive>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drive: CPointer<GDrive>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drive: Drive) -> Unit>().get().invoke(
            drive!!.run {
                Drive.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectMountAddedFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mount: CPointer<GMount>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
            mount!!.run {
                Mount.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectMountChangedFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mount: CPointer<GMount>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
            mount!!.run {
                Mount.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectMountPreUnmountFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mount: CPointer<GMount>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
            mount!!.run {
                Mount.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectMountRemovedFunc: CPointer<CFunction<(CPointer<GMount>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mount: CPointer<GMount>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mount: Mount) -> Unit>().get().invoke(
            mount!!.run {
                Mount.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectVolumeAddedFunc: CPointer<CFunction<(CPointer<GVolume>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            volume: CPointer<GVolume>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(volume: Volume) -> Unit>().get().invoke(
            volume!!.run {
                Volume.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectVolumeChangedFunc: CPointer<CFunction<(CPointer<GVolume>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            volume: CPointer<GVolume>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(volume: Volume) -> Unit>().get().invoke(
            volume!!.run {
                Volume.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectVolumeRemovedFunc: CPointer<CFunction<(CPointer<GVolume>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            volume: CPointer<GVolume>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(volume: Volume) -> Unit>().get().invoke(
            volume!!.run {
                Volume.wrap(reinterpret())
            }
        )
    }
        .reinterpret()
