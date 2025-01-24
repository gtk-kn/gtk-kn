// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_ICON_LOOKUP_FORCE_REGULAR
import org.gtkkn.native.gtk.GTK_ICON_LOOKUP_FORCE_SYMBOLIC
import org.gtkkn.native.gtk.GTK_ICON_LOOKUP_PRELOAD
import org.gtkkn.native.gtk.GtkIconLookupFlags
import org.gtkkn.native.gtk.gtk_icon_lookup_flags_get_type

/**
 * Used to specify options for gtk_icon_theme_lookup_icon().
 */
public class IconLookupFlags(public val mask: GtkIconLookupFlags) : Bitfield<IconLookupFlags> {
    override infix fun or(other: IconLookupFlags): IconLookupFlags = IconLookupFlags(mask or other.mask)

    public companion object {
        /**
         * Try to always load regular icons, even
         *   when symbolic icon names are given
         */
        public val FORCE_REGULAR: IconLookupFlags = IconLookupFlags(GTK_ICON_LOOKUP_FORCE_REGULAR)

        /**
         * Try to always load symbolic icons, even
         *   when regular icon names are given
         */
        public val FORCE_SYMBOLIC: IconLookupFlags = IconLookupFlags(GTK_ICON_LOOKUP_FORCE_SYMBOLIC)

        /**
         * Starts loading the texture in the background
         *   so it is ready when later needed.
         */
        public val PRELOAD: IconLookupFlags = IconLookupFlags(GTK_ICON_LOOKUP_PRELOAD)

        /**
         * Get the GType of IconLookupFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_icon_lookup_flags_get_type()
    }
}
