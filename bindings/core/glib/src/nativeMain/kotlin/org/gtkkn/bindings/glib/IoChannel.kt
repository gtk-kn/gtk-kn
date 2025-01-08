// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GIOChannel
import org.gtkkn.native.glib.g_io_channel_close
import org.gtkkn.native.glib.g_io_channel_error_from_errno
import org.gtkkn.native.glib.g_io_channel_error_quark
import org.gtkkn.native.glib.g_io_channel_flush
import org.gtkkn.native.glib.g_io_channel_get_buffer_condition
import org.gtkkn.native.glib.g_io_channel_get_buffer_size
import org.gtkkn.native.glib.g_io_channel_get_buffered
import org.gtkkn.native.glib.g_io_channel_get_close_on_unref
import org.gtkkn.native.glib.g_io_channel_get_encoding
import org.gtkkn.native.glib.g_io_channel_get_flags
import org.gtkkn.native.glib.g_io_channel_init
import org.gtkkn.native.glib.g_io_channel_new_file
import org.gtkkn.native.glib.g_io_channel_ref
import org.gtkkn.native.glib.g_io_channel_seek
import org.gtkkn.native.glib.g_io_channel_seek_position
import org.gtkkn.native.glib.g_io_channel_set_buffer_size
import org.gtkkn.native.glib.g_io_channel_set_buffered
import org.gtkkn.native.glib.g_io_channel_set_close_on_unref
import org.gtkkn.native.glib.g_io_channel_set_encoding
import org.gtkkn.native.glib.g_io_channel_set_flags
import org.gtkkn.native.glib.g_io_channel_set_line_term
import org.gtkkn.native.glib.g_io_channel_shutdown
import org.gtkkn.native.glib.g_io_channel_unix_get_fd
import org.gtkkn.native.glib.g_io_channel_unix_new
import org.gtkkn.native.glib.g_io_channel_unref
import org.gtkkn.native.glib.g_io_channel_write_unichar
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_io_channel_get_type
import kotlin.Boolean
import kotlin.Pair
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `GIOChannel` data type aims to provide a portable method for
 * using file descriptors, pipes, and sockets, and integrating them
 * into the main event loop (see [struct@GLib.MainContext]). Currently,
 * full support is available on UNIX platforms; support for Windows
 * is only partially complete.
 *
 * To create a new `GIOChannel` on UNIX systems use
 * [ctor@GLib.IOChannel.unix_new]. This works for plain file descriptors,
 * pipes and sockets. Alternatively, a channel can be created for a
 * file in a system independent manner using [ctor@GLib.IOChannel.new_file].
 *
 * Once a `GIOChannel` has been created, it can be used in a generic
 * manner with the functions [method@GLib.IOChannel.read_chars],
 * [method@GLib.IOChannel.write_chars], [method@GLib.IOChannel.seek_position],
 * and [method@GLib.IOChannel.shutdown].
 *
 * To add a `GIOChannel` to the main event loop, use [func@GLib.io_add_watch] or
 * [func@GLib.io_add_watch_full]. Here you specify which events you are
 * interested in on the `GIOChannel`, and provide a function to be called
 * whenever these events occur.
 *
 * `GIOChannel` instances are created with an initial reference count of 1.
 * [method@GLib.IOChannel.ref] and [method@GLib.IOChannel.unref] can be used to
 * increment or decrement the reference count respectively. When the
 * reference count falls to 0, the `GIOChannel` is freed. (Though it
 * isn’t closed automatically, unless it was created using
 * [ctor@GLib.IOChannel.new_file].) Using [func@GLib.io_add_watch] or
 * [func@GLib.io_add_watch_full] increments a channel’s reference count.
 *
 * The new functions [method@GLib.IOChannel.read_chars],
 * [method@GLib.IOChannel.read_line], [method@GLib.IOChannel.read_line_string],
 * [method@GLib.IOChannel.read_to_end], [method@GLib.IOChannel.write_chars],
 * [method@GLib.IOChannel.seek_position], and [method@GLib.IOChannel.flush]
 * should not be mixed with the deprecated functions
 * [method@GLib.IOChannel.read], [method@GLib.IOChannel.write], and
 * [method@GLib.IOChannel.seek] on the same channel.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `bytes_read`: Unsupported pointer to primitive type
 * - parameter `buf`: buf: Out parameter is not supported
 * - parameter `str_return`: str_return: Out parameter is not supported
 * - parameter `terminator_pos`: Unsupported pointer to primitive type
 * - parameter `str_return`: str_return: Out parameter is not supported
 * - parameter `thechar`: thechar: Out parameter is not supported
 * - parameter `bytes_written`: Unsupported pointer to primitive type
 * - parameter `buf`: Array parameter of type guint8 is not supported
 */
