// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Glib.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GBookmarkFile
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_bookmark_file_add_application
import org.gtkkn.native.glib.g_bookmark_file_add_group
import org.gtkkn.native.glib.g_bookmark_file_copy
import org.gtkkn.native.glib.g_bookmark_file_error_quark
import org.gtkkn.native.glib.g_bookmark_file_free
import org.gtkkn.native.glib.g_bookmark_file_get_added_date_time
import org.gtkkn.native.glib.g_bookmark_file_get_description
import org.gtkkn.native.glib.g_bookmark_file_get_is_private
import org.gtkkn.native.glib.g_bookmark_file_get_mime_type
import org.gtkkn.native.glib.g_bookmark_file_get_modified_date_time
import org.gtkkn.native.glib.g_bookmark_file_get_size
import org.gtkkn.native.glib.g_bookmark_file_get_title
import org.gtkkn.native.glib.g_bookmark_file_get_visited_date_time
import org.gtkkn.native.glib.g_bookmark_file_has_application
import org.gtkkn.native.glib.g_bookmark_file_has_group
import org.gtkkn.native.glib.g_bookmark_file_has_item
import org.gtkkn.native.glib.g_bookmark_file_load_from_file
import org.gtkkn.native.glib.g_bookmark_file_move_item
import org.gtkkn.native.glib.g_bookmark_file_new
import org.gtkkn.native.glib.g_bookmark_file_remove_application
import org.gtkkn.native.glib.g_bookmark_file_remove_group
import org.gtkkn.native.glib.g_bookmark_file_remove_item
import org.gtkkn.native.glib.g_bookmark_file_set_added_date_time
import org.gtkkn.native.glib.g_bookmark_file_set_application_info
import org.gtkkn.native.glib.g_bookmark_file_set_description
import org.gtkkn.native.glib.g_bookmark_file_set_groups
import org.gtkkn.native.glib.g_bookmark_file_set_icon
import org.gtkkn.native.glib.g_bookmark_file_set_is_private
import org.gtkkn.native.glib.g_bookmark_file_set_mime_type
import org.gtkkn.native.glib.g_bookmark_file_set_modified_date_time
import org.gtkkn.native.glib.g_bookmark_file_set_title
import org.gtkkn.native.glib.g_bookmark_file_set_visited_date_time
import org.gtkkn.native.glib.g_bookmark_file_to_file
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GBookmarkFile` lets you parse, edit or create files containing bookmarks.
 *
 * Bookmarks refer to a URI, along with some meta-data about the resource
 * pointed by the URI like its MIME type, the application that is registering
 * the bookmark and the icon that should be used to represent the bookmark.
 * The data is stored using the
 * [Desktop Bookmark Specification](http://www.gnome.org/~ebassi/bookmark-spec).
 *
 * The syntax of the bookmark files is described in detail inside the
 * Desktop Bookmark Specification, here is a quick summary: bookmark
 * files use a sub-class of the XML Bookmark Exchange Language
 * specification, consisting of valid UTF-8 encoded XML, under the
 * `<xbel>` root element; each bookmark is stored inside a
 * `<bookmark>` element, using its URI: no relative paths can
 * be used inside a bookmark file. The bookmark may have a user defined
 * title and description, to be used instead of the URI. Under the
 * `<metadata>` element, with its owner attribute set to
 * `http://freedesktop.org`, is stored the meta-data about a resource
 * pointed by its URI. The meta-data consists of the resource's MIME
 * type; the applications that have registered a bookmark; the groups
 * to which a bookmark belongs to; a visibility flag, used to set the
 * bookmark as "private" to the applications and groups that has it
 * registered; the URI and MIME type of an icon, to be used when
 * displaying the bookmark inside a GUI.
 *
 * Here is an example of a bookmark file:
 * [bookmarks.xbel](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/glib/tests/bookmarks.xbel)
 *
 * A bookmark file might contain more than one bookmark; each bookmark
 * is accessed through its URI.
 *
 * The important caveat of bookmark files is that when you add a new
 * bookmark you must also add the application that is registering it, using
 * [method@GLib.BookmarkFile.add_application] or [method@GLib.BookmarkFile.set_application_info].
 * If a bookmark has no applications then it won't be dumped when creating
 * the on disk representation, using [method@GLib.BookmarkFile.to_data] or
 * [method@GLib.BookmarkFile.to_file].
 *
 * ## Skipped during bindings generation
 *
 * - method `get_added`: Return type time_t is unsupported
 * - parameter `exec`: exec: Out parameter is not supported
 * - parameter `exec`: exec: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `href`: href: Out parameter is not supported
 * - method `get_modified`: Return type time_t is unsupported
 * - parameter `length`: length: Out parameter is not supported
 * - method `get_visited`: Return type time_t is unsupported
 * - parameter `data`: guint8
 * - parameter `full_path`: full_path: Out parameter is not supported
 * - parameter `added`: time_t
 * - parameter `stamp`: time_t
 * - parameter `modified`: time_t
 * - parameter `visited`: time_t
 * - parameter `length`: length: Out parameter is not supported
 *
 * @since 2.12
 */
