// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.webkit.WebKitDownloadError
import org.gtkkn.native.webkit.webkit_download_error_quark

/**
 * Enum values used to denote the various download errors.
 */
public enum class DownloadError(
    public val nativeValue: WebKitDownloadError,
) {
    /**
     * Download failure due to network error
     */
    NETWORK(WebKitDownloadError.WEBKIT_DOWNLOAD_ERROR_NETWORK),

    /**
     * Download was cancelled by user
     */
    CANCELLED_BY_USER(WebKitDownloadError.WEBKIT_DOWNLOAD_ERROR_CANCELLED_BY_USER),

    /**
     * Download failure due to destination error
     */
    DESTINATION(WebKitDownloadError.WEBKIT_DOWNLOAD_ERROR_DESTINATION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitDownloadError): DownloadError =
            when (nativeValue) {
                WebKitDownloadError.WEBKIT_DOWNLOAD_ERROR_NETWORK -> NETWORK
                WebKitDownloadError.WEBKIT_DOWNLOAD_ERROR_CANCELLED_BY_USER -> CANCELLED_BY_USER
                WebKitDownloadError.WEBKIT_DOWNLOAD_ERROR_DESTINATION -> DESTINATION
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of download errors.
         *
         * @return download error domain.
         */
        public fun quark(): Quark = webkit_download_error_quark()

        public fun fromErrorOrNull(error: Error): DownloadError? =
            if (error.domain != quark()) {
                null
            } else {
                DownloadError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
