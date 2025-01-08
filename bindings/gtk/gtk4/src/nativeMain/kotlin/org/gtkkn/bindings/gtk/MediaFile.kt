// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkMediaFile
import org.gtkkn.native.gtk.gtk_media_file_clear
import org.gtkkn.native.gtk.gtk_media_file_get_file
import org.gtkkn.native.gtk.gtk_media_file_get_input_stream
import org.gtkkn.native.gtk.gtk_media_file_get_type
import org.gtkkn.native.gtk.gtk_media_file_new
import org.gtkkn.native.gtk.gtk_media_file_new_for_file
import org.gtkkn.native.gtk.gtk_media_file_new_for_filename
import org.gtkkn.native.gtk.gtk_media_file_new_for_input_stream
import org.gtkkn.native.gtk.gtk_media_file_new_for_resource
import org.gtkkn.native.gtk.gtk_media_file_set_file
import org.gtkkn.native.gtk.gtk_media_file_set_filename
import org.gtkkn.native.gtk.gtk_media_file_set_input_stream
import org.gtkkn.native.gtk.gtk_media_file_set_resource
import kotlin.String
import kotlin.Unit

/**
 * `GtkMediaFile` implements `GtkMediaStream` for files.
 *
 * This provides a simple way to play back video files with GTK.
 *
 * GTK provides a GIO extension point for `GtkMediaFile` implementations
 * to allow for external implementations using various media frameworks.
 *
 * GTK itself includes an implementation using GStreamer.
 */
public open class MediaFile(pointer: CPointer<GtkMediaFile>) :
    MediaStream(pointer.reinterpret()),
    KGTyped {
    public val gtkMediaFilePointer: CPointer<GtkMediaFile>
        get() = gPointer.reinterpret()

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gPointer.reinterpret()

    /**
     * The file being played back or null if not playing a file.
     */
    public open var `file`: File?
        /**
         * Returns the file that @self is currently playing from.
         *
         * When @self is not playing or not playing from a file,
         * null is returned.
         *
         * @return The currently playing file
         */
        get() = gtk_media_file_get_file(gtkMediaFilePointer)?.run {
            File.wrap(reinterpret())
        }

        /**
         * Sets the `GtkMediaFile` to play the given file.
         *
         * If any file is still playing, stop playing it.
         *
         * @param file the file to play
         */
        set(`file`) = gtk_media_file_set_file(gtkMediaFilePointer, `file`?.gioFilePointer)

    /**
     * The stream being played back or null if not playing a stream.
     *
     * This is null when playing a file.
     */
    public open var inputStream: InputStream?
        /**
         * Returns the stream that @self is currently playing from.
         *
         * When @self is not playing or not playing from a stream,
         * null is returned.
         *
         * @return The currently playing stream
         */
        get() = gtk_media_file_get_input_stream(gtkMediaFilePointer)?.run {
            InputStream(this)
        }

        /**
         * Sets the `GtkMediaFile` to play the given stream.
         *
         * If anything is still playing, stop playing it.
         *
         * Full control about the @stream is assumed for the duration of
         * playback. The stream will not be closed.
         *
         * @param stream the stream to play from
         */
        set(stream) = gtk_media_file_set_input_stream(gtkMediaFilePointer, stream?.gioInputStreamPointer)

    /**
     * Creates a new empty media file.
     *
     * @return a new `GtkMediaFile`
     */
    public constructor() : this(gtk_media_file_new()!!.reinterpret())

    /**
     * Creates a new media file to play @file.
     *
     * @param file The file to play
     * @return a new `GtkMediaFile` playing @file
     */
    public constructor(`file`: File) : this(gtk_media_file_new_for_file(`file`.gioFilePointer)!!.reinterpret())

    /**
     * Creates a new media file for the given filename.
     *
     * This is a utility function that converts the given @filename
     * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
     *
     * @param filename filename to open
     * @return a new `GtkMediaFile` playing @filename
     */
    public constructor(filename: String) : this(gtk_media_file_new_for_filename(filename)!!.reinterpret())

    /**
     * Creates a new media file to play @stream.
     *
     * If you want the resulting media to be seekable,
     * the stream should implement the `GSeekable` interface.
     *
     * @param stream The stream to play
     * @return a new `GtkMediaFile`
     */
    public constructor(
        stream: InputStream,
    ) : this(gtk_media_file_new_for_input_stream(stream.gioInputStreamPointer)!!.reinterpret())

    /**
     * Resets the media file to be empty.
     */
    public open fun clear(): Unit = gtk_media_file_clear(gtkMediaFilePointer)

    /**
     * Sets the `GtkMediaFile to play the given file.
     *
     * This is a utility function that converts the given @filename
     * to a `GFile` and calls [method@Gtk.MediaFile.set_file].
     *
     * @param filename name of file to play
     */
    public open fun setFilename(filename: String? = null): Unit =
        gtk_media_file_set_filename(gtkMediaFilePointer, filename)

    /**
     * Sets the `GtkMediaFile to play the given resource.
     *
     * This is a utility function that converts the given @resource_path
     * to a `GFile` and calls [method@Gtk.MediaFile.set_file].
     *
     * @param resourcePath path to resource to play
     */
    public open fun setResource(resourcePath: String? = null): Unit =
        gtk_media_file_set_resource(gtkMediaFilePointer, resourcePath)

    public companion object : TypeCompanion<MediaFile> {
        override val type: GeneratedClassKGType<MediaFile> =
            GeneratedClassKGType(gtk_media_file_get_type()) { MediaFile(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new media file for the given filename.
         *
         * This is a utility function that converts the given @filename
         * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
         *
         * @param filename filename to open
         * @return a new `GtkMediaFile` playing @filename
         */
        public fun newForFilename(filename: String): MediaFile =
            MediaFile(gtk_media_file_new_for_filename(filename)!!.reinterpret())

        /**
         * Creates a new new media file for the given resource.
         *
         * This is a utility function that converts the given @resource
         * to a `GFile` and calls [ctor@Gtk.MediaFile.new_for_file].
         *
         * @param resourcePath resource path to open
         * @return a new `GtkMediaFile` playing @resource_path
         */
        public fun newForResource(resourcePath: String): MediaFile =
            MediaFile(gtk_media_file_new_for_resource(resourcePath)!!.reinterpret())

        /**
         * Get the GType of MediaFile
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_media_file_get_type()
    }
}
