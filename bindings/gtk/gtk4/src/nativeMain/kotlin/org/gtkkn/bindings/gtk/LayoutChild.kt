// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public abstract class LayoutChild(public val gtkLayoutChildPointer: CPointer<GtkLayoutChild>) :
    Object(gtkLayoutChildPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

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
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
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
            InstanceCache.get(this, true) { LayoutManager.LayoutManagerImpl(reinterpret()) }!!
        }

    /**
     * The LayoutChildImpl type represents a native instance of the abstract LayoutChild class.
     *
     * @constructor Creates a new instance of LayoutChild for the provided [CPointer].
     */
    public class LayoutChildImpl(pointer: CPointer<GtkLayoutChild>) : LayoutChild(pointer)

    public companion object : TypeCompanion<LayoutChild> {
        override val type: GeneratedClassKGType<LayoutChild> =
            GeneratedClassKGType(getTypeOrNull()!!) { LayoutChildImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_layout_child_get_type()

        /**
         * Gets the GType of from the symbol `gtk_layout_child_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_layout_child_get_type")
    }
}
