// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_6
import org.gtkkn.native.cairo.cairo_ps_level_t

/**
 *
 * @since 1.6
 */
@CairoVersion1_6
public enum class PsLevel(public val nativeValue: cairo_ps_level_t) {
    LEVEL_2(cairo_ps_level_t.CAIRO_PS_LEVEL_2),
    LEVEL_3(cairo_ps_level_t.CAIRO_PS_LEVEL_3),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_ps_level_t): PsLevel = when (nativeValue) {
            cairo_ps_level_t.CAIRO_PS_LEVEL_2 -> LEVEL_2
            cairo_ps_level_t.CAIRO_PS_LEVEL_3 -> LEVEL_3
            else -> error("invalid nativeValue")
        }
    }
}
