// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.MarkupParseContext
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.native.pango.PangoAttribute
import org.gtkkn.native.pango.PangoFont
import org.gtkkn.native.pango.PangoFontset
import org.gtkkn.native.pango.pango_attr_allow_breaks_new
import org.gtkkn.native.pango.pango_attr_background_alpha_new
import org.gtkkn.native.pango.pango_attr_background_new
import org.gtkkn.native.pango.pango_attr_baseline_shift_new
import org.gtkkn.native.pango.pango_attr_fallback_new
import org.gtkkn.native.pango.pango_attr_family_new
import org.gtkkn.native.pango.pango_attr_font_desc_new
import org.gtkkn.native.pango.pango_attr_font_features_new
import org.gtkkn.native.pango.pango_attr_font_scale_new
import org.gtkkn.native.pango.pango_attr_foreground_alpha_new
import org.gtkkn.native.pango.pango_attr_foreground_new
import org.gtkkn.native.pango.pango_attr_gravity_hint_new
import org.gtkkn.native.pango.pango_attr_gravity_new
import org.gtkkn.native.pango.pango_attr_insert_hyphens_new
import org.gtkkn.native.pango.pango_attr_language_new
import org.gtkkn.native.pango.pango_attr_letter_spacing_new
import org.gtkkn.native.pango.pango_attr_line_height_new
import org.gtkkn.native.pango.pango_attr_line_height_new_absolute
import org.gtkkn.native.pango.pango_attr_list_from_string
import org.gtkkn.native.pango.pango_attr_overline_color_new
import org.gtkkn.native.pango.pango_attr_overline_new
import org.gtkkn.native.pango.pango_attr_rise_new
import org.gtkkn.native.pango.pango_attr_scale_new
import org.gtkkn.native.pango.pango_attr_sentence_new
import org.gtkkn.native.pango.pango_attr_shape_new
import org.gtkkn.native.pango.pango_attr_show_new
import org.gtkkn.native.pango.pango_attr_size_new
import org.gtkkn.native.pango.pango_attr_size_new_absolute
import org.gtkkn.native.pango.pango_attr_stretch_new
import org.gtkkn.native.pango.pango_attr_strikethrough_color_new
import org.gtkkn.native.pango.pango_attr_strikethrough_new
import org.gtkkn.native.pango.pango_attr_style_new
import org.gtkkn.native.pango.pango_attr_text_transform_new
import org.gtkkn.native.pango.pango_attr_type_get_name
import org.gtkkn.native.pango.pango_attr_type_register
import org.gtkkn.native.pango.pango_attr_underline_color_new
import org.gtkkn.native.pango.pango_attr_underline_new
import org.gtkkn.native.pango.pango_attr_variant_new
import org.gtkkn.native.pango.pango_attr_weight_new
import org.gtkkn.native.pango.pango_attr_word_new
import org.gtkkn.native.pango.pango_bidi_type_for_unichar
import org.gtkkn.native.pango.pango_default_break
import org.gtkkn.native.pango.pango_extents_to_pixels
import org.gtkkn.native.pango.pango_find_base_dir
import org.gtkkn.native.pango.pango_font_description_from_string
import org.gtkkn.native.pango.pango_gravity_get_for_matrix
import org.gtkkn.native.pango.pango_gravity_get_for_script
import org.gtkkn.native.pango.pango_gravity_get_for_script_and_width
import org.gtkkn.native.pango.pango_gravity_to_rotation
import org.gtkkn.native.pango.pango_is_zero_width
import org.gtkkn.native.pango.pango_language_from_string
import org.gtkkn.native.pango.pango_language_get_default
import org.gtkkn.native.pango.pango_language_get_preferred
import org.gtkkn.native.pango.pango_layout_deserialize_error_quark
import org.gtkkn.native.pango.pango_markup_parser_new
import org.gtkkn.native.pango.pango_reorder_items
import org.gtkkn.native.pango.pango_script_for_unichar
import org.gtkkn.native.pango.pango_script_get_sample_language
import org.gtkkn.native.pango.pango_shape
import org.gtkkn.native.pango.pango_shape_full
import org.gtkkn.native.pango.pango_shape_item
import org.gtkkn.native.pango.pango_shape_with_flags
import org.gtkkn.native.pango.pango_split_file_list
import org.gtkkn.native.pango.pango_tab_array_from_string
import org.gtkkn.native.pango.pango_trim_string
import org.gtkkn.native.pango.pango_unichar_direction
import org.gtkkn.native.pango.pango_units_from_double
import org.gtkkn.native.pango.pango_units_to_double
import org.gtkkn.native.pango.pango_version
import org.gtkkn.native.pango.pango_version_check
import org.gtkkn.native.pango.pango_version_string
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.UShort
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * ## Skipped during bindings generation
 *
 * - class `Context`: C Type PangoContext is ignored
 * - parameter `attrs`: LogAttr
 * - parameter `data`: gpointer
 * - parameter `attrs`: LogAttr
 * - parameter `paragraph_delimiter_index`: paragraph_delimiter_index: Out parameter is not
 * supported
 * - parameter `attrs`: LogAttr
 * - parameter `mirrored_ch`: Unsupported pointer to primitive type
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
 * - function `log2vis_get_embedding_levels`: Return type guint8 is unsupported
 * - parameter `attr_list`: attr_list: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `attr_list`: attr_list: Out parameter is not supported
 * - parameter `stretch`: stretch: Out parameter is not supported
 * - parameter `style`: style: Out parameter is not supported
 * - parameter `variant`: variant: Out parameter is not supported
 * - parameter `weight`: weight: Out parameter is not supported
 * - function `quantize_line_geometry`: In/Out parameter is not supported
 * - parameter `stream`: gpointer
 * - function `scan_int`: In/Out parameter is not supported
 * - function `scan_string`: In/Out parameter is not supported
 * - function `scan_word`: In/Out parameter is not supported
 * - function `skip_space`: In/Out parameter is not supported
 * - parameter `attrs`: LogAttr
 * - callback `AttrDataCopyFunc`: Return type gpointer is unsupported
 * - constant `GLYPH_EMPTY`: Glyph
 * - constant `GLYPH_INVALID_INPUT`: Glyph
 * - constant `GLYPH_UNKNOWN_FLAG`: Glyph
 * - record `ContextClass`: glib type struct are ignored
 * - record `FontClass`: glib type struct are ignored
 * - record `FontFaceClass`: glib type struct are ignored
 * - record `FontFamilyClass`: glib type struct are ignored
 * - record `FontMapClass`: glib type struct are ignored
 * - record `FontsetClass`: glib type struct are ignored
 * - record `FontsetSimpleClass`: glib type struct are ignored
 * - record `LayoutClass`: glib type struct are ignored
 * - record `RendererClass`: glib type struct are ignored
 * - record `RendererPrivate`: Disguised records are ignored
 */
