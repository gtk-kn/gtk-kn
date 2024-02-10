// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkGridLayoutChild
import org.gtkkn.native.gtk.gtk_grid_layout_child_get_column
import org.gtkkn.native.gtk.gtk_grid_layout_child_get_column_span
import org.gtkkn.native.gtk.gtk_grid_layout_child_get_row
import org.gtkkn.native.gtk.gtk_grid_layout_child_get_row_span
import org.gtkkn.native.gtk.gtk_grid_layout_child_get_type
import org.gtkkn.native.gtk.gtk_grid_layout_child_set_column
import org.gtkkn.native.gtk.gtk_grid_layout_child_set_column_span
import org.gtkkn.native.gtk.gtk_grid_layout_child_set_row
import org.gtkkn.native.gtk.gtk_grid_layout_child_set_row_span
import kotlin.Int
import kotlin.Unit

/**
 * `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
 */
public open class GridLayoutChild(
    pointer: CPointer<GtkGridLayoutChild>,
) : LayoutChild(pointer.reinterpret()), KGTyped {
    public val gtkGridLayoutChildPointer: CPointer<GtkGridLayoutChild>
        get() = gPointer.reinterpret()

    /**
     * The column to place the child in.
     */
    public open var column: Int
        /**
         * Retrieves the column number to which @child attaches its left side.
         *
         * @return the column number
         */
        get() = gtk_grid_layout_child_get_column(gtkGridLayoutChildPointer.reinterpret())

        /**
         * Sets the column number to attach the left side of @child.
         *
         * @param column the attach point for @child
         */
        set(column) =
            gtk_grid_layout_child_set_column(
                gtkGridLayoutChildPointer.reinterpret(),
                column
            )

    /**
     * The number of columns the child spans to.
     */
    public open var columnSpan: Int
        /**
         * Retrieves the number of columns that @child spans to.
         *
         * @return the number of columns
         */
        get() = gtk_grid_layout_child_get_column_span(gtkGridLayoutChildPointer.reinterpret())

        /**
         * Sets the number of columns @child spans to.
         *
         * @param span the span of @child
         */
        set(span) =
            gtk_grid_layout_child_set_column_span(
                gtkGridLayoutChildPointer.reinterpret(),
                span
            )

    /**
     * The row to place the child in.
     */
    public open var row: Int
        /**
         * Retrieves the row number to which @child attaches its top side.
         *
         * @return the row number
         */
        get() = gtk_grid_layout_child_get_row(gtkGridLayoutChildPointer.reinterpret())

        /**
         * Sets the row to place @child in.
         *
         * @param row the row for @child
         */
        set(row) = gtk_grid_layout_child_set_row(gtkGridLayoutChildPointer.reinterpret(), row)

    /**
     * The number of rows the child spans to.
     */
    public open var rowSpan: Int
        /**
         * Retrieves the number of rows that @child spans to.
         *
         * @return the number of row
         */
        get() = gtk_grid_layout_child_get_row_span(gtkGridLayoutChildPointer.reinterpret())

        /**
         * Sets the number of rows @child spans to.
         *
         * @param span the span of @child
         */
        set(span) =
            gtk_grid_layout_child_set_row_span(
                gtkGridLayoutChildPointer.reinterpret(),
                span
            )

    /**
     * Retrieves the column number to which @child attaches its left side.
     *
     * @return the column number
     */
    public open fun getColumn(): Int = gtk_grid_layout_child_get_column(gtkGridLayoutChildPointer.reinterpret())

    /**
     * Retrieves the number of columns that @child spans to.
     *
     * @return the number of columns
     */
    public open fun getColumnSpan(): Int =
        gtk_grid_layout_child_get_column_span(gtkGridLayoutChildPointer.reinterpret())

    /**
     * Retrieves the row number to which @child attaches its top side.
     *
     * @return the row number
     */
    public open fun getRow(): Int = gtk_grid_layout_child_get_row(gtkGridLayoutChildPointer.reinterpret())

    /**
     * Retrieves the number of rows that @child spans to.
     *
     * @return the number of row
     */
    public open fun getRowSpan(): Int = gtk_grid_layout_child_get_row_span(gtkGridLayoutChildPointer.reinterpret())

    /**
     * Sets the column number to attach the left side of @child.
     *
     * @param column the attach point for @child
     */
    public open fun setColumn(column: Int): Unit =
        gtk_grid_layout_child_set_column(gtkGridLayoutChildPointer.reinterpret(), column)

    /**
     * Sets the number of columns @child spans to.
     *
     * @param span the span of @child
     */
    public open fun setColumnSpan(span: Int): Unit =
        gtk_grid_layout_child_set_column_span(gtkGridLayoutChildPointer.reinterpret(), span)

    /**
     * Sets the row to place @child in.
     *
     * @param row the row for @child
     */
    public open fun setRow(row: Int): Unit = gtk_grid_layout_child_set_row(gtkGridLayoutChildPointer.reinterpret(), row)

    /**
     * Sets the number of rows @child spans to.
     *
     * @param span the span of @child
     */
    public open fun setRowSpan(span: Int): Unit =
        gtk_grid_layout_child_set_row_span(gtkGridLayoutChildPointer.reinterpret(), span)

    public companion object : TypeCompanion<GridLayoutChild> {
        override val type: GeneratedClassKGType<GridLayoutChild> =
            GeneratedClassKGType(gtk_grid_layout_child_get_type()) {
                GridLayoutChild(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
