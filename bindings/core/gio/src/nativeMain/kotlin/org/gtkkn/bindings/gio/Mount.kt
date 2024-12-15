// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GMount
import org.gtkkn.native.gio.g_mount_can_eject
import org.gtkkn.native.gio.g_mount_can_unmount
import org.gtkkn.native.gio.g_mount_eject
import org.gtkkn.native.gio.g_mount_eject_finish
import org.gtkkn.native.gio.g_mount_eject_with_operation
import org.gtkkn.native.gio.g_mount_eject_with_operation_finish
import org.gtkkn.native.gio.g_mount_get_default_location
import org.gtkkn.native.gio.g_mount_get_drive
import org.gtkkn.native.gio.g_mount_get_icon
import org.gtkkn.native.gio.g_mount_get_name
import org.gtkkn.native.gio.g_mount_get_root
import org.gtkkn.native.gio.g_mount_get_sort_key
import org.gtkkn.native.gio.g_mount_get_symbolic_icon
import org.gtkkn.native.gio.g_mount_get_type
import org.gtkkn.native.gio.g_mount_get_uuid
import org.gtkkn.native.gio.g_mount_get_volume
import org.gtkkn.native.gio.g_mount_guess_content_type
import org.gtkkn.native.gio.g_mount_guess_content_type_finish
import org.gtkkn.native.gio.g_mount_guess_content_type_sync
import org.gtkkn.native.gio.g_mount_is_shadowed
import org.gtkkn.native.gio.g_mount_remount
import org.gtkkn.native.gio.g_mount_remount_finish
import org.gtkkn.native.gio.g_mount_shadow
import org.gtkkn.native.gio.g_mount_unmount
import org.gtkkn.native.gio.g_mount_unmount_finish
import org.gtkkn.native.gio.g_mount_unmount_with_operation
import org.gtkkn.native.gio.g_mount_unmount_with_operation_finish
import org.gtkkn.native.gio.g_mount_unshadow
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * The `GMount` interface represents user-visible mounts. Note, when
 * [porting from GnomeVFS](migrating-gnome-vfs.html), `GMount` is the moral
 * equivalent of `GnomeVFSVolume`.
 *
 * `GMount` is a ‘mounted’ filesystem that you can access. Mounted is in
 * quotes because it’s not the same as a UNIX mount, it might be a GVFS
 * mount, but you can still access the files on it if you use GIO. Might or
 * might not be related to a volume object.
 *
 * Unmounting a `GMount` instance is an asynchronous operation. For
 * more information about asynchronous operations, see [iface@Gio.AsyncResult]
 * and [class@Gio.Task]. To unmount a `GMount` instance, first call
 * [method@Gio.Mount.unmount_with_operation] with (at least) the `GMount`
 * instance and a [type@Gio.AsyncReadyCallback].  The callback will be fired
 * when the operation has resolved (either with success or failure), and a
 * [iface@Gio.AsyncResult] structure will be passed to the callback.  That
 * callback should then call [method@Gio.Mount.unmount_with_operation_finish]
 * with the `GMount` and the [iface@Gio.AsyncResult] data to see if the
 * operation was completed successfully.  If an `error` is present when
 * [method@Gio.Mount.unmount_with_operation_finish] is called, then it will be
 * filled with any error information.
 */
