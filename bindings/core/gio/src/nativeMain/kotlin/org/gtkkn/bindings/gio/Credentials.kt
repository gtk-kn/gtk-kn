// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GCredentials
import org.gtkkn.native.gio.g_credentials_get_type
import org.gtkkn.native.gio.g_credentials_get_unix_pid
import org.gtkkn.native.gio.g_credentials_get_unix_user
import org.gtkkn.native.gio.g_credentials_is_same_user
import org.gtkkn.native.gio.g_credentials_new
import org.gtkkn.native.gio.g_credentials_set_unix_user
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.UInt

/**
 * The `GCredentials` type is a reference-counted wrapper for native
 * credentials.
 *
 * The information in `GCredentials` is typically used for identifying,
 * authenticating and authorizing other processes.
 *
 * Some operating systems supports looking up the credentials of the remote
 * peer of a communication endpoint - see e.g. [method@Gio.Socket.get_credentials].
 *
 * Some operating systems supports securely sending and receiving
 * credentials over a Unix Domain Socket, see [class@Gio.UnixCredentialsMessage],
 * [method@Gio.UnixConnection.send_credentials] and
 * [method@Gio.UnixConnection.receive_credentials] for details.
 *
 * On Linux, the native credential type is a `struct ucred` - see the
 * [`unix(7)` man page](man:unix(7)) for details. This corresponds to
 * `G_CREDENTIALS_TYPE_LINUX_UCRED`.
 *
 * On Apple operating systems (including iOS, tvOS, and macOS), the native credential
 * type is a `struct xucred`. This corresponds to `G_CREDENTIALS_TYPE_APPLE_XUCRED`.
 *
 * On FreeBSD, Debian GNU/kFreeBSD, and GNU/Hurd, the native credential type is a
 * `struct cmsgcred`. This corresponds to `G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED`.
 *
 * On NetBSD, the native credential type is a `struct unpcbid`.
 * This corresponds to `G_CREDENTIALS_TYPE_NETBSD_UNPCBID`.
 *
 * On OpenBSD, the native credential type is a `struct sockpeercred`.
 * This corresponds to `G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED`.
 *
 * On Solaris (including OpenSolaris and its derivatives), the native credential type
 * is a `ucred_t`. This corresponds to `G_CREDENTIALS_TYPE_SOLARIS_UCRED`.
 *
 * Since GLib 2.72, on Windows, the native credentials may contain the PID of a
 * process. This corresponds to `G_CREDENTIALS_TYPE_WIN32_PID`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `native`: gpointer
 * - method `to_string`: C function g_credentials_to_string is ignored
 *
 * @since 2.26
 */
public open class Credentials(
    pointer: CPointer<GCredentials>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioCredentialsPointer: CPointer<GCredentials>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GCredentials object with credentials matching the
     * the current process.
     *
     * @return A #GCredentials. Free with g_object_unref().
     * @since 2.26
     */
    public constructor() : this(g_credentials_new()!!.reinterpret())

    /**
     * Tries to get the UNIX process identifier from @credentials. This
     * method is only available on UNIX platforms.
     *
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX process ID.
     *
     * @return The UNIX process ID, or `-1` if @error is set.
     * @since 2.36
     */
    public open fun getUnixPid(): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_credentials_get_unix_pid(gioCredentialsPointer.reinterpret(), gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Tries to get the UNIX user identifier from @credentials. This
     * method is only available on UNIX platforms.
     *
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user.
     *
     * @return The UNIX user identifier or `-1` if @error is set.
     * @since 2.26
     */
    public open fun getUnixUser(): Result<UInt> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_credentials_get_unix_user(gioCredentialsPointer.reinterpret(), gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Checks if @credentials and @other_credentials is the same user.
     *
     * This operation can fail if #GCredentials is not supported on the
     * the OS.
     *
     * @param otherCredentials A #GCredentials.
     * @return true if @credentials and @other_credentials has the same
     * user, false otherwise or if @error is set.
     * @since 2.26
     */
    public open fun isSameUser(otherCredentials: Credentials): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_credentials_is_same_user(
                    gioCredentialsPointer.reinterpret(),
                    otherCredentials.gioCredentialsPointer.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Tries to set the UNIX user identifier on @credentials. This method
     * is only available on UNIX platforms.
     *
     * This operation can fail if #GCredentials is not supported on the
     * OS or if the native credentials type does not contain information
     * about the UNIX user. It can also fail if the OS does not allow the
     * use of "spoofed" credentials.
     *
     * @param uid The UNIX user identifier to set.
     * @return true if @uid was set, false if error is set.
     * @since 2.26
     */
    public open fun setUnixUser(uid: UInt): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_credentials_set_unix_user(gioCredentialsPointer.reinterpret(), uid, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<Credentials> {
        override val type: GeneratedClassKGType<Credentials> =
            GeneratedClassKGType(g_credentials_get_type()) { Credentials(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
