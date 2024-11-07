// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.toKString
import org.gtkkn.native.atk.AtkTextAttribute
import org.gtkkn.native.atk.atk_text_attribute_for_name
import org.gtkkn.native.atk.atk_text_attribute_get_name
import org.gtkkn.native.atk.atk_text_attribute_get_value
import org.gtkkn.native.atk.atk_text_attribute_register
import kotlin.Int
import kotlin.String

/**
 * Describes the text attributes supported
 */
public enum class TextAttribute(
    public val nativeValue: AtkTextAttribute,
) {
    /**
     * Invalid attribute, like bad spelling or grammar.
     */
    INVALID(AtkTextAttribute.ATK_TEXT_ATTR_INVALID),

    /**
     * The pixel width of the left margin
     */
    LEFT_MARGIN(AtkTextAttribute.ATK_TEXT_ATTR_LEFT_MARGIN),

    /**
     * The pixel width of the right margin
     */
    RIGHT_MARGIN(AtkTextAttribute.ATK_TEXT_ATTR_RIGHT_MARGIN),

    /**
     * The number of pixels that the text is indented
     */
    INDENT(AtkTextAttribute.ATK_TEXT_ATTR_INDENT),

    /**
     * Either "true" or "false" indicating whether text is visible or not
     */
    INVISIBLE(AtkTextAttribute.ATK_TEXT_ATTR_INVISIBLE),

    /**
     * Either "true" or "false" indicating whether text is editable or not
     */
    EDITABLE(AtkTextAttribute.ATK_TEXT_ATTR_EDITABLE),

    /**
     * Pixels of blank space to leave above each newline-terminated line.
     */
    PIXELS_ABOVE_LINES(AtkTextAttribute.ATK_TEXT_ATTR_PIXELS_ABOVE_LINES),

    /**
     * Pixels of blank space to leave below each newline-terminated line.
     */
    PIXELS_BELOW_LINES(AtkTextAttribute.ATK_TEXT_ATTR_PIXELS_BELOW_LINES),

    /**
     * Pixels of blank space to leave between wrapped lines inside the same newline-terminated line (paragraph).
     */
    PIXELS_INSIDE_WRAP(AtkTextAttribute.ATK_TEXT_ATTR_PIXELS_INSIDE_WRAP),

    /**
     * "true" or "false" whether to make the background color for each character the height of the highest font used on the current line, or the height of the font used for the current character.
     */
    BG_FULL_HEIGHT(AtkTextAttribute.ATK_TEXT_ATTR_BG_FULL_HEIGHT),

    /**
     * Number of pixels that the characters are risen above the baseline. See also ATK_TEXT_ATTR_TEXT_POSITION.
     */
    RISE(AtkTextAttribute.ATK_TEXT_ATTR_RISE),

    /**
     * "none", "single", "double", "low", or "error"
     */
    UNDERLINE(AtkTextAttribute.ATK_TEXT_ATTR_UNDERLINE),

    /**
     * "true" or "false" whether the text is strikethrough
     */
    STRIKETHROUGH(AtkTextAttribute.ATK_TEXT_ATTR_STRIKETHROUGH),

    /**
     * The size of the characters in points. eg: 10
     */
    SIZE(AtkTextAttribute.ATK_TEXT_ATTR_SIZE),

    /**
     * The scale of the characters. The value is a string representation of a double
     */
    SCALE(AtkTextAttribute.ATK_TEXT_ATTR_SCALE),

    /**
     * The weight of the characters.
     */
    WEIGHT(AtkTextAttribute.ATK_TEXT_ATTR_WEIGHT),

    /**
     * The language used
     */
    LANGUAGE(AtkTextAttribute.ATK_TEXT_ATTR_LANGUAGE),

    /**
     * The font family name
     */
    FAMILY_NAME(AtkTextAttribute.ATK_TEXT_ATTR_FAMILY_NAME),

    /**
     * The background color. The value is an RGB value of the format "%u,%u,%u"
     */
    BG_COLOR(AtkTextAttribute.ATK_TEXT_ATTR_BG_COLOR),

    /**
     * The foreground color. The value is an RGB value of the format "%u,%u,%u"
     */
    FG_COLOR(AtkTextAttribute.ATK_TEXT_ATTR_FG_COLOR),

    /**
     * "true" if a #GdkBitmap is set for stippling the background color.
     */
    BG_STIPPLE(AtkTextAttribute.ATK_TEXT_ATTR_BG_STIPPLE),

    /**
     * "true" if a #GdkBitmap is set for stippling the foreground color.
     */
    FG_STIPPLE(AtkTextAttribute.ATK_TEXT_ATTR_FG_STIPPLE),

    /**
     * The wrap mode of the text, if any. Values are "none", "char", "word", or "word_char".
     */
    WRAP_MODE(AtkTextAttribute.ATK_TEXT_ATTR_WRAP_MODE),

    /**
     * The direction of the text, if set. Values are "none", "ltr" or "rtl"
     */
    DIRECTION(AtkTextAttribute.ATK_TEXT_ATTR_DIRECTION),

    /**
     * The justification of the text, if set. Values are "left", "right", "center" or "fill"
     */
    JUSTIFICATION(AtkTextAttribute.ATK_TEXT_ATTR_JUSTIFICATION),

    /**
     * The stretch of the text, if set. Values are "ultra_condensed", "extra_condensed", "condensed", "semi_condensed", "normal", "semi_expanded", "expanded", "extra_expanded" or "ultra_expanded"
     */
    STRETCH(AtkTextAttribute.ATK_TEXT_ATTR_STRETCH),

    /**
     * The capitalization variant of the text, if set. Values are "normal" or "small_caps"
     */
    VARIANT(AtkTextAttribute.ATK_TEXT_ATTR_VARIANT),

    /**
     * The slant style of the text, if set. Values are "normal", "oblique" or "italic"
     */
    STYLE(AtkTextAttribute.ATK_TEXT_ATTR_STYLE),

    /**
     * The vertical position with respect to the baseline. Values are "baseline", "super", or "sub". Note that a super or sub text attribute refers to position with respect to the baseline of the prior character.
     */
    TEXT_POSITION(AtkTextAttribute.ATK_TEXT_ATTR_TEXT_POSITION),

    /**
     * not a valid text attribute, used for finding end of enumeration
     */
    LAST_DEFINED(AtkTextAttribute.ATK_TEXT_ATTR_LAST_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkTextAttribute): TextAttribute =
            when (nativeValue) {
                AtkTextAttribute.ATK_TEXT_ATTR_INVALID -> INVALID
                AtkTextAttribute.ATK_TEXT_ATTR_LEFT_MARGIN -> LEFT_MARGIN
                AtkTextAttribute.ATK_TEXT_ATTR_RIGHT_MARGIN -> RIGHT_MARGIN
                AtkTextAttribute.ATK_TEXT_ATTR_INDENT -> INDENT
                AtkTextAttribute.ATK_TEXT_ATTR_INVISIBLE -> INVISIBLE
                AtkTextAttribute.ATK_TEXT_ATTR_EDITABLE -> EDITABLE
                AtkTextAttribute.ATK_TEXT_ATTR_PIXELS_ABOVE_LINES -> PIXELS_ABOVE_LINES
                AtkTextAttribute.ATK_TEXT_ATTR_PIXELS_BELOW_LINES -> PIXELS_BELOW_LINES
                AtkTextAttribute.ATK_TEXT_ATTR_PIXELS_INSIDE_WRAP -> PIXELS_INSIDE_WRAP
                AtkTextAttribute.ATK_TEXT_ATTR_BG_FULL_HEIGHT -> BG_FULL_HEIGHT
                AtkTextAttribute.ATK_TEXT_ATTR_RISE -> RISE
                AtkTextAttribute.ATK_TEXT_ATTR_UNDERLINE -> UNDERLINE
                AtkTextAttribute.ATK_TEXT_ATTR_STRIKETHROUGH -> STRIKETHROUGH
                AtkTextAttribute.ATK_TEXT_ATTR_SIZE -> SIZE
                AtkTextAttribute.ATK_TEXT_ATTR_SCALE -> SCALE
                AtkTextAttribute.ATK_TEXT_ATTR_WEIGHT -> WEIGHT
                AtkTextAttribute.ATK_TEXT_ATTR_LANGUAGE -> LANGUAGE
                AtkTextAttribute.ATK_TEXT_ATTR_FAMILY_NAME -> FAMILY_NAME
                AtkTextAttribute.ATK_TEXT_ATTR_BG_COLOR -> BG_COLOR
                AtkTextAttribute.ATK_TEXT_ATTR_FG_COLOR -> FG_COLOR
                AtkTextAttribute.ATK_TEXT_ATTR_BG_STIPPLE -> BG_STIPPLE
                AtkTextAttribute.ATK_TEXT_ATTR_FG_STIPPLE -> FG_STIPPLE
                AtkTextAttribute.ATK_TEXT_ATTR_WRAP_MODE -> WRAP_MODE
                AtkTextAttribute.ATK_TEXT_ATTR_DIRECTION -> DIRECTION
                AtkTextAttribute.ATK_TEXT_ATTR_JUSTIFICATION -> JUSTIFICATION
                AtkTextAttribute.ATK_TEXT_ATTR_STRETCH -> STRETCH
                AtkTextAttribute.ATK_TEXT_ATTR_VARIANT -> VARIANT
                AtkTextAttribute.ATK_TEXT_ATTR_STYLE -> STYLE
                AtkTextAttribute.ATK_TEXT_ATTR_TEXT_POSITION -> TEXT_POSITION
                AtkTextAttribute.ATK_TEXT_ATTR_LAST_DEFINED -> LAST_DEFINED
                else -> error("invalid nativeValue")
            }

        /**
         * Get the #AtkTextAttribute type corresponding to a text attribute name.
         *
         * @param name a string which is the (non-localized) name of an ATK text attribute.
         * @return the #AtkTextAttribute enumerated type corresponding to the specified
         *          name, or #ATK_TEXT_ATTRIBUTE_INVALID if no matching text attribute
         *          is found.
         */
        public fun forName(name: String): TextAttribute =
            atk_text_attribute_for_name(name).run {
                TextAttribute.fromNativeValue(this)
            }

        /**
         * Gets the name corresponding to the #AtkTextAttribute
         *
         * @param attr The #AtkTextAttribute whose name is required
         * @return a string containing the name; this string should not be freed
         */
        public fun getName(attr: TextAttribute): String =
            atk_text_attribute_get_name(attr.nativeValue)?.toKString() ?: error("Expected not null string")

        /**
         * Gets the value for the index of the #AtkTextAttribute
         *
         * @param attr The #AtkTextAttribute for which a value is required
         * @param index The index of the required value
         * @return a string containing the value; this string
         * should not be freed; null is returned if there are no values
         * maintained for the attr value.
         */
        public fun getValue(
            attr: TextAttribute,
            index: Int,
        ): String? = atk_text_attribute_get_value(attr.nativeValue, index)?.toKString()

        /**
         * Associate @name with a new #AtkTextAttribute
         *
         * @param name a name string
         * @return an #AtkTextAttribute associated with @name
         */
        public fun register(name: String): TextAttribute =
            atk_text_attribute_register(name).run {
                TextAttribute.fromNativeValue(this)
            }
    }
}
