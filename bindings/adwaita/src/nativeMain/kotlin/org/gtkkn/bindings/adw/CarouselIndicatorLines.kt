// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwCarouselIndicatorLines
import org.gtkkn.native.adw.adw_carousel_indicator_lines_get_carousel
import org.gtkkn.native.adw.adw_carousel_indicator_lines_get_type
import org.gtkkn.native.adw.adw_carousel_indicator_lines_new
import org.gtkkn.native.adw.adw_carousel_indicator_lines_set_carousel
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Unit

/**
 * A lines indicator for [class@Carousel].
 *
 * <picture>
 *   <source srcset="carousel-indicator-dots-lines.png" media="(prefers-color-scheme: dark)">
 *   <img src="carousel-indicator-lines.png" alt="carousel-indicator-lines">
 * </picture>
 *
 * The `AdwCarouselIndicatorLines` widget shows a set of lines for each page of
 * a given [class@Carousel]. The carousel's active page is shown as another line
 * that moves between them to match the carousel's position.
 *
 * See also [class@CarouselIndicatorDots].
 *
 * ## CSS nodes
 *
 * `AdwCarouselIndicatorLines` has a single CSS node with name
 * `carouselindicatorlines`.
 * @since 1.0
 */
public class CarouselIndicatorLines(
    pointer: CPointer<AdwCarouselIndicatorLines>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val adwCarouselIndicatorLinesPointer: CPointer<AdwCarouselIndicatorLines>
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
     *
     * @since 1.0
     */
    public var carousel: Carousel?
        /**
         * Gets the displayed carousel.
         *
         * @return the displayed carousel
         * @since 1.0
         */
        get() =
            adw_carousel_indicator_lines_get_carousel(adwCarouselIndicatorLinesPointer.reinterpret())?.run {
                Carousel(reinterpret())
            }

        /**
         * Sets the displayed carousel.
         *
         * @param carousel a carousel
         * @since 1.0
         */
        set(carousel) =
            adw_carousel_indicator_lines_set_carousel(
                adwCarouselIndicatorLinesPointer.reinterpret(),
                carousel?.adwCarouselPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwCarouselIndicatorLines`.
     *
     * @return the newly created `AdwCarouselIndicatorLines`
     * @since 1.0
     */
    public constructor() : this(adw_carousel_indicator_lines_new()!!.reinterpret())

    /**
     * Gets the displayed carousel.
     *
     * @return the displayed carousel
     * @since 1.0
     */
    public fun getCarousel(): Carousel? =
        adw_carousel_indicator_lines_get_carousel(adwCarouselIndicatorLinesPointer.reinterpret())?.run {
            Carousel(reinterpret())
        }

    /**
     * Sets the displayed carousel.
     *
     * @param carousel a carousel
     * @since 1.0
     */
    public fun setCarousel(carousel: Carousel? = null): Unit =
        adw_carousel_indicator_lines_set_carousel(
            adwCarouselIndicatorLinesPointer.reinterpret(),
            carousel?.adwCarouselPointer?.reinterpret()
        )

    public companion object : TypeCompanion<CarouselIndicatorLines> {
        override val type: GeneratedClassKGType<CarouselIndicatorLines> =
            GeneratedClassKGType(adw_carousel_indicator_lines_get_type()) {
                CarouselIndicatorLines(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
