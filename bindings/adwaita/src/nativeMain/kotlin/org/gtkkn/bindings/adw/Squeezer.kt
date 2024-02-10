// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSqueezer
import org.gtkkn.native.adw.adw_squeezer_add
import org.gtkkn.native.adw.adw_squeezer_get_allow_none
import org.gtkkn.native.adw.adw_squeezer_get_homogeneous
import org.gtkkn.native.adw.adw_squeezer_get_interpolate_size
import org.gtkkn.native.adw.adw_squeezer_get_page
import org.gtkkn.native.adw.adw_squeezer_get_pages
import org.gtkkn.native.adw.adw_squeezer_get_switch_threshold_policy
import org.gtkkn.native.adw.adw_squeezer_get_transition_duration
import org.gtkkn.native.adw.adw_squeezer_get_transition_running
import org.gtkkn.native.adw.adw_squeezer_get_transition_type
import org.gtkkn.native.adw.adw_squeezer_get_type
import org.gtkkn.native.adw.adw_squeezer_get_visible_child
import org.gtkkn.native.adw.adw_squeezer_get_xalign
import org.gtkkn.native.adw.adw_squeezer_get_yalign
import org.gtkkn.native.adw.adw_squeezer_new
import org.gtkkn.native.adw.adw_squeezer_remove
import org.gtkkn.native.adw.adw_squeezer_set_allow_none
import org.gtkkn.native.adw.adw_squeezer_set_homogeneous
import org.gtkkn.native.adw.adw_squeezer_set_interpolate_size
import org.gtkkn.native.adw.adw_squeezer_set_switch_threshold_policy
import org.gtkkn.native.adw.adw_squeezer_set_transition_duration
import org.gtkkn.native.adw.adw_squeezer_set_transition_type
import org.gtkkn.native.adw.adw_squeezer_set_xalign
import org.gtkkn.native.adw.adw_squeezer_set_yalign
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.Float
import kotlin.UInt
import kotlin.Unit

/**
 * A best fit container.
 *
 * <picture>
 *   <source srcset="squeezer-wide-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="squeezer-wide.png" alt="squeezer-wide">
 * </picture>
 * <picture>
 *   <source srcset="squeezer-narrow-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="squeezer-narrow.png" alt="squeezer-narrow">
 * </picture>
 *
 * The `AdwSqueezer` widget is a container which only shows the first of its
 * children that fits in the available size. It is convenient to offer different
 * widgets to represent the same data with different levels of detail, making
 * the widget seem to squeeze itself to fit in the available space.
 *
 * Transitions between children can be animated as fades. This can be controlled
 * with [property@Squeezer:transition-type].
 *
 * ## CSS nodes
 *
 * `AdwSqueezer` has a single CSS node with name `squeezer`.
 * @since 1.0
 */
