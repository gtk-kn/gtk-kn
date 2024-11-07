// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintDuplex

/**
 * See also gtk_print_settings_set_duplex().
 */
public enum class PrintDuplex(
    public val nativeValue: GtkPrintDuplex,
) {
    /**
     * No duplex.
     */
    SIMPLEX(GtkPrintDuplex.GTK_PRINT_DUPLEX_SIMPLEX),

    /**
     * Horizontal duplex.
     */
    HORIZONTAL(GtkPrintDuplex.GTK_PRINT_DUPLEX_HORIZONTAL),

    /**
     * Vertical duplex.
     */
    VERTICAL(GtkPrintDuplex.GTK_PRINT_DUPLEX_VERTICAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintDuplex): PrintDuplex =
            when (nativeValue) {
                GtkPrintDuplex.GTK_PRINT_DUPLEX_SIMPLEX -> SIMPLEX
                GtkPrintDuplex.GTK_PRINT_DUPLEX_HORIZONTAL -> HORIZONTAL
                GtkPrintDuplex.GTK_PRINT_DUPLEX_VERTICAL -> VERTICAL
                else -> error("invalid nativeValue")
            }
    }
}
