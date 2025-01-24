// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkUnit
import org.gtkkn.native.gtk.gtk_unit_get_type

/**
 * See also gtk_print_settings_set_paper_width().
 */
public enum class Unit(public val nativeValue: GtkUnit) {
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
        public fun fromNativeValue(nativeValue: GtkUnit): Unit = when (nativeValue) {
            GtkUnit.GTK_UNIT_NONE -> NONE
            GtkUnit.GTK_UNIT_POINTS -> POINTS
            GtkUnit.GTK_UNIT_INCH -> INCH
            GtkUnit.GTK_UNIT_MM -> MM
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Unit
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_unit_get_type()
    }
}
