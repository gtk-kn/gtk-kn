// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketCloseCode
import org.gtkkn.native.soup.soup_websocket_close_code_get_type

/**
 * Pre-defined close codes that can be passed to
 * [method@WebsocketConnection.close] or received from
 * [method@WebsocketConnection.get_close_code].
 *
 * However, other codes are also allowed.
 */
public enum class WebsocketCloseCode(public val nativeValue: SoupWebsocketCloseCode) {
    /**
     * a normal, non-error close
     */
    NORMAL(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_NORMAL),

    /**
     * the client/server is going away
     */
    GOING_AWAY(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_GOING_AWAY),

    /**
     * a protocol error occurred
     */
    PROTOCOL_ERROR(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_PROTOCOL_ERROR),

    /**
     * the endpoint received data
     *   of a type that it does not support.
     */
    UNSUPPORTED_DATA(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_UNSUPPORTED_DATA),

    /**
     * reserved value indicating that
     *   no close code was present; must not be sent.
     */
    NO_STATUS(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_NO_STATUS),

    /**
     * reserved value indicating that
     *   the connection was closed abnormally; must not be sent.
     */
    ABNORMAL(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_ABNORMAL),

    /**
     * the endpoint received data that
     *   was invalid (eg, non-UTF-8 data in a text message).
     */
    BAD_DATA(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_BAD_DATA),

    /**
     * generic error code
     *   indicating some sort of policy violation.
     */
    POLICY_VIOLATION(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_POLICY_VIOLATION),

    /**
     * the endpoint received a message
     *   that is too big to process.
     */
    TOO_BIG(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_TOO_BIG),

    /**
     * the client is closing the
     *   connection because the server failed to negotiate a required
     *   extension.
     */
    NO_EXTENSION(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_NO_EXTENSION),

    /**
     * the server is closing the
     *   connection because it was unable to fulfill the request.
     */
    SERVER_ERROR(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_SERVER_ERROR),

    /**
     * reserved value indicating that
     *   the TLS handshake failed; must not be sent.
     */
    TLS_HANDSHAKE(SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_TLS_HANDSHAKE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupWebsocketCloseCode): WebsocketCloseCode = when (nativeValue) {
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_NORMAL -> NORMAL
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_GOING_AWAY -> GOING_AWAY
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_PROTOCOL_ERROR -> PROTOCOL_ERROR
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_UNSUPPORTED_DATA -> UNSUPPORTED_DATA
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_NO_STATUS -> NO_STATUS
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_ABNORMAL -> ABNORMAL
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_BAD_DATA -> BAD_DATA
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_POLICY_VIOLATION -> POLICY_VIOLATION
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_TOO_BIG -> TOO_BIG
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_NO_EXTENSION -> NO_EXTENSION
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_SERVER_ERROR -> SERVER_ERROR
            SoupWebsocketCloseCode.SOUP_WEBSOCKET_CLOSE_TLS_HANDSHAKE -> TLS_HANDSHAKE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of WebsocketCloseCode
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_close_code_get_type()
    }
}
