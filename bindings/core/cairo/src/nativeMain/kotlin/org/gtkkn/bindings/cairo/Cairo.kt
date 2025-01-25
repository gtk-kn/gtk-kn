// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.TypeCache

public object Cairo {
    init {
        registerTypes()
    }

    private fun registerTypes() {
        TypeCache.register(Device::class, Device.getType()) { Device.DeviceImpl(it.reinterpret()) }
        TypeCache.register(Script::class, Script.getType()) { Script(it.reinterpret()) }
        TypeCache.register(Surface::class, Surface.getType()) { Surface(it.reinterpret()) }
        TypeCache.register(ImageSurface::class, ImageSurface.getType()) { ImageSurface(it.reinterpret()) }
        TypeCache.register(PdfSurface::class, PdfSurface.getType()) { PdfSurface(it.reinterpret()) }
        TypeCache.register(PsSurface::class, PsSurface.getType()) { PsSurface(it.reinterpret()) }
        TypeCache.register(RecordingSurface::class, RecordingSurface.getType()) { RecordingSurface(it.reinterpret()) }
        TypeCache.register(SvgSurface::class, SvgSurface.getType()) { SvgSurface(it.reinterpret()) }
        TypeCache.register(TeeSurface::class, TeeSurface.getType()) { TeeSurface(it.reinterpret()) }
        TypeCache.register(RadialGradient::class, RadialGradient.getType()) { RadialGradient(it.reinterpret()) }
        TypeCache.register(Mesh::class, Mesh.getType()) { Mesh(it.reinterpret()) }
        TypeCache.register(RasterSource::class, RasterSource.getType()) { RasterSource(it.reinterpret()) }
        TypeCache.register(SolidPattern::class, SolidPattern.getType()) { SolidPattern(it.reinterpret()) }
        TypeCache.register(SurfacePattern::class, SurfacePattern.getType()) { SurfacePattern(it.reinterpret()) }
        TypeCache.register(Pattern::class, Pattern.getType()) { Pattern.PatternImpl(it.reinterpret()) }
        TypeCache.register(Gradient::class, Gradient.getType()) { Gradient.GradientImpl(it.reinterpret()) }
        TypeCache.register(LinearGradient::class, LinearGradient.getType()) { LinearGradient(it.reinterpret()) }
        TypeCache.register(FontFace::class, FontFace.getType()) { FontFace(it.reinterpret()) }
        TypeCache.register(ToyFontFace::class, ToyFontFace.getType()) { ToyFontFace(it.reinterpret()) }
        TypeCache.register(UserFontFace::class, UserFontFace.getType()) { UserFontFace(it.reinterpret()) }
    }
}
