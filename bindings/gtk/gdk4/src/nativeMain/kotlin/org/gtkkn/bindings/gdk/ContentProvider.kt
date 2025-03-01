// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
public open class ContentProvider(public val gdkContentProviderPointer: CPointer<GdkContentProvider>) :
    Object(gdkContentProviderPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

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
    ) : this(gdk_content_provider_new_for_bytes(mimeType, bytes.glibBytesPointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Create a content provider that provides the given @value.
     *
     * @param value a `GValue`
     * @return a new `GdkContentProvider`
     */
    public constructor(`value`: Value) : this(gdk_content_provider_new_for_value(`value`.gobjectValuePointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Emits the ::content-changed signal.
     */
    public open fun contentChanged(): Unit = gdk_content_provider_content_changed(gdkContentProviderPointer)

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
            gdkContentProviderPointer,
            `value`.gobjectValuePointer,
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
    public open fun refFormats(): ContentFormats = gdk_content_provider_ref_formats(gdkContentProviderPointer)!!.run {
        ContentFormats(this)
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
        gdk_content_provider_ref_storable_formats(gdkContentProviderPointer)!!.run {
            ContentFormats(this)
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
        gdkContentProviderPointer,
        mimeType,
        stream.gioOutputStreamPointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
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
            gdkContentProviderPointer,
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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onContentChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkContentProviderPointer,
            "content-changed",
            onContentChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "content-changed" signal. See [onContentChanged].
     */
    public fun emitContentChanged() {
        g_signal_emit_by_name(gdkContentProviderPointer.reinterpret(), "content-changed")
    }

    public companion object : TypeCompanion<ContentProvider> {
        override val type: GeneratedClassKGType<ContentProvider> =
            GeneratedClassKGType(getTypeOrNull()!!) { ContentProvider(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of ContentProvider
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_content_provider_get_type()

        /**
         * Gets the GType of from the symbol `gdk_content_provider_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_content_provider_get_type")
    }
}

private val onContentChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
