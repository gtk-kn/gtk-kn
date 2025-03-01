// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwCarousel
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_carousel_append
import org.gtkkn.native.adw.adw_carousel_get_allow_long_swipes
import org.gtkkn.native.adw.adw_carousel_get_allow_mouse_drag
import org.gtkkn.native.adw.adw_carousel_get_allow_scroll_wheel
import org.gtkkn.native.adw.adw_carousel_get_interactive
import org.gtkkn.native.adw.adw_carousel_get_n_pages
import org.gtkkn.native.adw.adw_carousel_get_nth_page
import org.gtkkn.native.adw.adw_carousel_get_position
import org.gtkkn.native.adw.adw_carousel_get_reveal_duration
import org.gtkkn.native.adw.adw_carousel_get_scroll_params
import org.gtkkn.native.adw.adw_carousel_get_spacing
import org.gtkkn.native.adw.adw_carousel_get_type
import org.gtkkn.native.adw.adw_carousel_insert
import org.gtkkn.native.adw.adw_carousel_new
import org.gtkkn.native.adw.adw_carousel_prepend
import org.gtkkn.native.adw.adw_carousel_remove
import org.gtkkn.native.adw.adw_carousel_reorder
import org.gtkkn.native.adw.adw_carousel_scroll_to
import org.gtkkn.native.adw.adw_carousel_set_allow_long_swipes
import org.gtkkn.native.adw.adw_carousel_set_allow_mouse_drag
import org.gtkkn.native.adw.adw_carousel_set_allow_scroll_wheel
import org.gtkkn.native.adw.adw_carousel_set_interactive
import org.gtkkn.native.adw.adw_carousel_set_reveal_duration
import org.gtkkn.native.adw.adw_carousel_set_scroll_params
import org.gtkkn.native.adw.adw_carousel_set_spacing
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A paginated scrolling widget.
 *
 * <picture>
 *   <source srcset="carousel-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="carousel.png" alt="carousel">
 * </picture>
 *
 * The `AdwCarousel` widget can be used to display a set of pages with
 * swipe-based navigation between them.
 *
 * [class@CarouselIndicatorDots] and [class@CarouselIndicatorLines] can be used
 * to provide page indicators for `AdwCarousel`.
 *
 * ## CSS nodes
 *
 * `AdwCarousel` has a single CSS node with name `carousel`.
 */
