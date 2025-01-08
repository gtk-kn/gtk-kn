// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.ext.asBoolean
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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result

/**
 * This [class@Gio.SocketControlMessage] contains a [class@Gio.UnixFDList].
 * It may be sent using [method@Gio.Socket.send_message] and received using
 * [method@Gio.Socket.receive_message] over UNIX sockets (ie: sockets in the
 * `G_SOCKET_FAMILY_UNIX` family). The file descriptors are copied
 * between processes by the kernel.
 *
 * For an easier way to send and receive file descriptors over
 * stream-oriented UNIX sockets, see [method@Gio.UnixConnection.send_fd] and
 * [method@Gio.UnixConnection.receive_fd].
 *
 * Note that `<gio/gunixfdmessage.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file or the `GioUnix-2.0` GIR namespace when using it.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 */
public open class UnixFdMessage(pointer: CPointer<GUnixFDMessage>) :
    SocketControlMessage(pointer.reinterpret()),
    KGTyped {
    public val gioUnixFdMessagePointer: CPointer<GUnixFDMessage>
        get() = gPointer.reinterpret()

    /**
     * The [class@Gio.UnixFDList] object to send with the message.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val fdList: UnixFdList
        /**
         * Gets the #GUnixFDList contained in @message.  This function does not
         * return a reference to the caller, but the returned list is valid for
         * the lifetime of @message.
         *
         * @return the #GUnixFDList from @message
         * @since 2.24
         */
        get() = g_unix_fd_message_get_fd_list(gioUnixFdMessagePointer)!!.run {
            UnixFdList(this)
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
    public constructor(
        fdList: UnixFdList,
    ) : this(g_unix_fd_message_new_with_fd_list(fdList.gioUnixFdListPointer)!!.reinterpret())

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
    @GioVersion2_22
    public open fun appendFd(fd: gint): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_unix_fd_message_append_fd(gioUnixFdMessagePointer, fd, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<UnixFdMessage> {
        override val type: GeneratedClassKGType<UnixFdMessage> =
            GeneratedClassKGType(g_unix_fd_message_get_type()) { UnixFdMessage(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of UnixFDMessage
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_fd_message_get_type()
    }
}
