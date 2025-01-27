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
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInputStream
import org.gtkkn.native.gio.g_input_stream_clear_pending
import org.gtkkn.native.gio.g_input_stream_close
import org.gtkkn.native.gio.g_input_stream_close_async
import org.gtkkn.native.gio.g_input_stream_close_finish
import org.gtkkn.native.gio.g_input_stream_get_type
import org.gtkkn.native.gio.g_input_stream_has_pending
import org.gtkkn.native.gio.g_input_stream_is_closed
import org.gtkkn.native.gio.g_input_stream_read_bytes
import org.gtkkn.native.gio.g_input_stream_read_bytes_async
import org.gtkkn.native.gio.g_input_stream_read_bytes_finish
import org.gtkkn.native.gio.g_input_stream_read_finish
import org.gtkkn.native.gio.g_input_stream_set_pending
import org.gtkkn.native.gio.g_input_stream_skip
import org.gtkkn.native.gio.g_input_stream_skip_async
import org.gtkkn.native.gio.g_input_stream_skip_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.Unit

/**
 * `GInputStream` is a base class for implementing streaming input.
 *
 * It has functions to read from a stream ([method@Gio.InputStream.read]),
 * to close a stream ([method@Gio.InputStream.close]) and to skip some content
 * ([method@Gio.InputStream.skip]).
 *
 * To copy the content of an input stream to an output stream without
 * manually handling the reads and writes, use [method@Gio.OutputStream.splice].
 *
 * See the documentation for [class@Gio.IOStream] for details of thread safety
 * of streaming APIs.
 *
 * All of these functions have async variants too.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: buffer: Out parameter is not supported
 * - parameter `buffer`: buffer: Out parameter is not supported
 * - parameter `buffer`: buffer: Out parameter is not supported
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - parameter `buffer`: buffer: Out parameter is not supported
 */
