// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.File
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkVideo
import org.gtkkn.native.gtk.gtk_video_get_autoplay
import org.gtkkn.native.gtk.gtk_video_get_file
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
public open class Video(
    pointer: CPointer<GtkVideo>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val gtkVideoPointer: CPointer<GtkVideo>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * If the video should automatically begin playing.
     */
    public open var autoplay: Boolean
        /**
         * Returns true if videos have been set to loop.
         *
         * @return true if streams should autoplay
         */
        get() = gtk_video_get_autoplay(gtkVideoPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self automatically starts playback when it
         * becomes visible or when a new file gets loaded.
         *
         * @param autoplay whether media streams should autoplay
         */
        set(autoplay) = gtk_video_set_autoplay(gtkVideoPointer.reinterpret(), autoplay.asGBoolean())

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
        get() =
            gtk_video_get_file(gtkVideoPointer.reinterpret())?.run {
                File.wrap(reinterpret())
            }

        /**
         * Makes @self play the given @file.
         *
         * @param file the file to play
         */
        set(`file`) = gtk_video_set_file(gtkVideoPointer.reinterpret(), `file`?.gioFilePointer)

    /**
     * If new media files should be set to loop.
     */
    public open var loop: Boolean
        /**
         * Returns true if videos have been set to loop.
         *
         * @return true if streams should loop
         */
        get() = gtk_video_get_loop(gtkVideoPointer.reinterpret()).asBoolean()

        /**
         * Sets whether new files loaded by @self should be set to loop.
         *
         * @param loop whether media streams should loop
         */
        set(loop) = gtk_video_set_loop(gtkVideoPointer.reinterpret(), loop.asGBoolean())

    /**
     * The media-stream played
     */
    public open var mediaStream: MediaStream?
        /**
         * Gets the media stream managed by @self or null if none.
         *
         * @return The media stream managed by @self
         */
        get() =
            gtk_video_get_media_stream(gtkVideoPointer.reinterpret())?.run {
                MediaStream(reinterpret())
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
        set(stream) =
            gtk_video_set_media_stream(
                gtkVideoPointer.reinterpret(),
                stream?.gtkMediaStreamPointer?.reinterpret()
            )

    /**
     * Creates a new empty `GtkVideo`.
     *
     * @return a new `GtkVideo`
     */
    public constructor() : this(gtk_video_new()!!.reinterpret())

    /**
     * Creates a `GtkVideo` to play back the given @file.
     *
     * @param file a `GFile`
     * @return a new `GtkVideo`
     */
    public constructor(`file`: File? = null) :
        this(gtk_video_new_for_file(`file`?.gioFilePointer)!!.reinterpret())

    /**
     * Creates a `GtkVideo` to play back the given @filename.
     *
     * This is a utility function that calls [ctor@Gtk.Video.new_for_file],
     * See that function for details.
     *
     * @param filename filename to play back
     * @return a new `GtkVideo`
     */
    public constructor(filename: String? = null) :
        this(gtk_video_new_for_filename(filename)!!.reinterpret())

    /**
     * Creates a `GtkVideo` to play back the given @stream.
     *
     * @param stream a `GtkMediaStream`
     * @return a new `GtkVideo`
     */
    public constructor(stream: MediaStream? = null) :
        this(gtk_video_new_for_media_stream(stream?.gtkMediaStreamPointer?.reinterpret())!!.reinterpret())

    /**
     * Returns true if videos have been set to loop.
     *
     * @return true if streams should autoplay
     */
    public open fun getAutoplay(): Boolean = gtk_video_get_autoplay(gtkVideoPointer.reinterpret()).asBoolean()

    /**
     * Gets the file played by @self or null if not playing back
     * a file.
     *
     * @return The file played by @self
     */
    public open fun getFile(): File? =
        gtk_video_get_file(gtkVideoPointer.reinterpret())?.run {
            File.wrap(reinterpret())
        }

    /**
     * Returns true if videos have been set to loop.
     *
     * @return true if streams should loop
     */
    public open fun getLoop(): Boolean = gtk_video_get_loop(gtkVideoPointer.reinterpret()).asBoolean()

    /**
     * Gets the media stream managed by @self or null if none.
     *
     * @return The media stream managed by @self
     */
    public open fun getMediaStream(): MediaStream? =
        gtk_video_get_media_stream(gtkVideoPointer.reinterpret())?.run {
            MediaStream(reinterpret())
        }

    /**
     * Sets whether @self automatically starts playback when it
     * becomes visible or when a new file gets loaded.
     *
     * @param autoplay whether media streams should autoplay
     */
    public open fun setAutoplay(autoplay: Boolean): Unit =
        gtk_video_set_autoplay(gtkVideoPointer.reinterpret(), autoplay.asGBoolean())

    /**
     * Makes @self play the given @file.
     *
     * @param file the file to play
     */
    public open fun setFile(`file`: File? = null): Unit =
        gtk_video_set_file(gtkVideoPointer.reinterpret(), `file`?.gioFilePointer)

    /**
     * Makes @self play the given @filename.
     *
     * This is a utility function that calls gtk_video_set_file(),
     *
     * @param filename the filename to play
     */
    public open fun setFilename(filename: String? = null): Unit =
        gtk_video_set_filename(gtkVideoPointer.reinterpret(), filename)

    /**
     * Sets whether new files loaded by @self should be set to loop.
     *
     * @param loop whether media streams should loop
     */
    public open fun setLoop(loop: Boolean): Unit =
        gtk_video_set_loop(
            gtkVideoPointer.reinterpret(),
            loop.asGBoolean()
        )

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
    public open fun setMediaStream(stream: MediaStream? = null): Unit =
        gtk_video_set_media_stream(
            gtkVideoPointer.reinterpret(),
            stream?.gtkMediaStreamPointer?.reinterpret()
        )

    /**
     * Makes @self play the resource at the given @resource_path.
     *
     * This is a utility function that calls [method@Gtk.Video.set_file].
     *
     * @param resourcePath the resource to set
     */
    public open fun setResource(resourcePath: String? = null): Unit =
        gtk_video_set_resource(gtkVideoPointer.reinterpret(), resourcePath)

    public companion object : TypeCompanion<Video> {
        override val type: GeneratedClassKGType<Video> =
            GeneratedClassKGType(gtk_video_get_type()) { Video(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
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
        public fun newForFilename(filename: String? = null): Video =
            Video(gtk_video_new_for_filename(filename)!!.reinterpret())

        /**
         * Creates a `GtkVideo` to play back the resource at the
         * given @resource_path.
         *
         * This is a utility function that calls [ctor@Gtk.Video.new_for_file].
         *
         * @param resourcePath resource path to play back
         * @return a new `GtkVideo`
         */
        public fun newForResource(resourcePath: String? = null): Video =
            Video(gtk_video_new_for_resource(resourcePath)!!.reinterpret())
    }
}
