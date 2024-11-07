// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoTabAlign

/**
 * `PangoTabAlign` specifies where the text appears relative to the tab stop
 * position.
 */
public enum class TabAlign(
    public val nativeValue: PangoTabAlign,
) {
    /**
     * the text appears to the right of the tab stop position
     */
    LEFT(PangoTabAlign.PANGO_TAB_LEFT),

    /**
     * the text appears to the left of the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    RIGHT(PangoTabAlign.PANGO_TAB_RIGHT),

    /**
     * the text is centered at the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    CENTER(PangoTabAlign.PANGO_TAB_CENTER),

    /**
     * text before the first occurrence of the decimal point
     *   character appears to the left of the tab stop position (until the available
     *   space is filled), the rest to the right. Since: 1.50
     */
    DECIMAL(PangoTabAlign.PANGO_TAB_DECIMAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoTabAlign): TabAlign =
            when (nativeValue) {
                PangoTabAlign.PANGO_TAB_LEFT -> LEFT
                PangoTabAlign.PANGO_TAB_RIGHT -> RIGHT
                PangoTabAlign.PANGO_TAB_CENTER -> CENTER
                PangoTabAlign.PANGO_TAB_DECIMAL -> DECIMAL
                else -> error("invalid nativeValue")
            }
    }
}
