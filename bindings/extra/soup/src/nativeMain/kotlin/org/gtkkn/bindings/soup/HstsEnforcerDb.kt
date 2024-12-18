// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupHSTSEnforcerDB
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_hsts_enforcer_db_get_type
import org.gtkkn.native.soup.soup_hsts_enforcer_db_new
import kotlin.String

/**
 * Persistent HTTP Strict Transport Security enforcer.
 *
 * #SoupHSTSEnforcerDB is a [class@HSTSEnforcer] that uses a SQLite
 * database as a backend for persistency.
 *
 * ## Skipped during bindings generation
 *
 * - method `filename`: Property has no getter nor setter
 */
public class HstsEnforcerDb(pointer: CPointer<SoupHSTSEnforcerDB>) :
    HstsEnforcer(pointer.reinterpret()),
    KGTyped {
    public val soupHSTSEnforcerDBPointer: CPointer<SoupHSTSEnforcerDB>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * Creates a #SoupHSTSEnforcerDB.
     *
     * @filename will be read in during the initialization of a
     * #SoupHSTSEnforcerDB, in order to create an initial set of HSTS
     * policies. If the file doesn't exist, a new database will be created
     * and initialized. Changes to the policies during the lifetime of a
     * #SoupHSTSEnforcerDB will be written to @filename when
     * [signal@HSTSEnforcer::changed] is emitted.
     *
     * @param filename the filename of the database to read/write from.
     * @return the new #SoupHSTSEnforcer
     */
    public constructor(filename: String) : this(soup_hsts_enforcer_db_new(filename)!!.reinterpret())

    public companion object : TypeCompanion<HstsEnforcerDb> {
        override val type: GeneratedClassKGType<HstsEnforcerDb> =
            GeneratedClassKGType(soup_hsts_enforcer_db_get_type()) { HstsEnforcerDb(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of HSTSEnforcerDB
         *
         * @return the GType
         */
        public fun getType(): GType = soup_hsts_enforcer_db_get_type()
    }
}
