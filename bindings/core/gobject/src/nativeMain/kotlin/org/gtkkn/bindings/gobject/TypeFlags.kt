// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GTypeFlags
import org.gtkkn.native.gobject.G_TYPE_FLAG_ABSTRACT
import org.gtkkn.native.gobject.G_TYPE_FLAG_FINAL
import org.gtkkn.native.gobject.G_TYPE_FLAG_VALUE_ABSTRACT

/**
 * Bit masks used to check or determine characteristics of a type.
 */
public class TypeFlags(
    public val mask: GTypeFlags,
) : Bitfield<TypeFlags> {
    override infix fun or(other: TypeFlags): TypeFlags = TypeFlags(mask or other.mask)

    public companion object {
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
    }
}