public object Pango {
    /**
     * Whether the segment should be shifted to center around the baseline.
     *
     * This is mainly used in vertical writing directions.
     *
     * @since 1.16
     */
    public const val ANALYSIS_FLAG_CENTERED_BASELINE: Int = 1

    /**
     * Whether this run holds ellipsized text.
     *
     * @since 1.36.7
     */
    public const val ANALYSIS_FLAG_IS_ELLIPSIS: Int = 2

    /**
     * Whether to add a hyphen at the end of the run during shaping.
     *
     * @since 1.44
     */
    public const val ANALYSIS_FLAG_NEED_HYPHEN: Int = 4

    /**
     * Value for @start_index in `PangoAttribute` that indicates
     * the beginning of the text.
     *
     * @since 1.24
     */
    public const val ATTR_INDEX_FROM_TEXT_BEGINNING: UInt = 0u

    /**
     * Value for @end_index in `PangoAttribute` that indicates
     * the end of the text.
     *
     * @since 1.24
     */
    public const val ATTR_INDEX_TO_TEXT_END: UInt = UInt.MAX_VALUE

    /**
     * The scale between dimensions used for Pango distances and device units.
     *
     * The definition of device units is dependent on the output device; it will
     * typically be pixels for a screen, and points for a printer. %PANGO_SCALE is
     * currently 1024, but this may be changed in the future.
     *
     * When setting font sizes, device units are always considered to be
     * points (as in "12 point font"), rather than pixels.
     */
    public const val SCALE: Int = 1024

    /**
     * The major component of the version of Pango available at compile-time.
     */
    public const val VERSION_MAJOR: Int = 1

    /**
     * The micro component of the version of Pango available at compile-time.
     */
    public const val VERSION_MICRO: Int = 6

    /**
     * The minor component of the version of Pango available at compile-time.
     */
    public const val VERSION_MINOR: Int = 50

    /**
     * A string literal containing the version of Pango available at compile-time.
     */
    public const val VERSION_STRING: String = "1.50.6"

