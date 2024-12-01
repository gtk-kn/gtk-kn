// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoGlyphInfo

/**
 * A `PangoGlyphInfo` structure represents a single glyph with
 * positioning information and visual attributes.
 *
 * ## Skipped during bindings generation
 *
 * - field `geometry`: GlyphGeometry
 * - field `attr`: GlyphVisAttr
 */
public class GlyphInfo(
    pointer: CPointer<PangoGlyphInfo>,
) : Record {
    public val pangoGlyphInfoPointer: CPointer<PangoGlyphInfo> = pointer

    /**
     * the glyph itself.
     */
    public var glyph: Glyph
        get() = pangoGlyphInfoPointer.pointed.glyph
        set(`value`) {
            pangoGlyphInfoPointer.pointed.glyph = value
        }

    public companion object : RecordCompanion<GlyphInfo, PangoGlyphInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphInfo = GlyphInfo(pointer.reinterpret())
    }
}
