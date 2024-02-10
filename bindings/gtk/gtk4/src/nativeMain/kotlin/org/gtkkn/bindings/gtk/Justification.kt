// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkJustification
import org.gtkkn.native.gtk.GtkJustification.GTK_JUSTIFY_CENTER
import org.gtkkn.native.gtk.GtkJustification.GTK_JUSTIFY_FILL
import org.gtkkn.native.gtk.GtkJustification.GTK_JUSTIFY_LEFT
import org.gtkkn.native.gtk.GtkJustification.GTK_JUSTIFY_RIGHT

/**
 * Used for justifying the text inside a [class@Label] widget.
 */
public enum class Justification(
    public val nativeValue: GtkJustification,
) {
    /**
     * The text is placed at the left edge of the label.
     */
    LEFT(GTK_JUSTIFY_LEFT),

    /**
     * The text is placed at the right edge of the label.
     */
    RIGHT(GTK_JUSTIFY_RIGHT),

    /**
     * The text is placed in the center of the label.
     */
    CENTER(GTK_JUSTIFY_CENTER),

    /**
     * The text is placed is distributed across the label.
     */
    FILL(GTK_JUSTIFY_FILL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkJustification): Justification =
            when (nativeValue) {
                GTK_JUSTIFY_LEFT -> LEFT
                GTK_JUSTIFY_RIGHT -> RIGHT
                GTK_JUSTIFY_CENTER -> CENTER
                GTK_JUSTIFY_FILL -> FILL
                else -> error("invalid nativeValue")
            }
    }
}
