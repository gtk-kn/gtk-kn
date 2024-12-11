// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.native.gio.GConverterResult
import org.gtkkn.native.gio.g_converter_result_get_type
import org.gtkkn.native.gobject.GType

/**
 * Results returned from g_converter_convert().
 * @since 2.24
 */
@GioVersion2_24
public enum class ConverterResult(public val nativeValue: GConverterResult) {
    /**
     * There was an error during conversion.
     */
    ERROR(GConverterResult.G_CONVERTER_ERROR),

    /**
     * Some data was consumed or produced
     */
    CONVERTED(GConverterResult.G_CONVERTER_CONVERTED),

    /**
     * The conversion is finished
     */
    FINISHED(GConverterResult.G_CONVERTER_FINISHED),

    /**
     * Flushing is finished
     */
    FLUSHED(GConverterResult.G_CONVERTER_FLUSHED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GConverterResult): ConverterResult = when (nativeValue) {
            GConverterResult.G_CONVERTER_ERROR -> ERROR
            GConverterResult.G_CONVERTER_CONVERTED -> CONVERTED
            GConverterResult.G_CONVERTER_FINISHED -> FINISHED
            GConverterResult.G_CONVERTER_FLUSHED -> FLUSHED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ConverterResult
         *
         * @return the GType
         */
        public fun getType(): GType = g_converter_result_get_type()
    }
}
