// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitNetworkProxyMode
import org.gtkkn.native.webkit.webkit_network_proxy_mode_get_type

/**
 * Enum values used to set the network proxy mode.
 * @since 2.16
 */
@WebKitVersion2_16
public enum class NetworkProxyMode(public val nativeValue: WebKitNetworkProxyMode) {
    /**
     * Use the default proxy of the system.
     */
    DEFAULT(WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_DEFAULT),

    /**
     * Do not use any proxy.
     */
    NO_PROXY(WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_NO_PROXY),

    /**
     * Use custom proxy settings.
     */
    CUSTOM(WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_CUSTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitNetworkProxyMode): NetworkProxyMode = when (nativeValue) {
            WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_DEFAULT -> DEFAULT
            WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_NO_PROXY -> NO_PROXY
            WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_CUSTOM -> CUSTOM
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NetworkProxyMode
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_network_proxy_mode_get_type()
    }
}
