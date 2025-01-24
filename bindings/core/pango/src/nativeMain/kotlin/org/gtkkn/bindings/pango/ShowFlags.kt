// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PANGO_SHOW_IGNORABLES
import org.gtkkn.native.pango.PANGO_SHOW_LINE_BREAKS
import org.gtkkn.native.pango.PANGO_SHOW_NONE
import org.gtkkn.native.pango.PANGO_SHOW_SPACES
import org.gtkkn.native.pango.PangoShowFlags
import org.gtkkn.native.pango.pango_show_flags_get_type

/**
 * These flags affect how Pango treats characters that are normally
 * not visible in the output.
 * @since 1.44
 */
public class ShowFlags(public val mask: PangoShowFlags) : Bitfield<ShowFlags> {
    override infix fun or(other: ShowFlags): ShowFlags = ShowFlags(mask or other.mask)

    @PangoVersion1_44
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

        /**
         * Get the GType of ShowFlags
         *
         * @return the GType
         */
        public fun getType(): GType = pango_show_flags_get_type()
    }
}
