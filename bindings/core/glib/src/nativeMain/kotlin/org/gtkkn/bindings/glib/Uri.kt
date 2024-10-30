// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Glib.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GUri
import org.gtkkn.native.glib.g_uri_build
import org.gtkkn.native.glib.g_uri_build_with_user
import org.gtkkn.native.glib.g_uri_error_quark
import org.gtkkn.native.glib.g_uri_escape_string
import org.gtkkn.native.glib.g_uri_get_auth_params
import org.gtkkn.native.glib.g_uri_get_flags
import org.gtkkn.native.glib.g_uri_get_fragment
import org.gtkkn.native.glib.g_uri_get_host
import org.gtkkn.native.glib.g_uri_get_password
import org.gtkkn.native.glib.g_uri_get_path
import org.gtkkn.native.glib.g_uri_get_port
import org.gtkkn.native.glib.g_uri_get_query
import org.gtkkn.native.glib.g_uri_get_scheme
import org.gtkkn.native.glib.g_uri_get_user
import org.gtkkn.native.glib.g_uri_get_userinfo
import org.gtkkn.native.glib.g_uri_is_valid
import org.gtkkn.native.glib.g_uri_join
import org.gtkkn.native.glib.g_uri_join_with_user
import org.gtkkn.native.glib.g_uri_list_extract_uris
import org.gtkkn.native.glib.g_uri_parse
import org.gtkkn.native.glib.g_uri_parse_params
import org.gtkkn.native.glib.g_uri_parse_relative
import org.gtkkn.native.glib.g_uri_parse_scheme
import org.gtkkn.native.glib.g_uri_peek_scheme
import org.gtkkn.native.glib.g_uri_resolve_relative
import org.gtkkn.native.glib.g_uri_to_string_partial
import org.gtkkn.native.glib.g_uri_unescape_bytes
import org.gtkkn.native.glib.g_uri_unescape_segment
import org.gtkkn.native.glib.g_uri_unescape_string
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.collections.List

