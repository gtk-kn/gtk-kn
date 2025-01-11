// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkGridLayout
import org.gtkkn.native.gtk.gtk_grid_layout_get_baseline_row
import org.gtkkn.native.gtk.gtk_grid_layout_get_column_homogeneous
import org.gtkkn.native.gtk.gtk_grid_layout_get_column_spacing
import org.gtkkn.native.gtk.gtk_grid_layout_get_row_baseline_position
import org.gtkkn.native.gtk.gtk_grid_layout_get_row_homogeneous
import org.gtkkn.native.gtk.gtk_grid_layout_get_row_spacing
import org.gtkkn.native.gtk.gtk_grid_layout_get_type
import org.gtkkn.native.gtk.gtk_grid_layout_new
import org.gtkkn.native.gtk.gtk_grid_layout_set_baseline_row
import org.gtkkn.native.gtk.gtk_grid_layout_set_column_homogeneous
import org.gtkkn.native.gtk.gtk_grid_layout_set_column_spacing
import org.gtkkn.native.gtk.gtk_grid_layout_set_row_baseline_position
import org.gtkkn.native.gtk.gtk_grid_layout_set_row_homogeneous
import org.gtkkn.native.gtk.gtk_grid_layout_set_row_spacing
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkGridLayout` is a layout manager which arranges child widgets in
 * rows and columns.
 *
 * Children have an "attach point" defined by the horizontal and vertical
 * index of the cell they occupy; children can span multiple rows or columns.
 * The layout properties for setting the attach points and spans are set
 * using the [class@Gtk.GridLayoutChild] associated to each child widget.
 *
 * The behaviour of `GtkGridLayout` when several children occupy the same
 * grid cell is undefined.
 *
 * `GtkGridLayout` can be used like a `GtkBoxLayout` if all children are
 * attached to the same row or column; however, if you only ever need a
 * single row or column, you should consider using `GtkBoxLayout`.
 */
public open class GridLayout(public val gtkGridLayoutPointer: CPointer<GtkGridLayout>) :
    LayoutManager(gtkGridLayoutPointer.reinterpret()),
    KGTyped {
    /**
     * The row to align to the baseline, when `GtkWidget:valign` is set
     * to %GTK_ALIGN_BASELINE.
     */
    public open var baselineRow: gint
        /**
         * Retrieves the row set with gtk_grid_layout_set_baseline_row().
         *
         * @return the global baseline row
         */
        get() = gtk_grid_layout_get_baseline_row(gtkGridLayoutPointer)

        /**
         * Sets which row defines the global baseline for the entire grid.
         *
         * Each row in the grid can have its own local baseline, but only
         * one of those is global, meaning it will be the baseline in the
         * parent of the @grid.
         *
         * @param row the row index
         */
        set(row) = gtk_grid_layout_set_baseline_row(gtkGridLayoutPointer, row)

    /**
     * Whether all the columns in the grid have the same width.
     */
    public open var columnHomogeneous: Boolean
        /**
         * Checks whether all columns of @grid should have the same width.
         *
         * @return true if the columns are homogeneous, and false otherwise
         */
        get() = gtk_grid_layout_get_column_homogeneous(gtkGridLayoutPointer).asBoolean()

        /**
         * Sets whether all columns of @grid should have the same width.
         *
         * @param homogeneous true to make columns homogeneous
         */
        set(homogeneous) = gtk_grid_layout_set_column_homogeneous(gtkGridLayoutPointer, homogeneous.asGBoolean())

    /**
     * The amount of space between to consecutive columns.
     */
    public open var columnSpacing: guint
        /**
         * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
         *
         * @return the spacing between consecutive columns
         */
        get() = gtk_grid_layout_get_column_spacing(gtkGridLayoutPointer)

        /**
         * Sets the amount of space to insert between consecutive columns.
         *
         * @param spacing the amount of space between columns, in pixels
         */
        set(spacing) = gtk_grid_layout_set_column_spacing(gtkGridLayoutPointer, spacing)

    /**
     * Whether all the rows in the grid have the same height.
     */
    public open var rowHomogeneous: Boolean
        /**
         * Checks whether all rows of @grid should have the same height.
         *
         * @return true if the rows are homogeneous, and false otherwise
         */
        get() = gtk_grid_layout_get_row_homogeneous(gtkGridLayoutPointer).asBoolean()

        /**
         * Sets whether all rows of @grid should have the same height.
         *
         * @param homogeneous true to make rows homogeneous
         */
        set(homogeneous) = gtk_grid_layout_set_row_homogeneous(gtkGridLayoutPointer, homogeneous.asGBoolean())

    /**
     * The amount of space between to consecutive rows.
     */
    public open var rowSpacing: guint
        /**
         * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
         *
         * @return the spacing between consecutive rows
         */
        get() = gtk_grid_layout_get_row_spacing(gtkGridLayoutPointer)

        /**
         * Sets the amount of space to insert between consecutive rows.
         *
         * @param spacing the amount of space between rows, in pixels
         */
        set(spacing) = gtk_grid_layout_set_row_spacing(gtkGridLayoutPointer, spacing)

    /**
     * Creates a new `GtkGridLayout`.
     *
     * @return the newly created `GtkGridLayout`
     */
    public constructor() : this(gtk_grid_layout_new()!!.reinterpret())

    /**
     * Returns the baseline position of @row.
     *
     * If no value has been set with
     * [method@Gtk.GridLayout.set_row_baseline_position],
     * the default value of %GTK_BASELINE_POSITION_CENTER
     * is returned.
     *
     * @param row a row index
     * @return the baseline position of @row
     */
    public open fun getRowBaselinePosition(row: gint): BaselinePosition =
        gtk_grid_layout_get_row_baseline_position(gtkGridLayoutPointer, row).run {
            BaselinePosition.fromNativeValue(this)
        }

    /**
     * Sets how the baseline should be positioned on @row of the
     * grid, in case that row is assigned more space than is requested.
     *
     * @param row a row index
     * @param pos a `GtkBaselinePosition`
     */
    public open fun setRowBaselinePosition(row: gint, pos: BaselinePosition): Unit =
        gtk_grid_layout_set_row_baseline_position(gtkGridLayoutPointer, row, pos.nativeValue)

    public companion object : TypeCompanion<GridLayout> {
        override val type: GeneratedClassKGType<GridLayout> =
            GeneratedClassKGType(gtk_grid_layout_get_type()) { GridLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GridLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_grid_layout_get_type()
    }
}
