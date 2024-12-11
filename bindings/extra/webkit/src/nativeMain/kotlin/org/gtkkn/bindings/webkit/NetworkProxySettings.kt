// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitNetworkProxySettings
import org.gtkkn.native.webkit.webkit_network_proxy_settings_add_proxy_for_scheme
import org.gtkkn.native.webkit.webkit_network_proxy_settings_copy
import org.gtkkn.native.webkit.webkit_network_proxy_settings_free
import org.gtkkn.native.webkit.webkit_network_proxy_settings_get_type
import org.gtkkn.native.webkit.webkit_network_proxy_settings_new
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Configures network proxies.
 *
 * WebKitNetworkProxySettings can be used to provide a custom proxy configuration
 * to a #WebKitWebContext. You need to call webkit_web_context_set_network_proxy_settings()
 * with %WEBKIT_NETWORK_PROXY_MODE_CUSTOM and a WebKitNetworkProxySettings.
 * @since 2.16
 */
@WebKitVersion2_16
public class NetworkProxySettings(pointer: CPointer<WebKitNetworkProxySettings>) : ProxyInstance(pointer) {
    public val webkitNetworkProxySettingsPointer: CPointer<WebKitNetworkProxySettings> = pointer

    /**
     * Adds a URI-scheme-specific proxy.
     *
     * URIs whose scheme matches @uri_scheme will be proxied via @proxy_uri.
     * As with the default proxy URI, if @proxy_uri starts with "socks://", it will be treated as referring to
     * all three of the socks5, socks4a, and socks4 proxy types.
     *
     * @param scheme the URI scheme to add a proxy for
     * @param proxyUri the proxy URI to use for @uri_scheme
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun addProxyForScheme(scheme: String, proxyUri: String): Unit =
        webkit_network_proxy_settings_add_proxy_for_scheme(
            webkitNetworkProxySettingsPointer.reinterpret(),
            scheme,
            proxyUri
        )

    /**
     * Make a copy of the #WebKitNetworkProxySettings.
     *
     * @return A copy of passed in #WebKitNetworkProxySettings
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun copy(): NetworkProxySettings =
        webkit_network_proxy_settings_copy(webkitNetworkProxySettingsPointer.reinterpret())!!.run {
            NetworkProxySettings(reinterpret())
        }

    /**
     * Free the #WebKitNetworkProxySettings.
     *
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun free(): Unit = webkit_network_proxy_settings_free(webkitNetworkProxySettingsPointer.reinterpret())

    public companion object {
        /**
         * Create a new #WebKitNetworkProxySettings with the given @default_proxy_uri and @ignore_hosts.
         *
         * The default proxy URI will be used for any URI that doesn't match @ignore_hosts, and doesn't match any
         * of the schemes added with webkit_network_proxy_settings_add_proxy_for_scheme().
         * If @default_proxy_uri starts with "socks://", it will be treated as referring to all three of the
         * socks5, socks4a, and socks4 proxy types.
         *
         * @ignore_hosts is a list of hostnames and IP addresses that the resolver should allow direct connections to.
         * Entries can be in one of 4 formats:
         * <itemizedlist>
         * <listitem><para>
         * A hostname, such as "example.com", ".example.com", or "*.example.com", any of which match "example.com" or
         * any subdomain of it.
         * </para></listitem>
         * <listitem><para>
         * An IPv4 or IPv6 address, such as "192.168.1.1", which matches only that address.
         * </para></listitem>
         * <listitem><para>
         * A hostname or IP address followed by a port, such as "example.com:80", which matches whatever the hostname or IP
         * address would match, but only for URLs with the (explicitly) indicated port. In the case of an IPv6 address, the address
         * part must appear in brackets: "[::1]:443"
         * </para></listitem>
         * <listitem><para>
         * An IP address range, given by a base address and prefix length, such as "fe80::/10", which matches any address in that range.
         * </para></listitem>
         * </itemizedlist>
         *
         * Note that when dealing with Unicode hostnames, the matching is done against the ASCII form of the name.
         * Also note that hostname exclusions apply only to connections made to hosts identified by name, and IP address exclusions apply only
         * to connections made to hosts identified by address. That is, if example.com has an address of 192.168.1.1, and @ignore_hosts
         * contains only "192.168.1.1", then a connection to "example.com" will use the proxy, and a connection to 192.168.1.1" will not.
         *
         * @param defaultProxyUri the default proxy URI to use, or null.
         * @param ignoreHosts an optional list of hosts/IP addresses to not use a proxy for.
         * @return A new #WebKitNetworkProxySettings.
         * @since 2.16
         */
        public fun new(defaultProxyUri: String? = null, ignoreHosts: List<String>? = null): NetworkProxySettings {
            memScoped {
                return NetworkProxySettings(
                    webkit_network_proxy_settings_new(defaultProxyUri, ignoreHosts?.toCStringList(this))!!.reinterpret()
                )
            }
        }

        /**
         * Get the GType of NetworkProxySettings
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_network_proxy_settings_get_type()
    }
}
