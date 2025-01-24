// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkContentFormatsBuilder
import org.gtkkn.native.gdk.gdk_content_formats_builder_add_formats
import org.gtkkn.native.gdk.gdk_content_formats_builder_add_gtype
import org.gtkkn.native.gdk.gdk_content_formats_builder_add_mime_type
import org.gtkkn.native.gdk.gdk_content_formats_builder_free_to_formats
import org.gtkkn.native.gdk.gdk_content_formats_builder_get_type
import org.gtkkn.native.gdk.gdk_content_formats_builder_new
import org.gtkkn.native.gdk.gdk_content_formats_builder_ref
import org.gtkkn.native.gdk.gdk_content_formats_builder_to_formats
import org.gtkkn.native.gdk.gdk_content_formats_builder_unref
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * A `GdkContentFormatsBuilder` is an auxiliary struct used to create
 * new `GdkContentFormats`, and should not be kept around.
 */
public class ContentFormatsBuilder(public val gdkContentFormatsBuilderPointer: CPointer<GdkContentFormatsBuilder>) :
    ProxyInstance(gdkContentFormatsBuilderPointer) {
    /**
     * Appends all formats from @formats to @builder, skipping those that
     * already exist.
     *
     * @param formats the formats to add
     */
    public fun addFormats(formats: ContentFormats): Unit =
        gdk_content_formats_builder_add_formats(gdkContentFormatsBuilderPointer, formats.gdkContentFormatsPointer)

    /**
     * Appends @type to @builder if it has not already been added.
     *
     * @param type a `GType`
     */
    public fun addGtype(type: GType): Unit =
        gdk_content_formats_builder_add_gtype(gdkContentFormatsBuilderPointer, type)

    /**
     * Appends @mime_type to @builder if it has not already been added.
     *
     * @param mimeType a mime type
     */
    public fun addMimeType(mimeType: String): Unit =
        gdk_content_formats_builder_add_mime_type(gdkContentFormatsBuilderPointer, mimeType)

    /**
     * Creates a new `GdkContentFormats` from the current state of the
     * given @builder, and frees the @builder instance.
     *
     * @return the newly created `GdkContentFormats`
     *   with all the formats added to @builder
     */
    public fun freeToFormats(): ContentFormats =
        gdk_content_formats_builder_free_to_formats(gdkContentFormatsBuilderPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Acquires a reference on the given @builder.
     *
     * This function is intended primarily for bindings.
     * `GdkContentFormatsBuilder` objects should not be kept around.
     *
     * @return the given `GdkContentFormatsBuilder`
     *   with its reference count increased
     */
    public fun ref(): ContentFormatsBuilder = gdk_content_formats_builder_ref(gdkContentFormatsBuilderPointer)!!.run {
        ContentFormatsBuilder(this)
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
        gdk_content_formats_builder_to_formats(gdkContentFormatsBuilderPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Releases a reference on the given @builder.
     */
    public fun unref(): Unit = gdk_content_formats_builder_unref(gdkContentFormatsBuilderPointer)

    public companion object {
        /**
         * Create a new `GdkContentFormatsBuilder` object.
         *
         * The resulting builder would create an empty `GdkContentFormats`.
         * Use addition functions to add types to it.
         *
         * @return a new `GdkContentFormatsBuilder`
         */
        public fun new(): ContentFormatsBuilder = ContentFormatsBuilder(gdk_content_formats_builder_new()!!)

        /**
         * Get the GType of ContentFormatsBuilder
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_content_formats_builder_get_type()
    }
}
