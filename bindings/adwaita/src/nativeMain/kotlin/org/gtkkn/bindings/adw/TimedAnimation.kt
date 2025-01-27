// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
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
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

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
public class TimedAnimation(public val adwTimedAnimationPointer: CPointer<AdwTimedAnimation>) :
    Animation(adwTimedAnimationPointer.reinterpret()),
    KGTyped {
    /**
     * Whether the animation changes direction on every iteration.
     */
    public var alternate: Boolean
        /**
         * Gets whether @self changes direction on every iteration.
         *
         * @return whether @self alternates
         */
        get() = adw_timed_animation_get_alternate(adwTimedAnimationPointer).asBoolean()

        /**
         * Sets whether @self changes direction on every iteration.
         *
         * @param alternate whether @self alternates
         */
        set(alternate) = adw_timed_animation_set_alternate(adwTimedAnimationPointer, alternate.asGBoolean())

    /**
     * Duration of the animation, in milliseconds.
     *
     * Describes how much time the animation will take.
     *
     * If the animation repeats more than once, describes the duration of one
     * iteration.
     */
    public var duration: guint
        /**
         * Gets the duration of @self.
         *
         * @return the duration of @self, in milliseconds
         */
        get() = adw_timed_animation_get_duration(adwTimedAnimationPointer)

        /**
         * Sets the duration of @self.
         *
         * If the animation repeats more than once, sets the duration of one iteration.
         *
         * @param duration the duration to use, in milliseconds
         */
        set(duration) = adw_timed_animation_set_duration(adwTimedAnimationPointer, duration)

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
        get() = adw_timed_animation_get_easing(adwTimedAnimationPointer).run {
            Easing.fromNativeValue(this)
        }

        /**
         * Sets the easing function @self will use.
         *
         * See [enum@Easing] for the description of specific easing functions.
         *
         * @param easing the easing function to use
         */
        set(easing) = adw_timed_animation_set_easing(adwTimedAnimationPointer, easing.nativeValue)

    /**
     * Number of times the animation will play.
     *
     * If set to 0, the animation will repeat endlessly.
     */
    public var repeatCount: guint
        /**
         * Gets the number of times @self will play.
         *
         * @return the number of times @self will play
         */
        get() = adw_timed_animation_get_repeat_count(adwTimedAnimationPointer)

        /**
         * Sets the number of times @self will play.
         *
         * If set to 0, @self will repeat endlessly.
         *
         * @param repeatCount the number of times @self will play
         */
        set(repeatCount) = adw_timed_animation_set_repeat_count(adwTimedAnimationPointer, repeatCount)

    /**
     * Whether the animation plays backwards.
     */
    public var reverse: Boolean
        /**
         * Gets whether @self plays backwards.
         *
         * @return whether @self plays backwards
         */
        get() = adw_timed_animation_get_reverse(adwTimedAnimationPointer).asBoolean()

        /**
         * Sets whether @self plays backwards.
         *
         * @param reverse whether @self plays backwards
         */
        set(reverse) = adw_timed_animation_set_reverse(adwTimedAnimationPointer, reverse.asGBoolean())

    /**
     * The value to animate from.
     *
     * The animation will start at this value and end at
     * [property@TimedAnimation:value-to].
     *
     * If [property@TimedAnimation:reverse] is `TRUE`, the animation will end at
     * this value instead.
     */
    public var valueFrom: gdouble
        /**
         * Gets the value @self will animate from.
         *
         * @return the value to animate from
         */
        get() = adw_timed_animation_get_value_from(adwTimedAnimationPointer)

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
        set(`value`) = adw_timed_animation_set_value_from(adwTimedAnimationPointer, `value`)

    /**
     * The value to animate to.
     *
     * The animation will start at [property@TimedAnimation:value-from] and end at
     * this value.
     *
     * If [property@TimedAnimation:reverse] is `TRUE`, the animation will start
     * at this value instead.
     */
    public var valueTo: gdouble
        /**
         * Gets the value @self will animate to.
         *
         * @return the value to animate to
         */
        get() = adw_timed_animation_get_value_to(adwTimedAnimationPointer)

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
        set(`value`) = adw_timed_animation_set_value_to(adwTimedAnimationPointer, `value`)

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
        from: gdouble,
        to: gdouble,
        duration: guint,
        target: AnimationTarget,
    ) : this(
        adw_timed_animation_new(
            widget.gtkWidgetPointer,
            from,
            to,
            duration,
            target.adwAnimationTargetPointer
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<TimedAnimation> {
        override val type: GeneratedClassKGType<TimedAnimation> =
            GeneratedClassKGType(getTypeOrNull("adw_timed_animation_get_type")!!) {
                TimedAnimation(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of TimedAnimation
         *
         * @return the GType
         */
        public fun getType(): GType = adw_timed_animation_get_type()
    }
}
