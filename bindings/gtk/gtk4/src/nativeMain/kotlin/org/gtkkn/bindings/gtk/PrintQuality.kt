// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPrintQuality
import org.gtkkn.native.gtk.gtk_print_quality_get_type

/**
 * See also gtk_print_settings_set_quality().
 */
public enum class PrintQuality(public val nativeValue: GtkPrintQuality) {
    /**
     * Low quality.
     */
    LOW(GtkPrintQuality.GTK_PRINT_QUALITY_LOW),

    /**
     * Normal quality.
     */
    NORMAL(GtkPrintQuality.GTK_PRINT_QUALITY_NORMAL),

    /**
     * High quality.
     */
    HIGH(GtkPrintQuality.GTK_PRINT_QUALITY_HIGH),

    /**
     * Draft quality.
     */
    DRAFT(GtkPrintQuality.GTK_PRINT_QUALITY_DRAFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintQuality): PrintQuality = when (nativeValue) {
            GtkPrintQuality.GTK_PRINT_QUALITY_LOW -> LOW
            GtkPrintQuality.GTK_PRINT_QUALITY_NORMAL -> NORMAL
            GtkPrintQuality.GTK_PRINT_QUALITY_HIGH -> HIGH
            GtkPrintQuality.GTK_PRINT_QUALITY_DRAFT -> DRAFT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PrintQuality
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_print_quality_get_type()
    }
}
