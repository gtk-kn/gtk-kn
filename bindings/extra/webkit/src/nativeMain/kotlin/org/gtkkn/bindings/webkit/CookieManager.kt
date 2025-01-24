// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

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
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.Cookie
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_20
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_42
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitCookieManager
import org.gtkkn.native.webkit.webkit_cookie_manager_add_cookie
import org.gtkkn.native.webkit.webkit_cookie_manager_add_cookie_finish
import org.gtkkn.native.webkit.webkit_cookie_manager_delete_cookie
import org.gtkkn.native.webkit.webkit_cookie_manager_delete_cookie_finish
import org.gtkkn.native.webkit.webkit_cookie_manager_get_accept_policy
import org.gtkkn.native.webkit.webkit_cookie_manager_get_accept_policy_finish
import org.gtkkn.native.webkit.webkit_cookie_manager_get_all_cookies
import org.gtkkn.native.webkit.webkit_cookie_manager_get_all_cookies_finish
import org.gtkkn.native.webkit.webkit_cookie_manager_get_cookies
import org.gtkkn.native.webkit.webkit_cookie_manager_get_cookies_finish
import org.gtkkn.native.webkit.webkit_cookie_manager_get_type
import org.gtkkn.native.webkit.webkit_cookie_manager_replace_cookies
import org.gtkkn.native.webkit.webkit_cookie_manager_replace_cookies_finish
import org.gtkkn.native.webkit.webkit_cookie_manager_set_accept_policy
import org.gtkkn.native.webkit.webkit_cookie_manager_set_persistent_storage
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Defines how to handle cookies in a #WebKitWebContext.
 *
 * The WebKitCookieManager defines how to set up and handle cookies.
 * You can get it from a #WebKitWebsiteDataManager with
 * webkit_website_data_manager_get_cookie_manager(), and use it to set where to
 * store cookies with webkit_cookie_manager_set_persistent_storage(),
 * or to set the acceptance policy, with webkit_cookie_manager_get_accept_policy().
 */
