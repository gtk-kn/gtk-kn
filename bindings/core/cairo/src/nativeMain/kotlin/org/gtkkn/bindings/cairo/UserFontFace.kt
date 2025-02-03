// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_font_face_destroy
import org.gtkkn.native.cairo.cairo_font_face_t
import org.gtkkn.native.cairo.cairo_gobject_font_face_get_type
import org.gtkkn.native.cairo.cairo_user_font_face_create
import org.gtkkn.native.gobject.GType

public open class UserFontFace(public val cairoUserFontFacePointer: CPointer<cairo_font_face_t>) :
    FontFace(cairoUserFontFacePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor() : this(cairo_user_font_face_create()!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_font_face_destroy(it.reinterpret()) }
    }

    public companion object : TypeCompanion<UserFontFace> {
        override val type: GeneratedClassKGType<UserFontFace> =
            GeneratedClassKGType(getTypeOrNull()!!) { UserFontFace(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of UserFontFace
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_face_get_type()

        /**
         * Gets the GType of from the symbol `cairo_gobject_font_face_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("cairo_gobject_font_face_get_type")
    }
}
