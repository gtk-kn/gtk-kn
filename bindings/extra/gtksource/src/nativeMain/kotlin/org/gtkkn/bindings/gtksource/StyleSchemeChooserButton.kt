// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceStyleSchemeChooser
import org.gtkkn.native.gtksource.GtkSourceStyleSchemeChooserButton
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_button_get_type
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_button_new

/**
 * A button to launch a style scheme selection dialog.
 *
 * The `GtkSourceStyleSchemeChooserButton` is a button which displays
 * the currently selected style scheme and allows to open a style scheme
 * selection dialog to change the style scheme.
 * It is suitable widget for selecting a style scheme in a preference dialog.
 *
 * In `GtkSourceStyleSchemeChooserButton`, a [class@StyleSchemeChooserWidget]
 * is used to provide a dialog for selecting style schemes.
 */
public open class StyleSchemeChooserButton(
    public val gtksourceStyleSchemeChooserButtonPointer: CPointer<GtkSourceStyleSchemeChooserButton>,
) : Button(gtksourceStyleSchemeChooserButtonPointer.reinterpret()),
    StyleSchemeChooser,
    KGTyped {
    override val gtksourceStyleSchemeChooserPointer: CPointer<GtkSourceStyleSchemeChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new #GtkSourceStyleSchemeChooserButton.
     *
     * @return a new #GtkSourceStyleSchemeChooserButton.
     */
    public constructor() : this(gtk_source_style_scheme_chooser_button_new()!!.reinterpret())

    public companion object : TypeCompanion<StyleSchemeChooserButton> {
        override val type: GeneratedClassKGType<StyleSchemeChooserButton> =
            GeneratedClassKGType(getTypeOrNull("gtk_source_style_scheme_chooser_button_get_type")!!) {
                StyleSchemeChooserButton(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of StyleSchemeChooserButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_scheme_chooser_button_get_type()
    }
}
