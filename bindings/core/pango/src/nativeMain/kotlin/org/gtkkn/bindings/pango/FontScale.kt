// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.native.pango.PangoFontScale

/**
 * An enumeration that affects font sizes for superscript
 * and subscript positioning and for (emulated) Small Caps.
 * @since 1.50
 */
@PangoVersion1_50
public enum class FontScale(
    public val nativeValue: PangoFontScale,
) {
    /**
     * Leave the font size unchanged
     */
    NONE(PangoFontScale.PANGO_FONT_SCALE_NONE),

    /**
     * Change the font to a size suitable for superscripts
     */
    SUPERSCRIPT(PangoFontScale.PANGO_FONT_SCALE_SUPERSCRIPT),

    /**
     * Change the font to a size suitable for subscripts
     */
    SUBSCRIPT(PangoFontScale.PANGO_FONT_SCALE_SUBSCRIPT),

    /**
     * Change the font to a size suitable for Small Caps
     */
    SMALL_CAPS(PangoFontScale.PANGO_FONT_SCALE_SMALL_CAPS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoFontScale): FontScale =
            when (nativeValue) {
                PangoFontScale.PANGO_FONT_SCALE_NONE -> NONE
                PangoFontScale.PANGO_FONT_SCALE_SUPERSCRIPT -> SUPERSCRIPT
                PangoFontScale.PANGO_FONT_SCALE_SUBSCRIPT -> SUBSCRIPT
                PangoFontScale.PANGO_FONT_SCALE_SMALL_CAPS -> SMALL_CAPS
                else -> error("invalid nativeValue")
            }
    }
}
