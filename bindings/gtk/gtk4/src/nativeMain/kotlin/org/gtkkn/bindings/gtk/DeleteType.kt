// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkDeleteType
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_CHARS
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_DISPLAY_LINES
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_DISPLAY_LINE_ENDS
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_PARAGRAPHS
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_PARAGRAPH_ENDS
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_WHITESPACE
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_WORDS
import org.gtkkn.native.gtk.GtkDeleteType.GTK_DELETE_WORD_ENDS

/**
 * Passed to various keybinding signals for deleting text.
 */
public enum class DeleteType(
    public val nativeValue: GtkDeleteType,
) {
    /**
     * Delete characters.
     */
    CHARS(GTK_DELETE_CHARS),

    /**
     * Delete only the portion of the word to the
     *   left/right of cursor if we’re in the middle of a word.
     */
    WORD_ENDS(GTK_DELETE_WORD_ENDS),

    /**
     * Delete words.
     */
    WORDS(GTK_DELETE_WORDS),

    /**
     * Delete display-lines. Display-lines
     *   refers to the visible lines, with respect to the current line
     *   breaks. As opposed to paragraphs, which are defined by line
     *   breaks in the input.
     */
    DISPLAY_LINES(GTK_DELETE_DISPLAY_LINES),

    /**
     * Delete only the portion of the
     *   display-line to the left/right of cursor.
     */
    DISPLAY_LINE_ENDS(GTK_DELETE_DISPLAY_LINE_ENDS),

    /**
     * Delete to the end of the
     *   paragraph. Like C-k in Emacs (or its reverse).
     */
    PARAGRAPH_ENDS(GTK_DELETE_PARAGRAPH_ENDS),

    /**
     * Delete entire line. Like C-k in pico.
     */
    PARAGRAPHS(GTK_DELETE_PARAGRAPHS),

    /**
     * Delete only whitespace. Like M-\ in Emacs.
     */
    WHITESPACE(GTK_DELETE_WHITESPACE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkDeleteType): DeleteType =
            when (nativeValue) {
                GTK_DELETE_CHARS -> CHARS
                GTK_DELETE_WORD_ENDS -> WORD_ENDS
                GTK_DELETE_WORDS -> WORDS
                GTK_DELETE_DISPLAY_LINES -> DISPLAY_LINES
                GTK_DELETE_DISPLAY_LINE_ENDS -> DISPLAY_LINE_ENDS
                GTK_DELETE_PARAGRAPH_ENDS -> PARAGRAPH_ENDS
                GTK_DELETE_PARAGRAPHS -> PARAGRAPHS
                GTK_DELETE_WHITESPACE -> WHITESPACE
                else -> error("invalid nativeValue")
            }
    }
}
