// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.native.gio.GZlibCompressorFormat

/**
 * Used to select the type of data format to use for #GZlibDecompressor
 * and #GZlibCompressor.
 * @since 2.24
 */
@GioVersion2_24
public enum class ZlibCompressorFormat(
    public val nativeValue: GZlibCompressorFormat,
) {
    /**
     * deflate compression with zlib header
     */
    ZLIB(GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_ZLIB),

    /**
     * gzip file format
     */
    GZIP(GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_GZIP),

    /**
     * deflate compression with no header
     */
    RAW(GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_RAW),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GZlibCompressorFormat): ZlibCompressorFormat =
            when (nativeValue) {
                GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_ZLIB -> ZLIB
                GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_GZIP -> GZIP
                GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_RAW -> RAW
                else -> error("invalid nativeValue")
            }
    }
}
