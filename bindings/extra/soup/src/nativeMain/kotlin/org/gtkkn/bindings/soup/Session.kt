// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.InetSocketAddress
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.OutputStream
import org.gtkkn.bindings.gio.OutputStreamSpliceFlags
import org.gtkkn.bindings.gio.ProxyResolver
import org.gtkkn.bindings.gio.SocketConnectable
import org.gtkkn.bindings.gio.TlsDatabase
import org.gtkkn.bindings.gio.TlsInteraction
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.Soup.resolveException
import org.gtkkn.bindings.soup.annotations.SoupVersion3_4
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.soup.SoupMessage
import org.gtkkn.native.soup.SoupSession
import org.gtkkn.native.soup.soup_session_abort
import org.gtkkn.native.soup.soup_session_add_feature
import org.gtkkn.native.soup.soup_session_add_feature_by_type
import org.gtkkn.native.soup.soup_session_get_accept_language
import org.gtkkn.native.soup.soup_session_get_accept_language_auto
import org.gtkkn.native.soup.soup_session_get_async_result_message
import org.gtkkn.native.soup.soup_session_get_feature
import org.gtkkn.native.soup.soup_session_get_feature_for_message
import org.gtkkn.native.soup.soup_session_get_idle_timeout
import org.gtkkn.native.soup.soup_session_get_local_address
import org.gtkkn.native.soup.soup_session_get_max_conns
import org.gtkkn.native.soup.soup_session_get_max_conns_per_host
import org.gtkkn.native.soup.soup_session_get_proxy_resolver
import org.gtkkn.native.soup.soup_session_get_remote_connectable
import org.gtkkn.native.soup.soup_session_get_timeout
import org.gtkkn.native.soup.soup_session_get_tls_database
import org.gtkkn.native.soup.soup_session_get_tls_interaction
import org.gtkkn.native.soup.soup_session_get_type
import org.gtkkn.native.soup.soup_session_get_user_agent
import org.gtkkn.native.soup.soup_session_has_feature
import org.gtkkn.native.soup.soup_session_new
import org.gtkkn.native.soup.soup_session_preconnect_async
import org.gtkkn.native.soup.soup_session_preconnect_finish
import org.gtkkn.native.soup.soup_session_remove_feature
import org.gtkkn.native.soup.soup_session_remove_feature_by_type
import org.gtkkn.native.soup.soup_session_send
import org.gtkkn.native.soup.soup_session_send_and_read
import org.gtkkn.native.soup.soup_session_send_and_read_async
import org.gtkkn.native.soup.soup_session_send_and_read_finish
import org.gtkkn.native.soup.soup_session_send_and_splice
import org.gtkkn.native.soup.soup_session_send_and_splice_async
import org.gtkkn.native.soup.soup_session_send_and_splice_finish
import org.gtkkn.native.soup.soup_session_send_async
import org.gtkkn.native.soup.soup_session_send_finish
import org.gtkkn.native.soup.soup_session_set_accept_language
import org.gtkkn.native.soup.soup_session_set_accept_language_auto
import org.gtkkn.native.soup.soup_session_set_idle_timeout
import org.gtkkn.native.soup.soup_session_set_proxy_resolver
import org.gtkkn.native.soup.soup_session_set_timeout
import org.gtkkn.native.soup.soup_session_set_tls_database
import org.gtkkn.native.soup.soup_session_set_tls_interaction
import org.gtkkn.native.soup.soup_session_set_user_agent
import org.gtkkn.native.soup.soup_session_websocket_connect_async
import org.gtkkn.native.soup.soup_session_websocket_connect_finish
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * Soup session state object.
 *
 * #SoupSession is the object that controls client-side HTTP. A
 * #SoupSession encapsulates all of the state that libsoup is keeping
 * on behalf of your program; cached HTTP connections, authentication
 * information, etc. It also keeps track of various global options
 * and features that you are using.
 *
 * Most applications will only need a single #SoupSession; the primary
 * reason you might need multiple sessions is if you need to have
 * multiple independent authentication contexts. (Eg, you are
 * connecting to a server and authenticating as two different users at
 * different times; the easiest way to ensure that each [class@Message]
 * is sent with the authentication information you intended is to use
 * one session for the first user, and a second session for the other
 * user.)
 *
 * Additional #SoupSession functionality is provided by
 * [iface@SessionFeature] objects, which can be added to a session with
 * [method@Session.add_feature] or [method@Session.add_feature_by_type]
 * For example, [class@Logger] provides support for
 * logging HTTP traffic, [class@ContentDecoder] provides support for
 * compressed response handling, and [class@ContentSniffer] provides
 * support for HTML5-style response body content sniffing.
 * Additionally, subtypes of [class@Auth] can be added
 * as features, to add support for additional authentication types.
 *
 * All `SoupSession`s are created with a [class@AuthManager], and support
 * for %SOUP_TYPE_AUTH_BASIC and %SOUP_TYPE_AUTH_DIGEST. Additionally,
 * sessions using the plain #SoupSession class (rather than one of its deprecated
 * subtypes) have a [class@ContentDecoder] by default.
 *
 * Note that all async methods will invoke their callbacks on the thread-default
 * context at the time of the function call.
 *
 * ## Skipped during bindings generation
 *
 * - method `accept-language`: Property TypeInfo of getter and setter do not match
 * - method `user-agent`: Property TypeInfo of getter and setter do not match
 * - constructor `new_with_options`: Varargs parameter is not supported
 */
