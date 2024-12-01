// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GOutputStream
import org.gtkkn.native.gio.g_output_stream_clear_pending
import org.gtkkn.native.gio.g_output_stream_close
import org.gtkkn.native.gio.g_output_stream_close_async
import org.gtkkn.native.gio.g_output_stream_close_finish
import org.gtkkn.native.gio.g_output_stream_flush
import org.gtkkn.native.gio.g_output_stream_flush_async
import org.gtkkn.native.gio.g_output_stream_flush_finish
import org.gtkkn.native.gio.g_output_stream_get_type
import org.gtkkn.native.gio.g_output_stream_has_pending
import org.gtkkn.native.gio.g_output_stream_is_closed
import org.gtkkn.native.gio.g_output_stream_is_closing
import org.gtkkn.native.gio.g_output_stream_set_pending
import org.gtkkn.native.gio.g_output_stream_splice
import org.gtkkn.native.gio.g_output_stream_splice_async
import org.gtkkn.native.gio.g_output_stream_splice_finish
import org.gtkkn.native.gio.g_output_stream_write_bytes
import org.gtkkn.native.gio.g_output_stream_write_bytes_async
import org.gtkkn.native.gio.g_output_stream_write_bytes_finish
import org.gtkkn.native.gio.g_output_stream_write_finish
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Result
import kotlin.Unit

/**
 * `GOutputStream` is a base class for implementing streaming output.
 *
 * It has functions to write to a stream ([method@Gio.OutputStream.write]),
 * to close a stream ([method@Gio.OutputStream.close]) and to flush pending
 * writes ([method@Gio.OutputStream.flush]).
 *
 * To copy the content of an input stream to an output stream without
 * manually handling the reads and writes, use [method@Gio.OutputStream.splice].
 *
 * See the documentation for [class@Gio.IOStream] for details of thread safety
 * of streaming APIs.
 *
 * All of these functions have async variants too.
 *
 * All classes derived from `GOutputStream` *should* implement synchronous
 * writing, splicing, flushing and closing streams, but *may* implement
 * asynchronous versions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `bytes_written`: bytes_written: Out parameter is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `vectors`: OutputVector
 * - parameter `vectors`: OutputVector
 * - parameter `vectors`: OutputVector
 * - parameter `bytes_written`: bytes_written: Out parameter is not supported
 * - parameter `vectors`: OutputVector
 * - parameter `bytes_written`: bytes_written: Out parameter is not supported
 */
