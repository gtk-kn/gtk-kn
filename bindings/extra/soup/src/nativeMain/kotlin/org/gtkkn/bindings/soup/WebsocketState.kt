// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketState
import org.gtkkn.native.soup.soup_websocket_state_get_type

/**
 * The state of the WebSocket connection.
 */
public enum class WebsocketState(public val nativeValue: SoupWebsocketState) {
    /**
     * the connection is ready to send messages
     */
    OPEN(SoupWebsocketState.SOUP_WEBSOCKET_STATE_OPEN),

    /**
     * the connection is in the process of
     *   closing down; messages may be received, but not sent
     */
    CLOSING(SoupWebsocketState.SOUP_WEBSOCKET_STATE_CLOSING),

    /**
     * the connection is completely closed down
     */
    CLOSED(SoupWebsocketState.SOUP_WEBSOCKET_STATE_CLOSED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupWebsocketState): WebsocketState = when (nativeValue) {
            SoupWebsocketState.SOUP_WEBSOCKET_STATE_OPEN -> OPEN
            SoupWebsocketState.SOUP_WEBSOCKET_STATE_CLOSING -> CLOSING
            SoupWebsocketState.SOUP_WEBSOCKET_STATE_CLOSED -> CLOSED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of WebsocketState
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_state_get_type()
    }
}
