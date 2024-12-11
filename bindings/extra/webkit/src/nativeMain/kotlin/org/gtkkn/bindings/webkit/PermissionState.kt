// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPermissionState
import org.gtkkn.native.webkit.webkit_permission_state_get_type

/**
 * Enum values representing query permission results.
 * @since 2.40
 */
@WebKitVersion2_40
public enum class PermissionState(public val nativeValue: WebKitPermissionState) {
    /**
     * Access to the feature is granted.
     */
    GRANTED(WebKitPermissionState.WEBKIT_PERMISSION_STATE_GRANTED),

    /**
     * Access to the feature is denied.
     */
    DENIED(WebKitPermissionState.WEBKIT_PERMISSION_STATE_DENIED),

    /**
     * Access to the feature has to be requested via user prompt.
     */
    PROMPT(WebKitPermissionState.WEBKIT_PERMISSION_STATE_PROMPT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitPermissionState): PermissionState = when (nativeValue) {
            WebKitPermissionState.WEBKIT_PERMISSION_STATE_GRANTED -> GRANTED
            WebKitPermissionState.WEBKIT_PERMISSION_STATE_DENIED -> DENIED
            WebKitPermissionState.WEBKIT_PERMISSION_STATE_PROMPT -> PROMPT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PermissionState
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_permission_state_get_type()
    }
}
