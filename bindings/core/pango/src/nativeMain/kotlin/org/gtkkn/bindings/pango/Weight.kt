// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoWeight
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_BOLD
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_BOOK
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_HEAVY
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_LIGHT
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_MEDIUM
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_NORMAL
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_SEMIBOLD
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_SEMILIGHT
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_THIN
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_ULTRABOLD
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_ULTRAHEAVY
import org.gtkkn.native.pango.PangoWeight.PANGO_WEIGHT_ULTRALIGHT

/**
 * An enumeration specifying the weight (boldness) of a font.
 *
 * Weight is specified as a numeric value ranging from 100 to 1000.
 * This enumeration simply provides some common, predefined values.
 */
public enum class Weight(
    public val nativeValue: PangoWeight,
) {
    /**
     * the thin weight (= 100) Since: 1.24
     */
    THIN(PANGO_WEIGHT_THIN),

    /**
     * the ultralight weight (= 200)
     */
    ULTRALIGHT(PANGO_WEIGHT_ULTRALIGHT),

    /**
     * the light weight (= 300)
     */
    LIGHT(PANGO_WEIGHT_LIGHT),

    /**
     * the semilight weight (= 350) Since: 1.36.7
     */
    SEMILIGHT(PANGO_WEIGHT_SEMILIGHT),

    /**
     * the book weight (= 380) Since: 1.24)
     */
    BOOK(PANGO_WEIGHT_BOOK),

    /**
     * the default weight (= 400)
     */
    NORMAL(PANGO_WEIGHT_NORMAL),

    /**
     * the normal weight (= 500) Since: 1.24
     */
    MEDIUM(PANGO_WEIGHT_MEDIUM),

    /**
     * the semibold weight (= 600)
     */
    SEMIBOLD(PANGO_WEIGHT_SEMIBOLD),

    /**
     * the bold weight (= 700)
     */
    BOLD(PANGO_WEIGHT_BOLD),

    /**
     * the ultrabold weight (= 800)
     */
    ULTRABOLD(PANGO_WEIGHT_ULTRABOLD),

    /**
     * the heavy weight (= 900)
     */
    HEAVY(PANGO_WEIGHT_HEAVY),

    /**
     * the ultraheavy weight (= 1000) Since: 1.24
     */
    ULTRAHEAVY(PANGO_WEIGHT_ULTRAHEAVY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoWeight): Weight =
            when (nativeValue) {
                PANGO_WEIGHT_THIN -> THIN
                PANGO_WEIGHT_ULTRALIGHT -> ULTRALIGHT
                PANGO_WEIGHT_LIGHT -> LIGHT
                PANGO_WEIGHT_SEMILIGHT -> SEMILIGHT
                PANGO_WEIGHT_BOOK -> BOOK
                PANGO_WEIGHT_NORMAL -> NORMAL
                PANGO_WEIGHT_MEDIUM -> MEDIUM
                PANGO_WEIGHT_SEMIBOLD -> SEMIBOLD
                PANGO_WEIGHT_BOLD -> BOLD
                PANGO_WEIGHT_ULTRABOLD -> ULTRABOLD
                PANGO_WEIGHT_HEAVY -> HEAVY
                PANGO_WEIGHT_ULTRAHEAVY -> ULTRAHEAVY
                else -> error("invalid nativeValue")
            }
    }
}
