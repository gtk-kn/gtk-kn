// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_TYPE_ALL
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_TYPE_NBSP
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_TYPE_NEWLINE
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_TYPE_NONE
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_TYPE_SPACE
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_TYPE_TAB
import org.gtkkn.native.gtksource.GtkSourceSpaceTypeFlags
import org.gtkkn.native.gtksource.gtk_source_space_type_flags_get_type

/**
 * #GtkSourceSpaceTypeFlags contains flags for white space types.
 */
public class SpaceTypeFlags(public val mask: GtkSourceSpaceTypeFlags) : Bitfield<SpaceTypeFlags> {
    override infix fun or(other: SpaceTypeFlags): SpaceTypeFlags = SpaceTypeFlags(mask or other.mask)

    public companion object {
        /**
         * No flags.
         */
        public val NONE: SpaceTypeFlags = SpaceTypeFlags(GTK_SOURCE_SPACE_TYPE_NONE)

        /**
         * Space character.
         */
        public val SPACE: SpaceTypeFlags = SpaceTypeFlags(GTK_SOURCE_SPACE_TYPE_SPACE)

        /**
         * Tab character.
         */
        public val TAB: SpaceTypeFlags = SpaceTypeFlags(GTK_SOURCE_SPACE_TYPE_TAB)

        /**
         * Line break character. If the
         *   #GtkSourceBuffer:implicit-trailing-newline property is true,
         *   #GtkSourceSpaceDrawer also draws a line break at the end of the buffer.
         */
        public val NEWLINE: SpaceTypeFlags = SpaceTypeFlags(GTK_SOURCE_SPACE_TYPE_NEWLINE)

        /**
         * Non-breaking space character.
         */
        public val NBSP: SpaceTypeFlags = SpaceTypeFlags(GTK_SOURCE_SPACE_TYPE_NBSP)

        /**
         * All white spaces.
         */
        public val ALL: SpaceTypeFlags = SpaceTypeFlags(GTK_SOURCE_SPACE_TYPE_ALL)

        /**
         * Get the GType of SpaceTypeFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_space_type_flags_get_type()
    }
}
