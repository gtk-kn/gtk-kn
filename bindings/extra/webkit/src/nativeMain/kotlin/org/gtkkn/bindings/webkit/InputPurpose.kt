// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitInputPurpose
import org.gtkkn.native.webkit.webkit_input_purpose_get_type

/**
 * Enum values used to describe the primary purpose of the active editable element.
 * @since 2.28
 */
@WebKitVersion2_28
public enum class InputPurpose(public val nativeValue: WebKitInputPurpose) {
    /**
     * Editable element expects any characters
     */
    FREE_FORM(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_FREE_FORM),

    /**
     * Editable element expects digits
     */
    DIGITS(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_DIGITS),

    /**
     * Editable element expects a number
     */
    NUMBER(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_NUMBER),

    /**
     * Editable element expects a telephone
     */
    PHONE(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_PHONE),

    /**
     * Editable element expects a URL
     */
    URL(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_URL),

    /**
     * Editable element expects an email
     */
    EMAIL(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_EMAIL),

    /**
     * Editable element expects a password
     */
    PASSWORD(WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_PASSWORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitInputPurpose): InputPurpose = when (nativeValue) {
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_FREE_FORM -> FREE_FORM
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_DIGITS -> DIGITS
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_NUMBER -> NUMBER
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_PHONE -> PHONE
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_URL -> URL
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_EMAIL -> EMAIL
            WebKitInputPurpose.WEBKIT_INPUT_PURPOSE_PASSWORD -> PASSWORD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of InputPurpose
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_input_purpose_get_type()
    }
}
