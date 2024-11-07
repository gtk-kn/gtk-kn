// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.soup.SoupCookie
import org.gtkkn.native.soup.SoupCookieJar
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_cookie_jar_add_cookie
import org.gtkkn.native.soup.soup_cookie_jar_add_cookie_full
import org.gtkkn.native.soup.soup_cookie_jar_add_cookie_with_first_party
import org.gtkkn.native.soup.soup_cookie_jar_all_cookies
import org.gtkkn.native.soup.soup_cookie_jar_delete_cookie
import org.gtkkn.native.soup.soup_cookie_jar_get_accept_policy
import org.gtkkn.native.soup.soup_cookie_jar_get_cookie_list
import org.gtkkn.native.soup.soup_cookie_jar_get_cookie_list_with_same_site_info
import org.gtkkn.native.soup.soup_cookie_jar_get_cookies
import org.gtkkn.native.soup.soup_cookie_jar_get_type
import org.gtkkn.native.soup.soup_cookie_jar_is_persistent
import org.gtkkn.native.soup.soup_cookie_jar_new
import org.gtkkn.native.soup.soup_cookie_jar_set_accept_policy
import org.gtkkn.native.soup.soup_cookie_jar_set_cookie
import org.gtkkn.native.soup.soup_cookie_jar_set_cookie_with_first_party
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Automatic cookie handling for SoupSession.
 *
 * A #SoupCookieJar stores [struct@Cookie]s and arrange for them to be sent with
 * the appropriate [class@Message]s. #SoupCookieJar implements
 * [iface@SessionFeature], so you can add a cookie jar to a session with
 * [method@Session.add_feature] or [method@Session.add_feature_by_type].
 *
 * Note that the base #SoupCookieJar class does not support any form
 * of long-term cookie persistence.
 *
 * ## Skipped during bindings generation
 *
 * - method `read-only`: Property has no getter nor setter
 */
