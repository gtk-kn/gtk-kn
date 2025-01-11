// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
        Display(this)
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
        Widget.WidgetImpl(this)
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
    public data class RootImpl(override val gtkRootPointer: CPointer<GtkRoot>) :
        Widget(gtkRootPointer.reinterpret()),
        Root

    public companion object : TypeCompanion<Root> {
        override val type: GeneratedInterfaceKGType<Root> =
            GeneratedInterfaceKGType(gtk_root_get_type()) { RootImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Root
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_root_get_type()
    }
}
