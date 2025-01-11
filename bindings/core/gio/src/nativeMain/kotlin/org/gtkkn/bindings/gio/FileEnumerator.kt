// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFileEnumerator
import org.gtkkn.native.gio.g_file_enumerator_close
import org.gtkkn.native.gio.g_file_enumerator_close_async
import org.gtkkn.native.gio.g_file_enumerator_close_finish
import org.gtkkn.native.gio.g_file_enumerator_get_child
import org.gtkkn.native.gio.g_file_enumerator_get_container
import org.gtkkn.native.gio.g_file_enumerator_get_type
import org.gtkkn.native.gio.g_file_enumerator_has_pending
import org.gtkkn.native.gio.g_file_enumerator_is_closed
import org.gtkkn.native.gio.g_file_enumerator_next_file
import org.gtkkn.native.gio.g_file_enumerator_next_files_async
import org.gtkkn.native.gio.g_file_enumerator_next_files_finish
import org.gtkkn.native.gio.g_file_enumerator_set_pending
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * `GFileEnumerator` allows you to operate on a set of [iface@Gio.File] objects,
 * returning a [class@Gio.FileInfo] structure for each file enumerated (e.g.
 * [method@Gio.File.enumerate_children] will return a `GFileEnumerator` for each
 * of the children within a directory).
 *
 * To get the next file's information from a `GFileEnumerator`, use
 * [method@Gio.FileEnumerator.next_file] or its asynchronous version,
 * [method@Gio.FileEnumerator.next_files_async]. Note that the asynchronous
 * version will return a list of [class@Gio.FileInfo] objects, whereas the
 * synchronous will only return the next file in the enumerator.
 *
 * The ordering of returned files is unspecified for non-Unix
 * platforms; for more information, see [method@GLib.Dir.read_name].  On Unix,
 * when operating on local files, returned files will be sorted by
 * inode number.  Effectively you can assume that the ordering of
 * returned files will be stable between successive calls (and
 * applications) assuming the directory is unchanged.
 *
 * If your application needs a specific ordering, such as by name or
 * modification time, you will have to implement that in your
 * application code.
 *
 * To close a `GFileEnumerator`, use [method@Gio.FileEnumerator.close], or
 * its asynchronous version, [method@Gio.FileEnumerator.close_async]. Once
 * a `GFileEnumerator` is closed, no further actions may be performed
 * on it, and it should be freed with [method@GObject.Object.unref].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_info`: out_info: Out parameter is not supported
 * - method `container`: Property has no getter nor setter
 */
public open class FileEnumerator(public val gioFileEnumeratorPointer: CPointer<GFileEnumerator>) :
    Object(gioFileEnumeratorPointer.reinterpret()),
    KGTyped {
    /**
     * Releases all resources used by this enumerator, making the
     * enumerator return %G_IO_ERROR_CLOSED on all calls.
     *
     * This will be automatically called when the last reference
     * is dropped, but you might want to call this function to make
     * sure resources are released as early as possible.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return #TRUE on success or #FALSE on error.
     */
    public open fun close(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_enumerator_close(
            gioFileEnumeratorPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously closes the file enumerator.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned in
     * g_file_enumerator_close_finish().
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun closeAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_file_enumerator_close_async(
        gioFileEnumeratorPointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes closing a file enumerator, started from g_file_enumerator_close_async().
     *
     * If the file enumerator was already closed when g_file_enumerator_close_async()
     * was called, then this function will report %G_IO_ERROR_CLOSED in @error, and
     * return false. If the file enumerator had pending operation when the close
     * operation was started, then this function will report %G_IO_ERROR_PENDING, and
     * return false.  If @cancellable was not null, then the operation may have been
     * cancelled by triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and false will be
     * returned.
     *
     * @param result a #GAsyncResult.
     * @return true if the close operation has finished successfully.
     */
    public open fun closeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_enumerator_close_finish(
            gioFileEnumeratorPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Return a new #GFile which refers to the file named by @info in the source
     * directory of @enumerator.  This function is primarily intended to be used
     * inside loops with g_file_enumerator_next_file().
     *
     * To use this, %G_FILE_ATTRIBUTE_STANDARD_NAME must have been listed in the
     * attributes list used when creating the #GFileEnumerator.
     *
     * This is a convenience method that's equivalent to:
     * |[<!-- language="C" -->
     *   gchar *name = g_file_info_get_name (info);
     *   GFile *child = g_file_get_child (g_file_enumerator_get_container (enumr),
     *                                    name);
     * ]|
     *
     * @param info a #GFileInfo gotten from g_file_enumerator_next_file()
     *   or the async equivalents.
     * @return a #GFile for the #GFileInfo passed it.
     * @since 2.36
     */
    @GioVersion2_36
    public open fun getChild(info: FileInfo): File =
        g_file_enumerator_get_child(gioFileEnumeratorPointer, info.gioFileInfoPointer)!!.run {
            File.FileImpl(reinterpret())
        }

    /**
     * Get the #GFile container which is being enumerated.
     *
     * @return the #GFile which is being enumerated.
     * @since 2.18
     */
    @GioVersion2_18
    public open fun getContainer(): File = g_file_enumerator_get_container(gioFileEnumeratorPointer)!!.run {
        File.FileImpl(reinterpret())
    }

    /**
     * Checks if the file enumerator has pending operations.
     *
     * @return true if the @enumerator has pending operations.
     */
    public open fun hasPending(): Boolean = g_file_enumerator_has_pending(gioFileEnumeratorPointer).asBoolean()

    /**
     * Checks if the file enumerator has been closed.
     *
     * @return true if the @enumerator is closed.
     */
    public open fun isClosed(): Boolean = g_file_enumerator_is_closed(gioFileEnumeratorPointer).asBoolean()

    /**
     * Returns information for the next file in the enumerated object.
     * Will block until the information is available. The #GFileInfo
     * returned from this function will contain attributes that match the
     * attribute string that was passed when the #GFileEnumerator was created.
     *
     * See the documentation of #GFileEnumerator for information about the
     * order of returned files.
     *
     * On error, returns null and sets @error to the error. If the
     * enumerator is at the end, null will be returned and @error will
     * be unset.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return A #GFileInfo or null on error
     *    or end of enumerator.  Free the returned object with
     *    g_object_unref() when no longer needed.
     */
    public open fun nextFile(cancellable: Cancellable? = null): Result<FileInfo?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_enumerator_next_file(
            gioFileEnumeratorPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            FileInfo(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Request information for a number of files from the enumerator asynchronously.
     * When all I/O for the operation is finished the @callback will be called with
     * the requested information.
     *
     * See the documentation of #GFileEnumerator for information about the
     * order of returned files.
     *
     * Once the end of the enumerator is reached, or if an error occurs, the
     * @callback will be called with an empty list. In this case, the previous call
     * to g_file_enumerator_next_files_async() will typically have returned fewer
     * than @num_files items.
     *
     * If a request is cancelled the callback will be called with
     * %G_IO_ERROR_CANCELLED.
     *
     * This leads to the following pseudo-code usage:
     * |[
     * g_autoptr(GFile) dir = get_directory ();
     * g_autoptr(GFileEnumerator) enumerator = NULL;
     * g_autolist(GFileInfo) files = NULL;
     * g_autoptr(GError) local_error = NULL;
     *
     * enumerator = yield g_file_enumerate_children_async (dir,
     *                                                     G_FILE_ATTRIBUTE_STANDARD_NAME ","
     *                                                     G_FILE_ATTRIBUTE_STANDARD_TYPE,
     *                                                     G_FILE_QUERY_INFO_NONE,
     *                                                     G_PRIORITY_DEFAULT,
     *                                                     cancellable,
     *                                                     …,
     *                                                     &local_error);
     * if (enumerator == NULL)
     *   g_error ("Error enumerating: %s", local_error->message);
     *
     * // Loop until no files are returned, either because the end of the enumerator
     * // has been reached, or an error was returned.
     * do
     *   {
     *     files = yield g_file_enumerator_next_files_async (enumerator,
     *                                                       5,  // number of files to request
     *                                                       G_PRIORITY_DEFAULT,
     *                                                       cancellable,
     *                                                       …,
     *                                                       &local_error);
     *
     *     // Process the returned files, but don’t assume that exactly 5 were returned.
     *     for (GList *l = files; l != NULL; l = l->next)
     *       {
     *         GFileInfo *info = l->data;
     *         handle_file_info (info);
     *       }
     *   }
     * while (files != NULL);
     *
     * if (local_error != NULL &&
     *     !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_CANCELLED))
     *   g_error ("Error while enumerating: %s", local_error->message);
     * ]|
     *
     * During an async request no other sync and async calls are allowed, and will
     * result in %G_IO_ERROR_PENDING errors.
     *
     * Any outstanding I/O request with higher priority (lower numerical value) will
     * be executed before an outstanding request with lower priority. Default
     * priority is %G_PRIORITY_DEFAULT.
     *
     * @param numFiles the number of file info objects to request
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public open fun nextFilesAsync(
        numFiles: gint,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_file_enumerator_next_files_async(
        gioFileEnumeratorPointer,
        numFiles,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the asynchronous operation started with g_file_enumerator_next_files_async().
     *
     * @param result a #GAsyncResult.
     * @return a #GList of #GFileInfos. You must free the list with
     *     g_list_free() and unref the infos with g_object_unref() when you're
     *     done with them.
     */
    public open fun nextFilesFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_enumerator_next_files_finish(
            gioFileEnumeratorPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Sets the file enumerator as having pending operations.
     *
     * @param pending a boolean value.
     */
    public open fun setPending(pending: Boolean): Unit =
        g_file_enumerator_set_pending(gioFileEnumeratorPointer, pending.asGBoolean())

    public companion object : TypeCompanion<FileEnumerator> {
        override val type: GeneratedClassKGType<FileEnumerator> =
            GeneratedClassKGType(g_file_enumerator_get_type()) { FileEnumerator(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileEnumerator
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_enumerator_get_type()
    }
}
