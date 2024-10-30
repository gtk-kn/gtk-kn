// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkContentDeserializer
import org.gtkkn.native.gdk.gdk_content_deserializer_get_cancellable
import org.gtkkn.native.gdk.gdk_content_deserializer_get_gtype
import org.gtkkn.native.gdk.gdk_content_deserializer_get_input_stream
import org.gtkkn.native.gdk.gdk_content_deserializer_get_mime_type
import org.gtkkn.native.gdk.gdk_content_deserializer_get_priority
import org.gtkkn.native.gdk.gdk_content_deserializer_get_type
import org.gtkkn.native.gdk.gdk_content_deserializer_get_value
import org.gtkkn.native.gdk.gdk_content_deserializer_return_error
import org.gtkkn.native.gdk.gdk_content_deserializer_return_success
import org.gtkkn.native.gio.GAsyncResult
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkContentDeserializer` is used to deserialize content received via
 * inter-application data transfers.
 *
 * The `GdkContentDeserializer` transforms serialized content that is
 * identified by a mime type into an object identified by a GType.
 *
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * deserialization functions, use [func@content_register_deserializer].
 *
 * Also see [class@Gdk.ContentSerializer].
 *
 * ## Skipped during bindings generation
 *
 * - method `get_task_data`: Return type gpointer is unsupported
 * - method `get_user_data`: Return type gpointer is unsupported
 * - parameter `data`: gpointer
 */
public open class ContentDeserializer(
    pointer: CPointer<GdkContentDeserializer>,
) : Object(pointer.reinterpret()),
    AsyncResult,
    KGTyped {
    public val gdkContentDeserializerPointer: CPointer<GdkContentDeserializer>
        get() = gPointer.reinterpret()

    override val gioAsyncResultPointer: CPointer<GAsyncResult>
        get() = gPointer.reinterpret()

    /**
     * Gets the cancellable for the current operation.
     *
     * This is the `GCancellable` that was passed to [func@Gdk.content_deserialize_async].
     *
     * @return the cancellable for the current operation
     */
    public open fun getCancellable(): Cancellable? =
        gdk_content_deserializer_get_cancellable(gdkContentDeserializerPointer.reinterpret())?.run {
            Cancellable(reinterpret())
        }

    /**
     * Gets the `GType` to create an instance of.
     *
     * @return the `GType` for the current operation
     */
    public open fun getGtype(): ULong = gdk_content_deserializer_get_gtype(gdkContentDeserializerPointer.reinterpret())

    /**
     * Gets the input stream for the current operation.
     *
     * This is the stream that was passed to [func@Gdk.content_deserialize_async].
     *
     * @return the input stream for the current operation
     */
    public open fun getInputStream(): InputStream =
        gdk_content_deserializer_get_input_stream(gdkContentDeserializerPointer.reinterpret())!!.run {
            InputStream(reinterpret())
        }

    /**
     * Gets the mime type to deserialize from.
     *
     * @return the mime type for the current operation
     */
    public open fun getMimeType(): String =
        gdk_content_deserializer_get_mime_type(gdkContentDeserializerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the I/O priority for the current operation.
     *
     * This is the priority that was passed to [func@Gdk.content_deserialize_async].
     *
     * @return the I/O priority for the current operation
     */
    public open fun getPriority(): Int =
        gdk_content_deserializer_get_priority(gdkContentDeserializerPointer.reinterpret())

    /**
     * Gets the `GValue` to store the deserialized object in.
     *
     * @return the `GValue` for the current operation
     */
    public open fun getValue(): Value =
        gdk_content_deserializer_get_value(gdkContentDeserializerPointer.reinterpret())!!.run {
            Value(reinterpret())
        }

    /**
     * Indicate that the deserialization has ended with an error.
     *
     * This function consumes @error.
     *
     * @param error a `GError`
     */
    public open fun returnError(error: Error): Unit =
        gdk_content_deserializer_return_error(gdkContentDeserializerPointer.reinterpret(), error.glibErrorPointer)

    /**
     * Indicate that the deserialization has been successfully completed.
     */
    public open fun returnSuccess(): Unit =
        gdk_content_deserializer_return_success(gdkContentDeserializerPointer.reinterpret())

    public companion object : TypeCompanion<ContentDeserializer> {
        override val type: GeneratedClassKGType<ContentDeserializer> =
            GeneratedClassKGType(gdk_content_deserializer_get_type()) { ContentDeserializer(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
