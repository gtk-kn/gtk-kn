// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitTLSErrorsPolicy

/**
 * Enum values used to denote the TLS errors policy.
 */
public enum class TLSErrorsPolicy(
    public val nativeValue: WebKitTLSErrorsPolicy,
) {
    /**
     * Ignore TLS errors.
     */
    IGNORE(WebKitTLSErrorsPolicy.WEBKIT_TLS_ERRORS_POLICY_IGNORE),

    /**
     * TLS errors will emit
     *   #WebKitWebView::load-failed-with-tls-errors and, if the signal is handled,
     *   finish the load. In case the signal is not handled,
     *   #WebKitWebView::load-failed is emitted before the load finishes.
     */
    FAIL(WebKitTLSErrorsPolicy.WEBKIT_TLS_ERRORS_POLICY_FAIL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitTLSErrorsPolicy): TLSErrorsPolicy =
            when (nativeValue) {
                WebKitTLSErrorsPolicy.WEBKIT_TLS_ERRORS_POLICY_IGNORE -> IGNORE
                WebKitTLSErrorsPolicy.WEBKIT_TLS_ERRORS_POLICY_FAIL -> FAIL
                else -> error("invalid nativeValue")
            }
    }
}
