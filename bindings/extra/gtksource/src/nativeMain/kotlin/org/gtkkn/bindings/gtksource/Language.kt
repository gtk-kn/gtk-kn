// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceLanguage
import org.gtkkn.native.gtksource.gtk_source_language_get_globs
import org.gtkkn.native.gtksource.gtk_source_language_get_hidden
import org.gtkkn.native.gtksource.gtk_source_language_get_id
import org.gtkkn.native.gtksource.gtk_source_language_get_metadata
import org.gtkkn.native.gtksource.gtk_source_language_get_mime_types
import org.gtkkn.native.gtksource.gtk_source_language_get_name
import org.gtkkn.native.gtksource.gtk_source_language_get_section
import org.gtkkn.native.gtksource.gtk_source_language_get_style_fallback
import org.gtkkn.native.gtksource.gtk_source_language_get_style_ids
import org.gtkkn.native.gtksource.gtk_source_language_get_style_name
import org.gtkkn.native.gtksource.gtk_source_language_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Represents a syntax highlighted language.
 *
 * A `GtkSourceLanguage` represents a programming or markup language, affecting
 * syntax highlighting and [context classes](./class.Buffer.html#context-classes).
 *
 * Use [class@LanguageManager] to obtain a `GtkSourceLanguage` instance, and
 * [method@Buffer.set_language] to apply it to a [class@Buffer].
 */
public open class Language(pointer: CPointer<GtkSourceLanguage>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceLanguagePointer: CPointer<GtkSourceLanguage>
        get() = gPointer.reinterpret()

    public open val hidden: Boolean
        /**
         * Returns whether the language should be hidden from the user.
         *
         * @return true if the language should be hidden, false otherwise.
         */
        get() = gtk_source_language_get_hidden(gtksourceLanguagePointer).asBoolean()

    public open val id: String
        /**
         * Returns the ID of the language.
         *
         * The ID is not locale-dependent.The returned string is owned by @language
         * and should not be freed or modified.
         *
         * @return the ID of @language.
         */
        get() = gtk_source_language_get_id(gtksourceLanguagePointer)?.toKString() ?: error("Expected not null string")

    public open val name: String
        /**
         * Returns the localized name of the language.
         *
         * The returned string is owned by @language and should not be freed
         * or modified.
         *
         * @return the name of @language.
         */
        get() = gtk_source_language_get_name(gtksourceLanguagePointer)?.toKString() ?: error("Expected not null string")

    public open val section: String
        /**
         * Returns the localized section of the language.
         *
         * Each language belong to a section (ex. HTML belongs to the
         * Markup section).
         * The returned string is owned by @language and should not be freed
         * or modified.
         *
         * @return the section of @language.
         */
        get() = gtk_source_language_get_section(gtksourceLanguagePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the globs associated to this language.
     *
     * This is just an utility wrapper around [method@Language.get_metadata] to
     * retrieve the "globs" metadata property and split it into an array.
     *
     * @return a newly-allocated null terminated array containing the globs or null
     * if no globs are found.
     * The returned array must be freed with g_strfreev().
     */
    public open fun getGlobs(): List<String>? = gtk_source_language_get_globs(gtksourceLanguagePointer)?.toKStringList()

    /**
     *
     *
     * @param name metadata property name.
     * @return value of property @name stored in
     * the metadata of @language or null if language does not contain the
     * specified metadata property.
     * The returned string is owned by @language and should not be freed
     * or modified.
     */
    public open fun getMetadata(name: String): String? =
        gtk_source_language_get_metadata(gtksourceLanguagePointer, name)?.toKString()

    /**
     * Returns the mime types associated to this language.
     *
     * This is just an utility wrapper around [method@Language.get_metadata] to
     * retrieve the "mimetypes" metadata property and split it into an
     * array.
     *
     * @return a newly-allocated null terminated array containing the mime types
     * or null if no mime types are found.
     * The returned array must be freed with g_strfreev().
     */
    public open fun getMimeTypes(): List<String>? =
        gtk_source_language_get_mime_types(gtksourceLanguagePointer)?.toKStringList()

    /**
     * Returns the ID of the style to use if the specified @style_id
     * is not present in the current style scheme.
     *
     * @param styleId a style ID.
     * @return the ID of the style to use if the
     * specified @style_id is not present in the current style scheme or null
     * if the style has no fallback defined.
     * The returned string is owned by the @language and must not be modified.
     */
    public open fun getStyleFallback(styleId: String): String? =
        gtk_source_language_get_style_fallback(gtksourceLanguagePointer, styleId)?.toKString()

    /**
     * Returns the ids of the styles defined by this @language.
     *
     * @return a newly-allocated null terminated array containing ids of the
     * styles defined by this @language or null if no style is defined.
     * The returned array must be freed with g_strfreev().
     */
    public open fun getStyleIds(): List<String>? =
        gtk_source_language_get_style_ids(gtksourceLanguagePointer)?.toKStringList()

    /**
     * Returns the name of the style with ID @style_id defined by this @language.
     *
     * @param styleId a style ID.
     * @return the name of the style with ID @style_id
     * defined by this @language or null if the style has no name or there is no
     * style with ID @style_id defined by this @language.
     * The returned string is owned by the @language and must not be modified.
     */
    public open fun getStyleName(styleId: String): String? =
        gtk_source_language_get_style_name(gtksourceLanguagePointer, styleId)?.toKString()

    public companion object : TypeCompanion<Language> {
        override val type: GeneratedClassKGType<Language> =
            GeneratedClassKGType(gtk_source_language_get_type()) { Language(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of Language
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_language_get_type()
    }
}