public open class Session(pointer: CPointer<SoupSession>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val soupSessionPointer: CPointer<SoupSession>
        get() = gPointer.reinterpret()

    /**
     * If true, #SoupSession will automatically set the string
     * for the "Accept-Language" header on every [class@Message]
     * sent, based on the return value of [func@GLib.get_language_names].
     *
     * Setting this will override any previous value of
     * [property@Session:accept-language].
     */
    public open var acceptLanguageAuto: Boolean
        /**
         * Gets whether @session automatically sets the "Accept-Language" header on new
         * requests.
         *
         * @return true if @session sets "Accept-Language" header automatically, or
         *   false otherwise.
         */
        get() = soup_session_get_accept_language_auto(soupSessionPointer).asBoolean()

        /**
         * Set whether @session will automatically set the "Accept-Language" header on
         * requests using a value generated from system languages based on
         * [func@GLib.get_language_names].
         *
         * See [property@Session:accept-language-auto] for more information.
         *
         * @param acceptLanguageAuto the value to set
         */
        set(
            acceptLanguageAuto
        ) = soup_session_set_accept_language_auto(soupSessionPointer, acceptLanguageAuto.asGBoolean())

    /**
     * Connection lifetime (in seconds) when idle. Any connection
     * left idle longer than this will be closed.
     *
     * Although you can change this property at any time, it will
     * only affect newly-created connections, not currently-open
     * ones. You can call [method@Session.abort] after setting this
     * if you want to ensure that all future connections will have
     * this timeout value.
     */
    public open var idleTimeout: guint
        /**
         * Get the timeout in seconds for idle connection lifetime currently used by
         * @session.
         *
         * @return the timeout in seconds
         */
        get() = soup_session_get_idle_timeout(soupSessionPointer)

        /**
         * Set a timeout in seconds for idle connection lifetime to be used by @session
         * on new connections.
         *
         * See [property@Session:idle-timeout] for more information.
         *
         * @param timeout a timeout in seconds
         */
        set(timeout) = soup_session_set_idle_timeout(soupSessionPointer, timeout)

    /**
     * Sets the [class@Gio.InetSocketAddress] to use for the client side of
     * the connection.
     *
     * Use this property if you want for instance to bind the
     * local socket to a specific IP address.
     */
    public open val localAddress: InetSocketAddress?
        /**
         * Get the [class@Gio.InetSocketAddress] to use for the client side of
         * connections in @session.
         *
         * @return a #GInetSocketAddress
         */
        get() = soup_session_get_local_address(soupSessionPointer)?.run {
            InetSocketAddress(this)
        }

    /**
     * The maximum number of connections that the session can open at once.
     */
    public open val maxConns: guint
        /**
         * Get the maximum number of connections that @session can open at once.
         *
         * @return the maximum number of connections
         */
        get() = soup_session_get_max_conns(soupSessionPointer)

    /**
     * The maximum number of connections that the session can open at once
     * to a given host.
     */
    public open val maxConnsPerHost: guint
        /**
         * Get the maximum number of connections that @session can open at once to a
         * given host.
         *
         * @return the maximum number of connections per host
         */
        get() = soup_session_get_max_conns_per_host(soupSessionPointer)

    /**
     * A [iface@Gio.ProxyResolver] to use with this session.
     *
     * If no proxy resolver is set, then the default proxy resolver
     * will be used. See [func@Gio.ProxyResolver.get_default].
     * You can set it to null if you don't want to use proxies, or
     * set it to your own [iface@Gio.ProxyResolver] if you want to control
     * what proxies get used.
     */
    public open var proxyResolver: ProxyResolver?
        /**
         * Get the [iface@Gio.ProxyResolver] currently used by @session.
         *
         * @return a #GProxyResolver or null if proxies
         *   are disabled in @session
         */
        get() = soup_session_get_proxy_resolver(soupSessionPointer)?.run {
            ProxyResolver.wrap(reinterpret())
        }

        /**
         * Set a [iface@Gio.ProxyResolver] to be used by @session on new connections.
         *
         * If @proxy_resolver is null then no proxies will be used. See
         * [property@Session:proxy-resolver] for more information.
         *
         * @param proxyResolver a #GProxyResolver or null
         */
        set(proxyResolver) = soup_session_set_proxy_resolver(soupSessionPointer, proxyResolver?.gioProxyResolverPointer)

    /**
     * Sets a socket to make outgoing connections on. This will override the default
     * behaviour of opening TCP/IP sockets to the hosts specified in the URIs.
     *
     * This function is not required for common HTTP usage, but only when connecting
     * to a HTTP service that is not using standard TCP/IP sockets. An example of
     * this is a local service that uses HTTP over UNIX-domain sockets, in that case
     * a [class@Gio.UnixSocketAddress] can be passed to this function.
     */
    public open val remoteConnectable: SocketConnectable?
        /**
         * Gets the remote connectable if one set.
         *
         * @return the #GSocketConnectable
         */
        get() = soup_session_get_remote_connectable(soupSessionPointer)?.run {
            SocketConnectable.wrap(reinterpret())
        }

    /**
     * The timeout (in seconds) for socket I/O operations
     * (including connecting to a server, and waiting for a reply
     * to an HTTP request).
     *
     * Although you can change this property at any time, it will
     * only affect newly-created connections, not currently-open
     * ones. You can call [method@Session.abort] after setting this
     * if you want to ensure that all future connections will have
     * this timeout value.
     *
     * Not to be confused with [property@Session:idle-timeout] (which is
     * the length of time that idle persistent connections will be
     * kept open).
     */
    public open var timeout: guint
        /**
         * Get the timeout in seconds for socket I/O operations currently used by
         * @session.
         *
         * @return the timeout in seconds
         */
        get() = soup_session_get_timeout(soupSessionPointer)

        /**
         * Set a timeout in seconds for socket I/O operations to be used by @session
         * on new connections.
         *
         * See [property@Session:timeout] for more information.
         *
         * @param timeout a timeout in seconds
         */
        set(timeout) = soup_session_set_timeout(soupSessionPointer, timeout)

    /**
     * Sets the [class@Gio.TlsDatabase] to use for validating SSL/TLS
     * certificates.
     *
     * If no certificate database is set, then the default database will be
     * used. See [method@Gio.TlsBackend.get_default_database].
     */
    public open var tlsDatabase: TlsDatabase?
        /**
         * Get the [class@Gio.TlsDatabase] currently used by @session.
         *
         * @return a #GTlsDatabase
         */
        get() = soup_session_get_tls_database(soupSessionPointer)?.run {
            TlsDatabase(this)
        }

        /**
         * Set a [class@GIo.TlsDatabase] to be used by @session on new connections.
         *
         * If @tls_database is null then certificate validation will always fail. See
         * [property@Session:tls-database] for more information.
         *
         * @param tlsDatabase a #GTlsDatabase
         */
        set(tlsDatabase) = soup_session_set_tls_database(soupSessionPointer, tlsDatabase?.gioTlsDatabasePointer)

    /**
     * A [class@Gio.TlsInteraction] object that will be passed on to any
     * [class@Gio.TlsConnection]s created by the session.
     *
     * This can be used to provide client-side certificates, for example.
     */
    public open var tlsInteraction: TlsInteraction?
        /**
         * Get the [class@Gio.TlsInteraction] currently used by @session.
         *
         * @return a #GTlsInteraction
         */
        get() = soup_session_get_tls_interaction(soupSessionPointer)?.run {
            TlsInteraction(this)
        }

        /**
         * Set a [class@Gio.TlsInteraction] to be used by @session on new connections.
         *
         * If @tls_interaction is null then client certificate validation will always
         * fail.
         *
         * See [property@Session:tls-interaction] for more information.
         *
         * @param tlsInteraction a #GTlsInteraction
         */
        set(
            tlsInteraction
        ) = soup_session_set_tls_interaction(soupSessionPointer, tlsInteraction?.gioTlsInteractionPointer)

    /**
     * Creates a #SoupSession with the default options.
     *
     * @return the new session.
     */
    public constructor() : this(soup_session_new()!!.reinterpret())

    /**
     * Cancels all pending requests in @session and closes all idle
     * persistent connections.
     */
    public open fun abort(): Unit = soup_session_abort(soupSessionPointer)

    /**
     * Adds @feature's functionality to @session. You cannot add multiple
     * features of the same [alias@GLib.Type] to a session.
     *
     * See the main #SoupSession documentation for information on what
     * features are present in sessions by default.
     *
     * @param feature an object that implements #SoupSessionFeature
     */
    public open fun addFeature(feature: SessionFeature): Unit =
        soup_session_add_feature(soupSessionPointer, feature.soupSessionFeaturePointer)

    /**
     * If @feature_type is the type of a class that implements
     * [iface@SessionFeature], this creates a new feature of that type and
     * adds it to @session as with [method@Session.add_feature]. You can use
     * this when you don't need to customize the new feature in any way.
     * Adding multiple features of the same @feature_type is not allowed.
     *
     * If @feature_type is not a [iface@SessionFeature] type, this gives each
     * existing feature on @session the chance to accept @feature_type as
     * a "subfeature". This can be used to add new [class@Auth] types, for instance.
     *
     * See the main #SoupSession documentation for information on what
     * features are present in sessions by default.
     *
     * @param featureType a #GType
     */
    public open fun addFeatureByType(featureType: GType): Unit =
        soup_session_add_feature_by_type(soupSessionPointer, featureType)

    /**
     * Get the value used by @session for the "Accept-Language" header on new
     * requests.
     *
     * @return the accept language string
     */
    public open fun getAcceptLanguage(): String? = soup_session_get_accept_language(soupSessionPointer)?.toKString()

    /**
     * Gets the [class@Message] of the @result asynchronous operation This is useful
     * to get the [class@Message] of an asynchronous operation started by @session
     * from its [callback@Gio.AsyncReadyCallback].
     *
     * @param result the #GAsyncResult passed to your callback
     * @return a #SoupMessage or
     *   null if @result is not a valid @session async operation result.
     */
    public open fun getAsyncResultMessage(result: AsyncResult): Message? =
        soup_session_get_async_result_message(soupSessionPointer, result.gioAsyncResultPointer)?.run {
            Message(this)
        }

    /**
     * Gets the feature in @session of type @feature_type.
     *
     * @param featureType the #GType of the feature to get
     * @return a #SoupSessionFeature, or null. The
     *   feature is owned by @session.
     */
    public open fun getFeature(featureType: GType): SessionFeature? =
        soup_session_get_feature(soupSessionPointer, featureType)?.run {
            SessionFeature.wrap(reinterpret())
        }

    /**
     * Gets the feature in @session of type @feature_type, provided
     * that it is not disabled for @msg.
     *
     * @param featureType the #GType of the feature to get
     * @param msg a #SoupMessage
     * @return a #SoupSessionFeature. The feature is
     *   owned by @session.
     */
    public open fun getFeatureForMessage(featureType: GType, msg: Message): SessionFeature? =
        soup_session_get_feature_for_message(soupSessionPointer, featureType, msg.soupMessagePointer)?.run {
            SessionFeature.wrap(reinterpret())
        }

    /**
     * Get the value used by @session for the "User-Agent" header on new requests.
     *
     * @return the user agent string
     */
    public open fun getUserAgent(): String? = soup_session_get_user_agent(soupSessionPointer)?.toKString()

    /**
     * Tests if @session has at a feature of type @feature_type (which can
     * be the type of either a [iface@SessionFeature], or else a subtype of
     * some class managed by another feature, such as [class@Auth]).
     *
     * @param featureType the #GType of the class of features to check for
     * @return true or false
     */
    public open fun hasFeature(featureType: GType): Boolean =
        soup_session_has_feature(soupSessionPointer, featureType).asBoolean()

    /**
     * Start a preconnection to @msg.
     *
     * Once the connection is done, it will remain in idle state so that it can be
     * reused by future requests. If there's already an idle connection for the
     * given @msg host, the operation finishes successfully without creating a new
     * connection. If a new request for the given @msg host is made while the
     * preconnect is still ongoing, the request will take the ownership of the
     * connection and the preconnect operation will finish successfully (if there's
     * a connection error it will be handled by the request).
     *
     * The operation finishes when the connection is done or an error occurred.
     *
     * @param msg a #SoupMessage
     * @param ioPriority the I/O priority of the request
     * @param cancellable a #GCancellable
     * @param callback the callback to invoke when the operation finishes
     */
    public open fun preconnectAsync(
        msg: Message,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = soup_session_preconnect_async(
        soupSessionPointer,
        msg.soupMessagePointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Complete a preconnect async operation started with [method@Session.preconnect_async].
     *
     * @param result the #GAsyncResult passed to your callback
     * @return true if the preconnect succeeded, or false in case of error.
     */
    public open fun preconnectFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_preconnect_finish(
            soupSessionPointer,
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
     * Removes @feature's functionality from @session.
     *
     * @param feature a feature that has previously been added to @session
     */
    public open fun removeFeature(feature: SessionFeature): Unit =
        soup_session_remove_feature(soupSessionPointer, feature.soupSessionFeaturePointer)

    /**
     * Removes all features of type @feature_type (or any subclass of
     * @feature_type) from @session.
     *
     * @param featureType a #GType
     */
    public open fun removeFeatureByType(featureType: GType): Unit =
        soup_session_remove_feature_by_type(soupSessionPointer, featureType)

    /**
     * Synchronously sends @msg and waits for the beginning of a response.
     *
     * On success, a [class@Gio.InputStream] will be returned which you can use to
     * read the response body. ("Success" here means only that an HTTP
     * response was received and understood; it does not necessarily mean
     * that a 2xx class status code was received.)
     *
     * If non-null, @cancellable can be used to cancel the request;
     * [method@Session.send] will return a %G_IO_ERROR_CANCELLED error. Note that
     * with requests that have side effects (eg, `POST`, `PUT`, `DELETE`) it is
     * possible that you might cancel the request after the server acts on it, but
     * before it returns a response, leaving the remote resource in an unknown
     * state.
     *
     * If @msg is requeued due to a redirect or authentication, the
     * initial (`3xx/401/407`) response body will be suppressed, and
     * [method@Session.send] will only return once a final response has been
     * received.
     *
     * @param msg a #SoupMessage
     * @param cancellable a #GCancellable
     * @return a #GInputStream for reading the
     *   response body, or null on error.
     */
    public open fun send(msg: Message, cancellable: Cancellable? = null): Result<InputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_send(
            soupSessionPointer,
            msg.soupMessagePointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            InputStream(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously sends @msg and reads the response body.
     *
     * On success, a [struct@GLib.Bytes] will be returned with the response body.
     * This function should only be used when the resource to be retrieved
     * is not too long and can be stored in memory.
     *
     * See [method@Session.send] for more details on the general semantics.
     *
     * @param msg a #SoupMessage
     * @param cancellable a #GCancellable
     * @return a #GBytes, or null on error.
     */
    public open fun sendAndRead(msg: Message, cancellable: Cancellable? = null): Result<Bytes> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_send_and_read(
            soupSessionPointer,
            msg.soupMessagePointer,
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
     * Asynchronously sends @msg and reads the response body.
     *
     * When @callback is called, then either @msg has been sent, and its response
     * body read, or else an error has occurred. This function should only be used
     * when the resource to be retrieved is not too long and can be stored in
     * memory. Call [method@Session.send_and_read_finish] to get a
     * [struct@GLib.Bytes] with the response body.
     *
     * See [method@Session.send] for more details on the general semantics.
     *
     * @param msg a #SoupMessage
     * @param ioPriority the I/O priority of the request
     * @param cancellable a #GCancellable
     * @param callback the callback to invoke
     */
    public open fun sendAndReadAsync(
        msg: Message,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = soup_session_send_and_read_async(
        soupSessionPointer,
        msg.soupMessagePointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Gets the response to a [method@Session.send_and_read_async].
     *
     * If successful, returns a [struct@GLib.Bytes] with the response body.
     *
     * @param result the #GAsyncResult passed to your callback
     * @return a #GBytes, or null on error.
     */
    public open fun sendAndReadFinish(result: AsyncResult): Result<Bytes> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_send_and_read_finish(
            soupSessionPointer,
            result.gioAsyncResultPointer,
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
     * Synchronously sends @msg and splices the response body stream into @out_stream.
     *
     * See [method@Session.send] for more details on the general semantics.
     *
     * @param msg a #SoupMessage
     * @param outStream a #GOutputStream
     * @param flags a set of #GOutputStreamSpliceFlags
     * @param cancellable a #GCancellable
     * @return a #gssize containing the size of the data spliced, or -1 if an error occurred.
     * @since 3.4
     */
    @SoupVersion3_4
    public open fun sendAndSplice(
        msg: Message,
        outStream: OutputStream,
        flags: OutputStreamSpliceFlags,
        cancellable: Cancellable? = null,
    ): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            soup_session_send_and_splice(
                soupSessionPointer,
                msg.soupMessagePointer,
                outStream.gioOutputStreamPointer,
                flags.mask,
                cancellable?.gioCancellablePointer,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously sends @msg and splices the response body stream into @out_stream.
     * When @callback is called, then either @msg has been sent and its response body
     * spliced, or else an error has occurred.
     *
     * See [method@Session.send] for more details on the general semantics.
     *
     * @param msg a #SoupMessage
     * @param outStream a #GOutputStream
     * @param flags a set of #GOutputStreamSpliceFlags
     * @param ioPriority the I/O priority of the request
     * @param cancellable a #GCancellable
     * @param callback the callback to invoke
     * @since 3.4
     */
    @SoupVersion3_4
    public open fun sendAndSpliceAsync(
        msg: Message,
        outStream: OutputStream,
        flags: OutputStreamSpliceFlags,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = soup_session_send_and_splice_async(
        soupSessionPointer,
        msg.soupMessagePointer,
        outStream.gioOutputStreamPointer,
        flags.mask,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Gets the response to a [method@Session.send_and_splice_async].
     *
     * @param result the #GAsyncResult passed to your callback
     * @return a #gssize containing the size of the data spliced, or -1 if an error occurred.
     * @since 3.4
     */
    @SoupVersion3_4
    public open fun sendAndSpliceFinish(result: AsyncResult): Result<Long> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_send_and_splice_finish(soupSessionPointer, result.gioAsyncResultPointer, gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously sends @msg and waits for the beginning of a response.
     *
     * When @callback is called, then either @msg has been sent, and its response
     * headers received, or else an error has occurred. Call
     * [method@Session.send_finish] to get a [class@Gio.InputStream] for reading the
     * response body.
     *
     * See [method@Session.send] for more details on the general semantics.
     *
     * @param msg a #SoupMessage
     * @param ioPriority the I/O priority of the request
     * @param cancellable a #GCancellable
     * @param callback the callback to invoke
     */
    public open fun sendAsync(
        msg: Message,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = soup_session_send_async(
        soupSessionPointer,
        msg.soupMessagePointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Gets the response to a [method@Session.send_async] call.
     *
     * If successful returns a [class@Gio.InputStream] that can be used to read the
     * response body.
     *
     * @param result the #GAsyncResult passed to your callback
     * @return a #GInputStream for reading the
     *   response body, or null on error.
     */
    public open fun sendFinish(result: AsyncResult): Result<InputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_send_finish(soupSessionPointer, result.gioAsyncResultPointer, gError.ptr)?.run {
            InputStream(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Set the value to use for the "Accept-Language" header on [class@Message]s
     * sent from @session.
     *
     * If @accept_language is null then no "Accept-Language" will be included in
     * requests. See [property@Session:accept-language] for more information.
     *
     * @param acceptLanguage the languages string
     */
    public open fun setAcceptLanguage(acceptLanguage: String): Unit =
        soup_session_set_accept_language(soupSessionPointer, acceptLanguage)

    /**
     * Set the value to use for the "User-Agent" header on [class@Message]s sent
     * from @session.
     *
     * If @user_agent has trailing whitespace, @session will append its own product
     * token (eg, `libsoup/3.0.0`) to the end of the header for you. If @user_agent
     * is null then no "User-Agent" will be included in requests. See
     * [property@Session:user-agent] for more information.
     *
     * @param userAgent the user agent string
     */
    public open fun setUserAgent(userAgent: String): Unit = soup_session_set_user_agent(soupSessionPointer, userAgent)

    /**
     * Asynchronously creates a [class@WebsocketConnection] to communicate with a
     * remote server.
     *
     * All necessary WebSocket-related headers will be added to @msg, and
     * it will then be sent and asynchronously processed normally
     * (including handling of redirection and HTTP authentication).
     *
     * If the server returns "101 Switching Protocols", then @msg's status
     * code and response headers will be updated, and then the WebSocket
     * handshake will be completed. On success,
     * [method@Session.websocket_connect_finish] will return a new
     * [class@WebsocketConnection]. On failure it will return a #GError.
     *
     * If the server returns a status other than "101 Switching Protocols", then
     * @msg will contain the complete response headers and body from the server's
     * response, and [method@Session.websocket_connect_finish] will return
     * %SOUP_WEBSOCKET_ERROR_NOT_WEBSOCKET.
     *
     * @param msg #SoupMessage indicating the WebSocket server to connect to
     * @param origin origin of the connection
     * @param protocols a
     *   null-terminated array of protocols supported
     * @param ioPriority the I/O priority of the request
     * @param cancellable a #GCancellable
     * @param callback the callback to invoke
     */
    public open fun websocketConnectAsync(
        msg: Message,
        origin: String? = null,
        protocols: List<String>? = null,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = memScoped {
        return soup_session_websocket_connect_async(
            soupSessionPointer,
            msg.soupMessagePointer,
            origin,
            protocols?.toCStringList(this),
            ioPriority,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )
    }

    /**
     * Gets the [class@WebsocketConnection] response to a
     * [method@Session.websocket_connect_async] call.
     *
     * If successful, returns a [class@WebsocketConnection] that can be used to
     * communicate with the server.
     *
     * @param result the #GAsyncResult passed to your callback
     * @return a new #SoupWebsocketConnection, or
     *   null on error.
     */
    public open fun websocketConnectFinish(result: AsyncResult): Result<WebsocketConnection> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_session_websocket_connect_finish(
            soupSessionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            WebsocketConnection(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Emitted when a request is queued on @session.
     *
     * When sending a request, first [signal@Session::request-queued]
     * is emitted, indicating that the session has become aware of
     * the request.
     *
     * After a connection is available to send the request various
     * [class@Message] signals are emitted as the message is
     * processed. If the message is requeued, it will emit
     * [signal@Message::restarted], which will then be followed by other
     * [class@Message] signals when the message is re-sent.
     *
     * Eventually, the message will emit [signal@Message::finished].
     * Normally, this signals the completion of message
     * processing. However, it is possible that the application
     * will requeue the message from the "finished" handler.
     * In that case the process will loop back.
     *
     * Eventually, a message will reach "finished" and not be
     * requeued. At that point, the session will emit
     * [signal@Session::request-unqueued] to indicate that it is done
     * with the message.
     *
     * To sum up: [signal@Session::request-queued] and
     * [signal@Session::request-unqueued] are guaranteed to be emitted
     * exactly once, but [signal@Message::finished] (and all of the other
     * [class@Message] signals) may be invoked multiple times for a given
     * message.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `msg` the request that was queued
     */
    public fun onRequestQueued(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (msg: Message) -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "request-queued",
            onRequestQueuedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "request-queued" signal. See [onRequestQueued].
     *
     * @param msg the request that was queued
     */
    public fun emitRequestQueued(msg: Message) {
        g_signal_emit_by_name(gPointer.reinterpret(), "request-queued", msg.soupMessagePointer)
    }

    /**
     * Emitted when a request is removed from @session's queue,
     * indicating that @session is done with it.
     *
     * See [signal@Session::request-queued] for a detailed description of
     * the message lifecycle within a session.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `msg` the request that was unqueued
     */
    public fun onRequestUnqueued(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (msg: Message) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "request-unqueued",
        onRequestUnqueuedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "request-unqueued" signal. See [onRequestUnqueued].
     *
     * @param msg the request that was unqueued
     */
    public fun emitRequestUnqueued(msg: Message) {
        g_signal_emit_by_name(gPointer.reinterpret(), "request-unqueued", msg.soupMessagePointer)
    }

    public companion object : TypeCompanion<Session> {
        override val type: GeneratedClassKGType<Session> =
            GeneratedClassKGType(soup_session_get_type()) { Session(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of Session
         *
         * @return the GType
         */
        public fun getType(): GType = soup_session_get_type()
    }
}

private val onRequestQueuedFunc: CPointer<CFunction<(CPointer<SoupMessage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            msg: CPointer<SoupMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(msg: Message) -> Unit>().get().invoke(
            msg!!.run {
                Message(this)
            }
        )
    }
        .reinterpret()

private val onRequestUnqueuedFunc: CPointer<CFunction<(CPointer<SoupMessage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            msg: CPointer<SoupMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(msg: Message) -> Unit>().get().invoke(
            msg!!.run {
                Message(this)
            }
        )
    }
        .reinterpret()
