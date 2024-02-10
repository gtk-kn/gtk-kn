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
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.UInt
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
 * @since 1.0
 */
public class Carousel(
    pointer: CPointer<AdwCarousel>,
) : Widget(pointer.reinterpret()), Swipeable, Orientable, KGTyped {
    public val adwCarouselPointer: CPointer<AdwCarousel>
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
     * Whether to allow swiping for more than one page at a time.
     *
     * If the value is `FALSE`, each swipe can only move to the adjacent pages.
     *
     * @since 1.0
     */
    public var allowLongSwipes: Boolean
        /**
         * Gets whether to allow swiping for more than one page at a time.
         *
         * @return `TRUE` if long swipes are allowed
         * @since 1.0
         */
        get() = adw_carousel_get_allow_long_swipes(adwCarouselPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to allow swiping for more than one page at a time.
         *
         * @param allowLongSwipes whether to allow long swipes
         * @since 1.0
         */
        set(allowLongSwipes) =
            adw_carousel_set_allow_long_swipes(
                adwCarouselPointer.reinterpret(),
                allowLongSwipes.asGBoolean()
            )

    /**
     * Sets whether the `AdwCarousel` can be dragged with mouse pointer.
     *
     * If the value is `FALSE`, dragging is only available on touch.
     *
     * @since 1.0
     */
    public var allowMouseDrag: Boolean
        /**
         * Sets whether @self can be dragged with mouse pointer.
         *
         * @return whether @self can be dragged with mouse pointer
         * @since 1.0
         */
        get() = adw_carousel_get_allow_mouse_drag(adwCarouselPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be dragged with mouse pointer.
         *
         * @param allowMouseDrag whether @self can be dragged with mouse pointer
         * @since 1.0
         */
        set(allowMouseDrag) =
            adw_carousel_set_allow_mouse_drag(
                adwCarouselPointer.reinterpret(),
                allowMouseDrag.asGBoolean()
            )

    /**
     * Whether the widget will respond to scroll wheel events.
     *
     * If the value is `FALSE`, wheel events will be ignored.
     *
     * @since 1.0
     */
    public var allowScrollWheel: Boolean
        /**
         * Gets whether @self will respond to scroll wheel events.
         *
         * @return `TRUE` if @self will respond to scroll wheel events
         * @since 1.0
         */
        get() = adw_carousel_get_allow_scroll_wheel(adwCarouselPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self will respond to scroll wheel events.
         *
         * @param allowScrollWheel whether @self will respond to scroll wheel events
         * @since 1.0
         */
        set(allowScrollWheel) =
            adw_carousel_set_allow_scroll_wheel(
                adwCarouselPointer.reinterpret(),
                allowScrollWheel.asGBoolean()
            )

    /**
     * Whether the carousel can be navigated.
     *
     * This can be used to temporarily disable a `AdwCarousel` to only allow
     * navigating it in a certain state.
     *
     * @since 1.0
     */
    public var interactive: Boolean
        /**
         * Gets whether @self can be navigated.
         *
         * @return whether @self can be navigated
         * @since 1.0
         */
        get() = adw_carousel_get_interactive(adwCarouselPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be navigated.
         *
         * @param interactive whether @self can be navigated
         * @since 1.0
         */
        set(interactive) =
            adw_carousel_set_interactive(
                adwCarouselPointer.reinterpret(),
                interactive.asGBoolean()
            )

    /**
     * The number of pages in a `AdwCarousel`.
     *
     * @since 1.0
     */
    public val nPages: UInt
        /**
         * Gets the number of pages in @self.
         *
         * @return the number of pages in @self
         * @since 1.0
         */
        get() = adw_carousel_get_n_pages(adwCarouselPointer.reinterpret())

    /**
     * Current scrolling position, unitless.
     *
     * 1 matches 1 page. Use [method@Carousel.scroll_to] for changing it.
     *
     * @since 1.0
     */
    public val position: Double
        /**
         * Gets current scroll position in @self.
         *
         * It's unitless, 1 matches 1 page.
         *
         * @return the scroll position
         * @since 1.0
         */
        get() = adw_carousel_get_position(adwCarouselPointer.reinterpret())

    /**
     * Page reveal duration, in milliseconds.
     *
     * @since 1.0
     */
    public var revealDuration: UInt
        /**
         * Gets duration of the animation used when adding or removing pages.
         *
         * @return the duration
         * @since 1.0
         */
        get() = adw_carousel_get_reveal_duration(adwCarouselPointer.reinterpret())

        /**
         * Sets duration of the animation used when adding or removing pages.
         *
         * @param revealDuration the new reveal duration value
         * @since 1.0
         */
        set(revealDuration) =
            adw_carousel_set_reveal_duration(
                adwCarouselPointer.reinterpret(),
                revealDuration
            )

    /**
     * Scroll animation spring parameters.
     *
     * The default value is equivalent to:
     *
     * ```c
     * adw_spring_params_new (1, 0.5, 500)
     * ```
     *
     * @since 1.0
     */
    public var scrollParams: SpringParams
        /**
         * Gets the scroll animation spring parameters for @self.
         *
         * @return the animation parameters
         * @since 1.0
         */
        get() =
            adw_carousel_get_scroll_params(adwCarouselPointer.reinterpret())!!.run {
                SpringParams(reinterpret())
            }

        /**
         * Sets the scroll animation spring parameters for @self.
         *
         * @param params the new parameters
         * @since 1.0
         */
        set(params) =
            adw_carousel_set_scroll_params(
                adwCarouselPointer.reinterpret(),
                params.adwSpringParamsPointer
            )

    /**
     * Spacing between pages in pixels.
     *
     * @since 1.0
     */
    public var spacing: UInt
        /**
         * Gets spacing between pages in pixels.
         *
         * @return spacing between pages
         * @since 1.0
         */
        get() = adw_carousel_get_spacing(adwCarouselPointer.reinterpret())

        /**
         * Sets spacing between pages in pixels.
         *
         * @param spacing the new spacing value
         * @since 1.0
         */
        set(spacing) = adw_carousel_set_spacing(adwCarouselPointer.reinterpret(), spacing)

    /**
     * Creates a new `AdwCarousel`.
     *
     * @return the newly created `AdwCarousel`
     * @since 1.0
     */
    public constructor() : this(adw_carousel_new()!!.reinterpret())

    /**
     * Appends @child to @self.
     *
     * @param child a widget to add
     * @since 1.0
     */
    public fun append(child: Widget): Unit =
        adw_carousel_append(
            adwCarouselPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Gets whether to allow swiping for more than one page at a time.
     *
     * @return `TRUE` if long swipes are allowed
     * @since 1.0
     */
    public fun getAllowLongSwipes(): Boolean =
        adw_carousel_get_allow_long_swipes(adwCarouselPointer.reinterpret()).asBoolean()

    /**
     * Sets whether @self can be dragged with mouse pointer.
     *
     * @return whether @self can be dragged with mouse pointer
     * @since 1.0
     */
    public fun getAllowMouseDrag(): Boolean =
        adw_carousel_get_allow_mouse_drag(adwCarouselPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self will respond to scroll wheel events.
     *
     * @return `TRUE` if @self will respond to scroll wheel events
     * @since 1.0
     */
    public fun getAllowScrollWheel(): Boolean =
        adw_carousel_get_allow_scroll_wheel(adwCarouselPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self can be navigated.
     *
     * @return whether @self can be navigated
     * @since 1.0
     */
    public fun getInteractive(): Boolean = adw_carousel_get_interactive(adwCarouselPointer.reinterpret()).asBoolean()

    /**
     * Gets the number of pages in @self.
     *
     * @return the number of pages in @self
     * @since 1.0
     */
    public fun getNPages(): UInt = adw_carousel_get_n_pages(adwCarouselPointer.reinterpret())

    /**
     * Gets the page at position @n.
     *
     * @param n index of the page
     * @return the page
     * @since 1.0
     */
    public fun getNthPage(n: UInt): Widget =
        adw_carousel_get_nth_page(adwCarouselPointer.reinterpret(), n)!!.run {
            Widget(reinterpret())
        }

    /**
     * Gets current scroll position in @self.
     *
     * It's unitless, 1 matches 1 page.
     *
     * @return the scroll position
     * @since 1.0
     */
    public fun getPosition(): Double = adw_carousel_get_position(adwCarouselPointer.reinterpret())

    /**
     * Gets duration of the animation used when adding or removing pages.
     *
     * @return the duration
     * @since 1.0
     */
    public fun getRevealDuration(): UInt = adw_carousel_get_reveal_duration(adwCarouselPointer.reinterpret())

    /**
     * Gets the scroll animation spring parameters for @self.
     *
     * @return the animation parameters
     * @since 1.0
     */
    public fun getScrollParams(): SpringParams =
        adw_carousel_get_scroll_params(adwCarouselPointer.reinterpret())!!.run {
            SpringParams(reinterpret())
        }

    /**
     * Gets spacing between pages in pixels.
     *
     * @return spacing between pages
     * @since 1.0
     */
    public fun getSpacing(): UInt = adw_carousel_get_spacing(adwCarouselPointer.reinterpret())

    /**
     * Inserts @child into @self at position @position.
     *
     * If position is -1, or larger than the number of pages,
     * @child will be appended to the end.
     *
     * @param child a widget to add
     * @param position the position to insert @child at
     * @since 1.0
     */
    public fun insert(
        child: Widget,
        position: Int,
    ): Unit =
        adw_carousel_insert(
            adwCarouselPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            position
        )

    /**
     * Prepends @child to @self.
     *
     * @param child a widget to add
     * @since 1.0
     */
    public fun prepend(child: Widget): Unit =
        adw_carousel_prepend(
            adwCarouselPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Removes @child from @self.
     *
     * @param child a widget to remove
     * @since 1.0
     */
    public fun remove(child: Widget): Unit =
        adw_carousel_remove(
            adwCarouselPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Moves @child into position @position.
     *
     * If position is -1, or larger than the number of pages, @child will be moved
     * at the end.
     *
     * @param child a widget to add
     * @param position the position to move @child to
     * @since 1.0
     */
    public fun reorder(
        child: Widget,
        position: Int,
    ): Unit =
        adw_carousel_reorder(
            adwCarouselPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret(),
            position
        )

    /**
     * Scrolls to @widget.
     *
     * If @animate is `TRUE`, the transition will be animated.
     *
     * @param widget a child of @self
     * @param animate whether to animate the transition
     * @since 1.0
     */
    public fun scrollTo(
        widget: Widget,
        animate: Boolean,
    ): Unit =
        adw_carousel_scroll_to(
            adwCarouselPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            animate.asGBoolean()
        )

    /**
     * Sets whether to allow swiping for more than one page at a time.
     *
     * @param allowLongSwipes whether to allow long swipes
     * @since 1.0
     */
    public fun setAllowLongSwipes(allowLongSwipes: Boolean): Unit =
        adw_carousel_set_allow_long_swipes(
            adwCarouselPointer.reinterpret(),
            allowLongSwipes.asGBoolean()
        )

    /**
     * Sets whether @self can be dragged with mouse pointer.
     *
     * @param allowMouseDrag whether @self can be dragged with mouse pointer
     * @since 1.0
     */
    public fun setAllowMouseDrag(allowMouseDrag: Boolean): Unit =
        adw_carousel_set_allow_mouse_drag(
            adwCarouselPointer.reinterpret(),
            allowMouseDrag.asGBoolean()
        )

    /**
     * Sets whether @self will respond to scroll wheel events.
     *
     * @param allowScrollWheel whether @self will respond to scroll wheel events
     * @since 1.0
     */
    public fun setAllowScrollWheel(allowScrollWheel: Boolean): Unit =
        adw_carousel_set_allow_scroll_wheel(
            adwCarouselPointer.reinterpret(),
            allowScrollWheel.asGBoolean()
        )

    /**
     * Sets whether @self can be navigated.
     *
     * @param interactive whether @self can be navigated
     * @since 1.0
     */
    public fun setInteractive(interactive: Boolean): Unit =
        adw_carousel_set_interactive(adwCarouselPointer.reinterpret(), interactive.asGBoolean())

    /**
     * Sets duration of the animation used when adding or removing pages.
     *
     * @param revealDuration the new reveal duration value
     * @since 1.0
     */
    public fun setRevealDuration(revealDuration: UInt): Unit =
        adw_carousel_set_reveal_duration(adwCarouselPointer.reinterpret(), revealDuration)

    /**
     * Sets the scroll animation spring parameters for @self.
     *
     * @param params the new parameters
     * @since 1.0
     */
    public fun setScrollParams(params: SpringParams): Unit =
        adw_carousel_set_scroll_params(
            adwCarouselPointer.reinterpret(),
            params.adwSpringParamsPointer
        )

    /**
     * Sets spacing between pages in pixels.
     *
     * @param spacing the new spacing value
     * @since 1.0
     */
    public fun setSpacing(spacing: UInt): Unit = adw_carousel_set_spacing(adwCarouselPointer.reinterpret(), spacing)

    /**
     * This signal is emitted after a page has been changed.
     *
     * It can be used to implement "infinite scrolling" by amending the pages
     * after every scroll.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `index` current page
     * @since 1.0
     */
    public fun connectPageChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (index: UInt) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "page-changed",
            connectPageChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Carousel> {
        override val type: GeneratedClassKGType<Carousel> =
            GeneratedClassKGType(adw_carousel_get_type()) { Carousel(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectPageChangedFunc: CPointer<CFunction<(UInt) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            index: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(index: UInt) -> Unit>().get().invoke(index)
    }
        .reinterpret()
