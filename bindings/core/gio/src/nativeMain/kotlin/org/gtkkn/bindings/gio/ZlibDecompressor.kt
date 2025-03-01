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
import org.gtkkn.native.gio.GZlibDecompressor
import org.gtkkn.native.gio.g_zlib_decompressor_get_file_info
import org.gtkkn.native.gio.g_zlib_decompressor_get_type
import org.gtkkn.native.gio.g_zlib_decompressor_new
import org.gtkkn.native.gobject.GType

/**
 * `GZlibDecompressor` is an implementation of [iface@Gio.Converter] that
 * decompresses data compressed with zlib.
 *
 * ## Skipped during bindings generation
 *
 * - method `format`: Property has no getter nor setter
 */
public open class ZlibDecompressor(public val gioZlibDecompressorPointer: CPointer<GZlibDecompressor>) :
    Object(gioZlibDecompressorPointer.reinterpret()),
    Converter,
    KGTyped {
    init {
        Gio
    }

    override val gioConverterPointer: CPointer<GConverter>
        get() = handle.reinterpret()

    /**
     * A #GFileInfo containing the information found in the GZIP header
     * of the data stream processed, or null if the header was not yet
     * fully processed, is not present at all, or the compressor's
     * #GZlibDecompressor:format property is not %G_ZLIB_COMPRESSOR_FORMAT_GZIP.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val fileInfo: FileInfo?
        /**
         * Retrieves the #GFileInfo constructed from the GZIP header data
         * of compressed data processed by @compressor, or null if @decompressor's
         * #GZlibDecompressor:format property is not %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
         * or the header data was not fully processed yet, or it not present in the
         * data stream at all.
         *
         * @return a #GFileInfo, or null
         * @since 2.26
         */
        get() = g_zlib_decompressor_get_file_info(gioZlibDecompressorPointer)?.run {
            InstanceCache.get(this, true) { FileInfo(reinterpret()) }!!
        }

    /**
     * Creates a new #GZlibDecompressor.
     *
     * @param format The format to use for the compressed data
     * @return a new #GZlibDecompressor
     * @since 2.24
     */
    public constructor(format: ZlibCompressorFormat) : this(g_zlib_decompressor_new(format.nativeValue)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ZlibDecompressor> {
        override val type: GeneratedClassKGType<ZlibDecompressor> =
            GeneratedClassKGType(getTypeOrNull()!!) { ZlibDecompressor(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ZlibDecompressor
         *
         * @return the GType
         */
        public fun getType(): GType = g_zlib_decompressor_get_type()

        /**
         * Gets the GType of from the symbol `g_zlib_decompressor_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_zlib_decompressor_get_type")
    }
}
