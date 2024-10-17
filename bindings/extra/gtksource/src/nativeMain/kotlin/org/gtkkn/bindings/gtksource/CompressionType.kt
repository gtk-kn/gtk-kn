// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceCompressionType
import org.gtkkn.native.gtksource.GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_GZIP
import org.gtkkn.native.gtksource.GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_NONE

public enum class CompressionType(
    public val nativeValue: GtkSourceCompressionType,
) {
    /**
     * plain text.
     */
    NONE(GTK_SOURCE_COMPRESSION_TYPE_NONE),

    /**
     * gzip compression.
     */
    GZIP(GTK_SOURCE_COMPRESSION_TYPE_GZIP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceCompressionType): CompressionType =
            when (nativeValue) {
                GTK_SOURCE_COMPRESSION_TYPE_NONE -> NONE
                GTK_SOURCE_COMPRESSION_TYPE_GZIP -> GZIP
                else -> error("invalid nativeValue")
            }
    }
}
