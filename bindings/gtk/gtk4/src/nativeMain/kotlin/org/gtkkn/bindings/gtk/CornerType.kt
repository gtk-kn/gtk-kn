// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkCornerType
import org.gtkkn.native.gtk.GtkCornerType.GTK_CORNER_BOTTOM_LEFT
import org.gtkkn.native.gtk.GtkCornerType.GTK_CORNER_BOTTOM_RIGHT
import org.gtkkn.native.gtk.GtkCornerType.GTK_CORNER_TOP_LEFT
import org.gtkkn.native.gtk.GtkCornerType.GTK_CORNER_TOP_RIGHT

/**
 * Specifies which corner a child widget should be placed in when packed into
 * a `GtkScrolledWindow.`
 *
 * This is effectively the opposite of where the scroll bars are placed.
 */
public enum class CornerType(
    public val nativeValue: GtkCornerType,
) {
    /**
     * Place the scrollbars on the right and bottom of the
     *   widget (default behaviour).
     */
    TOP_LEFT(GTK_CORNER_TOP_LEFT),

    /**
     * Place the scrollbars on the top and right of the
     *   widget.
     */
    BOTTOM_LEFT(GTK_CORNER_BOTTOM_LEFT),

    /**
     * Place the scrollbars on the left and bottom of the
     *   widget.
     */
    TOP_RIGHT(GTK_CORNER_TOP_RIGHT),

    /**
     * Place the scrollbars on the top and left of the
     *   widget.
     */
    BOTTOM_RIGHT(GTK_CORNER_BOTTOM_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCornerType): CornerType =
            when (nativeValue) {
                GTK_CORNER_TOP_LEFT -> TOP_LEFT
                GTK_CORNER_BOTTOM_LEFT -> BOTTOM_LEFT
                GTK_CORNER_TOP_RIGHT -> TOP_RIGHT
                GTK_CORNER_BOTTOM_RIGHT -> BOTTOM_RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
