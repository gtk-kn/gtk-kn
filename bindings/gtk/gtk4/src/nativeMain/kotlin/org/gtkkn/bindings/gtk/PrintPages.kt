// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPrintPages

/**
 * See also gtk_print_job_set_pages()
 */
public enum class PrintPages(
    public val nativeValue: GtkPrintPages,
) {
    /**
     * All pages.
     */
    ALL(GtkPrintPages.GTK_PRINT_PAGES_ALL),

    /**
     * Current page.
     */
    CURRENT(GtkPrintPages.GTK_PRINT_PAGES_CURRENT),

    /**
     * Range of pages.
     */
    RANGES(GtkPrintPages.GTK_PRINT_PAGES_RANGES),

    /**
     * Selected pages.
     */
    SELECTION(GtkPrintPages.GTK_PRINT_PAGES_SELECTION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPrintPages): PrintPages =
            when (nativeValue) {
                GtkPrintPages.GTK_PRINT_PAGES_ALL -> ALL
                GtkPrintPages.GTK_PRINT_PAGES_CURRENT -> CURRENT
                GtkPrintPages.GTK_PRINT_PAGES_RANGES -> RANGES
                GtkPrintPages.GTK_PRINT_PAGES_SELECTION -> SELECTION
                else -> error("invalid nativeValue")
            }
    }
}
