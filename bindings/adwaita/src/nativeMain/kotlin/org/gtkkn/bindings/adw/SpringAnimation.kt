// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSpringAnimation
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
import kotlin.Boolean
import kotlin.Double
import kotlin.UInt
import kotlin.Unit

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
 * @since 1.0
 */
public open class SpringAnimation(
    pointer: CPointer<AdwSpringAnimation>,
) : Animation(pointer.reinterpret()), KGTyped {
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
     *
     * @since 1.0
     */
    public open var clamp: Boolean
        /**
         * Gets whether @self should be clamped.
         *
         * @return whether @self is clamped
         * @since 1.0
         */
        get() = adw_spring_animation_get_clamp(adwSpringAnimationPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self should be clamped.
         *
         * @param clamp the new value
         * @since 1.0
         */
        set(clamp) =
            adw_spring_animation_set_clamp(
                adwSpringAnimationPointer.reinterpret(),
                clamp.asGBoolean()
            )

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
     *
     * @since 1.0
     */
    public open var epsilon: Double
        /**
         * Gets the precision used to determine the duration of @self.
         *
         * @return the epsilon value
         * @since 1.0
         */
        get() = adw_spring_animation_get_epsilon(adwSpringAnimationPointer.reinterpret())

        /**
         * Sets the precision used to determine the duration of @self.
         *
         * @param epsilon the new value
         * @since 1.0
         */
        set(epsilon) =
            adw_spring_animation_set_epsilon(
                adwSpringAnimationPointer.reinterpret(),
                epsilon
            )

    /**
     * Estimated duration of the animation, in milliseconds.
     *
     * Can be [const@DURATION_INFINITE] if the spring damping is set to 0.
     *
     * @since 1.0
     */
    public open val estimatedDuration: UInt
        /**
         * Gets the estimated duration of @self.
         *
         * @return the estimated duration
         * @since 1.0
         */
        get() = adw_spring_animation_get_estimated_duration(adwSpringAnimationPointer.reinterpret())

    /**
     * The initial velocity to start the animation with.
     *
     * Initial velocity affects only the animation curve, but not its duration.
     *
     * @since 1.0
     */
    public open var initialVelocity: Double
        /**
         * Gets the initial velocity of @self.
         *
         * @return the initial velocity
         * @since 1.0
         */
        get() = adw_spring_animation_get_initial_velocity(adwSpringAnimationPointer.reinterpret())

        /**
         * Sets the initial velocity of @self.
         *
         * @param velocity the initial velocity
         * @since 1.0
         */
        set(velocity) =
            adw_spring_animation_set_initial_velocity(
                adwSpringAnimationPointer.reinterpret(),
                velocity
            )

    /**
     * Physical parameters describing the spring.
     *
     * @since 1.0
     */
    public open var springParams: SpringParams
        /**
         * Gets the physical parameters of the spring of @self.
         *
         * @return the spring parameters
         * @since 1.0
         */
        get() =
            adw_spring_animation_get_spring_params(adwSpringAnimationPointer.reinterpret())!!.run {
                SpringParams(reinterpret())
            }

        /**
         * Sets the physical parameters of the spring of @self.
         *
         * @param springParams the new spring parameters
         * @since 1.0
         */
        set(springParams) =
            adw_spring_animation_set_spring_params(
                adwSpringAnimationPointer.reinterpret(),
                springParams.adwSpringParamsPointer
            )

    /**
     * The value to animate from.
     *
     * The animation will start at this value and end at
     * [property@SpringAnimation:value-to].
     *
     * @since 1.0
     */
    public open var valueFrom: Double
        /**
         * Gets the value @self will animate from.
         *
         * @return the value to animate from
         * @since 1.0
         */
        get() = adw_spring_animation_get_value_from(adwSpringAnimationPointer.reinterpret())

        /**
         * Sets the value @self will animate from.
         *
         * @param value the value to animate from
         * @since 1.0
         */
        set(`value`) =
            adw_spring_animation_set_value_from(
                adwSpringAnimationPointer.reinterpret(),
                `value`
            )

    /**
     * The value to animate to.
     *
     * The animation will start at [property@SpringAnimation:value-from] and end
     * at this value.
     *
     * @since 1.0
     */
    public open var valueTo: Double
        /**
         * Gets the value @self will animate to.
         *
         * @return the value to animate to
         * @since 1.0
         */
        get() = adw_spring_animation_get_value_to(adwSpringAnimationPointer.reinterpret())

        /**
         * Sets the value @self will animate to.
         *
         * @param value the value to animate to
         * @since 1.0
         */
        set(`value`) =
            adw_spring_animation_set_value_to(
                adwSpringAnimationPointer.reinterpret(),
                `value`
            )

    /**
     * Current velocity of the animation.
     *
     * @since 1.0
     */
    public open val velocity: Double
        /**
         * Gets the current velocity of @self.
         *
         * @return the current velocity
         * @since 1.0
         */
        get() = adw_spring_animation_get_velocity(adwSpringAnimationPointer.reinterpret())

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
     * @since 1.0
     */
    public constructor(
        widget: Widget,
        from: Double,
        to: Double,
        springParams: SpringParams,
        target: AnimationTarget,
    ) : this(
        adw_spring_animation_new(
            widget.gtkWidgetPointer.reinterpret(),
            from,
            to,
            springParams.adwSpringParamsPointer,
            target.adwAnimationTargetPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets whether @self should be clamped.
     *
     * @return whether @self is clamped
     * @since 1.0
     */
    public open fun getClamp(): Boolean =
        adw_spring_animation_get_clamp(adwSpringAnimationPointer.reinterpret()).asBoolean()

    /**
     * Gets the precision used to determine the duration of @self.
     *
     * @return the epsilon value
     * @since 1.0
     */
    public open fun getEpsilon(): Double = adw_spring_animation_get_epsilon(adwSpringAnimationPointer.reinterpret())

    /**
     * Gets the estimated duration of @self.
     *
     * @return the estimated duration
     * @since 1.0
     */
    public open fun getEstimatedDuration(): UInt =
        adw_spring_animation_get_estimated_duration(adwSpringAnimationPointer.reinterpret())

    /**
     * Gets the initial velocity of @self.
     *
     * @return the initial velocity
     * @since 1.0
     */
    public open fun getInitialVelocity(): Double =
        adw_spring_animation_get_initial_velocity(adwSpringAnimationPointer.reinterpret())

    /**
     * Gets the physical parameters of the spring of @self.
     *
     * @return the spring parameters
     * @since 1.0
     */
    public open fun getSpringParams(): SpringParams =
        adw_spring_animation_get_spring_params(adwSpringAnimationPointer.reinterpret())!!.run {
            SpringParams(reinterpret())
        }

    /**
     * Gets the value @self will animate from.
     *
     * @return the value to animate from
     * @since 1.0
     */
    public open fun getValueFrom(): Double =
        adw_spring_animation_get_value_from(adwSpringAnimationPointer.reinterpret())

    /**
     * Gets the value @self will animate to.
     *
     * @return the value to animate to
     * @since 1.0
     */
    public open fun getValueTo(): Double = adw_spring_animation_get_value_to(adwSpringAnimationPointer.reinterpret())

    /**
     * Gets the current velocity of @self.
     *
     * @return the current velocity
     * @since 1.0
     */
    public open fun getVelocity(): Double = adw_spring_animation_get_velocity(adwSpringAnimationPointer.reinterpret())

    /**
     * Sets whether @self should be clamped.
     *
     * @param clamp the new value
     * @since 1.0
     */
    public open fun setClamp(clamp: Boolean): Unit =
        adw_spring_animation_set_clamp(
            adwSpringAnimationPointer.reinterpret(),
            clamp.asGBoolean()
        )

    /**
     * Sets the precision used to determine the duration of @self.
     *
     * @param epsilon the new value
     * @since 1.0
     */
    public open fun setEpsilon(epsilon: Double): Unit =
        adw_spring_animation_set_epsilon(adwSpringAnimationPointer.reinterpret(), epsilon)

    /**
     * Sets the initial velocity of @self.
     *
     * @param velocity the initial velocity
     * @since 1.0
     */
    public open fun setInitialVelocity(velocity: Double): Unit =
        adw_spring_animation_set_initial_velocity(
            adwSpringAnimationPointer.reinterpret(),
            velocity
        )

    /**
     * Sets the physical parameters of the spring of @self.
     *
     * @param springParams the new spring parameters
     * @since 1.0
     */
    public open fun setSpringParams(springParams: SpringParams): Unit =
        adw_spring_animation_set_spring_params(
            adwSpringAnimationPointer.reinterpret(),
            springParams.adwSpringParamsPointer
        )

    /**
     * Sets the value @self will animate from.
     *
     * @param value the value to animate from
     * @since 1.0
     */
    public open fun setValueFrom(`value`: Double): Unit =
        adw_spring_animation_set_value_from(adwSpringAnimationPointer.reinterpret(), `value`)

    /**
     * Sets the value @self will animate to.
     *
     * @param value the value to animate to
     * @since 1.0
     */
    public open fun setValueTo(`value`: Double): Unit =
        adw_spring_animation_set_value_to(adwSpringAnimationPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<SpringAnimation> {
        override val type: GeneratedClassKGType<SpringAnimation> =
            GeneratedClassKGType(adw_spring_animation_get_type()) {
                SpringAnimation(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
