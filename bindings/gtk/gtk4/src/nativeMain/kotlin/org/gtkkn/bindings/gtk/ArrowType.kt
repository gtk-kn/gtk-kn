// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkArrowType
import org.gtkkn.native.gtk.gtk_arrow_type_get_type

/**
 * Used to indicate the direction in which an arrow should point.
 */
public enum class ArrowType(public val nativeValue: GtkArrowType) {
    /**
     * Represents an upward pointing arrow.
     */
    UP(GtkArrowType.GTK_ARROW_UP),

    /**
     * Represents a downward pointing arrow.
     */
    DOWN(GtkArrowType.GTK_ARROW_DOWN),

    /**
     * Represents a left pointing arrow.
     */
    LEFT(GtkArrowType.GTK_ARROW_LEFT),

    /**
     * Represents a right pointing arrow.
     */
    RIGHT(GtkArrowType.GTK_ARROW_RIGHT),

    /**
     * No arrow.
     */
    NONE(GtkArrowType.GTK_ARROW_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkArrowType): ArrowType = when (nativeValue) {
            GtkArrowType.GTK_ARROW_UP -> UP
            GtkArrowType.GTK_ARROW_DOWN -> DOWN
            GtkArrowType.GTK_ARROW_LEFT -> LEFT
            GtkArrowType.GTK_ARROW_RIGHT -> RIGHT
            GtkArrowType.GTK_ARROW_NONE -> NONE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ArrowType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_arrow_type_get_type()
    }
}
