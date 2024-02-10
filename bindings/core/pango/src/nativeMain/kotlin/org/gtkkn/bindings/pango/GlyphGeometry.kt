// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoGlyphGeometry

/**
 * The `PangoGlyphGeometry` structure contains width and positioning
 * information for a single glyph.
 *
 * Note that @width is not guaranteed to be the same as the glyph
 * extents. Kerning and other positioning applied during shaping will
 * affect both the @width and the @x_offset for the glyphs in the
 * glyph string that results from shaping.
 *
 * The information in this struct is intended for rendering the glyphs,
 * as follows:
 *
 * 1. Assume the current point is (x, y)
 * 2. Render the current glyph at (x + x_offset, y + y_offset),
 * 3. Advance the current point to (x + width, y)
 * 4. Render the next glyph
 *
 * ## Skipped during bindings generation
 *
 * - field `width`: GlyphUnit
 * - field `x_offset`: GlyphUnit
 * - field `y_offset`: GlyphUnit
 */
public class GlyphGeometry(
    pointer: CPointer<PangoGlyphGeometry>,
) : Record {
    public val pangoGlyphGeometryPointer: CPointer<PangoGlyphGeometry> = pointer

    public companion object : RecordCompanion<GlyphGeometry, PangoGlyphGeometry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphGeometry =
            GlyphGeometry(pointer.reinterpret())
    }
}
