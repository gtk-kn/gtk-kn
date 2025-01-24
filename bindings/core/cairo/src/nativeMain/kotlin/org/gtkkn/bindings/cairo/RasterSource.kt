// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    public companion object : TypeCompanion<RasterSource> {
        override val type: GeneratedClassKGType<RasterSource> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { RasterSource(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of RasterSource
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