public class IoChannel(pointer: CPointer<GIOChannel>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GIOChannel> = pointer

    /**
     * Allocate a new IoChannel.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GIOChannel>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to IoChannel and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GIOChannel>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new IoChannel using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GIOChannel>().ptr)

    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed, ignoring errors. The channel will not be freed until the
     * last reference is dropped using g_io_channel_unref().
     */
    public fun close(): Unit = g_io_channel_close(gPointer)

    /**
     * Flushes the write buffer for the GIOChannel.
     *
     * @return the status of the operation: One of
     *   %G_IO_STATUS_NORMAL, %G_IO_STATUS_AGAIN, or
     *   %G_IO_STATUS_ERROR.
     */
    public fun flush(): Result<IoStatus> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_io_channel_flush(gPointer, gError.ptr).run {
            IoStatus.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function returns a #GIOCondition depending on whether there
     * is data to be read/space to write data in the internal buffers in
     * the #GIOChannel. Only the flags %G_IO_IN and %G_IO_OUT may be set.
     *
     * @return A #GIOCondition
     */
    public fun getBufferCondition(): IoCondition = g_io_channel_get_buffer_condition(gPointer).run {
        IoCondition(this)
    }

    /**
     * Gets the buffer size.
     *
     * @return the size of the buffer.
     */
    public fun getBufferSize(): gsize = g_io_channel_get_buffer_size(gPointer)

    /**
     * Returns whether @channel is buffered.
     *
     * @return true if the @channel is buffered.
     */
    public fun getBuffered(): Boolean = g_io_channel_get_buffered(gPointer).asBoolean()

    /**
     * Returns whether the file/socket/whatever associated with @channel
     * will be closed when @channel receives its final unref and is
     * destroyed. The default value of this is true for channels created
     * by g_io_channel_new_file (), and false for all other channels.
     *
     * @return true if the channel will be closed, false otherwise.
     */
    public fun getCloseOnUnref(): Boolean = g_io_channel_get_close_on_unref(gPointer).asBoolean()

    /**
     * Gets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The encoding null
     * makes the channel safe for binary data.
     *
     * @return A string containing the encoding, this string is
     *   owned by GLib and must not be freed.
     */
    public fun getEncoding(): String =
        g_io_channel_get_encoding(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the current flags for a #GIOChannel, including read-only
     * flags such as %G_IO_FLAG_IS_READABLE.
     *
     * The values of the flags %G_IO_FLAG_IS_READABLE and %G_IO_FLAG_IS_WRITABLE
     * are cached for internal use by the channel when it is created.
     * If they should change at some later point (e.g. partial shutdown
     * of a socket with the UNIX shutdown() function), the user
     * should immediately call g_io_channel_get_flags() to update
     * the internal values of these flags.
     *
     * @return the flags which are set on the channel
     */
    public fun getFlags(): IoFlags = g_io_channel_get_flags(gPointer).run {
        IoFlags(this)
    }

    /**
     * Initializes a #GIOChannel struct.
     *
     * This is called by each of the above functions when creating a
     * #GIOChannel, and so is not often needed by the application
     * programmer (unless you are creating a new type of #GIOChannel).
     */
    public fun `init`(): Unit = g_io_channel_init(gPointer)

    /**
     * Increments the reference count of a #GIOChannel.
     *
     * @return the @channel that was passed in (since 2.6)
     */
    public fun ref(): IoChannel = g_io_channel_ref(gPointer)!!.run {
        IoChannel(this)
    }

    /**
     * Sets the current position in the #GIOChannel, similar to the standard
     * library function fseek().
     *
     * @param offset an offset, in bytes, which is added to the position specified
     *          by @type
     * @param type the position in the file, which can be %G_SEEK_CUR (the current
     *        position), %G_SEEK_SET (the start of the file), or %G_SEEK_END
     *        (the end of the file)
     * @return %G_IO_ERROR_NONE if the operation was successful.
     */
    public fun seek(offset: gint64, type: SeekType): IoError =
        g_io_channel_seek(gPointer, offset, type.nativeValue).run {
            IoError.fromNativeValue(this)
        }

    /**
     * Replacement for g_io_channel_seek() with the new API.
     *
     * @param offset The offset in bytes from the position specified by @type
     * @param type a #GSeekType. The type %G_SEEK_CUR is only allowed in those
     *                      cases where a call to g_io_channel_set_encoding ()
     *                      is allowed. See the documentation for
     *                      g_io_channel_set_encoding () for details.
     * @return the status of the operation.
     */
    public fun seekPosition(offset: gint64, type: SeekType): Result<IoStatus> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_io_channel_seek_position(gPointer, offset, type.nativeValue, gError.ptr).run {
            IoStatus.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets the buffer size.
     *
     * @param size the size of the buffer, or 0 to let GLib pick a good size
     */
    public fun setBufferSize(size: gsize): Unit = g_io_channel_set_buffer_size(gPointer, size)

    /**
     * The buffering state can only be set if the channel's encoding
     * is null. For any other encoding, the channel must be buffered.
     *
     * A buffered channel can only be set unbuffered if the channel's
     * internal buffers have been flushed. Newly created channels or
     * channels which have returned %G_IO_STATUS_EOF
     * not require such a flush. For write-only channels, a call to
     * g_io_channel_flush () is sufficient. For all other channels,
     * the buffers may be flushed by a call to g_io_channel_seek_position ().
     * This includes the possibility of seeking with seek type %G_SEEK_CUR
     * and an offset of zero. Note that this means that socket-based
     * channels cannot be set unbuffered once they have had data
     * read from them.
     *
     * On unbuffered channels, it is safe to mix read and write
     * calls from the new and old APIs, if this is necessary for
     * maintaining old code.
     *
     * The default state of the channel is buffered.
     *
     * @param buffered whether to set the channel buffered or unbuffered
     */
    public fun setBuffered(buffered: Boolean): Unit = g_io_channel_set_buffered(gPointer, buffered.asGBoolean())

    /**
     * Whether to close the channel on the final unref of the #GIOChannel
     * data structure. The default value of this is true for channels
     * created by g_io_channel_new_file (), and false for all other channels.
     *
     * Setting this flag to true for a channel you have already closed
     * can cause problems when the final reference to the #GIOChannel is dropped.
     *
     * @param doClose Whether to close the channel on the final unref of
     *            the GIOChannel data structure.
     */
    public fun setCloseOnUnref(doClose: Boolean): Unit = g_io_channel_set_close_on_unref(gPointer, doClose.asGBoolean())

    /**
     * Sets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The default encoding
     * for the external file is UTF-8.
     *
     * The encoding null is safe to use with binary data.
     *
     * The encoding can only be set if one of the following conditions
     * is true:
     *
     * - The channel was just created, and has not been written to or read from yet.
     *
     * - The channel is write-only.
     *
     * - The channel is a file, and the file pointer was just repositioned
     *   by a call to g_io_channel_seek_position(). (This flushes all the
     *   internal buffers.)
     *
     * - The current encoding is null or UTF-8.
     *
     * - One of the (new API) read functions has just returned %G_IO_STATUS_EOF
     *   (or, in the case of g_io_channel_read_to_end(), %G_IO_STATUS_NORMAL).
     *
     * -  One of the functions g_io_channel_read_chars() or
     *    g_io_channel_read_unichar() has returned %G_IO_STATUS_AGAIN or
     *    %G_IO_STATUS_ERROR. This may be useful in the case of
     *    %G_CONVERT_ERROR_ILLEGAL_SEQUENCE.
     *    Returning one of these statuses from g_io_channel_read_line(),
     *    g_io_channel_read_line_string(), or g_io_channel_read_to_end()
     *    does not guarantee that the encoding can be changed.
     *
     * Channels which do not meet one of the above conditions cannot call
     * g_io_channel_seek_position() with an offset of %G_SEEK_CUR, and, if
     * they are "seekable", cannot call g_io_channel_write_chars() after
     * calling one of the API "read" functions.
     *
     * @param encoding the encoding type
     * @return %G_IO_STATUS_NORMAL if the encoding was successfully set
     */
    public fun setEncoding(encoding: String? = null): Result<IoStatus> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_io_channel_set_encoding(gPointer, encoding, gError.ptr).run {
            IoStatus.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets the (writeable) flags in @channel to (@flags & %G_IO_FLAG_SET_MASK).
     *
     * @param flags the flags to set on the IO channel
     * @return the status of the operation.
     */
    public fun setFlags(flags: IoFlags): Result<IoStatus> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_io_channel_set_flags(gPointer, flags.mask, gError.ptr).run {
            IoStatus.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This sets the string that #GIOChannel uses to determine
     * where in the file a line break occurs.
     *
     * @param lineTerm The line termination string. Use null for
     *             autodetect.  Autodetection breaks on "\n", "\r\n", "\r", "\0",
     *             and the Unicode paragraph separator. Autodetection should not be
     *             used for anything other than file-based channels.
     * @param length The length of the termination string. If -1 is passed, the
     *          string is assumed to be nul-terminated. This option allows
     *          termination strings with embedded nuls.
     */
    public fun setLineTerm(lineTerm: String? = null, length: gint): Unit =
        g_io_channel_set_line_term(gPointer, lineTerm, length)

    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed if @flush is true. The channel will not be freed until the
     * last reference is dropped using g_io_channel_unref().
     *
     * @param flush if true, flush pending
     * @return the status of the operation.
     */
    public fun shutdown(flush: Boolean): Result<IoStatus> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_io_channel_shutdown(gPointer, flush.asGBoolean(), gError.ptr).run {
            IoStatus.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Returns the file descriptor of the #GIOChannel.
     *
     * On Windows this function returns the file descriptor or socket of
     * the #GIOChannel.
     *
     * @return the file descriptor of the #GIOChannel.
     */
    public fun unixGetFd(): gint = g_io_channel_unix_get_fd(gPointer)

    /**
     * Decrements the reference count of a #GIOChannel.
     */
    public fun unref(): Unit = g_io_channel_unref(gPointer)

    /**
     * Writes a Unicode character to @channel.
     * This function cannot be called on a channel with null encoding.
     *
     * @param thechar a character
     * @return a #GIOStatus
     */
    public fun writeUnichar(thechar: gunichar): Result<IoStatus> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_io_channel_write_unichar(gPointer, thechar, gError.ptr).run {
            IoStatus.fromNativeValue(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object {
        /**
         * Open a file @filename as a #GIOChannel using mode @mode. This
         * channel will be closed when the last reference to it is dropped,
         * so there is no need to call g_io_channel_close() (though doing
         * so will not cause problems, as long as no attempt is made to
         * access the channel after it is closed).
         *
         * @param filename A string containing the name of a file
         * @param mode One of "r", "w", "a", "r+", "w+", "a+". These have
         *        the same meaning as in fopen()
         * @return A #GIOChannel on success, null on failure.
         */
        public fun newFile(filename: String, mode: String): Result<IoChannel> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_io_channel_new_file(filename, mode, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(IoChannel(checkNotNull(gResult)))
                }
            }
        }

        /**
         * Creates a new #GIOChannel given a file descriptor. On UNIX systems
         * this works for plain files, pipes, and sockets.
         *
         * The returned #GIOChannel has a reference count of 1.
         *
         * The default encoding for #GIOChannel is UTF-8. If your application
         * is reading output from a command using via pipe, you may need to set
         * the encoding to the encoding of the current locale (see
         * g_get_charset()) with the g_io_channel_set_encoding() function.
         * By default, the fd passed will not be closed when the final reference
         * to the #GIOChannel data structure is dropped.
         *
         * If you want to read raw binary data without interpretation, then
         * call the g_io_channel_set_encoding() function with null for the
         * encoding argument.
         *
         * This function is available in GLib on Windows, too, but you should
         * avoid using it on Windows. The domain of file descriptors and
         * sockets overlap. There is no way for GLib to know which one you mean
         * in case the argument you pass to this function happens to be both a
         * valid file descriptor and socket. If that happens a warning is
         * issued, and GLib assumes that it is the file descriptor you mean.
         *
         * @param fd a file descriptor.
         * @return a new #GIOChannel.
         */
        public fun unixNew(fd: gint): IoChannel = IoChannel(g_io_channel_unix_new(fd)!!.reinterpret())

        /**
         * Converts an `errno` error number to a #GIOChannelError.
         *
         * @param en an `errno` error number, e.g. `EINVAL`
         * @return a #GIOChannelError error number, e.g.
         *      %G_IO_CHANNEL_ERROR_INVAL.
         */
        public fun errorFromErrno(en: gint): IoChannelError = g_io_channel_error_from_errno(en).run {
            IoChannelError.fromNativeValue(this)
        }

        public fun errorQuark(): Quark = g_io_channel_error_quark()

        /**
         * Get the GType of IOChannel
         *
         * @return the GType
         */
        public fun getType(): GType = g_io_channel_get_type()
    }
}
