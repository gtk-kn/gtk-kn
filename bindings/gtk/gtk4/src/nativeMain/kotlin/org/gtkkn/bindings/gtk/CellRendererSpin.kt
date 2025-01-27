// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCellRendererSpin
import org.gtkkn.native.gtk.gtk_cell_renderer_spin_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_spin_new

/**
 * Renders a spin button in a cell
 *
 * `GtkCellRendererSpin` renders text in a cell like `GtkCellRendererText` from
 * which it is derived. But while `GtkCellRendererText` offers a simple entry to
 * edit the text, `GtkCellRendererSpin` offers a `GtkSpinButton` widget. Of course,
 * that means that the text has to be parseable as a floating point number.
 *
 * The range of the spinbutton is taken from the adjustment property of the
 * cell renderer, which can be set explicitly or mapped to a column in the
 * tree model, like all properties of cell renders. `GtkCellRendererSpin`
 * also has properties for the `GtkCellRendererSpin:climb-rate` and the number
 * of `GtkCellRendererSpin:digits` to display. Other `GtkSpinButton` properties
 * can be set in a handler for the `GtkCellRenderer::editing-started` signal.
 *
 * ## Skipped during bindings generation
 *
 * - method `adjustment`: Property has no getter nor setter
 * - method `climb-rate`: Property has no getter nor setter
 * - method `digits`: Property has no getter nor setter
 */
public open class CellRendererSpin(public val gtkCellRendererSpinPointer: CPointer<GtkCellRendererSpin>) :
    CellRendererText(gtkCellRendererSpinPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkCellRendererSpin`.
     *
     * @return a new `GtkCellRendererSpin`
     */
    public constructor() : this(gtk_cell_renderer_spin_new()!!.reinterpret())

    public companion object : TypeCompanion<CellRendererSpin> {
        override val type: GeneratedClassKGType<CellRendererSpin> =
            GeneratedClassKGType(getTypeOrNull("gtk_cell_renderer_spin_get_type")!!) {
                CellRendererSpin(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellRendererSpin
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_spin_get_type()
    }
}
