// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoGlyphVisAttr
import kotlin.UInt

/**
 * A `PangoGlyphVisAttr` structure communicates information between
 * the shaping and rendering phases.
 *
 * Currently, it contains cluster start and color information.
 * More attributes may be added in the future.
 *
 * Clusters are stored in visual order, within the cluster, glyphs
 * are always ordered in logical order, since visual order is meaningless;
 * that is, in Arabic text, accent glyphs follow the glyphs for the
 * base character.
 */
public class GlyphVisAttr(
    pointer: CPointer<PangoGlyphVisAttr>,
) : Record {
    public val pangoGlyphVisAttrPointer: CPointer<PangoGlyphVisAttr> = pointer

    /**
     * set for the first logical glyph in each cluster.
     */
    public var isClusterStart: UInt
        get() = pangoGlyphVisAttrPointer.pointed.is_cluster_start
        set(`value`) {
            pangoGlyphVisAttrPointer.pointed.is_cluster_start = value
        }

    /**
     * set if the the font will render this glyph with color. Since 1.50
     */
    public var isColor: UInt
        get() = pangoGlyphVisAttrPointer.pointed.is_color
        set(`value`) {
            pangoGlyphVisAttrPointer.pointed.is_color = value
        }

    public companion object : RecordCompanion<GlyphVisAttr, PangoGlyphVisAttr> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphVisAttr =
            GlyphVisAttr(pointer.reinterpret())
    }
}
