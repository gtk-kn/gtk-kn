// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object CairoTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Device.getTypeOrNull() != null) put(Device::class, Device.type)
        if (Script.getTypeOrNull() != null) put(Script::class, Script.type)
        if (Surface.getTypeOrNull() != null) put(Surface::class, Surface.type)
        if (ImageSurface.getTypeOrNull() != null) put(ImageSurface::class, ImageSurface.type)
        if (PdfSurface.getTypeOrNull() != null) put(PdfSurface::class, PdfSurface.type)
        if (PsSurface.getTypeOrNull() != null) put(PsSurface::class, PsSurface.type)
        if (RecordingSurface.getTypeOrNull() != null) put(RecordingSurface::class, RecordingSurface.type)
        if (SvgSurface.getTypeOrNull() != null) put(SvgSurface::class, SvgSurface.type)
        if (TeeSurface.getTypeOrNull() != null) put(TeeSurface::class, TeeSurface.type)
        if (RadialGradient.getTypeOrNull() != null) put(RadialGradient::class, RadialGradient.type)
        if (Mesh.getTypeOrNull() != null) put(Mesh::class, Mesh.type)
        if (RasterSource.getTypeOrNull() != null) put(RasterSource::class, RasterSource.type)
        if (SolidPattern.getTypeOrNull() != null) put(SolidPattern::class, SolidPattern.type)
        if (SurfacePattern.getTypeOrNull() != null) put(SurfacePattern::class, SurfacePattern.type)
        if (Pattern.getTypeOrNull() != null) put(Pattern::class, Pattern.type)
        if (Gradient.getTypeOrNull() != null) put(Gradient::class, Gradient.type)
        if (LinearGradient.getTypeOrNull() != null) put(LinearGradient::class, LinearGradient.type)
        if (FontFace.getTypeOrNull() != null) put(FontFace::class, FontFace.type)
        if (ToyFontFace.getTypeOrNull() != null) put(ToyFontFace::class, ToyFontFace.type)
        if (UserFontFace.getTypeOrNull() != null) put(UserFontFace::class, UserFontFace.type)
    }
}
