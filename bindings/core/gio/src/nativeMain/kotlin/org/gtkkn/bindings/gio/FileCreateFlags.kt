// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GFileCreateFlags
import org.gtkkn.native.gio.G_FILE_CREATE_NONE
import org.gtkkn.native.gio.G_FILE_CREATE_PRIVATE
import org.gtkkn.native.gio.G_FILE_CREATE_REPLACE_DESTINATION
import org.gtkkn.native.gio.g_file_create_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when an operation may create a file.
 */
public class FileCreateFlags(public val mask: GFileCreateFlags) : Bitfield<FileCreateFlags> {
    override infix fun or(other: FileCreateFlags): FileCreateFlags = FileCreateFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: FileCreateFlags = FileCreateFlags(G_FILE_CREATE_NONE)

        /**
         * Create a file that can only be
         *    accessed by the current user.
         */
        public val PRIVATE: FileCreateFlags = FileCreateFlags(G_FILE_CREATE_PRIVATE)

        /**
         * Replace the destination
         *    as if it didn't exist before. Don't try to keep any old
         *    permissions, replace instead of following links. This
         *    is generally useful if you're doing a "copy over"
         *    rather than a "save new version of" replace operation.
         *    You can think of it as "unlink destination" before
         *    writing to it, although the implementation may not
         *    be exactly like that. This flag can only be used with
         *    g_file_replace() and its variants, including g_file_replace_contents().
         *    Since 2.20
         */
        public val REPLACE_DESTINATION: FileCreateFlags =
            FileCreateFlags(G_FILE_CREATE_REPLACE_DESTINATION)

        /**
         * Get the GType of FileCreateFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_create_flags_get_type()
    }
}