public class BookmarkFile(
    pointer: CPointer<GBookmarkFile>,
) : Record {
    public val glibBookmarkFilePointer: CPointer<GBookmarkFile> = pointer

    /**
     * Adds the application with @name and @exec to the list of
     * applications that have registered a bookmark for @uri into
     * @bookmark.
     *
     * Every bookmark inside a #GBookmarkFile must have at least an
     * application registered.  Each application must provide a name, a
     * command line useful for launching the bookmark, the number of times
     * the bookmark has been registered by the application and the last
     * time the application registered this bookmark.
     *
     * If @name is null, the name of the application will be the
     * same returned by g_get_application_name(); if @exec is null, the
     * command line will be a composition of the program name as
     * returned by g_get_prgname() and the "\%u" modifier, which will be
     * expanded to the bookmark's URI.
     *
     * This function will automatically take care of updating the
     * registrations count and timestamping in case an application
     * with the same @name had already registered a bookmark for
     * @uri inside @bookmark.
     *
     * If no bookmark for @uri is found, one is created.
     *
     * @param uri a valid URI
     * @param name the name of the application registering the bookmark
     *   or null
     * @param exec command line to be used to launch the bookmark or null
     * @since 2.12
     */
    public fun addApplication(
        uri: String,
        name: String? = null,
        exec: String? = null,
    ): Unit = g_bookmark_file_add_application(glibBookmarkFilePointer.reinterpret(), uri, name, exec)

    /**
     * Adds @group to the list of groups to which the bookmark for @uri
     * belongs to.
     *
     * If no bookmark for @uri is found then it is created.
     *
     * @param uri a valid URI
     * @param group the group name to be added
     * @since 2.12
     */
    public fun addGroup(
        uri: String,
        group: String,
    ): Unit = g_bookmark_file_add_group(glibBookmarkFilePointer.reinterpret(), uri, group)

    /**
     * Deeply copies a @bookmark #GBookmarkFile object to a new one.
     *
     * @return the copy of @bookmark. Use
     *   g_bookmark_free() when finished using it.
     * @since 2.76
     */
    public fun copy(): BookmarkFile =
        g_bookmark_file_copy(glibBookmarkFilePointer.reinterpret())!!.run {
            BookmarkFile(reinterpret())
        }

    /**
     * Frees a #GBookmarkFile.
     *
     * @since 2.12
     */
    public fun free(): Unit = g_bookmark_file_free(glibBookmarkFilePointer.reinterpret())

    /**
     * Gets the time the bookmark for @uri was added to @bookmark
     *
     * In the event the URI cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI
     * @return a #GDateTime
     * @since 2.66
     */
    public fun getAddedDateTime(uri: String): Result<DateTime> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_get_added_date_time(glibBookmarkFilePointer.reinterpret(), uri, gError.ptr)?.run {
                    DateTime(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Retrieves the description of the bookmark for @uri.
     *
     * In the event the URI cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI
     * @return a newly allocated string or null if the specified
     *   URI cannot be found.
     * @since 2.12
     */
    public fun getDescription(uri: String): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_get_description(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    gError.ptr
                )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets whether the private flag of the bookmark for @uri is set.
     *
     * In the event the URI cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * event that the private flag cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     *
     * @param uri a valid URI
     * @return true if the private flag is set, false otherwise.
     * @since 2.12
     */
    public fun getIsPrivate(uri: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_get_is_private(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Retrieves the MIME type of the resource pointed by @uri.
     *
     * In the event the URI cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * event that the MIME type cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     *
     * @param uri a valid URI
     * @return a newly allocated string or null if the specified
     *   URI cannot be found.
     * @since 2.12
     */
    public fun getMimeType(uri: String): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_get_mime_type(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    gError.ptr
                )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets the time when the bookmark for @uri was last modified.
     *
     * In the event the URI cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI
     * @return a #GDateTime
     * @since 2.66
     */
    public fun getModifiedDateTime(uri: String): Result<DateTime> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_get_modified_date_time(glibBookmarkFilePointer.reinterpret(), uri, gError.ptr)?.run {
                    DateTime(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets the number of bookmarks inside @bookmark.
     *
     * @return the number of bookmarks
     * @since 2.12
     */
    public fun getSize(): Int = g_bookmark_file_get_size(glibBookmarkFilePointer.reinterpret())

    /**
     * Returns the title of the bookmark for @uri.
     *
     * If @uri is null, the title of @bookmark is returned.
     *
     * In the event the URI cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI or null
     * @return a newly allocated string or null if the specified
     *   URI cannot be found.
     * @since 2.12
     */
    public fun getTitle(uri: String? = null): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_bookmark_file_get_title(glibBookmarkFilePointer.reinterpret(), uri, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets the time the bookmark for @uri was last visited.
     *
     * In the event the URI cannot be found, null is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI
     * @return a #GDateTime
     * @since 2.66
     */
    public fun getVisitedDateTime(uri: String): Result<DateTime> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_get_visited_date_time(glibBookmarkFilePointer.reinterpret(), uri, gError.ptr)?.run {
                    DateTime(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Checks whether the bookmark for @uri inside @bookmark has been
     * registered by application @name.
     *
     * In the event the URI cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI
     * @param name the name of the application
     * @return true if the application @name was found
     * @since 2.12
     */
    public fun hasApplication(
        uri: String,
        name: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_has_application(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    name,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Checks whether @group appears in the list of groups to which
     * the bookmark for @uri belongs to.
     *
     * In the event the URI cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param uri a valid URI
     * @param group the group name to be searched
     * @return true if @group was found.
     * @since 2.12
     */
    public fun hasGroup(
        uri: String,
        group: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_has_group(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    group,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Looks whether the desktop bookmark has an item with its URI set to @uri.
     *
     * @param uri a valid URI
     * @return true if @uri is inside @bookmark, false otherwise
     * @since 2.12
     */
    public fun hasItem(uri: String): Boolean =
        g_bookmark_file_has_item(glibBookmarkFilePointer.reinterpret(), uri).asBoolean()

    /**
     * Loads a desktop bookmark file into an empty #GBookmarkFile structure.
     * If the file could not be loaded then @error is set to either a #GFileError
     * or #GBookmarkFileError.
     *
     * @param filename the path of a filename to load, in the
     *     GLib file name encoding
     * @return true if a desktop bookmark file could be loaded
     * @since 2.12
     */
    public fun loadFromFile(filename: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_load_from_file(
                    glibBookmarkFilePointer.reinterpret(),
                    filename,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Changes the URI of a bookmark item from @old_uri to @new_uri.  Any
     * existing bookmark for @new_uri will be overwritten.  If @new_uri is
     * null, then the bookmark is removed.
     *
     * In the event the URI cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     *
     * @param oldUri a valid URI
     * @param newUri a valid URI, or null
     * @return true if the URI was successfully changed
     * @since 2.12
     */
    public fun moveItem(
        oldUri: String,
        newUri: String? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_move_item(
                    glibBookmarkFilePointer.reinterpret(),
                    oldUri,
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
     * Removes application registered with @name from the list of applications
     * that have registered a bookmark for @uri inside @bookmark.
     *
     * In the event the URI cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * In the event that no application with name @app_name has registered
     * a bookmark for @uri,  false is returned and error is set to
     * %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
     *
     * @param uri a valid URI
     * @param name the name of the application
     * @return true if the application was successfully removed.
     * @since 2.12
     */
    public fun removeApplication(
        uri: String,
        name: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_remove_application(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    name,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Removes @group from the list of groups to which the bookmark
     * for @uri belongs to.
     *
     * In the event the URI cannot be found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * In the event no group was defined, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     *
     * @param uri a valid URI
     * @param group the group name to be removed
     * @return true if @group was successfully removed.
     * @since 2.12
     */
    public fun removeGroup(
        uri: String,
        group: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_remove_group(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    group,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Removes the bookmark for @uri from the bookmark file @bookmark.
     *
     * @param uri a valid URI
     * @return true if the bookmark was removed successfully.
     * @since 2.12
     */
    public fun removeItem(uri: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_remove_item(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets the time the bookmark for @uri was added into @bookmark.
     *
     * If no bookmark for @uri is found then it is created.
     *
     * @param uri a valid URI
     * @param added a #GDateTime
     * @since 2.66
     */
    public fun setAddedDateTime(
        uri: String,
        added: DateTime,
    ): Unit = g_bookmark_file_set_added_date_time(glibBookmarkFilePointer.reinterpret(), uri, added.glibDateTimePointer)

    /**
     * Sets the meta-data of application @name inside the list of
     * applications that have registered a bookmark for @uri inside
     * @bookmark.
     *
     * You should rarely use this function; use g_bookmark_file_add_application()
     * and g_bookmark_file_remove_application() instead.
     *
     * @name can be any UTF-8 encoded string used to identify an
     * application.
     * @exec can have one of these two modifiers: "\%f", which will
     * be expanded as the local file name retrieved from the bookmark's
     * URI; "\%u", which will be expanded as the bookmark's URI.
     * The expansion is done automatically when retrieving the stored
     * command line using the g_bookmark_file_get_application_info() function.
     * @count is the number of times the application has registered the
     * bookmark; if is < 0, the current registration count will be increased
     * by one, if is 0, the application with @name will be removed from
     * the list of registered applications.
     * @stamp is the Unix time of the last registration.
     *
     * If you try to remove an application by setting its registration count to
     * zero, and no bookmark for @uri is found, false is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND; similarly,
     * in the event that no application @name has registered a bookmark
     * for @uri,  false is returned and error is set to
     * %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.  Otherwise, if no bookmark
     * for @uri is found, one is created.
     *
     * @param uri a valid URI
     * @param name an application's name
     * @param exec an application's command line
     * @param count the number of registrations done for this application
     * @param stamp the time of the last registration for this application,
     *    which may be null if @count is 0
     * @return true if the application's meta-data was successfully
     *   changed.
     * @since 2.66
     */
    public fun setApplicationInfo(
        uri: String,
        name: String,
        exec: String,
        count: Int,
        stamp: DateTime? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_set_application_info(
                    glibBookmarkFilePointer.reinterpret(),
                    uri,
                    name,
                    exec,
                    count,
                    stamp?.glibDateTimePointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets @description as the description of the bookmark for @uri.
     *
     * If @uri is null, the description of @bookmark is set.
     *
     * If a bookmark for @uri cannot be found then it is created.
     *
     * @param uri a valid URI or null
     * @param description a string
     * @since 2.12
     */
    public fun setDescription(
        uri: String? = null,
        description: String,
    ): Unit = g_bookmark_file_set_description(glibBookmarkFilePointer.reinterpret(), uri, description)

    /**
     * Sets a list of group names for the item with URI @uri.  Each previously
     * set group name list is removed.
     *
     * If @uri cannot be found then an item for it is created.
     *
     * @param uri an item's URI
     * @param groups an array of
     *    group names, or null to remove all groups
     * @param length number of group name values in @groups
     * @since 2.12
     */
    public fun setGroups(
        uri: String,
        groups: List<String>? = null,
        length: ULong,
    ): Unit =
        memScoped {
            return g_bookmark_file_set_groups(
                glibBookmarkFilePointer.reinterpret(),
                uri,
                groups?.toCStringList(this),
                length
            )
        }

    /**
     * Sets the icon for the bookmark for @uri. If @href is null, unsets
     * the currently set icon. @href can either be a full URL for the icon
     * file or the icon name following the Icon Naming specification.
     *
     * If no bookmark for @uri is found one is created.
     *
     * @param uri a valid URI
     * @param href the URI of the icon for the bookmark, or null
     * @param mimeType the MIME type of the icon for the bookmark
     * @since 2.12
     */
    public fun setIcon(
        uri: String,
        href: String? = null,
        mimeType: String,
    ): Unit = g_bookmark_file_set_icon(glibBookmarkFilePointer.reinterpret(), uri, href, mimeType)

    /**
     * Sets the private flag of the bookmark for @uri.
     *
     * If a bookmark for @uri cannot be found then it is created.
     *
     * @param uri a valid URI
     * @param isPrivate true if the bookmark should be marked as private
     * @since 2.12
     */
    public fun setIsPrivate(
        uri: String,
        isPrivate: Boolean,
    ): Unit = g_bookmark_file_set_is_private(glibBookmarkFilePointer.reinterpret(), uri, isPrivate.asGBoolean())

    /**
     * Sets @mime_type as the MIME type of the bookmark for @uri.
     *
     * If a bookmark for @uri cannot be found then it is created.
     *
     * @param uri a valid URI
     * @param mimeType a MIME type
     * @since 2.12
     */
    public fun setMimeType(
        uri: String,
        mimeType: String,
    ): Unit = g_bookmark_file_set_mime_type(glibBookmarkFilePointer.reinterpret(), uri, mimeType)

    /**
     * Sets the last time the bookmark for @uri was last modified.
     *
     * If no bookmark for @uri is found then it is created.
     *
     * The "modified" time should only be set when the bookmark's meta-data
     * was actually changed.  Every function of #GBookmarkFile that
     * modifies a bookmark also changes the modification time, except for
     * g_bookmark_file_set_visited_date_time().
     *
     * @param uri a valid URI
     * @param modified a #GDateTime
     * @since 2.66
     */
    public fun setModifiedDateTime(
        uri: String,
        modified: DateTime,
    ): Unit =
        g_bookmark_file_set_modified_date_time(glibBookmarkFilePointer.reinterpret(), uri, modified.glibDateTimePointer)

    /**
     * Sets @title as the title of the bookmark for @uri inside the
     * bookmark file @bookmark.
     *
     * If @uri is null, the title of @bookmark is set.
     *
     * If a bookmark for @uri cannot be found then it is created.
     *
     * @param uri a valid URI or null
     * @param title a UTF-8 encoded string
     * @since 2.12
     */
    public fun setTitle(
        uri: String? = null,
        title: String,
    ): Unit = g_bookmark_file_set_title(glibBookmarkFilePointer.reinterpret(), uri, title)

    /**
     * Sets the time the bookmark for @uri was last visited.
     *
     * If no bookmark for @uri is found then it is created.
     *
     * The "visited" time should only be set if the bookmark was launched,
     * either using the command line retrieved by g_bookmark_file_get_application_info()
     * or by the default application for the bookmark's MIME type, retrieved
     * using g_bookmark_file_get_mime_type().  Changing the "visited" time
     * does not affect the "modified" time.
     *
     * @param uri a valid URI
     * @param visited a #GDateTime
     * @since 2.66
     */
    public fun setVisitedDateTime(
        uri: String,
        visited: DateTime,
    ): Unit =
        g_bookmark_file_set_visited_date_time(glibBookmarkFilePointer.reinterpret(), uri, visited.glibDateTimePointer)

    /**
     * This function outputs @bookmark into a file.  The write process is
     * guaranteed to be atomic by using g_file_set_contents() internally.
     *
     * @param filename path of the output file
     * @return true if the file was successfully written.
     * @since 2.12
     */
    public fun toFile(filename: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_bookmark_file_to_file(
                    glibBookmarkFilePointer.reinterpret(),
                    filename,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : RecordCompanion<BookmarkFile, GBookmarkFile> {
        /**
         * Creates a new empty #GBookmarkFile object.
         *
         * Use g_bookmark_file_load_from_file(), g_bookmark_file_load_from_data()
         * or g_bookmark_file_load_from_data_dirs() to read an existing bookmark
         * file.
         *
         * @return an empty #GBookmarkFile
         * @since 2.12
         */
        public fun new(): BookmarkFile = BookmarkFile(g_bookmark_file_new()!!.reinterpret())

        public fun errorQuark(): UInt = g_bookmark_file_error_quark()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): BookmarkFile =
            BookmarkFile(pointer.reinterpret())
    }
}