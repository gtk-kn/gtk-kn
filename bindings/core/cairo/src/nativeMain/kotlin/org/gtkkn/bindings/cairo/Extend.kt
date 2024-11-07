// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_extend_t

public enum class Extend(
    public val nativeValue: cairo_extend_t,
) {
    NONE(cairo_extend_t.CAIRO_EXTEND_NONE),
    REPEAT(cairo_extend_t.CAIRO_EXTEND_REPEAT),
    REFLECT(cairo_extend_t.CAIRO_EXTEND_REFLECT),
    PAD(cairo_extend_t.CAIRO_EXTEND_PAD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_extend_t): Extend =
            when (nativeValue) {
                cairo_extend_t.CAIRO_EXTEND_NONE -> NONE
                cairo_extend_t.CAIRO_EXTEND_REPEAT -> REPEAT
                cairo_extend_t.CAIRO_EXTEND_REFLECT -> REFLECT
                cairo_extend_t.CAIRO_EXTEND_PAD -> PAD
                else -> error("invalid nativeValue")
            }
    }
}
