// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_4
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.native.gdk.GdkContentFormats
import org.gtkkn.native.gdk.gdk_content_formats_contain_gtype
import org.gtkkn.native.gdk.gdk_content_formats_contain_mime_type
import org.gtkkn.native.gdk.gdk_content_formats_get_type
import org.gtkkn.native.gdk.gdk_content_formats_match
import org.gtkkn.native.gdk.gdk_content_formats_match_gtype
import org.gtkkn.native.gdk.gdk_content_formats_match_mime_type
import org.gtkkn.native.gdk.gdk_content_formats_new
import org.gtkkn.native.gdk.gdk_content_formats_new_for_gtype
import org.gtkkn.native.gdk.gdk_content_formats_parse
import org.gtkkn.native.gdk.gdk_content_formats_print
import org.gtkkn.native.gdk.gdk_content_formats_ref
import org.gtkkn.native.gdk.gdk_content_formats_to_string
import org.gtkkn.native.gdk.gdk_content_formats_union
import org.gtkkn.native.gdk.gdk_content_formats_union_deserialize_gtypes
import org.gtkkn.native.gdk.gdk_content_formats_union_deserialize_mime_types
import org.gtkkn.native.gdk.gdk_content_formats_union_serialize_gtypes
import org.gtkkn.native.gdk.gdk_content_formats_union_serialize_mime_types
import org.gtkkn.native.gdk.gdk_content_formats_unref
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * The `GdkContentFormats` structure is used to advertise and negotiate the
 * format of content.
 *
 * You will encounter `GdkContentFormats` when interacting with objects
 * controlling operations that pass data between different widgets, window
 * or application, like [class@Gdk.Drag], [class@Gdk.Drop],
 * [class@Gdk.Clipboard] or [class@Gdk.ContentProvider].
 *
 * GDK supports content in 2 forms: `GType` and mime type.
 * Using `GTypes` is meant only for in-process content transfers. Mime types
 * are meant to be used for data passing both in-process and out-of-process.
 * The details of how data is passed is described in the documentation of
 * the actual implementations. To transform between the two forms,
 * [class@Gdk.ContentSerializer] and [class@Gdk.ContentDeserializer] are used.
 *
 * A `GdkContentFormats` describes a set of possible formats content can be
 * exchanged in. It is assumed that this set is ordered. `GTypes` are more
 * important than mime types. Order between different `GTypes` or mime types
 * is the order they were added in, most important first. Functions that
 * care about order, such as [method@Gdk.ContentFormats.union], will describe
 * in their documentation how they interpret that order, though in general the
 * order of the first argument is considered the primary order of the result,
 * followed by the order of further arguments.
 *
 * For debugging purposes, the function [method@Gdk.ContentFormats.to_string]
 * exists. It will print a comma-separated list of formats from most important
 * to least important.
 *
 * `GdkContentFormats` is an immutable struct. After creation, you cannot change
 * the types it represents. Instead, new `GdkContentFormats` have to be created.
 * The [struct@Gdk.ContentFormatsBuilder] structure is meant to help in this
 * endeavor.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_gtypes`: n_gtypes: Out parameter is not supported
 * - parameter `n_mime_types`: n_mime_types: Out parameter is not supported
 */
public class ContentFormats(public val gdkContentFormatsPointer: CPointer<GdkContentFormats>) :
    ProxyInstance(gdkContentFormatsPointer) {
    /**
     * Checks if a given `GType` is part of the given @formats.
     *
     * @param type the `GType` to search for
     * @return true if the `GType` was found
     */
    public fun containGtype(type: GType): Boolean =
        gdk_content_formats_contain_gtype(gdkContentFormatsPointer, type).asBoolean()

    /**
     * Checks if a given mime type is part of the given @formats.
     *
     * @param mimeType the mime type to search for
     * @return true if the mime_type was found
     */
    public fun containMimeType(mimeType: KotlinString): Boolean =
        gdk_content_formats_contain_mime_type(gdkContentFormatsPointer, mimeType).asBoolean()

    /**
     * Checks if @first and @second have any matching formats.
     *
     * @param second the `GdkContentFormats` to intersect with
     * @return true if a matching format was found.
     */
    public fun match(second: ContentFormats): Boolean =
        gdk_content_formats_match(gdkContentFormatsPointer, second.gdkContentFormatsPointer).asBoolean()

    /**
     * Finds the first `GType` from @first that is also contained
     * in @second.
     *
     * If no matching `GType` is found, %G_TYPE_INVALID is returned.
     *
     * @param second the `GdkContentFormats` to intersect with
     * @return The first common `GType` or %G_TYPE_INVALID if none.
     */
    public fun matchGtype(second: ContentFormats): GType =
        gdk_content_formats_match_gtype(gdkContentFormatsPointer, second.gdkContentFormatsPointer)

    /**
     * Finds the first mime type from @first that is also contained
     * in @second.
     *
     * If no matching mime type is found, null is returned.
     *
     * @param second the `GdkContentFormats` to intersect with
     * @return The first common mime type or null if none
     */
    public fun matchMimeType(second: ContentFormats): KotlinString? =
        gdk_content_formats_match_mime_type(gdkContentFormatsPointer, second.gdkContentFormatsPointer)?.toKString()

    /**
     * Prints the given @formats into a string for human consumption.
     *
     * The result of this function can later be parsed with
     * [func@Gdk.ContentFormats.parse].
     *
     * @param string a `GString` to print into
     */
    public fun print(string: GlibString): Unit =
        gdk_content_formats_print(gdkContentFormatsPointer, string.glibStringPointer)

    /**
     * Increases the reference count of a `GdkContentFormats` by one.
     *
     * @return the passed in `GdkContentFormats`.
     */
    public fun ref(): ContentFormats = gdk_content_formats_ref(gdkContentFormatsPointer)!!.run {
        ContentFormats(this)
    }

    /**
     * Prints the given @formats into a human-readable string.
     *
     * The resulting string can be parsed with [func@Gdk.ContentFormats.parse].
     *
     * This is a small wrapper around [method@Gdk.ContentFormats.print]
     * to help when debugging.
     *
     * @return a new string
     */
    override fun toString(): KotlinString =
        gdk_content_formats_to_string(gdkContentFormatsPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Append all missing types from @second to @first, in the order
     * they had in @second.
     *
     * @param second the `GdkContentFormats` to merge from
     * @return a new `GdkContentFormats`
     */
    public fun union(second: ContentFormats): ContentFormats =
        gdk_content_formats_union(gdkContentFormatsPointer, second.gdkContentFormatsPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Add GTypes for mime types in @formats for which deserializers are
     * registered.
     *
     * @return a new `GdkContentFormats`
     */
    public fun unionDeserializeGtypes(): ContentFormats =
        gdk_content_formats_union_deserialize_gtypes(gdkContentFormatsPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Add mime types for GTypes in @formats for which deserializers are
     * registered.
     *
     * @return a new `GdkContentFormats`
     */
    public fun unionDeserializeMimeTypes(): ContentFormats =
        gdk_content_formats_union_deserialize_mime_types(gdkContentFormatsPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Add GTypes for the mime types in @formats for which serializers are
     * registered.
     *
     * @return a new `GdkContentFormats`
     */
    public fun unionSerializeGtypes(): ContentFormats =
        gdk_content_formats_union_serialize_gtypes(gdkContentFormatsPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Add mime types for GTypes in @formats for which serializers are
     * registered.
     *
     * @return a new `GdkContentFormats`
     */
    public fun unionSerializeMimeTypes(): ContentFormats =
        gdk_content_formats_union_serialize_mime_types(gdkContentFormatsPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * Decreases the reference count of a `GdkContentFormats` by one.
     *
     * If the resulting reference count is zero, frees the formats.
     */
    public fun unref(): Unit = gdk_content_formats_unref(gdkContentFormatsPointer)

    public companion object {
        /**
         * Creates a new `GdkContentFormats` from an array of mime types.
         *
         * The mime types must be valid and different from each other or the
         * behavior of the return value is undefined. If you cannot guarantee
         * this, use [struct@Gdk.ContentFormatsBuilder] instead.
         *
         * @param mimeTypes Pointer to an
         *   array of mime types
         * @param nMimeTypes number of entries in @mime_types.
         * @return the new `GdkContentFormats`.
         */
        public fun new(mimeTypes: List<KotlinString>? = null, nMimeTypes: guint): ContentFormats {
            memScoped {
                return ContentFormats(
                    gdk_content_formats_new(mimeTypes?.toCStringList(this), nMimeTypes)!!.reinterpret()
                )
            }
        }

        /**
         * Creates a new `GdkContentFormats` for a given `GType`.
         *
         * @param type a `GType`
         * @return a new `GdkContentFormats`
         */
        public fun newForGtype(type: GType): ContentFormats =
            ContentFormats(gdk_content_formats_new_for_gtype(type)!!.reinterpret())

        /**
         * Parses the given @string into `GdkContentFormats` and
         * returns the formats.
         *
         * Strings printed via [method@Gdk.ContentFormats.to_string]
         * can be read in again successfully using this function.
         *
         * If @string does not describe valid content formats, null
         * is returned.
         *
         * @param string the string to parse
         * @return the content formats if @string is valid
         * @since 4.4
         */
        @GdkVersion4_4
        public fun parse(string: KotlinString): ContentFormats? = gdk_content_formats_parse(string)?.run {
            ContentFormats(this)
        }

        /**
         * Get the GType of ContentFormats
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_content_formats_get_type()
    }
}
