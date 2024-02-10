// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.PackType
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwFlap
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_flap_get_content
import org.gtkkn.native.adw.adw_flap_get_flap
import org.gtkkn.native.adw.adw_flap_get_flap_position
import org.gtkkn.native.adw.adw_flap_get_fold_duration
import org.gtkkn.native.adw.adw_flap_get_fold_policy
import org.gtkkn.native.adw.adw_flap_get_fold_threshold_policy
import org.gtkkn.native.adw.adw_flap_get_folded
import org.gtkkn.native.adw.adw_flap_get_locked
import org.gtkkn.native.adw.adw_flap_get_modal
import org.gtkkn.native.adw.adw_flap_get_reveal_flap
import org.gtkkn.native.adw.adw_flap_get_reveal_params
import org.gtkkn.native.adw.adw_flap_get_reveal_progress
import org.gtkkn.native.adw.adw_flap_get_separator
import org.gtkkn.native.adw.adw_flap_get_swipe_to_close
import org.gtkkn.native.adw.adw_flap_get_swipe_to_open
import org.gtkkn.native.adw.adw_flap_get_transition_type
import org.gtkkn.native.adw.adw_flap_get_type
import org.gtkkn.native.adw.adw_flap_new
import org.gtkkn.native.adw.adw_flap_set_content
import org.gtkkn.native.adw.adw_flap_set_flap
import org.gtkkn.native.adw.adw_flap_set_flap_position
import org.gtkkn.native.adw.adw_flap_set_fold_duration
import org.gtkkn.native.adw.adw_flap_set_fold_policy
import org.gtkkn.native.adw.adw_flap_set_fold_threshold_policy
import org.gtkkn.native.adw.adw_flap_set_locked
import org.gtkkn.native.adw.adw_flap_set_modal
import org.gtkkn.native.adw.adw_flap_set_reveal_flap
import org.gtkkn.native.adw.adw_flap_set_reveal_params
import org.gtkkn.native.adw.adw_flap_set_separator
import org.gtkkn.native.adw.adw_flap_set_swipe_to_close
import org.gtkkn.native.adw.adw_flap_set_swipe_to_open
import org.gtkkn.native.adw.adw_flap_set_transition_type
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.Double
import kotlin.UInt
import kotlin.Unit

/**
 * An adaptive container acting like a box or an overlay.
 *
 * <picture>
 *   <source srcset="flap-wide-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="flap-wide.png" alt="flap-wide">
 * </picture>
 * <picture>
 *   <source srcset="flap-narrow-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="flap-narrow.png" alt="flap-narrow">
 * </picture>
 *
 * The `AdwFlap` widget can display its children like a [class@Gtk.Box] does or
 * like a [class@Gtk.Overlay] does, according to the
 * [property@Flap:fold-policy] value.
 *
 * `AdwFlap` has at most three children: [property@Flap:content],
 * [property@Flap:flap] and [property@Flap:separator]. Content is the primary
 * child, flap is displayed next to it when unfolded, or overlays it when
 * folded. Flap can be shown or hidden by changing the
 * [property@Flap:reveal-flap] value, as well as via swipe gestures if
 * [property@Flap:swipe-to-open] and/or [property@Flap:swipe-to-close] are set
 * to `TRUE`.
 *
 * Optionally, a separator can be provided, which would be displayed between
 * the content and the flap when there's no shadow to separate them, depending
 * on the transition type.
 *
 * [property@Flap:flap] is transparent by default; add the
 * [`.background`](style-classes.html#background) style class to it if this is
 * unwanted.
 *
 * If [property@Flap:modal] is set to `TRUE`, content becomes completely
 * inaccessible when the flap is revealed while folded.
 *
 * The position of the flap and separator children relative to the content is
 * determined by orientation, as well as the [property@Flap:flap-position]
 * value.
 *
 * Folding the flap will automatically hide the flap widget, and unfolding it
 * will automatically reveal it. If this behavior is not desired, the
 * [property@Flap:locked] property can be used to override it.
 *
 * Common use cases include sidebars, header bars that need to be able to
 * overlap the window content (for example, in fullscreen mode) and bottom
 * sheets.
 *
 * ## AdwFlap as GtkBuildable
 *
 * The `AdwFlap` implementation of the [iface@Gtk.Buildable] interface supports
 * setting the flap child by specifying “flap” as the “type” attribute of a
 * <child> element, and separator by specifying “separator”. Specifying
 * “content” child type or omitting it results in setting the content child.
 *
 * ## CSS nodes
 *
 * `AdwFlap` has a single CSS node with name `flap`. The node will get the style
 * classes `.folded` when it is folded, and `.unfolded` when it's not.
 * @since 1.0
 */
