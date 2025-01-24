// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNaturalWrapMode
import org.gtkkn.native.gtk.gtk_natural_wrap_mode_get_type

/**
 * Options for selecting a different wrap mode for natural size
 * requests.
 *
 * See for example the [property@Gtk.Label:natural-wrap-mode] property.
 * @since 4.6
 */
@GtkVersion4_6
public enum class NaturalWrapMode(public val nativeValue: GtkNaturalWrapMode) {
    /**
     * Inherit the minimum size request.
     *   In particular, this should be used with %PANGO_WRAP_CHAR.
     */
    INHERIT(GtkNaturalWrapMode.GTK_NATURAL_WRAP_INHERIT),

    /**
     * Try not to wrap the text. This mode is the
     *   closest to GTK3's behavior but can lead to a wide label leaving
     *   lots of empty space below the text.
     */
    NONE(GtkNaturalWrapMode.GTK_NATURAL_WRAP_NONE),

    /**
     * Attempt to wrap at word boundaries. This
     *   is useful in particular when using %PANGO_WRAP_WORD_CHAR as the
     *   wrap mode.
     */
    WORD(GtkNaturalWrapMode.GTK_NATURAL_WRAP_WORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkNaturalWrapMode): NaturalWrapMode = when (nativeValue) {
            GtkNaturalWrapMode.GTK_NATURAL_WRAP_INHERIT -> INHERIT
            GtkNaturalWrapMode.GTK_NATURAL_WRAP_NONE -> NONE
            GtkNaturalWrapMode.GTK_NATURAL_WRAP_WORD -> WORD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NaturalWrapMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_natural_wrap_mode_get_type()
    }
}
