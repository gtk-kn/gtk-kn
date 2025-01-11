// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import org.gtkkn.bindings.pango.annotations.PangoVersion1_14
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoGlyphString
import org.gtkkn.native.pango.pango_glyph_string_copy
import org.gtkkn.native.pango.pango_glyph_string_extents
import org.gtkkn.native.pango.pango_glyph_string_extents_range
import org.gtkkn.native.pango.pango_glyph_string_free
import org.gtkkn.native.pango.pango_glyph_string_get_type
import org.gtkkn.native.pango.pango_glyph_string_get_width
import org.gtkkn.native.pango.pango_glyph_string_new
import org.gtkkn.native.pango.pango_glyph_string_set_size
import kotlin.String
import kotlin.Unit

/**
 * A `PangoGlyphString` is used to store strings of glyphs with geometry
 * and visual attribute information.
 *
 * The storage for the glyph information is owned by the structure
 * which simplifies memory management.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `logical_widths`: Array parameter of type gint is not supported
 * - parameter `x_pos`: x_pos: Out parameter is not supported
 * - parameter `x_pos`: x_pos: Out parameter is not supported
 * - parameter `index`: index: Out parameter is not supported
 * - field `glyphs`: Array parameter of type GlyphInfo is not supported
 * - field `log_clusters`: Unsupported pointer to primitive type
 */
public class GlyphString(public val pangoGlyphStringPointer: CPointer<PangoGlyphString>) :
    ProxyInstance(pangoGlyphStringPointer) {
    /**
     * number of glyphs in this glyph string
     */
    public var numGlyphs: gint
        get() = pangoGlyphStringPointer.pointed.num_glyphs

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphStringPointer.pointed.num_glyphs = value
        }

    /**
     * Copy a glyph string and associated storage.
     *
     * @return the newly allocated `PangoGlyphString`
     */
    public fun copy(): GlyphString? = pango_glyph_string_copy(pangoGlyphStringPointer)?.run {
        GlyphString(this)
    }

    /**
     * Compute the logical and ink extents of a glyph string.
     *
     * See the documentation for [method@Pango.Font.get_glyph_extents] for details
     * about the interpretation of the rectangles.
     *
     * Examples of logical (red) and ink (green) rects:
     *
     * ![](rects1.png) ![](rects2.png)
     *
     * @param font a `PangoFont`
     * @param inkRect rectangle used to store the extents of the glyph string as drawn
     * @param logicalRect rectangle used to store the logical extents of the glyph string
     */
    public fun extents(font: Font, inkRect: Rectangle?, logicalRect: Rectangle?): Unit = pango_glyph_string_extents(
        pangoGlyphStringPointer,
        font.pangoFontPointer,
        inkRect?.pangoRectanglePointer,
        logicalRect?.pangoRectanglePointer
    )

    /**
     * Computes the extents of a sub-portion of a glyph string.
     *
     * The extents are relative to the start of the glyph string range
     * (the origin of their coordinate system is at the start of the range,
     * not at the start of the entire glyph string).
     *
     * @param start start index
     * @param end end index (the range is the set of bytes with
     *   indices such that start <= index < end)
     * @param font a `PangoFont`
     * @param inkRect rectangle used to
     *   store the extents of the glyph string range as drawn
     * @param logicalRect rectangle used to
     *   store the logical extents of the glyph string range
     */
    public fun extentsRange(start: gint, end: gint, font: Font, inkRect: Rectangle?, logicalRect: Rectangle?): Unit =
        pango_glyph_string_extents_range(
            pangoGlyphStringPointer,
            start,
            end,
            font.pangoFontPointer,
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Free a glyph string and associated storage.
     */
    public fun free(): Unit = pango_glyph_string_free(pangoGlyphStringPointer)

    /**
     * Computes the logical width of the glyph string.
     *
     * This can also be computed using [method@Pango.GlyphString.extents].
     * However, since this only computes the width, it's much faster. This
     * is in fact only a convenience function that computes the sum of
     * @geometry.width for each glyph in the @glyphs.
     *
     * @return the logical width of the glyph string.
     * @since 1.14
     */
    @PangoVersion1_14
    public fun getWidth(): gint = pango_glyph_string_get_width(pangoGlyphStringPointer)

    /**
     * Resize a glyph string to the given length.
     *
     * @param newLen the new length of the string
     */
    public fun setSize(newLen: gint): Unit = pango_glyph_string_set_size(pangoGlyphStringPointer, newLen)

    override fun toString(): String = "GlyphString(numGlyphs=$numGlyphs)"

    public companion object {
        /**
         * Create a new `PangoGlyphString`.
         *
         * @return the newly allocated `PangoGlyphString`, which
         *   should be freed with [method@Pango.GlyphString.free].
         */
        public fun new(): GlyphString = GlyphString(pango_glyph_string_new()!!)

        /**
         * Get the GType of GlyphString
         *
         * @return the GType
         */
        public fun getType(): GType = pango_glyph_string_get_type()
    }
}
