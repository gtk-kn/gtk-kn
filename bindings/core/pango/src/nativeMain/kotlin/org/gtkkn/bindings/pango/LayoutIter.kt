// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoLayoutIter
import org.gtkkn.native.pango.pango_layout_iter_at_last_line
import org.gtkkn.native.pango.pango_layout_iter_copy
import org.gtkkn.native.pango.pango_layout_iter_free
import org.gtkkn.native.pango.pango_layout_iter_get_baseline
import org.gtkkn.native.pango.pango_layout_iter_get_char_extents
import org.gtkkn.native.pango.pango_layout_iter_get_cluster_extents
import org.gtkkn.native.pango.pango_layout_iter_get_index
import org.gtkkn.native.pango.pango_layout_iter_get_layout
import org.gtkkn.native.pango.pango_layout_iter_get_layout_extents
import org.gtkkn.native.pango.pango_layout_iter_get_line
import org.gtkkn.native.pango.pango_layout_iter_get_line_extents
import org.gtkkn.native.pango.pango_layout_iter_get_line_readonly
import org.gtkkn.native.pango.pango_layout_iter_get_run_baseline
import org.gtkkn.native.pango.pango_layout_iter_get_run_extents
import org.gtkkn.native.pango.pango_layout_iter_next_char
import org.gtkkn.native.pango.pango_layout_iter_next_cluster
import org.gtkkn.native.pango.pango_layout_iter_next_line
import org.gtkkn.native.pango.pango_layout_iter_next_run
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * A `PangoLayoutIter` can be used to iterate over the visual
 * extents of a `PangoLayout`.
 *
 * To obtain a `PangoLayoutIter`, use [method@Pango.Layout.get_iter].
 *
 * The `PangoLayoutIter` structure is opaque, and has no user-visible fields.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `y0_`: y0_: Out parameter is not supported
 * - method `get_run`: Return type LayoutRun is unsupported
 * - method `get_run_readonly`: Return type LayoutRun is unsupported
 */
public class LayoutIter(
    pointer: CPointer<PangoLayoutIter>,
) : Record {
    public val pangoLayoutIterPointer: CPointer<PangoLayoutIter> = pointer

    /**
     * Determines whether @iter is on the last line of the layout.
     *
     * @return true if @iter is on the last line
     */
    public fun atLastLine(): Boolean = pango_layout_iter_at_last_line(pangoLayoutIterPointer.reinterpret()).asBoolean()

    /**
     * Copies a `PangoLayoutIter`.
     *
     * @return the newly allocated `PangoLayoutIter`
     * @since 1.20
     */
    public fun copy(): LayoutIter? =
        pango_layout_iter_copy(pangoLayoutIterPointer.reinterpret())?.run {
            LayoutIter(reinterpret())
        }

    /**
     * Frees an iterator that's no longer in use.
     */
    public fun free(): Unit = pango_layout_iter_free(pangoLayoutIterPointer.reinterpret())

    /**
     * Gets the Y position of the current line's baseline, in layout
     * coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * @return baseline of current line
     */
    public fun getBaseline(): Int = pango_layout_iter_get_baseline(pangoLayoutIterPointer.reinterpret())

    /**
     * Gets the extents of the current character, in layout coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * Only logical extents can sensibly be obtained for characters;
     * ink extents make sense only down to the level of clusters.
     *
     * @param logicalRect rectangle to fill with
     *   logical extents
     */
    public fun getCharExtents(logicalRect: Rectangle): Unit =
        pango_layout_iter_get_char_extents(
            pangoLayoutIterPointer.reinterpret(),
            logicalRect.pangoRectanglePointer
        )

    /**
     * Gets the extents of the current cluster, in layout coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getClusterExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_iter_get_cluster_extents(
            pangoLayoutIterPointer.reinterpret(),
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Gets the current byte index.
     *
     * Note that iterating forward by char moves in visual order,
     * not logical order, so indexes may not be sequential. Also,
     * the index may be equal to the length of the text in the
     * layout, if on the null run (see [method@Pango.LayoutIter.get_run]).
     *
     * @return current byte index
     */
    public fun getIndex(): Int = pango_layout_iter_get_index(pangoLayoutIterPointer.reinterpret())

    /**
     * Gets the layout associated with a `PangoLayoutIter`.
     *
     * @return the layout associated with @iter
     * @since 1.20
     */
    public fun getLayout(): Layout =
        pango_layout_iter_get_layout(pangoLayoutIterPointer.reinterpret())!!.run {
            Layout(reinterpret())
        }

    /**
     * Obtains the extents of the `PangoLayout` being iterated over.
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getLayoutExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_iter_get_layout_extents(
            pangoLayoutIterPointer.reinterpret(),
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Gets the current line.
     *
     * Use the faster [method@Pango.LayoutIter.get_line_readonly] if
     * you do not plan to modify the contents of the line (glyphs,
     * glyph widths, etc.).
     *
     * @return the current line
     */
    public fun getLine(): LayoutLine =
        pango_layout_iter_get_line(pangoLayoutIterPointer.reinterpret())!!.run {
            LayoutLine(reinterpret())
        }

    /**
     * Obtains the extents of the current line.
     *
     * Extents are in layout coordinates (origin is the top-left corner
     * of the entire `PangoLayout`). Thus the extents returned by this
     * function will be the same width/height but not at the same x/y
     * as the extents returned from [method@Pango.LayoutLine.get_extents].
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getLineExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_iter_get_line_extents(
            pangoLayoutIterPointer.reinterpret(),
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Gets the current line for read-only access.
     *
     * This is a faster alternative to [method@Pango.LayoutIter.get_line],
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     *
     * @return the current line, that should not be
     *   modified
     * @since 1.16
     */
    public fun getLineReadonly(): LayoutLine =
        pango_layout_iter_get_line_readonly(pangoLayoutIterPointer.reinterpret())!!.run {
            LayoutLine(reinterpret())
        }

    /**
     * Gets the Y position of the current run's baseline, in layout
     * coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * The run baseline can be different from the line baseline, for
     * example due to superscript or subscript positioning.
     *
     * @since 1.50
     */
    public fun getRunBaseline(): Int = pango_layout_iter_get_run_baseline(pangoLayoutIterPointer.reinterpret())

    /**
     * Gets the extents of the current run in layout coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getRunExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_iter_get_run_extents(
            pangoLayoutIterPointer.reinterpret(),
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Moves @iter forward to the next character in visual order.
     *
     * If @iter was already at the end of the layout, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextChar(): Boolean = pango_layout_iter_next_char(pangoLayoutIterPointer.reinterpret()).asBoolean()

    /**
     * Moves @iter forward to the next cluster in visual order.
     *
     * If @iter was already at the end of the layout, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextCluster(): Boolean = pango_layout_iter_next_cluster(pangoLayoutIterPointer.reinterpret()).asBoolean()

    /**
     * Moves @iter forward to the start of the next line.
     *
     * If @iter is already on the last line, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextLine(): Boolean = pango_layout_iter_next_line(pangoLayoutIterPointer.reinterpret()).asBoolean()

    /**
     * Moves @iter forward to the next run in visual order.
     *
     * If @iter was already at the end of the layout, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextRun(): Boolean = pango_layout_iter_next_run(pangoLayoutIterPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<LayoutIter, PangoLayoutIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): LayoutIter = LayoutIter(pointer.reinterpret())
    }
}
