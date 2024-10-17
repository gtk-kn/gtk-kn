// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public interface StyleSchemeChooser : Interface, KGTyped {
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
        get() =
            gtk_source_style_scheme_chooser_get_style_scheme(
                gtksourceStyleSchemeChooserPointer.reinterpret()
            )!!.run {
                StyleScheme(reinterpret())
            }

        /**
         * Sets the scheme.
         *
         * @param scheme a #GtkSourceStyleScheme
         */
        set(scheme) =
            gtk_source_style_scheme_chooser_set_style_scheme(
                gtksourceStyleSchemeChooserPointer.reinterpret(),
                scheme.gtksourceStyleSchemePointer.reinterpret()
            )

    /**
     * Gets the currently-selected scheme.
     *
     * @return the currently-selected scheme.
     */
    public fun getStyleScheme(): StyleScheme =
        gtk_source_style_scheme_chooser_get_style_scheme(gtksourceStyleSchemeChooserPointer.reinterpret())!!.run {
            StyleScheme(reinterpret())
        }

    /**
     * Sets the scheme.
     *
     * @param scheme a #GtkSourceStyleScheme
     */
    public fun setStyleScheme(scheme: StyleScheme): Unit =
        gtk_source_style_scheme_chooser_set_style_scheme(
            gtksourceStyleSchemeChooserPointer.reinterpret(),
            scheme.gtksourceStyleSchemePointer.reinterpret()
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkSourceStyleSchemeChooser>,
    ) : StyleSchemeChooser {
        override val gtksourceStyleSchemeChooserPointer: CPointer<GtkSourceStyleSchemeChooser> =
            pointer
    }

    public companion object : TypeCompanion<StyleSchemeChooser> {
        override val type: GeneratedInterfaceKGType<StyleSchemeChooser> =
            GeneratedInterfaceKGType(gtk_source_style_scheme_chooser_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSourceStyleSchemeChooser>): StyleSchemeChooser = Wrapper(pointer)
    }
}
