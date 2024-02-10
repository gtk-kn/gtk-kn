// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwAnimation
import org.gtkkn.native.adw.adw_animation_get_state
import org.gtkkn.native.adw.adw_animation_get_target
import org.gtkkn.native.adw.adw_animation_get_type
import org.gtkkn.native.adw.adw_animation_get_value
import org.gtkkn.native.adw.adw_animation_get_widget
import org.gtkkn.native.adw.adw_animation_pause
import org.gtkkn.native.adw.adw_animation_play
import org.gtkkn.native.adw.adw_animation_reset
import org.gtkkn.native.adw.adw_animation_resume
import org.gtkkn.native.adw.adw_animation_skip
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * A base class for animations.
 *
 * `AdwAnimation` represents an animation on a widget. It has a target that
 * provides a value to animate, and a state indicating whether the
 * animation hasn't been started yet, is playing, paused or finished.
 *
 * Currently there are two concrete animation types:
 * [class@TimedAnimation] and [class@SpringAnimation].
 *
 * `AdwAnimation` will automatically skip the animation if
 * [property@Animation:widget] is unmapped, or if
 * [property@Gtk.Settings:gtk-enable-animations] is `FALSE`.
 *
 * The [signal@Animation::done] signal can be used to perform an action after
 * the animation ends, for example hiding a widget after animating its
 * [property@Gtk.Widget:opacity] to 0.
 *
 * `AdwAnimation` will be kept alive while the animation is playing. As such,
 * it's safe to create an animation, start it and immediately unref it:
 * A fire-and-forget animation:
 *
 * ```c
 * static void
 * animation_cb (double    value,
 *               MyObject *self)
 * {
 *   // Do something with @value
 * }
 *
 * static void
 * my_object_animate (MyObject *self)
 * {
 *   AdwAnimationTarget *target =
 *     adw_callback_animation_target_new ((AdwAnimationTargetFunc) animation_cb,
 *                                        self, NULL);
 *   g_autoptr (AdwAnimation) animation =
 *     adw_timed_animation_new (widget, 0, 1, 250, target);
 *
 *   adw_animation_play (animation);
 * }
 * ```
 *
 * If there's a chance the previous animation for the same target hasn't yet
 * finished, the previous animation should be stopped first, or the existing
 * `AdwAnimation` object can be reused.
 * @since 1.0
 */
