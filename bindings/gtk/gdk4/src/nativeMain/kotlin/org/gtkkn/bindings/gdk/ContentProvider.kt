// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkContentProvider
import org.gtkkn.native.gdk.gdk_content_provider_content_changed
import org.gtkkn.native.gdk.gdk_content_provider_get_type
import org.gtkkn.native.gdk.gdk_content_provider_get_value
import org.gtkkn.native.gdk.gdk_content_provider_new_for_bytes
import org.gtkkn.native.gdk.gdk_content_provider_new_for_value
import org.gtkkn.native.gdk.gdk_content_provider_ref_formats
import org.gtkkn.native.gdk.gdk_content_provider_ref_storable_formats
import org.gtkkn.native.gdk.gdk_content_provider_write_mime_type_async
import org.gtkkn.native.gdk.gdk_content_provider_write_mime_type_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkContentProvider` is used to provide content for the clipboard or
 * for drag-and-drop operations in a number of formats.
 *
 * To create a `GdkContentProvider`, use [ctor@Gdk.ContentProvider.new_for_value]
 * or [ctor@Gdk.ContentProvider.new_for_bytes].
 *
 * GDK knows how to handle common text and image formats out-of-the-box. See
 * [class@Gdk.ContentSerializer] and [class@Gdk.ContentDeserializer] if you want
 * to add support for application-specific data formats.
 *
 * ## Skipped during bindings generation
 *
 * - method `formats`: Property has no getter nor setter
 * - method `storable-formats`: Property has no getter nor setter
 * - constructor `new_typed`: Varargs parameter is not supported
 * - parameter `providers`: Array parameter of type ContentProvider is not supported
 */
public open class ContentProvider(pointer: CPointer<GdkContentProvider>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gdkContentProviderPointer: CPointer<GdkContentProvider>
        get() = gPointer.reinterpret()

    /**
     * Create a content provider that provides the given @bytes as data for
     * the given @mime_type.
     *
     * @param mimeType the mime type
     * @param bytes a `GBytes` with the data for @mime_type
     * @return a new `GdkContentProvider`
     */
    public constructor(
        mimeType: String,
        bytes: Bytes,
    ) : this(gdk_content_provider_new_for_bytes(mimeType, bytes.glibBytesPointer.reinterpret())!!.reinterpret())

    /**
     * Create a content provider that provides the given @value.
     *
     * @param value a `GValue`
     * @return a new `GdkContentProvider`
     */
    public constructor(
        `value`: Value,
    ) : this(gdk_content_provider_new_for_value(`value`.gobjectValuePointer.reinterpret())!!.reinterpret())

    /**
     * Emits the ::content-changed signal.
     */
    public open fun contentChanged(): Unit =
        gdk_content_provider_content_changed(gdkContentProviderPointer.reinterpret())

    /**
     * Gets the contents of @provider stored in @value.
     *
     * The @value will have been initialized to the `GType` the value should be
     * provided in. This given `GType` does not need to be listed in the formats
     * returned by [method@Gdk.ContentProvider.ref_formats]. However, if the
     * given `GType` is not supported, this operation can fail and
     * `G_IO_ERROR_NOT_SUPPORTED` will be reported.
     *
     * @param value the `GValue` to fill
     * @return true if the value was set successfully. Otherwise
     *   @error will be set to describe the failure.
     */
    public open fun getValue(`value`: Value): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_content_provider_get_value(
            gdkContentProviderPointer.reinterpret(),
            `value`.gobjectValuePointer.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Gets the formats that the provider can provide its current contents in.
     *
     * @return The formats of the provider
     */
    public open fun refFormats(): ContentFormats =
        gdk_content_provider_ref_formats(gdkContentProviderPointer.reinterpret())!!.run {
            ContentFormats(reinterpret())
        }

    /**
     * Gets the formats that the provider suggests other applications to store
     * the data in.
     *
     * An example of such an application would be a clipboard manager.
     *
     * This can be assumed to be a subset of [method@Gdk.ContentProvider.ref_formats].
     *
     * @return The storable formats of the provider
     */
    public open fun refStorableFormats(): ContentFormats =
        gdk_content_provider_ref_storable_formats(gdkContentProviderPointer.reinterpret())!!.run {
            ContentFormats(reinterpret())
        }

    /**
     * Asynchronously writes the contents of @provider to @stream in the given
     * @mime_type.
     *
     * When the operation is finished @callback will be called. You must then call
     * [method@Gdk.ContentProvider.write_mime_type_finish] to get the result
     * of the operation.
     *
     * The given mime type does not need to be listed in the formats returned by
     * [method@Gdk.ContentProvider.ref_formats]. However, if the given `GType` is
     * not supported, `G_IO_ERROR_NOT_SUPPORTED` will be reported.
     *
     * The given @stream will not be closed.
     *
     * @param mimeType the mime type to provide the data in
     * @param stream the `GOutputStream` to write to
     * @param ioPriority I/O priority of the request.
     * @param cancellable optional `GCancellable` object, null to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public open fun writeMimeTypeAsync(
        mimeType: String,
        stream: OutputStream,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gdk_content_provider_write_mime_type_async(
        gdkContentProviderPointer.reinterpret(),
        mimeType,
        stream.gioOutputStreamPointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous write operation.
     *
     * See [method@Gdk.ContentProvider.write_mime_type_async].
     *
     * @param result a `GAsyncResult`
     * @return true if the operation was completed successfully. Otherwise
     *   @error will be set to describe the failure.
     */
    public open fun writeMimeTypeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_content_provider_write_mime_type_finish(
            gdkContentProviderPointer.reinterpret(),
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
     * Emitted whenever the content provided by this provider has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectContentChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "content-changed",
            connectContentChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ContentProvider> {
        override val type: GeneratedClassKGType<ContentProvider> =
            GeneratedClassKGType(gdk_content_provider_get_type()) { ContentProvider(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of ContentProvider
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_content_provider_get_type()
    }
}

private val connectContentChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
