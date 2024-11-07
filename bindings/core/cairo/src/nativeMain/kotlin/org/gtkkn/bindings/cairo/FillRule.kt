// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_fill_rule_t

public enum class FillRule(
    public val nativeValue: cairo_fill_rule_t,
) {
    WINDING(cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING),
    EVEN_ODD(cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_fill_rule_t): FillRule =
            when (nativeValue) {
                cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING -> WINDING
                cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD -> EVEN_ODD
                else -> error("invalid nativeValue")
            }
    }
}
