// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkFileList
import org.gtkkn.native.gdk.gdk_file_list_get_files
import org.gtkkn.native.gdk.gdk_file_list_get_type
import org.gtkkn.native.gdk.gdk_file_list_new_from_list
import org.gtkkn.native.gobject.GType

/**
 * An opaque type representing a list of files.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `files`: Array parameter of type Gio.File is not supported
 *
 * @since 4.6
 */
@GdkVersion4_6
public class FileList(public val gdkFileListPointer: CPointer<GdkFileList>) : ProxyInstance(gdkFileListPointer) {
    /**
     * Creates a new files list container from a singly linked list of
     * `GFile` instances.
     *
     * This function is meant to be used by language bindings
     *
     * @param files a list of files
     * @return the newly created files list
     * @since 4.8
     */
    public constructor(files: SList) : this(gdk_file_list_new_from_list(files.glibSListPointer)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Retrieves the list of files inside a `GdkFileList`.
     *
     * This function is meant for language bindings.
     *
     * @return the files inside the list
     * @since 4.6
     */
    @GdkVersion4_6
    public fun getFiles(): SList = gdk_file_list_get_files(gdkFileListPointer)!!.run {
        SList(this)
    }

    public companion object {
        /**
         * Get the GType of FileList
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_file_list_get_type()
    }
}
