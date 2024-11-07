// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GHashTable
import org.gtkkn.native.soup.SoupAuthDomain
import org.gtkkn.native.soup.SoupAuthDomainBasic
import org.gtkkn.native.soup.SoupLogger
import org.gtkkn.native.soup.SoupLoggerLogLevel
import org.gtkkn.native.soup.SoupMessage
import org.gtkkn.native.soup.SoupServer
import org.gtkkn.native.soup.SoupServerMessage
import org.gtkkn.native.soup.SoupWebsocketConnection
import org.gtkkn.native.soup.soup_check_version
import org.gtkkn.native.soup.soup_cookie_parse
import org.gtkkn.native.soup.soup_cookies_from_request
import org.gtkkn.native.soup.soup_cookies_from_response
import org.gtkkn.native.soup.soup_cookies_to_cookie_header
import org.gtkkn.native.soup.soup_cookies_to_request
import org.gtkkn.native.soup.soup_cookies_to_response
import org.gtkkn.native.soup.soup_date_time_new_from_http_string
import org.gtkkn.native.soup.soup_form_decode
import org.gtkkn.native.soup.soup_form_encode_hash
import org.gtkkn.native.soup.soup_get_major_version
import org.gtkkn.native.soup.soup_get_micro_version
import org.gtkkn.native.soup.soup_get_minor_version
import org.gtkkn.native.soup.soup_header_contains
import org.gtkkn.native.soup.soup_header_free_param_list
import org.gtkkn.native.soup.soup_header_g_string_append_param
import org.gtkkn.native.soup.soup_header_g_string_append_param_quoted
import org.gtkkn.native.soup.soup_header_parse_list
import org.gtkkn.native.soup.soup_header_parse_param_list
import org.gtkkn.native.soup.soup_header_parse_param_list_strict
import org.gtkkn.native.soup.soup_header_parse_semi_param_list
import org.gtkkn.native.soup.soup_header_parse_semi_param_list_strict
import org.gtkkn.native.soup.soup_headers_parse
import org.gtkkn.native.soup.soup_message_headers_iter_init
import org.gtkkn.native.soup.soup_session_error_quark
import org.gtkkn.native.soup.soup_status_get_phrase
import org.gtkkn.native.soup.soup_tld_domain_is_public_suffix
import org.gtkkn.native.soup.soup_tld_error_quark
import org.gtkkn.native.soup.soup_tld_get_base_domain
import org.gtkkn.native.soup.soup_uri_equal
import org.gtkkn.native.soup.soup_websocket_error_quark
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Int
import kotlin.Result
import kotlin.UInt
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * ## Skipped during bindings generation
 *
 * - class `AuthBasic`: Missing cType on class
 * - class `AuthDigest`: Missing cType on class
 * - class `AuthNTLM`: Missing cType on class
 * - class `AuthNegotiate`: Missing cType on class
 * - function `date_time_to_string`: C function soup_date_time_to_string is ignored
 * - parameter `filename`: filename: Out parameter is not supported
 * - parameter `form_data_set`: GLib.Data
 * - parameter `unacceptable`: unacceptable: Out parameter is not supported
 * - parameter `req_method`: req_method: Out parameter is not supported
 * - parameter `ver`: ver: Out parameter is not supported
 * - parameter `ver`: ver: Out parameter is not supported
 * - parameter `content_type`: content_type: Out parameter is not supported
 * - parameter `supported_extensions`: Array parameter of type GObject.TypeClass is not supported
 * - parameter `supported_extensions`: Array parameter of type GObject.TypeClass is not supported
 * - parameter `supported_extensions`: Array parameter of type GObject.TypeClass is not supported
 * - parameter `supported_extensions`: Array parameter of type GObject.TypeClass is not supported
 * - callback `AuthDomainDigestAuthCallback`: Callback with String return value is not supported
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
    /**
     * A constant corresponding to 1 day.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_DAY: Int = 0

    /**
     * A constant corresponding to 1 hour.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_HOUR: Int = 3600

    /**
     * A constant corresponding to 1 week.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_WEEK: Int = 0

    /**
     * A constant corresponding to 1 year.
     *
     * For use with [ctor@Cookie.new] and [method@Cookie.set_max_age].
     */
    public const val COOKIE_MAX_AGE_ONE_YEAR: Int = 0

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
    public const val HSTS_POLICY_MAX_AGE_PAST: Int = 0

    /**
     * The set of #GUriFlags libsoup expects all #GUri to use.
     */
    public const val HTTP_URI_FLAGS: Int = 482

    /**
     * Like [func@get_major_version], but from the headers used at application
     * compile time, rather than from the library linked against at application run
     * time.
     */
    public const val MAJOR_VERSION: Int = 3

    /**
     * Like [func@get_micro_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: Int = 4

    /**
     * Like [func@get_minor_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: Int = 4

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
    public const val VERSION_MIN_REQUIRED: Int = 2

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
    public fun checkVersion(
        major: UInt,
        minor: UInt,
        micro: UInt,
    ): Boolean = soup_check_version(major, minor, micro).asBoolean()

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
    public fun cookieParse(
        `header`: KotlinString,
        origin: Uri? = null,
    ): Cookie? =
        soup_cookie_parse(`header`, origin?.glibUriPointer)?.run {
            Cookie(reinterpret())
        }

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
    public fun cookiesFromRequest(msg: Message): SList =
        soup_cookies_from_request(msg.soupMessagePointer.reinterpret())!!.run {
            SList(reinterpret())
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
    public fun cookiesFromResponse(msg: Message): SList =
        soup_cookies_from_response(msg.soupMessagePointer.reinterpret())!!.run {
            SList(reinterpret())
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
    public fun cookiesToRequest(
        cookies: SList,
        msg: Message,
    ): Unit = soup_cookies_to_request(cookies.glibSListPointer, msg.soupMessagePointer.reinterpret())

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
    public fun cookiesToResponse(
        cookies: SList,
        msg: Message,
    ): Unit = soup_cookies_to_response(cookies.glibSListPointer, msg.soupMessagePointer.reinterpret())

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
            DateTime(reinterpret())
        }

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
    public fun formDecode(encodedForm: KotlinString): HashTable =
        soup_form_decode(encodedForm)!!.run {
            HashTable(reinterpret())
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
    public fun getMajorVersion(): UInt = soup_get_major_version()

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
    public fun getMicroVersion(): UInt = soup_get_micro_version()

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
    public fun getMinorVersion(): UInt = soup_get_minor_version()

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
    public fun headerContains(
        `header`: KotlinString,
        token: KotlinString,
    ): Boolean = soup_header_contains(`header`, token).asBoolean()

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
    public fun headerGStringAppendParam(
        string: GlibString,
        name: KotlinString,
        `value`: KotlinString? = null,
    ): Unit = soup_header_g_string_append_param(string.glibStringPointer, name, `value`)

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
    public fun headerGStringAppendParamQuoted(
        string: GlibString,
        name: KotlinString,
        `value`: KotlinString,
    ): Unit = soup_header_g_string_append_param_quoted(string.glibStringPointer, name, `value`)

    /**
     * Parses a header whose content is described by RFC2616 as `#something`.
     *
     * "something" does not itself contain commas, except as part of quoted-strings.
     *
     * @param header a header value
     * @return a #GSList of
     *   list elements, as allocated strings
     */
    public fun headerParseList(`header`: KotlinString): SList =
        soup_header_parse_list(`header`)!!.run {
            SList(reinterpret())
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
    public fun headerParseParamList(`header`: KotlinString): HashTable =
        soup_header_parse_param_list(`header`)!!.run {
            HashTable(reinterpret())
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
     * @return
     *   a #GHashTable of list elements, which can be freed with
     *   [func@header_free_param_list] or null if there are duplicate
     *   elements.
     */
    public fun headerParseParamListStrict(`header`: KotlinString): HashTable? =
        soup_header_parse_param_list_strict(`header`)?.run {
            HashTable(reinterpret())
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
            HashTable(reinterpret())
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
     * @return
     *   a #GHashTable of list elements, which can be freed with
     *   [func@header_free_param_list] or null if there are duplicate
     *   elements.
     */
    public fun headerParseSemiParamListStrict(`header`: KotlinString): HashTable? =
        soup_header_parse_semi_param_list_strict(`header`)?.run {
            HashTable(reinterpret())
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
    public fun headersParse(
        str: KotlinString,
        len: Int,
        dest: MessageHeaders,
    ): Boolean = soup_headers_parse(str, len, dest.soupMessageHeadersPointer).asBoolean()

    /**
     * Initializes @iter for iterating @hdrs.
     *
     * @param iter a pointer to a %SoupMessageHeadersIter
     *   structure
     * @param hdrs a %SoupMessageHeaders
     */
    public fun messageHeadersIterInit(
        iter: MessageHeadersIter,
        hdrs: MessageHeaders,
    ): Unit = soup_message_headers_iter_init(iter.soupMessageHeadersIterPointer, hdrs.soupMessageHeadersPointer)

    /**
     * Registers error quark for SoupSession if needed.
     *
     * @return Error quark for SoupSession.
     */
    public fun sessionErrorQuark(): UInt = soup_session_error_quark()

    /**
     * Looks up the stock HTTP description of @status_code.
     *
     * *There is no reason for you to ever use this
     * function.* If you wanted the textual description for the
     * [property@Message:status-code] of a given [class@Message], you should just
     * look at the message's [property@Message:reason-phrase]. However, you
     * should only do that for use in debugging messages; HTTP reason
     * phrases are not localized, and are not generally very descriptive
     * anyway, and so they should never be presented to the user directly.
     * Instead, you should create you own error messages based on the
     * status code, and on what you were trying to do.
     *
     * @param statusCode an HTTP status code
     * @return the (terse, English) description of @status_code
     */
    public fun statusGetPhrase(statusCode: UInt): KotlinString =
        soup_status_get_phrase(statusCode)?.toKString() ?: error("Expected not null string")

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
     * Registers error quark for soup_tld_get_base_domain() if needed.
     *
     * @return Error quark for Soup TLD functions.
     */
    public fun tldErrorQuark(): UInt = soup_tld_error_quark()

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
    public fun tldGetBaseDomain(hostname: KotlinString): Result<KotlinString> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = soup_tld_get_base_domain(hostname, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(
                    org.gtkkn.bindings.soup.Soup
                        .resolveException(Error(gError.pointed!!.ptr))
                )
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
    public fun uriEqual(
        uri1: Uri,
        uri2: Uri,
    ): Boolean = soup_uri_equal(uri1.glibUriPointer, uri2.glibUriPointer).asBoolean()

    /**
     * Registers error quark for SoupWebsocket if needed.
     *
     * @return Error quark for SoupWebsocket.
     */
    public fun websocketErrorQuark(): UInt = soup_websocket_error_quark()

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                SessionError.quark() ->
                    SessionError
                        .fromErrorOrNull(error)
                        ?.let {
                            SessionErrorException(error, it)
                        }
                TLDError.quark() ->
                    TLDError
                        .fromErrorOrNull(error)
                        ?.let {
                            TLDErrorException(error, it)
                        }
                WebsocketError.quark() ->
                    WebsocketError
                        .fromErrorOrNull(error)
                        ?.let {
                            WebsocketErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val AuthDomainBasicAuthCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupAuthDomainBasic>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> Int
    >
> =
    staticCFunction {
            domain: CPointer<SoupAuthDomainBasic>?,
            msg: CPointer<SoupServerMessage>?,
            username: CPointer<ByteVar>?,
            password: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    domain: AuthDomainBasic,
                    msg: ServerMessage,
                    username: KotlinString,
                    password: KotlinString,
                ) -> Boolean
            >()
            .get()
            .invoke(
                domain!!.run {
                    AuthDomainBasic(reinterpret())
                },
                msg!!.run {
                    ServerMessage(reinterpret())
                },
                username?.toKString() ?: error("Expected not null string"),
                password?.toKString() ?: error("Expected not null string")
            ).asGBoolean()
    }.reinterpret()

public val AuthDomainFilterFunc:
    CPointer<CFunction<(CPointer<SoupAuthDomain>, CPointer<SoupServerMessage>) -> Int>> =
    staticCFunction {
            domain: CPointer<SoupAuthDomain>?,
            msg: CPointer<SoupServerMessage>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(domain: AuthDomain, msg: ServerMessage) -> Boolean>()
            .get()
            .invoke(
                domain!!.run {
                    AuthDomain(reinterpret())
                },
                msg!!.run {
                    ServerMessage(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

public val AuthDomainGenericAuthCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupAuthDomain>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
        ) -> Int
    >
> =
    staticCFunction {
            domain: CPointer<SoupAuthDomain>?,
            msg: CPointer<SoupServerMessage>?,
            username: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    domain: AuthDomain,
                    msg: ServerMessage,
                    username: KotlinString,
                ) -> Boolean
            >()
            .get()
            .invoke(
                domain!!.run {
                    AuthDomain(reinterpret())
                },
                msg!!.run {
                    ServerMessage(reinterpret())
                },
                username?.toKString() ?: error("Expected not null string")
            ).asGBoolean()
    }.reinterpret()

public val LoggerFilterFunc:
    CPointer<CFunction<(CPointer<SoupLogger>, CPointer<SoupMessage>) -> SoupLoggerLogLevel>> =
    staticCFunction {
            logger: CPointer<SoupLogger>?,
            msg: CPointer<SoupMessage>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(logger: Logger, msg: Message) -> LoggerLogLevel>()
            .get()
            .invoke(
                logger!!.run {
                    Logger(reinterpret())
                },
                msg!!.run {
                    Message(reinterpret())
                }
            ).nativeValue
    }.reinterpret()

public val LoggerPrinterFunc: CPointer<
    CFunction<
        (
            CPointer<SoupLogger>,
            SoupLoggerLogLevel,
            Byte,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            logger: CPointer<SoupLogger>?,
            level: SoupLoggerLogLevel,
            direction: Byte,
            `data`: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    logger: Logger,
                    level: LoggerLogLevel,
                    direction: Char,
                    `data`: KotlinString,
                ) -> Unit
            >()
            .get()
            .invoke(
                logger!!.run {
                    Logger(reinterpret())
                },
                level.run {
                    LoggerLogLevel.fromNativeValue(this)
                },
                direction.toInt().toChar(),
                `data`?.toKString() ?: error("Expected not null string")
            )
    }.reinterpret()

public val MessageHeadersForeachFuncFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            name: CPointer<ByteVar>?,
            `value`: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(name: KotlinString, `value`: KotlinString) -> Unit>().get().invoke(
            name?.toKString() ?: error("Expected not null string"),
            `value`?.toKString() ?: error("Expected not null string")
        )
    }.reinterpret()

public val ServerCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupServer>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
            CPointer<GHashTable>?,
        ) -> Unit
    >
> =
    staticCFunction {
            server: CPointer<SoupServer>?,
            msg: CPointer<SoupServerMessage>?,
            path: CPointer<ByteVar>?,
            query: CPointer<GHashTable>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    server: Server,
                    msg: ServerMessage,
                    path: KotlinString,
                    query: HashTable?,
                ) -> Unit
            >()
            .get()
            .invoke(
                server!!.run {
                    Server(reinterpret())
                },
                msg!!.run {
                    ServerMessage(reinterpret())
                },
                path?.toKString() ?: error("Expected not null string"),
                query?.run {
                    HashTable(reinterpret())
                }
            )
    }.reinterpret()

public val ServerWebsocketCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<SoupServer>,
            CPointer<SoupServerMessage>,
            CPointer<ByteVar>,
            CPointer<SoupWebsocketConnection>,
        ) -> Unit
    >
> =
    staticCFunction {
            server: CPointer<SoupServer>?,
            msg: CPointer<SoupServerMessage>?,
            path: CPointer<ByteVar>?,
            connection: CPointer<SoupWebsocketConnection>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    server: Server,
                    msg: ServerMessage,
                    path: KotlinString,
                    connection: WebsocketConnection,
                ) -> Unit
            >()
            .get()
            .invoke(
                server!!.run {
                    Server(reinterpret())
                },
                msg!!.run {
                    ServerMessage(reinterpret())
                },
                path?.toKString() ?: error("Expected not null string"),
                connection!!.run {
                    WebsocketConnection(reinterpret())
                }
            )
    }.reinterpret()

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
