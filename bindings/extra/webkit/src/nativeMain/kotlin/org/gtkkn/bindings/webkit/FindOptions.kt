// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WEBKIT_FIND_OPTIONS_AT_WORD_STARTS
import org.gtkkn.native.webkit.WEBKIT_FIND_OPTIONS_BACKWARDS
import org.gtkkn.native.webkit.WEBKIT_FIND_OPTIONS_CASE_INSENSITIVE
import org.gtkkn.native.webkit.WEBKIT_FIND_OPTIONS_NONE
import org.gtkkn.native.webkit.WEBKIT_FIND_OPTIONS_TREAT_MEDIAL_CAPITAL_AS_WORD_START
import org.gtkkn.native.webkit.WEBKIT_FIND_OPTIONS_WRAP_AROUND
import org.gtkkn.native.webkit.WebKitFindOptions
import org.gtkkn.native.webkit.webkit_find_options_get_type

/**
 * Enum values used to specify search options.
 */
public class FindOptions(public val mask: WebKitFindOptions) : Bitfield<FindOptions> {
    override infix fun or(other: FindOptions): FindOptions = FindOptions(mask or other.mask)

    public companion object {
        /**
         * no search flags, this means a case
         *   sensitive, no wrap, forward only search.
         */
        public val NONE: FindOptions = FindOptions(WEBKIT_FIND_OPTIONS_NONE)

        /**
         * case insensitive search.
         */
        public val CASE_INSENSITIVE: FindOptions = FindOptions(WEBKIT_FIND_OPTIONS_CASE_INSENSITIVE)

        /**
         * search text only at the
         *   begining of the words.
         */
        public val AT_WORD_STARTS: FindOptions = FindOptions(WEBKIT_FIND_OPTIONS_AT_WORD_STARTS)

        /**
         * treat
         *   capital letters in the middle of words as word start.
         */
        public val TREAT_MEDIAL_CAPITAL_AS_WORD_START: FindOptions =
            FindOptions(WEBKIT_FIND_OPTIONS_TREAT_MEDIAL_CAPITAL_AS_WORD_START)

        /**
         * search backwards.
         */
        public val BACKWARDS: FindOptions = FindOptions(WEBKIT_FIND_OPTIONS_BACKWARDS)

        /**
         * if not present search will stop
         *   at the end of the document.
         */
        public val WRAP_AROUND: FindOptions = FindOptions(WEBKIT_FIND_OPTIONS_WRAP_AROUND)

        /**
         * Get the GType of FindOptions
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_find_options_get_type()
    }
}
