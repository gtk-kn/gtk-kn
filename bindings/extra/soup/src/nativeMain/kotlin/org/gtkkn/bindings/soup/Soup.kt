// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.TypeCache
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GHashTable
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gchar
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.soup.SoupAuthDomain
import org.gtkkn.native.soup.SoupLogger
import org.gtkkn.native.soup.SoupLoggerLogLevel
import org.gtkkn.native.soup.SoupMessage
import org.gtkkn.native.soup.SoupServer
import org.gtkkn.native.soup.SoupServerMessage
import org.gtkkn.native.soup.SoupWebsocketConnection
import org.gtkkn.native.soup.soup_check_version
import org.gtkkn.native.soup.soup_cookies_free
import org.gtkkn.native.soup.soup_cookies_from_request
import org.gtkkn.native.soup.soup_cookies_from_response
import org.gtkkn.native.soup.soup_cookies_to_cookie_header
import org.gtkkn.native.soup.soup_cookies_to_request
import org.gtkkn.native.soup.soup_cookies_to_response
import org.gtkkn.native.soup.soup_date_time_new_from_http_string
import org.gtkkn.native.soup.soup_date_time_to_string
import org.gtkkn.native.soup.soup_form_decode
import org.gtkkn.native.soup.soup_form_encode_hash
import org.gtkkn.native.soup.soup_get_major_version
import org.gtkkn.native.soup.soup_get_micro_version
import org.gtkkn.native.soup.soup_get_minor_version
import org.gtkkn.native.soup.soup_header_contains
import org.gtkkn.native.soup.soup_header_free_list
import org.gtkkn.native.soup.soup_header_free_param_list
import org.gtkkn.native.soup.soup_header_g_string_append_param
import org.gtkkn.native.soup.soup_header_g_string_append_param_quoted
import org.gtkkn.native.soup.soup_header_parse_list
import org.gtkkn.native.soup.soup_header_parse_param_list
import org.gtkkn.native.soup.soup_header_parse_param_list_strict
import org.gtkkn.native.soup.soup_header_parse_semi_param_list
import org.gtkkn.native.soup.soup_header_parse_semi_param_list_strict
import org.gtkkn.native.soup.soup_headers_parse
import org.gtkkn.native.soup.soup_tld_domain_is_public_suffix
import org.gtkkn.native.soup.soup_tld_get_base_domain
import org.gtkkn.native.soup.soup_uri_equal
import kotlin.Boolean
import kotlin.Char
import kotlin.Result
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * ## Skipped during bindings generation
 *
 * - parameter `filename`: filename: Out parameter is not supported
 * - function `form_encode`: Varargs parameter is not supported
 * - parameter `form_data_set`: Unsupported pointer-to-pointer cType GData**
 * - parameter `args`: va_list type is not supported
 * - parameter `unacceptable`: unacceptable: Out parameter is not supported
 * - parameter `req_method`: req_method: Out parameter is not supported
 * - parameter `ver`: ver: Out parameter is not supported
 * - parameter `ver`: ver: Out parameter is not supported
 * - function `uri_copy`: Varargs parameter is not supported
 * - parameter `content_type`: content_type: Out parameter is not supported
 * - parameter `supported_extensions`: GLib.PtrArray parameter of type GObject.TypeClass is not supported
 * - parameter `supported_extensions`: GLib.PtrArray parameter of type GObject.TypeClass is not supported
 * - parameter `supported_extensions`: GLib.PtrArray parameter of type GObject.TypeClass is not supported
 * - parameter `supported_extensions`: GLib.PtrArray parameter of type GObject.TypeClass is not supported
 * - record `AuthClass`: glib type struct are ignored
 * - record `AuthDomainBasicClass`: glib type struct are ignored
 * - record `AuthDomainClass`: glib type struct are ignored
 * - record `AuthDomainDigestClass`: glib type struct are ignored
 * - record `AuthManagerClass`: glib type struct are ignored
 * - record `CacheClass`: glib type struct are ignored
 * - record `ContentDecoderClass`: glib type struct are ignored
 * - record `ContentSnifferClass`: glib type struct are ignored
 * - record `CookieJarClass`: glib type struct are ignored
 * - record `CookieJarDBClass`: glib type struct are ignored
 * - record `CookieJarTextClass`: glib type struct are ignored
 * - record `HSTSEnforcerClass`: glib type struct are ignored
 * - record `HSTSEnforcerDBClass`: glib type struct are ignored
 * - record `LoggerClass`: glib type struct are ignored
 * - record `MessageClass`: glib type struct are ignored
 * - record `MultipartInputStreamClass`: glib type struct are ignored
 * - record `ServerClass`: glib type struct are ignored
 * - record `ServerMessageClass`: glib type struct are ignored
 * - record `SessionClass`: glib type struct are ignored
 * - record `SessionFeatureInterface`: glib type struct are ignored
 * - record `WebsocketConnectionClass`: glib type struct are ignored
 * - record `WebsocketExtensionClass`: glib type struct are ignored
 * - record `WebsocketExtensionDeflateClass`: glib type struct are ignored
 * - record `WebsocketExtensionManagerClass`: glib type struct are ignored
 */
