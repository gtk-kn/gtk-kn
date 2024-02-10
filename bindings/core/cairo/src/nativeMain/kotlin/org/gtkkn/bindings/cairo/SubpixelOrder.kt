// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_subpixel_order_t
import org.gtkkn.native.cairo.cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_BGR
import org.gtkkn.native.cairo.cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_DEFAULT
import org.gtkkn.native.cairo.cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_RGB
import org.gtkkn.native.cairo.cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VBGR
import org.gtkkn.native.cairo.cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VRGB

public enum class SubpixelOrder(
    public val nativeValue: cairo_subpixel_order_t,
) {
    DEFAULT(CAIRO_SUBPIXEL_ORDER_DEFAULT),
    RGB(CAIRO_SUBPIXEL_ORDER_RGB),
    BGR(CAIRO_SUBPIXEL_ORDER_BGR),
    VRGB(CAIRO_SUBPIXEL_ORDER_VRGB),
    VBGR(CAIRO_SUBPIXEL_ORDER_VBGR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_subpixel_order_t): SubpixelOrder =
            when (nativeValue) {
                CAIRO_SUBPIXEL_ORDER_DEFAULT -> DEFAULT
                CAIRO_SUBPIXEL_ORDER_RGB -> RGB
                CAIRO_SUBPIXEL_ORDER_BGR -> BGR
                CAIRO_SUBPIXEL_ORDER_VRGB -> VRGB
                CAIRO_SUBPIXEL_ORDER_VBGR -> VBGR
                else -> error("invalid nativeValue")
            }
    }
}
