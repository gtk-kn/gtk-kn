// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `user_data`: Unsupported pointer to primitive type
 *
 * @since 1.2
 */
@CairoVersion1_2
public open class RasterSource(public val cairoRasterSourcePointer: CPointer<cairo_pattern_t>) :
    Pattern(cairoRasterSourcePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public companion object : TypeCompanion<RasterSource> {
        override val type: GeneratedClassKGType<RasterSource> =
            GeneratedClassKGType(getTypeOrNull()!!) { RasterSource(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of RasterSource
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
