// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_OT_COLOR_PALETTE_FLAG_DEFAULT
import org.gtkkn.native.harfbuzz.HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_DARK_BACKGROUND
import org.gtkkn.native.harfbuzz.HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_LIGHT_BACKGROUND
import org.gtkkn.native.harfbuzz.hb_ot_color_palette_flags_t

/**
 *
 * @since 2.1.0
 */
public class OtColorPaletteFlags(
    public val mask: hb_ot_color_palette_flags_t,
) : Bitfield<OtColorPaletteFlags> {
    override infix fun or(other: OtColorPaletteFlags): OtColorPaletteFlags = OtColorPaletteFlags(mask or other.mask)

    public companion object {
        /**
         * Default indicating that there is nothing special
         *   to note about a color palette.
         */
        public val DEFAULT: OtColorPaletteFlags =
            OtColorPaletteFlags(HB_OT_COLOR_PALETTE_FLAG_DEFAULT)

        /**
         * Flag indicating that the color
         *   palette is appropriate to use when displaying the font on a light background such as
         * white.
         */
        public val USABLE_WITH_LIGHT_BACKGROUND: OtColorPaletteFlags =
            OtColorPaletteFlags(HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_LIGHT_BACKGROUND)

        /**
         * Flag indicating that the color
         *   palette is appropriate to use when displaying the font on a dark background such as
         * black.
         */
        public val USABLE_WITH_DARK_BACKGROUND: OtColorPaletteFlags =
            OtColorPaletteFlags(HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_DARK_BACKGROUND)
    }
}
