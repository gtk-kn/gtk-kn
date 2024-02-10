// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCellAreaContext
import org.gtkkn.native.gtk.gtk_cell_area_context_allocate
import org.gtkkn.native.gtk.gtk_cell_area_context_get_area
import org.gtkkn.native.gtk.gtk_cell_area_context_get_type
import org.gtkkn.native.gtk.gtk_cell_area_context_push_preferred_height
import org.gtkkn.native.gtk.gtk_cell_area_context_push_preferred_width
import org.gtkkn.native.gtk.gtk_cell_area_context_reset
import kotlin.Int
import kotlin.Unit

/**
 * Stores geometrical information for a series of rows in a GtkCellArea
 *
 * The `GtkCellAreaContext` object is created by a given `GtkCellArea`
 * implementation via its `GtkCellAreaClass.create_context()` virtual
 * method and is used to store cell sizes and alignments for a series of
 * `GtkTreeModel` rows that are requested and rendered in the same context.
 *
 * `GtkCellLayout` widgets can create any number of contexts in which to
 * request and render groups of data rows. However, it’s important that the
 * same context which was used to request sizes for a given `GtkTreeModel`
 * row also be used for the same row when calling other `GtkCellArea` APIs
 * such as gtk_cell_area_render() and gtk_cell_area_event().
 *
 * ## Skipped during bindings generation
 *
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `minimum_height`: minimum_height: Out parameter is not supported
 * - parameter `minimum_height`: minimum_height: Out parameter is not supported
 * - parameter `minimum_width`: minimum_width: Out parameter is not supported
 * - parameter `minimum_width`: minimum_width: Out parameter is not supported
 * - method `minimum-height`: Property has no getter nor setter
 * - method `minimum-width`: Property has no getter nor setter
 * - method `natural-height`: Property has no getter nor setter
 * - method `natural-width`: Property has no getter nor setter
 */
public open class CellAreaContext(
    pointer: CPointer<GtkCellAreaContext>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gtkCellAreaContextPointer: CPointer<GtkCellAreaContext>
        get() = gPointer.reinterpret()

    /**
     * The `GtkCellArea` this context was created by
     */
    public open val area: CellArea
        /**
         * Fetches the `GtkCellArea` this @context was created by.
         *
         * This is generally unneeded by layouting widgets; however,
         * it is important for the context implementation itself to
         * fetch information about the area it is being used for.
         *
         * For instance at `GtkCellAreaContextClass.allocate()` time
         * it’s important to know details about any cell spacing
         * that the `GtkCellArea` is configured with in order to
         * compute a proper allocation.
         *
         * @return the `GtkCellArea` this context was created by.
         */
        get() =
            gtk_cell_area_context_get_area(gtkCellAreaContextPointer.reinterpret())!!.run {
                CellArea(reinterpret())
            }

    /**
     * Allocates a width and/or a height for all rows which are to be
     * rendered with @context.
     *
     * Usually allocation is performed only horizontally or sometimes
     * vertically since a group of rows are usually rendered side by
     * side vertically or horizontally and share either the same width
     * or the same height. Sometimes they are allocated in both horizontal
     * and vertical orientations producing a homogeneous effect of the
     * rows. This is generally the case for `GtkTreeView` when
     * `GtkTreeView:fixed-height-mode` is enabled.
     *
     * @param width the allocated width for all `GtkTreeModel` rows rendered
     *   with @context, or -1
     * @param height the allocated height for all `GtkTreeModel` rows rendered
     *   with @context, or -1
     */
    public open fun allocate(
        width: Int,
        height: Int,
    ): Unit = gtk_cell_area_context_allocate(gtkCellAreaContextPointer.reinterpret(), width, height)

    /**
     * Fetches the `GtkCellArea` this @context was created by.
     *
     * This is generally unneeded by layouting widgets; however,
     * it is important for the context implementation itself to
     * fetch information about the area it is being used for.
     *
     * For instance at `GtkCellAreaContextClass.allocate()` time
     * it’s important to know details about any cell spacing
     * that the `GtkCellArea` is configured with in order to
     * compute a proper allocation.
     *
     * @return the `GtkCellArea` this context was created by.
     */
    public open fun getArea(): CellArea =
        gtk_cell_area_context_get_area(gtkCellAreaContextPointer.reinterpret())!!.run {
            CellArea(reinterpret())
        }

    /**
     * Causes the minimum and/or natural height to grow if the new
     * proposed sizes exceed the current minimum and natural height.
     *
     * This is used by `GtkCellAreaContext` implementations during
     * the request process over a series of `GtkTreeModel` rows to
     * progressively push the requested height over a series of
     * gtk_cell_area_get_preferred_height() requests.
     *
     * @param minimumHeight the proposed new minimum height for @context
     * @param naturalHeight the proposed new natural height for @context
     */
    public open fun pushPreferredHeight(
        minimumHeight: Int,
        naturalHeight: Int,
    ): Unit =
        gtk_cell_area_context_push_preferred_height(
            gtkCellAreaContextPointer.reinterpret(),
            minimumHeight,
            naturalHeight
        )

    /**
     * Causes the minimum and/or natural width to grow if the new
     * proposed sizes exceed the current minimum and natural width.
     *
     * This is used by `GtkCellAreaContext` implementations during
     * the request process over a series of `GtkTreeModel` rows to
     * progressively push the requested width over a series of
     * gtk_cell_area_get_preferred_width() requests.
     *
     * @param minimumWidth the proposed new minimum width for @context
     * @param naturalWidth the proposed new natural width for @context
     */
    public open fun pushPreferredWidth(
        minimumWidth: Int,
        naturalWidth: Int,
    ): Unit =
        gtk_cell_area_context_push_preferred_width(
            gtkCellAreaContextPointer.reinterpret(),
            minimumWidth,
            naturalWidth
        )

    /**
     * Resets any previously cached request and allocation
     * data.
     *
     * When underlying `GtkTreeModel` data changes its
     * important to reset the context if the content
     * size is allowed to shrink. If the content size
     * is only allowed to grow (this is usually an option
     * for views rendering large data stores as a measure
     * of optimization), then only the row that changed
     * or was inserted needs to be (re)requested with
     * gtk_cell_area_get_preferred_width().
     *
     * When the new overall size of the context requires
     * that the allocated size changes (or whenever this
     * allocation changes at all), the variable row
     * sizes need to be re-requested for every row.
     *
     * For instance, if the rows are displayed all with
     * the same width from top to bottom then a change
     * in the allocated width necessitates a recalculation
     * of all the displayed row heights using
     * gtk_cell_area_get_preferred_height_for_width().
     */
    public open fun reset(): Unit = gtk_cell_area_context_reset(gtkCellAreaContextPointer.reinterpret())

    public companion object : TypeCompanion<CellAreaContext> {
        override val type: GeneratedClassKGType<CellAreaContext> =
            GeneratedClassKGType(gtk_cell_area_context_get_type()) {
                CellAreaContext(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
