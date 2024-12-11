// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitCookieAcceptPolicy
import org.gtkkn.native.webkit.webkit_cookie_accept_policy_get_type

/**
 * Enum values used to denote the cookie acceptance policies.
 */
public enum class CookieAcceptPolicy(public val nativeValue: WebKitCookieAcceptPolicy) {
    /**
     * Accept all cookies unconditionally.
     */
    ALWAYS(WebKitCookieAcceptPolicy.WEBKIT_COOKIE_POLICY_ACCEPT_ALWAYS),

    /**
     * Reject all cookies unconditionally.
     */
    NEVER(WebKitCookieAcceptPolicy.WEBKIT_COOKIE_POLICY_ACCEPT_NEVER),

    /**
     * Accept only cookies set by the main document loaded.
     */
    NO_THIRD_PARTY(WebKitCookieAcceptPolicy.WEBKIT_COOKIE_POLICY_ACCEPT_NO_THIRD_PARTY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitCookieAcceptPolicy): CookieAcceptPolicy = when (nativeValue) {
            WebKitCookieAcceptPolicy.WEBKIT_COOKIE_POLICY_ACCEPT_ALWAYS -> ALWAYS
            WebKitCookieAcceptPolicy.WEBKIT_COOKIE_POLICY_ACCEPT_NEVER -> NEVER
            WebKitCookieAcceptPolicy.WEBKIT_COOKIE_POLICY_ACCEPT_NO_THIRD_PARTY -> NO_THIRD_PARTY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CookieAcceptPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_cookie_accept_policy_get_type()
    }
}
