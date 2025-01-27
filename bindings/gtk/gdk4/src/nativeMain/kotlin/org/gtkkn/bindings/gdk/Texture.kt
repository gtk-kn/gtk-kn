// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_10
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gio.LoadableIcon
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.GdkTexture
import org.gtkkn.native.gdk.gdk_texture_get_format
import org.gtkkn.native.gdk.gdk_texture_get_height
import org.gtkkn.native.gdk.gdk_texture_get_type
import org.gtkkn.native.gdk.gdk_texture_get_width
import org.gtkkn.native.gdk.gdk_texture_new_for_pixbuf
import org.gtkkn.native.gdk.gdk_texture_new_from_bytes
import org.gtkkn.native.gdk.gdk_texture_new_from_file
import org.gtkkn.native.gdk.gdk_texture_new_from_filename
import org.gtkkn.native.gdk.gdk_texture_new_from_resource
import org.gtkkn.native.gdk.gdk_texture_save_to_png
import org.gtkkn.native.gdk.gdk_texture_save_to_png_bytes
import org.gtkkn.native.gdk.gdk_texture_save_to_tiff
import org.gtkkn.native.gdk.gdk_texture_save_to_tiff_bytes
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Throws

/**
 * `GdkTexture` is the basic element used to refer to pixel data.
 *
 * It is primarily meant for pixel data that will not change over
 * multiple frames, and will be used for a long time.
 *
 * There are various ways to create `GdkTexture` objects from a
 * [class@GdkPixbuf.Pixbuf], or from bytes stored in memory, a file, or a
 * [struct@Gio.Resource].
 *
 * The ownership of the pixel data is transferred to the `GdkTexture`
 * instance; you can only make a copy of it, via [method@Gdk.Texture.download].
 *
 * `GdkTexture` is an immutable object: That means you cannot change
 * anything about it other than increasing the reference count via
 * [method@GObject.Object.ref], and consequently, it is a thread-safe object.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Array parameter of type guint8 is not supported
 */
