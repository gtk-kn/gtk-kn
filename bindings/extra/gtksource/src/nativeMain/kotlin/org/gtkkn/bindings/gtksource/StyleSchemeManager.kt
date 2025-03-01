// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceStyleSchemeManager
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_append_search_path
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_force_rescan
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_get_default
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_get_scheme
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_get_scheme_ids
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_get_search_path
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_get_type
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_new
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_prepend_search_path
import org.gtkkn.native.gtksource.gtk_source_style_scheme_manager_set_search_path
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Provides access to [class@StyleScheme]s.
 *
 * ## Skipped during bindings generation
 *
 * - method `search-path`: Property TypeInfo of getter and setter do not match
 */
public open class StyleSchemeManager(
    public val gtksourceStyleSchemeManagerPointer: CPointer<GtkSourceStyleSchemeManager>,
) : Object(gtksourceStyleSchemeManagerPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    public open val schemeIds: List<String>?
        /**
         * Returns the ids of the available style schemes.
         *
         * @return a null-terminated array of strings containing the ids of the available
         * style schemes or null if no style scheme is available.
         * The array is sorted alphabetically according to the scheme name.
         * The array is owned by the @manager and must not be modified.
         */
        get() = gtk_source_style_scheme_manager_get_scheme_ids(gtksourceStyleSchemeManagerPointer)?.toKStringList()

    /**
     * Creates a new style manager.
     *
     * If you do not need more than one style manager
     * then use [func@StyleSchemeManager.get_default] instead.
     *
     * @return a new #GtkSourceStyleSchemeManager.
     */
    public constructor() : this(gtk_source_style_scheme_manager_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Appends @path to the list of directories where the @manager looks for
     * style scheme files.
     *
     * See [method@StyleSchemeManager.set_search_path] for details.
     *
     * @param path a directory or a filename.
     */
    public open fun appendSearchPath(path: String): Unit =
        gtk_source_style_scheme_manager_append_search_path(gtksourceStyleSchemeManagerPointer, path)

    /**
     * Mark any currently cached information about the available style schems
     * as invalid.
     *
     * All the available style schemes will be reloaded next time the @manager is accessed.
     */
    public open fun forceRescan(): Unit =
        gtk_source_style_scheme_manager_force_rescan(gtksourceStyleSchemeManagerPointer)

    /**
     * Looks up style scheme by id.
     *
     * @param schemeId style scheme id to find.
     * @return a #GtkSourceStyleScheme object.
     *   The returned value is owned by @manager and must not be unref'ed.
     */
    public open fun getScheme(schemeId: String): StyleScheme? =
        gtk_source_style_scheme_manager_get_scheme(gtksourceStyleSchemeManagerPointer, schemeId)?.run {
            InstanceCache.get(this, true) { StyleScheme(reinterpret()) }!!
        }

    /**
     * Returns the current search path for the @manager.
     *
     * See [method@StyleSchemeManager.set_search_path] for details.
     *
     * @return a null-terminated array
     * of string containing the search path.
     * The array is owned by the @manager and must not be modified.
     */
    public open fun getSearchPath(): List<String> =
        gtk_source_style_scheme_manager_get_search_path(gtksourceStyleSchemeManagerPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Prepends @path to the list of directories where the @manager looks
     * for style scheme files.
     *
     * See [method@StyleSchemeManager.set_search_path] for details.
     *
     * @param path a directory or a filename.
     */
    public open fun prependSearchPath(path: String): Unit =
        gtk_source_style_scheme_manager_prepend_search_path(gtksourceStyleSchemeManagerPointer, path)

    /**
     * Sets the list of directories where the @manager looks for
     * style scheme files.
     *
     * If @path is null, the search path is reset to default.
     *
     * @param path a null-terminated array of
     *   strings or null.
     */
    public open fun setSearchPath(path: List<String>? = null): Unit = memScoped {
        return gtk_source_style_scheme_manager_set_search_path(
            gtksourceStyleSchemeManagerPointer,
            path?.toCStringList(this)
        )
    }

    public companion object : TypeCompanion<StyleSchemeManager> {
        override val type: GeneratedClassKGType<StyleSchemeManager> =
            GeneratedClassKGType(getTypeOrNull()!!) { StyleSchemeManager(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Returns the default #GtkSourceStyleSchemeManager instance.
         *
         * @return a #GtkSourceStyleSchemeManager. Return value
         * is owned by GtkSourceView library and must not be unref'ed.
         */
        public fun getDefault(): StyleSchemeManager = gtk_source_style_scheme_manager_get_default()!!.run {
            InstanceCache.get(this, true) { StyleSchemeManager(reinterpret()) }!!
        }

        /**
         * Get the GType of StyleSchemeManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_scheme_manager_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_style_scheme_manager_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_style_scheme_manager_get_type")
    }
}
