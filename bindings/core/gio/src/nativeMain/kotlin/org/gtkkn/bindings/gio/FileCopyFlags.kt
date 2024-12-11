// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GFileCopyFlags
import org.gtkkn.native.gio.G_FILE_COPY_ALL_METADATA
import org.gtkkn.native.gio.G_FILE_COPY_BACKUP
import org.gtkkn.native.gio.G_FILE_COPY_NOFOLLOW_SYMLINKS
import org.gtkkn.native.gio.G_FILE_COPY_NONE
import org.gtkkn.native.gio.G_FILE_COPY_NO_FALLBACK_FOR_MOVE
import org.gtkkn.native.gio.G_FILE_COPY_OVERWRITE
import org.gtkkn.native.gio.G_FILE_COPY_TARGET_DEFAULT_MODIFIED_TIME
import org.gtkkn.native.gio.G_FILE_COPY_TARGET_DEFAULT_PERMS
import org.gtkkn.native.gio.g_file_copy_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when copying or moving files.
 */
public class FileCopyFlags(public val mask: GFileCopyFlags) : Bitfield<FileCopyFlags> {
    override infix fun or(other: FileCopyFlags): FileCopyFlags = FileCopyFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: FileCopyFlags = FileCopyFlags(G_FILE_COPY_NONE)

        /**
         * Overwrite any existing files
         */
        public val OVERWRITE: FileCopyFlags = FileCopyFlags(G_FILE_COPY_OVERWRITE)

        /**
         * Make a backup of any existing files.
         */
        public val BACKUP: FileCopyFlags = FileCopyFlags(G_FILE_COPY_BACKUP)

        /**
         * Don't follow symlinks.
         */
        public val NOFOLLOW_SYMLINKS: FileCopyFlags = FileCopyFlags(G_FILE_COPY_NOFOLLOW_SYMLINKS)

        /**
         * Copy all file metadata instead of just default set used for copy (see #GFileInfo).
         */
        public val ALL_METADATA: FileCopyFlags = FileCopyFlags(G_FILE_COPY_ALL_METADATA)

        /**
         * Don't use copy and delete fallback if native move not supported.
         */
        public val NO_FALLBACK_FOR_MOVE: FileCopyFlags =
            FileCopyFlags(G_FILE_COPY_NO_FALLBACK_FOR_MOVE)

        /**
         * Leaves target file with default perms, instead of setting the source file perms.
         */
        public val TARGET_DEFAULT_PERMS: FileCopyFlags =
            FileCopyFlags(G_FILE_COPY_TARGET_DEFAULT_PERMS)

        /**
         * Use default modification
         *     timestamps instead of copying them from the source file. Since 2.80
         */
        public val TARGET_DEFAULT_MODIFIED_TIME: FileCopyFlags =
            FileCopyFlags(G_FILE_COPY_TARGET_DEFAULT_MODIFIED_TIME)

        /**
         * Get the GType of FileCopyFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_copy_flags_get_type()
    }
}
