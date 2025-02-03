// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GInitiallyUnowned
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_initially_unowned_get_type

/**
 * A type for objects that have an initially floating reference.
 *
 * All the fields in the `GInitiallyUnowned` structure are private to the
 * implementation and should never be accessed directly.
 */
public open class InitiallyUnowned(public val gobjectInitiallyUnownedPointer: CPointer<GInitiallyUnowned>) :
    Object(gobjectInitiallyUnownedPointer.reinterpret()),
    KGTyped {
    init {
        GObject
    }

    public companion object : TypeCompanion<InitiallyUnowned> {
        override val type: GeneratedClassKGType<InitiallyUnowned> =
            GeneratedClassKGType(getTypeOrNull()!!) { InitiallyUnowned(it.reinterpret()) }

        init {
            GObjectTypeProvider.register()
        }

        /**
         * Get the GType of InitiallyUnowned
         *
         * @return the GType
         */
        public fun getType(): GType = g_initially_unowned_get_type()

        /**
         * Gets the GType of from the symbol `g_initially_unowned_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_initially_unowned_get_type")
    }
}
