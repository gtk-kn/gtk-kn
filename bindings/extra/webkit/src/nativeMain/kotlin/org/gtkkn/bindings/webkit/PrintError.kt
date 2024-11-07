// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.webkit.WebKitPrintError
import org.gtkkn.native.webkit.webkit_print_error_quark
import kotlin.UInt

/**
 * Enum values used to denote the various print errors.
 */
public enum class PrintError(
    public val nativeValue: WebKitPrintError,
) {
    /**
     * Unspecified error during a print operation
     */
    GENERAL(WebKitPrintError.WEBKIT_PRINT_ERROR_GENERAL),

    /**
     * Selected printer cannot be found
     */
    PRINTER_NOT_FOUND(WebKitPrintError.WEBKIT_PRINT_ERROR_PRINTER_NOT_FOUND),

    /**
     * Invalid page range
     */
    INVALID_PAGE_RANGE(WebKitPrintError.WEBKIT_PRINT_ERROR_INVALID_PAGE_RANGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitPrintError): PrintError =
            when (nativeValue) {
                WebKitPrintError.WEBKIT_PRINT_ERROR_GENERAL -> GENERAL
                WebKitPrintError.WEBKIT_PRINT_ERROR_PRINTER_NOT_FOUND -> PRINTER_NOT_FOUND
                WebKitPrintError.WEBKIT_PRINT_ERROR_INVALID_PAGE_RANGE -> INVALID_PAGE_RANGE
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of printing errors.
         *
         * @return print error domain.
         */
        public fun quark(): UInt = webkit_print_error_quark()

        public fun fromErrorOrNull(error: Error): PrintError? =
            if (error.domain != quark()) {
                null
            } else {
                PrintError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
