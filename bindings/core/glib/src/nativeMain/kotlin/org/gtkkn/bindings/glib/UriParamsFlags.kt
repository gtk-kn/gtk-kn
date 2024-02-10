// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GUriParamsFlags
import org.gtkkn.native.glib.G_URI_PARAMS_CASE_INSENSITIVE
import org.gtkkn.native.glib.G_URI_PARAMS_NONE
import org.gtkkn.native.glib.G_URI_PARAMS_PARSE_RELAXED
import org.gtkkn.native.glib.G_URI_PARAMS_WWW_FORM

/**
 * Flags modifying the way parameters are handled by g_uri_parse_params() and
 * #GUriParamsIter.
 * @since 2.66
 */
public class UriParamsFlags(
    public val mask: GUriParamsFlags,
) : Bitfield<UriParamsFlags> {
    override infix fun or(other: UriParamsFlags): UriParamsFlags = UriParamsFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: UriParamsFlags = UriParamsFlags(G_URI_PARAMS_NONE)

        /**
         * Parameter names are case insensitive.
         */
        public val CASE_INSENSITIVE: UriParamsFlags = UriParamsFlags(G_URI_PARAMS_CASE_INSENSITIVE)

        /**
         * Replace `+` with space character. Only useful for
         *     URLs on the web, using the `https` or `http` schemas.
         */
        public val WWW_FORM: UriParamsFlags = UriParamsFlags(G_URI_PARAMS_WWW_FORM)

        /**
         * See %G_URI_FLAGS_PARSE_RELAXED.
         */
        public val PARSE_RELAXED: UriParamsFlags = UriParamsFlags(G_URI_PARAMS_PARSE_RELAXED)
    }
}
