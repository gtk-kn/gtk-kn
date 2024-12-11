// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceFile
import org.gtkkn.native.gtksource.gtk_source_file_check_file_on_disk
import org.gtkkn.native.gtksource.gtk_source_file_get_compression_type
import org.gtkkn.native.gtksource.gtk_source_file_get_encoding
import org.gtkkn.native.gtksource.gtk_source_file_get_location
import org.gtkkn.native.gtksource.gtk_source_file_get_newline_type
import org.gtkkn.native.gtksource.gtk_source_file_get_type
import org.gtkkn.native.gtksource.gtk_source_file_is_deleted
import org.gtkkn.native.gtksource.gtk_source_file_is_externally_modified
import org.gtkkn.native.gtksource.gtk_source_file_is_local
import org.gtkkn.native.gtksource.gtk_source_file_is_readonly
import org.gtkkn.native.gtksource.gtk_source_file_new
import org.gtkkn.native.gtksource.gtk_source_file_set_location
import org.gtkkn.native.gtksource.gtk_source_file_set_mount_operation_factory
import kotlin.Boolean
import kotlin.Unit

/**
 * On-disk representation of a [class@Buffer].
 *
 * A `GtkSourceFile` object is the on-disk representation of a [class@Buffer].
 * With a `GtkSourceFile`, you can create and configure a [class@FileLoader]
 * and [class@FileSaver] which take by default the values of the
 * `GtkSourceFile` properties (except for the file loader which auto-detect some
 * properties). On a successful load or save operation, the `GtkSourceFile`
 * properties are updated. If an operation fails, the `GtkSourceFile` properties
 * have still the previous valid values.
 *
 * ## Skipped during bindings generation
 *
 * - method `location`: Property TypeInfo of getter and setter do not match
 * - method `read-only`: Property has no getter nor setter
 */
public open class File(pointer: CPointer<GtkSourceFile>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceFilePointer: CPointer<GtkSourceFile>
        get() = gPointer.reinterpret()

    /**
     * The compression type.
     */
    public open val compressionType: CompressionType
        /**
         *
         *
         * @return the compression type.
         */
        get() = gtk_source_file_get_compression_type(gtksourceFilePointer.reinterpret()).run {
            CompressionType.fromNativeValue(this)
        }

    /**
     * The character encoding, initially null. After a successful file
     * loading or saving operation, the encoding is non-null.
     */
    public open val encoding: Encoding
        /**
         * The encoding is initially null. After a successful file loading or saving
         * operation, the encoding is non-null.
         *
         * @return the character encoding.
         */
        get() = gtk_source_file_get_encoding(gtksourceFilePointer.reinterpret())!!.run {
            Encoding(reinterpret())
        }

    /**
     * The line ending type.
     */
    public open val newlineType: NewlineType
        /**
         *
         *
         * @return the newline type.
         */
        get() = gtk_source_file_get_newline_type(gtksourceFilePointer.reinterpret()).run {
            NewlineType.fromNativeValue(this)
        }

    /**
     *
     *
     * @return a new #GtkSourceFile object.
     */
    public constructor() : this(gtk_source_file_new()!!.reinterpret())

    /**
     * Checks synchronously the file on disk, to know whether the file is externally
     * modified, or has been deleted, and whether the file is read-only.
     *
     * #GtkSourceFile doesn't create a [class@Gio.FileMonitor] to track those properties, so
     * this function needs to be called instead. Creating lots of [class@Gio.FileMonitor]'s
     * would take lots of resources.
     *
     * Since this function is synchronous, it is advised to call it only on local
     * files. See [method@File.is_local].
     */
    public open fun checkFileOnDisk(): Unit = gtk_source_file_check_file_on_disk(gtksourceFilePointer.reinterpret())

    /**
     *
     *
     * @return the #GFile.
     */
    public open fun getLocation(): org.gtkkn.bindings.gio.File =
        gtk_source_file_get_location(gtksourceFilePointer.reinterpret())!!.run {
            org.gtkkn.bindings.gio.File.wrap(reinterpret())
        }

    /**
     * Returns whether the file has been deleted. If the
     * [property@File:location] is null, returns false.
     *
     * To have an up-to-date value, you must first call
     * [method@File.check_file_on_disk].
     *
     * @return whether the file has been deleted.
     */
    public open fun isDeleted(): Boolean = gtk_source_file_is_deleted(gtksourceFilePointer.reinterpret()).asBoolean()

    /**
     * Returns whether the file is externally modified. If the
     * [property@File:location] is null, returns false.
     *
     * To have an up-to-date value, you must first call
     * [method@File.check_file_on_disk].
     *
     * @return whether the file is externally modified.
     */
    public open fun isExternallyModified(): Boolean =
        gtk_source_file_is_externally_modified(gtksourceFilePointer.reinterpret()).asBoolean()

    /**
     * Returns whether the file is local. If the [property@File:location] is null,
     * returns false.
     *
     * @return whether the file is local.
     */
    public open fun isLocal(): Boolean = gtk_source_file_is_local(gtksourceFilePointer.reinterpret()).asBoolean()

    /**
     * Returns whether the file is read-only. If the
     * [property@File:location] is null, returns false.
     *
     * To have an up-to-date value, you must first call
     * [method@File.check_file_on_disk].
     *
     * @return whether the file is read-only.
     */
    public open fun isReadonly(): Boolean = gtk_source_file_is_readonly(gtksourceFilePointer.reinterpret()).asBoolean()

    /**
     * Sets the location.
     *
     * @param location the new #GFile, or null.
     */
    public open fun setLocation(location: org.gtkkn.bindings.gio.File? = null): Unit =
        gtk_source_file_set_location(gtksourceFilePointer.reinterpret(), location?.gioFilePointer)

    /**
     * Sets a [callback@MountOperationFactory] function that will be called when a
     * [class@Gio.MountOperation] must be created.
     *
     * This is useful for creating a [class@Gtk.MountOperation] with the parent [class@Gtk.Window].
     *
     * If a mount operation factory isn't set, [ctor@Gio.MountOperation.new] will be
     * called.
     *
     * @param callback a #GtkSourceMountOperationFactory to call when a
     *   #GMountOperation is needed.
     */
    public open fun setMountOperationFactory(callback: MountOperationFactory): Unit =
        gtk_source_file_set_mount_operation_factory(
            gtksourceFilePointer.reinterpret(),
            MountOperationFactoryFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    public companion object : TypeCompanion<File> {
        override val type: GeneratedClassKGType<File> =
            GeneratedClassKGType(gtk_source_file_get_type()) { File(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of File
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_file_get_type()
    }
}
