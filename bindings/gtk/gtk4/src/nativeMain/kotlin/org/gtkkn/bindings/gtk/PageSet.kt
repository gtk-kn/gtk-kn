// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPageSet
import org.gtkkn.native.gtk.gtk_page_set_get_type

/**
 * See also gtk_print_job_set_page_set().
 */
public enum class PageSet(public val nativeValue: GtkPageSet) {
    /**
     * All pages.
     */
    ALL(GtkPageSet.GTK_PAGE_SET_ALL),

    /**
     * Even pages.
     */
    EVEN(GtkPageSet.GTK_PAGE_SET_EVEN),

    /**
     * Odd pages.
     */
    ODD(GtkPageSet.GTK_PAGE_SET_ODD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPageSet): PageSet = when (nativeValue) {
            GtkPageSet.GTK_PAGE_SET_ALL -> ALL
            GtkPageSet.GTK_PAGE_SET_EVEN -> EVEN
            GtkPageSet.GTK_PAGE_SET_ODD -> ODD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PageSet
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_page_set_get_type()
    }
}
