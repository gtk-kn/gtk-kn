// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gdk.GdkPixbuf.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_28
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.TimeVal
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbufAnimation
import org.gtkkn.native.gdk.gdk_pixbuf_animation_get_height
import org.gtkkn.native.gdk.gdk_pixbuf_animation_get_iter
import org.gtkkn.native.gdk.gdk_pixbuf_animation_get_static_image
import org.gtkkn.native.gdk.gdk_pixbuf_animation_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_animation_get_width
import org.gtkkn.native.gdk.gdk_pixbuf_animation_is_static_image
import org.gtkkn.native.gdk.gdk_pixbuf_animation_new_from_file
import org.gtkkn.native.gdk.gdk_pixbuf_animation_new_from_resource
import org.gtkkn.native.gdk.gdk_pixbuf_animation_new_from_stream
import org.gtkkn.native.gdk.gdk_pixbuf_animation_new_from_stream_async
import org.gtkkn.native.gdk.gdk_pixbuf_animation_new_from_stream_finish
import org.gtkkn.native.gdk.gdk_pixbuf_animation_ref
import org.gtkkn.native.gdk.gdk_pixbuf_animation_unref
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.Unit

/**
 * An opaque object representing an animation.
 *
 * The GdkPixBuf library provides a simple mechanism to load and
 * represent animations. An animation is conceptually a series of
 * frames to be displayed over time.
 *
 * The animation may not be represented as a series of frames
 * internally; for example, it may be stored as a sprite and
 * instructions for moving the sprite around a background.
 *
 * To display an animation you don't need to understand its
 * representation, however; you just ask `GdkPixbuf` what should
 * be displayed at a given point in time.
 */
