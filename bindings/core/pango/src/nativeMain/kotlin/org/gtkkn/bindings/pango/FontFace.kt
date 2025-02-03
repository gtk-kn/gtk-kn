// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.annotations.PangoVersion1_18
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public abstract class FontFace(public val pangoFontFacePointer: CPointer<PangoFontFace>) :
    Object(pangoFontFacePointer.reinterpret()),
    KGTyped {
    init {
        Pango
    }

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
    public open fun describe(): FontDescription = pango_font_face_describe(pangoFontFacePointer)!!.run {
        FontDescription(this)
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
        pango_font_face_get_face_name(pangoFontFacePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the `PangoFontFamily` that @face belongs to.
     *
     * @return the `PangoFontFamily`
     * @since 1.46
     */
    @PangoVersion1_46
    public open fun getFamily(): FontFamily = pango_font_face_get_family(pangoFontFacePointer)!!.run {
        InstanceCache.get(this, true) { FontFamily.FontFamilyImpl(reinterpret()) }!!
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
    public open fun isSynthesized(): Boolean = pango_font_face_is_synthesized(pangoFontFacePointer).asBoolean()

    /**
     * The FontFaceImpl type represents a native instance of the abstract FontFace class.
     *
     * @constructor Creates a new instance of FontFace for the provided [CPointer].
     */
    public class FontFaceImpl(pointer: CPointer<PangoFontFace>) : FontFace(pointer)

    public companion object : TypeCompanion<FontFace> {
        override val type: GeneratedClassKGType<FontFace> =
            GeneratedClassKGType(getTypeOrNull()!!) { FontFaceImpl(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of FontFace
         *
         * @return the GType
         */
        public fun getType(): GType = pango_font_face_get_type()

        /**
         * Gets the GType of from the symbol `pango_font_face_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("pango_font_face_get_type")
    }
}