    /**
     * Create a new allow-breaks attribute.
     *
     * If breaks are disabled, the range will be kept in a
     * single run, as far as possible.
     *
     * @param allowBreaks true if we line breaks are allowed
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.44
     */
    public fun attrAllowBreaksNew(allowBreaks: Boolean): Attribute =
        pango_attr_allow_breaks_new(allowBreaks.asGBoolean())!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new background alpha attribute.
     *
     * @param alpha the alpha value, between 1 and 65536
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.38
     */
    public fun attrBackgroundAlphaNew(alpha: UShort): Attribute =
        pango_attr_background_alpha_new(alpha)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new background color attribute.
     *
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrBackgroundNew(
        red: UShort,
        green: UShort,
        blue: UShort,
    ): Attribute =
        pango_attr_background_new(red, green, blue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new baseline displacement attribute.
     *
     * The effect of this attribute is to shift the baseline of a run,
     * relative to the run of preceding run.
     *
     * <picture>
     *   <source srcset="baseline-shift-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Baseline Shift" src="baseline-shift-light.png">
     * </picture>
     *
     * @param shift either a `PangoBaselineShift` enumeration value or an absolute value (> 1024)
     *   in Pango units, relative to the baseline of the previous run.
     *   Positive values displace the text upwards.
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.50
     */
    public fun attrBaselineShiftNew(shift: Int): Attribute =
        pango_attr_baseline_shift_new(shift)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font fallback attribute.
     *
     * If fallback is disabled, characters will only be
     * used from the closest matching font on the system.
     * No fallback will be done to other fonts on the system
     * that might contain the characters in the text.
     *
     * @param enableFallback true if we should fall back on other fonts
     *   for characters the active font is missing
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.4
     */
    public fun attrFallbackNew(enableFallback: Boolean): Attribute =
        pango_attr_fallback_new(enableFallback.asGBoolean())!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font family attribute.
     *
     * @param family the family or comma-separated list of families
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrFamilyNew(family: String): Attribute =
        pango_attr_family_new(family)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font description attribute.
     *
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     *
     * @param desc the font description
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrFontDescNew(desc: FontDescription): Attribute =
        pango_attr_font_desc_new(desc.pangoFontDescriptionPointer)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font features tag attribute.
     *
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     *
     * @param features a string with OpenType font features, with the syntax of the [CSS
     * font-feature-settings property](https://www.w3.org/TR/css-fonts-4/#font-rend-desc)
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.38
     */
    public fun attrFontFeaturesNew(features: String): Attribute =
        pango_attr_font_features_new(features)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font scale attribute.
     *
     * The effect of this attribute is to change the font size of a run,
     * relative to the size of preceding run.
     *
     * @param scale a `PangoFontScale` value, which indicates font size change relative
     *   to the size of the previous run.
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.50
     */
    public fun attrFontScaleNew(scale: FontScale): Attribute =
        pango_attr_font_scale_new(scale.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new foreground alpha attribute.
     *
     * @param alpha the alpha value, between 1 and 65536
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.38
     */
    public fun attrForegroundAlphaNew(alpha: UShort): Attribute =
        pango_attr_foreground_alpha_new(alpha)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new foreground color attribute.
     *
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrForegroundNew(
        red: UShort,
        green: UShort,
        blue: UShort,
    ): Attribute =
        pango_attr_foreground_new(red, green, blue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new gravity hint attribute.
     *
     * @param hint the gravity hint value
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.16
     */
    public fun attrGravityHintNew(hint: GravityHint): Attribute =
        pango_attr_gravity_hint_new(hint.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new gravity attribute.
     *
     * @param gravity the gravity value; should not be %PANGO_GRAVITY_AUTO
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.16
     */
    public fun attrGravityNew(gravity: Gravity): Attribute =
        pango_attr_gravity_new(gravity.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new insert-hyphens attribute.
     *
     * Pango will insert hyphens when breaking lines in
     * the middle of a word. This attribute can be used
     * to suppress the hyphen.
     *
     * @param insertHyphens true if hyphens should be inserted
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.44
     */
    public fun attrInsertHyphensNew(insertHyphens: Boolean): Attribute =
        pango_attr_insert_hyphens_new(insertHyphens.asGBoolean())!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new language tag attribute.
     *
     * @param language language tag
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrLanguageNew(language: Language): Attribute =
        pango_attr_language_new(language.pangoLanguagePointer)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new letter-spacing attribute.
     *
     * @param letterSpacing amount of extra space to add between
     *   graphemes of the text, in Pango units
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.6
     */
    public fun attrLetterSpacingNew(letterSpacing: Int): Attribute =
        pango_attr_letter_spacing_new(letterSpacing)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Modify the height of logical line extents by a factor.
     *
     * This affects the values returned by
     * [method@Pango.LayoutLine.get_extents],
     * [method@Pango.LayoutLine.get_pixel_extents] and
     * [method@Pango.LayoutIter.get_line_extents].
     *
     * @param factor the scaling factor to apply to the logical height
     * @since 1.50
     */
    public fun attrLineHeightNew(factor: Double): Attribute =
        pango_attr_line_height_new(factor)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Override the height of logical line extents to be @height.
     *
     * This affects the values returned by
     * [method@Pango.LayoutLine.get_extents],
     * [method@Pango.LayoutLine.get_pixel_extents] and
     * [method@Pango.LayoutIter.get_line_extents].
     *
     * @param height the line height, in %PANGO_SCALE-ths of a point
     * @since 1.50
     */
    public fun attrLineHeightNewAbsolute(height: Int): Attribute =
        pango_attr_line_height_new_absolute(height)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Deserializes a `PangoAttrList` from a string.
     *
     * This is the counterpart to [method@Pango.AttrList.to_string].
     * See that functions for details about the format.
     *
     * @param text a string
     * @return a new `PangoAttrList`
     * @since 1.50
     */
    public fun attrListFromString(text: String): AttrList? =
        pango_attr_list_from_string(text)?.run {
            AttrList(reinterpret())
        }

    /**
     * Create a new overline color attribute.
     *
     * This attribute modifies the color of overlines.
     * If not set, overlines will use the foreground color.
     *
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.46
     */
    public fun attrOverlineColorNew(
        red: UShort,
        green: UShort,
        blue: UShort,
    ): Attribute =
        pango_attr_overline_color_new(red, green, blue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new overline-style attribute.
     *
     * @param overline the overline style
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.46
     */
    public fun attrOverlineNew(overline: Overline): Attribute =
        pango_attr_overline_new(overline.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new baseline displacement attribute.
     *
     * @param rise the amount that the text should be displaced vertically,
     *   in Pango units. Positive values displace the text upwards.
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrRiseNew(rise: Int): Attribute =
        pango_attr_rise_new(rise)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font size scale attribute.
     *
     * The base font for the affected text will have
     * its size multiplied by @scale_factor.
     *
     * @param scaleFactor factor to scale the font
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrScaleNew(scaleFactor: Double): Attribute =
        pango_attr_scale_new(scaleFactor)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Marks the range of the attribute as a single sentence.
     *
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     *
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.50
     */
    public fun attrSentenceNew(): Attribute =
        pango_attr_sentence_new()!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new shape attribute.
     *
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a `PangoLayout`.
     *
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrShapeNew(
        inkRect: Rectangle,
        logicalRect: Rectangle,
    ): Attribute =
        pango_attr_shape_new(
            inkRect.pangoRectanglePointer,
            logicalRect.pangoRectanglePointer
        )!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new attribute that influences how invisible
     * characters are rendered.
     *
     * @param flags `PangoShowFlags` to apply
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.44
     */
    public fun attrShowNew(flags: ShowFlags): Attribute =
        pango_attr_show_new(flags.mask)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font-size attribute in fractional points.
     *
     * @param size the font size, in %PANGO_SCALE-ths of a point
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrSizeNew(size: Int): Attribute =
        pango_attr_size_new(size)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font-size attribute in device units.
     *
     * @param size the font size, in %PANGO_SCALE-ths of a device unit
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.8
     */
    public fun attrSizeNewAbsolute(size: Int): Attribute =
        pango_attr_size_new_absolute(size)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font stretch attribute.
     *
     * @param stretch the stretch
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrStretchNew(stretch: Stretch): Attribute =
        pango_attr_stretch_new(stretch.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new strikethrough color attribute.
     *
     * This attribute modifies the color of strikethrough lines.
     * If not set, strikethrough lines will use the foreground color.
     *
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.8
     */
    public fun attrStrikethroughColorNew(
        red: UShort,
        green: UShort,
        blue: UShort,
    ): Attribute =
        pango_attr_strikethrough_color_new(red, green, blue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new strike-through attribute.
     *
     * @param strikethrough true if the text should be struck-through
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrStrikethroughNew(strikethrough: Boolean): Attribute =
        pango_attr_strikethrough_new(strikethrough.asGBoolean())!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font slant style attribute.
     *
     * @param style the slant style
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrStyleNew(style: Style): Attribute =
        pango_attr_style_new(style.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new attribute that influences how characters
     * are transformed during shaping.
     *
     * @param transform `PangoTextTransform` to apply
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.50
     */
    public fun attrTextTransformNew(transform: TextTransform): Attribute =
        pango_attr_text_transform_new(transform.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Fetches the attribute type name.
     *
     * The attribute type name is the string passed in
     * when registering the type using
     * [func@Pango.AttrType.register].
     *
     * The returned value is an interned string (see
     * g_intern_string() for what that means) that should
     * not be modified or freed.
     *
     * @param type an attribute type ID to fetch the name for
     * @return the type ID name (which
     *   may be null), or null if @type is a built-in Pango
     *   attribute type or invalid.
     * @since 1.22
     */
    public fun attrTypeGetName(type: AttrType): String? = pango_attr_type_get_name(type.nativeValue)?.toKString()

    /**
     * Allocate a new attribute type ID.
     *
     * The attribute type name can be accessed later
     * by using [func@Pango.AttrType.get_name].
     *
     * @param name an identifier for the type
     * @return the new type ID.
     */
    public fun attrTypeRegister(name: String): AttrType =
        pango_attr_type_register(name).run {
            AttrType.fromNativeValue(this)
        }

    /**
     * Create a new underline color attribute.
     *
     * This attribute modifies the color of underlines.
     * If not set, underlines will use the foreground color.
     *
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.8
     */
    public fun attrUnderlineColorNew(
        red: UShort,
        green: UShort,
        blue: UShort,
    ): Attribute =
        pango_attr_underline_color_new(red, green, blue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new underline-style attribute.
     *
     * @param underline the underline style
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrUnderlineNew(underline: Underline): Attribute =
        pango_attr_underline_new(underline.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font variant attribute (normal or small caps).
     *
     * @param variant the variant
     * @return the newly allocated `PangoAttribute`,
     *   which should be freed with [method@Pango.Attribute.destroy].
     */
    public fun attrVariantNew(variant: Variant): Attribute =
        pango_attr_variant_new(variant.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Create a new font weight attribute.
     *
     * @param weight the weight
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrWeightNew(weight: Weight): Attribute =
        pango_attr_weight_new(weight.nativeValue)!!.run {
            Attribute(reinterpret())
        }

    /**
     * Marks the range of the attribute as a single word.
     *
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     *
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     * @since 1.50
     */
    public fun attrWordNew(): Attribute =
        pango_attr_word_new()!!.run {
            Attribute(reinterpret())
        }

    /**
     * Determines the bidirectional type of a character.
     *
     * The bidirectional type is specified in the Unicode Character Database.
     *
     * A simplified version of this function is available as [func@unichar_direction].
     *
     * @param ch a Unicode character
     * @return the bidirectional character type, as used in the
     * Unicode bidirectional algorithm.
     * @since 1.22
     */
    public fun bidiTypeForUnichar(ch: UInt): BidiType =
        pango_bidi_type_for_unichar(ch).run {
            BidiType.fromNativeValue(this)
        }

    /**
     * This is the default break algorithm.
     *
     * It applies rules from the [Unicode Line Breaking
     * Algorithm](http://www.unicode.org/unicode/reports/tr14/)
     * without language-specific tailoring, therefore the @analyis argument is unused
     * and can be null.
     *
     * See [func@Pango.tailor_break] for language-specific breaks.
     *
     * See [func@Pango.attr_break] for attribute-based customization.
     *
     * @param text text to break. Must be valid UTF-8
     * @param length length of text in bytes (may be -1 if @text is nul-terminated)
     * @param analysis a `PangoAnalysis` structure for the @text
     * @param attrs logical attributes to fill in
     * @param attrsLen size of the array passed as @attrs
     */
    public fun defaultBreak(
        text: String,
        length: Int,
        analysis: Analysis? = null,
        attrs: LogAttr,
        attrsLen: Int,
    ): Unit =
        pango_default_break(
            text,
            length,
            analysis?.pangoAnalysisPointer,
            attrs.pangoLogAttrPointer,
            attrsLen
        )

    /**
     * Converts extents from Pango units to device units.
     *
     * The conversion is done by dividing by the %PANGO_SCALE factor and
     * performing rounding.
     *
     * The @inclusive rectangle is converted by flooring the x/y coordinates
     * and extending width/height, such that the final rectangle completely
     * includes the original rectangle.
     *
     * The @nearest rectangle is converted by rounding the coordinates
     * of the rectangle to the nearest device unit (pixel).
     *
     * The rule to which argument to use is: if you want the resulting device-space
     * rectangle to completely contain the original rectangle, pass it in as
     * @inclusive. If you want two touching-but-not-overlapping rectangles stay
     * touching-but-not-overlapping after rounding to device units, pass them in
     * as @nearest.
     *
     * @param inclusive rectangle to round to pixels inclusively
     * @param nearest rectangle to round to nearest pixels
     * @since 1.16
     */
    public fun extentsToPixels(
        inclusive: Rectangle? = null,
        nearest: Rectangle? = null,
    ): Unit =
        pango_extents_to_pixels(
            inclusive?.pangoRectanglePointer,
            nearest?.pangoRectanglePointer
        )

    /**
     * Searches a string the first character that has a strong
     * direction, according to the Unicode bidirectional algorithm.
     *
     * @param text the text to process. Must be valid UTF-8
     * @param length length of @text in bytes (may be -1 if @text is nul-terminated)
     * @return The direction corresponding to the first strong character.
     *   If no such character is found, then %PANGO_DIRECTION_NEUTRAL is returned.
     * @since 1.4
     */
    public fun findBaseDir(
        text: String,
        length: Int,
    ): Direction =
        pango_find_base_dir(
            text,
            length
        ).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Creates a new font description from a string representation.
     *
     * The string must have the form
     *
     *     "\[FAMILY-LIST] \[STYLE-OPTIONS] \[SIZE] \[VARIATIONS]",
     *
     * where FAMILY-LIST is a comma-separated list of families optionally
     * terminated by a comma, STYLE_OPTIONS is a whitespace-separated list
     * of words where each word describes one of style, variant, weight,
     * stretch, or gravity, and SIZE is a decimal number (size in points)
     * or optionally followed by the unit modifier "px" for absolute size.
     * VARIATIONS is a comma-separated list of font variation
     * specifications of the form "\@axis=value" (the = sign is optional).
     *
     * The following words are understood as styles:
     * "Normal", "Roman", "Oblique", "Italic".
     *
     * The following words are understood as variants:
     * "Small-Caps", "All-Small-Caps", "Petite-Caps", "All-Petite-Caps",
     * "Unicase", "Title-Caps".
     *
     * The following words are understood as weights:
     * "Thin", "Ultra-Light", "Extra-Light", "Light", "Semi-Light",
     * "Demi-Light", "Book", "Regular", "Medium", "Semi-Bold", "Demi-Bold",
     * "Bold", "Ultra-Bold", "Extra-Bold", "Heavy", "Black", "Ultra-Black",
     * "Extra-Black".
     *
     * The following words are understood as stretch values:
     * "Ultra-Condensed", "Extra-Condensed", "Condensed", "Semi-Condensed",
     * "Semi-Expanded", "Expanded", "Extra-Expanded", "Ultra-Expanded".
     *
     * The following words are understood as gravity values:
     * "Not-Rotated", "South", "Upside-Down", "North", "Rotated-Left",
     * "East", "Rotated-Right", "West".
     *
     * Any one of the options may be absent. If FAMILY-LIST is absent, then
     * the family_name field of the resulting font description will be
     * initialized to null. If STYLE-OPTIONS is missing, then all style
     * options will be set to the default values. If SIZE is missing, the
     * size in the resulting font description will be set to 0.
     *
     * A typical example:
     *
     *     "Cantarell Italic Light 15 \@wght=200"
     *
     * @param str string representation of a font description.
     * @return a new `PangoFontDescription`.
     */
    public fun fontDescriptionFromString(str: String): FontDescription =
        pango_font_description_from_string(str)!!.run {
            FontDescription(reinterpret())
        }

    /**
     * Finds the gravity that best matches the rotation component
     * in a `PangoMatrix`.
     *
     * @param matrix a `PangoMatrix`
     * @return the gravity of @matrix, which will never be
     * %PANGO_GRAVITY_AUTO, or %PANGO_GRAVITY_SOUTH if @matrix is null
     * @since 1.16
     */
    public fun gravityGetForMatrix(matrix: Matrix? = null): Gravity =
        pango_gravity_get_for_matrix(matrix?.pangoMatrixPointer).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Returns the gravity to use in laying out a `PangoItem`.
     *
     * The gravity is determined based on the script, base gravity, and hint.
     *
     * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
     * preferred gravity of @script.  To get the preferred gravity of a script,
     * pass %PANGO_GRAVITY_AUTO and %PANGO_GRAVITY_HINT_STRONG in.
     *
     * @param script `PangoScript` to query
     * @param baseGravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text
     * with @script
     * @since 1.16
     */
    public fun gravityGetForScript(
        script: Script,
        baseGravity: Gravity,
        hint: GravityHint,
    ): Gravity =
        pango_gravity_get_for_script(
            script.nativeValue,
            baseGravity.nativeValue,
            hint.nativeValue
        ).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Returns the gravity to use in laying out a single character
     * or `PangoItem`.
     *
     * The gravity is determined based on the script, East Asian width,
     * base gravity, and hint,
     *
     * This function is similar to [func@Pango.Gravity.get_for_script] except
     * that this function makes a distinction between narrow/half-width and
     * wide/full-width characters also. Wide/full-width characters always
     * stand *upright*, that is, they always take the base gravity,
     * whereas narrow/full-width characters are always rotated in vertical
     * context.
     *
     * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
     * preferred gravity of @script.
     *
     * @param script `PangoScript` to query
     * @param wide true for wide characters as returned by g_unichar_iswide()
     * @param baseGravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text
     * with @script and @wide.
     * @since 1.26
     */
    public fun gravityGetForScriptAndWidth(
        script: Script,
        wide: Boolean,
        baseGravity: Gravity,
        hint: GravityHint,
    ): Gravity =
        pango_gravity_get_for_script_and_width(
            script.nativeValue,
            wide.asGBoolean(),
            baseGravity.nativeValue,
            hint.nativeValue
        ).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Converts a `PangoGravity` value to its natural rotation in radians.
     *
     * Note that [method@Pango.Matrix.rotate] takes angle in degrees, not radians.
     * So, to call [method@Pango.Matrix,rotate] with the output of this function
     * you should multiply it by (180. / G_PI).
     *
     * @param gravity gravity to query, should not be %PANGO_GRAVITY_AUTO
     * @return the rotation value corresponding to @gravity.
     * @since 1.16
     */
    public fun gravityToRotation(gravity: Gravity): Double = pango_gravity_to_rotation(gravity.nativeValue)

    /**
     * Checks if a character that should not be normally rendered.
     *
     * This includes all Unicode characters with "ZERO WIDTH" in their name,
     * as well as *bidi* formatting characters, and a few other ones.
     *
     * This is totally different from [func@GLib.unichar_iszerowidth] and is at best misnamed.
     *
     * @param ch a Unicode character
     * @return true if @ch is a zero-width character, false otherwise
     * @since 1.10
     */
    public fun isZeroWidth(ch: UInt): Boolean = pango_is_zero_width(ch).asBoolean()

    /**
     * Convert a language tag to a `PangoLanguage`.
     *
     * The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
     * can be efficiently copied (copy the pointer) and compared with other
     * language tags (compare the pointer.)
     *
     * This function first canonicalizes the string by converting it to
     * lowercase, mapping '_' to '-', and stripping all characters other
     * than letters and '-'.
     *
     * Use [func@Pango.Language.get_default] if you want to get the
     * `PangoLanguage` for the current locale of the process.
     *
     * @param language a string representing a language tag
     * @return a `PangoLanguage`
     */
    public fun languageFromString(language: String? = null): Language? =
        pango_language_from_string(language)?.run {
            Language(reinterpret())
        }

    /**
     * Returns the `PangoLanguage` for the current locale of the process.
     *
     * On Unix systems, this is the return value is derived from
     * `setlocale (LC_CTYPE, NULL)`, and the user can
     * affect this through the environment variables LC_ALL, LC_CTYPE or
     * LANG (checked in that order). The locale string typically is in
     * the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * Swedish as written in Finland or pt_BR for Portuguese as written in
     * Brazil.
     *
     * On Windows, the C library does not use any such environment
     * variables, and setting them won't affect the behavior of functions
     * like ctime(). The user sets the locale through the Regional Options
     * in the Control Panel. The C library (in the setlocale() function)
     * does not use country and language codes, but country and language
     * names spelled out in English.
     * However, this function does check the above environment
     * variables, and does return a Unix-style locale string based on
     * either said environment variables or the thread's current locale.
     *
     * Your application should call `setlocale(LC_ALL, "")` for the user
     * settings to take effect. GTK does this in its initialization
     * functions automatically (by calling gtk_set_locale()).
     * See the setlocale() manpage for more details.
     *
     * Note that the default language can change over the life of an application.
     *
     * Also note that this function will not do the right thing if you
     * use per-thread locales with uselocale(). In that case, you should
     * just call pango_language_from_string() yourself.
     *
     * @return the default language as a `PangoLanguage`
     * @since 1.16
     */
    public fun languageGetDefault(): Language =
        pango_language_get_default()!!.run {
            Language(reinterpret())
        }

    /**
     * Returns the list of languages that the user prefers.
     *
     * The list is specified by the `PANGO_LANGUAGE` or `LANGUAGE`
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * [func@Pango.Language.get_default].
     *
     * When choosing language-specific resources, such as the sample
     * text returned by [method@Pango.Language.get_sample_string],
     * you should first try the default language, followed by the
     * languages returned by this function.
     *
     * @return a null-terminated array
     *   of `PangoLanguage`*
     * @since 1.48
     */
    public fun languageGetPreferred(): Language? =
        pango_language_get_preferred()?.run {
            Language(reinterpret())
        }

    public fun layoutDeserializeErrorQuark(): UInt = pango_layout_deserialize_error_quark()

    /**
     * Incrementally parses marked-up text to create a plain-text string
     * and an attribute list.
     *
     * See the [Pango Markup](pango_markup.html) docs for details about the
     * supported markup.
     *
     * If @accel_marker is nonzero, the given character will mark the
     * character following it as an accelerator. For example, @accel_marker
     * might be an ampersand or underscore. All characters marked
     * as an accelerator will receive a %PANGO_UNDERLINE_LOW attribute,
     * and the first character so marked will be returned in @accel_char,
     * when calling [func@markup_parser_finish]. Two @accel_marker characters
     * following each other produce a single literal @accel_marker character.
     *
     * To feed markup to the parser, use [method@GLib.MarkupParseContext.parse]
     * on the returned [struct@GLib.MarkupParseContext]. When done with feeding markup
     * to the parser, use [func@markup_parser_finish] to get the data out
     * of it, and then use [method@GLib.MarkupParseContext.free] to free it.
     *
     * This function is designed for applications that read Pango markup
     * from streams. To simply parse a string containing Pango markup,
     * the [func@Pango.parse_markup] API is recommended instead.
     *
     * @param accelMarker character that precedes an accelerator, or 0 for none
     * @return a `GMarkupParseContext` that should be
     * destroyed with [method@GLib.MarkupParseContext.free].
     * @since 1.31.0
     */
    public fun markupParserNew(accelMarker: UInt): MarkupParseContext =
        pango_markup_parser_new(accelMarker)!!.run {
            MarkupParseContext(reinterpret())
        }

    /**
     * Reorder items from logical order to visual order.
     *
     * The visual order is determined from the associated directional
     * levels of the items. The original list is unmodified.
     *
     * (Please open a bug if you use this function.
     *  It is not a particularly convenient interface, and the code
     *  is duplicated elsewhere in Pango for that reason.)
     *
     * @param items a `GList` of `PangoItem`
     *   in logical order.
     * @return a `GList`
     *   of `PangoItem` structures in visual order.
     */
    public fun reorderItems(items: GlibList): GlibList =
        pango_reorder_items(items.glibListPointer)!!.run {
            GlibList(reinterpret())
        }

    /**
     * Looks up the script for a particular character.
     *
     * The script of a character is defined by
     * [Unicode Standard Annex 24: Script names](http://www.unicode.org/reports/tr24/).
     *
     * No check is made for @ch being a valid Unicode character; if you pass
     * in invalid character, the result is undefined.
     *
     * Note that while the return type of this function is declared
     * as `PangoScript`, as of Pango 1.18, this function simply returns
     * the return value of [func@GLib.unichar_get_script]. Callers must be
     * prepared to handle unknown values.
     *
     * @param ch a Unicode character
     * @return the `PangoScript` for the character.
     * @since 1.4
     */
    public fun scriptForUnichar(ch: UInt): Script =
        pango_script_for_unichar(ch).run {
            Script.fromNativeValue(this)
        }

    /**
     * Finds a language tag that is reasonably representative of @script.
     *
     * The language will usually be the most widely spoken or used language
     * written in that script: for instance, the sample language for
     * %PANGO_SCRIPT_CYRILLIC is ru (Russian), the sample language for
     * %PANGO_SCRIPT_ARABIC is ar.
     *
     * For some scripts, no sample language will be returned because
     * there is no language that is sufficiently representative. The
     * best example of this is %PANGO_SCRIPT_HAN, where various different
     * variants of written Chinese, Japanese, and Korean all use
     * significantly different sets of Han characters and forms
     * of shared characters. No sample language can be provided
     * for many historical scripts as well.
     *
     * As of 1.18, this function checks the environment variables
     * `PANGO_LANGUAGE` and `LANGUAGE` (checked in that order) first.
     * If one of them is set, it is parsed as a list of language tags
     * separated by colons or other separators. This function
     * will return the first language in the parsed list that Pango
     * believes may use @script for writing. This last predicate
     * is tested using [method@Pango.Language.includes_script]. This can
     * be used to control Pango's font selection for non-primary
     * languages. For example, a `PANGO_LANGUAGE` enviroment variable
     * set to "en:fa" makes Pango choose fonts suitable for Persian (fa)
     * instead of Arabic (ar) when a segment of Arabic text is found
     * in an otherwise non-Arabic text. The same trick can be used to
     * choose a default language for %PANGO_SCRIPT_HAN when setting
     * context language is not feasible.
     *
     * @param script a `PangoScript`
     * @return a `PangoLanguage` that is representative
     *   of the script
     * @since 1.4
     */
    public fun scriptGetSampleLanguage(script: Script): Language? =
        pango_script_get_sample_language(script.nativeValue)?.run {
            Language(reinterpret())
        }

    /**
     * Convert the characters in @text into glyphs.
     *
     * Given a segment of text and the corresponding `PangoAnalysis` structure
     * returned from [func@Pango.itemize], convert the characters into glyphs. You
     * may also pass in only a substring of the item from [func@Pango.itemize].
     *
     * It is recommended that you use [func@Pango.shape_full] instead, since
     * that API allows for shaping interaction happening across text item
     * boundaries.
     *
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you need to subtract the item offset from their indices before
     * calling [func@Pango.shape].
     *
     * @param text the text to process
     * @param length the length (in bytes) of @text
     * @param analysis `PangoAnalysis` structure from [func@Pango.itemize]
     * @param glyphs glyph string in which to store results
     */
    public fun shape(
        text: String,
        length: Int,
        analysis: Analysis,
        glyphs: GlyphString,
    ): Unit =
        pango_shape(
            text,
            length,
            analysis.pangoAnalysisPointer,
            glyphs.pangoGlyphStringPointer
        )

    /**
     * Convert the characters in @text into glyphs.
     *
     * Given a segment of text and the corresponding `PangoAnalysis` structure
     * returned from [func@Pango.itemize], convert the characters into glyphs.
     * You may also pass in only a substring of the item from [func@Pango.itemize].
     *
     * This is similar to [func@Pango.shape], except it also can optionally take
     * the full paragraph text as input, which will then be used to perform
     * certain cross-item shaping interactions. If you have access to the broader
     * text of which @item_text is part of, provide the broader text as
     * @paragraph_text. If @paragraph_text is null, item text is used instead.
     *
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as @paragraph_text, you need
     * to subtract the item offset from their indices before calling
     * [func@Pango.shape_full].
     *
     * @param itemText valid UTF-8 text to shape.
     * @param itemLength the length (in bytes) of @item_text. -1 means nul-terminated text.
     * @param paragraphText text of the paragraph (see details).
     * @param paragraphLength the length (in bytes) of @paragraph_text. -1 means nul-terminated
     * text.
     * @param analysis `PangoAnalysis` structure from [func@Pango.itemize].
     * @param glyphs glyph string in which to store results.
     * @since 1.32
     */
    public fun shapeFull(
        itemText: String,
        itemLength: Int,
        paragraphText: String? = null,
        paragraphLength: Int,
        analysis: Analysis,
        glyphs: GlyphString,
    ): Unit =
        pango_shape_full(
            itemText,
            itemLength,
            paragraphText,
            paragraphLength,
            analysis.pangoAnalysisPointer,
            glyphs.pangoGlyphStringPointer
        )

    /**
     * Convert the characters in @item into glyphs.
     *
     * This is similar to [func@Pango.shape_with_flags], except it takes a
     * `PangoItem` instead of separate @item_text and @analysis arguments.
     * It also takes @log_attrs, which may be used in implementing text
     * transforms.
     *
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as @paragraph_text, you need
     * to subtract the item offset from their indices before calling
     * [func@Pango.shape_with_flags].
     *
     * @param item `PangoItem` to shape
     * @param paragraphText text of the paragraph (see details).
     * @param paragraphLength the length (in bytes) of @paragraph_text.
     *     -1 means nul-terminated text.
     * @param logAttrs array of `PangoLogAttr` for @item
     * @param glyphs glyph string in which to store results
     * @param flags flags influencing the shaping process
     * @since 1.50
     */
    public fun shapeItem(
        item: Item,
        paragraphText: String? = null,
        paragraphLength: Int,
        logAttrs: LogAttr? = null,
        glyphs: GlyphString,
        flags: ShapeFlags,
    ): Unit =
        pango_shape_item(
            item.pangoItemPointer,
            paragraphText,
            paragraphLength,
            logAttrs?.pangoLogAttrPointer,
            glyphs.pangoGlyphStringPointer,
            flags.mask
        )

    /**
     * Convert the characters in @text into glyphs.
     *
     * Given a segment of text and the corresponding `PangoAnalysis` structure
     * returned from [func@Pango.itemize], convert the characters into glyphs.
     * You may also pass in only a substring of the item from [func@Pango.itemize].
     *
     * This is similar to [func@Pango.shape_full], except it also takes flags
     * that can influence the shaping process.
     *
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as @paragraph_text, you need
     * to subtract the item offset from their indices before calling
     * [func@Pango.shape_with_flags].
     *
     * @param itemText valid UTF-8 text to shape
     * @param itemLength the length (in bytes) of @item_text.
     *     -1 means nul-terminated text.
     * @param paragraphText text of the paragraph (see details).
     * @param paragraphLength the length (in bytes) of @paragraph_text.
     *     -1 means nul-terminated text.
     * @param analysis `PangoAnalysis` structure from [func@Pango.itemize]
     * @param glyphs glyph string in which to store results
     * @param flags flags influencing the shaping process
     * @since 1.44
     */
    public fun shapeWithFlags(
        itemText: String,
        itemLength: Int,
        paragraphText: String? = null,
        paragraphLength: Int,
        analysis: Analysis,
        glyphs: GlyphString,
        flags: ShapeFlags,
    ): Unit =
        pango_shape_with_flags(
            itemText,
            itemLength,
            paragraphText,
            paragraphLength,
            analysis.pangoAnalysisPointer,
            glyphs.pangoGlyphStringPointer,
            flags.mask
        )

    /**
     * Splits a %G_SEARCHPATH_SEPARATOR-separated list of files, stripping
     * white space and substituting ~/ with $HOME/.
     *
     * @param str a %G_SEARCHPATH_SEPARATOR separated list of filenames
     * @return a list of
     *   strings to be freed with g_strfreev()
     */
    public fun splitFileList(str: String): CollectionsList<String> =
        pango_split_file_list(str)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Deserializes a `PangoTabArray` from a string.
     *
     * This is the counterpart to [method@Pango.TabArray.to_string].
     * See that functions for details about the format.
     *
     * @param text a string
     * @return a new `PangoTabArray`
     * @since 1.50
     */
    public fun tabArrayFromString(text: String): TabArray? =
        pango_tab_array_from_string(text)?.run {
            TabArray(reinterpret())
        }

    /**
     * Trims leading and trailing whitespace from a string.
     *
     * @param str a string
     * @return A newly-allocated string that must be freed with g_free()
     */
    public fun trimString(str: String): String =
        pango_trim_string(str)?.toKString()
            ?: error("Expected not null string")

    /**
     * Determines the inherent direction of a character.
     *
     * The inherent direction is either `PANGO_DIRECTION_LTR`, `PANGO_DIRECTION_RTL`,
     * or `PANGO_DIRECTION_NEUTRAL`.
     *
     * This function is useful to categorize characters into left-to-right
     * letters, right-to-left letters, and everything else. If full Unicode
     * bidirectional type of a character is needed, [func@Pango.BidiType.for_unichar]
     * can be used instead.
     *
     * @param ch a Unicode character
     * @return the direction of the character.
     */
    public fun unicharDirection(ch: UInt): Direction =
        pango_unichar_direction(ch).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Converts a floating-point number to Pango units.
     *
     * The conversion is done by multiplying @d by %PANGO_SCALE and
     * rounding the result to nearest integer.
     *
     * @param d double floating-point value
     * @return the value in Pango units.
     * @since 1.16
     */
    public fun unitsFromDouble(d: Double): Int = pango_units_from_double(d)

    /**
     * Converts a number in Pango units to floating-point.
     *
     * The conversion is done by dividing @i by %PANGO_SCALE.
     *
     * @param i value in Pango units
     * @return the double value.
     * @since 1.16
     */
    public fun unitsToDouble(i: Int): Double = pango_units_to_double(i)

    /**
     * Returns the encoded version of Pango available at run-time.
     *
     * This is similar to the macro %PANGO_VERSION except that the macro
     * returns the encoded version available at compile-time. A version
     * number can be encoded into an integer using PANGO_VERSION_ENCODE().
     *
     * @return The encoded version of Pango library available at run time.
     * @since 1.16
     */
    public fun version(): Int = pango_version()

    /**
     * Checks that the Pango library in use is compatible with the
     * given version.
     *
     * Generally you would pass in the constants %PANGO_VERSION_MAJOR,
     * %PANGO_VERSION_MINOR, %PANGO_VERSION_MICRO as the three arguments
     * to this function; that produces a check that the library in use at
     * run-time is compatible with the version of Pango the application or
     * module was compiled against.
     *
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * @required_major.required_minor.@required_micro. Second
     * the running library must be binary compatible with the
     * version @required_major.required_minor.@required_micro
     * (same major version.)
     *
     * For compile-time version checking use PANGO_VERSION_CHECK().
     *
     * @param requiredMajor the required major version
     * @param requiredMinor the required minor version
     * @param requiredMicro the required major version
     * @return null if the Pango library is compatible
     *   with the given version, or a string describing the version
     *   mismatch.  The returned string is owned by Pango and should not
     *   be modified or freed.
     * @since 1.16
     */
    public fun versionCheck(
        requiredMajor: Int,
        requiredMinor: Int,
        requiredMicro: Int,
    ): String? = pango_version_check(requiredMajor, requiredMinor, requiredMicro)?.toKString()

    /**
     * Returns the version of Pango available at run-time.
     *
     * This is similar to the macro %PANGO_VERSION_STRING except that the
     * macro returns the version available at compile-time.
     *
     * @return A string containing the version of Pango library available
     *   at run time. The returned string is owned by Pango and should not
     *   be modified or freed.
     * @since 1.16
     */
    public fun versionString(): String =
        pango_version_string()?.toKString()
            ?: error("Expected not null string")

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                LayoutDeserializeError.quark() ->
                    LayoutDeserializeError.fromErrorOrNull(error)
                        ?.let {
                            LayoutDeserializeErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val AttrFilterFuncFunc: CPointer<CFunction<(CPointer<PangoAttribute>) -> Int>> =
    staticCFunction {
            attribute: CPointer<PangoAttribute>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(attribute: Attribute) -> Boolean>().get().invoke(
            attribute!!.run {
                Attribute(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val FontsetForeachFuncFunc: CPointer<
    CFunction<
        (
            CPointer<PangoFontset>,
            CPointer<PangoFont>,
        ) -> Int
    >
> =
    staticCFunction {
            fontset: CPointer<PangoFontset>?,
            font: CPointer<PangoFont>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(fontset: Fontset, font: Font) -> Boolean>().get().invoke(
            fontset!!.run {
                Fontset(reinterpret())
            },
            font!!.run {
                Font(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

/**
 * Type of a function filtering a list of attributes.
 *
 * - param `attribute` a Pango attribute
 * - return true if the attribute should be selected for
 *   filtering, false otherwise.
 */
public typealias AttrFilterFunc = (attribute: Attribute) -> Boolean

/**
 * Callback used when enumerating fonts in a fontset.
 *
 * See [method@Pango.Fontset.foreach].
 *
 * - param `fontset` a `PangoFontset`
 * - param `font` a font from @fontset
 * - return if true, stop iteration and return immediately.
 */
public typealias FontsetForeachFunc = (fontset: Fontset, font: Font) -> Boolean
