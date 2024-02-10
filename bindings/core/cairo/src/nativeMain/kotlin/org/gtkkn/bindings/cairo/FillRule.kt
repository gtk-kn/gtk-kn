// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_fill_rule_t
import org.gtkkn.native.cairo.cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD
import org.gtkkn.native.cairo.cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING

public enum class FillRule(
    public val nativeValue: cairo_fill_rule_t,
) {
    WINDING(CAIRO_FILL_RULE_WINDING),
    EVEN_ODD(CAIRO_FILL_RULE_EVEN_ODD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_fill_rule_t): FillRule =
            when (nativeValue) {
                CAIRO_FILL_RULE_WINDING -> WINDING
                CAIRO_FILL_RULE_EVEN_ODD -> EVEN_ODD
                else -> error("invalid nativeValue")
            }
    }
}
