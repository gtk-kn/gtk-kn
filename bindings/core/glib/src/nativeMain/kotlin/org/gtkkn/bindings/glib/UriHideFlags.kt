// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_66
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GUriHideFlags
import org.gtkkn.native.glib.G_URI_HIDE_AUTH_PARAMS
import org.gtkkn.native.glib.G_URI_HIDE_FRAGMENT
import org.gtkkn.native.glib.G_URI_HIDE_NONE
import org.gtkkn.native.glib.G_URI_HIDE_PASSWORD
import org.gtkkn.native.glib.G_URI_HIDE_QUERY
import org.gtkkn.native.glib.G_URI_HIDE_USERINFO

/**
 * Flags describing what parts of the URI to hide in
 * g_uri_to_string_partial(). Note that %G_URI_HIDE_PASSWORD and
 * %G_URI_HIDE_AUTH_PARAMS will only work if the #GUri was parsed with
 * the corresponding flags.
 * @since 2.66
 */
public class UriHideFlags(
    public val mask: GUriHideFlags,
) : Bitfield<UriHideFlags> {
    override infix fun or(other: UriHideFlags): UriHideFlags = UriHideFlags(mask or other.mask)

    @GLibVersion2_66
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: UriHideFlags = UriHideFlags(G_URI_HIDE_NONE)

        /**
         * Hide the userinfo.
         */
        public val USERINFO: UriHideFlags = UriHideFlags(G_URI_HIDE_USERINFO)

        /**
         * Hide the password.
         */
        public val PASSWORD: UriHideFlags = UriHideFlags(G_URI_HIDE_PASSWORD)

        /**
         * Hide the auth_params.
         */
        public val AUTH_PARAMS: UriHideFlags = UriHideFlags(G_URI_HIDE_AUTH_PARAMS)

        /**
         * Hide the query.
         */
        public val QUERY: UriHideFlags = UriHideFlags(G_URI_HIDE_QUERY)

        /**
         * Hide the fragment.
         */
        public val FRAGMENT: UriHideFlags = UriHideFlags(G_URI_HIDE_FRAGMENT)
    }
}
