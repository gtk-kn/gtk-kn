// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GMemoryOutputStream
import org.gtkkn.native.gio.GPollableOutputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_memory_output_stream_get_data_size
import org.gtkkn.native.gio.g_memory_output_stream_get_size
import org.gtkkn.native.gio.g_memory_output_stream_get_type
import org.gtkkn.native.gio.g_memory_output_stream_new_resizable
import org.gtkkn.native.gio.g_memory_output_stream_steal_as_bytes
import kotlin.ULong

/**
 * #GMemoryOutputStream is a class for using arbitrary
 * memory chunks as output for GIO streaming output operations.
 *
 * As of GLib 2.34, #GMemoryOutputStream trivially implements
 * #GPollableOutputStream: it always polls as ready.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_data`: Return type gpointer is unsupported
 * - method `steal_data`: Return type gpointer is unsupported
 * - method `data`: Property has no getter nor setter
 */
public open class MemoryOutputStream(
    pointer: CPointer<GMemoryOutputStream>,
) : OutputStream(pointer.reinterpret()), PollableOutputStream, Seekable, KGTyped {
    public val gioMemoryOutputStreamPointer: CPointer<GMemoryOutputStream>
        get() = gPointer.reinterpret()

    override val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream>
        get() = gPointer.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = gPointer.reinterpret()

    /**
     * Size of data written to the buffer.
     *
     * @since 2.24
     */
    public open val dataSize: ULong
        /**
         * Returns the number of bytes from the start up to including the last
         * byte written in the stream that has not been truncated away.
         *
         * @return the number of bytes written to the stream
         * @since 2.18
         */
        get() = g_memory_output_stream_get_data_size(gioMemoryOutputStreamPointer.reinterpret())

    /**
     * Current size of the data buffer.
     *
     * @since 2.24
     */
    public open val size: ULong
        /**
         * Gets the size of the currently allocated data area (available from
         * g_memory_output_stream_get_data()).
         *
         * You probably don't want to use this function on resizable streams.
         * See g_memory_output_stream_get_data_size() instead.  For resizable
         * streams the size returned by this function is an implementation
         * detail and may be change at any time in response to operations on the
         * stream.
         *
         * If the stream is fixed-sized (ie: no realloc was passed to
         * g_memory_output_stream_new()) then this is the maximum size of the
         * stream and further writes will return %G_IO_ERROR_NO_SPACE.
         *
         * In any case, if you want the number of bytes currently written to the
         * stream, use g_memory_output_stream_get_data_size().
         *
         * @return the number of bytes allocated for the data buffer
         */
        get() = g_memory_output_stream_get_size(gioMemoryOutputStreamPointer.reinterpret())

    /**
     * Creates a new #GMemoryOutputStream, using g_realloc() and g_free()
     * for memory allocation.
     *
     * @since 2.36
     */
    public constructor() : this(g_memory_output_stream_new_resizable()!!.reinterpret())

    /**
     * Returns the number of bytes from the start up to including the last
     * byte written in the stream that has not been truncated away.
     *
     * @return the number of bytes written to the stream
     * @since 2.18
     */
    public open fun getDataSize(): ULong =
        g_memory_output_stream_get_data_size(gioMemoryOutputStreamPointer.reinterpret())

    /**
     * Gets the size of the currently allocated data area (available from
     * g_memory_output_stream_get_data()).
     *
     * You probably don't want to use this function on resizable streams.
     * See g_memory_output_stream_get_data_size() instead.  For resizable
     * streams the size returned by this function is an implementation
     * detail and may be change at any time in response to operations on the
     * stream.
     *
     * If the stream is fixed-sized (ie: no realloc was passed to
     * g_memory_output_stream_new()) then this is the maximum size of the
     * stream and further writes will return %G_IO_ERROR_NO_SPACE.
     *
     * In any case, if you want the number of bytes currently written to the
     * stream, use g_memory_output_stream_get_data_size().
     *
     * @return the number of bytes allocated for the data buffer
     */
    public open fun getSize(): ULong = g_memory_output_stream_get_size(gioMemoryOutputStreamPointer.reinterpret())

    /**
     * Returns data from the @ostream as a #GBytes. @ostream must be
     * closed before calling this function.
     *
     * @return the stream's data
     * @since 2.34
     */
    public open fun stealAsBytes(): Bytes =
        g_memory_output_stream_steal_as_bytes(gioMemoryOutputStreamPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    public companion object : TypeCompanion<MemoryOutputStream> {
        override val type: GeneratedClassKGType<MemoryOutputStream> =
            GeneratedClassKGType(g_memory_output_stream_get_type()) {
                MemoryOutputStream(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
