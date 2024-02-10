// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.pango.PANGO_SHOW_IGNORABLES
import org.gtkkn.native.pango.PANGO_SHOW_LINE_BREAKS
import org.gtkkn.native.pango.PANGO_SHOW_NONE
import org.gtkkn.native.pango.PANGO_SHOW_SPACES
import org.gtkkn.native.pango.PangoShowFlags

/**
 * These flags affect how Pango treats characters that are normally
 * not visible in the output.
 * @since 1.44
 */
public class ShowFlags(
    public val mask: PangoShowFlags,
) : Bitfield<ShowFlags> {
    override infix fun or(other: ShowFlags): ShowFlags = ShowFlags(mask or other.mask)

    public companion object {
        /**
         * No special treatment for invisible characters
         */
        public val NONE: ShowFlags = ShowFlags(PANGO_SHOW_NONE)

        /**
         * Render spaces, tabs and newlines visibly
         */
        public val SPACES: ShowFlags = ShowFlags(PANGO_SHOW_SPACES)

        /**
         * Render line breaks visibly
         */
        public val LINE_BREAKS: ShowFlags = ShowFlags(PANGO_SHOW_LINE_BREAKS)

        /**
         * Render default-ignorable Unicode
         *   characters visibly
         */
        public val IGNORABLES: ShowFlags = ShowFlags(PANGO_SHOW_IGNORABLES)
    }
}
