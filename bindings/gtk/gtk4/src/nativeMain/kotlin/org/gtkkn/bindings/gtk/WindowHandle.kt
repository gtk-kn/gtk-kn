// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class WindowHandle(pointer: CPointer<GtkWindowHandle>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkWindowHandlePointer: CPointer<GtkWindowHandle>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

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
            Widget(this)
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
    public constructor() : this(gtk_window_handle_new()!!.reinterpret())

    public companion object : TypeCompanion<WindowHandle> {
        override val type: GeneratedClassKGType<WindowHandle> =
            GeneratedClassKGType(gtk_window_handle_get_type()) { WindowHandle(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of WindowHandle
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_window_handle_get_type()
    }
}
