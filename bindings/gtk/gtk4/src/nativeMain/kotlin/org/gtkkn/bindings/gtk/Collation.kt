// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCollation
import org.gtkkn.native.gtk.gtk_collation_get_type

/**
 * Describes how a [class@Gtk.StringSorter] turns strings into sort keys to
 * compare them.
 *
 * Note that the result of sorting will in general depend on the current locale
 * unless the mode is @GTK_COLLATION_NONE.
 * @since 4.10
 */
@GtkVersion4_10
public enum class Collation(public val nativeValue: GtkCollation) {
    /**
     * Don't do any collation
     */
    NONE(GtkCollation.GTK_COLLATION_NONE),

    /**
     * Use [func@GLib.utf8_collate_key]
     */
    UNICODE(GtkCollation.GTK_COLLATION_UNICODE),

    /**
     * Use [func@GLib.utf8_collate_key_for_filename]
     */
    FILENAME(GtkCollation.GTK_COLLATION_FILENAME),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCollation): Collation = when (nativeValue) {
            GtkCollation.GTK_COLLATION_NONE -> NONE
            GtkCollation.GTK_COLLATION_UNICODE -> UNICODE
            GtkCollation.GTK_COLLATION_FILENAME -> FILENAME
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Collation
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_collation_get_type()
    }
}
