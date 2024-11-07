// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.soup.SoupWebsocketDataType

/**
 * The type of data contained in a [signal@WebsocketConnection::message] signal.
 */
public enum class WebsocketDataType(
    public val nativeValue: SoupWebsocketDataType,
) {
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
        public fun fromNativeValue(nativeValue: SoupWebsocketDataType): WebsocketDataType =
            when (nativeValue) {
                SoupWebsocketDataType.SOUP_WEBSOCKET_DATA_TEXT -> TEXT
                SoupWebsocketDataType.SOUP_WEBSOCKET_DATA_BINARY -> BINARY
                else -> error("invalid nativeValue")
            }
    }
}
