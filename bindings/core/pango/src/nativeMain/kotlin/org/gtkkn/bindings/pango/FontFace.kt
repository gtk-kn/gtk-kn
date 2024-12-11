// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.annotations.PangoVersion1_18
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoFontFace
import org.gtkkn.native.pango.pango_font_face_describe
import org.gtkkn.native.pango.pango_font_face_get_face_name
import org.gtkkn.native.pango.pango_font_face_get_family
import org.gtkkn.native.pango.pango_font_face_get_type
import org.gtkkn.native.pango.pango_font_face_is_synthesized
import kotlin.Boolean
import kotlin.String

/**
 * A `PangoFontFace` is used to represent a group of fonts with
 * the same family, slant, weight, and width, but varying sizes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `sizes`: sizes: Out parameter is not supported
 */
public open class FontFace(pointer: CPointer<PangoFontFace>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val pangoFontFacePointer: CPointer<PangoFontFace>
        get() = gPointer.reinterpret()

    /**
     * Returns a font description that matches the face.
     *
     * The resulting font description will have the family, style,
     * variant, weight and stretch of the face, but its size field
     * will be unset.
     *
     * @return a newly-created `PangoFontDescription` structure
     *   holding the description of the face. Use [method@Pango.FontDescription.free]
     *   to free the result.
     */
    public open fun describe(): FontDescription = pango_font_face_describe(pangoFontFacePointer.reinterpret())!!.run {
        FontDescription(reinterpret())
    }

    /**
     * Gets a name representing the style of this face.
     *
     * Note that a font family may contain multiple faces
     * with the same name (e.g. a variable and a non-variable
     * face for the same style).
     *
     * @return the face name for the face. This string is
     *   owned by the face object and must not be modified or freed.
     */
    public open fun getFaceName(): String =
        pango_font_face_get_face_name(pangoFontFacePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the `PangoFontFamily` that @face belongs to.
     *
     * @return the `PangoFontFamily`
     * @since 1.46
     */
    @PangoVersion1_46
    public open fun getFamily(): FontFamily = pango_font_face_get_family(pangoFontFacePointer.reinterpret())!!.run {
        FontFamily(reinterpret())
    }

    /**
     * Returns whether a `PangoFontFace` is synthesized.
     *
     * This will be the case if the underlying font rendering engine
     * creates this face from another face, by shearing, emboldening,
     * lightening or modifying it in some other way.
     *
     * @return whether @face is synthesized
     * @since 1.18
     */
    @PangoVersion1_18
    public open fun isSynthesized(): Boolean =
        pango_font_face_is_synthesized(pangoFontFacePointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<FontFace> {
        override val type: GeneratedClassKGType<FontFace> =
            GeneratedClassKGType(pango_font_face_get_type()) { FontFace(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of FontFace
         *
         * @return the GType
         */
        public fun getType(): GType = pango_font_face_get_type()
    }
}
