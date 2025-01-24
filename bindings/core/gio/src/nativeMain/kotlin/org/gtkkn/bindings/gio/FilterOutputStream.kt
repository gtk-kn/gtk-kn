// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFilterOutputStream
import org.gtkkn.native.gio.g_filter_output_stream_get_base_stream
import org.gtkkn.native.gio.g_filter_output_stream_get_close_base_stream
import org.gtkkn.native.gio.g_filter_output_stream_get_type
import org.gtkkn.native.gio.g_filter_output_stream_set_close_base_stream
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * Base class for output stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public abstract class FilterOutputStream(public val gioFilterOutputStreamPointer: CPointer<GFilterOutputStream>) :
    OutputStream(gioFilterOutputStreamPointer.reinterpret()),
    KGTyped {
    public open val baseStream: OutputStream
        /**
         * Gets the base stream for the filter stream.
         *
         * @return a #GOutputStream.
         */
        get() = g_filter_output_stream_get_base_stream(gioFilterOutputStreamPointer)!!.run {
            OutputStream.OutputStreamImpl(this)
        }

    /**
     * Whether the base stream should be closed when the filter stream is closed.
     */
    public open val closeBaseStream: Boolean
        /**
         * Returns whether the base stream will be closed when @stream is
         * closed.
         *
         * @return true if the base stream will be closed.
         */
        get() = g_filter_output_stream_get_close_base_stream(gioFilterOutputStreamPointer).asBoolean()

    /**
     * Sets whether the base stream will be closed when @stream is closed.
     *
     * @param closeBase true to close the base stream.
     */
    public open fun setCloseBaseStream(closeBase: Boolean): Unit =
        g_filter_output_stream_set_close_base_stream(gioFilterOutputStreamPointer, closeBase.asGBoolean())

    /**
     * The FilterOutputStreamImpl type represents a native instance of the abstract FilterOutputStream class.
     *
     * @constructor Creates a new instance of FilterOutputStream for the provided [CPointer].
     */
    public class FilterOutputStreamImpl(pointer: CPointer<GFilterOutputStream>) : FilterOutputStream(pointer)

    public companion object : TypeCompanion<FilterOutputStream> {
        override val type: GeneratedClassKGType<FilterOutputStream> =
            GeneratedClassKGType(g_filter_output_stream_get_type()) { FilterOutputStreamImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FilterOutputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_filter_output_stream_get_type()
    }
}
