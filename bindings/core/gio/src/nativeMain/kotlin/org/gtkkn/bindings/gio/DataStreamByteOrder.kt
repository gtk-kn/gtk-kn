// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDataStreamByteOrder
import org.gtkkn.native.gio.GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN
import org.gtkkn.native.gio.GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN
import org.gtkkn.native.gio.GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN

/**
 * #GDataStreamByteOrder is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public enum class DataStreamByteOrder(
    public val nativeValue: GDataStreamByteOrder,
) {
    /**
     * Selects Big Endian byte order.
     */
    BIG_ENDIAN(G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN),

    /**
     * Selects Little Endian byte order.
     */
    LITTLE_ENDIAN(G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN),

    /**
     * Selects endianness based on host machine's architecture.
     */
    HOST_ENDIAN(G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDataStreamByteOrder): DataStreamByteOrder =
            when (nativeValue) {
                G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN -> BIG_ENDIAN
                G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN -> LITTLE_ENDIAN
                G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN -> HOST_ENDIAN
                else -> error("invalid nativeValue")
            }
    }
}
