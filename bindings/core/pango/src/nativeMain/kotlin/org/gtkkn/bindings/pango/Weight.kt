// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoWeight
import org.gtkkn.native.pango.pango_weight_get_type

/**
 * An enumeration specifying the weight (boldness) of a font.
 *
 * Weight is specified as a numeric value ranging from 100 to 1000.
 * This enumeration simply provides some common, predefined values.
 */
public enum class Weight(public val nativeValue: PangoWeight) {
    /**
     * the thin weight (= 100) Since: 1.24
     */
    THIN(PangoWeight.PANGO_WEIGHT_THIN),

    /**
     * the ultralight weight (= 200)
     */
    ULTRALIGHT(PangoWeight.PANGO_WEIGHT_ULTRALIGHT),

    /**
     * the light weight (= 300)
     */
    LIGHT(PangoWeight.PANGO_WEIGHT_LIGHT),

    /**
     * the semilight weight (= 350) Since: 1.36.7
     */
    SEMILIGHT(PangoWeight.PANGO_WEIGHT_SEMILIGHT),

    /**
     * the book weight (= 380) Since: 1.24)
     */
    BOOK(PangoWeight.PANGO_WEIGHT_BOOK),

    /**
     * the default weight (= 400)
     */
    NORMAL(PangoWeight.PANGO_WEIGHT_NORMAL),

    /**
     * the medium weight (= 500) Since: 1.24
     */
    MEDIUM(PangoWeight.PANGO_WEIGHT_MEDIUM),

    /**
     * the semibold weight (= 600)
     */
    SEMIBOLD(PangoWeight.PANGO_WEIGHT_SEMIBOLD),

    /**
     * the bold weight (= 700)
     */
    BOLD(PangoWeight.PANGO_WEIGHT_BOLD),

    /**
     * the ultrabold weight (= 800)
     */
    ULTRABOLD(PangoWeight.PANGO_WEIGHT_ULTRABOLD),

    /**
     * the heavy weight (= 900)
     */
    HEAVY(PangoWeight.PANGO_WEIGHT_HEAVY),

    /**
     * the ultraheavy weight (= 1000) Since: 1.24
     */
    ULTRAHEAVY(PangoWeight.PANGO_WEIGHT_ULTRAHEAVY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoWeight): Weight = when (nativeValue) {
            PangoWeight.PANGO_WEIGHT_THIN -> THIN
            PangoWeight.PANGO_WEIGHT_ULTRALIGHT -> ULTRALIGHT
            PangoWeight.PANGO_WEIGHT_LIGHT -> LIGHT
            PangoWeight.PANGO_WEIGHT_SEMILIGHT -> SEMILIGHT
            PangoWeight.PANGO_WEIGHT_BOOK -> BOOK
            PangoWeight.PANGO_WEIGHT_NORMAL -> NORMAL
            PangoWeight.PANGO_WEIGHT_MEDIUM -> MEDIUM
            PangoWeight.PANGO_WEIGHT_SEMIBOLD -> SEMIBOLD
            PangoWeight.PANGO_WEIGHT_BOLD -> BOLD
            PangoWeight.PANGO_WEIGHT_ULTRABOLD -> ULTRABOLD
            PangoWeight.PANGO_WEIGHT_HEAVY -> HEAVY
            PangoWeight.PANGO_WEIGHT_ULTRAHEAVY -> ULTRAHEAVY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Weight
         *
         * @return the GType
         */
        public fun getType(): GType = pango_weight_get_type()
    }
}
