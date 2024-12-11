// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkWrapMode
import org.gtkkn.native.gtk.gtk_wrap_mode_get_type

/**
 * Describes a type of line wrapping.
 */
public enum class WrapMode(public val nativeValue: GtkWrapMode) {
    /**
     * do not wrap lines; just make the text area wider
     */
    NONE(GtkWrapMode.GTK_WRAP_NONE),

    /**
     * wrap text, breaking lines anywhere the cursor can
     *   appear (between characters, usually - if you want to be technical,
     *   between graphemes, see pango_get_log_attrs())
     */
    CHAR(GtkWrapMode.GTK_WRAP_CHAR),

    /**
     * wrap text, breaking lines in between words
     */
    WORD(GtkWrapMode.GTK_WRAP_WORD),

    /**
     * wrap text, breaking lines in between words, or if
     *   that is not enough, also between graphemes
     */
    WORD_CHAR(GtkWrapMode.GTK_WRAP_WORD_CHAR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkWrapMode): WrapMode = when (nativeValue) {
            GtkWrapMode.GTK_WRAP_NONE -> NONE
            GtkWrapMode.GTK_WRAP_CHAR -> CHAR
            GtkWrapMode.GTK_WRAP_WORD -> WORD
            GtkWrapMode.GTK_WRAP_WORD_CHAR -> WORD_CHAR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of WrapMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_wrap_mode_get_type()
    }
}
