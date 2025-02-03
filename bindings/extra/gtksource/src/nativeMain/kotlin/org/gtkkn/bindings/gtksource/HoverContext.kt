// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceHoverContext
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_bounds
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_buffer
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_iter
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_type
import org.gtkkn.native.gtksource.gtk_source_hover_context_get_view
import kotlin.Boolean

/**
 * Context for populating [class@HoverDisplay] contents.
 *
 * `GtkSourceHoverContext` contains information about the request to populate
 * contents for a [class@HoverDisplay].
 *
 * It can be used to retrieve the [class@View], [class@Buffer], and
 * [struct@Gtk.TextIter] for the regions of text which are being displayed.
 *
 * Use [method@HoverContext.get_bounds] to get the word that was
 * requested. [method@HoverContext.get_iter] will get you the location
 * of the pointer when the request was made.
 */
public open class HoverContext(public val gtksourceHoverContextPointer: CPointer<GtkSourceHoverContext>) :
    Object(gtksourceHoverContextPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    /**
     * Gets the current word bounds of the hover.
     *
     * If @begin is non-null, it will be set to the start position of the
     * current word being hovered.
     *
     * If @end is non-null, it will be set to the end position for the
     * current word being hovered.
     *
     * @param begin a #GtkTextIter
     * @param end a #GtkTextIter
     * @return true if the marks are still valid and @begin or @end was set.
     */
    public open fun getBounds(begin: TextIter?, end: TextIter?): Boolean = gtk_source_hover_context_get_bounds(
        gtksourceHoverContextPointer,
        begin?.gtkTextIterPointer,
        end?.gtkTextIterPointer
    ).asBoolean()

    /**
     * A convenience function to get the buffer.
     *
     * @return The #GtkSourceBuffer for the view
     */
    public open fun getBuffer(): Buffer = gtk_source_hover_context_get_buffer(gtksourceHoverContextPointer)!!.run {
        InstanceCache.get(this, true) { Buffer(reinterpret()) }!!
    }

    public open fun getIter(iter: TextIter): Boolean =
        gtk_source_hover_context_get_iter(gtksourceHoverContextPointer, iter.gtkTextIterPointer).asBoolean()

    /**
     *
     *
     * @return the #GtkSourceView that owns the context
     */
    public open fun getView(): View = gtk_source_hover_context_get_view(gtksourceHoverContextPointer)!!.run {
        InstanceCache.get(this, true) { View(reinterpret()) }!!
    }

    public companion object : TypeCompanion<HoverContext> {
        override val type: GeneratedClassKGType<HoverContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { HoverContext(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of HoverContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_context_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_hover_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_hover_context_get_type")
    }
}
