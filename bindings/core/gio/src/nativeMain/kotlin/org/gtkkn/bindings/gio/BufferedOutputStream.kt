// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GBufferedOutputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_buffered_output_stream_get_auto_grow
import org.gtkkn.native.gio.g_buffered_output_stream_get_buffer_size
import org.gtkkn.native.gio.g_buffered_output_stream_get_type
import org.gtkkn.native.gio.g_buffered_output_stream_new
import org.gtkkn.native.gio.g_buffered_output_stream_new_sized
import org.gtkkn.native.gio.g_buffered_output_stream_set_auto_grow
import org.gtkkn.native.gio.g_buffered_output_stream_set_buffer_size
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gsize
import kotlin.Boolean

/**
 * Buffered output stream implements [class@Gio.FilterOutputStream] and provides
 * for buffered writes.
 *
 * By default, `GBufferedOutputStream`'s buffer size is set at 4 kilobytes.
 *
 * To create a buffered output stream, use [ctor@Gio.BufferedOutputStream.new],
 * or [ctor@Gio.BufferedOutputStream.new_sized] to specify the buffer's size
 * at construction.
 *
 * To get the size of a buffer within a buffered input stream, use
 * [method@Gio.BufferedOutputStream.get_buffer_size]. To change the size of a
 * buffered output stream's buffer, use [method@Gio.BufferedOutputStream.set_buffer_size].
 * Note that the buffer's size cannot be reduced below the size of the data within the buffer.
 */
public open class BufferedOutputStream(pointer: CPointer<GBufferedOutputStream>) :
    FilterOutputStream(pointer.reinterpret()),
    Seekable,
    KGTyped {
    public val gioBufferedOutputStreamPointer: CPointer<GBufferedOutputStream>
        get() = gPointer.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = gPointer.reinterpret()

    /**
     * Whether the buffer should automatically grow.
     */
    public open var autoGrow: Boolean
        /**
         * Checks if the buffer automatically grows as data is added.
         *
         * @return true if the @stream's buffer automatically grows,
         * false otherwise.
         */
        get() = g_buffered_output_stream_get_auto_grow(gioBufferedOutputStreamPointer.reinterpret()).asBoolean()

        /**
         * Sets whether or not the @stream's buffer should automatically grow.
         * If @auto_grow is true, then each write will just make the buffer
         * larger, and you must manually flush the buffer to actually write out
         * the data to the underlying stream.
         *
         * @param autoGrow a #gboolean.
         */
        set(
            autoGrow
        ) = g_buffered_output_stream_set_auto_grow(gioBufferedOutputStreamPointer.reinterpret(), autoGrow.asGBoolean())

    /**
     * The size of the backend buffer, in bytes.
     */
    public open var bufferSize: gsize
        /**
         * Gets the size of the buffer in the @stream.
         *
         * @return the current size of the buffer.
         */
        get() = g_buffered_output_stream_get_buffer_size(gioBufferedOutputStreamPointer.reinterpret())

        /**
         * Sets the size of the internal buffer to @size.
         *
         * @param size a #gsize.
         */
        set(size) = g_buffered_output_stream_set_buffer_size(gioBufferedOutputStreamPointer.reinterpret(), size)

    /**
     * Creates a new buffered output stream for a base stream.
     *
     * @param baseStream a #GOutputStream.
     * @return a #GOutputStream for the given @base_stream.
     */
    public constructor(
        baseStream: OutputStream,
    ) : this(g_buffered_output_stream_new(baseStream.gioOutputStreamPointer.reinterpret())!!.reinterpret())

    /**
     * Creates a new buffered output stream with a given buffer size.
     *
     * @param baseStream a #GOutputStream.
     * @param size a #gsize.
     * @return a #GOutputStream with an internal buffer set to @size.
     */
    public constructor(
        baseStream: OutputStream,
        size: gsize,
    ) : this(g_buffered_output_stream_new_sized(baseStream.gioOutputStreamPointer.reinterpret(), size)!!.reinterpret())

    public companion object : TypeCompanion<BufferedOutputStream> {
        override val type: GeneratedClassKGType<BufferedOutputStream> =
            GeneratedClassKGType(g_buffered_output_stream_get_type()) { BufferedOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of BufferedOutputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_buffered_output_stream_get_type()
    }
}
