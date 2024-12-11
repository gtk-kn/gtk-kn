// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GFileQueryInfoFlags
import org.gtkkn.native.gio.G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS
import org.gtkkn.native.gio.G_FILE_QUERY_INFO_NONE
import org.gtkkn.native.gio.g_file_query_info_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when querying a #GFileInfo.
 */
public class FileQueryInfoFlags(public val mask: GFileQueryInfoFlags) : Bitfield<FileQueryInfoFlags> {
    override infix fun or(other: FileQueryInfoFlags): FileQueryInfoFlags = FileQueryInfoFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: FileQueryInfoFlags = FileQueryInfoFlags(G_FILE_QUERY_INFO_NONE)

        /**
         * Don't follow symlinks.
         */
        public val NOFOLLOW_SYMLINKS: FileQueryInfoFlags =
            FileQueryInfoFlags(G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS)

        /**
         * Get the GType of FileQueryInfoFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_query_info_flags_get_type()
    }
}
