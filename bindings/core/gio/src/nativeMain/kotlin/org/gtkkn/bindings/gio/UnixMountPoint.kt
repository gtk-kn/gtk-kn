// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GUnixMountPoint
import org.gtkkn.native.gio.g_unix_mount_point_compare
import org.gtkkn.native.gio.g_unix_mount_point_copy
import org.gtkkn.native.gio.g_unix_mount_point_free
import org.gtkkn.native.gio.g_unix_mount_point_get_device_path
import org.gtkkn.native.gio.g_unix_mount_point_get_fs_type
import org.gtkkn.native.gio.g_unix_mount_point_get_mount_path
import org.gtkkn.native.gio.g_unix_mount_point_get_options
import org.gtkkn.native.gio.g_unix_mount_point_guess_can_eject
import org.gtkkn.native.gio.g_unix_mount_point_guess_icon
import org.gtkkn.native.gio.g_unix_mount_point_guess_name
import org.gtkkn.native.gio.g_unix_mount_point_guess_symbolic_icon
import org.gtkkn.native.gio.g_unix_mount_point_is_loopback
import org.gtkkn.native.gio.g_unix_mount_point_is_readonly
import org.gtkkn.native.gio.g_unix_mount_point_is_user_mountable
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Defines a Unix mount point (e.g. <filename>/dev</filename>).
 * This corresponds roughly to a fstab entry.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `time_read`: time_read: Out parameter is not supported
 */
public class UnixMountPoint(
    pointer: CPointer<GUnixMountPoint>,
) : Record {
    public val gioUnixMountPointPointer: CPointer<GUnixMountPoint> = pointer

    /**
     * Compares two unix mount points.
     *
     * @param mount2 a #GUnixMount.
     * @return 1, 0 or -1 if @mount1 is greater than, equal to,
     * or less than @mount2, respectively.
     */
    public fun compare(mount2: UnixMountPoint): Int =
        g_unix_mount_point_compare(
            gioUnixMountPointPointer.reinterpret(),
            mount2.gioUnixMountPointPointer
        )

    /**
     * Makes a copy of @mount_point.
     *
     * @return a new #GUnixMountPoint
     * @since 2.54
     */
    public fun copy(): UnixMountPoint =
        g_unix_mount_point_copy(gioUnixMountPointPointer.reinterpret())!!.run {
            UnixMountPoint(reinterpret())
        }

    /**
     * Frees a unix mount point.
     */
    public fun free(): Unit = g_unix_mount_point_free(gioUnixMountPointPointer.reinterpret())

    /**
     * Gets the device path for a unix mount point.
     *
     * @return a string containing the device path.
     */
    public fun getDevicePath(): String =
        g_unix_mount_point_get_device_path(gioUnixMountPointPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the file system type for the mount point.
     *
     * @return a string containing the file system type.
     */
    public fun getFsType(): String =
        g_unix_mount_point_get_fs_type(gioUnixMountPointPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the mount path for a unix mount point.
     *
     * @return a string containing the mount path.
     */
    public fun getMountPath(): String =
        g_unix_mount_point_get_mount_path(gioUnixMountPointPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the options for the mount point.
     *
     * @return a string containing the options.
     * @since 2.32
     */
    public fun getOptions(): String? =
        g_unix_mount_point_get_options(gioUnixMountPointPointer.reinterpret())?.toKString()

    /**
     * Guesses whether a Unix mount point can be ejected.
     *
     * @return true if @mount_point is deemed to be ejectable.
     */
    public fun guessCanEject(): Boolean =
        g_unix_mount_point_guess_can_eject(gioUnixMountPointPointer.reinterpret()).asBoolean()

    /**
     * Guesses the icon of a Unix mount point.
     *
     * @return a #GIcon
     */
    public fun guessIcon(): Icon =
        g_unix_mount_point_guess_icon(gioUnixMountPointPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     *
     * @return A newly allocated string that must
     *     be freed with g_free()
     */
    public fun guessName(): String =
        g_unix_mount_point_guess_name(gioUnixMountPointPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Guesses the symbolic icon of a Unix mount point.
     *
     * @return a #GIcon
     * @since 2.34
     */
    public fun guessSymbolicIcon(): Icon =
        g_unix_mount_point_guess_symbolic_icon(gioUnixMountPointPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Checks if a unix mount point is a loopback device.
     *
     * @return true if the mount point is a loopback. false otherwise.
     */
    public fun isLoopback(): Boolean =
        g_unix_mount_point_is_loopback(gioUnixMountPointPointer.reinterpret()).asBoolean()

    /**
     * Checks if a unix mount point is read only.
     *
     * @return true if a mount point is read only.
     */
    public fun isReadonly(): Boolean =
        g_unix_mount_point_is_readonly(gioUnixMountPointPointer.reinterpret()).asBoolean()

    /**
     * Checks if a unix mount point is mountable by the user.
     *
     * @return true if the mount point is user mountable.
     */
    public fun isUserMountable(): Boolean =
        g_unix_mount_point_is_user_mountable(gioUnixMountPointPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<UnixMountPoint, GUnixMountPoint> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UnixMountPoint =
            UnixMountPoint(pointer.reinterpret())
    }
}
