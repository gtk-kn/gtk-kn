// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkGravity

/**
 * Defines the reference point of a surface and is used in `GdkPopupLayout`.
 */
public enum class Gravity(
    public val nativeValue: GdkGravity,
) {
    /**
     * the reference point is at the top left corner.
     */
    NORTH_WEST(GdkGravity.GDK_GRAVITY_NORTH_WEST),

    /**
     * the reference point is in the middle of the top edge.
     */
    NORTH(GdkGravity.GDK_GRAVITY_NORTH),

    /**
     * the reference point is at the top right corner.
     */
    NORTH_EAST(GdkGravity.GDK_GRAVITY_NORTH_EAST),

    /**
     * the reference point is at the middle of the left edge.
     */
    WEST(GdkGravity.GDK_GRAVITY_WEST),

    /**
     * the reference point is at the center of the surface.
     */
    CENTER(GdkGravity.GDK_GRAVITY_CENTER),

    /**
     * the reference point is at the middle of the right edge.
     */
    EAST(GdkGravity.GDK_GRAVITY_EAST),

    /**
     * the reference point is at the lower left corner.
     */
    SOUTH_WEST(GdkGravity.GDK_GRAVITY_SOUTH_WEST),

    /**
     * the reference point is at the middle of the lower edge.
     */
    SOUTH(GdkGravity.GDK_GRAVITY_SOUTH),

    /**
     * the reference point is at the lower right corner.
     */
    SOUTH_EAST(GdkGravity.GDK_GRAVITY_SOUTH_EAST),

    /**
     * the reference point is at the top left corner of the
     *  surface itself, ignoring window manager decorations.
     */
    STATIC(GdkGravity.GDK_GRAVITY_STATIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkGravity): Gravity =
            when (nativeValue) {
                GdkGravity.GDK_GRAVITY_NORTH_WEST -> NORTH_WEST
                GdkGravity.GDK_GRAVITY_NORTH -> NORTH
                GdkGravity.GDK_GRAVITY_NORTH_EAST -> NORTH_EAST
                GdkGravity.GDK_GRAVITY_WEST -> WEST
                GdkGravity.GDK_GRAVITY_CENTER -> CENTER
                GdkGravity.GDK_GRAVITY_EAST -> EAST
                GdkGravity.GDK_GRAVITY_SOUTH_WEST -> SOUTH_WEST
                GdkGravity.GDK_GRAVITY_SOUTH -> SOUTH
                GdkGravity.GDK_GRAVITY_SOUTH_EAST -> SOUTH_EAST
                GdkGravity.GDK_GRAVITY_STATIC -> STATIC
                else -> error("invalid nativeValue")
            }
    }
}
