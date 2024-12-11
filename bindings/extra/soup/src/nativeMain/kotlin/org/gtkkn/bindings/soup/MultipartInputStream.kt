// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.FilterInputStream
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.PollableInputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.soup.Soup.resolveException
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.soup.SoupMultipartInputStream
import org.gtkkn.native.soup.soup_multipart_input_stream_get_headers
import org.gtkkn.native.soup.soup_multipart_input_stream_get_type
import org.gtkkn.native.soup.soup_multipart_input_stream_new
import org.gtkkn.native.soup.soup_multipart_input_stream_next_part
import org.gtkkn.native.soup.soup_multipart_input_stream_next_part_async
import org.gtkkn.native.soup.soup_multipart_input_stream_next_part_finish
import kotlin.Result
import kotlin.Unit

/**
 * Handles streams of multipart messages.
 *
 * This adds support for the multipart responses. For handling the
 * multiple parts the user needs to wrap the [class@Gio.InputStream] obtained by
 * sending the request with a [class@MultipartInputStream] and use
 * [method@MultipartInputStream.next_part] before reading. Responses
 * which are not wrapped will be treated like non-multipart responses.
 *
 * Note that although #SoupMultipartInputStream is a [class@Gio.InputStream],
 * you should not read directly from it, and the results are undefined
 * if you do.
 *
 * ## Skipped during bindings generation
 *
 * - method `message`: Property has no getter nor setter
 */
public class MultipartInputStream(pointer: CPointer<SoupMultipartInputStream>) :
    FilterInputStream(pointer.reinterpret()),
    PollableInputStream,
    KGTyped {
    public val soupMultipartInputStreamPointer: CPointer<SoupMultipartInputStream>
        get() = gPointer.reinterpret()

    override val gioPollableInputStreamPointer: CPointer<GPollableInputStream>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #SoupMultipartInputStream that wraps the
     * [class@Gio.InputStream] obtained by sending the [class@Message].
     *
     * Reads should not be done directly through this object, use the input streams
     * returned by [method@MultipartInputStream.next_part] or its async
     * counterpart instead.
     *
     * @param msg the #SoupMessage the response is related to.
     * @param baseStream the #GInputStream returned by sending the request.
     * @return a new #SoupMultipartInputStream
     */
    public constructor(
        msg: Message,
        baseStream: InputStream,
    ) : this(
        soup_multipart_input_stream_new(
            msg.soupMessagePointer.reinterpret(),
            baseStream.gioInputStreamPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Obtains the headers for the part currently being processed.
     *
     * Note that the [struct@MessageHeaders] that are returned are owned by the
     * #SoupMultipartInputStream and will be replaced when a call is made to
     * [method@MultipartInputStream.next_part] or its async counterpart, so if
     * keeping the headers is required, a copy must be made.
     *
     * Note that if a part had no headers at all an empty [struct@MessageHeaders]
     * will be returned.
     *
     * @return a #SoupMessageHeaders
     *   containing the headers for the part currently being processed or
     *   null if the headers failed to parse.
     */
    public fun getHeaders(): MessageHeaders? =
        soup_multipart_input_stream_get_headers(soupMultipartInputStreamPointer.reinterpret())?.run {
            MessageHeaders(reinterpret())
        }

    /**
     * Obtains an input stream for the next part.
     *
     * When dealing with a multipart response the input stream needs to be wrapped
     * in a #SoupMultipartInputStream and this function or its async counterpart
     * need to be called to obtain the first part for reading.
     *
     * After calling this function,
     * [method@MultipartInputStream.get_headers] can be used to obtain the
     * headers for the first part. A read of 0 bytes indicates the end of
     * the part; a new call to this function should be done at that point,
     * to obtain the next part.
     *
     * @param cancellable a #GCancellable
     * @return a new #GInputStream, or
     *   null if there are no more parts
     */
    public fun nextPart(cancellable: Cancellable? = null): Result<InputStream?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_multipart_input_stream_next_part(
            soupMultipartInputStreamPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            InputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Obtains a [class@Gio.InputStream] for the next request.
     *
     * See [method@MultipartInputStream.next_part] for details on the workflow.
     *
     * @param ioPriority the I/O priority for the request.
     * @param cancellable a #GCancellable.
     * @param callback callback to call when request is satisfied.
     */
    public fun nextPartAsync(ioPriority: gint, cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        soup_multipart_input_stream_next_part_async(
            soupMultipartInputStreamPointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an asynchronous request for the next part.
     *
     * @param result a #GAsyncResult.
     * @return a newly created
     *   [class@Gio.InputStream] for reading the next part or null if there are no
     *   more parts.
     */
    public fun nextPartFinish(result: AsyncResult): Result<InputStream?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_multipart_input_stream_next_part_finish(
            soupMultipartInputStreamPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            InputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<MultipartInputStream> {
        override val type: GeneratedClassKGType<MultipartInputStream> =
            GeneratedClassKGType(soup_multipart_input_stream_get_type()) { MultipartInputStream(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of MultipartInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = soup_multipart_input_stream_get_type()
    }
}
