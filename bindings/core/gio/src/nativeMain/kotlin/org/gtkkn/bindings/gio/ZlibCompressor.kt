// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GConverter
import org.gtkkn.native.gio.GZlibCompressor
import org.gtkkn.native.gio.g_zlib_compressor_get_file_info
import org.gtkkn.native.gio.g_zlib_compressor_get_type
import org.gtkkn.native.gio.g_zlib_compressor_new
import org.gtkkn.native.gio.g_zlib_compressor_set_file_info
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType

/**
 * `GZlibCompressor` is an implementation of [iface@Gio.Converter] that
 * compresses data using zlib.
 *
 * ## Skipped during bindings generation
 *
 * - method `format`: Property has no getter nor setter
 * - method `level`: Property has no getter nor setter
 */
public open class ZlibCompressor(public val gioZlibCompressorPointer: CPointer<GZlibCompressor>) :
    Object(gioZlibCompressorPointer.reinterpret()),
    Converter,
    KGTyped {
    init {
        Gio
    }

    override val gioConverterPointer: CPointer<GConverter>
        get() = handle.reinterpret()

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
        get() = g_zlib_compressor_get_file_info(gioZlibCompressorPointer)?.run {
            InstanceCache.get(this, true) { FileInfo(reinterpret()) }!!
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
        set(fileInfo) = g_zlib_compressor_set_file_info(gioZlibCompressorPointer, fileInfo?.gioFileInfoPointer)

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
        level: gint,
    ) : this(g_zlib_compressor_new(format.nativeValue, level)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ZlibCompressor> {
        override val type: GeneratedClassKGType<ZlibCompressor> =
            GeneratedClassKGType(getTypeOrNull()!!) { ZlibCompressor(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ZlibCompressor
         *
         * @return the GType
         */
        public fun getType(): GType = g_zlib_compressor_get_type()

        /**
         * Gets the GType of from the symbol `g_zlib_compressor_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_zlib_compressor_get_type")
    }
}
