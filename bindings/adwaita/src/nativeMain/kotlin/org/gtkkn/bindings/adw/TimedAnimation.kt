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
import org.gtkkn.native.adw.AdwTimedAnimation
import org.gtkkn.native.adw.adw_timed_animation_get_alternate
import org.gtkkn.native.adw.adw_timed_animation_get_duration
import org.gtkkn.native.adw.adw_timed_animation_get_easing
import org.gtkkn.native.adw.adw_timed_animation_get_repeat_count
import org.gtkkn.native.adw.adw_timed_animation_get_reverse
import org.gtkkn.native.adw.adw_timed_animation_get_type
import org.gtkkn.native.adw.adw_timed_animation_get_value_from
import org.gtkkn.native.adw.adw_timed_animation_get_value_to
import org.gtkkn.native.adw.adw_timed_animation_new
import org.gtkkn.native.adw.adw_timed_animation_set_alternate
import org.gtkkn.native.adw.adw_timed_animation_set_duration
import org.gtkkn.native.adw.adw_timed_animation_set_easing
import org.gtkkn.native.adw.adw_timed_animation_set_repeat_count
import org.gtkkn.native.adw.adw_timed_animation_set_reverse
import org.gtkkn.native.adw.adw_timed_animation_set_value_from
import org.gtkkn.native.adw.adw_timed_animation_set_value_to
import kotlin.Boolean
import kotlin.Double
import kotlin.UInt
import kotlin.Unit

/**
 * A time-based [class@Animation].
 *
 * `AdwTimedAnimation` implements a simple animation interpolating the given
 * value from [property@TimedAnimation:value-from] to
 * [property@TimedAnimation:value-to] over
 * [property@TimedAnimation:duration] milliseconds using the curve described by
 * [property@TimedAnimation:easing].
 *
 * If [property@TimedAnimation:reverse] is set to `TRUE`, `AdwTimedAnimation`
 * will instead animate from [property@TimedAnimation:value-to] to
 * [property@TimedAnimation:value-from], and the easing curve will be inverted.
 *
 * The animation can repeat a certain amount of times, or endlessly, depending
 * on the [property@TimedAnimation:repeat-count] value. If
 * [property@TimedAnimation:alternate] is set to `TRUE`, it will also change the
 * direction every other iteration.
 */
