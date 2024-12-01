// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.Gtksource.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gtksource.GtkSourceFileSaver
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_buffer
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_compression_type
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_encoding
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_file
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_flags
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_location
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_newline_type
import org.gtkkn.native.gtksource.gtk_source_file_saver_get_type
import org.gtkkn.native.gtksource.gtk_source_file_saver_new
import org.gtkkn.native.gtksource.gtk_source_file_saver_new_with_target
import org.gtkkn.native.gtksource.gtk_source_file_saver_save_finish
import org.gtkkn.native.gtksource.gtk_source_file_saver_set_compression_type
import org.gtkkn.native.gtksource.gtk_source_file_saver_set_encoding
import org.gtkkn.native.gtksource.gtk_source_file_saver_set_flags
import org.gtkkn.native.gtksource.gtk_source_file_saver_set_newline_type
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * Save a [class@Buffer] into a file.
 *
 * A `GtkSourceFileSaver` object permits to save a [class@Buffer] into a
 * [iface@Gio.File].
 *
 * A file saver should be used only for one save operation, including errors
 * handling. If an error occurs, you can reconfigure the saver and relaunch the
 * operation with [method@FileSaver.save_async].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `callback`: Gio.AsyncReadyCallback
 * - method `encoding`: Property TypeInfo of getter and setter do not match
 */
