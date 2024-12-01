// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.native.pango.PangoLayoutDeserializeError
import org.gtkkn.native.pango.pango_layout_deserialize_error_quark

/**
 * Errors that can be returned by [func@Pango.Layout.deserialize].
 * @since 1.50
 */
@PangoVersion1_50
public enum class LayoutDeserializeError(
    public val nativeValue: PangoLayoutDeserializeError,
) {
    /**
     * Unspecified error
     */
    INVALID(PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID),

    /**
     * A JSon value could not be
     *   interpreted
     */
    INVALID_VALUE(PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE),

    /**
     * A required JSon member was
     *   not found
     */
    MISSING_VALUE(PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoLayoutDeserializeError): LayoutDeserializeError =
            when (nativeValue) {
                PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID -> INVALID
                PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE -> INVALID_VALUE
                PangoLayoutDeserializeError.PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE -> MISSING_VALUE
                else -> error("invalid nativeValue")
            }

        public fun quark(): Quark = pango_layout_deserialize_error_quark()

        public fun fromErrorOrNull(error: Error): LayoutDeserializeError? =
            if (error.domain != quark()) {
                null
            } else {
                LayoutDeserializeError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
