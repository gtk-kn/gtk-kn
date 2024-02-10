// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkGravity
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_CENTER
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_EAST
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_NORTH
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_NORTH_EAST
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_NORTH_WEST
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_SOUTH
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_SOUTH_EAST
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_SOUTH_WEST
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_STATIC
import org.gtkkn.native.gdk.GdkGravity.GDK_GRAVITY_WEST

/**
 * Defines the reference point of a surface and is used in `GdkPopupLayout`.
 */
public enum class Gravity(
    public val nativeValue: GdkGravity,
) {
    /**
     * the reference point is at the top left corner.
     */
    NORTH_WEST(GDK_GRAVITY_NORTH_WEST),

    /**
     * the reference point is in the middle of the top edge.
     */
    NORTH(GDK_GRAVITY_NORTH),

    /**
     * the reference point is at the top right corner.
     */
    NORTH_EAST(GDK_GRAVITY_NORTH_EAST),

    /**
     * the reference point is at the middle of the left edge.
     */
    WEST(GDK_GRAVITY_WEST),

    /**
     * the reference point is at the center of the surface.
     */
    CENTER(GDK_GRAVITY_CENTER),

    /**
     * the reference point is at the middle of the right edge.
     */
    EAST(GDK_GRAVITY_EAST),

    /**
     * the reference point is at the lower left corner.
     */
    SOUTH_WEST(GDK_GRAVITY_SOUTH_WEST),

    /**
     * the reference point is at the middle of the lower edge.
     */
    SOUTH(GDK_GRAVITY_SOUTH),

    /**
     * the reference point is at the lower right corner.
     */
    SOUTH_EAST(GDK_GRAVITY_SOUTH_EAST),

    /**
     * the reference point is at the top left corner of the
     *  surface itself, ignoring window manager decorations.
     */
    STATIC(GDK_GRAVITY_STATIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkGravity): Gravity =
            when (nativeValue) {
                GDK_GRAVITY_NORTH_WEST -> NORTH_WEST
                GDK_GRAVITY_NORTH -> NORTH
                GDK_GRAVITY_NORTH_EAST -> NORTH_EAST
                GDK_GRAVITY_WEST -> WEST
                GDK_GRAVITY_CENTER -> CENTER
                GDK_GRAVITY_EAST -> EAST
                GDK_GRAVITY_SOUTH_WEST -> SOUTH_WEST
                GDK_GRAVITY_SOUTH -> SOUTH
                GDK_GRAVITY_SOUTH_EAST -> SOUTH_EAST
                GDK_GRAVITY_STATIC -> STATIC
                else -> error("invalid nativeValue")
            }
    }
}
