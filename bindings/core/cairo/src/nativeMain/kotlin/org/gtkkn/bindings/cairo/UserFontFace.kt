// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_font_face_t
import org.gtkkn.native.cairo.cairo_gobject_font_face_get_type
import org.gtkkn.native.cairo.cairo_user_font_face_create
import org.gtkkn.native.gobject.GType

public open class UserFontFace(public val cairoUserFontFacePointer: CPointer<cairo_font_face_t>) :
    FontFace(cairoUserFontFacePointer.reinterpret()),
    KGTyped {
    public constructor() : this(cairo_user_font_face_create()!!.reinterpret())

    public companion object : TypeCompanion<UserFontFace> {
        override val type: GeneratedClassKGType<UserFontFace> =
            GeneratedClassKGType(cairo_gobject_font_face_get_type()) { UserFontFace(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of UserFontFace
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_face_get_type()
    }
}