public object Soup {
    init {
        registerTypes()
    }

    /**
     * A constant corresponding to 1 day.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_DAY: gint = 0

    /**
     * A constant corresponding to 1 hour.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_HOUR: gint = 3600

    /**
     * A constant corresponding to 1 week.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_WEEK: gint = 0

    /**
     * A constant corresponding to 1 year.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_YEAR: gint = 0

    /**
     * A macro containing the value
     * `multipart/form-data`; the MIME type used for
     * posting form data that contains files to be uploaded.
     */
    public const val FORM_MIME_TYPE_MULTIPART: KotlinString = "multipart/form-data"

    /**
     * A macro containing the value
     * `application/x-www-form-urlencoded`; the default
     * MIME type for POSTing HTML form data.
     */
    public const val FORM_MIME_TYPE_URLENCODED: KotlinString = "application/x-www-form-urlencoded"

    /**
     * An expiration date that is always in the past.
     */
    public const val HSTS_POLICY_MAX_AGE_PAST: gint = 0

    /**
     * The set of #GUriFlags libsoup expects all #GUri to use.
     */
    public const val HTTP_URI_FLAGS: gint = 482

    /**
     * Like [func@get_major_version], but from the headers used at application
     * compile time, rather than from the library linked against at application run
     * time.
     */
    public const val MAJOR_VERSION: gint = 3

    /**
     * Like [func@get_micro_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: gint = 4

    /**
     * Like [func@get_minor_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: gint = 4

    /**
     * A macro that should be defined by the user prior to including
     * `libsoup.h`.
     *
     * The definition should be one of the predefined libsoup
     * version macros: %SOUP_VERSION_2_24, %SOUP_VERSION_2_26, ...
     *
     * This macro defines the earliest version of libsoup that the package
     * is required to be able to compile against.
     *
     * If the compiler is configured to warn about the use of deprecated
     * functions, then using functions that were deprecated in version
     * %SOUP_VERSION_MIN_REQUIRED or earlier will cause warnings (but
     * using functions deprecated in later releases will not).
     */
    public const val VERSION_MIN_REQUIRED: gint = 2

    /**
     * Like [func@CHECK_VERSION], but the check for soup_check_version is
     * at runtime instead of compile time.
     *
     * This is useful for compiling against older versions of libsoup, but using
     * features from newer versions.
     *
     * @param major the major version to check
     * @param minor the minor version to check
     * @param micro the micro version to check
     * @return true if the version of the libsoup currently loaded
     *   is the same as or newer than the passed-in version.
     */
    public fun checkVersion(major: guint, minor: guint, micro: guint): Boolean =
        soup_check_version(major, minor, micro).asBoolean()

    /**
     * Frees @cookies.
     *
     * @param cookies a #GSList of #SoupCookie
     */
    public fun cookiesFree(cookies: SList): Unit = soup_cookies_free(cookies.glibSListPointer)

    /**
     * Parses @msg's Cookie request header and returns a [struct@GLib.SList] of
     * `SoupCookie`s.
     *
     * As the "Cookie" header, unlike "Set-Cookie", only contains cookie names and
     * values, none of the other #SoupCookie fields will be filled in. (Thus, you
     * can't generally pass a cookie returned from this method directly to
     * [func@cookies_to_response].)
     *
     * @param msg a #SoupMessage containing a "Cookie" request header
     * @return a #GSList of
     *   `SoupCookie`s, which can be freed with [method@Cookie.free].
     */
    public fun cookiesFromRequest(msg: Message): SList = soup_cookies_from_request(msg.soupMessagePointer)!!.run {
        SList(this)
    }

    /**
     * Parses @msg's Set-Cookie response headers and returns a [struct@GLib.SList]
     * of `SoupCookie`s.
     *
     * Cookies that do not specify "path" or "domain" attributes will have their
     * values defaulted from @msg.
     *
     * @param msg a #SoupMessage containing a "Set-Cookie" response header
     * @return a #GSList of
     *   `SoupCookie`s, which can be freed with [method@Cookie.free].
     */
    public fun cookiesFromResponse(msg: Message): SList = soup_cookies_from_response(msg.soupMessagePointer)!!.run {
        SList(this)
    }

