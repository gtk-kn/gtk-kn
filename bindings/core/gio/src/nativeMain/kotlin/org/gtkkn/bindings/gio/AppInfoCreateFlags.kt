// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GAppInfoCreateFlags
import org.gtkkn.native.gio.G_APP_INFO_CREATE_NEEDS_TERMINAL
import org.gtkkn.native.gio.G_APP_INFO_CREATE_NONE
import org.gtkkn.native.gio.G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION
import org.gtkkn.native.gio.G_APP_INFO_CREATE_SUPPORTS_URIS
import org.gtkkn.native.gio.g_app_info_create_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when creating a #GAppInfo.
 */
public class AppInfoCreateFlags(public val mask: GAppInfoCreateFlags) : Bitfield<AppInfoCreateFlags> {
    override infix fun or(other: AppInfoCreateFlags): AppInfoCreateFlags = AppInfoCreateFlags(mask or other.mask)

    public companion object {
        /**
         * No flags.
         */
        public val NONE: AppInfoCreateFlags = AppInfoCreateFlags(G_APP_INFO_CREATE_NONE)

        /**
         * Application opens in a terminal window.
         */
        public val NEEDS_TERMINAL: AppInfoCreateFlags =
            AppInfoCreateFlags(G_APP_INFO_CREATE_NEEDS_TERMINAL)

        /**
         * Application supports URI arguments.
         */
        public val SUPPORTS_URIS: AppInfoCreateFlags =
            AppInfoCreateFlags(G_APP_INFO_CREATE_SUPPORTS_URIS)

        /**
         * Application supports startup notification. Since 2.26
         */
        public val SUPPORTS_STARTUP_NOTIFICATION: AppInfoCreateFlags =
            AppInfoCreateFlags(G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION)

        /**
         * Get the GType of AppInfoCreateFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_app_info_create_flags_get_type()
    }
}
