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
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GIOStream
import org.gtkkn.native.gio.g_io_stream_clear_pending
import org.gtkkn.native.gio.g_io_stream_close
import org.gtkkn.native.gio.g_io_stream_close_async
import org.gtkkn.native.gio.g_io_stream_close_finish
import org.gtkkn.native.gio.g_io_stream_get_input_stream
import org.gtkkn.native.gio.g_io_stream_get_output_stream
import org.gtkkn.native.gio.g_io_stream_get_type
import org.gtkkn.native.gio.g_io_stream_has_pending
import org.gtkkn.native.gio.g_io_stream_is_closed
import org.gtkkn.native.gio.g_io_stream_set_pending
import org.gtkkn.native.gio.g_io_stream_splice_async
import org.gtkkn.native.gio.g_io_stream_splice_finish
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.Unit

/**
 * `GIOStream` represents an object that has both read and write streams.
 * Generally the two streams act as separate input and output streams,
 * but they share some common resources and state. For instance, for
 * seekable streams, both streams may use the same position.
 *
 * Examples of `GIOStream` objects are [class@Gio.SocketConnection], which represents
 * a two-way network connection; and [class@Gio.FileIOStream], which represents a
 * file handle opened in read-write mode.
 *
 * To do the actual reading and writing you need to get the substreams
 * with [method@Gio.IOStream.get_input_stream] and
 * [method@Gio.IOStream.get_output_stream].
 *
 * The `GIOStream` object owns the input and the output streams, not the other
 * way around, so keeping the substreams alive will not keep the `GIOStream`
 * object alive. If the `GIOStream` object is freed it will be closed, thus
 * closing the substreams, so even if the substreams stay alive they will
 * always return `G_IO_ERROR_CLOSED` for all operations.
 *
 * To close a stream use [method@Gio.IOStream.close] which will close the common
 * stream object and also the individual substreams. You can also close
 * the substreams themselves. In most cases this only marks the
 * substream as closed, so further I/O on it fails but common state in the
 * `GIOStream` may still be open. However, some streams may support
 * ‘half-closed’ states where one direction of the stream is actually shut down.
 *
 * Operations on `GIOStream`s cannot be started while another operation on the
 * `GIOStream` or its substreams is in progress. Specifically, an application can
 * read from the [class@Gio.InputStream] and write to the
 * [class@Gio.OutputStream] simultaneously (either in separate threads, or as
 * asynchronous operations in the same thread), but an application cannot start
 * any `GIOStream` operation while there is a `GIOStream`, `GInputStream` or
 * `GOutputStream` operation in progress, and an application can’t start any
 * `GInputStream` or `GOutputStream` operation while there is a `GIOStream`
 * operation in progress.
 *
 * This is a product of individual stream operations being associated with a
 * given [type@GLib.MainContext] (the thread-default context at the time the
 * operation was started), rather than entire streams being associated with a
 * single `GMainContext`.
 *
 * GIO may run operations on `GIOStream`s from other (worker) threads, and this
 * may be exposed to application code in the behaviour of wrapper streams, such
 * as [class@Gio.BufferedInputStream] or [class@Gio.TlsConnection]. With such
 * wrapper APIs, application code may only run operations on the base (wrapped)
 * stream when the wrapper stream is idle. Note that the semantics of such
 * operations may not be well-defined due to the state the wrapper stream leaves
 * the base stream in (though they are guaranteed not to crash).
 *
 * ## Skipped during bindings generation
 *
 * - method `closed`: Property has no getter nor setter
 *
 * @since 2.22
 */