    /**
     * Serializes a [struct@GLib.SList] of #SoupCookie into a string suitable for
     * setting as the value of the "Cookie" header.
     *
     * @param cookies a #GSList of #SoupCookie
     * @return the serialization of @cookies
     */
    public fun cookiesToCookieHeader(cookies: SList): KotlinString =
        soup_cookies_to_cookie_header(cookies.glibSListPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Adds the name and value of each cookie in @cookies to @msg's
     * "Cookie" request.
     *
     * If @msg already has a "Cookie" request header, these cookies will be appended
     * to the cookies already present. Be careful that you do not append the same
     * cookies twice, eg, when requeuing a message.
     *
     * @param cookies a #GSList of #SoupCookie
     * @param msg a #SoupMessage
     */
    public fun cookiesToRequest(cookies: SList, msg: Message): Unit =
        soup_cookies_to_request(cookies.glibSListPointer, msg.soupMessagePointer)

    /**
     * Appends a "Set-Cookie" response header to @msg for each cookie in
     * @cookies.
     *
     * This is in addition to any other "Set-Cookie" headers
     * @msg may already have.
     *
     * @param cookies a #GSList of #SoupCookie
     * @param msg a #SoupMessage
     */
    public fun cookiesToResponse(cookies: SList, msg: Message): Unit =
        soup_cookies_to_response(cookies.glibSListPointer, msg.soupMessagePointer)

    /**
     * Parses @date_string and tries to extract a date from it.
     *
     * This recognizes all of the "HTTP-date" formats from RFC 2616, RFC 2822 dates,
     * and reasonable approximations thereof. (Eg, it is lenient about whitespace,
     * leading "0"s, etc.)
     *
     * @param dateString The date as a string
     * @return a new #GDateTime, or null if @date_string
     *   could not be parsed.
     */
    public fun dateTimeNewFromHttpString(dateString: KotlinString): DateTime? =
        soup_date_time_new_from_http_string(dateString)?.run {
            DateTime(this)
        }

    /**
     * Converts @date to a string in the format described by @format.
     *
     * @param date a #GDateTime
     * @param format the format to generate the date in
     * @return @date as a string or null
     */
    public fun dateTimeToString(date: DateTime, format: DateFormat): KotlinString =
        soup_date_time_to_string(date.glibDateTimePointer, format.nativeValue)?.toKString()
            ?: error("Expected not null string")

    /**
     * Decodes @form.
     *
     * which is an urlencoded dataset as defined in the HTML 4.01 spec.
     *
     * @param encodedForm data of type "application/x-www-form-urlencoded"
     * @return a hash
     *   table containing the name/value pairs from @encoded_form, which you
     *   can free with [func@GLib.HashTable.destroy].
     */
    public fun formDecode(encodedForm: KotlinString): HashTable = soup_form_decode(encodedForm)!!.run {
        HashTable(this)
    }

    /**
     * Encodes @form_data_set into a value of type
     * "application/x-www-form-urlencoded".
     *
     * Encodes as defined in the HTML 4.01 spec.
     *
     * Note that the HTML spec states that "The control names/values are
     * listed in the order they appear in the document." Since this method
     * takes a hash table, it cannot enforce that; if you care about the
     * ordering of the form fields, use [func@form_encode_datalist].
     *
     * See also: [ctor@Message.new_from_encoded_form].
     *
     * @param formDataSet a hash table containing
     *   name/value pairs (as strings)
     * @return the encoded form
     */
    public fun formEncodeHash(formDataSet: HashTable): KotlinString =
        soup_form_encode_hash(formDataSet.glibHashTablePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns the major version number of the libsoup library.
     *
     * e.g. in libsoup version 2.42.0 this is 2.
     *
     * This function is in the library, so it represents the libsoup library
     * your code is running against. Contrast with the #SOUP_MAJOR_VERSION
     * macro, which represents the major version of the libsoup headers you
     * have included when compiling your code.
     *
     * @return the major version number of the libsoup library
     */
    public fun getMajorVersion(): guint = soup_get_major_version()

    /**
     * Returns the micro version number of the libsoup library.
     *
     * e.g. in libsoup version 2.42.0 this is 0.
     *
     * This function is in the library, so it represents the libsoup library
     * your code is running against. Contrast with the #SOUP_MICRO_VERSION
     * macro, which represents the micro version of the libsoup headers you
     * have included when compiling your code.
     *
     * @return the micro version number of the libsoup library
     */
    public fun getMicroVersion(): guint = soup_get_micro_version()

    /**
     * Returns the minor version number of the libsoup library.
     *
     * e.g. in libsoup version 2.42.0 this is 42.
     *
     * This function is in the library, so it represents the libsoup library
     * your code is running against. Contrast with the #SOUP_MINOR_VERSION
     * macro, which represents the minor version of the libsoup headers you
     * have included when compiling your code.
     *
     * @return the minor version number of the libsoup library
     */
    public fun getMinorVersion(): guint = soup_get_minor_version()

    /**
     * Parses @header to see if it contains the token @token (matched
     * case-insensitively).
     *
     * Note that this can't be used with lists that have qvalues.
     *
     * @param header An HTTP header suitable for parsing with
     *   [func@header_parse_list]
     * @param token a token
     * @return whether or not @header contains @token
     */
    public fun headerContains(`header`: KotlinString, token: KotlinString): Boolean =
        soup_header_contains(`header`, token).asBoolean()

    /**
     * Frees @list.
     *
     * @param list a #GSList returned from [func@header_parse_list] or
     * [func@header_parse_quality_list]
     */
    public fun headerFreeList(list: SList): Unit = soup_header_free_list(list.glibSListPointer)

    /**
     * Frees @param_list.
     *
     * @param paramList a #GHashTable returned from
     *   [func@header_parse_param_list] or [func@header_parse_semi_param_list]
     */
    public fun headerFreeParamList(paramList: HashTable): Unit =
        soup_header_free_param_list(paramList.glibHashTablePointer)

    /**
     * Appends something like `name=value` to @string, taking care to quote @value
     * if needed, and if so, to escape any quotes or backslashes in @value.
     *
     * Alternatively, if @value is a non-ASCII UTF-8 string, it will be
     * appended using RFC5987 syntax. Although in theory this is supposed
     * to work anywhere in HTTP that uses this style of parameter, in
     * reality, it can only be used portably with the Content-Disposition
     * "filename" parameter.
     *
     * If @value is null, this will just append @name to @string.
     *
     * @param string a #GString being used to construct an HTTP header value
     * @param name a parameter name
     * @param value a parameter value, or null
     */
    public fun headerGStringAppendParam(string: GlibString, name: KotlinString, `value`: KotlinString? = null): Unit =
        soup_header_g_string_append_param(string.glibStringPointer, name, `value`)

    /**
     * Appends something like `name="value"` to
     * @string, taking care to escape any quotes or backslashes in @value.
     *
     * If @value is (non-ASCII) UTF-8, this will instead use RFC 5987
     * encoding, just like [func@header_g_string_append_param].
     *
     * @param string a #GString being used to construct an HTTP header value
     * @param name a parameter name
     * @param value a parameter value
     */
    public fun headerGStringAppendParamQuoted(string: GlibString, name: KotlinString, `value`: KotlinString): Unit =
        soup_header_g_string_append_param_quoted(string.glibStringPointer, name, `value`)

    /**
     * Parses a header whose content is described by RFC2616 as `#something`.
     *
     * "something" does not itself contain commas, except as part of quoted-strings.
     *
     * @param header a header value
     * @return a #GSList of
     *   list elements, as allocated strings
     */
    public fun headerParseList(`header`: KotlinString): SList = soup_header_parse_list(`header`)!!.run {
        SList(this)
    }

    /**
     * Parses a header which is a comma-delimited list of something like:
     * `token [ "=" ( token | quoted-string ) ]`.
     *
     * Tokens that don't have an associated value will still be added to
     * the resulting hash table, but with a null value.
     *
     * This also handles RFC5987 encoding (which in HTTP is mostly used
     * for giving UTF8-encoded filenames in the Content-Disposition
     * header).
     *
     * @param header a header value
     * @return a
     *   #GHashTable of list elements, which can be freed with
     *   [func@header_free_param_list].
     */
    public fun headerParseParamList(`header`: KotlinString): HashTable = soup_header_parse_param_list(`header`)!!.run {
        HashTable(this)
    }

    /**
     * A strict version of [func@header_parse_param_list]
     * that bails out if there are duplicate parameters.
     *
     * Note that this function will treat RFC5987-encoded
     * parameters as duplicated if an ASCII version is also
     * present. For header fields that might contain
     * RFC5987-encoded parameters, use
     * [func@header_parse_param_list] instead.
     *
     * @param header a header value
     * @return a #GHashTable of list elements, which can be freed with
     *   [func@header_free_param_list] or null if there are duplicate
     *   elements.
     */
    public fun headerParseParamListStrict(`header`: KotlinString): HashTable? =
        soup_header_parse_param_list_strict(`header`)?.run {
            HashTable(this)
        }

    /**
     * Parses a header which is a semicolon-delimited list of something
     * like: `token [ "=" ( token | quoted-string ) ]`.
     *
     * Tokens that don't have an associated value will still be added to
     * the resulting hash table, but with a null value.
     *
     * This also handles RFC5987 encoding (which in HTTP is mostly used
     * for giving UTF8-encoded filenames in the Content-Disposition
     * header).
     *
     * @param header a header value
     * @return a
     *   #GHashTable of list elements, which can be freed with
     *   [func@header_free_param_list].
     */
    public fun headerParseSemiParamList(`header`: KotlinString): HashTable =
        soup_header_parse_semi_param_list(`header`)!!.run {
            HashTable(this)
        }

    /**
     * A strict version of [func@header_parse_semi_param_list]
     * that bails out if there are duplicate parameters.
     *
     * Note that this function will treat RFC5987-encoded
     * parameters as duplicated if an ASCII version is also
     * present. For header fields that might contain
     * RFC5987-encoded parameters, use
     * [func@header_parse_semi_param_list] instead.
     *
     * @param header a header value
     * @return a #GHashTable of list elements, which can be freed with
     *   [func@header_free_param_list] or null if there are duplicate
     *   elements.
     */
    public fun headerParseSemiParamListStrict(`header`: KotlinString): HashTable? =
        soup_header_parse_semi_param_list_strict(`header`)?.run {
            HashTable(this)
        }

    /**
     * Parses the headers of an HTTP request or response in @str and
     * stores the results in @dest.
     *
     * Beware that @dest may be modified even on failure.
     *
     * This is a low-level method; normally you would use
     * [func@headers_parse_request] or [func@headers_parse_response].
     *
     * @param str the header string (including the Request-Line or Status-Line,
     *   but not the trailing blank line)
     * @param len length of @str
     * @param dest #SoupMessageHeaders to store the header values in
     * @return success or failure
     */
    public fun headersParse(str: KotlinString, len: gint, dest: MessageHeaders): Boolean =
        soup_headers_parse(str, len, dest.soupMessageHeadersPointer).asBoolean()

    /**
     * Looks whether the @domain passed as argument is a public domain
     * suffix (.org, .com, .co.uk, etc) or not.
     *
     * Prior to libsoup 2.46, this function required that @domain be in
     * UTF-8 if it was an IDN. From 2.46 on, the name can be in either
     * UTF-8 or ASCII format.
     *
     * @param domain a domain name
     * @return true if it is a public domain, false otherwise.
     */
    public fun tldDomainIsPublicSuffix(domain: KotlinString): Boolean =
        soup_tld_domain_is_public_suffix(domain).asBoolean()

    /**
     * Finds the base domain for a given @hostname
     *
     * The base domain is composed by the top level domain (such as .org, .com,
     * .co.uk, etc) plus the second level domain, for example for
     * myhost.mydomain.com it will return mydomain.com.
     *
     * Note that null will be returned for private URLs (those not ending
     * with any well known TLD) because choosing a base domain for them
     * would be totally arbitrary.
     *
     * Prior to libsoup 2.46, this function required that @hostname be in
     * UTF-8 if it was an IDN. From 2.46 on, the name can be in either
     * UTF-8 or ASCII format (and the return value will be in the same
     * format).
     *
     * @param hostname a hostname
     * @return a pointer to the start of the base domain in @hostname. If
     *   an error occurs, null will be returned and @error set.
     */
    public fun tldGetBaseDomain(hostname: KotlinString): Result<KotlinString> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_tld_get_base_domain(hostname, gError.ptr)?.toKString()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.soup.Soup.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Tests whether or not @uri1 and @uri2 are equal in all parts.
     *
     * @param uri1 a #GUri
     * @param uri2 another #GUri
     * @return true if equal otherwise false
     */
    public fun uriEqual(uri1: Uri, uri2: Uri): Boolean =
        soup_uri_equal(uri1.glibUriPointer, uri2.glibUriPointer).asBoolean()

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            SessionError.quark() -> SessionError.fromErrorOrNull(error)
                ?.let {
                    SessionErrorException(error, it)
                }
            TldError.quark() -> TldError.fromErrorOrNull(error)
                ?.let {
                    TldErrorException(error, it)
                }
            WebsocketError.quark() -> WebsocketError.fromErrorOrNull(error)
                ?.let {
                    WebsocketErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }

    private fun registerTypes() {
        Auth.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Auth::class, gtype) { Auth.AuthImpl(it.reinterpret()) }
        }
        AuthBasic.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthBasic::class, gtype) { AuthBasic(it.reinterpret()) }
        }
        AuthDigest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthDigest::class, gtype) { AuthDigest(it.reinterpret()) }
        }
        AuthDomain.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthDomain::class, gtype) { AuthDomain.AuthDomainImpl(it.reinterpret()) }
        }
        AuthDomainBasic.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthDomainBasic::class, gtype) { AuthDomainBasic(it.reinterpret()) }
        }
        AuthDomainDigest.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthDomainDigest::class, gtype) { AuthDomainDigest(it.reinterpret()) }
        }
        AuthManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthManager::class, gtype) { AuthManager(it.reinterpret()) }
        }
        AuthNtlm.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthNtlm::class, gtype) { AuthNtlm(it.reinterpret()) }
        }
        AuthNegotiate.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AuthNegotiate::class, gtype) { AuthNegotiate(it.reinterpret()) }
        }
        Cache.getTypeOrNull()?.let { gtype -> TypeCache.register(Cache::class, gtype) { Cache(it.reinterpret()) } }
        ContentDecoder.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ContentDecoder::class, gtype) { ContentDecoder(it.reinterpret()) }
        }
        ContentSniffer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ContentSniffer::class, gtype) { ContentSniffer(it.reinterpret()) }
        }
        CookieJar.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CookieJar::class, gtype) { CookieJar(it.reinterpret()) }
        }
        CookieJarDb.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CookieJarDb::class, gtype) { CookieJarDb(it.reinterpret()) }
        }
        CookieJarText.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CookieJarText::class, gtype) { CookieJarText(it.reinterpret()) }
        }
        HstsEnforcer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HstsEnforcer::class, gtype) { HstsEnforcer(it.reinterpret()) }
        }
        HstsEnforcerDb.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HstsEnforcerDb::class, gtype) { HstsEnforcerDb(it.reinterpret()) }
        }
        Logger.getTypeOrNull()?.let { gtype -> TypeCache.register(Logger::class, gtype) { Logger(it.reinterpret()) } }
        Message.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Message::class, gtype) { Message(it.reinterpret()) }
        }
        MultipartInputStream.getTypeOrNull()?.let { gtype ->
            TypeCache.register(MultipartInputStream::class, gtype) { MultipartInputStream(it.reinterpret()) }
        }
        Server.getTypeOrNull()?.let { gtype -> TypeCache.register(Server::class, gtype) { Server(it.reinterpret()) } }
        ServerMessage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ServerMessage::class, gtype) { ServerMessage(it.reinterpret()) }
        }
        Session.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Session::class, gtype) { Session(it.reinterpret()) }
        }
        WebsocketConnection.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsocketConnection::class, gtype) { WebsocketConnection(it.reinterpret()) }
        }
        WebsocketExtension.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsocketExtension::class, gtype) {
                WebsocketExtension.WebsocketExtensionImpl(it.reinterpret())
            }
        }
        WebsocketExtensionDeflate.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsocketExtensionDeflate::class, gtype) { WebsocketExtensionDeflate(it.reinterpret()) }
        }
        WebsocketExtensionManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WebsocketExtensionManager::class, gtype) { WebsocketExtensionManager(it.reinterpret()) }
        }
        SessionFeature.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SessionFeature::class, gtype) { SessionFeature.SessionFeatureImpl(it.reinterpret()) }
        }
    }
}

public val AuthDomainBasicAuthCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupAuthDomain>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> gboolean
        >
    > = staticCFunction {
        domain: CPointer<SoupAuthDomain>?,
        msg: CPointer<SoupServerMessage>?,
        username: CPointer<ByteVar>?,
        password: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            domain: AuthDomainBasic,
            msg: ServerMessage,
            username: KotlinString,
            password: KotlinString,
        ) -> Boolean
        >().get().invoke(
        domain!!.run {
            InstanceCache.get(reinterpret(), false) { AuthDomainBasic(reinterpret()) }!!
        },
        msg!!.run {
            InstanceCache.get(this, false) { ServerMessage(reinterpret()) }!!
        },
        username?.toKString() ?: error("Expected not null string"),
        password?.toKString() ?: error("Expected not null string")
    ).asGBoolean()
}
    .reinterpret()

public val AuthDomainDigestAuthCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupAuthDomain>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
        ) -> CPointer<ByteVar>?
        >
    > = staticCFunction {
        domain: CPointer<SoupAuthDomain>?,
        msg: CPointer<SoupServerMessage>?,
        username: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            domain: AuthDomainDigest,
            msg: ServerMessage,
            username: KotlinString,
        ) -> KotlinString?
        >().get().invoke(
        domain!!.run {
            InstanceCache.get(reinterpret(), false) { AuthDomainDigest(reinterpret()) }!!
        },
        msg!!.run {
            InstanceCache.get(this, false) { ServerMessage(reinterpret()) }!!
        },
        username?.toKString() ?: error("Expected not null string")
    )?.let { g_strdup(it) }
}
    .reinterpret()

