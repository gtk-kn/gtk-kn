// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GZlibCompressorFormat
import org.gtkkn.native.gio.GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_GZIP
import org.gtkkn.native.gio.GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_RAW
import org.gtkkn.native.gio.GZlibCompressorFormat.G_ZLIB_COMPRESSOR_FORMAT_ZLIB

/**
 * Used to select the type of data format to use for #GZlibDecompressor
 * and #GZlibCompressor.
 * @since 2.24
 */
public enum class ZlibCompressorFormat(
    public val nativeValue: GZlibCompressorFormat,
) {
    /**
     * deflate compression with zlib header
     */
    ZLIB(G_ZLIB_COMPRESSOR_FORMAT_ZLIB),

    /**
     * gzip file format
     */
    GZIP(G_ZLIB_COMPRESSOR_FORMAT_GZIP),

    /**
     * deflate compression with no header
     */
    RAW(G_ZLIB_COMPRESSOR_FORMAT_RAW),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GZlibCompressorFormat): ZlibCompressorFormat =
            when (nativeValue) {
                G_ZLIB_COMPRESSOR_FORMAT_ZLIB -> ZLIB
                G_ZLIB_COMPRESSOR_FORMAT_GZIP -> GZIP
                G_ZLIB_COMPRESSOR_FORMAT_RAW -> RAW
                else -> error("invalid nativeValue")
            }
    }
}
