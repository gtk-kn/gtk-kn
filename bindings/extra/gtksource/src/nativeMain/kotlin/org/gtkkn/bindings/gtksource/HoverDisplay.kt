// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceHoverDisplay
import org.gtkkn.native.gtksource.gtk_source_hover_display_append
import org.gtkkn.native.gtksource.gtk_source_hover_display_get_type
import org.gtkkn.native.gtksource.gtk_source_hover_display_insert_after
import org.gtkkn.native.gtksource.gtk_source_hover_display_prepend
import org.gtkkn.native.gtksource.gtk_source_hover_display_remove
import kotlin.Unit

/**
 * Display for interactive tooltips.
 *
 * `GtkSourceHoverDisplay` is a [class@Gtk.Widget] that may be populated with widgets
 * to be displayed to the user in interactive tooltips. The children widgets
 * are packed vertically using a [class@Gtk.Box].
 *
 * Implement the [iface@HoverProvider] interface to be notified of when
 * to populate a `GtkSourceHoverDisplay` on behalf of the user.
 */
public open class HoverDisplay(pointer: CPointer<GtkSourceHoverDisplay>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtksourceHoverDisplayPointer: CPointer<GtkSourceHoverDisplay>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    public open fun append(child: Widget): Unit = gtk_source_hover_display_append(
        gtksourceHoverDisplayPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret()
    )

    public open fun insertAfter(child: Widget, sibling: Widget): Unit = gtk_source_hover_display_insert_after(
        gtksourceHoverDisplayPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret(),
        sibling.gtkWidgetPointer.reinterpret()
    )

    public open fun prepend(child: Widget): Unit = gtk_source_hover_display_prepend(
        gtksourceHoverDisplayPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret()
    )

    public open fun remove(child: Widget): Unit = gtk_source_hover_display_remove(
        gtksourceHoverDisplayPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret()
    )

    public companion object : TypeCompanion<HoverDisplay> {
        override val type: GeneratedClassKGType<HoverDisplay> =
            GeneratedClassKGType(gtk_source_hover_display_get_type()) { HoverDisplay(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of HoverDisplay
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_display_get_type()
    }
}
