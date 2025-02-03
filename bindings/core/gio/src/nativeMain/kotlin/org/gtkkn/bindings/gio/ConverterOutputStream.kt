// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GConverterOutputStream
import org.gtkkn.native.gio.GPollableOutputStream
import org.gtkkn.native.gio.g_converter_output_stream_get_converter
import org.gtkkn.native.gio.g_converter_output_stream_get_type
import org.gtkkn.native.gio.g_converter_output_stream_new
import org.gtkkn.native.gobject.GType

/**
 * Converter output stream implements [class@Gio.OutputStream] and allows
 * conversion of data of various types during reading.
 *
 * As of GLib 2.34, `GConverterOutputStream` implements
 * [iface@Gio.PollableOutputStream].
 */
public open class ConverterOutputStream(public val gioConverterOutputStreamPointer: CPointer<GConverterOutputStream>) :
    FilterOutputStream(gioConverterOutputStreamPointer.reinterpret()),
    PollableOutputStream,
    KGTyped {
    init {
        Gio
    }

    override val gioPollableOutputStreamPointer: CPointer<GPollableOutputStream>
        get() = handle.reinterpret()

    /**
     * The converter object.
     */
    public open val converter: Converter
        /**
         * Gets the #GConverter that is used by @converter_stream.
         *
         * @return the converter of the converter output stream
         * @since 2.24
         */
        get() = g_converter_output_stream_get_converter(gioConverterOutputStreamPointer)!!.run {
            Converter.ConverterImpl(reinterpret())
        }

    /**
     * Creates a new converter output stream for the @base_stream.
     *
     * @param baseStream a #GOutputStream
     * @param converter a #GConverter
     * @return a new #GOutputStream.
     */
    public constructor(
        baseStream: OutputStream,
        converter: Converter,
    ) : this(
        g_converter_output_stream_new(baseStream.gioOutputStreamPointer, converter.gioConverterPointer)!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ConverterOutputStream> {
        override val type: GeneratedClassKGType<ConverterOutputStream> =
            GeneratedClassKGType(getTypeOrNull()!!) { ConverterOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ConverterOutputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_output_stream_get_type()

        /**
         * Gets the GType of from the symbol `g_converter_output_stream_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_converter_output_stream_get_type")
    }
}
