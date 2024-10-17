// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeViewingConditions
import org.gtkkn.native.he.he_viewing_conditions_get_aw
import org.gtkkn.native.he.he_viewing_conditions_get_c
import org.gtkkn.native.he.he_viewing_conditions_get_fl
import org.gtkkn.native.he.he_viewing_conditions_get_fl_root
import org.gtkkn.native.he.he_viewing_conditions_get_n
import org.gtkkn.native.he.he_viewing_conditions_get_nbb
import org.gtkkn.native.he.he_viewing_conditions_get_nc
import org.gtkkn.native.he.he_viewing_conditions_get_ncb
import org.gtkkn.native.he.he_viewing_conditions_get_type
import org.gtkkn.native.he.he_viewing_conditions_get_z
import org.gtkkn.native.he.he_viewing_conditions_lerp
import org.gtkkn.native.he.he_viewing_conditions_set_aw
import org.gtkkn.native.he.he_viewing_conditions_set_c
import org.gtkkn.native.he.he_viewing_conditions_set_fl
import org.gtkkn.native.he.he_viewing_conditions_set_fl_root
import org.gtkkn.native.he.he_viewing_conditions_set_n
import org.gtkkn.native.he.he_viewing_conditions_set_nbb
import org.gtkkn.native.he.he_viewing_conditions_set_nc
import org.gtkkn.native.he.he_viewing_conditions_set_ncb
import org.gtkkn.native.he.he_viewing_conditions_set_z
import org.gtkkn.native.he.he_viewing_conditions_with_lstar
import kotlin.Double
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `aw`: Property has no getter nor setter
 * - method `nbb`: Property has no getter nor setter
 * - method `ncb`: Property has no getter nor setter
 * - method `c`: Property has no getter nor setter
 * - method `nc`: Property has no getter nor setter
 * - method `n`: Property has no getter nor setter
 * - method `fl`: Property has no getter nor setter
 * - method `fl-root`: Property has no getter nor setter
 * - method `z`: Property has no getter nor setter
 * - parameter `white_point`: Array parameter of type gdouble is not supported
 */
public open class ViewingConditions(
    pointer: CPointer<HeViewingConditions>,
) : Object(pointer.reinterpret()), KGTyped {
    public val heViewingConditionsPointer: CPointer<HeViewingConditions>
        get() = gPointer.reinterpret()

    public open fun getAw(): Double = he_viewing_conditions_get_aw(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setAw(`value`: Double): Unit =
        he_viewing_conditions_set_aw(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getNbb(): Double = he_viewing_conditions_get_nbb(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setNbb(`value`: Double): Unit =
        he_viewing_conditions_set_nbb(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getNcb(): Double = he_viewing_conditions_get_ncb(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setNcb(`value`: Double): Unit =
        he_viewing_conditions_set_ncb(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getC(): Double = he_viewing_conditions_get_c(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setC(`value`: Double): Unit =
        he_viewing_conditions_set_c(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getNc(): Double = he_viewing_conditions_get_nc(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setNc(`value`: Double): Unit =
        he_viewing_conditions_set_nc(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getN(): Double = he_viewing_conditions_get_n(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setN(`value`: Double): Unit =
        he_viewing_conditions_set_n(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getFl(): Double = he_viewing_conditions_get_fl(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setFl(`value`: Double): Unit =
        he_viewing_conditions_set_fl(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getFlRoot(): Double = he_viewing_conditions_get_fl_root(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setFlRoot(`value`: Double): Unit =
        he_viewing_conditions_set_fl_root(heViewingConditionsPointer.reinterpret(), `value`)

    public open fun getZ(): Double = he_viewing_conditions_get_z(heViewingConditionsPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setZ(`value`: Double): Unit =
        he_viewing_conditions_set_z(heViewingConditionsPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<ViewingConditions> {
        override val type: GeneratedClassKGType<ViewingConditions> =
            GeneratedClassKGType(he_viewing_conditions_get_type()) {
                ViewingConditions(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }

        /**
         *
         *
         * @param start
         * @param stop
         * @param amount
         */
        public fun lerp(
            start: Double,
            stop: Double,
            amount: Double,
        ): Double = he_viewing_conditions_lerp(start, stop, amount)

        /**
         *
         *
         * @param lstar
         */
        public fun withLstar(lstar: Double): ViewingConditions =
            he_viewing_conditions_with_lstar(lstar)!!.run {
                ViewingConditions(reinterpret())
            }
    }
}