public class Carousel(public val adwCarouselPointer: CPointer<AdwCarousel>) :
    Widget(adwCarouselPointer.reinterpret()),
    Swipeable,
    Orientable,
    KGTyped {
    init {
        Adw
    }

    override val adwSwipeablePointer: CPointer<AdwSwipeable>
        get() = handle.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether to allow swiping for more than one page at a time.
     *
     * If the value is `FALSE`, each swipe can only move to the adjacent pages.
     */
    public var allowLongSwipes: Boolean
        /**
         * Gets whether to allow swiping for more than one page at a time.
         *
         * @return `TRUE` if long swipes are allowed
         */
        get() = adw_carousel_get_allow_long_swipes(adwCarouselPointer).asBoolean()

        /**
         * Sets whether to allow swiping for more than one page at a time.
         *
         * If @allow_long_swipes is `FALSE`, each swipe can only move to the adjacent
         * pages.
         *
         * @param allowLongSwipes whether to allow long swipes
         */
        set(allowLongSwipes) = adw_carousel_set_allow_long_swipes(adwCarouselPointer, allowLongSwipes.asGBoolean())

    /**
     * Sets whether the `AdwCarousel` can be dragged with mouse pointer.
     *
     * If the value is `FALSE`, dragging is only available on touch.
     */
    public var allowMouseDrag: Boolean
        /**
         * Sets whether @self can be dragged with mouse pointer.
         *
         * @return whether @self can be dragged with mouse pointer
         */
        get() = adw_carousel_get_allow_mouse_drag(adwCarouselPointer).asBoolean()

        /**
         * Sets whether @self can be dragged with mouse pointer.
         *
         * If @allow_mouse_drag is `FALSE`, dragging is only available on touch.
         *
         * @param allowMouseDrag whether @self can be dragged with mouse pointer
         */
        set(allowMouseDrag) = adw_carousel_set_allow_mouse_drag(adwCarouselPointer, allowMouseDrag.asGBoolean())

    /**
     * Whether the widget will respond to scroll wheel events.
     *
     * If the value is `FALSE`, wheel events will be ignored.
     */
    public var allowScrollWheel: Boolean
        /**
         * Gets whether @self will respond to scroll wheel events.
         *
         * @return `TRUE` if @self will respond to scroll wheel events
         */
        get() = adw_carousel_get_allow_scroll_wheel(adwCarouselPointer).asBoolean()

        /**
         * Sets whether @self will respond to scroll wheel events.
         *
         * If @allow_scroll_wheel is `FALSE`, wheel events will be ignored.
         *
         * @param allowScrollWheel whether @self will respond to scroll wheel events
         */
        set(allowScrollWheel) = adw_carousel_set_allow_scroll_wheel(adwCarouselPointer, allowScrollWheel.asGBoolean())

    /**
     * Whether the carousel can be navigated.
     *
     * This can be used to temporarily disable the carousel to only allow
     * navigating it in a certain state.
     */
    public var interactive: Boolean
        /**
         * Gets whether @self can be navigated.
         *
         * @return whether @self can be navigated
         */
        get() = adw_carousel_get_interactive(adwCarouselPointer).asBoolean()

        /**
         * Sets whether @self can be navigated.
         *
         * This can be used to temporarily disable the carousel to only allow navigating
         * it in a certain state.
         *
         * @param interactive whether @self can be navigated
         */
        set(interactive) = adw_carousel_set_interactive(adwCarouselPointer, interactive.asGBoolean())

    /**
     * The number of pages in a `AdwCarousel`.
     */
    public val nPages: guint
        /**
         * Gets the number of pages in @self.
         *
         * @return the number of pages in @self
         */
        get() = adw_carousel_get_n_pages(adwCarouselPointer)

    /**
     * Current scrolling position, unitless.
     *
     * 1 matches 1 page. Use [method@Carousel.scroll_to] for changing it.
     */
    public val position: gdouble
        /**
         * Gets current scroll position in @self, unitless.
         *
         * 1 matches 1 page. Use [method@Carousel.scroll_to] for changing it.
         *
         * @return the scroll position
         */
        get() = adw_carousel_get_position(adwCarouselPointer)

    /**
     * Page reveal duration, in milliseconds.
     *
     * Reveal duration is used when animating adding or removing pages.
     */
    public var revealDuration: guint
        /**
         * Gets the page reveal duration, in milliseconds.
         *
         * @return the duration
         */
        get() = adw_carousel_get_reveal_duration(adwCarouselPointer)

        /**
         * Sets the page reveal duration, in milliseconds.
         *
         * Reveal duration is used when animating adding or removing pages.
         *
         * @param revealDuration the new reveal duration value
         */
        set(revealDuration) = adw_carousel_set_reveal_duration(adwCarouselPointer, revealDuration)

    /**
     * Scroll animation spring parameters.
     *
     * The default value is equivalent to:
     *
     * ```c
     * adw_spring_params_new (1, 0.5, 500)
     * ```
     */
    public var scrollParams: SpringParams
        /**
         * Gets the scroll animation spring parameters for @self.
         *
         * @return the animation parameters
         */
        get() = adw_carousel_get_scroll_params(adwCarouselPointer)!!.run {
            SpringParams(this)
        }

        /**
         * Sets the scroll animation spring parameters for @self.
         *
         * The default value is equivalent to:
         *
         * ```c
         * adw_spring_params_new (1, 0.5, 500)
         * ```
         *
         * @param params the new parameters
         */
        set(params) = adw_carousel_set_scroll_params(adwCarouselPointer, params.adwSpringParamsPointer)

    /**
     * Spacing between pages in pixels.
     */
    public var spacing: guint
        /**
         * Gets spacing between pages in pixels.
         *
         * @return spacing between pages
         */
        get() = adw_carousel_get_spacing(adwCarouselPointer)

        /**
         * Sets spacing between pages in pixels.
         *
         * @param spacing the new spacing value
         */
        set(spacing) = adw_carousel_set_spacing(adwCarouselPointer, spacing)

    /**
     * Creates a new `AdwCarousel`.
     *
     * @return the newly created `AdwCarousel`
     */
    public constructor() : this(adw_carousel_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Appends @child to @self.
     *
     * @param child a widget to add
     */
    public fun append(child: Widget): Unit = adw_carousel_append(adwCarouselPointer, child.gtkWidgetPointer)

    /**
     * Gets the page at position @n.
     *
     * @param n index of the page
     * @return the page
     */
    public fun getNthPage(n: guint): Widget = adw_carousel_get_nth_page(adwCarouselPointer, n)!!.run {
        InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
    }

    /**
     * Inserts @child into @self at position @position.
     *
     * If position is -1, or larger than the number of pages,
     * @child will be appended to the end.
     *
     * @param child a widget to add
     * @param position the position to insert @child at
     */
    public fun insert(child: Widget, position: gint): Unit =
        adw_carousel_insert(adwCarouselPointer, child.gtkWidgetPointer, position)

    /**
     * Prepends @child to @self.
     *
     * @param child a widget to add
     */
    public fun prepend(child: Widget): Unit = adw_carousel_prepend(adwCarouselPointer, child.gtkWidgetPointer)

    /**
     * Removes @child from @self.
     *
     * @param child a widget to remove
     */
    public fun remove(child: Widget): Unit = adw_carousel_remove(adwCarouselPointer, child.gtkWidgetPointer)

    /**
     * Moves @child into position @position.
     *
     * If position is -1, or larger than the number of pages, @child will be moved
     * at the end.
     *
     * @param child a widget to add
     * @param position the position to move @child to
     */
    public fun reorder(child: Widget, position: gint): Unit =
        adw_carousel_reorder(adwCarouselPointer, child.gtkWidgetPointer, position)

    /**
     * Scrolls to @widget.
     *
     * If @animate is `TRUE`, the transition will be animated.
     *
     * @param widget a child of @self
     * @param animate whether to animate the transition
     */
    public fun scrollTo(widget: Widget, animate: Boolean): Unit =
        adw_carousel_scroll_to(adwCarouselPointer, widget.gtkWidgetPointer, animate.asGBoolean())

    /**
     * This signal is emitted after a page has been changed.
     *
     * It can be used to implement "infinite scrolling" by amending the pages
     * after every scroll.
     *
     * ::: note
     *     An empty carousel is indicated by `(int)index == -1`.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `index` current page
     */
    public fun onPageChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (index: guint) -> Unit): ULong =
        g_signal_connect_data(
            adwCarouselPointer,
            "page-changed",
            onPageChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "page-changed" signal. See [onPageChanged].
     *
     * @param index current page
     */
    public fun emitPageChanged(index: guint) {
        g_signal_emit_by_name(adwCarouselPointer.reinterpret(), "page-changed", index)
    }

    public companion object : TypeCompanion<Carousel> {
        override val type: GeneratedClassKGType<Carousel> =
            GeneratedClassKGType(getTypeOrNull()!!) { Carousel(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Carousel
         *
         * @return the GType
         */
        public fun getType(): GType = adw_carousel_get_type()

        /**
         * Gets the GType of from the symbol `adw_carousel_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_carousel_get_type")
    }
}

private val onPageChangedFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        index: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(index: guint) -> Unit>().get().invoke(index)
}
    .reinterpret()
