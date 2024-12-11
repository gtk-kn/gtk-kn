// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoStyle
import org.gtkkn.native.pango.pango_style_get_type

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public enum class Style(public val nativeValue: PangoStyle) {
    /**
     * the font is upright.
     */
    NORMAL(PangoStyle.PANGO_STYLE_NORMAL),

    /**
     * the font is slanted, but in a roman style.
     */
    OBLIQUE(PangoStyle.PANGO_STYLE_OBLIQUE),

    /**
     * the font is slanted in an italic style.
     */
    ITALIC(PangoStyle.PANGO_STYLE_ITALIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoStyle): Style = when (nativeValue) {
            PangoStyle.PANGO_STYLE_NORMAL -> NORMAL
            PangoStyle.PANGO_STYLE_OBLIQUE -> OBLIQUE
            PangoStyle.PANGO_STYLE_ITALIC -> ITALIC
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Style
         *
         * @return the GType
         */
        public fun getType(): GType = pango_style_get_type()
    }
}
