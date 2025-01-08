// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_22
import org.gtkkn.bindings.glib.annotations.GLibVersion2_34
import org.gtkkn.bindings.glib.annotations.GLibVersion2_8
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GMappedFile
import org.gtkkn.native.glib.g_mapped_file_free
import org.gtkkn.native.glib.g_mapped_file_get_bytes
import org.gtkkn.native.glib.g_mapped_file_get_contents
import org.gtkkn.native.glib.g_mapped_file_get_length
import org.gtkkn.native.glib.g_mapped_file_new
import org.gtkkn.native.glib.g_mapped_file_new_from_fd
import org.gtkkn.native.glib.g_mapped_file_ref
import org.gtkkn.native.glib.g_mapped_file_unref
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_mapped_file_get_type
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * The #GMappedFile represents a file mapping created with
 * g_mapped_file_new(). It has only private members and should
 * not be accessed directly.
 */
public class MappedFile(pointer: CPointer<GMappedFile>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GMappedFile> = pointer

    /**
     * This call existed before #GMappedFile had refcounting and is currently
     * exactly the same as g_mapped_file_unref().
     *
     * @since 2.8
     */
    @GLibVersion2_8
    public fun free(): Unit = g_mapped_file_free(gPointer)

    /**
     * Creates a new #GBytes which references the data mapped from @file.
     * The mapped contents of the file must not be modified after creating this
     * bytes object, because a #GBytes should be immutable.
     *
     * @return A newly allocated #GBytes referencing data
     *     from @file
     * @since 2.34
     */
    @GLibVersion2_34
    public fun getBytes(): Bytes = g_mapped_file_get_bytes(gPointer)!!.run {
        Bytes(this)
    }

    /**
     * Returns the contents of a #GMappedFile.
     *
     * Note that the contents may not be zero-terminated,
     * even if the #GMappedFile is backed by a text file.
     *
     * If the file is empty then null is returned.
     *
     * @return the contents of @file, or null.
     * @since 2.8
     */
    @GLibVersion2_8
    public fun getContents(): String =
        g_mapped_file_get_contents(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns the length of the contents of a #GMappedFile.
     *
     * @return the length of the contents of @file.
     * @since 2.8
     */
    @GLibVersion2_8
    public fun getLength(): gsize = g_mapped_file_get_length(gPointer)

    /**
     * Increments the reference count of @file by one.  It is safe to call
     * this function from any thread.
     *
     * @return the passed in #GMappedFile.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun ref(): MappedFile = g_mapped_file_ref(gPointer)!!.run {
        MappedFile(this)
    }

    /**
     * Decrements the reference count of @file by one.  If the reference count
     * drops to 0, unmaps the buffer of @file and frees it.
     *
     * It is safe to call this function from any thread.
     *
     * Since 2.22
     */
    public fun unref(): Unit = g_mapped_file_unref(gPointer)

    public companion object {
        /**
         * Maps a file into memory. On UNIX, this is using the mmap() function.
         *
         * If @writable is true, the mapped buffer may be modified, otherwise
         * it is an error to modify the mapped buffer. Modifications to the buffer
         * are not visible to other processes mapping the same file, and are not
         * written back to the file.
         *
         * Note that modifications of the underlying file might affect the contents
         * of the #GMappedFile. Therefore, mapping should only be used if the file
         * will not be modified, or if all modifications of the file are done
         * atomically (e.g. using g_file_set_contents()).
         *
         * If @filename is the name of an empty, regular file, the function
         * will successfully return an empty #GMappedFile. In other cases of
         * size 0 (e.g. device files such as /dev/null), @error will be set
         * to the #GFileError value %G_FILE_ERROR_INVAL.
         *
         * @param filename The path of the file to load, in the GLib
         *     filename encoding
         * @param writable whether the mapping should be writable
         * @return a newly allocated #GMappedFile which must be unref'd
         *    with g_mapped_file_unref(), or null if the mapping failed.
         * @since 2.8
         */
        public fun new(filename: String, writable: Boolean): Result<MappedFile> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_mapped_file_new(filename, writable.asGBoolean(), gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(MappedFile(checkNotNull(gResult)))
                }
            }
        }

        /**
         * Maps a file into memory. On UNIX, this is using the mmap() function.
         *
         * If @writable is true, the mapped buffer may be modified, otherwise
         * it is an error to modify the mapped buffer. Modifications to the buffer
         * are not visible to other processes mapping the same file, and are not
         * written back to the file.
         *
         * Note that modifications of the underlying file might affect the contents
         * of the #GMappedFile. Therefore, mapping should only be used if the file
         * will not be modified, or if all modifications of the file are done
         * atomically (e.g. using g_file_set_contents()).
         *
         * @param fd The file descriptor of the file to load
         * @param writable whether the mapping should be writable
         * @return a newly allocated #GMappedFile which must be unref'd
         *    with g_mapped_file_unref(), or null if the mapping failed.
         * @since 2.32
         */
        public fun newFromFd(fd: gint, writable: Boolean): Result<MappedFile> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_mapped_file_new_from_fd(fd, writable.asGBoolean(), gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(MappedFile(checkNotNull(gResult)))
                }
            }
        }

        /**
         * Get the GType of MappedFile
         *
         * @return the GType
         */
        public fun getType(): GType = g_mapped_file_get_type()
    }
}
