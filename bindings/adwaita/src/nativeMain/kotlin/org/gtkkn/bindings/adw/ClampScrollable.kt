// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Orientable
import org.gtkkn.bindings.gtk.Scrollable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
 *
 * See also: [class@ClampLayout].
 */
public class ClampScrollable(public val adwClampScrollablePointer: CPointer<AdwClampScrollable>) :
    Widget(adwClampScrollablePointer.reinterpret()),
    Orientable,
    Scrollable,
    KGTyped {
    init {
        Adw
    }

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget of the `AdwClampScrollable`.
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = adw_clamp_scrollable_get_child(adwClampScrollablePointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = adw_clamp_scrollable_set_child(adwClampScrollablePointer, child?.gtkWidgetPointer)

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
        get() = adw_clamp_scrollable_get_maximum_size(adwClampScrollablePointer)

        /**
         * Sets the maximum size allocated to the child.
         *
         * It is the width if the clamp is horizontal, or the height if it is vertical.
         *
         * @param maximumSize the maximum size
         */
        set(maximumSize) = adw_clamp_scrollable_set_maximum_size(adwClampScrollablePointer, maximumSize)

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
        get() = adw_clamp_scrollable_get_tightening_threshold(adwClampScrollablePointer)

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
        ) = adw_clamp_scrollable_set_tightening_threshold(adwClampScrollablePointer, tighteningThreshold)

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
        get() = adw_clamp_scrollable_get_unit(adwClampScrollablePointer).run {
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
        set(unit) = adw_clamp_scrollable_set_unit(adwClampScrollablePointer, unit.nativeValue)

    /**
     * Creates a new `AdwClampScrollable`.
     *
     * @return the newly created `AdwClampScrollable`
     */
    public constructor() : this(adw_clamp_scrollable_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<ClampScrollable> {
        override val type: GeneratedClassKGType<ClampScrollable> =
            GeneratedClassKGType(getTypeOrNull()!!) { ClampScrollable(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ClampScrollable
         *
         * @return the GType
         */
        public fun getType(): GType = adw_clamp_scrollable_get_type()

        /**
         * Gets the GType of from the symbol `adw_clamp_scrollable_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_clamp_scrollable_get_type")
    }
}
