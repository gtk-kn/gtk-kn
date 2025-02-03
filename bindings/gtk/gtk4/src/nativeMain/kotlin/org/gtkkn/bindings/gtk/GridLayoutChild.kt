// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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

/**
 * `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
 */
public open class GridLayoutChild(public val gtkGridLayoutChildPointer: CPointer<GtkGridLayoutChild>) :
    LayoutChild(gtkGridLayoutChildPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The column to place the child in.
     */
    public open var column: gint
        /**
         * Retrieves the column number to which @child attaches its left side.
         *
         * @return the column number
         */
        get() = gtk_grid_layout_child_get_column(gtkGridLayoutChildPointer)

        /**
         * Sets the column number to attach the left side of @child.
         *
         * @param column the attach point for @child
         */
        set(column) = gtk_grid_layout_child_set_column(gtkGridLayoutChildPointer, column)

    /**
     * The number of columns the child spans to.
     */
    public open var columnSpan: gint
        /**
         * Retrieves the number of columns that @child spans to.
         *
         * @return the number of columns
         */
        get() = gtk_grid_layout_child_get_column_span(gtkGridLayoutChildPointer)

        /**
         * Sets the number of columns @child spans to.
         *
         * @param span the span of @child
         */
        set(span) = gtk_grid_layout_child_set_column_span(gtkGridLayoutChildPointer, span)

    /**
     * The row to place the child in.
     */
    public open var row: gint
        /**
         * Retrieves the row number to which @child attaches its top side.
         *
         * @return the row number
         */
        get() = gtk_grid_layout_child_get_row(gtkGridLayoutChildPointer)

        /**
         * Sets the row to place @child in.
         *
         * @param row the row for @child
         */
        set(row) = gtk_grid_layout_child_set_row(gtkGridLayoutChildPointer, row)

    /**
     * The number of rows the child spans to.
     */
    public open var rowSpan: gint
        /**
         * Retrieves the number of rows that @child spans to.
         *
         * @return the number of row
         */
        get() = gtk_grid_layout_child_get_row_span(gtkGridLayoutChildPointer)

        /**
         * Sets the number of rows @child spans to.
         *
         * @param span the span of @child
         */
        set(span) = gtk_grid_layout_child_set_row_span(gtkGridLayoutChildPointer, span)

    public companion object : TypeCompanion<GridLayoutChild> {
        override val type: GeneratedClassKGType<GridLayoutChild> =
            GeneratedClassKGType(getTypeOrNull()!!) { GridLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GridLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_grid_layout_child_get_type()

        /**
         * Gets the GType of from the symbol `gtk_grid_layout_child_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_grid_layout_child_get_type")
    }
}