public val AuthDomainFilterFunc:
    CPointer<CFunction<(CPointer<SoupAuthDomain>, CPointer<SoupServerMessage>) -> gboolean>> =
    staticCFunction {
            domain: CPointer<SoupAuthDomain>?,
            msg: CPointer<SoupServerMessage>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(domain: AuthDomain, msg: ServerMessage) -> Boolean>().get().invoke(
            domain!!.run {
                InstanceCache.get(this, false) { AuthDomain.AuthDomainImpl(reinterpret()) }!!
            },
            msg!!.run {
                InstanceCache.get(this, false) { ServerMessage(reinterpret()) }!!
            }
        ).asGBoolean()
    }
        .reinterpret()

public val AuthDomainGenericAuthCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupAuthDomain>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
        ) -> gboolean
        >
    > = staticCFunction {
        domain: CPointer<SoupAuthDomain>?,
        msg: CPointer<SoupServerMessage>?,
        username: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            domain: AuthDomain,
            msg: ServerMessage,
            username: KotlinString,
        ) -> Boolean
        >().get().invoke(
        domain!!.run {
            InstanceCache.get(this, false) { AuthDomain.AuthDomainImpl(reinterpret()) }!!
        },
        msg!!.run {
            InstanceCache.get(this, false) { ServerMessage(reinterpret()) }!!
        },
        username?.toKString() ?: error("Expected not null string")
    ).asGBoolean()
}
    .reinterpret()

