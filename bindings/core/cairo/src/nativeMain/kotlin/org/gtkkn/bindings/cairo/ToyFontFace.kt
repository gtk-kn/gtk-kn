// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_font_face_t
import org.gtkkn.native.cairo.cairo_gobject_font_face_get_type
import org.gtkkn.native.cairo.cairo_toy_font_face_create
import org.gtkkn.native.cairo.cairo_toy_font_face_get_family
import org.gtkkn.native.cairo.cairo_toy_font_face_get_slant
import org.gtkkn.native.cairo.cairo_toy_font_face_get_weight
import org.gtkkn.native.gobject.GType
import kotlin.String

public open class ToyFontFace(pointer: CPointer<cairo_font_face_t>) :
    FontFace(pointer.reinterpret()),
    KGTyped {
    public val cairoToyFontFacePointer: CPointer<cairo_font_face_t>
        get() = gPointer.reinterpret()

    public constructor(
        family: String,
        slant: FontSlant,
        weight: FontWeight,
    ) : this(cairo_toy_font_face_create(family, slant.nativeValue, weight.nativeValue)!!.reinterpret())

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
            GeneratedClassKGType(cairo_gobject_font_face_get_type()) { ToyFontFace(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of ToyFontFace
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_face_get_type()
    }
}
