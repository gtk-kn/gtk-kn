// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_6
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceSnippetManager
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_get_default
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_get_search_path
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_get_snippet
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_get_type
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_list_all
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_list_groups
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_list_matching
import org.gtkkn.native.gtksource.gtk_source_snippet_manager_set_search_path
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Provides access to [class@Snippet].
 *
 * `GtkSourceSnippetManager` is an object which processes snippet description
 * files and creates [class@Snippet] objects.
 *
 * Use [func@SnippetManager.get_default] to retrieve the default
 * instance of `GtkSourceSnippetManager`.
 *
 * Use [method@SnippetManager.get_snippet] to retrieve snippets for
 * a given snippets.
 *
 * ## Skipped during bindings generation
 *
 * - method `search-path`: Property TypeInfo of getter and setter do not match
 */
public open class SnippetManager(public val gtksourceSnippetManagerPointer: CPointer<GtkSourceSnippetManager>) :
    Object(gtksourceSnippetManagerPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    /**
     * Gets the list directories where @self looks for snippet files.
     *
     * @return null-terminated array
     *   containing a list of snippet files directories.
     *   The array is owned by @lm and must not be modified.
     */
    public open fun getSearchPath(): List<String> =
        gtk_source_snippet_manager_get_search_path(gtksourceSnippetManagerPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Queries the known snippets for the first matching @group, @language_id,
     * and/or @trigger.
     *
     * If @group or @language_id are null, they will be ignored.
     *
     * @param group a group name or null
     * @param languageId a #GtkSourceLanguage:id or null
     * @param trigger the trigger for the snippet
     * @return a #GtkSourceSnippet or null if no
     *   matching snippet was found.
     */
    public open fun getSnippet(group: String? = null, languageId: String? = null, trigger: String): Snippet? =
        gtk_source_snippet_manager_get_snippet(gtksourceSnippetManagerPointer, group, languageId, trigger)?.run {
            InstanceCache.get(this, true) { Snippet(reinterpret()) }!!
        }

    /**
     * Gets a [iface@Gio.ListModel] of all snippets.
     *
     * This can be used to get an unfiltered list of all of the snippets
     * known to the snippet manager.
     *
     * @return a [iface@Gio.ListModel] of [class@GtkSource.Snippet]
     * @since 5.6
     */
    @GtkSourceVersion5_6
    public open fun listAll(): ListModel = gtk_source_snippet_manager_list_all(gtksourceSnippetManagerPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * List all the known groups within the snippet manager.
     *
     * The result should be freed with g_free(), and the individual strings are
     * owned by @self and should never be freed by the caller.
     *
     * @return An array of strings which should be freed with g_free().
     */
    public open fun listGroups(): List<String> =
        gtk_source_snippet_manager_list_groups(gtksourceSnippetManagerPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Queries the known snippets for those matching @group, @language_id, and/or
     * @trigger_prefix.
     *
     * If any of these are null, they will be ignored when filtering the available snippets.
     *
     * The [iface@Gio.ListModel] only contains information about the available snippets until
     * [method@Gio.ListModel.get_item] is called for a specific snippet. This helps reduce
     * the number of [class@GObject.Object]'s that are created at runtime to those needed by
     * the calling application.
     *
     * @param group a group name or null
     * @param languageId a #GtkSourceLanguage:id or null
     * @param triggerPrefix a prefix for a trigger to activate
     * @return a #GListModel of #GtkSourceSnippet.
     */
    public open fun listMatching(
        group: String? = null,
        languageId: String? = null,
        triggerPrefix: String? = null,
    ): ListModel = gtk_source_snippet_manager_list_matching(
        gtksourceSnippetManagerPointer,
        group,
        languageId,
        triggerPrefix
    )!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * Sets the list of directories in which the `GtkSourceSnippetManager` looks for
     * snippet files.
     *
     * If @dirs is null, the search path is reset to default.
     *
     * At the moment this function can be called only before the
     * snippet files are loaded for the first time. In practice
     * to set a custom search path for a `GtkSourceSnippetManager`,
     * you have to call this function right after creating it.
     *
     * @param dirs a null-terminated array of
     *   strings or null.
     */
    public open fun setSearchPath(dirs: List<String>? = null): Unit = memScoped {
        return gtk_source_snippet_manager_set_search_path(gtksourceSnippetManagerPointer, dirs?.toCStringList(this))
    }

    public companion object : TypeCompanion<SnippetManager> {
        override val type: GeneratedClassKGType<SnippetManager> =
            GeneratedClassKGType(getTypeOrNull()!!) { SnippetManager(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Returns the default #GtkSourceSnippetManager instance.
         *
         * @return a #GtkSourceSnippetManager which
         *   is owned by GtkSourceView library and must not be unref'd.
         */
        public fun getDefault(): SnippetManager = gtk_source_snippet_manager_get_default()!!.run {
            InstanceCache.get(this, true) { SnippetManager(reinterpret()) }!!
        }

        /**
         * Get the GType of SnippetManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_snippet_manager_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_snippet_manager_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_snippet_manager_get_type")
    }
}
