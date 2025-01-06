// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.FileProgressCallback
import org.gtkkn.bindings.gio.FileProgressCallbackFunc
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.GtkSource.resolveException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceFileLoader
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_buffer
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_compression_type
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_encoding
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_file
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_input_stream
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_location
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_newline_type
import org.gtkkn.native.gtksource.gtk_source_file_loader_get_type
import org.gtkkn.native.gtksource.gtk_source_file_loader_load_async
import org.gtkkn.native.gtksource.gtk_source_file_loader_load_finish
import org.gtkkn.native.gtksource.gtk_source_file_loader_new
import org.gtkkn.native.gtksource.gtk_source_file_loader_new_from_stream
import org.gtkkn.native.gtksource.gtk_source_file_loader_set_candidate_encodings
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * Load a file into a GtkSourceBuffer.
 *
 * A `GtkSourceFileLoader` object permits to load the contents of a [iface@Gio.File] or a
 * [class@Gio.InputStream] into a [class@Buffer].
 *
 * A file loader should be used only for one load operation, including errors
 * handling. If an error occurs, you can reconfigure the loader and relaunch the
 * operation with [method@FileLoader.load_async].
 *
 * Running a `GtkSourceFileLoader` is an undoable action for the
 * [class@Buffer].
 *
 * After a file loading, the buffer is reset to the contents provided by the
 * [iface@Gio.File] or [class@Gio.InputStream], so the buffer is set as “unmodified”, that is,
 * [method@Gtk.TextBuffer.set_modified] is called with false. If the contents isn't
 * saved somewhere (for example if you load from stdin), then you should
 * probably call [method@Gtk.TextBuffer.set_modified] with true after calling
 * [method@FileLoader.load_finish].
 */
