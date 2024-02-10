// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSimpleIOStream
import org.gtkkn.native.gio.g_simple_io_stream_get_type
import org.gtkkn.native.gio.g_simple_io_stream_new

/**
 * GSimpleIOStream creates a #GIOStream from an arbitrary #GInputStream and
 * #GOutputStream. This allows any pair of input and output streams to be used
 * with #GIOStream methods.
 *
 * This is useful when you obtained a #GInputStream and a #GOutputStream
 * by other means, for instance creating them with platform specific methods as
 * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want
 * to take advantage of the methods provided by #GIOStream.
 *
 * ## Skipped during bindings generation
 *
 * - method `input-stream`: Property has no getter nor setter
 * - method `output-stream`: Property has no getter nor setter
 *
 * @since 2.44
 */
public open class SimpleIOStream(
    pointer: CPointer<GSimpleIOStream>,
) : IOStream(pointer.reinterpret()), KGTyped {
    public val gioSimpleIOStreamPointer: CPointer<GSimpleIOStream>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GSimpleIOStream wrapping @input_stream and @output_stream.
     * See also #GIOStream.
     *
     * @param inputStream a #GInputStream.
     * @param outputStream a #GOutputStream.
     * @return a new #GSimpleIOStream instance.
     * @since 2.44
     */
    public constructor(inputStream: InputStream, outputStream: OutputStream) :
        this(
            g_simple_io_stream_new(
                inputStream.gioInputStreamPointer.reinterpret(),
                outputStream.gioOutputStreamPointer.reinterpret()
            )!!.reinterpret()
        )

    public companion object : TypeCompanion<SimpleIOStream> {
        override val type: GeneratedClassKGType<SimpleIOStream> =
            GeneratedClassKGType(g_simple_io_stream_get_type()) {
                SimpleIOStream(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
