// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public class CarouselIndicatorDots(public val adwCarouselIndicatorDotsPointer: CPointer<AdwCarouselIndicatorDots>) :
    Widget(adwCarouselIndicatorDotsPointer.reinterpret()),
    Orientable,
    KGTyped {
    init {
        Adw
    }

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

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
            InstanceCache.get(this, true) { Carousel(reinterpret()) }!!
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
    public constructor() : this(adw_carousel_indicator_dots_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CarouselIndicatorDots> {
        override val type: GeneratedClassKGType<CarouselIndicatorDots> =
            GeneratedClassKGType(getTypeOrNull()!!) { CarouselIndicatorDots(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of CarouselIndicatorDots
         *
         * @return the GType
         */
        public fun getType(): GType = adw_carousel_indicator_dots_get_type()

        /**
         * Gets the GType of from the symbol `adw_carousel_indicator_dots_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_carousel_indicator_dots_get_type")
    }
}
