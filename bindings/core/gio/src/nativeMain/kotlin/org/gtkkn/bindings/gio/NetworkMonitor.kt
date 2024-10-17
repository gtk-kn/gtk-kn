// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.GNetworkMonitor
import org.gtkkn.native.gio.g_network_monitor_can_reach
import org.gtkkn.native.gio.g_network_monitor_can_reach_async
import org.gtkkn.native.gio.g_network_monitor_can_reach_finish
import org.gtkkn.native.gio.g_network_monitor_get_connectivity
import org.gtkkn.native.gio.g_network_monitor_get_default
import org.gtkkn.native.gio.g_network_monitor_get_network_available
import org.gtkkn.native.gio.g_network_monitor_get_network_metered
import org.gtkkn.native.gio.g_network_monitor_get_type
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.ULong
import kotlin.Unit

/**
 * `GNetworkMonitor` provides an easy-to-use cross-platform API
 * for monitoring network connectivity. On Linux, the available
 * implementations are based on the kernel's netlink interface and
 * on NetworkManager.
 *
 * There is also an implementation for use inside Flatpak sandboxes.
 * @since 2.32
 */
public interface NetworkMonitor : Interface, Initable, KGTyped {
    public val gioNetworkMonitorPointer: CPointer<GNetworkMonitor>

    override val gioInitablePointer: CPointer<GInitable>
        get() = gioNetworkMonitorPointer.reinterpret()

    /**
     * More detailed information about the host's network connectivity.
     * See g_network_monitor_get_connectivity() and
     * #GNetworkConnectivity for more details.
     *
     * @since 2.44
     */
    public val connectivity: NetworkConnectivity
        /**
         * Gets a more detailed networking state than
         * g_network_monitor_get_network_available().
         *
         * If #GNetworkMonitor:network-available is false, then the
         * connectivity state will be %G_NETWORK_CONNECTIVITY_LOCAL.
         *
         * If #GNetworkMonitor:network-available is true, then the
         * connectivity state will be %G_NETWORK_CONNECTIVITY_FULL (if there
         * is full Internet connectivity), %G_NETWORK_CONNECTIVITY_LIMITED (if
         * the host has a default route, but appears to be unable to actually
         * reach the full Internet), or %G_NETWORK_CONNECTIVITY_PORTAL (if the
         * host is trapped behind a "captive portal" that requires some sort
         * of login or acknowledgement before allowing full Internet access).
         *
         * Note that in the case of %G_NETWORK_CONNECTIVITY_LIMITED and
         * %G_NETWORK_CONNECTIVITY_PORTAL, it is possible that some sites are
         * reachable but others are not. In this case, applications can
         * attempt to connect to remote servers, but should gracefully fall
         * back to their "offline" behavior if the connection attempt fails.
         *
         * @return the network connectivity state
         * @since 2.44
         */
        get() =
            g_network_monitor_get_connectivity(gioNetworkMonitorPointer.reinterpret()).run {
                NetworkConnectivity.fromNativeValue(this)
            }

    /**
     * Whether the network is considered available. That is, whether the
     * system has a default route for at least one of IPv4 or IPv6.
     *
     * Real-world networks are of course much more complicated than
     * this; the machine may be connected to a wifi hotspot that
     * requires payment before allowing traffic through, or may be
     * connected to a functioning router that has lost its own upstream
     * connectivity. Some hosts might only be accessible when a VPN is
     * active. Other hosts might only be accessible when the VPN is
     * not active. Thus, it is best to use g_network_monitor_can_reach()
     * or g_network_monitor_can_reach_async() to test for reachability
     * on a host-by-host basis. (On the other hand, when the property is
     * false, the application can reasonably expect that no remote
     * hosts at all are reachable, and should indicate this to the user
     * in its UI.)
     *
     * See also #GNetworkMonitor::network-changed.
     *
     * @since 2.32
     */
    public val networkAvailable: Boolean
        /**
         * Checks if the network is available. "Available" here means that the
         * system has a default route available for at least one of IPv4 or
         * IPv6. It does not necessarily imply that the public Internet is
         * reachable. See #GNetworkMonitor:network-available for more details.
         *
         * @return whether the network is available
         * @since 2.32
         */
        get() =
            g_network_monitor_get_network_available(gioNetworkMonitorPointer.reinterpret()).asBoolean()

    /**
     * Whether the network is considered metered.
     *
     * That is, whether the
     * system has traffic flowing through the default connection that is
     * subject to limitations set by service providers. For example, traffic
     * might be billed by the amount of data transmitted, or there might be a
     * quota on the amount of traffic per month. This is typical with tethered
     * connections (3G and 4G) and in such situations, bandwidth intensive
     * applications may wish to avoid network activity where possible if it will
     * cost the user money or use up their limited quota. Anything more than a
     * few hundreds of kilobytes of data usage per hour should be avoided without
     * asking permission from the user.
     *
     * If more information is required about specific devices then the
     * system network management API should be used instead (for example,
     * NetworkManager or ConnMan).
     *
     * If this information is not available then no networks will be
     * marked as metered.
     *
     * See also #GNetworkMonitor:network-available.
     *
     * @since 2.46
     */
    public val networkMetered: Boolean
        /**
         * Checks if the network is metered.
         * See #GNetworkMonitor:network-metered for more details.
         *
         * @return whether the connection is metered
         * @since 2.46
         */
        get() =
            g_network_monitor_get_network_metered(gioNetworkMonitorPointer.reinterpret()).asBoolean()

