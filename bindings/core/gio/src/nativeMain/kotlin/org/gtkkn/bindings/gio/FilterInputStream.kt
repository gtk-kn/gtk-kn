// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFilterInputStream
import org.gtkkn.native.gio.g_filter_input_stream_get_base_stream
import org.gtkkn.native.gio.g_filter_input_stream_get_close_base_stream
import org.gtkkn.native.gio.g_filter_input_stream_get_type
import org.gtkkn.native.gio.g_filter_input_stream_set_close_base_stream
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * Base class for input stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public abstract class FilterInputStream(public val gioFilterInputStreamPointer: CPointer<GFilterInputStream>) :
    InputStream(gioFilterInputStreamPointer.reinterpret()),
    KGTyped {
    /**
     * The underlying base stream on which the I/O ops will be done.
     */
    public open val baseStream: InputStream
        /**
         * Gets the base stream for the filter stream.
         *
         * @return a #GInputStream.
         */
        get() = g_filter_input_stream_get_base_stream(gioFilterInputStreamPointer)!!.run {
            InputStream.InputStreamImpl(this)
        }

    /**
     * Whether the base stream should be closed when the filter stream is closed.
     */
    public open var closeBaseStream: Boolean
        /**
         * Returns whether the base stream will be closed when @stream is
         * closed.
         *
         * @return true if the base stream will be closed.
         */
        get() = g_filter_input_stream_get_close_base_stream(gioFilterInputStreamPointer).asBoolean()

        /**
         * Sets whether the base stream will be closed when @stream is closed.
         *
         * @param closeBase true to close the base stream.
         */
        set(
            closeBase
        ) = g_filter_input_stream_set_close_base_stream(gioFilterInputStreamPointer, closeBase.asGBoolean())

    /**
     * The FilterInputStreamImpl type represents a native instance of the abstract FilterInputStream class.
     *
     * @constructor Creates a new instance of FilterInputStream for the provided [CPointer].
     */
    public class FilterInputStreamImpl(pointer: CPointer<GFilterInputStream>) : FilterInputStream(pointer)

    public companion object : TypeCompanion<FilterInputStream> {
        override val type: GeneratedClassKGType<FilterInputStream> =
            GeneratedClassKGType(getTypeOrNull("g_filter_input_stream_get_type")!!) {
                FilterInputStreamImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FilterInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_filter_input_stream_get_type()
    }
}
