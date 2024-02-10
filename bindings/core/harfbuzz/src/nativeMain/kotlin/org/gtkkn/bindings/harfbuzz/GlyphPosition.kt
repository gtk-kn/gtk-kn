// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_glyph_position_t

/**
 * The #hb_glyph_position_t is the structure that holds the positions of the
 * glyph in both horizontal and vertical directions. All positions in
 * #hb_glyph_position_t are relative to the current point.
 *
 * ## Skipped during bindings generation
 *
 * - field `x_advance`: position_t
 * - field `y_advance`: position_t
 * - field `x_offset`: position_t
 * - field `y_offset`: position_t
 * - field `var`: Record field var is private
 */
public class GlyphPosition(
    pointer: CPointer<hb_glyph_position_t>,
) : Record {
    public val harfbuzzglyph_position_tPointer: CPointer<hb_glyph_position_t> = pointer

    public companion object : RecordCompanion<GlyphPosition, hb_glyph_position_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphPosition =
            GlyphPosition(pointer.reinterpret())
    }
}