public open class FileLoader(pointer: CPointer<GtkSourceFileLoader>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceFileLoaderPointer: CPointer<GtkSourceFileLoader>
        get() = gPointer.reinterpret()

    /**
     * The #GtkSourceBuffer to load the contents into. The
     * #GtkSourceFileLoader object has a weak reference to the buffer.
     */
    public open val buffer: Buffer
        /**
         *
         *
         * @return the #GtkSourceBuffer to load the contents into.
         */
        get() = gtk_source_file_loader_get_buffer(gtksourceFileLoaderPointer.reinterpret())!!.run {
            Buffer(reinterpret())
        }

    /**
     * The #GtkSourceFile. The #GtkSourceFileLoader object has a weak
     * reference to the file.
     */
    public open val `file`: File
        /**
         *
         *
         * @return the #GtkSourceFile.
         */
        get() = gtk_source_file_loader_get_file(gtksourceFileLoaderPointer.reinterpret())!!.run {
            File(reinterpret())
        }

    /**
     * The #GInputStream to load. Useful for reading stdin. If this property
     * is set, the #GtkSourceFileLoader:location property is ignored.
     */
    public open val inputStream: InputStream?
        /**
         *
         *
         * @return the #GInputStream to load, or null
         * if a #GFile is used.
         */
        get() = gtk_source_file_loader_get_input_stream(gtksourceFileLoaderPointer.reinterpret())?.run {
            InputStream(reinterpret())
        }

    /**
     * The #GFile to load. If the #GtkSourceFileLoader:input-stream is
     * null, by default the location is taken from the #GtkSourceFile at
     * construction time.
     */
    public open val location: org.gtkkn.bindings.gio.File?
        /**
         *
         *
         * @return the #GFile to load, or null
         * if an input stream is used.
         */
        get() = gtk_source_file_loader_get_location(gtksourceFileLoaderPointer.reinterpret())?.run {
            org.gtkkn.bindings.gio.File.wrap(reinterpret())
        }

    /**
     * Creates a new `GtkSourceFileLoader` object. The contents is read from the
     * [class@File]'s location.
     *
     * If not already done, call [method@File.set_location] before calling this constructor.
     * The previous location is anyway not needed, because as soon as the file loading begins,
     * the @buffer is emptied.
     *
     * @param buffer the #GtkSourceBuffer to load the contents into.
     * @param file the #GtkSourceFile.
     * @return a new #GtkSourceFileLoader object.
     */
    public constructor(
        buffer: Buffer,
        `file`: File,
    ) : this(
        gtk_source_file_loader_new(
            buffer.gtksourceBufferPointer.reinterpret(),
            `file`.gtksourceFilePointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Creates a new #GtkSourceFileLoader object. The contents is read from @stream.
     *
     * @param buffer the #GtkSourceBuffer to load the contents into.
     * @param file the #GtkSourceFile.
     * @param stream the #GInputStream to load, e.g. stdin.
     * @return a new #GtkSourceFileLoader object.
     */
    public constructor(
        buffer: Buffer,
        `file`: File,
        stream: InputStream,
    ) : this(
        gtk_source_file_loader_new_from_stream(
            buffer.gtksourceBufferPointer.reinterpret(),
            `file`.gtksourceFilePointer.reinterpret(),
            stream.gioInputStreamPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     *
     *
     * @return the detected compression type.
     */
    public open fun getCompressionType(): CompressionType =
        gtk_source_file_loader_get_compression_type(gtksourceFileLoaderPointer.reinterpret()).run {
            CompressionType.fromNativeValue(this)
        }

    /**
     *
     *
     * @return the detected file encoding.
     */
    public open fun getEncoding(): Encoding =
        gtk_source_file_loader_get_encoding(gtksourceFileLoaderPointer.reinterpret())!!.run {
            Encoding(reinterpret())
        }

    /**
     *
     *
     * @return the detected newline type.
     */
    public open fun getNewlineType(): NewlineType =
        gtk_source_file_loader_get_newline_type(gtksourceFileLoaderPointer.reinterpret()).run {
            NewlineType.fromNativeValue(this)
        }

    /**
     * Loads asynchronously the file or input stream contents into the [class@Buffer].
     *
     * See the [iface@Gio.AsyncResult] documentation to know how to use this
     * function.
     *
     * @param ioPriority the I/O priority of the request. E.g. %G_PRIORITY_LOW,
     *   %G_PRIORITY_DEFAULT or %G_PRIORITY_HIGH.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param progressCallback function to call back with
     *   progress information, or null if progress information is not needed.
     * @param callback a #GAsyncReadyCallback to call when the request is
     *   satisfied.
     */
    public open fun loadAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        progressCallback: FileProgressCallback?,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_source_file_loader_load_async(
        gtksourceFileLoaderPointer.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret(),
        progressCallback?.let {
            FileProgressCallbackFunc.reinterpret()
        },
        progressCallback?.let {
            StableRef.create(progressCallback).asCPointer()
        },
        progressCallback?.let {
            staticStableRefDestroy.reinterpret()
        },
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes a file loading started with [method@FileLoader.load_async].
     *
     * If the contents has been loaded, the following [class@File] properties will
     * be updated: the location, the encoding, the newline type and the compression
     * type.
     *
     * @param result a #GAsyncResult.
     * @return whether the contents has been loaded successfully.
     */
    public open fun loadFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_source_file_loader_load_finish(
            gtksourceFileLoaderPointer.reinterpret(),
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets the candidate encodings for the file loading.
     *
     * The encodings are tried in the same order as the list.
     *
     * For convenience, @candidate_encodings can contain duplicates. Only the first
     * occurrence of a duplicated encoding is kept in the list.
     *
     * By default the candidate encodings are (in that order in the list):
     *
     * 1. If set, the [class@File]'s encoding as returned by [method@File.get_encoding].
     * 2. The default candidates as returned by [func@Encoding.get_default_candidates].
     *
     * @param candidateEncodings a list of
     *   #GtkSourceEncoding<!-- -->s.
     */
    public open fun setCandidateEncodings(candidateEncodings: SList): Unit =
        gtk_source_file_loader_set_candidate_encodings(
            gtksourceFileLoaderPointer.reinterpret(),
            candidateEncodings.gPointer.reinterpret()
        )

    public companion object : TypeCompanion<FileLoader> {
        override val type: GeneratedClassKGType<FileLoader> =
            GeneratedClassKGType(gtk_source_file_loader_get_type()) { FileLoader(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of FileLoader
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_file_loader_get_type()
    }
}
