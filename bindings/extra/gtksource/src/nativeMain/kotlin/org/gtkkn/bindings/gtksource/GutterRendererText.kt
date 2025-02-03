// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceGutterRendererText
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_get_type
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_new
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_set_markup
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_set_text
import kotlin.String
import kotlin.Unit

/**
 * Renders text in the gutter.
 *
 * A `GtkSourceGutterRendererText` can be used to render text in a cell of
 * [class@Gutter].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - method `markup`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 */
public open class GutterRendererText(
    public val gtksourceGutterRendererTextPointer: CPointer<GtkSourceGutterRendererText>,
) : GutterRenderer(gtksourceGutterRendererTextPointer.reinterpret()),
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

    /**
     * Create a new #GtkSourceGutterRendererText.
     *
     * @return A #GtkSourceGutterRenderer
     */
    public constructor() : this(gtk_source_gutter_renderer_text_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public open fun setMarkup(markup: String, length: gint): Unit =
        gtk_source_gutter_renderer_text_set_markup(gtksourceGutterRendererTextPointer, markup, length)

    public open fun setText(text: String, length: gint): Unit =
        gtk_source_gutter_renderer_text_set_text(gtksourceGutterRendererTextPointer, text, length)

    public companion object : TypeCompanion<GutterRendererText> {
        override val type: GeneratedClassKGType<GutterRendererText> =
            GeneratedClassKGType(getTypeOrNull()!!) { GutterRendererText(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of GutterRendererText
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_gutter_renderer_text_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_gutter_renderer_text_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_gutter_renderer_text_get_type")
    }
}
