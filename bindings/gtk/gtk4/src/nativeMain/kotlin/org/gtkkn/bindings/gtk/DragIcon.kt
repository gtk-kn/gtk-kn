// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Drag
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDragIcon
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.gtk_drag_icon_create_widget_for_value
import org.gtkkn.native.gtk.gtk_drag_icon_get_child
import org.gtkkn.native.gtk.gtk_drag_icon_get_for_drag
import org.gtkkn.native.gtk.gtk_drag_icon_get_type
import org.gtkkn.native.gtk.gtk_drag_icon_set_child
import org.gtkkn.native.gtk.gtk_drag_icon_set_from_paintable
import kotlin.Unit

/**
 * `GtkDragIcon` is a `GtkRoot` implementation for drag icons.
 *
 * A drag icon moves with the pointer during a Drag-and-Drop operation
 * and is destroyed when the drag ends.
 *
 * To set up a drag icon and associate it with an ongoing drag operation,
 * use [func@Gtk.DragIcon.get_for_drag] to get the icon for a drag. You can
 * then use it like any other widget and use [method@Gtk.DragIcon.set_child]
 * to set whatever widget should be used for the drag icon.
 *
 * Keep in mind that drag icons do not allow user input.
 */
public open class DragIcon(public val gtkDragIconPointer: CPointer<GtkDragIcon>) :
    Widget(gtkDragIconPointer.reinterpret()),
    Native,
    Root,
    KGTyped {
    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The widget to display as drag icon.
     */
    public open var child: Widget?
        /**
         * Gets the widget currently used as drag icon.
         *
         * @return The drag icon
         */
        get() = gtk_drag_icon_get_child(gtkDragIconPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the widget to display as the drag icon.
         *
         * @param child a `GtkWidget`
         */
        set(child) = gtk_drag_icon_set_child(gtkDragIconPointer, child?.gtkWidgetPointer)

    public companion object : TypeCompanion<DragIcon> {
        override val type: GeneratedClassKGType<DragIcon> =
            GeneratedClassKGType(gtk_drag_icon_get_type()) { DragIcon(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a widget that can be used as a drag icon for the given
         * @value.
         *
         * Supported types include strings, `GdkRGBA` and `GtkTextBuffer`.
         * If GTK does not know how to create a widget for a given value,
         * it will return null.
         *
         * This method is used to set the default drag icon on drag-and-drop
         * operations started by `GtkDragSource`, so you don't need to set
         * a drag icon using this function there.
         *
         * @param value a `GValue`
         * @return A new `GtkWidget`
         *   for displaying @value as a drag icon.
         */
        public fun createWidgetForValue(`value`: Value): Widget? =
            gtk_drag_icon_create_widget_for_value(`value`.gobjectValuePointer)?.run {
                Widget.WidgetImpl(this)
            }

        /**
         * Gets the `GtkDragIcon` in use with @drag.
         *
         * If no drag icon exists yet, a new one will be created
         * and shown.
         *
         * @param drag a `GdkDrag`
         * @return the `GtkDragIcon`
         */
        public fun getForDrag(drag: Drag): Widget = gtk_drag_icon_get_for_drag(drag.gdkDragPointer)!!.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Creates a `GtkDragIcon` that shows @paintable, and associates
         * it with the drag operation.
         *
         * The hotspot position on the paintable is aligned with the
         * hotspot of the cursor.
         *
         * @param drag a `GdkDrag`
         * @param paintable a `GdkPaintable` to display
         * @param hotX X coordinate of the hotspot
         * @param hotY Y coordinate of the hotspot
         */
        public fun setFromPaintable(drag: Drag, paintable: Paintable, hotX: gint, hotY: gint): Unit =
            gtk_drag_icon_set_from_paintable(drag.gdkDragPointer, paintable.gdkPaintablePointer, hotX, hotY)

        /**
         * Get the GType of DragIcon
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_drag_icon_get_type()
    }
}
