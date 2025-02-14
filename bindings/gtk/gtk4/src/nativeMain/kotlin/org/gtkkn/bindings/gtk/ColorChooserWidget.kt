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
import org.gtkkn.native.gtk.GtkColorChooser
import org.gtkkn.native.gtk.GtkColorChooserWidget
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_color_chooser_widget_get_type
import org.gtkkn.native.gtk.gtk_color_chooser_widget_new

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Direct use of `GtkColorChooserWidget` is deprecated.
 * ---
 *
 * The `GtkColorChooserWidget` widget lets the user select a color.
 *
 * By default, the chooser presents a predefined palette of colors,
 * plus a small number of settable custom colors. It is also possible
 * to select a different color with the single-color editor.
 *
 * To enter the single-color editing mode, use the context menu of any
 * color of the palette, or use the '+' button to add a new custom color.
 *
 * The chooser automatically remembers the last selection, as well
 * as custom colors.
 *
 * To create a `GtkColorChooserWidget`, use [ctor@Gtk.ColorChooserWidget.new].
 *
 * To change the initially selected color, use
 * [method@Gtk.ColorChooser.set_rgba]. To get the selected color use
 * [method@Gtk.ColorChooser.get_rgba].
 *
 * The `GtkColorChooserWidget` is used in the [class@Gtk.ColorChooserDialog]
 * to provide a dialog for selecting colors.
 *
 * # Actions
 *
 * `GtkColorChooserWidget` defines a set of built-in actions:
 *
 * - `color.customize` activates the color editor for the given color.
 * - `color.select` emits the [signal@Gtk.ColorChooser::color-activated] signal
 *   for the given color.
 *
 * # CSS names
 *
 * `GtkColorChooserWidget` has a single CSS node with name colorchooser.
 *
 * ## Skipped during bindings generation
 *
 * - method `show-editor`: Property has no getter nor setter
 */
public open class ColorChooserWidget(public val gtkColorChooserWidgetPointer: CPointer<GtkColorChooserWidget>) :
    Widget(gtkColorChooserWidgetPointer.reinterpret()),
    ColorChooser,
    KGTyped {
    init {
        Gtk
    }

    override val gtkColorChooserPointer: CPointer<GtkColorChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkColorChooserWidget`.
     *
     * @return a new `GtkColorChooserWidget`
     */
    public constructor() : this(gtk_color_chooser_widget_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ColorChooserWidget> {
        override val type: GeneratedClassKGType<ColorChooserWidget> =
            GeneratedClassKGType(getTypeOrNull()!!) { ColorChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColorChooserWidget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_color_chooser_widget_get_type()

        /**
         * Gets the GType of from the symbol `gtk_color_chooser_widget_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_color_chooser_widget_get_type")
    }
}
