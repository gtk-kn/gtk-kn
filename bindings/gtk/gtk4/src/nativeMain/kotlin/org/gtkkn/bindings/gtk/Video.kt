// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkVideo
import org.gtkkn.native.gtk.gtk_video_get_autoplay
import org.gtkkn.native.gtk.gtk_video_get_file
import org.gtkkn.native.gtk.gtk_video_get_graphics_offload
import org.gtkkn.native.gtk.gtk_video_get_loop
import org.gtkkn.native.gtk.gtk_video_get_media_stream
import org.gtkkn.native.gtk.gtk_video_get_type
import org.gtkkn.native.gtk.gtk_video_new
import org.gtkkn.native.gtk.gtk_video_new_for_file
import org.gtkkn.native.gtk.gtk_video_new_for_filename
import org.gtkkn.native.gtk.gtk_video_new_for_media_stream
import org.gtkkn.native.gtk.gtk_video_new_for_resource
import org.gtkkn.native.gtk.gtk_video_set_autoplay
import org.gtkkn.native.gtk.gtk_video_set_file
import org.gtkkn.native.gtk.gtk_video_set_filename
import org.gtkkn.native.gtk.gtk_video_set_graphics_offload
import org.gtkkn.native.gtk.gtk_video_set_loop
import org.gtkkn.native.gtk.gtk_video_set_media_stream
import org.gtkkn.native.gtk.gtk_video_set_resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkVideo` is a widget to show a `GtkMediaStream` with media controls.
 *
 * ![An example GtkVideo](video.png)
 *
 * The controls are available separately as [class@Gtk.MediaControls].
 * If you just want to display a video without controls, you can treat it
 * like any other paintable and for example put it into a [class@Gtk.Picture].
 *
 * `GtkVideo` aims to cover use cases such as previews, embedded animations,
 * etc. It supports autoplay, looping, and simple media controls. It does
 * not have support for video overlays, multichannel audio, device
 * selection, or input. If you are writing a full-fledged video player,
 * you may want to use the [iface@Gdk.Paintable] API and a media framework
 * such as Gstreamer directly.
 */
public open class Video(public val gtkVideoPointer: CPointer<GtkVideo>) :
    Widget(gtkVideoPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * If the video should automatically begin playing.
     */
    public open var autoplay: Boolean
        /**
         * Returns true if videos have been set to loop.
         *
         * @return true if streams should autoplay
         */
        get() = gtk_video_get_autoplay(gtkVideoPointer).asBoolean()

        /**
         * Sets whether @self automatically starts playback when it
         * becomes visible or when a new file gets loaded.
         *
         * @param autoplay whether media streams should autoplay
         */
        set(autoplay) = gtk_video_set_autoplay(gtkVideoPointer, autoplay.asGBoolean())

    /**
     * The file played by this video if the video is playing a file.
     */
    public open var `file`: File?
        /**
         * Gets the file played by @self or null if not playing back
         * a file.
         *
         * @return The file played by @self
         */
        get() = gtk_video_get_file(gtkVideoPointer)?.run {
            File.FileImpl(reinterpret())
        }

        /**
         * Makes @self play the given @file.
         *
         * @param file the file to play
         */
        set(`file`) = gtk_video_set_file(gtkVideoPointer, `file`?.gioFilePointer)

    /**
     * Whether to enable graphics offload.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var graphicsOffload: GraphicsOffloadEnabled
        /**
         * Returns whether graphics offload is enabled.
         *
         * See [class@Gtk.GraphicsOffload] for more information on graphics offload.
         *
         * @return the graphics offload status
         * @since 4.14
         */
        get() = gtk_video_get_graphics_offload(gtkVideoPointer).run {
            GraphicsOffloadEnabled.fromNativeValue(this)
        }

        /**
         * Sets whether to enable graphics offload.
         *
         * See [class@Gtk.GraphicsOffload] for more information on graphics offload.
         *
         * @param enabled the new graphics offload status
         * @since 4.14
         */
        @GtkVersion4_14
        set(enabled) = gtk_video_set_graphics_offload(gtkVideoPointer, enabled.nativeValue)

    /**
     * If new media files should be set to loop.
     */
    public open var loop: Boolean
        /**
         * Returns true if videos have been set to loop.
         *
         * @return true if streams should loop
         */
        get() = gtk_video_get_loop(gtkVideoPointer).asBoolean()

        /**
         * Sets whether new files loaded by @self should be set to loop.
         *
         * @param loop whether media streams should loop
         */
        set(loop) = gtk_video_set_loop(gtkVideoPointer, loop.asGBoolean())

    /**
     * The media-stream played
     */
    public open var mediaStream: MediaStream?
        /**
         * Gets the media stream managed by @self or null if none.
         *
         * @return The media stream managed by @self
         */
        get() = gtk_video_get_media_stream(gtkVideoPointer)?.run {
            InstanceCache.get(this, true) { MediaStream.MediaStreamImpl(reinterpret()) }!!
        }

        /**
         * Sets the media stream to be played back.
         *
         * @self will take full control of managing the media stream. If you
         * want to manage a media stream yourself, consider using a
         * [class@Gtk.Picture] for display.
         *
         * If you want to display a file, consider using [method@Gtk.Video.set_file]
         * instead.
         *
         * @param stream The media stream to play or null to unset
         */
        set(stream) = gtk_video_set_media_stream(gtkVideoPointer, stream?.gtkMediaStreamPointer)

    /**
     * Creates a new empty `GtkVideo`.
     *
     * @return a new `GtkVideo`
     */
    public constructor() : this(gtk_video_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a `GtkVideo` to play back the given @file.
     *
     * @param file a `GFile`
     * @return a new `GtkVideo`
     */
    public constructor(`file`: File? = null) : this(gtk_video_new_for_file(`file`?.gioFilePointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a `GtkVideo` to play back the given @filename.
     *
     * This is a utility function that calls [ctor@Gtk.Video.new_for_file],
     * See that function for details.
     *
     * @param filename filename to play back
     * @return a new `GtkVideo`
     */
    public constructor(filename: String? = null) : this(gtk_video_new_for_filename(filename)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a `GtkVideo` to play back the given @stream.
     *
     * @param stream a `GtkMediaStream`
     * @return a new `GtkVideo`
     */
    public constructor(
        stream: MediaStream? = null,
    ) : this(gtk_video_new_for_media_stream(stream?.gtkMediaStreamPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Makes @self play the given @filename.
     *
     * This is a utility function that calls gtk_video_set_file(),
     *
     * @param filename the filename to play
     */
    public open fun setFilename(filename: String? = null): Unit = gtk_video_set_filename(gtkVideoPointer, filename)

    /**
     * Makes @self play the resource at the given @resource_path.
     *
     * This is a utility function that calls [method@Gtk.Video.set_file].
     *
     * @param resourcePath the resource to set
     */
    public open fun setResource(resourcePath: String? = null): Unit =
        gtk_video_set_resource(gtkVideoPointer, resourcePath)

    public companion object : TypeCompanion<Video> {
        override val type: GeneratedClassKGType<Video> =
            GeneratedClassKGType(getTypeOrNull()!!) { Video(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Video
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_video_get_type()

        /**
         * Gets the GType of from the symbol `gtk_video_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_video_get_type")

        /**
         * Creates a `GtkVideo` to play back the resource at the
         * given @resource_path.
         *
         * This is a utility function that calls [ctor@Gtk.Video.new_for_file].
         *
         * @param resourcePath resource path to play back
         * @return a new `GtkVideo`
         */
        public fun forResource(resourcePath: String? = null): Video =
            Video(gtk_video_new_for_resource(resourcePath)!!.reinterpret()).apply {
                InstanceCache.put(this)
            }
    }
}
