// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCellRendererPixbuf
import org.gtkkn.native.gtk.gtk_cell_renderer_pixbuf_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_pixbuf_new

/**
 * Renders a pixbuf in a cell
 *
 * A `GtkCellRendererPixbuf` can be used to render an image in a cell. It allows
 * to render either a given `GdkPixbuf` (set via the
 * `GtkCellRendererPixbuf:pixbuf` property) or a named icon (set via the
 * `GtkCellRendererPixbuf:icon-name` property).
 *
 * To support the tree view, `GtkCellRendererPixbuf` also supports rendering two
 * alternative pixbufs, when the `GtkCellRenderer:is-expander` property is true.
 * If the `GtkCellRenderer:is-expanded property` is true and the
 * `GtkCellRendererPixbuf:pixbuf-expander-open` property is set to a pixbuf, it
 * renders that pixbuf, if the `GtkCellRenderer:is-expanded` property is false
 * and the `GtkCellRendererPixbuf:pixbuf-expander-closed` property is set to a
 * pixbuf, it renders that one.
 *
 * ## Skipped during bindings generation
 *
 * - method `gicon`: Property has no getter nor setter
 * - method `icon-name`: Property has no getter nor setter
 * - method `icon-size`: Property has no getter nor setter
 * - method `pixbuf`: Property has no getter nor setter
 * - method `pixbuf-expander-closed`: Property has no getter nor setter
 * - method `pixbuf-expander-open`: Property has no getter nor setter
 * - method `texture`: Property has no getter nor setter
 */
public open class CellRendererPixbuf(
    pointer: CPointer<GtkCellRendererPixbuf>,
) : CellRenderer(pointer.reinterpret()),
    KGTyped {
    public val gtkCellRendererPixbufPointer: CPointer<GtkCellRendererPixbuf>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkCellRendererPixbuf`. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with `GtkTreeViewColumn`, you
     * can bind a property to a value in a `GtkTreeModel`. For example, you
     * can bind the “pixbuf” property on the cell renderer to a pixbuf value
     * in the model, thus rendering a different image in each row of the
     * `GtkTreeView`.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_pixbuf_new()!!.reinterpret())

    public companion object : TypeCompanion<CellRendererPixbuf> {
        override val type: GeneratedClassKGType<CellRendererPixbuf> =
            GeneratedClassKGType(gtk_cell_renderer_pixbuf_get_type()) { CellRendererPixbuf(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
