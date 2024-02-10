// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintQuality
import org.gtkkn.native.gtk.GtkPrintQuality.GTK_PRINT_QUALITY_DRAFT
import org.gtkkn.native.gtk.GtkPrintQuality.GTK_PRINT_QUALITY_HIGH
import org.gtkkn.native.gtk.GtkPrintQuality.GTK_PRINT_QUALITY_LOW
import org.gtkkn.native.gtk.GtkPrintQuality.GTK_PRINT_QUALITY_NORMAL

/**
 * See also gtk_print_settings_set_quality().
 */
public enum class PrintQuality(
    public val nativeValue: GtkPrintQuality,
) {
    /**
     * Low quality.
     */
    LOW(GTK_PRINT_QUALITY_LOW),

    /**
     * Normal quality.
     */
    NORMAL(GTK_PRINT_QUALITY_NORMAL),

    /**
     * High quality.
     */
    HIGH(GTK_PRINT_QUALITY_HIGH),

    /**
     * Draft quality.
     */
    DRAFT(GTK_PRINT_QUALITY_DRAFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintQuality): PrintQuality =
            when (nativeValue) {
                GTK_PRINT_QUALITY_LOW -> LOW
                GTK_PRINT_QUALITY_NORMAL -> NORMAL
                GTK_PRINT_QUALITY_HIGH -> HIGH
                GTK_PRINT_QUALITY_DRAFT -> DRAFT
                else -> error("invalid nativeValue")
            }
    }
}
