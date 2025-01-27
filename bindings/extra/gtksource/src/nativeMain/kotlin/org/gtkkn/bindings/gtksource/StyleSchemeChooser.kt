// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceStyleSchemeChooser
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_get_style_scheme
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_get_type
import org.gtkkn.native.gtksource.gtk_source_style_scheme_chooser_set_style_scheme
import kotlin.Unit

/**
 * Interface implemented by widgets for choosing style schemes.
 *
 * `GtkSourceStyleSchemeChooser` is an interface that is implemented by widgets
 * for choosing style schemes.
 *
 * In GtkSourceView, the main widgets that implement this interface are
 * [class@StyleSchemeChooserWidget] and [class@StyleSchemeChooserButton].
 */
public interface StyleSchemeChooser :
    Proxy,
    KGTyped {
    public val gtksourceStyleSchemeChooserPointer: CPointer<GtkSourceStyleSchemeChooser>

    /**
     * Contains the currently selected style scheme.
     *
     * The property can be set to change the current selection programmatically.
     */
    public var styleScheme: StyleScheme
        /**
         * Gets the currently-selected scheme.
         *
         * @return the currently-selected scheme.
         */
        get() = gtk_source_style_scheme_chooser_get_style_scheme(gtksourceStyleSchemeChooserPointer)!!.run {
            StyleScheme(this)
        }

        /**
         * Sets the scheme.
         *
         * @param scheme a #GtkSourceStyleScheme
         */
        set(
            scheme
        ) = gtk_source_style_scheme_chooser_set_style_scheme(
            gtksourceStyleSchemeChooserPointer,
            scheme.gtksourceStyleSchemePointer
        )

    /**
     * Gets the currently-selected scheme.
     *
     * @return the currently-selected scheme.
     */
    public fun getStyleScheme(): StyleScheme =
        gtk_source_style_scheme_chooser_get_style_scheme(gtksourceStyleSchemeChooserPointer)!!.run {
            StyleScheme(this)
        }

    /**
     * Sets the scheme.
     *
     * @param scheme a #GtkSourceStyleScheme
     */
    public fun setStyleScheme(scheme: StyleScheme): Unit = gtk_source_style_scheme_chooser_set_style_scheme(
        gtksourceStyleSchemeChooserPointer,
        scheme.gtksourceStyleSchemePointer
    )

    /**
     * The StyleSchemeChooserImpl type represents a native instance of the StyleSchemeChooser interface.
     *
     * @constructor Creates a new instance of StyleSchemeChooser for the provided [CPointer].
     */
    public data class StyleSchemeChooserImpl(
        override val gtksourceStyleSchemeChooserPointer: CPointer<GtkSourceStyleSchemeChooser>,
    ) : Object(gtksourceStyleSchemeChooserPointer.reinterpret()),
        StyleSchemeChooser

    public companion object : TypeCompanion<StyleSchemeChooser> {
        override val type: GeneratedInterfaceKGType<StyleSchemeChooser> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_source_style_scheme_chooser_get_type")!!) {
                StyleSchemeChooserImpl(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of StyleSchemeChooser
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_scheme_chooser_get_type()
    }
}
