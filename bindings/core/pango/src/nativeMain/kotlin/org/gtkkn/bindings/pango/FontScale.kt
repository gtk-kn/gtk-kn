// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoFontScale
import org.gtkkn.native.pango.PangoFontScale.PANGO_FONT_SCALE_NONE
import org.gtkkn.native.pango.PangoFontScale.PANGO_FONT_SCALE_SMALL_CAPS
import org.gtkkn.native.pango.PangoFontScale.PANGO_FONT_SCALE_SUBSCRIPT
import org.gtkkn.native.pango.PangoFontScale.PANGO_FONT_SCALE_SUPERSCRIPT

/**
 * An enumeration that affects font sizes for superscript
 * and subscript positioning and for (emulated) Small Caps.
 * @since 1.50
 */
public enum class FontScale(
    public val nativeValue: PangoFontScale,
) {
    /**
     * Leave the font size unchanged
     */
    NONE(PANGO_FONT_SCALE_NONE),

    /**
     * Change the font to a size suitable for superscripts
     */
    SUPERSCRIPT(PANGO_FONT_SCALE_SUPERSCRIPT),

    /**
     * Change the font to a size suitable for subscripts
     */
    SUBSCRIPT(PANGO_FONT_SCALE_SUBSCRIPT),

    /**
     * Change the font to a size suitable for Small Caps
     */
    SMALL_CAPS(PANGO_FONT_SCALE_SMALL_CAPS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoFontScale): FontScale =
            when (nativeValue) {
                PANGO_FONT_SCALE_NONE -> NONE
                PANGO_FONT_SCALE_SUPERSCRIPT -> SUPERSCRIPT
                PANGO_FONT_SCALE_SUBSCRIPT -> SUBSCRIPT
                PANGO_FONT_SCALE_SMALL_CAPS -> SMALL_CAPS
                else -> error("invalid nativeValue")
            }
    }
}
