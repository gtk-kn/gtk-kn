// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoStretch
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_CONDENSED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_EXPANDED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_EXTRA_CONDENSED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_EXTRA_EXPANDED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_NORMAL
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_SEMI_CONDENSED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_SEMI_EXPANDED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_ULTRA_CONDENSED
import org.gtkkn.native.pango.PangoStretch.PANGO_STRETCH_ULTRA_EXPANDED

/**
 * An enumeration specifying the width of the font relative to other designs
 * within a family.
 */
public enum class Stretch(
    public val nativeValue: PangoStretch,
) {
    /**
     * ultra condensed width
     */
    ULTRA_CONDENSED(PANGO_STRETCH_ULTRA_CONDENSED),

    /**
     * extra condensed width
     */
    EXTRA_CONDENSED(PANGO_STRETCH_EXTRA_CONDENSED),

    /**
     * condensed width
     */
    CONDENSED(PANGO_STRETCH_CONDENSED),

    /**
     * semi condensed width
     */
    SEMI_CONDENSED(PANGO_STRETCH_SEMI_CONDENSED),

    /**
     * the normal width
     */
    NORMAL(PANGO_STRETCH_NORMAL),

    /**
     * semi expanded width
     */
    SEMI_EXPANDED(PANGO_STRETCH_SEMI_EXPANDED),

    /**
     * expanded width
     */
    EXPANDED(PANGO_STRETCH_EXPANDED),

    /**
     * extra expanded width
     */
    EXTRA_EXPANDED(PANGO_STRETCH_EXTRA_EXPANDED),

    /**
     * ultra expanded width
     */
    ULTRA_EXPANDED(PANGO_STRETCH_ULTRA_EXPANDED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoStretch): Stretch =
            when (nativeValue) {
                PANGO_STRETCH_ULTRA_CONDENSED -> ULTRA_CONDENSED
                PANGO_STRETCH_EXTRA_CONDENSED -> EXTRA_CONDENSED
                PANGO_STRETCH_CONDENSED -> CONDENSED
                PANGO_STRETCH_SEMI_CONDENSED -> SEMI_CONDENSED
                PANGO_STRETCH_NORMAL -> NORMAL
                PANGO_STRETCH_SEMI_EXPANDED -> SEMI_EXPANDED
                PANGO_STRETCH_EXPANDED -> EXPANDED
                PANGO_STRETCH_EXTRA_EXPANDED -> EXTRA_EXPANDED
                PANGO_STRETCH_ULTRA_EXPANDED -> ULTRA_EXPANDED
                else -> error("invalid nativeValue")
            }
    }
}
