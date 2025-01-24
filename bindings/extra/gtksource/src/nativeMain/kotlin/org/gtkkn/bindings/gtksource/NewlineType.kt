// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceNewlineType
import org.gtkkn.native.gtksource.gtk_source_newline_type_get_type

public enum class NewlineType(public val nativeValue: GtkSourceNewlineType) {
    /**
     * line feed, used on UNIX.
     */
    LF(GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_LF),

    /**
     * carriage return, used on Mac.
     */
    CR(GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_CR),

    /**
     * carriage return followed by a line feed, used
     *   on Windows.
     */
    CR_LF(GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_CR_LF),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceNewlineType): NewlineType = when (nativeValue) {
            GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_LF -> LF
            GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_CR -> CR
            GtkSourceNewlineType.GTK_SOURCE_NEWLINE_TYPE_CR_LF -> CR_LF
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NewlineType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_newline_type_get_type()
    }
}
