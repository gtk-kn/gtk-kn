// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_pattern_create_for_surface
import org.gtkkn.native.cairo.cairo_pattern_destroy
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `surface`: surface: Out parameter is not supported
 */
public open class SurfacePattern(public val cairoSurfacePatternPointer: CPointer<cairo_pattern_t>) :
    Pattern(cairoSurfacePatternPointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor(surface: Surface) : this(cairo_pattern_create_for_surface(surface.cairoSurfacePointer)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_pattern_destroy(it.reinterpret()) }
    }

    public companion object : TypeCompanion<SurfacePattern> {
        override val type: GeneratedClassKGType<SurfacePattern> =
            GeneratedClassKGType(getTypeOrNull()!!) { SurfacePattern(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of SurfacePattern
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()

        /**
         * Gets the GType of from the symbol `cairo_gobject_surface_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("cairo_gobject_surface_get_type")
    }
}
