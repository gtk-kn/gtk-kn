// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileDescriptorBased
import org.gtkkn.native.gio.GPollableOutputStream
import org.gtkkn.native.gio.GUnixOutputStream
import org.gtkkn.native.gio.g_unix_output_stream_get_close_fd
import org.gtkkn.native.gio.g_unix_output_stream_get_fd
import org.gtkkn.native.gio.g_unix_output_stream_get_type
import org.gtkkn.native.gio.g_unix_output_stream_new
import org.gtkkn.native.gio.g_unix_output_stream_set_close_fd
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * `GUnixOutputStream` implements [class@Gio.OutputStream] for writing to a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use `poll()` to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 *
 * Note that `<gio/gunixoutputstream.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config file
 * file or the `GioUnix-2.0` GIR namespace when using it.
 */
public open class UnixOutputStream(
    pointer: CPointer<GUnixOutputStream>,
) : OutputStream(pointer.reinterpret()),
    FileDescriptorBased,
    PollableOutputStream,
    KGTyped {
    public val gioUnixOutputStreamPointer: CPointer<GUnixOutputStream>
        get() = gPointer.reinterpret()

    override val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased>
        get() = gPointer.reinterpret()

    override val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream>
        get() = gPointer.reinterpret()

    /**
     * Whether to close the file descriptor when the stream is closed.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public open var closeFd: Boolean
        /**
         * Returns whether the file descriptor of @stream will be
         * closed when the stream is closed.
         *
         * @return true if the file descriptor is closed when done
         * @since 2.20
         */
        get() = g_unix_output_stream_get_close_fd(gioUnixOutputStreamPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the file descriptor of @stream shall be closed
         * when the stream is closed.
         *
         * @param closeFd true to close the file descriptor when done
         * @since 2.20
         */
        @GioVersion2_20
        set(closeFd) = g_unix_output_stream_set_close_fd(gioUnixOutputStreamPointer.reinterpret(), closeFd.asGBoolean())

    /**
     * The file descriptor that the stream writes to.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public open val fd: Int
        /**
         * Return the UNIX file descriptor that the stream writes to.
         *
         * @return The file descriptor of @stream
         * @since 2.20
         */
        get() = g_unix_output_stream_get_fd(gioUnixOutputStreamPointer.reinterpret())

    /**
     * Creates a new #GUnixOutputStream for the given @fd.
     *
     * If @close_fd, is true, the file descriptor will be closed when
     * the output stream is destroyed.
     *
     * @param fd a UNIX file descriptor
     * @param closeFd true to close the file descriptor when done
     * @return a new #GOutputStream
     */
    public constructor(
        fd: Int,
        closeFd: Boolean,
    ) : this(g_unix_output_stream_new(fd, closeFd.asGBoolean())!!.reinterpret())

    /**
     * Returns whether the file descriptor of @stream will be
     * closed when the stream is closed.
     *
     * @return true if the file descriptor is closed when done
     * @since 2.20
     */
    @GioVersion2_20
    public open fun getCloseFd(): Boolean =
        g_unix_output_stream_get_close_fd(gioUnixOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Return the UNIX file descriptor that the stream writes to.
     *
     * @return The file descriptor of @stream
     * @since 2.20
     */
    @GioVersion2_20
    public open fun getFd_(): Int = g_unix_output_stream_get_fd(gioUnixOutputStreamPointer.reinterpret())

    /**
     * Sets whether the file descriptor of @stream shall be closed
     * when the stream is closed.
     *
     * @param closeFd true to close the file descriptor when done
     * @since 2.20
     */
    @GioVersion2_20
    public open fun setCloseFd(closeFd: Boolean): Unit =
        g_unix_output_stream_set_close_fd(gioUnixOutputStreamPointer.reinterpret(), closeFd.asGBoolean())

    public companion object : TypeCompanion<UnixOutputStream> {
        override val type: GeneratedClassKGType<UnixOutputStream> =
            GeneratedClassKGType(g_unix_output_stream_get_type()) { UnixOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
