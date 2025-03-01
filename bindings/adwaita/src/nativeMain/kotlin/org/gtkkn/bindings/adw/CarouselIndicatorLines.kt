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
import org.gtkkn.native.adw.AdwCarouselIndicatorLines
import org.gtkkn.native.adw.adw_carousel_indicator_lines_get_carousel
import org.gtkkn.native.adw.adw_carousel_indicator_lines_get_type
import org.gtkkn.native.adw.adw_carousel_indicator_lines_new
import org.gtkkn.native.adw.adw_carousel_indicator_lines_set_carousel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable

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
 */
public class CarouselIndicatorLines(public val adwCarouselIndicatorLinesPointer: CPointer<AdwCarouselIndicatorLines>) :
    Widget(adwCarouselIndicatorLinesPointer.reinterpret()),
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
        get() = adw_carousel_indicator_lines_get_carousel(adwCarouselIndicatorLinesPointer)?.run {
            InstanceCache.get(this, true) { Carousel(reinterpret()) }!!
        }

        /**
         * Sets the displayed carousel.
         *
         * @param carousel a carousel
         */
        set(
            carousel
        ) = adw_carousel_indicator_lines_set_carousel(adwCarouselIndicatorLinesPointer, carousel?.adwCarouselPointer)

    /**
     * Creates a new `AdwCarouselIndicatorLines`.
     *
     * @return the newly created `AdwCarouselIndicatorLines`
     */
    public constructor() : this(adw_carousel_indicator_lines_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CarouselIndicatorLines> {
        override val type: GeneratedClassKGType<CarouselIndicatorLines> =
            GeneratedClassKGType(getTypeOrNull()!!) { CarouselIndicatorLines(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of CarouselIndicatorLines
         *
         * @return the GType
         */
        public fun getType(): GType = adw_carousel_indicator_lines_get_type()

        /**
         * Gets the GType of from the symbol `adw_carousel_indicator_lines_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_carousel_indicator_lines_get_type")
    }
}