public class TimedAnimation(
    pointer: CPointer<AdwTimedAnimation>,
) : Animation(pointer.reinterpret()),
    KGTyped {
    public val adwTimedAnimationPointer: CPointer<AdwTimedAnimation>
        get() = gPointer.reinterpret()

    /**
     * Whether the animation changes direction on every iteration.
     */
    public var alternate: Boolean
        /**
         * Gets whether @self changes direction on every iteration.
         *
         * @return whether @self alternates
         */
        get() = adw_timed_animation_get_alternate(adwTimedAnimationPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self changes direction on every iteration.
         *
         * @param alternate whether @self alternates
         */
        set(
            alternate
        ) = adw_timed_animation_set_alternate(adwTimedAnimationPointer.reinterpret(), alternate.asGBoolean())

    /**
     * Duration of the animation, in milliseconds.
     *
     * Describes how much time the animation will take.
     *
     * If the animation repeats more than once, describes the duration of one
     * iteration.
     */
    public var duration: UInt
        /**
         * Gets the duration of @self.
         *
         * @return the duration of @self, in milliseconds
         */
        get() = adw_timed_animation_get_duration(adwTimedAnimationPointer.reinterpret())

        /**
         * Sets the duration of @self.
         *
         * If the animation repeats more than once, sets the duration of one iteration.
         *
         * @param duration the duration to use, in milliseconds
         */
        set(duration) = adw_timed_animation_set_duration(adwTimedAnimationPointer.reinterpret(), duration)

    /**
     * Easing function used in the animation.
     *
     * Describes the curve the value is interpolated on.
     *
     * See [enum@Easing] for the description of specific easing functions.
     */
    public var easing: Easing
        /**
         * Gets the easing function @self uses.
         *
         * @return the easing function @self uses
         */
        get() =
            adw_timed_animation_get_easing(adwTimedAnimationPointer.reinterpret()).run {
                Easing.fromNativeValue(this)
            }

        /**
         * Sets the easing function @self will use.
         *
         * See [enum@Easing] for the description of specific easing functions.
         *
         * @param easing the easing function to use
         */
        set(easing) = adw_timed_animation_set_easing(adwTimedAnimationPointer.reinterpret(), easing.nativeValue)

    /**
     * Number of times the animation will play.
     *
     * If set to 0, the animation will repeat endlessly.
     */
    public var repeatCount: UInt
        /**
         * Gets the number of times @self will play.
         *
         * @return the number of times @self will play
         */
        get() = adw_timed_animation_get_repeat_count(adwTimedAnimationPointer.reinterpret())

        /**
         * Sets the number of times @self will play.
         *
         * If set to 0, @self will repeat endlessly.
         *
         * @param repeatCount the number of times @self will play
         */
        set(repeatCount) = adw_timed_animation_set_repeat_count(adwTimedAnimationPointer.reinterpret(), repeatCount)

    /**
     * Whether the animation plays backwards.
     */
    public var reverse: Boolean
        /**
         * Gets whether @self plays backwards.
         *
         * @return whether @self plays backwards
         */
        get() = adw_timed_animation_get_reverse(adwTimedAnimationPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self plays backwards.
         *
         * @param reverse whether @self plays backwards
         */
        set(reverse) = adw_timed_animation_set_reverse(adwTimedAnimationPointer.reinterpret(), reverse.asGBoolean())

    /**
     * The value to animate from.
     *
     * The animation will start at this value and end at
     * [property@TimedAnimation:value-to].
     *
     * If [property@TimedAnimation:reverse] is `TRUE`, the animation will end at
     * this value instead.
     */
    public var valueFrom: Double
        /**
         * Gets the value @self will animate from.
         *
         * @return the value to animate from
         */
        get() = adw_timed_animation_get_value_from(adwTimedAnimationPointer.reinterpret())

        /**
         * Sets the value @self will animate from.
         *
         * The animation will start at this value and end at
         * [property@TimedAnimation:value-to].
         *
         * If [property@TimedAnimation:reverse] is `TRUE`, the animation will end at
         * this value instead.
         *
         * @param value the value to animate from
         */
        set(`value`) = adw_timed_animation_set_value_from(adwTimedAnimationPointer.reinterpret(), `value`)

    /**
     * The value to animate to.
     *
     * The animation will start at [property@TimedAnimation:value-from] and end at
     * this value.
     *
     * If [property@TimedAnimation:reverse] is `TRUE`, the animation will start
     * at this value instead.
     */
    public var valueTo: Double
        /**
         * Gets the value @self will animate to.
         *
         * @return the value to animate to
         */
        get() = adw_timed_animation_get_value_to(adwTimedAnimationPointer.reinterpret())

        /**
         * Sets the value @self will animate to.
         *
         * The animation will start at [property@TimedAnimation:value-from] and end at
         * this value.
         *
         * If [property@TimedAnimation:reverse] is `TRUE`, the animation will start
         * at this value instead.
         *
         * @param value the value to animate to
         */
        set(`value`) = adw_timed_animation_set_value_to(adwTimedAnimationPointer.reinterpret(), `value`)

    /**
     * Creates a new `AdwTimedAnimation` on @widget to animate @target from @from
     * to @to.
     *
     * @param widget a widget to create animation on
     * @param from a value to animate from
     * @param to a value to animate to
     * @param duration a duration for the animation
     * @param target a target value to animate
     * @return the newly created animation
     */
    public constructor(
        widget: Widget,
        from: Double,
        to: Double,
        duration: UInt,
        target: AnimationTarget,
    ) : this(
        adw_timed_animation_new(
            widget.gtkWidgetPointer.reinterpret(),
            from,
            to,
            duration,
            target.adwAnimationTargetPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets whether @self changes direction on every iteration.
     *
     * @return whether @self alternates
     */
    public fun getAlternate(): Boolean =
        adw_timed_animation_get_alternate(adwTimedAnimationPointer.reinterpret()).asBoolean()

    /**
     * Gets the duration of @self.
     *
     * @return the duration of @self, in milliseconds
     */
    public fun getDuration(): UInt = adw_timed_animation_get_duration(adwTimedAnimationPointer.reinterpret())

    /**
     * Gets the easing function @self uses.
     *
     * @return the easing function @self uses
     */
    public fun getEasing(): Easing =
        adw_timed_animation_get_easing(adwTimedAnimationPointer.reinterpret()).run {
            Easing.fromNativeValue(this)
        }

    /**
     * Gets the number of times @self will play.
     *
     * @return the number of times @self will play
     */
    public fun getRepeatCount(): UInt = adw_timed_animation_get_repeat_count(adwTimedAnimationPointer.reinterpret())

    /**
     * Gets whether @self plays backwards.
     *
     * @return whether @self plays backwards
     */
    public fun getReverse(): Boolean =
        adw_timed_animation_get_reverse(adwTimedAnimationPointer.reinterpret()).asBoolean()

    /**
     * Gets the value @self will animate from.
     *
     * @return the value to animate from
     */
    public fun getValueFrom(): Double = adw_timed_animation_get_value_from(adwTimedAnimationPointer.reinterpret())

    /**
     * Gets the value @self will animate to.
     *
     * @return the value to animate to
     */
    public fun getValueTo(): Double = adw_timed_animation_get_value_to(adwTimedAnimationPointer.reinterpret())

    /**
     * Sets whether @self changes direction on every iteration.
     *
     * @param alternate whether @self alternates
     */
    public fun setAlternate(alternate: Boolean): Unit =
        adw_timed_animation_set_alternate(adwTimedAnimationPointer.reinterpret(), alternate.asGBoolean())

    /**
     * Sets the duration of @self.
     *
     * If the animation repeats more than once, sets the duration of one iteration.
     *
     * @param duration the duration to use, in milliseconds
     */
    public fun setDuration(duration: UInt): Unit =
        adw_timed_animation_set_duration(adwTimedAnimationPointer.reinterpret(), duration)

    /**
     * Sets the easing function @self will use.
     *
     * See [enum@Easing] for the description of specific easing functions.
     *
     * @param easing the easing function to use
     */
    public fun setEasing(easing: Easing): Unit =
        adw_timed_animation_set_easing(adwTimedAnimationPointer.reinterpret(), easing.nativeValue)

    /**
     * Sets the number of times @self will play.
     *
     * If set to 0, @self will repeat endlessly.
     *
     * @param repeatCount the number of times @self will play
     */
    public fun setRepeatCount(repeatCount: UInt): Unit =
        adw_timed_animation_set_repeat_count(adwTimedAnimationPointer.reinterpret(), repeatCount)

    /**
     * Sets whether @self plays backwards.
     *
     * @param reverse whether @self plays backwards
     */
    public fun setReverse(reverse: Boolean): Unit =
        adw_timed_animation_set_reverse(adwTimedAnimationPointer.reinterpret(), reverse.asGBoolean())

    /**
     * Sets the value @self will animate from.
     *
     * The animation will start at this value and end at
     * [property@TimedAnimation:value-to].
     *
     * If [property@TimedAnimation:reverse] is `TRUE`, the animation will end at
     * this value instead.
     *
     * @param value the value to animate from
     */
    public fun setValueFrom(`value`: Double): Unit =
        adw_timed_animation_set_value_from(adwTimedAnimationPointer.reinterpret(), `value`)

    /**
     * Sets the value @self will animate to.
     *
     * The animation will start at [property@TimedAnimation:value-from] and end at
     * this value.
     *
     * If [property@TimedAnimation:reverse] is `TRUE`, the animation will start
     * at this value instead.
     *
     * @param value the value to animate to
     */
    public fun setValueTo(`value`: Double): Unit =
        adw_timed_animation_set_value_to(adwTimedAnimationPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<TimedAnimation> {
        override val type: GeneratedClassKGType<TimedAnimation> =
            GeneratedClassKGType(adw_timed_animation_get_type()) { TimedAnimation(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
