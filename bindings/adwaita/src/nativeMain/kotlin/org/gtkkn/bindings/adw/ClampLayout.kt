// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.LayoutManager
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwClampLayout
import org.gtkkn.native.adw.adw_clamp_layout_get_maximum_size
import org.gtkkn.native.adw.adw_clamp_layout_get_tightening_threshold
import org.gtkkn.native.adw.adw_clamp_layout_get_type
import org.gtkkn.native.adw.adw_clamp_layout_new
import org.gtkkn.native.adw.adw_clamp_layout_set_maximum_size
import org.gtkkn.native.adw.adw_clamp_layout_set_tightening_threshold
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Int
import kotlin.Unit

/**
 * A layout manager constraining its children to a given size.
 *
 * <picture>
 *   <source srcset="clamp-wide-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="clamp-wide.png" alt="clamp-wide">
 * </picture>
 * <picture>
 *   <source srcset="clamp-narrow-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="clamp-narrow.png" alt="clamp-narrow">
 * </picture>
 *
 * `AdwClampLayout` constraints the size of the widgets it contains to a given
 * maximum size. It will constrain the width if it is horizontal, or the height
 * if it is vertical. The expansion of the children from their minimum to their
 * maximum size is eased out for a smooth transition.
 *
 * If a child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 *
 * Each child will get the style  classes .large when it reached its maximum
 * size, .small when it's allocated the full size, .medium in-between, or none
 * if it hasn't been allocated yet.
 * @since 1.0
 */
public class ClampLayout(
    pointer: CPointer<AdwClampLayout>,
) : LayoutManager(pointer.reinterpret()), Orientable, KGTyped {
    public val adwClampLayoutPointer: CPointer<AdwClampLayout>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    /**
     * The maximum size to allocate to the children.
     *
     * It is the width if the layout is horizontal, or the height if it is
     * vertical.
     *
     * @since 1.0
     */
    public var maximumSize: Int
        /**
         * Gets the maximum size allocated to the children.
         *
         * @return the maximum size to allocate to the children
         * @since 1.0
         */
        get() = adw_clamp_layout_get_maximum_size(adwClampLayoutPointer.reinterpret())

        /**
         * Sets the maximum size allocated to the children.
         *
         * @param maximumSize the maximum size
         * @since 1.0
         */
        set(maximumSize) =
            adw_clamp_layout_set_maximum_size(
                adwClampLayoutPointer.reinterpret(),
                maximumSize
            )

    /**
     * The size above which the child is clamped.
     *
     * Starting from this size, the layout will tighten its grip on the children,
     * slowly allocating less and less of the available size up to the maximum
     * allocated size. Below that threshold and below the maximum size, the
     * children will be allocated all the available size.
     *
     * If the threshold is greater than the maximum size to allocate to the
     * children, they will be allocated the whole size up to the maximum. If the
     * threshold is lower than the minimum size to allocate to the children, that
     * size will be used as the tightening threshold.
     *
     * Effectively, tightening the grip on a child before it reaches its maximum
     * size makes transitions to and from the maximum size smoother when resizing.
     *
     * @since 1.0
     */
    public var tighteningThreshold: Int
        /**
         * Gets the size above which the children are clamped.
         *
         * @return the size above which the children are clamped
         * @since 1.0
         */
        get() = adw_clamp_layout_get_tightening_threshold(adwClampLayoutPointer.reinterpret())

        /**
         * Sets the size above which the children are clamped.
         *
         * @param tighteningThreshold the tightening threshold
         * @since 1.0
         */
        set(tighteningThreshold) =
            adw_clamp_layout_set_tightening_threshold(
                adwClampLayoutPointer.reinterpret(),
                tighteningThreshold
            )

    /**
     * Creates a new `AdwClampLayout`.
     *
     * @return the newly created `AdwClampLayout`
     * @since 1.0
     */
    public constructor() : this(adw_clamp_layout_new()!!.reinterpret())

    /**
     * Gets the maximum size allocated to the children.
     *
     * @return the maximum size to allocate to the children
     * @since 1.0
     */
    public fun getMaximumSize(): Int = adw_clamp_layout_get_maximum_size(adwClampLayoutPointer.reinterpret())

    /**
     * Gets the size above which the children are clamped.
     *
     * @return the size above which the children are clamped
     * @since 1.0
     */
    public fun getTighteningThreshold(): Int =
        adw_clamp_layout_get_tightening_threshold(adwClampLayoutPointer.reinterpret())

    /**
     * Sets the maximum size allocated to the children.
     *
     * @param maximumSize the maximum size
     * @since 1.0
     */
    public fun setMaximumSize(maximumSize: Int): Unit =
        adw_clamp_layout_set_maximum_size(adwClampLayoutPointer.reinterpret(), maximumSize)

    /**
     * Sets the size above which the children are clamped.
     *
     * @param tighteningThreshold the tightening threshold
     * @since 1.0
     */
    public fun setTighteningThreshold(tighteningThreshold: Int): Unit =
        adw_clamp_layout_set_tightening_threshold(
            adwClampLayoutPointer.reinterpret(),
            tighteningThreshold
        )

    public companion object : TypeCompanion<ClampLayout> {
        override val type: GeneratedClassKGType<ClampLayout> =
            GeneratedClassKGType(adw_clamp_layout_get_type()) { ClampLayout(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
