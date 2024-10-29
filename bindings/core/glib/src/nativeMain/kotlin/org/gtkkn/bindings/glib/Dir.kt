// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Glib.resolveException
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GDir
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_dir_close
import org.gtkkn.native.glib.g_dir_make_tmp
import org.gtkkn.native.glib.g_dir_open
import org.gtkkn.native.glib.g_dir_read_name
import org.gtkkn.native.glib.g_dir_ref
import org.gtkkn.native.glib.g_dir_rewind
import org.gtkkn.native.glib.g_dir_unref
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * An opaque structure representing an opened directory.
 */
public class Dir(
    pointer: CPointer<GDir>,
) : Record {
    public val glibDirPointer: CPointer<GDir> = pointer

    /**
     * Closes the directory immediately and decrements the reference count.
     *
     * Once the reference count reaches zero, the `GDir` structure itself will be
     * freed. Prior to GLib 2.80, `GDir` was not reference counted.
     *
     * It is an error to call any of the `GDir` methods other than
     * [method@GLib.Dir.ref] and [method@GLib.Dir.unref] on a `GDir` after calling
     * [method@GLib.Dir.close] on it.
     */
    public fun close(): Unit = g_dir_close(glibDirPointer.reinterpret())

    /**
     * Retrieves the name of another entry in the directory, or null.
     * The order of entries returned from this function is not defined,
     * and may vary by file system or other operating-system dependent
     * factors.
     *
     * null may also be returned in case of errors. On Unix, you can
     * check `errno` to find out if null was returned because of an error.
     *
     * On Unix, the '.' and '..' entries are omitted, and the returned
     * name is in the on-disk encoding.
     *
     * On Windows, as is true of all GLib functions which operate on
     * filenames, the returned name is in UTF-8.
     *
     * @return The entry's name or null if there are no
     *   more entries. The return value is owned by GLib and
     *   must not be modified or freed.
     */
    public fun readName(): String =
        g_dir_read_name(glibDirPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Increment the reference count of `dir`.
     *
     * @return the same pointer as `dir`
     * @since 2.80
     */
    public fun ref(): Dir =
        g_dir_ref(glibDirPointer.reinterpret())!!.run {
            Dir(reinterpret())
        }

    /**
     * Resets the given directory. The next call to g_dir_read_name()
     * will return the first entry again.
     */
    public fun rewind(): Unit = g_dir_rewind(glibDirPointer.reinterpret())

    /**
     * Decrements the reference count of `dir`.
     *
     * Once the reference count reaches zero, the directory will be closed and all
     * resources associated with it will be freed. If [method@GLib.Dir.close] is
     * called when the reference count is greater than zero, the directory is closed
     * but the `GDir` structure will not be freed until its reference count reaches
     * zero.
     *
     * It is an error to call any of the `GDir` methods other than
     * [method@GLib.Dir.ref] and [method@GLib.Dir.unref] on a `GDir` after calling
     * [method@GLib.Dir.close] on it.
     *
     * @since 2.80
     */
    public fun unref(): Unit = g_dir_unref(glibDirPointer.reinterpret())

    public companion object : RecordCompanion<Dir, GDir> {
        /**
         * Opens a directory for reading. The names of the files in the
         * directory can then be retrieved using g_dir_read_name().  Note
         * that the ordering is not defined.
         *
         * @param path the path to the directory you are interested in. On Unix
         *         in the on-disk encoding. On Windows in UTF-8
         * @param flags Currently must be set to 0. Reserved for future use.
         * @return a newly allocated #GDir on success, null on failure.
         *   If non-null, you must free the result with g_dir_close()
         *   when you are finished with it.
         */
        public fun `open`(
            path: String,
            flags: UInt,
        ): Result<Dir> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_dir_open(path, flags, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(Dir(checkNotNull(gResult)))
                }
            }
        }

        /**
         * Creates a subdirectory in the preferred directory for temporary
         * files (as returned by g_get_tmp_dir()).
         *
         * @tmpl should be a string in the GLib file name encoding containing
         * a sequence of six 'X' characters, as the parameter to g_mkstemp().
         * However, unlike these functions, the template should only be a
         * basename, no directory components are allowed. If template is
         * null, a default template is used.
         *
         * Note that in contrast to g_mkdtemp() (and mkdtemp()) @tmpl is not
         * modified, and might thus be a read-only literal string.
         *
         * @param tmpl Template for directory name,
         *   as in g_mkdtemp(), basename only, or null for a default template
         * @return The actual name used. This string
         *   should be freed with g_free() when not needed any longer and is
         *   is in the GLib file name encoding. In case of errors, null is
         *   returned and @error will be set.
         * @since 2.30
         */
        public fun makeTmp(tmpl: String? = null): Result<String> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_dir_make_tmp(tmpl, gError.ptr)?.toKString()
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Dir = Dir(pointer.reinterpret())
    }
}
