// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

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
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_50
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDrive
import org.gtkkn.native.gio.g_drive_can_eject
import org.gtkkn.native.gio.g_drive_can_poll_for_media
import org.gtkkn.native.gio.g_drive_can_start
import org.gtkkn.native.gio.g_drive_can_start_degraded
import org.gtkkn.native.gio.g_drive_can_stop
import org.gtkkn.native.gio.g_drive_eject
import org.gtkkn.native.gio.g_drive_eject_finish
import org.gtkkn.native.gio.g_drive_eject_with_operation
import org.gtkkn.native.gio.g_drive_eject_with_operation_finish
import org.gtkkn.native.gio.g_drive_enumerate_identifiers
import org.gtkkn.native.gio.g_drive_get_icon
import org.gtkkn.native.gio.g_drive_get_identifier
import org.gtkkn.native.gio.g_drive_get_name
import org.gtkkn.native.gio.g_drive_get_sort_key
import org.gtkkn.native.gio.g_drive_get_start_stop_type
import org.gtkkn.native.gio.g_drive_get_symbolic_icon
import org.gtkkn.native.gio.g_drive_get_type
import org.gtkkn.native.gio.g_drive_get_volumes
import org.gtkkn.native.gio.g_drive_has_media
import org.gtkkn.native.gio.g_drive_has_volumes
import org.gtkkn.native.gio.g_drive_is_media_check_automatic
import org.gtkkn.native.gio.g_drive_is_media_removable
import org.gtkkn.native.gio.g_drive_is_removable
import org.gtkkn.native.gio.g_drive_poll_for_media
import org.gtkkn.native.gio.g_drive_poll_for_media_finish
import org.gtkkn.native.gio.g_drive_start
import org.gtkkn.native.gio.g_drive_start_finish
import org.gtkkn.native.gio.g_drive_stop
import org.gtkkn.native.gio.g_drive_stop_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * `GDrive` represents a piece of hardware connected to the machine.
 * It’s generally only created for removable hardware or hardware with
 * removable media. For example, an optical disc drive, or a USB flash drive.
 *
 * `GDrive` is a container class for [iface@Gio.Volume] objects that stem from
 * the same piece of media. As such, `GDrive` abstracts a drive with
 * (or without) removable media and provides operations for querying
 * whether media is available, determining whether media change is
 * automatically detected and ejecting the media.
 *
 * If the `GDrive` reports that media isn’t automatically detected, one
 * can poll for media; typically one should not do this periodically
 * as a poll for media operation is potentially expensive and may
 * spin up the drive creating noise.
 *
 * `GDrive` supports starting and stopping drives with authentication
 * support for the former. This can be used to support a diverse set
 * of use cases including connecting/disconnecting iSCSI devices,
 * powering down external disk enclosures and starting/stopping
 * multi-disk devices such as RAID devices. Note that the actual
 * semantics and side-effects of starting/stopping a `GDrive` may vary
 * according to implementation. To choose the correct verbs in e.g. a
 * file manager, use [method@Gio.Drive.get_start_stop_type].
 *
 * For [porting from GnomeVFS](migrating-gnome-vfs.html) note that there is no
 * equivalent of `GDrive` in that API.
 */
