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
        Device.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Device::class, gtype) { Device.DeviceImpl(it.reinterpret()) }
        }
        Script.getTypeOrNull()?.let { gtype -> TypeCache.register(Script::class, gtype) { Script(it.reinterpret()) } }
        Surface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Surface::class, gtype) { Surface(it.reinterpret()) }
        }
        ImageSurface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ImageSurface::class, gtype) { ImageSurface(it.reinterpret()) }
        }
        PdfSurface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PdfSurface::class, gtype) { PdfSurface(it.reinterpret()) }
        }
        PsSurface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PsSurface::class, gtype) { PsSurface(it.reinterpret()) }
        }
        RecordingSurface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RecordingSurface::class, gtype) { RecordingSurface(it.reinterpret()) }
        }
        SvgSurface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SvgSurface::class, gtype) { SvgSurface(it.reinterpret()) }
        }
        TeeSurface.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TeeSurface::class, gtype) { TeeSurface(it.reinterpret()) }
        }
        RadialGradient.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RadialGradient::class, gtype) { RadialGradient(it.reinterpret()) }
        }
        Mesh.getTypeOrNull()?.let { gtype -> TypeCache.register(Mesh::class, gtype) { Mesh(it.reinterpret()) } }
        RasterSource.getTypeOrNull()?.let { gtype ->
            TypeCache.register(RasterSource::class, gtype) { RasterSource(it.reinterpret()) }
        }
        SolidPattern.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SolidPattern::class, gtype) { SolidPattern(it.reinterpret()) }
        }
        SurfacePattern.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SurfacePattern::class, gtype) { SurfacePattern(it.reinterpret()) }
        }
        Pattern.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Pattern::class, gtype) { Pattern.PatternImpl(it.reinterpret()) }
        }
        Gradient.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Gradient::class, gtype) { Gradient.GradientImpl(it.reinterpret()) }
        }
        LinearGradient.getTypeOrNull()?.let { gtype ->
            TypeCache.register(LinearGradient::class, gtype) { LinearGradient(it.reinterpret()) }
        }
        FontFace.getTypeOrNull()?.let { gtype ->
            TypeCache.register(FontFace::class, gtype) { FontFace(it.reinterpret()) }
        }
        ToyFontFace.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ToyFontFace::class, gtype) { ToyFontFace(it.reinterpret()) }
        }
        UserFontFace.getTypeOrNull()?.let { gtype ->
            TypeCache.register(UserFontFace::class, gtype) { UserFontFace(it.reinterpret()) }
        }
    }
}