public class Squeezer(
    pointer: CPointer<AdwSqueezer>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val adwSqueezerPointer: CPointer<AdwSqueezer>
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
     * Whether to allow squeezing beyond the last child's minimum size.
     *
     * If set to `TRUE`, the squeezer can shrink to the point where no child can
     * be shown. This is functionally equivalent to appending a widget with 0x0
     * minimum size.
     *
     * @since 1.0
     */
    public var allowNone: Boolean
        /**
         * Gets whether to allow squeezing beyond the last child's minimum size.
         *
         * @return whether @self allows squeezing beyond the last child
         * @since 1.0
         */
        get() = adw_squeezer_get_allow_none(adwSqueezerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to allow squeezing beyond the last child's minimum size.
         *
         * @param allowNone whether @self allows squeezing beyond the last child
         * @since 1.0
         */
        set(allowNone) =
            adw_squeezer_set_allow_none(
                adwSqueezerPointer.reinterpret(),
                allowNone.asGBoolean()
            )

    /**
     * Whether all children have the same size for the opposite orientation.
     *
     * For example, if a squeezer is horizontal and is homogeneous, it will request
     * the same height for all its children. If it isn't, the squeezer may change
     * size when a different child becomes visible.
     *
     * @since 1.0
     */
    public var homogeneous: Boolean
        /**
         * Gets whether all children have the same size for the opposite orientation.
         *
         * @return whether @self is homogeneous
         * @since 1.0
         */
        get() = adw_squeezer_get_homogeneous(adwSqueezerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether all children have the same size for the opposite orientation.
         *
         * @param homogeneous whether @self is homogeneous
         * @since 1.0
         */
        set(homogeneous) =
            adw_squeezer_set_homogeneous(
                adwSqueezerPointer.reinterpret(),
                homogeneous.asGBoolean()
            )

    /**
     * Whether the squeezer interpolates its size when changing the visible child.
     *
     * If `TRUE`, the squeezer will interpolate its size between the one of the
     * previous visible child and the one of the new visible child, according to
     * the set transition duration and the orientation, e.g. if the squeezer is
     * horizontal, it will interpolate the its height.
     *
     * @since 1.0
     */
    public var interpolateSize: Boolean
        /**
         * Gets whether @self interpolates its size when changing the visible child.
         *
         * @return whether the size is interpolated
         * @since 1.0
         */
        get() = adw_squeezer_get_interpolate_size(adwSqueezerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self interpolates its size when changing the visible child.
         *
         * @param interpolateSize whether to interpolate the size
         * @since 1.0
         */
        set(interpolateSize) =
            adw_squeezer_set_interpolate_size(
                adwSqueezerPointer.reinterpret(),
                interpolateSize.asGBoolean()
            )

    /**
     * A selection model with the squeezer's pages.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track the visible page.
     *
     * @since 1.0
     */
    public val pages: SelectionModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the pages of @self.
         *
         * This can be used to keep an up-to-date view. The model also implements
         * [iface@Gtk.SelectionModel] and can be used to track the visible page.
         *
         * @return a `GtkSelectionModel` for the squeezer's children
         * @since 1.0
         */
        get() =
            adw_squeezer_get_pages(adwSqueezerPointer.reinterpret())!!.run {
                SelectionModel.wrap(reinterpret())
            }

    /**
     * Determines when the squeezer will switch children.
     *
     * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only switch when
     * the visible child cannot fit anymore. With
     * `ADW_FOLD_THRESHOLD_POLICY_NATURAL`, it will switch as soon as the visible
     * child doesn't get their natural size.
     *
     * This can be useful if you have a long ellipsizing label and want to let it
     * ellipsize instead of immediately switching.
     *
     * @since 1.0
     */
    public var switchThresholdPolicy: FoldThresholdPolicy
        /**
         * Gets the fold threshold policy for @self.
         *
         * @since 1.0
         */
        get() =
            adw_squeezer_get_switch_threshold_policy(adwSqueezerPointer.reinterpret()).run {
                FoldThresholdPolicy.fromNativeValue(this)
            }

        /**
         * Sets the fold threshold policy for @self.
         *
         * @param policy the policy to use
         * @since 1.0
         */
        set(policy) =
            adw_squeezer_set_switch_threshold_policy(
                adwSqueezerPointer.reinterpret(),
                policy.nativeValue
            )

    /**
     * The animation duration, in milliseconds.
     *
     * @since 1.0
     */
    public var transitionDuration: UInt
        /**
         * Gets the transition animation duration for @self.
         *
         * @return the transition duration, in milliseconds
         * @since 1.0
         */
        get() = adw_squeezer_get_transition_duration(adwSqueezerPointer.reinterpret())

        /**
         * Sets the transition animation duration for @self.
         *
         * @param duration the new duration, in milliseconds
         * @since 1.0
         */
        set(duration) =
            adw_squeezer_set_transition_duration(
                adwSqueezerPointer.reinterpret(),
                duration
            )

    /**
     * Whether a transition is currently running.
     *
     * If a transition is impossible, the property value will be set to `TRUE` and
     * then immediately to `FALSE`, so it's possible to rely on its notifications
     * to know that a transition has happened.
     *
     * @since 1.0
     */
    public val transitionRunning: Boolean
        /**
         * Gets whether a transition is currently running for @self.
         *
         * @return whether a transition is currently running
         * @since 1.0
         */
        get() = adw_squeezer_get_transition_running(adwSqueezerPointer.reinterpret()).asBoolean()

    /**
     * The type of animation used for transitions between children.
     *
     * @since 1.0
     */
    public var transitionType: SqueezerTransitionType
        /**
         * Gets the type of animation used for transitions between children in @self.
         *
         * @return the current transition type of @self
         * @since 1.0
         */
        get() =
            adw_squeezer_get_transition_type(adwSqueezerPointer.reinterpret()).run {
                SqueezerTransitionType.fromNativeValue(this)
            }

        /**
         * Sets the type of animation used for transitions between children in @self.
         *
         * @param transition the new transition type
         * @since 1.0
         */
        set(transition) =
            adw_squeezer_set_transition_type(
                adwSqueezerPointer.reinterpret(),
                transition.nativeValue
            )

    /**
     * The currently visible child.
     *
     * @since 1.0
     */
    public val visibleChild: Widget?
        /**
         * Gets the currently visible child of @self.
         *
         * @return the visible child
         * @since 1.0
         */
        get() =
            adw_squeezer_get_visible_child(adwSqueezerPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

    /**
     * The horizontal alignment, from 0 (start) to 1 (end).
     *
     * This affects the children allocation during transitions, when they exceed
     * the size of the squeezer.
     *
     * For example, 0.5 means the child will be centered, 0 means it will keep the
     * start side aligned and overflow the end side, and 1 means the opposite.
     *
     * @since 1.0
     */
    public var xalign: Float
        /**
         * Gets the horizontal alignment, from 0 (start) to 1 (end).
         *
         * @return the alignment value
         * @since 1.0
         */
        get() = adw_squeezer_get_xalign(adwSqueezerPointer.reinterpret())

        /**
         * Sets the horizontal alignment, from 0 (start) to 1 (end).
         *
         * @param xalign the new alignment value
         * @since 1.0
         */
        set(xalign) = adw_squeezer_set_xalign(adwSqueezerPointer.reinterpret(), xalign)

    /**
     * The vertical alignment, from 0 (top) to 1 (bottom).
     *
     * This affects the children allocation during transitions, when they exceed
     * the size of the squeezer.
     *
     * For example, 0.5 means the child will be centered, 0 means it will keep the
     * top side aligned and overflow the bottom side, and 1 means the opposite.
     *
     * @since 1.0
     */
    public var yalign: Float
        /**
         * Gets the vertical alignment, from 0 (top) to 1 (bottom).
         *
         * @return the alignment value
         * @since 1.0
         */
        get() = adw_squeezer_get_yalign(adwSqueezerPointer.reinterpret())

        /**
         * Sets the vertical alignment, from 0 (top) to 1 (bottom).
         *
         * @param yalign the new alignment value
         * @since 1.0
         */
        set(yalign) = adw_squeezer_set_yalign(adwSqueezerPointer.reinterpret(), yalign)

    /**
     * Creates a new `AdwSqueezer`.
     *
     * @return the newly created `AdwSqueezer`
     * @since 1.0
     */
    public constructor() : this(adw_squeezer_new()!!.reinterpret())

    /**
     * Adds a child to @self.
     *
     * @param child the widget to add
     * @return the [class@SqueezerPage] for @child
     * @since 1.0
     */
    public fun add(child: Widget): SqueezerPage =
        adw_squeezer_add(
            adwSqueezerPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            SqueezerPage(reinterpret())
        }

    /**
     * Gets whether to allow squeezing beyond the last child's minimum size.
     *
     * @return whether @self allows squeezing beyond the last child
     * @since 1.0
     */
    public fun getAllowNone(): Boolean = adw_squeezer_get_allow_none(adwSqueezerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether all children have the same size for the opposite orientation.
     *
     * @return whether @self is homogeneous
     * @since 1.0
     */
    public fun getHomogeneous(): Boolean = adw_squeezer_get_homogeneous(adwSqueezerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self interpolates its size when changing the visible child.
     *
     * @return whether the size is interpolated
     * @since 1.0
     */
    public fun getInterpolateSize(): Boolean =
        adw_squeezer_get_interpolate_size(adwSqueezerPointer.reinterpret()).asBoolean()

    /**
     * Returns the [class@SqueezerPage] object for @child.
     *
     * @param child a child of @self
     * @return the page object for @child
     * @since 1.0
     */
    public fun getPage(child: Widget): SqueezerPage =
        adw_squeezer_get_page(
            adwSqueezerPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            SqueezerPage(reinterpret())
        }

    /**
     * Returns a [iface@Gio.ListModel] that contains the pages of @self.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track the visible page.
     *
     * @return a `GtkSelectionModel` for the squeezer's children
     * @since 1.0
     */
    public fun getPages(): SelectionModel =
        adw_squeezer_get_pages(adwSqueezerPointer.reinterpret())!!.run {
            SelectionModel.wrap(reinterpret())
        }

    /**
     * Gets the fold threshold policy for @self.
     *
     * @since 1.0
     */
    public fun getSwitchThresholdPolicy(): FoldThresholdPolicy =
        adw_squeezer_get_switch_threshold_policy(adwSqueezerPointer.reinterpret()).run {
            FoldThresholdPolicy.fromNativeValue(this)
        }

    /**
     * Gets the transition animation duration for @self.
     *
     * @return the transition duration, in milliseconds
     * @since 1.0
     */
    public fun getTransitionDuration(): UInt = adw_squeezer_get_transition_duration(adwSqueezerPointer.reinterpret())

    /**
     * Gets whether a transition is currently running for @self.
     *
     * @return whether a transition is currently running
     * @since 1.0
     */
    public fun getTransitionRunning(): Boolean =
        adw_squeezer_get_transition_running(adwSqueezerPointer.reinterpret()).asBoolean()

    /**
     * Gets the type of animation used for transitions between children in @self.
     *
     * @return the current transition type of @self
     * @since 1.0
     */
    public fun getTransitionType(): SqueezerTransitionType =
        adw_squeezer_get_transition_type(adwSqueezerPointer.reinterpret()).run {
            SqueezerTransitionType.fromNativeValue(this)
        }

    /**
     * Gets the currently visible child of @self.
     *
     * @return the visible child
     * @since 1.0
     */
    public fun getVisibleChild(): Widget? =
        adw_squeezer_get_visible_child(adwSqueezerPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the horizontal alignment, from 0 (start) to 1 (end).
     *
     * @return the alignment value
     * @since 1.0
     */
    public fun getXalign(): Float = adw_squeezer_get_xalign(adwSqueezerPointer.reinterpret())

    /**
     * Gets the vertical alignment, from 0 (top) to 1 (bottom).
     *
     * @return the alignment value
     * @since 1.0
     */
    public fun getYalign(): Float = adw_squeezer_get_yalign(adwSqueezerPointer.reinterpret())

    /**
     * Removes a child widget from @self.
     *
     * @param child the child to remove
     * @since 1.0
     */
    public fun remove(child: Widget): Unit =
        adw_squeezer_remove(
            adwSqueezerPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Sets whether to allow squeezing beyond the last child's minimum size.
     *
     * @param allowNone whether @self allows squeezing beyond the last child
     * @since 1.0
     */
    public fun setAllowNone(allowNone: Boolean): Unit =
        adw_squeezer_set_allow_none(adwSqueezerPointer.reinterpret(), allowNone.asGBoolean())

    /**
     * Sets whether all children have the same size for the opposite orientation.
     *
     * @param homogeneous whether @self is homogeneous
     * @since 1.0
     */
    public fun setHomogeneous(homogeneous: Boolean): Unit =
        adw_squeezer_set_homogeneous(adwSqueezerPointer.reinterpret(), homogeneous.asGBoolean())

    /**
     * Sets whether @self interpolates its size when changing the visible child.
     *
     * @param interpolateSize whether to interpolate the size
     * @since 1.0
     */
    public fun setInterpolateSize(interpolateSize: Boolean): Unit =
        adw_squeezer_set_interpolate_size(
            adwSqueezerPointer.reinterpret(),
            interpolateSize.asGBoolean()
        )

    /**
     * Sets the fold threshold policy for @self.
     *
     * @param policy the policy to use
     * @since 1.0
     */
    public fun setSwitchThresholdPolicy(policy: FoldThresholdPolicy): Unit =
        adw_squeezer_set_switch_threshold_policy(
            adwSqueezerPointer.reinterpret(),
            policy.nativeValue
        )

    /**
     * Sets the transition animation duration for @self.
     *
     * @param duration the new duration, in milliseconds
     * @since 1.0
     */
    public fun setTransitionDuration(duration: UInt): Unit =
        adw_squeezer_set_transition_duration(adwSqueezerPointer.reinterpret(), duration)

    /**
     * Sets the type of animation used for transitions between children in @self.
     *
     * @param transition the new transition type
     * @since 1.0
     */
    public fun setTransitionType(transition: SqueezerTransitionType): Unit =
        adw_squeezer_set_transition_type(
            adwSqueezerPointer.reinterpret(),
            transition.nativeValue
        )

    /**
     * Sets the horizontal alignment, from 0 (start) to 1 (end).
     *
     * @param xalign the new alignment value
     * @since 1.0
     */
    public fun setXalign(xalign: Float): Unit = adw_squeezer_set_xalign(adwSqueezerPointer.reinterpret(), xalign)

    /**
     * Sets the vertical alignment, from 0 (top) to 1 (bottom).
     *
     * @param yalign the new alignment value
     * @since 1.0
     */
    public fun setYalign(yalign: Float): Unit = adw_squeezer_set_yalign(adwSqueezerPointer.reinterpret(), yalign)

    public companion object : TypeCompanion<Squeezer> {
        override val type: GeneratedClassKGType<Squeezer> =
            GeneratedClassKGType(adw_squeezer_get_type()) { Squeezer(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
