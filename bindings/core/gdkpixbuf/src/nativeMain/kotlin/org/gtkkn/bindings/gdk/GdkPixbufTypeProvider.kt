// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GdkPixbufTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Pixbuf.getTypeOrNull() != null) put(Pixbuf::class, Pixbuf.type)
        if (PixbufAnimation.getTypeOrNull() != null) put(PixbufAnimation::class, PixbufAnimation.type)
        if (PixbufAnimationIter.getTypeOrNull() != null) put(PixbufAnimationIter::class, PixbufAnimationIter.type)
        if (PixbufLoader.getTypeOrNull() != null) put(PixbufLoader::class, PixbufLoader.type)
        if (PixbufNonAnim.getTypeOrNull() != null) put(PixbufNonAnim::class, PixbufNonAnim.type)
        if (PixbufSimpleAnim.getTypeOrNull() != null) put(PixbufSimpleAnim::class, PixbufSimpleAnim.type)
        if (PixbufSimpleAnimIter.getTypeOrNull() != null) put(PixbufSimpleAnimIter::class, PixbufSimpleAnimIter.type)
    }
}
