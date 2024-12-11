// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFontLevel
import org.gtkkn.native.gtk.gtk_font_level_get_type

/**
 * The level of granularity for the font selection.
 *
 * Depending on this value, the `PangoFontDescription` that
 * is returned by [method@Gtk.FontDialogButton.get_font_desc]
 * will have more or less fields set.
 * @since 4.10
 */
@GtkVersion4_10
public enum class FontLevel(public val nativeValue: GtkFontLevel) {
    /**
     * Select a font family
     */
    FAMILY(GtkFontLevel.GTK_FONT_LEVEL_FAMILY),

    /**
     * Select a font face (i.e. a family and a style)
     */
    FACE(GtkFontLevel.GTK_FONT_LEVEL_FACE),

    /**
     * Select a font (i.e. a face with a size, and possibly font variations)
     */
    FONT(GtkFontLevel.GTK_FONT_LEVEL_FONT),

    /**
     * Select a font and font features
     */
    FEATURES(GtkFontLevel.GTK_FONT_LEVEL_FEATURES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkFontLevel): FontLevel = when (nativeValue) {
            GtkFontLevel.GTK_FONT_LEVEL_FAMILY -> FAMILY
            GtkFontLevel.GTK_FONT_LEVEL_FACE -> FACE
            GtkFontLevel.GTK_FONT_LEVEL_FONT -> FONT
            GtkFontLevel.GTK_FONT_LEVEL_FEATURES -> FEATURES
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FontLevel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_level_get_type()
    }
}