public open class PixbufAnimation(public val gdkPixbufAnimationPointer: CPointer<GdkPixbufAnimation>) :
    Object(gdkPixbufAnimationPointer.reinterpret()),
    KGTyped {
    init {
        GdkPixbuf
    }

    /**
     * Creates a new animation by loading it from a file.
     *
     * The file format is detected automatically.
     *
     * If the file's format does not support multi-frame images, then an animation
     * with a single frame will be created.
     *
     * Possible errors are in the `GDK_PIXBUF_ERROR` and `G_FILE_ERROR` domains.
     *
     * @param filename Name of file to load, in the GLib file
     *   name encoding
     * @return A newly-created animation
     */
    @Throws(GLibException::class)
    public constructor(filename: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = gdk_pixbuf_animation_new_from_file(filename, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new animation by loading it from an input stream.
     *
     * The file format is detected automatically.
     *
     * If `NULL` is returned, then @error will be set.
     *
     * The @cancellable can be used to abort the operation from another thread.
     * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
     * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
     * `G_IO_ERROR` domains.
     *
     * The stream is not closed.
     *
     * @param stream a `GInputStream` to load the pixbuf from
     * @param cancellable optional `GCancellable` object
     * @return A newly-created animation
     * @since 2.28
     */
    @Throws(GLibException::class)
    public constructor(stream: InputStream, cancellable: Cancellable? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult =
                gdk_pixbuf_animation_new_from_stream(
                    stream.gioInputStreamPointer,
                    cancellable?.gioCancellablePointer,
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

    /**
     * Finishes an asynchronous pixbuf animation creation operation started with
     * [func@GdkPixbuf.PixbufAnimation.new_from_stream_async].
     *
     * @param asyncResult a #GAsyncResult
     * @return the newly created animation
     * @since 2.28
     */
    @Throws(GLibException::class)
    public constructor(asyncResult: AsyncResult) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = gdk_pixbuf_animation_new_from_stream_finish(asyncResult.gioAsyncResultPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

    /**
     * Queries the height of the bounding box of a pixbuf animation.
     *
     * @return Height of the bounding box of the animation.
     */
    public open fun getHeight(): gint = gdk_pixbuf_animation_get_height(gdkPixbufAnimationPointer)

    /**
     * Get an iterator for displaying an animation.
     *
     * The iterator provides the frames that should be displayed at a
     * given time.
     *
     * @start_time would normally come from g_get_current_time(), and marks
     * the beginning of animation playback. After creating an iterator, you
     * should immediately display the pixbuf returned by
     * gdk_pixbuf_animation_iter_get_pixbuf(). Then, you should install
     * a timeout (with g_timeout_add()) or by some other mechanism ensure
     * that you'll update the image after
     * gdk_pixbuf_animation_iter_get_delay_time() milliseconds. Each time
     * the image is updated, you should reinstall the timeout with the new,
     * possibly-changed delay time.
     *
     * As a shortcut, if @start_time is `NULL`, the result of
     * g_get_current_time() will be used automatically.
     *
     * To update the image (i.e. possibly change the result of
     * gdk_pixbuf_animation_iter_get_pixbuf() to a new frame of the animation),
     * call gdk_pixbuf_animation_iter_advance().
     *
     * If you're using #GdkPixbufLoader, in addition to updating the image
     * after the delay time, you should also update it whenever you
     * receive the area_updated signal and
     * gdk_pixbuf_animation_iter_on_currently_loading_frame() returns
     * `TRUE`. In this case, the frame currently being fed into the loader
     * has received new data, so needs to be refreshed. The delay time for
     * a frame may also be modified after an area_updated signal, for
     * example if the delay time for a frame is encoded in the data after
     * the frame itself. So your timeout should be reinstalled after any
     * area_updated signal.
     *
     * A delay time of -1 is possible, indicating "infinite".
     *
     * @param startTime time when the animation starts playing
     * @return an iterator to move over the animation
     */
    public open fun getIter(startTime: TimeVal? = null): PixbufAnimationIter =
        gdk_pixbuf_animation_get_iter(gdkPixbufAnimationPointer, startTime?.glibTimeValPointer)!!.run {
            InstanceCache.get(this, true) { PixbufAnimationIter(reinterpret()) }!!
        }

    /**
     * Retrieves a static image for the animation.
     *
     * If an animation is really just a plain image (has only one frame),
     * this function returns that image.
     *
     * If the animation is an animation, this function returns a reasonable
     * image to use as a static unanimated image, which might be the first
     * frame, or something more sophisticated depending on the file format.
     *
     * If an animation hasn't loaded any frames yet, this function will
     * return `NULL`.
     *
     * @return unanimated image representing the animation
     */
    public open fun getStaticImage(): Pixbuf = gdk_pixbuf_animation_get_static_image(gdkPixbufAnimationPointer)!!.run {
        InstanceCache.get(this, true) { Pixbuf(reinterpret()) }!!
    }

    /**
     * Queries the width of the bounding box of a pixbuf animation.
     *
     * @return Width of the bounding box of the animation.
     */
    public open fun getWidth(): gint = gdk_pixbuf_animation_get_width(gdkPixbufAnimationPointer)

    /**
     * Checks whether the animation is a static image.
     *
     * If you load a file with gdk_pixbuf_animation_new_from_file() and it
     * turns out to be a plain, unanimated image, then this function will
     * return `TRUE`. Use gdk_pixbuf_animation_get_static_image() to retrieve
     * the image.
     *
     * @return `TRUE` if the "animation" was really just an image
     */
    public open fun isStaticImage(): Boolean =
        gdk_pixbuf_animation_is_static_image(gdkPixbufAnimationPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.0.
     *
     * Use g_object_ref().
     * ---
     *
     * Adds a reference to an animation.
     *
     * @return The same as the @animation argument.
     */
    override fun ref(): PixbufAnimation = gdk_pixbuf_animation_ref(gdkPixbufAnimationPointer)!!.run {
        InstanceCache.get(this, true) { PixbufAnimation(reinterpret()) }!!
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.0.
     *
     * Use g_object_unref().
     * ---
     *
     * Removes a reference from an animation.
     */
    override fun unref(): Unit = gdk_pixbuf_animation_unref(gdkPixbufAnimationPointer)

    public companion object : TypeCompanion<PixbufAnimation> {
        override val type: GeneratedClassKGType<PixbufAnimation> =
            GeneratedClassKGType(getTypeOrNull()!!) { PixbufAnimation(it.reinterpret()) }

        init {
            GdkPixbufTypeProvider.register()
        }

        /**
         * Creates a new animation by asynchronously loading an image from an input stream.
         *
         * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
         * version of this function.
         *
         * When the operation is finished, `callback` will be called in the main thread.
         * You can then call gdk_pixbuf_animation_new_from_stream_finish() to get the
         * result of the operation.
         *
         * @param stream a #GInputStream from which to load the animation
         * @param cancellable optional #GCancellable object
         * @param callback a `GAsyncReadyCallback` to call when the pixbuf is loaded
         * @since 2.28
         */
        @GdkPixbufVersion2_28
        public fun newFromStreamAsync(
            stream: InputStream,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = gdk_pixbuf_animation_new_from_stream_async(
            stream.gioInputStreamPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Get the GType of PixbufAnimation
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_animation_get_type()

        /**
         * Gets the GType of from the symbol `gdk_pixbuf_animation_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_pixbuf_animation_get_type")

        /**
         * Creates a new pixbuf animation by loading an image from an resource.
         *
         * The file format is detected automatically. If `NULL` is returned, then
         * @error will be set.
         *
         * @param resourcePath the path of the resource file
         * @return A newly-created animation
         * @since 2.28
         */
        public fun fromResource(resourcePath: String): Result<PixbufAnimation> {
            memScoped {
                val gError = allocPointerTo<GError>()
                gError.`value` = null
                val gResult = gdk_pixbuf_animation_new_from_resource(resourcePath, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    val instance = PixbufAnimation(checkNotNull(gResult).reinterpret())
                    InstanceCache.put(instance)
                    Result.success(instance)
                }
            }
        }
    }
}
