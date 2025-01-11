// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.adw.AdwSpringParams
import org.gtkkn.native.adw.adw_spring_params_get_damping
import org.gtkkn.native.adw.adw_spring_params_get_damping_ratio
import org.gtkkn.native.adw.adw_spring_params_get_mass
import org.gtkkn.native.adw.adw_spring_params_get_stiffness
import org.gtkkn.native.adw.adw_spring_params_get_type
import org.gtkkn.native.adw.adw_spring_params_new
import org.gtkkn.native.adw.adw_spring_params_new_full
import org.gtkkn.native.adw.adw_spring_params_ref
import org.gtkkn.native.adw.adw_spring_params_unref
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
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
 */
public class SpringParams(public val adwSpringParamsPointer: CPointer<AdwSpringParams>) :
    ProxyInstance(adwSpringParamsPointer) {
    /**
     * Gets the damping of @self.
     *
     * @return the damping
     */
    public fun getDamping(): gdouble = adw_spring_params_get_damping(adwSpringParamsPointer)

    /**
     * Gets the damping ratio of @self.
     *
     * @return the damping ratio
     */
    public fun getDampingRatio(): gdouble = adw_spring_params_get_damping_ratio(adwSpringParamsPointer)

    /**
     * Gets the mass of @self.
     *
     * @return the mass
     */
    public fun getMass(): gdouble = adw_spring_params_get_mass(adwSpringParamsPointer)

    /**
     * Gets the stiffness of @self.
     *
     * @return the stiffness
     */
    public fun getStiffness(): gdouble = adw_spring_params_get_stiffness(adwSpringParamsPointer)

    /**
     * Increases the reference count of @self.
     *
     * @return @self
     */
    public fun ref(): SpringParams = adw_spring_params_ref(adwSpringParamsPointer)!!.run {
        SpringParams(this)
    }

    /**
     * Decreases the reference count of @self.
     *
     * If the last reference is dropped, the structure is freed.
     */
    public fun unref(): Unit = adw_spring_params_unref(adwSpringParamsPointer)

    public companion object {
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
         */
        public fun new(dampingRatio: gdouble, mass: gdouble, stiffness: gdouble): SpringParams =
            SpringParams(adw_spring_params_new(dampingRatio, mass, stiffness)!!.reinterpret())

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
         */
        public fun newFull(damping: gdouble, mass: gdouble, stiffness: gdouble): SpringParams =
            SpringParams(adw_spring_params_new_full(damping, mass, stiffness)!!.reinterpret())

        /**
         * Get the GType of SpringParams
         *
         * @return the GType
         */
        public fun getType(): GType = adw_spring_params_get_type()
    }
}
