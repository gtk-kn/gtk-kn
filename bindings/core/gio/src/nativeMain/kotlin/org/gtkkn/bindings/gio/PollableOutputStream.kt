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
import org.gtkkn.native.gio.GPollableOutputStream
import org.gtkkn.native.gio.g_pollable_output_stream_can_poll
import org.gtkkn.native.gio.g_pollable_output_stream_create_source
import org.gtkkn.native.gio.g_pollable_output_stream_get_type
import org.gtkkn.native.gio.g_pollable_output_stream_is_writable
import kotlin.Boolean

/**
 * #GPollableOutputStream is implemented by #GOutputStreams that
 * can be polled for readiness to write. This can be used when
 * interfacing with a non-GIO API that expects
 * UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: guint8
 * - parameter `vectors`: OutputVector
 *
 * @since 2.28
 */
public interface PollableOutputStream : Interface, KGTyped {
    public val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream>

    /**
     * Checks if @stream is actually pollable. Some classes may implement
     * #GPollableOutputStream but have only certain instances of that
     * class be pollable. If this method returns false, then the behavior
     * of other #GPollableOutputStream methods is undefined.
     *
     * For any given stream, the value returned by this method is constant;
     * a stream cannot switch from pollable to non-pollable or vice versa.
     *
     * @return true if @stream is pollable, false if not.
     * @since 2.28
     */
    public fun canPoll(): Boolean =
        g_pollable_output_stream_can_poll(gioPollableOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Creates a #GSource that triggers when @stream can be written, or
     * @cancellable is triggered or an error occurs. The callback on the
     * source is of the #GPollableSourceFunc type.
     *
     * As with g_pollable_output_stream_is_writable(), it is possible that
     * the stream may not actually be writable even after the source
     * triggers, so you should use g_pollable_output_stream_write_nonblocking()
     * rather than g_output_stream_write() from the callback.
     *
     * @param cancellable a #GCancellable, or null
     * @return a new #GSource
     * @since 2.28
     */
    public fun createSource(cancellable: Cancellable? = null): Source =
        g_pollable_output_stream_create_source(
            gioPollableOutputStreamPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret()
        )!!.run {
            Source(reinterpret())
        }

    /**
     * Checks if @stream can be written.
     *
     * Note that some stream types may not be able to implement this 100%
     * reliably, and it is possible that a call to g_output_stream_write()
     * after this returns true would still block. To guarantee
     * non-blocking behavior, you should always use
     * g_pollable_output_stream_write_nonblocking(), which will return a
     * %G_IO_ERROR_WOULD_BLOCK error rather than blocking.
     *
     * @return true if @stream is writable, false if not. If an error
     *   has occurred on @stream, this will result in
     *   g_pollable_output_stream_is_writable() returning true, and the
     *   next attempt to write will return the error.
     * @since 2.28
     */
    public fun isWritable(): Boolean =
        g_pollable_output_stream_is_writable(gioPollableOutputStreamPointer.reinterpret()).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<GPollableOutputStream>,
    ) : PollableOutputStream {
        override val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream> = pointer
    }

    public companion object : TypeCompanion<PollableOutputStream> {
        override val type: GeneratedInterfaceKGType<PollableOutputStream> =
            GeneratedInterfaceKGType(g_pollable_output_stream_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GPollableOutputStream>): PollableOutputStream = Wrapper(pointer)
    }
}
