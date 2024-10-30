// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Source
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.gio.g_pollable_input_stream_can_poll
import org.gtkkn.native.gio.g_pollable_input_stream_create_source
import org.gtkkn.native.gio.g_pollable_input_stream_get_type
import org.gtkkn.native.gio.g_pollable_input_stream_is_readable
import kotlin.Boolean

/**
 * `GPollableInputStream` is implemented by [class@Gio.InputStream]s that
 * can be polled for readiness to read. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 *
 * Some classes may implement `GPollableInputStream` but have only certain
 * instances of that class be pollable. If [method@Gio.PollableInputStream.can_poll]
 * returns false, then the behavior of other `GPollableInputStream` methods is
 * undefined.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: buffer: Out parameter is not supported
 *
 * @since 2.28
 */
public interface PollableInputStream :
    Interface,
    KGTyped {
    public val gioPollableInputStreamPointer: CPointer<GPollableInputStream>

    /**
     * Checks if @stream is actually pollable. Some classes may implement
     * #GPollableInputStream but have only certain instances of that class
     * be pollable. If this method returns false, then the behavior of
     * other #GPollableInputStream methods is undefined.
     *
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     *
     * @return true if @stream is pollable, false if not.
     * @since 2.28
     */
    public fun canPoll(): Boolean =
        g_pollable_input_stream_can_poll(gioPollableInputStreamPointer.reinterpret()).asBoolean()

    /**
     * Creates a #GSource that triggers when @stream can be read, or
     * @cancellable is triggered or an error occurs. The callback on the
     * source is of the #GPollableSourceFunc type.
     *
     * As with g_pollable_input_stream_is_readable(), it is possible that
     * the stream may not actually be readable even after the source
     * triggers, so you should use g_pollable_input_stream_read_nonblocking()
     * rather than g_input_stream_read() from the callback.
     *
     * The behaviour of this method is undefined if
     * g_pollable_input_stream_can_poll() returns false for @stream.
     *
     * @param cancellable a #GCancellable, or null
     * @return a new #GSource
     * @since 2.28
     */
    public fun createSource(cancellable: Cancellable? = null): Source =
        g_pollable_input_stream_create_source(
            gioPollableInputStreamPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret()
        )!!.run {
            Source(reinterpret())
        }

    /**
     * Checks if @stream can be read.
     *
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_input_stream_read()
     * after this returns true would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_input_stream_read_nonblocking(), which will return a
     * %G_IO_ERROR_WOULD_BLOCK error rather than blocking.
     *
     * The behaviour of this method is undefined if
     * g_pollable_input_stream_can_poll() returns false for @stream.
     *
     * @return true if @stream is readable, false if not. If an error
     *   has occurred on @stream, this will result in
     *   g_pollable_input_stream_is_readable() returning true, and the
     *   next attempt to read will return the error.
     * @since 2.28
     */
    public fun isReadable(): Boolean =
        g_pollable_input_stream_is_readable(gioPollableInputStreamPointer.reinterpret()).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<GPollableInputStream>,
    ) : PollableInputStream {
        override val gioPollableInputStreamPointer: CPointer<GPollableInputStream> = pointer
    }

    public companion object : TypeCompanion<PollableInputStream> {
        override val type: GeneratedInterfaceKGType<PollableInputStream> =
            GeneratedInterfaceKGType(g_pollable_input_stream_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GPollableInputStream>): PollableInputStream = Wrapper(pointer)
    }
}
