// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pangocairo

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object PangocairoTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("pango_cairo_font_get_type") != null) put(Font::class, Font.type)
        if (getTypeOrNull("pango_cairo_font_map_get_type") != null) put(FontMap::class, FontMap.type)
    }
}
