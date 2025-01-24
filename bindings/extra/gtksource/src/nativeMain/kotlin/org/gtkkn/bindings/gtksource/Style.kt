// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextTag
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceStyle
import org.gtkkn.native.gtksource.gtk_source_style_apply
import org.gtkkn.native.gtksource.gtk_source_style_copy
import org.gtkkn.native.gtksource.gtk_source_style_get_type
import kotlin.Unit

/**
 * Represents a style.
 *
 * The `GtkSourceStyle` structure is used to describe text attributes
 * which are set when given style is used.
 *
 * ## Skipped during bindings generation
 *
 * - method `background`: Property has no getter nor setter
 * - method `background-set`: Property has no getter nor setter
 * - method `bold`: Property has no getter nor setter
 * - method `bold-set`: Property has no getter nor setter
 * - method `foreground`: Property has no getter nor setter
 * - method `foreground-set`: Property has no getter nor setter
 * - method `italic`: Property has no getter nor setter
 * - method `italic-set`: Property has no getter nor setter
 * - method `line-background`: Property has no getter nor setter
 * - method `line-background-set`: Property has no getter nor setter
 * - method `pango-underline`: Property has no getter nor setter
 * - method `scale`: Property has no getter nor setter
 * - method `scale-set`: Property has no getter nor setter
 * - method `strikethrough`: Property has no getter nor setter
 * - method `strikethrough-set`: Property has no getter nor setter
 * - method `underline-color`: Property has no getter nor setter
 * - method `underline-color-set`: Property has no getter nor setter
 * - method `underline-set`: Property has no getter nor setter
 * - method `weight`: Property has no getter nor setter
 * - method `weight-set`: Property has no getter nor setter
 */
public open class Style(public val gtksourceStylePointer: CPointer<GtkSourceStyle>) :
    Object(gtksourceStylePointer.reinterpret()),
    KGTyped {
    /**
     * This function modifies the [class@Gtk.TextTag] properties that are related to the
     * #GtkSourceStyle properties. Other [class@Gtk.TextTag] properties are left untouched.
     *
     * If @style is non-null, applies @style to @tag.
     *
     * If @style is null, the related *-set properties of [class@Gtk.TextTag] are set to
     * false.
     *
     * @param tag a #GtkTextTag to apply styles to.
     */
    public open fun apply(tag: TextTag): Unit = gtk_source_style_apply(gtksourceStylePointer, tag.gtkTextTagPointer)

    /**
     * Creates a copy of @style, that is a new #GtkSourceStyle instance which
     * has the same attributes set.
     *
     * @return copy of @style, call g_object_unref()
     * when you are done with it.
     */
    public open fun copy(): Style = gtk_source_style_copy(gtksourceStylePointer)!!.run {
        Style(this)
    }

    public companion object : TypeCompanion<Style> {
        override val type: GeneratedClassKGType<Style> =
            GeneratedClassKGType(gtk_source_style_get_type()) { Style(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of Style
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_get_type()
    }
}
