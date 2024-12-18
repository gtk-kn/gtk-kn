// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupCookieJarDB
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_cookie_jar_db_get_type
import org.gtkkn.native.soup.soup_cookie_jar_db_new
import kotlin.Boolean
import kotlin.String

/**
 * Database-based Cookie Jar.
 *
 * #SoupCookieJarDB is a [class@CookieJar] that reads cookies from and writes
 * them to a sqlite database in the new Mozilla format.
 *
 * (This is identical to `SoupCookieJarSqlite` in
 * libsoup-gnome; it has just been moved into libsoup proper, and
 * renamed to avoid conflicting.)
 *
 * ## Skipped during bindings generation
 *
 * - method `filename`: Property has no getter nor setter
 */
public class CookieJarDb(pointer: CPointer<SoupCookieJarDB>) :
    CookieJar(pointer.reinterpret()),
    KGTyped {
    public val soupCookieJarDBPointer: CPointer<SoupCookieJarDB>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * Creates a #SoupCookieJarDB.
     *
     * @filename will be read in at startup to create an initial set of cookies. If
     * @read_only is false, then the non-session cookies will be written to
     * @filename when the [signal@CookieJar::changed] signal is emitted from the
     * jar. (If @read_only is true, then the cookie jar will only be used for this
     * session, and changes made to it will be lost when the jar is destroyed.)
     *
     * @param filename the filename to read to/write from, or null
     * @param readOnly true if @filename is read-only
     * @return the new #SoupCookieJar
     */
    public constructor(
        filename: String,
        readOnly: Boolean,
    ) : this(soup_cookie_jar_db_new(filename, readOnly.asGBoolean())!!.reinterpret())

    public companion object : TypeCompanion<CookieJarDb> {
        override val type: GeneratedClassKGType<CookieJarDb> =
            GeneratedClassKGType(soup_cookie_jar_db_get_type()) { CookieJarDb(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of CookieJarDB
         *
         * @return the GType
         */
        public fun getType(): GType = soup_cookie_jar_db_get_type()
    }
}