/**
 * The `GUri` type and related functions can be used to parse URIs into
 * their components, and build valid URIs from individual components.
 *
 * Since `GUri` only represents absolute URIs, all `GUri`s will have a
 * URI scheme, so [method@GLib.Uri.get_scheme] will always return a non-`NULL`
 * answer. Likewise, by definition, all URIs have a path component, so
 * [method@GLib.Uri.get_path] will always return a non-`NULL` string (which may
 * be empty).
 *
 * If the URI string has an
 * [‘authority’ component](https://tools.ietf.org/html/rfc3986#section-3) (that
 * is, if the scheme is followed by `://` rather than just `:`), then the
 * `GUri` will contain a hostname, and possibly a port and ‘userinfo’.
 * Additionally, depending on how the `GUri` was constructed/parsed (for example,
 * using the `G_URI_FLAGS_HAS_PASSWORD` and `G_URI_FLAGS_HAS_AUTH_PARAMS` flags),
 * the userinfo may be split out into a username, password, and
 * additional authorization-related parameters.
 *
 * Normally, the components of a `GUri` will have all `%`-encoded
 * characters decoded. However, if you construct/parse a `GUri` with
 * `G_URI_FLAGS_ENCODED`, then the `%`-encoding will be preserved instead in
 * the userinfo, path, and query fields (and in the host field if also
 * created with `G_URI_FLAGS_NON_DNS`). In particular, this is necessary if
 * the URI may contain binary data or non-UTF-8 text, or if decoding
 * the components might change the interpretation of the URI.
 *
 * For example, with the encoded flag:
 *
 * ```c
 * g_autoptr(GUri) uri = g_uri_parse ("http://host/path?query=http%3A%2F%2Fhost%2Fpath%3Fparam%3Dvalue", G_URI_FLAGS_ENCODED, &err);
 * g_assert_cmpstr (g_uri_get_query (uri), ==, "query=http%3A%2F%2Fhost%2Fpath%3Fparam%3Dvalue");
 * ```
 *
 * While the default `%`-decoding behaviour would give:
 *
 * ```c
 * g_autoptr(GUri) uri = g_uri_parse ("http://host/path?query=http%3A%2F%2Fhost%2Fpath%3Fparam%3Dvalue", G_URI_FLAGS_NONE, &err);
 * g_assert_cmpstr (g_uri_get_query (uri), ==, "query=http://host/path?param=value");
 * ```
 *
 * During decoding, if an invalid UTF-8 string is encountered, parsing will fail
 * with an error indicating the bad string location:
 *
 * ```c
 * g_autoptr(GUri) uri = g_uri_parse ("http://host/path?query=http%3A%2F%2Fhost%2Fpath%3Fbad%3D%00alue", G_URI_FLAGS_NONE, &err);
 * g_assert_error (err, G_URI_ERROR, G_URI_ERROR_BAD_QUERY);
 * ```
 *
 * You should pass `G_URI_FLAGS_ENCODED` or `G_URI_FLAGS_ENCODED_QUERY` if you
 * need to handle that case manually. In particular, if the query string
 * contains `=` characters that are `%`-encoded, you should let
 * [func@GLib.Uri.parse_params] do the decoding once of the query.
 *
 * `GUri` is immutable once constructed, and can safely be accessed from
 * multiple threads. Its reference counting is atomic.
 *
 * Note that the scope of `GUri` is to help manipulate URIs in various applications,
 * following [RFC 3986](https://tools.ietf.org/html/rfc3986). In particular,
 * it doesn't intend to cover web browser needs, and doesn’t implement the
 * [WHATWG URL](https://url.spec.whatwg.org/) standard. No APIs are provided to
 * help prevent
 * [homograph attacks](https://en.wikipedia.org/wiki/IDN_homograph_attack), so
 * `GUri` is not suitable for formatting URIs for display to the user for making
 * security-sensitive decisions.
 *
 * ## Relative and absolute URIs
 *
 * As defined in [RFC 3986](https://tools.ietf.org/html/rfc3986#section-4), the
 * hierarchical nature of URIs means that they can either be ‘relative
 * references’ (sometimes referred to as ‘relative URIs’) or ‘URIs’ (for
 * clarity, ‘URIs’ are referred to in this documentation as
 * ‘absolute URIs’ — although
 * [in constrast to RFC 3986](https://tools.ietf.org/html/rfc3986#section-4.3),
 * fragment identifiers are always allowed).
 *
 * Relative references have one or more components of the URI missing. In
 * particular, they have no scheme. Any other component, such as hostname,
 * query, etc. may be missing, apart from a path, which has to be specified (but
 * may be empty). The path may be relative, starting with `./` rather than `/`.
 *
 * For example, a valid relative reference is `./path?query`,
 * `/?query#fragment` or `//example.com`.
 *
 * Absolute URIs have a scheme specified. Any other components of the URI which
 * are missing are specified as explicitly unset in the URI, rather than being
 * resolved relative to a base URI using [method@GLib.Uri.parse_relative].
 *
 * For example, a valid absolute URI is `file:///home/bob` or
 * `https://search.com?query=string`.
 *
 * A `GUri` instance is always an absolute URI. A string may be an absolute URI
 * or a relative reference; see the documentation for individual functions as to
 * what forms they accept.
 *
 * ## Parsing URIs
 *
 * The most minimalist APIs for parsing URIs are [func@GLib.Uri.split] and
 * [func@GLib.Uri.split_with_user]. These split a URI into its component
 * parts, and return the parts; the difference between the two is that
 * [func@GLib.Uri.split] treats the ‘userinfo’ component of the URI as a
 * single element, while [func@GLib.Uri.split_with_user] can (depending on the
 * [flags@GLib.UriFlags] you pass) treat it as containing a username, password,
 * and authentication parameters. Alternatively, [func@GLib.Uri.split_network]
 * can be used when you are only interested in the components that are
 * needed to initiate a network connection to the service (scheme,
 * host, and port).
 *
 * [func@GLib.Uri.parse] is similar to [func@GLib.Uri.split], but instead of
 * returning individual strings, it returns a `GUri` structure (and it requires
 * that the URI be an absolute URI).
 *
 * [func@GLib.Uri.resolve_relative] and [method@GLib.Uri.parse_relative] allow
 * you to resolve a relative URI relative to a base URI.
 * [func@GLib.Uri.resolve_relative] takes two strings and returns a string,
 * and [method@GLib.Uri.parse_relative] takes a `GUri` and a string and returns a
 * `GUri`.
 *
 * All of the parsing functions take a [flags@GLib.UriFlags] argument describing
 * exactly how to parse the URI; see the documentation for that type
 * for more details on the specific flags that you can pass. If you
 * need to choose different flags based on the type of URI, you can
 * use [func@GLib.Uri.peek_scheme] on the URI string to check the scheme
 * first, and use that to decide what flags to parse it with.
 *
 * For example, you might want to use `G_URI_PARAMS_WWW_FORM` when parsing the
 * params for a web URI, so compare the result of [func@GLib.Uri.peek_scheme]
 * against `http` and `https`.
 *
 * ## Building URIs
 *
 * [func@GLib.Uri.join] and [func@GLib.Uri.join_with_user] can be used to construct
 * valid URI strings from a set of component strings. They are the
 * inverse of [func@GLib.Uri.split] and [func@GLib.Uri.split_with_user].
 *
 * Similarly, [func@GLib.Uri.build] and [func@GLib.Uri.build_with_user] can be
 * used to construct a `GUri` from a set of component strings.
 *
 * As with the parsing functions, the building functions take a
 * [flags@GLib.UriFlags] argument. In particular, it is important to keep in mind
 * whether the URI components you are using are already `%`-encoded. If so,
 * you must pass the `G_URI_FLAGS_ENCODED` flag.
 *
 * ## `file://` URIs
 *
 * Note that Windows and Unix both define special rules for parsing
 * `file://` URIs (involving non-UTF-8 character sets on Unix, and the
 * interpretation of path separators on Windows). `GUri` does not
 * implement these rules. Use [func@GLib.filename_from_uri] and
 * [func@GLib.filename_to_uri] if you want to properly convert between
 * `file://` URIs and local filenames.
 *
 * ## URI Equality
 *
 * Note that there is no `g_uri_equal ()` function, because comparing
 * URIs usefully requires scheme-specific knowledge that `GUri` does
 * not have. `GUri` can help with normalization if you use the various
 * encoded [flags@GLib.UriFlags] as well as `G_URI_FLAGS_SCHEME_NORMALIZE`
 * however it is not comprehensive.
 * For example, `data:,foo` and `data:;base64,Zm9v` resolve to the same
 * thing according to the `data:` URI specification which GLib does not
 * handle.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function g_uri_to_string is ignored
 * - parameter `unescaped`: guint8
 * - parameter `scheme`: scheme: Out parameter is not supported
 * - parameter `scheme`: scheme: Out parameter is not supported
 * - parameter `scheme`: scheme: Out parameter is not supported
 *
 * @since 2.66
 */
