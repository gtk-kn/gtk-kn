// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_PICK_DEFAULT
import org.gtkkn.native.gtk.GTK_PICK_INSENSITIVE
import org.gtkkn.native.gtk.GTK_PICK_NON_TARGETABLE
import org.gtkkn.native.gtk.GtkPickFlags
import org.gtkkn.native.gtk.gtk_pick_flags_get_type

/**
 * Flags that influence the behavior of [method@Widget.pick].
 */
public class PickFlags(public val mask: GtkPickFlags) : Bitfield<PickFlags> {
    override infix fun or(other: PickFlags): PickFlags = PickFlags(mask or other.mask)

    public companion object {
        /**
         * The default behavior, include widgets that are receiving events
         */
        public val DEFAULT: PickFlags = PickFlags(GTK_PICK_DEFAULT)

        /**
         * Include widgets that are insensitive
         */
        public val INSENSITIVE: PickFlags = PickFlags(GTK_PICK_INSENSITIVE)

        /**
         * Include widgets that are marked as non-targetable. See [property@Widget:can-target]
         */
        public val NON_TARGETABLE: PickFlags = PickFlags(GTK_PICK_NON_TARGETABLE)

        /**
         * Get the GType of PickFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_pick_flags_get_type()
    }
}
