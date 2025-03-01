// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkScrollInfo
import org.gtkkn.native.gtk.gtk_scroll_info_get_enable_horizontal
import org.gtkkn.native.gtk.gtk_scroll_info_get_enable_vertical
import org.gtkkn.native.gtk.gtk_scroll_info_get_type
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
@GtkVersion4_12
public class ScrollInfo(public val gtkScrollInfoPointer: CPointer<GtkScrollInfo>) :
    ProxyInstance(gtkScrollInfoPointer) {
    /**
     * Creates a new scroll info for scrolling an element into view.
     *
     * @return A new scroll info
     * @since 4.12
     */
    public constructor() : this(gtk_scroll_info_new()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks if horizontal scrolling is enabled.
     *
     * @return true if horizontal scrolling is enabled.
     * @since 4.12
     */
    @GtkVersion4_12
    public fun getEnableHorizontal(): Boolean = gtk_scroll_info_get_enable_horizontal(gtkScrollInfoPointer).asBoolean()

    /**
     * Checks if vertical scrolling is enabled.
     *
     * @return true if vertical scrolling is enabled.
     * @since 4.12
     */
    @GtkVersion4_12
    public fun getEnableVertical(): Boolean = gtk_scroll_info_get_enable_vertical(gtkScrollInfoPointer).asBoolean()

    /**
     * Increases the reference count of a `GtkScrollInfo` by one.
     *
     * @return the passed in `GtkScrollInfo`.
     * @since 4.12
     */
    @GtkVersion4_12
    public fun ref(): ScrollInfo = gtk_scroll_info_ref(gtkScrollInfoPointer)!!.run {
        ScrollInfo(this)
    }

    /**
     * Turns horizontal scrolling on or off.
     *
     * @param horizontal if scrolling in the horizontal direction
     *     should happen
     * @since 4.12
     */
    @GtkVersion4_12
    public fun setEnableHorizontal(horizontal: Boolean): Unit =
        gtk_scroll_info_set_enable_horizontal(gtkScrollInfoPointer, horizontal.asGBoolean())

    /**
     * Turns vertical scrolling on or off.
     *
     * @param vertical if scrolling in the vertical direction
     *     should happen
     * @since 4.12
     */
    @GtkVersion4_12
    public fun setEnableVertical(vertical: Boolean): Unit =
        gtk_scroll_info_set_enable_vertical(gtkScrollInfoPointer, vertical.asGBoolean())

    /**
     * Decreases the reference count of a `GtkScrollInfo` by one.
     *
     * If the resulting reference count is zero, frees the self.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public fun unref(): Unit = gtk_scroll_info_unref(gtkScrollInfoPointer)

    public companion object {
        /**
         * Get the GType of ScrollInfo
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_scroll_info_get_type()
    }
}
