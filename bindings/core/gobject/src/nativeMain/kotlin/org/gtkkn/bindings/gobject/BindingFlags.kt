// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GBindingFlags
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.G_BINDING_BIDIRECTIONAL
import org.gtkkn.native.gobject.G_BINDING_DEFAULT
import org.gtkkn.native.gobject.G_BINDING_INVERT_BOOLEAN
import org.gtkkn.native.gobject.G_BINDING_SYNC_CREATE
import org.gtkkn.native.gobject.g_binding_flags_get_type

/**
 * Flags to be passed to g_object_bind_property() or
 * g_object_bind_property_full().
 *
 * This enumeration can be extended at later date.
 * @since 2.26
 */
public class BindingFlags(public val mask: GBindingFlags) : Bitfield<BindingFlags> {
    override infix fun or(other: BindingFlags): BindingFlags = BindingFlags(mask or other.mask)

    @GObjectVersion2_26
    public companion object {
        /**
         * The default binding; if the source property
         *   changes, the target property is updated with its value.
         */
        public val DEFAULT: BindingFlags = BindingFlags(G_BINDING_DEFAULT)

        /**
         * Bidirectional binding; if either the
         *   property of the source or the property of the target changes,
         *   the other is updated.
         */
        public val BIDIRECTIONAL: BindingFlags = BindingFlags(G_BINDING_BIDIRECTIONAL)

        /**
         * Synchronize the values of the source and
         *   target properties when creating the binding; the direction of
         *   the synchronization is always from the source to the target.
         */
        public val SYNC_CREATE: BindingFlags = BindingFlags(G_BINDING_SYNC_CREATE)

        /**
         * If the two properties being bound are
         *   booleans, setting one to true will result in the other being
         *   set to false and vice versa. This flag will only work for
         *   boolean properties, and cannot be used when passing custom
         *   transformation functions to g_object_bind_property_full().
         */
        public val INVERT_BOOLEAN: BindingFlags = BindingFlags(G_BINDING_INVERT_BOOLEAN)

        /**
         * Get the GType of BindingFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_binding_flags_get_type()
    }
}
