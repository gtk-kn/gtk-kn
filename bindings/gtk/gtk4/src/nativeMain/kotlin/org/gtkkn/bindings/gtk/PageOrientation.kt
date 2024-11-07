// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPageOrientation

/**
 * See also gtk_print_settings_set_orientation().
 */
public enum class PageOrientation(
    public val nativeValue: GtkPageOrientation,
) {
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
        public fun fromNativeValue(nativeValue: GtkPageOrientation): PageOrientation =
            when (nativeValue) {
                GtkPageOrientation.GTK_PAGE_ORIENTATION_PORTRAIT -> PORTRAIT
                GtkPageOrientation.GTK_PAGE_ORIENTATION_LANDSCAPE -> LANDSCAPE
                GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_PORTRAIT -> REVERSE_PORTRAIT
                GtkPageOrientation.GTK_PAGE_ORIENTATION_REVERSE_LANDSCAPE -> REVERSE_LANDSCAPE
                else -> error("invalid nativeValue")
            }
    }
}
