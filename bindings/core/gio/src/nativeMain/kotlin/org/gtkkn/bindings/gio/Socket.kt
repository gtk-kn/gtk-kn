// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_56
import org.gtkkn.bindings.gio.annotations.GioVersion2_80
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.IoCondition
import org.gtkkn.bindings.glib.Source
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.GSocket
import org.gtkkn.native.gio.g_socket_accept
import org.gtkkn.native.gio.g_socket_bind
import org.gtkkn.native.gio.g_socket_check_connect_result
import org.gtkkn.native.gio.g_socket_close
import org.gtkkn.native.gio.g_socket_condition_check
import org.gtkkn.native.gio.g_socket_condition_timed_wait
import org.gtkkn.native.gio.g_socket_condition_wait
import org.gtkkn.native.gio.g_socket_connect
import org.gtkkn.native.gio.g_socket_connection_factory_create_connection
import org.gtkkn.native.gio.g_socket_create_source
import org.gtkkn.native.gio.g_socket_get_available_bytes
import org.gtkkn.native.gio.g_socket_get_blocking
import org.gtkkn.native.gio.g_socket_get_broadcast
import org.gtkkn.native.gio.g_socket_get_credentials
import org.gtkkn.native.gio.g_socket_get_family
import org.gtkkn.native.gio.g_socket_get_fd
import org.gtkkn.native.gio.g_socket_get_keepalive
import org.gtkkn.native.gio.g_socket_get_listen_backlog
import org.gtkkn.native.gio.g_socket_get_local_address
import org.gtkkn.native.gio.g_socket_get_multicast_loopback
import org.gtkkn.native.gio.g_socket_get_multicast_ttl
import org.gtkkn.native.gio.g_socket_get_protocol
import org.gtkkn.native.gio.g_socket_get_remote_address
import org.gtkkn.native.gio.g_socket_get_socket_type
import org.gtkkn.native.gio.g_socket_get_timeout
import org.gtkkn.native.gio.g_socket_get_ttl
import org.gtkkn.native.gio.g_socket_get_type
import org.gtkkn.native.gio.g_socket_is_closed
import org.gtkkn.native.gio.g_socket_is_connected
import org.gtkkn.native.gio.g_socket_join_multicast_group
import org.gtkkn.native.gio.g_socket_join_multicast_group_ssm
import org.gtkkn.native.gio.g_socket_leave_multicast_group
import org.gtkkn.native.gio.g_socket_leave_multicast_group_ssm
import org.gtkkn.native.gio.g_socket_listen
import org.gtkkn.native.gio.g_socket_new
import org.gtkkn.native.gio.g_socket_new_from_fd
import org.gtkkn.native.gio.g_socket_receive_bytes
import org.gtkkn.native.gio.g_socket_set_blocking
import org.gtkkn.native.gio.g_socket_set_broadcast
import org.gtkkn.native.gio.g_socket_set_keepalive
import org.gtkkn.native.gio.g_socket_set_listen_backlog
import org.gtkkn.native.gio.g_socket_set_multicast_loopback
import org.gtkkn.native.gio.g_socket_set_multicast_ttl
import org.gtkkn.native.gio.g_socket_set_option
import org.gtkkn.native.gio.g_socket_set_timeout
import org.gtkkn.native.gio.g_socket_set_ttl
import org.gtkkn.native.gio.g_socket_shutdown
import org.gtkkn.native.gio.g_socket_speaks_ipv4
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.Throws

