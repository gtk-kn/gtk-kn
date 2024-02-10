// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkDirectionType
import org.gtkkn.native.gtk.GtkDirectionType.GTK_DIR_DOWN
import org.gtkkn.native.gtk.GtkDirectionType.GTK_DIR_LEFT
import org.gtkkn.native.gtk.GtkDirectionType.GTK_DIR_RIGHT
import org.gtkkn.native.gtk.GtkDirectionType.GTK_DIR_TAB_BACKWARD
import org.gtkkn.native.gtk.GtkDirectionType.GTK_DIR_TAB_FORWARD
import org.gtkkn.native.gtk.GtkDirectionType.GTK_DIR_UP

/**
 * Focus movement types.
 */
public enum class DirectionType(
    public val nativeValue: GtkDirectionType,
) {
    /**
     * Move forward.
     */
    TAB_FORWARD(GTK_DIR_TAB_FORWARD),

    /**
     * Move backward.
     */
    TAB_BACKWARD(GTK_DIR_TAB_BACKWARD),

    /**
     * Move up.
     */
    UP(GTK_DIR_UP),

    /**
     * Move down.
     */
    DOWN(GTK_DIR_DOWN),

    /**
     * Move left.
     */
    LEFT(GTK_DIR_LEFT),

    /**
     * Move right.
     */
    RIGHT(GTK_DIR_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkDirectionType): DirectionType =
            when (nativeValue) {
                GTK_DIR_TAB_FORWARD -> TAB_FORWARD
                GTK_DIR_TAB_BACKWARD -> TAB_BACKWARD
                GTK_DIR_UP -> UP
                GTK_DIR_DOWN -> DOWN
                GTK_DIR_LEFT -> LEFT
                GTK_DIR_RIGHT -> RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
