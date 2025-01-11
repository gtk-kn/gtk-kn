// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkMediaControls
import org.gtkkn.native.gtk.gtk_media_controls_get_media_stream
import org.gtkkn.native.gtk.gtk_media_controls_get_type
import org.gtkkn.native.gtk.gtk_media_controls_new
import org.gtkkn.native.gtk.gtk_media_controls_set_media_stream

/**
 * `GtkMediaControls` is a widget to show controls for a video.
 *
 * ![An example GtkMediaControls](media-controls.png)
 *
 * Usually, `GtkMediaControls` is used as part of [class@Gtk.Video].
 */
public open class MediaControls(public val gtkMediaControlsPointer: CPointer<GtkMediaControls>) :
    Widget(gtkMediaControlsPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The media-stream managed by this object or null if none.
     */
    public open var mediaStream: MediaStream?
        /**
         * Gets the media stream managed by @controls or null if none.
         *
         * @return The media stream managed by @controls
         */
        get() = gtk_media_controls_get_media_stream(gtkMediaControlsPointer)?.run {
            MediaStream.MediaStreamImpl(this)
        }

        /**
         * Sets the stream that is controlled by @controls.
         *
         * @param stream a `GtkMediaStream`
         */
        set(stream) = gtk_media_controls_set_media_stream(gtkMediaControlsPointer, stream?.gtkMediaStreamPointer)

    /**
     * Creates a new `GtkMediaControls` managing the @stream passed to it.
     *
     * @param stream a `GtkMediaStream` to manage
     * @return a new `GtkMediaControls`
     */
    public constructor(
        stream: MediaStream? = null,
    ) : this(gtk_media_controls_new(stream?.gtkMediaStreamPointer)!!.reinterpret())

    public companion object : TypeCompanion<MediaControls> {
        override val type: GeneratedClassKGType<MediaControls> =
            GeneratedClassKGType(gtk_media_controls_get_type()) { MediaControls(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MediaControls
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_media_controls_get_type()
    }
}
