// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkContentDeserializer
import org.gtkkn.native.gdk.gdk_content_deserializer_get_cancellable
import org.gtkkn.native.gdk.gdk_content_deserializer_get_gtype
import org.gtkkn.native.gdk.gdk_content_deserializer_get_input_stream
import org.gtkkn.native.gdk.gdk_content_deserializer_get_mime_type
import org.gtkkn.native.gdk.gdk_content_deserializer_get_priority
import org.gtkkn.native.gdk.gdk_content_deserializer_get_task_data
import org.gtkkn.native.gdk.gdk_content_deserializer_get_type
import org.gtkkn.native.gdk.gdk_content_deserializer_get_user_data
import org.gtkkn.native.gdk.gdk_content_deserializer_get_value
import org.gtkkn.native.gdk.gdk_content_deserializer_return_error
import org.gtkkn.native.gdk.gdk_content_deserializer_return_success
import org.gtkkn.native.gio.GAsyncResult
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.String
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
 * - parameter `notify`: GLib.DestroyNotify
 */
public open class ContentDeserializer(public val gdkContentDeserializerPointer: CPointer<GdkContentDeserializer>) :
    Object(gdkContentDeserializerPointer.reinterpret()),
    AsyncResult,
    KGTyped {
    init {
        Gdk
    }

    override val gioAsyncResultPointer: CPointer<GAsyncResult>
        get() = handle.reinterpret()

    /**
     * Gets the cancellable for the current operation.
     *
     * This is the `GCancellable` that was passed to [func@Gdk.content_deserialize_async].
     *
     * @return the cancellable for the current operation
     */
    public open fun getCancellable(): Cancellable? =
        gdk_content_deserializer_get_cancellable(gdkContentDeserializerPointer)?.run {
            InstanceCache.get(this, true) { Cancellable(reinterpret()) }!!
        }

    /**
     * Gets the `GType` to create an instance of.
     *
     * @return the `GType` for the current operation
     */
    public open fun getGtype(): GType = gdk_content_deserializer_get_gtype(gdkContentDeserializerPointer)

    /**
     * Gets the input stream for the current operation.
     *
     * This is the stream that was passed to [func@Gdk.content_deserialize_async].
     *
     * @return the input stream for the current operation
     */
    public open fun getInputStream(): InputStream =
        gdk_content_deserializer_get_input_stream(gdkContentDeserializerPointer)!!.run {
            InstanceCache.get(this, true) { InputStream.InputStreamImpl(reinterpret()) }!!
        }

    /**
     * Gets the mime type to deserialize from.
     *
     * @return the mime type for the current operation
     */
    public open fun getMimeType(): String =
        gdk_content_deserializer_get_mime_type(gdkContentDeserializerPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the I/O priority for the current operation.
     *
     * This is the priority that was passed to [func@Gdk.content_deserialize_async].
     *
     * @return the I/O priority for the current operation
     */
    public open fun getPriority(): gint = gdk_content_deserializer_get_priority(gdkContentDeserializerPointer)

    /**
     * Gets the data that was associated with the current operation.
     *
     * See [method@Gdk.ContentDeserializer.set_task_data].
     *
     * @return the task data for @deserializer
     */
    public open fun getTaskData(): gpointer? = gdk_content_deserializer_get_task_data(gdkContentDeserializerPointer)

    /**
     * Gets the user data that was passed when the deserializer was registered.
     *
     * @return the user data for this deserializer
     */
    override fun getUserData(): gpointer? = gdk_content_deserializer_get_user_data(gdkContentDeserializerPointer)

    /**
     * Gets the `GValue` to store the deserialized object in.
     *
     * @return the `GValue` for the current operation
     */
    public open fun getValue(): Value = gdk_content_deserializer_get_value(gdkContentDeserializerPointer)!!.run {
        Value(this)
    }

    /**
     * Indicate that the deserialization has ended with an error.
     *
     * This function consumes @error.
     *
     * @param error a `GError`
     */
    public open fun returnError(error: Error): Unit =
        gdk_content_deserializer_return_error(gdkContentDeserializerPointer, error.glibErrorPointer)

    /**
     * Indicate that the deserialization has been successfully completed.
     */
    public open fun returnSuccess(): Unit = gdk_content_deserializer_return_success(gdkContentDeserializerPointer)

    public companion object : TypeCompanion<ContentDeserializer> {
        override val type: GeneratedClassKGType<ContentDeserializer> =
            GeneratedClassKGType(getTypeOrNull()!!) { ContentDeserializer(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of ContentDeserializer
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_content_deserializer_get_type()

        /**
         * Gets the GType of from the symbol `gdk_content_deserializer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_content_deserializer_get_type")
    }
}
