// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_16
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_surface_destroy
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.cairo.cairo_svg_surface_create
import org.gtkkn.native.cairo.cairo_svg_surface_get_document_unit
import org.gtkkn.native.cairo.cairo_svg_surface_restrict_to_version
import org.gtkkn.native.cairo.cairo_svg_surface_set_document_unit
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 *
 * @since 1.2
 */
@CairoVersion1_2
public open class SvgSurface(public val cairoSvgSurfacePointer: CPointer<cairo_surface_t>) :
    Surface(cairoSvgSurfacePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor(
        filename: String?,
        widthInPoints: gdouble,
        heightInPoints: gdouble,
    ) : this(cairo_svg_surface_create(filename, widthInPoints, heightInPoints)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_surface_destroy(it.reinterpret()) }
    }

    /**
     *
     *
     * @since 1.16
     */
    @CairoVersion1_16
    public open fun getDocumentUnit(): guint = cairo_svg_surface_get_document_unit(cairoSvgSurfacePointer)

    /**
     *
     *
     * @param unit
     * @since 1.16
     */
    @CairoVersion1_16
    public open fun setDocumentUnit(unit: guint): Unit =
        cairo_svg_surface_set_document_unit(cairoSvgSurfacePointer, unit)

    public open fun restrictToVersion(version: SvgVersion): Unit =
        cairo_svg_surface_restrict_to_version(cairoSvgSurfacePointer, version.nativeValue)

    public companion object : TypeCompanion<SvgSurface> {
        override val type: GeneratedClassKGType<SvgSurface> =
            GeneratedClassKGType(getTypeOrNull()!!) { SvgSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of SVGSurface
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
