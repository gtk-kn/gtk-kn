// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitSaveMode
import org.gtkkn.native.webkit.webkit_save_mode_get_type

/**
 * Enum values to specify the different ways in which a #WebKitWebView
 * can save its current web page into a self-contained file.
 */
public enum class SaveMode(public val nativeValue: WebKitSaveMode) {
    /**
     * Save the current page using the MHTML format.
     */
    MHTML(WebKitSaveMode.WEBKIT_SAVE_MODE_MHTML),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitSaveMode): SaveMode = when (nativeValue) {
            WebKitSaveMode.WEBKIT_SAVE_MODE_MHTML -> MHTML
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SaveMode
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_save_mode_get_type()
    }
}
