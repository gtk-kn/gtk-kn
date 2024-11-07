// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_66
import org.gtkkn.native.glib.GUriError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by #GUri methods.
 * @since 2.66
 */
@GLibVersion2_66
public enum class UriError(
    public val nativeValue: GUriError,
) {
    /**
     * Generic error if no more specific error is available.
     *     See the error message for details.
     */
    FAILED(GUriError.G_URI_ERROR_FAILED),

    /**
     * The scheme of a URI could not be parsed.
     */
    BAD_SCHEME(GUriError.G_URI_ERROR_BAD_SCHEME),

    /**
     * The user/userinfo of a URI could not be parsed.
     */
    BAD_USER(GUriError.G_URI_ERROR_BAD_USER),

    /**
     * The password of a URI could not be parsed.
     */
    BAD_PASSWORD(GUriError.G_URI_ERROR_BAD_PASSWORD),

    /**
     * The authentication parameters of a URI could not be parsed.
     */
    BAD_AUTH_PARAMS(GUriError.G_URI_ERROR_BAD_AUTH_PARAMS),

    /**
     * The host of a URI could not be parsed.
     */
    BAD_HOST(GUriError.G_URI_ERROR_BAD_HOST),

    /**
     * The port of a URI could not be parsed.
     */
    BAD_PORT(GUriError.G_URI_ERROR_BAD_PORT),

    /**
     * The path of a URI could not be parsed.
     */
    BAD_PATH(GUriError.G_URI_ERROR_BAD_PATH),

    /**
     * The query of a URI could not be parsed.
     */
    BAD_QUERY(GUriError.G_URI_ERROR_BAD_QUERY),

    /**
     * The fragment of a URI could not be parsed.
     */
    BAD_FRAGMENT(GUriError.G_URI_ERROR_BAD_FRAGMENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUriError): UriError =
            when (nativeValue) {
                GUriError.G_URI_ERROR_FAILED -> FAILED
                GUriError.G_URI_ERROR_BAD_SCHEME -> BAD_SCHEME
                GUriError.G_URI_ERROR_BAD_USER -> BAD_USER
                GUriError.G_URI_ERROR_BAD_PASSWORD -> BAD_PASSWORD
                GUriError.G_URI_ERROR_BAD_AUTH_PARAMS -> BAD_AUTH_PARAMS
                GUriError.G_URI_ERROR_BAD_HOST -> BAD_HOST
                GUriError.G_URI_ERROR_BAD_PORT -> BAD_PORT
                GUriError.G_URI_ERROR_BAD_PATH -> BAD_PATH
                GUriError.G_URI_ERROR_BAD_QUERY -> BAD_QUERY
                GUriError.G_URI_ERROR_BAD_FRAGMENT -> BAD_FRAGMENT
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-uri-quark")

        public fun fromErrorOrNull(error: Error): UriError? =
            if (error.domain != quark()) {
                null
            } else {
                UriError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
