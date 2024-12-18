// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupCookieJarText
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_cookie_jar_text_get_type
import org.gtkkn.native.soup.soup_cookie_jar_text_new
import kotlin.Boolean
import kotlin.String

/**
 * Text-file-based ("cookies.txt") Cookie Jar
 *
 * #SoupCookieJarText is a [class@CookieJar] that reads cookies from and writes
 * them to a text file in format similar to Mozilla's "cookies.txt".
 *
 * ## Skipped during bindings generation
 *
 * - method `filename`: Property has no getter nor setter
 */
public class CookieJarText(pointer: CPointer<SoupCookieJarText>) :
    CookieJar(pointer.reinterpret()),
    KGTyped {
    public val soupCookieJarTextPointer: CPointer<SoupCookieJarText>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * Creates a #SoupCookieJarText.
     *
     * @filename will be read in at startup to create an initial set of cookies. If
     * @read_only is false, then the non-session cookies will be written to
     * @filename when the [signal@CookieJar::changed] signal is emitted from the
     * jar. (If @read_only is true, then the cookie jar will only be used for this
     * session, and changes made to it will be lost when the jar is destroyed.)
     *
     * @param filename the filename to read to/write from
     * @param readOnly true if @filename is read-only
     * @return the new #SoupCookieJar
     */
    public constructor(
        filename: String,
        readOnly: Boolean,
    ) : this(soup_cookie_jar_text_new(filename, readOnly.asGBoolean())!!.reinterpret())

    public companion object : TypeCompanion<CookieJarText> {
        override val type: GeneratedClassKGType<CookieJarText> =
            GeneratedClassKGType(soup_cookie_jar_text_get_type()) { CookieJarText(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of CookieJarText
         *
         * @return the GType
         */
        public fun getType(): GType = soup_cookie_jar_text_get_type()
    }
}
