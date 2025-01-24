// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GBufferedInputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_buffered_input_stream_fill
import org.gtkkn.native.gio.g_buffered_input_stream_fill_async
import org.gtkkn.native.gio.g_buffered_input_stream_fill_finish
import org.gtkkn.native.gio.g_buffered_input_stream_get_available
import org.gtkkn.native.gio.g_buffered_input_stream_get_buffer_size
import org.gtkkn.native.gio.g_buffered_input_stream_get_type
import org.gtkkn.native.gio.g_buffered_input_stream_new
import org.gtkkn.native.gio.g_buffered_input_stream_new_sized
import org.gtkkn.native.gio.g_buffered_input_stream_read_byte
import org.gtkkn.native.gio.g_buffered_input_stream_set_buffer_size
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import kotlin.Long
import kotlin.Result
import kotlin.Unit

/**
 * Buffered input stream implements #GFilterInputStream and provides
 * for buffered reads.
 *
 * By default, `GBufferedInputStream`'s buffer size is set at 4 kilobytes.
 *
 * To create a buffered input stream, use [ctor@Gio.BufferedInputStream.new],
 * or [ctor@Gio.BufferedInputStream.new_sized] to specify the buffer's size at
 * construction.
 *
 * To get the size of a buffer within a buffered input stream, use
 * [method@Gio.BufferedInputStream.get_buffer_size]. To change the size of a
 * buffered input stream's buffer, use [method@Gio.BufferedInputStream.set_buffer_size].
 * Note that the buffer's size cannot be reduced below the size of the data within the buffer.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `count`: count: Out parameter is not supported
 */
public open class BufferedInputStream(public val gioBufferedInputStreamPointer: CPointer<GBufferedInputStream>) :
    FilterInputStream(gioBufferedInputStreamPointer.reinterpret()),
    Seekable,
    KGTyped {
    override val gioSeekablePointer: CPointer<GSeekable>
        get() = handle.reinterpret()

    /**
     * The size of the backend buffer, in bytes.
     */
    public open var bufferSize: gsize
        /**
         * Gets the size of the input buffer.
         *
         * @return the current buffer size.
         */
        get() = g_buffered_input_stream_get_buffer_size(gioBufferedInputStreamPointer)

        /**
         * Sets the size of the internal buffer of @stream to @size, or to the
         * size of the contents of the buffer. The buffer can never be resized
         * smaller than its current contents.
         *
         * @param size a #gsize
         */
        set(size) = g_buffered_input_stream_set_buffer_size(gioBufferedInputStreamPointer, size)

    /**
     * Creates a new #GInputStream from the given @base_stream, with
     * a buffer set to the default size (4 kilobytes).
     *
     * @param baseStream a #GInputStream
     * @return a #GInputStream for the given @base_stream.
     */
    public constructor(
        baseStream: InputStream,
    ) : this(g_buffered_input_stream_new(baseStream.gioInputStreamPointer)!!.reinterpret())

    /**
     * Creates a new #GBufferedInputStream from the given @base_stream,
     * with a buffer set to @size.
     *
     * @param baseStream a #GInputStream
     * @param size a #gsize
     * @return a #GInputStream.
     */
    public constructor(
        baseStream: InputStream,
        size: gsize,
    ) : this(g_buffered_input_stream_new_sized(baseStream.gioInputStreamPointer, size)!!.reinterpret())

    /**
     * Tries to read @count bytes from the stream into the buffer.
     * Will block during this read.
     *
     * If @count is zero, returns zero and does nothing. A value of @count
     * larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     *
     * On success, the number of bytes read into the buffer is returned.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file. Zero is returned on end of file
     * (or if @count is zero),  but never otherwise.
     *
     * If @count is -1 then the attempted read size is equal to the number of
     * bytes that are required to fill the buffer.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     *
     * On error -1 is returned and @error is set accordingly.
     *
     * For the asynchronous, non-blocking, version of this function, see
     * g_buffered_input_stream_fill_async().
     *
     * @param count the number of bytes that will be read from the stream
     * @param cancellable optional #GCancellable object, null to ignore
     * @return the number of bytes read into @stream's buffer, up to @count,
     *     or -1 on error.
     */
    public open fun fill(count: Long, cancellable: Cancellable? = null): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_buffered_input_stream_fill(
                gioBufferedInputStreamPointer,
                count,
                cancellable?.gioCancellablePointer,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads data into @stream's buffer asynchronously, up to @count size.
     * @io_priority can be used to prioritize reads. For the synchronous
     * version of this function, see g_buffered_input_stream_fill().
     *
     * If @count is -1 then the attempted read size is equal to the number
     * of bytes that are required to fill the buffer.
     *
     * @param count the number of bytes that will be read from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object
     * @param callback a #GAsyncReadyCallback
     */
    public open fun fillAsync(
        count: Long,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_buffered_input_stream_fill_async(
        gioBufferedInputStreamPointer,
        count,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous read.
     *
     * @param result a #GAsyncResult
     * @return a #gssize of the read stream, or `-1` on an error.
     */
    public open fun fillFinish(result: AsyncResult): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_buffered_input_stream_fill_finish(gioBufferedInputStreamPointer, result.gioAsyncResultPointer, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Gets the size of the available data within the stream.
     *
     * @return size of the available stream.
     */
    public open fun getAvailable(): gsize = g_buffered_input_stream_get_available(gioBufferedInputStreamPointer)

    /**
     * Tries to read a single byte from the stream or the buffer. Will block
     * during this read.
     *
     * On success, the byte read from the stream is returned. On end of stream
     * -1 is returned but it's not an exceptional error and @error is not set.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     *
     * On error -1 is returned and @error is set accordingly.
     *
     * @param cancellable optional #GCancellable object, null to ignore
     * @return the byte read from the @stream, or -1 on end of stream or error.
     */
    public open fun readInt(cancellable: Cancellable? = null): Result<gint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_buffered_input_stream_read_byte(
                gioBufferedInputStreamPointer,
                cancellable?.gioCancellablePointer,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<BufferedInputStream> {
        override val type: GeneratedClassKGType<BufferedInputStream> =
            GeneratedClassKGType(g_buffered_input_stream_get_type()) { BufferedInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of BufferedInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_buffered_input_stream_get_type()
    }
}
