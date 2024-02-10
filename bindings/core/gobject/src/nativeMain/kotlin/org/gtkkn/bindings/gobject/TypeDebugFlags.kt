// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GTypeDebugFlags
import org.gtkkn.native.gobject.G_TYPE_DEBUG_INSTANCE_COUNT
import org.gtkkn.native.gobject.G_TYPE_DEBUG_MASK
import org.gtkkn.native.gobject.G_TYPE_DEBUG_NONE
import org.gtkkn.native.gobject.G_TYPE_DEBUG_OBJECTS
import org.gtkkn.native.gobject.G_TYPE_DEBUG_SIGNALS

/**
 * These flags used to be passed to g_type_init_with_debug_flags() which
 * is now deprecated.
 *
 * If you need to enable debugging features, use the GOBJECT_DEBUG
 * environment variable.
 */
public class TypeDebugFlags(
    public val mask: GTypeDebugFlags,
) : Bitfield<TypeDebugFlags> {
    override infix fun or(other: TypeDebugFlags): TypeDebugFlags = TypeDebugFlags(mask or other.mask)

    public companion object {
        /**
         * Print no messages
         */
        public val NONE: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_NONE)

        /**
         * Print messages about object bookkeeping
         */
        public val OBJECTS: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_OBJECTS)

        /**
         * Print messages about signal emissions
         */
        public val SIGNALS: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_SIGNALS)

        /**
         * Keep a count of instances of each type
         */
        public val INSTANCE_COUNT: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_INSTANCE_COUNT)

        /**
         * Mask covering all debug flags
         */
        public val MASK: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_MASK)
    }
}