public interface Mount :
    Interface,
    KGTyped {
    public val gioMountPointer: CPointer<GMount>

    /**
     * Checks if @mount can be ejected.
     *
     * @return true if the @mount can be ejected.
     */
    public fun canEject(): Boolean = g_mount_can_eject(gioMountPointer.reinterpret()).asBoolean()

    /**
     * Checks if @mount can be unmounted.
     *
     * @return true if the @mount can be unmounted.
     */
    public fun canUnmount(): Boolean = g_mount_can_unmount(gioMountPointer.reinterpret()).asBoolean()

    /**
     * Ejects a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_eject_finish() with the @mount
     * and #GAsyncResult data returned in the @callback.
     *
     * @param flags flags affecting the unmount if required for eject
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     */
    public fun eject(flags: MountUnmountFlags, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_mount_eject(
            gioMountPointer.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the mount was successfully ejected. false otherwise.
     */
    public fun ejectFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_mount_eject_finish(
            gioMountPointer.reinterpret(),
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
     * Ejects a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_eject_with_operation_finish() with the @mount
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
    ): Unit = g_mount_eject_with_operation(
        gioMountPointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the mount was successfully ejected. false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectWithOperationFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_mount_eject_with_operation_finish(
            gioMountPointer.reinterpret(),
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
     * Gets the default location of @mount. The default location of the given
     * @mount is a path that reflects the main entry point for the user (e.g.
     * the home directory, or the root of the volume).
     *
     * @return a #GFile.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    public fun getDefaultLocation(): File = g_mount_get_default_location(gioMountPointer.reinterpret())!!.run {
        File.wrap(reinterpret())
    }

    /**
     * Gets the drive for the @mount.
     *
     * This is a convenience method for getting the #GVolume and then
     * using that object to get the #GDrive.
     *
     * @return a #GDrive or null if @mount is not
     *      associated with a volume or a drive.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    public fun getDrive(): Drive? = g_mount_get_drive(gioMountPointer.reinterpret())?.run {
        Drive.wrap(reinterpret())
    }

    /**
     * Gets the icon for @mount.
     *
     * @return a #GIcon.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    public fun getIcon(): Icon = g_mount_get_icon(gioMountPointer.reinterpret())!!.run {
        Icon.wrap(reinterpret())
    }

    /**
     * Gets the name of @mount.
     *
     * @return the name for the given @mount.
     *     The returned string should be freed with g_free()
     *     when no longer needed.
     */
    public fun getName(): String =
        g_mount_get_name(gioMountPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the root directory on @mount.
     *
     * @return a #GFile.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    public fun getRoot(): File = g_mount_get_root(gioMountPointer.reinterpret())!!.run {
        File.wrap(reinterpret())
    }

    /**
     * Gets the sort key for @mount, if any.
     *
     * @return Sorting key for @mount or null if no such key is available.
     * @since 2.32
     */
    @GioVersion2_32
    public fun getSortKey(): String? = g_mount_get_sort_key(gioMountPointer.reinterpret())?.toKString()

    /**
     * Gets the symbolic icon for @mount.
     *
     * @return a #GIcon.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     * @since 2.34
     */
    @GioVersion2_34
    public fun getSymbolicIcon(): Icon = g_mount_get_symbolic_icon(gioMountPointer.reinterpret())!!.run {
        Icon.wrap(reinterpret())
    }

    /**
     * Gets the UUID for the @mount. The reference is typically based on
     * the file system UUID for the mount in question and should be
     * considered an opaque string. Returns null if there is no UUID
     * available.
     *
     * @return the UUID for @mount or null if no UUID
     *     can be computed.
     *     The returned string should be freed with g_free()
     *     when no longer needed.
     */
    public fun getUuid(): String? = g_mount_get_uuid(gioMountPointer.reinterpret())?.toKString()

    /**
     * Gets the volume for the @mount.
     *
     * @return a #GVolume or null if @mount is not
     *      associated with a volume.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    public fun getVolume(): Volume? = g_mount_get_volume(gioMountPointer.reinterpret())?.run {
        Volume.wrap(reinterpret())
    }

    /**
     * Tries to guess the type of content stored on @mount. Returns one or
     * more textual identifiers of well-known content types (typically
     * prefixed with "x-content/"), e.g. x-content/image-dcf for camera
     * memory cards. See the
     * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * specification for more on x-content types.
     *
     * This is an asynchronous operation (see
     * g_mount_guess_content_type_sync() for the synchronous version), and
     * is finished by calling g_mount_guess_content_type_finish() with the
     * @mount and #GAsyncResult data returned in the @callback.
     *
     * @param forceRescan Whether to force a rescan of the content.
     *     Otherwise a cached result will be used if available
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback
     * @since 2.18
     */
    @GioVersion2_18
    public fun guessContentType(
        forceRescan: Boolean,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_mount_guess_content_type(
        gioMountPointer.reinterpret(),
        forceRescan.asGBoolean(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes guessing content types of @mount. If any errors occurred
     * during the operation, @error will be set to contain the errors and
     * false will be returned. In particular, you may get an
     * %G_IO_ERROR_NOT_SUPPORTED if the mount does not support content
     * guessing.
     *
     * @param result a #GAsyncResult
     * @return a null-terminated array of content types or null on error.
     *     Caller should free this array with g_strfreev() when done with it.
     * @since 2.18
     */
    @GioVersion2_18
    public fun guessContentTypeFinish(result: AsyncResult): Result<List<String>> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_mount_guess_content_type_finish(
            gioMountPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.toKStringList()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Tries to guess the type of content stored on @mount. Returns one or
     * more textual identifiers of well-known content types (typically
     * prefixed with "x-content/"), e.g. x-content/image-dcf for camera
     * memory cards. See the
     * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * specification for more on x-content types.
     *
     * This is a synchronous operation and as such may block doing IO;
     * see g_mount_guess_content_type() for the asynchronous version.
     *
     * @param forceRescan Whether to force a rescan of the content.
     *     Otherwise a cached result will be used if available
     * @param cancellable optional #GCancellable object, null to ignore
     * @return a null-terminated array of content types or null on error.
     *     Caller should free this array with g_strfreev() when done with it.
     * @since 2.18
     */
    @GioVersion2_18
    public fun guessContentTypeSync(forceRescan: Boolean, cancellable: Cancellable? = null): Result<List<String>> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_mount_guess_content_type_sync(
                gioMountPointer.reinterpret(),
                forceRescan.asGBoolean(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )?.toKStringList()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Determines if @mount is shadowed. Applications or libraries should
     * avoid displaying @mount in the user interface if it is shadowed.
     *
     * A mount is said to be shadowed if there exists one or more user
     * visible objects (currently #GMount objects) with a root that is
     * inside the root of @mount.
     *
     * One application of shadow mounts is when exposing a single file
     * system that is used to address several logical volumes. In this
     * situation, a #GVolumeMonitor implementation would create two
     * #GVolume objects (for example, one for the camera functionality of
     * the device and one for a SD card reader on the device) with
     * activation URIs `gphoto2://[usb:001,002]/store1/`
     * and `gphoto2://[usb:001,002]/store2/`. When the
     * underlying mount (with root
     * `gphoto2://[usb:001,002]/`) is mounted, said
     * #GVolumeMonitor implementation would create two #GMount objects
     * (each with their root matching the corresponding volume activation
     * root) that would shadow the original mount.
     *
     * The proxy monitor in GVfs 2.26 and later, automatically creates and
     * manage shadow mounts (and shadows the underlying mount) if the
     * activation root on a #GVolume is set.
     *
     * @return true if @mount is shadowed.
     * @since 2.20
     */
    @GioVersion2_20
    public fun isShadowed(): Boolean = g_mount_is_shadowed(gioMountPointer.reinterpret()).asBoolean()

    /**
     * Remounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_remount_finish() with the @mount
     * and #GAsyncResults data returned in the @callback.
     *
     * Remounting is useful when some setting affecting the operation
     * of the volume has been changed, as these may need a remount to
     * take affect. While this is semantically equivalent with unmounting
     * and then remounting not all backends might need to actually be
     * unmounted.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation or null to avoid
     *     user interaction.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     */
    public fun remount(
        flags: MountMountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_mount_remount(
        gioMountPointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes remounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the mount was successfully remounted. false otherwise.
     */
    public fun remountFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_mount_remount_finish(
            gioMountPointer.reinterpret(),
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
     * Increments the shadow count on @mount. Usually used by
     * #GVolumeMonitor implementations when creating a shadow mount for
     * @mount, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the #GMount::changed signal on @mount manually.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public fun shadow(): Unit = g_mount_shadow(gioMountPointer.reinterpret())

    /**
     * Unmounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_unmount_finish() with the @mount
     * and #GAsyncResult data returned in the @callback.
     *
     * @param flags flags affecting the operation
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     */
    public fun unmount(
        flags: MountUnmountFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_mount_unmount(
        gioMountPointer.reinterpret(),
        flags.mask,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the mount was successfully unmounted. false otherwise.
     */
    public fun unmountFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_mount_unmount_finish(
            gioMountPointer.reinterpret(),
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
     * Unmounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_unmount_with_operation_finish() with the @mount
     * and #GAsyncResult data returned in the @callback.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation or null to avoid
     *     user interaction.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback, or null.
     * @since 2.22
     */
    @GioVersion2_22
    public fun unmountWithOperation(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_mount_unmount_with_operation(
        gioMountPointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the mount was successfully unmounted. false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun unmountWithOperationFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_mount_unmount_with_operation_finish(
            gioMountPointer.reinterpret(),
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
     * Decrements the shadow count on @mount. Usually used by
     * #GVolumeMonitor implementations when destroying a shadow mount for
     * @mount, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the #GMount::changed signal on @mount manually.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public fun unshadow(): Unit = g_mount_unshadow(gioMountPointer.reinterpret())

    /**
     * Emitted when the mount has been changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioMountPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal may be emitted when the #GMount is about to be
     * unmounted.
     *
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.22
     */
    @GioVersion2_22
    public fun connectPreUnmount(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioMountPointer.reinterpret(),
            "pre-unmount",
            connectPreUnmountFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the #GMount have been
     * unmounted. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectUnmounted(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioMountPointer.reinterpret(),
            "unmounted",
            connectUnmountedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(private val pointer: CPointer<GMount>) : Mount {
        override val gioMountPointer: CPointer<GMount> = pointer
    }

    public companion object : TypeCompanion<Mount> {
        override val type: GeneratedInterfaceKGType<Mount> =
            GeneratedInterfaceKGType(g_mount_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GMount>): Mount = Wrapper(pointer)

        /**
         * Get the GType of Mount
         *
         * @return the GType
         */
        public fun getType(): GType = g_mount_get_type()
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectPreUnmountFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectUnmountedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
