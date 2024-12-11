// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_2
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_22
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_36
import org.gtkkn.bindings.gdkpixbuf.annotations.GdkPixbufVersion2_6
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdkpixbuf.GdkPixbufFormat
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_copy
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_free
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_description
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_extensions
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_license
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_mime_types
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_name
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_get_type
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_disabled
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_save_option_supported
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_scalable
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_is_writable
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_format_set_disabled
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
public class PixbufFormat(pointer: CPointer<GdkPixbufFormat>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gdkpixbufPixbufFormatPointer: CPointer<GdkPixbufFormat> = pointer

    /**
     * the name of the image format
     */
    public var name: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.name?.let { g_free(it) }
            gdkpixbufPixbufFormatPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * the signature of the module
     */
    public var signature: PixbufModulePattern?
        get() = gdkpixbufPixbufFormatPointer.pointed.signature?.run {
            PixbufModulePattern(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.signature = value?.gdkpixbufPixbufModulePatternPointer
        }

    /**
     * the message domain for the `description`
     */
    public var domain: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.domain?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.domain?.let { g_free(it) }
            gdkpixbufPixbufFormatPointer.pointed.domain = value?.let { g_strdup(it) }
        }

    /**
     * a description of the image format
     */
    public var description: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.description?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.description?.let { g_free(it) }
            gdkpixbufPixbufFormatPointer.pointed.description = value?.let { g_strdup(it) }
        }

    /**
     * a combination of `GdkPixbufFormatFlags`
     */
    public var flags: guint
        get() = gdkpixbufPixbufFormatPointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.flags = value
        }

    /**
     * a boolean determining whether the loader is disabled`
     */
    public var disabled: Boolean
        get() = gdkpixbufPixbufFormatPointer.pointed.disabled.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.disabled = value.asGBoolean()
        }

    /**
     * a string containing license information, typically set to
     *   shorthands like "GPL", "LGPL", etc.
     */
    public var license: String?
        get() = gdkpixbufPixbufFormatPointer.pointed.license?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkpixbufPixbufFormatPointer.pointed.license?.let { g_free(it) }
            gdkpixbufPixbufFormatPointer.pointed.license = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new PixbufFormat.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GdkPixbufFormat>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PixbufFormat and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GdkPixbufFormat>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PixbufFormat using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkPixbufFormat>().ptr)

    /**
     * Allocate a new PixbufFormat.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param name the name of the image format
     * @param signature the signature of the module
     * @param domain the message domain for the `description`
     * @param description a description of the image format
     * @param flags a combination of `GdkPixbufFormatFlags`
     * @param disabled a boolean determining whether the loader is disabled`
     * @param license a string containing license information, typically set to
     *   shorthands like "GPL", "LGPL", etc.
     */
    public constructor(
        name: String?,
        signature: PixbufModulePattern?,
        domain: String?,
        description: String?,
        flags: guint,
        disabled: Boolean,
        license: String?,
    ) : this() {
        this.name = name
        this.signature = signature
        this.domain = domain
        this.description = description
        this.flags = flags
        this.disabled = disabled
        this.license = license
    }

    /**
     * Allocate a new PixbufFormat using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param name the name of the image format
     * @param signature the signature of the module
     * @param domain the message domain for the `description`
     * @param description a description of the image format
     * @param flags a combination of `GdkPixbufFormatFlags`
     * @param disabled a boolean determining whether the loader is disabled`
     * @param license a string containing license information, typically set to
     *   shorthands like "GPL", "LGPL", etc.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        name: String?,
        signature: PixbufModulePattern?,
        domain: String?,
        description: String?,
        flags: guint,
        disabled: Boolean,
        license: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.name = name
        this.signature = signature
        this.domain = domain
        this.description = description
        this.flags = flags
        this.disabled = disabled
        this.license = license
    }

    /**
     * Creates a copy of `format`.
     *
     * @return the newly allocated copy of a `GdkPixbufFormat`. Use
     *   gdk_pixbuf_format_free() to free the resources when done
     * @since 2.22
     */
    @GdkPixbufVersion2_22
    public fun copy(): PixbufFormat = gdk_pixbuf_format_copy(gdkpixbufPixbufFormatPointer.reinterpret())!!.run {
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
    public fun getName(): String = gdk_pixbuf_format_get_name(gdkpixbufPixbufFormatPointer.reinterpret())?.toKString()
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

    override fun toString(): String =
        "PixbufFormat(name=$name, signature=$signature, domain=$domain, description=$description, flags=$flags, disabled=$disabled, license=$license)"

    public companion object {
        /**
         * Get the GType of PixbufFormat
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_format_get_type()
    }
}
