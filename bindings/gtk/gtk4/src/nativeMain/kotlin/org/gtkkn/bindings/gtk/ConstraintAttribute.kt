// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraintAttribute
import org.gtkkn.native.gtk.gtk_constraint_attribute_get_type

/**
 * The widget attributes that can be used when creating a [class@Constraint].
 */
public enum class ConstraintAttribute(public val nativeValue: GtkConstraintAttribute) {
    /**
     * No attribute, used for constant
     *   relations
     */
    NONE(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_NONE),

    /**
     * The left edge of a widget, regardless of
     *   text direction
     */
    LEFT(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_LEFT),

    /**
     * The right edge of a widget, regardless
     *   of text direction
     */
    RIGHT(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_RIGHT),

    /**
     * The top edge of a widget
     */
    TOP(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_TOP),

    /**
     * The bottom edge of a widget
     */
    BOTTOM(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BOTTOM),

    /**
     * The leading edge of a widget, depending
     *   on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR
     *   languages, and %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones
     */
    START(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_START),

    /**
     * The trailing edge of a widget, depending
     *   on text direction; equivalent to %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR
     *   languages, and %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones
     */
    END(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_END),

    /**
     * The width of a widget
     */
    WIDTH(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_WIDTH),

    /**
     * The height of a widget
     */
    HEIGHT(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_HEIGHT),

    /**
     * The center of a widget, on the
     *   horizontal axis
     */
    CENTER_X(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_X),

    /**
     * The center of a widget, on the
     *   vertical axis
     */
    CENTER_Y(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y),

    /**
     * The baseline of a widget
     */
    BASELINE(GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BASELINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintAttribute): ConstraintAttribute = when (nativeValue) {
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_NONE -> NONE
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_LEFT -> LEFT
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_RIGHT -> RIGHT
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_TOP -> TOP
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BOTTOM -> BOTTOM
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_START -> START
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_END -> END
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_WIDTH -> WIDTH
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_HEIGHT -> HEIGHT
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_X -> CENTER_X
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y -> CENTER_Y
            GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BASELINE -> BASELINE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ConstraintAttribute
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_attribute_get_type()
    }
}
