// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPageOrientation
import org.gtkkn.native.gtk.gtk_page_orientation_get_type

/**
 * See also gtk_print_settings_set_orientation().
 */
public enum class PageOrientation(public val nativeValue: GtkPageOrientation) {
    /**
     * Portrait mode.
     */
    PORTRAIT(GtkPageOrientation.GTK_PAGE_ORIENTATION_PORTRAIT),

    /**
     * Landscape mode.
     */
    LANDSCAPE(GtkPageOrientation.GTK_PAGE_ORIENTATION_LANDSCAPE),

    /**
     * Reverse portrait mode.
     */
    REVERSE_PORTRAIT(GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT),

    /**
     * Reverse landscape mode.
     */
    REVERSE_LANDSCAPE(GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPageOrientation): PageOrientation = when (nativeValue) {
            GtkPageOrientation.GTK_PAGE_ORIENTATION_PORTRAIT -> PORTRAIT
            GtkPageOrientation.GTK_PAGE_ORIENTATION_LANDSCAPE -> LANDSCAPE
            GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT -> REVERSE_PORTRAIT
            GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE -> REVERSE_LANDSCAPE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PageOrientation
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_page_orientation_get_type()
    }
}
