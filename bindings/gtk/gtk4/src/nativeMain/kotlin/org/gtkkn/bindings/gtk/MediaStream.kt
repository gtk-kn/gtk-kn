// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Surface
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkMediaStream
import org.gtkkn.native.gtk.gtk_media_stream_ended
import org.gtkkn.native.gtk.gtk_media_stream_gerror
import org.gtkkn.native.gtk.gtk_media_stream_get_duration
import org.gtkkn.native.gtk.gtk_media_stream_get_ended
import org.gtkkn.native.gtk.gtk_media_stream_get_error
import org.gtkkn.native.gtk.gtk_media_stream_get_loop
import org.gtkkn.native.gtk.gtk_media_stream_get_muted
import org.gtkkn.native.gtk.gtk_media_stream_get_playing
import org.gtkkn.native.gtk.gtk_media_stream_get_timestamp
import org.gtkkn.native.gtk.gtk_media_stream_get_type
import org.gtkkn.native.gtk.gtk_media_stream_get_volume
import org.gtkkn.native.gtk.gtk_media_stream_has_audio
import org.gtkkn.native.gtk.gtk_media_stream_has_video
import org.gtkkn.native.gtk.gtk_media_stream_is_prepared
import org.gtkkn.native.gtk.gtk_media_stream_is_seekable
import org.gtkkn.native.gtk.gtk_media_stream_is_seeking
import org.gtkkn.native.gtk.gtk_media_stream_pause
import org.gtkkn.native.gtk.gtk_media_stream_play
import org.gtkkn.native.gtk.gtk_media_stream_prepared
import org.gtkkn.native.gtk.gtk_media_stream_realize
import org.gtkkn.native.gtk.gtk_media_stream_seek
import org.gtkkn.native.gtk.gtk_media_stream_seek_failed
import org.gtkkn.native.gtk.gtk_media_stream_seek_success
import org.gtkkn.native.gtk.gtk_media_stream_set_loop
import org.gtkkn.native.gtk.gtk_media_stream_set_muted
import org.gtkkn.native.gtk.gtk_media_stream_set_playing
import org.gtkkn.native.gtk.gtk_media_stream_set_volume
import org.gtkkn.native.gtk.gtk_media_stream_stream_ended
import org.gtkkn.native.gtk.gtk_media_stream_stream_prepared
import org.gtkkn.native.gtk.gtk_media_stream_stream_unprepared
import org.gtkkn.native.gtk.gtk_media_stream_unprepared
import org.gtkkn.native.gtk.gtk_media_stream_unrealize
import org.gtkkn.native.gtk.gtk_media_stream_update
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkMediaStream` is the integration point for media playback inside GTK.
 *
 * GTK provides an implementation of the `GtkMediaStream` interface that
 * is called [class@Gtk.MediaFile].
 *
 * Apart from application-facing API for stream playback, `GtkMediaStream`
 * has a number of APIs that are only useful for implementations and should
 * not be used in applications:
 * [method@Gtk.MediaStream.prepared],
 * [method@Gtk.MediaStream.unprepared],
 * [method@Gtk.MediaStream.update],
 * [method@Gtk.MediaStream.ended],
 * [method@Gtk.MediaStream.seek_success],
 * [method@Gtk.MediaStream.seek_failed],
 * [method@Gtk.MediaStream.gerror],
 * [method@Gtk.MediaStream.error],
 * [method@Gtk.MediaStream.error_valist].
 *
 * ## Skipped during bindings generation
 *
 * - method `error`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - method `ended`: Property has no getter nor setter
 * - method `has-audio`: Property has no getter nor setter
 * - method `has-video`: Property has no getter nor setter
 * - method `prepared`: Property has no getter nor setter
 * - method `seekable`: Property has no getter nor setter
 * - method `seeking`: Property has no getter nor setter
 */
public open class MediaStream(pointer: CPointer<GtkMediaStream>) :
    Object(pointer.reinterpret()),
    Paintable,
    KGTyped {
    public val gtkMediaStreamPointer: CPointer<GtkMediaStream>
        get() = gPointer.reinterpret()

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gPointer.reinterpret()

    /**
     * The stream's duration in microseconds or 0 if unknown.
     */
    public open val duration: gint64
        /**
         * Gets the duration of the stream.
         *
         * If the duration is not known, 0 will be returned.
         *
         * @return the duration of the stream or 0 if not known.
         */
        get() = gtk_media_stream_get_duration(gtkMediaStreamPointer)

    /**
     * null for a properly working stream or the `GError`
     * that the stream is in.
     */
    public open val error: Error?
        /**
         * If the stream is in an error state, returns the `GError`
         * explaining that state.
         *
         * Any type of error can be reported here depending on the
         * implementation of the media stream.
         *
         * A media stream in an error cannot be operated on, calls
         * like [method@Gtk.MediaStream.play] or
         * [method@Gtk.MediaStream.seek] will not have any effect.
         *
         * `GtkMediaStream` itself does not provide a way to unset
         * an error, but implementations may provide options. For example,
         * a [class@Gtk.MediaFile] will unset errors when a new source is
         * set, e.g. with [method@Gtk.MediaFile.set_file].
         *
         * @return null if not in an
         *   error state or the `GError` of the stream
         */
        get() = gtk_media_stream_get_error(gtkMediaStreamPointer)?.run {
            Error(this)
        }

    /**
     * Try to restart the media from the beginning once it ended.
     */
    public open var loop: Boolean
        /**
         * Returns whether the stream is set to loop.
         *
         * See [method@Gtk.MediaStream.set_loop] for details.
         *
         * @return true if the stream should loop
         */
        get() = gtk_media_stream_get_loop(gtkMediaStreamPointer).asBoolean()

        /**
         * Sets whether the stream should loop.
         *
         * In this case, it will attempt to restart playback
         * from the beginning instead of stopping at the end.
         *
         * Not all streams may support looping, in particular
         * non-seekable streams. Those streams will ignore the
         * loop setting and just end.
         *
         * @param loop true if the stream should loop
         */
        set(loop) = gtk_media_stream_set_loop(gtkMediaStreamPointer, loop.asGBoolean())

    /**
     * Whether the audio stream should be muted.
     */
    public open var muted: Boolean
        /**
         * Returns whether the audio for the stream is muted.
         *
         * See [method@Gtk.MediaStream.set_muted] for details.
         *
         * @return true if the stream is muted
         */
        get() = gtk_media_stream_get_muted(gtkMediaStreamPointer).asBoolean()

        /**
         * Sets whether the audio stream should be muted.
         *
         * Muting a stream will cause no audio to be played, but it
         * does not modify the volume. This means that muting and
         * then unmuting the stream will restore the volume settings.
         *
         * If the stream has no audio, calling this function will
         * still work but it will not have an audible effect.
         *
         * @param muted true if the stream should be muted
         */
        set(muted) = gtk_media_stream_set_muted(gtkMediaStreamPointer, muted.asGBoolean())

    /**
     * Whether the stream is currently playing.
     */
    public open var playing: Boolean
        /**
         * Return whether the stream is currently playing.
         *
         * @return true if the stream is playing
         */
        get() = gtk_media_stream_get_playing(gtkMediaStreamPointer).asBoolean()

        /**
         * Starts or pauses playback of the stream.
         *
         * @param playing whether to start or pause playback
         */
        set(playing) = gtk_media_stream_set_playing(gtkMediaStreamPointer, playing.asGBoolean())

    /**
     * The current presentation timestamp in microseconds.
     */
    public open val timestamp: gint64
        /**
         * Returns the current presentation timestamp in microseconds.
         *
         * @return the timestamp in microseconds
         */
        get() = gtk_media_stream_get_timestamp(gtkMediaStreamPointer)

    /**
     * Volume of the audio stream.
     */
    public open var volume: gdouble
        /**
         * Returns the volume of the audio for the stream.
         *
         * See [method@Gtk.MediaStream.set_volume] for details.
         *
         * @return volume of the stream from 0.0 to 1.0
         */
        get() = gtk_media_stream_get_volume(gtkMediaStreamPointer)

        /**
         * Sets the volume of the audio stream.
         *
         * This function call will work even if the stream is muted.
         *
         * The given @volume should range from 0.0 for silence to 1.0
         * for as loud as possible. Values outside of this range will
         * be clamped to the nearest value.
         *
         * If the stream has no audio or is muted, calling this function
         * will still work but it will not have an immediate audible effect.
         * When the stream is unmuted, the new volume setting will take effect.
         *
         * @param volume New volume of the stream from 0.0 to 1.0
         */
        set(volume) = gtk_media_stream_set_volume(gtkMediaStreamPointer, volume)

    /**
     * Pauses the media stream and marks it as ended.
     *
     * This is a hint only, calls to [method@Gtk.MediaStream.play]
     * may still happen.
     *
     * The media stream must be prepared when this function is called.
     */
    public open fun ended(): Unit = gtk_media_stream_ended(gtkMediaStreamPointer)

    /**
     * Sets @self into an error state.
     *
     * This will pause the stream (you can check for an error
     * via [method@Gtk.MediaStream.get_error] in your
     * GtkMediaStream.pause() implementation), abort pending
     * seeks and mark the stream as prepared.
     *
     * if the stream is already in an error state, this call
     * will be ignored and the existing error will be retained.
     *
     * To unset an error, the stream must be reset via a call to
     * [method@Gtk.MediaStream.unprepared].
     *
     * @param error the `GError` to set
     */
    public open fun gerror(error: Error): Unit = gtk_media_stream_gerror(gtkMediaStreamPointer, error.gPointer)

    /**
     * Returns whether the streams playback is finished.
     *
     * @return true if playback is finished
     */
    public open fun getEnded(): Boolean = gtk_media_stream_get_ended(gtkMediaStreamPointer).asBoolean()

    /**
     * Returns whether the stream has audio.
     *
     * @return true if the stream has audio
     */
    public open fun hasAudio(): Boolean = gtk_media_stream_has_audio(gtkMediaStreamPointer).asBoolean()

    /**
     * Returns whether the stream has video.
     *
     * @return true if the stream has video
     */
    public open fun hasVideo(): Boolean = gtk_media_stream_has_video(gtkMediaStreamPointer).asBoolean()

    /**
     * Returns whether the stream has finished initializing.
     *
     * At this point the existence of audio and video is known.
     *
     * @return true if the stream is prepared
     */
    public open fun isPrepared(): Boolean = gtk_media_stream_is_prepared(gtkMediaStreamPointer).asBoolean()

    /**
     * Checks if a stream may be seekable.
     *
     * This is meant to be a hint. Streams may not allow seeking even if
     * this function returns true. However, if this function returns
     * false, streams are guaranteed to not be seekable and user interfaces
     * may hide controls that allow seeking.
     *
     * It is allowed to call [method@Gtk.MediaStream.seek] on a non-seekable
     * stream, though it will not do anything.
     *
     * @return true if the stream may support seeking
     */
    public open fun isSeekable(): Boolean = gtk_media_stream_is_seekable(gtkMediaStreamPointer).asBoolean()

    /**
     * Checks if there is currently a seek operation going on.
     *
     * @return true if a seek operation is ongoing.
     */
    public open fun isSeeking(): Boolean = gtk_media_stream_is_seeking(gtkMediaStreamPointer).asBoolean()

    /**
     * Pauses playback of the stream.
     *
     * If the stream is not playing, do nothing.
     */
    public open fun pause(): Unit = gtk_media_stream_pause(gtkMediaStreamPointer)

    /**
     * Starts playing the stream.
     *
     * If the stream is in error or already playing, do nothing.
     */
    public open fun play(): Unit = gtk_media_stream_play(gtkMediaStreamPointer)

    /**
     * Same as gtk_media_stream_stream_prepared().
     *
     * @param hasAudio true if the stream should advertise audio support
     * @param hasVideo true if the stream should advertise video support
     * @param seekable true if the stream should advertise seekability
     * @param duration The duration of the stream or 0 if unknown
     */
    public open fun prepared(hasAudio: Boolean, hasVideo: Boolean, seekable: Boolean, duration: gint64): Unit =
        gtk_media_stream_prepared(
            gtkMediaStreamPointer,
            hasAudio.asGBoolean(),
            hasVideo.asGBoolean(),
            seekable.asGBoolean(),
            duration
        )

    /**
     * Called by users to attach the media stream to a `GdkSurface` they manage.
     *
     * The stream can then access the resources of @surface for its
     * rendering purposes. In particular, media streams might want to
     * create a `GdkGLContext` or sync to the `GdkFrameClock`.
     *
     * Whoever calls this function is responsible for calling
     * [method@Gtk.MediaStream.unrealize] before either the stream
     * or @surface get destroyed.
     *
     * Multiple calls to this function may happen from different
     * users of the video, even with the same @surface. Each of these
     * calls must be followed by its own call to
     * [method@Gtk.MediaStream.unrealize].
     *
     * It is not required to call this function to make a media stream work.
     *
     * @param surface a `GdkSurface`
     */
    public open fun realize(surface: Surface): Unit =
        gtk_media_stream_realize(gtkMediaStreamPointer, surface.gdkSurfacePointer)

    /**
     * Start a seek operation on @self to @timestamp.
     *
     * If @timestamp is out of range, it will be clamped.
     *
     * Seek operations may not finish instantly. While a
     * seek operation is in process, the [property@Gtk.MediaStream:seeking]
     * property will be set.
     *
     * When calling gtk_media_stream_seek() during an
     * ongoing seek operation, the new seek will override
     * any pending seek.
     *
     * @param timestamp timestamp to seek to.
     */
    public open fun seek(timestamp: gint64): Unit = gtk_media_stream_seek(gtkMediaStreamPointer, timestamp)

    /**
     * Ends a seek operation started via GtkMediaStream.seek() as a failure.
     *
     * This will not cause an error on the stream and will assume that
     * playback continues as if no seek had happened.
     *
     * See [method@Gtk.MediaStream.seek_success] for the other way of
     * ending a seek.
     */
    public open fun seekFailed(): Unit = gtk_media_stream_seek_failed(gtkMediaStreamPointer)

    /**
     * Ends a seek operation started via GtkMediaStream.seek() successfully.
     *
     * This function will unset the GtkMediaStream:ended property
     * if it was set.
     *
     * See [method@Gtk.MediaStream.seek_failed] for the other way of
     * ending a seek.
     */
    public open fun seekSuccess(): Unit = gtk_media_stream_seek_success(gtkMediaStreamPointer)

    /**
     * Pauses the media stream and marks it as ended.
     *
     * This is a hint only, calls to [method@Gtk.MediaStream.play]
     * may still happen.
     *
     * The media stream must be prepared when this function is called.
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun streamEnded(): Unit = gtk_media_stream_stream_ended(gtkMediaStreamPointer)

    /**
     * Called by `GtkMediaStream` implementations to advertise the stream
     * being ready to play and providing details about the stream.
     *
     * Note that the arguments are hints. If the stream implementation
     * cannot determine the correct values, it is better to err on the
     * side of caution and return true. User interfaces will use those
     * values to determine what controls to show.
     *
     * This function may not be called again until the stream has been
     * reset via [method@Gtk.MediaStream.stream_unprepared].
     *
     * @param hasAudio true if the stream should advertise audio support
     * @param hasVideo true if the stream should advertise video support
     * @param seekable true if the stream should advertise seekability
     * @param duration The duration of the stream or 0 if unknown
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun streamPrepared(hasAudio: Boolean, hasVideo: Boolean, seekable: Boolean, duration: gint64): Unit =
        gtk_media_stream_stream_prepared(
            gtkMediaStreamPointer,
            hasAudio.asGBoolean(),
            hasVideo.asGBoolean(),
            seekable.asGBoolean(),
            duration
        )

    /**
     * Resets a given media stream implementation.
     *
     * [method@Gtk.MediaStream.stream_prepared] can then be called again.
     *
     * This function will also reset any error state the stream was in.
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public open fun streamUnprepared(): Unit = gtk_media_stream_stream_unprepared(gtkMediaStreamPointer)

    /**
     * Same as gtk_media_stream_stream_unprepared().
     */
    public open fun unprepared(): Unit = gtk_media_stream_unprepared(gtkMediaStreamPointer)

    /**
     * Undoes a previous call to gtk_media_stream_realize().
     *
     * This causes the stream to release all resources it had
     * allocated from @surface.
     *
     * @param surface the `GdkSurface` the stream was realized with
     */
    public open fun unrealize(surface: Surface): Unit =
        gtk_media_stream_unrealize(gtkMediaStreamPointer, surface.gdkSurfacePointer)

    /**
     * Media stream implementations should regularly call this
     * function to update the timestamp reported by the stream.
     *
     * It is up to implementations to call this at the frequency
     * they deem appropriate.
     *
     * The media stream must be prepared when this function is called.
     *
     * @param timestamp the new timestamp
     */
    public open fun update(timestamp: gint64): Unit = gtk_media_stream_update(gtkMediaStreamPointer, timestamp)

    public companion object : TypeCompanion<MediaStream> {
        override val type: GeneratedClassKGType<MediaStream> =
            GeneratedClassKGType(gtk_media_stream_get_type()) { MediaStream(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MediaStream
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_media_stream_get_type()
    }
}
