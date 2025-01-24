// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_12
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkDragSurfaceSize
import org.gtkkn.native.gdk.gdk_drag_surface_size_set_size
import org.gtkkn.native.glib.gint
import kotlin.Unit

/**
 * The `GdkDragSurfaceSize` struct contains information that is useful
 * to compute the size of a drag surface.
 * @since 4.12
 */
@GdkVersion4_12
public class DragSurfaceSize(public val gdkDragSurfaceSizePointer: CPointer<GdkDragSurfaceSize>) :
    ProxyInstance(gdkDragSurfaceSizePointer) {
    /**
     * Sets the size the drag surface prefers to be resized to.
     *
     * @param width the width
     * @param height the height
     * @since 4.12
     */
    @GdkVersion4_12
    public fun setSize(width: gint, height: gint): Unit =
        gdk_drag_surface_size_set_size(gdkDragSurfaceSizePointer, width, height)
}