public class Flap(
    pointer: CPointer<AdwFlap>,
) : Widget(pointer.reinterpret()), Swipeable, Orientable, KGTyped {
    public val adwFlapPointer: CPointer<AdwFlap>
        get() = gPointer.reinterpret()

    override val adwSwipeablePointer: CPointer<AdwSwipeable>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The content widget.
     *
     * It's always displayed when unfolded, and partially visible
     * when folded.
     *
     * @since 1.0
     */
    public var content: Widget?
        /**
         * Gets the content widget for @self.
         *
         * @return the content widget for @self
         * @since 1.0
         */
        get() =
            adw_flap_get_content(adwFlapPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the content widget for @self.
         *
         * @param content the content widget
         * @since 1.0
         */
        set(content) =
            adw_flap_set_content(
                adwFlapPointer.reinterpret(),
                content?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The flap widget.
     *
     * It's only visible when [property@Flap:reveal-progress] is greater than 0.
     *
     * @since 1.0
     */
    public var flap: Widget?
        /**
         * Gets the flap widget for @self.
         *
         * @return the flap widget for @self
         * @since 1.0
         */
        get() =
            adw_flap_get_flap(adwFlapPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the flap widget for @self.
         *
         * @param flap the flap widget
         * @since 1.0
         */
        set(flap) =
            adw_flap_set_flap(
                adwFlapPointer.reinterpret(),
                flap?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The flap position.
     *
     * If it's set to `GTK_PACK_START`, the flap is displayed before the content,
     * if `GTK_PACK_END`, it's displayed after the content.
     *
     * @since 1.0
     */
    public var flapPosition: PackType
        /**
         * Gets the flap position for @self.
         *
         * @return the flap position for @self
         * @since 1.0
         */
        get() =
            adw_flap_get_flap_position(adwFlapPointer.reinterpret()).run {
                PackType.fromNativeValue(this)
            }

        /**
         * Sets the flap position for @self.
         *
         * @param position the new value
         * @since 1.0
         */
        set(position) =
            adw_flap_set_flap_position(
                adwFlapPointer.reinterpret(),
                position.nativeValue
            )

    /**
     * The fold transition animation duration, in milliseconds.
     *
     * @since 1.0
     */
    public var foldDuration: UInt
        /**
         * Gets the duration that fold transitions in @self will take.
         *
         * @return the fold transition duration
         * @since 1.0
         */
        get() = adw_flap_get_fold_duration(adwFlapPointer.reinterpret())

        /**
         * Sets the duration that fold transitions in @self will take.
         *
         * @param duration the new duration, in milliseconds
         * @since 1.0
         */
        set(duration) = adw_flap_set_fold_duration(adwFlapPointer.reinterpret(), duration)

    /**
     * The fold policy for the flap.
     *
     * @since 1.0
     */
    public var foldPolicy: FlapFoldPolicy
        /**
         * Gets the fold policy for @self.
         *
         * @return the fold policy for @self
         * @since 1.0
         */
        get() =
            adw_flap_get_fold_policy(adwFlapPointer.reinterpret()).run {
                FlapFoldPolicy.fromNativeValue(this)
            }

        /**
         * Sets the fold policy for @self.
         *
         * @param policy the fold policy
         * @since 1.0
         */
        set(policy) = adw_flap_set_fold_policy(adwFlapPointer.reinterpret(), policy.nativeValue)

    /**
     * Determines when the flap will fold.
     *
     * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, flap will only fold when
     * the children cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`,
     * it will fold as soon as children don't get their natural size.
     *
     * This can be useful if you have a long ellipsizing label and want to let it
     * ellipsize instead of immediately folding.
     *
     * @since 1.0
     */
    public var foldThresholdPolicy: FoldThresholdPolicy
        /**
         * Gets the fold threshold policy for @self.
         *
         * @since 1.0
         */
        get() =
            adw_flap_get_fold_threshold_policy(adwFlapPointer.reinterpret()).run {
                FoldThresholdPolicy.fromNativeValue(this)
            }

        /**
         * Sets the fold threshold policy for @self.
         *
         * @param policy the policy to use
         * @since 1.0
         */
        set(policy) =
            adw_flap_set_fold_threshold_policy(
                adwFlapPointer.reinterpret(),
                policy.nativeValue
            )

    /**
     * Whether the flap is currently folded.
     *
     * See [property@Flap:fold-policy].
     *
     * @since 1.0
     */
    public val folded: Boolean
        /**
         * Gets whether @self is currently folded.
         *
         * @return `TRUE` if @self is currently folded
         * @since 1.0
         */
        get() = adw_flap_get_folded(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Whether the flap is locked.
     *
     * If `FALSE`, folding when the flap is revealed automatically closes it, and
     * unfolding it when the flap is not revealed opens it. If `TRUE`,
     * [property@Flap:reveal-flap] value never changes on its own.
     *
     * @since 1.0
     */
    public var locked: Boolean
        /**
         * Gets whether @self is locked.
         *
         * @return `TRUE` if @self is locked
         * @since 1.0
         */
        get() = adw_flap_get_locked(adwFlapPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self is locked.
         *
         * @param locked the new value
         * @since 1.0
         */
        set(locked) = adw_flap_set_locked(adwFlapPointer.reinterpret(), locked.asGBoolean())

    /**
     * Whether the flap is modal.
     *
     * If `TRUE`, clicking the content widget while flap is revealed, as well as
     * pressing the <kbd>Esc</kbd> key, will close the flap. If `FALSE`, clicks
     * are passed through to the content widget.
     *
     * @since 1.0
     */
    public var modal: Boolean
        /**
         * Gets whether @self is modal.
         *
         * @return `TRUE` if @self is modal
         * @since 1.0
         */
        get() = adw_flap_get_modal(adwFlapPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self is modal.
         *
         * @param modal whether @self is modal
         * @since 1.0
         */
        set(modal) = adw_flap_set_modal(adwFlapPointer.reinterpret(), modal.asGBoolean())

    /**
     * Whether the flap widget is revealed.
     *
     * @since 1.0
     */
    public var revealFlap: Boolean
        /**
         * Gets whether the flap widget is revealed for @self.
         *
         * @return `TRUE` if the flap widget is revealed
         * @since 1.0
         */
        get() = adw_flap_get_reveal_flap(adwFlapPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the flap widget is revealed for @self.
         *
         * @param revealFlap whether to reveal the flap widget
         * @since 1.0
         */
        set(revealFlap) =
            adw_flap_set_reveal_flap(
                adwFlapPointer.reinterpret(),
                revealFlap.asGBoolean()
            )

    /**
     * The reveal animation spring parameters.
     *
     * The default value is equivalent to:
     *
     * ```c
     * adw_spring_params_new (1, 0.5, 500)
     * ```
     *
     * @since 1.0
     */
    public var revealParams: SpringParams
        /**
         * Gets the reveal animation spring parameters for @self.
         *
         * @return the reveal animation parameters
         * @since 1.0
         */
        get() =
            adw_flap_get_reveal_params(adwFlapPointer.reinterpret())!!.run {
                SpringParams(reinterpret())
            }

        /**
         * Sets the reveal animation spring parameters for @self.
         *
         * @param params the new parameters
         * @since 1.0
         */
        set(params) =
            adw_flap_set_reveal_params(
                adwFlapPointer.reinterpret(),
                params.adwSpringParamsPointer
            )

    /**
     * The current reveal transition progress.
     *
     * 0 means fully hidden, 1 means fully revealed.
     *
     * See [property@Flap:reveal-flap].
     *
     * @since 1.0
     */
    public val revealProgress: Double
        /**
         * Gets the current reveal progress for @self.
         *
         * @return the current reveal progress for @self
         * @since 1.0
         */
        get() = adw_flap_get_reveal_progress(adwFlapPointer.reinterpret())

    /**
     * The separator widget.
     *
     * It's displayed between content and flap when there's no shadow to display.
     * When exactly it's visible depends on the [property@Flap:transition-type]
     * value.
     *
     * @since 1.0
     */
    public var separator: Widget?
        /**
         * Gets the separator widget for @self.
         *
         * @return the separator widget for @self
         * @since 1.0
         */
        get() =
            adw_flap_get_separator(adwFlapPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the separator widget for @self.
         *
         * @param separator the separator widget
         * @since 1.0
         */
        set(separator) =
            adw_flap_set_separator(
                adwFlapPointer.reinterpret(),
                separator?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether the flap can be closed with a swipe gesture.
     *
     * The area that can be swiped depends on the [property@Flap:transition-type]
     * value.
     *
     * @since 1.0
     */
    public var swipeToClose: Boolean
        /**
         * Gets whether @self can be closed with a swipe gesture.
         *
         * @return `TRUE` if @self can be closed with a swipe gesture
         * @since 1.0
         */
        get() = adw_flap_get_swipe_to_close(adwFlapPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be closed with a swipe gesture.
         *
         * @param swipeToClose whether @self can be closed with a swipe gesture
         * @since 1.0
         */
        set(swipeToClose) =
            adw_flap_set_swipe_to_close(
                adwFlapPointer.reinterpret(),
                swipeToClose.asGBoolean()
            )

    /**
     * Whether the flap can be opened with a swipe gesture.
     *
     * The area that can be swiped depends on the [property@Flap:transition-type]
     * value.
     *
     * @since 1.0
     */
    public var swipeToOpen: Boolean
        /**
         * Gets whether @self can be opened with a swipe gesture.
         *
         * @return `TRUE` if @self can be opened with a swipe gesture
         * @since 1.0
         */
        get() = adw_flap_get_swipe_to_open(adwFlapPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be opened with a swipe gesture.
         *
         * @param swipeToOpen whether @self can be opened with a swipe gesture
         * @since 1.0
         */
        set(swipeToOpen) =
            adw_flap_set_swipe_to_open(
                adwFlapPointer.reinterpret(),
                swipeToOpen.asGBoolean()
            )

    /**
     * the type of animation used for reveal and fold transitions.
     *
     * [property@Flap:flap] is transparent by default, which means the content
     * will be seen through it with `ADW_FLAP_TRANSITION_TYPE_OVER` transitions;
     * add the [`.background`](style-classes.html#background) style class to it if
     * this is unwanted.
     *
     * @since 1.0
     */
    public var transitionType: FlapTransitionType
        /**
         * Gets the type of animation used for reveal and fold transitions in @self.
         *
         * @return the current transition type of @self
         * @since 1.0
         */
        get() =
            adw_flap_get_transition_type(adwFlapPointer.reinterpret()).run {
                FlapTransitionType.fromNativeValue(this)
            }

        /**
         * Sets the type of animation used for reveal and fold transitions in @self.
         *
         * @param transitionType the new transition type
         * @since 1.0
         */
        set(transitionType) =
            adw_flap_set_transition_type(
                adwFlapPointer.reinterpret(),
                transitionType.nativeValue
            )

    /**
     * Creates a new `AdwFlap`.
     *
     * @return the newly created `AdwFlap`
     * @since 1.0
     */
    public constructor() : this(adw_flap_new()!!.reinterpret())

    /**
     * Gets the content widget for @self.
     *
     * @return the content widget for @self
     * @since 1.0
     */
    public fun getContent(): Widget? =
        adw_flap_get_content(adwFlapPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the flap widget for @self.
     *
     * @return the flap widget for @self
     * @since 1.0
     */
    public fun getFlap(): Widget? =
        adw_flap_get_flap(adwFlapPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the flap position for @self.
     *
     * @return the flap position for @self
     * @since 1.0
     */
    public fun getFlapPosition(): PackType =
        adw_flap_get_flap_position(adwFlapPointer.reinterpret()).run {
            PackType.fromNativeValue(this)
        }

    /**
     * Gets the duration that fold transitions in @self will take.
     *
     * @return the fold transition duration
     * @since 1.0
     */
    public fun getFoldDuration(): UInt = adw_flap_get_fold_duration(adwFlapPointer.reinterpret())

    /**
     * Gets the fold policy for @self.
     *
     * @return the fold policy for @self
     * @since 1.0
     */
    public fun getFoldPolicy(): FlapFoldPolicy =
        adw_flap_get_fold_policy(adwFlapPointer.reinterpret()).run {
            FlapFoldPolicy.fromNativeValue(this)
        }

    /**
     * Gets the fold threshold policy for @self.
     *
     * @since 1.0
     */
    public fun getFoldThresholdPolicy(): FoldThresholdPolicy =
        adw_flap_get_fold_threshold_policy(adwFlapPointer.reinterpret()).run {
            FoldThresholdPolicy.fromNativeValue(this)
        }

    /**
     * Gets whether @self is currently folded.
     *
     * @return `TRUE` if @self is currently folded
     * @since 1.0
     */
    public fun getFolded(): Boolean = adw_flap_get_folded(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is locked.
     *
     * @return `TRUE` if @self is locked
     * @since 1.0
     */
    public fun getLocked(): Boolean = adw_flap_get_locked(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is modal.
     *
     * @return `TRUE` if @self is modal
     * @since 1.0
     */
    public fun getModal(): Boolean = adw_flap_get_modal(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Gets whether the flap widget is revealed for @self.
     *
     * @return `TRUE` if the flap widget is revealed
     * @since 1.0
     */
    public fun getRevealFlap(): Boolean = adw_flap_get_reveal_flap(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Gets the reveal animation spring parameters for @self.
     *
     * @return the reveal animation parameters
     * @since 1.0
     */
    public fun getRevealParams(): SpringParams =
        adw_flap_get_reveal_params(adwFlapPointer.reinterpret())!!.run {
            SpringParams(reinterpret())
        }

    /**
     * Gets the current reveal progress for @self.
     *
     * @return the current reveal progress for @self
     * @since 1.0
     */
    public fun getRevealProgress(): Double = adw_flap_get_reveal_progress(adwFlapPointer.reinterpret())

    /**
     * Gets the separator widget for @self.
     *
     * @return the separator widget for @self
     * @since 1.0
     */
    public fun getSeparator(): Widget? =
        adw_flap_get_separator(adwFlapPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether @self can be closed with a swipe gesture.
     *
     * @return `TRUE` if @self can be closed with a swipe gesture
     * @since 1.0
     */
    public fun getSwipeToClose(): Boolean = adw_flap_get_swipe_to_close(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self can be opened with a swipe gesture.
     *
     * @return `TRUE` if @self can be opened with a swipe gesture
     * @since 1.0
     */
    public fun getSwipeToOpen(): Boolean = adw_flap_get_swipe_to_open(adwFlapPointer.reinterpret()).asBoolean()

    /**
     * Gets the type of animation used for reveal and fold transitions in @self.
     *
     * @return the current transition type of @self
     * @since 1.0
     */
    public fun getTransitionType(): FlapTransitionType =
        adw_flap_get_transition_type(adwFlapPointer.reinterpret()).run {
            FlapTransitionType.fromNativeValue(this)
        }

    /**
     * Sets the content widget for @self.
     *
     * @param content the content widget
     * @since 1.0
     */
    public fun setContent(content: Widget? = null): Unit =
        adw_flap_set_content(
            adwFlapPointer.reinterpret(),
            content?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the flap widget for @self.
     *
     * @param flap the flap widget
     * @since 1.0
     */
    public fun setFlap(flap: Widget? = null): Unit =
        adw_flap_set_flap(
            adwFlapPointer.reinterpret(),
            flap?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the flap position for @self.
     *
     * @param position the new value
     * @since 1.0
     */
    public fun setFlapPosition(position: PackType): Unit =
        adw_flap_set_flap_position(adwFlapPointer.reinterpret(), position.nativeValue)

    /**
     * Sets the duration that fold transitions in @self will take.
     *
     * @param duration the new duration, in milliseconds
     * @since 1.0
     */
    public fun setFoldDuration(duration: UInt): Unit =
        adw_flap_set_fold_duration(adwFlapPointer.reinterpret(), duration)

    /**
     * Sets the fold policy for @self.
     *
     * @param policy the fold policy
     * @since 1.0
     */
    public fun setFoldPolicy(policy: FlapFoldPolicy): Unit =
        adw_flap_set_fold_policy(adwFlapPointer.reinterpret(), policy.nativeValue)

    /**
     * Sets the fold threshold policy for @self.
     *
     * @param policy the policy to use
     * @since 1.0
     */
    public fun setFoldThresholdPolicy(policy: FoldThresholdPolicy): Unit =
        adw_flap_set_fold_threshold_policy(adwFlapPointer.reinterpret(), policy.nativeValue)

    /**
     * Sets whether @self is locked.
     *
     * @param locked the new value
     * @since 1.0
     */
    public fun setLocked(locked: Boolean): Unit =
        adw_flap_set_locked(
            adwFlapPointer.reinterpret(),
            locked.asGBoolean()
        )

    /**
     * Sets whether @self is modal.
     *
     * @param modal whether @self is modal
     * @since 1.0
     */
    public fun setModal(modal: Boolean): Unit =
        adw_flap_set_modal(
            adwFlapPointer.reinterpret(),
            modal.asGBoolean()
        )

    /**
     * Sets whether the flap widget is revealed for @self.
     *
     * @param revealFlap whether to reveal the flap widget
     * @since 1.0
     */
    public fun setRevealFlap(revealFlap: Boolean): Unit =
        adw_flap_set_reveal_flap(adwFlapPointer.reinterpret(), revealFlap.asGBoolean())

    /**
     * Sets the reveal animation spring parameters for @self.
     *
     * @param params the new parameters
     * @since 1.0
     */
    public fun setRevealParams(params: SpringParams): Unit =
        adw_flap_set_reveal_params(adwFlapPointer.reinterpret(), params.adwSpringParamsPointer)

    /**
     * Sets the separator widget for @self.
     *
     * @param separator the separator widget
     * @since 1.0
     */
    public fun setSeparator(separator: Widget? = null): Unit =
        adw_flap_set_separator(
            adwFlapPointer.reinterpret(),
            separator?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets whether @self can be closed with a swipe gesture.
     *
     * @param swipeToClose whether @self can be closed with a swipe gesture
     * @since 1.0
     */
    public fun setSwipeToClose(swipeToClose: Boolean): Unit =
        adw_flap_set_swipe_to_close(adwFlapPointer.reinterpret(), swipeToClose.asGBoolean())

    /**
     * Sets whether @self can be opened with a swipe gesture.
     *
     * @param swipeToOpen whether @self can be opened with a swipe gesture
     * @since 1.0
     */
    public fun setSwipeToOpen(swipeToOpen: Boolean): Unit =
        adw_flap_set_swipe_to_open(adwFlapPointer.reinterpret(), swipeToOpen.asGBoolean())

    /**
     * Sets the type of animation used for reveal and fold transitions in @self.
     *
     * @param transitionType the new transition type
     * @since 1.0
     */
    public fun setTransitionType(transitionType: FlapTransitionType): Unit =
        adw_flap_set_transition_type(adwFlapPointer.reinterpret(), transitionType.nativeValue)

    public companion object : TypeCompanion<Flap> {
        override val type: GeneratedClassKGType<Flap> =
            GeneratedClassKGType(adw_flap_get_type()) {
                Flap(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
