// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintPages
import org.gtkkn.native.gtk.GtkPrintPages.GTK_PRINT_PAGES_ALL
import org.gtkkn.native.gtk.GtkPrintPages.GTK_PRINT_PAGES_CURRENT
import org.gtkkn.native.gtk.GtkPrintPages.GTK_PRINT_PAGES_RANGES
import org.gtkkn.native.gtk.GtkPrintPages.GTK_PRINT_PAGES_SELECTION

/**
 * See also gtk_print_job_set_pages()
 */
public enum class PrintPages(
    public val nativeValue: GtkPrintPages,
) {
    /**
     * All pages.
     */
    ALL(GTK_PRINT_PAGES_ALL),

    /**
     * Current page.
     */
    CURRENT(GTK_PRINT_PAGES_CURRENT),

    /**
     * Range of pages.
     */
    RANGES(GTK_PRINT_PAGES_RANGES),

    /**
     * Selected pages.
     */
    SELECTION(GTK_PRINT_PAGES_SELECTION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintPages): PrintPages =
            when (nativeValue) {
                GTK_PRINT_PAGES_ALL -> ALL
                GTK_PRINT_PAGES_CURRENT -> CURRENT
                GTK_PRINT_PAGES_RANGES -> RANGES
                GTK_PRINT_PAGES_SELECTION -> SELECTION
                else -> error("invalid nativeValue")
            }
    }
}
