// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_GLYPH_FLAG_DEFINED
import org.gtkkn.native.harfbuzz.HB_GLYPH_FLAG_UNSAFE_TO_BREAK
import org.gtkkn.native.harfbuzz.hb_glyph_flags_t

/**
 *
 * @since 1.5.0
 */
public class GlyphFlags(
    public val mask: hb_glyph_flags_t,
) : Bitfield<GlyphFlags> {
    override infix fun or(other: GlyphFlags): GlyphFlags = GlyphFlags(mask or other.mask)

    public companion object {
        /**
         * Indicates that if input text is broken at the
         * 				   beginning of the cluster this glyph is part of,
         * 				   then both sides need to be re-shaped, as the
         * 				   result might be different.  On the flip side,
         * 				   it means that when this flag is not present,
         * 				   then it's safe to break the glyph-run at the
         * 				   beginning of this cluster, and the two sides
         * 				   represent the exact same result one would get
         * 				   if breaking input text at the beginning of
         * 				   this cluster and shaping the two sides
         * 				   separately.  This can be used to optimize
         * 				   paragraph layout, by avoiding re-shaping
         * 				   of each line after line-breaking, or limiting
         * 				   the reshaping to a small piece around the
         * 				   breaking point only.
         */
        public val UNSAFE_TO_BREAK: GlyphFlags = GlyphFlags(HB_GLYPH_FLAG_UNSAFE_TO_BREAK)

        /**
         * All the currently defined flags.
         */
        public val DEFINED: GlyphFlags = GlyphFlags(HB_GLYPH_FLAG_DEFINED)
    }
}
