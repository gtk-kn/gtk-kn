// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketError
import org.gtkkn.native.soup.soup_websocket_error_get_type
import org.gtkkn.native.soup.soup_websocket_error_quark

/**
 * WebSocket-related errors.
 */
public enum class WebsocketError(public val nativeValue: SoupWebsocketError) {
    /**
     * a generic error
     */
    FAILED(SoupWebsocketError.SOUP_WEBSOCKET_ERROR_FAILED),

    /**
     * attempted to handshake with a
     *   server that does not appear to understand WebSockets.
     */
    NOT_WEBSOCKET(SoupWebsocketError.SOUP_WEBSOCKET_ERROR_NOT_WEBSOCKET),

    /**
     * the WebSocket handshake failed
     *   because some detail was invalid (eg, incorrect accept key).
     */
    BAD_HANDSHAKE(SoupWebsocketError.SOUP_WEBSOCKET_ERROR_BAD_HANDSHAKE),

    /**
     * the WebSocket handshake failed
     *   because the "Origin" header was not an allowed value.
     */
    BAD_ORIGIN(SoupWebsocketError.SOUP_WEBSOCKET_ERROR_BAD_ORIGIN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupWebsocketError): WebsocketError = when (nativeValue) {
            SoupWebsocketError.SOUP_WEBSOCKET_ERROR_FAILED -> FAILED
            SoupWebsocketError.SOUP_WEBSOCKET_ERROR_NOT_WEBSOCKET -> NOT_WEBSOCKET
            SoupWebsocketError.SOUP_WEBSOCKET_ERROR_BAD_HANDSHAKE -> BAD_HANDSHAKE
            SoupWebsocketError.SOUP_WEBSOCKET_ERROR_BAD_ORIGIN -> BAD_ORIGIN
            else -> error("invalid nativeValue")
        }

        /**
         * Registers error quark for SoupWebsocket if needed.
         *
         * @return Error quark for SoupWebsocket.
         */
        public fun quark(): Quark = soup_websocket_error_quark()

        /**
         * Get the GType of WebsocketError
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_error_get_type()

        public fun fromErrorOrNull(error: Error): WebsocketError? = if (error.domain != quark()) {
            null
        } else {
            WebsocketError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
