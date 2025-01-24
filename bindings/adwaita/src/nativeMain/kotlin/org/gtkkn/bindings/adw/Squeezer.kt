// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
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
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
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
 */
public class Squeezer(public val adwSqueezerPointer: CPointer<AdwSqueezer>) :
    Widget(adwSqueezerPointer.reinterpret()),
    Orientable,
    KGTyped {
    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether to allow squeezing beyond the last child's minimum size.
     *
     * If set to `TRUE`, the squeezer can shrink to the point where no child can
     * be shown. This is functionally equivalent to appending a widget with 0×0
     * minimum size.
     */
    public var allowNone: Boolean
        /**
         * Gets whether to allow squeezing beyond the last child's minimum size.
         *
         * @return whether @self allows squeezing beyond the last child
         */
        get() = adw_squeezer_get_allow_none(adwSqueezerPointer).asBoolean()

        /**
         * Sets whether to allow squeezing beyond the last child's minimum size.
         *
         * If set to `TRUE`, the squeezer can shrink to the point where no child can be
         * shown. This is functionally equivalent to appending a widget with 0×0 minimum
         * size.
         *
         * @param allowNone whether @self allows squeezing beyond the last child
         */
        set(allowNone) = adw_squeezer_set_allow_none(adwSqueezerPointer, allowNone.asGBoolean())

    /**
     * Whether all children have the same size for the opposite orientation.
     *
     * For example, if a squeezer is horizontal and is homogeneous, it will
     * request the same height for all its children. If it isn't, the squeezer may
     * change size when a different child becomes visible.
     */
    public var homogeneous: Boolean
        /**
         * Gets whether all children have the same size for the opposite orientation.
         *
         * @return whether @self is homogeneous
         */
        get() = adw_squeezer_get_homogeneous(adwSqueezerPointer).asBoolean()

        /**
         * Sets whether all children have the same size for the opposite orientation.
         *
         * For example, if a squeezer is horizontal and is homogeneous, it will request
         * the same height for all its children. If it isn't, the squeezer may change
         * size when a different child becomes visible.
         *
         * @param homogeneous whether @self is homogeneous
         */
        set(homogeneous) = adw_squeezer_set_homogeneous(adwSqueezerPointer, homogeneous.asGBoolean())

    /**
     * Whether the squeezer interpolates its size when changing the visible child.
     *
     * If `TRUE`, the squeezer will interpolate its size between the one of the
     * previous visible child and the one of the new visible child, according to
     * the set transition duration and the orientation, e.g. if the squeezer is
     * horizontal, it will interpolate the its height.
     */
    public var interpolateSize: Boolean
        /**
         * Gets whether @self interpolates its size when changing the visible child.
         *
         * @return whether the size is interpolated
         */
        get() = adw_squeezer_get_interpolate_size(adwSqueezerPointer).asBoolean()

        /**
         * Sets whether @self interpolates its size when changing the visible child.
         *
         * If `TRUE`, the squeezer will interpolate its size between the one of the
         * previous visible child and the one of the new visible child, according to the
         * set transition duration and the orientation, e.g. if the squeezer is
         * horizontal, it will interpolate the its height.
         *
         * @param interpolateSize whether to interpolate the size
         */
        set(interpolateSize) = adw_squeezer_set_interpolate_size(adwSqueezerPointer, interpolateSize.asGBoolean())

    /**
     * A selection model with the squeezer's pages.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track the visible page.
     */
    public val pages: SelectionModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the pages of @self.
         *
         * This can be used to keep an up-to-date view. The model also implements
         * [iface@Gtk.SelectionModel] and can be used to track the visible page.
         *
         * @return a `GtkSelectionModel` for the squeezer's children
         */
        get() = adw_squeezer_get_pages(adwSqueezerPointer)!!.run {
            SelectionModel.SelectionModelImpl(reinterpret())
        }

    /**
     * The switch threshold policy.
     *
     * Determines when the squeezer will switch children.
     *
     * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only switch when the
     * visible child cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`,
     * it will switch as soon as the visible child doesn't get their natural size.
     *
     * This can be useful if you have a long ellipsizing label and want to let it
     * ellipsize instead of immediately switching.
     */
    public var switchThresholdPolicy: FoldThresholdPolicy
        /**
         * Gets the switch threshold policy for @self.
         */
        get() = adw_squeezer_get_switch_threshold_policy(adwSqueezerPointer).run {
            FoldThresholdPolicy.fromNativeValue(this)
        }

        /**
         * Sets the switch threshold policy for @self.
         *
         * Determines when the squeezer will switch children.
         *
         * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only switch when the
         * visible child cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`,
         * it will switch as soon as the visible child doesn't get their natural size.
         *
         * This can be useful if you have a long ellipsizing label and want to let it
         * ellipsize instead of immediately switching.
         *
         * @param policy the policy to use
         */
        set(policy) = adw_squeezer_set_switch_threshold_policy(adwSqueezerPointer, policy.nativeValue)

    /**
     * The transition animation duration, in milliseconds.
     */
    public var transitionDuration: guint
        /**
         * Gets the transition animation duration for @self.
         *
         * @return the transition duration, in milliseconds
         */
        get() = adw_squeezer_get_transition_duration(adwSqueezerPointer)

        /**
         * Sets the transition animation duration for @self.
         *
         * @param duration the new duration, in milliseconds
         */
        set(duration) = adw_squeezer_set_transition_duration(adwSqueezerPointer, duration)

    /**
     * Whether a transition is currently running.
     *
     * If a transition is impossible, the property value will be set to `TRUE` and
     * then immediately to `FALSE`, so it's possible to rely on its notifications
     * to know that a transition has happened.
     */
    public val transitionRunning: Boolean
        /**
         * Gets whether a transition is currently running for @self.
         *
         * If a transition is impossible, the property value will be set to `TRUE` and
         * then immediately to `FALSE`, so it's possible to rely on its notifications
         * to know that a transition has happened.
         *
         * @return whether a transition is currently running
         */
        get() = adw_squeezer_get_transition_running(adwSqueezerPointer).asBoolean()

    /**
     * The type of animation used for transitions between children.
     */
    public var transitionType: SqueezerTransitionType
        /**
         * Gets the type of animation used for transitions between children in @self.
         *
         * @return the current transition type of @self
         */
        get() = adw_squeezer_get_transition_type(adwSqueezerPointer).run {
            SqueezerTransitionType.fromNativeValue(this)
        }

        /**
         * Sets the type of animation used for transitions between children in @self.
         *
         * @param transition the new transition type
         */
        set(transition) = adw_squeezer_set_transition_type(adwSqueezerPointer, transition.nativeValue)

    /**
     * The currently visible child.
     */
    public val visibleChild: Widget?
        /**
         * Gets the currently visible child of @self.
         *
         * @return the visible child
         */
        get() = adw_squeezer_get_visible_child(adwSqueezerPointer)?.run {
            Widget.WidgetImpl(this)
        }

    /**
     * The horizontal alignment, from 0 (start) to 1 (end).
     *
     * This affects the children allocation during transitions, when they exceed
     * the size of the squeezer.
     *
     * For example, 0.5 means the child will be centered, 0 means it will keep the
     * start side aligned and overflow the end side, and 1 means the opposite.
     */
    public var xalign: gfloat
        /**
         * Gets the horizontal alignment, from 0 (start) to 1 (end).
         *
         * @return the alignment value
         */
        get() = adw_squeezer_get_xalign(adwSqueezerPointer)

        /**
         * Sets the horizontal alignment, from 0 (start) to 1 (end).
         *
         * This affects the children allocation during transitions, when they exceed the
         * size of the squeezer.
         *
         * For example, 0.5 means the child will be centered, 0 means it will keep the
         * start side aligned and overflow the end side, and 1 means the opposite.
         *
         * @param xalign the new alignment value
         */
        set(xalign) = adw_squeezer_set_xalign(adwSqueezerPointer, xalign)

    /**
     * The vertical alignment, from 0 (top) to 1 (bottom).
     *
     * This affects the children allocation during transitions, when they exceed
     * the size of the squeezer.
     *
     * For example, 0.5 means the child will be centered, 0 means it will keep the
     * top side aligned and overflow the bottom side, and 1 means the opposite.
     */
    public var yalign: gfloat
        /**
         * Gets the vertical alignment, from 0 (top) to 1 (bottom).
         *
         * @return the alignment value
         */
        get() = adw_squeezer_get_yalign(adwSqueezerPointer)

        /**
         * Sets the vertical alignment, from 0 (top) to 1 (bottom).
         *
         * This affects the children allocation during transitions, when they exceed the
         * size of the squeezer.
         *
         * For example, 0.5 means the child will be centered, 0 means it will keep the
         * top side aligned and overflow the bottom side, and 1 means the opposite.
         *
         * @param yalign the new alignment value
         */
        set(yalign) = adw_squeezer_set_yalign(adwSqueezerPointer, yalign)

    /**
     * Creates a new `AdwSqueezer`.
     *
     * @return the newly created `AdwSqueezer`
     */
    public constructor() : this(adw_squeezer_new()!!.reinterpret())

    /**
     * Adds a child to @self.
     *
     * @param child the widget to add
     * @return the [class@SqueezerPage] for @child
     */
    public fun add(child: Widget): SqueezerPage = adw_squeezer_add(adwSqueezerPointer, child.gtkWidgetPointer)!!.run {
        SqueezerPage(this)
    }

    /**
     * Returns the [class@SqueezerPage] object for @child.
     *
     * @param child a child of @self
     * @return the page object for @child
     */
    public fun getPage(child: Widget): SqueezerPage =
        adw_squeezer_get_page(adwSqueezerPointer, child.gtkWidgetPointer)!!.run {
            SqueezerPage(this)
        }

    /**
     * Removes a child widget from @self.
     *
     * @param child the child to remove
     */
    public fun remove(child: Widget): Unit = adw_squeezer_remove(adwSqueezerPointer, child.gtkWidgetPointer)

    public companion object : TypeCompanion<Squeezer> {
        override val type: GeneratedClassKGType<Squeezer> =
            GeneratedClassKGType(adw_squeezer_get_type()) { Squeezer(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Squeezer
         *
         * @return the GType
         */
        public fun getType(): GType = adw_squeezer_get_type()
    }
}
