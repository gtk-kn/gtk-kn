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
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GVolume
import org.gtkkn.native.gio.g_volume_can_eject
import org.gtkkn.native.gio.g_volume_can_mount
import org.gtkkn.native.gio.g_volume_eject
import org.gtkkn.native.gio.g_volume_eject_finish
import org.gtkkn.native.gio.g_volume_eject_with_operation
import org.gtkkn.native.gio.g_volume_eject_with_operation_finish
import org.gtkkn.native.gio.g_volume_enumerate_identifiers
import org.gtkkn.native.gio.g_volume_get_activation_root
import org.gtkkn.native.gio.g_volume_get_drive
import org.gtkkn.native.gio.g_volume_get_icon
import org.gtkkn.native.gio.g_volume_get_identifier
import org.gtkkn.native.gio.g_volume_get_mount
import org.gtkkn.native.gio.g_volume_get_name
import org.gtkkn.native.gio.g_volume_get_sort_key
import org.gtkkn.native.gio.g_volume_get_symbolic_icon
import org.gtkkn.native.gio.g_volume_get_type
import org.gtkkn.native.gio.g_volume_get_uuid
import org.gtkkn.native.gio.g_volume_mount
import org.gtkkn.native.gio.g_volume_mount_finish
import org.gtkkn.native.gio.g_volume_should_automount
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
 * The `GVolume` interface represents user-visible objects that can be
 * mounted. Note, when [porting from GnomeVFS](migrating-gnome-vfs.html),
 * `GVolume` is the moral equivalent of `GnomeVFSDrive`.
 *
 * Mounting a `GVolume` instance is an asynchronous operation. For more
 * information about asynchronous operations, see [iface@Gio.AsyncResult] and
 * [class@Gio.Task]. To mount a `GVolume`, first call [method@Gio.Volume.mount]
 * with (at least) the `GVolume` instance, optionally a
 * [class@Gio.MountOperation] object and a [type@Gio.AsyncReadyCallback].
 *
 * Typically, one will only want to pass `NULL` for the
 * [class@Gio.MountOperation] if automounting all volumes when a desktop session
 * starts since it’s not desirable to put up a lot of dialogs asking
 * for credentials.
 *
 * The callback will be fired when the operation has resolved (either
 * with success or failure), and a [iface@Gio.AsyncResult] instance will be
 * passed to the callback.  That callback should then call
 * [method@Gio.Volume.mount_finish] with the `GVolume` instance and the
 * [iface@Gio.AsyncResult] data to see if the operation was completed
 * successfully.  If a [type@GLib.Error] is present when
 * [method@Gio.Volume.mount_finish] is called, then it will be filled with any
 * error information.
 *
 * ## Volume Identifiers
 *
 * It is sometimes necessary to directly access the underlying
 * operating system object behind a volume (e.g. for passing a volume
 * to an application via the command line). For this purpose, GIO
 * allows to obtain an ‘identifier’ for the volume. There can be
 * different kinds of identifiers, such as Hal UDIs, filesystem labels,
 * traditional Unix devices (e.g. `/dev/sda2`), UUIDs. GIO uses predefined
 * strings as names for the different kinds of identifiers:
 * `G_VOLUME_IDENTIFIER_KIND_UUID`, `G_VOLUME_IDENTIFIER_KIND_LABEL`, etc.
 * Use [method@Gio.Volume.get_identifier] to obtain an identifier for a volume.
 *
 * Note that `G_VOLUME_IDENTIFIER_KIND_HAL_UDI` will only be available
 * when the GVFS hal volume monitor is in use. Other volume monitors
 * will generally be able to provide the `G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE`
 * identifier, which can be used to obtain a hal device by means of
 * `libhal_manager_find_device_string_match()`.
 */
