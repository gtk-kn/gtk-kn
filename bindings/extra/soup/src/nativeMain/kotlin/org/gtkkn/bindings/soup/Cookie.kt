// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupCookie
import org.gtkkn.native.soup.soup_cookie_applies_to_uri
import org.gtkkn.native.soup.soup_cookie_copy
import org.gtkkn.native.soup.soup_cookie_domain_matches
import org.gtkkn.native.soup.soup_cookie_equal
import org.gtkkn.native.soup.soup_cookie_free
import org.gtkkn.native.soup.soup_cookie_get_domain
import org.gtkkn.native.soup.soup_cookie_get_expires
import org.gtkkn.native.soup.soup_cookie_get_http_only
import org.gtkkn.native.soup.soup_cookie_get_name
import org.gtkkn.native.soup.soup_cookie_get_path
import org.gtkkn.native.soup.soup_cookie_get_same_site_policy
import org.gtkkn.native.soup.soup_cookie_get_secure
import org.gtkkn.native.soup.soup_cookie_get_type
import org.gtkkn.native.soup.soup_cookie_get_value
import org.gtkkn.native.soup.soup_cookie_new
import org.gtkkn.native.soup.soup_cookie_parse
import org.gtkkn.native.soup.soup_cookie_set_domain
import org.gtkkn.native.soup.soup_cookie_set_expires
import org.gtkkn.native.soup.soup_cookie_set_http_only
import org.gtkkn.native.soup.soup_cookie_set_max_age
import org.gtkkn.native.soup.soup_cookie_set_name
import org.gtkkn.native.soup.soup_cookie_set_path
import org.gtkkn.native.soup.soup_cookie_set_same_site_policy
import org.gtkkn.native.soup.soup_cookie_set_secure
import org.gtkkn.native.soup.soup_cookie_set_value
import org.gtkkn.native.soup.soup_cookie_to_cookie_header
import org.gtkkn.native.soup.soup_cookie_to_set_cookie_header
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Implements HTTP cookies, as described by
 * [RFC 6265](http://tools.ietf.org/html/rfc6265.txt).
 *
 * To have a [class@Session] handle cookies for your appliction
 * automatically, use a [class@CookieJar].
 *
 * @name and @value will be set for all cookies. If the cookie is
 * generated from a string that appears to have no name, then @name
 * will be the empty string.
 *
 * @domain and @path give the host or domain, and path within that
 * host/domain, to restrict this cookie to. If @domain starts with
 * ".", that indicates a domain (which matches the string after the
 * ".", or any hostname that has @domain as a suffix). Otherwise, it
 * is a hostname and must match exactly.
 *
 * @expires will be non-null if the cookie uses either the original
 * "expires" attribute, or the newer "max-age" attribute. If @expires
 * is null, it indicates that neither "expires" nor "max-age" was
 * specified, and the cookie expires at the end of the session.
 *
 * If @http_only is set, the cookie should not be exposed to untrusted
 * code (eg, javascript), so as to minimize the danger posed by
 * cross-site scripting attacks.
 */
public class Cookie(public val soupCookiePointer: CPointer<SoupCookie>) : ProxyInstance(soupCookiePointer) {
    /**
     * Creates a new #SoupCookie with the given attributes.
     *
     * Use [method@Cookie.set_secure] and [method@Cookie.set_http_only] if you
     * need to set those attributes on the returned cookie.
     *
     * If @domain starts with ".", that indicates a domain (which matches
     * the string after the ".", or any hostname that has @domain as a
     * suffix). Otherwise, it is a hostname and must match exactly.
     *
     * @max_age is used to set the "expires" attribute on the cookie; pass
     * -1 to not include the attribute (indicating that the cookie expires
     * with the current session), 0 for an already-expired cookie, or a
     * lifetime in seconds. You can use the constants
     * %SOUP_COOKIE_MAX_AGE_ONE_HOUR, %SOUP_COOKIE_MAX_AGE_ONE_DAY,
     * %SOUP_COOKIE_MAX_AGE_ONE_WEEK and %SOUP_COOKIE_MAX_AGE_ONE_YEAR (or
     * multiples thereof) to calculate this value. (If you really care
     * about setting the exact time that the cookie will expire, use
     * [method@Cookie.set_expires].)
     *
     * As of version 3.4.0 the default value of a cookie's same-site-policy
     * is %SOUP_SAME_SITE_POLICY_LAX.
     *
     * @param name cookie name
     * @param value cookie value
     * @param domain cookie domain or hostname
     * @param path cookie path, or null
     * @param maxAge max age of the cookie, or -1 for a session cookie
     * @return a new #SoupCookie.
     */
    public constructor(
        name: String,
        `value`: String,
        domain: String,
        path: String,
        maxAge: gint,
    ) : this(soup_cookie_new(name, `value`, domain, path, maxAge)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Tests if @cookie should be sent to @uri.
     *
     * (At the moment, this does not check that @cookie's domain matches
     * @uri, because it assumes that the caller has already done that.
     * But don't rely on that; it may change in the future.)
     *
     * @param uri a #GUri
     * @return true if @cookie should be sent to @uri, false if not
     */
    public fun appliesToUri(uri: Uri): Boolean =
        soup_cookie_applies_to_uri(soupCookiePointer, uri.glibUriPointer).asBoolean()

    /**
     * Copies @cookie.
     *
     * @return a copy of @cookie
     */
    public fun copy(): Cookie = soup_cookie_copy(soupCookiePointer)!!.run {
        Cookie(this)
    }

    /**
     * Checks if the @cookie's domain and @host match.
     *
     * The domains match if @cookie should be sent when making a request to @host,
     * or that @cookie should be accepted when receiving a response from @host.
     *
     * @param host a URI
     * @return true if the domains match, false otherwise
     */
    public fun domainMatches(host: String): Boolean = soup_cookie_domain_matches(soupCookiePointer, host).asBoolean()

    /**
     * Tests if @cookie1 and @cookie2 are equal.
     *
     * Note that currently, this does not check that the cookie domains
     * match. This may change in the future.
     *
     * @param cookie2 a #SoupCookie
     * @return whether the cookies are equal.
     */
    public fun equal(cookie2: Cookie): Boolean =
        soup_cookie_equal(soupCookiePointer, cookie2.soupCookiePointer).asBoolean()

    /**
     * Frees @cookie.
     */
    public fun free(): Unit = soup_cookie_free(soupCookiePointer)

    /**
     * Gets @cookie's domain.
     *
     * @return @cookie's domain
     */
    public fun getDomain(): String =
        soup_cookie_get_domain(soupCookiePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets @cookie's expiration time.
     *
     * @return @cookie's expiration time, which is
     *   owned by @cookie and should not be modified or freed.
     */
    public fun getExpires(): DateTime? = soup_cookie_get_expires(soupCookiePointer)?.run {
        DateTime(this)
    }

    /**
     * Gets @cookie's HttpOnly attribute.
     *
     * @return @cookie's HttpOnly attribute
     */
    public fun getHttpOnly(): Boolean = soup_cookie_get_http_only(soupCookiePointer).asBoolean()

    /**
     * Gets @cookie's name.
     *
     * @return @cookie's name
     */
    public fun getName(): String =
        soup_cookie_get_name(soupCookiePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets @cookie's path.
     *
     * @return @cookie's path
     */
    public fun getPath(): String =
        soup_cookie_get_path(soupCookiePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns the same-site policy for this cookie.
     *
     * @return a #SoupSameSitePolicy
     */
    public fun getSameSitePolicy(): SameSitePolicy = soup_cookie_get_same_site_policy(soupCookiePointer).run {
        SameSitePolicy.fromNativeValue(this)
    }

    /**
     * Gets @cookie's secure attribute.
     *
     * @return @cookie's secure attribute
     */
    public fun getSecure(): Boolean = soup_cookie_get_secure(soupCookiePointer).asBoolean()

    /**
     * Gets @cookie's value.
     *
     * @return @cookie's value
     */
    public fun getValue(): String =
        soup_cookie_get_value(soupCookiePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Sets @cookie's domain to @domain.
     *
     * @param domain the new domain
     */
    public fun setDomain(domain: String): Unit = soup_cookie_set_domain(soupCookiePointer, domain)

    /**
     * Sets @cookie's expiration time to @expires.
     *
     * If @expires is null, @cookie will be a session cookie and will expire at the
     * end of the client's session.
     *
     * (This sets the same property as [method@Cookie.set_max_age].)
     *
     * @param expires the new expiration time, or null
     */
    public fun setExpires(expires: DateTime): Unit =
        soup_cookie_set_expires(soupCookiePointer, expires.glibDateTimePointer)

    /**
     * Sets @cookie's HttpOnly attribute to @http_only.
     *
     * If true, @cookie will be marked as "http only", meaning it should not be
     * exposed to web page scripts or other untrusted code.
     *
     * @param httpOnly the new value for the HttpOnly attribute
     */
    public fun setHttpOnly(httpOnly: Boolean): Unit =
        soup_cookie_set_http_only(soupCookiePointer, httpOnly.asGBoolean())

    /**
     * Sets @cookie's max age to @max_age.
     *
     * If @max_age is -1, the cookie is a session cookie, and will expire at the end
     * of the client's session. Otherwise, it is the number of seconds until the
     * cookie expires. You can use the constants %SOUP_COOKIE_MAX_AGE_ONE_HOUR,
     * %SOUP_COOKIE_MAX_AGE_ONE_DAY, %SOUP_COOKIE_MAX_AGE_ONE_WEEK and
     * %SOUP_COOKIE_MAX_AGE_ONE_YEAR (or multiples thereof) to calculate this value.
     * (A value of 0 indicates that the cookie should be considered
     * already-expired.)
     *
     * This sets the same property as [method@Cookie.set_expires].
     *
     * @param maxAge the new max age
     */
    public fun setMaxAge(maxAge: gint): Unit = soup_cookie_set_max_age(soupCookiePointer, maxAge)

    /**
     * Sets @cookie's name to @name.
     *
     * @param name the new name
     */
    public fun setName(name: String): Unit = soup_cookie_set_name(soupCookiePointer, name)

    /**
     * Sets @cookie's path to @path.
     *
     * @param path the new path
     */
    public fun setPath(path: String): Unit = soup_cookie_set_path(soupCookiePointer, path)

    /**
     * When used in conjunction with
     * [method@CookieJar.get_cookie_list_with_same_site_info] this sets the policy
     * of when this cookie should be exposed.
     *
     * @param policy a #SoupSameSitePolicy
     */
    public fun setSameSitePolicy(policy: SameSitePolicy): Unit =
        soup_cookie_set_same_site_policy(soupCookiePointer, policy.nativeValue)

    /**
     * Sets @cookie's secure attribute to @secure.
     *
     * If true, @cookie will only be transmitted from the client to the server over
     * secure (https) connections.
     *
     * @param secure the new value for the secure attribute
     */
    public fun setSecure(secure: Boolean): Unit = soup_cookie_set_secure(soupCookiePointer, secure.asGBoolean())

    /**
     * Sets @cookie's value to @value.
     *
     * @param value the new value
     */
    public fun setValue(`value`: String): Unit = soup_cookie_set_value(soupCookiePointer, `value`)

    /**
     * Serializes @cookie in the format used by the Cookie header (ie, for
     * returning a cookie from a [class@Session] to a server).
     *
     * @return the header
     */
    public fun toCookieHeader(): String =
        soup_cookie_to_cookie_header(soupCookiePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Serializes @cookie in the format used by the Set-Cookie header.
     *
     * i.e. for sending a cookie from a [class@Server] to a client.
     *
     * @return the header
     */
    public fun toSetCookieHeader(): String =
        soup_cookie_to_set_cookie_header(soupCookiePointer)?.toKString() ?: error("Expected not null string")

    public companion object {
        /**
         * Parses @header and returns a #SoupCookie.
         *
         * If @header contains multiple cookies, only the first one will be parsed.
         *
         * If @header does not have "path" or "domain" attributes, they will
         * be defaulted from @origin. If @origin is null, path will default
         * to "/", but domain will be left as null. Note that this is not a
         * valid state for a #SoupCookie, and you will need to fill in some
         * appropriate string for the domain if you want to actually make use
         * of the cookie.
         *
         * As of version 3.4.0 the default value of a cookie's same-site-policy
         * is %SOUP_SAME_SITE_POLICY_LAX.
         *
         * @param header a cookie string (eg, the value of a Set-Cookie header)
         * @param origin origin of the cookie
         * @return a new #SoupCookie, or null if it could
         *   not be parsed, or contained an illegal "domain" attribute for a
         *   cookie originating from @origin.
         */
        public fun parse(`header`: String, origin: Uri? = null): Cookie? =
            soup_cookie_parse(`header`, origin?.glibUriPointer)?.run {
                Cookie(this)
            }

        /**
         * Get the GType of Cookie
         *
         * @return the GType
         */
        public fun getType(): GType = soup_cookie_get_type()
    }
}
