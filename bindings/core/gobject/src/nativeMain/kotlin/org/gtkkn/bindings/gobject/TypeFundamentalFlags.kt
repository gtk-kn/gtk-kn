// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GTypeFundamentalFlags
import org.gtkkn.native.gobject.G_TYPE_FLAG_CLASSED
import org.gtkkn.native.gobject.G_TYPE_FLAG_DEEP_DERIVABLE
import org.gtkkn.native.gobject.G_TYPE_FLAG_DERIVABLE
import org.gtkkn.native.gobject.G_TYPE_FLAG_INSTANTIATABLE

/**
 * Bit masks used to check or determine specific characteristics of a
 * fundamental type.
 */
public class TypeFundamentalFlags(public val mask: GTypeFundamentalFlags) : Bitfield<TypeFundamentalFlags> {
    override infix fun or(other: TypeFundamentalFlags): TypeFundamentalFlags = TypeFundamentalFlags(mask or other.mask)

    public companion object {
        /**
         * Indicates a classed type
         */
        public val CLASSED: TypeFundamentalFlags = TypeFundamentalFlags(G_TYPE_FLAG_CLASSED)

        /**
         * Indicates an instantiatable type (implies classed)
         */
        public val INSTANTIATABLE: TypeFundamentalFlags =
            TypeFundamentalFlags(G_TYPE_FLAG_INSTANTIATABLE)

        /**
         * Indicates a flat derivable type
         */
        public val DERIVABLE: TypeFundamentalFlags = TypeFundamentalFlags(G_TYPE_FLAG_DERIVABLE)

        /**
         * Indicates a deep derivable type (implies derivable)
         */
        public val DEEP_DERIVABLE: TypeFundamentalFlags =
            TypeFundamentalFlags(G_TYPE_FLAG_DEEP_DERIVABLE)
    }
}
