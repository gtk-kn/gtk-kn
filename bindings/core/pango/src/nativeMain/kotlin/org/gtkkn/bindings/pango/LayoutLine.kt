// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.annotations.PangoVersion1_10
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoLayoutLine
import org.gtkkn.native.pango.pango_layout_line_get_extents
import org.gtkkn.native.pango.pango_layout_line_get_length
import org.gtkkn.native.pango.pango_layout_line_get_pixel_extents
import org.gtkkn.native.pango.pango_layout_line_get_resolved_direction
import org.gtkkn.native.pango.pango_layout_line_get_start_index
import org.gtkkn.native.pango.pango_layout_line_is_paragraph_start
import org.gtkkn.native.pango.pango_layout_line_ref
import org.gtkkn.native.pango.pango_layout_line_unref
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit

/**
 * A `PangoLayoutLine` represents one of the lines resulting from laying
 * out a paragraph via `PangoLayout`.
 *
 * `PangoLayoutLine` structures are obtained by calling
 * [method@Pango.Layout.get_line] and are only valid until the text,
 * attributes, or settings of the parent `PangoLayout` are modified.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `height`: height: Out parameter is not supported
 * - parameter `ranges`: ranges: Out parameter is not supported
 * - parameter `x_pos`: x_pos: Out parameter is not supported
 * - parameter `index`: index: Out parameter is not supported
 */
public class LayoutLine(
    pointer: CPointer<PangoLayoutLine>,
) : Record {
    public val pangoLayoutLinePointer: CPointer<PangoLayoutLine> = pointer

    /**
     * the layout this line belongs to, might be null
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val layout: Layout?
        get() =
            pangoLayoutLinePointer.pointed.layout?.run {
                Layout(reinterpret())
            }

    /**
     * start of line as byte index into layout->text
     */
    public var startIndex: Int
        get() = pangoLayoutLinePointer.pointed.start_index
        set(`value`) {
            pangoLayoutLinePointer.pointed.start_index = value
        }

    /**
     * length of line in bytes
     */
    public var length: Int
        get() = pangoLayoutLinePointer.pointed.length
        set(`value`) {
            pangoLayoutLinePointer.pointed.length = value
        }

    /**
     * list of runs in the
     *   line, from left to right
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val runs: SList?
        get() =
            pangoLayoutLinePointer.pointed.runs?.run {
                SList(reinterpret())
            }

    /**
     * #TRUE if this is the first line of the paragraph
     */
    public var isParagraphStart: UInt
        get() = pangoLayoutLinePointer.pointed.is_paragraph_start
        set(`value`) {
            pangoLayoutLinePointer.pointed.is_paragraph_start = value
        }

    /**
     * #Resolved PangoDirection of line
     */
    public var resolvedDir: UInt
        get() = pangoLayoutLinePointer.pointed.resolved_dir
        set(`value`) {
            pangoLayoutLinePointer.pointed.resolved_dir = value
        }

    /**
     * Computes the logical and ink extents of a layout line.
     *
     * See [method@Pango.Font.get_glyph_extents] for details
     * about the interpretation of the rectangles.
     *
     * @param inkRect rectangle used to store the extents of
     *   the glyph string as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the glyph string
     */
    public fun getExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_line_get_extents(
            pangoLayoutLinePointer.reinterpret(),
            inkRect?.pangoRectanglePointer?.reinterpret(),
            logicalRect?.pangoRectanglePointer?.reinterpret()
        )

    /**
     * Returns the length of the line, in bytes.
     *
     * @return the length of the line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getLength(): Int = pango_layout_line_get_length(pangoLayoutLinePointer.reinterpret())

    /**
     * Computes the logical and ink extents of @layout_line in device units.
     *
     * This function just calls [method@Pango.LayoutLine.get_extents] followed by
     * two [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@extents_to_pixels]).
     *
     * @param inkRect rectangle used to store the extents of
     *   the glyph string as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the glyph string
     */
    public fun getPixelExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_line_get_pixel_extents(
            pangoLayoutLinePointer.reinterpret(),
            inkRect?.pangoRectanglePointer?.reinterpret(),
            logicalRect?.pangoRectanglePointer?.reinterpret()
        )

    /**
     * Returns the resolved direction of the line.
     *
     * @return the resolved direction of the line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getResolvedDirection(): Direction =
        pango_layout_line_get_resolved_direction(pangoLayoutLinePointer.reinterpret()).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Returns the start index of the line, as byte index
     * into the text of the layout.
     *
     * @return the start index of the line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getStartIndex(): Int = pango_layout_line_get_start_index(pangoLayoutLinePointer.reinterpret())

    /**
     * Returns whether this is the first line of the paragraph.
     *
     * @return true if this is the first line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun isParagraphStart(): Boolean =
        pango_layout_line_is_paragraph_start(pangoLayoutLinePointer.reinterpret()).asBoolean()

    /**
     * Increase the reference count of a `PangoLayoutLine` by one.
     *
     * @return the line passed in.
     * @since 1.10
     */
    @PangoVersion1_10
    public fun ref(): LayoutLine? =
        pango_layout_line_ref(pangoLayoutLinePointer.reinterpret())?.run {
            LayoutLine(reinterpret())
        }

    /**
     * Decrease the reference count of a `PangoLayoutLine` by one.
     *
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public fun unref(): Unit = pango_layout_line_unref(pangoLayoutLinePointer.reinterpret())

    public companion object : RecordCompanion<LayoutLine, PangoLayoutLine> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): LayoutLine = LayoutLine(pointer.reinterpret())
    }
}
