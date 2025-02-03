// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_font_face_destroy
import org.gtkkn.native.cairo.cairo_font_face_t
import org.gtkkn.native.cairo.cairo_gobject_font_face_get_type
import org.gtkkn.native.cairo.cairo_toy_font_face_create
import org.gtkkn.native.cairo.cairo_toy_font_face_get_family
import org.gtkkn.native.cairo.cairo_toy_font_face_get_slant
import org.gtkkn.native.cairo.cairo_toy_font_face_get_weight
import org.gtkkn.native.gobject.GType
import kotlin.String

public open class ToyFontFace(public val cairoToyFontFacePointer: CPointer<cairo_font_face_t>) :
    FontFace(cairoToyFontFacePointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public constructor(
        family: String,
        slant: FontSlant,
        weight: FontWeight,
    ) : this(cairo_toy_font_face_create(family, slant.nativeValue, weight.nativeValue)!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_font_face_destroy(it.reinterpret()) }
    }

    public open fun getFamily(): String =
        cairo_toy_font_face_get_family(cairoToyFontFacePointer)?.toKString() ?: error("Expected not null string")

    public open fun getSlant(): FontSlant = cairo_toy_font_face_get_slant(cairoToyFontFacePointer).run {
        FontSlant.fromNativeValue(this)
    }

    public open fun getWeight(): FontWeight = cairo_toy_font_face_get_weight(cairoToyFontFacePointer).run {
        FontWeight.fromNativeValue(this)
    }

    public companion object : TypeCompanion<ToyFontFace> {
        override val type: GeneratedClassKGType<ToyFontFace> =
            GeneratedClassKGType(getTypeOrNull()!!) { ToyFontFace(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of ToyFontFace
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
