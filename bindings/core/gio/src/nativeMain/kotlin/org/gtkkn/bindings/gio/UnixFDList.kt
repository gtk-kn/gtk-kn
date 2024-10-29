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
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GUnixFDList
import org.gtkkn.native.gio.g_unix_fd_list_append
import org.gtkkn.native.gio.g_unix_fd_list_get
import org.gtkkn.native.gio.g_unix_fd_list_get_length
import org.gtkkn.native.gio.g_unix_fd_list_get_type
import org.gtkkn.native.gio.g_unix_fd_list_new
import org.gtkkn.native.glib.GError
import kotlin.Int
import kotlin.Result

/**
 * A `GUnixFDList` contains a list of file descriptors.  It owns the file
 * descriptors that it contains, closing them when finalized.
 *
 * It may be wrapped in a
 * [`GUnixFDMessage`](../gio-unix/class.UnixFDMessage.html) and sent over a
 * [class@Gio.Socket] in the `G_SOCKET_FAMILY_UNIX` family by using
 * [method@Gio.Socket.send_message] and received using
 * [method@Gio.Socket.receive_message].
 *
 * Before 2.74, `<gio/gunixfdlist.h>` belonged to the UNIX-specific GIO
 * interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file when
 * using it.
 *
 * Since 2.74, the API is available for Windows.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `fds`: Array parameter of type gint is not supported
 */
public open class UnixFDList(
    pointer: CPointer<GUnixFDList>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioUnixFDListPointer: CPointer<GUnixFDList>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GUnixFDList containing no file descriptors.
     *
     * @return a new #GUnixFDList
     * @since 2.24
     */
    public constructor() : this(g_unix_fd_list_new()!!.reinterpret())

    /**
     * Adds a file descriptor to @list.
     *
     * The file descriptor is duplicated using dup(). You keep your copy
     * of the descriptor and the copy contained in @list will be closed
     * when @list is finalized.
     *
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     *
     * The index of the file descriptor in the list is returned.  If you use
     * this index with g_unix_fd_list_get() then you will receive back a
     * duplicated copy of the same file descriptor.
     *
     * @param fd a valid open file descriptor
     * @return the index of the appended fd in case of success, else -1
     *          (and @error is set)
     * @since 2.24
     */
    public open fun append(fd: Int): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_unix_fd_list_append(gioUnixFDListPointer.reinterpret(), fd, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets a file descriptor out of @list.
     *
     * @index_ specifies the index of the file descriptor to get.  It is a
     * programmer error for @index_ to be out of range; see
     * g_unix_fd_list_get_length().
     *
     * The file descriptor is duplicated using dup() and set as
     * close-on-exec before being returned.  You must call close() on it
     * when you are done.
     *
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     *
     * @param index the index into the list
     * @return the file descriptor, or -1 in case of error
     * @since 2.24
     */
    public open fun `get`(index: Int): Result<Int> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_unix_fd_list_get(gioUnixFDListPointer.reinterpret(), index, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets the length of @list (ie: the number of file descriptors
     * contained within).
     *
     * @return the length of @list
     * @since 2.24
     */
    public open fun getLength(): Int = g_unix_fd_list_get_length(gioUnixFDListPointer.reinterpret())

    public companion object : TypeCompanion<UnixFDList> {
        override val type: GeneratedClassKGType<UnixFDList> =
            GeneratedClassKGType(g_unix_fd_list_get_type()) { UnixFDList(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
