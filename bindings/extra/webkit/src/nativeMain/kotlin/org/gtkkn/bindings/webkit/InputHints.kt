// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_INHIBIT_OSK
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_LOWERCASE
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_NONE
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_SPELLCHECK
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_UPPERCASE_CHARS
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_UPPERCASE_SENTENCES
import org.gtkkn.native.webkit.WEBKIT_INPUT_HINT_UPPERCASE_WORDS
import org.gtkkn.native.webkit.WebKitInputHints

/**
 * Enum values used to describe hints that might be taken into account by input methods.
 * @since 2.28
 */
public class InputHints(
    public val mask: WebKitInputHints,
) : Bitfield<InputHints> {
    override infix fun or(other: InputHints): InputHints = InputHints(mask or other.mask)

    @WebKitVersion2_28
    public companion object {
        /**
         * No special behavior suggested
         */
        public val NONE: InputHints = InputHints(WEBKIT_INPUT_HINT_NONE)

        /**
         * Suggest spell checking
         */
        public val SPELLCHECK: InputHints = InputHints(WEBKIT_INPUT_HINT_SPELLCHECK)

        /**
         * Suggest to not autocapitlize
         */
        public val LOWERCASE: InputHints = InputHints(WEBKIT_INPUT_HINT_LOWERCASE)

        /**
         * Suggest to capitalize all text
         */
        public val UPPERCASE_CHARS: InputHints = InputHints(WEBKIT_INPUT_HINT_UPPERCASE_CHARS)

        /**
         * Suggest to capitalize the first character of each word
         */
        public val UPPERCASE_WORDS: InputHints = InputHints(WEBKIT_INPUT_HINT_UPPERCASE_WORDS)

        /**
         * Suggest to capitalize the first word of each sentence
         */
        public val UPPERCASE_SENTENCES: InputHints =
            InputHints(WEBKIT_INPUT_HINT_UPPERCASE_SENTENCES)

        /**
         * Suggest to not show an onscreen keyboard
         */
        public val INHIBIT_OSK: InputHints = InputHints(WEBKIT_INPUT_HINT_INHIBIT_OSK)
    }
}
