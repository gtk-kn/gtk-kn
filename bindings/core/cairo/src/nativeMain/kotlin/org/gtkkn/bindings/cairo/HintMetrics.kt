// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_hint_metrics_t

public enum class HintMetrics(
    public val nativeValue: cairo_hint_metrics_t,
) {
    DEFAULT(cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT),
    OFF(cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF),
    ON(cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_hint_metrics_t): HintMetrics =
            when (nativeValue) {
                cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT -> DEFAULT
                cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF -> OFF
                cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON -> ON
                else -> error("invalid nativeValue")
            }
    }
}
