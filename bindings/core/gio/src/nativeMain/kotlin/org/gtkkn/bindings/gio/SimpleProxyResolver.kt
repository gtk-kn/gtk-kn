// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GProxyResolver
import org.gtkkn.native.gio.GSimpleProxyResolver
import org.gtkkn.native.gio.g_simple_proxy_resolver_get_type
import org.gtkkn.native.gio.g_simple_proxy_resolver_new
import org.gtkkn.native.gio.g_simple_proxy_resolver_set_default_proxy
import org.gtkkn.native.gio.g_simple_proxy_resolver_set_ignore_hosts
import org.gtkkn.native.gio.g_simple_proxy_resolver_set_uri_proxy
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GSimpleProxyResolver` is a simple [iface@Gio.ProxyResolver] implementation
 * that handles a single default proxy, multiple URI-scheme-specific
 * proxies, and a list of hosts that proxies should not be used for.
 *
 * `GSimpleProxyResolver` is never the default proxy resolver, but it
 * can be used as the base class for another proxy resolver
 * implementation, or it can be created and used manually, such as
 * with [method@Gio.SocketClient.set_proxy_resolver].
 *
 * ## Skipped during bindings generation
 *
 * - method `default-proxy`: Property has no getter
 * - method `ignore-hosts`: Property has no getter
 *
 * @since 2.36
 */
@GioVersion2_36
public open class SimpleProxyResolver(pointer: CPointer<GSimpleProxyResolver>) :
    Object(pointer.reinterpret()),
    ProxyResolver,
    KGTyped {
    public val gioSimpleProxyResolverPointer: CPointer<GSimpleProxyResolver>
        get() = gPointer.reinterpret()

    override val gioProxyResolverPointer: CPointer<GProxyResolver>
        get() = gPointer.reinterpret()

    /**
     * Sets the default proxy on @resolver, to be used for any URIs that
     * don't match #GSimpleProxyResolver:ignore-hosts or a proxy set
     * via g_simple_proxy_resolver_set_uri_proxy().
     *
     * If @default_proxy starts with "socks://",
     * #GSimpleProxyResolver will treat it as referring to all three of
     * the socks5, socks4a, and socks4 proxy types.
     *
     * @param defaultProxy the default proxy to use
     * @since 2.36
     */
    @GioVersion2_36
    public open fun setDefaultProxy(defaultProxy: String? = null): Unit =
        g_simple_proxy_resolver_set_default_proxy(gioSimpleProxyResolverPointer.reinterpret(), defaultProxy)

    /**
     * Sets the list of ignored hosts.
     *
     * See #GSimpleProxyResolver:ignore-hosts for more details on how the
     * @ignore_hosts argument is interpreted.
     *
     * @param ignoreHosts null-terminated list of hosts/IP addresses
     *     to not use a proxy for
     * @since 2.36
     */
    @GioVersion2_36
    public open fun setIgnoreHosts(ignoreHosts: List<String>): Unit = memScoped {
        return g_simple_proxy_resolver_set_ignore_hosts(
            gioSimpleProxyResolverPointer.reinterpret(),
            ignoreHosts.toCStringList(this)
        )
    }

    /**
     * Adds a URI-scheme-specific proxy to @resolver; URIs whose scheme
     * matches @uri_scheme (and which don't match
     * #GSimpleProxyResolver:ignore-hosts) will be proxied via @proxy.
     *
     * As with #GSimpleProxyResolver:default-proxy, if @proxy starts with
     * "socks://", #GSimpleProxyResolver will treat it
     * as referring to all three of the socks5, socks4a, and socks4 proxy
     * types.
     *
     * @param uriScheme the URI scheme to add a proxy for
     * @param proxy the proxy to use for @uri_scheme
     * @since 2.36
     */
    @GioVersion2_36
    public open fun setUriProxy(uriScheme: String, proxy: String): Unit =
        g_simple_proxy_resolver_set_uri_proxy(gioSimpleProxyResolverPointer.reinterpret(), uriScheme, proxy)

    public companion object : TypeCompanion<SimpleProxyResolver> {
        override val type: GeneratedClassKGType<SimpleProxyResolver> =
            GeneratedClassKGType(g_simple_proxy_resolver_get_type()) { SimpleProxyResolver(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GSimpleProxyResolver. See
         * #GSimpleProxyResolver:default-proxy and
         * #GSimpleProxyResolver:ignore-hosts for more details on how the
         * arguments are interpreted.
         *
         * @param defaultProxy the default proxy to use, eg
         *     "socks://192.168.1.1"
         * @param ignoreHosts an optional list of hosts/IP addresses
         *     to not use a proxy for.
         * @return a new #GSimpleProxyResolver
         * @since 2.36
         */
        @GioVersion2_36
        public fun new(defaultProxy: String? = null, ignoreHosts: List<String>? = null): ProxyResolver = memScoped {
            return g_simple_proxy_resolver_new(defaultProxy, ignoreHosts?.toCStringList(this))!!.run {
                ProxyResolver.wrap(reinterpret())
            }
        }

        /**
         * Get the GType of SimpleProxyResolver
         *
         * @return the GType
         */
        public fun getType(): GType = g_simple_proxy_resolver_get_type()
    }
}
