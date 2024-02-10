// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_ot_math_glyph_part_t

/**
 * Data type to hold information for a "part" component of a math-variant glyph.
 * Large variants for stretchable math glyphs (such as parentheses) can be constructed
 * on the fly from parts.
 *
 * ## Skipped during bindings generation
 *
 * - field `glyph`: codepoint_t
 * - field `start_connector_length`: position_t
 * - field `end_connector_length`: position_t
 * - field `full_advance`: position_t
 *
 * @since 1.3.3
 */
public class OtMathGlyphPart(
    pointer: CPointer<hb_ot_math_glyph_part_t>,
) : Record {
    public val harfbuzzot_math_glyph_part_tPointer: CPointer<hb_ot_math_glyph_part_t> = pointer

    /**
     * #hb_ot_math_glyph_part_flags_t flags for the part
     */
    public var flags: OtMathGlyphPartFlags
        get() =
            harfbuzzot_math_glyph_part_tPointer.pointed.flags.run {
                OtMathGlyphPartFlags(this)
            }
        set(`value`) {
            harfbuzzot_math_glyph_part_tPointer.pointed.flags = value.mask
        }

    public companion object : RecordCompanion<OtMathGlyphPart, hb_ot_math_glyph_part_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OtMathGlyphPart =
            OtMathGlyphPart(pointer.reinterpret())
    }
}
