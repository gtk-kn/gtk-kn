// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GTK_SOURCE_FILE_SAVER_FLAGS_CREATE_BACKUP
import org.gtkkn.native.gtksource.GTK_SOURCE_FILE_SAVER_FLAGS_IGNORE_INVALID_CHARS
import org.gtkkn.native.gtksource.GTK_SOURCE_FILE_SAVER_FLAGS_IGNORE_MODIFICATION_TIME
import org.gtkkn.native.gtksource.GTK_SOURCE_FILE_SAVER_FLAGS_NONE
import org.gtkkn.native.gtksource.GtkSourceFileSaverFlags
import org.gtkkn.native.gtksource.gtk_source_file_saver_flags_get_type

/**
 * Flags to define the behavior of a [flags@FileSaverFlags].
 */
public class FileSaverFlags(public val mask: GtkSourceFileSaverFlags) : Bitfield<FileSaverFlags> {
    override infix fun or(other: FileSaverFlags): FileSaverFlags = FileSaverFlags(mask or other.mask)

    public companion object {
        /**
         * No flags.
         */
        public val NONE: FileSaverFlags = FileSaverFlags(GTK_SOURCE_FILE_SAVER_FLAGS_NONE)

        /**
         * Ignore invalid characters.
         */
        public val IGNORE_INVALID_CHARS: FileSaverFlags =
            FileSaverFlags(GTK_SOURCE_FILE_SAVER_FLAGS_IGNORE_INVALID_CHARS)

        /**
         * Save file despite external modifications.
         */
        public val IGNORE_MODIFICATION_TIME: FileSaverFlags =
            FileSaverFlags(GTK_SOURCE_FILE_SAVER_FLAGS_IGNORE_MODIFICATION_TIME)

        /**
         * Create a backup before saving the file.
         */
        public val CREATE_BACKUP: FileSaverFlags =
            FileSaverFlags(GTK_SOURCE_FILE_SAVER_FLAGS_CREATE_BACKUP)

        /**
         * Get the GType of FileSaverFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_file_saver_flags_get_type()
    }
}
