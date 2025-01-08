// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkLayoutChild
import org.gtkkn.native.gtk.gtk_layout_child_get_child_widget
import org.gtkkn.native.gtk.gtk_layout_child_get_layout_manager
import org.gtkkn.native.gtk.gtk_layout_child_get_type

/**
 * `GtkLayoutChild` is the base class for objects that are meant to hold
 * layout properties.
 *
 * If a `GtkLayoutManager` has per-child properties, like their packing type,
 * or the horizontal and vertical span, or the icon name, then the layout
 * manager should use a `GtkLayoutChild` implementation to store those properties.
 *
 * A `GtkLayoutChild` instance is only ever valid while a widget is part
 * of a layout.
 */
public open class LayoutChild(pointer: CPointer<GtkLayoutChild>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkLayoutChildPointer: CPointer<GtkLayoutChild>
        get() = gPointer.reinterpret()

    /**
     * The widget that is associated to the `GtkLayoutChild` instance.
     */
    public open val childWidget: Widget
        /**
         * Retrieves the `GtkWidget` associated to the given @layout_child.
         *
         * @return a `GtkWidget`
         */
        get() = gtk_layout_child_get_child_widget(gtkLayoutChildPointer)!!.run {
            Widget(this)
        }

    /**
     * The layout manager that created the `GtkLayoutChild` instance.
     */
    public open val layoutManager: LayoutManager
        /**
         * Retrieves the `GtkLayoutManager` instance that created the
         * given @layout_child.
         *
         * @return a `GtkLayoutManager`
         */
        get() = gtk_layout_child_get_layout_manager(gtkLayoutChildPointer)!!.run {
            LayoutManager(this)
        }

    public companion object : TypeCompanion<LayoutChild> {
        override val type: GeneratedClassKGType<LayoutChild> =
            GeneratedClassKGType(gtk_layout_child_get_type()) { LayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_layout_child_get_type()
    }
}
