// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceCompressionType
import org.gtkkn.native.gtksource.gtk_source_compression_type_get_type

public enum class CompressionType(public val nativeValue: GtkSourceCompressionType) {
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
        public fun fromNativeValue(nativeValue: GtkSourceCompressionType): CompressionType = when (nativeValue) {
            GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_NONE -> NONE
            GtkSourceCompressionType.GTK_SOURCE_COMPRESSION_TYPE_GZIP -> GZIP
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CompressionType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_compression_type_get_type()
    }
}
