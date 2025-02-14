// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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

    /**
     * do not wrap.
     * @since 1.56
     */
    NONE(PangoWrapMode.PANGO_WRAP_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoWrapMode): WrapMode = when (nativeValue) {
            PangoWrapMode.PANGO_WRAP_WORD -> WORD
            PangoWrapMode.PANGO_WRAP_CHAR -> CHAR
            PangoWrapMode.PANGO_WRAP_WORD_CHAR -> WORD_CHAR
            PangoWrapMode.PANGO_WRAP_NONE -> NONE
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
