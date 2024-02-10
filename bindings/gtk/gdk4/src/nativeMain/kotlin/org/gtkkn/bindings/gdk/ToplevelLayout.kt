// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkToplevelLayout
import org.gtkkn.native.gdk.gdk_toplevel_layout_copy
import org.gtkkn.native.gdk.gdk_toplevel_layout_equal
import org.gtkkn.native.gdk.gdk_toplevel_layout_get_fullscreen_monitor
import org.gtkkn.native.gdk.gdk_toplevel_layout_get_resizable
import org.gtkkn.native.gdk.gdk_toplevel_layout_new
import org.gtkkn.native.gdk.gdk_toplevel_layout_ref
import org.gtkkn.native.gdk.gdk_toplevel_layout_set_fullscreen
import org.gtkkn.native.gdk.gdk_toplevel_layout_set_maximized
import org.gtkkn.native.gdk.gdk_toplevel_layout_set_resizable
import org.gtkkn.native.gdk.gdk_toplevel_layout_unref
import kotlin.Boolean
import kotlin.Unit

/**
 * The `GdkToplevelLayout` struct contains information that
 * is necessary to present a sovereign window on screen.
 *
 * The `GdkToplevelLayout` struct is necessary for using
 * [method@Gdk.Toplevel.present].
 *
 * Toplevel surfaces are sovereign windows that can be presented
 * to the user in various states (maximized, on all workspaces,
 * etc).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `fullscreen`: fullscreen: Out parameter is not supported
 * - parameter `maximized`: maximized: Out parameter is not supported
 */
public class ToplevelLayout(
    pointer: CPointer<GdkToplevelLayout>,
) : Record {
    public val gdkToplevelLayoutPointer: CPointer<GdkToplevelLayout> = pointer

    /**
     * Create a new `GdkToplevelLayout` and copy the contents of @layout into it.
     *
     * @return a copy of @layout.
     */
    public fun copy(): ToplevelLayout =
        gdk_toplevel_layout_copy(gdkToplevelLayoutPointer.reinterpret())!!.run {
            ToplevelLayout(reinterpret())
        }

    /**
     * Check whether @layout and @other has identical layout properties.
     *
     * @param other another `GdkToplevelLayout`
     * @return true if @layout and @other have identical layout properties,
     *   otherwise false.
     */
    public fun equal(other: ToplevelLayout): Boolean =
        gdk_toplevel_layout_equal(
            gdkToplevelLayoutPointer.reinterpret(),
            other.gdkToplevelLayoutPointer
        ).asBoolean()

    /**
     * Returns the monitor that the layout is fullscreening
     * the surface on.
     *
     * @return the monitor on which @layout fullscreens
     */
    public fun getFullscreenMonitor(): Monitor? =
        gdk_toplevel_layout_get_fullscreen_monitor(gdkToplevelLayoutPointer.reinterpret())?.run {
            Monitor(reinterpret())
        }

    /**
     * Returns whether the layout should allow the user
     * to resize the surface.
     *
     * @return true if the layout is resizable
     */
    public fun getResizable(): Boolean =
        gdk_toplevel_layout_get_resizable(gdkToplevelLayoutPointer.reinterpret()).asBoolean()

    /**
     * Increases the reference count of @layout.
     *
     * @return the same @layout
     */
    public fun ref(): ToplevelLayout =
        gdk_toplevel_layout_ref(gdkToplevelLayoutPointer.reinterpret())!!.run {
            ToplevelLayout(reinterpret())
        }

    /**
     * Sets whether the layout should cause the surface
     * to be fullscreen when presented.
     *
     * @param fullscreen true to fullscreen the surface
     * @param monitor the monitor to fullscreen on
     */
    public fun setFullscreen(
        fullscreen: Boolean,
        monitor: Monitor? = null,
    ): Unit =
        gdk_toplevel_layout_set_fullscreen(
            gdkToplevelLayoutPointer.reinterpret(),
            fullscreen.asGBoolean(),
            monitor?.gdkMonitorPointer?.reinterpret()
        )

    /**
     * Sets whether the layout should cause the surface
     * to be maximized when presented.
     *
     * @param maximized true to maximize
     */
    public fun setMaximized(maximized: Boolean): Unit =
        gdk_toplevel_layout_set_maximized(
            gdkToplevelLayoutPointer.reinterpret(),
            maximized.asGBoolean()
        )

    /**
     * Sets whether the layout should allow the user
     * to resize the surface after it has been presented.
     *
     * @param resizable true to allow resizing
     */
    public fun setResizable(resizable: Boolean): Unit =
        gdk_toplevel_layout_set_resizable(
            gdkToplevelLayoutPointer.reinterpret(),
            resizable.asGBoolean()
        )

    /**
     * Decreases the reference count of @layout.
     */
    public fun unref(): Unit = gdk_toplevel_layout_unref(gdkToplevelLayoutPointer.reinterpret())

    public companion object : RecordCompanion<ToplevelLayout, GdkToplevelLayout> {
        /**
         * Create a toplevel layout description.
         *
         * Used together with gdk_toplevel_present() to describe
         * how a toplevel surface should be placed and behave on-screen.
         *
         * The size is in ”application pixels”, not
         * ”device pixels” (see gdk_surface_get_scale_factor()).
         *
         * @return newly created instance of `GdkToplevelLayout`
         */
        public fun new(): ToplevelLayout = ToplevelLayout(gdk_toplevel_layout_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ToplevelLayout =
            ToplevelLayout(pointer.reinterpret())
    }
}
