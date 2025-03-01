// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public open class Hover(public val gtksourceHoverPointer: CPointer<GtkSourceHover>) :
    Object(gtksourceHoverPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    public open fun addProvider(provider: HoverProvider): Unit =
        gtk_source_hover_add_provider(gtksourceHoverPointer, provider.gtksourceHoverProviderPointer)

    public open fun removeProvider(provider: HoverProvider): Unit =
        gtk_source_hover_remove_provider(gtksourceHoverPointer, provider.gtksourceHoverProviderPointer)

    public companion object : TypeCompanion<Hover> {
        override val type: GeneratedClassKGType<Hover> =
            GeneratedClassKGType(getTypeOrNull()!!) { Hover(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of Hover
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_hover_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_hover_get_type")
    }
}
