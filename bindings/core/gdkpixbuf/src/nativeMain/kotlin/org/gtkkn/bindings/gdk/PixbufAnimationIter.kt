// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.TimeVal
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbufAnimationIter
import org.gtkkn.native.gdk.gdk_pixbuf_animation_iter_advance
import org.gtkkn.native.gdk.gdk_pixbuf_animation_iter_get_delay_time
import org.gtkkn.native.gdk.gdk_pixbuf_animation_iter_get_pixbuf
import org.gtkkn.native.gdk.gdk_pixbuf_animation_iter_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_animation_iter_on_currently_loading_frame
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An opaque object representing an iterator which points to a
 * certain position in an animation.
 */
public open class PixbufAnimationIter(public val gdkPixbufAnimationIterPointer: CPointer<GdkPixbufAnimationIter>) :
    Object(gdkPixbufAnimationIterPointer.reinterpret()),
    KGTyped {
    init {
        GdkPixbuf
    }

    /**
     * Possibly advances an animation to a new frame.
     *
     * Chooses the frame based on the start time passed to
     * gdk_pixbuf_animation_get_iter().
     *
     * @current_time would normally come from g_get_current_time(), and
     * must be greater than or equal to the time passed to
     * gdk_pixbuf_animation_get_iter(), and must increase or remain
     * unchanged each time gdk_pixbuf_animation_iter_get_pixbuf() is
     * called. That is, you can't go backward in time; animations only
     * play forward.
     *
     * As a shortcut, pass `NULL` for the current time and g_get_current_time()
     * will be invoked on your behalf. So you only need to explicitly pass
     * @current_time if you're doing something odd like playing the animation
     * at double speed.
     *
     * If this function returns `FALSE`, there's no need to update the animation
     * display, assuming the display had been rendered prior to advancing;
     * if `TRUE`, you need to call gdk_pixbuf_animation_iter_get_pixbuf()
     * and update the display with the new pixbuf.
     *
     * @param currentTime current time
     * @return `TRUE` if the image may need updating
     */
    public open fun advance(currentTime: TimeVal? = null): Boolean =
        gdk_pixbuf_animation_iter_advance(gdkPixbufAnimationIterPointer, currentTime?.glibTimeValPointer).asBoolean()

    /**
     * Gets the number of milliseconds the current pixbuf should be displayed,
     * or -1 if the current pixbuf should be displayed forever.
     *
     * The `g_timeout_add()` function conveniently takes a timeout in milliseconds,
     * so you can use a timeout to schedule the next update.
     *
     * Note that some formats, like GIF, might clamp the timeout values in the
     * image file to avoid updates that are just too quick. The minimum timeout
     * for GIF images is currently 20 milliseconds.
     *
     * @return delay time in milliseconds (thousandths of a second)
     */
    public open fun getDelayTime(): gint = gdk_pixbuf_animation_iter_get_delay_time(gdkPixbufAnimationIterPointer)

    /**
     * Gets the current pixbuf which should be displayed.
     *
     * The pixbuf might not be the same size as the animation itself
     * (gdk_pixbuf_animation_get_width(), gdk_pixbuf_animation_get_height()).
     *
     * This pixbuf should be displayed for gdk_pixbuf_animation_iter_get_delay_time()
     * milliseconds.
     *
     * The caller of this function does not own a reference to the returned
     * pixbuf; the returned pixbuf will become invalid when the iterator
     * advances to the next frame, which may happen anytime you call
     * gdk_pixbuf_animation_iter_advance().
     *
     * Copy the pixbuf to keep it (don't just add a reference), as it may get
     * recycled as you advance the iterator.
     *
     * @return the pixbuf to be displayed
     */
    public open fun getPixbuf(): Pixbuf = gdk_pixbuf_animation_iter_get_pixbuf(gdkPixbufAnimationIterPointer)!!.run {
        InstanceCache.get(this, true) { Pixbuf(reinterpret()) }!!
    }

    /**
     * Used to determine how to respond to the area_updated signal on
     * #GdkPixbufLoader when loading an animation.
     *
     * The `::area_updated` signal is emitted for an area of the frame currently
     * streaming in to the loader. So if you're on the currently loading frame,
     * you will need to redraw the screen for the updated area.
     *
     * @return `TRUE` if the frame we're on is partially loaded, or the last frame
     */
    public open fun onCurrentlyLoadingFrame(): Boolean =
        gdk_pixbuf_animation_iter_on_currently_loading_frame(gdkPixbufAnimationIterPointer).asBoolean()

    public companion object : TypeCompanion<PixbufAnimationIter> {
        override val type: GeneratedClassKGType<PixbufAnimationIter> =
            GeneratedClassKGType(getTypeOrNull()!!) { PixbufAnimationIter(it.reinterpret()) }

        init {
            GdkPixbufTypeProvider.register()
        }

        /**
         * Get the GType of PixbufAnimationIter
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_animation_iter_get_type()

        /**
         * Gets the GType of from the symbol `gdk_pixbuf_animation_iter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_pixbuf_animation_iter_get_type")
    }
}
