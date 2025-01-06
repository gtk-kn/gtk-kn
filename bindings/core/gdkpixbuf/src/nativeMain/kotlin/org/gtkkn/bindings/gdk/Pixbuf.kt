// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gdk.GdkPixbuf.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_12
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_2
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_24
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_26
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_32
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_36
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_36_8
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_4
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_40
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_6
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.LoadableIcon
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbuf
import org.gtkkn.native.gdk.gdk_pixbuf_add_alpha
import org.gtkkn.native.gdk.gdk_pixbuf_apply_embedded_orientation
import org.gtkkn.native.gdk.gdk_pixbuf_calculate_rowstride
import org.gtkkn.native.gdk.gdk_pixbuf_composite
import org.gtkkn.native.gdk.gdk_pixbuf_composite_color
import org.gtkkn.native.gdk.gdk_pixbuf_composite_color_simple
import org.gtkkn.native.gdk.gdk_pixbuf_copy
import org.gtkkn.native.gdk.gdk_pixbuf_copy_area
import org.gtkkn.native.gdk.gdk_pixbuf_copy_options
import org.gtkkn.native.gdk.gdk_pixbuf_fill
import org.gtkkn.native.gdk.gdk_pixbuf_flip
import org.gtkkn.native.gdk.gdk_pixbuf_get_bits_per_sample
import org.gtkkn.native.gdk.gdk_pixbuf_get_byte_length
import org.gtkkn.native.gdk.gdk_pixbuf_get_colorspace
import org.gtkkn.native.gdk.gdk_pixbuf_get_file_info_async
import org.gtkkn.native.gdk.gdk_pixbuf_get_formats
import org.gtkkn.native.gdk.gdk_pixbuf_get_has_alpha
import org.gtkkn.native.gdk.gdk_pixbuf_get_height
import org.gtkkn.native.gdk.gdk_pixbuf_get_n_channels
import org.gtkkn.native.gdk.gdk_pixbuf_get_option
import org.gtkkn.native.gdk.gdk_pixbuf_get_options
import org.gtkkn.native.gdk.gdk_pixbuf_get_rowstride
import org.gtkkn.native.gdk.gdk_pixbuf_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_get_width
import org.gtkkn.native.gdk.gdk_pixbuf_init_modules
import org.gtkkn.native.gdk.gdk_pixbuf_new
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_bytes
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_file
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_file_at_scale
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_file_at_size
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_resource
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_resource_at_scale
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_stream
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_stream_async
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_stream_at_scale
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_stream_at_scale_async
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_stream_finish
import org.gtkkn.native.gdk.gdk_pixbuf_new_from_xpm_data
import org.gtkkn.native.gdk.gdk_pixbuf_new_subpixbuf
import org.gtkkn.native.gdk.gdk_pixbuf_read_pixel_bytes
import org.gtkkn.native.gdk.gdk_pixbuf_ref
import org.gtkkn.native.gdk.gdk_pixbuf_remove_option
import org.gtkkn.native.gdk.gdk_pixbuf_rotate_simple
import org.gtkkn.native.gdk.gdk_pixbuf_saturate_and_pixelate
import org.gtkkn.native.gdk.gdk_pixbuf_save_to_callbackv
import org.gtkkn.native.gdk.gdk_pixbuf_save_to_stream_finish
import org.gtkkn.native.gdk.gdk_pixbuf_save_to_streamv
import org.gtkkn.native.gdk.gdk_pixbuf_save_to_streamv_async
import org.gtkkn.native.gdk.gdk_pixbuf_savev
import org.gtkkn.native.gdk.gdk_pixbuf_scale
import org.gtkkn.native.gdk.gdk_pixbuf_scale_simple
import org.gtkkn.native.gdk.gdk_pixbuf_set_option
import org.gtkkn.native.gdk.gdk_pixbuf_unref
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlin.collections.List

