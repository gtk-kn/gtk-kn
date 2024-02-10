// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GConverterResult
import org.gtkkn.native.gio.GConverterResult.G_CONVERTER_CONVERTED
import org.gtkkn.native.gio.GConverterResult.G_CONVERTER_ERROR
import org.gtkkn.native.gio.GConverterResult.G_CONVERTER_FINISHED
import org.gtkkn.native.gio.GConverterResult.G_CONVERTER_FLUSHED

/**
 * Results returned from g_converter_convert().
 * @since 2.24
 */
public enum class ConverterResult(
    public val nativeValue: GConverterResult,
) {
    /**
     * There was an error during conversion.
     */
    ERROR(G_CONVERTER_ERROR),

    /**
     * Some data was consumed or produced
     */
    CONVERTED(G_CONVERTER_CONVERTED),

    /**
     * The conversion is finished
     */
    FINISHED(G_CONVERTER_FINISHED),

    /**
     * Flushing is finished
     */
    FLUSHED(G_CONVERTER_FLUSHED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GConverterResult): ConverterResult =
            when (nativeValue) {
                G_CONVERTER_ERROR -> ERROR
                G_CONVERTER_CONVERTED -> CONVERTED
                G_CONVERTER_FINISHED -> FINISHED
                G_CONVERTER_FLUSHED -> FLUSHED
                else -> error("invalid nativeValue")
            }
    }
}
