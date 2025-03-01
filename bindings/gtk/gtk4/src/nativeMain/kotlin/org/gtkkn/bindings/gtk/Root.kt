// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.gtk_root_get_display
import org.gtkkn.native.gtk.gtk_root_get_focus
import org.gtkkn.native.gtk.gtk_root_get_type
import org.gtkkn.native.gtk.gtk_root_set_focus
import kotlin.Unit

/**
 * `GtkRoot` is the interface implemented by all widgets that can act as a toplevel
 * widget.
 *
 * The root widget takes care of providing the connection to the windowing system
 * and manages layout, drawing and event delivery for its widget hierarchy.
 *
 * The obvious example of a `GtkRoot` is `GtkWindow`.
 *
 * To get the display to which a `GtkRoot` belongs, use
 * [method@Gtk.Root.get_display].
 *
 * `GtkRoot` also maintains the location of keyboard focus inside its widget
 * hierarchy, with [method@Gtk.Root.set_focus] and [method@Gtk.Root.get_focus].
 */
public interface Root :
    Proxy,
    Native,
    KGTyped {
    public val gtkRootPointer: CPointer<GtkRoot>

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gtkRootPointer.reinterpret()

    /**
     * Returns the display that this `GtkRoot` is on.
     *
     * @return the display of @root
     */
    public fun getRootDisplay(): Display = gtk_root_get_display(gtkRootPointer)!!.run {
        InstanceCache.get(this, true) { Display(reinterpret()) }!!
    }

    /**
     * Retrieves the current focused widget within the root.
     *
     * Note that this is the widget that would have the focus
     * if the root is active; if the root is not focused then
     * `gtk_widget_has_focus (widget)` will be false for the
     * widget.
     *
     * @return the currently focused widget
     */
    public fun getFocus(): Widget? = gtk_root_get_focus(gtkRootPointer)?.run {
        InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
    }

    /**
     * If @focus is not the current focus widget, and is focusable, sets
     * it as the focus widget for the root.
     *
     * If @focus is null, unsets the focus widget for the root.
     *
     * To set the focus to a particular widget in the root, it is usually
     * more convenient to use [method@Gtk.Widget.grab_focus] instead of
     * this function.
     *
     * @param focus widget to be the new focus widget, or null
     *    to unset the focus widget
     */
    public fun setFocus(focus: Widget? = null): Unit = gtk_root_set_focus(gtkRootPointer, focus?.gtkWidgetPointer)

    /**
     * The RootImpl type represents a native instance of the Root interface.
     *
     * @constructor Creates a new instance of Root for the provided [CPointer].
     */
    public class RootImpl(gtkRootPointer: CPointer<GtkRoot>) :
        Widget(gtkRootPointer.reinterpret()),
        Root {
        init {
            Gtk
        }

        override val gtkRootPointer: CPointer<GtkRoot> = gtkRootPointer
    }

    public companion object : TypeCompanion<Root> {
        override val type: GeneratedInterfaceKGType<Root> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { RootImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Root
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_root_get_type()

        /**
         * Gets the GType of from the symbol `gtk_root_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_root_get_type")
    }
}
