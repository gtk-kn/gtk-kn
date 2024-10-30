// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDataOutputStream
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_data_output_stream_get_byte_order
import org.gtkkn.native.gio.g_data_output_stream_get_type
import org.gtkkn.native.gio.g_data_output_stream_new
import org.gtkkn.native.gio.g_data_output_stream_put_int16
import org.gtkkn.native.gio.g_data_output_stream_put_int32
import org.gtkkn.native.gio.g_data_output_stream_put_int64
import org.gtkkn.native.gio.g_data_output_stream_put_string
import org.gtkkn.native.gio.g_data_output_stream_put_uint16
import org.gtkkn.native.gio.g_data_output_stream_put_uint32
import org.gtkkn.native.gio.g_data_output_stream_put_uint64
import org.gtkkn.native.gio.g_data_output_stream_set_byte_order
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Result
import kotlin.Short
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit

/**
 * Data output stream implements [class@Gio.OutputStream] and includes functions
 * for writing data directly to an output stream.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: guint8
 */
public open class DataOutputStream(
    pointer: CPointer<GDataOutputStream>,
) : FilterOutputStream(pointer.reinterpret()),
    Seekable,
    KGTyped {
    public val gioDataOutputStreamPointer: CPointer<GDataOutputStream>
        get() = gPointer.reinterpret()

    override val gioSeekablePointer: CPointer<GSeekable>
        get() = gPointer.reinterpret()

    /**
     * Determines the byte ordering that is used when writing
     * multi-byte entities (such as integers) to the stream.
     */
    public open var byteOrder: DataStreamByteOrder
        /**
         * Gets the byte order for the stream.
         *
         * @return the #GDataStreamByteOrder for the @stream.
         */
        get() =
            g_data_output_stream_get_byte_order(gioDataOutputStreamPointer.reinterpret()).run {
                DataStreamByteOrder.fromNativeValue(this)
            }

        /**
         * Sets the byte order of the data output stream to @order.
         *
         * @param order a %GDataStreamByteOrder.
         */
        set(order) = g_data_output_stream_set_byte_order(gioDataOutputStreamPointer.reinterpret(), order.nativeValue)

    /**
     * Creates a new data output stream for @base_stream.
     *
     * @param baseStream a #GOutputStream.
     * @return #GDataOutputStream.
     */
    public constructor(
        baseStream: OutputStream,
    ) : this(g_data_output_stream_new(baseStream.gioOutputStreamPointer.reinterpret())!!.reinterpret())

    /**
     * Gets the byte order for the stream.
     *
     * @return the #GDataStreamByteOrder for the @stream.
     */
    public open fun getByteOrder(): DataStreamByteOrder =
        g_data_output_stream_get_byte_order(gioDataOutputStreamPointer.reinterpret()).run {
            DataStreamByteOrder.fromNativeValue(this)
        }

    /**
     * Puts a signed 16-bit integer into the output stream.
     *
     * @param data a #gint16.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @data was successfully added to the @stream.
     */
    public open fun putInt16(
        `data`: Short,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_int16(
                    gioDataOutputStreamPointer.reinterpret(),
                    `data`,
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
     * Puts a signed 32-bit integer into the output stream.
     *
     * @param data a #gint32.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @data was successfully added to the @stream.
     */
    public open fun putInt32(
        `data`: Int,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_int32(
                    gioDataOutputStreamPointer.reinterpret(),
                    `data`,
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
     * Puts a signed 64-bit integer into the stream.
     *
     * @param data a #gint64.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @data was successfully added to the @stream.
     */
    public open fun putInt64(
        `data`: Long,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_int64(
                    gioDataOutputStreamPointer.reinterpret(),
                    `data`,
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
     * Puts a string into the output stream.
     *
     * @param str a string.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @string was successfully added to the @stream.
     */
    public open fun putString(
        str: String,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_string(
                    gioDataOutputStreamPointer.reinterpret(),
                    str,
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
     * Puts an unsigned 16-bit integer into the output stream.
     *
     * @param data a #guint16.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @data was successfully added to the @stream.
     */
    public open fun putUint16(
        `data`: UShort,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_uint16(
                    gioDataOutputStreamPointer.reinterpret(),
                    `data`,
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
     * Puts an unsigned 32-bit integer into the stream.
     *
     * @param data a #guint32.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @data was successfully added to the @stream.
     */
    public open fun putUint32(
        `data`: UInt,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_uint32(
                    gioDataOutputStreamPointer.reinterpret(),
                    `data`,
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
     * Puts an unsigned 64-bit integer into the stream.
     *
     * @param data a #guint64.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if @data was successfully added to the @stream.
     */
    public open fun putUint64(
        `data`: ULong,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_data_output_stream_put_uint64(
                    gioDataOutputStreamPointer.reinterpret(),
                    `data`,
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
     * Sets the byte order of the data output stream to @order.
     *
     * @param order a %GDataStreamByteOrder.
     */
    public open fun setByteOrder(order: DataStreamByteOrder): Unit =
        g_data_output_stream_set_byte_order(gioDataOutputStreamPointer.reinterpret(), order.nativeValue)

    public companion object : TypeCompanion<DataOutputStream> {
        override val type: GeneratedClassKGType<DataOutputStream> =
            GeneratedClassKGType(g_data_output_stream_get_type()) { DataOutputStream(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
