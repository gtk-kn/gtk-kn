// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_4
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceLanguageManager
import org.gtkkn.native.gtksource.gtk_source_language_manager_append_search_path
import org.gtkkn.native.gtksource.gtk_source_language_manager_get_default
import org.gtkkn.native.gtksource.gtk_source_language_manager_get_language
import org.gtkkn.native.gtksource.gtk_source_language_manager_get_language_ids
import org.gtkkn.native.gtksource.gtk_source_language_manager_get_search_path
import org.gtkkn.native.gtksource.gtk_source_language_manager_get_type
import org.gtkkn.native.gtksource.gtk_source_language_manager_guess_language
import org.gtkkn.native.gtksource.gtk_source_language_manager_new
import org.gtkkn.native.gtksource.gtk_source_language_manager_prepend_search_path
import org.gtkkn.native.gtksource.gtk_source_language_manager_set_search_path
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Provides access to [class@Language]s.
 *
 * `GtkSourceLanguageManager` is an object which processes language description
 * files and creates and stores [class@Language] objects, and provides API to
 * access them.
 *
 * Use [func@LanguageManager.get_default] to retrieve the default
 * instance of `GtkSourceLanguageManager`, and
 * [method@LanguageManager.guess_language] to get a [class@Language] for
 * given file name and content type.
 *
 * ## Skipped during bindings generation
 *
 * - method `search-path`: Property TypeInfo of getter and setter do not match
 */
public open class LanguageManager(public val gtksourceLanguageManagerPointer: CPointer<GtkSourceLanguageManager>) :
    Object(gtksourceLanguageManagerPointer.reinterpret()),
    KGTyped {
    public open val languageIds: List<String>?
        /**
         * Returns the ids of the available languages.
         *
         * @return a null-terminated array of strings containing the ids of the available
         * languages or null if no language is available.
         * The array is sorted alphabetically according to the language name.
         * The array is owned by @lm and must not be modified.
         */
        get() = gtk_source_language_manager_get_language_ids(gtksourceLanguageManagerPointer)?.toKStringList()

    /**
     * Creates a new language manager.
     *
     * If you do not need more than one language manager or a private language manager
     * instance then use [func@LanguageManager.get_default] instead.
     *
     * @return a new #GtkSourceLanguageManager.
     */
    public constructor() : this(gtk_source_language_manager_new()!!.reinterpret())

    /**
     * Appends @path to the list of directories where the @manager looks for
     * language files.
     *
     * See [method@LanguageManager.set_search_path] for details.
     *
     * @param path a directory or a filename.
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public open fun appendSearchPath(path: String): Unit =
        gtk_source_language_manager_append_search_path(gtksourceLanguageManagerPointer, path)

    /**
     * Gets the [class@Language] identified by the given @id in the language
     * manager.
     *
     * @param id a language id.
     * @return a #GtkSourceLanguage, or null
     * if there is no language identified by the given @id. Return value is
     * owned by @lm and should not be freed.
     */
    public open fun getLanguage(id: String): Language? =
        gtk_source_language_manager_get_language(gtksourceLanguageManagerPointer, id)?.run {
            Language(this)
        }

    /**
     * Gets the list directories where @lm looks for language files.
     *
     * @return null-terminated array
     * containing a list of language files directories.
     * The array is owned by @lm and must not be modified.
     */
    public open fun getSearchPath(): List<String> =
        gtk_source_language_manager_get_search_path(gtksourceLanguageManagerPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Picks a [class@Language] for given file name and content type,
     * according to the information in lang files.
     *
     * Either @filename or @content_type may be null. This function can be used as follows:
     *
     * ```c
     * GtkSourceLanguage *lang;
     * GtkSourceLanguageManager *manager;
     * lm = gtk_source_language_manager_get_default ();
     * lang = gtk_source_language_manager_guess_language (manager, filename, NULL);
     * gtk_source_buffer_set_language (buffer, lang);
     * ```
     *
     * or
     *
     * ```c
     * GtkSourceLanguage *lang = NULL;
     * GtkSourceLanguageManager *manager;
     * gboolean result_uncertain;
     * gchar *content_type;
     *
     * content_type = g_content_type_guess (filename, NULL, 0, &result_uncertain);
     * if (result_uncertain)
     *   {
     *     g_free (content_type);
     *     content_type = NULL;
     *   }
     *
     * manager = gtk_source_language_manager_get_default ();
     * lang = gtk_source_language_manager_guess_language (manager, filename, content_type);
     * gtk_source_buffer_set_language (buffer, lang);
     *
     * g_free (content_type);
     * ```
     *
     * etc. Use [method@Language.get_mime_types] and [method@Language.get_globs]
     * if you need full control over file -> language mapping.
     *
     * @param filename a filename in Glib filename encoding, or null.
     * @param contentType a content type (as in GIO API), or null.
     * @return a #GtkSourceLanguage, or null if there
     * is no suitable language for given @filename and/or @content_type. Return
     * value is owned by @lm and should not be freed.
     */
    public open fun guessLanguage(filename: String? = null, contentType: String? = null): Language? =
        gtk_source_language_manager_guess_language(gtksourceLanguageManagerPointer, filename, contentType)?.run {
            Language(this)
        }

    /**
     * Prepends @path to the list of directories where the @manager looks
     * for language files.
     *
     * See [method@LanguageManager.set_search_path] for details.
     *
     * @param path a directory or a filename.
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public open fun prependSearchPath(path: String): Unit =
        gtk_source_language_manager_prepend_search_path(gtksourceLanguageManagerPointer, path)

    /**
     * Sets the list of directories where the @lm looks for
     * language files.
     *
     * If @dirs is null, the search path is reset to default.
     *
     * At the moment this function can be called only before the
     * language files are loaded for the first time. In practice
     * to set a custom search path for a `GtkSourceLanguageManager`,
     * you have to call this function right after creating it.
     *
     * Since GtkSourceView 5.4 this function will allow you to provide
     * paths in the form of "resource:///" URIs to embedded `GResource`s.
     * They must contain the path of a directory within the `GResource`.
     *
     * @param dirs a null-terminated array of
     *   strings or null.
     */
    public open fun setSearchPath(dirs: List<String>? = null): Unit = memScoped {
        return gtk_source_language_manager_set_search_path(gtksourceLanguageManagerPointer, dirs?.toCStringList(this))
    }

    public companion object : TypeCompanion<LanguageManager> {
        override val type: GeneratedClassKGType<LanguageManager> =
            GeneratedClassKGType(gtk_source_language_manager_get_type()) { LanguageManager(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Returns the default #GtkSourceLanguageManager instance.
         *
         * @return a #GtkSourceLanguageManager.
         * Return value is owned by GtkSourceView library and must not be unref'ed.
         */
        public fun getDefault(): LanguageManager = gtk_source_language_manager_get_default()!!.run {
            LanguageManager(this)
        }

        /**
         * Get the GType of LanguageManager
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_language_manager_get_type()
    }
}
