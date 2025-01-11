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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GProxy
import org.gtkkn.native.gio.g_proxy_connect
import org.gtkkn.native.gio.g_proxy_connect_async
import org.gtkkn.native.gio.g_proxy_connect_finish
import org.gtkkn.native.gio.g_proxy_get_default_for_protocol
import org.gtkkn.native.gio.g_proxy_get_type
import org.gtkkn.native.gio.g_proxy_supports_hostname
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A `GProxy` handles connecting to a remote host via a given type of
 * proxy server. It is implemented by the `gio-proxy` extension point.
 * The extensions are named after their proxy protocol name. As an
 * example, a SOCKS5 proxy implementation can be retrieved with the
 * name `socks5` using the function
 * [method@Gio.IOExtensionPoint.get_extension_by_name].
 * @since 2.26
 */
@GioVersion2_26
public interface Proxy :
    org.gtkkn.extensions.glib.cinterop.Proxy,
    KGTyped {
    public val gioProxyPointer: CPointer<GProxy>

    /**
     * Given @connection to communicate with a proxy (eg, a
     * #GSocketConnection that is connected to the proxy server), this
     * does the necessary handshake to connect to @proxy_address, and if
     * required, wraps the #GIOStream to handle proxy payload.
     *
     * @param connection a #GIOStream
     * @param proxyAddress a #GProxyAddress
     * @param cancellable a #GCancellable
     * @return a #GIOStream that will replace @connection. This might
     *               be the same as @connection, in which case a reference
     *               will be added.
     * @since 2.26
     */
    @GioVersion2_26
    public fun connect(
        connection: IoStream,
        proxyAddress: ProxyAddress,
        cancellable: Cancellable? = null,
    ): Result<IoStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_proxy_connect(
            gioProxyPointer,
            connection.gioIoStreamPointer,
            proxyAddress.gioProxyAddressPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            IoStream.IoStreamImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Asynchronous version of g_proxy_connect().
     *
     * @param connection a #GIOStream
     * @param proxyAddress a #GProxyAddress
     * @param cancellable a #GCancellable
     * @param callback a #GAsyncReadyCallback
     * @since 2.26
     */
    @GioVersion2_26
    public fun connectAsync(
        connection: IoStream,
        proxyAddress: ProxyAddress,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_proxy_connect_async(
        gioProxyPointer,
        connection.gioIoStreamPointer,
        proxyAddress.gioProxyAddressPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * See g_proxy_connect().
     *
     * @param result a #GAsyncResult
     * @return a #GIOStream.
     * @since 2.26
     */
    @GioVersion2_26
    public fun connectFinish(result: AsyncResult): Result<IoStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_proxy_connect_finish(gioProxyPointer, result.gioAsyncResultPointer, gError.ptr)?.run {
            IoStream.IoStreamImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Some proxy protocols expect to be passed a hostname, which they
     * will resolve to an IP address themselves. Others, like SOCKS4, do
     * not allow this. This function will return false if @proxy is
     * implementing such a protocol. When false is returned, the caller
     * should resolve the destination hostname first, and then pass a
     * #GProxyAddress containing the stringified IP address to
     * g_proxy_connect() or g_proxy_connect_async().
     *
     * @return true if hostname resolution is supported.
     * @since 2.26
     */
    @GioVersion2_26
    public fun supportsHostname(): Boolean = g_proxy_supports_hostname(gioProxyPointer).asBoolean()

    /**
     * The ProxyImpl type represents a native instance of the Proxy interface.
     *
     * @constructor Creates a new instance of Proxy for the provided [CPointer].
     */
    public data class ProxyImpl(override val gioProxyPointer: CPointer<GProxy>) :
        Object(gioProxyPointer.reinterpret()),
        Proxy

    public companion object : TypeCompanion<Proxy> {
        override val type: GeneratedInterfaceKGType<Proxy> =
            GeneratedInterfaceKGType(g_proxy_get_type()) { ProxyImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Find the `gio-proxy` extension point for a proxy implementation that supports
         * the specified protocol.
         *
         * @param protocol the proxy protocol name (e.g. http, socks, etc)
         * @return return a #GProxy or NULL if protocol
         *               is not supported.
         * @since 2.26
         */
        @GioVersion2_26
        public fun getDefaultForProtocol(protocol: String): Proxy? = g_proxy_get_default_for_protocol(protocol)?.run {
            ProxyImpl(reinterpret())
        }

        /**
         * Get the GType of Proxy
         *
         * @return the GType
         */
        public fun getType(): GType = g_proxy_get_type()
    }
}
