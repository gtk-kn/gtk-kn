// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkCollation
import org.gtkkn.native.gtk.GtkCollation.GTK_COLLATION_FILENAME
import org.gtkkn.native.gtk.GtkCollation.GTK_COLLATION_NONE
import org.gtkkn.native.gtk.GtkCollation.GTK_COLLATION_UNICODE

/**
 * Describes how a [class@Gtk.StringSorter] turns strings into sort keys to
 * compare them.
 *
 * Note that the result of sorting will in general depend on the current locale
 * unless the mode is @GTK_COLLATION_NONE.
 * @since 4.10
 */
public enum class Collation(
    public val nativeValue: GtkCollation,
) {
    /**
     * Don't do any collation
     */
    NONE(GTK_COLLATION_NONE),

    /**
     * Use [func@GLib.utf8_collate_key]
     */
    UNICODE(GTK_COLLATION_UNICODE),

    /**
     * Use [func@GLib.utf8_collate_key_for_filename]
     */
    FILENAME(GTK_COLLATION_FILENAME),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCollation): Collation =
            when (nativeValue) {
                GTK_COLLATION_NONE -> NONE
                GTK_COLLATION_UNICODE -> UNICODE
                GTK_COLLATION_FILENAME -> FILENAME
                else -> error("invalid nativeValue")
            }
    }
}
