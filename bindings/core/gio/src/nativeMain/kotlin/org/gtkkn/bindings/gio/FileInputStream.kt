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
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileInputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_file_input_stream_get_type
import org.gtkkn.native.gio.g_file_input_stream_query_info
import org.gtkkn.native.gio.g_file_input_stream_query_info_async
import org.gtkkn.native.gio.g_file_input_stream_query_info_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * `GFileInputStream` provides input streams that take their
 * content from a file.
 *
 * `GFileInputStream` implements [iface@Gio.Seekable], which allows the input
 * stream to jump to arbitrary positions in the file, provided the
 * filesystem of the file allows it. To find the position of a file
 * input stream, use [method@Gio.Seekable.tell]. To find out if a file input
 * stream supports seeking, use [vfunc@Gio.Seekable.can_seek].
 * To position a file input stream, use [vfunc@Gio.Seekable.seek].
 */
public open class FileInputStream(public val gioFileInputStreamPointer: CPointer<GFileInputStream>) :
    InputStream(gioFileInputStreamPointer.reinterpret()),
    Seekable,
    KGTyped {
    override val gioSeekablePointer: CPointer<GSeekable>
        get() = handle.reinterpret()

    /**
     * Queries a file input stream the given @attributes. This function blocks
     * while querying the stream. For the asynchronous (non-blocking) version
     * of this function, see g_file_input_stream_query_info_async(). While the
     * stream is blocked, the stream will set the pending flag internally, and
     * any other operations on the stream will fail with %G_IO_ERROR_PENDING.
     *
     * @param attributes a file attribute query string.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a #GFileInfo, or null on error.
     */
    public open fun queryInfo(attributes: String, cancellable: Cancellable? = null): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_input_stream_query_info(
            gioFileInputStreamPointer,
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
     * Queries the stream information asynchronously.
     * When the operation is finished @callback will be called.
     * You can then call g_file_input_stream_query_info_finish()
     * to get the result of the operation.
     *
     * For the synchronous version of this function,
     * see g_file_input_stream_query_info().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be set
     *
     * @param attributes a file attribute query string.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun queryInfoAsync(
        attributes: String,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_file_input_stream_query_info_async(
        gioFileInputStreamPointer,
        attributes,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous info query operation.
     *
     * @param result a #GAsyncResult.
     * @return #GFileInfo.
     */
    public open fun queryInfoFinish(result: AsyncResult): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_input_stream_query_info_finish(
            gioFileInputStreamPointer,
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

    public companion object : TypeCompanion<FileInputStream> {
        override val type: GeneratedClassKGType<FileInputStream> =
            GeneratedClassKGType(g_file_input_stream_get_type()) { FileInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_input_stream_get_type()
    }
}
