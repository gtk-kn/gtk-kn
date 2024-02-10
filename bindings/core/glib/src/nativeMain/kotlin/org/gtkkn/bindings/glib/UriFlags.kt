// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GUriFlags
import org.gtkkn.native.glib.G_URI_FLAGS_ENCODED
import org.gtkkn.native.glib.G_URI_FLAGS_ENCODED_FRAGMENT
import org.gtkkn.native.glib.G_URI_FLAGS_ENCODED_PATH
import org.gtkkn.native.glib.G_URI_FLAGS_ENCODED_QUERY
import org.gtkkn.native.glib.G_URI_FLAGS_HAS_AUTH_PARAMS
import org.gtkkn.native.glib.G_URI_FLAGS_HAS_PASSWORD
import org.gtkkn.native.glib.G_URI_FLAGS_NONE
import org.gtkkn.native.glib.G_URI_FLAGS_NON_DNS
import org.gtkkn.native.glib.G_URI_FLAGS_PARSE_RELAXED
import org.gtkkn.native.glib.G_URI_FLAGS_SCHEME_NORMALIZE

/**
 * Flags that describe a URI.
 *
 * When parsing a URI, if you need to choose different flags based on
 * the type of URI, you can use g_uri_peek_scheme() on the URI string
 * to check the scheme first, and use that to decide what flags to
 * parse it with.
 * @since 2.66
 */
public class UriFlags(
    public val mask: GUriFlags,
) : Bitfield<UriFlags> {
    override infix fun or(other: UriFlags): UriFlags = UriFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: UriFlags = UriFlags(G_URI_FLAGS_NONE)

        /**
         * Parse the URI more relaxedly than the
         *     [RFC 3986](https://tools.ietf.org/html/rfc3986) grammar specifies,
         *     fixing up or ignoring common mistakes in URIs coming from external
         *     sources. This is also needed for some obscure URI schemes where `;`
         *     separates the host from the path. Don’t use this flag unless you need to.
         */
        public val PARSE_RELAXED: UriFlags = UriFlags(G_URI_FLAGS_PARSE_RELAXED)

        /**
         * The userinfo field may contain a password,
         *     which will be separated from the username by `:`.
         */
        public val HAS_PASSWORD: UriFlags = UriFlags(G_URI_FLAGS_HAS_PASSWORD)

        /**
         * The userinfo may contain additional
         *     authentication-related parameters, which will be separated from
         *     the username and/or password by `;`.
         */
        public val HAS_AUTH_PARAMS: UriFlags = UriFlags(G_URI_FLAGS_HAS_AUTH_PARAMS)

        /**
         * When parsing a URI, this indicates that `%`-encoded
         *     characters in the userinfo, path, query, and fragment fields
         *     should not be decoded. (And likewise the host field if
         *     %G_URI_FLAGS_NON_DNS is also set.) When building a URI, it indicates
         *     that you have already `%`-encoded the components, and so #GUri
         *     should not do any encoding itself.
         */
        public val ENCODED: UriFlags = UriFlags(G_URI_FLAGS_ENCODED)

        /**
         * The host component should not be assumed to be a
         *     DNS hostname or IP address (for example, for `smb` URIs with NetBIOS
         *     hostnames).
         */
        public val NON_DNS: UriFlags = UriFlags(G_URI_FLAGS_NON_DNS)

        /**
         * Same as %G_URI_FLAGS_ENCODED, for the query
         *     field only.
         */
        public val ENCODED_QUERY: UriFlags = UriFlags(G_URI_FLAGS_ENCODED_QUERY)

        /**
         * Same as %G_URI_FLAGS_ENCODED, for the path only.
         */
        public val ENCODED_PATH: UriFlags = UriFlags(G_URI_FLAGS_ENCODED_PATH)

        /**
         * Same as %G_URI_FLAGS_ENCODED, for the
         *     fragment only.
         */
        public val ENCODED_FRAGMENT: UriFlags = UriFlags(G_URI_FLAGS_ENCODED_FRAGMENT)

        /**
         * A scheme-based normalization will be applied.
         *     For example, when parsing an HTTP URI changing omitted path to `/` and
         *     omitted port to `80`; and when building a URI, changing empty path to `/`
         *     and default port `80`). This only supports a subset of known schemes. (Since: 2.68)
         */
        public val SCHEME_NORMALIZE: UriFlags = UriFlags(G_URI_FLAGS_SCHEME_NORMALIZE)
    }
}
