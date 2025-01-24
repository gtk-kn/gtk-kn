// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_session_feature_get_type

/**
 * Interface for miscellaneous [class@Session] features.
 *
 * #SoupSessionFeature is the interface used by classes that extend
 * the functionality of a [class@Session]. Some features like HTTP
 * authentication handling are implemented internally via
 * `SoupSessionFeature`s. Other features can be added to the session
 * by the application. (Eg, [class@Logger], [class@CookieJar].)
 *
 * See [method@Session.add_feature], etc, to add a feature to a session.
 */
public interface SessionFeature :
    Proxy,
    KGTyped {
    public val soupSessionFeaturePointer: CPointer<SoupSessionFeature>

    /**
     * The SessionFeatureImpl type represents a native instance of the SessionFeature interface.
     *
     * @constructor Creates a new instance of SessionFeature for the provided [CPointer].
     */
    public data class SessionFeatureImpl(override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>) :
        Object(soupSessionFeaturePointer.reinterpret()),
        SessionFeature

    public companion object : TypeCompanion<SessionFeature> {
        override val type: GeneratedInterfaceKGType<SessionFeature> =
            GeneratedInterfaceKGType(soup_session_feature_get_type()) { SessionFeatureImpl(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of SessionFeature
         *
         * @return the GType
         */
        public fun getType(): GType = soup_session_feature_get_type()
    }
}
