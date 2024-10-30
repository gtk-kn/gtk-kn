// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkScrollInfo
import org.gtkkn.native.gtk.gtk_scroll_info_get_enable_horizontal
import org.gtkkn.native.gtk.gtk_scroll_info_get_enable_vertical
import org.gtkkn.native.gtk.gtk_scroll_info_new
import org.gtkkn.native.gtk.gtk_scroll_info_ref
import org.gtkkn.native.gtk.gtk_scroll_info_set_enable_horizontal
import org.gtkkn.native.gtk.gtk_scroll_info_set_enable_vertical
import org.gtkkn.native.gtk.gtk_scroll_info_unref
import kotlin.Boolean
import kotlin.Unit

/**
 * The `GtkScrollInfo` can be used to provide more accurate data on how a scroll
 * operation should be performed.
 *
 * Scrolling functions usually allow passing a null scroll info which will cause
 * the default values to be used and just scroll the element into view.
 * @since 4.12
 */
public class ScrollInfo(
    pointer: CPointer<GtkScrollInfo>,
) : Record {
    public val gtkScrollInfoPointer: CPointer<GtkScrollInfo> = pointer

    /**
     * Checks if horizontal scrolling is enabled.
     *
     * @return true if horizontal scrolling is enabled.
     * @since 4.12
     */
    public fun getEnableHorizontal(): Boolean =
        gtk_scroll_info_get_enable_horizontal(gtkScrollInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if vertical scrolling is enabled.
     *
     * @return true if vertical scrolling is enabled.
     * @since 4.12
     */
    public fun getEnableVertical(): Boolean =
        gtk_scroll_info_get_enable_vertical(gtkScrollInfoPointer.reinterpret()).asBoolean()

    /**
     * Increases the reference count of a `GtkScrollInfo` by one.
     *
     * @return the passed in `GtkScrollInfo`.
     * @since 4.12
     */
    public fun ref(): ScrollInfo =
        gtk_scroll_info_ref(gtkScrollInfoPointer.reinterpret())!!.run {
            ScrollInfo(reinterpret())
        }

    /**
     * Turns horizontal scrolling on or off.
     *
     * @param horizontal if scrolling in the horizontal direction
     *     should happen
     * @since 4.12
     */
    public fun setEnableHorizontal(horizontal: Boolean): Unit =
        gtk_scroll_info_set_enable_horizontal(gtkScrollInfoPointer.reinterpret(), horizontal.asGBoolean())

    /**
     * Turns vertical scrolling on or off.
     *
     * @param vertical if scrolling in the vertical direction
     *     should happen
     * @since 4.12
     */
    public fun setEnableVertical(vertical: Boolean): Unit =
        gtk_scroll_info_set_enable_vertical(gtkScrollInfoPointer.reinterpret(), vertical.asGBoolean())

    /**
     * Decreases the reference count of a `GtkScrollInfo` by one.
     *
     * If the resulting reference count is zero, frees the self.
     *
     * @since 4.12
     */
    public fun unref(): Unit = gtk_scroll_info_unref(gtkScrollInfoPointer.reinterpret())

    public companion object : RecordCompanion<ScrollInfo, GtkScrollInfo> {
        /**
         * Creates a new scroll info for scrolling an element into view.
         *
         * @return A new scroll info
         * @since 4.12
         */
        public fun new(): ScrollInfo = ScrollInfo(gtk_scroll_info_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ScrollInfo = ScrollInfo(pointer.reinterpret())
    }
}
