// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.CAIRO_TEXT_CLUSTER_FLAG_BACKWARD
import org.gtkkn.native.cairo.cairo_text_cluster_flags_t

public enum class TextClusterFlags(
    public val nativeValue: cairo_text_cluster_flags_t,
) {
    BACKWARD(CAIRO_TEXT_CLUSTER_FLAG_BACKWARD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_text_cluster_flags_t): TextClusterFlags =
            when (nativeValue) {
                CAIRO_TEXT_CLUSTER_FLAG_BACKWARD -> BACKWARD
                else -> error("invalid nativeValue")
            }
    }
}