// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_16
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFontRendering
import org.gtkkn.native.gtk.gtk_font_rendering_get_type

/**
 * Values for the [property@Gtk.Settings:gtk-font-rendering] setting
 * that influence how GTK renders fonts.
 * @since 4.16
 */
@GtkVersion4_16
public enum class FontRendering(public val nativeValue: GtkFontRendering) {
    /**
     * Set up font rendering automatically,
     *   taking factors like screen resolution and scale into account
     */
    AUTOMATIC(GtkFontRendering.GTK_FONT_RENDERING_AUTOMATIC),

    /**
     * Follow low-level font-related settings
     *   when configuring font rendering
     */
    MANUAL(GtkFontRendering.GTK_FONT_RENDERING_MANUAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkFontRendering): FontRendering = when (nativeValue) {
            GtkFontRendering.GTK_FONT_RENDERING_AUTOMATIC -> AUTOMATIC
            GtkFontRendering.GTK_FONT_RENDERING_MANUAL -> MANUAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FontRendering
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_rendering_get_type()
    }
}
