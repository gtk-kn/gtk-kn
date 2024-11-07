// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.native.webkit.WebKitNetworkProxyMode

/**
 * Enum values used to set the network proxy mode.
 * @since 2.16
 */
@WebKitVersion2_16
public enum class NetworkProxyMode(
    public val nativeValue: WebKitNetworkProxyMode,
) {
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
        public fun fromNativeValue(nativeValue: WebKitNetworkProxyMode): NetworkProxyMode =
            when (nativeValue) {
                WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_DEFAULT -> DEFAULT
                WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_NO_PROXY -> NO_PROXY
                WebKitNetworkProxyMode.WEBKIT_NETWORK_PROXY_MODE_CUSTOM -> CUSTOM
                else -> error("invalid nativeValue")
            }
    }
}
