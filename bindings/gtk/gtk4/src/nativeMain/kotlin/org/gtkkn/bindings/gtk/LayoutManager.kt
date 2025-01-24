// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkLayoutManager
import org.gtkkn.native.gtk.gtk_layout_manager_allocate
import org.gtkkn.native.gtk.gtk_layout_manager_get_layout_child
import org.gtkkn.native.gtk.gtk_layout_manager_get_request_mode
import org.gtkkn.native.gtk.gtk_layout_manager_get_type
import org.gtkkn.native.gtk.gtk_layout_manager_get_widget
import org.gtkkn.native.gtk.gtk_layout_manager_layout_changed
import kotlin.Unit

/**
 * Layout managers are delegate classes that handle the preferred size
 * and the allocation of a widget.
 *
 * You typically subclass `GtkLayoutManager` if you want to implement a
 * layout policy for the children of a widget, or if you want to determine
 * the size of a widget depending on its contents.
 *
 * Each `GtkWidget` can only have a `GtkLayoutManager` instance associated
 * to it at any given time; it is possible, though, to replace the layout
 * manager instance using [method@Gtk.Widget.set_layout_manager].
 *
 * ## Layout properties
 *
 * A layout manager can expose properties for controlling the layout of
 * each child, by creating an object type derived from [class@Gtk.LayoutChild]
 * and installing the properties on it as normal `GObject` properties.
 *
 * Each `GtkLayoutChild` instance storing the layout properties for a
 * specific child is created through the [method@Gtk.LayoutManager.get_layout_child]
 * method; a `GtkLayoutManager` controls the creation of its `GtkLayoutChild`
 * instances by overriding the GtkLayoutManagerClass.create_layout_child()
 * virtual function. The typical implementation should look like:
 *
 * ```c
 * static GtkLayoutChild *
 * create_layout_child (GtkLayoutManager *manager,
 *                      GtkWidget        *container,
 *                      GtkWidget        *child)
 * {
 *   return g_object_new (your_layout_child_get_type (),
 *                        "layout-manager", manager,
 *                        "child-widget", child,
 *                        NULL);
 * }
 * ```
 *
 * The [property@Gtk.LayoutChild:layout-manager] and
 * [property@Gtk.LayoutChild:child-widget] properties
 * on the newly created `GtkLayoutChild` instance are mandatory. The
 * `GtkLayoutManager` will cache the newly created `GtkLayoutChild` instance
 * until the widget is removed from its parent, or the parent removes the
 * layout manager.
 *
 * Each `GtkLayoutManager` instance creating a `GtkLayoutChild` should use
 * [method@Gtk.LayoutManager.get_layout_child] every time it needs to query
 * the layout properties; each `GtkLayoutChild` instance should call
 * [method@Gtk.LayoutManager.layout_changed] every time a property is
 * updated, in order to queue a new size measuring and allocation.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `minimum`: minimum: Out parameter is not supported
 */
public abstract class LayoutManager(public val gtkLayoutManagerPointer: CPointer<GtkLayoutManager>) :
    Object(gtkLayoutManagerPointer.reinterpret()),
    KGTyped {
    /**
     * Assigns the given @width, @height, and @baseline to
     * a @widget, and computes the position and sizes of the children of
     * the @widget using the layout management policy of @manager.
     *
     * @param widget the `GtkWidget` using @manager
     * @param width the new width of the @widget
     * @param height the new height of the @widget
     * @param baseline the baseline position of the @widget, or -1
     */
    public open fun allocate(widget: Widget, width: gint, height: gint, baseline: gint): Unit =
        gtk_layout_manager_allocate(gtkLayoutManagerPointer, widget.gtkWidgetPointer, width, height, baseline)

    /**
     * Retrieves a `GtkLayoutChild` instance for the `GtkLayoutManager`,
     * creating one if necessary.
     *
     * The @child widget must be a child of the widget using @manager.
     *
     * The `GtkLayoutChild` instance is owned by the `GtkLayoutManager`,
     * and is guaranteed to exist as long as @child is a child of the
     * `GtkWidget` using the given `GtkLayoutManager`.
     *
     * @param child a `GtkWidget`
     * @return a `GtkLayoutChild`
     */
    public open fun getLayoutChild(child: Widget): LayoutChild =
        gtk_layout_manager_get_layout_child(gtkLayoutManagerPointer, child.gtkWidgetPointer)!!.run {
            LayoutChild.LayoutChildImpl(this)
        }

    /**
     * Retrieves the request mode of @manager.
     *
     * @return a `GtkSizeRequestMode`
     */
    public open fun getRequestMode(): SizeRequestMode =
        gtk_layout_manager_get_request_mode(gtkLayoutManagerPointer).run {
            SizeRequestMode.fromNativeValue(this)
        }

    /**
     * Retrieves the `GtkWidget` using the given `GtkLayoutManager`.
     *
     * @return a `GtkWidget`
     */
    public open fun getWidget(): Widget? = gtk_layout_manager_get_widget(gtkLayoutManagerPointer)?.run {
        Widget.WidgetImpl(this)
    }

    /**
     * Queues a resize on the `GtkWidget` using @manager, if any.
     *
     * This function should be called by subclasses of `GtkLayoutManager`
     * in response to changes to their layout management policies.
     */
    public open fun layoutChanged(): Unit = gtk_layout_manager_layout_changed(gtkLayoutManagerPointer)

    /**
     * The LayoutManagerImpl type represents a native instance of the abstract LayoutManager class.
     *
     * @constructor Creates a new instance of LayoutManager for the provided [CPointer].
     */
    public class LayoutManagerImpl(pointer: CPointer<GtkLayoutManager>) : LayoutManager(pointer)

    public companion object : TypeCompanion<LayoutManager> {
        override val type: GeneratedClassKGType<LayoutManager> =
            GeneratedClassKGType(gtk_layout_manager_get_type()) { LayoutManagerImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LayoutManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_layout_manager_get_type()
    }
}
