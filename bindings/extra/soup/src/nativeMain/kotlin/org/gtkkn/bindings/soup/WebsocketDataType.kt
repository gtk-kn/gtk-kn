// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketDataType
import org.gtkkn.native.soup.soup_websocket_data_type_get_type

/**
 * The type of data contained in a [signal@WebsocketConnection::message] signal.
 */
public enum class WebsocketDataType(public val nativeValue: SoupWebsocketDataType) {
    /**
     * UTF-8 text
     */
    TEXT(SoupWebsocketDataType.SOUP_WEBSOCKET_DATA_TEXT),

    /**
     * binary data
     */
    BINARY(SoupWebsocketDataType.SOUP_WEBSOCKET_DATA_BINARY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupWebsocketDataType): WebsocketDataType = when (nativeValue) {
            SoupWebsocketDataType.SOUP_WEBSOCKET_DATA_TEXT -> TEXT
            SoupWebsocketDataType.SOUP_WEBSOCKET_DATA_BINARY -> BINARY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of WebsocketDataType
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_data_type_get_type()
    }
}
