// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_4
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceStyleScheme
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_authors
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_description
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_filename
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_id
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_metadata
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_name
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_style
import org.gtkkn.native.gtksource.gtk_source_style_scheme_get_type
import kotlin.String
import kotlin.collections.List

/**
 * Controls the appearance of [class@View].
 *
 * #GtkSourceStyleScheme contains all the text styles to be used in
 * [class@View] and [class@Buffer]. For instance, it contains text styles
 * for syntax highlighting, it may contain foreground and background color for
 * non-highlighted text, color for the line numbers, current line highlighting,
 * bracket matching, etc.
 *
 * Style schemes are stored in XML files. The format of a scheme file is
 * documented in the [style scheme reference](./style-reference.html).
 *
 * The two style schemes with IDs "classic" and "tango" follow more closely the
 * GTK theme (for example for the background color).
 */
public open class StyleScheme(pointer: CPointer<GtkSourceStyleScheme>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceStyleSchemePointer: CPointer<GtkSourceStyleScheme>
        get() = gPointer.reinterpret()

    /**
     * Style scheme description, a translatable string to present to the user.
     */
    public open val description: String?
        /**
         *
         *
         * @return @scheme description (if defined), or null.
         */
        get() = gtk_source_style_scheme_get_description(gtksourceStyleSchemePointer)?.toKString()

    /**
     * Style scheme filename or null.
     */
    public open val filename: String?
        /**
         *
         *
         * @return @scheme file name if the scheme was created
         * parsing a style scheme file or null in the other cases.
         */
        get() = gtk_source_style_scheme_get_filename(gtksourceStyleSchemePointer)?.toKString()

    /**
     * Style scheme id, a unique string used to identify the style scheme
     * in [class@StyleSchemeManager].
     */
    public open val id: String
        /**
         *
         *
         * @return @scheme id.
         */
        get() = gtk_source_style_scheme_get_id(gtksourceStyleSchemePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Style scheme name, a translatable string to present to the user.
     */
    public open val name: String
        /**
         *
         *
         * @return @scheme name.
         */
        get() = gtk_source_style_scheme_get_name(gtksourceStyleSchemePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @return a
     * null-terminated array containing the @scheme authors or null if
     * no author is specified by the style scheme.
     */
    public open fun getAuthors(): List<String>? =
        gtk_source_style_scheme_get_authors(gtksourceStyleSchemePointer)?.toKStringList()

    /**
     * Gets a metadata property from the style scheme.
     *
     * @param name metadata property name.
     * @return value of property @name stored in
     *   the metadata of @scheme or null if @scheme does not contain the
     *   specified metadata property.
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public open fun getMetadata(name: String): String? =
        gtk_source_style_scheme_get_metadata(gtksourceStyleSchemePointer, name)?.toKString()

    /**
     *
     *
     * @param styleId id of the style to retrieve.
     * @return style which corresponds to @style_id in
     * the @scheme, or null when no style with this name found.  It is owned by
     * @scheme and may not be unref'ed.
     */
    public open fun getStyle(styleId: String): Style? =
        gtk_source_style_scheme_get_style(gtksourceStyleSchemePointer, styleId)?.run {
            Style(this)
        }

    public companion object : TypeCompanion<StyleScheme> {
        override val type: GeneratedClassKGType<StyleScheme> =
            GeneratedClassKGType(gtk_source_style_scheme_get_type()) { StyleScheme(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of StyleScheme
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_scheme_get_type()
    }
}
