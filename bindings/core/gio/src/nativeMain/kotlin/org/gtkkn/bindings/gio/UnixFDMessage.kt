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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GUnixFDMessage
import org.gtkkn.native.gio.g_unix_fd_message_append_fd
import org.gtkkn.native.gio.g_unix_fd_message_get_fd_list
import org.gtkkn.native.gio.g_unix_fd_message_get_type
import org.gtkkn.native.gio.g_unix_fd_message_new
import org.gtkkn.native.gio.g_unix_fd_message_new_with_fd_list
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result

/**
 * This #GSocketControlMessage contains a #GUnixFDList.
 * It may be sent using g_socket_send_message() and received using
 * g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * %G_SOCKET_FAMILY_UNIX family). The file descriptors are copied
 * between processes by the kernel.
 *
 * For an easier way to send and receive file descriptors over
 * stream-oriented UNIX sockets, see g_unix_connection_send_fd() and
 * g_unix_connection_receive_fd().
 *
 * Note that `<gio/gunixfdmessage.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 */
public open class UnixFDMessage(
    pointer: CPointer<GUnixFDMessage>,
) : SocketControlMessage(pointer.reinterpret()), KGTyped {
    public val gioUnixFDMessagePointer: CPointer<GUnixFDMessage>
        get() = gPointer.reinterpret()

    public open val fdList: UnixFDList
        /**
         * Gets the #GUnixFDList contained in @message.  This function does not
         * return a reference to the caller, but the returned list is valid for
         * the lifetime of @message.
         *
         * @return the #GUnixFDList from @message
         * @since 2.24
         */
        get() =
            g_unix_fd_message_get_fd_list(gioUnixFDMessagePointer.reinterpret())!!.run {
                UnixFDList(reinterpret())
            }

    /**
     * Creates a new #GUnixFDMessage containing an empty file descriptor
     * list.
     *
     * @return a new #GUnixFDMessage
     * @since 2.22
     */
    public constructor() : this(g_unix_fd_message_new()!!.reinterpret())

    /**
     * Creates a new #GUnixFDMessage containing @list.
     *
     * @param fdList a #GUnixFDList
     * @return a new #GUnixFDMessage
     * @since 2.24
     */
    public constructor(fdList: UnixFDList) :
        this(g_unix_fd_message_new_with_fd_list(fdList.gioUnixFDListPointer.reinterpret())!!.reinterpret())

    /**
     * Adds a file descriptor to @message.
     *
     * The file descriptor is duplicated using dup(). You keep your copy
     * of the descriptor and the copy contained in @message will be closed
     * when @message is finalized.
     *
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     *
     * @param fd a valid open file descriptor
     * @return true in case of success, else false (and @error is set)
     * @since 2.22
     */
    public open fun appendFd(fd: Int): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_unix_fd_message_append_fd(
                    gioUnixFDMessagePointer.reinterpret(),
                    fd,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets the #GUnixFDList contained in @message.  This function does not
     * return a reference to the caller, but the returned list is valid for
     * the lifetime of @message.
     *
     * @return the #GUnixFDList from @message
     * @since 2.24
     */
    public open fun getFdList(): UnixFDList =
        g_unix_fd_message_get_fd_list(gioUnixFDMessagePointer.reinterpret())!!.run {
            UnixFDList(reinterpret())
        }

    public companion object : TypeCompanion<UnixFDMessage> {
        override val type: GeneratedClassKGType<UnixFDMessage> =
            GeneratedClassKGType(g_unix_fd_message_get_type()) {
                UnixFDMessage(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