public open class CookieJar(
    pointer: CPointer<SoupCookieJar>,
) : Object(pointer.reinterpret()),
    SessionFeature,
    KGTyped {
    public val soupCookieJarPointer: CPointer<SoupCookieJar>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * The policy the jar should follow to accept or reject cookies.
     */
    public open var acceptPolicy: CookieJarAcceptPolicy
        /**
         * Gets @jar's [enum@CookieJarAcceptPolicy].
         *
         * @return the #SoupCookieJarAcceptPolicy set in the @jar
         */
        get() =
            soup_cookie_jar_get_accept_policy(soupCookieJarPointer.reinterpret()).run {
                CookieJarAcceptPolicy.fromNativeValue(this)
            }

        /**
         * Sets @policy as the cookie acceptance policy for @jar.
         *
         * @param policy a #SoupCookieJarAcceptPolicy
         */
        set(policy) = soup_cookie_jar_set_accept_policy(soupCookieJarPointer.reinterpret(), policy.nativeValue)

    /**
     * Creates a new #SoupCookieJar.
     *
     * The base #SoupCookieJar class does not support persistent storage of cookies;
     * use a subclass for that.
     *
     * @return a new #SoupCookieJar
     */
    public constructor() : this(soup_cookie_jar_new()!!.reinterpret())

    /**
     * Adds @cookie to @jar.
     *
     * Emits the [signal@CookieJar::changed] signal if we are modifying
     * an existing cookie or adding a valid new cookie ('valid' means
     * that the cookie's expire date is not in the past).
     *
     * @cookie will be 'stolen' by the jar, so don't free it afterwards.
     *
     * @param cookie a #SoupCookie
     */
    public open fun addCookie(cookie: Cookie): Unit =
        soup_cookie_jar_add_cookie(soupCookieJarPointer.reinterpret(), cookie.soupCookiePointer)

    /**
     * Adds @cookie to @jar.
     *
     * Emits the [signal@CookieJar::changed] signal if we are modifying an existing
     * cookie or adding a valid new cookie ('valid' means that the cookie's expire
     * date is not in the past).
     *
     * @first_party will be used to reject cookies coming from third party
     * resources in case such a security policy is set in the @jar.
     *
     * @uri will be used to reject setting or overwriting secure cookies
     * from insecure origins. null is treated as secure.
     *
     * @cookie will be 'stolen' by the jar, so don't free it afterwards.
     *
     * @param cookie a #SoupCookie
     * @param uri the URI setting the cookie
     * @param firstParty the URI for the main document
     */
    public open fun addCookieFull(
        cookie: Cookie,
        uri: Uri? = null,
        firstParty: Uri? = null,
    ): Unit =
        soup_cookie_jar_add_cookie_full(
            soupCookieJarPointer.reinterpret(),
            cookie.soupCookiePointer,
            uri?.glibUriPointer,
            firstParty?.glibUriPointer
        )

    /**
     * Adds @cookie to @jar.
     *
     * Emits the [signal@CookieJar::changed] signal if we are modifying
     * an existing cookie or adding a valid new cookie ('valid' means
     * that the cookie's expire date is not in the past).
     *
     * @first_party will be used to reject cookies coming from third party
     * resources in case such a security policy is set in the @jar.
     *
     * @cookie will be 'stolen' by the jar, so don't free it afterwards.
     *
     * For secure cookies to work properly you may want to use
     * [method@CookieJar.add_cookie_full].
     *
     * @param firstParty the URI for the main document
     * @param cookie a #SoupCookie
     */
    public open fun addCookieWithFirstParty(
        firstParty: Uri,
        cookie: Cookie,
    ): Unit =
        soup_cookie_jar_add_cookie_with_first_party(
            soupCookieJarPointer.reinterpret(),
            firstParty.glibUriPointer,
            cookie.soupCookiePointer
        )

    /**
     * Constructs a [struct@GLib.List] with every cookie inside the @jar.
     *
     * The cookies in the list are a copy of the original, so
     * you have to free them when you are done with them.
     *
     * @return a #GSList
     *   with all the cookies in the @jar.
     */
    public open fun allCookies(): SList =
        soup_cookie_jar_all_cookies(soupCookieJarPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Deletes @cookie from @jar.
     *
     * Emits the [signal@CookieJar::changed] signal.
     *
     * @param cookie a #SoupCookie
     */
    public open fun deleteCookie(cookie: Cookie): Unit =
        soup_cookie_jar_delete_cookie(soupCookieJarPointer.reinterpret(), cookie.soupCookiePointer)

    /**
     * Gets @jar's [enum@CookieJarAcceptPolicy].
     *
     * @return the #SoupCookieJarAcceptPolicy set in the @jar
     */
    public open fun getAcceptPolicy(): CookieJarAcceptPolicy =
        soup_cookie_jar_get_accept_policy(soupCookieJarPointer.reinterpret()).run {
            CookieJarAcceptPolicy.fromNativeValue(this)
        }

    /**
     * Retrieves the list of cookies that would be sent with a request to @uri
     * as a [struct@GLib.List] of #SoupCookie objects.
     *
     * If @for_http is true, the return value will include cookies marked
     * "HttpOnly" (that is, cookies that the server wishes to keep hidden
     * from client-side scripting operations such as the JavaScript
     * document.cookies property). Since #SoupCookieJar sets the Cookie
     * header itself when making the actual HTTP request, you should
     * almost certainly be setting @for_http to false if you are calling
     * this.
     *
     * @param uri a #GUri
     * @param forHttp whether or not the return value is being passed directly
     *   to an HTTP operation
     * @return a #GSList
     *   with the cookies in the @jar that would be sent with a request to @uri.
     */
    public open fun getCookieList(
        uri: Uri,
        forHttp: Boolean,
    ): SList =
        soup_cookie_jar_get_cookie_list(
            soupCookieJarPointer.reinterpret(),
            uri.glibUriPointer,
            forHttp.asGBoolean()
        )!!.run {
            SList(reinterpret())
        }

    /**
     * This is an extended version of [method@CookieJar.get_cookie_list] that
     * provides more information required to use SameSite cookies.
     *
     * See the [SameSite cookies
     * spec](https://tools.ietf.org/html/draft-ietf-httpbis-cookie-same-site-00) for
     * more detailed information.
     *
     * @param uri a #GUri
     * @param topLevel a #GUri for the top level document
     * @param siteForCookies a #GUri indicating the origin to get cookies for
     * @param forHttp whether or not the return value is being passed directly
     *   to an HTTP operation
     * @param isSafeMethod if the HTTP method is safe, as defined by RFC 7231, ignored when @for_http is false
     * @param isTopLevelNavigation whether or not the HTTP request is part of
     *   top level navigation
     * @return a #GSList
     *   with the cookies in the @jar that would be sent with a request to @uri.
     */
    public open fun getCookieListWithSameSiteInfo(
        uri: Uri,
        topLevel: Uri? = null,
        siteForCookies: Uri? = null,
        forHttp: Boolean,
        isSafeMethod: Boolean,
        isTopLevelNavigation: Boolean,
    ): SList =
        soup_cookie_jar_get_cookie_list_with_same_site_info(
            soupCookieJarPointer.reinterpret(),
            uri.glibUriPointer,
            topLevel?.glibUriPointer,
            siteForCookies?.glibUriPointer,
            forHttp.asGBoolean(),
            isSafeMethod.asGBoolean(),
            isTopLevelNavigation.asGBoolean()
        )!!.run {
            SList(reinterpret())
        }

    /**
     * Retrieves (in Cookie-header form) the list of cookies that would
     * be sent with a request to @uri.
     *
     * If @for_http is true, the return value will include cookies marked
     * "HttpOnly" (that is, cookies that the server wishes to keep hidden
     * from client-side scripting operations such as the JavaScript
     * document.cookies property). Since #SoupCookieJar sets the Cookie
     * header itself when making the actual HTTP request, you should
     * almost certainly be setting @for_http to false if you are calling
     * this.
     *
     * @param uri a #GUri
     * @param forHttp whether or not the return value is being passed directly
     *   to an HTTP operation
     * @return the cookies, in string form, or null if
     *   there are no cookies for @uri.
     */
    public open fun getCookies(
        uri: Uri,
        forHttp: Boolean,
    ): String? =
        soup_cookie_jar_get_cookies(
            soupCookieJarPointer.reinterpret(),
            uri.glibUriPointer,
            forHttp.asGBoolean()
        )?.toKString()

    /**
     * Gets whether @jar stores cookies persistenly.
     *
     * @return true if @jar storage is persistent or false otherwise.
     */
    public open fun isPersistent(): Boolean =
        soup_cookie_jar_is_persistent(soupCookieJarPointer.reinterpret()).asBoolean()

    /**
     * Sets @policy as the cookie acceptance policy for @jar.
     *
     * @param policy a #SoupCookieJarAcceptPolicy
     */
    public open fun setAcceptPolicy(policy: CookieJarAcceptPolicy): Unit =
        soup_cookie_jar_set_accept_policy(soupCookieJarPointer.reinterpret(), policy.nativeValue)

    /**
     * Adds @cookie to @jar, exactly as though it had appeared in a
     * Set-Cookie header returned from a request to @uri.
     *
     * Keep in mind that if the [enum@CookieJarAcceptPolicy] set is either
     * %SOUP_COOKIE_JAR_ACCEPT_NO_THIRD_PARTY or
     * %SOUP_COOKIE_JAR_ACCEPT_GRANDFATHERED_THIRD_PARTY you'll need to use
     * [method@CookieJar.set_cookie_with_first_party], otherwise the jar
     * will have no way of knowing if the cookie is being set by a third
     * party or not.
     *
     * @param uri the URI setting the cookie
     * @param cookie the stringified cookie to set
     */
    public open fun setCookie(
        uri: Uri,
        cookie: String,
    ): Unit = soup_cookie_jar_set_cookie(soupCookieJarPointer.reinterpret(), uri.glibUriPointer, cookie)

    /**
     * Adds @cookie to @jar, exactly as though it had appeared in a
     * Set-Cookie header returned from a request to @uri.
     *
     * @first_party will be used to reject cookies coming from third party resources
     * in case such a security policy is set in the @jar.
     *
     * @param uri the URI setting the cookie
     * @param firstParty the URI for the main document
     * @param cookie the stringified cookie to set
     */
    public open fun setCookieWithFirstParty(
        uri: Uri,
        firstParty: Uri,
        cookie: String,
    ): Unit =
        soup_cookie_jar_set_cookie_with_first_party(
            soupCookieJarPointer.reinterpret(),
            uri.glibUriPointer,
            firstParty.glibUriPointer,
            cookie
        )

    /**
     * Emitted when @jar changes.
     *
     * If a cookie has been added,
     * @new_cookie will contain the newly-added cookie and
     * @old_cookie will be null. If a cookie has been deleted,
     * @old_cookie will contain the to-be-deleted cookie and
     * @new_cookie will be null. If a cookie has been changed,
     * @old_cookie will contain its old value, and @new_cookie its
     * new value.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `oldCookie` the old #SoupCookie value; `newCookie` the new #SoupCookie value
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (oldCookie: Cookie, newCookie: Cookie) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<CookieJar> {
        override val type: GeneratedClassKGType<CookieJar> =
            GeneratedClassKGType(soup_cookie_jar_get_type()) { CookieJar(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }
    }
}

private val connectChangedFunc:
    CPointer<CFunction<(CPointer<SoupCookie>, CPointer<SoupCookie>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            oldCookie: CPointer<SoupCookie>?,
            newCookie: CPointer<SoupCookie>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(oldCookie: Cookie, newCookie: Cookie) -> Unit>().get().invoke(
            oldCookie!!.run {
                Cookie(reinterpret())
            },
            newCookie!!.run {
                Cookie(reinterpret())
            }
        )
    }.reinterpret()
