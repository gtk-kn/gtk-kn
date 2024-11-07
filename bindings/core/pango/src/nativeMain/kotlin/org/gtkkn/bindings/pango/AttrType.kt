// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.native.pango.PangoAttrType
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
    INVALID(PangoAttrType.PANGO_ATTR_INVALID),

    /**
     * language ([struct@Pango.AttrLanguage])
     */
    LANGUAGE(PangoAttrType.PANGO_ATTR_LANGUAGE),

    /**
     * font family name list ([struct@Pango.AttrString])
     */
    FAMILY(PangoAttrType.PANGO_ATTR_FAMILY),

    /**
     * font slant style ([struct@Pango.AttrInt])
     */
    STYLE(PangoAttrType.PANGO_ATTR_STYLE),

    /**
     * font weight ([struct@Pango.AttrInt])
     */
    WEIGHT(PangoAttrType.PANGO_ATTR_WEIGHT),

    /**
     * font variant (normal or small caps) ([struct@Pango.AttrInt])
     */
    VARIANT(PangoAttrType.PANGO_ATTR_VARIANT),

    /**
     * font stretch ([struct@Pango.AttrInt])
     */
    STRETCH(PangoAttrType.PANGO_ATTR_STRETCH),

    /**
     * font size in points scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
     */
    SIZE(PangoAttrType.PANGO_ATTR_SIZE),

    /**
     * font description ([struct@Pango.AttrFontDesc])
     */
    FONT_DESC(PangoAttrType.PANGO_ATTR_FONT_DESC),

    /**
     * foreground color ([struct@Pango.AttrColor])
     */
    FOREGROUND(PangoAttrType.PANGO_ATTR_FOREGROUND),

    /**
     * background color ([struct@Pango.AttrColor])
     */
    BACKGROUND(PangoAttrType.PANGO_ATTR_BACKGROUND),

    /**
     * whether the text has an underline ([struct@Pango.AttrInt])
     */
    UNDERLINE(PangoAttrType.PANGO_ATTR_UNDERLINE),

    /**
     * whether the text is struck-through ([struct@Pango.AttrInt])
     */
    STRIKETHROUGH(PangoAttrType.PANGO_ATTR_STRIKETHROUGH),

    /**
     * baseline displacement ([struct@Pango.AttrInt])
     */
    RISE(PangoAttrType.PANGO_ATTR_RISE),

    /**
     * shape ([struct@Pango.AttrShape])
     */
    SHAPE(PangoAttrType.PANGO_ATTR_SHAPE),

    /**
     * font size scale factor ([struct@Pango.AttrFloat])
     */
    SCALE(PangoAttrType.PANGO_ATTR_SCALE),

    /**
     * whether fallback is enabled ([struct@Pango.AttrInt])
     */
    FALLBACK(PangoAttrType.PANGO_ATTR_FALLBACK),

    /**
     * letter spacing ([struct@PangoAttrInt])
     */
    LETTER_SPACING(PangoAttrType.PANGO_ATTR_LETTER_SPACING),

    /**
     * underline color ([struct@Pango.AttrColor])
     */
    UNDERLINE_COLOR(PangoAttrType.PANGO_ATTR_UNDERLINE_COLOR),

    /**
     * strikethrough color ([struct@Pango.AttrColor])
     */
    STRIKETHROUGH_COLOR(PangoAttrType.PANGO_ATTR_STRIKETHROUGH_COLOR),

    /**
     * font size in pixels scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
     */
    ABSOLUTE_SIZE(PangoAttrType.PANGO_ATTR_ABSOLUTE_SIZE),

    /**
     * base text gravity ([struct@Pango.AttrInt])
     */
    GRAVITY(PangoAttrType.PANGO_ATTR_GRAVITY),

    /**
     * gravity hint ([struct@Pango.AttrInt])
     */
    GRAVITY_HINT(PangoAttrType.PANGO_ATTR_GRAVITY_HINT),

    /**
     * OpenType font features ([struct@Pango.AttrFontFeatures]). Since 1.38
     */
    FONT_FEATURES(PangoAttrType.PANGO_ATTR_FONT_FEATURES),

    /**
     * foreground alpha ([struct@Pango.AttrInt]). Since 1.38
     */
    FOREGROUND_ALPHA(PangoAttrType.PANGO_ATTR_FOREGROUND_ALPHA),

    /**
     * background alpha ([struct@Pango.AttrInt]). Since 1.38
     */
    BACKGROUND_ALPHA(PangoAttrType.PANGO_ATTR_BACKGROUND_ALPHA),

    /**
     * whether breaks are allowed ([struct@Pango.AttrInt]). Since 1.44
     */
    ALLOW_BREAKS(PangoAttrType.PANGO_ATTR_ALLOW_BREAKS),

    /**
     * how to render invisible characters ([struct@Pango.AttrInt]). Since 1.44
     */
    SHOW(PangoAttrType.PANGO_ATTR_SHOW),

    /**
     * whether to insert hyphens at intra-word line breaks ([struct@Pango.AttrInt]). Since 1.44
     */
    INSERT_HYPHENS(PangoAttrType.PANGO_ATTR_INSERT_HYPHENS),

    /**
     * whether the text has an overline ([struct@Pango.AttrInt]). Since 1.46
     */
    OVERLINE(PangoAttrType.PANGO_ATTR_OVERLINE),

    /**
     * overline color ([struct@Pango.AttrColor]). Since 1.46
     */
    OVERLINE_COLOR(PangoAttrType.PANGO_ATTR_OVERLINE_COLOR),

    /**
     * line height factor ([struct@Pango.AttrFloat]). Since: 1.50
     */
    LINE_HEIGHT(PangoAttrType.PANGO_ATTR_LINE_HEIGHT),

    /**
     * line height ([struct@Pango.AttrInt]). Since: 1.50
     */
    ABSOLUTE_LINE_HEIGHT(PangoAttrType.PANGO_ATTR_ABSOLUTE_LINE_HEIGHT),
    TEXT_TRANSFORM(PangoAttrType.PANGO_ATTR_TEXT_TRANSFORM),

    /**
     * override segmentation to classify the range of the attribute as a single word ([struct@Pango.AttrInt]). Since 1.50
     */
    WORD(PangoAttrType.PANGO_ATTR_WORD),

    /**
     * override segmentation to classify the range of the attribute as a single sentence ([struct@Pango.AttrInt]). Since 1.50
     */
    SENTENCE(PangoAttrType.PANGO_ATTR_SENTENCE),

    /**
     * baseline displacement ([struct@Pango.AttrInt]). Since 1.50
     */
    BASELINE_SHIFT(PangoAttrType.PANGO_ATTR_BASELINE_SHIFT),

    /**
     * font-relative size change ([struct@Pango.AttrInt]). Since 1.50
     */
    FONT_SCALE(PangoAttrType.PANGO_ATTR_FONT_SCALE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoAttrType): AttrType =
            when (nativeValue) {
                PangoAttrType.PANGO_ATTR_INVALID -> INVALID
                PangoAttrType.PANGO_ATTR_LANGUAGE -> LANGUAGE
                PangoAttrType.PANGO_ATTR_FAMILY -> FAMILY
                PangoAttrType.PANGO_ATTR_STYLE -> STYLE
                PangoAttrType.PANGO_ATTR_WEIGHT -> WEIGHT
                PangoAttrType.PANGO_ATTR_VARIANT -> VARIANT
                PangoAttrType.PANGO_ATTR_STRETCH -> STRETCH
                PangoAttrType.PANGO_ATTR_SIZE -> SIZE
                PangoAttrType.PANGO_ATTR_FONT_DESC -> FONT_DESC
                PangoAttrType.PANGO_ATTR_FOREGROUND -> FOREGROUND
                PangoAttrType.PANGO_ATTR_BACKGROUND -> BACKGROUND
                PangoAttrType.PANGO_ATTR_UNDERLINE -> UNDERLINE
                PangoAttrType.PANGO_ATTR_STRIKETHROUGH -> STRIKETHROUGH
                PangoAttrType.PANGO_ATTR_RISE -> RISE
                PangoAttrType.PANGO_ATTR_SHAPE -> SHAPE
                PangoAttrType.PANGO_ATTR_SCALE -> SCALE
                PangoAttrType.PANGO_ATTR_FALLBACK -> FALLBACK
                PangoAttrType.PANGO_ATTR_LETTER_SPACING -> LETTER_SPACING
                PangoAttrType.PANGO_ATTR_UNDERLINE_COLOR -> UNDERLINE_COLOR
                PangoAttrType.PANGO_ATTR_STRIKETHROUGH_COLOR -> STRIKETHROUGH_COLOR
                PangoAttrType.PANGO_ATTR_ABSOLUTE_SIZE -> ABSOLUTE_SIZE
                PangoAttrType.PANGO_ATTR_GRAVITY -> GRAVITY
                PangoAttrType.PANGO_ATTR_GRAVITY_HINT -> GRAVITY_HINT
                PangoAttrType.PANGO_ATTR_FONT_FEATURES -> FONT_FEATURES
                PangoAttrType.PANGO_ATTR_FOREGROUND_ALPHA -> FOREGROUND_ALPHA
                PangoAttrType.PANGO_ATTR_BACKGROUND_ALPHA -> BACKGROUND_ALPHA
                PangoAttrType.PANGO_ATTR_ALLOW_BREAKS -> ALLOW_BREAKS
                PangoAttrType.PANGO_ATTR_SHOW -> SHOW
                PangoAttrType.PANGO_ATTR_INSERT_HYPHENS -> INSERT_HYPHENS
                PangoAttrType.PANGO_ATTR_OVERLINE -> OVERLINE
                PangoAttrType.PANGO_ATTR_OVERLINE_COLOR -> OVERLINE_COLOR
                PangoAttrType.PANGO_ATTR_LINE_HEIGHT -> LINE_HEIGHT
                PangoAttrType.PANGO_ATTR_ABSOLUTE_LINE_HEIGHT -> ABSOLUTE_LINE_HEIGHT
                PangoAttrType.PANGO_ATTR_TEXT_TRANSFORM -> TEXT_TRANSFORM
                PangoAttrType.PANGO_ATTR_WORD -> WORD
                PangoAttrType.PANGO_ATTR_SENTENCE -> SENTENCE
                PangoAttrType.PANGO_ATTR_BASELINE_SHIFT -> BASELINE_SHIFT
                PangoAttrType.PANGO_ATTR_FONT_SCALE -> FONT_SCALE
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
        @PangoVersion1_22
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
