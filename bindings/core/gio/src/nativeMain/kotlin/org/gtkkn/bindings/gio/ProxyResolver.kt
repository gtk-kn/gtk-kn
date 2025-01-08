// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GProxyResolver
import org.gtkkn.native.gio.g_proxy_resolver_get_default
import org.gtkkn.native.gio.g_proxy_resolver_get_type
import org.gtkkn.native.gio.g_proxy_resolver_is_supported
import org.gtkkn.native.gio.g_proxy_resolver_lookup
import org.gtkkn.native.gio.g_proxy_resolver_lookup_async
import org.gtkkn.native.gio.g_proxy_resolver_lookup_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GProxyResolver` provides synchronous and asynchronous network proxy
 * resolution. `GProxyResolver` is used within [class@Gio.SocketClient] through
 * the method [method@Gio.SocketConnectable.proxy_enumerate].
 *
 * Implementations of `GProxyResolver` based on
 * [libproxy](https://github.com/libproxy/libproxy) and GNOME settings can be
 * found in [glib-networking](https://gitlab.gnome.org/GNOME/glib-networking).
 * GIO comes with an implementation for use inside Flatpak portals.
 * @since 2.26
 */
@GioVersion2_26
public interface ProxyResolver :
    Interface,
    KGTyped {
    public val gioProxyResolverPointer: CPointer<GProxyResolver>

    /**
     * Checks if @resolver can be used on this system. (This is used
     * internally; g_proxy_resolver_get_default() will only return a proxy
     * resolver that returns true for this method.)
     *
     * @return true if @resolver is supported.
     * @since 2.26
     */
    @GioVersion2_26
    public fun isSupported(): Boolean = g_proxy_resolver_is_supported(gioProxyResolverPointer).asBoolean()

    /**
     * Looks into the system proxy configuration to determine what proxy,
     * if any, to use to connect to @uri. The returned proxy URIs are of
     * the form `<protocol>://[user[:password]@]host[:port]` or
     * `direct://`, where <protocol> could be http, rtsp, socks
     * or other proxying protocol.
     *
     * If you don't know what network protocol is being used on the
     * socket, you should use `none` as the URI protocol.
     * In this case, the resolver might still return a generic proxy type
     * (such as SOCKS), but would not return protocol-specific proxy types
     * (such as http).
     *
     * `direct://` is used when no proxy is needed.
     * Direct connection should not be attempted unless it is part of the
     * returned array of proxies.
     *
     * @param uri a URI representing the destination to connect to
     * @param cancellable a #GCancellable, or null
     * @return A
     *               NULL-terminated array of proxy URIs. Must be freed
     *               with g_strfreev().
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookup(uri: String, cancellable: Cancellable? = null): Result<List<String>> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_proxy_resolver_lookup(
            gioProxyResolverPointer,
            uri,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.toKStringList()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * details.
     *
     * @param uri a URI representing the destination to connect to
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call after resolution completes
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookupAsync(uri: String, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_proxy_resolver_lookup_async(
            gioProxyResolverPointer,
            uri,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Call this function to obtain the array of proxy URIs when
     * g_proxy_resolver_lookup_async() is complete. See
     * g_proxy_resolver_lookup() for more details.
     *
     * @param result the result passed to your #GAsyncReadyCallback
     * @return A
     *               NULL-terminated array of proxy URIs. Must be freed
     *               with g_strfreev().
     * @since 2.26
     */
    @GioVersion2_26
    public fun lookupFinish(result: AsyncResult): Result<List<String>> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_proxy_resolver_lookup_finish(
            gioProxyResolverPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.toKStringList()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    private data class Wrapper(private val pointer: CPointer<GProxyResolver>) : ProxyResolver {
        override val gioProxyResolverPointer: CPointer<GProxyResolver> = pointer
    }

    public companion object : TypeCompanion<ProxyResolver> {
        override val type: GeneratedInterfaceKGType<ProxyResolver> =
            GeneratedInterfaceKGType(g_proxy_resolver_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GProxyResolver>): ProxyResolver = Wrapper(pointer)

        /**
         * Gets the default #GProxyResolver for the system.
         *
         * @return the default #GProxyResolver, which
         *     will be a dummy object if no proxy resolver is available
         * @since 2.26
         */
        @GioVersion2_26
        public fun getDefault(): ProxyResolver = g_proxy_resolver_get_default()!!.run {
            ProxyResolver.wrap(reinterpret())
        }

        /**
         * Get the GType of ProxyResolver
         *
         * @return the GType
         */
        public fun getType(): GType = g_proxy_resolver_get_type()
    }
}