public open class Animation(
    pointer: CPointer<AdwAnimation>,
) : Object(pointer.reinterpret()), KGTyped {
    public val adwAnimationPointer: CPointer<AdwAnimation>
        get() = gPointer.reinterpret()

    /**
     * The animation state.
     *
     * The state indicates whether the animation is currently playing, paused,
     * finished or hasn't been started yet.
     *
     * @since 1.0
     */
    public open val state: AnimationState
        /**
         * Gets the current value of @self.
         *
         * The state indicates whether @self is currently playing, paused, finished or
         * hasn't been started yet.
         *
         * @return the animation value
         * @since 1.0
         */
        get() =
            adw_animation_get_state(adwAnimationPointer.reinterpret()).run {
                AnimationState.fromNativeValue(this)
            }

    /**
     * The target to animate.
     *
     * @since 1.0
     */
    public open val target: AnimationTarget
        /**
         * Gets the target @self animates.
         *
         * @return the animation target
         * @since 1.0
         */
        get() =
            adw_animation_get_target(adwAnimationPointer.reinterpret())!!.run {
                AnimationTarget(reinterpret())
            }

    /**
     * The current value of the animation.
     *
     * @since 1.0
     */
    public open val `value`: Double
        /**
         * Gets the current value of @self.
         *
         * @return the current value
         * @since 1.0
         */
        get() = adw_animation_get_value(adwAnimationPointer.reinterpret())

    /**
     * The animation widget.
     *
     * It provides the frame clock for the animation. It's not strictly necessary
     * for this widget to be same as the one being animated.
     *
     * The widget must be mapped in order for the animation to work. If it's not
     * mapped, or if it gets unmapped during an ongoing animation, the animation
     * will be automatically skipped.
     *
     * @since 1.0
     */
    public open val widget: Widget
        /**
         * Gets the widget @self was created for.
         *
         * @return the animation widget
         * @since 1.0
         */
        get() =
            adw_animation_get_widget(adwAnimationPointer.reinterpret())!!.run {
                Widget(reinterpret())
            }

    /**
     * Gets the current value of @self.
     *
     * The state indicates whether @self is currently playing, paused, finished or
     * hasn't been started yet.
     *
     * @return the animation value
     * @since 1.0
     */
    public open fun getState(): AnimationState =
        adw_animation_get_state(adwAnimationPointer.reinterpret()).run {
            AnimationState.fromNativeValue(this)
        }

    /**
     * Gets the target @self animates.
     *
     * @return the animation target
     * @since 1.0
     */
    public open fun getTarget(): AnimationTarget =
        adw_animation_get_target(adwAnimationPointer.reinterpret())!!.run {
            AnimationTarget(reinterpret())
        }

    /**
     * Gets the current value of @self.
     *
     * @return the current value
     * @since 1.0
     */
    public open fun getValue(): Double = adw_animation_get_value(adwAnimationPointer.reinterpret())

    /**
     * Gets the widget @self was created for.
     *
     * @return the animation widget
     * @since 1.0
     */
    public open fun getWidget(): Widget =
        adw_animation_get_widget(adwAnimationPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Pauses a playing animation for @self.
     *
     * Does nothing if the current state of @self isn't `ADW_ANIMATION_PLAYING`.
     *
     * Sets [property@Animation:state] to `ADW_ANIMATION_PAUSED`.
     *
     * @since 1.0
     */
    public open fun pause(): Unit = adw_animation_pause(adwAnimationPointer.reinterpret())

    /**
     * Starts the animation for @self.
     *
     * If the animation is playing, paused or has been completed, restarts it from
     * the beginning. This allows to easily play an animation regardless of whether
     * it's already playing or not.
     *
     * Sets [property@Animation:state] to `ADW_ANIMATION_PLAYING`.
     *
     * The animation will be automatically skipped if [property@Animation:widget] is
     * unmapped, or if [property@Gtk.Settings:gtk-enable-animations] is `FALSE`.
     *
     * As such, it's not guaranteed that the animation will actually run. For
     * example, when using [func@GLib.idle_add] and starting an animation
     * immediately afterwards, it's entirely possible that the idle callback will
     * run after the animation has already finished, and not while it's playing.
     *
     * @since 1.0
     */
    public open fun play(): Unit = adw_animation_play(adwAnimationPointer.reinterpret())

    /**
     * Resets the animation for @self.
     *
     * Sets [property@Animation:state] to `ADW_ANIMATION_IDLE`.
     *
     * @since 1.0
     */
    public open fun reset(): Unit = adw_animation_reset(adwAnimationPointer.reinterpret())

    /**
     * Resumes a paused animation for @self.
     *
     * This function must only be used if the animation has been paused with
     * [method@Animation.pause].
     *
     * Sets [property@Animation:state] to `ADW_ANIMATION_PLAYING`.
     *
     * @since 1.0
     */
    public open fun resume(): Unit = adw_animation_resume(adwAnimationPointer.reinterpret())

    /**
     * Skips the animation for @self.
     *
     * If the animation hasn't been started yet, is playing, or is paused, instantly
     * skips the animation to the end and causes [signal@Animation::done] to be
     * emitted.
     *
     * Sets [property@Animation:state] to `ADW_ANIMATION_FINISHED`.
     *
     * @since 1.0
     */
    public open fun skip(): Unit = adw_animation_skip(adwAnimationPointer.reinterpret())

    /**
     * This signal is emitted when the animation has been completed, either on its
     * own or via calling [method@Animation.skip].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.0
     */
    public fun connectDone(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "done",
            connectDoneFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Animation> {
        override val type: GeneratedClassKGType<Animation> =
            GeneratedClassKGType(adw_animation_get_type()) { Animation(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectDoneFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
