// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDesktopAppInfoLookup
import org.gtkkn.native.gio.g_desktop_app_info_lookup_get_default_for_uri_scheme
import org.gtkkn.native.gio.g_desktop_app_info_lookup_get_type
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.28.
 *
 * The #GDesktopAppInfoLookup interface is deprecated and
 *    unused by GIO.
 * ---
 *
 * #GDesktopAppInfoLookup is an opaque data structure and can only be accessed
 * using the following functions.
 */
public interface DesktopAppInfoLookup :
    Proxy,
    KGTyped {
    public val gioDesktopAppInfoLookupPointer: CPointer<GDesktopAppInfoLookup>

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.28.
     *
     * The #GDesktopAppInfoLookup interface is deprecated and
     *    unused by GIO.
     * ---
     *
     * Gets the default application for launching applications
     * using this URI scheme for a particular #GDesktopAppInfoLookup
     * implementation.
     *
     * The #GDesktopAppInfoLookup interface and this function is used
     * to implement g_app_info_get_default_for_uri_scheme() backends
     * in a GIO module. There is no reason for applications to use it
     * directly. Applications should use g_app_info_get_default_for_uri_scheme().
     *
     * @param uriScheme a string containing a URI scheme.
     * @return #GAppInfo for given @uri_scheme or
     *    null on error.
     */
    public fun getDefaultForUriScheme(uriScheme: String): AppInfo? =
        g_desktop_app_info_lookup_get_default_for_uri_scheme(gioDesktopAppInfoLookupPointer, uriScheme)?.run {
            AppInfo.AppInfoImpl(reinterpret())
        }

    /**
     * The DesktopAppInfoLookupImpl type represents a native instance of the DesktopAppInfoLookup interface.
     *
     * @constructor Creates a new instance of DesktopAppInfoLookup for the provided [CPointer].
     */
    public class DesktopAppInfoLookupImpl(gioDesktopAppInfoLookupPointer: CPointer<GDesktopAppInfoLookup>) :
        Object(gioDesktopAppInfoLookupPointer.reinterpret()),
        DesktopAppInfoLookup {
        init {
            Gio
        }

        override val gioDesktopAppInfoLookupPointer: CPointer<GDesktopAppInfoLookup> =
            gioDesktopAppInfoLookupPointer
    }

    public companion object : TypeCompanion<DesktopAppInfoLookup> {
        override val type: GeneratedInterfaceKGType<DesktopAppInfoLookup> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { DesktopAppInfoLookupImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DesktopAppInfoLookup
         *
         * @return the GType
         */
        public fun getType(): GType = g_desktop_app_info_lookup_get_type()

        /**
         * Gets the GType of from the symbol `g_desktop_app_info_lookup_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_desktop_app_info_lookup_get_type")
    }
}
