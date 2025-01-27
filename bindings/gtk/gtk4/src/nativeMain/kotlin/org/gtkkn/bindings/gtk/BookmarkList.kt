// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
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
import kotlin.String

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
public open class BookmarkList(public val gtkBookmarkListPointer: CPointer<GtkBookmarkList>) :
    Object(gtkBookmarkListPointer.reinterpret()),
    ListModel,
    KGTyped {
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
        get() = gtk_bookmark_list_get_attributes(gtkBookmarkListPointer)?.toKString()

        /**
         * Sets the @attributes to be enumerated and starts the enumeration.
         *
         * If @attributes is null, no attributes will be queried, but a list
         * of `GFileInfo`s will still be created.
         *
         * @param attributes the attributes to enumerate
         */
        set(attributes) = gtk_bookmark_list_set_attributes(gtkBookmarkListPointer, attributes)

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
        get() = gtk_bookmark_list_get_filename(gtkBookmarkListPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Priority used when loading.
     */
    public open var ioPriority: gint
        /**
         * Gets the IO priority to use while loading file.
         *
         * @return The IO priority.
         */
        get() = gtk_bookmark_list_get_io_priority(gtkBookmarkListPointer)

        /**
         * Sets the IO priority to use while loading files.
         *
         * The default IO priority is %G_PRIORITY_DEFAULT.
         *
         * @param ioPriority IO priority to use
         */
        set(ioPriority) = gtk_bookmark_list_set_io_priority(gtkBookmarkListPointer, ioPriority)

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
     * Returns true if the files are currently being loaded.
     *
     * Files will be added to @self from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     *
     * @return true if @self is loading
     */
    public open fun isLoading(): Boolean = gtk_bookmark_list_is_loading(gtkBookmarkListPointer).asBoolean()

    public companion object : TypeCompanion<BookmarkList> {
        override val type: GeneratedClassKGType<BookmarkList> =
            GeneratedClassKGType(getTypeOrNull("gtk_bookmark_list_get_type")!!) { BookmarkList(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BookmarkList
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_bookmark_list_get_type()
    }
}
