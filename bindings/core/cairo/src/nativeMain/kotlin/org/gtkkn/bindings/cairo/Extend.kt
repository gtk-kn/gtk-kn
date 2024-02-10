// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_extend_t
import org.gtkkn.native.cairo.cairo_extend_t.CAIRO_EXTEND_NONE
import org.gtkkn.native.cairo.cairo_extend_t.CAIRO_EXTEND_PAD
import org.gtkkn.native.cairo.cairo_extend_t.CAIRO_EXTEND_REFLECT
import org.gtkkn.native.cairo.cairo_extend_t.CAIRO_EXTEND_REPEAT

public enum class Extend(
    public val nativeValue: cairo_extend_t,
) {
    NONE(CAIRO_EXTEND_NONE),
    REPEAT(CAIRO_EXTEND_REPEAT),
    REFLECT(CAIRO_EXTEND_REFLECT),
    PAD(CAIRO_EXTEND_PAD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_extend_t): Extend =
            when (nativeValue) {
                CAIRO_EXTEND_NONE -> NONE
                CAIRO_EXTEND_REPEAT -> REPEAT
                CAIRO_EXTEND_REFLECT -> REFLECT
                CAIRO_EXTEND_PAD -> PAD
                else -> error("invalid nativeValue")
            }
    }
}
