// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GTypeDebugFlags
import org.gtkkn.native.gobject.G_TYPE_DEBUG_INSTANCE_COUNT
import org.gtkkn.native.gobject.G_TYPE_DEBUG_MASK
import org.gtkkn.native.gobject.G_TYPE_DEBUG_NONE
import org.gtkkn.native.gobject.G_TYPE_DEBUG_OBJECTS
import org.gtkkn.native.gobject.G_TYPE_DEBUG_SIGNALS

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.36.
 *
 * g_type_init() is now done automatically
 * ---
 *
 * These flags used to be passed to g_type_init_with_debug_flags() which
 * is now deprecated.
 *
 * If you need to enable debugging features, use the `GOBJECT_DEBUG`
 * environment variable.
 */
public class TypeDebugFlags(public val mask: GTypeDebugFlags) : Bitfield<TypeDebugFlags> {
    override infix fun or(other: TypeDebugFlags): TypeDebugFlags = TypeDebugFlags(mask or other.mask)

    public companion object {
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.36.
         *
         * g_type_init() is now done automatically
         * ---
         *
         * Print no messages
         */
        public val NONE: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_NONE)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.36.
         *
         * g_type_init() is now done automatically
         * ---
         *
         * Print messages about object bookkeeping
         */
        public val OBJECTS: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_OBJECTS)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.36.
         *
         * g_type_init() is now done automatically
         * ---
         *
         * Print messages about signal emissions
         */
        public val SIGNALS: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_SIGNALS)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.36.
         *
         * g_type_init() is now done automatically
         * ---
         *
         * Keep a count of instances of each type
         */
        public val INSTANCE_COUNT: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_INSTANCE_COUNT)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.36.
         *
         * g_type_init() is now done automatically
         * ---
         *
         * Mask covering all debug flags
         */
        public val MASK: TypeDebugFlags = TypeDebugFlags(G_TYPE_DEBUG_MASK)
    }
}
