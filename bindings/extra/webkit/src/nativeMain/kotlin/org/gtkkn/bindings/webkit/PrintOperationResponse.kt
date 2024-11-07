// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitPrintOperationResponse

/**
 * Enum values representing the response of the print dialog shown with
 * webkit_print_operation_run_dialog().
 */
public enum class PrintOperationResponse(
    public val nativeValue: WebKitPrintOperationResponse,
) {
    /**
     * Print button was clicked in print dialog
     */
    PRINT(WebKitPrintOperationResponse.WEBKIT_PRINT_OPERATION_RESPONSE_PRINT),

    /**
     * Print dialog was cancelled
     */
    CANCEL(WebKitPrintOperationResponse.WEBKIT_PRINT_OPERATION_RESPONSE_CANCEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitPrintOperationResponse): PrintOperationResponse =
            when (nativeValue) {
                WebKitPrintOperationResponse.WEBKIT_PRINT_OPERATION_RESPONSE_PRINT -> PRINT
                WebKitPrintOperationResponse.WEBKIT_PRINT_OPERATION_RESPONSE_CANCEL -> CANCEL
                else -> error("invalid nativeValue")
            }
    }
}
