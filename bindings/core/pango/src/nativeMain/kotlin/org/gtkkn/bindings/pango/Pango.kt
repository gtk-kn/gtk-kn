// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.MarkupParseContext
import org.gtkkn.bindings.pango.annotations.PangoVersion1_10
import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.bindings.pango.annotations.PangoVersion1_31_0
import org.gtkkn.bindings.pango.annotations.PangoVersion1_32
import org.gtkkn.bindings.pango.annotations.PangoVersion1_38
import org.gtkkn.bindings.pango.annotations.PangoVersion1_4
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.bindings.pango.annotations.PangoVersion1_8
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.glib.guint32
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.pango.PangoAttribute
import org.gtkkn.native.pango.PangoFont
import org.gtkkn.native.pango.PangoFontset
import org.gtkkn.native.pango.pango_attr_allow_breaks_new
import org.gtkkn.native.pango.pango_attr_background_alpha_new
import org.gtkkn.native.pango.pango_attr_background_new
import org.gtkkn.native.pango.pango_attr_baseline_shift_new
import org.gtkkn.native.pango.pango_attr_fallback_new
import org.gtkkn.native.pango.pango_attr_family_new
import org.gtkkn.native.pango.pango_attr_font_scale_new
import org.gtkkn.native.pango.pango_attr_foreground_alpha_new
import org.gtkkn.native.pango.pango_attr_foreground_new
import org.gtkkn.native.pango.pango_attr_gravity_hint_new
import org.gtkkn.native.pango.pango_attr_gravity_new
import org.gtkkn.native.pango.pango_attr_insert_hyphens_new
import org.gtkkn.native.pango.pango_attr_letter_spacing_new
import org.gtkkn.native.pango.pango_attr_line_height_new
import org.gtkkn.native.pango.pango_attr_line_height_new_absolute
import org.gtkkn.native.pango.pango_attr_overline_color_new
import org.gtkkn.native.pango.pango_attr_overline_new
import org.gtkkn.native.pango.pango_attr_rise_new
import org.gtkkn.native.pango.pango_attr_scale_new
import org.gtkkn.native.pango.pango_attr_sentence_new
import org.gtkkn.native.pango.pango_attr_show_new
import org.gtkkn.native.pango.pango_attr_stretch_new
import org.gtkkn.native.pango.pango_attr_strikethrough_color_new
import org.gtkkn.native.pango.pango_attr_strikethrough_new
import org.gtkkn.native.pango.pango_attr_style_new
import org.gtkkn.native.pango.pango_attr_text_transform_new
import org.gtkkn.native.pango.pango_attr_underline_color_new
import org.gtkkn.native.pango.pango_attr_underline_new
import org.gtkkn.native.pango.pango_attr_variant_new
import org.gtkkn.native.pango.pango_attr_weight_new
import org.gtkkn.native.pango.pango_attr_word_new
import org.gtkkn.native.pango.pango_default_break
import org.gtkkn.native.pango.pango_extents_to_pixels
import org.gtkkn.native.pango.pango_find_base_dir
import org.gtkkn.native.pango.pango_is_zero_width
import org.gtkkn.native.pango.pango_itemize
import org.gtkkn.native.pango.pango_itemize_with_base_dir
import org.gtkkn.native.pango.pango_markup_parser_new
import org.gtkkn.native.pango.pango_reorder_items
import org.gtkkn.native.pango.pango_shape
import org.gtkkn.native.pango.pango_shape_full
import org.gtkkn.native.pango.pango_shape_item
import org.gtkkn.native.pango.pango_shape_with_flags
import org.gtkkn.native.pango.pango_split_file_list
import org.gtkkn.native.pango.pango_trim_string
import org.gtkkn.native.pango.pango_unichar_direction
import org.gtkkn.native.pango.pango_units_from_double
import org.gtkkn.native.pango.pango_units_to_double
import org.gtkkn.native.pango.pango_version
import org.gtkkn.native.pango.pango_version_check
import org.gtkkn.native.pango.pango_version_string
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * ## Skipped during bindings generation
 *
 * - parameter `attrs`: Array parameter of type LogAttr is not supported
 * - parameter `attrs`: Array parameter of type LogAttr is not supported
 * - parameter `paragraph_delimiter_index`: paragraph_delimiter_index: Out parameter is not supported
 * - parameter `attrs`: Array parameter of type LogAttr is not supported
 * - parameter `mirrored_ch`: Unsupported pointer to primitive type
 * - function `log2vis_get_embedding_levels`: Return type guint8 is unsupported
 * - parameter `attr_list`: attr_list: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `attr_list`: attr_list: Out parameter is not supported
 * - parameter `stretch`: stretch: Out parameter is not supported
 * - parameter `style`: style: Out parameter is not supported
 * - parameter `variant`: variant: Out parameter is not supported
 * - parameter `weight`: weight: Out parameter is not supported
 * - function `quantize_line_geometry`: In/Out parameter is not supported
 * - parameter `stream`: Unsupported pointer to primitive type
 * - function `scan_int`: In/Out parameter is not supported
 * - function `scan_string`: In/Out parameter is not supported
 * - function `scan_word`: In/Out parameter is not supported
 * - function `skip_space`: In/Out parameter is not supported
 * - parameter `attrs`: Array parameter of type LogAttr is not supported
 * - record `ContextClass`: glib type struct are ignored
 * - record `FontClass`: glib type struct are ignored
 * - record `FontFaceClass`: glib type struct are ignored
 * - record `FontFamilyClass`: glib type struct are ignored
 * - record `FontMapClass`: glib type struct are ignored
 * - record `FontsetClass`: glib type struct are ignored
 * - record `FontsetSimpleClass`: glib type struct are ignored
 * - record `LayoutClass`: glib type struct are ignored
 * - record `RendererClass`: glib type struct are ignored
 * - include `HarfBuzz`: Missing dependant repository
 */
