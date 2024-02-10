// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkOrientation
import org.gtkkn.native.gtk.GtkOrientation.GTK_ORIENTATION_HORIZONTAL
import org.gtkkn.native.gtk.GtkOrientation.GTK_ORIENTATION_VERTICAL

/**
 * Represents the orientation of widgets and other objects.
 *
 * Typical examples are [class@Box] or [class@GesturePan].
 */
public enum class Orientation(
    public val nativeValue: GtkOrientation,
) {
    /**
     * The element is in horizontal orientation.
     */
    HORIZONTAL(GTK_ORIENTATION_HORIZONTAL),

    /**
     * The element is in vertical orientation.
     */
    VERTICAL(GTK_ORIENTATION_VERTICAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkOrientation): Orientation =
            when (nativeValue) {
                GTK_ORIENTATION_HORIZONTAL -> HORIZONTAL
                GTK_ORIENTATION_VERTICAL -> VERTICAL
                else -> error("invalid nativeValue")
            }
    }
}
