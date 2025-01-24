// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_LOCATION_ALL
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_LOCATION_INSIDE_TEXT
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_LOCATION_LEADING
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_LOCATION_NONE
import org.gtkkn.native.gtksource.GTK_SOURCE_SPACE_LOCATION_TRAILING
import org.gtkkn.native.gtksource.GtkSourceSpaceLocationFlags
import org.gtkkn.native.gtksource.gtk_source_space_location_flags_get_type

/**
 * #GtkSourceSpaceLocationFlags contains flags for white space locations.
 *
 * If a line contains only white spaces (no text), the white spaces match both
 * %GTK_SOURCE_SPACE_LOCATION_LEADING and %GTK_SOURCE_SPACE_LOCATION_TRAILING.
 */
public class SpaceLocationFlags(public val mask: GtkSourceSpaceLocationFlags) : Bitfield<SpaceLocationFlags> {
    override infix fun or(other: SpaceLocationFlags): SpaceLocationFlags = SpaceLocationFlags(mask or other.mask)

    public companion object {
        /**
         * No flags.
         */
        public val NONE: SpaceLocationFlags = SpaceLocationFlags(GTK_SOURCE_SPACE_LOCATION_NONE)

        /**
         * Leading white spaces on a line, i.e. the
         *   indentation.
         */
        public val LEADING: SpaceLocationFlags =
            SpaceLocationFlags(GTK_SOURCE_SPACE_LOCATION_LEADING)

        /**
         * White spaces inside a line of text.
         */
        public val INSIDE_TEXT: SpaceLocationFlags =
            SpaceLocationFlags(GTK_SOURCE_SPACE_LOCATION_INSIDE_TEXT)

        /**
         * Trailing white spaces on a line.
         */
        public val TRAILING: SpaceLocationFlags =
            SpaceLocationFlags(GTK_SOURCE_SPACE_LOCATION_TRAILING)

        /**
         * White spaces anywhere.
         */
        public val ALL: SpaceLocationFlags = SpaceLocationFlags(GTK_SOURCE_SPACE_LOCATION_ALL)

        /**
         * Get the GType of SpaceLocationFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_space_location_flags_get_type()
    }
}
