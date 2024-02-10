// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkSurfaceEdge
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_EAST
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_EAST
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_WEST
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_EAST
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_WEST
import org.gtkkn.native.gdk.GdkSurfaceEdge.GDK_SURFACE_EDGE_WEST

/**
 * Determines a surface edge or corner.
 */
public enum class SurfaceEdge(
    public val nativeValue: GdkSurfaceEdge,
) {
    /**
     * the top left corner.
     */
    NORTH_WEST(GDK_SURFACE_EDGE_NORTH_WEST),

    /**
     * the top edge.
     */
    NORTH(GDK_SURFACE_EDGE_NORTH),

    /**
     * the top right corner.
     */
    NORTH_EAST(GDK_SURFACE_EDGE_NORTH_EAST),

    /**
     * the left edge.
     */
    WEST(GDK_SURFACE_EDGE_WEST),

    /**
     * the right edge.
     */
    EAST(GDK_SURFACE_EDGE_EAST),

    /**
     * the lower left corner.
     */
    SOUTH_WEST(GDK_SURFACE_EDGE_SOUTH_WEST),

    /**
     * the lower edge.
     */
    SOUTH(GDK_SURFACE_EDGE_SOUTH),

    /**
     * the lower right corner.
     */
    SOUTH_EAST(GDK_SURFACE_EDGE_SOUTH_EAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkSurfaceEdge): SurfaceEdge =
            when (nativeValue) {
                GDK_SURFACE_EDGE_NORTH_WEST -> NORTH_WEST
                GDK_SURFACE_EDGE_NORTH -> NORTH
                GDK_SURFACE_EDGE_NORTH_EAST -> NORTH_EAST
                GDK_SURFACE_EDGE_WEST -> WEST
                GDK_SURFACE_EDGE_EAST -> EAST
                GDK_SURFACE_EDGE_SOUTH_WEST -> SOUTH_WEST
                GDK_SURFACE_EDGE_SOUTH -> SOUTH
                GDK_SURFACE_EDGE_SOUTH_EAST -> SOUTH_EAST
                else -> error("invalid nativeValue")
            }
    }
}
