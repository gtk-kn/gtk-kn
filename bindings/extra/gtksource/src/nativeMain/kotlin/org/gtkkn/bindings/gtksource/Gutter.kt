// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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
public open class Gutter(public val gtksourceGutterPointer: CPointer<GtkSourceGutter>) :
    Widget(gtksourceGutterPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The #GtkSourceView of the gutter.
     */
    public open val view: View
        /**
         *
         *
         * @return the associated #GtkSourceView.
         */
        get() = gtk_source_gutter_get_view(gtksourceGutterPointer)!!.run {
            InstanceCache.get(this, true) { View(reinterpret()) }!!
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
    public open fun insert(renderer: GutterRenderer, position: gint): Boolean =
        gtk_source_gutter_insert(gtksourceGutterPointer, renderer.gtksourceGutterRendererPointer, position).asBoolean()

    public open fun remove(renderer: GutterRenderer): Unit =
        gtk_source_gutter_remove(gtksourceGutterPointer, renderer.gtksourceGutterRendererPointer)

    /**
     * Reorders @renderer in @gutter to new @position.
     *
     * @param renderer a #GtkCellRenderer.
     * @param position the new renderer position.
     */
    public open fun reorder(renderer: GutterRenderer, position: gint): Unit =
        gtk_source_gutter_reorder(gtksourceGutterPointer, renderer.gtksourceGutterRendererPointer, position)

    public companion object : TypeCompanion<Gutter> {
        override val type: GeneratedClassKGType<Gutter> =
            GeneratedClassKGType(getTypeOrNull()!!) { Gutter(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of Gutter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_gutter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_gutter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_gutter_get_type")
    }
}
