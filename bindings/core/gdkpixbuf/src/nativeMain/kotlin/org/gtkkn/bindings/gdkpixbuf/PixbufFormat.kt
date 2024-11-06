// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_2
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_22
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_36
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_6
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdkpixbuf.GdkPixbufFormat
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_copy
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_free
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_description
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_extensions
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_license
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_mime_types
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_name
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_disabled
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_save_option_supported
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_scalable
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_writable
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_set_disabled
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.List

/**
 * A `GdkPixbufFormat` contains information about the image format accepted
 * by a module.
 *
 * Only modules should access the fields directly, applications should
 * use the `gdk_pixbuf_format_*` family of functions.
 *
 * ## Skipped during bindings generation
 *
 * - field `mime_types`: Fields with arrays are not supported
 * - field `extensions`: Fields with arrays are not supported
 *
 * @since 2.2
 */
@GdkPixbufVersion2_2
public class PixbufFormat(
    pointer: CPointer<GdkPixbufFormat>,
) : Record {
    public val gdkpixbufPixbufFormatPointer: CPointer<GdkPixbufFormat> = pointer

    /**
     * the name of the image format
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.name?.toKString()

    /**
     * the signature of the module
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val signature: PixbufModulePattern?
        get() =
            gdkpixbufPixbufFormatPointer.pointed.signature?.run {
                PixbufModulePattern(reinterpret())
            }

    /**
     * the message domain for the `description`
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val domain: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.domain?.toKString()

    /**
     * a description of the image format
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val description: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.description?.toKString()

    /**
     * a combination of `GdkPixbufFormatFlags`
     */
    public var flags: UInt
        get() = gdkpixbufPixbufFormatPointer.pointed.flags
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.flags = value
        }

    /**
     * a boolean determining whether the loader is disabled`
     */
    public var disabled: Boolean
        get() = gdkpixbufPixbufFormatPointer.pointed.disabled.asBoolean()
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.disabled = value.asGBoolean()
        }

    /**
     * a string containing license information, typically set to
     *   shorthands like "GPL", "LGPL", etc.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val license: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.license?.toKString()

    /**
     * Creates a copy of `format`.
     *
     * @return the newly allocated copy of a `GdkPixbufFormat`. Use
     *   gdk_pixbuf_format_free() to free the resources when done
     * @since 2.22
     */
    @GdkPixbufVersion2_22
    public fun copy(): PixbufFormat =
        gdk_pixbuf_format_copy(gdkpixbufPixbufFormatPointer.reinterpret())!!.run {
            PixbufFormat(reinterpret())
        }

    /**
     * Frees the resources allocated when copying a `GdkPixbufFormat`
     * using gdk_pixbuf_format_copy()
     *
     * @since 2.22
     */
    @GdkPixbufVersion2_22
    public fun free(): Unit = gdk_pixbuf_format_free(gdkpixbufPixbufFormatPointer.reinterpret())

    /**
     * Returns a description of the format.
     *
     * @return a description of the format.
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getDescription(): String =
        gdk_pixbuf_format_get_description(gdkpixbufPixbufFormatPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the filename extensions typically used for files in the
     * given format.
     *
     * @return an array of
     *   filename extensions
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getExtensions(): List<String> =
        gdk_pixbuf_format_get_extensions(gdkpixbufPixbufFormatPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Returns information about the license of the image loader for the format.
     *
     * The returned string should be a shorthand for a well known license, e.g.
     * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other license.
     *
     * @return a string describing the license of the pixbuf format
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public fun getLicense(): String =
        gdk_pixbuf_format_get_license(gdkpixbufPixbufFormatPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the mime types supported by the format.
     *
     * @return an array of mime types
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getMimeTypes(): List<String> =
        gdk_pixbuf_format_get_mime_types(gdkpixbufPixbufFormatPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Returns the name of the format.
     *
     * @return the name of the format.
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getName(): String =
        gdk_pixbuf_format_get_name(gdkpixbufPixbufFormatPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns whether this image format is disabled.
     *
     * See gdk_pixbuf_format_set_disabled().
     *
     * @return whether this image format is disabled.
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public fun isDisabled(): Boolean =
        gdk_pixbuf_format_is_disabled(gdkpixbufPixbufFormatPointer.reinterpret()).asBoolean()

    /**
     * Returns `TRUE` if the save option specified by @option_key is supported when
     * saving a pixbuf using the module implementing @format.
     *
     * See gdk_pixbuf_save() for more information about option keys.
     *
     * @param optionKey the name of an option
     * @return `TRUE` if the specified option is supported
     * @since 2.36
     */
    @GdkPixbufVersion2_36
    public fun isSaveOptionSupported(optionKey: String): Boolean =
        gdk_pixbuf_format_is_save_option_supported(gdkpixbufPixbufFormatPointer.reinterpret(), optionKey).asBoolean()

    /**
     * Returns whether this image format is scalable.
     *
     * If a file is in a scalable format, it is preferable to load it at
     * the desired size, rather than loading it at the default size and
     * scaling the resulting pixbuf to the desired size.
     *
     * @return whether this image format is scalable.
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public fun isScalable(): Boolean =
        gdk_pixbuf_format_is_scalable(gdkpixbufPixbufFormatPointer.reinterpret()).asBoolean()

    /**
     * Returns whether pixbufs can be saved in the given format.
     *
     * @return whether pixbufs can be saved in the given format.
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun isWritable(): Boolean =
        gdk_pixbuf_format_is_writable(gdkpixbufPixbufFormatPointer.reinterpret()).asBoolean()

    /**
     * Disables or enables an image format.
     *
     * If a format is disabled, GdkPixbuf won't use the image loader for
     * this format to load images.
     *
     * Applications can use this to avoid using image loaders with an
     * inappropriate license, see gdk_pixbuf_format_get_license().
     *
     * @param disabled `TRUE` to disable the format @format
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public fun setDisabled(disabled: Boolean): Unit =
        gdk_pixbuf_format_set_disabled(gdkpixbufPixbufFormatPointer.reinterpret(), disabled.asGBoolean())

    public companion object : RecordCompanion<PixbufFormat, GdkPixbufFormat> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PixbufFormat =
            PixbufFormat(pointer.reinterpret())
    }
}
