// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    )

    public companion object : TypeCompanion<ConverterOutputStream> {
        override val type: GeneratedClassKGType<ConverterOutputStream> =
            GeneratedClassKGType(g_converter_output_stream_get_type()) { ConverterOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ConverterOutputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_output_stream_get_type()
    }
}
