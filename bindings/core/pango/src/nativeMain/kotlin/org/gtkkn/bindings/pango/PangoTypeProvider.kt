// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object PangoTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("pango_context_get_type") != null) put(Context::class, Context.type)
        if (getTypeOrNull("pango_coverage_get_type") != null) put(Coverage::class, Coverage.type)
        if (getTypeOrNull("pango_font_get_type") != null) put(Font::class, Font.type)
        if (getTypeOrNull("pango_font_face_get_type") != null) put(FontFace::class, FontFace.type)
        if (getTypeOrNull("pango_font_family_get_type") != null) put(FontFamily::class, FontFamily.type)
        if (getTypeOrNull("pango_font_map_get_type") != null) put(FontMap::class, FontMap.type)
        if (getTypeOrNull("pango_fontset_get_type") != null) put(Fontset::class, Fontset.type)
        if (getTypeOrNull("pango_fontset_simple_get_type") != null) put(FontsetSimple::class, FontsetSimple.type)
        if (getTypeOrNull("pango_layout_get_type") != null) put(Layout::class, Layout.type)
        if (getTypeOrNull("pango_renderer_get_type") != null) put(Renderer::class, Renderer.type)
    }
}
