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
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwNavigationDirection
import org.gtkkn.native.adw.AdwSwipeTracker
import org.gtkkn.native.adw.adw_swipe_tracker_get_allow_long_swipes
import org.gtkkn.native.adw.adw_swipe_tracker_get_allow_mouse_drag
import org.gtkkn.native.adw.adw_swipe_tracker_get_allow_window_handle
import org.gtkkn.native.adw.adw_swipe_tracker_get_enabled
import org.gtkkn.native.adw.adw_swipe_tracker_get_lower_overshoot
import org.gtkkn.native.adw.adw_swipe_tracker_get_reversed
import org.gtkkn.native.adw.adw_swipe_tracker_get_swipeable
import org.gtkkn.native.adw.adw_swipe_tracker_get_type
import org.gtkkn.native.adw.adw_swipe_tracker_get_upper_overshoot
import org.gtkkn.native.adw.adw_swipe_tracker_new
import org.gtkkn.native.adw.adw_swipe_tracker_set_allow_long_swipes
import org.gtkkn.native.adw.adw_swipe_tracker_set_allow_mouse_drag
import org.gtkkn.native.adw.adw_swipe_tracker_set_allow_window_handle
import org.gtkkn.native.adw.adw_swipe_tracker_set_enabled
import org.gtkkn.native.adw.adw_swipe_tracker_set_lower_overshoot
import org.gtkkn.native.adw.adw_swipe_tracker_set_reversed
import org.gtkkn.native.adw.adw_swipe_tracker_set_upper_overshoot
import org.gtkkn.native.adw.adw_swipe_tracker_shift_position
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * A swipe tracker used in [class@Carousel], [class@NavigationView] and
 * [class@OverlaySplitView].
 *
 * The `AdwSwipeTracker` object can be used for implementing widgets with swipe
 * gestures. It supports touch-based swipes, pointer dragging, and touchpad
 * scrolling.
 *
 * The widgets will probably want to expose the [property@SwipeTracker:enabled]
 * property. If they expect to use horizontal orientation,
 * [property@SwipeTracker:reversed] can be used for supporting RTL text
 * direction.
 */
