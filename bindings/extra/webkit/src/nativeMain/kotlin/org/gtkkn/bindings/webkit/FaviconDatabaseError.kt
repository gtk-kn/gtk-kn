// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.webkit.WebKitFaviconDatabaseError
import org.gtkkn.native.webkit.webkit_favicon_database_error_quark

/**
 * Enum values used to denote the various errors related to the #WebKitFaviconDatabase.
 */
public enum class FaviconDatabaseError(
    public val nativeValue: WebKitFaviconDatabaseError,
) {
    /**
     * The #WebKitFaviconDatabase is closed
     */
    NOT_INITIALIZED(WebKitFaviconDatabaseError.WEBKIT_FAVICON_DATABASE_ERROR_NOT_INITIALIZED),

    /**
     * There is not an icon available for the requested URL
     */
    FAVICON_NOT_FOUND(WebKitFaviconDatabaseError.WEBKIT_FAVICON_DATABASE_ERROR_FAVICON_NOT_FOUND),

    /**
     * There might be an icon for the requested URL, but its data is unknown at the moment
     */
    FAVICON_UNKNOWN(WebKitFaviconDatabaseError.WEBKIT_FAVICON_DATABASE_ERROR_FAVICON_UNKNOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitFaviconDatabaseError): FaviconDatabaseError =
            when (nativeValue) {
                WebKitFaviconDatabaseError.WEBKIT_FAVICON_DATABASE_ERROR_NOT_INITIALIZED -> NOT_INITIALIZED
                WebKitFaviconDatabaseError.WEBKIT_FAVICON_DATABASE_ERROR_FAVICON_NOT_FOUND -> FAVICON_NOT_FOUND
                WebKitFaviconDatabaseError.WEBKIT_FAVICON_DATABASE_ERROR_FAVICON_UNKNOWN -> FAVICON_UNKNOWN
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of favicon database errors.
         *
         * @return favicon database error domain.
         */
        public fun quark(): Quark = webkit_favicon_database_error_quark()

        public fun fromErrorOrNull(error: Error): FaviconDatabaseError? =
            if (error.domain != quark()) {
                null
            } else {
                FaviconDatabaseError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
