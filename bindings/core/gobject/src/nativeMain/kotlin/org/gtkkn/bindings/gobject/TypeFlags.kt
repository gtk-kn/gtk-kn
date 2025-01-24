// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GTypeFlags
import org.gtkkn.native.gobject.G_TYPE_FLAG_ABSTRACT
import org.gtkkn.native.gobject.G_TYPE_FLAG_DEPRECATED
import org.gtkkn.native.gobject.G_TYPE_FLAG_FINAL
import org.gtkkn.native.gobject.G_TYPE_FLAG_NONE
import org.gtkkn.native.gobject.G_TYPE_FLAG_VALUE_ABSTRACT

/**
 * Bit masks used to check or determine characteristics of a type.
 */
public class TypeFlags(public val mask: GTypeFlags) : Bitfield<TypeFlags> {
    override infix fun or(other: TypeFlags): TypeFlags = TypeFlags(mask or other.mask)

    public companion object {
        /**
         * No special flags. Since: 2.74
         */
        public val NONE: TypeFlags = TypeFlags(G_TYPE_FLAG_NONE)

        /**
         * Indicates an abstract type. No instances can be
         *  created for an abstract type
         */
        public val ABSTRACT: TypeFlags = TypeFlags(G_TYPE_FLAG_ABSTRACT)

        /**
         * Indicates an abstract value type, i.e. a type
         *  that introduces a value table, but can't be used for
         *  g_value_init()
         */
        public val VALUE_ABSTRACT: TypeFlags = TypeFlags(G_TYPE_FLAG_VALUE_ABSTRACT)

        /**
         * Indicates a final type. A final type is a non-derivable
         *  leaf node in a deep derivable type hierarchy tree. Since: 2.70
         */
        public val FINAL: TypeFlags = TypeFlags(G_TYPE_FLAG_FINAL)

        /**
         * The type is deprecated and may be removed in a
         *  future version. A warning will be emitted if it is instantiated while
         *  running with `G_ENABLE_DIAGNOSTIC=1`. Since 2.76
         */
        public val DEPRECATED: TypeFlags = TypeFlags(G_TYPE_FLAG_DEPRECATED)
    }
}
