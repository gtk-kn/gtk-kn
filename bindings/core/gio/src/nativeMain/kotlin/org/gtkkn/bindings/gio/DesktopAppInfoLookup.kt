// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDesktopAppInfoLookup
import org.gtkkn.native.gio.g_desktop_app_info_lookup_get_default_for_uri_scheme
import org.gtkkn.native.gio.g_desktop_app_info_lookup_get_type
import kotlin.String

/**
 * #GDesktopAppInfoLookup is an opaque data structure and can only be accessed
 * using the following functions.
 */
public interface DesktopAppInfoLookup :
    Interface,
    KGTyped {
    public val gioDesktopAppInfoLookupPointer: CPointer<GDesktopAppInfoLookup>

    /**
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
        g_desktop_app_info_lookup_get_default_for_uri_scheme(
            gioDesktopAppInfoLookupPointer.reinterpret(),
            uriScheme
        )?.run {
            AppInfo.wrap(reinterpret())
        }

    private data class Wrapper(
        private val pointer: CPointer<GDesktopAppInfoLookup>,
    ) : DesktopAppInfoLookup {
        override val gioDesktopAppInfoLookupPointer: CPointer<GDesktopAppInfoLookup> = pointer
    }

    public companion object : TypeCompanion<DesktopAppInfoLookup> {
        override val type: GeneratedInterfaceKGType<DesktopAppInfoLookup> =
            GeneratedInterfaceKGType(g_desktop_app_info_lookup_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDesktopAppInfoLookup>): DesktopAppInfoLookup = Wrapper(pointer)
    }
}
