// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_FONT_CHOOSER_LEVEL_FAMILY
import org.gtkkn.native.gtk.GTK_FONT_CHOOSER_LEVEL_FEATURES
import org.gtkkn.native.gtk.GTK_FONT_CHOOSER_LEVEL_SIZE
import org.gtkkn.native.gtk.GTK_FONT_CHOOSER_LEVEL_STYLE
import org.gtkkn.native.gtk.GTK_FONT_CHOOSER_LEVEL_VARIATIONS
import org.gtkkn.native.gtk.GtkFontChooserLevel
import org.gtkkn.native.gtk.gtk_font_chooser_level_get_type

/**
 * Specifies the granularity of font selection
 * that is desired in a `GtkFontChooser`.
 *
 * This enumeration may be extended in the future; applications should
 * ignore unknown values.
 */
public class FontChooserLevel(public val mask: GtkFontChooserLevel) : Bitfield<FontChooserLevel> {
    override infix fun or(other: FontChooserLevel): FontChooserLevel = FontChooserLevel(mask or other.mask)

    public companion object {
        /**
         * Allow selecting a font family
         */
        public val FAMILY: FontChooserLevel = FontChooserLevel(GTK_FONT_CHOOSER_LEVEL_FAMILY)

        /**
         * Allow selecting a specific font face
         */
        public val STYLE: FontChooserLevel = FontChooserLevel(GTK_FONT_CHOOSER_LEVEL_STYLE)

        /**
         * Allow selecting a specific font size
         */
        public val SIZE: FontChooserLevel = FontChooserLevel(GTK_FONT_CHOOSER_LEVEL_SIZE)

        /**
         * Allow changing OpenType font variation axes
         */
        public val VARIATIONS: FontChooserLevel =
            FontChooserLevel(GTK_FONT_CHOOSER_LEVEL_VARIATIONS)

        /**
         * Allow selecting specific OpenType font features
         */
        public val FEATURES: FontChooserLevel = FontChooserLevel(GTK_FONT_CHOOSER_LEVEL_FEATURES)

        /**
         * Get the GType of FontChooserLevel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_font_chooser_level_get_type()
    }
}
