// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketConnectionType
import org.gtkkn.native.soup.soup_websocket_connection_type_get_type

/**
 * The type of a [class@WebsocketConnection].
 */
public enum class WebsocketConnectionType(public val nativeValue: SoupWebsocketConnectionType) {
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

        /**
         * Get the GType of WebsocketConnectionType
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_connection_type_get_type()
    }
}
