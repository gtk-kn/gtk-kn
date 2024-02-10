// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoAlignment
import org.gtkkn.native.pango.PangoAlignment.PANGO_ALIGN_CENTER
import org.gtkkn.native.pango.PangoAlignment.PANGO_ALIGN_LEFT
import org.gtkkn.native.pango.PangoAlignment.PANGO_ALIGN_RIGHT

/**
 * `PangoAlignment` describes how to align the lines of a `PangoLayout`
 * within the available space.
 *
 * If the `PangoLayout` is set to justify using [method@Pango.Layout.set_justify],
 * this only affects partial lines.
 *
 * See [method@Pango.Layout.set_auto_dir] for how text direction affects
 * the interpretation of `PangoAlignment` values.
 */
public enum class Alignment(
    public val nativeValue: PangoAlignment,
) {
    /**
     * Put all available space on the right
     */
    LEFT(PANGO_ALIGN_LEFT),

    /**
     * Center the line within the available space
     */
    CENTER(PANGO_ALIGN_CENTER),

    /**
     * Put all available space on the left
     */
    RIGHT(PANGO_ALIGN_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoAlignment): Alignment =
            when (nativeValue) {
                PANGO_ALIGN_LEFT -> LEFT
                PANGO_ALIGN_CENTER -> CENTER
                PANGO_ALIGN_RIGHT -> RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