public class CookieManager(public val webkitCookieManagerPointer: CPointer<WebKitCookieManager>) :
    Object(webkitCookieManagerPointer.reinterpret()),
    KGTyped {
    /**
     * Asynchronously add a #SoupCookie to the underlying storage.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_cookie_manager_add_cookie_finish() to get the result of the operation.
     *
     * @param cookie the #SoupCookie to be added
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun addCookie(cookie: Cookie, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_cookie_manager_add_cookie(
            webkitCookieManagerPointer,
            cookie.soupCookiePointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_cookie_manager_add_cookie().
     *
     * @param result a #GAsyncResult
     * @return true if the cookie was added or false in case of error.
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun addCookieFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_cookie_manager_add_cookie_finish(
            webkitCookieManagerPointer,
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
     * Asynchronously delete a #SoupCookie from the current session.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_cookie_manager_delete_cookie_finish() to get the result of the operation.
     *
     * @param cookie the #SoupCookie to be deleted
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun deleteCookie(cookie: Cookie, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_cookie_manager_delete_cookie(
            webkitCookieManagerPointer,
            cookie.soupCookiePointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_cookie_manager_delete_cookie().
     *
     * @param result a #GAsyncResult
     * @return true if the cookie was deleted or false in case of error.
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun deleteCookieFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_cookie_manager_delete_cookie_finish(
            webkitCookieManagerPointer,
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
     * Asynchronously get the cookie acceptance policy of @cookie_manager.
     *
     * Note that when policy was set to %WEBKIT_COOKIE_POLICY_ACCEPT_NO_THIRD_PARTY and
     * ITP is enabled, this will return %WEBKIT_COOKIE_POLICY_ACCEPT_ALWAYS.
     * See also webkit_website_data_manager_set_itp_enabled().
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_cookie_manager_get_accept_policy_finish() to get the result of the operation.
     *
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     */
    public fun getAcceptPolicy(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_cookie_manager_get_accept_policy(
            webkitCookieManagerPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_cookie_manager_get_accept_policy().
     *
     * @param result a #GAsyncResult
     * @return the cookie acceptance policy of @cookie_manager as a #WebKitCookieAcceptPolicy.
     */
    public fun getAcceptPolicyFinish(result: AsyncResult): Result<CookieAcceptPolicy> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_cookie_manager_get_accept_policy_finish(
            webkitCookieManagerPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).run {
            CookieAcceptPolicy.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously get a list of #SoupCookie from @cookie_manager.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_cookie_manager_get_all_cookies_finish() to get the result of the operation.
     *
     * @param cancellable a #GCancellable or null to ignore
     * @param callback (closure user_data): a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getAllCookies(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_cookie_manager_get_all_cookies(
            webkitCookieManagerPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_cookie_manager_get_all_cookies().
     *
     * The return value is a #GList of #SoupCookie instances which should be released
     * with g_list_free_full() and soup_cookie_free().
     *
     * @param result a #GAsyncResult
     * @return A #GList of #SoupCookie instances.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getAllCookiesFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_cookie_manager_get_all_cookies_finish(
            webkitCookieManagerPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously get a list of #SoupCookie from @cookie_manager.
     *
     * Asynchronously get a list of #SoupCookie from @cookie_manager associated with @uri, which
     * must be either an HTTP or an HTTPS URL.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_cookie_manager_get_cookies_finish() to get the result of the operation.
     *
     * @param uri the URI associated to the cookies to be retrieved
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun getCookies(uri: String, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_cookie_manager_get_cookies(
            webkitCookieManagerPointer,
            uri,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_cookie_manager_get_cookies().
     *
     * The return value is a #GList of #SoupCookie instances which should be released
     * with g_list_free_full() and soup_cookie_free().
     *
     * @param result a #GAsyncResult
     * @return A #GList of #SoupCookie instances.
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun getCookiesFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_cookie_manager_get_cookies_finish(
            webkitCookieManagerPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously replace all cookies in @cookie_manager with the given list of @cookies.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_cookie_manager_replace_cookies_finish() to get the result of the operation.
     *
     * @param cookies a #GList of #SoupCookie to be added
     * @param cancellable a #GCancellable or null to ignore
     * @param callback (closure user_data): a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun replaceCookies(cookies: List, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_cookie_manager_replace_cookies(
            webkitCookieManagerPointer,
            cookies.glibListPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_cookie_manager_replace_cookies().
     *
     * @param result a #GAsyncResult
     * @return true if the cookies were added or false in case of error.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun replaceCookiesFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_cookie_manager_replace_cookies_finish(
            webkitCookieManagerPointer,
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
     * Set the cookie acceptance policy of @cookie_manager as @policy.
     *
     * Note that ITP has its own way to handle third-party cookies, so when it's enabled,
     * and @policy is set to %WEBKIT_COOKIE_POLICY_ACCEPT_NO_THIRD_PARTY, %WEBKIT_COOKIE_POLICY_ACCEPT_ALWAYS
     * will be used instead. Once disabled, the policy will be set back to %WEBKIT_COOKIE_POLICY_ACCEPT_NO_THIRD_PARTY.
     * See also webkit_website_data_manager_set_itp_enabled().
     *
     * @param policy a #WebKitCookieAcceptPolicy
     */
    public fun setAcceptPolicy(policy: CookieAcceptPolicy): Unit =
        webkit_cookie_manager_set_accept_policy(webkitCookieManagerPointer, policy.nativeValue)

    /**
     * Set non-session cookies.
     *
     * Set the @filename where non-session cookies are stored persistently using
     * @storage as the format to read/write the cookies.
     * Cookies are initially read from @filename to create an initial set of cookies.
     * Then, non-session cookies will be written to @filename when the WebKitCookieManager::changed
     * signal is emitted.
     * By default, @cookie_manager doesn't store the cookies persistently, so you need to call this
     * method to keep cookies saved across sessions.
     *
     * This method should never be called on a #WebKitCookieManager associated to an ephemeral #WebKitWebsiteDataManager.
     *
     * @param filename the filename to read to/write from
     * @param storage a #WebKitCookiePersistentStorage
     */
    public fun setPersistentStorage(filename: String, storage: CookiePersistentStorage): Unit =
        webkit_cookie_manager_set_persistent_storage(webkitCookieManagerPointer, filename, storage.nativeValue)

    /**
     * This signal is emitted when cookies are added, removed or modified.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitCookieManagerPointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     */
    public fun emitChanged() {
        g_signal_emit_by_name(webkitCookieManagerPointer.reinterpret(), "changed")
    }

    public companion object : TypeCompanion<CookieManager> {
        override val type: GeneratedClassKGType<CookieManager> =
            GeneratedClassKGType(webkit_cookie_manager_get_type()) { CookieManager(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of CookieManager
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_cookie_manager_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
