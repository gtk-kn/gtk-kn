// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GFileMeasureFlags
import org.gtkkn.native.gio.G_FILE_MEASURE_APPARENT_SIZE
import org.gtkkn.native.gio.G_FILE_MEASURE_NONE
import org.gtkkn.native.gio.G_FILE_MEASURE_NO_XDEV
import org.gtkkn.native.gio.G_FILE_MEASURE_REPORT_ANY_ERROR
import org.gtkkn.native.gio.g_file_measure_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags that can be used with g_file_measure_disk_usage().
 * @since 2.38
 */
public class FileMeasureFlags(public val mask: GFileMeasureFlags) : Bitfield<FileMeasureFlags> {
    override infix fun or(other: FileMeasureFlags): FileMeasureFlags = FileMeasureFlags(mask or other.mask)

    @GioVersion2_38
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: FileMeasureFlags = FileMeasureFlags(G_FILE_MEASURE_NONE)

        /**
         * Report any error encountered
         *   while traversing the directory tree.  Normally errors are only
         *   reported for the toplevel file.
         */
        public val REPORT_ANY_ERROR: FileMeasureFlags =
            FileMeasureFlags(G_FILE_MEASURE_REPORT_ANY_ERROR)

        /**
         * Tally usage based on apparent file
         *   sizes.  Normally, the block-size is used, if available, as this is a
         *   more accurate representation of disk space used.
         *   Compare with `du --apparent-size`.
         *   Since GLib 2.78. and similarly to `du` since GNU Coreutils 9.2, this will
         *   ignore the sizes of file types other than regular files and links, as the
         *   sizes of other file types are not specified in a standard way.
         */
        public val APPARENT_SIZE: FileMeasureFlags = FileMeasureFlags(G_FILE_MEASURE_APPARENT_SIZE)

        /**
         * Do not cross mount point boundaries.
         *   Compare with `du -x`.
         */
        public val NO_XDEV: FileMeasureFlags = FileMeasureFlags(G_FILE_MEASURE_NO_XDEV)

        /**
         * Get the GType of FileMeasureFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_measure_flags_get_type()
    }
}
