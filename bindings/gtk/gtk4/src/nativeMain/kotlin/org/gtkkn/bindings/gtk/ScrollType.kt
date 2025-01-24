// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.gtk_scroll_type_get_type

/**
 * Scrolling types.
 */
public enum class ScrollType(public val nativeValue: GtkScrollType) {
    /**
     * No scrolling.
     */
    NONE(GtkScrollType.GTK_SCROLL_NONE),

    /**
     * Jump to new location.
     */
    JUMP(GtkScrollType.GTK_SCROLL_JUMP),

    /**
     * Step backward.
     */
    STEP_BACKWARD(GtkScrollType.GTK_SCROLL_STEP_BACKWARD),

    /**
     * Step forward.
     */
    STEP_FORWARD(GtkScrollType.GTK_SCROLL_STEP_FORWARD),

    /**
     * Page backward.
     */
    PAGE_BACKWARD(GtkScrollType.GTK_SCROLL_PAGE_BACKWARD),

    /**
     * Page forward.
     */
    PAGE_FORWARD(GtkScrollType.GTK_SCROLL_PAGE_FORWARD),

    /**
     * Step up.
     */
    STEP_UP(GtkScrollType.GTK_SCROLL_STEP_UP),

    /**
     * Step down.
     */
    STEP_DOWN(GtkScrollType.GTK_SCROLL_STEP_DOWN),

    /**
     * Page up.
     */
    PAGE_UP(GtkScrollType.GTK_SCROLL_PAGE_UP),

    /**
     * Page down.
     */
    PAGE_DOWN(GtkScrollType.GTK_SCROLL_PAGE_DOWN),

    /**
     * Step to the left.
     */
    STEP_LEFT(GtkScrollType.GTK_SCROLL_STEP_LEFT),

    /**
     * Step to the right.
     */
    STEP_RIGHT(GtkScrollType.GTK_SCROLL_STEP_RIGHT),

    /**
     * Page to the left.
     */
    PAGE_LEFT(GtkScrollType.GTK_SCROLL_PAGE_LEFT),

    /**
     * Page to the right.
     */
    PAGE_RIGHT(GtkScrollType.GTK_SCROLL_PAGE_RIGHT),

    /**
     * Scroll to start.
     */
    START(GtkScrollType.GTK_SCROLL_START),

    /**
     * Scroll to end.
     */
    END(GtkScrollType.GTK_SCROLL_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkScrollType): ScrollType = when (nativeValue) {
            GtkScrollType.GTK_SCROLL_NONE -> NONE
            GtkScrollType.GTK_SCROLL_JUMP -> JUMP
            GtkScrollType.GTK_SCROLL_STEP_BACKWARD -> STEP_BACKWARD
            GtkScrollType.GTK_SCROLL_STEP_FORWARD -> STEP_FORWARD
            GtkScrollType.GTK_SCROLL_PAGE_BACKWARD -> PAGE_BACKWARD
            GtkScrollType.GTK_SCROLL_PAGE_FORWARD -> PAGE_FORWARD
            GtkScrollType.GTK_SCROLL_STEP_UP -> STEP_UP
            GtkScrollType.GTK_SCROLL_STEP_DOWN -> STEP_DOWN
            GtkScrollType.GTK_SCROLL_PAGE_UP -> PAGE_UP
            GtkScrollType.GTK_SCROLL_PAGE_DOWN -> PAGE_DOWN
            GtkScrollType.GTK_SCROLL_STEP_LEFT -> STEP_LEFT
            GtkScrollType.GTK_SCROLL_STEP_RIGHT -> STEP_RIGHT
            GtkScrollType.GTK_SCROLL_PAGE_LEFT -> PAGE_LEFT
            GtkScrollType.GTK_SCROLL_PAGE_RIGHT -> PAGE_RIGHT
            GtkScrollType.GTK_SCROLL_START -> START
            GtkScrollType.GTK_SCROLL_END -> END
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ScrollType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_scroll_type_get_type()
    }
}
