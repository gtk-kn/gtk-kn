// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPositionType
import org.gtkkn.native.gtk.GtkPositionType.GTK_POS_BOTTOM
import org.gtkkn.native.gtk.GtkPositionType.GTK_POS_LEFT
import org.gtkkn.native.gtk.GtkPositionType.GTK_POS_RIGHT
import org.gtkkn.native.gtk.GtkPositionType.GTK_POS_TOP

/**
 * Describes which edge of a widget a certain feature is positioned at.
 *
 * For examples, see the tabs of a [class@Notebook], or the label
 * of a [class@Scale].
 */
public enum class PositionType(
    public val nativeValue: GtkPositionType,
) {
    /**
     * The feature is at the left edge.
     */
    LEFT(GTK_POS_LEFT),

    /**
     * The feature is at the right edge.
     */
    RIGHT(GTK_POS_RIGHT),

    /**
     * The feature is at the top edge.
     */
    TOP(GTK_POS_TOP),

    /**
     * The feature is at the bottom edge.
     */
    BOTTOM(GTK_POS_BOTTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPositionType): PositionType =
            when (nativeValue) {
                GTK_POS_LEFT -> LEFT
                GTK_POS_RIGHT -> RIGHT
                GTK_POS_TOP -> TOP
                GTK_POS_BOTTOM -> BOTTOM
                else -> error("invalid nativeValue")
            }
    }
}
