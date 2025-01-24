// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.bindings.pango.annotations.PangoVersion1_20
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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
import org.gtkkn.native.pango.pango_layout_iter_get_run
import org.gtkkn.native.pango.pango_layout_iter_get_run_baseline
import org.gtkkn.native.pango.pango_layout_iter_get_run_extents
import org.gtkkn.native.pango.pango_layout_iter_get_run_readonly
import org.gtkkn.native.pango.pango_layout_iter_get_type
import org.gtkkn.native.pango.pango_layout_iter_next_char
import org.gtkkn.native.pango.pango_layout_iter_next_cluster
import org.gtkkn.native.pango.pango_layout_iter_next_line
import org.gtkkn.native.pango.pango_layout_iter_next_run
import kotlin.Boolean
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
 * - parameter `y0`: y0: Out parameter is not supported
 */
public class LayoutIter(public val pangoLayoutIterPointer: CPointer<PangoLayoutIter>) :
    ProxyInstance(pangoLayoutIterPointer) {
    /**
     * Determines whether @iter is on the last line of the layout.
     *
     * @return true if @iter is on the last line
     */
    public fun atLastLine(): Boolean = pango_layout_iter_at_last_line(pangoLayoutIterPointer).asBoolean()

    /**
     * Copies a `PangoLayoutIter`.
     *
     * @return the newly allocated `PangoLayoutIter`
     * @since 1.20
     */
    @PangoVersion1_20
    public fun copy(): LayoutIter? = pango_layout_iter_copy(pangoLayoutIterPointer)?.run {
        LayoutIter(this)
    }

    /**
     * Frees an iterator that's no longer in use.
     */
    public fun free(): Unit = pango_layout_iter_free(pangoLayoutIterPointer)

    /**
     * Gets the Y position of the current line's baseline, in layout
     * coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * @return baseline of current line
     */
    public fun getBaseline(): gint = pango_layout_iter_get_baseline(pangoLayoutIterPointer)

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
        pango_layout_iter_get_char_extents(pangoLayoutIterPointer, logicalRect.pangoRectanglePointer)

    /**
     * Gets the extents of the current cluster, in layout coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getClusterExtents(inkRect: Rectangle?, logicalRect: Rectangle?): Unit =
        pango_layout_iter_get_cluster_extents(
            pangoLayoutIterPointer,
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
    public fun getIndex(): gint = pango_layout_iter_get_index(pangoLayoutIterPointer)

    /**
     * Gets the layout associated with a `PangoLayoutIter`.
     *
     * @return the layout associated with @iter
     * @since 1.20
     */
    @PangoVersion1_20
    public fun getLayout(): Layout? = pango_layout_iter_get_layout(pangoLayoutIterPointer)?.run {
        Layout(this)
    }

    /**
     * Obtains the extents of the `PangoLayout` being iterated over.
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getLayoutExtents(inkRect: Rectangle?, logicalRect: Rectangle?): Unit =
        pango_layout_iter_get_layout_extents(
            pangoLayoutIterPointer,
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
    public fun getLine(): LayoutLine? = pango_layout_iter_get_line(pangoLayoutIterPointer)?.run {
        LayoutLine(this)
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
    public fun getLineExtents(inkRect: Rectangle?, logicalRect: Rectangle?): Unit = pango_layout_iter_get_line_extents(
        pangoLayoutIterPointer,
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
    @PangoVersion1_16
    public fun getLineReadonly(): LayoutLine? = pango_layout_iter_get_line_readonly(pangoLayoutIterPointer)?.run {
        LayoutLine(this)
    }

    /**
     * Gets the current run.
     *
     * When iterating by run, at the end of each line, there's a position
     * with a null run, so this function can return null. The null run
     * at the end of each line ensures that all lines have at least one run,
     * even lines consisting of only a newline.
     *
     * Use the faster [method@Pango.LayoutIter.get_run_readonly] if you do not
     * plan to modify the contents of the run (glyphs, glyph widths, etc.).
     *
     * @return the current run
     */
    public fun getRun(): LayoutRun? = pango_layout_iter_get_run(pangoLayoutIterPointer)!!.run {
        GlyphItem(this)
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
    @PangoVersion1_50
    public fun getRunBaseline(): gint = pango_layout_iter_get_run_baseline(pangoLayoutIterPointer)

    /**
     * Gets the extents of the current run in layout coordinates.
     *
     * Layout coordinates have the origin at the top left of the entire layout.
     *
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public fun getRunExtents(inkRect: Rectangle?, logicalRect: Rectangle?): Unit = pango_layout_iter_get_run_extents(
        pangoLayoutIterPointer,
        inkRect?.pangoRectanglePointer,
        logicalRect?.pangoRectanglePointer
    )

    /**
     * Gets the current run for read-only access.
     *
     * When iterating by run, at the end of each line, there's a position
     * with a null run, so this function can return null. The null run
     * at the end of each line ensures that all lines have at least one run,
     * even lines consisting of only a newline.
     *
     * This is a faster alternative to [method@Pango.LayoutIter.get_run],
     * but the user is not expected to modify the contents of the run (glyphs,
     * glyph widths, etc.).
     *
     * @return the current run, that
     *   should not be modified
     * @since 1.16
     */
    @PangoVersion1_16
    public fun getRunReadonly(): LayoutRun? = pango_layout_iter_get_run_readonly(pangoLayoutIterPointer)!!.run {
        GlyphItem(this)
    }

    /**
     * Moves @iter forward to the next character in visual order.
     *
     * If @iter was already at the end of the layout, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextChar(): Boolean = pango_layout_iter_next_char(pangoLayoutIterPointer).asBoolean()

    /**
     * Moves @iter forward to the next cluster in visual order.
     *
     * If @iter was already at the end of the layout, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextCluster(): Boolean = pango_layout_iter_next_cluster(pangoLayoutIterPointer).asBoolean()

    /**
     * Moves @iter forward to the start of the next line.
     *
     * If @iter is already on the last line, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextLine(): Boolean = pango_layout_iter_next_line(pangoLayoutIterPointer).asBoolean()

    /**
     * Moves @iter forward to the next run in visual order.
     *
     * If @iter was already at the end of the layout, returns false.
     *
     * @return whether motion was possible
     */
    public fun nextRun(): Boolean = pango_layout_iter_next_run(pangoLayoutIterPointer).asBoolean()

    public companion object {
        /**
         * Get the GType of LayoutIter
         *
         * @return the GType
         */
        public fun getType(): GType = pango_layout_iter_get_type()
    }
}
