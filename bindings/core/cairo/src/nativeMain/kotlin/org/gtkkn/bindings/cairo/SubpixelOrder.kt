// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_subpixel_order_get_type
import org.gtkkn.native.cairo.cairo_subpixel_order_t
import org.gtkkn.native.gobject.GType

public enum class SubpixelOrder(public val nativeValue: cairo_subpixel_order_t) {
    DEFAULT(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_DEFAULT),
    RGB(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_RGB),
    BGR(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_BGR),
    VRGB(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VRGB),
    VBGR(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VBGR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_subpixel_order_t): SubpixelOrder = when (nativeValue) {
            cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_DEFAULT -> DEFAULT
            cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_RGB -> RGB
            cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_BGR -> BGR
            cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VRGB -> VRGB
            cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VBGR -> VBGR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SubpixelOrder
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_subpixel_order_get_type()
    }
}
