// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.native.gio.GNetworkConnectivity
import org.gtkkn.native.gio.g_network_connectivity_get_type
import org.gtkkn.native.gobject.GType

/**
 * The host's network connectivity state, as reported by #GNetworkMonitor.
 * @since 2.44
 */
@GioVersion2_44
public enum class NetworkConnectivity(public val nativeValue: GNetworkConnectivity) {
    /**
     * The host is not configured with a
     *   route to the Internet; it may or may not be connected to a local
     *   network.
     */
    LOCAL(GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LOCAL),

    /**
     * The host is connected to a network, but
     *   does not appear to be able to reach the full Internet, perhaps
     *   due to upstream network problems.
     */
    LIMITED(GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LIMITED),

    /**
     * The host is behind a captive portal and
     *   cannot reach the full Internet.
     */
    PORTAL(GNetworkConnectivity.G_NETWORK_CONNECTIVITY_PORTAL),

    /**
     * The host is connected to a network, and
     *   appears to be able to reach the full Internet.
     */
    FULL(GNetworkConnectivity.G_NETWORK_CONNECTIVITY_FULL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GNetworkConnectivity): NetworkConnectivity = when (nativeValue) {
            GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LOCAL -> LOCAL
            GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LIMITED -> LIMITED
            GNetworkConnectivity.G_NETWORK_CONNECTIVITY_PORTAL -> PORTAL
            GNetworkConnectivity.G_NETWORK_CONNECTIVITY_FULL -> FULL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NetworkConnectivity
         *
         * @return the GType
         */
        public fun getType(): GType = g_network_connectivity_get_type()
    }
}
