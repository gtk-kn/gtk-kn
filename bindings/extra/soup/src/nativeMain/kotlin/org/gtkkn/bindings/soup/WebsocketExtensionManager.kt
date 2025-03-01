// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.SoupWebsocketExtensionManager
import org.gtkkn.native.soup.soup_websocket_extension_manager_get_type

/**
 * SoupWebsocketExtensionManager is the [iface@SessionFeature] that handles WebSockets
 * extensions for a [class@Session].
 *
 * A #SoupWebsocketExtensionManager is added to the session by default, and normally
 * you don't need to worry about it at all. However, if you want to
 * disable WebSocket extensions, you can remove the feature from the
 * session with [method@Session.remove_feature_by_type] or disable it on
 * individual requests with [method@Message.disable_feature].
 */
public class WebsocketExtensionManager(
    public val soupWebsocketExtensionManagerPointer: CPointer<SoupWebsocketExtensionManager>,
) : Object(soupWebsocketExtensionManagerPointer.reinterpret()),
    SessionFeature,
    KGTyped {
    init {
        Soup
    }

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<WebsocketExtensionManager> {
        override val type: GeneratedClassKGType<WebsocketExtensionManager> =
            GeneratedClassKGType(getTypeOrNull()!!) { WebsocketExtensionManager(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of WebsocketExtensionManager
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_extension_manager_get_type()

        /**
         * Gets the GType of from the symbol `soup_websocket_extension_manager_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("soup_websocket_extension_manager_get_type")
    }
}
