// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkToplevelSize
import org.gtkkn.native.gdk.gdk_toplevel_size_set_min_size
import org.gtkkn.native.gdk.gdk_toplevel_size_set_shadow_width
import org.gtkkn.native.gdk.gdk_toplevel_size_set_size
import org.gtkkn.native.glib.gint
import kotlin.Unit

/**
 * The `GdkToplevelSize` struct contains information that is useful
 * to compute the size of a toplevel.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `bounds_width`: bounds_width: Out parameter is not supported
 */
public class ToplevelSize(public val gdkToplevelSizePointer: CPointer<GdkToplevelSize>) :
    ProxyInstance(gdkToplevelSizePointer) {
    /**
     * Sets the minimum size of the toplevel.
     *
     * The minimum size corresponds to the limitations the toplevel can be shrunk
     * to, without resulting in incorrect painting. A user of a `GdkToplevel` should
     * calculate these given both the existing size, and the bounds retrieved from
     * the `GdkToplevelSize` object.
     *
     * The minimum size should be within the bounds (see
     * [method@Gdk.ToplevelSize.get_bounds]).
     *
     * @param minWidth the minimum width
     * @param minHeight the minimum height
     */
    public fun setMinSize(minWidth: gint, minHeight: gint): Unit =
        gdk_toplevel_size_set_min_size(gdkToplevelSizePointer, minWidth, minHeight)

    /**
     * Sets the shadows size of the toplevel.
     *
     * The shadow width corresponds to the part of the computed surface size
     * that would consist of the shadow margin surrounding the window, would
     * there be any.
     *
     * Shadow width should only be set if
     * [method@Gtk.Display.supports_shadow_width] is true.
     *
     * @param left width of the left part of the shadow
     * @param right width of the right part of the shadow
     * @param top height of the top part of the shadow
     * @param bottom height of the bottom part of the shadow
     */
    public fun setShadowWidth(left: gint, right: gint, top: gint, bottom: gint): Unit =
        gdk_toplevel_size_set_shadow_width(gdkToplevelSizePointer, left, right, top, bottom)

    /**
     * Sets the size the toplevel prefers to be resized to.
     *
     * The size should be within the bounds (see
     * [method@Gdk.ToplevelSize.get_bounds]). The set size should
     * be considered as a hint, and should not be assumed to be
     * respected by the windowing system, or backend.
     *
     * @param width the width
     * @param height the height
     */
    public fun setSize(width: gint, height: gint): Unit =
        gdk_toplevel_size_set_size(gdkToplevelSizePointer, width, height)
}