public open class IOStream(
    pointer: CPointer<GIOStream>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioIOStreamPointer: CPointer<GIOStream>
        get() = gPointer.reinterpret()

    /**
     * The [class@Gio.InputStream] to read from.
     *
     * @since 2.22
     */
    public open val inputStream: InputStream
        /**
         * Gets the input stream for this object. This is used
         * for reading.
         *
         * @return a #GInputStream, owned by the #GIOStream.
         * Do not free.
         * @since 2.22
         */
        get() =
            g_io_stream_get_input_stream(gioIOStreamPointer.reinterpret())!!.run {
                InputStream(reinterpret())
            }

    /**
     * The [class@Gio.OutputStream] to write to.
     *
     * @since 2.22
     */
    public open val outputStream: OutputStream
        /**
         * Gets the output stream for this object. This is used for
         * writing.
         *
         * @return a #GOutputStream, owned by the #GIOStream.
         * Do not free.
         * @since 2.22
         */
        get() =
            g_io_stream_get_output_stream(gioIOStreamPointer.reinterpret())!!.run {
                OutputStream(reinterpret())
            }

    /**
     * Clears the pending flag on @stream.
     *
     * @since 2.22
     */
    public open fun clearPending(): Unit = g_io_stream_clear_pending(gioIOStreamPointer.reinterpret())

    /**
     * Closes the stream, releasing resources related to it. This will also
     * close the individual input and output streams, if they are not already
     * closed.
     *
     * Once the stream is closed, all other operations will return
     * %G_IO_ERROR_CLOSED. Closing a stream multiple times will not
     * return an error.
     *
     * Closing a stream will automatically flush any outstanding buffers
     * in the stream.
     *
     * Streams will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     *
     * Some streams might keep the backing store of the stream (e.g. a file
     * descriptor) open after the stream is closed. See the documentation for
     * the individual stream for details.
     *
     * On failure the first error that happened will be reported, but the
     * close operation will finish as much as possible. A stream that failed
     * to close will still return %G_IO_ERROR_CLOSED for all operations.
     * Still, it is important to check and report the error to the user,
     * otherwise there might be a loss of data as all data might not be written.
     *
     * If @cancellable is not NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * Cancelling a close will still leave the stream closed, but some streams
     * can use a faster close that doesn't block to e.g. check errors.
     *
     * The default implementation of this method just calls close on the
     * individual input/output streams.
     *
     * @param cancellable optional #GCancellable object, null to ignore
     * @return true on success, false on failure
     * @since 2.22
     */
    public open fun close(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_io_stream_close(
                    gioIOStreamPointer.reinterpret(),
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
     * called. You can then call g_io_stream_close_finish() to get
     * the result of the operation.
     *
     * For behaviour details see g_io_stream_close().
     *
     * The asynchronous methods have a default fallback that uses threads
     * to implement asynchronicity, so they are optional for inheriting
     * classes. However, if you override one you must override all.
     *
     * @param ioPriority the io priority of the request
     * @param cancellable optional cancellable object
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    public open fun closeAsync(
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_io_stream_close_async(
            gioIOStreamPointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Closes a stream.
     *
     * @param result a #GAsyncResult
     * @return true if stream was successfully closed, false otherwise.
     * @since 2.22
     */
    public open fun closeFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_io_stream_close_finish(
                    gioIOStreamPointer.reinterpret(),
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
     * Gets the input stream for this object. This is used
     * for reading.
     *
     * @return a #GInputStream, owned by the #GIOStream.
     * Do not free.
     * @since 2.22
     */
    public open fun getInputStream(): InputStream =
        g_io_stream_get_input_stream(gioIOStreamPointer.reinterpret())!!.run {
            InputStream(reinterpret())
        }

    /**
     * Gets the output stream for this object. This is used for
     * writing.
     *
     * @return a #GOutputStream, owned by the #GIOStream.
     * Do not free.
     * @since 2.22
     */
    public open fun getOutputStream(): OutputStream =
        g_io_stream_get_output_stream(gioIOStreamPointer.reinterpret())!!.run {
            OutputStream(reinterpret())
        }

    /**
     * Checks if a stream has pending actions.
     *
     * @return true if @stream has pending actions.
     * @since 2.22
     */
    public open fun hasPending(): Boolean = g_io_stream_has_pending(gioIOStreamPointer.reinterpret()).asBoolean()

    /**
     * Checks if a stream is closed.
     *
     * @return true if the stream is closed.
     * @since 2.22
     */
    public open fun isClosed(): Boolean = g_io_stream_is_closed(gioIOStreamPointer.reinterpret()).asBoolean()

    /**
     * Sets @stream to have actions pending. If the pending flag is
     * already set or @stream is closed, it will return false and set
     * @error.
     *
     * @return true if pending was previously unset and is now set.
     * @since 2.22
     */
    public open fun setPending(): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_io_stream_set_pending(
                    gioIOStreamPointer.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asynchronously splice the output stream of @stream1 to the input stream of
     * @stream2, and splice the output stream of @stream2 to the input stream of
     * @stream1.
     *
     * When the operation is finished @callback will be called.
     * You can then call g_io_stream_splice_finish() to get the
     * result of the operation.
     *
     * @param stream2 a #GIOStream.
     * @param flags a set of #GIOStreamSpliceFlags.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.28
     */
    public open fun spliceAsync(
        stream2: IOStream,
        flags: IOStreamSpliceFlags,
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_io_stream_splice_async(
            gioIOStreamPointer.reinterpret(),
            stream2.gioIOStreamPointer.reinterpret(),
            flags.mask,
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    public companion object : TypeCompanion<IOStream> {
        override val type: GeneratedClassKGType<IOStream> =
            GeneratedClassKGType(g_io_stream_get_type()) { IOStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Finishes an asynchronous io stream splice operation.
         *
         * @param result a #GAsyncResult.
         * @return true on success, false otherwise.
         * @since 2.28
         */
        public fun spliceFinish(result: AsyncResult): Result<Boolean> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_io_stream_splice_finish(
                        result.gioAsyncResultPointer,
                        gError.ptr
                    ).asBoolean()
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(gResult)
                }
            }
    }
}
