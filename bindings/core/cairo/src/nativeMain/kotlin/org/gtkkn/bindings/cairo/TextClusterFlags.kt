// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.CAIRO_TEXT_CLUSTER_FLAG_BACKWARD
import org.gtkkn.native.cairo.cairo_gobject_text_cluster_flags_get_type
import org.gtkkn.native.cairo.cairo_text_cluster_flags_t
import org.gtkkn.native.gobject.GType

public enum class TextClusterFlags(public val nativeValue: cairo_text_cluster_flags_t) {
    BACKWARD(CAIRO_TEXT_CLUSTER_FLAG_BACKWARD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_text_cluster_flags_t): TextClusterFlags = when (nativeValue) {
            CAIRO_TEXT_CLUSTER_FLAG_BACKWARD -> BACKWARD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TextClusterFlags
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_text_cluster_flags_get_type()
    }
}
