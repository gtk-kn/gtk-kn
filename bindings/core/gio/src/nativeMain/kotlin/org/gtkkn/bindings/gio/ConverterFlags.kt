// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GConverterFlags
import org.gtkkn.native.gio.G_CONVERTER_FLUSH
import org.gtkkn.native.gio.G_CONVERTER_INPUT_AT_END
import org.gtkkn.native.gio.G_CONVERTER_NO_FLAGS
import org.gtkkn.native.gio.g_converter_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when calling a g_converter_convert().
 * @since 2.24
 */
public class ConverterFlags(public val mask: GConverterFlags) : Bitfield<ConverterFlags> {
    override infix fun or(other: ConverterFlags): ConverterFlags = ConverterFlags(mask or other.mask)

    @GioVersion2_24
    public companion object {
        /**
         * No flags.
         */
        public val NONE: ConverterFlags = ConverterFlags(G_CONVERTER_NO_FLAGS)

        /**
         * At end of input data
         */
        public val INPUT_AT_END: ConverterFlags = ConverterFlags(G_CONVERTER_INPUT_AT_END)

        /**
         * Flush data
         */
        public val FLUSH: ConverterFlags = ConverterFlags(G_CONVERTER_FLUSH)

        /**
         * Get the GType of ConverterFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_flags_get_type()
    }
}
