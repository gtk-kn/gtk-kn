// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.pango.PangoFont
import org.gtkkn.native.pango.pango_font_describe
import org.gtkkn.native.pango.pango_font_describe_with_absolute_size
import org.gtkkn.native.pango.pango_font_get_coverage
import org.gtkkn.native.pango.pango_font_get_face
import org.gtkkn.native.pango.pango_font_get_font_map
import org.gtkkn.native.pango.pango_font_get_metrics
import org.gtkkn.native.pango.pango_font_get_type
import org.gtkkn.native.pango.pango_font_has_char
import org.gtkkn.native.pango.pango_font_serialize
import kotlin.Boolean
import kotlin.UInt

/**
 * A `PangoFont` is used to represent a font in a
 * rendering-system-independent manner.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_features`: In/Out parameter is not supported
 * - parameter `glyph`: Glyph
 * - method `get_languages`: Array parameter of type Language is not supported
 * - parameter `descs`: Array parameter of type FontDescription is not supported
 * - parameter `context`: C Type PangoContext is ignored
 */
public open class Font(
    pointer: CPointer<PangoFont>,
) : Object(pointer.reinterpret()), KGTyped {
    public val pangoFontPointer: CPointer<PangoFont>
        get() = gPointer.reinterpret()

    /**
     * Returns a description of the font, with font size set in points.
     *
     * Use [method@Pango.Font.describe_with_absolute_size] if you want
     * the font size in device units.
     *
     * @return a newly-allocated `PangoFontDescription` object.
     */
    public open fun describe(): FontDescription =
        pango_font_describe(pangoFontPointer.reinterpret())!!.run {
            FontDescription(reinterpret())
        }

    /**
     * Returns a description of the font, with absolute font size set
     * in device units.
     *
     * Use [method@Pango.Font.describe] if you want the font size in points.
     *
     * @return a newly-allocated `PangoFontDescription` object.
     * @since 1.14
     */
    public open fun describeWithAbsoluteSize(): FontDescription =
        pango_font_describe_with_absolute_size(pangoFontPointer.reinterpret())!!.run {
            FontDescription(reinterpret())
        }

    /**
     * Computes the coverage map for a given font and language tag.
     *
     * @param language the language tag
     * @return a newly-allocated `PangoCoverage`
     *   object.
     */
    public open fun getCoverage(language: Language): Coverage =
        pango_font_get_coverage(
            pangoFontPointer.reinterpret(),
            language.pangoLanguagePointer
        )!!.run {
            Coverage(reinterpret())
        }

    /**
     * Gets the `PangoFontFace` to which @font belongs.
     *
     * @return the `PangoFontFace`
     * @since 1.46
     */
    public open fun getFace(): FontFace =
        pango_font_get_face(pangoFontPointer.reinterpret())!!.run {
            FontFace(reinterpret())
        }

    /**
     * Gets the font map for which the font was created.
     *
     * Note that the font maintains a *weak* reference to
     * the font map, so if all references to font map are
     * dropped, the font map will be finalized even if there
     * are fonts created with the font map that are still alive.
     * In that case this function will return null.
     *
     * It is the responsibility of the user to ensure that the
     * font map is kept alive. In most uses this is not an issue
     * as a `PangoContext` holds a reference to the font map.
     *
     * @return the `PangoFontMap`
     *   for the font
     * @since 1.10
     */
    public open fun getFontMap(): FontMap? =
        pango_font_get_font_map(pangoFontPointer.reinterpret())?.run {
            FontMap(reinterpret())
        }

    /**
     * Gets overall metric information for a font.
     *
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     *
     * If @font is null, this function gracefully sets some sane values in the
     * output variables and returns.
     *
     * @param language language tag used to determine which script
     *   to get the metrics for, or null to indicate to get the metrics for
     *   the entire font.
     * @return a `PangoFontMetrics` object. The caller must call
     *   [method@Pango.FontMetrics.unref] when finished using the object.
     */
    public open fun getMetrics(language: Language? = null): FontMetrics =
        pango_font_get_metrics(
            pangoFontPointer.reinterpret(),
            language?.pangoLanguagePointer
        )!!.run {
            FontMetrics(reinterpret())
        }

    /**
     * Returns whether the font provides a glyph for this character.
     *
     * @param wc a Unicode character
     * @return `TRUE` if @font can render @wc
     * @since 1.44
     */
    public open fun hasChar(wc: UInt): Boolean =
        pango_font_has_char(
            pangoFontPointer.reinterpret(),
            wc
        ).asBoolean()

    /**
     * Serializes the @font in a way that can be uniquely identified.
     *
     * There are no guarantees about the format of the output across different
     * versions of Pango.
     *
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     *
     * To recreate a font from its serialized form, use [func@Pango.Font.deserialize].
     *
     * @return a `GBytes` containing the serialized form of @font
     * @since 1.50
     */
    public open fun serialize(): Bytes =
        pango_font_serialize(pangoFontPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    public companion object : TypeCompanion<Font> {
        override val type: GeneratedClassKGType<Font> =
            GeneratedClassKGType(pango_font_get_type()) { Font(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }
    }
}
