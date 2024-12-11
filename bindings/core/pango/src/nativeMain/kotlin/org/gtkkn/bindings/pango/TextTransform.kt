// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoTextTransform
import org.gtkkn.native.pango.pango_text_transform_get_type

/**
 * An enumeration that affects how Pango treats characters during shaping.
 * @since 1.50
 */
@PangoVersion1_50
public enum class TextTransform(public val nativeValue: PangoTextTransform) {
    /**
     * Leave text unchanged
     */
    NONE(PangoTextTransform.PANGO_TEXT_TRANSFORM_NONE),

    /**
     * Display letters and numbers as lowercase
     */
    LOWERCASE(PangoTextTransform.PANGO_TEXT_TRANSFORM_LOWERCASE),

    /**
     * Display letters and numbers as uppercase
     */
    UPPERCASE(PangoTextTransform.PANGO_TEXT_TRANSFORM_UPPERCASE),

    /**
     * Display the first character of a word
     *   in titlecase
     */
    CAPITALIZE(PangoTextTransform.PANGO_TEXT_TRANSFORM_CAPITALIZE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoTextTransform): TextTransform = when (nativeValue) {
            PangoTextTransform.PANGO_TEXT_TRANSFORM_NONE -> NONE
            PangoTextTransform.PANGO_TEXT_TRANSFORM_LOWERCASE -> LOWERCASE
            PangoTextTransform.PANGO_TEXT_TRANSFORM_UPPERCASE -> UPPERCASE
            PangoTextTransform.PANGO_TEXT_TRANSFORM_CAPITALIZE -> CAPITALIZE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TextTransform
         *
         * @return the GType
         */
        public fun getType(): GType = pango_text_transform_get_type()
    }
}
