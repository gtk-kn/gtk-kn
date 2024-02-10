// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileType
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_DIRECTORY
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_MOUNTABLE
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_REGULAR
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_SHORTCUT
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_SPECIAL
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_SYMBOLIC_LINK
import org.gtkkn.native.gio.GFileType.G_FILE_TYPE_UNKNOWN

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
public enum class FileType(
    public val nativeValue: GFileType,
) {
    /**
     * File's type is unknown.
     */
    UNKNOWN(G_FILE_TYPE_UNKNOWN),

    /**
     * File handle represents a regular file.
     */
    REGULAR(G_FILE_TYPE_REGULAR),

    /**
     * File handle represents a directory.
     */
    DIRECTORY(G_FILE_TYPE_DIRECTORY),

    /**
     * File handle represents a symbolic link
     *    (Unix systems).
     */
    SYMBOLIC_LINK(G_FILE_TYPE_SYMBOLIC_LINK),

    /**
     * File is a "special" file, such as a socket, fifo,
     *    block device, or character device.
     */
    SPECIAL(G_FILE_TYPE_SPECIAL),

    /**
     * File is a shortcut (Windows systems).
     */
    SHORTCUT(G_FILE_TYPE_SHORTCUT),

    /**
     * File is a mountable location.
     */
    MOUNTABLE(G_FILE_TYPE_MOUNTABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileType): FileType =
            when (nativeValue) {
                G_FILE_TYPE_UNKNOWN -> UNKNOWN
                G_FILE_TYPE_REGULAR -> REGULAR
                G_FILE_TYPE_DIRECTORY -> DIRECTORY
                G_FILE_TYPE_SYMBOLIC_LINK -> SYMBOLIC_LINK
                G_FILE_TYPE_SPECIAL -> SPECIAL
                G_FILE_TYPE_SHORTCUT -> SHORTCUT
                G_FILE_TYPE_MOUNTABLE -> MOUNTABLE
                else -> error("invalid nativeValue")
            }
    }
}
