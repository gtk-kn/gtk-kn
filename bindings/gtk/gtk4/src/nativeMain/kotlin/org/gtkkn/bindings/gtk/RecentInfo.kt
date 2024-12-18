// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AppInfo
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkRecentInfo
import org.gtkkn.native.gtk.gtk_recent_info_create_app_info
import org.gtkkn.native.gtk.gtk_recent_info_exists
import org.gtkkn.native.gtk.gtk_recent_info_get_added
import org.gtkkn.native.gtk.gtk_recent_info_get_age
import org.gtkkn.native.gtk.gtk_recent_info_get_description
import org.gtkkn.native.gtk.gtk_recent_info_get_display_name
import org.gtkkn.native.gtk.gtk_recent_info_get_gicon
import org.gtkkn.native.gtk.gtk_recent_info_get_mime_type
import org.gtkkn.native.gtk.gtk_recent_info_get_modified
import org.gtkkn.native.gtk.gtk_recent_info_get_private_hint
import org.gtkkn.native.gtk.gtk_recent_info_get_short_name
import org.gtkkn.native.gtk.gtk_recent_info_get_type
import org.gtkkn.native.gtk.gtk_recent_info_get_uri
import org.gtkkn.native.gtk.gtk_recent_info_get_uri_display
import org.gtkkn.native.gtk.gtk_recent_info_get_visited
import org.gtkkn.native.gtk.gtk_recent_info_has_application
import org.gtkkn.native.gtk.gtk_recent_info_has_group
import org.gtkkn.native.gtk.gtk_recent_info_is_local
import org.gtkkn.native.gtk.gtk_recent_info_last_application
import org.gtkkn.native.gtk.gtk_recent_info_match
import org.gtkkn.native.gtk.gtk_recent_info_ref
import org.gtkkn.native.gtk.gtk_recent_info_unref
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * `GtkRecentInfo` contains the metadata associated with an item in the
 * recently used files list.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `app_exec`: app_exec: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 */
public class RecentInfo(pointer: CPointer<GtkRecentInfo>) : ProxyInstance(pointer) {
    public val gtkRecentInfoPointer: CPointer<GtkRecentInfo> = pointer

