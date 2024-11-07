// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_38
import org.gtkkn.native.webkit.WebKitWebExtensionMode

/**
 * Enum values used for setting if a #WebKitWebView is intended for
 * WebExtensions.
 * @since 2.38
 */
@WebKitVersion2_38
public enum class WebExtensionMode(
    public val nativeValue: WebKitWebExtensionMode,
) {
    /**
     * Not for an extension.
     */
    NONE(WebKitWebExtensionMode.WEBKIT_WEB_EXTENSION_MODE_NONE),

    /**
     * For a ManifestV2 extension.
     */
    MANIFESTV2(WebKitWebExtensionMode.WEBKIT_WEB_EXTENSION_MODE_MANIFESTV2),

    /**
     * For a ManifestV3 extension.
     */
    MANIFESTV3(WebKitWebExtensionMode.WEBKIT_WEB_EXTENSION_MODE_MANIFESTV3),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitWebExtensionMode): WebExtensionMode =
            when (nativeValue) {
                WebKitWebExtensionMode.WEBKIT_WEB_EXTENSION_MODE_NONE -> NONE
                WebKitWebExtensionMode.WEBKIT_WEB_EXTENSION_MODE_MANIFESTV2 -> MANIFESTV2
                WebKitWebExtensionMode.WEBKIT_WEB_EXTENSION_MODE_MANIFESTV3 -> MANIFESTV3
                else -> error("invalid nativeValue")
            }
    }
}
