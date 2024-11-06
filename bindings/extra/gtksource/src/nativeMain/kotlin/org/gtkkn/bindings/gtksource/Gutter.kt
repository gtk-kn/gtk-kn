// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceGutter
import org.gtkkn.native.gtksource.gtk_source_gutter_get_type
import org.gtkkn.native.gtksource.gtk_source_gutter_get_view
import org.gtkkn.native.gtksource.gtk_source_gutter_insert
import org.gtkkn.native.gtksource.gtk_source_gutter_remove
import org.gtkkn.native.gtksource.gtk_source_gutter_reorder
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * Gutter object for [class@View].
 *
 * The `GtkSourceGutter` object represents the left or right gutter of the text
 * view. It is used by [class@View] to draw the line numbers and
 * [class@Mark]s that might be present on a line. By packing
 * additional [class@GutterRenderer] objects in the gutter, you can extend the
 * gutter with your own custom drawings.
 *
 * To get a `GtkSourceGutter`, use the [method@View.get_gutter] function.
 *
 * The gutter works very much the same way as cells rendered in a [class@Gtk.TreeView].
 * The concept is similar, with the exception that the gutter does not have an
 * underlying [iface@Gtk.TreeModel]. The builtin line number renderer is at position
 * %GTK_SOURCE_VIEW_GUTTER_POSITION_LINES (-30) and the marks renderer is at
 * %GTK_SOURCE_VIEW_GUTTER_POSITION_MARKS (-20). The gutter sorts the renderers
 * in ascending order, from left to right. So the marks are displayed on the
 * right of the line numbers.
 *
 * ## Skipped during bindings generation
 *
 * - method `window-type`: Property has no getter nor setter
 */
public open class Gutter(
    pointer: CPointer<GtkSourceGutter>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtksourceGutterPointer: CPointer<GtkSourceGutter>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The #GtkSourceView of the gutter.
     */
    public open val view: View
        /**
         *
         *
         * @return the associated #GtkSourceView.
         */
        get() =
            gtk_source_gutter_get_view(gtksourceGutterPointer.reinterpret())!!.run {
                View(reinterpret())
            }

    /**
     *
     *
     * @return the associated #GtkSourceView.
     */
    public open fun getView(): View =
        gtk_source_gutter_get_view(gtksourceGutterPointer.reinterpret())!!.run {
            View(reinterpret())
        }

    /**
     * Insert @renderer into the gutter. If @renderer is yet unowned then gutter
     * claims its ownership. Otherwise just increases renderer's reference count.
     * @renderer cannot be already inserted to another gutter.
     *
     * @param renderer a gutter renderer (must inherit from #GtkSourceGutterRenderer).
     * @param position the renderer position.
     * @return true if operation succeeded. Otherwise false.
     */
    public open fun insert(
        renderer: GutterRenderer,
        position: Int,
    ): Boolean =
        gtk_source_gutter_insert(
            gtksourceGutterPointer.reinterpret(),
            renderer.gtksourceGutterRendererPointer.reinterpret(),
            position
        ).asBoolean()

    /**
     *
     *
     * @param renderer
     */
    public open fun remove(renderer: GutterRenderer): Unit =
        gtk_source_gutter_remove(
            gtksourceGutterPointer.reinterpret(),
            renderer.gtksourceGutterRendererPointer.reinterpret()
        )

    /**
     * Reorders @renderer in @gutter to new @position.
     *
     * @param renderer a #GtkCellRenderer.
     * @param position the new renderer position.
     */
    public open fun reorder(
        renderer: GutterRenderer,
        position: Int,
    ): Unit =
        gtk_source_gutter_reorder(
            gtksourceGutterPointer.reinterpret(),
            renderer.gtksourceGutterRendererPointer.reinterpret(),
            position
        )

    public companion object : TypeCompanion<Gutter> {
        override val type: GeneratedClassKGType<Gutter> =
            GeneratedClassKGType(gtk_source_gutter_get_type()) { Gutter(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }
    }
}
