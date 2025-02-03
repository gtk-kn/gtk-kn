// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceSearchSettings
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_at_word_boundaries
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_case_sensitive
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_regex_enabled
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_search_text
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_type
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_visible_only
import org.gtkkn.native.gtksource.gtk_source_search_settings_get_wrap_around
import org.gtkkn.native.gtksource.gtk_source_search_settings_new
import org.gtkkn.native.gtksource.gtk_source_search_settings_set_at_word_boundaries
import org.gtkkn.native.gtksource.gtk_source_search_settings_set_case_sensitive
import org.gtkkn.native.gtksource.gtk_source_search_settings_set_regex_enabled
import org.gtkkn.native.gtksource.gtk_source_search_settings_set_search_text
import org.gtkkn.native.gtksource.gtk_source_search_settings_set_visible_only
import org.gtkkn.native.gtksource.gtk_source_search_settings_set_wrap_around
import kotlin.Boolean
import kotlin.String

/**
 * Search settings.
 *
 * A `GtkSourceSearchSettings` object represents the settings of a search. The
 * search settings can be associated with one or several
 * [class@SearchContext]s.
 */
public open class SearchSettings(public val gtksourceSearchSettingsPointer: CPointer<GtkSourceSearchSettings>) :
    Object(gtksourceSearchSettingsPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    /**
     * If true, a search match must start and end a word. The match can
     * span multiple words.
     */
    public open var atWordBoundaries: Boolean
        /**
         *
         *
         * @return whether to search at word boundaries.
         */
        get() = gtk_source_search_settings_get_at_word_boundaries(gtksourceSearchSettingsPointer).asBoolean()

        /**
         * Change whether the search is done at word boundaries.
         *
         * If @at_word_boundaries is true, a search match must start and end a word.
         * The match can span multiple words. See also [method@Gtk.TextIter.starts_word] and
         * [method@Gtk.TextIter.ends_word].
         *
         * @param atWordBoundaries the setting.
         */
        set(
            atWordBoundaries
        ) = gtk_source_search_settings_set_at_word_boundaries(
            gtksourceSearchSettingsPointer,
            atWordBoundaries.asGBoolean()
        )

    /**
     * Whether the search is case sensitive.
     */
    public open var caseSensitive: Boolean
        /**
         *
         *
         * @return whether the search is case sensitive.
         */
        get() = gtk_source_search_settings_get_case_sensitive(gtksourceSearchSettingsPointer).asBoolean()

        /**
         * Enables or disables the case sensitivity for the search.
         *
         * @param caseSensitive the setting.
         */
        set(
            caseSensitive
        ) = gtk_source_search_settings_set_case_sensitive(gtksourceSearchSettingsPointer, caseSensitive.asGBoolean())

    /**
     * Search by regular expressions with
     * [property@SearchSettings:search-text] as the pattern.
     */
    public open var regexEnabled: Boolean
        /**
         *
         *
         * @return whether to search by regular expressions.
         */
        get() = gtk_source_search_settings_get_regex_enabled(gtksourceSearchSettingsPointer).asBoolean()

        /**
         * Enables or disables whether to search by regular expressions.
         *
         * If enabled, the [property@SearchSettings:search-text] property contains the
         * pattern of the regular expression.
         *
         * [class@SearchContext] uses #GRegex when regex search is enabled. See the
         * [Regular expression syntax](https://developer.gnome.org/glib/stable/glib-regex-syntax.html)
         * page in the GLib reference manual.
         *
         * @param regexEnabled the setting.
         */
        set(
            regexEnabled
        ) = gtk_source_search_settings_set_regex_enabled(gtksourceSearchSettingsPointer, regexEnabled.asGBoolean())

    /**
     * A search string, or null if the search is disabled.
     *
     * If the regular expression search is enabled, [property@SearchSettings:search-text] is
     * the pattern.
     */
    public open var searchText: String?
        /**
         * Gets the text to search.
         *
         * The return value must not be freed.
         *
         * You may be interested to call [func@utils_escape_search_text] after
         * this function.
         *
         * @return the text to search, or null if the search is disabled.
         */
        get() = gtk_source_search_settings_get_search_text(gtksourceSearchSettingsPointer)?.toKString()

        /**
         * Sets the text to search.
         *
         * If @search_text is null or is empty, the search will be disabled. A copy of @search_text
         * will be made, so you can safely free @search_text after a call to this function.
         *
         * You may be interested to call [func@utils_unescape_search_text] before
         * this function.
         *
         * @param searchText the nul-terminated text to search, or null to disable the search.
         */
        set(searchText) = gtk_source_search_settings_set_search_text(gtksourceSearchSettingsPointer, searchText)

    /**
     * Exclude invisible text from the search.
     * A search match may have invisible text interspersed.
     *
     * @since 5.12
     */
    @GtkSourceVersion5_12
    public open var visibleOnly: Boolean
        /**
         *
         *
         * @return whether to exclude invisible text from the search.
         * @since 5.12
         */
        get() = gtk_source_search_settings_get_visible_only(gtksourceSearchSettingsPointer).asBoolean()

        /**
         * Enables or disables whether to exclude invisible text from the search.
         *
         * If enabled, only visible text will be searched.
         * A search match may have invisible text interspersed.
         *
         * @param visibleOnly the setting.
         * @since 5.12
         */
        @GtkSourceVersion5_12
        set(
            visibleOnly
        ) = gtk_source_search_settings_set_visible_only(gtksourceSearchSettingsPointer, visibleOnly.asGBoolean())

    /**
     * For a forward search, continue at the beginning of the buffer if no
     * search occurrence is found. For a backward search, continue at the
     * end of the buffer.
     */
    public open var wrapAround: Boolean
        /**
         *
         *
         * @return whether to wrap around the search.
         */
        get() = gtk_source_search_settings_get_wrap_around(gtksourceSearchSettingsPointer).asBoolean()

        /**
         * Enables or disables the wrap around search.
         *
         * If @wrap_around is true, the forward search continues at the beginning of the buffer
         * if no search occurrences are found. Similarly, the backward search continues to search at
         * the end of the buffer.
         *
         * @param wrapAround the setting.
         */
        set(
            wrapAround
        ) = gtk_source_search_settings_set_wrap_around(gtksourceSearchSettingsPointer, wrapAround.asGBoolean())

    /**
     * Creates a new search settings object.
     *
     * @return a new search settings object.
     */
    public constructor() : this(gtk_source_search_settings_new()!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<SearchSettings> {
        override val type: GeneratedClassKGType<SearchSettings> =
            GeneratedClassKGType(getTypeOrNull()!!) { SearchSettings(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of SearchSettings
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_search_settings_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_search_settings_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_search_settings_get_type")
    }
}
