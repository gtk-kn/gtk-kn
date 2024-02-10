// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkUnit
import org.gtkkn.native.gtk.GtkUnit.GTK_UNIT_INCH
import org.gtkkn.native.gtk.GtkUnit.GTK_UNIT_MM
import org.gtkkn.native.gtk.GtkUnit.GTK_UNIT_NONE
import org.gtkkn.native.gtk.GtkUnit.GTK_UNIT_POINTS

/**
 * See also gtk_print_settings_set_paper_width().
 */
public enum class Unit(
    public val nativeValue: GtkUnit,
) {
    /**
     * No units.
     */
    NONE(GTK_UNIT_NONE),

    /**
     * Dimensions in points.
     */
    POINTS(GTK_UNIT_POINTS),

    /**
     * Dimensions in inches.
     */
    INCH(GTK_UNIT_INCH),

    /**
     * Dimensions in millimeters
     */
    MM(GTK_UNIT_MM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkUnit): Unit =
            when (nativeValue) {
                GTK_UNIT_NONE -> NONE
                GTK_UNIT_POINTS -> POINTS
                GTK_UNIT_INCH -> INCH
                GTK_UNIT_MM -> MM
                else -> error("invalid nativeValue")
            }
    }
}