public abstract class InputStream(public val gioInputStreamPointer: CPointer<GInputStream>) :
    Object(gioInputStreamPointer.reinterpret()),
    KGTyped {
    /**
     * Clears the pending flag on @stream.
     */
    public open fun clearPending(): Unit = g_input_stream_clear_pending(gioInputStreamPointer)

    /**
     * Closes the stream, releasing resources related to it.
     *
     * Once the stream is closed, all other operations will return %G_IO_ERROR_CLOSED.
     * Closing a stream multiple times will not return an error.
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
     * is important to check and report the error to the user.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     * Cancelling a close will still leave the stream closed, but some streams
     * can use a faster close that doesn't block to e.g. check errors.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true on success, false on failure
     */
    public open fun close(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_close(
            gioInputStreamPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Requests an asynchronous closes of the stream, releasing resources related to it.
     * When the operation is finished @callback will be called.
     * You can then call g_input_stream_close_finish() to get the result of the
     * operation.
     *
     * For behaviour details see g_input_stream_close().
     *
     * The asynchronous methods have a default fallback that uses threads to implement
     * asynchronicity, so they are optional for inheriting classes. However, if you
     * override one you must override all.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional cancellable object
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun closeAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_input_stream_close_async(
        gioInputStreamPointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes closing a stream asynchronously, started from g_input_stream_close_async().
     *
     * @param result a #GAsyncResult.
     * @return true if the stream was closed successfully.
     */
    public open fun closeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_close_finish(
            gioInputStreamPointer,
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
     * Checks if an input stream has pending actions.
     *
     * @return true if @stream has pending actions.
     */
    public open fun hasPending(): Boolean = g_input_stream_has_pending(gioInputStreamPointer).asBoolean()

    /**
     * Checks if an input stream is closed.
     *
     * @return true if the stream is closed.
     */
    public open fun isClosed(): Boolean = g_input_stream_is_closed(gioInputStreamPointer).asBoolean()

    /**
     * Like g_input_stream_read(), this tries to read @count bytes from
     * the stream in a blocking fashion. However, rather than reading into
     * a user-supplied buffer, this will create a new #GBytes containing
     * the data that was read. This may be easier to use from language
     * bindings.
     *
     * If count is zero, returns a zero-length #GBytes and does nothing. A
     * value of @count larger than %G_MAXSSIZE will cause a
     * %G_IO_ERROR_INVALID_ARGUMENT error.
     *
     * On success, a new #GBytes is returned. It is not an error if the
     * size of this object is not the same as the requested size, as it
     * can happen e.g. near the end of a file. A zero-length #GBytes is
     * returned on end of file (or if @count is zero), but never
     * otherwise.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     *
     * On error null is returned and @error is set accordingly.
     *
     * @param count maximum number of bytes that will be read from the stream. Common
     * values include 4096 and 8192.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a new #GBytes, or null on error
     * @since 2.34
     */
    @GioVersion2_34
    public open fun readBytes(count: gsize, cancellable: Cancellable? = null): Result<Bytes> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_read_bytes(
            gioInputStreamPointer,
            count,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            Bytes(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Request an asynchronous read of @count bytes from the stream into a
     * new #GBytes. When the operation is finished @callback will be
     * called. You can then call g_input_stream_read_bytes_finish() to get the
     * result of the operation.
     *
     * During an async request no other sync and async calls are allowed
     * on @stream, and will result in %G_IO_ERROR_PENDING errors.
     *
     * A value of @count larger than %G_MAXSSIZE will cause a
     * %G_IO_ERROR_INVALID_ARGUMENT error.
     *
     * On success, the new #GBytes will be passed to the callback. It is
     * not an error if this is smaller than the requested size, as it can
     * happen e.g. near the end of a file, but generally we try to read as
     * many bytes as requested. Zero is returned on end of file (or if
     * @count is zero), but never otherwise.
     *
     * Any outstanding I/O request with higher priority (lower numerical
     * value) will be executed before an outstanding request with lower
     * priority. Default priority is %G_PRIORITY_DEFAULT.
     *
     * @param count the number of bytes that will be read from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.34
     */
    @GioVersion2_34
    public open fun readBytesAsync(
        count: gsize,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_input_stream_read_bytes_async(
        gioInputStreamPointer,
        count,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous stream read-into-#GBytes operation.
     *
     * @param result a #GAsyncResult.
     * @return the newly-allocated #GBytes, or null on error
     * @since 2.34
     */
    @GioVersion2_34
    public open fun readBytesFinish(result: AsyncResult): Result<Bytes> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_read_bytes_finish(
            gioInputStreamPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Bytes(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Finishes an asynchronous stream read operation.
     *
     * @param result a #GAsyncResult.
     * @return number of bytes read in, or -1 on error, or 0 on end of file.
     */
    public open fun readFinish(result: AsyncResult): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_read_finish(gioInputStreamPointer, result.gioAsyncResultPointer, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets @stream to have actions pending. If the pending flag is
     * already set or @stream is closed, it will return false and set
     * @error.
     *
     * @return true if pending was previously unset and is now set.
     */
    public open fun setPending(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_set_pending(gioInputStreamPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Tries to skip @count bytes from the stream. Will block during the operation.
     *
     * This is identical to g_input_stream_read(), from a behaviour standpoint,
     * but the bytes that are skipped are not returned to the user. Some
     * streams have an implementation that is more efficient than reading the data.
     *
     * This function is optional for inherited classes, as the default implementation
     * emulates it using read.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     *
     * @param count the number of bytes that will be skipped from the stream
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return Number of bytes skipped, or -1 on error
     */
    public open fun skip(count: gsize, cancellable: Cancellable? = null): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_skip(gioInputStreamPointer, count, cancellable?.gioCancellablePointer, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Request an asynchronous skip of @count bytes from the stream.
     * When the operation is finished @callback will be called.
     * You can then call g_input_stream_skip_finish() to get the result
     * of the operation.
     *
     * During an async request no other sync and async calls are allowed,
     * and will result in %G_IO_ERROR_PENDING errors.
     *
     * A value of @count larger than %G_MAXSSIZE will cause a %G_IO_ERROR_INVALID_ARGUMENT error.
     *
     * On success, the number of bytes skipped will be passed to the callback.
     * It is not an error if this is not the same as the requested size, as it
     * can happen e.g. near the end of a file, but generally we try to skip
     * as many bytes as requested. Zero is returned on end of file
     * (or if @count is zero), but never otherwise.
     *
     * Any outstanding i/o request with higher priority (lower numerical value)
     * will be executed before an outstanding request with lower priority.
     * Default priority is %G_PRIORITY_DEFAULT.
     *
     * The asynchronous methods have a default fallback that uses threads to
     * implement asynchronicity, so they are optional for inheriting classes.
     * However, if you override one, you must override all.
     *
     * @param count the number of bytes that will be skipped from the stream
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun skipAsync(
        count: gsize,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_input_stream_skip_async(
        gioInputStreamPointer,
        count,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes a stream skip operation.
     *
     * @param result a #GAsyncResult.
     * @return the size of the bytes skipped, or `-1` on error.
     */
    public open fun skipFinish(result: AsyncResult): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_input_stream_skip_finish(gioInputStreamPointer, result.gioAsyncResultPointer, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The InputStreamImpl type represents a native instance of the abstract InputStream class.
     *
     * @constructor Creates a new instance of InputStream for the provided [CPointer].
     */
    public class InputStreamImpl(pointer: CPointer<GInputStream>) : InputStream(pointer)

    public companion object : TypeCompanion<InputStream> {
        override val type: GeneratedClassKGType<InputStream> =
            GeneratedClassKGType(getTypeOrNull("g_input_stream_get_type")!!) { InputStreamImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of InputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_input_stream_get_type()
    }
}