public class SwipeTracker(
    pointer: CPointer<AdwSwipeTracker>,
) : Object(pointer.reinterpret()),
    Orientable,
    KGTyped {
    public val adwSwipeTrackerPointer: CPointer<AdwSwipeTracker>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    /**
     * Whether to allow swiping for more than one snap point at a time.
     *
     * If the value is `FALSE`, each swipe can only move to the adjacent snap
     * points.
     */
    public var allowLongSwipes: Boolean
        /**
         * Gets whether to allow swiping for more than one snap point at a time.
         *
         * @return whether long swipes are allowed
         */
        get() = adw_swipe_tracker_get_allow_long_swipes(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to allow swiping for more than one snap point at a time.
         *
         * If the value is `FALSE`, each swipe can only move to the adjacent snap
         * points.
         *
         * @param allowLongSwipes whether to allow long swipes
         */
        set(
            allowLongSwipes
        ) = adw_swipe_tracker_set_allow_long_swipes(adwSwipeTrackerPointer.reinterpret(), allowLongSwipes.asGBoolean())

    /**
     * Whether to allow dragging with mouse pointer.
     */
    public var allowMouseDrag: Boolean
        /**
         * Gets whether @self can be dragged with mouse pointer.
         *
         * @return whether mouse dragging is allowed
         */
        get() = adw_swipe_tracker_get_allow_mouse_drag(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be dragged with mouse pointer.
         *
         * @param allowMouseDrag whether to allow mouse dragging
         */
        set(
            allowMouseDrag
        ) = adw_swipe_tracker_set_allow_mouse_drag(adwSwipeTrackerPointer.reinterpret(), allowMouseDrag.asGBoolean())

    /**
     * Whether to allow touchscreen swiping from `GtkWindowHandle`.
     *
     * This will make dragging the window impossible.
     *
     * @since 1.5
     */
    public var allowWindowHandle: Boolean
        /**
         * Gets whether to allow touchscreen swiping from `GtkWindowHandle`.
         *
         * @return whether swiping from window handles is allowed
         * @since 1.5
         */
        get() = adw_swipe_tracker_get_allow_window_handle(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to allow touchscreen swiping from `GtkWindowHandle`.
         *
         * Setting it to `TRUE` will make dragging the window impossible.
         *
         * @param allowWindowHandle whether to allow swiping from window handles
         * @since 1.5
         */
        set(
            allowWindowHandle
        ) =
            adw_swipe_tracker_set_allow_window_handle(
                adwSwipeTrackerPointer.reinterpret(),
                allowWindowHandle.asGBoolean()
            )

    /**
     * Whether the swipe tracker is enabled.
     *
     * When it's not enabled, no events will be processed. Usually widgets will
     * want to expose this via a property.
     */
    public var enabled: Boolean
        /**
         * Gets whether @self is enabled.
         *
         * @return whether @self is enabled
         */
        get() = adw_swipe_tracker_get_enabled(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self is enabled.
         *
         * When it's not enabled, no events will be processed. Usually widgets will want
         * to expose this via a property.
         *
         * @param enabled whether @self is enabled
         */
        set(enabled) = adw_swipe_tracker_set_enabled(adwSwipeTrackerPointer.reinterpret(), enabled.asGBoolean())

    /**
     * Whether to allow swiping past the first available snap point.
     *
     * @since 1.4
     */
    public var lowerOvershoot: Boolean
        /**
         * Gets whether to allow swiping past the first available snap point.
         *
         * @return whether to allow swiping past the first available snap point
         * @since 1.4
         */
        get() = adw_swipe_tracker_get_lower_overshoot(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to allow swiping past the first available snap point.
         *
         * @param overshoot whether to allow swiping past the first available snap point
         * @since 1.4
         */
        set(
            overshoot
        ) = adw_swipe_tracker_set_lower_overshoot(adwSwipeTrackerPointer.reinterpret(), overshoot.asGBoolean())

    /**
     * Whether to reverse the swipe direction.
     *
     * If the swipe tracker is horizontal, it can be used for supporting RTL text
     * direction.
     */
    public var reversed: Boolean
        /**
         * Gets whether @self is reversing the swipe direction.
         *
         * @return whether the direction is reversed
         */
        get() = adw_swipe_tracker_get_reversed(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to reverse the swipe direction.
         *
         * If the swipe tracker is horizontal, it can be used for supporting RTL text
         * direction.
         *
         * @param reversed whether to reverse the swipe direction
         */
        set(reversed) = adw_swipe_tracker_set_reversed(adwSwipeTrackerPointer.reinterpret(), reversed.asGBoolean())

    /**
     * The widget the swipe tracker is attached to.
     */
    public val swipeable: Swipeable
        /**
         * Get the widget @self is attached to.
         *
         * @return the swipeable widget
         */
        get() =
            adw_swipe_tracker_get_swipeable(adwSwipeTrackerPointer.reinterpret())!!.run {
                Swipeable.wrap(reinterpret())
            }

    /**
     * Whether to allow swiping past the last available snap point.
     *
     * @since 1.4
     */
    public var upperOvershoot: Boolean
        /**
         * Gets whether to allow swiping past the last available snap point.
         *
         * @return whether to allow swiping past the last available snap point
         * @since 1.4
         */
        get() = adw_swipe_tracker_get_upper_overshoot(adwSwipeTrackerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to allow swiping past the last available snap point.
         *
         * @param overshoot whether to allow swiping past the last available snap point
         * @since 1.4
         */
        set(
            overshoot
        ) = adw_swipe_tracker_set_upper_overshoot(adwSwipeTrackerPointer.reinterpret(), overshoot.asGBoolean())

    /**
     * Creates a new `AdwSwipeTracker` for @widget.
     *
     * @param swipeable a widget to add the tracker on
     * @return the newly created `AdwSwipeTracker`
     */
    public constructor(
        swipeable: Swipeable,
    ) : this(adw_swipe_tracker_new(swipeable.adwSwipeablePointer)!!.reinterpret())

    /**
     * Gets whether to allow swiping for more than one snap point at a time.
     *
     * @return whether long swipes are allowed
     */
    public fun getAllowLongSwipes(): Boolean =
        adw_swipe_tracker_get_allow_long_swipes(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self can be dragged with mouse pointer.
     *
     * @return whether mouse dragging is allowed
     */
    public fun getAllowMouseDrag(): Boolean =
        adw_swipe_tracker_get_allow_mouse_drag(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether to allow touchscreen swiping from `GtkWindowHandle`.
     *
     * @return whether swiping from window handles is allowed
     * @since 1.5
     */
    public fun getAllowWindowHandle(): Boolean =
        adw_swipe_tracker_get_allow_window_handle(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is enabled.
     *
     * @return whether @self is enabled
     */
    public fun getEnabled(): Boolean = adw_swipe_tracker_get_enabled(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether to allow swiping past the first available snap point.
     *
     * @return whether to allow swiping past the first available snap point
     * @since 1.4
     */
    public fun getLowerOvershoot(): Boolean =
        adw_swipe_tracker_get_lower_overshoot(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is reversing the swipe direction.
     *
     * @return whether the direction is reversed
     */
    public fun getReversed(): Boolean = adw_swipe_tracker_get_reversed(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Get the widget @self is attached to.
     *
     * @return the swipeable widget
     */
    public fun getSwipeable(): Swipeable =
        adw_swipe_tracker_get_swipeable(adwSwipeTrackerPointer.reinterpret())!!.run {
            Swipeable.wrap(reinterpret())
        }

    /**
     * Gets whether to allow swiping past the last available snap point.
     *
     * @return whether to allow swiping past the last available snap point
     * @since 1.4
     */
    public fun getUpperOvershoot(): Boolean =
        adw_swipe_tracker_get_upper_overshoot(adwSwipeTrackerPointer.reinterpret()).asBoolean()

    /**
     * Sets whether to allow swiping for more than one snap point at a time.
     *
     * If the value is `FALSE`, each swipe can only move to the adjacent snap
     * points.
     *
     * @param allowLongSwipes whether to allow long swipes
     */
    public fun setAllowLongSwipes(allowLongSwipes: Boolean): Unit =
        adw_swipe_tracker_set_allow_long_swipes(adwSwipeTrackerPointer.reinterpret(), allowLongSwipes.asGBoolean())

    /**
     * Sets whether @self can be dragged with mouse pointer.
     *
     * @param allowMouseDrag whether to allow mouse dragging
     */
    public fun setAllowMouseDrag(allowMouseDrag: Boolean): Unit =
        adw_swipe_tracker_set_allow_mouse_drag(adwSwipeTrackerPointer.reinterpret(), allowMouseDrag.asGBoolean())

    /**
     * Sets whether to allow touchscreen swiping from `GtkWindowHandle`.
     *
     * Setting it to `TRUE` will make dragging the window impossible.
     *
     * @param allowWindowHandle whether to allow swiping from window handles
     * @since 1.5
     */
    public fun setAllowWindowHandle(allowWindowHandle: Boolean): Unit =
        adw_swipe_tracker_set_allow_window_handle(adwSwipeTrackerPointer.reinterpret(), allowWindowHandle.asGBoolean())

    /**
     * Sets whether @self is enabled.
     *
     * When it's not enabled, no events will be processed. Usually widgets will want
     * to expose this via a property.
     *
     * @param enabled whether @self is enabled
     */
    public fun setEnabled(enabled: Boolean): Unit =
        adw_swipe_tracker_set_enabled(adwSwipeTrackerPointer.reinterpret(), enabled.asGBoolean())

    /**
     * Sets whether to allow swiping past the first available snap point.
     *
     * @param overshoot whether to allow swiping past the first available snap point
     * @since 1.4
     */
    public fun setLowerOvershoot(overshoot: Boolean): Unit =
        adw_swipe_tracker_set_lower_overshoot(adwSwipeTrackerPointer.reinterpret(), overshoot.asGBoolean())

    /**
     * Sets whether to reverse the swipe direction.
     *
     * If the swipe tracker is horizontal, it can be used for supporting RTL text
     * direction.
     *
     * @param reversed whether to reverse the swipe direction
     */
    public fun setReversed(reversed: Boolean): Unit =
        adw_swipe_tracker_set_reversed(adwSwipeTrackerPointer.reinterpret(), reversed.asGBoolean())

    /**
     * Sets whether to allow swiping past the last available snap point.
     *
     * @param overshoot whether to allow swiping past the last available snap point
     * @since 1.4
     */
    public fun setUpperOvershoot(overshoot: Boolean): Unit =
        adw_swipe_tracker_set_upper_overshoot(adwSwipeTrackerPointer.reinterpret(), overshoot.asGBoolean())

    /**
     * Moves the current progress value by @delta.
     *
     * This can be used to adjust the current position if snap points move during
     * the gesture.
     *
     * @param delta the position delta
     */
    public fun shiftPosition(delta: Double): Unit =
        adw_swipe_tracker_shift_position(adwSwipeTrackerPointer.reinterpret(), delta)

    /**
     * This signal is emitted right before a swipe will be started, after the
     * drag threshold has been passed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectBeginSwipe(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "begin-swipe",
            connectBeginSwipeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted as soon as the gesture has stopped.
     *
     * The user is expected to animate the deceleration from the current progress
     * value to @to with an animation using @velocity as the initial velocity,
     * provided in pixels per second. [class@SpringAnimation] is usually a good
     * fit for this.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `velocity` the velocity of the swipe; `to` the progress value to animate to
     */
    public fun connectEndSwipe(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (velocity: Double, to: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "end-swipe",
            connectEndSwipeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when a possible swipe is detected.
     *
     * The @direction value can be used to restrict the swipe to a certain
     * direction.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `direction` the direction of the swipe
     */
    public fun connectPrepare(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (direction: NavigationDirection) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "prepare",
            connectPrepareFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted every time the progress value changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `progress` the current animation progress value
     */
    public fun connectUpdateSwipe(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (progress: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "update-swipe",
            connectUpdateSwipeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SwipeTracker> {
        override val type: GeneratedClassKGType<SwipeTracker> =
            GeneratedClassKGType(adw_swipe_tracker_get_type()) { SwipeTracker(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectBeginSwipeFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectEndSwipeFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            velocity: Double,
            to: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(velocity: Double, to: Double) -> Unit>().get().invoke(velocity, to)
    }.reinterpret()

private val connectPrepareFunc: CPointer<CFunction<(AdwNavigationDirection) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            direction: AdwNavigationDirection,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(direction: NavigationDirection) -> Unit>().get().invoke(
            direction.run {
                NavigationDirection.fromNativeValue(this)
            }
        )
    }.reinterpret()

private val connectUpdateSwipeFunc: CPointer<CFunction<(Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            progress: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(progress: Double) -> Unit>().get().invoke(progress)
    }.reinterpret()
