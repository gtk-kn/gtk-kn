// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.List
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GSrvTarget
import org.gtkkn.native.gio.g_srv_target_copy
import org.gtkkn.native.gio.g_srv_target_free
import org.gtkkn.native.gio.g_srv_target_get_hostname
import org.gtkkn.native.gio.g_srv_target_get_port
import org.gtkkn.native.gio.g_srv_target_get_priority
import org.gtkkn.native.gio.g_srv_target_get_type
import org.gtkkn.native.gio.g_srv_target_get_weight
import org.gtkkn.native.gio.g_srv_target_list_sort
import org.gtkkn.native.gio.g_srv_target_new
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint16
import kotlin.String
import kotlin.Unit

/**
 * A single target host/port that a network service is running on.
 *
 * SRV (service) records are used by some network protocols to provide
 * service-specific aliasing and load-balancing. For example, XMPP
 * (Jabber) uses SRV records to locate the XMPP server for a domain;
 * rather than connecting directly to ‘example.com’ or assuming a
 * specific server hostname like ‘xmpp.example.com’, an XMPP client
 * would look up the `xmpp-client` SRV record for ‘example.com’, and
 * then connect to whatever host was pointed to by that record.
 *
 * You can use [method@Gio.Resolver.lookup_service] or
 * [method@Gio.Resolver.lookup_service_async] to find the `GSrvTarget`s
 * for a given service. However, if you are simply planning to connect
 * to the remote service, you can use [class@Gio.NetworkService]’s
 * [iface@Gio.SocketConnectable] interface and not need to worry about
 * `GSrvTarget` at all.
 */
public class SrvTarget(pointer: CPointer<GSrvTarget>) : ProxyInstance(pointer) {
    public val gioSrvTargetPointer: CPointer<GSrvTarget> = pointer

    /**
     * Copies @target
     *
     * @return a copy of @target
     * @since 2.22
     */
    @GioVersion2_22
    public fun copy(): SrvTarget = g_srv_target_copy(gioSrvTargetPointer.reinterpret())!!.run {
        SrvTarget(reinterpret())
    }

    /**
     * Frees @target
     *
     * @since 2.22
     */
    @GioVersion2_22
    public fun free(): Unit = g_srv_target_free(gioSrvTargetPointer.reinterpret())

    /**
     * Gets @target's hostname (in ASCII form; if you are going to present
     * this to the user, you should use g_hostname_is_ascii_encoded() to
     * check if it contains encoded Unicode segments, and use
     * g_hostname_to_unicode() to convert it if it does.)
     *
     * @return @target's hostname
     * @since 2.22
     */
    @GioVersion2_22
    public fun getHostname(): String =
        g_srv_target_get_hostname(gioSrvTargetPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets @target's port
     *
     * @return @target's port
     * @since 2.22
     */
    @GioVersion2_22
    public fun getPort(): guint16 = g_srv_target_get_port(gioSrvTargetPointer.reinterpret())

    /**
     * Gets @target's priority. You should not need to look at this;
     * #GResolver already sorts the targets according to the algorithm in
     * RFC 2782.
     *
     * @return @target's priority
     * @since 2.22
     */
    @GioVersion2_22
    public fun getPriority(): guint16 = g_srv_target_get_priority(gioSrvTargetPointer.reinterpret())

    /**
     * Gets @target's weight. You should not need to look at this;
     * #GResolver already sorts the targets according to the algorithm in
     * RFC 2782.
     *
     * @return @target's weight
     * @since 2.22
     */
    @GioVersion2_22
    public fun getWeight(): guint16 = g_srv_target_get_weight(gioSrvTargetPointer.reinterpret())

    public companion object {
        /**
         * Creates a new #GSrvTarget with the given parameters.
         *
         * You should not need to use this; normally #GSrvTargets are
         * created by #GResolver.
         *
         * @param hostname the host that the service is running on
         * @param port the port that the service is running on
         * @param priority the target's priority
         * @param weight the target's weight
         * @return a new #GSrvTarget.
         * @since 2.22
         */
        public fun new(hostname: String, port: guint16, priority: guint16, weight: guint16): SrvTarget =
            SrvTarget(g_srv_target_new(hostname, port, priority, weight)!!.reinterpret())

        /**
         * Sorts @targets in place according to the algorithm in RFC 2782.
         *
         * @param targets a #GList of #GSrvTarget
         * @return the head of the sorted list.
         * @since 2.22
         */
        @GioVersion2_22
        public fun listSort(targets: List): List = g_srv_target_list_sort(targets.glibListPointer.reinterpret())!!.run {
            List(reinterpret())
        }

        /**
         * Get the GType of SrvTarget
         *
         * @return the GType
         */
        public fun getType(): GType = g_srv_target_get_type()
    }
}
