// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkWrapMode
import org.gtkkn.native.gtk.GtkWrapMode.GTK_WRAP_CHAR
import org.gtkkn.native.gtk.GtkWrapMode.GTK_WRAP_NONE
import org.gtkkn.native.gtk.GtkWrapMode.GTK_WRAP_WORD
import org.gtkkn.native.gtk.GtkWrapMode.GTK_WRAP_WORD_CHAR

/**
 * Describes a type of line wrapping.
 */
public enum class WrapMode(
    public val nativeValue: GtkWrapMode,
) {
    /**
     * do not wrap lines; just make the text area wider
     */
    NONE(GTK_WRAP_NONE),

    /**
     * wrap text, breaking lines anywhere the cursor can
     *   appear (between characters, usually - if you want to be technical,
     *   between graphemes, see pango_get_log_attrs())
     */
    CHAR(GTK_WRAP_CHAR),

    /**
     * wrap text, breaking lines in between words
     */
    WORD(GTK_WRAP_WORD),

    /**
     * wrap text, breaking lines in between words, or if
     *   that is not enough, also between graphemes
     */
    WORD_CHAR(GTK_WRAP_WORD_CHAR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkWrapMode): WrapMode =
            when (nativeValue) {
                GTK_WRAP_NONE -> NONE
                GTK_WRAP_CHAR -> CHAR
                GTK_WRAP_WORD -> WORD
                GTK_WRAP_WORD_CHAR -> WORD_CHAR
                else -> error("invalid nativeValue")
            }
    }
}
