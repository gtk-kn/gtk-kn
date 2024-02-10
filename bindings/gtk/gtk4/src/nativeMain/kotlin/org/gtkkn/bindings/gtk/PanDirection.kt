// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPanDirection
import org.gtkkn.native.gtk.GtkPanDirection.GTK_PAN_DIRECTION_DOWN
import org.gtkkn.native.gtk.GtkPanDirection.GTK_PAN_DIRECTION_LEFT
import org.gtkkn.native.gtk.GtkPanDirection.GTK_PAN_DIRECTION_RIGHT
import org.gtkkn.native.gtk.GtkPanDirection.GTK_PAN_DIRECTION_UP

/**
 * Describes the panning direction of a [class@GesturePan].
 */
public enum class PanDirection(
    public val nativeValue: GtkPanDirection,
) {
    /**
     * panned towards the left
     */
    LEFT(GTK_PAN_DIRECTION_LEFT),

    /**
     * panned towards the right
     */
    RIGHT(GTK_PAN_DIRECTION_RIGHT),

    /**
     * panned upwards
     */
    UP(GTK_PAN_DIRECTION_UP),

    /**
     * panned downwards
     */
    DOWN(GTK_PAN_DIRECTION_DOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPanDirection): PanDirection =
            when (nativeValue) {
                GTK_PAN_DIRECTION_LEFT -> LEFT
                GTK_PAN_DIRECTION_RIGHT -> RIGHT
                GTK_PAN_DIRECTION_UP -> UP
                GTK_PAN_DIRECTION_DOWN -> DOWN
                else -> error("invalid nativeValue")
            }
    }
}
