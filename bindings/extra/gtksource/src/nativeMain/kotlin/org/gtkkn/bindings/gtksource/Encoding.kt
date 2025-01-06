// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceEncoding
import org.gtkkn.native.gtksource.gtk_source_encoding_copy
import org.gtkkn.native.gtksource.gtk_source_encoding_free
import org.gtkkn.native.gtksource.gtk_source_encoding_get_all
import org.gtkkn.native.gtksource.gtk_source_encoding_get_charset
import org.gtkkn.native.gtksource.gtk_source_encoding_get_current
import org.gtkkn.native.gtksource.gtk_source_encoding_get_default_candidates
import org.gtkkn.native.gtksource.gtk_source_encoding_get_from_charset
import org.gtkkn.native.gtksource.gtk_source_encoding_get_name
import org.gtkkn.native.gtksource.gtk_source_encoding_get_type
import org.gtkkn.native.gtksource.gtk_source_encoding_get_utf8
import org.gtkkn.native.gtksource.gtk_source_encoding_to_string
import kotlin.String
import kotlin.Unit

/**
 * Character encoding.
 *
 * The #GtkSourceEncoding boxed type represents a character encoding. It is used
 * for example by #GtkSourceFile. Note that the text in GTK widgets is always
 * encoded in UTF-8.
 */
public class Encoding(pointer: CPointer<GtkSourceEncoding>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkSourceEncoding> = pointer

    /**
     * Used by language bindings.
     *
     * @return a copy of @enc.
     */
    public fun copy(): Encoding = gtk_source_encoding_copy(gPointer.reinterpret())!!.run {
        Encoding(reinterpret())
    }

    /**
     * Used by language bindings.
     */
    public fun free(): Unit = gtk_source_encoding_free(gPointer.reinterpret())

    /**
     * Gets the character set of the #GtkSourceEncoding, such as "UTF-8" or
     * "ISO-8859-1".
     *
     * @return the character set of the #GtkSourceEncoding.
     */
    public fun getCharset(): String =
        gtk_source_encoding_get_charset(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the name of the #GtkSourceEncoding such as "Unicode" or "Western".
     *
     * @return the name of the #GtkSourceEncoding.
     */
    public fun getName(): String =
        gtk_source_encoding_get_name(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     *
     *
     * @return a string representation. Free with g_free() when no longer needed.
     */
    override fun toString(): String =
        gtk_source_encoding_to_string(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    public companion object {
        /**
         * Gets all encodings.
         *
         * @return a list of
         * all #GtkSourceEncoding's. Free with g_slist_free().
         */
        public fun getAll(): SList = gtk_source_encoding_get_all()!!.run {
            SList(reinterpret())
        }

        /**
         * Gets the #GtkSourceEncoding for the current locale.
         *
         * See also [func@GLib.get_charset].
         *
         * @return the current locale encoding.
         */
        public fun getCurrent(): Encoding = gtk_source_encoding_get_current()!!.run {
            Encoding(reinterpret())
        }

        /**
         * Gets the list of default candidate encodings to try when loading a file.
         *
         * See [method@FileLoader.set_candidate_encodings].
         *
         * This function returns a different list depending on the current locale (i.e.
         * language, country and default encoding). The UTF-8 encoding and the current
         * locale encoding are guaranteed to be present in the returned list.
         *
         * @return the list of
         * default candidate encodings. Free with g_slist_free().
         */
        public fun getDefaultCandidates(): SList = gtk_source_encoding_get_default_candidates()!!.run {
            SList(reinterpret())
        }

        /**
         * Gets a #GtkSourceEncoding from a character set such as "UTF-8" or
         * "ISO-8859-1".
         *
         * @param charset a character set.
         * @return the corresponding #GtkSourceEncoding, or null
         * if not found.
         */
        public fun getFromCharset(charset: String): Encoding? = gtk_source_encoding_get_from_charset(charset)?.run {
            Encoding(reinterpret())
        }

        /**
         *
         *
         * @return the UTF-8 encoding.
         */
        public fun getUtf8(): Encoding = gtk_source_encoding_get_utf8()!!.run {
            Encoding(reinterpret())
        }

        /**
         * Get the GType of Encoding
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_encoding_get_type()
    }
}
