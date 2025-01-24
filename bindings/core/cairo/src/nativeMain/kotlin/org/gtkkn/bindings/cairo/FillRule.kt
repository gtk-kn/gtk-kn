// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_fill_rule_t
import org.gtkkn.native.cairo.cairo_gobject_fill_rule_get_type
import org.gtkkn.native.gobject.GType

public enum class FillRule(public val nativeValue: cairo_fill_rule_t) {
    WINDING(cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING),
    EVEN_ODD(cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_fill_rule_t): FillRule = when (nativeValue) {
            cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING -> WINDING
            cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD -> EVEN_ODD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FillRule
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_fill_rule_get_type()
    }
}
