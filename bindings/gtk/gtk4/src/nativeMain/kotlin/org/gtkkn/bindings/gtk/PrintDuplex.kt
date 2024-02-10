// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintDuplex
import org.gtkkn.native.gtk.GtkPrintDuplex.GTK_PRINT_DUPLEX_HORIZONTAL
import org.gtkkn.native.gtk.GtkPrintDuplex.GTK_PRINT_DUPLEX_SIMPLEX
import org.gtkkn.native.gtk.GtkPrintDuplex.GTK_PRINT_DUPLEX_VERTICAL

/**
 * See also gtk_print_settings_set_duplex().
 */
public enum class PrintDuplex(
    public val nativeValue: GtkPrintDuplex,
) {
    /**
     * No duplex.
     */
    SIMPLEX(GTK_PRINT_DUPLEX_SIMPLEX),

    /**
     * Horizontal duplex.
     */
    HORIZONTAL(GTK_PRINT_DUPLEX_HORIZONTAL),

    /**
     * Vertical duplex.
     */
    VERTICAL(GTK_PRINT_DUPLEX_VERTICAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintDuplex): PrintDuplex =
            when (nativeValue) {
                GTK_PRINT_DUPLEX_SIMPLEX -> SIMPLEX
                GTK_PRINT_DUPLEX_HORIZONTAL -> HORIZONTAL
                GTK_PRINT_DUPLEX_VERTICAL -> VERTICAL
                else -> error("invalid nativeValue")
            }
    }
}
