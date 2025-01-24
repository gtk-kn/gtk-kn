// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileType
import org.gtkkn.native.gio.g_file_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Indicates the file's on-disk type.
 *
 * On Windows systems a file will never have %G_FILE_TYPE_SYMBOLIC_LINK type;
 * use #GFileInfo and %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK to determine
 * whether a file is a symlink or not. This is due to the fact that NTFS does
 * not have a single filesystem object type for symbolic links - it has
 * files that symlink to files, and directories that symlink to directories.
 * #GFileType enumeration cannot precisely represent this important distinction,
 * which is why all Windows symlinks will continue to be reported as
 * %G_FILE_TYPE_REGULAR or %G_FILE_TYPE_DIRECTORY.
 */
public enum class FileType(public val nativeValue: GFileType) {
    /**
     * File's type is unknown.
     */
    UNKNOWN(GFileType.G_FILE_TYPE_UNKNOWN),

    /**
     * File handle represents a regular file.
     */
    REGULAR(GFileType.G_FILE_TYPE_REGULAR),

    /**
     * File handle represents a directory.
     */
    DIRECTORY(GFileType.G_FILE_TYPE_DIRECTORY),

    /**
     * File handle represents a symbolic link
     *    (Unix systems).
     */
    SYMBOLIC_LINK(GFileType.G_FILE_TYPE_SYMBOLIC_LINK),

    /**
     * File is a "special" file, such as a socket, fifo,
     *    block device, or character device.
     */
    SPECIAL(GFileType.G_FILE_TYPE_SPECIAL),

    /**
     * File is a shortcut (Windows systems).
     */
    SHORTCUT(GFileType.G_FILE_TYPE_SHORTCUT),

    /**
     * File is a mountable location.
     */
    MOUNTABLE(GFileType.G_FILE_TYPE_MOUNTABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileType): FileType = when (nativeValue) {
            GFileType.G_FILE_TYPE_UNKNOWN -> UNKNOWN
            GFileType.G_FILE_TYPE_REGULAR -> REGULAR
            GFileType.G_FILE_TYPE_DIRECTORY -> DIRECTORY
            GFileType.G_FILE_TYPE_SYMBOLIC_LINK -> SYMBOLIC_LINK
            GFileType.G_FILE_TYPE_SPECIAL -> SPECIAL
            GFileType.G_FILE_TYPE_SHORTCUT -> SHORTCUT
            GFileType.G_FILE_TYPE_MOUNTABLE -> MOUNTABLE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FileType
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_type_get_type()
    }
}
