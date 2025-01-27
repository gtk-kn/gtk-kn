// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.GtkSource.resolveException
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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
import org.gtkkn.native.gtksource.gtk_source_file_saver_save_async
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
 * - method `encoding`: Property TypeInfo of getter and setter do not match
 */
public open class FileSaver(public val gtksourceFileSaverPointer: CPointer<GtkSourceFileSaver>) :
    Object(gtksourceFileSaverPointer.reinterpret()),
    KGTyped {
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
        get() = gtk_source_file_saver_get_buffer(gtksourceFileSaverPointer)!!.run {
            Buffer(this)
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
        get() = gtk_source_file_saver_get_compression_type(gtksourceFileSaverPointer).run {
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
        ) = gtk_source_file_saver_set_compression_type(gtksourceFileSaverPointer, compressionType.nativeValue)

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
        get() = gtk_source_file_saver_get_file(gtksourceFileSaverPointer)!!.run {
            File(this)
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
        get() = gtk_source_file_saver_get_flags(gtksourceFileSaverPointer).run {
            FileSaverFlags(this)
        }

        /**
         *
         *
         * @param flags the new flags.
         */
        set(flags) = gtk_source_file_saver_set_flags(gtksourceFileSaverPointer, flags.mask)

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
        get() = gtk_source_file_saver_get_location(gtksourceFileSaverPointer)!!.run {
            org.gtkkn.bindings.gio.File.FileImpl(reinterpret())
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
        get() = gtk_source_file_saver_get_newline_type(gtksourceFileSaverPointer).run {
            NewlineType.fromNativeValue(this)
        }

        /**
         * Sets the newline type. By default the newline type is taken from the
         * #GtkSourceFile.
         *
         * @param newlineType the new newline type.
         */
        set(newlineType) = gtk_source_file_saver_set_newline_type(gtksourceFileSaverPointer, newlineType.nativeValue)

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
    ) : this(gtk_source_file_saver_new(buffer.gtksourceBufferPointer, `file`.gtksourceFilePointer)!!.reinterpret())

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
            buffer.gtksourceBufferPointer,
            `file`.gtksourceFilePointer,
            targetLocation.gioFilePointer
        )!!.reinterpret()
    )

    /**
     *
     *
     * @return the encoding.
     */
    public open fun getEncoding(): Encoding = gtk_source_file_saver_get_encoding(gtksourceFileSaverPointer)!!.run {
        Encoding(this)
    }

    /**
     * Saves asynchronously the buffer into the file.
     *
     * See the [iface@Gio.AsyncResult] documentation to know how to use this function.
     *
     * @param ioPriority the I/O priority of the request. E.g. %G_PRIORITY_LOW,
     *   %G_PRIORITY_DEFAULT or %G_PRIORITY_HIGH.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param progressCallback function to call back with
     *   progress information, or null if progress information is not needed.
     * @param callback a #GAsyncReadyCallback to call when the request is
     *   satisfied.
     */
    public open fun saveAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        progressCallback: FileProgressCallback?,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_source_file_saver_save_async(
        gtksourceFileSaverPointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
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
    public open fun saveFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_source_file_saver_save_finish(
            gtksourceFileSaverPointer,
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
     * Sets the encoding. If @encoding is null, the UTF-8 encoding will be set.
     *
     * By default the encoding is taken from the #GtkSourceFile.
     *
     * @param encoding the new encoding, or null for UTF-8.
     */
    public open fun setEncoding(encoding: Encoding? = null): Unit =
        gtk_source_file_saver_set_encoding(gtksourceFileSaverPointer, encoding?.gtksourceEncodingPointer)

    public companion object : TypeCompanion<FileSaver> {
        override val type: GeneratedClassKGType<FileSaver> =
            GeneratedClassKGType(getTypeOrNull("gtk_source_file_saver_get_type")!!) { FileSaver(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of FileSaver
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_file_saver_get_type()
    }
}
