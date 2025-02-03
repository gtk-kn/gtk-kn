// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pangocairo

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object PangoCairoTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Font.getTypeOrNull() != null) put(Font::class, Font.type)
        if (FontMap.getTypeOrNull() != null) put(FontMap::class, FontMap.type)
    }
}
