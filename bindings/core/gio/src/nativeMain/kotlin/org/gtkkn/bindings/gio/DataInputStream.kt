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
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDataInputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_data_input_stream_get_byte_order
import org.gtkkn.native.gio.g_data_input_stream_get_newline_type
import org.gtkkn.native.gio.g_data_input_stream_get_type
import org.gtkkn.native.gio.g_data_input_stream_new
import org.gtkkn.native.gio.g_data_input_stream_read_byte
import org.gtkkn.native.gio.g_data_input_stream_read_int16
import org.gtkkn.native.gio.g_data_input_stream_read_int32
import org.gtkkn.native.gio.g_data_input_stream_read_int64
import org.gtkkn.native.gio.g_data_input_stream_read_line_async
import org.gtkkn.native.gio.g_data_input_stream_read_uint16
import org.gtkkn.native.gio.g_data_input_stream_read_uint32
import org.gtkkn.native.gio.g_data_input_stream_read_uint64
import org.gtkkn.native.gio.g_data_input_stream_read_until_async
import org.gtkkn.native.gio.g_data_input_stream_read_upto_async
import org.gtkkn.native.gio.g_data_input_stream_set_byte_order
import org.gtkkn.native.gio.g_data_input_stream_set_newline_type
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.gobject.GType
import kotlin.Long
import kotlin.Result
import kotlin.Short
import kotlin.String
import kotlin.Unit

/**
 * Data input stream implements [class@Gio.InputStream] and includes functions
 * for reading structured data directly from a binary input stream.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 */
