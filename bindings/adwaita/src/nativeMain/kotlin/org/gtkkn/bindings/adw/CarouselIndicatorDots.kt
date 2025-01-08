// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwCarouselIndicatorDots
import org.gtkkn.native.adw.adw_carousel_indicator_dots_get_carousel
import org.gtkkn.native.adw.adw_carousel_indicator_dots_get_type
import org.gtkkn.native.adw.adw_carousel_indicator_dots_new
import org.gtkkn.native.adw.adw_carousel_indicator_dots_set_carousel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable

/**
 * A dots indicator for [class@Carousel].
 *
 * <picture>
 *   <source srcset="carousel-indicator-dots-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="carousel-indicator-dots.png" alt="carousel-indicator-dots">
 * </picture>
 *
 * The `AdwCarouselIndicatorDots` widget shows a set of dots for each page of a
 * given [class@Carousel]. The dot representing the carousel's active page is
 * larger and more opaque than the others, the transition to the active and
 * inactive state is gradual to match the carousel's position.
 *
 * See also [class@CarouselIndicatorLines].
 *
 * ## CSS nodes
 *
 * `AdwCarouselIndicatorDots` has a single CSS node with name
 * `carouselindicatordots`.
 */
public class CarouselIndicatorDots(pointer: CPointer<AdwCarouselIndicatorDots>) :
    Widget(pointer.reinterpret()),
    Orientable,
    KGTyped {
    public val adwCarouselIndicatorDotsPointer: CPointer<AdwCarouselIndicatorDots>
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
     * The displayed carousel.
     */
    public var carousel: Carousel?
        /**
         * Gets the displayed carousel.
         *
         * @return the displayed carousel
         */
        get() = adw_carousel_indicator_dots_get_carousel(adwCarouselIndicatorDotsPointer)?.run {
            Carousel(this)
        }

        /**
         * Sets the displayed carousel.
         *
         * @param carousel a carousel
         */
        set(
            carousel
        ) = adw_carousel_indicator_dots_set_carousel(adwCarouselIndicatorDotsPointer, carousel?.adwCarouselPointer)

    /**
     * Creates a new `AdwCarouselIndicatorDots`.
     *
     * @return the newly created `AdwCarouselIndicatorDots`
     */
    public constructor() : this(adw_carousel_indicator_dots_new()!!.reinterpret())

    public companion object : TypeCompanion<CarouselIndicatorDots> {
        override val type: GeneratedClassKGType<CarouselIndicatorDots> =
            GeneratedClassKGType(adw_carousel_indicator_dots_get_type()) { CarouselIndicatorDots(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of CarouselIndicatorDots
         *
         * @return the GType
         */
        public fun getType(): GType = adw_carousel_indicator_dots_get_type()
    }
}
