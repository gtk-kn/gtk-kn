// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwClamp
import org.gtkkn.native.adw.adw_clamp_get_child
import org.gtkkn.native.adw.adw_clamp_get_maximum_size
import org.gtkkn.native.adw.adw_clamp_get_tightening_threshold
import org.gtkkn.native.adw.adw_clamp_get_type
import org.gtkkn.native.adw.adw_clamp_new
import org.gtkkn.native.adw.adw_clamp_set_child
import org.gtkkn.native.adw.adw_clamp_set_maximum_size
import org.gtkkn.native.adw.adw_clamp_set_tightening_threshold
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import kotlin.Int
import kotlin.Unit

/**
 * A widget constraining its child to a given size.
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
 * The `AdwClamp` widget constrains the size of the widget it contains to a
 * given maximum size. It will constrain the width if it is horizontal, or the
 * height if it is vertical. The expansion of the child from its minimum to its
 * maximum size is eased out for a smooth transition.
 *
 * If the child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 *
 * ## CSS nodes
 *
 * `AdwClamp` has a single CSS node with name `clamp`.
 *
 * Its children will receive the style classes `.large` when the child reached
 * its maximum size, `.small` when the clamp allocates its full size to the
 * child, `.medium` in-between, or none if it hasn't computed its size yet.
 * @since 1.0
 */
public class Clamp(
    pointer: CPointer<AdwClamp>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val adwClampPointer: CPointer<AdwClamp>
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
     * The child widget of the `AdwClamp`.
     *
     * @since 1.0
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.0
         */
        get() =
            adw_clamp_get_child(adwClampPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.0
         */
        set(child) =
            adw_clamp_set_child(
                adwClampPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The maximum size allocated to the child.
     *
     * It is the width if the clamp is horizontal, or the height if it is vertical.
     *
     * @since 1.0
     */
    public var maximumSize: Int
        /**
         * Gets the maximum size allocated to the child.
         *
         * @return the maximum size to allocate to the child
         * @since 1.0
         */
        get() = adw_clamp_get_maximum_size(adwClampPointer.reinterpret())

        /**
         * Sets the maximum size allocated to the child.
         *
         * @param maximumSize the maximum size
         * @since 1.0
         */
        set(maximumSize) = adw_clamp_set_maximum_size(adwClampPointer.reinterpret(), maximumSize)

    /**
     * The size above which the child is clamped.
     *
     * Starting from this size, the clamp will tighten its grip on the child,
     * slowly allocating less and less of the available size up to the maximum
     * allocated size. Below that threshold and below the maximum size, the child
     * will be allocated all the available size.
     *
     * If the threshold is greater than the maximum size to allocate to the child,
     * the child will be allocated all the size up to the maximum.
     * If the threshold is lower than the minimum size to allocate to the child,
     * that size will be used as the tightening threshold.
     *
     * Effectively, tightening the grip on the child before it reaches its maximum
     * size makes transitions to and from the maximum size smoother when resizing.
     *
     * @since 1.0
     */
    public var tighteningThreshold: Int
        /**
         * Gets the size above which the child is clamped.
         *
         * @return the size above which the child is clamped
         * @since 1.0
         */
        get() = adw_clamp_get_tightening_threshold(adwClampPointer.reinterpret())

        /**
         * Sets the size above which the child is clamped.
         *
         * @param tighteningThreshold the tightening threshold
         * @since 1.0
         */
        set(tighteningThreshold) =
            adw_clamp_set_tightening_threshold(
                adwClampPointer.reinterpret(),
                tighteningThreshold
            )

    /**
     * Creates a new `AdwClamp`.
     *
     * @return the newly created `AdwClamp`
     * @since 1.0
     */
    public constructor() : this(adw_clamp_new()!!.reinterpret())

    /**
     * Gets the child widget of @self.
     *
     * @return the child widget of @self
     * @since 1.0
     */
    public fun getChild(): Widget? =
        adw_clamp_get_child(adwClampPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the maximum size allocated to the child.
     *
     * @return the maximum size to allocate to the child
     * @since 1.0
     */
    public fun getMaximumSize(): Int = adw_clamp_get_maximum_size(adwClampPointer.reinterpret())

    /**
     * Gets the size above which the child is clamped.
     *
     * @return the size above which the child is clamped
     * @since 1.0
     */
    public fun getTighteningThreshold(): Int = adw_clamp_get_tightening_threshold(adwClampPointer.reinterpret())

    /**
     * Sets the child widget of @self.
     *
     * @param child the child widget
     * @since 1.0
     */
    public fun setChild(child: Widget? = null): Unit =
        adw_clamp_set_child(
            adwClampPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the maximum size allocated to the child.
     *
     * @param maximumSize the maximum size
     * @since 1.0
     */
    public fun setMaximumSize(maximumSize: Int): Unit =
        adw_clamp_set_maximum_size(adwClampPointer.reinterpret(), maximumSize)

    /**
     * Sets the size above which the child is clamped.
     *
     * @param tighteningThreshold the tightening threshold
     * @since 1.0
     */
    public fun setTighteningThreshold(tighteningThreshold: Int): Unit =
        adw_clamp_set_tightening_threshold(adwClampPointer.reinterpret(), tighteningThreshold)

    public companion object : TypeCompanion<Clamp> {
        override val type: GeneratedClassKGType<Clamp> =
            GeneratedClassKGType(adw_clamp_get_type()) { Clamp(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
