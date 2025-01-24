// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkSurfaceEdge
import org.gtkkn.native.gdk.gdk_surface_edge_get_type
import org.gtkkn.native.gobject.GType

/**
 * Determines a surface edge or corner.
 */
public enum class SurfaceEdge(public val nativeValue: GdkSurfaceEdge) {
    /**
     * the top left corner.
     */
    NORTH_WEST(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_WEST),

    /**
     * the top edge.
     */
    NORTH(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH),

    /**
     * the top right corner.
     */
    NORTH_EAST(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_EAST),

    /**
     * the left edge.
     */
    WEST(GdkSurfaceEdge.GDK_SURFACE_EDGE_WEST),

    /**
     * the right edge.
     */
    EAST(GdkSurfaceEdge.GDK_SURFACE_EDGE_EAST),

    /**
     * the lower left corner.
     */
    SOUTH_WEST(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_WEST),

    /**
     * the lower edge.
     */
    SOUTH(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH),

    /**
     * the lower right corner.
     */
    SOUTH_EAST(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_EAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkSurfaceEdge): SurfaceEdge = when (nativeValue) {
            GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_WEST -> NORTH_WEST
            GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH -> NORTH
            GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_EAST -> NORTH_EAST
            GdkSurfaceEdge.GDK_SURFACE_EDGE_WEST -> WEST
            GdkSurfaceEdge.GDK_SURFACE_EDGE_EAST -> EAST
            GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_WEST -> SOUTH_WEST
            GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH -> SOUTH
            GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_EAST -> SOUTH_EAST
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SurfaceEdge
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_surface_edge_get_type()
    }
}
