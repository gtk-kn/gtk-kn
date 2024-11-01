// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFilesystemPreviewType
import org.gtkkn.native.gio.GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS
import org.gtkkn.native.gio.GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL
import org.gtkkn.native.gio.GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_NEVER

/**
 * Indicates a hint from the file system whether files should be
 * previewed in a file manager. Returned as the value of the key
 * %G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW.
 */
public enum class FilesystemPreviewType(
    public val nativeValue: GFilesystemPreviewType,
) {
    /**
     * Only preview files if user has explicitly requested it.
     */
    IF_ALWAYS(G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS),

    /**
     * Preview files if user has requested preview of "local" files.
     */
    IF_LOCAL(G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL),

    /**
     * Never preview files.
     */
    NEVER(G_FILESYSTEM_PREVIEW_TYPE_NEVER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFilesystemPreviewType): FilesystemPreviewType =
            when (nativeValue) {
                G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS -> IF_ALWAYS
                G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL -> IF_LOCAL
                G_FILESYSTEM_PREVIEW_TYPE_NEVER -> NEVER
                else -> error("invalid nativeValue")
            }
    }
}
