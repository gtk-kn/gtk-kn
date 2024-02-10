// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoOverline
import org.gtkkn.native.pango.PangoOverline.PANGO_OVERLINE_NONE
import org.gtkkn.native.pango.PangoOverline.PANGO_OVERLINE_SINGLE

/**
 * The `PangoOverline` enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 * @since 1.46
 */
public enum class Overline(
    public val nativeValue: PangoOverline,
) {
    /**
     * no overline should be drawn
     */
    NONE(PANGO_OVERLINE_NONE),

    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    SINGLE(PANGO_OVERLINE_SINGLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoOverline): Overline =
            when (nativeValue) {
                PANGO_OVERLINE_NONE -> NONE
                PANGO_OVERLINE_SINGLE -> SINGLE
                else -> error("invalid nativeValue")
            }
    }
}
