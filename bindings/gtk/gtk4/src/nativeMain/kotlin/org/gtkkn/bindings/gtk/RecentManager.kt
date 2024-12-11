// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkRecentManager
import org.gtkkn.native.gtk.gtk_recent_manager_add_full
import org.gtkkn.native.gtk.gtk_recent_manager_add_item
import org.gtkkn.native.gtk.gtk_recent_manager_get_default
import org.gtkkn.native.gtk.gtk_recent_manager_get_items
import org.gtkkn.native.gtk.gtk_recent_manager_get_type
import org.gtkkn.native.gtk.gtk_recent_manager_has_item
import org.gtkkn.native.gtk.gtk_recent_manager_lookup_item
import org.gtkkn.native.gtk.gtk_recent_manager_move_item
import org.gtkkn.native.gtk.gtk_recent_manager_new
import org.gtkkn.native.gtk.gtk_recent_manager_purge_items
import org.gtkkn.native.gtk.gtk_recent_manager_remove_item
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkRecentManager` manages and looks up recently used files.
 *
 * Each recently used file is identified by its URI, and has meta-data
 * associated to it, like the names and command lines of the applications
 * that have registered it, the number of time each application has
 * registered the same file, the mime type of the file and whether
 * the file should be displayed only by the applications that have
 * registered it.
 *
 * The recently used files list is per user.
 *
 * `GtkRecentManager` acts like a database of all the recently
 * used files. You can create new `GtkRecentManager` objects, but
 * it is more efficient to use the default manager created by GTK.
 *
 * Adding a new recently used file is as simple as:
 *
 * ```c
 * GtkRecentManager *manager;
 *
 * manager = gtk_recent_manager_get_default ();
 * gtk_recent_manager_add_item (manager, file_uri);
 * ```
 *
 * The `GtkRecentManager` will try to gather all the needed information
 * from the file itself through GIO.
 *
 * Looking up the meta-data associated with a recently used file
 * given its URI requires calling [method@Gtk.RecentManager.lookup_item]:
 *
 * ```c
 * GtkRecentManager *manager;
 * GtkRecentInfo *info;
 * GError *error = NULL;
 *
 * manager = gtk_recent_manager_get_default ();
 * info = gtk_recent_manager_lookup_item (manager, file_uri, &error);
 * if (error)
 *   {
 *     g_warning ("Could not find the file: %s", error->message);
 *     g_error_free (error);
 *   }
 * else
 *  {
 *    // Use the info object
 *    gtk_recent_info_unref (info);
 *  }
 * ```
 *
 * In order to retrieve the list of recently used files, you can use
 * [method@Gtk.RecentManager.get_items], which returns a list of
 * [struct@Gtk.RecentInfo].
 *
 * Note that the maximum age of the recently used files list is
 * controllable through the [property@Gtk.Settings:gtk-recent-files-max-age]
 * property.
 *
 * ## Skipped during bindings generation
 *
 * - method `filename`: Property has no getter nor setter
 * - method `size`: Property has no getter nor setter
 */
public open class RecentManager(pointer: CPointer<GtkRecentManager>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkRecentManagerPointer: CPointer<GtkRecentManager>
        get() = gPointer.reinterpret()

    /**
     * Creates a new recent manager object.
     *
     * Recent manager objects are used to handle the list of recently used
     * resources. A `GtkRecentManager` object monitors the recently used
     * resources list, and emits the [signal@Gtk.RecentManager::changed]
     * signal each time something inside the list changes.
     *
     * `GtkRecentManager` objects are expensive: be sure to create them
     * only when needed. You should use [func@Gtk.RecentManager.get_default]
     * instead.
     *
     * @return A newly created `GtkRecentManager` object
     */
    public constructor() : this(gtk_recent_manager_new()!!.reinterpret())

    /**
     * Adds a new resource, pointed by @uri, into the recently used
     * resources list, using the metadata specified inside the
     * `GtkRecentData` passed in @recent_data.
     *
     * The passed URI will be used to identify this resource inside the
     * list.
     *
     * In order to register the new recently used resource, metadata about
     * the resource must be passed as well as the URI; the metadata is
     * stored in a `GtkRecentData`, which must contain the MIME
     * type of the resource pointed by the URI; the name of the application
     * that is registering the item, and a command line to be used when
     * launching the item.
     *
     * Optionally, a `GtkRecentData` might contain a UTF-8 string
     * to be used when viewing the item instead of the last component of
     * the URI; a short description of the item; whether the item should
     * be considered private - that is, should be displayed only by the
     * applications that have registered it.
     *
     * @param uri a valid URI
     * @param recentData metadata of the resource
     * @return true if the new item was successfully added to the
     *   recently used resources list, false otherwise
     */
    public open fun addFull(uri: String, recentData: RecentData): Boolean = gtk_recent_manager_add_full(
        gtkRecentManagerPointer.reinterpret(),
        uri,
        recentData.gtkRecentDataPointer.reinterpret()
    ).asBoolean()

    /**
     * Adds a new resource, pointed by @uri, into the recently used
     * resources list.
     *
     * This function automatically retrieves some of the needed
     * metadata and setting other metadata to common default values;
     * it then feeds the data to [method@Gtk.RecentManager.add_full].
     *
     * See [method@Gtk.RecentManager.add_full] if you want to explicitly
     * define the metadata for the resource pointed by @uri.
     *
     * @param uri a valid URI
     * @return true if the new item was successfully added
     *   to the recently used resources list
     */
    public open fun addItem(uri: String): Boolean =
        gtk_recent_manager_add_item(gtkRecentManagerPointer.reinterpret(), uri).asBoolean()

    /**
     * Gets the list of recently used resources.
     *
     * @return a list of
     *   newly allocated `GtkRecentInfo objects`. Use
     *   [method@Gtk.RecentInfo.unref] on each item inside the list, and then
     *   free the list itself using g_list_free().
     */
    public open fun getItems(): List = gtk_recent_manager_get_items(gtkRecentManagerPointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Checks whether there is a recently used resource registered
     * with @uri inside the recent manager.
     *
     * @param uri a URI
     * @return true if the resource was found, false otherwise
     */
    public open fun hasItem(uri: String): Boolean =
        gtk_recent_manager_has_item(gtkRecentManagerPointer.reinterpret(), uri).asBoolean()

    /**
     * Searches for a URI inside the recently used resources list, and
     * returns a `GtkRecentInfo` containing information about the resource
     * like its MIME type, or its display name.
     *
     * @param uri a URI
     * @return a `GtkRecentInfo` containing information
     *   about the resource pointed by @uri, or null if the URI was
     *   not registered in the recently used resources list. Free with
     *   [method@Gtk.RecentInfo.unref].
     */
    public open fun lookupItem(uri: String): Result<RecentInfo?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_recent_manager_lookup_item(gtkRecentManagerPointer.reinterpret(), uri, gError.ptr)?.run {
            RecentInfo(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Changes the location of a recently used resource from @uri to @new_uri.
     *
     * Please note that this function will not affect the resource pointed
     * by the URIs, but only the URI used in the recently used resources list.
     *
     * @param uri the URI of a recently used resource
     * @param newUri the new URI of the recently used resource, or
     *    null to remove the item pointed by @uri in the list
     * @return true on success
     */
    public open fun moveItem(uri: String, newUri: String? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_recent_manager_move_item(
            gtkRecentManagerPointer.reinterpret(),
            uri,
            newUri,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Purges every item from the recently used resources list.
     *
     * @return the number of items that have been removed from the
     *   recently used resources list
     */
    public open fun purgeItems(): Result<gint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_recent_manager_purge_items(gtkRecentManagerPointer.reinterpret(), gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Removes a resource pointed by @uri from the recently used resources
     * list handled by a recent manager.
     *
     * @param uri the URI of the item you wish to remove
     * @return true if the item pointed by @uri has been successfully
     *   removed by the recently used resources list, and false otherwise
     */
    public open fun removeItem(uri: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_recent_manager_remove_item(gtkRecentManagerPointer.reinterpret(), uri, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Emitted when the current recently used resources manager changes
     * its contents.
     *
     * This can happen either by calling [method@Gtk.RecentManager.add_item]
     * or by another application.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<RecentManager> {
        override val type: GeneratedClassKGType<RecentManager> =
            GeneratedClassKGType(gtk_recent_manager_get_type()) { RecentManager(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets a unique instance of `GtkRecentManager` that you can share
         * in your application without caring about memory management.
         *
         * @return A unique `GtkRecentManager`. Do not ref or
         *   unref it.
         */
        public fun getDefault(): RecentManager = gtk_recent_manager_get_default()!!.run {
            RecentManager(reinterpret())
        }

        /**
         * Get the GType of RecentManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_recent_manager_get_type()
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
