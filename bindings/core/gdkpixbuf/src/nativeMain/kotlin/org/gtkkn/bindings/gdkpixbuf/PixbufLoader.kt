// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdkpixbuf.Gdkpixbuf.resolveException
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdkpixbuf.GdkPixbufLoader
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_close
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_get_animation
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_get_format
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_get_pixbuf
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_get_type
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_new
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_new_with_mime_type
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_new_with_type
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_set_size
import org.gtkkn.native.gdkpixbuf.gdk_pixbuf_loader_write_bytes
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit

/**
 * Incremental image loader.
 *
 * `GdkPixbufLoader` provides a way for applications to drive the
 * process of loading an image, by letting them send the image data
 * directly to the loader instead of having the loader read the data
 * from a file. Applications can use this functionality instead of
 * `gdk_pixbuf_new_from_file()` or `gdk_pixbuf_animation_new_from_file()`
 * when they need to parse image data in small chunks. For example,
 * it should be used when reading an image from a (potentially) slow
 * network connection, or when loading an extremely large file.
 *
 * To use `GdkPixbufLoader` to load an image, create a new instance,
 * and call [method@GdkPixbuf.PixbufLoader.write] to send the data
 * to it. When done, [method@GdkPixbuf.PixbufLoader.close] should be
 * called to end the stream and finalize everything.
 *
 * The loader will emit three important signals throughout the process:
 *
 *  - [signal@GdkPixbuf.PixbufLoader::size-prepared] will be emitted as
 *    soon as the image has enough information to determine the size of
 *    the image to be used. If you want to scale the image while loading
 *    it, you can call [method@GdkPixbuf.PixbufLoader.set_size] in
 *    response to this signal.
 *  - [signal@GdkPixbuf.PixbufLoader::area-prepared] will be emitted as
 *    soon as the pixbuf of the desired has been allocated. You can obtain
 *    the `GdkPixbuf` instance by calling [method@GdkPixbuf.PixbufLoader.get_pixbuf].
 *    If you want to use it, simply acquire a reference to it. You can
 *    also call `gdk_pixbuf_loader_get_pixbuf()` later to get the same
 *    pixbuf.
 *  - [signal@GdkPixbuf.PixbufLoader::area-updated] will be emitted every
 *    time a region is updated. This way you can update a partially
 *    completed image. Note that you do not know anything about the
 *    completeness of an image from the updated area. For example, in an
 *    interlaced image you will need to make several passes before the
 *    image is done loading.
 *
 * ## Loading an animation
 *
 * Loading an animation is almost as easy as loading an image. Once the
 * first [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been
 * emitted, you can call [method@GdkPixbuf.PixbufLoader.get_animation] to
 * get the [class@GdkPixbuf.PixbufAnimation] instance, and then call
 * and [method@GdkPixbuf.PixbufAnimation.get_iter] to get a
 * [class@GdkPixbuf.PixbufAnimationIter] to retrieve the pixbuf for the
 * desired time stamp.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `buf`: Array parameter of type guint8 is not supported
 */
