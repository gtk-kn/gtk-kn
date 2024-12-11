// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_weight_t
import org.gtkkn.native.cairo.cairo_gobject_font_weight_get_type
import org.gtkkn.native.gobject.GType

public enum class FontWeight(public val nativeValue: cairo_font_weight_t) {
    NORMAL(cairo_font_weight_t.CAIRO_FONT_WEIGHT_NORMAL),
    BOLD(cairo_font_weight_t.CAIRO_FONT_WEIGHT_BOLD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_weight_t): FontWeight = when (nativeValue) {
            cairo_font_weight_t.CAIRO_FONT_WEIGHT_NORMAL -> NORMAL
            cairo_font_weight_t.CAIRO_FONT_WEIGHT_BOLD -> BOLD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FontWeight
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_weight_get_type()
    }
}
