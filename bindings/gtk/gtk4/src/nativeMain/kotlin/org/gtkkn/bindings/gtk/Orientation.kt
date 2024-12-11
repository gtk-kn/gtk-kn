// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkOrientation
import org.gtkkn.native.gtk.gtk_orientation_get_type

/**
 * Represents the orientation of widgets and other objects.
 *
 * Typical examples are [class@Box] or [class@GesturePan].
 */
public enum class Orientation(public val nativeValue: GtkOrientation) {
    /**
     * The element is in horizontal orientation.
     */
    HORIZONTAL(GtkOrientation.GTK_ORIENTATION_HORIZONTAL),

    /**
     * The element is in vertical orientation.
     */
    VERTICAL(GtkOrientation.GTK_ORIENTATION_VERTICAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkOrientation): Orientation = when (nativeValue) {
            GtkOrientation.GTK_ORIENTATION_HORIZONTAL -> HORIZONTAL
            GtkOrientation.GTK_ORIENTATION_VERTICAL -> VERTICAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Orientation
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_orientation_get_type()
    }
}
