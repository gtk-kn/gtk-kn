// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

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
public open class UnixOutputStream(public val gioUnixOutputStreamPointer: CPointer<GUnixOutputStream>) :
    OutputStream(gioUnixOutputStreamPointer.reinterpret()),
    FileDescriptorBased,
    PollableOutputStream,
    KGTyped {
    override val gioFileDescriptorBasedPointer: CPointer<GFileDescriptorBased>
        get() = handle.reinterpret()

    override val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream>
        get() = handle.reinterpret()

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
        get() = g_unix_output_stream_get_close_fd(gioUnixOutputStreamPointer).asBoolean()

        /**
         * Sets whether the file descriptor of @stream shall be closed
         * when the stream is closed.
         *
         * @param closeFd true to close the file descriptor when done
         * @since 2.20
         */
        @GioVersion2_20
        set(closeFd) = g_unix_output_stream_set_close_fd(gioUnixOutputStreamPointer, closeFd.asGBoolean())

    /**
     * The file descriptor that the stream writes to.
     *
     * @since 2.20
     */
    @GioVersion2_20
    public open val fd: gint
        /**
         * Return the UNIX file descriptor that the stream writes to.
         *
         * @return The file descriptor of @stream
         * @since 2.20
         */
        get() = g_unix_output_stream_get_fd(gioUnixOutputStreamPointer)

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
        fd: gint,
        closeFd: Boolean,
    ) : this(g_unix_output_stream_new(fd, closeFd.asGBoolean())!!.reinterpret())

    public companion object : TypeCompanion<UnixOutputStream> {
        override val type: GeneratedClassKGType<UnixOutputStream> =
            GeneratedClassKGType(g_unix_output_stream_get_type()) { UnixOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of UnixOutputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_output_stream_get_type()
    }
}
