// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_hint_metrics_get_type
import org.gtkkn.native.cairo.cairo_hint_metrics_t
import org.gtkkn.native.gobject.GType

public enum class HintMetrics(public val nativeValue: cairo_hint_metrics_t) {
    DEFAULT(cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT),
    OFF(cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF),
    ON(cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_hint_metrics_t): HintMetrics = when (nativeValue) {
            cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT -> DEFAULT
            cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF -> OFF
            cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON -> ON
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of HintMetrics
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_hint_metrics_get_type()
    }
}
