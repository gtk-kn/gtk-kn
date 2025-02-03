// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkDirectoryList
import org.gtkkn.native.gtk.gtk_directory_list_get_attributes
import org.gtkkn.native.gtk.gtk_directory_list_get_error
import org.gtkkn.native.gtk.gtk_directory_list_get_file
import org.gtkkn.native.gtk.gtk_directory_list_get_io_priority
import org.gtkkn.native.gtk.gtk_directory_list_get_monitored
import org.gtkkn.native.gtk.gtk_directory_list_get_type
import org.gtkkn.native.gtk.gtk_directory_list_is_loading
import org.gtkkn.native.gtk.gtk_directory_list_new
import org.gtkkn.native.gtk.gtk_directory_list_set_attributes
import org.gtkkn.native.gtk.gtk_directory_list_set_file
import org.gtkkn.native.gtk.gtk_directory_list_set_io_priority
import org.gtkkn.native.gtk.gtk_directory_list_set_monitored
import kotlin.Boolean
import kotlin.String

/**
 * `GtkDirectoryList` is a list model that wraps g_file_enumerate_children_async().
 *
 * It presents a `GListModel` and fills it asynchronously with the `GFileInfo`s
 * returned from that function.
 *
 * Enumeration will start automatically when the
 * [property@Gtk.DirectoryList:file] property is set.
 *
 * While the `GtkDirectoryList` is being filled, the
 * [property@Gtk.DirectoryList:loading] property will be set to true. You can
 * listen to that property if you want to show information like a `GtkSpinner`
 * or a "Loading..." text.
 *
 * If loading fails at any point, the [property@Gtk.DirectoryList:error]
 * property will be set to give more indication about the failure.
 *
 * The `GFileInfo`s returned from a `GtkDirectoryList` have the "standard::file"
 * attribute set to the `GFile` they refer to. This way you can get at the file
 * that is referred to in the same way you would via g_file_enumerator_get_child().
 * This means you do not need access to the `GtkDirectoryList`, but can access
 * the `GFile` directly from the `GFileInfo` when operating with a `GtkListView`
 * or similar.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `loading`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class DirectoryList(public val gtkDirectoryListPointer: CPointer<GtkDirectoryList>) :
    Object(gtkDirectoryListPointer.reinterpret()),
    ListModel,
    KGTyped {
    init {
        Gtk
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    /**
     * The attributes to query.
     */
    public open var attributes: String?
        /**
         * Gets the attributes queried on the children.
         *
         * @return The queried attributes
         */
        get() = gtk_directory_list_get_attributes(gtkDirectoryListPointer)?.toKString()

        /**
         * Sets the @attributes to be enumerated and starts the enumeration.
         *
         * If @attributes is null, the list of file infos will still be created, it will just
         * not contain any extra attributes.
         *
         * @param attributes the attributes to enumerate
         */
        set(attributes) = gtk_directory_list_set_attributes(gtkDirectoryListPointer, attributes)

    /**
     * Error encountered while loading files.
     */
    public open val error: Error?
        /**
         * Gets the loading error, if any.
         *
         * If an error occurs during the loading process, the loading process
         * will finish and this property allows querying the error that happened.
         * This error will persist until a file is loaded again.
         *
         * An error being set does not mean that no files were loaded, and all
         * successfully queried files will remain in the list.
         *
         * @return The loading error or null if
         *   loading finished successfully
         */
        get() = gtk_directory_list_get_error(gtkDirectoryListPointer)?.run {
            Error(this)
        }

    /**
     * File to query.
     */
    public open var `file`: File?
        /**
         * Gets the file whose children are currently enumerated.
         *
         * @return The file whose children are enumerated
         */
        get() = gtk_directory_list_get_file(gtkDirectoryListPointer)?.run {
            File.FileImpl(reinterpret())
        }

        /**
         * Sets the @file to be enumerated and starts the enumeration.
         *
         * If @file is null, the result will be an empty list.
         *
         * @param file the `GFile` to be enumerated
         */
        set(`file`) = gtk_directory_list_set_file(gtkDirectoryListPointer, `file`?.gioFilePointer)

    /**
     * Priority used when loading.
     */
    public open var ioPriority: gint
        /**
         * Gets the IO priority set via gtk_directory_list_set_io_priority().
         *
         * @return The IO priority.
         */
        get() = gtk_directory_list_get_io_priority(gtkDirectoryListPointer)

        /**
         * Sets the IO priority to use while loading directories.
         *
         * Setting the priority while @self is loading will reprioritize the
         * ongoing load as soon as possible.
         *
         * The default IO priority is %G_PRIORITY_DEFAULT, which is higher than
         * the GTK redraw priority. If you are loading a lot of directories in
         * parallel, lowering it to something like %G_PRIORITY_DEFAULT_IDLE
         * may increase responsiveness.
         *
         * @param ioPriority IO priority to use
         */
        set(ioPriority) = gtk_directory_list_set_io_priority(gtkDirectoryListPointer, ioPriority)

    /**
     * true if the directory is monitored for changed.
     */
    public open var monitored: Boolean
        /**
         * Returns whether the directory list is monitoring
         * the directory for changes.
         *
         * @return true if the directory is monitored
         */
        get() = gtk_directory_list_get_monitored(gtkDirectoryListPointer).asBoolean()

        /**
         * Sets whether the directory list will monitor the directory
         * for changes.
         *
         * If monitoring is enabled, the ::items-changed signal will
         * be emitted when the directory contents change.
         *
         *
         * When monitoring is turned on after the initial creation
         * of the directory list, the directory is reloaded to avoid
         * missing files that appeared between the initial loading
         * and when monitoring was turned on.
         *
         * @param monitored true to monitor the directory for changes
         */
        set(monitored) = gtk_directory_list_set_monitored(gtkDirectoryListPointer, monitored.asGBoolean())

    /**
     * Creates a new `GtkDirectoryList`.
     *
     * The `GtkDirectoryList` is querying the given @file
     * with the given @attributes.
     *
     * @param attributes The attributes to query with
     * @param file The file to query
     * @return a new `GtkDirectoryList`
     */
    public constructor(
        attributes: String? = null,
        `file`: File? = null,
    ) : this(gtk_directory_list_new(attributes, `file`?.gioFilePointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Returns true if the children enumeration is currently in
     * progress.
     *
     * Files will be added to @self from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     *
     * @return true if @self is loading
     */
    public open fun isLoading(): Boolean = gtk_directory_list_is_loading(gtkDirectoryListPointer).asBoolean()

    public companion object : TypeCompanion<DirectoryList> {
        override val type: GeneratedClassKGType<DirectoryList> =
            GeneratedClassKGType(getTypeOrNull()!!) { DirectoryList(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of DirectoryList
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_directory_list_get_type()

        /**
         * Gets the GType of from the symbol `gtk_directory_list_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_directory_list_get_type")
    }
}
