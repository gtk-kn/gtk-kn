// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_pattern_create_radial
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `cx0`: cx0: Out parameter is not supported
 */
public open class RadialGradient(public val cairoRadialGradientPointer: CPointer<cairo_pattern_t>) :
    Gradient(cairoRadialGradientPointer.reinterpret()),
    KGTyped {
    public constructor(
        cx0: gdouble,
        cy0: gdouble,
        radius0: gdouble,
        cx1: gdouble,
        cy1: gdouble,
        radius1: gdouble,
    ) : this(cairo_pattern_create_radial(cx0, cy0, radius0, cx1, cy1, radius1)!!.reinterpret())

    public companion object : TypeCompanion<RadialGradient> {
        override val type: GeneratedClassKGType<RadialGradient> =
            GeneratedClassKGType(getTypeOrNull("cairo_gobject_surface_get_type")!!) {
                RadialGradient(it.reinterpret())
            }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of RadialGradient
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
