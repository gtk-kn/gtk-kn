// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileIOStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_file_io_stream_get_etag
import org.gtkkn.native.gio.g_file_io_stream_get_type
import org.gtkkn.native.gio.g_file_io_stream_query_info
import org.gtkkn.native.gio.g_file_io_stream_query_info_async
import org.gtkkn.native.gio.g_file_io_stream_query_info_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * `GFileIOStream` provides I/O streams that both read and write to the same
 * file handle.
 *
 * `GFileIOStream` implements [iface@Gio.Seekable], which allows the I/O
 * stream to jump to arbitrary positions in the file and to truncate
 * the file, provided the filesystem of the file supports these
 * operations.
 *
 * To find the position of a file I/O stream, use [method@Gio.Seekable.tell].
 *
 * To find out if a file I/O stream supports seeking, use
 * [method@Gio.Seekable.can_seek]. To position a file I/O stream, use
 * [method@Gio.Seekable.seek]. To find out if a file I/O stream supports
 * truncating, use [method@Gio.Seekable.can_truncate]. To truncate a file I/O
 * stream, use [method@Gio.Seekable.truncate].
 *
 * The default implementation of all the `GFileIOStream` operations
 * and the implementation of [iface@Gio.Seekable] just call into the same
 * operations on the output stream.
 * @since 2.22
 */
@GioVersion2_22
public open class FileIoStream(public val gioFileIoStreamPointer: CPointer<GFileIOStream>) :
    IoStream(gioFileIoStreamPointer.reinterpret()),
    Seekable,
    KGTyped {
    override val gioSeekablePointer: CPointer<GSeekable>
        get() = handle.reinterpret()

    /**
     * Gets the entity tag for the file when it has been written.
     * This must be called after the stream has been written
     * and closed, as the etag can change while writing.
     *
     * @return the entity tag for the stream.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getEtag(): String? = g_file_io_stream_get_etag(gioFileIoStreamPointer)?.toKString()

    /**
     * Queries a file io stream for the given @attributes.
     * This function blocks while querying the stream. For the asynchronous
     * version of this function, see g_file_io_stream_query_info_async().
     * While the stream is blocked, the stream will set the pending flag
     * internally, and any other operations on the stream will fail with
     * %G_IO_ERROR_PENDING.
     *
     * Can fail if the stream was already closed (with @error being set to
     * %G_IO_ERROR_CLOSED), the stream has pending operations (with @error being
     * set to %G_IO_ERROR_PENDING), or if querying info is not supported for
     * the stream's interface (with @error being set to %G_IO_ERROR_NOT_SUPPORTED). I
     * all cases of failure, null will be returned.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and null will
     * be returned.
     *
     * @param attributes a file attribute query string.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a #GFileInfo for the @stream, or null on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun queryInfo(attributes: String, cancellable: Cancellable? = null): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_io_stream_query_info(
            gioFileIoStreamPointer,
            attributes,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            FileInfo(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously queries the @stream for a #GFileInfo. When completed,
     * @callback will be called with a #GAsyncResult which can be used to
     * finish the operation with g_file_io_stream_query_info_finish().
     *
     * For the synchronous version of this function, see
     * g_file_io_stream_query_info().
     *
     * @param attributes a file attribute query string.
     * @param ioPriority the [I/O priority](iface.AsyncResult.html#io-priority) of the
     *   request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    @GioVersion2_22
    public open fun queryInfoAsync(
        attributes: String,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_file_io_stream_query_info_async(
        gioFileIoStreamPointer,
        attributes,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finalizes the asynchronous query started
     * by g_file_io_stream_query_info_async().
     *
     * @param result a #GAsyncResult.
     * @return A #GFileInfo for the finished query.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun queryInfoFinish(result: AsyncResult): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_io_stream_query_info_finish(
            gioFileIoStreamPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileInfo(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    public companion object : TypeCompanion<FileIoStream> {
        override val type: GeneratedClassKGType<FileIoStream> =
            GeneratedClassKGType(g_file_io_stream_get_type()) { FileIoStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileIOStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_io_stream_get_type()
    }
}
