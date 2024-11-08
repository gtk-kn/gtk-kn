// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.webkit.WebKitNetworkError
import org.gtkkn.native.webkit.webkit_network_error_quark
import kotlin.UInt

/**
 * Enum values used to denote the various network errors.
 */
public enum class NetworkError(
    public val nativeValue: WebKitNetworkError,
) {
    /**
     * Generic load failure
     */
    FAILED(WebKitNetworkError.WEBKIT_NETWORK_ERROR_FAILED),

    /**
     * Load failure due to transport error
     */
    TRANSPORT(WebKitNetworkError.WEBKIT_NETWORK_ERROR_TRANSPORT),

    /**
     * Load failure due to unknown protocol
     */
    UNKNOWN_PROTOCOL(WebKitNetworkError.WEBKIT_NETWORK_ERROR_UNKNOWN_PROTOCOL),

    /**
     * Load failure due to cancellation
     */
    CANCELLED(WebKitNetworkError.WEBKIT_NETWORK_ERROR_CANCELLED),

    /**
     * Load failure due to missing file
     */
    FILE_DOES_NOT_EXIST(WebKitNetworkError.WEBKIT_NETWORK_ERROR_FILE_DOES_NOT_EXIST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitNetworkError): NetworkError =
            when (nativeValue) {
                WebKitNetworkError.WEBKIT_NETWORK_ERROR_FAILED -> FAILED
                WebKitNetworkError.WEBKIT_NETWORK_ERROR_TRANSPORT -> TRANSPORT
                WebKitNetworkError.WEBKIT_NETWORK_ERROR_UNKNOWN_PROTOCOL -> UNKNOWN_PROTOCOL
                WebKitNetworkError.WEBKIT_NETWORK_ERROR_CANCELLED -> CANCELLED
                WebKitNetworkError.WEBKIT_NETWORK_ERROR_FILE_DOES_NOT_EXIST -> FILE_DOES_NOT_EXIST
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of networking errors.
         *
         * @return network error domain.
         */
        public fun quark(): UInt = webkit_network_error_quark()

        public fun fromErrorOrNull(error: Error): NetworkError? =
            if (error.domain != quark()) {
                null
            } else {
                NetworkError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}