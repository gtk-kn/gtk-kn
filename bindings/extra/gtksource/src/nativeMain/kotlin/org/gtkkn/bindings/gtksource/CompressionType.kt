// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceCompressionType

public enum class CompressionType(
    public val nativeValue: GtkSourceCompressionType,
) {
    /**
     * plain text.
     */
    NONE(GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_NONE),

    /**
     * gzip compression.
     */
    GZIP(GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_GZIP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceCompressionType): CompressionType =
            when (nativeValue) {
                GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_NONE -> NONE
                GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_GZIP -> GZIP
                else -> error("invalid nativeValue")
            }
    }
}
