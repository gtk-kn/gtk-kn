// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkFileList
import org.gtkkn.native.gdk.gdk_file_list_get_files

/**
 * An opaque type representing a list of files.
 * @since 4.6
 */
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
    public fun getFiles(): SList =
        gdk_file_list_get_files(gdkFileListPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    public companion object : RecordCompanion<FileList, GdkFileList> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FileList = FileList(pointer.reinterpret())
    }
}
