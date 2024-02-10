// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkConstraintAttribute
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BASELINE
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BOTTOM
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_X
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_END
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_HEIGHT
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_LEFT
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_NONE
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_RIGHT
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_START
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_TOP
import org.gtkkn.native.gtk.GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_WIDTH

/**
 * The widget attributes that can be used when creating a [class@Constraint].
 */
public enum class ConstraintAttribute(
    public val nativeValue: GtkConstraintAttribute,
) {
    /**
     * No attribute, used for constant
     *   relations
     */
    NONE(GTK_CONSTRAINT_ATTRIBUTE_NONE),

    /**
     * The left edge of a widget, regardless of
     *   text direction
     */
    LEFT(GTK_CONSTRAINT_ATTRIBUTE_LEFT),

    /**
     * The right edge of a widget, regardless
     *   of text direction
     */
    RIGHT(GTK_CONSTRAINT_ATTRIBUTE_RIGHT),

    /**
     * The top edge of a widget
     */
    TOP(GTK_CONSTRAINT_ATTRIBUTE_TOP),

    /**
     * The bottom edge of a widget
     */
    BOTTOM(GTK_CONSTRAINT_ATTRIBUTE_BOTTOM),

    /**
     * The leading edge of a widget, depending
     *   on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR
     *   languages, and %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones
     */
    START(GTK_CONSTRAINT_ATTRIBUTE_START),

    /**
     * The trailing edge of a widget, depending
     *   on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR
     *   languages, and %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones
     */
    END(GTK_CONSTRAINT_ATTRIBUTE_END),

    /**
     * The width of a widget
     */
    WIDTH(GTK_CONSTRAINT_ATTRIBUTE_WIDTH),

    /**
     * The height of a widget
     */
    HEIGHT(GTK_CONSTRAINT_ATTRIBUTE_HEIGHT),

    /**
     * The center of a widget, on the
     *   horizontal axis
     */
    CENTER_X(GTK_CONSTRAINT_ATTRIBUTE_CENTER_X),

    /**
     * The center of a widget, on the
     *   vertical axis
     */
    CENTER_Y(GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y),

    /**
     * The baseline of a widget
     */
    BASELINE(GTK_CONSTRAINT_ATTRIBUTE_BASELINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintAttribute): ConstraintAttribute =
            when (nativeValue) {
                GTK_CONSTRAINT_ATTRIBUTE_NONE -> NONE
                GTK_CONSTRAINT_ATTRIBUTE_LEFT -> LEFT
                GTK_CONSTRAINT_ATTRIBUTE_RIGHT -> RIGHT
                GTK_CONSTRAINT_ATTRIBUTE_TOP -> TOP
                GTK_CONSTRAINT_ATTRIBUTE_BOTTOM -> BOTTOM
                GTK_CONSTRAINT_ATTRIBUTE_START -> START
                GTK_CONSTRAINT_ATTRIBUTE_END -> END
                GTK_CONSTRAINT_ATTRIBUTE_WIDTH -> WIDTH
                GTK_CONSTRAINT_ATTRIBUTE_HEIGHT -> HEIGHT
                GTK_CONSTRAINT_ATTRIBUTE_CENTER_X -> CENTER_X
                GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y -> CENTER_Y
                GTK_CONSTRAINT_ATTRIBUTE_BASELINE -> BASELINE
                else -> error("invalid nativeValue")
            }
    }
}
