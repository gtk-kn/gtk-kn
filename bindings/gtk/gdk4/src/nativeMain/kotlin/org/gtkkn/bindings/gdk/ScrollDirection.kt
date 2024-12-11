// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkScrollDirection
import org.gtkkn.native.gdk.gdk_scroll_direction_get_type
import org.gtkkn.native.gobject.GType

/**
 * Specifies the direction for scroll events.
 */
public enum class ScrollDirection(public val nativeValue: GdkScrollDirection) {
    /**
     * the surface is scrolled up.
     */
    UP(GdkScrollDirection.GDK_SCROLL_UP),

    /**
     * the surface is scrolled down.
     */
    DOWN(GdkScrollDirection.GDK_SCROLL_DOWN),

    /**
     * the surface is scrolled to the left.
     */
    LEFT(GdkScrollDirection.GDK_SCROLL_LEFT),

    /**
     * the surface is scrolled to the right.
     */
    RIGHT(GdkScrollDirection.GDK_SCROLL_RIGHT),

    /**
     * the scrolling is determined by the delta values
     *   in scroll events. See gdk_scroll_event_get_deltas()
     */
    SMOOTH(GdkScrollDirection.GDK_SCROLL_SMOOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkScrollDirection): ScrollDirection = when (nativeValue) {
            GdkScrollDirection.GDK_SCROLL_UP -> UP
            GdkScrollDirection.GDK_SCROLL_DOWN -> DOWN
            GdkScrollDirection.GDK_SCROLL_LEFT -> LEFT
            GdkScrollDirection.GDK_SCROLL_RIGHT -> RIGHT
            GdkScrollDirection.GDK_SCROLL_SMOOTH -> SMOOTH
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ScrollDirection
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_scroll_direction_get_type()
    }
}
