// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_ot_math_glyph_variant_t

/**
 * Data type to hold math-variant information for a glyph.
 *
 * ## Skipped during bindings generation
 *
 * - field `glyph`: codepoint_t
 * - field `advance`: position_t
 *
 * @since 1.3.3
 */
public class OtMathGlyphVariant(
    pointer: CPointer<hb_ot_math_glyph_variant_t>,
) : Record {
    public val harfbuzzot_math_glyph_variant_tPointer: CPointer<hb_ot_math_glyph_variant_t> =
        pointer

    public companion object : RecordCompanion<OtMathGlyphVariant, hb_ot_math_glyph_variant_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OtMathGlyphVariant =
            OtMathGlyphVariant(pointer.reinterpret())
    }
}
