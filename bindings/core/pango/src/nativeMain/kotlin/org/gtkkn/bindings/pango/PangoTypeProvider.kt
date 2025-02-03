// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object PangoTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Context.getTypeOrNull() != null) put(Context::class, Context.type)
        if (Coverage.getTypeOrNull() != null) put(Coverage::class, Coverage.type)
        if (Font.getTypeOrNull() != null) put(Font::class, Font.type)
        if (FontFace.getTypeOrNull() != null) put(FontFace::class, FontFace.type)
        if (FontFamily.getTypeOrNull() != null) put(FontFamily::class, FontFamily.type)
        if (FontMap.getTypeOrNull() != null) put(FontMap::class, FontMap.type)
        if (Fontset.getTypeOrNull() != null) put(Fontset::class, Fontset.type)
        if (FontsetSimple.getTypeOrNull() != null) put(FontsetSimple::class, FontsetSimple.type)
        if (Layout.getTypeOrNull() != null) put(Layout::class, Layout.type)
        if (Renderer.getTypeOrNull() != null) put(Renderer::class, Renderer.type)
    }
}
