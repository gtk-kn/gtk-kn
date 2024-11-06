// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkFileList
import org.gtkkn.native.gdk.gdk_file_list_get_files
import org.gtkkn.native.gdk.gdk_file_list_new_from_list

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
public class FileList(
    pointer: CPointer<GdkFileList>,
) : Record {
    public val gdkFileListPointer: CPointer<GdkFileList> = pointer

    /**
     * Retrieves the list of files inside a `GdkFileList`.
     *
     * This function is meant for language bindings.
     *
     * @return the files inside the list
     * @since 4.6
     */
    @GdkVersion4_6
    public fun getFiles(): SList =
        gdk_file_list_get_files(gdkFileListPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    public companion object : RecordCompanion<FileList, GdkFileList> {
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
        public fun newFromList(files: SList): FileList =
            FileList(gdk_file_list_new_from_list(files.glibSListPointer)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FileList = FileList(pointer.reinterpret())
    }
}
