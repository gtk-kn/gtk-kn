// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_INPUT_HINT_EMOJI
import org.gtkkn.native.gtk.GTK_INPUT_HINT_INHIBIT_OSK
import org.gtkkn.native.gtk.GTK_INPUT_HINT_LOWERCASE
import org.gtkkn.native.gtk.GTK_INPUT_HINT_NONE
import org.gtkkn.native.gtk.GTK_INPUT_HINT_NO_EMOJI
import org.gtkkn.native.gtk.GTK_INPUT_HINT_NO_SPELLCHECK
import org.gtkkn.native.gtk.GTK_INPUT_HINT_PRIVATE
import org.gtkkn.native.gtk.GTK_INPUT_HINT_SPELLCHECK
import org.gtkkn.native.gtk.GTK_INPUT_HINT_UPPERCASE_CHARS
import org.gtkkn.native.gtk.GTK_INPUT_HINT_UPPERCASE_SENTENCES
import org.gtkkn.native.gtk.GTK_INPUT_HINT_UPPERCASE_WORDS
import org.gtkkn.native.gtk.GTK_INPUT_HINT_VERTICAL_WRITING
import org.gtkkn.native.gtk.GTK_INPUT_HINT_WORD_COMPLETION
import org.gtkkn.native.gtk.GtkInputHints
import org.gtkkn.native.gtk.gtk_input_hints_get_type

/**
 * Describes hints that might be taken into account by input methods
 * or applications.
 *
 * Note that input methods may already tailor their behaviour according
 * to the [enum@InputPurpose] of the entry.
 *
 * Some common sense is expected when using these flags - mixing
 * %GTK_INPUT_HINT_LOWERCASE with any of the uppercase hints makes no sense.
 *
 * This enumeration may be extended in the future; input methods should
 * ignore unknown values.
 */
public class InputHints(public val mask: GtkInputHints) : Bitfield<InputHints> {
    override infix fun or(other: InputHints): InputHints = InputHints(mask or other.mask)

    public companion object {
        /**
         * No special behaviour suggested
         */
        public val NONE: InputHints = InputHints(GTK_INPUT_HINT_NONE)

        /**
         * Suggest checking for typos
         */
        public val SPELLCHECK: InputHints = InputHints(GTK_INPUT_HINT_SPELLCHECK)

        /**
         * Suggest not checking for typos
         */
        public val NO_SPELLCHECK: InputHints = InputHints(GTK_INPUT_HINT_NO_SPELLCHECK)

        /**
         * Suggest word completion
         */
        public val WORD_COMPLETION: InputHints = InputHints(GTK_INPUT_HINT_WORD_COMPLETION)

        /**
         * Suggest to convert all text to lowercase
         */
        public val LOWERCASE: InputHints = InputHints(GTK_INPUT_HINT_LOWERCASE)

        /**
         * Suggest to capitalize all text
         */
        public val UPPERCASE_CHARS: InputHints = InputHints(GTK_INPUT_HINT_UPPERCASE_CHARS)

        /**
         * Suggest to capitalize the first
         *   character of each word
         */
        public val UPPERCASE_WORDS: InputHints = InputHints(GTK_INPUT_HINT_UPPERCASE_WORDS)

        /**
         * Suggest to capitalize the
         *   first word of each sentence
         */
        public val UPPERCASE_SENTENCES: InputHints = InputHints(GTK_INPUT_HINT_UPPERCASE_SENTENCES)

        /**
         * Suggest to not show an onscreen keyboard
         *   (e.g for a calculator that already has all the keys).
         */
        public val INHIBIT_OSK: InputHints = InputHints(GTK_INPUT_HINT_INHIBIT_OSK)

        /**
         * The text is vertical
         */
        public val VERTICAL_WRITING: InputHints = InputHints(GTK_INPUT_HINT_VERTICAL_WRITING)

        /**
         * Suggest offering Emoji support
         */
        public val EMOJI: InputHints = InputHints(GTK_INPUT_HINT_EMOJI)

        /**
         * Suggest not offering Emoji support
         */
        public val NO_EMOJI: InputHints = InputHints(GTK_INPUT_HINT_NO_EMOJI)

        /**
         * Request that the input method should not
         *    update personalized data (like typing history)
         */
        public val PRIVATE: InputHints = InputHints(GTK_INPUT_HINT_PRIVATE)

        /**
         * Get the GType of InputHints
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_input_hints_get_type()
    }
}
