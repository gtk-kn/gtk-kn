// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceHover
import org.gtkkn.native.gtksource.gtk_source_hover_add_provider
import org.gtkkn.native.gtksource.gtk_source_hover_get_type
import org.gtkkn.native.gtksource.gtk_source_hover_remove_provider
import kotlin.Unit

/**
 * Interactive tooltips.
 *
 * `GtkSourceHover` allows a [class@View] to provide contextual information.
 * When enabled, if the user hovers over a word in the text editor, a series
 * of registered [iface@HoverProvider] can populate a [class@HoverDisplay]
 * with useful information.
 *
 * To enable call [method@View.get_hover] and add [iface@HoverProvider]
 * using [method@Hover.add_provider]. To disable, remove all registered
 * providers with [method@Hover.remove_provider].
 *
 * You can change how long to wait to display the interactive tooltip by
 * setting the [property@Hover:hover-delay] property in milliseconds.
 *
 * ## Skipped during bindings generation
 *
 * - method `hover-delay`: Property has no getter nor setter
 */
public open class Hover(pointer: CPointer<GtkSourceHover>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceHoverPointer: CPointer<GtkSourceHover>
        get() = gPointer.reinterpret()

    public open fun addProvider(provider: HoverProvider): Unit =
        gtk_source_hover_add_provider(gtksourceHoverPointer, provider.gtksourceHoverProviderPointer)

    public open fun removeProvider(provider: HoverProvider): Unit =
        gtk_source_hover_remove_provider(gtksourceHoverPointer, provider.gtksourceHoverProviderPointer)

    public companion object : TypeCompanion<Hover> {
        override val type: GeneratedClassKGType<Hover> =
            GeneratedClassKGType(gtk_source_hover_get_type()) { Hover(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of Hover
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_get_type()
    }
}
