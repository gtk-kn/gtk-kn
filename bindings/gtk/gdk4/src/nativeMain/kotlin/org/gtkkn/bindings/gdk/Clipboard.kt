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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkClipboard
import org.gtkkn.native.gdk.gdk_clipboard_get_content
import org.gtkkn.native.gdk.gdk_clipboard_get_display
import org.gtkkn.native.gdk.gdk_clipboard_get_formats
import org.gtkkn.native.gdk.gdk_clipboard_get_type
import org.gtkkn.native.gdk.gdk_clipboard_is_local
import org.gtkkn.native.gdk.gdk_clipboard_read_async
import org.gtkkn.native.gdk.gdk_clipboard_read_text_async
import org.gtkkn.native.gdk.gdk_clipboard_read_text_finish
import org.gtkkn.native.gdk.gdk_clipboard_read_texture_async
import org.gtkkn.native.gdk.gdk_clipboard_read_texture_finish
import org.gtkkn.native.gdk.gdk_clipboard_read_value_async
import org.gtkkn.native.gdk.gdk_clipboard_read_value_finish
import org.gtkkn.native.gdk.gdk_clipboard_set_content
import org.gtkkn.native.gdk.gdk_clipboard_set_text
import org.gtkkn.native.gdk.gdk_clipboard_set_texture
import org.gtkkn.native.gdk.gdk_clipboard_set_value
import org.gtkkn.native.gdk.gdk_clipboard_store_async
import org.gtkkn.native.gdk.gdk_clipboard_store_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * The `GdkClipboard` object represents data shared between applications or
 * inside an application.
 *
 * To get a `GdkClipboard` object, use [method@Gdk.Display.get_clipboard] or
 * [method@Gdk.Display.get_primary_clipboard]. You can find out about the data
 * that is currently available in a clipboard using
 * [method@Gdk.Clipboard.get_formats].
 *
 * To make text or image data available in a clipboard, use
 * [method@Gdk.Clipboard.set_text] or [method@Gdk.Clipboard.set_texture].
 * For other data, you can use [method@Gdk.Clipboard.set_content], which
 * takes a [class@Gdk.ContentProvider] object.
 *
 * To read textual or image data from a clipboard, use
 * [method@Gdk.Clipboard.read_text_async] or
 * [method@Gdk.Clipboard.read_texture_async]. For other data, use
 * [method@Gdk.Clipboard.read_async], which provides a `GInputStream` object.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_mime_type`: out_mime_type: Out parameter is not supported
 * - parameter `args`: va_list
 * - method `local`: Property has no getter nor setter
 */
public open class Clipboard(pointer: CPointer<GdkClipboard>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gdkClipboardPointer: CPointer<GdkClipboard>
        get() = gPointer.reinterpret()

    /**
     * The `GdkContentProvider` or null if the clipboard is empty or contents are
     * provided otherwise.
     */
    public open val content: ContentProvider?
        /**
         * Returns the `GdkContentProvider` currently set on @clipboard.
         *
         * If the @clipboard is empty or its contents are not owned by the
         * current process, null will be returned.
         *
         * @return The content of a clipboard
         *   if the clipboard does not maintain any content
         */
        get() = gdk_clipboard_get_content(gdkClipboardPointer.reinterpret())?.run {
            ContentProvider(reinterpret())
        }

    /**
     * The `GdkDisplay` that the clipboard belongs to.
     */
    public open val display: Display
        /**
         * Gets the `GdkDisplay` that the clipboard was created for.
         *
         * @return a `GdkDisplay`
         */
        get() = gdk_clipboard_get_display(gdkClipboardPointer.reinterpret())!!.run {
            Display(reinterpret())
        }

    /**
     * The possible formats that the clipboard can provide its data in.
     */
    public open val formats: ContentFormats
        /**
         * Gets the formats that the clipboard can provide its current contents in.
         *
         * @return The formats of the clipboard
         */
        get() = gdk_clipboard_get_formats(gdkClipboardPointer.reinterpret())!!.run {
            ContentFormats(reinterpret())
        }

    /**
     * Returns if the clipboard is local.
     *
     * A clipboard is considered local if it was last claimed
     * by the running application.
     *
     * Note that [method@Gdk.Clipboard.get_content] may return null
     * even on a local clipboard. In this case the clipboard is empty.
     *
     * @return true if the clipboard is local
     */
    public open fun isLocal(): Boolean = gdk_clipboard_is_local(gdkClipboardPointer.reinterpret()).asBoolean()

    /**
     * Asynchronously requests an input stream to read the @clipboard's
     * contents from.
     *
     * When the operation is finished @callback will be called. You must then
     * call [method@Gdk.Clipboard.read_finish] to get the result of the operation.
     *
     * The clipboard will choose the most suitable mime type from the given list
     * to fulfill the request, preferring the ones listed first.
     *
     * @param mimeTypes a null-terminated array of mime types to choose from
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     */
    public open fun readAsync(
        mimeTypes: List<String>,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = memScoped {
        return gdk_clipboard_read_async(
            gdkClipboardPointer.reinterpret(),
            mimeTypes.toCStringList(this),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )
    }

    /**
     * Asynchronously request the @clipboard contents converted to a string.
     *
     * When the operation is finished @callback will be called. You must then
     * call [method@Gdk.Clipboard.read_text_finish] to get the result.
     *
     * This is a simple wrapper around [method@Gdk.Clipboard.read_value_async].
     * Use that function or [method@Gdk.Clipboard.read_async] directly if you
     * need more control over the operation.
     *
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     */
    public open fun readTextAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        gdk_clipboard_read_text_async(
            gdkClipboardPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an asynchronous clipboard read.
     *
     * See [method@Gdk.Clipboard.read_text_async].
     *
     * @param result a `GAsyncResult`
     * @return a new string
     */
    public open fun readTextFinish(result: AsyncResult): Result<String?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_clipboard_read_text_finish(
            gdkClipboardPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously request the @clipboard contents converted to a `GdkPixbuf`.
     *
     * When the operation is finished @callback will be called. You must then
     * call [method@Gdk.Clipboard.read_texture_finish] to get the result.
     *
     * This is a simple wrapper around [method@Gdk.Clipboard.read_value_async].
     * Use that function or [method@Gdk.Clipboard.read_async] directly if you
     * need more control over the operation.
     *
     * @param cancellable optional `GCancellable` object, null to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public open fun readTextureAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        gdk_clipboard_read_texture_async(
            gdkClipboardPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an asynchronous clipboard read.
     *
     * See [method@Gdk.Clipboard.read_texture_async].
     *
     * @param result a `GAsyncResult`
     * @return a new `GdkTexture`
     */
    public open fun readTextureFinish(result: AsyncResult): Result<Texture?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_clipboard_read_texture_finish(
            gdkClipboardPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Texture(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously request the @clipboard contents converted to the given
     * @type.
     *
     * When the operation is finished @callback will be called. You must then call
     * [method@Gdk.Clipboard.read_value_finish] to get the resulting `GValue`.
     *
     * For local clipboard contents that are available in the given `GType`,
     * the value will be copied directly. Otherwise, GDK will try to use
     * [func@content_deserialize_async] to convert the clipboard's data.
     *
     * @param type a `GType` to read
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     */
    public open fun readValueAsync(
        type: GType,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gdk_clipboard_read_value_async(
        gdkClipboardPointer.reinterpret(),
        type,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous clipboard read.
     *
     * See [method@Gdk.Clipboard.read_value_async].
     *
     * @param result a `GAsyncResult`
     * @return a `GValue` containing the result.
     */
    public open fun readValueFinish(result: AsyncResult): Result<Value> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_clipboard_read_value_finish(
            gdkClipboardPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Value(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Sets a new content provider on @clipboard.
     *
     * The clipboard will claim the `GdkDisplay`'s resources and advertise
     * these new contents to other applications.
     *
     * In the rare case of a failure, this function will return false. The
     * clipboard will then continue reporting its old contents and ignore
     * @provider.
     *
     * If the contents are read by either an external application or the
     * @clipboard's read functions, @clipboard will select the best format to
     * transfer the contents and then request that format from @provider.
     *
     * @param provider the new contents of @clipboard
     *   or null to clear the clipboard
     * @return true if setting the clipboard succeeded
     */
    public open fun setContent(provider: ContentProvider? = null): Boolean = gdk_clipboard_set_content(
        gdkClipboardPointer.reinterpret(),
        provider?.gdkContentProviderPointer?.reinterpret()
    ).asBoolean()

    /**
     * Puts the given @text into the clipboard.
     *
     * @param text Text to put into the clipboard
     */
    public open fun setText(text: String): Unit = gdk_clipboard_set_text(gdkClipboardPointer.reinterpret(), text)

    /**
     * Puts the given @texture into the clipboard.
     *
     * @param texture a `GdkTexture` to put into the clipboard
     */
    public open fun setTexture(texture: Texture): Unit =
        gdk_clipboard_set_texture(gdkClipboardPointer.reinterpret(), texture.gdkTexturePointer.reinterpret())

    /**
     * Sets the @clipboard to contain the given @value.
     *
     * @param value a `GValue` to set
     */
    public open fun `set`(`value`: Value): Unit =
        gdk_clipboard_set_value(gdkClipboardPointer.reinterpret(), `value`.gobjectValuePointer.reinterpret())

    /**
     * Asynchronously instructs the @clipboard to store its contents remotely.
     *
     * If the clipboard is not local, this function does nothing but report success.
     *
     * The @callback must call [method@Gdk.Clipboard.store_finish].
     *
     * The purpose of this call is to preserve clipboard contents beyond the
     * lifetime of an application, so this function is typically called on
     * exit. Depending on the platform, the functionality may not be available
     * unless a "clipboard manager" is running.
     *
     * This function is called automatically when a
     * [GtkApplication](../gtk4/class.Application.html)
     * is shut down, so you likely don't need to call it.
     *
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     */
    public open fun storeAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gdk_clipboard_store_async(
        gdkClipboardPointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an asynchronous clipboard store.
     *
     * See [method@Gdk.Clipboard.store_async].
     *
     * @param result a `GAsyncResult`
     * @return true if storing was successful.
     */
    public open fun storeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_clipboard_store_finish(
            gdkClipboardPointer.reinterpret(),
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
     * Emitted when the clipboard changes ownership.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Clipboard> {
        override val type: GeneratedClassKGType<Clipboard> =
            GeneratedClassKGType(gdk_clipboard_get_type()) { Clipboard(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Clipboard
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_clipboard_get_type()
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