public val LoggerFilterFunc:
    CPointer<CFunction<(CPointer<SoupLogger>, CPointer<SoupMessage>) -> SoupLoggerLogLevel>> =
    staticCFunction {
            logger: CPointer<SoupLogger>?,
            msg: CPointer<SoupMessage>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(logger: Logger, msg: Message) -> LoggerLogLevel>().get().invoke(
            logger!!.run {
                InstanceCache.get(this, false) { Logger(reinterpret()) }!!
            },
            msg!!.run {
                InstanceCache.get(this, false) { Message(reinterpret()) }!!
            }
        ).nativeValue
    }
        .reinterpret()

public val LoggerPrinterFunc: CPointer<
    CFunction<
        (
            CPointer<SoupLogger>,
            SoupLoggerLogLevel,
            gchar,
            CPointer<ByteVar>,
        ) -> Unit
        >
    > = staticCFunction {
        logger: CPointer<SoupLogger>?,
        level: SoupLoggerLogLevel,
        direction: gchar,
        `data`: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            logger: Logger,
            level: LoggerLogLevel,
            direction: Char,
            `data`: KotlinString,
        ) -> Unit
        >().get().invoke(
        logger!!.run {
            InstanceCache.get(this, false) { Logger(reinterpret()) }!!
        },
        level.run {
            LoggerLogLevel.fromNativeValue(this)
        },
        direction.toInt().toChar(),
        `data`?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()

public val MessageHeadersForeachFuncFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> = staticCFunction {
            name: CPointer<ByteVar>?,
            `value`: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(name: KotlinString, `value`: KotlinString) -> Unit>().get().invoke(
            name?.toKString() ?: error("Expected not null string"),
            `value`?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val ServerCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupServer>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
            CPointer<GHashTable>?,
        ) -> Unit
        >
    > = staticCFunction {
        server: CPointer<SoupServer>?,
        msg: CPointer<SoupServerMessage>?,
        path: CPointer<ByteVar>?,
        query: CPointer<GHashTable>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            server: Server,
            msg: ServerMessage,
            path: KotlinString,
            query: HashTable?,
        ) -> Unit
        >().get().invoke(
        server!!.run {
            InstanceCache.get(this, false) { Server(reinterpret()) }!!
        },
        msg!!.run {
            InstanceCache.get(this, false) { ServerMessage(reinterpret()) }!!
        },
        path?.toKString() ?: error("Expected not null string"),
        query?.run {
            HashTable(this)
        }
    )
}
    .reinterpret()

public val ServerWebsocketCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupServer>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
            CPointer<SoupWebsocketConnection>,
        ) -> Unit
        >
    > = staticCFunction {
        server: CPointer<SoupServer>?,
        msg: CPointer<SoupServerMessage>?,
        path: CPointer<ByteVar>?,
        connection: CPointer<SoupWebsocketConnection>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            server: Server,
            msg: ServerMessage,
            path: KotlinString,
            connection: WebsocketConnection,
        ) -> Unit
        >().get().invoke(
        server!!.run {
            InstanceCache.get(this, false) { Server(reinterpret()) }!!
        },
        msg!!.run {
            InstanceCache.get(this, false) { ServerMessage(reinterpret()) }!!
        },
        path?.toKString() ?: error("Expected not null string"),
        connection!!.run {
            InstanceCache.get(this, false) { WebsocketConnection(reinterpret()) }!!
        }
    )
}
    .reinterpret()

