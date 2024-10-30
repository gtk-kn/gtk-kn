// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.toKString
import org.gtkkn.native.pango.PangoAttrType
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_ABSOLUTE_LINE_HEIGHT
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_ABSOLUTE_SIZE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_ALLOW_BREAKS
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_BACKGROUND
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_BACKGROUND_ALPHA
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_BASELINE_SHIFT
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FALLBACK
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FAMILY
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FONT_DESC
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FONT_FEATURES
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FONT_SCALE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FOREGROUND
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_FOREGROUND_ALPHA
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_GRAVITY
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_GRAVITY_HINT
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_INSERT_HYPHENS
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_INVALID
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_LANGUAGE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_LETTER_SPACING
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_LINE_HEIGHT
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_OVERLINE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_OVERLINE_COLOR
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_RISE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_SCALE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_SENTENCE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_SHAPE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_SHOW
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_SIZE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_STRETCH
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_STRIKETHROUGH
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_STRIKETHROUGH_COLOR
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_STYLE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_TEXT_TRANSFORM
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_UNDERLINE
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_UNDERLINE_COLOR
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_VARIANT
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_WEIGHT
import org.gtkkn.native.pango.PangoAttrType.PANGO_ATTR_WORD
import org.gtkkn.native.pango.pango_attr_type_get_name
import org.gtkkn.native.pango.pango_attr_type_register
import kotlin.String

/**
 * The `PangoAttrType` distinguishes between different types of attributes.
 *
 * Along with the predefined values, it is possible to allocate additional
 * values for custom attributes using [func@AttrType.register]. The predefined
 * values are given below. The type of structure used to store the attribute is
 * listed in parentheses after the description.
 */