public open class OutputStream(
    pointer: CPointer<GOutputStream>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioOutputStreamPointer: CPointer<GOutputStream>
        get() = gPointer.reinterpret()

    /**
     * Clears the pending flag on @stream.
     */
    public open fun clearPending(): Unit = g_output_stream_clear_pending(gioOutputStreamPointer.reinterpret())

    /**
     * Closes the stream, releasing resources related to it.
     *
     * Once the stream is closed, all other operations will return %G_IO_ERROR_CLOSED.
     * Closing a stream multiple times will not return an error.
     *
     * Closing a stream will automatically flush any outstanding buffers in the
     * stream.
     *
     * Streams will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     *
     * Some streams might keep the backing store of the stream (e.g. a file descriptor)
     * open after the stream is closed. See the documentation for the individual
     * stream for details.
     *
     * On failure the first error that happened will be reported, but the close
     * operation will finish as much as possible. A stream that failed to
     * close will still return %G_IO_ERROR_CLOSED for all operations. Still, it
     * is important to check and report the error to the user, otherwise
     * there might be a loss of data as all data might not be written.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * Cancelling a close will still leave the stream closed, but there some streams
     * can use a faster close that doesn't block to e.g. check errors. On
     * cancellation (as with any error) there is no guarantee that all written
     * data will reach the target.
     *
     * @param cancellable optional cancellable object
     * @return true on success, false on failure
     */
    public open fun close(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_close(
                    gioOutputStreamPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Requests an asynchronous close of the stream, releasing resources
     * related to it. When the operation is finished @callback will be
     * called. You can then call g_output_stream_close_finish() to get
     * the result of the operation.
     *
     * For behaviour details see g_output_stream_close().
     *
     * The asynchronous methods have a default fallback that uses threads
     * to implement asynchronicity, so they are optional for inheriting
     * classes. However, if you override one you must override all.
     *
     * @param ioPriority the io priority of the request.
     * @param cancellable optional cancellable object
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun closeAsync(
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_output_stream_close_async(
            gioOutputStreamPointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Closes an output stream.
     *
     * @param result a #GAsyncResult.
     * @return true if stream was successfully closed, false otherwise.
     */
    public open fun closeFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_close_finish(
                    gioOutputStreamPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Forces a write of all user-space buffered data for the given
     * @stream. Will block during the operation. Closing the stream will
     * implicitly cause a flush.
     *
     * This function is optional for inherited classes.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional cancellable object
     * @return true on success, false on error
     */
    public open fun flush(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_flush(
                    gioOutputStreamPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Forces an asynchronous write of all user-space buffered data for
     * the given @stream.
     * For behaviour details see g_output_stream_flush().
     *
     * When the operation is finished @callback will be
     * called. You can then call g_output_stream_flush_finish() to get the
     * result of the operation.
     *
     * @param ioPriority the io priority of the request.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun flushAsync(
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_output_stream_flush_async(
            gioOutputStreamPointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes flushing an output stream.
     *
     * @param result a GAsyncResult.
     * @return true if flush operation succeeded, false otherwise.
     */
    public open fun flushFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_flush_finish(
                    gioOutputStreamPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Checks if an output stream has pending actions.
     *
     * @return true if @stream has pending actions.
     */
    public open fun hasPending(): Boolean =
        g_output_stream_has_pending(gioOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Checks if an output stream has already been closed.
     *
     * @return true if @stream is closed. false otherwise.
     */
    public open fun isClosed(): Boolean = g_output_stream_is_closed(gioOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Checks if an output stream is being closed. This can be
     * used inside e.g. a flush implementation to see if the
     * flush (or other i/o operation) is called from within
     * the closing operation.
     *
     * @return true if @stream is being closed. false otherwise.
     * @since 2.24
     */
    @GioVersion2_24
    public open fun isClosing(): Boolean = g_output_stream_is_closing(gioOutputStreamPointer.reinterpret()).asBoolean()

    /**
     * Sets @stream to have actions pending. If the pending flag is
     * already set or @stream is closed, it will return false and set
     * @error.
     *
     * @return true if pending was previously unset and is now set.
     */
    public open fun setPending(): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_output_stream_set_pending(gioOutputStreamPointer.reinterpret(), gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Splices an input stream into an output stream.
     *
     * @param source a #GInputStream.
     * @param flags a set of #GOutputStreamSpliceFlags.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a #gssize containing the size of the data spliced, or
     *     -1 if an error occurred. Note that if the number of bytes
     *     spliced is greater than %G_MAXSSIZE, then that will be
     *     returned, and there is no way to determine the actual number
     *     of bytes spliced.
     */
    public open fun splice(
        source: InputStream,
        flags: OutputStreamSpliceFlags,
        cancellable: Cancellable? = null,
    ): Result<Long> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_splice(
                    gioOutputStreamPointer.reinterpret(),
                    source.gioInputStreamPointer.reinterpret(),
                    flags.mask,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Splices a stream asynchronously.
     * When the operation is finished @callback will be called.
     * You can then call g_output_stream_splice_finish() to get the
     * result of the operation.
     *
     * For the synchronous, blocking version of this function, see
     * g_output_stream_splice().
     *
     * @param source a #GInputStream.
     * @param flags a set of #GOutputStreamSpliceFlags.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun spliceAsync(
        source: InputStream,
        flags: OutputStreamSpliceFlags,
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_output_stream_splice_async(
            gioOutputStreamPointer.reinterpret(),
            source.gioInputStreamPointer.reinterpret(),
            flags.mask,
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an asynchronous stream splice operation.
     *
     * @param result a #GAsyncResult.
     * @return a #gssize of the number of bytes spliced. Note that if the
     *     number of bytes spliced is greater than %G_MAXSSIZE, then that
     *     will be returned, and there is no way to determine the actual
     *     number of bytes spliced.
     */
    public open fun spliceFinish(result: AsyncResult): Result<Long> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_splice_finish(
                    gioOutputStreamPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * A wrapper function for g_output_stream_write() which takes a
     * #GBytes as input.  This can be more convenient for use by language
     * bindings or in other cases where the refcounted nature of #GBytes
     * is helpful over a bare pointer interface.
     *
     * However, note that this function may still perform partial writes,
     * just like g_output_stream_write().  If that occurs, to continue
     * writing, you will need to create a new #GBytes containing just the
     * remaining bytes, using g_bytes_new_from_bytes(). Passing the same
     * #GBytes instance multiple times potentially can result in duplicated
     * data in the output stream.
     *
     * @param bytes the #GBytes to write
     * @param cancellable optional cancellable object
     * @return Number of bytes written, or -1 on error
     */
    public open fun writeBytes(
        bytes: Bytes,
        cancellable: Cancellable? = null,
    ): Result<Long> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_write_bytes(
                    gioOutputStreamPointer.reinterpret(),
                    bytes.glibBytesPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * This function is similar to g_output_stream_write_async(), but
     * takes a #GBytes as input.  Due to the refcounted nature of #GBytes,
     * this allows the stream to avoid taking a copy of the data.
     *
     * However, note that this function may still perform partial writes,
     * just like g_output_stream_write_async(). If that occurs, to continue
     * writing, you will need to create a new #GBytes containing just the
     * remaining bytes, using g_bytes_new_from_bytes(). Passing the same
     * #GBytes instance multiple times potentially can result in duplicated
     * data in the output stream.
     *
     * For the synchronous, blocking version of this function, see
     * g_output_stream_write_bytes().
     *
     * @param bytes The bytes to write
     * @param ioPriority the io priority of the request.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun writeBytesAsync(
        bytes: Bytes,
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_output_stream_write_bytes_async(
            gioOutputStreamPointer.reinterpret(),
            bytes.glibBytesPointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a stream write-from-#GBytes operation.
     *
     * @param result a #GAsyncResult.
     * @return a #gssize containing the number of bytes written to the stream.
     */
    public open fun writeBytesFinish(result: AsyncResult): Result<Long> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_write_bytes_finish(
                    gioOutputStreamPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Finishes a stream write operation.
     *
     * @param result a #GAsyncResult.
     * @return a #gssize containing the number of bytes written to the stream.
     */
    public open fun writeFinish(result: AsyncResult): Result<Long> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_output_stream_write_finish(
                    gioOutputStreamPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<OutputStream> {
        override val type: GeneratedClassKGType<OutputStream> =
            GeneratedClassKGType(g_output_stream_get_type()) { OutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
