// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkArrowType
import org.gtkkn.native.gtk.GtkArrowType.GTK_ARROW_DOWN
import org.gtkkn.native.gtk.GtkArrowType.GTK_ARROW_LEFT
import org.gtkkn.native.gtk.GtkArrowType.GTK_ARROW_NONE
import org.gtkkn.native.gtk.GtkArrowType.GTK_ARROW_RIGHT
import org.gtkkn.native.gtk.GtkArrowType.GTK_ARROW_UP

/**
 * Used to indicate the direction in which an arrow should point.
 */
public enum class ArrowType(
    public val nativeValue: GtkArrowType,
) {
    /**
     * Represents an upward pointing arrow.
     */
    UP(GTK_ARROW_UP),

    /**
     * Represents a downward pointing arrow.
     */
    DOWN(GTK_ARROW_DOWN),

    /**
     * Represents a left pointing arrow.
     */
    LEFT(GTK_ARROW_LEFT),

    /**
     * Represents a right pointing arrow.
     */
    RIGHT(GTK_ARROW_RIGHT),

    /**
     * No arrow.
     */
    NONE(GTK_ARROW_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkArrowType): ArrowType =
            when (nativeValue) {
                GTK_ARROW_UP -> UP
                GTK_ARROW_DOWN -> DOWN
                GTK_ARROW_LEFT -> LEFT
                GTK_ARROW_RIGHT -> RIGHT
                GTK_ARROW_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
