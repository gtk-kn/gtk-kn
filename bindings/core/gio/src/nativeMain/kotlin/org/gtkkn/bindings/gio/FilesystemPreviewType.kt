// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFilesystemPreviewType
import org.gtkkn.native.gio.g_filesystem_preview_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Indicates a hint from the file system whether files should be
 * previewed in a file manager. Returned as the value of the key
 * %G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW.
 */
public enum class FilesystemPreviewType(public val nativeValue: GFilesystemPreviewType) {
    /**
     * Only preview files if user has explicitly requested it.
     */
    IF_ALWAYS(GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS),

    /**
     * Preview files if user has requested preview of "local" files.
     */
    IF_LOCAL(GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL),

    /**
     * Never preview files.
     */
    NEVER(GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_NEVER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFilesystemPreviewType): FilesystemPreviewType = when (nativeValue) {
            GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS -> IF_ALWAYS
            GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL -> IF_LOCAL
            GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_NEVER -> NEVER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FilesystemPreviewType
         *
         * @return the GType
         */
        public fun getType(): GType = g_filesystem_preview_type_get_type()
    }
}
