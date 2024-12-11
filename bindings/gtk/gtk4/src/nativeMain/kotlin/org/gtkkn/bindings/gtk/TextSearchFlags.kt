// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_TEXT_SEARCH_CASE_INSENSITIVE
import org.gtkkn.native.gtk.GTK_TEXT_SEARCH_TEXT_ONLY
import org.gtkkn.native.gtk.GTK_TEXT_SEARCH_VISIBLE_ONLY
import org.gtkkn.native.gtk.GtkTextSearchFlags
import org.gtkkn.native.gtk.gtk_text_search_flags_get_type

/**
 * Flags affecting how a search is done.
 *
 * If neither %GTK_TEXT_SEARCH_VISIBLE_ONLY nor %GTK_TEXT_SEARCH_TEXT_ONLY are
 * enabled, the match must be exact; the special 0xFFFC character will match
 * embedded paintables or child widgets.
 */
public class TextSearchFlags(public val mask: GtkTextSearchFlags) : Bitfield<TextSearchFlags> {
    override infix fun or(other: TextSearchFlags): TextSearchFlags = TextSearchFlags(mask or other.mask)

    public companion object {
        /**
         * Search only visible data. A search match may
         * have invisible text interspersed.
         */
        public val VISIBLE_ONLY: TextSearchFlags = TextSearchFlags(GTK_TEXT_SEARCH_VISIBLE_ONLY)

        /**
         * Search only text. A match may have paintables or
         * child widgets mixed inside the matched range.
         */
        public val TEXT_ONLY: TextSearchFlags = TextSearchFlags(GTK_TEXT_SEARCH_TEXT_ONLY)

        /**
         * The text will be matched regardless of
         * what case it is in.
         */
        public val CASE_INSENSITIVE: TextSearchFlags =
            TextSearchFlags(GTK_TEXT_SEARCH_CASE_INSENSITIVE)

        /**
         * Get the GType of TextSearchFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_search_flags_get_type()
    }
}
