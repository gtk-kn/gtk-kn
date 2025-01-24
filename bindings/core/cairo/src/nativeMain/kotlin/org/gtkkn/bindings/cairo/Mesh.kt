// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_12
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_mesh_pattern_begin_patch
import org.gtkkn.native.cairo.cairo_mesh_pattern_curve_to
import org.gtkkn.native.cairo.cairo_mesh_pattern_end_patch
import org.gtkkn.native.cairo.cairo_mesh_pattern_get_path
import org.gtkkn.native.cairo.cairo_mesh_pattern_line_to
import org.gtkkn.native.cairo.cairo_mesh_pattern_move_to
import org.gtkkn.native.cairo.cairo_mesh_pattern_set_control_point
import org.gtkkn.native.cairo.cairo_mesh_pattern_set_corner_color_rgb
import org.gtkkn.native.cairo.cairo_mesh_pattern_set_corner_color_rgba
import org.gtkkn.native.cairo.cairo_pattern_create_mesh
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `count`: count: Out parameter is not supported
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `red`: red: Out parameter is not supported
 *
 * @since 1.12
 */
@CairoVersion1_12
public open class Mesh(public val cairoMeshPointer: CPointer<cairo_pattern_t>) :
    Pattern(cairoMeshPointer.reinterpret()),
    KGTyped {
    public constructor() : this(cairo_pattern_create_mesh()!!.reinterpret())

    public open fun beginPatch(): Unit = cairo_mesh_pattern_begin_patch(cairoMeshPointer)

    public open fun endPatch(): Unit = cairo_mesh_pattern_end_patch(cairoMeshPointer)

    public open fun moveTo(x: gdouble, y: gdouble): Unit = cairo_mesh_pattern_move_to(cairoMeshPointer, x, y)

    public open fun lineTo(x: gdouble, y: gdouble): Unit = cairo_mesh_pattern_line_to(cairoMeshPointer, x, y)

    public open fun curveTo(x1: gdouble, y1: gdouble, x2: gdouble, y2: gdouble, x3: gdouble, y3: gdouble): Unit =
        cairo_mesh_pattern_curve_to(cairoMeshPointer, x1, y1, x2, y2, x3, y3)

    public open fun setControlPoint(pointNum: guint, x: gdouble, y: gdouble): Unit =
        cairo_mesh_pattern_set_control_point(cairoMeshPointer, pointNum, x, y)

    public open fun setCornerColorRgb(cornerNum: guint, red: gdouble, green: gdouble, blue: gdouble): Unit =
        cairo_mesh_pattern_set_corner_color_rgb(cairoMeshPointer, cornerNum, red, green, blue)

    public open fun setCornerColorRgba(
        cornerNum: guint,
        red: gdouble,
        green: gdouble,
        blue: gdouble,
        alpha: gdouble,
    ): Unit = cairo_mesh_pattern_set_corner_color_rgba(cairoMeshPointer, cornerNum, red, green, blue, alpha)

    public open fun getPath(patchNum: guint): Path = cairo_mesh_pattern_get_path(cairoMeshPointer, patchNum)!!.run {
        Path(this)
    }

    public companion object : TypeCompanion<Mesh> {
        override val type: GeneratedClassKGType<Mesh> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { Mesh(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Mesh
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
