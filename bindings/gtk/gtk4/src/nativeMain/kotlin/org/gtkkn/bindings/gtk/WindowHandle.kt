// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkWindowHandle
import org.gtkkn.native.gtk.gtk_window_handle_get_child
import org.gtkkn.native.gtk.gtk_window_handle_get_type
import org.gtkkn.native.gtk.gtk_window_handle_new
import org.gtkkn.native.gtk.gtk_window_handle_set_child

/**
 * `GtkWindowHandle` is a titlebar area widget.
 *
 * When added into a window, it can be dragged to move the window, and handles
 * right click, double click and middle click as expected of a titlebar.
 *
 * # CSS nodes
 *
 * `GtkWindowHandle` has a single CSS node with the name `windowhandle`.
 *
 * # Accessibility
 *
 * Until GTK 4.10, `GtkWindowHandle` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Starting from GTK 4.12, `GtkWindowHandle` uses the `GTK_ACCESSIBLE_ROLE_GENERIC` role.
 */
public open class WindowHandle(public val gtkWindowHandlePointer: CPointer<GtkWindowHandle>) :
    Widget(gtkWindowHandlePointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = gtk_window_handle_get_child(gtkWindowHandlePointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = gtk_window_handle_set_child(gtkWindowHandlePointer, child?.gtkWidgetPointer)

    /**
     * Creates a new `GtkWindowHandle`.
     *
     * @return a new `GtkWindowHandle`.
     */
    public constructor() : this(gtk_window_handle_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<WindowHandle> {
        override val type: GeneratedClassKGType<WindowHandle> =
            GeneratedClassKGType(getTypeOrNull()!!) { WindowHandle(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of WindowHandle
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_window_handle_get_type()

        /**
         * Gets the GType of from the symbol `gtk_window_handle_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_window_handle_get_type")
    }
}