public abstract class Texture(public val gdkTexturePointer: CPointer<GdkTexture>) :
    Object(gdkTexturePointer.reinterpret()),
    Paintable,
    Icon,
    LoadableIcon,
    KGTyped {
    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = handle.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = handle.reinterpret()

    /**
     * The height of the texture, in pixels.
     */
    public open val height: gint
        /**
         * Returns the height of the @texture, in pixels.
         *
         * @return the height of the `GdkTexture`
         */
        get() = gdk_texture_get_height(gdkTexturePointer)

    /**
     * The width of the texture, in pixels.
     */
    public open val width: gint
        /**
         * Returns the width of @texture, in pixels.
         *
         * @return the width of the `GdkTexture`
         */
        get() = gdk_texture_get_width(gdkTexturePointer)

    /**
     * Creates a new texture object representing the `GdkPixbuf`.
     *
     * This function is threadsafe, so that you can e.g. use GTask
     * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
     * while loading a big image.
     *
     * @param pixbuf a `GdkPixbuf`
     * @return a new `GdkTexture`
     */
    public constructor(pixbuf: Pixbuf) : this(gdk_texture_new_for_pixbuf(pixbuf.gdkPixbufPointer)!!.reinterpret())

    /**
     * Creates a new texture by loading an image from memory,
     *
     * The file format is detected automatically. The supported formats
     * are PNG, JPEG and TIFF, though more formats might be available.
     *
     * If null is returned, then @error will be set.
     *
     * This function is threadsafe, so that you can e.g. use GTask
     * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
     * while loading a big image.
     *
     * @param bytes a `GBytes` containing the data to load
     * @return A newly-created `GdkTexture`
     * @since 4.6
     */
    @Throws(GLibException::class)
    public constructor(bytes: Bytes) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_texture_new_from_bytes(bytes.glibBytesPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new texture by loading an image from a file.
     *
     * The file format is detected automatically. The supported formats
     * are PNG, JPEG and TIFF, though more formats might be available.
     *
     * If null is returned, then @error will be set.
     *
     * This function is threadsafe, so that you can e.g. use GTask
     * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
     * while loading a big image.
     *
     * @param file `GFile` to load
     * @return A newly-created `GdkTexture`
     */
    @Throws(GLibException::class)
    public constructor(`file`: File) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_texture_new_from_file(`file`.gioFilePointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new texture by loading an image from a file.
     *
     * The file format is detected automatically. The supported formats
     * are PNG, JPEG and TIFF, though more formats might be available.
     *
     * If null is returned, then @error will be set.
     *
     * This function is threadsafe, so that you can e.g. use GTask
     * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
     * while loading a big image.
     *
     * @param path the filename to load
     * @return A newly-created `GdkTexture`
     * @since 4.6
     */
    @Throws(GLibException::class)
    public constructor(path: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_texture_new_from_filename(path, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Gets the memory format most closely associated with the data of
     * the texture.
     *
     * Note that it may not be an exact match for texture data
     * stored on the GPU or with compression.
     *
     * The format can give an indication about the bit depth and opacity
     * of the texture and is useful to determine the best format for
     * downloading the texture.
     *
     * @return the preferred format for the texture's data
     * @since 4.10
     */
    @GdkVersion4_10
    public open fun getFormat(): MemoryFormat = gdk_texture_get_format(gdkTexturePointer).run {
        MemoryFormat.fromNativeValue(this)
    }

    /**
     * Store the given @texture to the @filename as a PNG file.
     *
     * This is a utility function intended for debugging and testing.
     * If you want more control over formats, proper error handling or
     * want to store to a [iface@Gio.File] or other location, you might want to
     * use [method@Gdk.Texture.save_to_png_bytes] or look into the
     * gdk-pixbuf library.
     *
     * @param filename the filename to store to
     * @return true if saving succeeded, false on failure.
     */
    public open fun saveToPng(filename: String): Boolean =
        gdk_texture_save_to_png(gdkTexturePointer, filename).asBoolean()

    /**
     * Store the given @texture in memory as a PNG file.
     *
     * Use [ctor@Gdk.Texture.new_from_bytes] to read it back.
     *
     * If you want to serialize a texture, this is a convenient and
     * portable way to do that.
     *
     * If you need more control over the generated image, such as
     * attaching metadata, you should look into an image handling
     * library such as the gdk-pixbuf library.
     *
     * If you are dealing with high dynamic range float data, you
     * might also want to consider [method@Gdk.Texture.save_to_tiff_bytes]
     * instead.
     *
     * @return a newly allocated `GBytes` containing PNG data
     * @since 4.6
     */
    @GdkVersion4_6
    public open fun saveToPngBytes(): Bytes = gdk_texture_save_to_png_bytes(gdkTexturePointer)!!.run {
        Bytes(this)
    }

    /**
     * Store the given @texture to the @filename as a TIFF file.
     *
     * GTK will attempt to store data without loss.
     *
     * @param filename the filename to store to
     * @return true if saving succeeded, false on failure.
     * @since 4.6
     */
    @GdkVersion4_6
    public open fun saveToTiff(filename: String): Boolean =
        gdk_texture_save_to_tiff(gdkTexturePointer, filename).asBoolean()

    /**
     * Store the given @texture in memory as a TIFF file.
     *
     * Use [ctor@Gdk.Texture.new_from_bytes] to read it back.
     *
     * This function is intended to store a representation of the
     * texture's data that is as accurate as possible. This is
     * particularly relevant when working with high dynamic range
     * images and floating-point texture data.
     *
     * If that is not your concern and you are interested in a
     * smaller size and a more portable format, you might want to
     * use [method@Gdk.Texture.save_to_png_bytes].
     *
     * @return a newly allocated `GBytes` containing TIFF data
     * @since 4.6
     */
    @GdkVersion4_6
    public open fun saveToTiffBytes(): Bytes = gdk_texture_save_to_tiff_bytes(gdkTexturePointer)!!.run {
        Bytes(this)
    }

    /**
     * The TextureImpl type represents a native instance of the abstract Texture class.
     *
     * @constructor Creates a new instance of Texture for the provided [CPointer].
     */
    public class TextureImpl(pointer: CPointer<GdkTexture>) : Texture(pointer)

    public companion object : TypeCompanion<Texture> {
        override val type: GeneratedClassKGType<Texture> =
            GeneratedClassKGType(getTypeOrNull("gdk_texture_get_type")!!) { TextureImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Creates a new texture by loading an image from a file.
         *
         * The file format is detected automatically. The supported formats
         * are PNG, JPEG and TIFF, though more formats might be available.
         *
         * If null is returned, then @error will be set.
         *
         * This function is threadsafe, so that you can e.g. use GTask
         * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
         * while loading a big image.
         *
         * @param path the filename to load
         * @return A newly-created `GdkTexture`
         * @since 4.6
         */
        public fun newFromFilename(path: String): Result<TextureImpl> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = gdk_texture_new_from_filename(path, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(TextureImpl(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Creates a new texture by loading an image from a resource.
         *
         * The file format is detected automatically. The supported formats
         * are PNG and JPEG, though more formats might be available.
         *
         * It is a fatal error if @resource_path does not specify a valid
         * image resource and the program will abort if that happens.
         * If you are unsure about the validity of a resource, use
         * [ctor@Gdk.Texture.new_from_file] to load it.
         *
         * This function is threadsafe, so that you can e.g. use GTask
         * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
         * while loading a big image.
         *
         * @param resourcePath the path of the resource file
         * @return A newly-created `GdkTexture`
         */
        public fun newFromResource(resourcePath: String): TextureImpl =
            TextureImpl(gdk_texture_new_from_resource(resourcePath)!!.reinterpret())

        /**
         * Get the GType of Texture
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_texture_get_type()
    }
}
