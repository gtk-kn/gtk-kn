// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_OT_MATH_GLYPH_PART_FLAG_EXTENDER
import org.gtkkn.native.harfbuzz.hb_ot_math_glyph_part_flags_t

/**
 * Flags for math glyph parts.
 * @since 1.3.3
 */
public class OtMathGlyphPartFlags(
    public val mask: hb_ot_math_glyph_part_flags_t,
) : Bitfield<OtMathGlyphPartFlags> {
    override infix fun or(other: OtMathGlyphPartFlags): OtMathGlyphPartFlags = OtMathGlyphPartFlags(mask or other.mask)

    public companion object {
        public val EXTENDER: OtMathGlyphPartFlags =
            OtMathGlyphPartFlags(HB_OT_MATH_GLYPH_PART_FLAG_EXTENDER)
    }
}