public object Pango {
    /**
     * Whether the segment should be shifted to center around the baseline.
     *
     * This is mainly used in vertical writing directions.
     *
     * @since 1.16
     */
    public const val ANALYSIS_FLAG_CENTERED_BASELINE: gint = 1

    /**
     * Whether this run holds ellipsized text.
     *
     * @since 1.36.7
     */
    public const val ANALYSIS_FLAG_IS_ELLIPSIS: gint = 2

    /**
     * Whether to add a hyphen at the end of the run during shaping.
     *
     * @since 1.44
     */
    public const val ANALYSIS_FLAG_NEED_HYPHEN: gint = 4

    /**
     * Value for @start_index in `PangoAttribute` that indicates
     * the beginning of the text.
     *
     * @since 1.24
     */
    public const val ATTR_INDEX_FROM_TEXT_BEGINNING: guint = 0u

    /**
     * Value for @end_index in `PangoAttribute` that indicates
     * the end of the text.
     *
     * @since 1.24
     */
    public const val ATTR_INDEX_TO_TEXT_END: guint32 = UInt.MAX_VALUE

    /**
     * A `PangoGlyph` value that indicates a zero-width empty glpyh.
     *
     * This is useful for example in shaper modules, to use as the glyph for
     * various zero-width Unicode characters (those passing [func@is_zero_width]).
     */
    public const val GLYPH_EMPTY: Glyph = 268435455u

    /**
     * A `PangoGlyph` value for invalid input.
     *
     * `PangoLayout` produces one such glyph per invalid input UTF-8 byte and such
     * a glyph is rendered as a crossed box.
     *
     * Note that this value is defined such that it has the %PANGO_GLYPH_UNKNOWN_FLAG
     * set.
     *
     * @since 1.20
     */
    public const val GLYPH_INVALID_INPUT: guint32 = UInt.MAX_VALUE

    /**
     * Flag used in `PangoGlyph` to turn a `gunichar` value of a valid Unicode
     * character into an unknown-character glyph for that `gunichar`.
     *
     * Such unknown-character glyphs may be rendered as a 'hex box'.
     */
    public const val GLYPH_UNKNOWN_FLAG: Glyph = 268435456u

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
    public const val SCALE: gint = 1024

