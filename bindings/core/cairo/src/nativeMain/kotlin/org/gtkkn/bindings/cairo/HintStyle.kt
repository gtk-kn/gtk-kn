// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_hint_style_t
import org.gtkkn.native.cairo.cairo_hint_style_t.CAIRO_HINT_STYLE_DEFAULT
import org.gtkkn.native.cairo.cairo_hint_style_t.CAIRO_HINT_STYLE_FULL
import org.gtkkn.native.cairo.cairo_hint_style_t.CAIRO_HINT_STYLE_MEDIUM
import org.gtkkn.native.cairo.cairo_hint_style_t.CAIRO_HINT_STYLE_NONE
import org.gtkkn.native.cairo.cairo_hint_style_t.CAIRO_HINT_STYLE_SLIGHT

public enum class HintStyle(
    public val nativeValue: cairo_hint_style_t,
) {
    DEFAULT(CAIRO_HINT_STYLE_DEFAULT),
    NONE(CAIRO_HINT_STYLE_NONE),
    SLIGHT(CAIRO_HINT_STYLE_SLIGHT),
    MEDIUM(CAIRO_HINT_STYLE_MEDIUM),
    FULL(CAIRO_HINT_STYLE_FULL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_hint_style_t): HintStyle =
            when (nativeValue) {
                CAIRO_HINT_STYLE_DEFAULT -> DEFAULT
                CAIRO_HINT_STYLE_NONE -> NONE
                CAIRO_HINT_STYLE_SLIGHT -> SLIGHT
                CAIRO_HINT_STYLE_MEDIUM -> MEDIUM
                CAIRO_HINT_STYLE_FULL -> FULL
                else -> error("invalid nativeValue")
            }
    }
}
