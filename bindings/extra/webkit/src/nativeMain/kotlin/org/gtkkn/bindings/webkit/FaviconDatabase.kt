// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.ByteVar
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
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.webkit.WebKitFaviconDatabase
import org.gtkkn.native.webkit.webkit_favicon_database_clear
import org.gtkkn.native.webkit.webkit_favicon_database_get_favicon
import org.gtkkn.native.webkit.webkit_favicon_database_get_favicon_finish
import org.gtkkn.native.webkit.webkit_favicon_database_get_favicon_uri
import org.gtkkn.native.webkit.webkit_favicon_database_get_type
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Provides access to the icons associated with web sites.
 *
 * WebKit will automatically look for available icons in <link>
 * elements on opened pages as well as an existing favicon.ico and
 * load the images found into a memory cache if possible. That cache
 * is frozen to an on-disk database for persistence.
 *
 * If #WebKitSettings:enable-private-browsing is true, new icons
 * won't be added to the on-disk database and no existing icons will
 * be deleted from it. Nevertheless, WebKit will still store them in
 * the in-memory cache during the current execution.
 */
public class FaviconDatabase(pointer: CPointer<WebKitFaviconDatabase>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitFaviconDatabasePointer: CPointer<WebKitFaviconDatabase>
        get() = gPointer.reinterpret()

    /**
     * Clears all icons from the database.
     */
    public fun clear(): Unit = webkit_favicon_database_clear(webkitFaviconDatabasePointer.reinterpret())

    /**
     * Asynchronously obtains a favicon image.
     *
     * Asynchronously obtains an image of the favicon for the
     * given page URI. It returns the cached icon if it's in the database
     * asynchronously waiting for the icon to be read from the database.
     *
     * This is an asynchronous method. When the operation is finished, callback will
     * be invoked. You can then call webkit_favicon_database_get_favicon_finish()
     * to get the result of the operation.
     *
     * @param pageUri URI of the page for which we want to retrieve the favicon
     * @param cancellable A #GCancellable or null.
     * @param callback A #GAsyncReadyCallback to call when the request is
     *            satisfied or null if you don't care about the result.
     */
    public fun getFavicon(pageUri: String, cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        webkit_favicon_database_get_favicon(
            webkitFaviconDatabasePointer.reinterpret(),
            pageUri,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an operation started with webkit_favicon_database_get_favicon().
     *
     * @param result A #GAsyncResult obtained from the #GAsyncReadyCallback passed to webkit_favicon_database_get_favicon()
     * @return a new favicon image, or null in case of error.
     */
    public fun getFaviconFinish(result: AsyncResult): Result<Texture> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_favicon_database_get_favicon_finish(
            webkitFaviconDatabasePointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Texture(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Obtains the URI of the favicon for the given @page_uri.
     *
     * @param pageUri URI of the page containing the icon
     * @return a newly allocated URI for the favicon, or null if the
     * database doesn't have a favicon for @page_uri.
     */
    public fun getFaviconUri(pageUri: String): String =
        webkit_favicon_database_get_favicon_uri(webkitFaviconDatabasePointer.reinterpret(), pageUri)?.toKString()
            ?: error("Expected not null string")

    /**
     * This signal is emitted when the favicon URI of @page_uri has
     * been changed to @favicon_uri in the database. You can connect
     * to this signal and call webkit_favicon_database_get_favicon()
     * to get the favicon. If you are interested in the favicon of a
     * #WebKitWebView it's easier to use the #WebKitWebView:favicon
     * property. See webkit_web_view_get_favicon() for more details.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pageUri` the URI of the Web page containing the icon; `faviconUri` the URI of the favicon
     */
    public fun connectFaviconChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pageUri: String, faviconUri: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "favicon-changed",
        connectFaviconChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<FaviconDatabase> {
        override val type: GeneratedClassKGType<FaviconDatabase> =
            GeneratedClassKGType(webkit_favicon_database_get_type()) { FaviconDatabase(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of FaviconDatabase
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_favicon_database_get_type()
    }
}

private val connectFaviconChangedFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            pageUri: CPointer<ByteVar>?,
            faviconUri: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pageUri: String, faviconUri: String) -> Unit>().get().invoke(
            pageUri?.toKString() ?: error("Expected not null string"),
            faviconUri?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()
