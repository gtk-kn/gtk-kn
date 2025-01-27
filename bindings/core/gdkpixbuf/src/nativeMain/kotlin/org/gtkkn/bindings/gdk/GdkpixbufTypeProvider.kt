// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GdkpixbufTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("gdk_pixbuf_get_type") != null) put(Pixbuf::class, Pixbuf.type)
        if (getTypeOrNull("gdk_pixbuf_animation_get_type") != null) put(PixbufAnimation::class, PixbufAnimation.type)
        if (getTypeOrNull("gdk_pixbuf_animation_iter_get_type") !=
            null
        ) {
            put(PixbufAnimationIter::class, PixbufAnimationIter.type)
        }
        if (getTypeOrNull("gdk_pixbuf_loader_get_type") != null) put(PixbufLoader::class, PixbufLoader.type)
        if (getTypeOrNull("gdk_pixbuf_non_anim_get_type") != null) put(PixbufNonAnim::class, PixbufNonAnim.type)
        if (getTypeOrNull("gdk_pixbuf_simple_anim_get_type") !=
            null
        ) {
            put(PixbufSimpleAnim::class, PixbufSimpleAnim.type)
        }
        if (getTypeOrNull("gdk_pixbuf_simple_anim_iter_get_type") !=
            null
        ) {
            put(PixbufSimpleAnimIter::class, PixbufSimpleAnimIter.type)
        }
    }
}
