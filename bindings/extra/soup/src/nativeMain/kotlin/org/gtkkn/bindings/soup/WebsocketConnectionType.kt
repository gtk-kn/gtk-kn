// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.soup.SoupWebsocketConnectionType

/**
 * The type of a [class@WebsocketConnection].
 */
public enum class WebsocketConnectionType(
    public val nativeValue: SoupWebsocketConnectionType,
) {
    /**
     * unknown/invalid connection
     */
    UNKNOWN(SoupWebsocketConnectionType.SOUP_WEBSOCKET_CONNECTION_UNKNOWN),

    /**
     * a client-side connection
     */
    CLIENT(SoupWebsocketConnectionType.SOUP_WEBSOCKET_CONNECTION_CLIENT),

    /**
     * a server-side connection
     */
    SERVER(SoupWebsocketConnectionType.SOUP_WEBSOCKET_CONNECTION_SERVER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupWebsocketConnectionType): WebsocketConnectionType =
            when (nativeValue) {
                SoupWebsocketConnectionType.SOUP_WEBSOCKET_CONNECTION_UNKNOWN -> UNKNOWN
                SoupWebsocketConnectionType.SOUP_WEBSOCKET_CONNECTION_CLIENT -> CLIENT
                SoupWebsocketConnectionType.SOUP_WEBSOCKET_CONNECTION_SERVER -> SERVER
                else -> error("invalid nativeValue")
            }
    }
}
