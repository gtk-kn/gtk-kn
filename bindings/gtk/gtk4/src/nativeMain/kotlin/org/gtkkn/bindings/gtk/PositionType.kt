// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPositionType

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
    LEFT(GtkPositionType.GTK_POS_LEFT),

    /**
     * The feature is at the right edge.
     */
    RIGHT(GtkPositionType.GTK_POS_RIGHT),

    /**
     * The feature is at the top edge.
     */
    TOP(GtkPositionType.GTK_POS_TOP),

    /**
     * The feature is at the bottom edge.
     */
    BOTTOM(GtkPositionType.GTK_POS_BOTTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPositionType): PositionType =
            when (nativeValue) {
                GtkPositionType.GTK_POS_LEFT -> LEFT
                GtkPositionType.GTK_POS_RIGHT -> RIGHT
                GtkPositionType.GTK_POS_TOP -> TOP
                GtkPositionType.GTK_POS_BOTTOM -> BOTTOM
                else -> error("invalid nativeValue")
            }
    }
}
