// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoStyle
import org.gtkkn.native.pango.PangoStyle.PANGO_STYLE_ITALIC
import org.gtkkn.native.pango.PangoStyle.PANGO_STYLE_NORMAL
import org.gtkkn.native.pango.PangoStyle.PANGO_STYLE_OBLIQUE

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public enum class Style(
    public val nativeValue: PangoStyle,
) {
    /**
     * the font is upright.
     */
    NORMAL(PANGO_STYLE_NORMAL),

    /**
     * the font is slanted, but in a roman style.
     */
    OBLIQUE(PANGO_STYLE_OBLIQUE),

    /**
     * the font is slanted in an italic style.
     */
    ITALIC(PANGO_STYLE_ITALIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoStyle): Style =
            when (nativeValue) {
                PANGO_STYLE_NORMAL -> NORMAL
                PANGO_STYLE_OBLIQUE -> OBLIQUE
                PANGO_STYLE_ITALIC -> ITALIC
                else -> error("invalid nativeValue")
            }
    }
}