    /**
     * Attempts to determine whether or not the host pointed to by
     * @connectable can be reached, without actually trying to connect to
     * it.
     *
     * This may return true even when #GNetworkMonitor:network-available
     * is false, if, for example, @monitor can determine that
     * @connectable refers to a host on a local network.
     *
     * If @monitor believes that an attempt to connect to @connectable
     * will succeed, it will return true. Otherwise, it will return
     * false and set @error to an appropriate error (such as
     * %G_IO_ERROR_HOST_UNREACHABLE).
     *
     * Note that although this does not attempt to connect to
     * @connectable, it may still block for a brief period of time (eg,
     * trying to do multicast DNS on the local network), so if you do not
     * want to block, you should use g_network_monitor_can_reach_async().
     *
     * @param connectable a #GSocketConnectable
     * @param cancellable a #GCancellable, or null
     * @return true if @connectable is reachable, false if not.
     * @since 2.32
     */
    public fun canReach(
        connectable: SocketConnectable,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_network_monitor_can_reach(
                    gioNetworkMonitorPointer.reinterpret(),
                    connectable.gioSocketConnectablePointer,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asynchronously attempts to determine whether or not the host
     * pointed to by @connectable can be reached, without actually
     * trying to connect to it.
     *
     * For more details, see g_network_monitor_can_reach().
     *
     * When the operation is finished, @callback will be called.
     * You can then call g_network_monitor_can_reach_finish()
     * to get the result of the operation.
     *
     * @param connectable a #GSocketConnectable
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     *     to call when the request is satisfied
     */
    public fun canReachAsync(
        connectable: SocketConnectable,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_network_monitor_can_reach_async(
            gioNetworkMonitorPointer.reinterpret(),
            connectable.gioSocketConnectablePointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an async network connectivity test.
     * See g_network_monitor_can_reach_async().
     *
     * @param result a #GAsyncResult
     * @return true if network is reachable, false if not.
     */
    public fun canReachFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_network_monitor_can_reach_finish(
                    gioNetworkMonitorPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets a more detailed networking state than
     * g_network_monitor_get_network_available().
     *
     * If #GNetworkMonitor:network-available is false, then the
     * connectivity state will be %G_NETWORK_CONNECTIVITY_LOCAL.
     *
     * If #GNetworkMonitor:network-available is true, then the
     * connectivity state will be %G_NETWORK_CONNECTIVITY_FULL (if there
     * is full Internet connectivity), %G_NETWORK_CONNECTIVITY_LIMITED (if
     * the host has a default route, but appears to be unable to actually
     * reach the full Internet), or %G_NETWORK_CONNECTIVITY_PORTAL (if the
     * host is trapped behind a "captive portal" that requires some sort
     * of login or acknowledgement before allowing full Internet access).
     *
     * Note that in the case of %G_NETWORK_CONNECTIVITY_LIMITED and
     * %G_NETWORK_CONNECTIVITY_PORTAL, it is possible that some sites are
     * reachable but others are not. In this case, applications can
     * attempt to connect to remote servers, but should gracefully fall
     * back to their "offline" behavior if the connection attempt fails.
     *
     * @return the network connectivity state
     * @since 2.44
     */
    public fun getConnectivity(): NetworkConnectivity =
        g_network_monitor_get_connectivity(gioNetworkMonitorPointer.reinterpret()).run {
            NetworkConnectivity.fromNativeValue(this)
        }

    /**
     * Checks if the network is available. "Available" here means that the
     * system has a default route available for at least one of IPv4 or
     * IPv6. It does not necessarily imply that the public Internet is
     * reachable. See #GNetworkMonitor:network-available for more details.
     *
     * @return whether the network is available
     * @since 2.32
     */
    public fun getNetworkAvailable(): Boolean =
        g_network_monitor_get_network_available(gioNetworkMonitorPointer.reinterpret()).asBoolean()

    /**
     * Checks if the network is metered.
     * See #GNetworkMonitor:network-metered for more details.
     *
     * @return whether the connection is metered
     * @since 2.46
     */
    public fun getNetworkMetered(): Boolean =
        g_network_monitor_get_network_metered(gioNetworkMonitorPointer.reinterpret()).asBoolean()

    /**
     * Emitted when the network configuration changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `networkAvailable` the current value of
     * #GNetworkMonitor:network-available
     * @since 2.32
     */
    public fun connectNetworkChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (networkAvailable: Boolean) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gioNetworkMonitorPointer.reinterpret(),
            "network-changed",
            connectNetworkChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GNetworkMonitor>,
    ) : NetworkMonitor {
        override val gioNetworkMonitorPointer: CPointer<GNetworkMonitor> = pointer
    }

    public companion object : TypeCompanion<NetworkMonitor> {
        override val type: GeneratedInterfaceKGType<NetworkMonitor> =
            GeneratedInterfaceKGType(g_network_monitor_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GNetworkMonitor>): NetworkMonitor = Wrapper(pointer)

        /**
         * Gets the default #GNetworkMonitor for the system.
         *
         * @return a #GNetworkMonitor, which will be
         *     a dummy object if no network monitor is available
         * @since 2.32
         */
        public fun getDefault(): NetworkMonitor =
            g_network_monitor_get_default()!!.run {
                NetworkMonitor.wrap(reinterpret())
            }
    }
}

private val connectNetworkChangedFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            networkAvailable: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(networkAvailable: Boolean) -> Unit>().get().invoke(networkAvailable.asBoolean())
    }
        .reinterpret()