public class Uri(
    pointer: CPointer<GUri>,
) : Record {
    public val glibUriPointer: CPointer<GUri> = pointer

    /**
     * Gets @uri's authentication parameters, which may contain
     * `%`-encoding, depending on the flags with which @uri was created.
     * (If @uri was not created with %G_URI_FLAGS_HAS_AUTH_PARAMS then this will
     * be null.)
     *
     * Depending on the URI scheme, g_uri_parse_params() may be useful for
     * further parsing this information.
     *
     * @return @uri's authentication parameters.
     * @since 2.66
     */
    public fun getAuthParams(): String? = g_uri_get_auth_params(glibUriPointer.reinterpret())?.toKString()

    /**
     * Gets @uri's flags set upon construction.
     *
     * @return @uri's flags.
     * @since 2.66
     */
    public fun getFlags(): UriFlags =
        g_uri_get_flags(glibUriPointer.reinterpret()).run {
            UriFlags(this)
        }

    /**
     * Gets @uri's fragment, which may contain `%`-encoding, depending on
     * the flags with which @uri was created.
     *
     * @return @uri's fragment.
     * @since 2.66
     */
    public fun getFragment(): String? = g_uri_get_fragment(glibUriPointer.reinterpret())?.toKString()

    /**
     * Gets @uri's host. This will never have `%`-encoded characters,
     * unless it is non-UTF-8 (which can only be the case if @uri was
     * created with %G_URI_FLAGS_NON_DNS).
     *
     * If @uri contained an IPv6 address literal, this value will be just
     * that address, without the brackets around it that are necessary in
     * the string form of the URI. Note that in this case there may also
     * be a scope ID attached to the address. Eg, `fe80::1234%``em1` (or
     * `fe80::1234%``25em1` if the string is still encoded).
     *
     * @return @uri's host.
     * @since 2.66
     */
    public fun getHost(): String? = g_uri_get_host(glibUriPointer.reinterpret())?.toKString()

    /**
     * Gets @uri's password, which may contain `%`-encoding, depending on
     * the flags with which @uri was created. (If @uri was not created
     * with %G_URI_FLAGS_HAS_PASSWORD then this will be null.)
     *
     * @return @uri's password.
     * @since 2.66
     */
    public fun getPassword(): String? = g_uri_get_password(glibUriPointer.reinterpret())?.toKString()

    /**
     * Gets @uri's path, which may contain `%`-encoding, depending on the
     * flags with which @uri was created.
     *
     * @return @uri's path.
     * @since 2.66
     */
    public fun getPath(): String =
        g_uri_get_path(glibUriPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets @uri's port.
     *
     * @return @uri's port, or `-1` if no port was specified.
     * @since 2.66
     */
    public fun getPort(): Int = g_uri_get_port(glibUriPointer.reinterpret())

    /**
     * Gets @uri's query, which may contain `%`-encoding, depending on the
     * flags with which @uri was created.
     *
     * For queries consisting of a series of `name=value` parameters,
     * #GUriParamsIter or g_uri_parse_params() may be useful.
     *
     * @return @uri's query.
     * @since 2.66
     */
    public fun getQuery(): String? = g_uri_get_query(glibUriPointer.reinterpret())?.toKString()

    /**
     * Gets @uri's scheme. Note that this will always be all-lowercase,
     * regardless of the string or strings that @uri was created from.
     *
     * @return @uri's scheme.
     * @since 2.66
     */
    public fun getScheme(): String =
        g_uri_get_scheme(glibUriPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the ‘username’ component of @uri's userinfo, which may contain
     * `%`-encoding, depending on the flags with which @uri was created.
     * If @uri was not created with %G_URI_FLAGS_HAS_PASSWORD or
     * %G_URI_FLAGS_HAS_AUTH_PARAMS, this is the same as g_uri_get_userinfo().
     *
     * @return @uri's user.
     * @since 2.66
     */
    public fun getUser(): String? = g_uri_get_user(glibUriPointer.reinterpret())?.toKString()

    /**
     * Gets @uri's userinfo, which may contain `%`-encoding, depending on
     * the flags with which @uri was created.
     *
     * @return @uri's userinfo.
     * @since 2.66
     */
    public fun getUserinfo(): String? = g_uri_get_userinfo(glibUriPointer.reinterpret())?.toKString()

    /**
     * Parses @uri_ref according to @flags and, if it is a
     * [relative URI](#relative-and-absolute-uris), resolves it relative to @base_uri.
     * If the result is not a valid absolute URI, it will be discarded, and an error
     * returned.
     *
     * @param uriRef a string representing a relative or absolute URI
     * @param flags flags describing how to parse @uri_ref
     * @return a new #GUri, or NULL on error.
     * @since 2.66
     */
    public fun parseRelative(
        uriRef: String,
        flags: UriFlags,
    ): Result<Uri> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_uri_parse_relative(glibUriPointer.reinterpret(), uriRef, flags.mask, gError.ptr)?.run {
                    Uri(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Returns a string representing @uri, subject to the options in
     * @flags. See g_uri_to_string() and #GUriHideFlags for more details.
     *
     * @param flags flags describing what parts of @uri to hide
     * @return a string representing
     *     @uri, which the caller must free.
     * @since 2.66
     */
    public fun toStringPartial(flags: UriHideFlags): String =
        g_uri_to_string_partial(glibUriPointer.reinterpret(), flags.mask)?.toKString()
            ?: error("Expected not null string")

    public companion object : RecordCompanion<Uri, GUri> {
        /**
         * Creates a new #GUri from the given components according to @flags.
         *
         * See also g_uri_build_with_user(), which allows specifying the
         * components of the "userinfo" separately.
         *
         * @param flags flags describing how to build the #GUri
         * @param scheme the URI scheme
         * @param userinfo the userinfo component, or null
         * @param host the host component, or null
         * @param port the port, or `-1`
         * @param path the path component
         * @param query the query component, or null
         * @param fragment the fragment, or null
         * @return a new #GUri
         * @since 2.66
         */
        public fun build(
            flags: UriFlags,
            scheme: String,
            userinfo: String? = null,
            host: String? = null,
            port: Int,
            path: String,
            query: String? = null,
            fragment: String? = null,
        ): Uri =
            g_uri_build(flags.mask, scheme, userinfo, host, port, path, query, fragment)!!.run {
                Uri(reinterpret())
            }

        /**
         * Creates a new #GUri from the given components according to @flags
         * (%G_URI_FLAGS_HAS_PASSWORD is added unconditionally). The @flags must be
         * coherent with the passed values, in particular use `%`-encoded values with
         * %G_URI_FLAGS_ENCODED.
         *
         * In contrast to g_uri_build(), this allows specifying the components
         * of the ‘userinfo’ field separately. Note that @user must be non-null
         * if either @password or @auth_params is non-null.
         *
         * @param flags flags describing how to build the #GUri
         * @param scheme the URI scheme
         * @param user the user component of the userinfo, or null
         * @param password the password component of the userinfo, or null
         * @param authParams the auth params of the userinfo, or null
         * @param host the host component, or null
         * @param port the port, or `-1`
         * @param path the path component
         * @param query the query component, or null
         * @param fragment the fragment, or null
         * @return a new #GUri
         * @since 2.66
         */
        public fun buildWithUser(
            flags: UriFlags,
            scheme: String,
            user: String? = null,
            password: String? = null,
            authParams: String? = null,
            host: String? = null,
            port: Int,
            path: String,
            query: String? = null,
            fragment: String? = null,
        ): Uri =
            g_uri_build_with_user(
                flags.mask,
                scheme,
                user,
                password,
                authParams,
                host,
                port,
                path,
                query,
                fragment
            )!!.run {
                Uri(reinterpret())
            }

        public fun errorQuark(): UInt = g_uri_error_quark()

        /**
         * Escapes a string for use in a URI.
         *
         * Normally all characters that are not "unreserved" (i.e. ASCII
         * alphanumerical characters plus dash, dot, underscore and tilde) are
         * escaped. But if you specify characters in @reserved_chars_allowed
         * they are not escaped. This is useful for the "reserved" characters
         * in the URI specification, since those are allowed unescaped in some
         * portions of a URI.
         *
         * @param unescaped the unescaped input string.
         * @param reservedCharsAllowed a string of reserved
         *   characters that are allowed to be used, or null.
         * @param allowUtf8 true if the result can include UTF-8 characters.
         * @return an escaped version of @unescaped. The
         * returned string should be freed when no longer needed.
         * @since 2.16
         */
        public fun escapeString(
            unescaped: String,
            reservedCharsAllowed: String? = null,
            allowUtf8: Boolean,
        ): String =
            g_uri_escape_string(unescaped, reservedCharsAllowed, allowUtf8.asGBoolean())?.toKString()
                ?: error("Expected not null string")

        /**
         * Parses @uri_string according to @flags, to determine whether it is a valid
         * [absolute URI](#relative-and-absolute-uris), i.e. it does not need to be resolved
         * relative to another URI using g_uri_parse_relative().
         *
         * If it’s not a valid URI, an error is returned explaining how it’s invalid.
         *
         * See g_uri_split(), and the definition of #GUriFlags, for more
         * information on the effect of @flags.
         *
         * @param uriString a string containing an absolute URI
         * @param flags flags for parsing @uri_string
         * @return true if @uri_string is a valid absolute URI, false on error.
         * @since 2.66
         */
        public fun isValid(
            uriString: String,
            flags: UriFlags,
        ): Result<Boolean> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_uri_is_valid(uriString, flags.mask, gError.ptr).asBoolean()
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(gResult)
                }
            }

        /**
         * Joins the given components together according to @flags to create
         * an absolute URI string. @path may not be null (though it may be the empty
         * string).
         *
         * When @host is present, @path must either be empty or begin with a slash (`/`)
         * character. When @host is not present, @path cannot begin with two slash
         * characters (`//`). See
         * [RFC 3986, section 3](https://tools.ietf.org/html/rfc3986#section-3).
         *
         * See also g_uri_join_with_user(), which allows specifying the
         * components of the ‘userinfo’ separately.
         *
         * %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
         * in @flags.
         *
         * @param flags flags describing how to build the URI string
         * @param scheme the URI scheme, or null
         * @param userinfo the userinfo component, or null
         * @param host the host component, or null
         * @param port the port, or `-1`
         * @param path the path component
         * @param query the query component, or null
         * @param fragment the fragment, or null
         * @return an absolute URI string
         * @since 2.66
         */
        public fun join(
            flags: UriFlags,
            scheme: String? = null,
            userinfo: String? = null,
            host: String? = null,
            port: Int,
            path: String,
            query: String? = null,
            fragment: String? = null,
        ): String =
            g_uri_join(flags.mask, scheme, userinfo, host, port, path, query, fragment)?.toKString()
                ?: error("Expected not null string")

        /**
         * Joins the given components together according to @flags to create
         * an absolute URI string. @path may not be null (though it may be the empty
         * string).
         *
         * In contrast to g_uri_join(), this allows specifying the components
         * of the ‘userinfo’ separately. It otherwise behaves the same.
         *
         * %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
         * in @flags.
         *
         * @param flags flags describing how to build the URI string
         * @param scheme the URI scheme, or null
         * @param user the user component of the userinfo, or null
         * @param password the password component of the userinfo, or
         *   null
         * @param authParams the auth params of the userinfo, or
         *   null
         * @param host the host component, or null
         * @param port the port, or `-1`
         * @param path the path component
         * @param query the query component, or null
         * @param fragment the fragment, or null
         * @return an absolute URI string
         * @since 2.66
         */
        public fun joinWithUser(
            flags: UriFlags,
            scheme: String? = null,
            user: String? = null,
            password: String? = null,
            authParams: String? = null,
            host: String? = null,
            port: Int,
            path: String,
            query: String? = null,
            fragment: String? = null,
        ): String =
            g_uri_join_with_user(
                flags.mask,
                scheme,
                user,
                password,
                authParams,
                host,
                port,
                path,
                query,
                fragment
            )?.toKString()
                ?: error("Expected not null string")

        /**
         * Splits an URI list conforming to the text/uri-list
         * mime type defined in RFC 2483 into individual URIs,
         * discarding any comments. The URIs are not validated.
         *
         * @param uriList an URI list
         * @return a newly allocated null-terminated list
         *   of strings holding the individual URIs. The array should be freed
         *   with g_strfreev().
         * @since 2.6
         */
        public fun listExtractUris(uriList: String): List<String> =
            g_uri_list_extract_uris(uriList)?.toKStringList() ?: error("Expected not null string array")

        /**
         * Parses @uri_string according to @flags. If the result is not a
         * valid [absolute URI](#relative-and-absolute-uris), it will be discarded, and an
         * error returned.
         *
         * @param uriString a string representing an absolute URI
         * @param flags flags describing how to parse @uri_string
         * @return a new #GUri, or NULL on error.
         * @since 2.66
         */
        public fun parse(
            uriString: String,
            flags: UriFlags,
        ): Result<Uri> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_uri_parse(uriString, flags.mask, gError.ptr)?.run {
                        Uri(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Many URI schemes include one or more attribute/value pairs as part of the URI
         * value. This method can be used to parse them into a hash table. When an
         * attribute has multiple occurrences, the last value is the final returned
         * value. If you need to handle repeated attributes differently, use
         * #GUriParamsIter.
         *
         * The @params string is assumed to still be `%`-encoded, but the returned
         * values will be fully decoded. (Thus it is possible that the returned values
         * may contain `=` or @separators, if the value was encoded in the input.)
         * Invalid `%`-encoding is treated as with the %G_URI_FLAGS_PARSE_RELAXED
         * rules for g_uri_parse(). (However, if @params is the path or query string
         * from a #GUri that was parsed without %G_URI_FLAGS_PARSE_RELAXED and
         * %G_URI_FLAGS_ENCODED, then you already know that it does not contain any
         * invalid encoding.)
         *
         * %G_URI_PARAMS_WWW_FORM is handled as documented for g_uri_params_iter_init().
         *
         * If %G_URI_PARAMS_CASE_INSENSITIVE is passed to @flags, attributes will be
         * compared case-insensitively, so a params string `attr=123&Attr=456` will only
         * return a single attribute–value pair, `Attr=456`. Case will be preserved in
         * the returned attributes.
         *
         * If @params cannot be parsed (for example, it contains two @separators
         * characters in a row), then @error is set and null is returned.
         *
         * @param params a `%`-encoded string containing `attribute=value`
         *   parameters
         * @param length the length of @params, or `-1` if it is nul-terminated
         * @param separators the separator byte character set between parameters. (usually
         *   `&`, but sometimes `;` or both `&;`). Note that this function works on
         *   bytes not characters, so it can't be used to delimit UTF-8 strings for
         *   anything but ASCII characters. You may pass an empty set, in which case
         *   no splitting will occur.
         * @param flags flags to modify the way the parameters are handled.
         * @return
         *     A hash table of attribute/value pairs, with both names and values
         *     fully-decoded; or null on error.
         * @since 2.66
         */
        public fun parseParams(
            params: String,
            length: Long,
            separators: String,
            flags: UriParamsFlags,
        ): Result<HashTable> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_uri_parse_params(params, length, separators, flags.mask, gError.ptr)?.run {
                        HashTable(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Gets the scheme portion of a URI string.
         * [RFC 3986](https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
         * as:
         * |[
         * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
         * ]|
         * Common schemes include `file`, `https`, `svn+ssh`, etc.
         *
         * @param uri a valid URI.
         * @return The ‘scheme’ component of the URI, or
         *     null on error. The returned string should be freed when no longer needed.
         * @since 2.16
         */
        public fun parseScheme(uri: String): String? = g_uri_parse_scheme(uri)?.toKString()

        /**
         * Gets the scheme portion of a URI string.
         * [RFC 3986](https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
         * as:
         * |[
         * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
         * ]|
         * Common schemes include `file`, `https`, `svn+ssh`, etc.
         *
         * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
         * all-lowercase and does not need to be freed.
         *
         * @param uri a valid URI.
         * @return The ‘scheme’ component of the URI, or
         *     null on error. The returned string is normalized to all-lowercase, and
         *     interned via g_intern_string(), so it does not need to be freed.
         * @since 2.66
         */
        public fun peekScheme(uri: String): String? = g_uri_peek_scheme(uri)?.toKString()

        /**
         * Parses @uri_ref according to @flags and, if it is a
         * [relative URI](#relative-and-absolute-uris), resolves it relative to
         * @base_uri_string. If the result is not a valid absolute URI, it will be
         * discarded, and an error returned.
         *
         * (If @base_uri_string is null, this just returns @uri_ref, or
         * null if @uri_ref is invalid or not absolute.)
         *
         * @param baseUriString a string representing a base URI
         * @param uriRef a string representing a relative or absolute URI
         * @param flags flags describing how to parse @uri_ref
         * @return the resolved URI string,
         * or NULL on error.
         * @since 2.66
         */
        public fun resolveRelative(
            baseUriString: String? = null,
            uriRef: String,
            flags: UriFlags,
        ): Result<String> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_uri_resolve_relative(baseUriString, uriRef, flags.mask, gError.ptr)?.toKString()
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Unescapes a segment of an escaped string as binary data.
         *
         * Note that in contrast to g_uri_unescape_string(), this does allow
         * nul bytes to appear in the output.
         *
         * If any of the characters in @illegal_characters appears as an escaped
         * character in @escaped_string, then that is an error and null will be
         * returned. This is useful if you want to avoid for instance having a slash
         * being expanded in an escaped path element, which might confuse pathname
         * handling.
         *
         * @param escapedString A URI-escaped string
         * @param length the length (in bytes) of @escaped_string to escape, or `-1` if it
         *   is nul-terminated.
         * @param illegalCharacters a string of illegal characters
         *   not to be allowed, or null.
         * @return an unescaped version of @escaped_string
         *     or null on error (if decoding failed, using %G_URI_ERROR_FAILED error
         *     code). The returned #GBytes should be unreffed when no longer needed.
         * @since 2.66
         */
        public fun unescapeBytes(
            escapedString: String,
            length: Long,
            illegalCharacters: String? = null,
        ): Result<Bytes> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_uri_unescape_bytes(escapedString, length, illegalCharacters, gError.ptr)?.run {
                        Bytes(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Unescapes a segment of an escaped string.
         *
         * If any of the characters in @illegal_characters or the NUL
         * character appears as an escaped character in @escaped_string, then
         * that is an error and null will be returned. This is useful if you
         * want to avoid for instance having a slash being expanded in an
         * escaped path element, which might confuse pathname handling.
         *
         * Note: `NUL` byte is not accepted in the output, in contrast to
         * g_uri_unescape_bytes().
         *
         * @param escapedString A string, may be null
         * @param escapedStringEnd Pointer to end of @escaped_string,
         *   may be null
         * @param illegalCharacters An optional string of illegal
         *   characters not to be allowed, may be null
         * @return an unescaped version of @escaped_string,
         * or null on error. The returned string should be freed when no longer
         * needed.  As a special case if null is given for @escaped_string, this
         * function will return null.
         * @since 2.16
         */
        public fun unescapeSegment(
            escapedString: String? = null,
            escapedStringEnd: String? = null,
            illegalCharacters: String? = null,
        ): String? = g_uri_unescape_segment(escapedString, escapedStringEnd, illegalCharacters)?.toKString()

        /**
         * Unescapes a whole escaped string.
         *
         * If any of the characters in @illegal_characters or the NUL
         * character appears as an escaped character in @escaped_string, then
         * that is an error and null will be returned. This is useful if you
         * want to avoid for instance having a slash being expanded in an
         * escaped path element, which might confuse pathname handling.
         *
         * @param escapedString an escaped string to be unescaped.
         * @param illegalCharacters a string of illegal characters
         *   not to be allowed, or null.
         * @return an unescaped version of @escaped_string.
         * The returned string should be freed when no longer needed.
         * @since 2.16
         */
        public fun unescapeString(
            escapedString: String,
            illegalCharacters: String? = null,
        ): String? = g_uri_unescape_string(escapedString, illegalCharacters)?.toKString()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Uri = Uri(pointer.reinterpret())
    }
}
