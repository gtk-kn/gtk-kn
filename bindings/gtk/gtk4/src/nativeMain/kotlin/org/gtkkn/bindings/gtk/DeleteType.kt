// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkDeleteType
import org.gtkkn.native.gtk.gtk_delete_type_get_type

/**
 * Passed to various keybinding signals for deleting text.
 */
public enum class DeleteType(public val nativeValue: GtkDeleteType) {
    /**
     * Delete characters.
     */
    CHARS(GtkDeleteType.GTK_DELETE_CHARS),

    /**
     * Delete only the portion of the word to the
     *   left/right of cursor if we’re in the middle of a word.
     */
    WORD_ENDS(GtkDeleteType.GTK_DELETE_WORD_ENDS),

    /**
     * Delete words.
     */
    WORDS(GtkDeleteType.GTK_DELETE_WORDS),

    /**
     * Delete display-lines. Display-lines
     *   refers to the visible lines, with respect to the current line
     *   breaks. As opposed to paragraphs, which are defined by line
     *   breaks in the input.
     */
    DISPLAY_LINES(GtkDeleteType.GTK_DELETE_DISPLAY_LINES),

    /**
     * Delete only the portion of the
     *   display-line to the left/right of cursor.
     */
    DISPLAY_LINE_ENDS(GtkDeleteType.GTK_DELETE_DISPLAY_LINE_ENDS),

    /**
     * Delete to the end of the
     *   paragraph. Like C-k in Emacs (or its reverse).
     */
    PARAGRAPH_ENDS(GtkDeleteType.GTK_DELETE_PARAGRAPH_ENDS),

    /**
     * Delete entire line. Like C-k in pico.
     */
    PARAGRAPHS(GtkDeleteType.GTK_DELETE_PARAGRAPHS),

    /**
     * Delete only whitespace. Like M-\ in Emacs.
     */
    WHITESPACE(GtkDeleteType.GTK_DELETE_WHITESPACE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkDeleteType): DeleteType = when (nativeValue) {
            GtkDeleteType.GTK_DELETE_CHARS -> CHARS
            GtkDeleteType.GTK_DELETE_WORD_ENDS -> WORD_ENDS
            GtkDeleteType.GTK_DELETE_WORDS -> WORDS
            GtkDeleteType.GTK_DELETE_DISPLAY_LINES -> DISPLAY_LINES
            GtkDeleteType.GTK_DELETE_DISPLAY_LINE_ENDS -> DISPLAY_LINE_ENDS
            GtkDeleteType.GTK_DELETE_PARAGRAPH_ENDS -> PARAGRAPH_ENDS
            GtkDeleteType.GTK_DELETE_PARAGRAPHS -> PARAGRAPHS
            GtkDeleteType.GTK_DELETE_WHITESPACE -> WHITESPACE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DeleteType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_delete_type_get_type()
    }
}
