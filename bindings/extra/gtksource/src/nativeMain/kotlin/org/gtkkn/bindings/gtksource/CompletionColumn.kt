// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_COLUMN_AFTER
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_COLUMN_BEFORE
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_COLUMN_COMMENT
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_COLUMN_DETAILS
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_COLUMN_ICON
import org.gtkkn.native.gtksource.GTK_SOURCE_COMPLETION_COLUMN_TYPED_TEXT
import org.gtkkn.native.gtksource.GtkSourceCompletionColumn
import org.gtkkn.native.gtksource.gtk_source_completion_column_get_type

public enum class CompletionColumn(public val nativeValue: GtkSourceCompletionColumn) {
    ICON(GTK_SOURCE_COMPLETION_COLUMN_ICON),
    BEFORE(GTK_SOURCE_COMPLETION_COLUMN_BEFORE),
    TYPED_TEXT(GTK_SOURCE_COMPLETION_COLUMN_TYPED_TEXT),
    AFTER(GTK_SOURCE_COMPLETION_COLUMN_AFTER),
    COMMENT(GTK_SOURCE_COMPLETION_COLUMN_COMMENT),
    DETAILS(GTK_SOURCE_COMPLETION_COLUMN_DETAILS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceCompletionColumn): CompletionColumn = when (nativeValue) {
            GTK_SOURCE_COMPLETION_COLUMN_ICON -> ICON
            GTK_SOURCE_COMPLETION_COLUMN_BEFORE -> BEFORE
            GTK_SOURCE_COMPLETION_COLUMN_TYPED_TEXT -> TYPED_TEXT
            GTK_SOURCE_COMPLETION_COLUMN_AFTER -> AFTER
            GTK_SOURCE_COMPLETION_COLUMN_COMMENT -> COMMENT
            GTK_SOURCE_COMPLETION_COLUMN_DETAILS -> DETAILS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CompletionColumn
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_column_get_type()
    }
}
