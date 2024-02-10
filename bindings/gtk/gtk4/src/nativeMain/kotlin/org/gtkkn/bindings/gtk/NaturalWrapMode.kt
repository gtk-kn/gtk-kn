// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkNaturalWrapMode
import org.gtkkn.native.gtk.GtkNaturalWrapMode.GTK_NATURAL_WRAP_INHERIT
import org.gtkkn.native.gtk.GtkNaturalWrapMode.GTK_NATURAL_WRAP_NONE
import org.gtkkn.native.gtk.GtkNaturalWrapMode.GTK_NATURAL_WRAP_WORD

/**
 * Options for selecting a different wrap mode for natural size
 * requests.
 *
 * See for example the [property@Gtk.Label:natural-wrap-mode] property.
 * @since 4.6
 */
public enum class NaturalWrapMode(
    public val nativeValue: GtkNaturalWrapMode,
) {
    /**
     * Inherit the minimum size request.
     *   In particular, this should be used with %PANGO_WRAP_CHAR.
     */
    INHERIT(GTK_NATURAL_WRAP_INHERIT),

    /**
     * Try not to wrap the text. This mode is the
     *   closest to GTK3's behavior but can lead to a wide label leaving
     *   lots of empty space below the text.
     */
    NONE(GTK_NATURAL_WRAP_NONE),

    /**
     * Attempt to wrap at word boundaries. This
     *   is useful in particular when using %PANGO_WRAP_WORD_CHAR as the
     *   wrap mode.
     */
    WORD(GTK_NATURAL_WRAP_WORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkNaturalWrapMode): NaturalWrapMode =
            when (nativeValue) {
                GTK_NATURAL_WRAP_INHERIT -> INHERIT
                GTK_NATURAL_WRAP_NONE -> NONE
                GTK_NATURAL_WRAP_WORD -> WORD
                else -> error("invalid nativeValue")
            }
    }
}
