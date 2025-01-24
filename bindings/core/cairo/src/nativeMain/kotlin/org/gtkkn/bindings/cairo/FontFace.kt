// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.TypeInstance
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_font_face_destroy
import org.gtkkn.native.cairo.cairo_font_face_get_type
import org.gtkkn.native.cairo.cairo_font_face_get_user_data
import org.gtkkn.native.cairo.cairo_font_face_reference
import org.gtkkn.native.cairo.cairo_font_face_status
import org.gtkkn.native.cairo.cairo_font_face_t
import org.gtkkn.native.cairo.cairo_gobject_font_face_get_type
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `destroy`: GLib.DestroyNotify
 */
public open class FontFace(public val cairoFontFacePointer: CPointer<cairo_font_face_t>) :
    TypeInstance(cairoFontFacePointer.reinterpret()),
    KGTyped {
    public open fun destroy(): Unit = cairo_font_face_destroy(cairoFontFacePointer)

    public open fun status(): Status = cairo_font_face_status(cairoFontFacePointer).run {
        Status.fromNativeValue(this)
    }

    public open fun getFontType(): FontType = cairo_font_face_get_type(cairoFontFacePointer).run {
        FontType.fromNativeValue(this)
    }

    public open fun reference(): FontFace = cairo_font_face_reference(cairoFontFacePointer)!!.run {
        FontFace(reinterpret())
    }

    public open fun getUserData(key: UserDataKey): gpointer =
        cairo_font_face_get_user_data(cairoFontFacePointer, key.cairoUserDataKeyPointer)!!

    public companion object : TypeCompanion<FontFace> {
        override val type: GeneratedClassKGType<FontFace> =
            GeneratedClassKGType(cairo_gobject_font_face_get_type()) { FontFace(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of FontFace
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_face_get_type()
    }
}
