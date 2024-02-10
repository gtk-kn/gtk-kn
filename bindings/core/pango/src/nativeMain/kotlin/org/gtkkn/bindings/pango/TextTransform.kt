// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoTextTransform
import org.gtkkn.native.pango.PangoTextTransform.PANGO_TEXT_TRANSFORM_CAPITALIZE
import org.gtkkn.native.pango.PangoTextTransform.PANGO_TEXT_TRANSFORM_LOWERCASE
import org.gtkkn.native.pango.PangoTextTransform.PANGO_TEXT_TRANSFORM_NONE
import org.gtkkn.native.pango.PangoTextTransform.PANGO_TEXT_TRANSFORM_UPPERCASE

/**
 * An enumeration that affects how Pango treats characters during shaping.
 * @since 1.50
 */
public enum class TextTransform(
    public val nativeValue: PangoTextTransform,
) {
    /**
     * Leave text unchanged
     */
    NONE(PANGO_TEXT_TRANSFORM_NONE),

    /**
     * Display letters and numbers as lowercase
     */
    LOWERCASE(PANGO_TEXT_TRANSFORM_LOWERCASE),

    /**
     * Display letters and numbers as uppercase
     */
    UPPERCASE(PANGO_TEXT_TRANSFORM_UPPERCASE),

    /**
     * Display the first character of a word
     *   in titlecase
     */
    CAPITALIZE(PANGO_TEXT_TRANSFORM_CAPITALIZE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoTextTransform): TextTransform =
            when (nativeValue) {
                PANGO_TEXT_TRANSFORM_NONE -> NONE
                PANGO_TEXT_TRANSFORM_LOWERCASE -> LOWERCASE
                PANGO_TEXT_TRANSFORM_UPPERCASE -> UPPERCASE
                PANGO_TEXT_TRANSFORM_CAPITALIZE -> CAPITALIZE
                else -> error("invalid nativeValue")
            }
    }
}
