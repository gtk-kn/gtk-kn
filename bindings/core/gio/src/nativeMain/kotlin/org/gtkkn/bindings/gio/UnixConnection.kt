// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GUnixConnection
import org.gtkkn.native.gio.g_unix_connection_get_type
import org.gtkkn.native.gio.g_unix_connection_receive_credentials
import org.gtkkn.native.gio.g_unix_connection_receive_credentials_async
import org.gtkkn.native.gio.g_unix_connection_receive_credentials_finish
import org.gtkkn.native.gio.g_unix_connection_receive_fd
import org.gtkkn.native.gio.g_unix_connection_send_credentials
import org.gtkkn.native.gio.g_unix_connection_send_credentials_async
import org.gtkkn.native.gio.g_unix_connection_send_credentials_finish
import org.gtkkn.native.gio.g_unix_connection_send_fd
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.Unit

/**
 * This is the subclass of [class@Gio.SocketConnection] that is created
 * for UNIX domain sockets.
 *
 * It contains functions to do some of the UNIX socket specific
 * functionality like passing file descriptors.
 *
 * Since GLib 2.72, `GUnixConnection` is available on all platforms. It requires
 * underlying system support (such as Windows 10 with `AF_UNIX`) at run time.
 *
 * Before GLib 2.72, `<gio/gunixconnection.h>` belonged to the UNIX-specific GIO
 * interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file when
 * using it. This is no longer necessary since GLib 2.72.
 * @since 2.22
 */
@GioVersion2_22
public open class UnixConnection(
    pointer: CPointer<GUnixConnection>,
) : SocketConnection(pointer.reinterpret()),
    KGTyped {
    public val gioUnixConnectionPointer: CPointer<GUnixConnection>
        get() = gPointer.reinterpret()

    /**
     * Receives credentials from the sending end of the connection.  The
     * sending end has to call g_unix_connection_send_credentials() (or
     * similar) for this to work.
     *
     * As well as reading the credentials this also reads (and discards) a
     * single byte from the stream, as this is required for credentials
     * passing to work on some implementations.
     *
     * This method can be expected to be available on the following platforms:
     *
     * - Linux since GLib 2.26
     * - FreeBSD since GLib 2.26
     * - GNU/kFreeBSD since GLib 2.36
     * - Solaris, Illumos and OpenSolaris since GLib 2.40
     * - GNU/Hurd since GLib 2.40
     *
     * Other ways to exchange credentials with a foreign peer includes the
     * #GUnixCredentialsMessage type and g_socket_get_credentials() function.
     *
     * @param cancellable A #GCancellable or null.
     * @return Received credentials on success (free with
     * g_object_unref()), null if @error is set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun receiveCredentials(cancellable: Cancellable? = null): Result<Credentials> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_connection_receive_credentials(
                    gioUnixConnectionPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    Credentials(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Asynchronously receive credentials.
     *
     * For more details, see g_unix_connection_receive_credentials() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called. You can then call
     * g_unix_connection_receive_credentials_finish() to get the result of the operation.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.32
     */
    @GioVersion2_32
    public open fun receiveCredentialsAsync(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_unix_connection_receive_credentials_async(
            gioUnixConnectionPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an asynchronous receive credentials operation started with
     * g_unix_connection_receive_credentials_async().
     *
     * @param result a #GAsyncResult.
     * @return a #GCredentials, or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.32
     */
    @GioVersion2_32
    public open fun receiveCredentialsFinish(result: AsyncResult): Result<Credentials> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_connection_receive_credentials_finish(
                    gioUnixConnectionPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Credentials(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Receives a file descriptor from the sending end of the connection.
     * The sending end has to call g_unix_connection_send_fd() for this
     * to work.
     *
     * As well as reading the fd this also reads a single byte from the
     * stream, as this is required for fd passing to work on some
     * implementations.
     *
     * @param cancellable optional #GCancellable object, null to ignore
     * @return a file descriptor on success, -1 on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun receiveFd(cancellable: Cancellable? = null): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_connection_receive_fd(
                    gioUnixConnectionPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Passes the credentials of the current user the receiving side
     * of the connection. The receiving end has to call
     * g_unix_connection_receive_credentials() (or similar) to accept the
     * credentials.
     *
     * As well as sending the credentials this also writes a single NUL
     * byte to the stream, as this is required for credentials passing to
     * work on some implementations.
     *
     * This method can be expected to be available on the following platforms:
     *
     * - Linux since GLib 2.26
     * - FreeBSD since GLib 2.26
     * - GNU/kFreeBSD since GLib 2.36
     * - Solaris, Illumos and OpenSolaris since GLib 2.40
     * - GNU/Hurd since GLib 2.40
     *
     * Other ways to exchange credentials with a foreign peer includes the
     * #GUnixCredentialsMessage type and g_socket_get_credentials() function.
     *
     * @param cancellable A #GCancellable or null.
     * @return true on success, false if @error is set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun sendCredentials(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_connection_send_credentials(
                    gioUnixConnectionPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asynchronously send credentials.
     *
     * For more details, see g_unix_connection_send_credentials() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called. You can then call
     * g_unix_connection_send_credentials_finish() to get the result of the operation.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.32
     */
    @GioVersion2_32
    public open fun sendCredentialsAsync(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_unix_connection_send_credentials_async(
            gioUnixConnectionPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an asynchronous send credentials operation started with
     * g_unix_connection_send_credentials_async().
     *
     * @param result a #GAsyncResult.
     * @return true if the operation was successful, otherwise false.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun sendCredentialsFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_connection_send_credentials_finish(
                    gioUnixConnectionPointer.reinterpret(),
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
     * Passes a file descriptor to the receiving side of the
     * connection. The receiving end has to call g_unix_connection_receive_fd()
     * to accept the file descriptor.
     *
     * As well as sending the fd this also writes a single byte to the
     * stream, as this is required for fd passing to work on some
     * implementations.
     *
     * @param fd a file descriptor
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a true on success, null on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun sendFd(
        fd: Int,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_connection_send_fd(
                    gioUnixConnectionPointer.reinterpret(),
                    fd,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<UnixConnection> {
        override val type: GeneratedClassKGType<UnixConnection> =
            GeneratedClassKGType(g_unix_connection_get_type()) { UnixConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
