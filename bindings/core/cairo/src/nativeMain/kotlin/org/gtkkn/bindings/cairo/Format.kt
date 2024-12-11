// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.CAIRO_FORMAT_A1
import org.gtkkn.native.cairo.CAIRO_FORMAT_A8
import org.gtkkn.native.cairo.CAIRO_FORMAT_ARGB32
import org.gtkkn.native.cairo.CAIRO_FORMAT_INVALID
import org.gtkkn.native.cairo.CAIRO_FORMAT_RGB16_565
import org.gtkkn.native.cairo.CAIRO_FORMAT_RGB24
import org.gtkkn.native.cairo.CAIRO_FORMAT_RGB30
import org.gtkkn.native.cairo.cairo_format_t
import org.gtkkn.native.cairo.cairo_gobject_format_get_type
import org.gtkkn.native.gobject.GType

public enum class Format(public val nativeValue: cairo_format_t) {
    INVALID(CAIRO_FORMAT_INVALID),
    ARGB32(CAIRO_FORMAT_ARGB32),
    RGB24(CAIRO_FORMAT_RGB24),
    A8(CAIRO_FORMAT_A8),
    A1(CAIRO_FORMAT_A1),
    RGB16_565(CAIRO_FORMAT_RGB16_565),
    RGB30(CAIRO_FORMAT_RGB30),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_format_t): Format = when (nativeValue) {
            CAIRO_FORMAT_INVALID -> INVALID
            CAIRO_FORMAT_ARGB32 -> ARGB32
            CAIRO_FORMAT_RGB24 -> RGB24
            CAIRO_FORMAT_A8 -> A8
            CAIRO_FORMAT_A1 -> A1
            CAIRO_FORMAT_RGB16_565 -> RGB16_565
            CAIRO_FORMAT_RGB30 -> RGB30
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Format
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_format_get_type()
    }
}
