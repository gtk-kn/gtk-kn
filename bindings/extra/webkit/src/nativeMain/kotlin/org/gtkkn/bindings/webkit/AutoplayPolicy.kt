// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitAutoplayPolicy
import org.gtkkn.native.webkit.webkit_autoplay_policy_get_type

/**
 * Enum values used to specify autoplay policies.
 * @since 2.30
 */
@WebKitVersion2_30
public enum class AutoplayPolicy(public val nativeValue: WebKitAutoplayPolicy) {
    /**
     * Do not restrict autoplay.
     */
    ALLOW(WebKitAutoplayPolicy.WEBKIT_AUTOPLAY_ALLOW),

    /**
     * Allow videos to autoplay if
     *     they have no audio track, or if their audio track is muted.
     */
    ALLOW_WITHOUT_SOUND(WebKitAutoplayPolicy.WEBKIT_AUTOPLAY_ALLOW_WITHOUT_SOUND),

    /**
     * Never allow autoplay.
     */
    DENY(WebKitAutoplayPolicy.WEBKIT_AUTOPLAY_DENY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitAutoplayPolicy): AutoplayPolicy = when (nativeValue) {
            WebKitAutoplayPolicy.WEBKIT_AUTOPLAY_ALLOW -> ALLOW
            WebKitAutoplayPolicy.WEBKIT_AUTOPLAY_ALLOW_WITHOUT_SOUND -> ALLOW_WITHOUT_SOUND
            WebKitAutoplayPolicy.WEBKIT_AUTOPLAY_DENY -> DENY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of AutoplayPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_autoplay_policy_get_type()
    }
}
