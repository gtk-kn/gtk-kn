// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.adw.AdwSpringParams
import org.gtkkn.native.adw.adw_spring_params_get_damping
import org.gtkkn.native.adw.adw_spring_params_get_damping_ratio
import org.gtkkn.native.adw.adw_spring_params_get_mass
import org.gtkkn.native.adw.adw_spring_params_get_stiffness
import org.gtkkn.native.adw.adw_spring_params_new
import org.gtkkn.native.adw.adw_spring_params_new_full
import org.gtkkn.native.adw.adw_spring_params_ref
import org.gtkkn.native.adw.adw_spring_params_unref
import kotlin.Double
import kotlin.Unit

/**
 * Physical parameters of a spring for [class@SpringAnimation].
 *
 * Any spring can be described by three parameters: mass, stiffness and damping.
 *
 * An undamped spring will produce an oscillatory motion which will go on
 * forever.
 *
 * The frequency and amplitude of the oscillations will be determined by the
 * stiffness (how "strong" the spring is) and its mass (how much "inertia" it
 * has).
 *
 * If damping is larger than 0, the amplitude of that oscillating motion will
 * exponientally decrease over time. If that damping is strong enough that the
 * spring can't complete a full oscillation, it's called an overdamped spring.
 *
 * If we the spring can oscillate, it's called an underdamped spring.
 *
 * The value between these two behaviors is called critical damping; a
 * critically damped spring will comes to rest in the minimum possible time
 * without producing oscillations.
 *
 * The damping can be replaced by damping ratio, which produces the following
 * springs:
 *
 * * 0: an undamped spring.
 * * Between 0 and 1: an underdamped spring.
 * * 1: a critically damped spring.
 * * Larger than 1: an overdamped spring.
 *
 * As such
 * @since 1.0
 */
public class SpringParams(
    pointer: CPointer<AdwSpringParams>,
) : Record {
    public val adwSpringParamsPointer: CPointer<AdwSpringParams> = pointer

    /**
     * Gets the damping of @self.
     *
     * @return the damping
     * @since 1.0
     */
    public fun getDamping(): Double = adw_spring_params_get_damping(adwSpringParamsPointer.reinterpret())

    /**
     * Gets the damping ratio of @self.
     *
     * @return the damping ratio
     * @since 1.0
     */
    public fun getDampingRatio(): Double = adw_spring_params_get_damping_ratio(adwSpringParamsPointer.reinterpret())

    /**
     * Gets the mass of @self.
     *
     * @return the mass
     * @since 1.0
     */
    public fun getMass(): Double = adw_spring_params_get_mass(adwSpringParamsPointer.reinterpret())

    /**
     * Gets the stiffness of @self.
     *
     * @return the stiffness
     * @since 1.0
     */
    public fun getStiffness(): Double = adw_spring_params_get_stiffness(adwSpringParamsPointer.reinterpret())

    /**
     * Increases the reference count of @self.
     *
     * @return @self
     * @since 1.0
     */
    public fun ref(): SpringParams =
        adw_spring_params_ref(adwSpringParamsPointer.reinterpret())!!.run {
            SpringParams(reinterpret())
        }

    /**
     * Decreases the reference count of @self.
     *
     * If the last reference is dropped, the structure is freed.
     *
     * @since 1.0
     */
    public fun unref(): Unit = adw_spring_params_unref(adwSpringParamsPointer.reinterpret())

    public companion object : RecordCompanion<SpringParams, AdwSpringParams> {
        /**
         * Creates a new `AdwSpringParams` from @mass, @stiffness and @damping_ratio.
         *
         * The damping value is calculated from @damping_ratio and the other two
         * parameters.
         *
         * * If @damping_ratio is 0, the spring will not be damped and will oscillate
         *   endlessly.
         * * If @damping_ratio is between 0 and 1, the spring is underdamped and will
         *   always overshoot.
         * * If @damping_ratio is 1, the spring is critically damped and will reach its
         *   resting position the quickest way possible.
         * * If @damping_ratio is larger than 1, the spring is overdamped and will reach
         *   its resting position faster than it can complete an oscillation.
         *
         * [ctor@SpringParams.new_full] allows to pass a raw damping value instead.
         *
         * @param dampingRatio the damping ratio of the spring
         * @param mass the mass of the spring
         * @param stiffness the stiffness of the spring
         * @return the newly created spring parameters
         * @since 1.0
         */
        public fun new(
            dampingRatio: Double,
            mass: Double,
            stiffness: Double,
        ): SpringParams =
            SpringParams(
                adw_spring_params_new(
                    dampingRatio,
                    mass,
                    stiffness
                )!!.reinterpret()
            )

        /**
         * Creates a new `AdwSpringParams` from @mass, @stiffness and @damping.
         *
         * See [ctor@SpringParams.new] for a simplified constructor using damping ratio
         * instead of @damping.
         *
         * @param damping the damping of the spring
         * @param mass the mass of the spring
         * @param stiffness the stiffness of the spring
         * @return the newly created spring parameters
         * @since 1.0
         */
        public fun newFull(
            damping: Double,
            mass: Double,
            stiffness: Double,
        ): SpringParams =
            SpringParams(
                adw_spring_params_new_full(
                    damping,
                    mass,
                    stiffness
                )!!.reinterpret()
            )

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SpringParams =
            SpringParams(pointer.reinterpret())
    }
}
