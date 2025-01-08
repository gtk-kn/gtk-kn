// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GConverter
import org.gtkkn.native.gio.g_converter_get_type
import org.gtkkn.native.gio.g_converter_reset
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * `GConverter` is an interface for streaming conversions.
 *
 * `GConverter` is implemented by objects that convert
 * binary data in various ways. The conversion can be
 * stateful and may fail at any place.
 *
 * Some example conversions are: character set conversion,
 * compression, decompression and regular expression
 * replace.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `inbuf`: Array parameter of type guint8 is not supported
 *
 * @since 2.24
 */
@GioVersion2_24
public interface Converter :
    Interface,
    KGTyped {
    public val gioConverterPointer: CPointer<GConverter>

    /**
     * Resets all internal state in the converter, making it behave
     * as if it was just created. If the converter has any internal
     * state that would produce output then that output is lost.
     *
     * @since 2.24
     */
    @GioVersion2_24
    public fun reset(): Unit = g_converter_reset(gioConverterPointer)

    private data class Wrapper(private val pointer: CPointer<GConverter>) : Converter {
        override val gioConverterPointer: CPointer<GConverter> = pointer
    }

    public companion object : TypeCompanion<Converter> {
        override val type: GeneratedInterfaceKGType<Converter> =
            GeneratedInterfaceKGType(g_converter_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GConverter>): Converter = Wrapper(pointer)

        /**
         * Get the GType of Converter
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_get_type()
    }
}
