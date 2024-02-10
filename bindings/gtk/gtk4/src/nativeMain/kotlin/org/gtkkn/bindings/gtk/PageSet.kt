// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPageSet
import org.gtkkn.native.gtk.GtkPageSet.GTK_PAGE_SET_ALL
import org.gtkkn.native.gtk.GtkPageSet.GTK_PAGE_SET_EVEN
import org.gtkkn.native.gtk.GtkPageSet.GTK_PAGE_SET_ODD

/**
 * See also gtk_print_job_set_page_set().
 */
public enum class PageSet(
    public val nativeValue: GtkPageSet,
) {
    /**
     * All pages.
     */
    ALL(GTK_PAGE_SET_ALL),

    /**
     * Even pages.
     */
    EVEN(GTK_PAGE_SET_EVEN),

    /**
     * Odd pages.
     */
    ODD(GTK_PAGE_SET_ODD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPageSet): PageSet =
            when (nativeValue) {
                GTK_PAGE_SET_ALL -> ALL
                GTK_PAGE_SET_EVEN -> EVEN
                GTK_PAGE_SET_ODD -> ODD
                else -> error("invalid nativeValue")
            }
    }
}
