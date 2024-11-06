// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GConverter
import org.gtkkn.native.gio.GZlibCompressor
import org.gtkkn.native.gio.g_zlib_compressor_get_file_info
import org.gtkkn.native.gio.g_zlib_compressor_get_type
import org.gtkkn.native.gio.g_zlib_compressor_new
import org.gtkkn.native.gio.g_zlib_compressor_set_file_info
import kotlin.Int
import kotlin.Unit

/**
 * `GZlibCompressor` is an implementation of [iface@Gio.Converter] that
 * compresses data using zlib.
 *
 * ## Skipped during bindings generation
 *
 * - method `format`: Property has no getter nor setter
 * - method `level`: Property has no getter nor setter
 */
public open class ZlibCompressor(
    pointer: CPointer<GZlibCompressor>,
) : Object(pointer.reinterpret()),
    Converter,
    KGTyped {
    public val gioZlibCompressorPointer: CPointer<GZlibCompressor>
        get() = gPointer.reinterpret()

    override val gioConverterPointer: CPointer<GConverter>
        get() = gPointer.reinterpret()

    /**
     * If set to a non-null #GFileInfo object, and #GZlibCompressor:format is
     * %G_ZLIB_COMPRESSOR_FORMAT_GZIP, the compressor will write the file name
     * and modification time from the file info to the GZIP header.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open var fileInfo: FileInfo?
        /**
         * Returns the #GZlibCompressor:file-info property.
         *
         * @return a #GFileInfo, or null
         * @since 2.26
         */
        get() =
            g_zlib_compressor_get_file_info(gioZlibCompressorPointer.reinterpret())?.run {
                FileInfo(reinterpret())
            }

        /**
         * Sets @file_info in @compressor. If non-null, and @compressor's
         * #GZlibCompressor:format property is %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
         * it will be used to set the file name and modification time in
         * the GZIP header of the compressed data.
         *
         * Note: it is an error to call this function while a compression is in
         * progress; it may only be called immediately after creation of @compressor,
         * or after resetting it with g_converter_reset().
         *
         * @param fileInfo a #GFileInfo
         * @since 2.26
         */
        @GioVersion2_26
        set(
            fileInfo
        ) =
            g_zlib_compressor_set_file_info(
                gioZlibCompressorPointer.reinterpret(),
                fileInfo?.gioFileInfoPointer?.reinterpret()
            )

    /**
     * Creates a new #GZlibCompressor.
     *
     * @param format The format to use for the compressed data
     * @param level compression level (0-9), -1 for default
     * @return a new #GZlibCompressor
     * @since 2.24
     */
    public constructor(
        format: ZlibCompressorFormat,
        level: Int,
    ) : this(g_zlib_compressor_new(format.nativeValue, level)!!.reinterpret())

    /**
     * Returns the #GZlibCompressor:file-info property.
     *
     * @return a #GFileInfo, or null
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getFileInfo(): FileInfo? =
        g_zlib_compressor_get_file_info(gioZlibCompressorPointer.reinterpret())?.run {
            FileInfo(reinterpret())
        }

    /**
     * Sets @file_info in @compressor. If non-null, and @compressor's
     * #GZlibCompressor:format property is %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
     * it will be used to set the file name and modification time in
     * the GZIP header of the compressed data.
     *
     * Note: it is an error to call this function while a compression is in
     * progress; it may only be called immediately after creation of @compressor,
     * or after resetting it with g_converter_reset().
     *
     * @param fileInfo a #GFileInfo
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setFileInfo(fileInfo: FileInfo? = null): Unit =
        g_zlib_compressor_set_file_info(
            gioZlibCompressorPointer.reinterpret(),
            fileInfo?.gioFileInfoPointer?.reinterpret()
        )

    public companion object : TypeCompanion<ZlibCompressor> {
        override val type: GeneratedClassKGType<ZlibCompressor> =
            GeneratedClassKGType(g_zlib_compressor_get_type()) { ZlibCompressor(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
