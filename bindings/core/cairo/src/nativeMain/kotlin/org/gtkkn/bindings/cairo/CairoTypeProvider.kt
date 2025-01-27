// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object CairoTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("cairo_gobject_device_get_type") != null) put(Device::class, Device.type)
        if (getTypeOrNull("cairo_gobject_device_get_type") != null) put(Script::class, Script.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(Surface::class, Surface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(ImageSurface::class, ImageSurface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(PdfSurface::class, PdfSurface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(PsSurface::class, PsSurface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(RecordingSurface::class, RecordingSurface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(SvgSurface::class, SvgSurface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(TeeSurface::class, TeeSurface.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(RadialGradient::class, RadialGradient.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(Mesh::class, Mesh.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(RasterSource::class, RasterSource.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(SolidPattern::class, SolidPattern.type)
        if (getTypeOrNull("cairo_gobject_surface_get_type") != null) put(SurfacePattern::class, SurfacePattern.type)
        if (getTypeOrNull("cairo_gobject_pattern_get_type") != null) put(Pattern::class, Pattern.type)
        if (getTypeOrNull("cairo_gobject_pattern_get_type") != null) put(Gradient::class, Gradient.type)
        if (getTypeOrNull("cairo_gobject_pattern_get_type") != null) put(LinearGradient::class, LinearGradient.type)
        if (getTypeOrNull("cairo_gobject_font_face_get_type") != null) put(FontFace::class, FontFace.type)
        if (getTypeOrNull("cairo_gobject_font_face_get_type") != null) put(ToyFontFace::class, ToyFontFace.type)
        if (getTypeOrNull("cairo_gobject_font_face_get_type") != null) put(UserFontFace::class, UserFontFace.type)
    }
}
