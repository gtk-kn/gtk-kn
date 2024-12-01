// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_scrollable_get_border
import org.gtkkn.native.gtk.gtk_scrollable_get_hadjustment
import org.gtkkn.native.gtk.gtk_scrollable_get_hscroll_policy
import org.gtkkn.native.gtk.gtk_scrollable_get_type
import org.gtkkn.native.gtk.gtk_scrollable_get_vadjustment
import org.gtkkn.native.gtk.gtk_scrollable_get_vscroll_policy
import org.gtkkn.native.gtk.gtk_scrollable_set_hadjustment
import org.gtkkn.native.gtk.gtk_scrollable_set_hscroll_policy
import org.gtkkn.native.gtk.gtk_scrollable_set_vadjustment
import org.gtkkn.native.gtk.gtk_scrollable_set_vscroll_policy
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkScrollable` is an interface for widgets with native scrolling ability.
 *
 * To implement this interface you should override the
 * [property@Gtk.Scrollable:hadjustment] and
 * [property@Gtk.Scrollable:vadjustment] properties.
 *
 * ## Creating a scrollable widget
 *
 * All scrollable widgets should do the following.
 *
 * - When a parent widget sets the scrollable child widget’s adjustments,
 *   the widget should connect to the [signal@Gtk.Adjustment::value-changed]
 *   signal. The child widget should then populate the adjustments’ properties
 *   as soon as possible, which usually means queueing an allocation right away
 *   and populating the properties in the [vfunc@Gtk.Widget.size_allocate]
 *   implementation.
 *
 * - Because its preferred size is the size for a fully expanded widget,
 *   the scrollable widget must be able to cope with underallocations.
 *   This means that it must accept any value passed to its
 *   [vfunc@Gtk.Widget.size_allocate] implementation.
 *
 * - When the parent allocates space to the scrollable child widget,
 *   the widget must ensure the adjustments’ property values are correct and up
 *   to date, for example using [method@Gtk.Adjustment.configure].
 *
 * - When any of the adjustments emits the [signal@Gtk.Adjustment::value-changed]
 *   signal, the scrollable widget should scroll its contents.
 */
public interface Scrollable :
    Interface,
    KGTyped {
    public val gtkScrollablePointer: CPointer<GtkScrollable>

    /**
     * Horizontal `GtkAdjustment` of the scrollable widget.
     *
     * This adjustment is shared between the scrollable widget and its parent.
     */
    public var hadjustment: Adjustment?
        /**
         * Retrieves the `GtkAdjustment` used for horizontal scrolling.
         *
         * @return horizontal `GtkAdjustment`.
         */
        get() =
            gtk_scrollable_get_hadjustment(gtkScrollablePointer.reinterpret())?.run {
                Adjustment(reinterpret())
            }

        /**
         * Sets the horizontal adjustment of the `GtkScrollable`.
         *
         * @param hadjustment a `GtkAdjustment`
         */
        set(
            hadjustment
        ) =
            gtk_scrollable_set_hadjustment(
                gtkScrollablePointer.reinterpret(),
                hadjustment?.gtkAdjustmentPointer?.reinterpret()
            )

    /**
     * Determines when horizontal scrolling should start.
     */
    public var hscrollPolicy: ScrollablePolicy
        /**
         * Gets the horizontal `GtkScrollablePolicy`.
         *
         * @return The horizontal `GtkScrollablePolicy`.
         */
        get() =
            gtk_scrollable_get_hscroll_policy(gtkScrollablePointer.reinterpret()).run {
                ScrollablePolicy.fromNativeValue(this)
            }

        /**
         * Sets the `GtkScrollablePolicy`.
         *
         * The policy determines whether horizontal scrolling should start
         * below the minimum width or below the natural width.
         *
         * @param policy the horizontal `GtkScrollablePolicy`
         */
        set(policy) = gtk_scrollable_set_hscroll_policy(gtkScrollablePointer.reinterpret(), policy.nativeValue)

    /**
     * Vertical `GtkAdjustment` of the scrollable widget.
     *
     * This adjustment is shared between the scrollable widget and its parent.
     */
    public var vadjustment: Adjustment?
        /**
         * Retrieves the `GtkAdjustment` used for vertical scrolling.
         *
         * @return vertical `GtkAdjustment`.
         */
        get() =
            gtk_scrollable_get_vadjustment(gtkScrollablePointer.reinterpret())?.run {
                Adjustment(reinterpret())
            }

        /**
         * Sets the vertical adjustment of the `GtkScrollable`.
         *
         * @param vadjustment a `GtkAdjustment`
         */
        set(
            vadjustment
        ) =
            gtk_scrollable_set_vadjustment(
                gtkScrollablePointer.reinterpret(),
                vadjustment?.gtkAdjustmentPointer?.reinterpret()
            )

    /**
     * Determines when vertical scrolling should start.
     */
    public var vscrollPolicy: ScrollablePolicy
        /**
         * Gets the vertical `GtkScrollablePolicy`.
         *
         * @return The vertical `GtkScrollablePolicy`.
         */
        get() =
            gtk_scrollable_get_vscroll_policy(gtkScrollablePointer.reinterpret()).run {
                ScrollablePolicy.fromNativeValue(this)
            }

        /**
         * Sets the `GtkScrollablePolicy`.
         *
         * The policy determines whether vertical scrolling should start
         * below the minimum height or below the natural height.
         *
         * @param policy the vertical `GtkScrollablePolicy`
         */
        set(policy) = gtk_scrollable_set_vscroll_policy(gtkScrollablePointer.reinterpret(), policy.nativeValue)

    /**
     * Returns the size of a non-scrolling border around the
     * outside of the scrollable.
     *
     * An example for this would be treeview headers. GTK can use
     * this information to display overlaid graphics, like the
     * overshoot indication, at the right position.
     *
     * @param border return location for the results
     * @return true if @border has been set
     */
    public fun getBorder(border: Border): Boolean =
        gtk_scrollable_get_border(gtkScrollablePointer.reinterpret(), border.gtkBorderPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the `GtkAdjustment` used for horizontal scrolling.
     *
     * @return horizontal `GtkAdjustment`.
     */
    public fun getHadjustment(): Adjustment? =
        gtk_scrollable_get_hadjustment(gtkScrollablePointer.reinterpret())?.run {
            Adjustment(reinterpret())
        }

    /**
     * Gets the horizontal `GtkScrollablePolicy`.
     *
     * @return The horizontal `GtkScrollablePolicy`.
     */
    public fun getHscrollPolicy(): ScrollablePolicy =
        gtk_scrollable_get_hscroll_policy(gtkScrollablePointer.reinterpret()).run {
            ScrollablePolicy.fromNativeValue(this)
        }

    /**
     * Retrieves the `GtkAdjustment` used for vertical scrolling.
     *
     * @return vertical `GtkAdjustment`.
     */
    public fun getVadjustment(): Adjustment? =
        gtk_scrollable_get_vadjustment(gtkScrollablePointer.reinterpret())?.run {
            Adjustment(reinterpret())
        }

    /**
     * Gets the vertical `GtkScrollablePolicy`.
     *
     * @return The vertical `GtkScrollablePolicy`.
     */
    public fun getVscrollPolicy(): ScrollablePolicy =
        gtk_scrollable_get_vscroll_policy(gtkScrollablePointer.reinterpret()).run {
            ScrollablePolicy.fromNativeValue(this)
        }

    /**
     * Sets the horizontal adjustment of the `GtkScrollable`.
     *
     * @param hadjustment a `GtkAdjustment`
     */
    public fun setHadjustment(hadjustment: Adjustment? = null): Unit =
        gtk_scrollable_set_hadjustment(
            gtkScrollablePointer.reinterpret(),
            hadjustment?.gtkAdjustmentPointer?.reinterpret()
        )

    /**
     * Sets the `GtkScrollablePolicy`.
     *
     * The policy determines whether horizontal scrolling should start
     * below the minimum width or below the natural width.
     *
     * @param policy the horizontal `GtkScrollablePolicy`
     */
    public fun setHscrollPolicy(policy: ScrollablePolicy): Unit =
        gtk_scrollable_set_hscroll_policy(gtkScrollablePointer.reinterpret(), policy.nativeValue)

    /**
     * Sets the vertical adjustment of the `GtkScrollable`.
     *
     * @param vadjustment a `GtkAdjustment`
     */
    public fun setVadjustment(vadjustment: Adjustment? = null): Unit =
        gtk_scrollable_set_vadjustment(
            gtkScrollablePointer.reinterpret(),
            vadjustment?.gtkAdjustmentPointer?.reinterpret()
        )

    /**
     * Sets the `GtkScrollablePolicy`.
     *
     * The policy determines whether vertical scrolling should start
     * below the minimum height or below the natural height.
     *
     * @param policy the vertical `GtkScrollablePolicy`
     */
    public fun setVscrollPolicy(policy: ScrollablePolicy): Unit =
        gtk_scrollable_set_vscroll_policy(gtkScrollablePointer.reinterpret(), policy.nativeValue)

    private data class Wrapper(
        private val pointer: CPointer<GtkScrollable>,
    ) : Scrollable {
        override val gtkScrollablePointer: CPointer<GtkScrollable> = pointer
    }

    public companion object : TypeCompanion<Scrollable> {
        override val type: GeneratedInterfaceKGType<Scrollable> =
            GeneratedInterfaceKGType(gtk_scrollable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkScrollable>): Scrollable = Wrapper(pointer)
    }
}
