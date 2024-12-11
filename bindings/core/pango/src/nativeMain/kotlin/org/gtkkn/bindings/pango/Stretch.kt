// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoStretch
import org.gtkkn.native.pango.pango_stretch_get_type

/**
 * An enumeration specifying the width of the font relative to other designs
 * within a family.
 */
public enum class Stretch(public val nativeValue: PangoStretch) {
    /**
     * ultra condensed width
     */
    ULTRA_CONDENSED(PangoStretch.PANGO_STRETCH_ULTRA_CONDENSED),

    /**
     * extra condensed width
     */
    EXTRA_CONDENSED(PangoStretch.PANGO_STRETCH_EXTRA_CONDENSED),

    /**
     * condensed width
     */
    CONDENSED(PangoStretch.PANGO_STRETCH_CONDENSED),

    /**
     * semi condensed width
     */
    SEMI_CONDENSED(PangoStretch.PANGO_STRETCH_SEMI_CONDENSED),

    /**
     * the normal width
     */
    NORMAL(PangoStretch.PANGO_STRETCH_NORMAL),

    /**
     * semi expanded width
     */
    SEMI_EXPANDED(PangoStretch.PANGO_STRETCH_SEMI_EXPANDED),

    /**
     * expanded width
     */
    EXPANDED(PangoStretch.PANGO_STRETCH_EXPANDED),

    /**
     * extra expanded width
     */
    EXTRA_EXPANDED(PangoStretch.PANGO_STRETCH_EXTRA_EXPANDED),

    /**
     * ultra expanded width
     */
    ULTRA_EXPANDED(PangoStretch.PANGO_STRETCH_ULTRA_EXPANDED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoStretch): Stretch = when (nativeValue) {
            PangoStretch.PANGO_STRETCH_ULTRA_CONDENSED -> ULTRA_CONDENSED
            PangoStretch.PANGO_STRETCH_EXTRA_CONDENSED -> EXTRA_CONDENSED
            PangoStretch.PANGO_STRETCH_CONDENSED -> CONDENSED
            PangoStretch.PANGO_STRETCH_SEMI_CONDENSED -> SEMI_CONDENSED
            PangoStretch.PANGO_STRETCH_NORMAL -> NORMAL
            PangoStretch.PANGO_STRETCH_SEMI_EXPANDED -> SEMI_EXPANDED
            PangoStretch.PANGO_STRETCH_EXPANDED -> EXPANDED
            PangoStretch.PANGO_STRETCH_EXTRA_EXPANDED -> EXTRA_EXPANDED
            PangoStretch.PANGO_STRETCH_ULTRA_EXPANDED -> ULTRA_EXPANDED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Stretch
         *
         * @return the GType
         */
        public fun getType(): GType = pango_stretch_get_type()
    }
}
