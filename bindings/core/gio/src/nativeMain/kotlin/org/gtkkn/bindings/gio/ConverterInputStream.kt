// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GConverterInputStream
import org.gtkkn.native.gio.GPollableInputStream
import org.gtkkn.native.gio.g_converter_input_stream_get_converter
import org.gtkkn.native.gio.g_converter_input_stream_get_type
import org.gtkkn.native.gio.g_converter_input_stream_new
import org.gtkkn.native.gobject.GType

/**
 * Converter input stream implements [class@Gio.InputStream] and allows
 * conversion of data of various types during reading.
 *
 * As of GLib 2.34, `GConverterInputStream` implements
 * [iface@Gio.PollableInputStream].
 */
public open class ConverterInputStream(pointer: CPointer<GConverterInputStream>) :
    FilterInputStream(pointer.reinterpret()),
    PollableInputStream,
    KGTyped {
    public val gioConverterInputStreamPointer: CPointer<GConverterInputStream>
        get() = gPointer.reinterpret()

    override val gioPollableInputStreamPointer: CPointer<GPollableInputStream>
        get() = gPointer.reinterpret()

    /**
     * The converter object.
     */
    public open val converter: Converter
        /**
         * Gets the #GConverter that is used by @converter_stream.
         *
         * @return the converter of the converter input stream
         * @since 2.24
         */
        get() = g_converter_input_stream_get_converter(gioConverterInputStreamPointer.reinterpret())!!.run {
            Converter.wrap(reinterpret())
        }

    /**
     * Creates a new converter input stream for the @base_stream.
     *
     * @param baseStream a #GInputStream
     * @param converter a #GConverter
     * @return a new #GInputStream.
     */
    public constructor(
        baseStream: InputStream,
        converter: Converter,
    ) : this(
        g_converter_input_stream_new(
            baseStream.gioInputStreamPointer.reinterpret(),
            converter.gioConverterPointer
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<ConverterInputStream> {
        override val type: GeneratedClassKGType<ConverterInputStream> =
            GeneratedClassKGType(g_converter_input_stream_get_type()) { ConverterInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ConverterInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_input_stream_get_type()
    }
}