/**
 * Callback used by #SoupAuthDomainBasic for authentication purposes.
 *
 * The application should verify that @username and @password and valid
 * and return true or false.
 *
 * If you are maintaining your own password database (rather than
 * using the password to authenticate against some other system like
 * PAM or a remote server), you should make sure you know what you are
 * doing. In particular, don't store cleartext passwords, or
 * easily-computed hashes of cleartext passwords, even if you don't
 * care that much about the security of your server, because users
 * will frequently use the same password for multiple sites, and so
 * compromising any site with a cleartext (or easily-cracked) password
 * database may give attackers access to other more-interesting sites
 * as well.
 *
 * - param `domain` the domain
 * - param `msg` the message being authenticated
 * - param `username` the username provided by the client
 * - param `password` the password provided by the client
 * - return true if @username and @password are valid
 */
public typealias AuthDomainBasicAuthCallback = (
    domain: AuthDomainBasic,
    msg: ServerMessage,
    username: KotlinString,
    password: KotlinString,
) -> Boolean

/**
 * Callback used by #SoupAuthDomainDigest for authentication purposes.
 *
 * The application should look up @username in its password database,
 * and return the corresponding encoded password (see
 * [func@AuthDomainDigest.encode_password].
 *
 * - param `domain` the domain
 * - param `msg` the message being authenticated
 * - param `username` the username provided by the client
 * - return the encoded password, or null if
 *   @username is not a valid user. @domain will free the password when
 *   it is done with it.
 */
public typealias AuthDomainDigestAuthCallback = (
    domain: AuthDomainDigest,
    msg: ServerMessage,
    username: KotlinString,
) -> KotlinString?