public interface Drive :
    Proxy,
    KGTyped {
    public val gioDrivePointer: CPointer<GDrive>

    /**
     * Checks if a drive can be ejected.
     *
     * @return true if the @drive can be ejected, false otherwise.
     */
    public fun canEject(): Boolean = g_drive_can_eject(gioDrivePointer).asBoolean()

    /**
     * Checks if a drive can be polled for media changes.
     *
     * @return true if the @drive can be polled for media changes,
     *     false otherwise.
     */
    public fun canPollForMedia(): Boolean = g_drive_can_poll_for_media(gioDrivePointer).asBoolean()

    /**
     * Checks if a drive can be started.
     *
     * @return true if the @drive can be started, false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun canStart(): Boolean = g_drive_can_start(gioDrivePointer).asBoolean()

    /**
     * Checks if a drive can be started degraded.
     *
     * @return true if the @drive can be started degraded, false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun canStartDegraded(): Boolean = g_drive_can_start_degraded(gioDrivePointer).asBoolean()

    /**
     * Checks if a drive can be stopped.
     *
     * @return true if the @drive can be stopped, false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun canStop(): Boolean = g_drive_can_stop(gioDrivePointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.22.
     *
     * Use g_drive_eject_with_operation() instead.
     * ---
     *
     * Asynchronously ejects a drive.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_drive_eject_finish() to obtain the
     * result of the operation.
     *
     * @param flags flags affecting the unmount if required for eject
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     */
    public fun eject(flags: MountUnmountFlags, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_drive_eject(
            gioDrivePointer,
            flags.mask,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.22.
     *
     * Use g_drive_eject_with_operation_finish() instead.
     * ---
     *
     * Finishes ejecting a drive.
     *
     * @param result a #GAsyncResult.
     * @return true if the drive has been ejected successfully,
     *     false otherwise.
     */
    public fun ejectFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_drive_eject_finish(gioDrivePointer, result.gioAsyncResultPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Ejects a drive. This is an asynchronous operation, and is
     * finished by calling g_drive_eject_with_operation_finish() with the @drive
     * and #GAsyncResult data returned in the @callback.
     *
     * @param flags flags affecting the unmount if required for eject
     * @param mountOperation a #GMountOperation or null to avoid
     *     user interaction.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectWithOperation(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_drive_eject_with_operation(
        gioDrivePointer,
        flags.mask,
        mountOperation?.gioMountOperationPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the drive was successfully ejected. false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectWithOperationFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_drive_eject_with_operation_finish(
            gioDrivePointer,
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
     * Gets the kinds of identifiers that @drive has.
     * Use g_drive_get_identifier() to obtain the identifiers
     * themselves.
     *
     * @return a null-terminated
     *     array of strings containing kinds of identifiers. Use g_strfreev()
     *     to free.
     */
    public fun enumerateIdentifiers(): CollectionsList<String> =
        g_drive_enumerate_identifiers(gioDrivePointer)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Gets the icon for @drive.
     *
     * @return #GIcon for the @drive.
     *    Free the returned object with g_object_unref().
     */
    public fun getIcon(): Icon = g_drive_get_icon(gioDrivePointer)!!.run {
        Icon.IconImpl(reinterpret())
    }

    /**
     * Gets the identifier of the given kind for @drive. The only
     * identifier currently available is
     * %G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE.
     *
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the
     *     requested identifier, or null if the #GDrive
     *     doesn't have this kind of identifier.
     */
    public fun getIdentifier(kind: String): String? = g_drive_get_identifier(gioDrivePointer, kind)?.toKString()

    /**
     * Gets the name of @drive.
     *
     * @return a string containing @drive's name. The returned
     *     string should be freed when no longer needed.
     */
    public fun getName(): String = g_drive_get_name(gioDrivePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the sort key for @drive, if any.
     *
     * @return Sorting key for @drive or null if no such key is available.
     * @since 2.32
     */
    @GioVersion2_32
    public fun getSortKey(): String? = g_drive_get_sort_key(gioDrivePointer)?.toKString()

    /**
     * Gets a hint about how a drive can be started/stopped.
     *
     * @return A value from the #GDriveStartStopType enumeration.
     * @since 2.22
     */
    @GioVersion2_22
    public fun getStartStopType(): DriveStartStopType = g_drive_get_start_stop_type(gioDrivePointer).run {
        DriveStartStopType.fromNativeValue(this)
    }

    /**
     * Gets the icon for @drive.
     *
     * @return symbolic #GIcon for the @drive.
     *    Free the returned object with g_object_unref().
     * @since 2.34
     */
    @GioVersion2_34
    public fun getSymbolicIcon(): Icon = g_drive_get_symbolic_icon(gioDrivePointer)!!.run {
        Icon.IconImpl(reinterpret())
    }

    /**
     * Get a list of mountable volumes for @drive.
     *
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     *
     * @return #GList containing any #GVolume objects on the given @drive.
     */
    public fun getVolumes(): GlibList = g_drive_get_volumes(gioDrivePointer)!!.run {
        GlibList(this)
    }

    /**
     * Checks if the @drive has media. Note that the OS may not be polling
     * the drive for media changes; see g_drive_is_media_check_automatic()
     * for more details.
     *
     * @return true if @drive has media, false otherwise.
     */
    public fun hasMedia(): Boolean = g_drive_has_media(gioDrivePointer).asBoolean()

    /**
     * Check if @drive has any mountable volumes.
     *
     * @return true if the @drive contains volumes, false otherwise.
     */
    public fun hasVolumes(): Boolean = g_drive_has_volumes(gioDrivePointer).asBoolean()

    /**
     * Checks if @drive is capable of automatically detecting media changes.
     *
     * @return true if the @drive is capable of automatically detecting
     *     media changes, false otherwise.
     */
    public fun isMediaCheckAutomatic(): Boolean = g_drive_is_media_check_automatic(gioDrivePointer).asBoolean()

    /**
     * Checks if the @drive supports removable media.
     *
     * @return true if @drive supports removable media, false otherwise.
     */
    public fun isMediaRemovable(): Boolean = g_drive_is_media_removable(gioDrivePointer).asBoolean()

    /**
     * Checks if the #GDrive and/or its media is considered removable by the user.
     * See g_drive_is_media_removable().
     *
     * @return true if @drive and/or its media is considered removable, false otherwise.
     * @since 2.50
     */
    @GioVersion2_50
    public fun isRemovable(): Boolean = g_drive_is_removable(gioDrivePointer).asBoolean()

    /**
     * Asynchronously polls @drive to see if media has been inserted or removed.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_drive_poll_for_media_finish() to obtain the
     * result of the operation.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     */
    public fun pollForMedia(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_drive_poll_for_media(
            gioDrivePointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     *
     * @param result a #GAsyncResult.
     * @return true if the drive has been poll_for_mediaed successfully,
     *     false otherwise.
     */
    public fun pollForMediaFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_drive_poll_for_media_finish(
            gioDrivePointer,
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
     * Asynchronously starts a drive.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_drive_start_finish() to obtain the
     * result of the operation.
     *
     * @param flags flags affecting the start operation.
     * @param mountOperation a #GMountOperation or null to avoid
     *     user interaction.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     * @since 2.22
     */
    @GioVersion2_22
    public fun start(
        flags: DriveStartFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_drive_start(
        gioDrivePointer,
        flags.mask,
        mountOperation?.gioMountOperationPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes starting a drive.
     *
     * @param result a #GAsyncResult.
     * @return true if the drive has been started successfully,
     *     false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun startFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_drive_start_finish(gioDrivePointer, result.gioAsyncResultPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously stops a drive.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_drive_stop_finish() to obtain the
     * result of the operation.
     *
     * @param flags flags affecting the unmount if required for stopping.
     * @param mountOperation a #GMountOperation or null to avoid
     *     user interaction.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     * @since 2.22
     */
    @GioVersion2_22
    public fun stop(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_drive_stop(
        gioDrivePointer,
        flags.mask,
        mountOperation?.gioMountOperationPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes stopping a drive.
     *
     * @param result a #GAsyncResult.
     * @return true if the drive has been stopped successfully,
     *     false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun stopFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_drive_stop_finish(gioDrivePointer, result.gioAsyncResultPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Emitted when the drive's state has changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioDrivePointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the #GDrive have been
     * disconnected. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDisconnected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioDrivePointer,
            "disconnected",
            onDisconnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the physical eject button (if any) of a drive has
     * been pressed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onEjectButton(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioDrivePointer,
            "eject-button",
            onEjectButtonFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the physical stop button (if any) of a drive has
     * been pressed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.22
     */
    @GioVersion2_22
    public fun onStopButton(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioDrivePointer,
            "stop-button",
            onStopButtonFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The DriveImpl type represents a native instance of the Drive interface.
     *
     * @constructor Creates a new instance of Drive for the provided [CPointer].
     */
    public class DriveImpl(gioDrivePointer: CPointer<GDrive>) :
        Object(gioDrivePointer.reinterpret()),
        Drive {
        init {
            Gio
        }

        override val gioDrivePointer: CPointer<GDrive> = gioDrivePointer
    }

    public companion object : TypeCompanion<Drive> {
        override val type: GeneratedInterfaceKGType<Drive> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { DriveImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Drive
         *
         * @return the GType
         */
        public fun getType(): GType = g_drive_get_type()

        /**
         * Gets the GType of from the symbol `g_drive_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_drive_get_type")
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDisconnectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onEjectButtonFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onStopButtonFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