/**
 * A pixel buffer.
 *
 * `GdkPixbuf` contains information about an image's pixel data,
 * its color space, bits per sample, width and height, and the
 * rowstride (the number of bytes between the start of one row
 * and the start of the next).
 *
 * ## Creating new `GdkPixbuf`
 *
 * The most basic way to create a pixbuf is to wrap an existing pixel
 * buffer with a [class@GdkPixbuf.Pixbuf] instance. You can use the
 * [`ctor@GdkPixbuf.Pixbuf.new_from_data`] function to do this.
 *
 * Every time you create a new `GdkPixbuf` instance for some data, you
 * will need to specify the destroy notification function that will be
 * called when the data buffer needs to be freed; this will happen when
 * a `GdkPixbuf` is finalized by the reference counting functions. If
 * you have a chunk of static data compiled into your application, you
 * can pass in `NULL` as the destroy notification function so that the
 * data will not be freed.
 *
 * The [`ctor@GdkPixbuf.Pixbuf.new`] constructor function can be used
 * as a convenience to create a pixbuf with an empty buffer; this is
 * equivalent to allocating a data buffer using `malloc()` and then
 * wrapping it with `gdk_pixbuf_new_from_data()`. The `gdk_pixbuf_new()`
 * function will compute an optimal rowstride so that rendering can be
 * performed with an efficient algorithm.
 *
 * As a special case, you can use the [`ctor@GdkPixbuf.Pixbuf.new_from_xpm_data`]
 * function to create a pixbuf from inline XPM image data.
 *
 * You can also copy an existing pixbuf with the [method@Pixbuf.copy]
 * function. This is not the same as just acquiring a reference to
 * the old pixbuf instance: the copy function will actually duplicate
 * the pixel data in memory and create a new [class@Pixbuf] instance
 * for it.
 *
 * ## Reference counting
 *
 * `GdkPixbuf` structures are reference counted. This means that an
 * application can share a single pixbuf among many parts of the
 * code. When a piece of the program needs to use a pixbuf, it should
 * acquire a reference to it by calling `g_object_ref()`; when it no
 * longer needs the pixbuf, it should release the reference it acquired
 * by calling `g_object_unref()`. The resources associated with a
 * `GdkPixbuf` will be freed when its reference count drops to zero.
 * Newly-created `GdkPixbuf` instances start with a reference count
 * of one.
 *
 * ## Image Data
 *
 * Image data in a pixbuf is stored in memory in an uncompressed,
 * packed format. Rows in the image are stored top to bottom, and
 * in each row pixels are stored from left to right.
 *
 * There may be padding at the end of a row.
 *
 * The "rowstride" value of a pixbuf, as returned by [`method@GdkPixbuf.Pixbuf.get_rowstride`],
 * indicates the number of bytes between rows.
 *
 * **NOTE**: If you are copying raw pixbuf data with `memcpy()` note that the
 * last row in the pixbuf may not be as wide as the full rowstride, but rather
 * just as wide as the pixel data needs to be; that is: it is unsafe to do
 * `memcpy (dest, pixels, rowstride * height)` to copy a whole pixbuf. Use
 * [method@GdkPixbuf.Pixbuf.copy] instead, or compute the width in bytes of the
 * last row as:
 *
 * ```c
 * last_row = width * ((n_channels * bits_per_sample + 7) / 8);
 * ```
 *
 * The same rule applies when iterating over each row of a `GdkPixbuf` pixels
 * array.
 *
 * The following code illustrates a simple `put_pixel()`
 * function for RGB pixbufs with 8 bits per channel with an alpha
 * channel.
 *
 * ```c
 * static void
 * put_pixel (GdkPixbuf *pixbuf,
 *            int x,
 * 	   int y,
 * 	   guchar red,
 * 	   guchar green,
 * 	   guchar blue,
 * 	   guchar alpha)
 * {
 *   int n_channels = gdk_pixbuf_get_n_channels (pixbuf);
 *
 *   // Ensure that the pixbuf is valid
 *   g_assert (gdk_pixbuf_get_colorspace (pixbuf) == GDK_COLORSPACE_RGB);
 *   g_assert (gdk_pixbuf_get_bits_per_sample (pixbuf) == 8);
 *   g_assert (gdk_pixbuf_get_has_alpha (pixbuf));
 *   g_assert (n_channels == 4);
 *
 *   int width = gdk_pixbuf_get_width (pixbuf);
 *   int height = gdk_pixbuf_get_height (pixbuf);
 *
 *   // Ensure that the coordinates are in a valid range
 *   g_assert (x >= 0 && x < width);
 *   g_assert (y >= 0 && y < height);
 *
 *   int rowstride = gdk_pixbuf_get_rowstride (pixbuf);
 *
 *   // The pixel buffer in the GdkPixbuf instance
 *   guchar *pixels = gdk_pixbuf_get_pixels (pixbuf);
 *
 *   // The pixel we wish to modify
 *   guchar *p = pixels + y * rowstride + x * n_channels;
 *   p[0] = red;
 *   p[1] = green;
 *   p[2] = blue;
 *   p[3] = alpha;
 * }
 * ```
 *
 * ## Loading images
 *
 * The `GdkPixBuf` class provides a simple mechanism for loading
 * an image from a file in synchronous and asynchronous fashion.
 *
 * For GUI applications, it is recommended to use the asynchronous
 * stream API to avoid blocking the control flow of the application.
 *
 * Additionally, `GdkPixbuf` provides the [class@GdkPixbuf.PixbufLoader`]
 * API for progressive image loading.
 *
 * ## Saving images
 *
 * The `GdkPixbuf` class provides methods for saving image data in
 * a number of file formats. The formatted data can be written to a
 * file or to a memory buffer. `GdkPixbuf` can also call a user-defined
 * callback on the data, which allows to e.g. write the image
 * to a socket or store it in a database.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - method `read_pixels`: Return type guint8 is unsupported
 * - method `save`: Varargs parameter is not supported
 * - method `save_to_buffer`: Varargs parameter is not supported
 * - parameter `buffer`: buffer: Out parameter is not supported
 * - method `save_to_callback`: Varargs parameter is not supported
 * - method `save_to_stream`: Varargs parameter is not supported
 * - method `save_to_stream_async`: Varargs parameter is not supported
 * - method `pixel-bytes`: Property has no getter nor setter
 * - method `pixels`: Property has no getter nor setter
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 */
public open class Pixbuf(pointer: CPointer<GdkPixbuf>) :
    Object(pointer.reinterpret()),
    Icon,
    LoadableIcon,
    KGTyped {
    public val gdkPixbufPointer: CPointer<GdkPixbuf>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = gPointer.reinterpret()

    /**
     * The number of bits per sample.
     *
     * Currently only 8 bit per sample are supported.
     */
    public open val bitsPerSample: gint
        /**
         * Queries the number of bits per color sample in a pixbuf.
         *
         * @return Number of bits per color sample.
         */
        get() = gdk_pixbuf_get_bits_per_sample(gdkPixbufPointer.reinterpret())

    /**
     * The color space of the pixbuf.
     *
     * Currently, only `GDK_COLORSPACE_RGB` is supported.
     */
    public open val colorspace: Colorspace
        /**
         * Queries the color space of a pixbuf.
         *
         * @return Color space.
         */
        get() = gdk_pixbuf_get_colorspace(gdkPixbufPointer.reinterpret()).run {
            Colorspace.fromNativeValue(this)
        }

    /**
     * Whether the pixbuf has an alpha channel.
     */
    public open val hasAlpha: Boolean
        /**
         * Queries whether a pixbuf has an alpha channel (opacity information).
         *
         * @return `TRUE` if it has an alpha channel, `FALSE` otherwise.
         */
        get() = gdk_pixbuf_get_has_alpha(gdkPixbufPointer.reinterpret()).asBoolean()

    /**
     * The number of rows of the pixbuf.
     */
    public open val height: gint
        /**
         * Queries the height of a pixbuf.
         *
         * @return Height in pixels.
         */
        get() = gdk_pixbuf_get_height(gdkPixbufPointer.reinterpret())

    /**
     * The number of samples per pixel.
     *
     * Currently, only 3 or 4 samples per pixel are supported.
     */
    public open val nChannels: gint
        /**
         * Queries the number of channels of a pixbuf.
         *
         * @return Number of channels.
         */
        get() = gdk_pixbuf_get_n_channels(gdkPixbufPointer.reinterpret())

    /**
     * The number of bytes between the start of a row and
     * the start of the next row.
     *
     * This number must (obviously) be at least as large as the
     * width of the pixbuf.
     */
    public open val rowstride: gint
        /**
         * Queries the rowstride of a pixbuf, which is the number of bytes between
         * the start of a row and the start of the next row.
         *
         * @return Distance between row starts.
         */
        get() = gdk_pixbuf_get_rowstride(gdkPixbufPointer.reinterpret())

    /**
     * The number of columns of the pixbuf.
     */
    public open val width: gint
        /**
         * Queries the width of a pixbuf.
         *
         * @return Width in pixels.
         */
        get() = gdk_pixbuf_get_width(gdkPixbufPointer.reinterpret())

    /**
     * Creates a new `GdkPixbuf` structure and allocates a buffer for it.
     *
     * If the allocation of the buffer failed, this function will return `NULL`.
     *
     * The buffer has an optimal rowstride. Note that the buffer is not cleared;
     * you will have to fill it completely yourself.
     *
     * @param colorspace Color space for image
     * @param hasAlpha Whether the image should have transparency information
     * @param bitsPerSample Number of bits per color sample
     * @param width Width of image in pixels, must be > 0
     * @param height Height of image in pixels, must be > 0
     * @return A newly-created pixel buffer
     */
    public constructor(
        colorspace: Colorspace,
        hasAlpha: Boolean,
        bitsPerSample: gint,
        width: gint,
        height: gint,
    ) : this(
        gdk_pixbuf_new(colorspace.nativeValue, hasAlpha.asGBoolean(), bitsPerSample, width, height)!!.reinterpret()
    )

    /**
     * Creates a new #GdkPixbuf out of in-memory readonly image data.
     *
     * Currently only RGB images with 8 bits per sample are supported.
     *
     * This is the `GBytes` variant of gdk_pixbuf_new_from_data(), useful
     * for language bindings.
     *
     * @param data Image data in 8-bit/sample packed format inside a #GBytes
     * @param colorspace Colorspace for the image data
     * @param hasAlpha Whether the data has an opacity channel
     * @param bitsPerSample Number of bits per sample
     * @param width Width of the image in pixels, must be > 0
     * @param height Height of the image in pixels, must be > 0
     * @param rowstride Distance in bytes between row starts
     * @return A newly-created pixbuf
     * @since 2.32
     */
    public constructor(
        `data`: Bytes,
        colorspace: Colorspace,
        hasAlpha: Boolean,
        bitsPerSample: gint,
        width: gint,
        height: gint,
        rowstride: gint,
    ) : this(
        gdk_pixbuf_new_from_bytes(
            `data`.gPointer.reinterpret(),
            colorspace.nativeValue,
            hasAlpha.asGBoolean(),
            bitsPerSample,
            width,
            height,
            rowstride
        )!!.reinterpret()
    )

    /**
     * Creates a new pixbuf by loading an image from a file.
     *
     * The file format is detected automatically.
     *
     * If `NULL` is returned, then @error will be set. Possible errors are:
     *
     *  - the file could not be opened
     *  - there is no loader for the file's format
     *  - there is not enough memory to allocate the image buffer
     *  - the image buffer contains invalid data
     *
     * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     *
     * @param filename Name of file to load, in the GLib file
     *   name encoding
     * @return A newly-created pixbuf
     */
    @Throws(GLibException::class)
    public constructor(filename: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_new_from_file(filename, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new pixbuf by loading an image from a file.
     *
     * The file format is detected automatically.
     *
     * If `NULL` is returned, then @error will be set. Possible errors are:
     *
     *  - the file could not be opened
     *  - there is no loader for the file's format
     *  - there is not enough memory to allocate the image buffer
     *  - the image buffer contains invalid data
     *
     * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     *
     * The image will be scaled to fit in the requested size, optionally preserving
     * the image's aspect ratio.
     *
     * When preserving the aspect ratio, a `width` of -1 will cause the image
     * to be scaled to the exact given height, and a `height` of -1 will cause
     * the image to be scaled to the exact given width. When not preserving
     * aspect ratio, a `width` or `height` of -1 means to not scale the image
     * at all in that dimension. Negative values for `width` and `height` are
     * allowed since 2.8.
     *
     * @param filename Name of file to load, in the GLib file
     *     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserveAspectRatio `TRUE` to preserve the image's aspect ratio
     * @return A newly-created pixbuf
     * @since 2.6
     */
    @Throws(GLibException::class)
    public constructor(
        filename: String,
        width: gint,
        height: gint,
        preserveAspectRatio: Boolean,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_pixbuf_new_from_file_at_scale(filename, width, height, preserveAspectRatio.asGBoolean(), gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new pixbuf by loading an image from a file.
     *
     * The file format is detected automatically.
     *
     * If `NULL` is returned, then @error will be set. Possible errors are:
     *
     *  - the file could not be opened
     *  - there is no loader for the file's format
     *  - there is not enough memory to allocate the image buffer
     *  - the image buffer contains invalid data
     *
     * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     *
     * The image will be scaled to fit in the requested size, preserving
     * the image's aspect ratio. Note that the returned pixbuf may be smaller
     * than `width` x `height`, if the aspect ratio requires it. To load
     * and image at the requested size, regardless of aspect ratio, use
     * [ctor@GdkPixbuf.Pixbuf.new_from_file_at_scale].
     *
     * @param filename Name of file to load, in the GLib file
     *     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @return A newly-created pixbuf
     * @since 2.4
     */
    @Throws(GLibException::class)
    public constructor(
        filename: String,
        width: gint,
        height: gint,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_new_from_file_at_size(filename, width, height, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new pixbuf by loading an image from an input stream.
     *
     * The file format is detected automatically.
     *
     * If `NULL` is returned, then `error` will be set.
     *
     * The `cancellable` can be used to abort the operation from another thread.
     * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
     * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
     * `G_IO_ERROR` domains.
     *
     * The stream is not closed.
     *
     * @param stream a `GInputStream` to load the pixbuf from
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return A newly-created pixbuf
     * @since 2.14
     */
    @Throws(GLibException::class)
    public constructor(stream: InputStream, cancellable: Cancellable? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_pixbuf_new_from_stream(
                    stream.gioInputStreamPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new pixbuf by loading an image from an input stream.
     *
     * The file format is detected automatically. If `NULL` is returned, then
     * @error will be set. The @cancellable can be used to abort the operation
     * from another thread. If the operation was cancelled, the error
     * `G_IO_ERROR_CANCELLED` will be returned. Other possible errors are in
     * the `GDK_PIXBUF_ERROR` and `G_IO_ERROR` domains.
     *
     * The image will be scaled to fit in the requested size, optionally
     * preserving the image's aspect ratio.
     *
     * When preserving the aspect ratio, a `width` of -1 will cause the image to be
     * scaled to the exact given height, and a `height` of -1 will cause the image
     * to be scaled to the exact given width. If both `width` and `height` are
     * given, this function will behave as if the smaller of the two values
     * is passed as -1.
     *
     * When not preserving aspect ratio, a `width` or `height` of -1 means to not
     * scale the image at all in that dimension.
     *
     * The stream is not closed.
     *
     * @param stream a `GInputStream` to load the pixbuf from
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserveAspectRatio `TRUE` to preserve the image's aspect ratio
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return A newly-created pixbuf
     * @since 2.14
     */
    @Throws(GLibException::class)
    public constructor(
        stream: InputStream,
        width: gint,
        height: gint,
        preserveAspectRatio: Boolean,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_pixbuf_new_from_stream_at_scale(
                    stream.gioInputStreamPointer.reinterpret(),
                    width,
                    height,
                    preserveAspectRatio.asGBoolean(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Finishes an asynchronous pixbuf creation operation started with
     * gdk_pixbuf_new_from_stream_async().
     *
     * @param asyncResult a `GAsyncResult`
     * @return the newly created pixbuf
     * @since 2.24
     */
    @Throws(GLibException::class)
    public constructor(asyncResult: AsyncResult) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_new_from_stream_finish(asyncResult.gioAsyncResultPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new pixbuf by parsing XPM data in memory.
     *
     * This data is commonly the result of including an XPM file into a
     * program's C source.
     *
     * @param data Pointer to inline XPM data.
     * @return A newly-created pixbuf
     */
    public constructor(`data`: List<String>) : this(
        memScoped {
            gdk_pixbuf_new_from_xpm_data(`data`.toCStringList(this))!!.reinterpret()
        }
    )

    /**
     * Takes an existing pixbuf and adds an alpha channel to it.
     *
     * If the existing pixbuf already had an alpha channel, the channel
     * values are copied from the original; otherwise, the alpha channel
     * is initialized to 255 (full opacity).
     *
     * If `substitute_color` is `TRUE`, then the color specified by the
     * (`r`, `g`, `b`) arguments will be assigned zero opacity. That is,
     * if you pass `(255, 255, 255)` for the substitute color, all white
     * pixels will become fully transparent.
     *
     * If `substitute_color` is `FALSE`, then the (`r`, `g`, `b`) arguments
     * will be ignored.
     *
     * @param substituteColor Whether to set a color to zero opacity.
     * @param r Red value to substitute.
     * @param g Green value to substitute.
     * @param b Blue value to substitute.
     * @return A newly-created pixbuf
     */
    public open fun addAlpha(substituteColor: Boolean, r: guint8, g: guint8, b: guint8): Pixbuf =
        gdk_pixbuf_add_alpha(gdkPixbufPointer.reinterpret(), substituteColor.asGBoolean(), r, g, b)!!.run {
            Pixbuf(reinterpret())
        }

    /**
     * Takes an existing pixbuf and checks for the presence of an
     * associated "orientation" option.
     *
     * The orientation option may be provided by the JPEG loader (which
     * reads the exif orientation tag) or the TIFF loader (which reads
     * the TIFF orientation tag, and compensates it for the partial
     * transforms performed by libtiff).
     *
     * If an orientation option/tag is present, the appropriate transform
     * will be performed so that the pixbuf is oriented correctly.
     *
     * @return A newly-created pixbuf
     * @since 2.12
     */
    @GdkPixbufVersion2_12
    public open fun applyEmbeddedOrientation(): Pixbuf? =
        gdk_pixbuf_apply_embedded_orientation(gdkPixbufPointer.reinterpret())?.run {
            Pixbuf(reinterpret())
        }

    /**
     * Creates a transformation of the source image @src by scaling by
     * @scale_x and @scale_y then translating by @offset_x and @offset_y.
     *
     * This gives an image in the coordinates of the destination pixbuf.
     * The rectangle (@dest_x, @dest_y, @dest_width, @dest_height)
     * is then alpha blended onto the corresponding rectangle of the
     * original destination image.
     *
     * When the destination rectangle contains parts not in the source
     * image, the data at the edges of the source image is replicated
     * to infinity.
     *
     * ![](composite.png)
     *
     * @param dest the #GdkPixbuf into which to render the results
     * @param destX the left coordinate for region to render
     * @param destY the top coordinate for region to render
     * @param destWidth the width of the region to render
     * @param destHeight the height of the region to render
     * @param offsetX the offset in the X direction (currently rounded to an integer)
     * @param offsetY the offset in the Y direction (currently rounded to an integer)
     * @param scaleX the scale factor in the X direction
     * @param scaleY the scale factor in the Y direction
     * @param interpType the interpolation type for the transformation.
     * @param overallAlpha overall alpha for source image (0..255)
     */
    public open fun composite(
        dest: Pixbuf,
        destX: gint,
        destY: gint,
        destWidth: gint,
        destHeight: gint,
        offsetX: gdouble,
        offsetY: gdouble,
        scaleX: gdouble,
        scaleY: gdouble,
        interpType: InterpType,
        overallAlpha: gint,
    ): Unit =
        gdk_pixbuf_composite(gdkPixbufPointer.reinterpret(), dest.gdkPixbufPointer.reinterpret(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.nativeValue, overallAlpha)

    /**
     * Creates a transformation of the source image @src by scaling by
     * @scale_x and @scale_y then translating by @offset_x and @offset_y,
     * then alpha blends the rectangle (@dest_x ,@dest_y, @dest_width,
     * @dest_height) of the resulting image with a checkboard of the
     * colors @color1 and @color2 and renders it onto the destination
     * image.
     *
     * If the source image has no alpha channel, and @overall_alpha is 255, a fast
     * path is used which omits the alpha blending and just performs the scaling.
     *
     * See gdk_pixbuf_composite_color_simple() for a simpler variant of this
     * function suitable for many tasks.
     *
     * @param dest the #GdkPixbuf into which to render the results
     * @param destX the left coordinate for region to render
     * @param destY the top coordinate for region to render
     * @param destWidth the width of the region to render
     * @param destHeight the height of the region to render
     * @param offsetX the offset in the X direction (currently rounded to an integer)
     * @param offsetY the offset in the Y direction (currently rounded to an integer)
     * @param scaleX the scale factor in the X direction
     * @param scaleY the scale factor in the Y direction
     * @param interpType the interpolation type for the transformation.
     * @param overallAlpha overall alpha for source image (0..255)
     * @param checkX the X offset for the checkboard (origin of checkboard is at -@check_x, -@check_y)
     * @param checkY the Y offset for the checkboard
     * @param checkSize the size of checks in the checkboard (must be a power of two)
     * @param color1 the color of check at upper left
     * @param color2 the color of the other check
     */
    public open fun compositeColor(
        dest: Pixbuf,
        destX: gint,
        destY: gint,
        destWidth: gint,
        destHeight: gint,
        offsetX: gdouble,
        offsetY: gdouble,
        scaleX: gdouble,
        scaleY: gdouble,
        interpType: InterpType,
        overallAlpha: gint,
        checkX: gint,
        checkY: gint,
        checkSize: gint,
        color1: guint,
        color2: guint,
    ): Unit =
        gdk_pixbuf_composite_color(gdkPixbufPointer.reinterpret(), dest.gdkPixbufPointer.reinterpret(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.nativeValue, overallAlpha, checkX, checkY, checkSize, color1, color2)

    /**
     * Creates a new pixbuf by scaling `src` to `dest_width` x `dest_height`
     * and alpha blending the result with a checkboard of colors `color1`
     * and `color2`.
     *
     * @param destWidth the width of destination image
     * @param destHeight the height of destination image
     * @param interpType the interpolation type for the transformation.
     * @param overallAlpha overall alpha for source image (0..255)
     * @param checkSize the size of checks in the checkboard (must be a power of two)
     * @param color1 the color of check at upper left
     * @param color2 the color of the other check
     * @return the new pixbuf
     */
    public open fun compositeColorSimple(
        destWidth: gint,
        destHeight: gint,
        interpType: InterpType,
        overallAlpha: gint,
        checkSize: gint,
        color1: guint,
        color2: guint,
    ): Pixbuf? = gdk_pixbuf_composite_color_simple(
        gdkPixbufPointer.reinterpret(),
        destWidth,
        destHeight,
        interpType.nativeValue,
        overallAlpha,
        checkSize,
        color1,
        color2
    )?.run {
        Pixbuf(reinterpret())
    }

    /**
     * Creates a new `GdkPixbuf` with a copy of the information in the specified
     * `pixbuf`.
     *
     * Note that this does not copy the options set on the original `GdkPixbuf`,
     * use gdk_pixbuf_copy_options() for this.
     *
     * @return A newly-created pixbuf
     */
    public open fun copy(): Pixbuf? = gdk_pixbuf_copy(gdkPixbufPointer.reinterpret())?.run {
        Pixbuf(reinterpret())
    }

    /**
     * Copies a rectangular area from `src_pixbuf` to `dest_pixbuf`.
     *
     * Conversion of pixbuf formats is done automatically.
     *
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the copy operation.
     * Therefore, you can not use this function to scroll a pixbuf.
     *
     * @param srcX Source X coordinate within @src_pixbuf.
     * @param srcY Source Y coordinate within @src_pixbuf.
     * @param width Width of the area to copy.
     * @param height Height of the area to copy.
     * @param destPixbuf Destination pixbuf.
     * @param destX X coordinate within @dest_pixbuf.
     * @param destY Y coordinate within @dest_pixbuf.
     */
    public open fun copyArea(
        srcX: gint,
        srcY: gint,
        width: gint,
        height: gint,
        destPixbuf: Pixbuf,
        destX: gint,
        destY: gint,
    ): Unit = gdk_pixbuf_copy_area(
        gdkPixbufPointer.reinterpret(),
        srcX,
        srcY,
        width,
        height,
        destPixbuf.gdkPixbufPointer.reinterpret(),
        destX,
        destY
    )

    /**
     * Copies the key/value pair options attached to a `GdkPixbuf` to another
     * `GdkPixbuf`.
     *
     * This is useful to keep original metadata after having manipulated
     * a file. However be careful to remove metadata which you've already
     * applied, such as the "orientation" option after rotating the image.
     *
     * @param destPixbuf the destination pixbuf
     * @return `TRUE` on success.
     * @since 2.36
     */
    @GdkPixbufVersion2_36
    public open fun copyOptions(destPixbuf: Pixbuf): Boolean =
        gdk_pixbuf_copy_options(gdkPixbufPointer.reinterpret(), destPixbuf.gdkPixbufPointer.reinterpret()).asBoolean()

    /**
     * Clears a pixbuf to the given RGBA value, converting the RGBA value into
     * the pixbuf's pixel format.
     *
     * The alpha component will be ignored if the pixbuf doesn't have an alpha
     * channel.
     *
     * @param pixel RGBA pixel to used to clear (`0xffffffff` is opaque white,
     *   `0x00000000` transparent black)
     */
    public open fun fill(pixel: guint): Unit = gdk_pixbuf_fill(gdkPixbufPointer.reinterpret(), pixel)

    /**
     * Flips a pixbuf horizontally or vertically and returns the
     * result in a new pixbuf.
     *
     * @param horizontal `TRUE` to flip horizontally, `FALSE` to flip vertically
     * @return the new pixbuf
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public open fun flip(horizontal: Boolean): Pixbuf? =
        gdk_pixbuf_flip(gdkPixbufPointer.reinterpret(), horizontal.asGBoolean())?.run {
            Pixbuf(reinterpret())
        }

    /**
     * Returns the length of the pixel data, in bytes.
     *
     * @return The length of the pixel data.
     * @since 2.26
     */
    @GdkPixbufVersion2_26
    public open fun getByteLength(): gsize = gdk_pixbuf_get_byte_length(gdkPixbufPointer.reinterpret())

    /**
     * Looks up @key in the list of options that may have been attached to the
     * @pixbuf when it was loaded, or that may have been attached by another
     * function using gdk_pixbuf_set_option().
     *
     * For instance, the ANI loader provides "Title" and "Artist" options.
     * The ICO, XBM, and XPM loaders provide "x_hot" and "y_hot" hot-spot
     * options for cursor definitions. The PNG loader provides the tEXt ancillary
     * chunk key/value pairs as options. Since 2.12, the TIFF and JPEG loaders
     * return an "orientation" option string that corresponds to the embedded
     * TIFF/Exif orientation tag (if present). Since 2.32, the TIFF loader sets
     * the "multipage" option string to "yes" when a multi-page TIFF is loaded.
     * Since 2.32 the JPEG and PNG loaders set "x-dpi" and "y-dpi" if the file
     * contains image density information in dots per inch.
     * Since 2.36.6, the JPEG loader sets the "comment" option with the comment
     * EXIF tag.
     *
     * @param key a nul-terminated string.
     * @return the value associated with `key`
     */
    public open fun getOption(key: String): String? =
        gdk_pixbuf_get_option(gdkPixbufPointer.reinterpret(), key)?.toKString()

    /**
     * Returns a `GHashTable` with a list of all the options that may have been
     * attached to the `pixbuf` when it was loaded, or that may have been
     * attached by another function using [method@GdkPixbuf.Pixbuf.set_option].
     *
     * @return a #GHashTable
     *   of key/values pairs
     * @since 2.32
     */
    @GdkPixbufVersion2_32
    public open fun getOptions(): HashTable = gdk_pixbuf_get_options(gdkPixbufPointer.reinterpret())!!.run {
        HashTable(reinterpret())
    }

    /**
     * Creates a new pixbuf which represents a sub-region of `src_pixbuf`.
     *
     * The new pixbuf shares its pixels with the original pixbuf, so
     * writing to one affects both.  The new pixbuf holds a reference to
     * `src_pixbuf`, so `src_pixbuf` will not be finalized until the new
     * pixbuf is finalized.
     *
     * Note that if `src_pixbuf` is read-only, this function will force it
     * to be mutable.
     *
     * @param srcX X coord in @src_pixbuf
     * @param srcY Y coord in @src_pixbuf
     * @param width width of region in @src_pixbuf
     * @param height height of region in @src_pixbuf
     * @return a new pixbuf
     */
    public open fun newSubpixbuf(srcX: gint, srcY: gint, width: gint, height: gint): Pixbuf =
        gdk_pixbuf_new_subpixbuf(gdkPixbufPointer.reinterpret(), srcX, srcY, width, height)!!.run {
            Pixbuf(reinterpret())
        }

    /**
     * Provides a #GBytes buffer containing the raw pixel data; the data
     * must not be modified.
     *
     * This function allows skipping the implicit copy that must be made
     * if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     *
     * @return A new reference to a read-only copy of
     *   the pixel data.  Note that for mutable pixbufs, this function will
     *   incur a one-time copy of the pixel data for conversion into the
     *   returned #GBytes.
     * @since 2.32
     */
    @GdkPixbufVersion2_32
    public open fun readPixelBytes(): Bytes = gdk_pixbuf_read_pixel_bytes(gdkPixbufPointer.reinterpret())!!.run {
        Bytes(reinterpret())
    }

    /**
     * Adds a reference to a pixbuf.
     *
     * @return The same as the @pixbuf argument.
     */
    override fun ref(): Pixbuf = gdk_pixbuf_ref(gdkPixbufPointer.reinterpret())!!.run {
        Pixbuf(reinterpret())
    }

    /**
     * Removes the key/value pair option attached to a `GdkPixbuf`.
     *
     * @param key a nul-terminated string representing the key to remove.
     * @return `TRUE` if an option was removed, `FALSE` if not.
     * @since 2.36
     */
    @GdkPixbufVersion2_36
    public open fun removeOption(key: String): Boolean =
        gdk_pixbuf_remove_option(gdkPixbufPointer.reinterpret(), key).asBoolean()

    /**
     * Rotates a pixbuf by a multiple of 90 degrees, and returns the
     * result in a new pixbuf.
     *
     * If `angle` is 0, this function will return a copy of `src`.
     *
     * @param angle the angle to rotate by
     * @return the new pixbuf
     * @since 2.6
     */
    @GdkPixbufVersion2_6
    public open fun rotateSimple(angle: PixbufRotation): Pixbuf? =
        gdk_pixbuf_rotate_simple(gdkPixbufPointer.reinterpret(), angle.nativeValue)?.run {
            Pixbuf(reinterpret())
        }

    /**
     * Modifies saturation and optionally pixelates `src`, placing the result in
     * `dest`.
     *
     * The `src` and `dest` pixbufs must have the same image format, size, and
     * rowstride.
     *
     * The `src` and `dest` arguments may be the same pixbuf with no ill effects.
     *
     * If `saturation` is 1.0 then saturation is not changed. If it's less than 1.0,
     * saturation is reduced (the image turns toward grayscale); if greater than
     * 1.0, saturation is increased (the image gets more vivid colors).
     *
     * If `pixelate` is `TRUE`, then pixels are faded in a checkerboard pattern to
     * create a pixelated image.
     *
     * @param dest place to write modified version of @src
     * @param saturation saturation factor
     * @param pixelate whether to pixelate
     */
    public open fun saturateAndPixelate(dest: Pixbuf, saturation: gfloat, pixelate: Boolean): Unit =
        gdk_pixbuf_saturate_and_pixelate(
            gdkPixbufPointer.reinterpret(),
            dest.gdkPixbufPointer.reinterpret(),
            saturation,
            pixelate.asGBoolean()
        )

    /**
     * Vector version of `gdk_pixbuf_save_to_callback()`.
     *
     * Saves pixbuf to a callback in format @type, which is currently "jpeg",
     * "png", "tiff", "ico" or "bmp".
     *
     * If @error is set, `FALSE` will be returned.
     *
     * See [method@GdkPixbuf.Pixbuf.save_to_callback] for more details.
     *
     * @param saveFunc a function that is called to save each block of data that
     *   the save routine generates.
     * @param type name of file format.
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @return whether an error was set
     * @since 2.4
     */
    @GdkPixbufVersion2_4
    public open fun saveToCallbackv(
        saveFunc: PixbufSaveFunc,
        type: String,
        optionKeys: List<String>? = null,
        optionValues: List<String>? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_pixbuf_save_to_callbackv(
            gdkPixbufPointer.reinterpret(),
            PixbufSaveFuncFunc.reinterpret(),
            StableRef.create(saveFunc).asCPointer(),
            type,
            optionKeys?.toCStringList(this),
            optionValues?.toCStringList(this),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Saves `pixbuf` to an output stream.
     *
     * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
     * "bmp".
     *
     * See [method@GdkPixbuf.Pixbuf.save_to_stream] for more details.
     *
     * @param stream a `GOutputStream` to save the pixbuf to
     * @param type name of file format
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return `TRUE` if the pixbuf was saved successfully, `FALSE` if an
     *   error was set.
     * @since 2.36
     */
    @GdkPixbufVersion2_36
    public open fun saveToStreamv(
        stream: OutputStream,
        type: String,
        optionKeys: List<String>? = null,
        optionValues: List<String>? = null,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_pixbuf_save_to_streamv(
            gdkPixbufPointer.reinterpret(),
            stream.gioOutputStreamPointer.reinterpret(),
            type,
            optionKeys?.toCStringList(this),
            optionValues?.toCStringList(this),
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Saves `pixbuf` to an output stream asynchronously.
     *
     * For more details see gdk_pixbuf_save_to_streamv(), which is the synchronous
     * version of this function.
     *
     * When the operation is finished, `callback` will be called in the main thread.
     *
     * You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
     * the operation.
     *
     * @param stream a `GOutputStream` to which to save the pixbuf
     * @param type name of file format
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @param callback a `GAsyncReadyCallback` to call when the pixbuf is saved
     * @since 2.36
     */
    @GdkPixbufVersion2_36
    public open fun saveToStreamvAsync(
        stream: OutputStream,
        type: String,
        optionKeys: List<String>? = null,
        optionValues: List<String>? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = memScoped {
        return gdk_pixbuf_save_to_streamv_async(
            gdkPixbufPointer.reinterpret(),
            stream.gioOutputStreamPointer.reinterpret(),
            type,
            optionKeys?.toCStringList(this),
            optionValues?.toCStringList(this),
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )
    }

    /**
     * Vector version of `gdk_pixbuf_save()`.
     *
     * Saves pixbuf to a file in `type`, which is currently "jpeg", "png", "tiff", "ico" or "bmp".
     *
     * If @error is set, `FALSE` will be returned.
     *
     * See [method@GdkPixbuf.Pixbuf.save] for more details.
     *
     * @param filename name of file to save.
     * @param type name of file format.
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @return whether an error was set
     */
    public open fun savev(
        filename: String,
        type: String,
        optionKeys: List<String>? = null,
        optionValues: List<String>? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_pixbuf_savev(
            gdkPixbufPointer.reinterpret(),
            filename,
            type,
            optionKeys?.toCStringList(this),
            optionValues?.toCStringList(this),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates a transformation of the source image @src by scaling by
     * @scale_x and @scale_y then translating by @offset_x and @offset_y,
     * then renders the rectangle (@dest_x, @dest_y, @dest_width,
     * @dest_height) of the resulting image onto the destination image
     * replacing the previous contents.
     *
     * Try to use gdk_pixbuf_scale_simple() first; this function is
     * the industrial-strength power tool you can fall back to, if
     * gdk_pixbuf_scale_simple() isn't powerful enough.
     *
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the scaling which
     * results in rendering artifacts.
     *
     * @param dest the #GdkPixbuf into which to render the results
     * @param destX the left coordinate for region to render
     * @param destY the top coordinate for region to render
     * @param destWidth the width of the region to render
     * @param destHeight the height of the region to render
     * @param offsetX the offset in the X direction (currently rounded to an integer)
     * @param offsetY the offset in the Y direction (currently rounded to an integer)
     * @param scaleX the scale factor in the X direction
     * @param scaleY the scale factor in the Y direction
     * @param interpType the interpolation type for the transformation.
     */
    public open fun scale(
        dest: Pixbuf,
        destX: gint,
        destY: gint,
        destWidth: gint,
        destHeight: gint,
        offsetX: gdouble,
        offsetY: gdouble,
        scaleX: gdouble,
        scaleY: gdouble,
        interpType: InterpType,
    ): Unit =
        gdk_pixbuf_scale(gdkPixbufPointer.reinterpret(), dest.gdkPixbufPointer.reinterpret(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.nativeValue)

    /**
     * Create a new pixbuf containing a copy of `src` scaled to
     * `dest_width` x `dest_height`.
     *
     * This function leaves `src` unaffected.
     *
     * The `interp_type` should be `GDK_INTERP_NEAREST` if you want maximum
     * speed (but when scaling down `GDK_INTERP_NEAREST` is usually unusably
     * ugly). The default `interp_type` should be `GDK_INTERP_BILINEAR` which
     * offers reasonable quality and speed.
     *
     * You can scale a sub-portion of `src` by creating a sub-pixbuf
     * pointing into `src`; see [method@GdkPixbuf.Pixbuf.new_subpixbuf].
     *
     * If `dest_width` and `dest_height` are equal to the width and height of
     * `src`, this function will return an unscaled copy of `src`.
     *
     * For more complicated scaling/alpha blending see [method@GdkPixbuf.Pixbuf.scale]
     * and [method@GdkPixbuf.Pixbuf.composite].
     *
     * @param destWidth the width of destination image
     * @param destHeight the height of destination image
     * @param interpType the interpolation type for the transformation.
     * @return the new pixbuf
     */
    public open fun scaleSimple(destWidth: gint, destHeight: gint, interpType: InterpType): Pixbuf? =
        gdk_pixbuf_scale_simple(gdkPixbufPointer.reinterpret(), destWidth, destHeight, interpType.nativeValue)?.run {
            Pixbuf(reinterpret())
        }

    /**
     * Attaches a key/value pair as an option to a `GdkPixbuf`.
     *
     * If `key` already exists in the list of options attached to the `pixbuf`,
     * the new value is ignored and `FALSE` is returned.
     *
     * @param key a nul-terminated string.
     * @param value a nul-terminated string.
     * @return `TRUE` on success
     * @since 2.2
     */
    @GdkPixbufVersion2_2
    public open fun setOption(key: String, `value`: String): Boolean =
        gdk_pixbuf_set_option(gdkPixbufPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Removes a reference from a pixbuf.
     */
    override fun unref(): Unit = gdk_pixbuf_unref(gdkPixbufPointer.reinterpret())

    public companion object : TypeCompanion<Pixbuf> {
        override val type: GeneratedClassKGType<Pixbuf> =
            GeneratedClassKGType(gdk_pixbuf_get_type()) { Pixbuf(it.reinterpret()) }

        init {
            GdkpixbufTypeProvider.register()
        }

        /**
         * Creates a new pixbuf by loading an image from a file.
         *
         * The file format is detected automatically.
         *
         * If `NULL` is returned, then @error will be set. Possible errors are:
         *
         *  - the file could not be opened
         *  - there is no loader for the file's format
         *  - there is not enough memory to allocate the image buffer
         *  - the image buffer contains invalid data
         *
         * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
         *
         * @param filename Name of file to load, in the GLib file
         *   name encoding
         * @return A newly-created pixbuf
         */
        public fun newFromFile(filename: String): Result<Pixbuf> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = gdk_pixbuf_new_from_file(filename, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(Pixbuf(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Creates a new pixbuf by loading an image from an resource.
         *
         * The file format is detected automatically. If `NULL` is returned, then
         * @error will be set.
         *
         * @param resourcePath the path of the resource file
         * @return A newly-created pixbuf
         * @since 2.26
         */
        public fun newFromResource(resourcePath: String): Result<Pixbuf> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = gdk_pixbuf_new_from_resource(resourcePath, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(Pixbuf(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Creates a new pixbuf by loading an image from a file.
         *
         * The file format is detected automatically.
         *
         * If `NULL` is returned, then @error will be set. Possible errors are:
         *
         *  - the file could not be opened
         *  - there is no loader for the file's format
         *  - there is not enough memory to allocate the image buffer
         *  - the image buffer contains invalid data
         *
         * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
         *
         * The image will be scaled to fit in the requested size, optionally preserving
         * the image's aspect ratio.
         *
         * When preserving the aspect ratio, a `width` of -1 will cause the image
         * to be scaled to the exact given height, and a `height` of -1 will cause
         * the image to be scaled to the exact given width. When not preserving
         * aspect ratio, a `width` or `height` of -1 means to not scale the image
         * at all in that dimension. Negative values for `width` and `height` are
         * allowed since 2.8.
         *
         * @param filename Name of file to load, in the GLib file
         *     name encoding
         * @param width The width the image should have or -1 to not constrain the width
         * @param height The height the image should have or -1 to not constrain the height
         * @param preserveAspectRatio `TRUE` to preserve the image's aspect ratio
         * @return A newly-created pixbuf
         * @since 2.6
         */
        public fun newFromFileAtScale(
            filename: String,
            width: gint,
            height: gint,
            preserveAspectRatio: Boolean,
        ): Result<Pixbuf> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult =
                gdk_pixbuf_new_from_file_at_scale(filename, width, height, preserveAspectRatio.asGBoolean(), gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(Pixbuf(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Creates a new pixbuf by loading an image from an resource.
         *
         * The file format is detected automatically. If `NULL` is returned, then
         * @error will be set.
         *
         * The image will be scaled to fit in the requested size, optionally
         * preserving the image's aspect ratio. When preserving the aspect ratio,
         * a @width of -1 will cause the image to be scaled to the exact given
         * height, and a @height of -1 will cause the image to be scaled to the
         * exact given width. When not preserving aspect ratio, a @width or
         * @height of -1 means to not scale the image at all in that dimension.
         *
         * The stream is not closed.
         *
         * @param resourcePath the path of the resource file
         * @param width The width the image should have or -1 to not constrain the width
         * @param height The height the image should have or -1 to not constrain the height
         * @param preserveAspectRatio `TRUE` to preserve the image's aspect ratio
         * @return A newly-created pixbuf
         * @since 2.26
         */
        public fun newFromResourceAtScale(
            resourcePath: String,
            width: gint,
            height: gint,
            preserveAspectRatio: Boolean,
        ): Result<Pixbuf> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult =
                gdk_pixbuf_new_from_resource_at_scale(
                    resourcePath,
                    width,
                    height,
                    preserveAspectRatio.asGBoolean(),
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(Pixbuf(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Calculates the rowstride that an image created with those values would
         * have.
         *
         * This function is useful for front-ends and backends that want to check
         * image values without needing to create a `GdkPixbuf`.
         *
         * @param colorspace Color space for image
         * @param hasAlpha Whether the image should have transparency information
         * @param bitsPerSample Number of bits per color sample
         * @param width Width of image in pixels, must be > 0
         * @param height Height of image in pixels, must be > 0
         * @return the rowstride for the given values, or -1 in case of error.
         * @since 2.36.8
         */
        @GdkPixbufVersion2_36_8
        public fun calculateRowstride(
            colorspace: Colorspace,
            hasAlpha: Boolean,
            bitsPerSample: gint,
            width: gint,
            height: gint,
        ): gint =
            gdk_pixbuf_calculate_rowstride(colorspace.nativeValue, hasAlpha.asGBoolean(), bitsPerSample, width, height)

        /**
         * Asynchronously parses an image file far enough to determine its
         * format and size.
         *
         * For more details see gdk_pixbuf_get_file_info(), which is the synchronous
         * version of this function.
         *
         * When the operation is finished, @callback will be called in the
         * main thread. You can then call gdk_pixbuf_get_file_info_finish() to
         * get the result of the operation.
         *
         * @param filename The name of the file to identify
         * @param cancellable optional `GCancellable` object, `NULL` to ignore
         * @param callback a `GAsyncReadyCallback` to call when the file info is available
         * @since 2.32
         */
        @GdkPixbufVersion2_32
        public fun getFileInfoAsync(
            filename: String,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = gdk_pixbuf_get_file_info_async(
            filename,
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Obtains the available information about the image formats supported
         * by GdkPixbuf.
         *
         * @return A list of
         *   support image formats.
         * @since 2.2
         */
        @GdkPixbufVersion2_2
        public fun getFormats(): SList = gdk_pixbuf_get_formats()!!.run {
            SList(reinterpret())
        }

        /**
         * Initalizes the gdk-pixbuf loader modules referenced by the `loaders.cache`
         * file present inside that directory.
         *
         * This is to be used by applications that want to ship certain loaders
         * in a different location from the system ones.
         *
         * This is needed when the OS or runtime ships a minimal number of loaders
         * so as to reduce the potential attack surface of carefully crafted image
         * files, especially for uncommon file types. Applications that require
         * broader image file types coverage, such as image viewers, would be
         * expected to ship the gdk-pixbuf modules in a separate location, bundled
         * with the application in a separate directory from the OS or runtime-
         * provided modules.
         *
         * @param path Path to directory where the `loaders.cache` is installed
         * @since 2.40
         */
        @GdkPixbufVersion2_40
        public fun initModules(path: String): Result<Boolean> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_init_modules(path, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

        /**
         * Creates a new pixbuf by asynchronously loading an image from an input stream.
         *
         * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
         * version of this function.
         *
         * When the operation is finished, @callback will be called in the main thread.
         * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of
         * the operation.
         *
         * @param stream a `GInputStream` from which to load the pixbuf
         * @param cancellable optional `GCancellable` object, `NULL` to ignore
         * @param callback a `GAsyncReadyCallback` to call when the pixbuf is loaded
         * @since 2.24
         */
        @GdkPixbufVersion2_24
        public fun newFromStreamAsync(
            stream: InputStream,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = gdk_pixbuf_new_from_stream_async(
            stream.gioInputStreamPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Creates a new pixbuf by asynchronously loading an image from an input stream.
         *
         * For more details see gdk_pixbuf_new_from_stream_at_scale(), which is the synchronous
         * version of this function.
         *
         * When the operation is finished, @callback will be called in the main thread.
         * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of the operation.
         *
         * @param stream a `GInputStream` from which to load the pixbuf
         * @param width the width the image should have or -1 to not constrain the width
         * @param height the height the image should have or -1 to not constrain the height
         * @param preserveAspectRatio `TRUE` to preserve the image's aspect ratio
         * @param cancellable optional `GCancellable` object, `NULL` to ignore
         * @param callback a `GAsyncReadyCallback` to call when the pixbuf is loaded
         * @since 2.24
         */
        @GdkPixbufVersion2_24
        public fun newFromStreamAtScaleAsync(
            stream: InputStream,
            width: gint,
            height: gint,
            preserveAspectRatio: Boolean,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = gdk_pixbuf_new_from_stream_at_scale_async(
            stream.gioInputStreamPointer.reinterpret(),
            width,
            height,
            preserveAspectRatio.asGBoolean(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Finishes an asynchronous pixbuf save operation started with
         * gdk_pixbuf_save_to_stream_async().
         *
         * @param asyncResult a `GAsyncResult`
         * @return `TRUE` if the pixbuf was saved successfully, `FALSE` if an error was set.
         * @since 2.24
         */
        @GdkPixbufVersion2_24
        public fun saveToStreamFinish(asyncResult: AsyncResult): Result<Boolean> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gdk_pixbuf_save_to_stream_finish(asyncResult.gioAsyncResultPointer, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

        /**
         * Get the GType of Pixbuf
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_get_type()
    }
}
