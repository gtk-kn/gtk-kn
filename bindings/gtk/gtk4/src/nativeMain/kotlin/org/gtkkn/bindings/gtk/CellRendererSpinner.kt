// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCellRendererSpinner
import org.gtkkn.native.gtk.gtk_cell_renderer_spinner_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_spinner_new

/**
 * Renders a spinning animation in a cell
 *
 * `GtkCellRendererSpinner` renders a spinning animation in a cell, very
 * similar to `GtkSpinner`. It can often be used as an alternative
 * to a `GtkCellRendererProgress` for displaying indefinite activity,
 * instead of actual progress.
 *
 * To start the animation in a cell, set the `GtkCellRendererSpinner:active`
 * property to true and increment the `GtkCellRendererSpinner:pulse` property
 * at regular intervals. The usual way to set the cell renderer properties
 * for each cell is to bind them to columns in your tree model using e.g.
 * gtk_tree_view_column_add_attribute().
 *
 * ## Skipped during bindings generation
 *
 * - method `active`: Property has no getter nor setter
 * - method `pulse`: Property has no getter nor setter
 * - method `size`: Property has no getter nor setter
 */
public open class CellRendererSpinner(public val gtkCellRendererSpinnerPointer: CPointer<GtkCellRendererSpinner>) :
    CellRenderer(gtkCellRendererSpinnerPointer.reinterpret()),
    KGTyped {
    /**
     * Returns a new cell renderer which will show a spinner to indicate
     * activity.
     *
     * @return a new `GtkCellRenderer`
     */
    public constructor() : this(gtk_cell_renderer_spinner_new()!!.reinterpret())

    public companion object : TypeCompanion<CellRendererSpinner> {
        override val type: GeneratedClassKGType<CellRendererSpinner> =
            GeneratedClassKGType(gtk_cell_renderer_spinner_get_type()) { CellRendererSpinner(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellRendererSpinner
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_spinner_get_type()
    }
}
