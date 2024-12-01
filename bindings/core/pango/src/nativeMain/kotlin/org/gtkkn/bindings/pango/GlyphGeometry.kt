// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
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
 */
public class GlyphGeometry(
    pointer: CPointer<PangoGlyphGeometry>,
) : Record {
    public val pangoGlyphGeometryPointer: CPointer<PangoGlyphGeometry> = pointer

    /**
     * the logical width to use for the the character.
     */
    public var width: GlyphUnit
        get() = pangoGlyphGeometryPointer.pointed.width
        set(`value`) {
            pangoGlyphGeometryPointer.pointed.width = value
        }

    /**
     * horizontal offset from nominal character position.
     */
    public var xOffset: GlyphUnit
        get() = pangoGlyphGeometryPointer.pointed.x_offset
        set(`value`) {
            pangoGlyphGeometryPointer.pointed.x_offset = value
        }

    /**
     * vertical offset from nominal character position.
     */
    public var yOffset: GlyphUnit
        get() = pangoGlyphGeometryPointer.pointed.y_offset
        set(`value`) {
            pangoGlyphGeometryPointer.pointed.y_offset = value
        }

    public companion object : RecordCompanion<GlyphGeometry, PangoGlyphGeometry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphGeometry =
            GlyphGeometry(pointer.reinterpret())
    }
}