/**
 * A `GSocket` is a low-level networking primitive. It is a more or less
 * direct mapping of the BSD socket API in a portable GObject based API.
 * It supports both the UNIX socket implementations and winsock2 on Windows.
 *
 * `GSocket` is the platform independent base upon which the higher level
 * network primitives are based. Applications are not typically meant to
 * use it directly, but rather through classes like [class@Gio.SocketClient],
 * [class@Gio.SocketService] and [class@Gio.SocketConnection]. However there may
 * be cases where direct use of `GSocket` is useful.
 *
 * `GSocket` implements the [iface@Gio.Initable] interface, so if it is manually
 * constructed by e.g. [ctor@GObject.Object.new] you must call
 * [method@Gio.Initable.init] and check the results before using the object.
 * This is done automatically in [ctor@Gio.Socket.new] and
 * [ctor@Gio.Socket.new_from_fd], so these functions can return `NULL`.
 *
 * Sockets operate in two general modes, blocking or non-blocking. When
 * in blocking mode all operations (which don’t take an explicit blocking
 * parameter) block until the requested operation
 * is finished or there is an error. In non-blocking mode all calls that
 * would block return immediately with a `G_IO_ERROR_WOULD_BLOCK` error.
 * To know when a call would successfully run you can call
 * [method@Gio.Socket.condition_check], or [method@Gio.Socket.condition_wait].
 * You can also use [method@Gio.Socket.create_source] and attach it to a
 * [type@GLib.MainContext] to get callbacks when I/O is possible.
 * Note that all sockets are always set to non blocking mode in the system, and
 * blocking mode is emulated in `GSocket`.
 *
 * When working in non-blocking mode applications should always be able to
 * handle getting a `G_IO_ERROR_WOULD_BLOCK` error even when some other
 * function said that I/O was possible. This can easily happen in case
 * of a race condition in the application, but it can also happen for other
 * reasons. For instance, on Windows a socket is always seen as writable
 * until a write returns `G_IO_ERROR_WOULD_BLOCK`.
 *
 * `GSocket`s can be either connection oriented or datagram based.
 * For connection oriented types you must first establish a connection by
 * either connecting to an address or accepting a connection from another
 * address. For connectionless socket types the target/source address is
 * specified or received in each I/O operation.
 *
 * All socket file descriptors are set to be close-on-exec.
 *
 * Note that creating a `GSocket` causes the signal `SIGPIPE` to be
 * ignored for the remainder of the program. If you are writing a
 * command-line utility that uses `GSocket`, you may need to take into
 * account the fact that your program will not automatically be killed
 * if it tries to write to `stdout` after it has been closed.
 *
 * Like most other APIs in GLib, `GSocket` is not inherently thread safe. To use
 * a `GSocket` concurrently from multiple threads, you must implement your own
 * locking.
 *
 * ## Nagle’s algorithm
 *
 * Since GLib 2.80, `GSocket` will automatically set the `TCP_NODELAY` option on
 * all `G_SOCKET_TYPE_STREAM` sockets. This disables
 * [Nagle’s algorithm](https://en.wikipedia.org/wiki/Nagle%27s_algorithm) as it
 * typically does more harm than good on modern networks.
 *
 * If your application needs Nagle’s algorithm enabled, call
 * [method@Gio.Socket.set_option] after constructing a `GSocket` to enable it:
 * ```c
 * socket = g_socket_new (…, G_SOCKET_TYPE_STREAM, …);
 * if (socket != NULL)
 *   {
 *     g_socket_set_option (socket, IPPROTO_TCP, TCP_NODELAY, FALSE, &local_error);
 *     // handle error if needed
 *   }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `buffer`: buffer: Out parameter is not supported
 * - parameter `address`: address: Out parameter is not supported
 * - parameter `address`: address: Out parameter is not supported
 * - method `receive_message`: In/Out parameter is not supported
 * - parameter `messages`: Array parameter of type InputMessage is not supported
 * - parameter `buffer`: buffer: Out parameter is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `vectors`: Array parameter of type OutputVector is not supported
 * - parameter `vectors`: Array parameter of type OutputVector is not supported
 * - parameter `messages`: Array parameter of type OutputMessage is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - method `local-address`: Property getter throws
 * - method `remote-address`: Property getter throws
 * - method `type`: Property has no getter nor setter
 *
 * @since 2.22
 */