    /**
     * Creates a `GAppInfo` for the specified `GtkRecentInfo`
     *
     * In case of error, @error will be set either with a
     * %GTK_RECENT_MANAGER_ERROR or a %G_IO_ERROR
     *
     * @param appName the name of the application that should
     *   be mapped to a `GAppInfo`; if null is used then the default
     *   application for the MIME type is used
     * @return the newly created `GAppInfo`
     */
    public fun createAppInfo(appName: String? = null): Result<AppInfo?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_recent_info_create_app_info(gtkRecentInfoPointer.reinterpret(), appName, gError.ptr)?.run {
            AppInfo.wrap(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Checks whether the resource pointed by @info still exists.
     * At the moment this check is done only on resources pointing
     * to local files.
     *
     * @return true if the resource exists
     */
    public fun exists(): Boolean = gtk_recent_info_exists(gtkRecentInfoPointer.reinterpret()).asBoolean()

    /**
     * Gets the time when the resource
     * was added to the recently used resources list.
     *
     * @return a `GDateTime` for the time
     *    when the resource was added
     */
    public fun getAdded(): DateTime = gtk_recent_info_get_added(gtkRecentInfoPointer.reinterpret())!!.run {
        DateTime(reinterpret())
    }

    /**
     * Gets the number of days elapsed since the last update
     * of the resource pointed by @info.
     *
     * @return a positive integer containing the number of days
     *   elapsed since the time this resource was last modified
     */
    public fun getAge(): gint = gtk_recent_info_get_age(gtkRecentInfoPointer.reinterpret())

    /**
     * Gets the (short) description of the resource.
     *
     * @return the description of the resource. The returned string
     *   is owned by the recent manager, and should not be freed.
     */
    public fun getDescription(): String =
        gtk_recent_info_get_description(gtkRecentInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the name of the resource.
     *
     * If none has been defined, the basename
     * of the resource is obtained.
     *
     * @return the display name of the resource. The returned string
     *   is owned by the recent manager, and should not be freed.
     */
    public fun getDisplayName(): String =
        gtk_recent_info_get_display_name(gtkRecentInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Retrieves the icon associated to the resource MIME type.
     *
     * @return a `GIcon` containing the icon
     */
    public fun getGicon(): Icon? = gtk_recent_info_get_gicon(gtkRecentInfoPointer.reinterpret())?.run {
        Icon.wrap(reinterpret())
    }

    /**
     * Gets the MIME type of the resource.
     *
     * @return the MIME type of the resource. The returned string
     *   is owned by the recent manager, and should not be freed.
     */
    public fun getMimeType(): String = gtk_recent_info_get_mime_type(gtkRecentInfoPointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Gets the time when the meta-data
     * for the resource was last modified.
     *
     * @return a `GDateTime` for the time
     *   when the resource was last modified
     */
    public fun getModified(): DateTime = gtk_recent_info_get_modified(gtkRecentInfoPointer.reinterpret())!!.run {
        DateTime(reinterpret())
    }

    /**
     * Gets the value of the “private” flag.
     *
     * Resources in the recently used list that have this flag
     * set to true should only be displayed by the applications
     * that have registered them.
     *
     * @return true if the private flag was found, false otherwise
     */
    public fun getPrivateHint(): Boolean =
        gtk_recent_info_get_private_hint(gtkRecentInfoPointer.reinterpret()).asBoolean()

    /**
     * Computes a valid UTF-8 string that can be used as the
     * name of the item in a menu or list.
     *
     * For example, calling this function on an item that refers
     * to “file:///foo/bar.txt” will yield “bar.txt”.
     *
     * @return A newly-allocated string in UTF-8 encoding
     *   free it with g_free()
     */
    public fun getShortName(): String = gtk_recent_info_get_short_name(gtkRecentInfoPointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Gets the URI of the resource.
     *
     * @return the URI of the resource. The returned string is
     *   owned by the recent manager, and should not be freed.
     */
    public fun getUri(): String =
        gtk_recent_info_get_uri(gtkRecentInfoPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets a displayable version of the resource’s URI.
     *
     * If the resource is local, it returns a local path; if the
     * resource is not local, it returns the UTF-8 encoded content
     * of [method@Gtk.RecentInfo.get_uri].
     *
     * @return a newly allocated UTF-8 string containing the
     *   resource’s URI or null. Use g_free() when done using it.
     */
    public fun getUriDisplay(): String? =
        gtk_recent_info_get_uri_display(gtkRecentInfoPointer.reinterpret())?.toKString()

    /**
     * Gets the time when the meta-data
     * for the resource was last visited.
     *
     * @return a `GDateTime` for the time
     *    when the resource was last visited
     */
    public fun getVisited(): DateTime = gtk_recent_info_get_visited(gtkRecentInfoPointer.reinterpret())!!.run {
        DateTime(reinterpret())
    }

    /**
     * Checks whether an application registered this resource using @app_name.
     *
     * @param appName a string containing an application name
     * @return true if an application with name @app_name was found,
     *   false otherwise
     */
    public fun hasApplication(appName: String): Boolean =
        gtk_recent_info_has_application(gtkRecentInfoPointer.reinterpret(), appName).asBoolean()

    /**
     * Checks whether @group_name appears inside the groups
     * registered for the recently used item @info.
     *
     * @param groupName name of a group
     * @return true if the group was found
     */
    public fun hasGroup(groupName: String): Boolean =
        gtk_recent_info_has_group(gtkRecentInfoPointer.reinterpret(), groupName).asBoolean()

    /**
     * Checks whether the resource is local or not by looking at the
     * scheme of its URI.
     *
     * @return true if the resource is local
     */
    public fun isLocal(): Boolean = gtk_recent_info_is_local(gtkRecentInfoPointer.reinterpret()).asBoolean()

    /**
     * Gets the name of the last application that have registered the
     * recently used resource represented by @info.
     *
     * @return an application name. Use g_free() to free it.
     */
    public fun lastApplication(): String =
        gtk_recent_info_last_application(gtkRecentInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Checks whether two `GtkRecentInfo` point to the same resource.
     *
     * @param infoB a `GtkRecentInfo`
     * @return true if both `GtkRecentInfo` point to the same
     *   resource, false otherwise
     */
    public fun match(infoB: RecentInfo): Boolean =
        gtk_recent_info_match(gtkRecentInfoPointer.reinterpret(), infoB.gtkRecentInfoPointer.reinterpret()).asBoolean()

    /**
     * Increases the reference count of @recent_info by one.
     *
     * @return the recent info object with its reference count
     *   increased by one
     */
    public fun ref(): RecentInfo = gtk_recent_info_ref(gtkRecentInfoPointer.reinterpret())!!.run {
        RecentInfo(reinterpret())
    }

    /**
     * Decreases the reference count of @info by one.
     *
     * If the reference count reaches zero, @info is
     * deallocated, and the memory freed.
     */
    public fun unref(): Unit = gtk_recent_info_unref(gtkRecentInfoPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of RecentInfo
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_recent_info_get_type()
    }
}