public enum class AttrType(
    public val nativeValue: PangoAttrType,
) {
    /**
     * does not happen
     */
    INVALID(PANGO_ATTR_INVALID),

    /**
     * language ([struct@Pango.AttrLanguage])
     */
    LANGUAGE(PANGO_ATTR_LANGUAGE),

    /**
     * font family name list ([struct@Pango.AttrString])
     */
    FAMILY(PANGO_ATTR_FAMILY),

    /**
     * font slant style ([struct@Pango.AttrInt])
     */
    STYLE(PANGO_ATTR_STYLE),

    /**
     * font weight ([struct@Pango.AttrInt])
     */
    WEIGHT(PANGO_ATTR_WEIGHT),

    /**
     * font variant (normal or small caps) ([struct@Pango.AttrInt])
     */
    VARIANT(PANGO_ATTR_VARIANT),

    /**
     * font stretch ([struct@Pango.AttrInt])
     */
    STRETCH(PANGO_ATTR_STRETCH),

    /**
     * font size in points scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
     */
    SIZE(PANGO_ATTR_SIZE),

    /**
     * font description ([struct@Pango.AttrFontDesc])
     */
    FONT_DESC(PANGO_ATTR_FONT_DESC),

    /**
     * foreground color ([struct@Pango.AttrColor])
     */
    FOREGROUND(PANGO_ATTR_FOREGROUND),

    /**
     * background color ([struct@Pango.AttrColor])
     */
    BACKGROUND(PANGO_ATTR_BACKGROUND),

    /**
     * whether the text has an underline ([struct@Pango.AttrInt])
     */
    UNDERLINE(PANGO_ATTR_UNDERLINE),

    /**
     * whether the text is struck-through ([struct@Pango.AttrInt])
     */
    STRIKETHROUGH(PANGO_ATTR_STRIKETHROUGH),

    /**
     * baseline displacement ([struct@Pango.AttrInt])
     */
    RISE(PANGO_ATTR_RISE),

    /**
     * shape ([struct@Pango.AttrShape])
     */
    SHAPE(PANGO_ATTR_SHAPE),

    /**
     * font size scale factor ([struct@Pango.AttrFloat])
     */
    SCALE(PANGO_ATTR_SCALE),

    /**
     * whether fallback is enabled ([struct@Pango.AttrInt])
     */
    FALLBACK(PANGO_ATTR_FALLBACK),

    /**
     * letter spacing ([struct@PangoAttrInt])
     */
    LETTER_SPACING(PANGO_ATTR_LETTER_SPACING),

    /**
     * underline color ([struct@Pango.AttrColor])
     */
    UNDERLINE_COLOR(PANGO_ATTR_UNDERLINE_COLOR),

    /**
     * strikethrough color ([struct@Pango.AttrColor])
     */
    STRIKETHROUGH_COLOR(PANGO_ATTR_STRIKETHROUGH_COLOR),

    /**
     * font size in pixels scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
     */
    ABSOLUTE_SIZE(PANGO_ATTR_ABSOLUTE_SIZE),

    /**
     * base text gravity ([struct@Pango.AttrInt])
     */
    GRAVITY(PANGO_ATTR_GRAVITY),

    /**
     * gravity hint ([struct@Pango.AttrInt])
     */
    GRAVITY_HINT(PANGO_ATTR_GRAVITY_HINT),

    /**
     * OpenType font features ([struct@Pango.AttrFontFeatures]). Since 1.38
     */
    FONT_FEATURES(PANGO_ATTR_FONT_FEATURES),

    /**
     * foreground alpha ([struct@Pango.AttrInt]). Since 1.38
     */
    FOREGROUND_ALPHA(PANGO_ATTR_FOREGROUND_ALPHA),

    /**
     * background alpha ([struct@Pango.AttrInt]). Since 1.38
     */
    BACKGROUND_ALPHA(PANGO_ATTR_BACKGROUND_ALPHA),

    /**
     * whether breaks are allowed ([struct@Pango.AttrInt]). Since 1.44
     */
    ALLOW_BREAKS(PANGO_ATTR_ALLOW_BREAKS),

    /**
     * how to render invisible characters ([struct@Pango.AttrInt]). Since 1.44
     */
    SHOW(PANGO_ATTR_SHOW),

    /**
     * whether to insert hyphens at intra-word line breaks ([struct@Pango.AttrInt]). Since 1.44
     */
    INSERT_HYPHENS(PANGO_ATTR_INSERT_HYPHENS),

    /**
     * whether the text has an overline ([struct@Pango.AttrInt]). Since 1.46
     */
    OVERLINE(PANGO_ATTR_OVERLINE),

    /**
     * overline color ([struct@Pango.AttrColor]). Since 1.46
     */
    OVERLINE_COLOR(PANGO_ATTR_OVERLINE_COLOR),

    /**
     * line height factor ([struct@Pango.AttrFloat]). Since: 1.50
     */
    LINE_HEIGHT(PANGO_ATTR_LINE_HEIGHT),

    /**
     * line height ([struct@Pango.AttrInt]). Since: 1.50
     */
    ABSOLUTE_LINE_HEIGHT(PANGO_ATTR_ABSOLUTE_LINE_HEIGHT),
    TEXT_TRANSFORM(PANGO_ATTR_TEXT_TRANSFORM),

    /**
     * override segmentation to classify the range of the attribute as a single word ([struct@Pango.AttrInt]). Since 1.50
     */
    WORD(PANGO_ATTR_WORD),

    /**
     * override segmentation to classify the range of the attribute as a single sentence ([struct@Pango.AttrInt]). Since 1.50
     */
    SENTENCE(PANGO_ATTR_SENTENCE),

    /**
     * baseline displacement ([struct@Pango.AttrInt]). Since 1.50
     */
    BASELINE_SHIFT(PANGO_ATTR_BASELINE_SHIFT),

    /**
     * font-relative size change ([struct@Pango.AttrInt]). Since 1.50
     */
    FONT_SCALE(PANGO_ATTR_FONT_SCALE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoAttrType): AttrType =
            when (nativeValue) {
                PANGO_ATTR_INVALID -> INVALID
                PANGO_ATTR_LANGUAGE -> LANGUAGE
                PANGO_ATTR_FAMILY -> FAMILY
                PANGO_ATTR_STYLE -> STYLE
                PANGO_ATTR_WEIGHT -> WEIGHT
                PANGO_ATTR_VARIANT -> VARIANT
                PANGO_ATTR_STRETCH -> STRETCH
                PANGO_ATTR_SIZE -> SIZE
                PANGO_ATTR_FONT_DESC -> FONT_DESC
                PANGO_ATTR_FOREGROUND -> FOREGROUND
                PANGO_ATTR_BACKGROUND -> BACKGROUND
                PANGO_ATTR_UNDERLINE -> UNDERLINE
                PANGO_ATTR_STRIKETHROUGH -> STRIKETHROUGH
                PANGO_ATTR_RISE -> RISE
                PANGO_ATTR_SHAPE -> SHAPE
                PANGO_ATTR_SCALE -> SCALE
                PANGO_ATTR_FALLBACK -> FALLBACK
                PANGO_ATTR_LETTER_SPACING -> LETTER_SPACING
                PANGO_ATTR_UNDERLINE_COLOR -> UNDERLINE_COLOR
                PANGO_ATTR_STRIKETHROUGH_COLOR -> STRIKETHROUGH_COLOR
                PANGO_ATTR_ABSOLUTE_SIZE -> ABSOLUTE_SIZE
                PANGO_ATTR_GRAVITY -> GRAVITY
                PANGO_ATTR_GRAVITY_HINT -> GRAVITY_HINT
                PANGO_ATTR_FONT_FEATURES -> FONT_FEATURES
                PANGO_ATTR_FOREGROUND_ALPHA -> FOREGROUND_ALPHA
                PANGO_ATTR_BACKGROUND_ALPHA -> BACKGROUND_ALPHA
                PANGO_ATTR_ALLOW_BREAKS -> ALLOW_BREAKS
                PANGO_ATTR_SHOW -> SHOW
                PANGO_ATTR_INSERT_HYPHENS -> INSERT_HYPHENS
                PANGO_ATTR_OVERLINE -> OVERLINE
                PANGO_ATTR_OVERLINE_COLOR -> OVERLINE_COLOR
                PANGO_ATTR_LINE_HEIGHT -> LINE_HEIGHT
                PANGO_ATTR_ABSOLUTE_LINE_HEIGHT -> ABSOLUTE_LINE_HEIGHT
                PANGO_ATTR_TEXT_TRANSFORM -> TEXT_TRANSFORM
                PANGO_ATTR_WORD -> WORD
                PANGO_ATTR_SENTENCE -> SENTENCE
                PANGO_ATTR_BASELINE_SHIFT -> BASELINE_SHIFT
                PANGO_ATTR_FONT_SCALE -> FONT_SCALE
                else -> error("invalid nativeValue")
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
        public fun getName(type: AttrType): String? = pango_attr_type_get_name(type.nativeValue)?.toKString()

        /**
         * Allocate a new attribute type ID.
         *
         * The attribute type name can be accessed later
         * by using [func@Pango.AttrType.get_name].
         *
         * @param name an identifier for the type
         * @return the new type ID.
         */
        public fun register(name: String): AttrType =
            pango_attr_type_register(name).run {
                AttrType.fromNativeValue(this)
            }
    }
}
