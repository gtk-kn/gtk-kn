// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupWebsocketExtensionDeflate
import org.gtkkn.native.soup.soup_websocket_extension_deflate_get_type

/**
 * A SoupWebsocketExtensionDeflate is a [class@WebsocketExtension]
 * implementing permessage-deflate (RFC 7692).
 *
 * This extension is used by default in a [class@Session] when [class@WebsocketExtensionManager]
 * feature is present, and always used by [class@Server].
 */
public class WebsocketExtensionDeflate(
    public val soupWebsocketExtensionDeflatePointer: CPointer<SoupWebsocketExtensionDeflate>,
) : WebsocketExtension(soupWebsocketExtensionDeflatePointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<WebsocketExtensionDeflate> {
        override val type: GeneratedClassKGType<WebsocketExtensionDeflate> =
            GeneratedClassKGType(soup_websocket_extension_deflate_get_type()) {
                WebsocketExtensionDeflate(it.reinterpret())
            }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of WebsocketExtensionDeflate
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_extension_deflate_get_type()
    }
}
