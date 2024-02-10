// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkContentFormatsBuilder
import org.gtkkn.native.gdk.gdk_content_formats_builder_add_formats
import org.gtkkn.native.gdk.gdk_content_formats_builder_add_gtype
import org.gtkkn.native.gdk.gdk_content_formats_builder_add_mime_type
import org.gtkkn.native.gdk.gdk_content_formats_builder_new
import org.gtkkn.native.gdk.gdk_content_formats_builder_ref
import org.gtkkn.native.gdk.gdk_content_formats_builder_to_formats
import org.gtkkn.native.gdk.gdk_content_formats_builder_unref
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkContentFormatsBuilder` is an auxiliary struct used to create
 * new `GdkContentFormats`, and should not be kept around.
 */
public class ContentFormatsBuilder(
    pointer: CPointer<GdkContentFormatsBuilder>,
) : Record {
    public val gdkContentFormatsBuilderPointer: CPointer<GdkContentFormatsBuilder> = pointer

    /**
     * Appends all formats from @formats to @builder, skipping those that
     * already exist.
     *
     * @param formats the formats to add
     */
    public fun addFormats(formats: ContentFormats): Unit =
        gdk_content_formats_builder_add_formats(
            gdkContentFormatsBuilderPointer.reinterpret(),
            formats.gdkContentFormatsPointer
        )

    /**
     * Appends @type to @builder if it has not already been added.
     *
     * @param type a `GType`
     */
    public fun addGtype(type: ULong): Unit =
        gdk_content_formats_builder_add_gtype(
            gdkContentFormatsBuilderPointer.reinterpret(),
            type
        )

    /**
     * Appends @mime_type to @builder if it has not already been added.
     *
     * @param mimeType a mime type
     */
    public fun addMimeType(mimeType: String): Unit =
        gdk_content_formats_builder_add_mime_type(
            gdkContentFormatsBuilderPointer.reinterpret(),
            mimeType
        )

    /**
     * Acquires a reference on the given @builder.
     *
     * This function is intended primarily for bindings.
     * `GdkContentFormatsBuilder` objects should not be kept around.
     *
     * @return the given `GdkContentFormatsBuilder`
     *   with its reference count increased
     */
    public fun ref(): ContentFormatsBuilder =
        gdk_content_formats_builder_ref(gdkContentFormatsBuilderPointer.reinterpret())!!.run {
            ContentFormatsBuilder(reinterpret())
        }

    /**
     * Creates a new `GdkContentFormats` from the given @builder.
     *
     * The given `GdkContentFormatsBuilder` is reset once this function returns;
     * you cannot call this function multiple times on the same @builder instance.
     *
     * This function is intended primarily for bindings. C code should use
     * [method@Gdk.ContentFormatsBuilder.free_to_formats].
     *
     * @return the newly created `GdkContentFormats`
     *   with all the formats added to @builder
     */
    public fun toFormats(): ContentFormats =
        gdk_content_formats_builder_to_formats(gdkContentFormatsBuilderPointer.reinterpret())!!.run {
            ContentFormats(reinterpret())
        }

    /**
     * Releases a reference on the given @builder.
     */
    public fun unref(): Unit = gdk_content_formats_builder_unref(gdkContentFormatsBuilderPointer.reinterpret())

    public companion object : RecordCompanion<ContentFormatsBuilder, GdkContentFormatsBuilder> {
        /**
         * Create a new `GdkContentFormatsBuilder` object.
         *
         * The resulting builder would create an empty `GdkContentFormats`.
         * Use addition functions to add types to it.
         *
         * @return a new `GdkContentFormatsBuilder`
         */
        public fun new(): ContentFormatsBuilder =
            ContentFormatsBuilder(gdk_content_formats_builder_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ContentFormatsBuilder =
            ContentFormatsBuilder(pointer.reinterpret())
    }
}
