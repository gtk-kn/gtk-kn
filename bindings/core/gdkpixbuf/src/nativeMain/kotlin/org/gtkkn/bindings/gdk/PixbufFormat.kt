// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_2
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_22
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_36
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_6
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.gdk.GdkPixbufFormat
import org.gtkkn.native.gdk.gdk_pixbuf_format_copy
import org.gtkkn.native.gdk.gdk_pixbuf_format_free
import org.gtkkn.native.gdk.gdk_pixbuf_format_get_description
import org.gtkkn.native.gdk.gdk_pixbuf_format_get_extensions
import org.gtkkn.native.gdk.gdk_pixbuf_format_get_license
import org.gtkkn.native.gdk.gdk_pixbuf_format_get_mime_types
import org.gtkkn.native.gdk.gdk_pixbuf_format_get_name
import org.gtkkn.native.gdk.gdk_pixbuf_format_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_format_is_disabled
import org.gtkkn.native.gdk.gdk_pixbuf_format_is_save_option_supported
import org.gtkkn.native.gdk.gdk_pixbuf_format_is_scalable
import org.gtkkn.native.gdk.gdk_pixbuf_format_is_writable
import org.gtkkn.native.gdk.gdk_pixbuf_format_set_disabled
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A `GdkPixbufFormat` contains information about the image format accepted
 * by a module.
 *
 * Only modules should access the fields directly, applications should
 * use the `gdk_pixbuf_format_*` family of functions.
 * @since 2.2
 */
@GdkPixbufVersion2_2
public class PixbufFormat(public val gdkPixbufFormatPointer: CPointer<GdkPixbufFormat>) :
    ProxyInstance(gdkPixbufFormatPointer) {
    /**
     * the name of the image format
     */
    public var name: String?
        get() = gdkPixbufFormatPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.name?.let { g_free(it) }
            gdkPixbufFormatPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * the signature of the module
     */
    public var signature: PixbufModulePattern?
        get() = gdkPixbufFormatPointer.pointed.signature?.run {
            PixbufModulePattern(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.signature = value?.gdkPixbufModulePatternPointer
        }

    /**
     * the message domain for the `description`
     */
    public var domain: String?
        get() = gdkPixbufFormatPointer.pointed.domain?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.domain?.let { g_free(it) }
            gdkPixbufFormatPointer.pointed.domain = value?.let { g_strdup(it) }
        }

    /**
     * a description of the image format
     */
    public var description: String?
        get() = gdkPixbufFormatPointer.pointed.description?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.description?.let { g_free(it) }
            gdkPixbufFormatPointer.pointed.description = value?.let { g_strdup(it) }
        }

    /**
     * the MIME types for the image format
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val mimeTypes: List<String>?
        get() = gdkPixbufFormatPointer.pointed.mime_types?.toKStringList()

    /**
     * typical filename extensions for the
     *   image format
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val extensions: List<String>?
        get() = gdkPixbufFormatPointer.pointed.extensions?.toKStringList()

    /**
     * a combination of `GdkPixbufFormatFlags`
     */
    public var flags: guint
        get() = gdkPixbufFormatPointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.flags = value
        }

    /**
     * a boolean determining whether the loader is disabled`
     */
    public var disabled: Boolean
        get() = gdkPixbufFormatPointer.pointed.disabled.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.disabled = value.asGBoolean()
        }

    /**
     * a string containing license information, typically set to
     *   shorthands like "GPL", "LGPL", etc.
     */
    public var license: String?
        get() = gdkPixbufFormatPointer.pointed.license?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufFormatPointer.pointed.license?.let { g_free(it) }
            gdkPixbufFormatPointer.pointed.license = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new PixbufFormat.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GdkPixbufFormat>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

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
    public fun copy(): PixbufFormat? = gdk_pixbuf_format_copy(gdkPixbufFormatPointer)?.run {
        PixbufFormat(this)
    }

    /**
     * Frees the resources allocated when copying a `GdkPixbufFormat`
     * using gdk_pixbuf_format_copy()
     *
     * @since 2.22
     */
    @GdkPixbufVersion2_22
    public fun free(): Unit = gdk_pixbuf_format_free(gdkPixbufFormatPointer)

    /**
     * Returns a description of the format.
     *
     * @return a description of the format.
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getDescription(): String? = gdk_pixbuf_format_get_description(gdkPixbufFormatPointer)?.toKString()

    /**
     * Returns the filename extensions typically used for files in the
     * given format.
     *
     * @return an array of
     *   filename extensions
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getExtensions(): List<String>? =
        gdk_pixbuf_format_get_extensions(gdkPixbufFormatPointer)?.toKStringList()

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
    public fun getLicense(): String? = gdk_pixbuf_format_get_license(gdkPixbufFormatPointer)?.toKString()

    /**
     * Returns the mime types supported by the format.
     *
     * @return an array of mime types
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getMimeTypes(): List<String>? = gdk_pixbuf_format_get_mime_types(gdkPixbufFormatPointer)?.toKStringList()

    /**
     * Returns the name of the format.
     *
     * @return the name of the format.
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun getName(): String? = gdk_pixbuf_format_get_name(gdkPixbufFormatPointer)?.toKString()

    /**
     * Returns whether this image format is disabled.
     *
     * See gdk_pixbuf_format_set_disabled().
     *
     * @return whether this image format is disabled.
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public fun isDisabled(): Boolean = gdk_pixbuf_format_is_disabled(gdkPixbufFormatPointer).asBoolean()

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
        gdk_pixbuf_format_is_save_option_supported(gdkPixbufFormatPointer, optionKey).asBoolean()

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
    public fun isScalable(): Boolean = gdk_pixbuf_format_is_scalable(gdkPixbufFormatPointer).asBoolean()

    /**
     * Returns whether pixbufs can be saved in the given format.
     *
     * @return whether pixbufs can be saved in the given format.
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public fun isWritable(): Boolean = gdk_pixbuf_format_is_writable(gdkPixbufFormatPointer).asBoolean()

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
        gdk_pixbuf_format_set_disabled(gdkPixbufFormatPointer, disabled.asGBoolean())

    override fun toString(): String =
        "PixbufFormat(name=$name, signature=$signature, domain=$domain, description=$description, mimeTypes=$mimeTypes, extensions=$extensions, flags=$flags, disabled=$disabled, license=$license)"

    public companion object {
        /**
         * Get the GType of PixbufFormat
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_format_get_type()
    }
}
