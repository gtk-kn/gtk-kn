// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public class CookieJarText(public val soupCookieJarTextPointer: CPointer<SoupCookieJarText>) :
    CookieJar(soupCookieJarTextPointer.reinterpret()),
    KGTyped {
    init {
        Soup
    }

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = handle.reinterpret()

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
    ) : this(soup_cookie_jar_text_new(filename, readOnly.asGBoolean())!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CookieJarText> {
        override val type: GeneratedClassKGType<CookieJarText> =
            GeneratedClassKGType(getTypeOrNull()!!) { CookieJarText(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of CookieJarText
         *
         * @return the GType
         */
        public fun getType(): GType = soup_cookie_jar_text_get_type()

        /**
         * Gets the GType of from the symbol `soup_cookie_jar_text_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("soup_cookie_jar_text_get_type")
    }
}
