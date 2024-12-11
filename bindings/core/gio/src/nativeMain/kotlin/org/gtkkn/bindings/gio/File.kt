// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_56
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gio.annotations.GioVersion2_68
import org.gtkkn.bindings.gio.annotations.GioVersion2_72
import org.gtkkn.bindings.gio.annotations.GioVersion2_74
import org.gtkkn.bindings.gio.annotations.GioVersion2_78
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFile
import org.gtkkn.native.gio.g_file_append_to
import org.gtkkn.native.gio.g_file_append_to_async
import org.gtkkn.native.gio.g_file_append_to_finish
import org.gtkkn.native.gio.g_file_build_attribute_list_for_copy
import org.gtkkn.native.gio.g_file_copy
import org.gtkkn.native.gio.g_file_copy_attributes
import org.gtkkn.native.gio.g_file_copy_finish
import org.gtkkn.native.gio.g_file_create
import org.gtkkn.native.gio.g_file_create_async
import org.gtkkn.native.gio.g_file_create_finish
import org.gtkkn.native.gio.g_file_create_readwrite
import org.gtkkn.native.gio.g_file_create_readwrite_async
import org.gtkkn.native.gio.g_file_create_readwrite_finish
import org.gtkkn.native.gio.g_file_delete
import org.gtkkn.native.gio.g_file_delete_async
import org.gtkkn.native.gio.g_file_delete_finish
import org.gtkkn.native.gio.g_file_dup
import org.gtkkn.native.gio.g_file_eject_mountable
import org.gtkkn.native.gio.g_file_eject_mountable_finish
import org.gtkkn.native.gio.g_file_eject_mountable_with_operation
import org.gtkkn.native.gio.g_file_eject_mountable_with_operation_finish
import org.gtkkn.native.gio.g_file_enumerate_children
import org.gtkkn.native.gio.g_file_enumerate_children_async
import org.gtkkn.native.gio.g_file_enumerate_children_finish
import org.gtkkn.native.gio.g_file_equal
import org.gtkkn.native.gio.g_file_find_enclosing_mount
import org.gtkkn.native.gio.g_file_find_enclosing_mount_async
import org.gtkkn.native.gio.g_file_find_enclosing_mount_finish
import org.gtkkn.native.gio.g_file_get_basename
import org.gtkkn.native.gio.g_file_get_child
import org.gtkkn.native.gio.g_file_get_child_for_display_name
import org.gtkkn.native.gio.g_file_get_parent
import org.gtkkn.native.gio.g_file_get_parse_name
import org.gtkkn.native.gio.g_file_get_path
import org.gtkkn.native.gio.g_file_get_relative_path
import org.gtkkn.native.gio.g_file_get_type
import org.gtkkn.native.gio.g_file_get_uri
import org.gtkkn.native.gio.g_file_get_uri_scheme
import org.gtkkn.native.gio.g_file_has_parent
import org.gtkkn.native.gio.g_file_has_prefix
import org.gtkkn.native.gio.g_file_has_uri_scheme
import org.gtkkn.native.gio.g_file_hash
import org.gtkkn.native.gio.g_file_is_native
import org.gtkkn.native.gio.g_file_load_bytes_async
import org.gtkkn.native.gio.g_file_load_contents_async
import org.gtkkn.native.gio.g_file_make_directory
import org.gtkkn.native.gio.g_file_make_directory_async
import org.gtkkn.native.gio.g_file_make_directory_finish
import org.gtkkn.native.gio.g_file_make_directory_with_parents
import org.gtkkn.native.gio.g_file_make_symbolic_link
import org.gtkkn.native.gio.g_file_make_symbolic_link_async
import org.gtkkn.native.gio.g_file_make_symbolic_link_finish
import org.gtkkn.native.gio.g_file_monitor
import org.gtkkn.native.gio.g_file_monitor_directory
import org.gtkkn.native.gio.g_file_monitor_file
import org.gtkkn.native.gio.g_file_mount_enclosing_volume
import org.gtkkn.native.gio.g_file_mount_enclosing_volume_finish
import org.gtkkn.native.gio.g_file_mount_mountable
import org.gtkkn.native.gio.g_file_mount_mountable_finish
import org.gtkkn.native.gio.g_file_move
import org.gtkkn.native.gio.g_file_move_finish
import org.gtkkn.native.gio.g_file_new_build_filenamev
import org.gtkkn.native.gio.g_file_new_for_commandline_arg
import org.gtkkn.native.gio.g_file_new_for_commandline_arg_and_cwd
import org.gtkkn.native.gio.g_file_new_for_path
import org.gtkkn.native.gio.g_file_new_for_uri
import org.gtkkn.native.gio.g_file_new_tmp_async
import org.gtkkn.native.gio.g_file_new_tmp_dir_async
import org.gtkkn.native.gio.g_file_new_tmp_dir_finish
import org.gtkkn.native.gio.g_file_open_readwrite
import org.gtkkn.native.gio.g_file_open_readwrite_async
import org.gtkkn.native.gio.g_file_open_readwrite_finish
import org.gtkkn.native.gio.g_file_parse_name
import org.gtkkn.native.gio.g_file_peek_path
import org.gtkkn.native.gio.g_file_poll_mountable
import org.gtkkn.native.gio.g_file_poll_mountable_finish
import org.gtkkn.native.gio.g_file_query_default_handler
import org.gtkkn.native.gio.g_file_query_default_handler_async
import org.gtkkn.native.gio.g_file_query_default_handler_finish
import org.gtkkn.native.gio.g_file_query_exists
import org.gtkkn.native.gio.g_file_query_file_type
import org.gtkkn.native.gio.g_file_query_filesystem_info
import org.gtkkn.native.gio.g_file_query_filesystem_info_async
import org.gtkkn.native.gio.g_file_query_filesystem_info_finish
import org.gtkkn.native.gio.g_file_query_info
import org.gtkkn.native.gio.g_file_query_info_async
import org.gtkkn.native.gio.g_file_query_info_finish
import org.gtkkn.native.gio.g_file_query_settable_attributes
import org.gtkkn.native.gio.g_file_query_writable_namespaces
import org.gtkkn.native.gio.g_file_read
import org.gtkkn.native.gio.g_file_read_async
import org.gtkkn.native.gio.g_file_read_finish
import org.gtkkn.native.gio.g_file_replace
import org.gtkkn.native.gio.g_file_replace_async
import org.gtkkn.native.gio.g_file_replace_contents_bytes_async
import org.gtkkn.native.gio.g_file_replace_finish
import org.gtkkn.native.gio.g_file_replace_readwrite
import org.gtkkn.native.gio.g_file_replace_readwrite_async
import org.gtkkn.native.gio.g_file_replace_readwrite_finish
import org.gtkkn.native.gio.g_file_resolve_relative_path
import org.gtkkn.native.gio.g_file_set_attribute_byte_string
import org.gtkkn.native.gio.g_file_set_attribute_int32
import org.gtkkn.native.gio.g_file_set_attribute_int64
import org.gtkkn.native.gio.g_file_set_attribute_string
import org.gtkkn.native.gio.g_file_set_attribute_uint32
import org.gtkkn.native.gio.g_file_set_attribute_uint64
import org.gtkkn.native.gio.g_file_set_attributes_async
import org.gtkkn.native.gio.g_file_set_attributes_from_info
import org.gtkkn.native.gio.g_file_set_display_name
import org.gtkkn.native.gio.g_file_set_display_name_async
import org.gtkkn.native.gio.g_file_set_display_name_finish
import org.gtkkn.native.gio.g_file_start_mountable
import org.gtkkn.native.gio.g_file_start_mountable_finish
import org.gtkkn.native.gio.g_file_stop_mountable
import org.gtkkn.native.gio.g_file_stop_mountable_finish
import org.gtkkn.native.gio.g_file_supports_thread_contexts
import org.gtkkn.native.gio.g_file_trash
import org.gtkkn.native.gio.g_file_trash_async
import org.gtkkn.native.gio.g_file_trash_finish
import org.gtkkn.native.gio.g_file_unmount_mountable
import org.gtkkn.native.gio.g_file_unmount_mountable_finish
import org.gtkkn.native.gio.g_file_unmount_mountable_with_operation
import org.gtkkn.native.gio.g_file_unmount_mountable_with_operation_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.gint64
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gobject.guint64
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GFile` is a high level abstraction for manipulating files on a
 * virtual file system. `GFile`s are lightweight, immutable objects
 * that do no I/O upon creation. It is necessary to understand that
 * `GFile` objects do not represent files, merely an identifier for a
 * file. All file content I/O is implemented as streaming operations
 * (see [class@Gio.InputStream] and [class@Gio.OutputStream]).
 *
 * To construct a `GFile`, you can use:
 *
 * - [func@Gio.File.new_for_path] if you have a path.
 * - [func@Gio.File.new_for_uri] if you have a URI.
 * - [func@Gio.File.new_for_commandline_arg] or
 *   [func@Gio.File.new_for_commandline_arg_and_cwd] for a command line
 *   argument.
 * - [func@Gio.File.new_tmp] to create a temporary file from a template.
 * - [func@Gio.File.new_tmp_async] to asynchronously create a temporary file.
 * - [func@Gio.File.new_tmp_dir_async] to asynchronously create a temporary
 *   directory.
 * - [func@Gio.File.parse_name] from a UTF-8 string gotten from
 *   [method@Gio.File.get_parse_name].
 * - [func@Gio.File.new_build_filename] or [func@Gio.File.new_build_filenamev]
 *   to create a file from path elements.
 *
 * One way to think of a `GFile` is as an abstraction of a pathname. For
 * normal files the system pathname is what is stored internally, but as
 * `GFile`s are extensible it could also be something else that corresponds
 * to a pathname in a userspace implementation of a filesystem.
 *
 * `GFile`s make up hierarchies of directories and files that correspond to
 * the files on a filesystem. You can move through the file system with
 * `GFile` using [method@Gio.File.get_parent] to get an identifier for the
 * parent directory, [method@Gio.File.get_child] to get a child within a
 * directory, and [method@Gio.File.resolve_relative_path] to resolve a relative
 * path between two `GFile`s. There can be multiple hierarchies, so you may not
 * end up at the same root if you repeatedly call [method@Gio.File.get_parent]
 * on two different files.
 *
 * All `GFile`s have a basename (get with [method@Gio.File.get_basename]). These
 * names are byte strings that are used to identify the file on the filesystem
 * (relative to its parent directory) and there is no guarantees that they
 * have any particular charset encoding or even make any sense at all. If
 * you want to use filenames in a user interface you should use the display
 * name that you can get by requesting the
 * `G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME` attribute with
 * [method@Gio.File.query_info]. This is guaranteed to be in UTF-8 and can be
 * used in a user interface. But always store the real basename or the `GFile`
 * to use to actually access the file, because there is no way to go from a
 * display name to the actual name.
 *
 * Using `GFile` as an identifier has the same weaknesses as using a path
 * in that there may be multiple aliases for the same file. For instance,
 * hard or soft links may cause two different `GFile`s to refer to the same
 * file. Other possible causes for aliases are: case insensitive filesystems,
 * short and long names on FAT/NTFS, or bind mounts in Linux. If you want to
 * check if two `GFile`s point to the same file you can query for the
 * `G_FILE_ATTRIBUTE_ID_FILE` attribute. Note that `GFile` does some trivial
 * canonicalization of pathnames passed in, so that trivial differences in
 * the path string used at creation (duplicated slashes, slash at end of
 * path, `.` or `..` path segments, etc) does not create different `GFile`s.
 *
 * Many `GFile` operations have both synchronous and asynchronous versions
 * to suit your application. Asynchronous versions of synchronous functions
 * simply have `_async()` appended to their function names. The asynchronous
 * I/O functions call a [callback@Gio.AsyncReadyCallback] which is then used to
 * finalize the operation, producing a [iface@Gio.AsyncResult] which is then
 * passed to the function’s matching `_finish()` operation.
 *
 * It is highly recommended to use asynchronous calls when running within a
 * shared main loop, such as in the main thread of an application. This avoids
 * I/O operations blocking other sources on the main loop from being dispatched.
 * Synchronous I/O operations should be performed from worker threads. See the
 * [introduction to asynchronous programming section](overview.html#asynchronous-programming)
 * for more.
 *
 * Some `GFile` operations almost always take a noticeable amount of time, and
 * so do not have synchronous analogs. Notable cases include:
 *
 * - [method@Gio.File.mount_mountable] to mount a mountable file.
 * - [method@Gio.File.unmount_mountable_with_operation] to unmount a mountable
 *   file.
 * - [method@Gio.File.eject_mountable_with_operation] to eject a mountable file.
 *
 * ## Entity Tags
 *
 * One notable feature of `GFile`s are entity tags, or ‘etags’ for
 * short. Entity tags are somewhat like a more abstract version of the
 * traditional mtime, and can be used to quickly determine if the file
 * has been modified from the version on the file system. See the
 * HTTP 1.1
 * [specification](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html)
 * for HTTP `ETag` headers, which are a very similar concept.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `callback`: AsyncReadyCallback
 * - parameter `etag_out`: etag_out: Out parameter is not supported
 * - parameter `etag_out`: etag_out: Out parameter is not supported
 * - parameter `contents`: contents: Out parameter is not supported
 * - parameter `contents`: contents: Out parameter is not supported
 * - parameter `callback`: AsyncReadyCallback
 * - parameter `contents`: contents: Out parameter is not supported
 * - parameter `disk_usage`: disk_usage: Out parameter is not supported
 * - parameter `callback`: AsyncReadyCallback
 * - parameter `disk_usage`: disk_usage: Out parameter is not supported
 * - parameter `callback`: AsyncReadyCallback
 * - parameter `contents`: Array parameter of type guint8 is not supported
 * - parameter `contents`: Array parameter of type guint8 is not supported
 * - parameter `new_etag`: new_etag: Out parameter is not supported
 * - parameter `value_p`: gpointer
 * - parameter `info`: info: Out parameter is not supported
 * - function `new_build_filename`: Varargs parameter is not supported
 * - parameter `iostream`: iostream: Out parameter is not supported
 * - parameter `iostream`: iostream: Out parameter is not supported
 */
public interface File :
    Interface,
    KGTyped {
    public val gioFilePointer: CPointer<GFile>

    /**
     * Gets an output stream for appending data to the file.
     * If the file doesn't already exist it is created.
     *
     * By default files created are generally readable by everyone,
     * but if you pass %G_FILE_CREATE_PRIVATE in @flags the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * Some file systems don't allow all file names, and may return an
     * %G_IO_ERROR_INVALID_FILENAME error. If the file is a directory the
     * %G_IO_ERROR_IS_DIRECTORY error will be returned. Other errors are
     * possible too, and depend on what kind of filesystem the file is on.
     *
     * @param flags a set of #GFileCreateFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileOutputStream, or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun appendTo(flags: FileCreateFlags, cancellable: Cancellable? = null): Result<FileOutputStream> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_file_append_to(
                gioFilePointer.reinterpret(),
                flags.mask,
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )?.run {
                FileOutputStream(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Asynchronously opens @file for appending.
     *
     * For more details, see g_file_append_to() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_append_to_finish() to get the result
     * of the operation.
     *
     * @param flags a set of #GFileCreateFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun appendToAsync(
        flags: FileCreateFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_append_to_async(
        gioFilePointer.reinterpret(),
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file append operation started with
     * g_file_append_to_async().
     *
     * @param res #GAsyncResult
     * @return a valid #GFileOutputStream
     *   or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun appendToFinish(res: AsyncResult): Result<FileOutputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_append_to_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileOutputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Prepares the file attribute query string for copying to @file.
     *
     * This function prepares an attribute query string to be
     * passed to g_file_query_info() to get a list of attributes
     * normally copied with the file (see g_file_copy_attributes()
     * for the detailed description). This function is used by the
     * implementation of g_file_copy_attributes() and is useful
     * when one needs to query and set the attributes in two
     * stages (e.g., for recursive move of a directory).
     *
     * @param flags a set of #GFileCopyFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return an attribute query string for g_file_query_info(),
     *   or null if an error occurs.
     * @since 2.68
     */
    @GioVersion2_68
    public fun buildAttributeListForCopy(flags: FileCopyFlags, cancellable: Cancellable? = null): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_file_build_attribute_list_for_copy(
                gioFilePointer.reinterpret(),
                flags.mask,
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Copies the file @source to the location specified by @destination.
     * Can not handle recursive copies of directories.
     *
     * If the flag %G_FILE_COPY_OVERWRITE is specified an already
     * existing @destination file is overwritten.
     *
     * If the flag %G_FILE_COPY_NOFOLLOW_SYMLINKS is specified then symlinks
     * will be copied as symlinks, otherwise the target of the
     * @source symlink will be copied.
     *
     * If the flag %G_FILE_COPY_ALL_METADATA is specified then all the metadata
     * that is possible to copy is copied, not just the default subset (which,
     * for instance, does not include the owner, see #GFileInfo).
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * If @progress_callback is not null, then the operation can be monitored
     * by setting this to a #GFileProgressCallback function.
     * @progress_callback_data will be passed to this function. It is guaranteed
     * that this callback will be called after all data has been transferred with
     * the total number of bytes copied during the operation.
     *
     * If the @source file does not exist, then the %G_IO_ERROR_NOT_FOUND error
     * is returned, independent on the status of the @destination.
     *
     * If %G_FILE_COPY_OVERWRITE is not specified and the target exists, then
     * the error %G_IO_ERROR_EXISTS is returned.
     *
     * If trying to overwrite a file over a directory, the %G_IO_ERROR_IS_DIRECTORY
     * error is returned. If trying to overwrite a directory with a directory the
     * %G_IO_ERROR_WOULD_MERGE error is returned.
     *
     * If the source is a directory and the target does not exist, or
     * %G_FILE_COPY_OVERWRITE is specified and the target is a file, then the
     * %G_IO_ERROR_WOULD_RECURSE error is returned.
     *
     * If you are interested in copying the #GFile object itself (not the on-disk
     * file), see g_file_dup().
     *
     * @param destination destination #GFile
     * @param flags set of #GFileCopyFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param progressCallback function to callback with
     *   progress information, or null if progress information is not needed
     * @return true on success, false otherwise.
     */
    public fun copy(
        destination: File,
        flags: FileCopyFlags,
        cancellable: Cancellable? = null,
        progressCallback: FileProgressCallback,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_copy(
            gioFilePointer.reinterpret(),
            destination.gioFilePointer,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            FileProgressCallbackFunc.reinterpret(),
            StableRef.create(progressCallback).asCPointer(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Copies the file attributes from @source to @destination.
     *
     * Normally only a subset of the file attributes are copied,
     * those that are copies in a normal file copy operation
     * (which for instance does not include e.g. owner). However
     * if %G_FILE_COPY_ALL_METADATA is specified in @flags, then
     * all the metadata that is possible to copy is copied. This
     * is useful when implementing move by copy + delete source.
     *
     * @param destination a #GFile to copy attributes to
     * @param flags a set of #GFileCopyFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the attributes were copied successfully,
     *   false otherwise.
     */
    public fun copyAttributes(
        destination: File,
        flags: FileCopyFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_copy_attributes(
            gioFilePointer.reinterpret(),
            destination.gioFilePointer,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Finishes copying the file started with g_file_copy_async().
     *
     * @param res a #GAsyncResult
     * @return a true on success, false on error.
     */
    public fun copyFinish(res: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_copy_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates a new file and returns an output stream for writing to it.
     * The file must not already exist.
     *
     * By default files created are generally readable by everyone,
     * but if you pass %G_FILE_CREATE_PRIVATE in @flags the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * If a file or directory with this name already exists the
     * %G_IO_ERROR_EXISTS error will be returned. Some file systems don't
     * allow all file names, and may return an %G_IO_ERROR_INVALID_FILENAME
     * error, and if the name is to long %G_IO_ERROR_FILENAME_TOO_LONG will
     * be returned. Other errors are possible too, and depend on what kind
     * of filesystem the file is on.
     *
     * @param flags a set of #GFileCreateFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileOutputStream for the newly created
     *   file, or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun create(flags: FileCreateFlags, cancellable: Cancellable? = null): Result<FileOutputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_create(
            gioFilePointer.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileOutputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously creates a new file and returns an output stream
     * for writing to it. The file must not already exist.
     *
     * For more details, see g_file_create() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_create_finish() to get the result
     * of the operation.
     *
     * @param flags a set of #GFileCreateFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun createAsync(
        flags: FileCreateFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_create_async(
        gioFilePointer.reinterpret(),
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileOutputStream or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun createFinish(res: AsyncResult): Result<FileOutputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_create_finish(gioFilePointer.reinterpret(), res.gioAsyncResultPointer, gError.ptr)?.run {
            FileOutputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Creates a new file and returns a stream for reading and
     * writing to it. The file must not already exist.
     *
     * By default files created are generally readable by everyone,
     * but if you pass %G_FILE_CREATE_PRIVATE in @flags the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * If a file or directory with this name already exists, the
     * %G_IO_ERROR_EXISTS error will be returned. Some file systems don't
     * allow all file names, and may return an %G_IO_ERROR_INVALID_FILENAME
     * error, and if the name is too long, %G_IO_ERROR_FILENAME_TOO_LONG
     * will be returned. Other errors are possible too, and depend on what
     * kind of filesystem the file is on.
     *
     * Note that in many non-local file cases read and write streams are
     * not supported, so make sure you really need to do read and write
     * streaming, rather than just opening for reading or writing.
     *
     * @param flags a set of #GFileCreateFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileIOStream for the newly created
     *   file, or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public fun createReadwrite(flags: FileCreateFlags, cancellable: Cancellable? = null): Result<FileIOStream> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_file_create_readwrite(
                gioFilePointer.reinterpret(),
                flags.mask,
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )?.run {
                FileIOStream(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Asynchronously creates a new file and returns a stream
     * for reading and writing to it. The file must not already exist.
     *
     * For more details, see g_file_create_readwrite() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_create_readwrite_finish() to get
     * the result of the operation.
     *
     * @param flags a set of #GFileCreateFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    @GioVersion2_22
    public fun createReadwriteAsync(
        flags: FileCreateFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_create_readwrite_async(
        gioFilePointer.reinterpret(),
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_readwrite_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileIOStream or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public fun createReadwriteFinish(res: AsyncResult): Result<FileIOStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_create_readwrite_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileIOStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Deletes a file. If the @file is a directory, it will only be
     * deleted if it is empty. This has the same semantics as g_unlink().
     *
     * If @file doesn’t exist, %G_IO_ERROR_NOT_FOUND will be returned. This allows
     * for deletion to be implemented avoiding
     * [time-of-check to time-of-use races](https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use):
     * |[
     * g_autoptr(GError) local_error = NULL;
     * if (!g_file_delete (my_file, my_cancellable, &local_error) &&
     *     !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_NOT_FOUND))
     *   {
     *     // deletion failed for some reason other than the file not existing:
     *     // so report the error
     *     g_warning ("Failed to delete %s: %s",
     *                g_file_peek_path (my_file), local_error->message);
     *   }
     * ]|
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the file was deleted. false otherwise.
     */
    public fun delete(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_delete(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously delete a file. If the @file is a directory, it will
     * only be deleted if it is empty.  This has the same semantics as
     * g_unlink().
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied
     * @since 2.34
     */
    @GioVersion2_34
    public fun deleteAsync(ioPriority: gint, cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        g_file_delete_async(
            gioFilePointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes deleting a file started with g_file_delete_async().
     *
     * @param result a #GAsyncResult
     * @return true if the file was deleted. false otherwise.
     * @since 2.34
     */
    @GioVersion2_34
    public fun deleteFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_delete_finish(
            gioFilePointer.reinterpret(),
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
     * Duplicates a #GFile handle. This operation does not duplicate
     * the actual file or directory represented by the #GFile; see
     * g_file_copy() if attempting to copy a file.
     *
     * g_file_dup() is useful when a second handle is needed to the same underlying
     * file, for use in a separate thread (#GFile is not thread-safe). For use
     * within the same thread, use g_object_ref() to increment the existing object’s
     * reference count.
     *
     * This call does no blocking I/O.
     *
     * @return a new #GFile that is a duplicate
     *   of the given #GFile.
     */
    public fun dup(): File = g_file_dup(gioFilePointer.reinterpret())!!.run {
        File.wrap(reinterpret())
    }

    /**
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_eject_mountable_finish().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param flags flags affecting the operation
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun ejectMountable(
        flags: MountUnmountFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_eject_mountable(
        gioFilePointer.reinterpret(),
        flags.mask,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous eject operation started by
     * g_file_eject_mountable().
     *
     * @param result a #GAsyncResult
     * @return true if the @file was ejected successfully.
     *   false otherwise.
     */
    public fun ejectMountableFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_eject_mountable_finish(
            gioFilePointer.reinterpret(),
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
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_eject_mountable_with_operation_finish().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation,
     *   or null to avoid user interaction
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectMountableWithOperation(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_eject_mountable_with_operation(
        gioFilePointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous eject operation started by
     * g_file_eject_mountable_with_operation().
     *
     * @param result a #GAsyncResult
     * @return true if the @file was ejected successfully.
     *   false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun ejectMountableWithOperationFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_eject_mountable_with_operation_finish(
            gioFilePointer.reinterpret(),
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
     * Gets the requested information about the files in a directory.
     * The result is a #GFileEnumerator object that will give out
     * #GFileInfo objects for all the files in the directory.
     *
     * The @attributes value is a string that specifies the file
     * attributes that should be gathered. It is not an error if
     * it's not possible to read a particular requested attribute
     * from a file - it just won't be set. @attributes should
     * be a comma-separated list of attributes or attribute wildcards.
     * The wildcard "*" means all attributes, and a wildcard like
     * "standard::*" means all attributes in the standard namespace.
     * An example attribute query be "standard::*,owner::user".
     * The standard attributes are available as defines, like
     * %G_FILE_ATTRIBUTE_STANDARD_NAME. %G_FILE_ATTRIBUTE_STANDARD_NAME should
     * always be specified if you plan to call g_file_enumerator_get_child() or
     * g_file_enumerator_iterate() on the returned enumerator.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * be returned. If the file is not a directory, the %G_IO_ERROR_NOT_DIRECTORY
     * error will be returned. Other errors are possible too.
     *
     * @param attributes an attribute query string
     * @param flags a set of #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return A #GFileEnumerator if successful,
     *   null on error. Free the returned object with g_object_unref().
     */
    public fun enumerateChildren(
        attributes: String,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<FileEnumerator> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_enumerate_children(
            gioFilePointer.reinterpret(),
            attributes,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileEnumerator(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously gets the requested information about the files
     * in a directory. The result is a #GFileEnumerator object that will
     * give out #GFileInfo objects for all the files in the directory.
     *
     * For more details, see g_file_enumerate_children() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called. You can
     * then call g_file_enumerate_children_finish() to get the result of
     * the operation.
     *
     * @param attributes an attribute query string
     * @param flags a set of #GFileQueryInfoFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun enumerateChildrenAsync(
        attributes: String,
        flags: FileQueryInfoFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_enumerate_children_async(
        gioFilePointer.reinterpret(),
        attributes,
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an async enumerate children operation.
     * See g_file_enumerate_children_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileEnumerator or null
     *   if an error occurred.
     *   Free the returned object with g_object_unref().
     */
    public fun enumerateChildrenFinish(res: AsyncResult): Result<FileEnumerator> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_enumerate_children_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileEnumerator(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Checks if the two given #GFiles refer to the same file.
     *
     * Note that two #GFiles that differ can still refer to the same
     * file on the filesystem due to various forms of filename
     * aliasing.
     *
     * This call does no blocking I/O.
     *
     * @param file2 the second #GFile
     * @return true if @file1 and @file2 are equal.
     */
    public fun equal(file2: File): Boolean =
        g_file_equal(gioFilePointer.reinterpret(), file2.gioFilePointer).asBoolean()

    /**
     * Gets a #GMount for the #GFile.
     *
     * #GMount is returned only for user interesting locations, see
     * #GVolumeMonitor. If the #GFileIface for @file does not have a #mount,
     * @error will be set to %G_IO_ERROR_NOT_FOUND and null #will be returned.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GMount where the @file is located
     *   or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun findEnclosingMount(cancellable: Cancellable? = null): Result<Mount> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_find_enclosing_mount(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            Mount.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously gets the mount for the file.
     *
     * For more details, see g_file_find_enclosing_mount() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_find_enclosing_mount_finish() to
     * get the result of the operation.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun findEnclosingMountAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_find_enclosing_mount_async(
        gioFilePointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous find mount request.
     * See g_file_find_enclosing_mount_async().
     *
     * @param res a #GAsyncResult
     * @return #GMount for given @file or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun findEnclosingMountFinish(res: AsyncResult): Result<Mount> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_find_enclosing_mount_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Mount.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Gets the base name (the last component of the path) for a given #GFile.
     *
     * If called for the top level of a system (such as the filesystem root
     * or a uri like sftp://host/) it will return a single directory separator
     * (and on Windows, possibly a drive letter).
     *
     * The base name is a byte string (not UTF-8). It has no defined encoding
     * or rules other than it may not contain zero bytes.  If you want to use
     * filenames in a user interface you should use the display name that you
     * can get by requesting the %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME
     * attribute with g_file_query_info().
     *
     * This call does no blocking I/O.
     *
     * @return string containing the #GFile's
     *   base name, or null if given #GFile is invalid. The returned string
     *   should be freed with g_free() when no longer needed.
     */
    public fun getBasename(): String? = g_file_get_basename(gioFilePointer.reinterpret())?.toKString()

    /**
     * Gets a child of @file with basename equal to @name.
     *
     * Note that the file with that specific name might not exist, but
     * you can still have a #GFile that points to it. You can use this
     * for instance to create that file.
     *
     * This call does no blocking I/O.
     *
     * @param name string containing the child's basename
     * @return a #GFile to a child specified by @name.
     *   Free the returned object with g_object_unref().
     */
    public fun getChild(name: String): File = g_file_get_child(gioFilePointer.reinterpret(), name)!!.run {
        File.wrap(reinterpret())
    }

    /**
     * Gets the child of @file for a given @display_name (i.e. a UTF-8
     * version of the name). If this function fails, it returns null
     * and @error will be set. This is very useful when constructing a
     * #GFile for a new file and the user entered the filename in the
     * user interface, for instance when you select a directory and
     * type a filename in the file selector.
     *
     * This call does no blocking I/O.
     *
     * @param displayName string to a possible child
     * @return a #GFile to the specified child, or
     *   null if the display name couldn't be converted.
     *   Free the returned object with g_object_unref().
     */
    public fun getChildForDisplayName(displayName: String): Result<File> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_get_child_for_display_name(gioFilePointer.reinterpret(), displayName, gError.ptr)?.run {
            File.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Gets the parent directory for the @file.
     * If the @file represents the root directory of the
     * file system, then null will be returned.
     *
     * This call does no blocking I/O.
     *
     * @return a #GFile structure to the
     *   parent of the given #GFile or null if there is no parent. Free
     *   the returned object with g_object_unref().
     */
    public fun getParent(): File? = g_file_get_parent(gioFilePointer.reinterpret())?.run {
        File.wrap(reinterpret())
    }

    /**
     * Gets the parse name of the @file.
     * A parse name is a UTF-8 string that describes the
     * file such that one can get the #GFile back using
     * g_file_parse_name().
     *
     * This is generally used to show the #GFile as a nice
     * full-pathname kind of string in a user interface,
     * like in a location entry.
     *
     * For local files with names that can safely be converted
     * to UTF-8 the pathname is used, otherwise the IRI is used
     * (a form of URI that allows UTF-8 characters unescaped).
     *
     * This call does no blocking I/O.
     *
     * @return a string containing the #GFile's parse name.
     *   The returned string should be freed with g_free()
     *   when no longer needed.
     */
    public fun getParseName(): String =
        g_file_get_parse_name(gioFilePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the local pathname for #GFile, if one exists. If non-null, this is
     * guaranteed to be an absolute, canonical path. It might contain symlinks.
     *
     * This call does no blocking I/O.
     *
     * @return string containing the #GFile's path,
     *   or null if no such path exists. The returned string should be freed
     *   with g_free() when no longer needed.
     */
    public fun getPath(): String? = g_file_get_path(gioFilePointer.reinterpret())?.toKString()

    /**
     * Gets the path for @descendant relative to @parent.
     *
     * This call does no blocking I/O.
     *
     * @param descendant input #GFile
     * @return string with the relative path from
     *   @descendant to @parent, or null if @descendant doesn't have @parent as
     *   prefix. The returned string should be freed with g_free() when
     *   no longer needed.
     */
    public fun getRelativePath(descendant: File): String? =
        g_file_get_relative_path(gioFilePointer.reinterpret(), descendant.gioFilePointer)?.toKString()

    /**
     * Gets the URI for the @file.
     *
     * This call does no blocking I/O.
     *
     * @return a string containing the #GFile's URI. If the #GFile was constructed
     *   with an invalid URI, an invalid URI is returned.
     *   The returned string should be freed with g_free()
     *   when no longer needed.
     */
    public fun getUri(): String =
        g_file_get_uri(gioFilePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the URI scheme for a #GFile.
     * RFC 3986 decodes the scheme as:
     * |[
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * ]|
     * Common schemes include "file", "http", "ftp", etc.
     *
     * The scheme can be different from the one used to construct the #GFile,
     * in that it might be replaced with one that is logically equivalent to the #GFile.
     *
     * This call does no blocking I/O.
     *
     * @return a string containing the URI scheme for the given
     *   #GFile or null if the #GFile was constructed with an invalid URI. The
     *   returned string should be freed with g_free() when no longer needed.
     */
    public fun getUriScheme(): String? = g_file_get_uri_scheme(gioFilePointer.reinterpret())?.toKString()

    /**
     * Checks if @file has a parent, and optionally, if it is @parent.
     *
     * If @parent is null then this function returns true if @file has any
     * parent at all.  If @parent is non-null then true is only returned
     * if @file is an immediate child of @parent.
     *
     * @param parent the parent to check for, or null
     * @return true if @file is an immediate child of @parent (or any parent in
     *   the case that @parent is null).
     * @since 2.24
     */
    @GioVersion2_24
    public fun hasParent(parent: File? = null): Boolean =
        g_file_has_parent(gioFilePointer.reinterpret(), parent?.gioFilePointer).asBoolean()

    /**
     * Checks whether @file has the prefix specified by @prefix.
     *
     * In other words, if the names of initial elements of @file's
     * pathname match @prefix. Only full pathname elements are matched,
     * so a path like /foo is not considered a prefix of /foobar, only
     * of /foo/bar.
     *
     * A #GFile is not a prefix of itself. If you want to check for
     * equality, use g_file_equal().
     *
     * This call does no I/O, as it works purely on names. As such it can
     * sometimes return false even if @file is inside a @prefix (from a
     * filesystem point of view), because the prefix of @file is an alias
     * of @prefix.
     *
     * @param prefix input #GFile
     * @return true if the @file's parent, grandparent, etc is @prefix,
     *   false otherwise.
     */
    public fun hasPrefix(prefix: File): Boolean =
        g_file_has_prefix(gioFilePointer.reinterpret(), prefix.gioFilePointer).asBoolean()

    /**
     * Checks to see if a #GFile has a given URI scheme.
     *
     * This call does no blocking I/O.
     *
     * @param uriScheme a string containing a URI scheme
     * @return true if #GFile's backend supports the
     *   given URI scheme, false if URI scheme is null,
     *   not supported, or #GFile is invalid.
     */
    public fun hasUriScheme(uriScheme: String): Boolean =
        g_file_has_uri_scheme(gioFilePointer.reinterpret(), uriScheme).asBoolean()

    /**
     * Creates a hash value for a #GFile.
     *
     * This call does no blocking I/O.
     *
     * @return 0 if @file is not a valid #GFile, otherwise an
     *   integer that can be used as hash value for the #GFile.
     *   This function is intended for easily hashing a #GFile to
     *   add to a #GHashTable or similar data structure.
     */
    public fun hash(): guint = g_file_hash(gioFilePointer.reinterpret())

    /**
     * Checks to see if a file is native to the platform.
     *
     * A native file is one expressed in the platform-native filename format,
     * e.g. "C:\Windows" or "/usr/bin/". This does not mean the file is local,
     * as it might be on a locally mounted remote filesystem.
     *
     * On some systems non-native files may be available using the native
     * filesystem via a userspace filesystem (FUSE), in these cases this call
     * will return false, but g_file_get_path() will still return a native path.
     *
     * This call does no blocking I/O.
     *
     * @return true if @file is native
     */
    public fun isNative(): Boolean = g_file_is_native(gioFilePointer.reinterpret()).asBoolean()

    /**
     * Asynchronously loads the contents of @file as #GBytes.
     *
     * If @file is a resource:// based URI, the resulting bytes will reference the
     * embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * g_file_load_contents_async() and g_bytes_new_take().
     *
     * @callback should call g_file_load_bytes_finish() to get the result of this
     * asynchronous operation.
     *
     * See g_file_load_bytes() for more information.
     *
     * @param cancellable a #GCancellable or null
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.56
     */
    @GioVersion2_56
    public fun loadBytesAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        g_file_load_bytes_async(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Starts an asynchronous load of the @file's contents.
     *
     * For more details, see g_file_load_contents() which is
     * the synchronous version of this call.
     *
     * When the load operation has completed, @callback will be called
     * with @user data. To finish the operation, call
     * g_file_load_contents_finish() with the #GAsyncResult returned by
     * the @callback.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     */
    public fun loadContentsAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        g_file_load_contents_async(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Creates a directory. Note that this will only create a child directory
     * of the immediate parent directory of the path or URI given by the #GFile.
     * To recursively create directories, see g_file_make_directory_with_parents().
     * This function will fail if the parent directory does not exist, setting
     * @error to %G_IO_ERROR_NOT_FOUND. If the file system doesn't support
     * creating directories, this function will fail, setting @error to
     * %G_IO_ERROR_NOT_SUPPORTED.
     *
     * For a local #GFile the newly created directory will have the default
     * (current) ownership and permissions of the current process.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true on successful creation, false otherwise.
     */
    public fun makeDirectory(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_make_directory(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously creates a directory.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied
     * @since 2.38
     */
    @GioVersion2_38
    public fun makeDirectoryAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_make_directory_async(
        gioFilePointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous directory creation, started with
     * g_file_make_directory_async().
     *
     * @param result a #GAsyncResult
     * @return true on successful directory creation, false otherwise.
     * @since 2.38
     */
    @GioVersion2_38
    public fun makeDirectoryFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_make_directory_finish(
            gioFilePointer.reinterpret(),
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
     * Creates a directory and any parent directories that may not
     * exist similar to 'mkdir -p'. If the file system does not support
     * creating directories, this function will fail, setting @error to
     * %G_IO_ERROR_NOT_SUPPORTED. If the directory itself already exists,
     * this function will fail setting @error to %G_IO_ERROR_EXISTS, unlike
     * the similar g_mkdir_with_parents().
     *
     * For a local #GFile the newly created directories will have the default
     * (current) ownership and permissions of the current process.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if all directories have been successfully created, false
     * otherwise.
     * @since 2.18
     */
    @GioVersion2_18
    public fun makeDirectoryWithParents(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_make_directory_with_parents(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates a symbolic link named @file which contains the string
     * @symlink_value.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param symlinkValue a string with the path for the target
     *   of the new symlink
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true on the creation of a new symlink, false otherwise.
     */
    public fun makeSymbolicLink(symlinkValue: String, cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_make_symbolic_link(
            gioFilePointer.reinterpret(),
            symlinkValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously creates a symbolic link named @file which contains the
     * string @symlink_value.
     *
     * @param symlinkValue a string with the path for the target
     *   of the new symlink
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied
     * @since 2.74
     */
    @GioVersion2_74
    public fun makeSymbolicLinkAsync(
        symlinkValue: String,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_make_symbolic_link_async(
        gioFilePointer.reinterpret(),
        symlinkValue,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous symbolic link creation, started with
     * g_file_make_symbolic_link_async().
     *
     * @param result a #GAsyncResult
     * @return true on successful directory creation, false otherwise.
     * @since 2.74
     */
    @GioVersion2_74
    public fun makeSymbolicLinkFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_make_symbolic_link_finish(
            gioFilePointer.reinterpret(),
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
     * Obtains a file or directory monitor for the given file,
     * depending on the type of the file.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param flags a set of #GFileMonitorFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileMonitor for the given @file,
     *   or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.18
     */
    @GioVersion2_18
    public fun monitor(flags: FileMonitorFlags, cancellable: Cancellable? = null): Result<FileMonitor> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_monitor(
            gioFilePointer.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileMonitor(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Obtains a directory monitor for the given file.
     * This may fail if directory monitoring is not supported.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * It does not make sense for @flags to contain
     * %G_FILE_MONITOR_WATCH_HARD_LINKS, since hard links can not be made to
     * directories.  It is not possible to monitor all the files in a
     * directory for changes made via hard links; if you want to do this then
     * you must register individual watches with g_file_monitor().
     *
     * @param flags a set of #GFileMonitorFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileMonitor for the given @file,
     *   or null on error. Free the returned object with g_object_unref().
     */
    public fun monitorDirectory(flags: FileMonitorFlags, cancellable: Cancellable? = null): Result<FileMonitor> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_file_monitor_directory(
                gioFilePointer.reinterpret(),
                flags.mask,
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )?.run {
                FileMonitor(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Obtains a file monitor for the given file. If no file notification
     * mechanism exists, then regular polling of the file is used.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * If @flags contains %G_FILE_MONITOR_WATCH_HARD_LINKS then the monitor
     * will also attempt to report changes made to the file via another
     * filename (ie, a hard link). Without this flag, you can only rely on
     * changes made through the filename contained in @file to be
     * reported. Using this flag may result in an increase in resource
     * usage, and may not have any effect depending on the #GFileMonitor
     * backend and/or filesystem type.
     *
     * @param flags a set of #GFileMonitorFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileMonitor for the given @file,
     *   or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun monitorFile(flags: FileMonitorFlags, cancellable: Cancellable? = null): Result<FileMonitor> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_monitor_file(
            gioFilePointer.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileMonitor(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Starts a @mount_operation, mounting the volume that contains
     * the file @location.
     *
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_mount_enclosing_volume_finish().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation
     *   or null to avoid user interaction
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied, or null
     */
    public fun mountEnclosingVolume(
        flags: MountMountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_mount_enclosing_volume(
        gioFilePointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes a mount operation started by g_file_mount_enclosing_volume().
     *
     * @param result a #GAsyncResult
     * @return true if successful. If an error has occurred,
     *   this function will return false and set @error
     *   appropriately if present.
     */
    public fun mountEnclosingVolumeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_mount_enclosing_volume_finish(
            gioFilePointer.reinterpret(),
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
     * Mounts a file of type G_FILE_TYPE_MOUNTABLE.
     * Using @mount_operation, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation,
     *   or null to avoid user interaction
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun mountMountable(
        flags: MountMountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_mount_mountable(
        gioFilePointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes a mount operation. See g_file_mount_mountable() for details.
     *
     * Finish an asynchronous mount operation that was started
     * with g_file_mount_mountable().
     *
     * @param result a #GAsyncResult
     * @return a #GFile or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun mountMountableFinish(result: AsyncResult): Result<File> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_mount_mountable_finish(
            gioFilePointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            File.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Tries to move the file or directory @source to the location specified
     * by @destination. If native move operations are supported then this is
     * used, otherwise a copy + delete fallback is used. The native
     * implementation may support moving directories (for instance on moves
     * inside the same filesystem), but the fallback code does not.
     *
     * If the flag %G_FILE_COPY_OVERWRITE is specified an already
     * existing @destination file is overwritten.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * If @progress_callback is not null, then the operation can be monitored
     * by setting this to a #GFileProgressCallback function.
     * @progress_callback_data will be passed to this function. It is
     * guaranteed that this callback will be called after all data has been
     * transferred with the total number of bytes copied during the operation.
     *
     * If the @source file does not exist, then the %G_IO_ERROR_NOT_FOUND
     * error is returned, independent on the status of the @destination.
     *
     * If %G_FILE_COPY_OVERWRITE is not specified and the target exists,
     * then the error %G_IO_ERROR_EXISTS is returned.
     *
     * If trying to overwrite a file over a directory, the %G_IO_ERROR_IS_DIRECTORY
     * error is returned. If trying to overwrite a directory with a directory the
     * %G_IO_ERROR_WOULD_MERGE error is returned.
     *
     * If the source is a directory and the target does not exist, or
     * %G_FILE_COPY_OVERWRITE is specified and the target is a file, then
     * the %G_IO_ERROR_WOULD_RECURSE error may be returned (if the native
     * move operation isn't available).
     *
     * @param destination #GFile pointing to the destination location
     * @param flags set of #GFileCopyFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param progressCallback #GFileProgressCallback
     *   function for updates
     * @return true on successful move, false otherwise.
     */
    public fun move(
        destination: File,
        flags: FileCopyFlags,
        cancellable: Cancellable? = null,
        progressCallback: FileProgressCallback,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_move(
            gioFilePointer.reinterpret(),
            destination.gioFilePointer,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            FileProgressCallbackFunc.reinterpret(),
            StableRef.create(progressCallback).asCPointer(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Finishes an asynchronous file movement, started with
     * g_file_move_async().
     *
     * @param result a #GAsyncResult
     * @return true on successful file move, false otherwise.
     * @since 2.72
     */
    @GioVersion2_72
    public fun moveFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_move_finish(
            gioFilePointer.reinterpret(),
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
     * Opens an existing file for reading and writing. The result is
     * a #GFileIOStream that can be used to read and write the contents
     * of the file.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * be returned. If the file is a directory, the %G_IO_ERROR_IS_DIRECTORY
     * error will be returned. Other errors are possible too, and depend on
     * what kind of filesystem the file is on. Note that in many non-local
     * file cases read and write streams are not supported, so make sure you
     * really need to do read and write streaming, rather than just opening
     * for reading or writing.
     *
     * @param cancellable a #GCancellable
     * @return #GFileIOStream or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public fun openReadwrite(cancellable: Cancellable? = null): Result<FileIOStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_open_readwrite(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileIOStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously opens @file for reading and writing.
     *
     * For more details, see g_file_open_readwrite() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_open_readwrite_finish() to get
     * the result of the operation.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    @GioVersion2_22
    public fun openReadwriteAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_open_readwrite_async(
        gioFilePointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file read operation started with
     * g_file_open_readwrite_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileIOStream or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public fun openReadwriteFinish(res: AsyncResult): Result<FileIOStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_open_readwrite_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileIOStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Exactly like g_file_get_path(), but caches the result via
     * g_object_set_qdata_full().  This is useful for example in C
     * applications which mix `g_file_*` APIs with native ones.  It
     * also avoids an extra duplicated string when possible, so will be
     * generally more efficient.
     *
     * This call does no blocking I/O.
     *
     * @return string containing the #GFile's path,
     *   or null if no such path exists. The returned string is owned by @file.
     * @since 2.56
     */
    @GioVersion2_56
    public fun peekPath(): String? = g_file_peek_path(gioFilePointer.reinterpret())?.toKString()

    /**
     * Polls a file of type %G_FILE_TYPE_MOUNTABLE.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     *
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied, or null
     * @since 2.22
     */
    @GioVersion2_22
    public fun pollMountable(cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        g_file_poll_mountable(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a poll operation. See g_file_poll_mountable() for details.
     *
     * Finish an asynchronous poll operation that was polled
     * with g_file_poll_mountable().
     *
     * @param result a #GAsyncResult
     * @return true if the operation finished successfully. false
     * otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun pollMountableFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_poll_mountable_finish(
            gioFilePointer.reinterpret(),
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
     * Returns the #GAppInfo that is registered as the default
     * application to handle the file specified by @file.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object, null to ignore
     * @return a #GAppInfo if the handle was found,
     *   null if there were errors.
     *   When you are done with it, release it with g_object_unref()
     */
    public fun queryDefaultHandler(cancellable: Cancellable? = null): Result<AppInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_default_handler(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            AppInfo.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Async version of g_file_query_default_handler().
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is done
     * @since 2.60
     */
    @GioVersion2_60
    public fun queryDefaultHandlerAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_query_default_handler_async(
        gioFilePointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes a g_file_query_default_handler_async() operation.
     *
     * @param result a #GAsyncResult
     * @return a #GAppInfo if the handle was found,
     *   null if there were errors.
     *   When you are done with it, release it with g_object_unref()
     * @since 2.60
     */
    @GioVersion2_60
    public fun queryDefaultHandlerFinish(result: AsyncResult): Result<AppInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_default_handler_finish(
            gioFilePointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            AppInfo.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Utility function to check if a particular file exists. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     *
     * Note that in many cases it is [racy to first check for file existence](https://en.wikipedia.org/wiki/Time_of_check_to_time_of_use)
     * and then execute something based on the outcome of that, because the
     * file might have been created or removed in between the operations. The
     * general approach to handling that is to not check, but just do the
     * operation and handle the errors as they come.
     *
     * As an example of race-free checking, take the case of reading a file,
     * and if it doesn't exist, creating it. There are two racy versions: read
     * it, and on error create it; and: check if it exists, if not create it.
     * These can both result in two processes creating the file (with perhaps
     * a partially written file as the result). The correct approach is to
     * always try to create the file with g_file_create() which will either
     * atomically create the file or fail with a %G_IO_ERROR_EXISTS error.
     *
     * However, in many cases an existence check is useful in a user interface,
     * for instance to make a menu item sensitive/insensitive, so that you don't
     * have to fool users that something is possible and then just show an error
     * dialog. If you do this, you should make sure to also handle the errors
     * that can happen due to races when you execute the operation.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the file exists (and can be detected without error),
     *   false otherwise (or if cancelled).
     */
    public fun queryExists(cancellable: Cancellable? = null): Boolean =
        g_file_query_exists(gioFilePointer.reinterpret(), cancellable?.gioCancellablePointer?.reinterpret()).asBoolean()

    /**
     * Utility function to inspect the #GFileType of a file. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     *
     * The primary use case of this method is to check if a file is
     * a regular file, directory, or symlink.
     *
     * @param flags a set of #GFileQueryInfoFlags passed to g_file_query_info()
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return The #GFileType of the file and %G_FILE_TYPE_UNKNOWN
     *   if the file does not exist
     * @since 2.18
     */
    @GioVersion2_18
    public fun queryFileType(flags: FileQueryInfoFlags, cancellable: Cancellable? = null): FileType =
        g_file_query_file_type(
            gioFilePointer.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret()
        ).run {
            FileType.fromNativeValue(this)
        }

    /**
     * Similar to g_file_query_info(), but obtains information
     * about the filesystem the @file is on, rather than the file itself.
     * For instance the amount of space available and the type of
     * the filesystem.
     *
     * The @attributes value is a string that specifies the attributes
     * that should be gathered. It is not an error if it's not possible
     * to read a particular requested attribute from a file - it just
     * won't be set. @attributes should be a comma-separated list of
     * attributes or attribute wildcards. The wildcard "*" means all
     * attributes, and a wildcard like "filesystem::*" means all attributes
     * in the filesystem namespace. The standard namespace for filesystem
     * attributes is "filesystem". Common attributes of interest are
     * %G_FILE_ATTRIBUTE_FILESYSTEM_SIZE (the total size of the filesystem
     * in bytes), %G_FILE_ATTRIBUTE_FILESYSTEM_FREE (number of bytes available),
     * and %G_FILE_ATTRIBUTE_FILESYSTEM_TYPE (type of the filesystem).
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will
     * be returned. Other errors are possible too, and depend on what
     * kind of filesystem the file is on.
     *
     * @param attributes an attribute query string
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileInfo or null if there was an error.
     *   Free the returned object with g_object_unref().
     */
    public fun queryFilesystemInfo(attributes: String, cancellable: Cancellable? = null): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_filesystem_info(
            gioFilePointer.reinterpret(),
            attributes,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileInfo(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously gets the requested information about the filesystem
     * that the specified @file is on. The result is a #GFileInfo object
     * that contains key-value attributes (such as type or size for the
     * file).
     *
     * For more details, see g_file_query_filesystem_info() which is the
     * synchronous version of this call.
     *
     * When the operation is finished, @callback will be called. You can
     * then call g_file_query_info_finish() to get the result of the
     * operation.
     *
     * @param attributes an attribute query string
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun queryFilesystemInfoAsync(
        attributes: String,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_query_filesystem_info_async(
        gioFilePointer.reinterpret(),
        attributes,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous filesystem info query.
     * See g_file_query_filesystem_info_async().
     *
     * @param res a #GAsyncResult
     * @return #GFileInfo for given @file
     *   or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun queryFilesystemInfoFinish(res: AsyncResult): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_filesystem_info_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileInfo(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Gets the requested information about specified @file.
     * The result is a #GFileInfo object that contains key-value
     * attributes (such as the type or size of the file).
     *
     * The @attributes value is a string that specifies the file
     * attributes that should be gathered. It is not an error if
     * it's not possible to read a particular requested attribute
     * from a file - it just won't be set. @attributes should be a
     * comma-separated list of attributes or attribute wildcards.
     * The wildcard "*" means all attributes, and a wildcard like
     * "standard::*" means all attributes in the standard namespace.
     * An example attribute query be "standard::*,owner::user".
     * The standard attributes are available as defines, like
     * %G_FILE_ATTRIBUTE_STANDARD_NAME.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * For symlinks, normally the information about the target of the
     * symlink is returned, rather than information about the symlink
     * itself. However if you pass %G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS
     * in @flags the information about the symlink itself will be returned.
     * Also, for symlinks that point to non-existing files the information
     * about the symlink itself will be returned.
     *
     * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
     * returned. Other errors are possible too, and depend on what kind of
     * filesystem the file is on.
     *
     * @param attributes an attribute query string
     * @param flags a set of #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileInfo for the given @file, or null
     *   on error. Free the returned object with g_object_unref().
     */
    public fun queryInfo(
        attributes: String,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_info(
            gioFilePointer.reinterpret(),
            attributes,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileInfo(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously gets the requested information about specified @file.
     * The result is a #GFileInfo object that contains key-value attributes
     * (such as type or size for the file).
     *
     * For more details, see g_file_query_info() which is the synchronous
     * version of this call.
     *
     * When the operation is finished, @callback will be called. You can
     * then call g_file_query_info_finish() to get the result of the operation.
     *
     * @param attributes an attribute query string
     * @param flags a set of #GFileQueryInfoFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun queryInfoAsync(
        attributes: String,
        flags: FileQueryInfoFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_query_info_async(
        gioFilePointer.reinterpret(),
        attributes,
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file info query.
     * See g_file_query_info_async().
     *
     * @param res a #GAsyncResult
     * @return #GFileInfo for given @file
     *   or null on error. Free the returned object with
     *   g_object_unref().
     */
    public fun queryInfoFinish(res: AsyncResult): Result<FileInfo> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_info_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileInfo(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Obtain the list of settable attributes for the file.
     *
     * Returns the type and full attribute name of all the attributes
     * that can be set on this file. This doesn't mean setting it will
     * always succeed though, you might get an access failure, or some
     * specific file may not support a specific attribute.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileAttributeInfoList describing the settable attributes.
     *   When you are done with it, release it with
     *   g_file_attribute_info_list_unref()
     */
    public fun querySettableAttributes(cancellable: Cancellable? = null): Result<FileAttributeInfoList> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_settable_attributes(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileAttributeInfoList(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Obtain the list of attribute namespaces where new attributes
     * can be created by a user. An example of this is extended
     * attributes (in the "xattr" namespace).
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileAttributeInfoList describing the writable namespaces.
     *   When you are done with it, release it with
     *   g_file_attribute_info_list_unref()
     */
    public fun queryWritableNamespaces(cancellable: Cancellable? = null): Result<FileAttributeInfoList> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_query_writable_namespaces(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileAttributeInfoList(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Opens a file for reading. The result is a #GFileInputStream that
     * can be used to read the contents of the file.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * If the file does not exist, the %G_IO_ERROR_NOT_FOUND error will be
     * returned. If the file is a directory, the %G_IO_ERROR_IS_DIRECTORY
     * error will be returned. Other errors are possible too, and depend
     * on what kind of filesystem the file is on.
     *
     * @param cancellable a #GCancellable
     * @return #GFileInputStream or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun read(cancellable: Cancellable? = null): Result<FileInputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_read(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileInputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously opens @file for reading.
     *
     * For more details, see g_file_read() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_read_finish() to get the result
     * of the operation.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun readAsync(ioPriority: gint, cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        g_file_read_async(
            gioFilePointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an asynchronous file read operation started with
     * g_file_read_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileInputStream or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun readFinish(res: AsyncResult): Result<FileInputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_read_finish(gioFilePointer.reinterpret(), res.gioAsyncResultPointer, gError.ptr)?.run {
            FileInputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Returns an output stream for overwriting the file, possibly
     * creating a backup copy of the file first. If the file doesn't exist,
     * it will be created.
     *
     * This will try to replace the file in the safest way possible so
     * that any errors during the writing will not affect an already
     * existing copy of the file. For instance, for local files it
     * may write to a temporary file and then atomically rename over
     * the destination when the stream is closed.
     *
     * By default files created are generally readable by everyone,
     * but if you pass %G_FILE_CREATE_PRIVATE in @flags the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     *
     * If @cancellable is not null, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error %G_IO_ERROR_CANCELLED will be
     * returned.
     *
     * If you pass in a non-null @etag value and @file already exists, then
     * this value is compared to the current entity tag of the file, and if
     * they differ an %G_IO_ERROR_WRONG_ETAG error is returned. This
     * generally means that the file has been changed since you last read
     * it. You can get the new etag from g_file_output_stream_get_etag()
     * after you've finished writing and closed the #GFileOutputStream. When
     * you load a new file you can use g_file_input_stream_query_info() to
     * get the etag of the file.
     *
     * If @make_backup is true, this function will attempt to make a
     * backup of the current file before overwriting it. If this fails
     * a %G_IO_ERROR_CANT_CREATE_BACKUP error will be returned. If you
     * want to replace anyway, try again with @make_backup set to false.
     *
     * If the file is a directory the %G_IO_ERROR_IS_DIRECTORY error will
     * be returned, and if the file is some other form of non-regular file
     * then a %G_IO_ERROR_NOT_REGULAR_FILE error will be returned. Some
     * file systems don't allow all file names, and may return an
     * %G_IO_ERROR_INVALID_FILENAME error, and if the name is to long
     * %G_IO_ERROR_FILENAME_TOO_LONG will be returned. Other errors are
     * possible too, and depend on what kind of filesystem the file is on.
     *
     * @param etag an optional [entity tag](#entity-tags)
     *   for the current #GFile, or #NULL to ignore
     * @param makeBackup true if a backup should be created
     * @param flags a set of #GFileCreateFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileOutputStream or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun replace(
        etag: String? = null,
        makeBackup: Boolean,
        flags: FileCreateFlags,
        cancellable: Cancellable? = null,
    ): Result<FileOutputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_replace(
            gioFilePointer.reinterpret(),
            etag,
            makeBackup.asGBoolean(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileOutputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously overwrites the file, replacing the contents,
     * possibly creating a backup copy of the file first.
     *
     * For more details, see g_file_replace() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_replace_finish() to get the result
     * of the operation.
     *
     * @param etag an [entity tag](#entity-tags) for the current #GFile,
     *   or null to ignore
     * @param makeBackup true if a backup should be created
     * @param flags a set of #GFileCreateFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun replaceAsync(
        etag: String? = null,
        makeBackup: Boolean,
        flags: FileCreateFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_replace_async(
        gioFilePointer.reinterpret(),
        etag,
        makeBackup.asGBoolean(),
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Same as g_file_replace_contents_async() but takes a #GBytes input instead.
     * This function will keep a ref on @contents until the operation is done.
     * Unlike g_file_replace_contents_async() this allows forgetting about the
     * content without waiting for the callback.
     *
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_replace_contents_finish().
     *
     * @param contents a #GBytes
     * @param etag a new [entity tag](#entity-tags) for the @file, or null
     * @param makeBackup true if a backup should be created
     * @param flags a set of #GFileCreateFlags
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.40
     */
    @GioVersion2_40
    public fun replaceContentsBytesAsync(
        contents: Bytes,
        etag: String? = null,
        makeBackup: Boolean,
        flags: FileCreateFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_replace_contents_bytes_async(
        gioFilePointer.reinterpret(),
        contents.glibBytesPointer.reinterpret(),
        etag,
        makeBackup.asGBoolean(),
        flags.mask,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileOutputStream, or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun replaceFinish(res: AsyncResult): Result<FileOutputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_replace_finish(gioFilePointer.reinterpret(), res.gioAsyncResultPointer, gError.ptr)?.run {
            FileOutputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Returns an output stream for overwriting the file in readwrite mode,
     * possibly creating a backup copy of the file first. If the file doesn't
     * exist, it will be created.
     *
     * For details about the behaviour, see g_file_replace() which does the
     * same thing but returns an output stream only.
     *
     * Note that in many non-local file cases read and write streams are not
     * supported, so make sure you really need to do read and write streaming,
     * rather than just opening for reading or writing.
     *
     * @param etag an optional [entity tag](#entity-tags)
     *   for the current #GFile, or #NULL to ignore
     * @param makeBackup true if a backup should be created
     * @param flags a set of #GFileCreateFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFileIOStream or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public fun replaceReadwrite(
        etag: String? = null,
        makeBackup: Boolean,
        flags: FileCreateFlags,
        cancellable: Cancellable? = null,
    ): Result<FileIOStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_replace_readwrite(
            gioFilePointer.reinterpret(),
            etag,
            makeBackup.asGBoolean(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            FileIOStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously overwrites the file in read-write mode,
     * replacing the contents, possibly creating a backup copy
     * of the file first.
     *
     * For more details, see g_file_replace_readwrite() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_replace_readwrite_finish() to get
     * the result of the operation.
     *
     * @param etag an [entity tag](#entity-tags) for the current #GFile,
     *   or null to ignore
     * @param makeBackup true if a backup should be created
     * @param flags a set of #GFileCreateFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    @GioVersion2_22
    public fun replaceReadwriteAsync(
        etag: String? = null,
        makeBackup: Boolean,
        flags: FileCreateFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_replace_readwrite_async(
        gioFilePointer.reinterpret(),
        etag,
        makeBackup.asGBoolean(),
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_readwrite_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFileIOStream, or null on error.
     *   Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public fun replaceReadwriteFinish(res: AsyncResult): Result<FileIOStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_replace_readwrite_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            FileIOStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Resolves a relative path for @file to an absolute path.
     *
     * This call does no blocking I/O.
     *
     * If the @relative_path is an absolute path name, the resolution
     * is done absolutely (without taking @file path as base).
     *
     * @param relativePath a given relative path string
     * @return a #GFile for the resolved path.
     */
    public fun resolveRelativePath(relativePath: String): File =
        g_file_resolve_relative_path(gioFilePointer.reinterpret(), relativePath)!!.run {
            File.wrap(reinterpret())
        }

    /**
     * Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING to @value.
     * If @attribute is of a different type, this operation will fail,
     * returning false.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's new value
     * @param flags a #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the @attribute was successfully set to @value
     *   in the @file, false otherwise.
     */
    public fun setAttributeByteString(
        attribute: String,
        `value`: String,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attribute_byte_string(
            gioFilePointer.reinterpret(),
            attribute,
            `value`,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_INT32 to @value.
     * If @attribute is of a different type, this operation will fail.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param attribute a string containing the attribute's name
     * @param value a #gint32 containing the attribute's new value
     * @param flags a #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the @attribute was successfully set to @value
     *   in the @file, false otherwise.
     */
    public fun setAttributeInt32(
        attribute: String,
        `value`: gint,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attribute_int32(
            gioFilePointer.reinterpret(),
            attribute,
            `value`,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_INT64 to @value.
     * If @attribute is of a different type, this operation will fail.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param attribute a string containing the attribute's name
     * @param value a #guint64 containing the attribute's new value
     * @param flags a #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the @attribute was successfully set, false otherwise.
     */
    public fun setAttributeInt64(
        attribute: String,
        `value`: gint64,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attribute_int64(
            gioFilePointer.reinterpret(),
            attribute,
            `value`,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_STRING to @value.
     * If @attribute is of a different type, this operation will fail.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's value
     * @param flags #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the @attribute was successfully set, false otherwise.
     */
    public fun setAttributeString(
        attribute: String,
        `value`: String,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attribute_string(
            gioFilePointer.reinterpret(),
            attribute,
            `value`,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT32 to @value.
     * If @attribute is of a different type, this operation will fail.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param attribute a string containing the attribute's name
     * @param value a #guint32 containing the attribute's new value
     * @param flags a #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the @attribute was successfully set to @value
     *   in the @file, false otherwise.
     */
    public fun setAttributeUint32(
        attribute: String,
        `value`: guint,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attribute_uint32(
            gioFilePointer.reinterpret(),
            attribute,
            `value`,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets @attribute of type %G_FILE_ATTRIBUTE_TYPE_UINT64 to @value.
     * If @attribute is of a different type, this operation will fail.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param attribute a string containing the attribute's name
     * @param value a #guint64 containing the attribute's new value
     * @param flags a #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true if the @attribute was successfully set to @value
     *   in the @file, false otherwise.
     */
    public fun setAttributeUint64(
        attribute: String,
        `value`: guint64,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attribute_uint64(
            gioFilePointer.reinterpret(),
            attribute,
            `value`,
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously sets the attributes of @file with @info.
     *
     * For more details, see g_file_set_attributes_from_info(),
     * which is the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_set_attributes_finish() to get
     * the result of the operation.
     *
     * @param info a #GFileInfo
     * @param flags a #GFileQueryInfoFlags
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun setAttributesAsync(
        info: FileInfo,
        flags: FileQueryInfoFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_set_attributes_async(
        gioFilePointer.reinterpret(),
        info.gioFileInfoPointer.reinterpret(),
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Tries to set all attributes in the #GFileInfo on the target
     * values, not stopping on the first error.
     *
     * If there is any error during this operation then @error will
     * be set to the first error. Error on particular fields are flagged
     * by setting the "status" field in the attribute value to
     * %G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING, which means you can
     * also detect further errors.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param info a #GFileInfo
     * @param flags #GFileQueryInfoFlags
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return false if there was any error, true otherwise.
     */
    public fun setAttributesFromInfo(
        info: FileInfo,
        flags: FileQueryInfoFlags,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_attributes_from_info(
            gioFilePointer.reinterpret(),
            info.gioFileInfoPointer.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Renames @file to the specified display name.
     *
     * The display name is converted from UTF-8 to the correct encoding
     * for the target filesystem if possible and the @file is renamed to this.
     *
     * If you want to implement a rename operation in the user interface the
     * edit name (%G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME) should be used as the
     * initial value in the rename widget, and then the result after editing
     * should be passed to g_file_set_display_name().
     *
     * On success the resulting converted filename is returned.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param displayName a string
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return a #GFile specifying what @file was renamed to,
     *   or null if there was an error.
     *   Free the returned object with g_object_unref().
     */
    public fun setDisplayName(displayName: String, cancellable: Cancellable? = null): Result<File> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_display_name(
            gioFilePointer.reinterpret(),
            displayName,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            File.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronously sets the display name for a given #GFile.
     *
     * For more details, see g_file_set_display_name() which is
     * the synchronous version of this call.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_set_display_name_finish() to get
     * the result of the operation.
     *
     * @param displayName a string
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun setDisplayNameAsync(
        displayName: String,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_set_display_name_async(
        gioFilePointer.reinterpret(),
        displayName,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes setting a display name started with
     * g_file_set_display_name_async().
     *
     * @param res a #GAsyncResult
     * @return a #GFile or null on error.
     *   Free the returned object with g_object_unref().
     */
    public fun setDisplayNameFinish(res: AsyncResult): Result<File> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_set_display_name_finish(
            gioFilePointer.reinterpret(),
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            File.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Starts a file of type %G_FILE_TYPE_MOUNTABLE.
     * Using @start_operation, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     *
     * @param flags flags affecting the operation
     * @param startOperation a #GMountOperation, or null to avoid user interaction
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied, or null
     * @since 2.22
     */
    @GioVersion2_22
    public fun startMountable(
        flags: DriveStartFlags,
        startOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_start_mountable(
        gioFilePointer.reinterpret(),
        flags.mask,
        startOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes a start operation. See g_file_start_mountable() for details.
     *
     * Finish an asynchronous start operation that was started
     * with g_file_start_mountable().
     *
     * @param result a #GAsyncResult
     * @return true if the operation finished successfully. false
     * otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun startMountableFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_start_mountable_finish(
            gioFilePointer.reinterpret(),
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
     * Stops a file of type %G_FILE_TYPE_MOUNTABLE.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_stop_mountable_finish() to get
     * the result of the operation.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation,
     *   or null to avoid user interaction.
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied, or null
     * @since 2.22
     */
    @GioVersion2_22
    public fun stopMountable(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_stop_mountable(
        gioFilePointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes a stop operation, see g_file_stop_mountable() for details.
     *
     * Finish an asynchronous stop operation that was started
     * with g_file_stop_mountable().
     *
     * @param result a #GAsyncResult
     * @return true if the operation finished successfully.
     *   false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun stopMountableFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_stop_mountable_finish(
            gioFilePointer.reinterpret(),
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
     * Checks if @file supports
     * [thread-default contexts][g-main-context-push-thread-default-context].
     * If this returns false, you cannot perform asynchronous operations on
     * @file in a thread that has a thread-default context.
     *
     * @return Whether or not @file supports thread-default contexts.
     * @since 2.22
     */
    @GioVersion2_22
    public fun supportsThreadContexts(): Boolean =
        g_file_supports_thread_contexts(gioFilePointer.reinterpret()).asBoolean()

    /**
     * Sends @file to the "Trashcan", if possible. This is similar to
     * deleting it, but the user can recover it before emptying the trashcan.
     * Not all file systems support trashing, so this call can return the
     * %G_IO_ERROR_NOT_SUPPORTED error. Since GLib 2.66, the `x-gvfs-notrash` unix
     * mount option can be used to disable g_file_trash() support for certain
     * mounts, the %G_IO_ERROR_NOT_SUPPORTED error will be returned in that case.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @return true on successful trash, false otherwise.
     */
    public fun trash(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_trash(
            gioFilePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously sends @file to the Trash location, if possible.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied
     * @since 2.38
     */
    @GioVersion2_38
    public fun trashAsync(ioPriority: gint, cancellable: Cancellable? = null, callback: AsyncReadyCallback): Unit =
        g_file_trash_async(
            gioFilePointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an asynchronous file trashing operation, started with
     * g_file_trash_async().
     *
     * @param result a #GAsyncResult
     * @return true on successful trash, false otherwise.
     * @since 2.38
     */
    @GioVersion2_38
    public fun trashFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_trash_finish(
            gioFilePointer.reinterpret(),
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
     * Unmounts a file of type G_FILE_TYPE_MOUNTABLE.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_unmount_mountable_finish() to get
     * the result of the operation.
     *
     * @param flags flags affecting the operation
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     */
    public fun unmountMountable(
        flags: MountUnmountFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_unmount_mountable(
        gioFilePointer.reinterpret(),
        flags.mask,
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an unmount operation, see g_file_unmount_mountable() for details.
     *
     * Finish an asynchronous unmount operation that was started
     * with g_file_unmount_mountable().
     *
     * @param result a #GAsyncResult
     * @return true if the operation finished successfully.
     *   false otherwise.
     */
    public fun unmountMountableFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_unmount_mountable_finish(
            gioFilePointer.reinterpret(),
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
     * Unmounts a file of type %G_FILE_TYPE_MOUNTABLE.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_file_unmount_mountable_finish() to get
     * the result of the operation.
     *
     * @param flags flags affecting the operation
     * @param mountOperation a #GMountOperation,
     *   or null to avoid user interaction
     * @param cancellable optional #GCancellable object,
     *   null to ignore
     * @param callback a #GAsyncReadyCallback
     *   to call when the request is satisfied
     * @since 2.22
     */
    @GioVersion2_22
    public fun unmountMountableWithOperation(
        flags: MountUnmountFlags,
        mountOperation: MountOperation? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit = g_file_unmount_mountable_with_operation(
        gioFilePointer.reinterpret(),
        flags.mask,
        mountOperation?.gioMountOperationPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret(),
        AsyncReadyCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer()
    )

    /**
     * Finishes an unmount operation,
     * see g_file_unmount_mountable_with_operation() for details.
     *
     * Finish an asynchronous unmount operation that was started
     * with g_file_unmount_mountable_with_operation().
     *
     * @param result a #GAsyncResult
     * @return true if the operation finished successfully.
     *   false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public fun unmountMountableWithOperationFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_unmount_mountable_with_operation_finish(
            gioFilePointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    private data class Wrapper(private val pointer: CPointer<GFile>) : File {
        override val gioFilePointer: CPointer<GFile> = pointer
    }

    public companion object : TypeCompanion<File> {
        override val type: GeneratedInterfaceKGType<File> =
            GeneratedInterfaceKGType(g_file_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GFile>): File = Wrapper(pointer)

        /**
         * Constructs a #GFile from a vector of elements using the correct
         * separator for filenames.
         *
         * Using this function is equivalent to calling g_build_filenamev(),
         * followed by g_file_new_for_path() on the result.
         *
         * @param args null-terminated
         *   array of strings containing the path elements.
         * @return a new #GFile
         * @since 2.78
         */
        @GioVersion2_78
        public fun newBuildFilenamev(args: List<String>): File = memScoped {
            return g_file_new_build_filenamev(args.toCStringList(this))!!.run {
                File.wrap(reinterpret())
            }
        }

        /**
         * Creates a #GFile with the given argument from the command line.
         * The value of @arg can be either a URI, an absolute path or a
         * relative path resolved relative to the current working directory.
         * This operation never fails, but the returned object might not
         * support any I/O operation if @arg points to a malformed path.
         *
         * Note that on Windows, this function expects its argument to be in
         * UTF-8 -- not the system code page.  This means that you
         * should not use this function with string from argv as it is passed
         * to main().  g_win32_get_command_line() will return a UTF-8 version of
         * the commandline.  #GApplication also uses UTF-8 but
         * g_application_command_line_create_file_for_arg() may be more useful
         * for you there.  It is also always possible to use this function with
         * #GOptionContext arguments of type %G_OPTION_ARG_FILENAME.
         *
         * @param arg a command line string
         * @return a new #GFile.
         *   Free the returned object with g_object_unref().
         */
        public fun newForCommandlineArg(arg: String): File = g_file_new_for_commandline_arg(arg)!!.run {
            File.wrap(reinterpret())
        }

        /**
         * Creates a #GFile with the given argument from the command line.
         *
         * This function is similar to g_file_new_for_commandline_arg() except
         * that it allows for passing the current working directory as an
         * argument instead of using the current working directory of the
         * process.
         *
         * This is useful if the commandline argument was given in a context
         * other than the invocation of the current process.
         *
         * See also g_application_command_line_create_file_for_arg().
         *
         * @param arg a command line string
         * @param cwd the current working directory of the commandline
         * @return a new #GFile
         * @since 2.36
         */
        @GioVersion2_36
        public fun newForCommandlineArgAndCwd(arg: String, cwd: String): File =
            g_file_new_for_commandline_arg_and_cwd(arg, cwd)!!.run {
                File.wrap(reinterpret())
            }

        /**
         * Constructs a #GFile for a given path. This operation never
         * fails, but the returned object might not support any I/O
         * operation if @path is malformed.
         *
         * @param path a string containing a relative or absolute path.
         *   The string must be encoded in the glib filename encoding.
         * @return a new #GFile for the given @path.
         *   Free the returned object with g_object_unref().
         */
        public fun newForPath(path: String): File = g_file_new_for_path(path)!!.run {
            File.wrap(reinterpret())
        }

        /**
         * Constructs a #GFile for a given URI. This operation never
         * fails, but the returned object might not support any I/O
         * operation if @uri is malformed or if the uri type is
         * not supported.
         *
         * @param uri a UTF-8 string containing a URI
         * @return a new #GFile for the given @uri.
         *   Free the returned object with g_object_unref().
         */
        public fun newForUri(uri: String): File = g_file_new_for_uri(uri)!!.run {
            File.wrap(reinterpret())
        }

        /**
         * Asynchronously opens a file in the preferred directory for temporary files
         *  (as returned by g_get_tmp_dir()) as g_file_new_tmp().
         *
         * @tmpl should be a string in the GLib file name encoding
         * containing a sequence of six 'X' characters, and containing no
         * directory components. If it is null, a default template is used.
         *
         * @param tmpl Template for the file
         *   name, as in g_file_open_tmp(), or null for a default template
         * @param ioPriority the [I/O priority][io-priority] of the request
         * @param cancellable optional #GCancellable object, null to ignore
         * @param callback a #GAsyncReadyCallback to call when the request is done
         * @since 2.74
         */
        @GioVersion2_74
        public fun newTmpAsync(
            tmpl: String? = null,
            ioPriority: gint,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback,
        ): Unit = g_file_new_tmp_async(
            tmpl,
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

        /**
         * Asynchronously creates a directory in the preferred directory for
         * temporary files (as returned by g_get_tmp_dir()) as g_dir_make_tmp().
         *
         * @tmpl should be a string in the GLib file name encoding
         * containing a sequence of six 'X' characters, and containing no
         * directory components. If it is null, a default template is used.
         *
         * @param tmpl Template for the file
         *   name, as in g_dir_make_tmp(), or null for a default template
         * @param ioPriority the [I/O priority][io-priority] of the request
         * @param cancellable optional #GCancellable object, null to ignore
         * @param callback a #GAsyncReadyCallback to call when the request is done
         * @since 2.74
         */
        @GioVersion2_74
        public fun newTmpDirAsync(
            tmpl: String? = null,
            ioPriority: gint,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback,
        ): Unit = g_file_new_tmp_dir_async(
            tmpl,
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

        /**
         * Finishes a temporary directory creation started by
         * g_file_new_tmp_dir_async().
         *
         * @param result a #GAsyncResult
         * @return a new #GFile.
         *   Free the returned object with g_object_unref().
         * @since 2.74
         */
        @GioVersion2_74
        public fun newTmpDirFinish(result: AsyncResult): Result<File> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_file_new_tmp_dir_finish(result.gioAsyncResultPointer, gError.ptr)?.run {
                File.wrap(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Constructs a #GFile with the given @parse_name (i.e. something
         * given by g_file_get_parse_name()). This operation never fails,
         * but the returned object might not support any I/O operation if
         * the @parse_name cannot be parsed.
         *
         * @param parseName a file name or path to be parsed
         * @return a new #GFile.
         */
        public fun parseName(parseName: String): File = g_file_parse_name(parseName)!!.run {
            File.wrap(reinterpret())
        }

        /**
         * Get the GType of File
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_get_type()
    }
}
