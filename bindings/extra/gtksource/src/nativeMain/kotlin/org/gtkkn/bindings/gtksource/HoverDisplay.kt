// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public open class HoverDisplay(public val gtksourceHoverDisplayPointer: CPointer<GtkSourceHoverDisplay>) :
    Widget(gtksourceHoverDisplayPointer.reinterpret()),
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

    public open fun append(child: Widget): Unit =
        gtk_source_hover_display_append(gtksourceHoverDisplayPointer, child.gtkWidgetPointer)

    public open fun insertAfter(child: Widget, sibling: Widget): Unit = gtk_source_hover_display_insert_after(
        gtksourceHoverDisplayPointer,
        child.gtkWidgetPointer,
        sibling.gtkWidgetPointer
    )

    public open fun prepend(child: Widget): Unit =
        gtk_source_hover_display_prepend(gtksourceHoverDisplayPointer, child.gtkWidgetPointer)

    public open fun remove(child: Widget): Unit =
        gtk_source_hover_display_remove(gtksourceHoverDisplayPointer, child.gtkWidgetPointer)

    public companion object : TypeCompanion<HoverDisplay> {
        override val type: GeneratedClassKGType<HoverDisplay> =
            GeneratedClassKGType(getTypeOrNull()!!) { HoverDisplay(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of HoverDisplay
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_display_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_hover_display_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_hover_display_get_type")
    }
}