public open class FileSaver(
    pointer: CPointer<GtkSourceFileSaver>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceFileSaverPointer: CPointer<GtkSourceFileSaver>
        get() = gPointer.reinterpret()

    /**
     * The #GtkSourceBuffer to save. The #GtkSourceFileSaver object has a
     * weak reference to the buffer.
     */
    public open val buffer: Buffer
        /**
         *
         *
         * @return the #GtkSourceBuffer to save.
         */
        get() =
            gtk_source_file_saver_get_buffer(gtksourceFileSaverPointer.reinterpret())!!.run {
                Buffer(reinterpret())
            }

    /**
     * The compression type.
     */
    public open var compressionType: CompressionType
        /**
         *
         *
         * @return the compression type.
         */
        get() =
            gtk_source_file_saver_get_compression_type(gtksourceFileSaverPointer.reinterpret()).run {
                CompressionType.fromNativeValue(this)
            }

        /**
         * Sets the compression type. By default the compression type is taken from the
         * #GtkSourceFile.
         *
         * @param compressionType the new compression type.
         */
        set(
            compressionType
        ) =
            gtk_source_file_saver_set_compression_type(
                gtksourceFileSaverPointer.reinterpret(),
                compressionType.nativeValue
            )

    /**
     * The #GtkSourceFile. The #GtkSourceFileSaver object has a weak
     * reference to the file.
     */
    public open val `file`: File
        /**
         *
         *
         * @return the #GtkSourceFile.
         */
        get() =
            gtk_source_file_saver_get_file(gtksourceFileSaverPointer.reinterpret())!!.run {
                File(reinterpret())
            }

    /**
     * File saving flags.
     */
    public open var flags: FileSaverFlags
        /**
         *
         *
         * @return the flags.
         */
        get() =
            gtk_source_file_saver_get_flags(gtksourceFileSaverPointer.reinterpret()).run {
                FileSaverFlags(this)
            }

        /**
         *
         *
         * @param flags the new flags.
         */
        set(flags) = gtk_source_file_saver_set_flags(gtksourceFileSaverPointer.reinterpret(), flags.mask)

    /**
     * The #GFile where to save the buffer. By default the location is taken
     * from the #GtkSourceFile at construction time.
     */
    public open val location: org.gtkkn.bindings.gio.File
        /**
         *
         *
         * @return the #GFile where to save the buffer to.
         */
        get() =
            gtk_source_file_saver_get_location(gtksourceFileSaverPointer.reinterpret())!!.run {
                org.gtkkn.bindings.gio.File
                    .wrap(reinterpret())
            }

    /**
     * The newline type.
     */
    public open var newlineType: NewlineType
        /**
         *
         *
         * @return the newline type.
         */
        get() =
            gtk_source_file_saver_get_newline_type(gtksourceFileSaverPointer.reinterpret()).run {
                NewlineType.fromNativeValue(this)
            }

        /**
         * Sets the newline type. By default the newline type is taken from the
         * #GtkSourceFile.
         *
         * @param newlineType the new newline type.
         */
        set(
            newlineType
        ) = gtk_source_file_saver_set_newline_type(gtksourceFileSaverPointer.reinterpret(), newlineType.nativeValue)

    /**
     * Creates a new #GtkSourceFileSaver object. The @buffer will be saved to the
     * [class@File]'s location.
     *
     * This constructor is suitable for a simple "save" operation, when the @file
     * already contains a non-null [property@File:location].
     *
     * @param buffer the #GtkSourceBuffer to save.
     * @param file the #GtkSourceFile.
     * @return a new #GtkSourceFileSaver object.
     */
    public constructor(
        buffer: Buffer,
        `file`: File,
    ) : this(
        gtk_source_file_saver_new(
            buffer.gtksourceBufferPointer.reinterpret(),
            `file`.gtksourceFilePointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Creates a new #GtkSourceFileSaver object with a target location.
     *
     * When the file saving is finished successfully, @target_location is set to the @file's
     * [property@File:location] property. If an error occurs, the previous valid
     * location is still available in [class@File].
     *
     * This constructor is suitable for a "save as" operation, or for saving a new
     * buffer for the first time.
     *
     * @param buffer the #GtkSourceBuffer to save.
     * @param file the #GtkSourceFile.
     * @param targetLocation the #GFile where to save the buffer to.
     * @return a new #GtkSourceFileSaver object.
     */
    public constructor(
        buffer: Buffer,
        `file`: File,
        targetLocation: org.gtkkn.bindings.gio.File,
    ) : this(
        gtk_source_file_saver_new_with_target(
            buffer.gtksourceBufferPointer.reinterpret(),
            `file`.gtksourceFilePointer.reinterpret(),
            targetLocation.gioFilePointer
        )!!.reinterpret()
    )

    /**
     *
     *
     * @return the #GtkSourceBuffer to save.
     */
    public open fun getBuffer(): Buffer =
        gtk_source_file_saver_get_buffer(gtksourceFileSaverPointer.reinterpret())!!.run {
            Buffer(reinterpret())
        }

    /**
     *
     *
     * @return the compression type.
     */
    public open fun getCompressionType(): CompressionType =
        gtk_source_file_saver_get_compression_type(gtksourceFileSaverPointer.reinterpret()).run {
            CompressionType.fromNativeValue(this)
        }

    /**
     *
     *
     * @return the encoding.
     */
    public open fun getEncoding(): Encoding =
        gtk_source_file_saver_get_encoding(gtksourceFileSaverPointer.reinterpret())!!.run {
            Encoding(reinterpret())
        }

    /**
     *
     *
     * @return the #GtkSourceFile.
     */
    public open fun getFile(): File =
        gtk_source_file_saver_get_file(gtksourceFileSaverPointer.reinterpret())!!.run {
            File(reinterpret())
        }

    /**
     *
     *
     * @return the flags.
     */
    public open fun getFlags(): FileSaverFlags =
        gtk_source_file_saver_get_flags(gtksourceFileSaverPointer.reinterpret()).run {
            FileSaverFlags(this)
        }

    /**
     *
     *
     * @return the #GFile where to save the buffer to.
     */
    public open fun getLocation(): org.gtkkn.bindings.gio.File =
        gtk_source_file_saver_get_location(gtksourceFileSaverPointer.reinterpret())!!.run {
            org.gtkkn.bindings.gio.File
                .wrap(reinterpret())
        }

    /**
     *
     *
     * @return the newline type.
     */
    public open fun getNewlineType(): NewlineType =
        gtk_source_file_saver_get_newline_type(gtksourceFileSaverPointer.reinterpret()).run {
            NewlineType.fromNativeValue(this)
        }

    /**
     * Finishes a file saving started with [method@FileSaver.save_async].
     *
     * If the file has been saved successfully, the following [class@File]
     * properties will be updated: the location, the encoding, the newline type and
     * the compression type.
     *
     * Since the 3.20 version, [method@Gtk.TextBuffer.set_modified] is called with false
     * if the file has been saved successfully.
     *
     * @param result a #GAsyncResult.
     * @return whether the file was saved successfully.
     */
    public open fun saveFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_source_file_saver_save_finish(
                    gtksourceFileSaverPointer.reinterpret(),
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
     * Sets the compression type. By default the compression type is taken from the
     * #GtkSourceFile.
     *
     * @param compressionType the new compression type.
     */
    public open fun setCompressionType(compressionType: CompressionType): Unit =
        gtk_source_file_saver_set_compression_type(gtksourceFileSaverPointer.reinterpret(), compressionType.nativeValue)

    /**
     * Sets the encoding. If @encoding is null, the UTF-8 encoding will be set.
     *
     * By default the encoding is taken from the #GtkSourceFile.
     *
     * @param encoding the new encoding, or null for UTF-8.
     */
    public open fun setEncoding(encoding: Encoding? = null): Unit =
        gtk_source_file_saver_set_encoding(
            gtksourceFileSaverPointer.reinterpret(),
            encoding?.gtksourceEncodingPointer?.reinterpret()
        )

    /**
     *
     *
     * @param flags the new flags.
     */
    public open fun setFlags(flags: FileSaverFlags): Unit =
        gtk_source_file_saver_set_flags(gtksourceFileSaverPointer.reinterpret(), flags.mask)

    /**
     * Sets the newline type. By default the newline type is taken from the
     * #GtkSourceFile.
     *
     * @param newlineType the new newline type.
     */
    public open fun setNewlineType(newlineType: NewlineType): Unit =
        gtk_source_file_saver_set_newline_type(gtksourceFileSaverPointer.reinterpret(), newlineType.nativeValue)

    public companion object : TypeCompanion<FileSaver> {
        override val type: GeneratedClassKGType<FileSaver> =
            GeneratedClassKGType(gtk_source_file_saver_get_type()) { FileSaver(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }
    }
}
