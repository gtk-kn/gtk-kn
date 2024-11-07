// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkUnit

/**
 * See also gtk_print_settings_set_paper_width().
 */
public enum class Unit(
    public val nativeValue: GtkUnit,
) {
    /**
     * No units.
     */
    NONE(GtkUnit.GTK_UNIT_NONE),

    /**
     * Dimensions in points.
     */
    POINTS(GtkUnit.GTK_UNIT_POINTS),

    /**
     * Dimensions in inches.
     */
    INCH(GtkUnit.GTK_UNIT_INCH),

    /**
     * Dimensions in millimeters
     */
    MM(GtkUnit.GTK_UNIT_MM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkUnit): Unit =
            when (nativeValue) {
                GtkUnit.GTK_UNIT_NONE -> NONE
                GtkUnit.GTK_UNIT_POINTS -> POINTS
                GtkUnit.GTK_UNIT_INCH -> INCH
                GtkUnit.GTK_UNIT_MM -> MM
                else -> error("invalid nativeValue")
            }
    }
}
