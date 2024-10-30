// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCellRendererProgress
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_cell_renderer_progress_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_progress_new

/**
 * Renders numbers as progress bars
 *
 * `GtkCellRendererProgress` renders a numeric value as a progress par in a cell.
 * Additionally, it can display a text on top of the progress bar.
 *
 * ## Skipped during bindings generation
 *
 * - method `inverted`: Property has no getter nor setter
 * - method `pulse`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 * - method `text-xalign`: Property has no getter nor setter
 * - method `text-yalign`: Property has no getter nor setter
 * - method `value`: Property has no getter nor setter
 */
public open class CellRendererProgress(
    pointer: CPointer<GtkCellRendererProgress>,
) : CellRenderer(pointer.reinterpret()),
    Orientable,
    KGTyped {
    public val gtkCellRendererProgressPointer: CPointer<GtkCellRendererProgress>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkCellRendererProgress`.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_progress_new()!!.reinterpret())

    public companion object : TypeCompanion<CellRendererProgress> {
        override val type: GeneratedClassKGType<CellRendererProgress> =
            GeneratedClassKGType(gtk_cell_renderer_progress_get_type()) { CellRendererProgress(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
