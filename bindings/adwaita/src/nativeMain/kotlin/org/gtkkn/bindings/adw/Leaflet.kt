// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.SelectionModel
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
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
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.String
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
 */
public class Leaflet(pointer: CPointer<AdwLeaflet>) :
    Widget(pointer.reinterpret()),
    Swipeable,
    Orientable,
    KGTyped {
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
     */
    public var canNavigateBack: Boolean
        /**
         * Gets whether gestures and shortcuts for navigating backward are enabled.
         *
         * @return Whether gestures and shortcuts are enabled.
         */
        get() = adw_leaflet_get_can_navigate_back(adwLeafletPointer).asBoolean()

        /**
         * Sets whether gestures and shortcuts for navigating backward are enabled.
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
         * Only children that have [property@LeafletPage:navigatable] set to `TRUE` can
         * be navigated to.
         *
         * @param canNavigateBack the new value
         */
        set(canNavigateBack) = adw_leaflet_set_can_navigate_back(adwLeafletPointer, canNavigateBack.asGBoolean())

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
     */
    public var canNavigateForward: Boolean
        /**
         * Gets whether gestures and shortcuts for navigating forward are enabled.
         *
         * @return Whether gestures and shortcuts are enabled.
         */
        get() = adw_leaflet_get_can_navigate_forward(adwLeafletPointer).asBoolean()

        /**
         * Sets whether gestures and shortcuts for navigating forward are enabled.
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
         * Only children that have [property@LeafletPage:navigatable] set to `TRUE` can
         * be navigated to.
         *
         * @param canNavigateForward the new value
         */
        set(
            canNavigateForward
        ) = adw_leaflet_set_can_navigate_forward(adwLeafletPointer, canNavigateForward.asGBoolean())

    /**
     * Whether or not the leaflet can unfold.
     */
    public var canUnfold: Boolean
        /**
         * Gets whether @self can unfold.
         *
         * @return whether @self can unfold
         */
        get() = adw_leaflet_get_can_unfold(adwLeafletPointer).asBoolean()

        /**
         * Sets whether @self can unfold.
         *
         * @param canUnfold whether @self can unfold
         */
        set(canUnfold) = adw_leaflet_set_can_unfold(adwLeafletPointer, canUnfold.asGBoolean())

    /**
     * The child transition spring parameters.
     *
     * The default value is equivalent to:
     *
     * ```c
     * adw_spring_params_new (1, 0.5, 500)
     * ```
     */
    public var childTransitionParams: SpringParams
        /**
         * Gets the child transition spring parameters for @self.
         *
         * @return the child transition parameters
         */
        get() = adw_leaflet_get_child_transition_params(adwLeafletPointer)!!.run {
            SpringParams(this)
        }

        /**
         * Sets the child transition spring parameters for @self.
         *
         * The default value is equivalent to:
         *
         * ```c
         * adw_spring_params_new (1, 0.5, 500)
         * ```
         *
         * @param params the new parameters
         */
        set(params) = adw_leaflet_set_child_transition_params(adwLeafletPointer, params.gPointer)

    /**
     * Whether a child transition is currently running.
     */
    public val childTransitionRunning: Boolean
        /**
         * Gets whether a child transition is currently running for @self.
         *
         * @return whether a transition is currently running
         */
        get() = adw_leaflet_get_child_transition_running(adwLeafletPointer).asBoolean()

    /**
     * Determines when the leaflet will fold.
     *
     * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only fold when the
     * children cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`, it
     * will fold as soon as children don't get their natural size.
     *
     * This can be useful if you have a long ellipsizing label and want to let it
     * ellipsize instead of immediately folding.
     */
    public var foldThresholdPolicy: FoldThresholdPolicy
        /**
         * Gets the fold threshold policy for @self.
         */
        get() = adw_leaflet_get_fold_threshold_policy(adwLeafletPointer).run {
            FoldThresholdPolicy.fromNativeValue(this)
        }

        /**
         * Sets the fold threshold policy for @self.
         *
         * If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, it will only fold when the
         * children cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`, it
         * will fold as soon as children don't get their natural size.
         *
         * This can be useful if you have a long ellipsizing label and want to let it
         * ellipsize instead of immediately folding.
         *
         * @param policy the policy to use
         */
        set(policy) = adw_leaflet_set_fold_threshold_policy(adwLeafletPointer, policy.nativeValue)

    /**
     * Whether the leaflet is folded.
     *
     * The leaflet will be folded if the size allocated to it is smaller than the
     * sum of the minimum or natural sizes of the children (see
     * [property@Leaflet:fold-threshold-policy]), it will be unfolded otherwise.
     */
    public val folded: Boolean
        /**
         * Gets whether @self is folded.
         *
         * The leaflet will be folded if the size allocated to it is smaller than the
         * sum of the minimum or natural sizes of the children (see
         * [property@Leaflet:fold-threshold-policy]), it will be unfolded otherwise.
         *
         * @return whether @self is folded.
         */
        get() = adw_leaflet_get_folded(adwLeafletPointer).asBoolean()

    /**
     * Whether the leaflet allocates the same size for all children when folded.
     *
     * If set to `FALSE`, different children can have different size along the
     * opposite orientation.
     */
    public var homogeneous: Boolean
        /**
         * Gets whether @self is homogeneous.
         *
         * @return whether @self is homogeneous
         */
        get() = adw_leaflet_get_homogeneous(adwLeafletPointer).asBoolean()

        /**
         * Sets @self to be homogeneous or not.
         *
         * If set to `FALSE`, different children can have different size along the
         * opposite orientation.
         *
         * @param homogeneous whether to make @self homogeneous
         */
        set(homogeneous) = adw_leaflet_set_homogeneous(adwLeafletPointer, homogeneous.asGBoolean())

    /**
     * The mode transition animation duration, in milliseconds.
     */
    public var modeTransitionDuration: guint
        /**
         * Gets the mode transition animation duration for @self.
         *
         * @return the mode transition duration, in milliseconds.
         */
        get() = adw_leaflet_get_mode_transition_duration(adwLeafletPointer)

        /**
         * Sets the mode transition animation duration for @self.
         *
         * @param duration the new duration, in milliseconds
         */
        set(duration) = adw_leaflet_set_mode_transition_duration(adwLeafletPointer, duration)

    /**
     * A selection model with the leaflet's pages.
     *
     * This can be used to keep an up-to-date view. The model also implements
     * [iface@Gtk.SelectionModel] and can be used to track and change the visible
     * page.
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
         */
        get() = adw_leaflet_get_pages(adwLeafletPointer)!!.run {
            SelectionModel.wrap(reinterpret())
        }

    /**
     * The type of animation used for transitions between modes and children.
     *
     * The transition type can be changed without problems at runtime, so it is
     * possible to change the animation based on the mode or child that is about
     * to become current.
     */
    public var transitionType: LeafletTransitionType
        /**
         * Gets the type of animation used for transitions between modes and children.
         *
         * @return the current transition type of @self
         */
        get() = adw_leaflet_get_transition_type(adwLeafletPointer).run {
            LeafletTransitionType.fromNativeValue(this)
        }

        /**
         * Sets the type of animation used for transitions between modes and children.
         *
         * The transition type can be changed without problems at runtime, so it is
         * possible to change the animation based on the mode or child that is about to
         * become current.
         *
         * @param transition the new transition type
         */
        set(transition) = adw_leaflet_set_transition_type(adwLeafletPointer, transition.nativeValue)

    /**
     * Creates a new `AdwLeaflet`.
     *
     * @return the new created `AdwLeaflet`
     */
    public constructor() : this(adw_leaflet_new()!!.reinterpret())

    /**
     * Adds a child to @self.
     *
     * @param child the widget to add
     * @return the [class@LeafletPage] for @child
     */
    public fun append(child: Widget): LeafletPage =
        adw_leaflet_append(adwLeafletPointer, child.gtkWidgetPointer)!!.run {
            LeafletPage(this)
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
     */
    public fun getAdjacentChild(direction: NavigationDirection): Widget? =
        adw_leaflet_get_adjacent_child(adwLeafletPointer, direction.nativeValue)?.run {
            Widget(this)
        }

    /**
     * Finds the child of @self with @name.
     *
     * Returns `NULL` if there is no child with this name.
     *
     * See [property@LeafletPage:name].
     *
     * @param name the name of the child to find
     * @return the requested child of @self
     */
    public fun getChildByName(name: String): Widget? = adw_leaflet_get_child_by_name(adwLeafletPointer, name)?.run {
        Widget(this)
    }

    /**
     * Returns the [class@LeafletPage] object for @child.
     *
     * @param child a child of @self
     * @return the page object for @child
     */
    public fun getPage(child: Widget): LeafletPage =
        adw_leaflet_get_page(adwLeafletPointer, child.gtkWidgetPointer)!!.run {
            LeafletPage(this)
        }

    /**
     * Gets the widget currently visible when the leaflet is folded.
     *
     * @return the visible child
     */
    public fun getVisibleChild(): Widget? = adw_leaflet_get_visible_child(adwLeafletPointer)?.run {
        Widget(this)
    }

    /**
     * Gets the name of the currently visible child widget.
     *
     * @return the name of the visible child
     */
    public fun getVisibleChildName(): String? = adw_leaflet_get_visible_child_name(adwLeafletPointer)?.toKString()

    /**
     * Inserts @child in the position after @sibling in the list of children.
     *
     * If @sibling is `NULL`, inserts @child at the first position.
     *
     * @param child the widget to insert
     * @param sibling the sibling after which to insert @child
     * @return the [class@LeafletPage] for @child
     */
    public fun insertChildAfter(child: Widget, sibling: Widget? = null): LeafletPage =
        adw_leaflet_insert_child_after(adwLeafletPointer, child.gtkWidgetPointer, sibling?.gtkWidgetPointer)!!.run {
            LeafletPage(this)
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
     */
    public fun navigate(direction: NavigationDirection): Boolean =
        adw_leaflet_navigate(adwLeafletPointer, direction.nativeValue).asBoolean()

    /**
     * Inserts @child at the first position in @self.
     *
     * @param child the widget to prepend
     * @return the [class@LeafletPage] for @child
     */
    public fun prepend(child: Widget): LeafletPage =
        adw_leaflet_prepend(adwLeafletPointer, child.gtkWidgetPointer)!!.run {
            LeafletPage(this)
        }

    /**
     * Removes a child widget from @self.
     *
     * @param child the child to remove
     */
    public fun remove(child: Widget): Unit = adw_leaflet_remove(adwLeafletPointer, child.gtkWidgetPointer)

    /**
     * Moves @child to the position after @sibling in the list of children.
     *
     * If @sibling is `NULL`, moves @child to the first position.
     *
     * @param child the widget to move, must be a child of @self
     * @param sibling the sibling to move @child after
     */
    public fun reorderChildAfter(child: Widget, sibling: Widget? = null): Unit =
        adw_leaflet_reorder_child_after(adwLeafletPointer, child.gtkWidgetPointer, sibling?.gtkWidgetPointer)

    /**
     * Sets the widget currently visible when the leaflet is folded.
     *
     * The transition is determined by [property@Leaflet:transition-type] and
     * [property@Leaflet:child-transition-params]. The transition can be cancelled
     * by the user, in which case visible child will change back to the previously
     * visible child.
     *
     * @param visibleChild the new child
     */
    public fun setVisibleChild(visibleChild: Widget): Unit =
        adw_leaflet_set_visible_child(adwLeafletPointer, visibleChild.gtkWidgetPointer)

    /**
     * Makes the child with the name @name visible.
     *
     * See [property@Leaflet:visible-child].
     *
     * @param name the name of a child
     */
    public fun setVisibleChildName(name: String): Unit = adw_leaflet_set_visible_child_name(adwLeafletPointer, name)

    public companion object : TypeCompanion<Leaflet> {
        override val type: GeneratedClassKGType<Leaflet> =
            GeneratedClassKGType(adw_leaflet_get_type()) { Leaflet(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Leaflet
         *
         * @return the GType
         */
        public fun getType(): GType = adw_leaflet_get_type()
    }
}
