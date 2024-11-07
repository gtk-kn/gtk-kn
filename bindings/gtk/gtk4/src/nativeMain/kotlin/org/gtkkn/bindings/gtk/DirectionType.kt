// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkDirectionType

/**
 * Focus movement types.
 */
public enum class DirectionType(
    public val nativeValue: GtkDirectionType,
) {
    /**
     * Move forward.
     */
    TAB_FORWARD(GtkDirectionType.GTK_DIR_TAB_FORWARD),

    /**
     * Move backward.
     */
    TAB_BACKWARD(GtkDirectionType.GTK_DIR_TAB_BACKWARD),

    /**
     * Move up.
     */
    UP(GtkDirectionType.GTK_DIR_UP),

    /**
     * Move down.
     */
    DOWN(GtkDirectionType.GTK_DIR_DOWN),

    /**
     * Move left.
     */
    LEFT(GtkDirectionType.GTK_DIR_LEFT),

    /**
     * Move right.
     */
    RIGHT(GtkDirectionType.GTK_DIR_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkDirectionType): DirectionType =
            when (nativeValue) {
                GtkDirectionType.GTK_DIR_TAB_FORWARD -> TAB_FORWARD
                GtkDirectionType.GTK_DIR_TAB_BACKWARD -> TAB_BACKWARD
                GtkDirectionType.GTK_DIR_UP -> UP
                GtkDirectionType.GTK_DIR_DOWN -> DOWN
                GtkDirectionType.GTK_DIR_LEFT -> LEFT
                GtkDirectionType.GTK_DIR_RIGHT -> RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
