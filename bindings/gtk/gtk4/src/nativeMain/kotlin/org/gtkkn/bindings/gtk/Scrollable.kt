// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
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
    Proxy,
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
        get() = gtk_scrollable_get_hadjustment(gtkScrollablePointer)?.run {
            Adjustment(this)
        }

        /**
         * Sets the horizontal adjustment of the `GtkScrollable`.
         *
         * @param hadjustment a `GtkAdjustment`
         */
        set(hadjustment) = gtk_scrollable_set_hadjustment(gtkScrollablePointer, hadjustment?.gtkAdjustmentPointer)

    /**
     * Determines when horizontal scrolling should start.
     */
    public var hscrollPolicy: ScrollablePolicy
        /**
         * Gets the horizontal `GtkScrollablePolicy`.
         *
         * @return The horizontal `GtkScrollablePolicy`.
         */
        get() = gtk_scrollable_get_hscroll_policy(gtkScrollablePointer).run {
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
        set(policy) = gtk_scrollable_set_hscroll_policy(gtkScrollablePointer, policy.nativeValue)

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
        get() = gtk_scrollable_get_vadjustment(gtkScrollablePointer)?.run {
            Adjustment(this)
        }

        /**
         * Sets the vertical adjustment of the `GtkScrollable`.
         *
         * @param vadjustment a `GtkAdjustment`
         */
        set(vadjustment) = gtk_scrollable_set_vadjustment(gtkScrollablePointer, vadjustment?.gtkAdjustmentPointer)

    /**
     * Determines when vertical scrolling should start.
     */
    public var vscrollPolicy: ScrollablePolicy
        /**
         * Gets the vertical `GtkScrollablePolicy`.
         *
         * @return The vertical `GtkScrollablePolicy`.
         */
        get() = gtk_scrollable_get_vscroll_policy(gtkScrollablePointer).run {
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
        set(policy) = gtk_scrollable_set_vscroll_policy(gtkScrollablePointer, policy.nativeValue)

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
        gtk_scrollable_get_border(gtkScrollablePointer, border.gtkBorderPointer).asBoolean()

    /**
     * Retrieves the `GtkAdjustment` used for horizontal scrolling.
     *
     * @return horizontal `GtkAdjustment`.
     */
    public fun getHadjustment(): Adjustment? = gtk_scrollable_get_hadjustment(gtkScrollablePointer)?.run {
        Adjustment(this)
    }

    /**
     * Gets the horizontal `GtkScrollablePolicy`.
     *
     * @return The horizontal `GtkScrollablePolicy`.
     */
    public fun getHscrollPolicy(): ScrollablePolicy = gtk_scrollable_get_hscroll_policy(gtkScrollablePointer).run {
        ScrollablePolicy.fromNativeValue(this)
    }

    /**
     * Retrieves the `GtkAdjustment` used for vertical scrolling.
     *
     * @return vertical `GtkAdjustment`.
     */
    public fun getVadjustment(): Adjustment? = gtk_scrollable_get_vadjustment(gtkScrollablePointer)?.run {
        Adjustment(this)
    }

    /**
     * Gets the vertical `GtkScrollablePolicy`.
     *
     * @return The vertical `GtkScrollablePolicy`.
     */
    public fun getVscrollPolicy(): ScrollablePolicy = gtk_scrollable_get_vscroll_policy(gtkScrollablePointer).run {
        ScrollablePolicy.fromNativeValue(this)
    }

    /**
     * Sets the horizontal adjustment of the `GtkScrollable`.
     *
     * @param hadjustment a `GtkAdjustment`
     */
    public fun setHadjustment(hadjustment: Adjustment? = null): Unit =
        gtk_scrollable_set_hadjustment(gtkScrollablePointer, hadjustment?.gtkAdjustmentPointer)

    /**
     * Sets the `GtkScrollablePolicy`.
     *
     * The policy determines whether horizontal scrolling should start
     * below the minimum width or below the natural width.
     *
     * @param policy the horizontal `GtkScrollablePolicy`
     */
    public fun setHscrollPolicy(policy: ScrollablePolicy): Unit =
        gtk_scrollable_set_hscroll_policy(gtkScrollablePointer, policy.nativeValue)

    /**
     * Sets the vertical adjustment of the `GtkScrollable`.
     *
     * @param vadjustment a `GtkAdjustment`
     */
    public fun setVadjustment(vadjustment: Adjustment? = null): Unit =
        gtk_scrollable_set_vadjustment(gtkScrollablePointer, vadjustment?.gtkAdjustmentPointer)

    /**
     * Sets the `GtkScrollablePolicy`.
     *
     * The policy determines whether vertical scrolling should start
     * below the minimum height or below the natural height.
     *
     * @param policy the vertical `GtkScrollablePolicy`
     */
    public fun setVscrollPolicy(policy: ScrollablePolicy): Unit =
        gtk_scrollable_set_vscroll_policy(gtkScrollablePointer, policy.nativeValue)

    /**
     * The ScrollableImpl type represents a native instance of the Scrollable interface.
     *
     * @constructor Creates a new instance of Scrollable for the provided [CPointer].
     */
    public data class ScrollableImpl(override val gtkScrollablePointer: CPointer<GtkScrollable>) :
        Object(gtkScrollablePointer.reinterpret()),
        Scrollable

    public companion object : TypeCompanion<Scrollable> {
        override val type: GeneratedInterfaceKGType<Scrollable> =
            GeneratedInterfaceKGType(gtk_scrollable_get_type()) { ScrollableImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Scrollable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_scrollable_get_type()
    }
}
