// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSpringAnimation
import org.gtkkn.native.adw.adw_spring_animation_calculate_value
import org.gtkkn.native.adw.adw_spring_animation_calculate_velocity
import org.gtkkn.native.adw.adw_spring_animation_get_clamp
import org.gtkkn.native.adw.adw_spring_animation_get_epsilon
import org.gtkkn.native.adw.adw_spring_animation_get_estimated_duration
import org.gtkkn.native.adw.adw_spring_animation_get_initial_velocity
import org.gtkkn.native.adw.adw_spring_animation_get_spring_params
import org.gtkkn.native.adw.adw_spring_animation_get_type
import org.gtkkn.native.adw.adw_spring_animation_get_value_from
import org.gtkkn.native.adw.adw_spring_animation_get_value_to
import org.gtkkn.native.adw.adw_spring_animation_get_velocity
import org.gtkkn.native.adw.adw_spring_animation_new
import org.gtkkn.native.adw.adw_spring_animation_set_clamp
import org.gtkkn.native.adw.adw_spring_animation_set_epsilon
import org.gtkkn.native.adw.adw_spring_animation_set_initial_velocity
import org.gtkkn.native.adw.adw_spring_animation_set_spring_params
import org.gtkkn.native.adw.adw_spring_animation_set_value_from
import org.gtkkn.native.adw.adw_spring_animation_set_value_to
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * A spring-based [class@Animation].
 *
 * `AdwSpringAnimation` implements an animation driven by a physical model of a
 * spring described by [struct@SpringParams], with a resting position in
 * [property@SpringAnimation:value-to], stretched to
 * [property@SpringAnimation:value-from].
 *
 * Since the animation is physically simulated, spring animations don't have a
 * fixed duration. The animation will stop when the simulated spring comes to a
 * rest - when the amplitude of the oscillations becomes smaller than
 * [property@SpringAnimation:epsilon], or immediately when it reaches
 * [property@SpringAnimation:value-to] if
 * [property@SpringAnimation:clamp] is set to `TRUE`. The estimated duration can
 * be obtained with [property@SpringAnimation:estimated-duration].
 *
 * Due to the nature of spring-driven motion the animation can overshoot
 * [property@SpringAnimation:value-to] before coming to a rest. Whether the
 * animation will overshoot or not depends on the damping ratio of the spring.
 * See [struct@SpringParams] for more information about specific damping ratio
 * values.
 *
 * If [property@SpringAnimation:clamp] is `TRUE`, the animation will abruptly
 * end as soon as it reaches the final value, preventing overshooting.
 *
 * Animations can have an initial velocity value, set via
 * [property@SpringAnimation:initial-velocity], which adjusts the curve without
 * changing the duration. This makes spring animations useful for deceleration
 * at the end of gestures.
 *
 * If the initial and final values are equal, and the initial velocity is not 0,
 * the animation value will bounce and return to its resting position.
 */
