// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkScrollDirection
import org.gtkkn.native.gdk.GdkScrollDirection.GDK_SCROLL_DOWN
import org.gtkkn.native.gdk.GdkScrollDirection.GDK_SCROLL_LEFT
import org.gtkkn.native.gdk.GdkScrollDirection.GDK_SCROLL_RIGHT
import org.gtkkn.native.gdk.GdkScrollDirection.GDK_SCROLL_SMOOTH
import org.gtkkn.native.gdk.GdkScrollDirection.GDK_SCROLL_UP

/**
 * Specifies the direction for scroll events.
 */
public enum class ScrollDirection(
    public val nativeValue: GdkScrollDirection,
) {
    /**
     * the surface is scrolled up.
     */
    UP(GDK_SCROLL_UP),

    /**
     * the surface is scrolled down.
     */
    DOWN(GDK_SCROLL_DOWN),

    /**
     * the surface is scrolled to the left.
     */
    LEFT(GDK_SCROLL_LEFT),

    /**
     * the surface is scrolled to the right.
     */
    RIGHT(GDK_SCROLL_RIGHT),

    /**
     * the scrolling is determined by the delta values
     *   in scroll events. See gdk_scroll_event_get_deltas()
     */
    SMOOTH(GDK_SCROLL_SMOOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkScrollDirection): ScrollDirection =
            when (nativeValue) {
                GDK_SCROLL_UP -> UP
                GDK_SCROLL_DOWN -> DOWN
                GDK_SCROLL_LEFT -> LEFT
                GDK_SCROLL_RIGHT -> RIGHT
                GDK_SCROLL_SMOOTH -> SMOOTH
                else -> error("invalid nativeValue")
            }
    }
}