public open class DataInputStream(pointer: CPointer<GDataInputStream>) :
    BufferedInputStream(pointer.reinterpret()),
    KGTyped {
    public val gioDataInputStreamPointer: CPointer<GDataInputStream>
        get() = gPointer.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = gPointer.reinterpret()

    /**
     * The :byte-order property determines the byte ordering that
     * is used when reading multi-byte entities (such as integers)
     * from the stream.
     */
    public open var byteOrder: DataStreamByteOrder
        /**
         * Gets the byte order for the data input stream.
         *
         * @return the @stream's current #GDataStreamByteOrder.
         */
        get() = g_data_input_stream_get_byte_order(gioDataInputStreamPointer.reinterpret()).run {
            DataStreamByteOrder.fromNativeValue(this)
        }

        /**
         * This function sets the byte order for the given @stream. All subsequent
         * reads from the @stream will be read in the given @order.
         *
         * @param order a #GDataStreamByteOrder to set.
         */
        set(order) = g_data_input_stream_set_byte_order(gioDataInputStreamPointer.reinterpret(), order.nativeValue)

    /**
     * The :newline-type property determines what is considered
     * as a line ending when reading complete lines from the stream.
     */
    public open var newlineType: DataStreamNewlineType
        /**
         * Gets the current newline type for the @stream.
         *
         * @return #GDataStreamNewlineType for the given @stream.
         */
        get() = g_data_input_stream_get_newline_type(gioDataInputStreamPointer.reinterpret()).run {
            DataStreamNewlineType.fromNativeValue(this)
        }

        /**
         * Sets the newline type for the @stream.
         *
         * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a read
         * chunk ends in "CR" we must read an additional byte to know if this is "CR" or
         * "CR LF", and this might block if there is no more data available.
         *
         * @param type the type of new line return as #GDataStreamNewlineType.
         */
        set(type) = g_data_input_stream_set_newline_type(gioDataInputStreamPointer.reinterpret(), type.nativeValue)

    /**
     * Creates a new data input stream for the @base_stream.
     *
     * @param baseStream a #GInputStream.
     * @return a new #GDataInputStream.
     */
    public constructor(
        baseStream: InputStream,
    ) : this(g_data_input_stream_new(baseStream.gioInputStreamPointer.reinterpret())!!.reinterpret())

    /**
     * Reads an unsigned 8-bit/1-byte value from @stream.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return an unsigned 8-bit/1-byte value read from the @stream or `0`
     * if an error occurred.
     */
    public open fun readByte(cancellable: Cancellable? = null): Result<guint8> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_byte(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads a 16-bit/2-byte value from @stream.
     *
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a signed 16-bit/2-byte value read from @stream or `0` if
     * an error occurred.
     */
    public open fun readInt16(cancellable: Cancellable? = null): Result<Short> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_int16(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads a signed 32-bit/4-byte value from @stream.
     *
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a signed 32-bit/4-byte value read from the @stream or `0` if
     * an error occurred.
     */
    public open fun readInt32(cancellable: Cancellable? = null): Result<gint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_int32(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads a 64-bit/8-byte value from @stream.
     *
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a signed 64-bit/8-byte value read from @stream or `0` if
     * an error occurred.
     */
    public open fun readInt64(cancellable: Cancellable? = null): Result<gint64> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_int64(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The asynchronous version of g_data_input_stream_read_line().  It is
     * an error to have two outstanding calls to this function.
     *
     * When the operation is finished, @callback will be called. You
     * can then call g_data_input_stream_read_line_finish() to get
     * the result of the operation.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback callback to call when the request is satisfied.
     * @since 2.20
     */
    @GioVersion2_20
    public open fun readLineAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_data_input_stream_read_line_async(
        gioDataInputStreamPointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Reads an unsigned 16-bit/2-byte value from @stream.
     *
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return an unsigned 16-bit/2-byte value read from the @stream or `0` if
     * an error occurred.
     */
    public open fun readUint16(cancellable: Cancellable? = null): Result<guint16> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_uint16(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads an unsigned 32-bit/4-byte value from @stream.
     *
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return an unsigned 32-bit/4-byte value read from the @stream or `0` if
     * an error occurred.
     */
    public open fun readUint32(cancellable: Cancellable? = null): Result<guint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_uint32(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Reads an unsigned 64-bit/8-byte value from @stream.
     *
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order().
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return an unsigned 64-bit/8-byte read from @stream or `0` if
     * an error occurred.
     */
    public open fun readUint64(cancellable: Cancellable? = null): Result<guint64> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_data_input_stream_read_uint64(
                gioDataInputStreamPointer.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The asynchronous version of g_data_input_stream_read_until().
     * It is an error to have two outstanding calls to this function.
     *
     * Note that, in contrast to g_data_input_stream_read_until(),
     * this function does not consume the stop character that it finds.  You
     * must read it for yourself.
     *
     * When the operation is finished, @callback will be called. You
     * can then call g_data_input_stream_read_until_finish() to get
     * the result of the operation.
     *
     * Don't use this function in new code.  Its functionality is
     * inconsistent with g_data_input_stream_read_until().  Both functions
     * will be marked as deprecated in a future release.  Use
     * g_data_input_stream_read_upto_async() instead.
     *
     * @param stopChars characters to terminate the read.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback callback to call when the request is satisfied.
     * @since 2.20
     */
    @GioVersion2_20
    public open fun readUntilAsync(
        stopChars: String,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_data_input_stream_read_until_async(
        gioDataInputStreamPointer.reinterpret(),
        stopChars,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * The asynchronous version of g_data_input_stream_read_upto().
     * It is an error to have two outstanding calls to this function.
     *
     * In contrast to g_data_input_stream_read_until(), this function
     * does not consume the stop character. You have to use
     * g_data_input_stream_read_byte() to get it before calling
     * g_data_input_stream_read_upto() again.
     *
     * Note that @stop_chars may contain '\0' if @stop_chars_len is
     * specified.
     *
     * When the operation is finished, @callback will be called. You
     * can then call g_data_input_stream_read_upto_finish() to get
     * the result of the operation.
     *
     * @param stopChars characters to terminate the read
     * @param stopCharsLen length of @stop_chars. May be -1 if @stop_chars is
     *     nul-terminated
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional #GCancellable object, null to ignore
     * @param callback callback to call when the request is satisfied
     * @since 2.26
     */
    @GioVersion2_26
    public open fun readUptoAsync(
        stopChars: String,
        stopCharsLen: Long,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_data_input_stream_read_upto_async(
        gioDataInputStreamPointer.reinterpret(),
        stopChars,
        stopCharsLen,
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    public companion object : TypeCompanion<DataInputStream> {
        override val type: GeneratedClassKGType<DataInputStream> =
            GeneratedClassKGType(g_data_input_stream_get_type()) { DataInputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DataInputStream
         *
         * @return the GType
         */
        public fun getType(): GType = g_data_input_stream_get_type()
    }
}
