// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkContentSerializer
import org.gtkkn.native.gdk.gdk_content_serializer_get_cancellable
import org.gtkkn.native.gdk.gdk_content_serializer_get_gtype
import org.gtkkn.native.gdk.gdk_content_serializer_get_mime_type
import org.gtkkn.native.gdk.gdk_content_serializer_get_output_stream
import org.gtkkn.native.gdk.gdk_content_serializer_get_priority
import org.gtkkn.native.gdk.gdk_content_serializer_get_type
import org.gtkkn.native.gdk.gdk_content_serializer_get_value
import org.gtkkn.native.gdk.gdk_content_serializer_return_error
import org.gtkkn.native.gdk.gdk_content_serializer_return_success
import org.gtkkn.native.gio.GAsyncResult
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkContentSerializer` is used to serialize content for
 * inter-application data transfers.
 *
 * The `GdkContentSerializer` transforms an object that is identified
 * by a GType into a serialized form (i.e. a byte stream) that is
 * identified by a mime type.
 *
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * serialization functions, use [func@Gdk.content_register_serializer].
 *
 * Also see [class@Gdk.ContentDeserializer].
 *
 * ## Skipped during bindings generation
 *
 * - method `get_task_data`: Return type gpointer is unsupported
 * - method `get_user_data`: Return type gpointer is unsupported
 * - parameter `data`: gpointer
 */
public open class ContentSerializer(
    pointer: CPointer<GdkContentSerializer>,
) : Object(pointer.reinterpret()), AsyncResult, KGTyped {
    public val gdkContentSerializerPointer: CPointer<GdkContentSerializer>
        get() = gPointer.reinterpret()

    override val gioAsyncResultPointer: CPointer<GAsyncResult>
        get() = gPointer.reinterpret()

    /**
     * Gets the cancellable for the current operation.
     *
     * This is the `GCancellable` that was passed to [func@content_serialize_async].
     *
     * @return the cancellable for the current operation
     */
    public open fun getCancellable(): Cancellable? =
        gdk_content_serializer_get_cancellable(gdkContentSerializerPointer.reinterpret())?.run {
            Cancellable(reinterpret())
        }

    /**
     * Gets the `GType` to of the object to serialize.
     *
     * @return the `GType` for the current operation
     */
    public open fun getGtype(): ULong = gdk_content_serializer_get_gtype(gdkContentSerializerPointer.reinterpret())

    /**
     * Gets the mime type to serialize to.
     *
     * @return the mime type for the current operation
     */
    public open fun getMimeType(): String =
        gdk_content_serializer_get_mime_type(gdkContentSerializerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the output stream for the current operation.
     *
     * This is the stream that was passed to [func@content_serialize_async].
     *
     * @return the output stream for the current operation
     */
    public open fun getOutputStream(): OutputStream =
        gdk_content_serializer_get_output_stream(gdkContentSerializerPointer.reinterpret())!!.run {
            OutputStream(reinterpret())
        }

    /**
     * Gets the I/O priority for the current operation.
     *
     * This is the priority that was passed to [func@content_serialize_async].
     *
     * @return the I/O priority for the current operation
     */
    public open fun getPriority(): Int = gdk_content_serializer_get_priority(gdkContentSerializerPointer.reinterpret())

    /**
     * Gets the `GValue` to read the object to serialize from.
     *
     * @return the `GValue` for the current operation
     */
    public open fun getValue(): Value =
        gdk_content_serializer_get_value(gdkContentSerializerPointer.reinterpret())!!.run {
            Value(reinterpret())
        }

    /**
     * Indicate that the serialization has ended with an error.
     *
     * This function consumes @error.
     *
     * @param error a `GError`
     */
    public open fun returnError(error: Error): Unit =
        gdk_content_serializer_return_error(
            gdkContentSerializerPointer.reinterpret(),
            error.glibErrorPointer
        )

    /**
     * Indicate that the serialization has been successfully completed.
     */
    public open fun returnSuccess(): Unit =
        gdk_content_serializer_return_success(gdkContentSerializerPointer.reinterpret())

    public companion object : TypeCompanion<ContentSerializer> {
        override val type: GeneratedClassKGType<ContentSerializer> =
            GeneratedClassKGType(gdk_content_serializer_get_type()) {
                ContentSerializer(it.reinterpret())
            }

        init {
            GdkTypeProvider.register()
        }
    }
}
