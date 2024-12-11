// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoWrapMode
import org.gtkkn.native.pango.pango_wrap_mode_get_type

/**
 * `PangoWrapMode` describes how to wrap the lines of a `PangoLayout`
 * to the desired width.
 *
 * For @PANGO_WRAP_WORD, Pango uses break opportunities that are determined
 * by the Unicode line breaking algorithm. For @PANGO_WRAP_CHAR, Pango allows
 * breaking at grapheme boundaries that are determined by the Unicode text
 * segmentation algorithm.
 */
public enum class WrapMode(public val nativeValue: PangoWrapMode) {
    /**
     * wrap lines at word boundaries.
     */
    WORD(PangoWrapMode.PANGO_WRAP_WORD),

    /**
     * wrap lines at character boundaries.
     */
    CHAR(PangoWrapMode.PANGO_WRAP_CHAR),

    /**
     * wrap lines at word boundaries, but fall back to
     *   character boundaries if there is not enough space for a full word.
     */
    WORD_CHAR(PangoWrapMode.PANGO_WRAP_WORD_CHAR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoWrapMode): WrapMode = when (nativeValue) {
            PangoWrapMode.PANGO_WRAP_WORD -> WORD
            PangoWrapMode.PANGO_WRAP_CHAR -> CHAR
            PangoWrapMode.PANGO_WRAP_WORD_CHAR -> WORD_CHAR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of WrapMode
         *
         * @return the GType
         */
        public fun getType(): GType = pango_wrap_mode_get_type()
    }
}
