// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_END
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_JUMP
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_NONE
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_PAGE_BACKWARD
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_PAGE_DOWN
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_PAGE_FORWARD
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_PAGE_LEFT
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_PAGE_RIGHT
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_PAGE_UP
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_START
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_STEP_BACKWARD
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_STEP_DOWN
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_STEP_FORWARD
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_STEP_LEFT
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_STEP_RIGHT
import org.gtkkn.native.gtk.GtkScrollType.GTK_SCROLL_STEP_UP

/**
 * Scrolling types.
 */
public enum class ScrollType(
    public val nativeValue: GtkScrollType,
) {
    /**
     * No scrolling.
     */
    NONE(GTK_SCROLL_NONE),

    /**
     * Jump to new location.
     */
    JUMP(GTK_SCROLL_JUMP),

    /**
     * Step backward.
     */
    STEP_BACKWARD(GTK_SCROLL_STEP_BACKWARD),

    /**
     * Step forward.
     */
    STEP_FORWARD(GTK_SCROLL_STEP_FORWARD),

    /**
     * Page backward.
     */
    PAGE_BACKWARD(GTK_SCROLL_PAGE_BACKWARD),

    /**
     * Page forward.
     */
    PAGE_FORWARD(GTK_SCROLL_PAGE_FORWARD),

    /**
     * Step up.
     */
    STEP_UP(GTK_SCROLL_STEP_UP),

    /**
     * Step down.
     */
    STEP_DOWN(GTK_SCROLL_STEP_DOWN),

    /**
     * Page up.
     */
    PAGE_UP(GTK_SCROLL_PAGE_UP),

    /**
     * Page down.
     */
    PAGE_DOWN(GTK_SCROLL_PAGE_DOWN),

    /**
     * Step to the left.
     */
    STEP_LEFT(GTK_SCROLL_STEP_LEFT),

    /**
     * Step to the right.
     */
    STEP_RIGHT(GTK_SCROLL_STEP_RIGHT),

    /**
     * Page to the left.
     */
    PAGE_LEFT(GTK_SCROLL_PAGE_LEFT),

    /**
     * Page to the right.
     */
    PAGE_RIGHT(GTK_SCROLL_PAGE_RIGHT),

    /**
     * Scroll to start.
     */
    START(GTK_SCROLL_START),

    /**
     * Scroll to end.
     */
    END(GTK_SCROLL_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkScrollType): ScrollType =
            when (nativeValue) {
                GTK_SCROLL_NONE -> NONE
                GTK_SCROLL_JUMP -> JUMP
                GTK_SCROLL_STEP_BACKWARD -> STEP_BACKWARD
                GTK_SCROLL_STEP_FORWARD -> STEP_FORWARD
                GTK_SCROLL_PAGE_BACKWARD -> PAGE_BACKWARD
                GTK_SCROLL_PAGE_FORWARD -> PAGE_FORWARD
                GTK_SCROLL_STEP_UP -> STEP_UP
                GTK_SCROLL_STEP_DOWN -> STEP_DOWN
                GTK_SCROLL_PAGE_UP -> PAGE_UP
                GTK_SCROLL_PAGE_DOWN -> PAGE_DOWN
                GTK_SCROLL_STEP_LEFT -> STEP_LEFT
                GTK_SCROLL_STEP_RIGHT -> STEP_RIGHT
                GTK_SCROLL_PAGE_LEFT -> PAGE_LEFT
                GTK_SCROLL_PAGE_RIGHT -> PAGE_RIGHT
                GTK_SCROLL_START -> START
                GTK_SCROLL_END -> END
                else -> error("invalid nativeValue")
            }
    }
}
