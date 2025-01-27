// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.annotations.PangoVersion1_4
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.bindings.pango.annotations.PangoVersion1_52
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoFontFamily
import org.gtkkn.native.pango.pango_font_family_get_face
import org.gtkkn.native.pango.pango_font_family_get_name
import org.gtkkn.native.pango.pango_font_family_get_type
import org.gtkkn.native.pango.pango_font_family_is_monospace
import org.gtkkn.native.pango.pango_font_family_is_variable
import kotlin.Boolean
import kotlin.String

/**
 * A `PangoFontFamily` is used to represent a family of related
 * font faces.
 *
 * The font faces in a family share a common design, but differ in
 * slant, weight, width or other aspects.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `faces`: faces: Out parameter is not supported
 * - method `is-monospace`: Property has no getter nor setter
 * - method `is-variable`: Property has no getter nor setter
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public abstract class FontFamily(public val pangoFontFamilyPointer: CPointer<PangoFontFamily>) :
    Object(pangoFontFamilyPointer.reinterpret()),
    ListModel,
    KGTyped {
    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    /**
     * The name of the family
     *
     * @since 1.52
     */
    @PangoVersion1_52
    public open val name: String
        /**
         * Gets the name of the family.
         *
         * The name is unique among all fonts for the font backend and can
         * be used in a `PangoFontDescription` to specify that a face from
         * this family is desired.
         *
         * @return the name of the family. This string is owned
         *   by the family object and must not be modified or freed.
         */
        get() = pango_font_family_get_name(pangoFontFamilyPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the `PangoFontFace` of @family with the given name.
     *
     * @param name the name of a face. If the name is null,
     *   the family's default face (fontconfig calls it "Regular")
     *   will be returned.
     * @return the `PangoFontFace`,
     *   or null if no face with the given name exists.
     * @since 1.46
     */
    @PangoVersion1_46
    public open fun getFace(name: String? = null): FontFace? =
        pango_font_family_get_face(pangoFontFamilyPointer, name)?.run {
            FontFace.FontFaceImpl(this)
        }

    /**
     * A monospace font is a font designed for text display where the the
     * characters form a regular grid.
     *
     * For Western languages this would
     * mean that the advance width of all characters are the same, but
     * this categorization also includes Asian fonts which include
     * double-width characters: characters that occupy two grid cells.
     * g_unichar_iswide() returns a result that indicates whether a
     * character is typically double-width in a monospace font.
     *
     * The best way to find out the grid-cell size is to call
     * [method@Pango.FontMetrics.get_approximate_digit_width], since the
     * results of [method@Pango.FontMetrics.get_approximate_char_width] may
     * be affected by double-width characters.
     *
     * @return true if the family is monospace.
     * @since 1.4
     */
    @PangoVersion1_4
    public open fun isMonospace(): Boolean = pango_font_family_is_monospace(pangoFontFamilyPointer).asBoolean()

    /**
     * A variable font is a font which has axes that can be modified to
     * produce different faces.
     *
     * Such axes are also known as _variations_; see
     * [method@Pango.FontDescription.set_variations] for more information.
     *
     * @return true if the family is variable
     * @since 1.44
     */
    @PangoVersion1_44
    public open fun isVariable(): Boolean = pango_font_family_is_variable(pangoFontFamilyPointer).asBoolean()

    /**
     * The FontFamilyImpl type represents a native instance of the abstract FontFamily class.
     *
     * @constructor Creates a new instance of FontFamily for the provided [CPointer].
     */
    public class FontFamilyImpl(pointer: CPointer<PangoFontFamily>) : FontFamily(pointer)

    public companion object : TypeCompanion<FontFamily> {
        override val type: GeneratedClassKGType<FontFamily> =
            GeneratedClassKGType(getTypeOrNull("pango_font_family_get_type")!!) { FontFamilyImpl(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }

        /**
         * Get the GType of FontFamily
         *
         * @return the GType
         */
        public fun getType(): GType = pango_font_family_get_type()
    }
}
