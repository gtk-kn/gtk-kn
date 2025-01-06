// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Scrollable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwClampScrollable
import org.gtkkn.native.adw.adw_clamp_scrollable_get_child
import org.gtkkn.native.adw.adw_clamp_scrollable_get_maximum_size
import org.gtkkn.native.adw.adw_clamp_scrollable_get_tightening_threshold
import org.gtkkn.native.adw.adw_clamp_scrollable_get_type
import org.gtkkn.native.adw.adw_clamp_scrollable_get_unit
import org.gtkkn.native.adw.adw_clamp_scrollable_new
import org.gtkkn.native.adw.adw_clamp_scrollable_set_child
import org.gtkkn.native.adw.adw_clamp_scrollable_set_maximum_size
import org.gtkkn.native.adw.adw_clamp_scrollable_set_tightening_threshold
import org.gtkkn.native.adw.adw_clamp_scrollable_set_unit
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollable

/**
 * A scrollable [class@Clamp].
 *
 * `AdwClampScrollable` is a variant of [class@Clamp] that implements the
 * [iface@Gtk.Scrollable] interface.
 *
 * The primary use case for `AdwClampScrollable` is clamping
 * [class@Gtk.ListView].
 */
public class ClampScrollable(pointer: CPointer<AdwClampScrollable>) :
    Widget(pointer.reinterpret()),
    Orientable,
    Scrollable,
    KGTyped {
    public val adwClampScrollablePointer: CPointer<AdwClampScrollable>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget of the `AdwClampScrollable`.
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = adw_clamp_scrollable_get_child(adwClampScrollablePointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(
            child
        ) = adw_clamp_scrollable_set_child(
            adwClampScrollablePointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * The maximum size allocated to the child.
     *
     * It is the width if the clamp is horizontal, or the height if it is vertical.
     */
    public var maximumSize: gint
        /**
         * Gets the maximum size allocated to the child.
         *
         * @return the maximum size to allocate to the child
         */
        get() = adw_clamp_scrollable_get_maximum_size(adwClampScrollablePointer.reinterpret())

        /**
         * Sets the maximum size allocated to the child.
         *
         * It is the width if the clamp is horizontal, or the height if it is vertical.
         *
         * @param maximumSize the maximum size
         */
        set(maximumSize) = adw_clamp_scrollable_set_maximum_size(adwClampScrollablePointer.reinterpret(), maximumSize)

    /**
     * The size above which the child is clamped.
     *
     * Starting from this size, the clamp will tighten its grip on the child,
     * slowly allocating less and less of the available size up to the maximum
     * allocated size. Below that threshold and below the maximum width, the child
     * will be allocated all the available size.
     *
     * If the threshold is greater than the maximum size to allocate to the child,
     * the child will be allocated all the width up to the maximum.
     * If the threshold is lower than the minimum size to allocate to the child,
     * that size will be used as the tightening threshold.
     *
     * Effectively, tightening the grip on the child before it reaches its maximum
     * size makes transitions to and from the maximum size smoother when resizing.
     */
    public var tighteningThreshold: gint
        /**
         * Gets the size above which the child is clamped.
         *
         * @return the size above which the child is clamped
         */
        get() = adw_clamp_scrollable_get_tightening_threshold(adwClampScrollablePointer.reinterpret())

        /**
         * Sets the size above which the child is clamped.
         *
         * Starting from this size, the clamp will tighten its grip on the child, slowly
         * allocating less and less of the available size up to the maximum allocated
         * size. Below that threshold and below the maximum width, the child will be
         * allocated all the available size.
         *
         * If the threshold is greater than the maximum size to allocate to the child,
         * the child will be allocated all the width up to the maximum. If the threshold
         * is lower than the minimum size to allocate to the child, that size will be
         * used as the tightening threshold.
         *
         * Effectively, tightening the grip on the child before it reaches its maximum
         * size makes transitions to and from the maximum size smoother when resizing.
         *
         * @param tighteningThreshold the tightening threshold
         */
        set(
            tighteningThreshold
        ) = adw_clamp_scrollable_set_tightening_threshold(adwClampScrollablePointer.reinterpret(), tighteningThreshold)

    /**
     * The length unit for maximum size and tightening threshold.
     *
     * Allows the sizes to vary depending on the text scale factor.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var unit: LengthUnit
        /**
         * Gets the length unit for maximum size and tightening threshold.
         *
         * @return the length unit
         * @since 1.4
         */
        get() = adw_clamp_scrollable_get_unit(adwClampScrollablePointer.reinterpret()).run {
            LengthUnit.fromNativeValue(this)
        }

        /**
         * Sets the length unit for maximum size and tightening threshold.
         *
         * Allows the sizes to vary depending on the text scale factor.
         *
         * @param unit the length unit
         * @since 1.4
         */
        @AdwVersion1_4
        set(unit) = adw_clamp_scrollable_set_unit(adwClampScrollablePointer.reinterpret(), unit.nativeValue)

    /**
     * Creates a new `AdwClampScrollable`.
     *
     * @return the newly created `AdwClampScrollable`
     */
    public constructor() : this(adw_clamp_scrollable_new()!!.reinterpret())

    public companion object : TypeCompanion<ClampScrollable> {
        override val type: GeneratedClassKGType<ClampScrollable> =
            GeneratedClassKGType(adw_clamp_scrollable_get_type()) { ClampScrollable(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ClampScrollable
         *
         * @return the GType
         */
        public fun getType(): GType = adw_clamp_scrollable_get_type()
    }
}
