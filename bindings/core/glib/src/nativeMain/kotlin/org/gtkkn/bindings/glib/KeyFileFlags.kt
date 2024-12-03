// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GKeyFileFlags
import org.gtkkn.native.glib.G_KEY_FILE_KEEP_COMMENTS
import org.gtkkn.native.glib.G_KEY_FILE_KEEP_TRANSLATIONS
import org.gtkkn.native.glib.G_KEY_FILE_NONE

/**
 * Flags which influence the parsing.
 */
public class KeyFileFlags(public val mask: GKeyFileFlags) : Bitfield<KeyFileFlags> {
    override infix fun or(other: KeyFileFlags): KeyFileFlags = KeyFileFlags(mask or other.mask)

    public companion object {
        /**
         * No flags, default behaviour
         */
        public val NONE: KeyFileFlags = KeyFileFlags(G_KEY_FILE_NONE)

        /**
         * Use this flag if you plan to write the
         *   (possibly modified) contents of the key file back to a file;
         *   otherwise all comments will be lost when the key file is
         *   written back.
         */
        public val KEEP_COMMENTS: KeyFileFlags = KeyFileFlags(G_KEY_FILE_KEEP_COMMENTS)

        /**
         * Use this flag if you plan to write the
         *   (possibly modified) contents of the key file back to a file;
         *   otherwise only the translations for the current language will be
         *   written back.
         */
        public val KEEP_TRANSLATIONS: KeyFileFlags = KeyFileFlags(G_KEY_FILE_KEEP_TRANSLATIONS)
    }
}
