// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwLeaflet
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_leaflet_append
import org.gtkkn.native.adw.adw_leaflet_get_adjacent_child
import org.gtkkn.native.adw.adw_leaflet_get_can_navigate_back
import org.gtkkn.native.adw.adw_leaflet_get_can_navigate_forward
import org.gtkkn.native.adw.adw_leaflet_get_can_unfold
import org.gtkkn.native.adw.adw_leaflet_get_child_by_name
import org.gtkkn.native.adw.adw_leaflet_get_child_transition_params
import org.gtkkn.native.adw.adw_leaflet_get_child_transition_running
import org.gtkkn.native.adw.adw_leaflet_get_fold_threshold_policy
import org.gtkkn.native.adw.adw_leaflet_get_folded
import org.gtkkn.native.adw.adw_leaflet_get_homogeneous
import org.gtkkn.native.adw.adw_leaflet_get_mode_transition_duration
import org.gtkkn.native.adw.adw_leaflet_get_page
import org.gtkkn.native.adw.adw_leaflet_get_pages
import org.gtkkn.native.adw.adw_leaflet_get_transition_type
import org.gtkkn.native.adw.adw_leaflet_get_type
import org.gtkkn.native.adw.adw_leaflet_get_visible_child
import org.gtkkn.native.adw.adw_leaflet_get_visible_child_name
import org.gtkkn.native.adw.adw_leaflet_insert_child_after
import org.gtkkn.native.adw.adw_leaflet_navigate
import org.gtkkn.native.adw.adw_leaflet_new
import org.gtkkn.native.adw.adw_leaflet_prepend
import org.gtkkn.native.adw.adw_leaflet_remove
import org.gtkkn.native.adw.adw_leaflet_reorder_child_after
import org.gtkkn.native.adw.adw_leaflet_set_can_navigate_back
import org.gtkkn.native.adw.adw_leaflet_set_can_navigate_forward
import org.gtkkn.native.adw.adw_leaflet_set_can_unfold
import org.gtkkn.native.adw.adw_leaflet_set_child_transition_params
import org.gtkkn.native.adw.adw_leaflet_set_fold_threshold_policy
import org.gtkkn.native.adw.adw_leaflet_set_homogeneous
import org.gtkkn.native.adw.adw_leaflet_set_mode_transition_duration
import org.gtkkn.native.adw.adw_leaflet_set_transition_type
import org.gtkkn.native.adw.adw_leaflet_set_visible_child
import org.gtkkn.native.adw.adw_leaflet_set_visible_child_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * An adaptive container acting like a box or a stack.
 *
 * <picture>
 *   <source srcset="leaflet-wide-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="leaflet-wide.png" alt="leaflet-wide">
 * </picture>
 * <picture>
 *   <source srcset="leaflet-narrow-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="leaflet-narrow.png" alt="leaflet-narrow">
 * </picture>
 *
 * The `AdwLeaflet` widget can display its children like a [class@Gtk.Box] does
 * or like a [class@Gtk.Stack] does, adapting to size changes by switching
 * between the two modes.
 *
 * When there is enough space the children are displayed side by side, otherwise
 * only one is displayed and the leaflet is said to be “folded”.
 * The threshold is dictated by the preferred minimum sizes of the children.
 * When a leaflet is folded, the children can be navigated using swipe gestures.
 *
 * The “over” and “under” transition types stack the children one on top of the
 * other, while the “slide” transition puts the children side by side. While
 * navigating to a child on the side or below can be performed by swiping the
 * current child away, navigating to an upper child requires dragging it from
 * the edge where it resides. This doesn't affect non-dragging swipes.
 *
 * ## CSS nodes
 *
 * `AdwLeaflet` has a single CSS node with name `leaflet`. The node will get the
 * style classes `.folded` when it is folded, `.unfolded` when it's not, or none
 * if it hasn't computed its fold yet.
 *
 * ## Skipped during bindings generation
 *
 * - method `visible-child`: Property TypeInfo of getter and setter do not match
 * - method `visible-child-name`: Property TypeInfo of getter and setter do not match
 *
 * @since 1.0
 */