@GioVersion2_22
public open class Socket(public val gioSocketPointer: CPointer<GSocket>) :
    Object(gioSocketPointer.reinterpret()),
    DatagramBased,
    Initable,
    KGTyped {
    override val gioDatagramBasedPointer: CPointer<GDatagramBased>
        get() = handle.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

    /**
     * Whether I/O on this socket is blocking.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open var blocking: Boolean
        /**
         * Gets the blocking mode of the socket. For details on blocking I/O,
         * see g_socket_set_blocking().
         *
         * @return true if blocking I/O is used, false otherwise.
         * @since 2.22
         */
        get() = g_socket_get_blocking(gioSocketPointer).asBoolean()

        /**
         * Sets the blocking mode of the socket. In blocking mode
         * all operations (which don’t take an explicit blocking parameter) block until
         * they succeed or there is an error. In
         * non-blocking mode all functions return results immediately or
         * with a %G_IO_ERROR_WOULD_BLOCK error.
         *
         * All sockets are created in blocking mode. However, note that the
         * platform level socket is always non-blocking, and blocking mode
         * is a GSocket level feature.
         *
         * @param blocking Whether to use blocking I/O or not.
         * @since 2.22
         */
        @GioVersion2_22
        set(blocking) = g_socket_set_blocking(gioSocketPointer, blocking.asGBoolean())

    /**
     * Whether the socket should allow sending to broadcast addresses.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open var broadcast: Boolean
        /**
         * Gets the broadcast setting on @socket; if true,
         * it is possible to send packets to broadcast
         * addresses.
         *
         * @return the broadcast setting on @socket
         * @since 2.32
         */
        get() = g_socket_get_broadcast(gioSocketPointer).asBoolean()

        /**
         * Sets whether @socket should allow sending to broadcast addresses.
         * This is false by default.
         *
         * @param broadcast whether @socket should allow sending to broadcast
         *     addresses
         * @since 2.32
         */
        @GioVersion2_32
        set(broadcast) = g_socket_set_broadcast(gioSocketPointer, broadcast.asGBoolean())

    /**
     * The socket’s address family.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val family: SocketFamily
        /**
         * Gets the socket family of the socket.
         *
         * @return a #GSocketFamily
         * @since 2.22
         */
        get() = g_socket_get_family(gioSocketPointer).run {
            SocketFamily.fromNativeValue(this)
        }

    /**
     * The socket’s file descriptor.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val fd: gint
        /**
         * Returns the underlying OS socket object. On unix this
         * is a socket file descriptor, and on Windows this is
         * a Winsock2 SOCKET handle. This may be useful for
         * doing platform specific or otherwise unusual operations
         * on the socket.
         *
         * @return the file descriptor of the socket.
         * @since 2.22
         */
        get() = g_socket_get_fd(gioSocketPointer)

    /**
     * Whether to keep the connection alive by sending periodic pings.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open var keepalive: Boolean
        /**
         * Gets the keepalive mode of the socket. For details on this,
         * see g_socket_set_keepalive().
         *
         * @return true if keepalive is active, false otherwise.
         * @since 2.22
         */
        get() = g_socket_get_keepalive(gioSocketPointer).asBoolean()

        /**
         * Sets or unsets the %SO_KEEPALIVE flag on the underlying socket. When
         * this flag is set on a socket, the system will attempt to verify that the
         * remote socket endpoint is still present if a sufficiently long period of
         * time passes with no data being exchanged. If the system is unable to
         * verify the presence of the remote endpoint, it will automatically close
         * the connection.
         *
         * This option is only functional on certain kinds of sockets. (Notably,
         * %G_SOCKET_PROTOCOL_TCP sockets.)
         *
         * The exact time between pings is system- and protocol-dependent, but will
         * normally be at least two hours. Most commonly, you would set this flag
         * on a server socket if you want to allow clients to remain idle for long
         * periods of time, but also want to ensure that connections are eventually
         * garbage-collected if clients crash or become unreachable.
         *
         * @param keepalive Value for the keepalive flag
         * @since 2.22
         */
        @GioVersion2_22
        set(keepalive) = g_socket_set_keepalive(gioSocketPointer, keepalive.asGBoolean())

    /**
     * The number of outstanding connections in the listen queue.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open var listenBacklog: gint
        /**
         * Gets the listen backlog setting of the socket. For details on this,
         * see g_socket_set_listen_backlog().
         *
         * @return the maximum number of pending connections.
         * @since 2.22
         */
        get() = g_socket_get_listen_backlog(gioSocketPointer)

        /**
         * Sets the maximum number of outstanding connections allowed
         * when listening on this socket. If more clients than this are
         * connecting to the socket and the application is not handling them
         * on time then the new connections will be refused.
         *
         * Note that this must be called before g_socket_listen() and has no
         * effect if called after that.
         *
         * @param backlog the maximum number of pending connections.
         * @since 2.22
         */
        @GioVersion2_22
        set(backlog) = g_socket_set_listen_backlog(gioSocketPointer, backlog)

    /**
     * Whether outgoing multicast packets loop back to the local host.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open var multicastLoopback: Boolean
        /**
         * Gets the multicast loopback setting on @socket; if true (the
         * default), outgoing multicast packets will be looped back to
         * multicast listeners on the same host.
         *
         * @return the multicast loopback setting on @socket
         * @since 2.32
         */
        get() = g_socket_get_multicast_loopback(gioSocketPointer).asBoolean()

        /**
         * Sets whether outgoing multicast packets will be received by sockets
         * listening on that multicast address on the same host. This is true
         * by default.
         *
         * @param loopback whether @socket should receive messages sent to its
         *   multicast groups from the local host
         * @since 2.32
         */
        @GioVersion2_32
        set(loopback) = g_socket_set_multicast_loopback(gioSocketPointer, loopback.asGBoolean())

    /**
     * Time-to-live out outgoing multicast packets
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open var multicastTtl: guint
        /**
         * Gets the multicast time-to-live setting on @socket; see
         * g_socket_set_multicast_ttl() for more details.
         *
         * @return the multicast time-to-live setting on @socket
         * @since 2.32
         */
        get() = g_socket_get_multicast_ttl(gioSocketPointer)

        /**
         * Sets the time-to-live for outgoing multicast datagrams on @socket.
         * By default, this is 1, meaning that multicast packets will not leave
         * the local network.
         *
         * @param ttl the time-to-live value for all multicast datagrams on @socket
         * @since 2.32
         */
        @GioVersion2_32
        set(ttl) = g_socket_set_multicast_ttl(gioSocketPointer, ttl)

    /**
     * The ID of the protocol to use, or `-1` for unknown.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val protocol: SocketProtocol
        /**
         * Gets the socket protocol id the socket was created with.
         * In case the protocol is unknown, -1 is returned.
         *
         * @return a protocol id, or -1 if unknown
         * @since 2.22
         */
        get() = g_socket_get_protocol(gioSocketPointer).run {
            SocketProtocol.fromNativeValue(this)
        }

    /**
     * The timeout in seconds on socket I/O
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open var timeout: guint
        /**
         * Gets the timeout setting of the socket. For details on this, see
         * g_socket_set_timeout().
         *
         * @return the timeout in seconds
         * @since 2.26
         */
        get() = g_socket_get_timeout(gioSocketPointer)

        /**
         * Sets the time in seconds after which I/O operations on @socket will
         * time out if they have not yet completed.
         *
         * On a blocking socket, this means that any blocking #GSocket
         * operation will time out after @timeout seconds of inactivity,
         * returning %G_IO_ERROR_TIMED_OUT.
         *
         * On a non-blocking socket, calls to g_socket_condition_wait() will
         * also fail with %G_IO_ERROR_TIMED_OUT after the given time. Sources
         * created with g_socket_create_source() will trigger after
         * @timeout seconds of inactivity, with the requested condition
         * set, at which point calling g_socket_receive(), g_socket_send(),
         * g_socket_check_connect_result(), etc, will fail with
         * %G_IO_ERROR_TIMED_OUT.
         *
         * If @timeout is 0 (the default), operations will never time out
         * on their own.
         *
         * Note that if an I/O operation is interrupted by a signal, this may
         * cause the timeout to be reset.
         *
         * @param timeout the timeout for @socket, in seconds, or 0 for none
         * @since 2.26
         */
        @GioVersion2_26
        set(timeout) = g_socket_set_timeout(gioSocketPointer, timeout)

    /**
     * Time-to-live for outgoing unicast packets
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open var ttl: guint
        /**
         * Gets the unicast time-to-live setting on @socket; see
         * g_socket_set_ttl() for more details.
         *
         * @return the time-to-live setting on @socket
         * @since 2.32
         */
        get() = g_socket_get_ttl(gioSocketPointer)

        /**
         * Sets the time-to-live for outgoing unicast packets on @socket.
         * By default the platform-specific default value is used.
         *
         * @param ttl the time-to-live value for all unicast packets on @socket
         * @since 2.32
         */
        @GioVersion2_32
        set(ttl) = g_socket_set_ttl(gioSocketPointer, ttl)

    /**
     * Creates a new #GSocket with the defined family, type and protocol.
     * If @protocol is 0 (%G_SOCKET_PROTOCOL_DEFAULT) the default protocol type
     * for the family and type is used.
     *
     * The @protocol is a family and type specific int that specifies what
     * kind of protocol to use. #GSocketProtocol lists several common ones.
     * Many families only support one protocol, and use 0 for this, others
     * support several and using 0 means to use the default protocol for
     * the family and type.
     *
     * The protocol id is passed directly to the operating
     * system, so you can use protocols not listed in #GSocketProtocol if you
     * know the protocol number used for it.
     *
     * @param family the socket family to use, e.g. %G_SOCKET_FAMILY_IPV4.
     * @param type the socket type to use.
     * @param protocol the id of the protocol to use, or 0 for default.
     * @return a #GSocket or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    @Throws(GLibException::class)
    public constructor(
        family: SocketFamily,
        type: SocketType,
        protocol: SocketProtocol,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_socket_new(family.nativeValue, type.nativeValue, protocol.nativeValue, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new #GSocket from a native file descriptor
     * or winsock SOCKET handle.
     *
     * This reads all the settings from the file descriptor so that
     * all properties should work. Note that the file descriptor
     * will be set to non-blocking mode, independent on the blocking
     * mode of the #GSocket.
     *
     * On success, the returned #GSocket takes ownership of @fd. On failure, the
     * caller must close @fd themselves.
     *
     * Since GLib 2.46, it is no longer a fatal error to call this on a non-socket
     * descriptor.  Instead, a GError will be set with code %G_IO_ERROR_FAILED
     *
     * @param fd a native socket file descriptor.
     * @return a #GSocket or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    @Throws(GLibException::class)
    public constructor(fd: gint) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_socket_new_from_fd(fd, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Accept incoming connections on a connection-based socket. This removes
     * the first outstanding connection request from the listening socket and
     * creates a #GSocket object for it.
     *
     * The @socket must be bound to a local address with g_socket_bind() and
     * must be listening for incoming connections (g_socket_listen()).
     *
     * If there are no outstanding connections then the operation will block
     * or return %G_IO_ERROR_WOULD_BLOCK if non-blocking I/O is enabled.
     * To be notified of an incoming connection, wait for the %G_IO_IN condition.
     *
     * @param cancellable a %GCancellable or null
     * @return a new #GSocket, or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public open fun accept(cancellable: Cancellable? = null): Result<Socket> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_accept(gioSocketPointer, cancellable?.gioCancellablePointer, gError.ptr)?.run {
            Socket(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * When a socket is created it is attached to an address family, but it
     * doesn't have an address in this family. g_socket_bind() assigns the
     * address (sometimes called name) of the socket.
     *
     * It is generally required to bind to a local address before you can
     * receive connections. (See g_socket_listen() and g_socket_accept() ).
     * In certain situations, you may also want to bind a socket that will be
     * used to initiate connections, though this is not normally required.
     *
     * If @socket is a TCP socket, then @allow_reuse controls the setting
     * of the `SO_REUSEADDR` socket option; normally it should be true for
     * server sockets (sockets that you will eventually call
     * g_socket_accept() on), and false for client sockets. (Failing to
     * set this flag on a server socket may cause g_socket_bind() to return
     * %G_IO_ERROR_ADDRESS_IN_USE if the server program is stopped and then
     * immediately restarted.)
     *
     * If @socket is a UDP socket, then @allow_reuse determines whether or
     * not other UDP sockets can be bound to the same address at the same
     * time. In particular, you can have several UDP sockets bound to the
     * same address, and they will all receive all of the multicast and
     * broadcast packets sent to that address. (The behavior of unicast
     * UDP packets to an address with multiple listeners is not defined.)
     *
     * @param address a #GSocketAddress specifying the local address.
     * @param allowReuse whether to allow reusing this address
     * @return true on success, false on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun bind(address: SocketAddress, allowReuse: Boolean): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_bind(
            gioSocketPointer,
            address.gioSocketAddressPointer,
            allowReuse.asGBoolean(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Checks and resets the pending connect error for the socket.
     * This is used to check for errors when g_socket_connect() is
     * used in non-blocking mode.
     *
     * @return true if no error, false otherwise, setting @error to the error
     * @since 2.22
     */
    @GioVersion2_22
    public open fun checkConnectResult(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_check_connect_result(gioSocketPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Closes the socket, shutting down any active connection.
     *
     * Closing a socket does not wait for all outstanding I/O operations
     * to finish, so the caller should not rely on them to be guaranteed
     * to complete even if the close returns with no error.
     *
     * Once the socket is closed, all other operations will return
     * %G_IO_ERROR_CLOSED. Closing a socket multiple times will not
     * return an error.
     *
     * Sockets will be automatically closed when the last reference
     * is dropped, but you might want to call this function to make sure
     * resources are released as early as possible.
     *
     * Beware that due to the way that TCP works, it is possible for
     * recently-sent data to be lost if either you close a socket while the
     * %G_IO_IN condition is set, or else if the remote connection tries to
     * send something to you after you close the socket but before it has
     * finished reading all of the data you sent. There is no easy generic
     * way to avoid this problem; the easiest fix is to design the network
     * protocol such that the client will never send data "out of turn".
     * Another solution is for the server to half-close the connection by
     * calling g_socket_shutdown() with only the @shutdown_write flag set,
     * and then wait for the client to notice this and close its side of the
     * connection, after which the server can safely call g_socket_close().
     * (This is what #GTcpConnection does if you call
     * g_tcp_connection_set_graceful_disconnect(). But of course, this
     * only works if the client will close its connection after the server
     * does.)
     *
     * @return true on success, false on error
     * @since 2.22
     */
    @GioVersion2_22
    public open fun close(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_close(gioSocketPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Checks on the readiness of @socket to perform operations.
     * The operations specified in @condition are checked for and masked
     * against the currently-satisfied conditions on @socket. The result
     * is returned.
     *
     * Note that on Windows, it is possible for an operation to return
     * %G_IO_ERROR_WOULD_BLOCK even immediately after
     * g_socket_condition_check() has claimed that the socket is ready for
     * writing. Rather than calling g_socket_condition_check() and then
     * writing to the socket if it succeeds, it is generally better to
     * simply try writing to the socket right away, and try again later if
     * the initial attempt returns %G_IO_ERROR_WOULD_BLOCK.
     *
     * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in condition;
     * these conditions will always be set in the output if they are true.
     *
     * This call never blocks.
     *
     * @param condition a #GIOCondition mask to check
     * @return the @GIOCondition mask of the current state
     * @since 2.22
     */
    @GioVersion2_22
    override fun conditionCheck(condition: IoCondition): IoCondition =
        g_socket_condition_check(gioSocketPointer, condition.mask).run {
            IoCondition(this)
        }

    /**
     * Waits for up to @timeout_us microseconds for @condition to become true
     * on @socket. If the condition is met, true is returned.
     *
     * If @cancellable is cancelled before the condition is met, or if
     * @timeout_us (or the socket's #GSocket:timeout) is reached before the
     * condition is met, then false is returned and @error, if non-null,
     * is set to the appropriate value (%G_IO_ERROR_CANCELLED or
     * %G_IO_ERROR_TIMED_OUT).
     *
     * If you don't want a timeout, use g_socket_condition_wait().
     * (Alternatively, you can pass -1 for @timeout_us.)
     *
     * Note that although @timeout_us is in microseconds for consistency with
     * other GLib APIs, this function actually only has millisecond
     * resolution, and the behavior is undefined if @timeout_us is not an
     * exact number of milliseconds.
     *
     * @param condition a #GIOCondition mask to wait for
     * @param timeoutUs the maximum time (in microseconds) to wait, or -1
     * @param cancellable a #GCancellable, or null
     * @return true if the condition was met, false otherwise
     * @since 2.32
     */
    @GioVersion2_32
    public open fun conditionTimedWait(
        condition: IoCondition,
        timeoutUs: gint64,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_condition_timed_wait(
            gioSocketPointer,
            condition.mask,
            timeoutUs,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Waits for @condition to become true on @socket. When the condition
     * is met, true is returned.
     *
     * If @cancellable is cancelled before the condition is met, or if the
     * socket has a timeout set and it is reached before the condition is
     * met, then false is returned and @error, if non-null, is set to
     * the appropriate value (%G_IO_ERROR_CANCELLED or
     * %G_IO_ERROR_TIMED_OUT).
     *
     * See also g_socket_condition_timed_wait().
     *
     * @param condition a #GIOCondition mask to wait for
     * @param cancellable a #GCancellable, or null
     * @return true if the condition was met, false otherwise
     * @since 2.22
     */
    @GioVersion2_22
    public open fun conditionWait(condition: IoCondition, cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_socket_condition_wait(
                gioSocketPointer,
                condition.mask,
                cancellable?.gioCancellablePointer,
                gError.ptr
            ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Connect the socket to the specified remote address.
     *
     * For connection oriented socket this generally means we attempt to make
     * a connection to the @address. For a connection-less socket it sets
     * the default address for g_socket_send() and discards all incoming datagrams
     * from other sources.
     *
     * Generally connection oriented sockets can only connect once, but
     * connection-less sockets can connect multiple times to change the
     * default address.
     *
     * If the connect call needs to do network I/O it will block, unless
     * non-blocking I/O is enabled. Then %G_IO_ERROR_PENDING is returned
     * and the user can be notified of the connection finishing by waiting
     * for the G_IO_OUT condition. The result of the connection must then be
     * checked with g_socket_check_connect_result().
     *
     * @param address a #GSocketAddress specifying the remote address.
     * @param cancellable a %GCancellable or null
     * @return true if connected, false on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun connect(address: SocketAddress, cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_connect(
            gioSocketPointer,
            address.gioSocketAddressPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates a #GSocketConnection subclass of the right type for
     * @socket.
     *
     * @return a #GSocketConnection
     * @since 2.22
     */
    @GioVersion2_22
    public open fun connectionFactoryCreateConnection(): SocketConnection =
        g_socket_connection_factory_create_connection(gioSocketPointer)!!.run {
            SocketConnection(this)
        }

    /**
     * Creates a #GSource that can be attached to a %GMainContext to monitor
     * for the availability of the specified @condition on the socket. The #GSource
     * keeps a reference to the @socket.
     *
     * The callback on the source is of the #GSocketSourceFunc type.
     *
     * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in @condition;
     * these conditions will always be reported output if they are true.
     *
     * @cancellable if not null can be used to cancel the source, which will
     * cause the source to trigger, reporting the current condition (which
     * is likely 0 unless cancellation happened at the same time as a
     * condition change). You can check for this in the callback using
     * g_cancellable_is_cancelled().
     *
     * If @socket has a timeout set, and it is reached before @condition
     * occurs, the source will then trigger anyway, reporting %G_IO_IN or
     * %G_IO_OUT depending on @condition. However, @socket will have been
     * marked as having had a timeout, and so the next #GSocket I/O method
     * you call will then fail with a %G_IO_ERROR_TIMED_OUT.
     *
     * @param condition a #GIOCondition mask to monitor
     * @param cancellable a %GCancellable or null
     * @return a newly allocated %GSource, free with g_source_unref().
     * @since 2.22
     */
    @GioVersion2_22
    override fun createSource(condition: IoCondition, cancellable: Cancellable?): Source =
        g_socket_create_source(gioSocketPointer, condition.mask, cancellable?.gioCancellablePointer)!!.run {
            Source(this)
        }

    /**
     * Get the amount of data pending in the OS input buffer, without blocking.
     *
     * If @socket is a UDP or SCTP socket, this will return the size of
     * just the next packet, even if additional packets are buffered after
     * that one.
     *
     * Note that on Windows, this function is rather inefficient in the
     * UDP case, and so if you know any plausible upper bound on the size
     * of the incoming packet, it is better to just do a
     * g_socket_receive() with a buffer of that size, rather than calling
     * g_socket_get_available_bytes() first and then doing a receive of
     * exactly the right size.
     *
     * @return the number of bytes that can be read from the socket
     * without blocking or truncating, or -1 on error.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun getAvailableBytes(): Long = g_socket_get_available_bytes(gioSocketPointer)

    /**
     * Returns the credentials of the foreign process connected to this
     * socket, if any (e.g. it is only supported for %G_SOCKET_FAMILY_UNIX
     * sockets).
     *
     * If this operation isn't supported on the OS, the method fails with
     * the %G_IO_ERROR_NOT_SUPPORTED error. On Linux this is implemented
     * by reading the %SO_PEERCRED option on the underlying socket.
     *
     * This method can be expected to be available on the following platforms:
     *
     * - Linux since GLib 2.26
     * - OpenBSD since GLib 2.30
     * - Solaris, Illumos and OpenSolaris since GLib 2.40
     * - NetBSD since GLib 2.42
     * - macOS, tvOS, iOS since GLib 2.66
     *
     * Other ways to obtain credentials from a foreign peer includes the
     * #GUnixCredentialsMessage type and
     * g_unix_connection_send_credentials() /
     * g_unix_connection_receive_credentials() functions.
     *
     * @return null if @error is set, otherwise a #GCredentials object
     * that must be freed with g_object_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getCredentials(): Result<Credentials> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_get_credentials(gioSocketPointer, gError.ptr)?.run {
            Credentials(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Try to get the local address of a bound socket. This is only
     * useful if the socket has been bound to a local address,
     * either explicitly or implicitly when connecting.
     *
     * @return a #GSocketAddress or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getLocalAddress(): Result<SocketAddress> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_get_local_address(gioSocketPointer, gError.ptr)?.run {
            SocketAddress.SocketAddressImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Try to get the remote address of a connected socket. This is only
     * useful for connection oriented sockets that have been connected.
     *
     * @return a #GSocketAddress or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getRemoteAddress(): Result<SocketAddress> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_get_remote_address(gioSocketPointer, gError.ptr)?.run {
            SocketAddress.SocketAddressImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Gets the socket type of the socket.
     *
     * @return a #GSocketType
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getSocketType(): SocketType = g_socket_get_socket_type(gioSocketPointer).run {
        SocketType.fromNativeValue(this)
    }

    /**
     * Checks whether a socket is closed.
     *
     * @return true if socket is closed, false otherwise
     * @since 2.22
     */
    @GioVersion2_22
    public open fun isClosed(): Boolean = g_socket_is_closed(gioSocketPointer).asBoolean()

    /**
     * Check whether the socket is connected. This is only useful for
     * connection-oriented sockets.
     *
     * If using g_socket_shutdown(), this function will return true until the
     * socket has been shut down for reading and writing. If you do a non-blocking
     * connect, this function will not return true until after you call
     * g_socket_check_connect_result().
     *
     * @return true if socket is connected, false otherwise.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun isConnected(): Boolean = g_socket_is_connected(gioSocketPointer).asBoolean()

    /**
     * Registers @socket to receive multicast messages sent to @group.
     * @socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * been bound to an appropriate interface and port with
     * g_socket_bind().
     *
     * If @iface is null, the system will automatically pick an interface
     * to bind to based on @group.
     *
     * If @source_specific is true, source-specific multicast as defined
     * in RFC 4604 is used. Note that on older platforms this may fail
     * with a %G_IO_ERROR_NOT_SUPPORTED error.
     *
     * To bind to a given source-specific multicast address, use
     * g_socket_join_multicast_group_ssm() instead.
     *
     * @param group a #GInetAddress specifying the group address to join.
     * @param sourceSpecific true if source-specific multicast should be used
     * @param iface Name of the interface to use, or null
     * @return true on success, false on error.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun joinMulticastGroup(
        group: InetAddress,
        sourceSpecific: Boolean,
        iface: String? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_join_multicast_group(
            gioSocketPointer,
            group.gioInetAddressPointer,
            sourceSpecific.asGBoolean(),
            iface,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Registers @socket to receive multicast messages sent to @group.
     * @socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * been bound to an appropriate interface and port with
     * g_socket_bind().
     *
     * If @iface is null, the system will automatically pick an interface
     * to bind to based on @group.
     *
     * If @source_specific is not null, use source-specific multicast as
     * defined in RFC 4604. Note that on older platforms this may fail
     * with a %G_IO_ERROR_NOT_SUPPORTED error.
     *
     * Note that this function can be called multiple times for the same
     * @group with different @source_specific in order to receive multicast
     * packets from more than one source.
     *
     * @param group a #GInetAddress specifying the group address to join.
     * @param sourceSpecific a #GInetAddress specifying the
     * source-specific multicast address or null to ignore.
     * @param iface Name of the interface to use, or null
     * @return true on success, false on error.
     * @since 2.56
     */
    @GioVersion2_56
    public open fun joinMulticastGroupSsm(
        group: InetAddress,
        sourceSpecific: InetAddress? = null,
        iface: String? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_join_multicast_group_ssm(
            gioSocketPointer,
            group.gioInetAddressPointer,
            sourceSpecific?.gioInetAddressPointer,
            iface,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Removes @socket from the multicast group defined by @group, @iface,
     * and @source_specific (which must all have the same values they had
     * when you joined the group).
     *
     * @socket remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     *
     * To unbind to a given source-specific multicast address, use
     * g_socket_leave_multicast_group_ssm() instead.
     *
     * @param group a #GInetAddress specifying the group address to leave.
     * @param sourceSpecific true if source-specific multicast was used
     * @param iface Interface used
     * @return true on success, false on error.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun leaveMulticastGroup(
        group: InetAddress,
        sourceSpecific: Boolean,
        iface: String? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_leave_multicast_group(
            gioSocketPointer,
            group.gioInetAddressPointer,
            sourceSpecific.asGBoolean(),
            iface,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Removes @socket from the multicast group defined by @group, @iface,
     * and @source_specific (which must all have the same values they had
     * when you joined the group).
     *
     * @socket remains bound to its address and port, and can still receive
     * unicast messages after calling this.
     *
     * @param group a #GInetAddress specifying the group address to leave.
     * @param sourceSpecific a #GInetAddress specifying the
     * source-specific multicast address or null to ignore.
     * @param iface Name of the interface to use, or null
     * @return true on success, false on error.
     * @since 2.56
     */
    @GioVersion2_56
    public open fun leaveMulticastGroupSsm(
        group: InetAddress,
        sourceSpecific: InetAddress? = null,
        iface: String? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_leave_multicast_group_ssm(
            gioSocketPointer,
            group.gioInetAddressPointer,
            sourceSpecific?.gioInetAddressPointer,
            iface,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Marks the socket as a server socket, i.e. a socket that is used
     * to accept incoming requests using g_socket_accept().
     *
     * Before calling this the socket must be bound to a local address using
     * g_socket_bind().
     *
     * To set the maximum amount of outstanding clients, use
     * g_socket_set_listen_backlog().
     *
     * @return true on success, false on error.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun listen(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_listen(gioSocketPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Receives data (up to @size bytes) from a socket.
     *
     * This function is a variant of [method@Gio.Socket.receive] which returns a
     * [struct@GLib.Bytes] rather than a plain buffer.
     *
     * Pass `-1` to @timeout_us to block indefinitely until data is received (or
     * the connection is closed, or there is an error). Pass `0` to use the default
     * timeout from [property@Gio.Socket:timeout], or pass a positive number to wait
     * for that many microseconds for data before returning `G_IO_ERROR_TIMED_OUT`.
     *
     * @param size the number of bytes you want to read from the socket
     * @param timeoutUs the timeout to wait for, in microseconds, or `-1` to block
     *   indefinitely
     * @param cancellable a %GCancellable, or `NULL`
     * @return a bytes buffer containing the
     *   received bytes, or `NULL` on error
     * @since 2.80
     */
    @GioVersion2_80
    public open fun receiveBytes(size: gsize, timeoutUs: gint64, cancellable: Cancellable? = null): Result<Bytes> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_socket_receive_bytes(
                gioSocketPointer,
                size,
                timeoutUs,
                cancellable?.gioCancellablePointer,
                gError.ptr
            )?.run {
                Bytes(this)
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Sets the value of an integer-valued option on @socket, as with
     * setsockopt(). (If you need to set a non-integer-valued option,
     * you will need to call setsockopt() directly.)
     *
     * The [<gio/gnetworking.h>][gio-gnetworking.h]
     * header pulls in system headers that will define most of the
     * standard/portable socket options. For unusual socket protocols or
     * platform-dependent options, you may need to include additional
     * headers.
     *
     * @param level the "API level" of the option (eg, `SOL_SOCKET`)
     * @param optname the "name" of the option (eg, `SO_BROADCAST`)
     * @param value the value to set the option to
     * @return success or failure. On failure, @error will be set, and
     *   the system error value (`errno` or WSAGetLastError()) will still
     *   be set to the result of the setsockopt() call.
     * @since 2.36
     */
    @GioVersion2_36
    public open fun setOption(level: gint, optname: gint, `value`: gint): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_set_option(gioSocketPointer, level, optname, `value`, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Shut down part or all of a full-duplex connection.
     *
     * If @shutdown_read is true then the receiving side of the connection
     * is shut down, and further reading is disallowed.
     *
     * If @shutdown_write is true then the sending side of the connection
     * is shut down, and further writing is disallowed.
     *
     * It is allowed for both @shutdown_read and @shutdown_write to be true.
     *
     * One example where it is useful to shut down only one side of a connection is
     * graceful disconnect for TCP connections where you close the sending side,
     * then wait for the other side to close the connection, thus ensuring that the
     * other side saw all sent data.
     *
     * @param shutdownRead whether to shut down the read side
     * @param shutdownWrite whether to shut down the write side
     * @return true on success, false on error
     * @since 2.22
     */
    @GioVersion2_22
    public open fun shutdown(shutdownRead: Boolean, shutdownWrite: Boolean): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_shutdown(
            gioSocketPointer,
            shutdownRead.asGBoolean(),
            shutdownWrite.asGBoolean(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Checks if a socket is capable of speaking IPv4.
     *
     * IPv4 sockets are capable of speaking IPv4.  On some operating systems
     * and under some combinations of circumstances IPv6 sockets are also
     * capable of speaking IPv4.  See RFC 3493 section 3.7 for more
     * information.
     *
     * No other types of sockets are currently considered as being capable
     * of speaking IPv4.
     *
     * @return true if this socket can be used with IPv4.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun speaksIpv4(): Boolean = g_socket_speaks_ipv4(gioSocketPointer).asBoolean()

    public companion object : TypeCompanion<Socket> {
        override val type: GeneratedClassKGType<Socket> =
            GeneratedClassKGType(getTypeOrNull("g_socket_get_type")!!) { Socket(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Socket
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_get_type()
    }
}
