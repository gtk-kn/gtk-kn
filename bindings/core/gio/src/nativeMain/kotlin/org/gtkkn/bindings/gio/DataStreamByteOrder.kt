// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDataStreamByteOrder
import org.gtkkn.native.gio.g_data_stream_byte_order_get_type
import org.gtkkn.native.gobject.GType

/**
 * #GDataStreamByteOrder is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public enum class DataStreamByteOrder(public val nativeValue: GDataStreamByteOrder) {
    /**
     * Selects Big Endian byte order.
     */
    BIG_ENDIAN(GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN),

    /**
     * Selects Little Endian byte order.
     */
    LITTLE_ENDIAN(GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN),

    /**
     * Selects endianness based on host machine's architecture.
     */
    HOST_ENDIAN(GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDataStreamByteOrder): DataStreamByteOrder = when (nativeValue) {
            GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN -> BIG_ENDIAN
            GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN -> LITTLE_ENDIAN
            GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN -> HOST_ENDIAN
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DataStreamByteOrder
         *
         * @return the GType
         */
        public fun getType(): GType = g_data_stream_byte_order_get_type()
    }
}