public open class PixbufLoader(
    pointer: CPointer<GdkPixbufLoader>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gdkpixbufPixbufLoaderPointer: CPointer<GdkPixbufLoader>
        get() = gPointer.reinterpret()

    /**
     * Creates a new pixbuf loader object.
     *
     * @return A newly-created pixbuf loader.
     */
    public constructor() : this(gdk_pixbuf_loader_new()!!.reinterpret())

    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * image data as if it were an image of type @image_type, instead of
     * identifying the type automatically.
     *
     * This function is useful if you want an error if the image isn't the
     * expected type; for loading image formats that can't be reliably
     * identified by looking at the data; or if the user manually forces
     * a specific type.
     *
     * The list of supported image formats depends on what image loaders
     * are installed, but typically "png", "jpeg", "gif", "tiff" and
     * "xpm" are among the supported formats. To obtain the full list of
     * supported image formats, call gdk_pixbuf_format_get_name() on each
     * of the #GdkPixbufFormat structs returned by gdk_pixbuf_get_formats().
     *
     * @param imageType name of the image format to be loaded with the image
     * @return A newly-created pixbuf loader.
     */
    @Throws(GlibException::class)
    public constructor(imageType: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_loader_new_with_type(imageType, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Informs a pixbuf loader that no further writes with
     * gdk_pixbuf_loader_write() will occur, so that it can free its
     * internal loading structures.
     *
     * This function also tries to parse any data that hasn't yet been parsed;
     * if the remaining data is partial or corrupt, an error will be returned.
     *
     * If `FALSE` is returned, `error` will be set to an error from the
     * `GDK_PIXBUF_ERROR` or `G_FILE_ERROR` domains.
     *
     * If you're just cancelling a load rather than expecting it to be finished,
     * passing `NULL` for `error` to ignore it is reasonable.
     *
     * Remember that this function does not release a reference on the loader, so
     * you will need to explicitly release any reference you hold.
     *
     * @return `TRUE` if all image data written so far was successfully
     *   passed out via the update_area signal
     */
    public open fun close(): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_loader_close(gdkpixbufPixbufLoaderPointer.reinterpret(), gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Queries the #GdkPixbufAnimation that a pixbuf loader is currently creating.
     *
     * In general it only makes sense to call this function after the
     * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been emitted by
     * the loader.
     *
     * If the loader doesn't have enough bytes yet, and hasn't emitted the `area-prepared`
     * signal, this function will return `NULL`.
     *
     * @return The animation that the loader is
     *   currently loading
     */
    public open fun getAnimation(): PixbufAnimation? =
        gdk_pixbuf_loader_get_animation(gdkpixbufPixbufLoaderPointer.reinterpret())?.run {
            PixbufAnimation(reinterpret())
        }

    /**
     * Obtains the available information about the format of the
     * currently loading image file.
     *
     * @return A #GdkPixbufFormat
     * @since 2.2
     */
    public open fun getFormat(): PixbufFormat? =
        gdk_pixbuf_loader_get_format(gdkpixbufPixbufLoaderPointer.reinterpret())?.run {
            PixbufFormat(reinterpret())
        }

    /**
     * Queries the #GdkPixbuf that a pixbuf loader is currently creating.
     *
     * In general it only makes sense to call this function after the
     * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been
     * emitted by the loader; this means that enough data has been read
     * to know the size of the image that will be allocated.
     *
     * If the loader has not received enough data via gdk_pixbuf_loader_write(),
     * then this function returns `NULL`.
     *
     * The returned pixbuf will be the same in all future calls to the loader,
     * so if you want to keep using it, you should acquire a reference to it.
     *
     * Additionally, if the loader is an animation, it will return the "static
     * image" of the animation (see gdk_pixbuf_animation_get_static_image()).
     *
     * @return The pixbuf that the loader is
     *   creating
     */
    public open fun getPixbuf(): Pixbuf? =
        gdk_pixbuf_loader_get_pixbuf(gdkpixbufPixbufLoaderPointer.reinterpret())?.run {
            Pixbuf(reinterpret())
        }

    /**
     * Causes the image to be scaled while it is loaded.
     *
     * The desired image size can be determined relative to the original
     * size of the image by calling gdk_pixbuf_loader_set_size() from a
     * signal handler for the ::size-prepared signal.
     *
     * Attempts to set the desired image size  are ignored after the
     * emission of the ::size-prepared signal.
     *
     * @param width The desired width of the image being loaded.
     * @param height The desired height of the image being loaded.
     * @since 2.2
     */
    public open fun setSize(
        width: Int,
        height: Int,
    ): Unit = gdk_pixbuf_loader_set_size(gdkpixbufPixbufLoaderPointer.reinterpret(), width, height)

    /**
     * Parses the next contents of the given image buffer.
     *
     * @param buffer The image data as a `GBytes` buffer.
     * @return `TRUE` if the write was successful, or `FALSE` if
     *   the loader cannot parse the buffer
     * @since 2.30
     */
    public open fun writeBytes(buffer: Bytes): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_pixbuf_loader_write_bytes(
                    gdkpixbufPixbufLoaderPointer.reinterpret(),
                    buffer.glibBytesPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * This signal is emitted when the pixbuf loader has allocated the
     * pixbuf in the desired size.
     *
     * After this signal is emitted, applications can call
     * gdk_pixbuf_loader_get_pixbuf() to fetch the partially-loaded
     * pixbuf.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectAreaPrepared(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "area-prepared",
            connectAreaPreparedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when a significant area of the image being
     * loaded has been updated.
     *
     * Normally it means that a complete scanline has been read in, but
     * it could be a different area as well.
     *
     * Applications can use this signal to know when to repaint
     * areas of an image that is being loaded.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` X offset of upper-left corner of the updated area.; `y` Y offset of upper-left corner of the updated area.; `width` Width of updated area.; `height` Height of updated area.
     */
    public fun connectAreaUpdated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Int,
            y: Int,
            width: Int,
            height: Int,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "area-updated",
            connectAreaUpdatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when gdk_pixbuf_loader_close() is called.
     *
     * It can be used by different parts of an application to receive
     * notification when an image loader is closed by the code that
     * drives it.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClosed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "closed",
            connectClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the pixbuf loader has been fed the
     * initial amount of data that is required to figure out the size
     * of the image that it will create.
     *
     * Applications can call gdk_pixbuf_loader_set_size() in response
     * to this signal to set the desired size to which the image
     * should be scaled.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `width` the original width of the image; `height` the original height of the image
     */
    public fun connectSizePrepared(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (width: Int, height: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "size-prepared",
            connectSizePreparedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<PixbufLoader> {
        override val type: GeneratedClassKGType<PixbufLoader> =
            GeneratedClassKGType(gdk_pixbuf_loader_get_type()) { PixbufLoader(it.reinterpret()) }

        init {
            GdkpixbufTypeProvider.register()
        }

        /**
         * Creates a new pixbuf loader object that always attempts to parse
         * image data as if it were an image of type @image_type, instead of
         * identifying the type automatically.
         *
         * This function is useful if you want an error if the image isn't the
         * expected type; for loading image formats that can't be reliably
         * identified by looking at the data; or if the user manually forces
         * a specific type.
         *
         * The list of supported image formats depends on what image loaders
         * are installed, but typically "png", "jpeg", "gif", "tiff" and
         * "xpm" are among the supported formats. To obtain the full list of
         * supported image formats, call gdk_pixbuf_format_get_name() on each
         * of the #GdkPixbufFormat structs returned by gdk_pixbuf_get_formats().
         *
         * @param imageType name of the image format to be loaded with the image
         * @return A newly-created pixbuf loader.
         */
        public fun newWithType(imageType: String): Result<PixbufLoader> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = gdk_pixbuf_loader_new_with_type(imageType, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(PixbufLoader(checkNotNull(gResult).reinterpret()))
                }
            }

        /**
         * Creates a new pixbuf loader object that always attempts to parse
         * image data as if it were an image of MIME type @mime_type, instead of
         * identifying the type automatically.
         *
         * This function is useful if you want an error if the image isn't the
         * expected MIME type; for loading image formats that can't be reliably
         * identified by looking at the data; or if the user manually forces a
         * specific MIME type.
         *
         * The list of supported mime types depends on what image loaders
         * are installed, but typically "image/png", "image/jpeg", "image/gif",
         * "image/tiff" and "image/x-xpixmap" are among the supported mime types.
         * To obtain the full list of supported mime types, call
         * gdk_pixbuf_format_get_mime_types() on each of the #GdkPixbufFormat
         * structs returned by gdk_pixbuf_get_formats().
         *
         * @param mimeType the mime type to be loaded
         * @return A newly-created pixbuf loader.
         * @since 2.4
         */
        public fun newWithMimeType(mimeType: String): Result<PixbufLoader> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = gdk_pixbuf_loader_new_with_mime_type(mimeType, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(PixbufLoader(checkNotNull(gResult).reinterpret()))
                }
            }
    }
}

private val connectAreaPreparedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectAreaUpdatedFunc: CPointer<
    CFunction<
        (
            Int,
            Int,
            Int,
            Int,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            x: Int,
            y: Int,
            width: Int,
            height: Int,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    x: Int,
                    y: Int,
                    width: Int,
                    height: Int,
                ) -> Unit
            >()
            .get()
            .invoke(x, y, width, height)
    }.reinterpret()

private val connectClosedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectSizePreparedFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            width: Int,
            height: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(width: Int, height: Int) -> Unit>().get().invoke(width, height)
    }.reinterpret()
