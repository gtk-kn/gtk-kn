// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.native.pango.PangoOverline

/**
 * The `PangoOverline` enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 * @since 1.46
 */
@PangoVersion1_46
public enum class Overline(
    public val nativeValue: PangoOverline,
) {
    /**
     * no overline should be drawn
     */
    NONE(PangoOverline.PANGO_OVERLINE_NONE),

    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    SINGLE(PangoOverline.PANGO_OVERLINE_SINGLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoOverline): Overline =
            when (nativeValue) {
                PangoOverline.PANGO_OVERLINE_NONE -> NONE
                PangoOverline.PANGO_OVERLINE_SINGLE -> SINGLE
                else -> error("invalid nativeValue")
            }
    }
}
