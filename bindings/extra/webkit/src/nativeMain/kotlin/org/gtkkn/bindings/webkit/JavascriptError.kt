// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitJavascriptError
import org.gtkkn.native.webkit.webkit_javascript_error_get_type
import org.gtkkn.native.webkit.webkit_javascript_error_quark

/**
 * Enum values used to denote errors happening when executing JavaScript
 */
public enum class JavascriptError(public val nativeValue: WebKitJavascriptError) {
    /**
     * An exception was raised in JavaScript execution
     */
    SCRIPT_FAILED(WebKitJavascriptError.WEBKIT_JAVASCRIPT_ERROR_SCRIPT_FAILED),

    /**
     * An unsupported parameter has been used to call and async function from API. Since 2.40
     */
    INVALID_PARAMETER(WebKitJavascriptError.WEBKIT_JAVASCRIPT_ERROR_INVALID_PARAMETER),

    /**
     * The result of JavaScript execution could not be returned. Since 2.40
     */
    INVALID_RESULT(WebKitJavascriptError.WEBKIT_JAVASCRIPT_ERROR_INVALID_RESULT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitJavascriptError): JavascriptError = when (nativeValue) {
            WebKitJavascriptError.WEBKIT_JAVASCRIPT_ERROR_SCRIPT_FAILED -> SCRIPT_FAILED
            WebKitJavascriptError.WEBKIT_JAVASCRIPT_ERROR_INVALID_PARAMETER -> INVALID_PARAMETER
            WebKitJavascriptError.WEBKIT_JAVASCRIPT_ERROR_INVALID_RESULT -> INVALID_RESULT
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the quark for the domain of JavaScript errors.
         *
         * @return JavaScript error domain.
         */
        public fun quark(): Quark = webkit_javascript_error_quark()

        /**
         * Get the GType of JavascriptError
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_javascript_error_get_type()

        public fun fromErrorOrNull(error: Error): JavascriptError? = if (error.domain != quark()) {
            null
        } else {
            JavascriptError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