/**
 * The prototype for a #SoupAuthDomain filter.
 *
 * See [method@AuthDomain.set_filter] for details.
 *
 * - param `domain` a #SoupAuthDomain
 * - param `msg` a #SoupServerMessage
 * - return true if @msg requires authentication, false if not.
 */
public typealias AuthDomainFilter = (domain: AuthDomain, msg: ServerMessage) -> Boolean

/**
 * The prototype for a #SoupAuthDomain generic authentication callback.
 *
 * The callback should look up the user's password, call
 * [method@AuthDomain.check_password], and use the return value from that method
 * as its own return value.
 *
 * In general, for security reasons, it is preferable to use the
 * auth-domain-specific auth callbacks (eg,
 * [callback@AuthDomainBasicAuthCallback] and
 * [callback@AuthDomainDigestAuthCallback]), because they don't require
 * keeping a cleartext password database. Most users will use the same
 * password for many different sites, meaning if any site with a
 * cleartext password database is compromised, accounts on other
 * servers might be compromised as well. For many of the cases where
 * [class@Server] is used, this is not really relevant, but it may still
 * be worth considering.
 *
 * - param `domain` a #SoupAuthDomain
 * - param `msg` the #SoupServerMessage being authenticated
 * - param `username` the username from @msg
 * - return true if @msg is authenticated, false if not.
 */
public typealias AuthDomainGenericAuthCallback = (
    domain: AuthDomain,
    msg: ServerMessage,
    username: KotlinString,
) -> Boolean

/**
 * The prototype for a logging filter.
 *
 * The filter callback will be invoked for each request or response, and should
 * analyze it and return a [enum@LoggerLogLevel] value indicating how much of
 * the message to log.
 *
 * - param `logger` the #SoupLogger
 * - param `msg` the message being logged
 * - return a [enum@LoggerLogLevel] value indicating how much of the message to
 *   log
 */
public typealias LoggerFilter = (logger: Logger, msg: Message) -> LoggerLogLevel

/**
 * The prototype for a custom printing callback.
 *
 * @level indicates what kind of information is being printed. Eg, it
 * will be %SOUP_LOGGER_LOG_HEADERS if @data is header data.
 *
 * @direction is either '<', '>', or ' ', and @data is the single line
 * to print; the printer is expected to add a terminating newline.
 *
 * To get the effect of the default printer, you would do:
 *
 * ```c
 * printf ("%c %s\n", direction, data);
 * ```
 *
 * - param `logger` the #SoupLogger
 * - param `level` the level of the information being printed.
 * - param `direction` a single-character prefix to @data
 * - param `data` data to print
 */
public typealias LoggerPrinter = (
    logger: Logger,
    level: LoggerLogLevel,
    direction: Char,
    `data`: KotlinString,
) -> Unit

/**
 * The callback passed to [method@MessageHeaders.foreach].
 *
 * - param `name` the header name
 * - param `value` the header value
 */
public typealias MessageHeadersForeachFunc = (name: KotlinString, `value`: KotlinString) -> Unit

/**
 * A callback used to handle requests to a [class@Server].
 *
 * @path and @query contain the likewise-named components of the
 * Request-URI, subject to certain assumptions. By default,
 * [class@Server] decodes all percent-encoding in the URI path, such that
 * `"/foo%2Fbar"` is treated the same as `"/foo/bar"`. If your
 * server is serving resources in some non-POSIX-filesystem namespace,
 * you may want to distinguish those as two distinct paths. In that
 * case, you can set the [property@Server:raw-paths] property when creating
 * the [class@Server], and it will leave those characters undecoded.
 *
 * @query contains the query component of the Request-URI parsed according to
 * the rules for HTML form handling. Although this is the only commonly-used
 * query string format in HTTP, there is nothing that actually requires that
 * HTTP URIs use that format; if your server needs to use some other format, you
 * can just ignore @query, and call [method@Message.get_uri] and parse the URI's
 * query field yourself.
 *
 * See [method@Server.add_handler] and [method@Server.add_early_handler]
 * for details of what handlers can/should do.
 *
 * - param `server` the #SoupServer
 * - param `msg` the message being processed
 * - param `path` the path component of @msg's Request-URI
 * - param `query` the parsed query
 *   component of @msg's Request-URI
 */
public typealias ServerCallback = (
    server: Server,
    msg: ServerMessage,
    path: KotlinString,
    query: HashTable?,
) -> Unit

/**
 * A callback used to handle WebSocket requests to a #SoupServer.
 *
 * The callback will be invoked after sending the handshake response back to the
 * client (and is only invoked if the handshake was successful).
 *
 * @path contains the path of the Request-URI, subject to the same
 * rules as [callback@ServerCallback] `(qv)`.
 *
 * - param `server` the #SoupServer
 * - param `msg` the #SoupServerMessage
 * - param `path` the path component of @msg's Request-URI
 * - param `connection` the newly created WebSocket connection
 */
public typealias ServerWebsocketCallback = (
    server: Server,
    msg: ServerMessage,
    path: KotlinString,
    connection: WebsocketConnection,
) -> Unit
