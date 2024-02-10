// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.harfbuzz.hb_glyph_extents_t

/**
 * Glyph extent values, measured in font units.
 *
 * Note that @height is negative, in coordinate systems that grow up.
 *
 * ## Skipped during bindings generation
 *
 * - field `x_bearing`: position_t
 * - field `y_bearing`: position_t
 * - field `width`: position_t
 * - field `height`: position_t
 */
public class GlyphExtents(
    pointer: CPointer<hb_glyph_extents_t>,
) : Record {
    public val harfbuzzglyph_extents_tPointer: CPointer<hb_glyph_extents_t> = pointer

    public companion object : RecordCompanion<GlyphExtents, hb_glyph_extents_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphExtents =
            GlyphExtents(pointer.reinterpret())
    }
}
