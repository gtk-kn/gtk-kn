// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_hint_metrics_t
import org.gtkkn.native.cairo.cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT
import org.gtkkn.native.cairo.cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF
import org.gtkkn.native.cairo.cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON

public enum class HintMetrics(
    public val nativeValue: cairo_hint_metrics_t,
) {
    DEFAULT(CAIRO_HINT_METRICS_DEFAULT),
    OFF(CAIRO_HINT_METRICS_OFF),
    ON(CAIRO_HINT_METRICS_ON),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_hint_metrics_t): HintMetrics =
            when (nativeValue) {
                CAIRO_HINT_METRICS_DEFAULT -> DEFAULT
                CAIRO_HINT_METRICS_OFF -> OFF
                CAIRO_HINT_METRICS_ON -> ON
                else -> error("invalid nativeValue")
            }
    }
}