public interface Volume :
    Proxy,
    KGTyped {
    public val gioVolumePointer: CPointer<GVolume>

    /**
     * Checks if a volume can be ejected.
     *
     * @return true if the @volume can be ejected. false otherwise
     */
    public fun canEject(): Boolean = g_volume_can_eject(gioVolumePointer).asBoolean()

    /**
     * Checks if a volume can be mounted.
     *
     * @return true if the @volume can be mounted. false otherwise
     */
    public fun canMount(): Boolean = g_volume_can_mount(gioVolumePointer).asBoolean()

    /**
     * Ejects a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_eject_finish() with the @volume
     * and #GAsyncResult returned in the @callback.
     *
     * @param flags flags affecting the unmount if required for eject
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback, or null
     */
    public fun eject(flags: MountUnmountFlags, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_volume_eject(
            gioVolumePointer,
            flags.mask,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult
     * @return true, false if operation failed
     */
    public fun ejectFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_volume_eject_finish(gioVolumePointer, result.gioAsyncResultPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Ejects a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_eject_with_operation_finish() with the @volume
     * and #GAsyncResult data returned in the @callback.
     *
     * @param flags flags affecting the unmount if required for eject
     * @param mountOperation a #GMountOperation or null to
     *     avoid user interaction
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback, or null
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectWithOperation(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_volume_eject_with_operation(
        gioVolumePointer,
        flags.mask,
        mountOperation?.gioMountOperationPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * @param result a #GAsyncResult
     * @return true if the volume was successfully ejected. false otherwise
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectWithOperationFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_volume_eject_with_operation_finish(
            gioVolumePointer,
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
     * Gets the kinds of [identifiers](#volume-identifiers) that @volume has.
     * Use g_volume_get_identifier() to obtain the identifiers themselves.
     *
     * @return a null-terminated array
     *   of strings containing kinds of identifiers. Use g_strfreev() to free.
     */
    public fun enumerateIdentifiers(): List<String> =
        g_volume_enumerate_identifiers(gioVolumePointer)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Gets the activation root for a #GVolume if it is known ahead of
     * mount time. Returns null otherwise. If not null and if @volume
     * is mounted, then the result of g_mount_get_root() on the
     * #GMount object obtained from g_volume_get_mount() will always
     * either be equal or a prefix of what this function returns. In
     * other words, in code
     *
     * |[<!-- language="C" -->
     *   GMount *mount;
     *   GFile *mount_root
     *   GFile *volume_activation_root;
     *
     *   mount = g_volume_get_mount (volume); // mounted, so never NULL
     *   mount_root = g_mount_get_root (mount);
     *   volume_activation_root = g_volume_get_activation_root (volume); // assume not NULL
     * ]|
     * then the expression
     * |[<!-- language="C" -->
     *   (g_file_has_prefix (volume_activation_root, mount_root) ||
     *    g_file_equal (volume_activation_root, mount_root))
     * ]|
     * will always be true.
     *
     * Activation roots are typically used in #GVolumeMonitor
     * implementations to find the underlying mount to shadow, see
     * g_mount_is_shadowed() for more details.
     *
     * @return the activation root of @volume
     *     or null. Use g_object_unref() to free.
     * @since 2.18
     */
    @GioVersion2_18
    public fun getActivationRoot(): File? = g_volume_get_activation_root(gioVolumePointer)?.run {
        File.FileImpl(reinterpret())
    }

    /**
     * Gets the drive for the @volume.
     *
     * @return a #GDrive or null if @volume is not
     *     associated with a drive. The returned object should be unreffed
     *     with g_object_unref() when no longer needed.
     */
    public fun getDrive(): Drive? = g_volume_get_drive(gioVolumePointer)?.run {
        Drive.DriveImpl(reinterpret())
    }

    /**
     * Gets the icon for @volume.
     *
     * @return a #GIcon.
     *     The returned object should be unreffed with g_object_unref()
     *     when no longer needed.
     */
    public fun getIcon(): Icon = g_volume_get_icon(gioVolumePointer)!!.run {
        Icon.IconImpl(reinterpret())
    }

    /**
     * Gets the identifier of the given kind for @volume.
     * See the [introduction](#volume-identifiers) for more
     * information about volume identifiers.
     *
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the
     *     requested identifier, or null if the #GVolume
     *     doesn't have this kind of identifier
     */
    public fun getIdentifier(kind: String): String? = g_volume_get_identifier(gioVolumePointer, kind)?.toKString()

    /**
     * Gets the mount for the @volume.
     *
     * @return a #GMount or null if @volume isn't mounted.
     *     The returned object should be unreffed with g_object_unref()
     *     when no longer needed.
     */
    public fun getMount(): Mount? = g_volume_get_mount(gioVolumePointer)?.run {
        Mount.MountImpl(reinterpret())
    }

    /**
     * Gets the name of @volume.
     *
     * @return the name for the given @volume. The returned string should
     *     be freed with g_free() when no longer needed.
     */
    public fun getName(): String = g_volume_get_name(gioVolumePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the sort key for @volume, if any.
     *
     * @return Sorting key for @volume or null if no such key is available
     * @since 2.32
     */
    @GioVersion2_32
    public fun getSortKey(): String? = g_volume_get_sort_key(gioVolumePointer)?.toKString()

    /**
     * Gets the symbolic icon for @volume.
     *
     * @return a #GIcon.
     *     The returned object should be unreffed with g_object_unref()
     *     when no longer needed.
     * @since 2.34
     */
    @GioVersion2_34
    public fun getSymbolicIcon(): Icon = g_volume_get_symbolic_icon(gioVolumePointer)!!.run {
        Icon.IconImpl(reinterpret())
    }

    /**
     * Gets the UUID for the @volume. The reference is typically based on
     * the file system UUID for the volume in question and should be
     * considered an opaque string. Returns null if there is no UUID
     * available.
     *
     * @return the UUID for @volume or null if no UUID
     *     can be computed.
     *     The returned string should be freed with g_free()
     *     when no longer needed.
     */
    public fun getUuid(): String? = g_volume_get_uuid(gioVolumePointer)?.toKString()

    /**
     * Mounts a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_mount_finish() with the @volume
     * and #GAsyncResult returned in the @callback.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation or null to avoid user interaction
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback, or null
     */
    public fun mount(
        flags: MountMountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_volume_mount(
        gioVolumePointer,
        flags.mask,
        mountOperation?.gioMountOperationPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes mounting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and false will be returned.
     *
     * If the mount operation succeeded, g_volume_get_mount() on @volume
     * is guaranteed to return the mount right after calling this
     * function; there's no need to listen for the 'mount-added' signal on
     * #GVolumeMonitor.
     *
     * @param result a #GAsyncResult
     * @return true, false if operation failed
     */
    public fun mountFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_volume_mount_finish(gioVolumePointer, result.gioAsyncResultPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns whether the volume should be automatically mounted.
     *
     * @return true if the volume should be automatically mounted
     */
    public fun shouldAutomount(): Boolean = g_volume_should_automount(gioVolumePointer).asBoolean()

    /**
     * Emitted when the volume has been changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioVolumePointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the #GVolume have been removed. If
     * the recipient is holding references to the object they should
     * release them so the object can be finalized.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onRemoved(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioVolumePointer,
            "removed",
            onRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The VolumeImpl type represents a native instance of the Volume interface.
     *
     * @constructor Creates a new instance of Volume for the provided [CPointer].
     */
    public data class VolumeImpl(override val gioVolumePointer: CPointer<GVolume>) :
        Object(gioVolumePointer.reinterpret()),
        Volume

    public companion object : TypeCompanion<Volume> {
        override val type: GeneratedInterfaceKGType<Volume> =
            GeneratedInterfaceKGType(getTypeOrNull("g_volume_get_type")!!) { VolumeImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Volume
         *
         * @return the GType
         */
        public fun getType(): GType = g_volume_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onRemovedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
