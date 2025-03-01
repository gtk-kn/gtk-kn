// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceStyleSchemeChooser
import org.gtkkn.native.gtksource.GtkSourceStyleSchemeChooserWidget
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_widget_get_type
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_widget_new

/**
 * A widget for choosing style schemes.
 *
 * The `GtkSourceStyleSchemeChooserWidget` widget lets the user select a
 * style scheme. By default, the chooser presents a predefined list
 * of style schemes.
 *
 * To change the initially selected style scheme,
 * use [method@StyleSchemeChooser.set_style_scheme].
 * To get the selected style scheme
 * use [method@StyleSchemeChooser.get_style_scheme].
 */
public open class StyleSchemeChooserWidget(
    public val gtksourceStyleSchemeChooserWidgetPointer: CPointer<GtkSourceStyleSchemeChooserWidget>,
) : Widget(gtksourceStyleSchemeChooserWidgetPointer.reinterpret()),
    StyleSchemeChooser,
    KGTyped {
    init {
        GtkSource
    }

    override val gtksourceStyleSchemeChooserPointer: CPointer<GtkSourceStyleSchemeChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new #GtkSourceStyleSchemeChooserWidget.
     *
     * @return a new  #GtkSourceStyleSchemeChooserWidget.
     */
    public constructor() : this(gtk_source_style_scheme_chooser_widget_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<StyleSchemeChooserWidget> {
        override val type: GeneratedClassKGType<StyleSchemeChooserWidget> =
            GeneratedClassKGType(getTypeOrNull()!!) { StyleSchemeChooserWidget(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of StyleSchemeChooserWidget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_scheme_chooser_widget_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_style_scheme_chooser_widget_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_style_scheme_chooser_widget_get_type")
    }
}
