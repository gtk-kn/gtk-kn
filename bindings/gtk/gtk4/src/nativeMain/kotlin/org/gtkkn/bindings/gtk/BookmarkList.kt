// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gtk.GtkBookmarkList
import org.gtkkn.native.gtk.gtk_bookmark_list_get_attributes
import org.gtkkn.native.gtk.gtk_bookmark_list_get_filename
import org.gtkkn.native.gtk.gtk_bookmark_list_get_io_priority
import org.gtkkn.native.gtk.gtk_bookmark_list_get_type
import org.gtkkn.native.gtk.gtk_bookmark_list_is_loading
import org.gtkkn.native.gtk.gtk_bookmark_list_new
import org.gtkkn.native.gtk.gtk_bookmark_list_set_attributes
import org.gtkkn.native.gtk.gtk_bookmark_list_set_io_priority
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * `GtkBookmarkList` is a list model that wraps `GBookmarkFile`.
 *
 * It presents a `GListModel` and fills it asynchronously with the
 * `GFileInfo`s returned from that function.
 *
 * The `GFileInfo`s in the list have some attributes in the recent
 * namespace added: `recent::private` (boolean) and `recent:applications`
 * (stringv).
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `loading`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class BookmarkList(
    pointer: CPointer<GtkBookmarkList>,
) : Object(pointer.reinterpret()),
    ListModel,
    KGTyped {
    public val gtkBookmarkListPointer: CPointer<GtkBookmarkList>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    /**
     * The attributes to query.
     */
    public open var attributes: String?
        /**
         * Gets the attributes queried on the children.
         *
         * @return The queried attributes
         */
        get() = gtk_bookmark_list_get_attributes(gtkBookmarkListPointer.reinterpret())?.toKString()

        /**
         * Sets the @attributes to be enumerated and starts the enumeration.
         *
         * If @attributes is null, no attributes will be queried, but a list
         * of `GFileInfo`s will still be created.
         *
         * @param attributes the attributes to enumerate
         */
        set(attributes) = gtk_bookmark_list_set_attributes(gtkBookmarkListPointer.reinterpret(), attributes)

    /**
     * The bookmark file to load.
     */
    public open val filename: String
        /**
         * Returns the filename of the bookmark file that
         * this list is loading.
         *
         * @return the filename of the .xbel file
         */
        get() =
            gtk_bookmark_list_get_filename(gtkBookmarkListPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Priority used when loading.
     */
    public open var ioPriority: Int
        /**
         * Gets the IO priority to use while loading file.
         *
         * @return The IO priority.
         */
        get() = gtk_bookmark_list_get_io_priority(gtkBookmarkListPointer.reinterpret())

        /**
         * Sets the IO priority to use while loading files.
         *
         * The default IO priority is %G_PRIORITY_DEFAULT.
         *
         * @param ioPriority IO priority to use
         */
        set(ioPriority) = gtk_bookmark_list_set_io_priority(gtkBookmarkListPointer.reinterpret(), ioPriority)

    /**
     * Creates a new `GtkBookmarkList` with the given @attributes.
     *
     * @param filename The bookmark file to load
     * @param attributes The attributes to query
     * @return a new `GtkBookmarkList`
     */
    public constructor(
        filename: String? = null,
        attributes: String? = null,
    ) : this(gtk_bookmark_list_new(filename, attributes)!!.reinterpret())

    /**
     * Gets the attributes queried on the children.
     *
     * @return The queried attributes
     */
    public open fun getAttributes(): String? =
        gtk_bookmark_list_get_attributes(gtkBookmarkListPointer.reinterpret())?.toKString()

    /**
     * Returns the filename of the bookmark file that
     * this list is loading.
     *
     * @return the filename of the .xbel file
     */
    public open fun getFilename(): String =
        gtk_bookmark_list_get_filename(gtkBookmarkListPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the IO priority to use while loading file.
     *
     * @return The IO priority.
     */
    public open fun getIoPriority(): Int = gtk_bookmark_list_get_io_priority(gtkBookmarkListPointer.reinterpret())

    /**
     * Returns true if the files are currently being loaded.
     *
     * Files will be added to @self from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     *
     * @return true if @self is loading
     */
    public open fun isLoading(): Boolean =
        gtk_bookmark_list_is_loading(gtkBookmarkListPointer.reinterpret()).asBoolean()

    /**
     * Sets the @attributes to be enumerated and starts the enumeration.
     *
     * If @attributes is null, no attributes will be queried, but a list
     * of `GFileInfo`s will still be created.
     *
     * @param attributes the attributes to enumerate
     */
    public open fun setAttributes(attributes: String? = null): Unit =
        gtk_bookmark_list_set_attributes(gtkBookmarkListPointer.reinterpret(), attributes)

    /**
     * Sets the IO priority to use while loading files.
     *
     * The default IO priority is %G_PRIORITY_DEFAULT.
     *
     * @param ioPriority IO priority to use
     */
    public open fun setIoPriority(ioPriority: Int): Unit =
        gtk_bookmark_list_set_io_priority(gtkBookmarkListPointer.reinterpret(), ioPriority)

    public companion object : TypeCompanion<BookmarkList> {
        override val type: GeneratedClassKGType<BookmarkList> =
            GeneratedClassKGType(gtk_bookmark_list_get_type()) { BookmarkList(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