    /**
     * The major component of the version of Pango available at compile-time.
     */
    public const val VERSION_MAJOR: gint = 1

    /**
     * The micro component of the version of Pango available at compile-time.
     */
    public const val VERSION_MICRO: gint = 1

    /**
     * The minor component of the version of Pango available at compile-time.
     */
    public const val VERSION_MINOR: gint = 52

    /**
     * A string literal containing the version of Pango available at compile-time.
     */
    public const val VERSION_STRING: String = "1.52.1"

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
    @PangoVersion1_44
    public fun attrAllowBreaksNew(allowBreaks: Boolean): Attribute =
        pango_attr_allow_breaks_new(allowBreaks.asGBoolean())!!.run {
            Attribute(this)
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
    @PangoVersion1_38
    public fun attrBackgroundAlphaNew(alpha: guint16): Attribute = pango_attr_background_alpha_new(alpha)!!.run {
        Attribute(this)
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
    public fun attrBackgroundNew(red: guint16, green: guint16, blue: guint16): Attribute =
        pango_attr_background_new(red, green, blue)!!.run {
            Attribute(this)
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
    @PangoVersion1_50
    public fun attrBaselineShiftNew(shift: gint): Attribute = pango_attr_baseline_shift_new(shift)!!.run {
        Attribute(this)
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
    @PangoVersion1_4
    public fun attrFallbackNew(enableFallback: Boolean): Attribute =
        pango_attr_fallback_new(enableFallback.asGBoolean())!!.run {
            Attribute(this)
        }

    /**
     * Create a new font family attribute.
     *
     * @param family the family or comma-separated list of families
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrFamilyNew(family: String): Attribute = pango_attr_family_new(family)!!.run {
        Attribute(this)
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
    @PangoVersion1_50
    public fun attrFontScaleNew(scale: FontScale): Attribute = pango_attr_font_scale_new(scale.nativeValue)!!.run {
        Attribute(this)
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
    @PangoVersion1_38
    public fun attrForegroundAlphaNew(alpha: guint16): Attribute = pango_attr_foreground_alpha_new(alpha)!!.run {
        Attribute(this)
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
    public fun attrForegroundNew(red: guint16, green: guint16, blue: guint16): Attribute =
        pango_attr_foreground_new(red, green, blue)!!.run {
            Attribute(this)
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
    @PangoVersion1_16
    public fun attrGravityHintNew(hint: GravityHint): Attribute = pango_attr_gravity_hint_new(hint.nativeValue)!!.run {
        Attribute(this)
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
    @PangoVersion1_16
    public fun attrGravityNew(gravity: Gravity): Attribute = pango_attr_gravity_new(gravity.nativeValue)!!.run {
        Attribute(this)
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
    @PangoVersion1_44
    public fun attrInsertHyphensNew(insertHyphens: Boolean): Attribute =
        pango_attr_insert_hyphens_new(insertHyphens.asGBoolean())!!.run {
            Attribute(this)
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
    @PangoVersion1_6
    public fun attrLetterSpacingNew(letterSpacing: gint): Attribute =
        pango_attr_letter_spacing_new(letterSpacing)!!.run {
            Attribute(this)
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
    @PangoVersion1_50
    public fun attrLineHeightNew(factor: gdouble): Attribute = pango_attr_line_height_new(factor)!!.run {
        Attribute(this)
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
    @PangoVersion1_50
    public fun attrLineHeightNewAbsolute(height: gint): Attribute = pango_attr_line_height_new_absolute(height)!!.run {
        Attribute(this)
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
    @PangoVersion1_46
    public fun attrOverlineColorNew(red: guint16, green: guint16, blue: guint16): Attribute =
        pango_attr_overline_color_new(red, green, blue)!!.run {
            Attribute(this)
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
    @PangoVersion1_46
    public fun attrOverlineNew(overline: Overline): Attribute = pango_attr_overline_new(overline.nativeValue)!!.run {
        Attribute(this)
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
    public fun attrRiseNew(rise: gint): Attribute = pango_attr_rise_new(rise)!!.run {
        Attribute(this)
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
    public fun attrScaleNew(scaleFactor: gdouble): Attribute = pango_attr_scale_new(scaleFactor)!!.run {
        Attribute(this)
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
    @PangoVersion1_50
    public fun attrSentenceNew(): Attribute = pango_attr_sentence_new()!!.run {
        Attribute(this)
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
    @PangoVersion1_44
    public fun attrShowNew(flags: ShowFlags): Attribute = pango_attr_show_new(flags.mask)!!.run {
        Attribute(this)
    }

    /**
     * Create a new font stretch attribute.
     *
     * @param stretch the stretch
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrStretchNew(stretch: Stretch): Attribute = pango_attr_stretch_new(stretch.nativeValue)!!.run {
        Attribute(this)
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
    @PangoVersion1_8
    public fun attrStrikethroughColorNew(red: guint16, green: guint16, blue: guint16): Attribute =
        pango_attr_strikethrough_color_new(red, green, blue)!!.run {
            Attribute(this)
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
            Attribute(this)
        }

    /**
     * Create a new font slant style attribute.
     *
     * @param style the slant style
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrStyleNew(style: Style): Attribute = pango_attr_style_new(style.nativeValue)!!.run {
        Attribute(this)
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
    @PangoVersion1_50
    public fun attrTextTransformNew(transform: TextTransform): Attribute =
        pango_attr_text_transform_new(transform.nativeValue)!!.run {
            Attribute(this)
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
    @PangoVersion1_8
    public fun attrUnderlineColorNew(red: guint16, green: guint16, blue: guint16): Attribute =
        pango_attr_underline_color_new(red, green, blue)!!.run {
            Attribute(this)
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
            Attribute(this)
        }

    /**
     * Create a new font variant attribute (normal or small caps).
     *
     * @param variant the variant
     * @return the newly allocated `PangoAttribute`,
     *   which should be freed with [method@Pango.Attribute.destroy].
     */
    public fun attrVariantNew(variant: Variant): Attribute = pango_attr_variant_new(variant.nativeValue)!!.run {
        Attribute(this)
    }

    /**
     * Create a new font weight attribute.
     *
     * @param weight the weight
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy]
     */
    public fun attrWeightNew(weight: Weight): Attribute = pango_attr_weight_new(weight.nativeValue)!!.run {
        Attribute(this)
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
    @PangoVersion1_50
    public fun attrWordNew(): Attribute = pango_attr_word_new()!!.run {
        Attribute(this)
    }

    /**
     * This is the default break algorithm.
     *
     * It applies rules from the [Unicode Line Breaking Algorithm](http://www.unicode.org/unicode/reports/tr14/)
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
        length: gint,
        analysis: Analysis? = null,
        attrs: LogAttr,
        attrsLen: gint,
    ): Unit = pango_default_break(text, length, analysis?.pangoAnalysisPointer, attrs.pangoLogAttrPointer, attrsLen)

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
    @PangoVersion1_16
    public fun extentsToPixels(inclusive: Rectangle? = null, nearest: Rectangle? = null): Unit =
        pango_extents_to_pixels(inclusive?.pangoRectanglePointer, nearest?.pangoRectanglePointer)

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
    @PangoVersion1_4
    public fun findBaseDir(text: String, length: gint): Direction = pango_find_base_dir(text, length).run {
        Direction.fromNativeValue(this)
    }

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
    @PangoVersion1_10
    public fun isZeroWidth(ch: gunichar): Boolean = pango_is_zero_width(ch).asBoolean()

    /**
     * Breaks a piece of text into segments with consistent directional
     * level and font.
     *
     * Each byte of @text will be contained in exactly one of the items in the
     * returned list; the generated list of items will be in logical order (the
     * start offsets of the items are ascending).
     *
     * @cached_iter should be an iterator over @attrs currently positioned
     * at a range before or containing @start_index; @cached_iter will be
     * advanced to the range covering the position just after
     * @start_index + @length. (i.e. if itemizing in a loop, just keep passing
     * in the same @cached_iter).
     *
     * @param context a structure holding information that affects
     *   the itemization process.
     * @param text the text to itemize. Must be valid UTF-8
     * @param startIndex first byte in @text to process
     * @param length the number of bytes (not characters) to process
     *   after @start_index. This must be >= 0.
     * @param attrs the set of attributes that apply to @text.
     * @param cachedIter Cached attribute iterator
     * @return a `GList` of
     *   [struct@Pango.Item] structures. The items should be freed using
     *   [method@Pango.Item.free] in combination with [func@GLib.List.free_full].
     */
    public fun itemize(
        context: Context,
        text: String,
        startIndex: gint,
        length: gint,
        attrs: AttrList,
        cachedIter: AttrIterator? = null,
    ): GlibList = pango_itemize(
        context.pangoContextPointer,
        text,
        startIndex,
        length,
        attrs.pangoAttrListPointer,
        cachedIter?.pangoAttrIteratorPointer
    )!!.run {
        GlibList(this)
    }

    /**
     * Like `pango_itemize()`, but with an explicitly specified base direction.
     *
     * The base direction is used when computing bidirectional levels.
     * [func@itemize] gets the base direction from the `PangoContext`
     * (see [method@Pango.Context.set_base_dir]).
     *
     * @param context a structure holding information that affects
     *   the itemization process.
     * @param baseDir base direction to use for bidirectional processing
     * @param text the text to itemize.
     * @param startIndex first byte in @text to process
     * @param length the number of bytes (not characters) to process
     *   after @start_index. This must be >= 0.
     * @param attrs the set of attributes that apply to @text.
     * @param cachedIter Cached attribute iterator
     * @return a `GList` of
     *   [struct@Pango.Item] structures. The items should be freed using
     *   [method@Pango.Item.free] probably in combination with [func@GLib.List.free_full].
     * @since 1.4
     */
    @PangoVersion1_4
    public fun itemizeWithBaseDir(
        context: Context,
        baseDir: Direction,
        text: String,
        startIndex: gint,
        length: gint,
        attrs: AttrList,
        cachedIter: AttrIterator? = null,
    ): GlibList = pango_itemize_with_base_dir(
        context.pangoContextPointer,
        baseDir.nativeValue,
        text,
        startIndex,
        length,
        attrs.pangoAttrListPointer,
        cachedIter?.pangoAttrIteratorPointer
    )!!.run {
        GlibList(this)
    }

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
    @PangoVersion1_31_0
    public fun markupParserNew(accelMarker: gunichar): MarkupParseContext = pango_markup_parser_new(accelMarker)!!.run {
        MarkupParseContext(this)
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
    public fun reorderItems(items: GlibList): GlibList = pango_reorder_items(items.glibListPointer)!!.run {
        GlibList(this)
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
     * Some aspects of hyphen insertion and text transformation (in particular,
     * capitalization) require log attrs, and thus can only be handled by
     * [func@Pango.shape_item].
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
    public fun shape(text: String, length: gint, analysis: Analysis, glyphs: GlyphString): Unit =
        pango_shape(text, length, analysis.pangoAnalysisPointer, glyphs.pangoGlyphStringPointer)

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
     * Some aspects of hyphen insertion and text transformation (in particular,
     * capitalization) require log attrs, and thus can only be handled by
     * [func@Pango.shape_item].
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
     * @param paragraphLength the length (in bytes) of @paragraph_text. -1 means nul-terminated text.
     * @param analysis `PangoAnalysis` structure from [func@Pango.itemize].
     * @param glyphs glyph string in which to store results.
     * @since 1.32
     */
    @PangoVersion1_32
    public fun shapeFull(
        itemText: String,
        itemLength: gint,
        paragraphText: String? = null,
        paragraphLength: gint,
        analysis: Analysis,
        glyphs: GlyphString,
    ): Unit = pango_shape_full(
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
     *
     * It also takes @log_attrs, which are needed for implementing some aspects
     * of hyphen insertion and text transforms (in particular, capitalization).
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
    @PangoVersion1_50
    public fun shapeItem(
        item: Item,
        paragraphText: String? = null,
        paragraphLength: gint,
        logAttrs: LogAttr? = null,
        glyphs: GlyphString,
        flags: ShapeFlags,
    ): Unit = pango_shape_item(
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
     * Some aspects of hyphen insertion and text transformation (in particular,
     * capitalization) require log attrs, and thus can only be handled by
     * [func@Pango.shape_item].
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
    @PangoVersion1_44
    public fun shapeWithFlags(
        itemText: String,
        itemLength: gint,
        paragraphText: String? = null,
        paragraphLength: gint,
        analysis: Analysis,
        glyphs: GlyphString,
        flags: ShapeFlags,
    ): Unit = pango_shape_with_flags(
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
     * Trims leading and trailing whitespace from a string.
     *
     * @param str a string
     * @return A newly-allocated string that must be freed with g_free()
     */
    public fun trimString(str: String): String =
        pango_trim_string(str)?.toKString() ?: error("Expected not null string")

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
    public fun unicharDirection(ch: gunichar): Direction = pango_unichar_direction(ch).run {
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
    @PangoVersion1_16
    public fun unitsFromDouble(d: gdouble): gint = pango_units_from_double(d)

    /**
     * Converts a number in Pango units to floating-point.
     *
     * The conversion is done by dividing @i by %PANGO_SCALE.
     *
     * @param i value in Pango units
     * @return the double value.
     * @since 1.16
     */
    @PangoVersion1_16
    public fun unitsToDouble(i: gint): gdouble = pango_units_to_double(i)

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
    @PangoVersion1_16
    public fun version(): gint = pango_version()

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
    @PangoVersion1_16
    public fun versionCheck(requiredMajor: gint, requiredMinor: gint, requiredMicro: gint): String? =
        pango_version_check(requiredMajor, requiredMinor, requiredMicro)?.toKString()

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
    @PangoVersion1_16
    public fun versionString(): String = pango_version_string()?.toKString() ?: error("Expected not null string")

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            LayoutDeserializeError.quark() -> LayoutDeserializeError.fromErrorOrNull(error)
                ?.let {
                    LayoutDeserializeErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val AttrDataCopyFuncFunc: CPointer<CFunction<() -> gpointer?>> = staticCFunction { userData: gpointer? ->
    userData!!.asStableRef<() -> gpointer?>().get().invoke()
}
    .reinterpret()

public val AttrFilterFuncFunc: CPointer<CFunction<(CPointer<PangoAttribute>) -> gboolean>> =
    staticCFunction {
            attribute: CPointer<PangoAttribute>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(attribute: Attribute) -> Boolean>().get().invoke(
            attribute!!.run {
                Attribute(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val FontsetForeachFuncFunc:
    CPointer<CFunction<(CPointer<PangoFontset>, CPointer<PangoFont>) -> gboolean>> =
    staticCFunction {
            fontset: CPointer<PangoFontset>?,
            font: CPointer<PangoFont>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(fontset: Fontset, font: Font) -> Boolean>().get().invoke(
            fontset!!.run {
                Fontset.FontsetImpl(this)
            },
            font!!.run {
                Font.FontImpl(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

/**
 * Type of a function that can duplicate user data for an attribute.
 *
 * - return new copy of @user_data.
 */
public typealias AttrDataCopyFunc = () -> gpointer?

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

/**
 * A `PangoGlyph` represents a single glyph in the output form of a string.
 */
public typealias Glyph = guint

/**
 * The `PangoGlyphUnit` type is used to store dimensions within
 * Pango.
 *
 * Dimensions are stored in 1/PANGO_SCALE of a device unit.
 * (A device unit might be a pixel for screen display, or
 * a point on a printer.) PANGO_SCALE is currently 1024, and
 * may change in the future (unlikely though), but you should not
 * depend on its exact value.
 *
 * The PANGO_PIXELS() macro can be used to convert from glyph units
 * into device units with correct rounding.
 */
public typealias GlyphUnit = gint

/**
 * A `PangoLayoutRun` represents a single run within a `PangoLayoutLine`.
 *
 * It is simply an alternate name for [struct@Pango.GlyphItem].
 * See the [struct@Pango.GlyphItem] docs for details on the fields.
 */
public typealias LayoutRun = GlyphItem
