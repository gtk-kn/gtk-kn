// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitSaveMode

/**
 * Enum values to specify the different ways in which a #WebKitWebView
 * can save its current web page into a self-contained file.
 */
public enum class SaveMode(
    public val nativeValue: WebKitSaveMode,
) {
    /**
     * Save the current page using the MHTML format.
     */
    MHTML(WebKitSaveMode.WEBKIT_SAVE_MODE_MHTML),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitSaveMode): SaveMode =
            when (nativeValue) {
                WebKitSaveMode.WEBKIT_SAVE_MODE_MHTML -> MHTML
                else -> error("invalid nativeValue")
            }
    }
}