public class SpringAnimation(pointer: CPointer<AdwSpringAnimation>) :
    Animation(pointer.reinterpret()),
    KGTyped {
    public val adwSpringAnimationPointer: CPointer<AdwSpringAnimation>
        get() = gPointer.reinterpret()

    /**
     * Whether the animation should be clamped.
     *
     * If set to `TRUE`, the animation will abruptly end as soon as it reaches the
     * final value, preventing overshooting.
     *
     * It won't prevent overshooting [property@SpringAnimation:value-from] if a
     * relative negative [property@SpringAnimation:initial-velocity] is set.
     */
    public var clamp: Boolean
        /**
         * Gets whether @self should be clamped.
         *
         * @return whether @self is clamped
         */
        get() = adw_spring_animation_get_clamp(adwSpringAnimationPointer).asBoolean()

        /**
         * Sets whether @self should be clamped.
         *
         * If set to `TRUE`, the animation will abruptly end as soon as it reaches the
         * final value, preventing overshooting.
         *
         * It won't prevent overshooting [property@SpringAnimation:value-from] if a
         * relative negative [property@SpringAnimation:initial-velocity] is set.
         *
         * @param clamp the new value
         */
        set(clamp) = adw_spring_animation_set_clamp(adwSpringAnimationPointer, clamp.asGBoolean())

    /**
     * Precision of the spring.
     *
     * The level of precision used to determine when the animation has come to a
     * rest, that is, when the amplitude of the oscillations becomes smaller than
     * this value.
     *
     * If the epsilon value is too small, the animation will take a long time to
     * stop after the animated value has stopped visibly changing.
     *
     * If the epsilon value is too large, the animation will end prematurely.
     *
     * The default value is 0.001.
     */
    public var epsilon: gdouble
        /**
         * Gets the precision of the spring.
         *
         * @return the epsilon value
         */
        get() = adw_spring_animation_get_epsilon(adwSpringAnimationPointer)

        /**
         * Sets the precision of the spring.
         *
         * The level of precision used to determine when the animation has come to a
         * rest, that is, when the amplitude of the oscillations becomes smaller than
         * this value.
         *
         * If the epsilon value is too small, the animation will take a long time to
         * stop after the animated value has stopped visibly changing.
         *
         * If the epsilon value is too large, the animation will end prematurely.
         *
         * The default value is 0.001.
         *
         * @param epsilon the new value
         */
        set(epsilon) = adw_spring_animation_set_epsilon(adwSpringAnimationPointer, epsilon)

    /**
     * Estimated duration of the animation, in milliseconds.
     *
     * Can be [const@DURATION_INFINITE] if the spring damping is set to 0.
     */
    public val estimatedDuration: guint
        /**
         * Gets the estimated duration of @self, in milliseconds.
         *
         * Can be [const@DURATION_INFINITE] if the spring damping is set to 0.
         *
         * @return the estimated duration
         */
        get() = adw_spring_animation_get_estimated_duration(adwSpringAnimationPointer)

    /**
     * The initial velocity to start the animation with.
     *
     * Initial velocity affects only the animation curve, but not its duration.
     */
    public var initialVelocity: gdouble
        /**
         * Gets the initial velocity of @self.
         *
         * @return the initial velocity
         */
        get() = adw_spring_animation_get_initial_velocity(adwSpringAnimationPointer)

        /**
         * Sets the initial velocity of @self.
         *
         * Initial velocity affects only the animation curve, but not its duration.
         *
         * @param velocity the initial velocity
         */
        set(velocity) = adw_spring_animation_set_initial_velocity(adwSpringAnimationPointer, velocity)

    /**
     * Physical parameters describing the spring.
     */
    public var springParams: SpringParams
        /**
         * Gets the physical parameters of the spring of @self.
         *
         * @return the spring parameters
         */
        get() = adw_spring_animation_get_spring_params(adwSpringAnimationPointer)!!.run {
            SpringParams(this)
        }

        /**
         * Sets the physical parameters of the spring of @self.
         *
         * @param springParams the new spring parameters
         */
        set(springParams) = adw_spring_animation_set_spring_params(adwSpringAnimationPointer, springParams.gPointer)

    /**
     * The value to animate from.
     *
     * The animation will start at this value and end at
     * [property@SpringAnimation:value-to].
     */
    public var valueFrom: gdouble
        /**
         * Gets the value @self will animate from.
         *
         * @return the value to animate from
         */
        get() = adw_spring_animation_get_value_from(adwSpringAnimationPointer)

        /**
         * Sets the value @self will animate from.
         *
         * The animation will start at this value and end at
         * [property@SpringAnimation:value-to].
         *
         * @param value the value to animate from
         */
        set(`value`) = adw_spring_animation_set_value_from(adwSpringAnimationPointer, `value`)

    /**
     * The value to animate to.
     *
     * The animation will start at [property@SpringAnimation:value-from] and end
     * at this value.
     */
    public var valueTo: gdouble
        /**
         * Gets the value @self will animate to.
         *
         * @return the value to animate to
         */
        get() = adw_spring_animation_get_value_to(adwSpringAnimationPointer)

        /**
         * Sets the value @self will animate to.
         *
         * The animation will start at [property@SpringAnimation:value-from] and end at
         * this value.
         *
         * @param value the value to animate to
         */
        set(`value`) = adw_spring_animation_set_value_to(adwSpringAnimationPointer, `value`)

    /**
     * Current velocity of the animation.
     */
    public val velocity: gdouble
        /**
         * Gets the current velocity of @self.
         *
         * @return the current velocity
         */
        get() = adw_spring_animation_get_velocity(adwSpringAnimationPointer)

    /**
     * Creates a new `AdwSpringAnimation` on @widget.
     *
     * The animation will animate @target from @from to @to with the dynamics of a
     * spring described by @spring_params.
     *
     * @param widget a widget to create animation on
     * @param from a value to animate from
     * @param to a value to animate to
     * @param springParams physical parameters of the spring
     * @param target a target value to animate
     * @return the newly created animation
     */
    public constructor(
        widget: Widget,
        from: gdouble,
        to: gdouble,
        springParams: SpringParams,
        target: AnimationTarget,
    ) : this(
        adw_spring_animation_new(
            widget.gtkWidgetPointer,
            from,
            to,
            springParams.gPointer,
            target.adwAnimationTargetPointer
        )!!.reinterpret()
    )

    /**
     * Calculates the value @self will have at @time.
     *
     * The time starts at 0 and ends at
     * [property@SpringAnimation:estimated_duration].
     *
     * See also [method@SpringAnimation.calculate_velocity].
     *
     * @param time elapsed time, in milliseconds
     * @return the value at @time
     * @since 1.3
     */
    @AdwVersion1_3
    public fun calculateValue(time: guint): gdouble =
        adw_spring_animation_calculate_value(adwSpringAnimationPointer, time)

    /**
     * Calculates the velocity @self will have at @time.
     *
     * The time starts at 0 and ends at
     * [property@SpringAnimation:estimated_duration].
     *
     * See also [method@SpringAnimation.calculate_value].
     *
     * @param time elapsed time, in milliseconds
     * @return the velocity at @time
     * @since 1.3
     */
    @AdwVersion1_3
    public fun calculateVelocity(time: guint): gdouble =
        adw_spring_animation_calculate_velocity(adwSpringAnimationPointer, time)

    public companion object : TypeCompanion<SpringAnimation> {
        override val type: GeneratedClassKGType<SpringAnimation> =
            GeneratedClassKGType(adw_spring_animation_get_type()) { SpringAnimation(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SpringAnimation
         *
         * @return the GType
         */
        public fun getType(): GType = adw_spring_animation_get_type()
    }
}