public class Leaflet(
    pointer: CPointer<AdwLeaflet>,
) : Widget(pointer.reinterpret()), Swipeable, Orientable, KGTyped {
    public val adwLeafletPointer: CPointer<AdwLeaflet>
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
     * Whether gestures and shortcuts for navigating backward are enabled.
     *
     * The supported gestures are:
     *
     * - One-finger swipe on touchscreens
     * - Horizontal scrolling on touchpads (usually two-finger swipe)
     * - Back/forward mouse buttons
     *
     * The keyboard back/forward keys are also supported, as well as the
     * <kbd>Alt</kbd>+<kbd>←</kbd> shortcut for horizontal orientation, or
     * <kbd>Alt</kbd>+<kbd>↑</kbd> for vertical orientation.
     *
     * If the orientation is horizontal, for right-to-left locales, gestures and
     * shortcuts are reversed.
     *
     * Only children that have [property@LeafletPage:navigatable] set to `TRUE`
     * can be navigated to.
     *
     * @since 1.0
     */
    public var canNavigateBack: Boolean
        /**
         * Gets whether gestures and shortcuts for navigating backward are enabled.
         *
         * @return Whether gestures and shortcuts are enabled.
         * @since 1.0
         */
        get() = adw_leaflet_get_can_navigate_back(adwLeafletPointer.reinterpret()).asBoolean()

        /**
         * Sets whether gestures and shortcuts for navigating backward are enabled.
         *
         * @param canNavigateBack the new value
         * @since 1.0
         */
        set(canNavigateBack) =
            adw_leaflet_set_can_navigate_back(
                adwLeafletPointer.reinterpret(),
                canNavigateBack.asGBoolean()
            )

    /**
     * Whether gestures and shortcuts for navigating forward are enabled.
     *
     * The supported gestures are:
     *
     * - One-finger swipe on touchscreens
     * - Horizontal scrolling on touchpads (usually two-finger swipe)
     * - Back/forward mouse buttons
     *
     * The keyboard back/forward keys are also supported, as well as the
     * <kbd>Alt</kbd>+<kbd>→</kbd> shortcut for horizontal orientation, or
     * <kbd>Alt</kbd>+<kbd>↓</kbd> for vertical orientation.
     *
     * If the orientation is horizontal, for right-to-left locales, gestures and
     * shortcuts are reversed.
     *
     * Only children that have [property@LeafletPage:navigatable] set to `TRUE`
     * can be navigated to.
     *
     * @since 1.0
     */
    public var canNavigateForward: Boolean
        /**
         * Gets whether gestures and shortcuts for navigating forward are enabled.
         *
         * @return Whether gestures and shortcuts are enabled.
         * @since 1.0
         */
        get() = adw_leaflet_get_can_navigate_forward(adwLeafletPointer.reinterpret()).asBoolean()

        /**
         * Sets whether gestures and shortcuts for navigating forward are enabled.
         *
         * @param canNavigateForward the new value
         * @since 1.0
         */
        set(canNavigateForward) =
            adw_leaflet_set_can_navigate_forward(
                adwLeafletPointer.reinterpret(),
                canNavigateForward.asGBoolean()
            )

    /**
     * Whether or not the leaflet can unfold.
     *
     * @since 1.0
     */
    public var canUnfold: Boolean
        /**
         * Gets whether @self can unfold.
         *
         * @return whether @self can unfold
         * @since 1.0
         */
        get() = adw_leaflet_get_can_unfold(adwLeafletPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can unfold.
         *
         * @param canUnfold whether @self can unfold
         * @since 1.0
         */
        set(canUnfold) =
            adw_leaflet_set_can_unfold(
                adwLeafletPointer.reinterpret(),
                canUnfold.asGBoolean()
            )

    /**
     * The child transition spring parameters.
     *
     * The default value is equivalent to:
     *
     * ```c
     * adw_spring_params_new (1, 0.5, 500)
     * ```
     *
     * @since 1.0
     */
    public var childTransitionParams: SpringParams
        /**
         * Gets the child transition spring parameters for @self.
         *
         * @return the child transition parameters
         * @since 1.0
         */
        get() =
            adw_leaflet_get_child_transition_params(adwLeafletPointer.reinterpret())!!.run {
                SpringParams(reinterpret())
            }

        /**
         * Sets the child transition spring parameters for @self.
         *
         * @param params the new parameters
         * @since 1.0
         */
        set(params) =
            adw_leaflet_set_child_transition_params(
                adwLeafletPointer.reinterpret(),
                params.adwSpringParamsPointer
            )

    /**
     * Whether a child transition is currently running.
     *
     * @since 1.0
     */
    public val childTransitionRunning: Boolean
        /**
         * Gets whether a child transition is currently running for @self.
         *
         * @return whether a transition is currently running
         * @since 1.0
         */
        get() =
            adw_leaflet_get_child_transition_running(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Determines when the leaflet will fold.
     *
     * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only fold when
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
            adw_leaflet_get_fold_threshold_policy(adwLeafletPointer.reinterpret()).run {
                FoldThresholdPolicy.fromNativeValue(this)
            }

        /**
         * Sets the fold threshold policy for @self.
         *
         * @param policy the policy to use
         * @since 1.0
         */
        set(policy) =
            adw_leaflet_set_fold_threshold_policy(
                adwLeafletPointer.reinterpret(),
                policy.nativeValue
            )

    /**
     * Whether the leaflet is folded.
     *
     * The leaflet will be folded if the size allocated to it is smaller than the
     * sum of the fold threshold policy, it will be unfolded otherwise.
     *
     * @since 1.0
     */
    public val folded: Boolean
        /**
         * Gets whether @self is folded.
         *
         * @return whether @self is folded.
         * @since 1.0
         */
        get() = adw_leaflet_get_folded(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Whether the leaflet allocates the same size for all children when folded.
     *
     * If set to `FALSE`, different children can have different size along the
     * opposite orientation.
     *
     * @since 1.0
     */
    public var homogeneous: Boolean
        /**
         * Gets whether @self is homogeneous.
         *
         * @return whether @self is homogeneous
         * @since 1.0
         */
        get() = adw_leaflet_get_homogeneous(adwLeafletPointer.reinterpret()).asBoolean()

        /**
         * Sets @self to be homogeneous or not.
         *
         * If set to `FALSE`, different children can have different size along the
         * opposite orientation.
         *
         * @param homogeneous whether to make @self homogeneous
         * @since 1.0
         */
        set(homogeneous) =
            adw_leaflet_set_homogeneous(
                adwLeafletPointer.reinterpret(),
                homogeneous.asGBoolean()
            )

    /**
     * The mode transition animation duration, in milliseconds.
     *
     * @since 1.0
     */
    public var modeTransitionDuration: UInt
        /**
         * Gets the mode transition animation duration for @self.
         *
         * @return the mode transition duration, in milliseconds.
         * @since 1.0
         */
        get() = adw_leaflet_get_mode_transition_duration(adwLeafletPointer.reinterpret())

        /**
         * Sets the mode transition animation duration for @self.
         *
         * @param duration the new duration, in milliseconds
         * @since 1.0
         */
        set(duration) =
            adw_leaflet_set_mode_transition_duration(
                adwLeafletPointer.reinterpret(),
                duration
            )

    /**
     * A selection model with the leaflet's pages.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track and change the visible
     * page.
     *
     * @since 1.0
     */
    public val pages: SelectionModel
        /**
         * Returns a [iface@Gio.ListModel] that contains the pages of the leaflet.
         *
         * This can be used to keep an up-to-date view. The model also implements
         * [iface@Gtk.SelectionModel] and can be used to track and change the visible
         * page.
         *
         * @return a `GtkSelectionModel` for the leaflet's children
         * @since 1.0
         */
        get() =
            adw_leaflet_get_pages(adwLeafletPointer.reinterpret())!!.run {
                SelectionModel.wrap(reinterpret())
            }

    /**
     * The type of animation used for transitions between modes and children.
     *
     * The transition type can be changed without problems at runtime, so it is
     * possible to change the animation based on the mode or child that is about
     * to become current.
     *
     * @since 1.0
     */
    public var transitionType: LeafletTransitionType
        /**
         * Gets the type of animation used for transitions between modes and children.
         *
         * @return the current transition type of @self
         * @since 1.0
         */
        get() =
            adw_leaflet_get_transition_type(adwLeafletPointer.reinterpret()).run {
                LeafletTransitionType.fromNativeValue(this)
            }

        /**
         * Sets the type of animation used for transitions between modes and children.
         *
         * @param transition the new transition type
         * @since 1.0
         */
        set(transition) =
            adw_leaflet_set_transition_type(
                adwLeafletPointer.reinterpret(),
                transition.nativeValue
            )

    /**
     * Creates a new `AdwLeaflet`.
     *
     * @return the new created `AdwLeaflet`
     * @since 1.0
     */
    public constructor() : this(adw_leaflet_new()!!.reinterpret())

    /**
     * Adds a child to @self.
     *
     * @param child the widget to add
     * @return the [class@LeafletPage] for @child
     * @since 1.0
     */
    public fun append(child: Widget): LeafletPage =
        adw_leaflet_append(
            adwLeafletPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            LeafletPage(reinterpret())
        }

    /**
     * Finds the previous or next navigatable child.
     *
     * This will be the same child [method@Leaflet.navigate] or swipe gestures will
     * navigate to.
     *
     * If there's no child to navigate to, `NULL` will be returned instead.
     *
     * See [property@LeafletPage:navigatable].
     *
     * @param direction the direction
     * @return the previous or next child
     * @since 1.0
     */
    public fun getAdjacentChild(direction: NavigationDirection): Widget? =
        adw_leaflet_get_adjacent_child(
            adwLeafletPointer.reinterpret(),
            direction.nativeValue
        )?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether gestures and shortcuts for navigating backward are enabled.
     *
     * @return Whether gestures and shortcuts are enabled.
     * @since 1.0
     */
    public fun getCanNavigateBack(): Boolean =
        adw_leaflet_get_can_navigate_back(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Gets whether gestures and shortcuts for navigating forward are enabled.
     *
     * @return Whether gestures and shortcuts are enabled.
     * @since 1.0
     */
    public fun getCanNavigateForward(): Boolean =
        adw_leaflet_get_can_navigate_forward(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self can unfold.
     *
     * @return whether @self can unfold
     * @since 1.0
     */
    public fun getCanUnfold(): Boolean = adw_leaflet_get_can_unfold(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Finds the child of @self with @name.
     *
     * Returns `NULL` if there is no child with this name.
     *
     * See [property@LeafletPage:name].
     *
     * @param name the name of the child to find
     * @return the requested child of @self
     * @since 1.0
     */
    public fun getChildByName(name: String): Widget? =
        adw_leaflet_get_child_by_name(adwLeafletPointer.reinterpret(), name)?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the child transition spring parameters for @self.
     *
     * @return the child transition parameters
     * @since 1.0
     */
    public fun getChildTransitionParams(): SpringParams =
        adw_leaflet_get_child_transition_params(adwLeafletPointer.reinterpret())!!.run {
            SpringParams(reinterpret())
        }

    /**
     * Gets whether a child transition is currently running for @self.
     *
     * @return whether a transition is currently running
     * @since 1.0
     */
    public fun getChildTransitionRunning(): Boolean =
        adw_leaflet_get_child_transition_running(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Gets the fold threshold policy for @self.
     *
     * @since 1.0
     */
    public fun getFoldThresholdPolicy(): FoldThresholdPolicy =
        adw_leaflet_get_fold_threshold_policy(adwLeafletPointer.reinterpret()).run {
            FoldThresholdPolicy.fromNativeValue(this)
        }

    /**
     * Gets whether @self is folded.
     *
     * @return whether @self is folded.
     * @since 1.0
     */
    public fun getFolded(): Boolean = adw_leaflet_get_folded(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is homogeneous.
     *
     * @return whether @self is homogeneous
     * @since 1.0
     */
    public fun getHomogeneous(): Boolean = adw_leaflet_get_homogeneous(adwLeafletPointer.reinterpret()).asBoolean()

    /**
     * Gets the mode transition animation duration for @self.
     *
     * @return the mode transition duration, in milliseconds.
     * @since 1.0
     */
    public fun getModeTransitionDuration(): UInt =
        adw_leaflet_get_mode_transition_duration(adwLeafletPointer.reinterpret())

    /**
     * Returns the [class@LeafletPage] object for @child.
     *
     * @param child a child of @self
     * @return the page object for @child
     * @since 1.0
     */
    public fun getPage(child: Widget): LeafletPage =
        adw_leaflet_get_page(
            adwLeafletPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            LeafletPage(reinterpret())
        }

    /**
     * Returns a [iface@Gio.ListModel] that contains the pages of the leaflet.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track and change the visible
     * page.
     *
     * @return a `GtkSelectionModel` for the leaflet's children
     * @since 1.0
     */
    public fun getPages(): SelectionModel =
        adw_leaflet_get_pages(adwLeafletPointer.reinterpret())!!.run {
            SelectionModel.wrap(reinterpret())
        }

    /**
     * Gets the type of animation used for transitions between modes and children.
     *
     * @return the current transition type of @self
     * @since 1.0
     */
    public fun getTransitionType(): LeafletTransitionType =
        adw_leaflet_get_transition_type(adwLeafletPointer.reinterpret()).run {
            LeafletTransitionType.fromNativeValue(this)
        }

    /**
     * Gets the widget currently visible when the leaflet is folded.
     *
     * @return the visible child
     * @since 1.0
     */
    public fun getVisibleChild(): Widget? =
        adw_leaflet_get_visible_child(adwLeafletPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the name of the currently visible child widget.
     *
     * @return the name of the visible child
     * @since 1.0
     */
    public fun getVisibleChildName(): String? =
        adw_leaflet_get_visible_child_name(adwLeafletPointer.reinterpret())?.toKString()

    /**
     * Inserts @child in the position after @sibling in the list of children.
     *
     * If @sibling is `NULL`, inserts @child at the first position.
     *
     * @param child the widget to insert
     * @param sibling the sibling after which to insert @child
     * @return the [class@LeafletPage] for @child
     * @since 1.0
     */
    public fun insertChildAfter(
        child: Widget,
        sibling: Widget? = null,
    ): LeafletPage =
        adw_leaflet_insert_child_after(
            adwLeafletPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            sibling?.gtkWidgetPointer?.reinterpret()
        )!!.run {
            LeafletPage(reinterpret())
        }

    /**
     * Navigates to the previous or next child.
     *
     * The child must have the [property@LeafletPage:navigatable] property set to
     * `TRUE`, otherwise it will be skipped.
     *
     * This will be the same child as returned by
     * [method@Leaflet.get_adjacent_child] or navigated to via swipe gestures.
     *
     * @param direction the direction
     * @return whether the visible child was changed
     * @since 1.0
     */
    public fun navigate(direction: NavigationDirection): Boolean =
        adw_leaflet_navigate(adwLeafletPointer.reinterpret(), direction.nativeValue).asBoolean()

    /**
     * Inserts @child at the first position in @self.
     *
     * @param child the widget to prepend
     * @return the [class@LeafletPage] for @child
     * @since 1.0
     */
    public fun prepend(child: Widget): LeafletPage =
        adw_leaflet_prepend(
            adwLeafletPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )!!.run {
            LeafletPage(reinterpret())
        }

    /**
     * Removes a child widget from @self.
     *
     * @param child the child to remove
     * @since 1.0
     */
    public fun remove(child: Widget): Unit =
        adw_leaflet_remove(
            adwLeafletPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Moves @child to the position after @sibling in the list of children.
     *
     * If @sibling is `NULL`, moves @child to the first position.
     *
     * @param child the widget to move, must be a child of @self
     * @param sibling the sibling to move @child after
     * @since 1.0
     */
    public fun reorderChildAfter(
        child: Widget,
        sibling: Widget? = null,
    ): Unit =
        adw_leaflet_reorder_child_after(
            adwLeafletPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            sibling?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets whether gestures and shortcuts for navigating backward are enabled.
     *
     * @param canNavigateBack the new value
     * @since 1.0
     */
    public fun setCanNavigateBack(canNavigateBack: Boolean): Unit =
        adw_leaflet_set_can_navigate_back(
            adwLeafletPointer.reinterpret(),
            canNavigateBack.asGBoolean()
        )

    /**
     * Sets whether gestures and shortcuts for navigating forward are enabled.
     *
     * @param canNavigateForward the new value
     * @since 1.0
     */
    public fun setCanNavigateForward(canNavigateForward: Boolean): Unit =
        adw_leaflet_set_can_navigate_forward(
            adwLeafletPointer.reinterpret(),
            canNavigateForward.asGBoolean()
        )

    /**
     * Sets whether @self can unfold.
     *
     * @param canUnfold whether @self can unfold
     * @since 1.0
     */
    public fun setCanUnfold(canUnfold: Boolean): Unit =
        adw_leaflet_set_can_unfold(adwLeafletPointer.reinterpret(), canUnfold.asGBoolean())

    /**
     * Sets the child transition spring parameters for @self.
     *
     * @param params the new parameters
     * @since 1.0
     */
    public fun setChildTransitionParams(params: SpringParams): Unit =
        adw_leaflet_set_child_transition_params(
            adwLeafletPointer.reinterpret(),
            params.adwSpringParamsPointer
        )

    /**
     * Sets the fold threshold policy for @self.
     *
     * @param policy the policy to use
     * @since 1.0
     */
    public fun setFoldThresholdPolicy(policy: FoldThresholdPolicy): Unit =
        adw_leaflet_set_fold_threshold_policy(
            adwLeafletPointer.reinterpret(),
            policy.nativeValue
        )

    /**
     * Sets @self to be homogeneous or not.
     *
     * If set to `FALSE`, different children can have different size along the
     * opposite orientation.
     *
     * @param homogeneous whether to make @self homogeneous
     * @since 1.0
     */
    public fun setHomogeneous(homogeneous: Boolean): Unit =
        adw_leaflet_set_homogeneous(adwLeafletPointer.reinterpret(), homogeneous.asGBoolean())

    /**
     * Sets the mode transition animation duration for @self.
     *
     * @param duration the new duration, in milliseconds
     * @since 1.0
     */
    public fun setModeTransitionDuration(duration: UInt): Unit =
        adw_leaflet_set_mode_transition_duration(adwLeafletPointer.reinterpret(), duration)

    /**
     * Sets the type of animation used for transitions between modes and children.
     *
     * @param transition the new transition type
     * @since 1.0
     */
    public fun setTransitionType(transition: LeafletTransitionType): Unit =
        adw_leaflet_set_transition_type(adwLeafletPointer.reinterpret(), transition.nativeValue)

    /**
     * Sets the widget currently visible when the leaflet is folded.
     *
     * @param visibleChild the new child
     * @since 1.0
     */
    public fun setVisibleChild(visibleChild: Widget): Unit =
        adw_leaflet_set_visible_child(
            adwLeafletPointer.reinterpret(),
            visibleChild.gtkWidgetPointer.reinterpret()
        )

    /**
     * Makes the child with the name @name visible.
     *
     * See adw_leaflet_set_visible_child() for more details.
     *
     * @param name the name of a child
     * @since 1.0
     */
    public fun setVisibleChildName(name: String): Unit =
        adw_leaflet_set_visible_child_name(adwLeafletPointer.reinterpret(), name)

    public companion object : TypeCompanion<Leaflet> {
        override val type: GeneratedClassKGType<Leaflet> =
            GeneratedClassKGType(adw_leaflet_get_type()) { Leaflet(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
