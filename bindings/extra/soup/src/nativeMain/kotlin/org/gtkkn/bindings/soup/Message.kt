// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gio.IoStream
import org.gtkkn.bindings.gio.SocketAddress
import org.gtkkn.bindings.gio.SocketClientEvent
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.gio.TlsCertificateFlags
import org.gtkkn.bindings.gio.TlsClientConnection
import org.gtkkn.bindings.gio.TlsPassword
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.Callback
import org.gtkkn.bindings.gobject.CallbackFunc
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.annotations.SoupVersion3_4
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GIOStream
import org.gtkkn.native.gio.GSocketClientEvent
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.gio.GTlsClientConnection
import org.gtkkn.native.gio.GTlsPassword
import org.gtkkn.native.glib.GHashTable
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gobject.guint64
import org.gtkkn.native.soup.SoupAuth
import org.gtkkn.native.soup.SoupMessage
import org.gtkkn.native.soup.soup_message_add_flags
import org.gtkkn.native.soup.soup_message_add_header_handler
import org.gtkkn.native.soup.soup_message_add_status_code_handler
import org.gtkkn.native.soup.soup_message_disable_feature
import org.gtkkn.native.soup.soup_message_get_connection_id
import org.gtkkn.native.soup.soup_message_get_first_party
import org.gtkkn.native.soup.soup_message_get_flags
import org.gtkkn.native.soup.soup_message_get_force_http1
import org.gtkkn.native.soup.soup_message_get_http_version
import org.gtkkn.native.soup.soup_message_get_is_options_ping
import org.gtkkn.native.soup.soup_message_get_is_top_level_navigation
import org.gtkkn.native.soup.soup_message_get_method
import org.gtkkn.native.soup.soup_message_get_metrics
import org.gtkkn.native.soup.soup_message_get_priority
import org.gtkkn.native.soup.soup_message_get_reason_phrase
import org.gtkkn.native.soup.soup_message_get_remote_address
import org.gtkkn.native.soup.soup_message_get_request_headers
import org.gtkkn.native.soup.soup_message_get_response_headers
import org.gtkkn.native.soup.soup_message_get_site_for_cookies
import org.gtkkn.native.soup.soup_message_get_status
import org.gtkkn.native.soup.soup_message_get_tls_ciphersuite_name
import org.gtkkn.native.soup.soup_message_get_tls_peer_certificate
import org.gtkkn.native.soup.soup_message_get_tls_peer_certificate_errors
import org.gtkkn.native.soup.soup_message_get_tls_protocol_version
import org.gtkkn.native.soup.soup_message_get_type
import org.gtkkn.native.soup.soup_message_get_uri
import org.gtkkn.native.soup.soup_message_is_feature_disabled
import org.gtkkn.native.soup.soup_message_is_keepalive
import org.gtkkn.native.soup.soup_message_new
import org.gtkkn.native.soup.soup_message_new_from_encoded_form
import org.gtkkn.native.soup.soup_message_new_from_multipart
import org.gtkkn.native.soup.soup_message_new_from_uri
import org.gtkkn.native.soup.soup_message_new_options_ping
import org.gtkkn.native.soup.soup_message_query_flags
import org.gtkkn.native.soup.soup_message_remove_flags
import org.gtkkn.native.soup.soup_message_set_first_party
import org.gtkkn.native.soup.soup_message_set_flags
import org.gtkkn.native.soup.soup_message_set_force_http1
import org.gtkkn.native.soup.soup_message_set_is_options_ping
import org.gtkkn.native.soup.soup_message_set_is_top_level_navigation
import org.gtkkn.native.soup.soup_message_set_method
import org.gtkkn.native.soup.soup_message_set_priority
import org.gtkkn.native.soup.soup_message_set_request_body
import org.gtkkn.native.soup.soup_message_set_request_body_from_bytes
import org.gtkkn.native.soup.soup_message_set_site_for_cookies
import org.gtkkn.native.soup.soup_message_set_tls_client_certificate
import org.gtkkn.native.soup.soup_message_set_uri
import org.gtkkn.native.soup.soup_message_tls_client_certificate_password_request_complete
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Represents an HTTP message being sent or received.
 *
 * A #SoupMessage represents an HTTP message that is being sent or
 * received.
 *
 * You would create a #SoupMessage with [ctor@Message.new] or
 * [ctor@Message.new_from_uri], set up its fields appropriately, and send it.
 *
 * [property@Message:status-code] will normally be a [enum@Status] value, eg,
 * %SOUP_STATUS_OK, though of course it might actually be an unknown status
 * code. [property@Message:reason-phrase] is the actual text returned from the
 * server, which may or may not correspond to the "standard" description of
 * @status_code. At any rate, it is almost certainly not localized, and not very
 * descriptive even if it is in the user's language; you should not use
 * [property@Message:reason-phrase] in user-visible messages. Rather, you should
 * look at [property@Message:status-code], and determine an end-user-appropriate
 * message based on that and on what you were trying to do.
 *
 * Note that libsoup's terminology here does not quite match the HTTP
 * specification: in RFC 2616, an "HTTP-message" is *either* a Request, *or* a
 * Response. In libsoup, a #SoupMessage combines both the request and the
 * response.
 *
 * ## Skipped during bindings generation
 *
 * - method `site-for-cookies`: Property TypeInfo of getter and setter do not match
 * - method `status-code`: Property has no getter nor setter
 */
public class Message(pointer: CPointer<SoupMessage>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val soupMessagePointer: CPointer<SoupMessage>
        get() = gPointer.reinterpret()

    /**
     * The [struct@GLib.Uri] loaded in the application when the message was
     * queued.
     */
    public var firstParty: Uri
        /**
         * Gets @msg's first-party [struct@GLib.Uri].
         *
         * @return the @msg's first party #GUri
         */
        get() = soup_message_get_first_party(soupMessagePointer.reinterpret())!!.run {
            Uri(reinterpret())
        }

        /**
         * Sets @first_party as the main document #GUri for @msg.
         *
         * For details of when and how this is used refer to the documentation for
         * [enum@CookieJarAcceptPolicy].
         *
         * @param firstParty the #GUri for the @msg's first party
         */
        set(
            firstParty
        ) = soup_message_set_first_party(soupMessagePointer.reinterpret(), firstParty.glibUriPointer.reinterpret())

    /**
     * Various message options.
     */
    public var flags: MessageFlags
        /**
         * Gets the flags on @msg.
         *
         * @return the flags
         */
        get() = soup_message_get_flags(soupMessagePointer.reinterpret()).run {
            MessageFlags(this)
        }

        /**
         * Sets the specified flags on @msg.
         *
         * @param flags a set of #SoupMessageFlags values
         */
        set(flags) = soup_message_set_flags(soupMessagePointer.reinterpret(), flags.mask)

    /**
     * The HTTP protocol version to use.
     */
    public val httpVersion: HttpVersion
        /**
         * Gets the HTTP version of @msg.
         *
         * This is the minimum of the version from the request and the version from the
         * response.
         *
         * @return the HTTP version
         */
        get() = soup_message_get_http_version(soupMessagePointer.reinterpret()).run {
            HttpVersion.fromNativeValue(this)
        }

    /**
     * Whether the message is an OPTIONS ping.
     *
     * The #SoupMessage is intended to be used to send
     * `OPTIONS *` to a server. When set to true, the
     * path of [property@Message:uri] will be ignored and
     * [property@Message:method] set to %SOUP_METHOD_OPTIONS.
     */
    public var isOptionsPing: Boolean
        /**
         * Gets whether @msg is intended to be used to send `OPTIONS *` to a server.
         *
         * @return true if the message is options ping, or false otherwise
         */
        get() = soup_message_get_is_options_ping(soupMessagePointer.reinterpret()).asBoolean()

        /**
         * Set whether @msg is intended to be used to send `OPTIONS *` to a server.
         *
         * When set to true, the path of [property@Message:uri] will be ignored and
         * [property@Message:method] set to %SOUP_METHOD_OPTIONS.
         *
         * @param isOptionsPing the value to set
         */
        set(
            isOptionsPing
        ) = soup_message_set_is_options_ping(soupMessagePointer.reinterpret(), isOptionsPing.asGBoolean())

    /**
     * Set when the message is navigating between top level domains.
     */
    public var isTopLevelNavigation: Boolean
        /**
         * Returns if this message is set as a top level navigation.
         *
         * Used for same-site policy checks.
         *
         * @return Whether the current request is a top-level navitation
         */
        get() = soup_message_get_is_top_level_navigation(soupMessagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the current request is a top-level navitation.
         *
         * See the [same-site spec](https://tools.ietf.org/html/draft-ietf-httpbis-cookie-same-site-00)
         * for more information.
         *
         * @param isTopLevelNavigation if true indicate the current request is a top-level navigation
         */
        set(
            isTopLevelNavigation
        ) = soup_message_set_is_top_level_navigation(
            soupMessagePointer.reinterpret(),
            isTopLevelNavigation.asGBoolean()
        )

    /**
     * The message's HTTP method.
     */
    public var method: String
        /**
         * Returns the method of this message.
         *
         * @return A method such as %SOUP_METHOD_GET
         */
        get() = soup_message_get_method(soupMessagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

        /**
         * Set @msg's HTTP method to @method.
         *
         * @param method the value to set
         */
        set(method) = soup_message_set_method(soupMessagePointer.reinterpret(), method)

    /**
     * Sets the priority of the #SoupMessage. See
     * [method@Message.set_priority] for further details.
     */
    public var priority: MessagePriority
        /**
         * Retrieves the [enum@MessagePriority].
         *
         * If not set this value defaults to #SOUP_MESSAGE_PRIORITY_NORMAL.
         *
         * @return the priority of the message.
         */
        get() = soup_message_get_priority(soupMessagePointer.reinterpret()).run {
            MessagePriority.fromNativeValue(this)
        }

        /**
         * Sets the priority of a message.
         *
         * Note that this won't have any effect unless used before the message is added
         * to the session's message processing queue.
         *
         * The message will be placed just before any other previously added
         * message with lower priority (messages with the same priority are
         * processed on a FIFO basis).
         *
         * Setting priorities does not currently work with synchronous messages
         * because in the synchronous/blocking case, priority ends up being determined
         * semi-randomly by thread scheduling.
         *
         * @param priority the #SoupMessagePriority
         */
        set(priority) = soup_message_set_priority(soupMessagePointer.reinterpret(), priority.nativeValue)

    /**
     * The HTTP response reason phrase.
     */
    public val reasonPhrase: String?
        /**
         * Returns the reason phrase for the status of this message.
         *
         * @return the phrase
         */
        get() = soup_message_get_reason_phrase(soupMessagePointer.reinterpret())?.toKString()

    /**
     * The remote [class@Gio.SocketAddress] of the connection associated
     * with the message.
     */
    public val remoteAddress: SocketAddress?
        /**
         * Get the remote [class@Gio.SocketAddress] of the connection associated with
         * the message.
         *
         * The returned address can be null if the connection hasn't been established
         * yet, or the resource was loaded from the disk cache. In case of proxy
         * connections, the remote address returned is a [class@Gio.ProxyAddress]. If
         * [property@Session:remote-connectable] is set the returned address id for the
         * connection to the session's remote connectable.
         *
         * @return a #GSocketAddress or null if the connection
         *     hasn't been established
         */
        get() = soup_message_get_remote_address(soupMessagePointer.reinterpret())?.run {
            SocketAddress(reinterpret())
        }

    /**
     * The HTTP request headers.
     */
    public val requestHeaders: MessageHeaders
        /**
         * Returns the headers sent with the request.
         *
         * @return The #SoupMessageHeaders
         */
        get() = soup_message_get_request_headers(soupMessagePointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
        }

    /**
     * The HTTP response headers.
     */
    public val responseHeaders: MessageHeaders
        /**
         * Returns the headers recieved with the response.
         *
         * @return The #SoupMessageHeaders
         */
        get() = soup_message_get_response_headers(soupMessagePointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
        }

    /**
     * The Name of TLS ciphersuite negotiated for this message connection.
     */
    public val tlsCiphersuiteName: String
        /**
         * Gets the name of the TLS ciphersuite negotiated for @msg's connection.
         *
         * @return the name of the TLS ciphersuite,
         *   or null if @msg's connection is not SSL.
         */
        get() = soup_message_get_tls_ciphersuite_name(soupMessagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The peer's [class@Gio.TlsCertificate] associated with the message.
     */
    public val tlsPeerCertificate: TlsCertificate?
        /**
         * Gets the peer's [class@Gio.TlsCertificate] associated with @msg's connection.
         *
         * Note that this is not set yet during the emission of
         * [signal@Message::accept-certificate] signal.
         *
         * @return @msg's TLS peer certificate,
         *   or null if @msg's connection is not SSL.
         */
        get() = soup_message_get_tls_peer_certificate(soupMessagePointer.reinterpret())?.run {
            TlsCertificate(reinterpret())
        }

    /**
     * The verification errors on [property@Message:tls-peer-certificate].
     */
    public val tlsPeerCertificateErrors: TlsCertificateFlags
        /**
         * Gets the errors associated with validating @msg's TLS peer certificate.
         * Note that this is not set yet during the emission of
         * [signal@Message::accept-certificate] signal.
         *
         * @return a #GTlsCertificateFlags with @msg's TLS peer certificate errors.
         */
        get() = soup_message_get_tls_peer_certificate_errors(soupMessagePointer.reinterpret()).run {
            TlsCertificateFlags(this)
        }

    /**
     * The TLS protocol version negotiated for the message connection.
     */
    public val tlsProtocolVersion: guint
        /**
         * Gets the TLS protocol version negotiated for @msg's connection.
         *
         * If the message connection is not SSL, %G_TLS_PROTOCOL_VERSION_UNKNOWN is returned.
         *
         * @return a #GTlsProtocolVersion
         */
        get() = soup_message_get_tls_protocol_version(soupMessagePointer.reinterpret())

    /**
     * The message's Request-URI.
     */
    public var uri: Uri
        /**
         * Gets @msg's URI.
         *
         * @return the URI @msg is targeted for.
         */
        get() = soup_message_get_uri(soupMessagePointer.reinterpret())!!.run {
            Uri(reinterpret())
        }

        /**
         * Sets @msg's URI to @uri.
         *
         * If @msg has already been sent and you want to re-send it with the new URI,
         * you need to send it again.
         *
         * @param uri the new #GUri
         */
        set(uri) = soup_message_set_uri(soupMessagePointer.reinterpret(), uri.glibUriPointer.reinterpret())

    /**
     * Creates a new empty #SoupMessage, which will connect to @uri.
     *
     * @param method the HTTP method for the created request
     * @param uriString the destination endpoint (as a string)
     * @return the new #SoupMessage (or null if @uri
     *   could not be parsed).
     */
    public constructor(method: String, uriString: String) : this(soup_message_new(method, uriString)!!.reinterpret())

    /**
     * Creates a new #SoupMessage and sets it up to send the given @encoded_form
     * to @uri via @method. If @method is "GET", it will include the form data
     * into @uri's query field, and if @method is "POST" or "PUT", it will be set as
     * request body.
     *
     * This function takes the ownership of @encoded_form, that will be released
     * with [func@GLib.free] when no longer in use. See also [func@form_encode],
     * [func@form_encode_hash] and [func@form_encode_datalist].
     *
     * @param method the HTTP method for the created request (GET, POST or PUT)
     * @param uriString the destination endpoint (as a string)
     * @param encodedForm a encoded form
     * @return the new #SoupMessage, or null if
     *   @uri_string could not be parsed or @method is not "GET, "POST" or "PUT"
     */
    public constructor(
        method: String,
        uriString: String,
        encodedForm: String,
    ) : this(soup_message_new_from_encoded_form(method, uriString, encodedForm.cstr)!!.reinterpret())

    /**
     * Creates a new #SoupMessage and sets it up to send @multipart to
     * @uri_string via POST.
     *
     * @param uriString the destination endpoint
     * @param multipart a #SoupMultipart
     * @return the new #SoupMessage, or null if @uri_string
     *   could not be parsed
     */
    public constructor(
        uriString: String,
        multipart: Multipart,
    ) : this(soup_message_new_from_multipart(uriString, multipart.soupMultipartPointer.reinterpret())!!.reinterpret())

    /**
     * Creates a new empty #SoupMessage, which will connect to @uri.
     *
     * @param method the HTTP method for the created request
     * @param uri the destination endpoint
     * @return the new #SoupMessage
     */
    public constructor(
        method: String,
        uri: Uri,
    ) : this(soup_message_new_from_uri(method, uri.glibUriPointer.reinterpret())!!.reinterpret())

    /**
     * Creates a new #SoupMessage to send `OPTIONS *` to a server. The path of
     * @base_uri will be ignored.
     *
     * @param baseUri the destination endpoint
     * @return the new #SoupMessage
     */
    public constructor(
        baseUri: Uri,
    ) : this(soup_message_new_options_ping(baseUri.glibUriPointer.reinterpret())!!.reinterpret())

    /**
     * Adds @flags to the set of @msg's flags.
     *
     * @param flags a set of #SoupMessageFlags values
     */
    public fun addFlags(flags: MessageFlags): Unit =
        soup_message_add_flags(soupMessagePointer.reinterpret(), flags.mask)

    /**
     * Adds a signal handler to @msg for @signal.
     *
     * Similar to [func@GObject.signal_connect], but the @callback will only be run
     * if @msg's incoming messages headers (that is, the `request_headers`) contain
     * a header named @header.
     *
     * @param signal signal to connect the handler to.
     * @param header HTTP response header to match against
     * @param callback the header handler
     * @return the handler ID from [func@GObject.signal_connect]
     */
    public fun addHeaderHandler(signal: String, `header`: String, callback: Callback): guint =
        soup_message_add_header_handler(
            soupMessagePointer.reinterpret(),
            signal,
            `header`,
            CallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Adds a signal handler to @msg for @signal.
     *
     * Similar to [func@GObject.signal_connect], but the @callback will only be run
     * if @msg has the status @status_code.
     *
     * @signal must be a signal that will be emitted after @msg's status
     * is set (this means it can't be a "wrote" signal).
     *
     * @param signal signal to connect the handler to.
     * @param statusCode status code to match against
     * @param callback the header handler
     * @return the handler ID from [func@GObject.signal_connect]
     */
    public fun addStatusCodeHandler(signal: String, statusCode: guint, callback: Callback): guint =
        soup_message_add_status_code_handler(
            soupMessagePointer.reinterpret(),
            signal,
            statusCode,
            CallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Disables the actions of [iface@SessionFeature]s with the
     * given @feature_type (or a subclass of that type) on @msg.
     *
     * @msg is processed as though the feature(s) hadn't been added to the
     * session. Eg, passing #SOUP_TYPE_CONTENT_SNIFFER for @feature_type
     * will disable Content-Type sniffing on the message.
     *
     * You must call this before queueing @msg on a session; calling it on
     * a message that has already been queued is undefined. In particular,
     * you cannot call this on a message that is being requeued after a
     * redirect or authentication.
     *
     * @param featureType the #GType of a #SoupSessionFeature
     */
    public fun disableFeature(featureType: GType): Unit =
        soup_message_disable_feature(soupMessagePointer.reinterpret(), featureType)

    /**
     * Returns the unique idenfier for the last connection used.
     *
     * This may be 0 if it was a cached resource or it has not gotten
     * a connection yet.
     *
     * @return An id or 0 if no connection.
     */
    public fun getConnectionId(): guint64 = soup_message_get_connection_id(soupMessagePointer.reinterpret())

    /**
     * Returns whether HTTP/1 version is currently demanded for the @msg send.
     *
     * @return true, when HTTP/1 is demanded, false otherwise.
     * @since 3.4
     */
    @SoupVersion3_4
    public fun getForceHttp1(): Boolean = soup_message_get_force_http1(soupMessagePointer.reinterpret()).asBoolean()

    /**
     * Get the [struct@MessageMetrics] of @msg.
     *
     * If the flag %SOUP_MESSAGE_COLLECT_METRICS is not enabled for @msg this will
     * return null.
     *
     * @return a #SoupMessageMetrics
     */
    public fun getMetrics(): MessageMetrics? = soup_message_get_metrics(soupMessagePointer.reinterpret())?.run {
        MessageMetrics(reinterpret())
    }

    /**
     * Gets @msg's site for cookies #GUri.
     *
     * @return the @msg's site for cookies #GUri
     */
    public fun getSiteForCookies(): Uri = soup_message_get_site_for_cookies(soupMessagePointer.reinterpret())!!.run {
        Uri(reinterpret())
    }

    /**
     * Returns the set status of this message.
     *
     * @return The #SoupStatus
     */
    public fun getStatus(): Status = soup_message_get_status(soupMessagePointer.reinterpret()).run {
        Status.fromNativeValue(this)
    }

    /**
     * Get whether [iface@SessionFeature]s of the given @feature_type
     * (or a subclass of that type) are disabled on @msg.
     *
     * See [method@Message.disable_feature].
     *
     * @param featureType the #GType of a #SoupSessionFeature
     * @return true if feature is disabled, or false otherwise.
     */
    public fun isFeatureDisabled(featureType: GType): Boolean =
        soup_message_is_feature_disabled(soupMessagePointer.reinterpret(), featureType).asBoolean()

    /**
     * Determines whether or not @msg's connection can be kept alive for
     * further requests after processing @msg.
     *
     * The result is based on the HTTP version, Connection header, etc.
     *
     * @return true or false.
     */
    public fun isKeepalive(): Boolean = soup_message_is_keepalive(soupMessagePointer.reinterpret()).asBoolean()

    /**
     * Queries if @flags are present in the set of @msg's flags.
     *
     * @param flags a set of #SoupMessageFlags values
     * @return true if @flags are enabled in @msg
     */
    public fun queryFlags(flags: MessageFlags): Boolean =
        soup_message_query_flags(soupMessagePointer.reinterpret(), flags.mask).asBoolean()

    /**
     * Removes @flags from the set of @msg's flags.
     *
     * @param flags a set of #SoupMessageFlags values
     */
    public fun removeFlags(flags: MessageFlags): Unit =
        soup_message_remove_flags(soupMessagePointer.reinterpret(), flags.mask)

    /**
     * Sets whether HTTP/1 version should be used when sending this message.
     * Some connections can still override it, if needed.
     *
     * Note the value is unset after the message send is finished.
     *
     * @param value value to set
     * @since 3.4
     */
    @SoupVersion3_4
    public fun setForceHttp1(`value`: Boolean): Unit =
        soup_message_set_force_http1(soupMessagePointer.reinterpret(), `value`.asGBoolean())

    /**
     * Set the request body of a #SoupMessage.
     *
     * If @content_type is null and @stream is not null the Content-Type header will
     * not be changed if present.
     * The request body needs to be set again in case @msg is restarted
     * (in case of redirection or authentication).
     *
     * @param contentType MIME Content-Type of the body, or null if unknown
     * @param stream a #GInputStream to read the request body from
     * @param contentLength the byte length of @stream or -1 if unknown
     */
    public fun setRequestBody(contentType: String? = null, stream: InputStream? = null, contentLength: Long): Unit =
        soup_message_set_request_body(
            soupMessagePointer.reinterpret(),
            contentType,
            stream?.gioInputStreamPointer?.reinterpret(),
            contentLength
        )

    /**
     * Set the request body of a #SoupMessage from [struct@GLib.Bytes].
     *
     * If @content_type is null and @bytes is not null the Content-Type header will
     * not be changed if present.
     * The request body needs to be set again in case @msg is restarted
     * (in case of redirection or authentication).
     *
     * @param contentType MIME Content-Type of the body, or null if unknown
     * @param bytes a #GBytes with the request body data
     */
    public fun setRequestBodyFromBytes(contentType: String? = null, bytes: Bytes? = null): Unit =
        soup_message_set_request_body_from_bytes(
            soupMessagePointer.reinterpret(),
            contentType,
            bytes?.glibBytesPointer?.reinterpret()
        )

    /**
     * Sets @site_for_cookies as the policy URL for same-site cookies for @msg.
     *
     * It is either the URL of the top-level document or null depending on whether
     * the registrable domain of this document's URL matches the registrable domain
     * of its parent's/opener's URL. For the top-level document it is set to the
     * document's URL.
     *
     * See the [same-site spec](https://tools.ietf.org/html/draft-ietf-httpbis-cookie-same-site-00)
     * for more information.
     *
     * @param siteForCookies the #GUri for the @msg's site for cookies
     */
    public fun setSiteForCookies(siteForCookies: Uri? = null): Unit = soup_message_set_site_for_cookies(
        soupMessagePointer.reinterpret(),
        siteForCookies?.glibUriPointer?.reinterpret()
    )

    /**
     * Sets the @certificate to be used by @msg's connection when a
     * client certificate is requested during the TLS handshake.
     *
     * You can call this as a response to [signal@Message::request-certificate]
     * signal, or before the connection is started. If @certificate is null
     * the handshake will continue without providing a GTlsCertificate.
     * Note that the [class@Gio.TlsCertificate] set by this function will be ignored if
     * [property@Session:tls-interaction] is not null.
     *
     * @param certificate the #GTlsCertificate to set, or null
     */
    public fun setTlsClientCertificate(certificate: TlsCertificate? = null): Unit =
        soup_message_set_tls_client_certificate(
            soupMessagePointer.reinterpret(),
            certificate?.gioTlsCertificatePointer?.reinterpret()
        )

    /**
     * Completes a certificate password request.
     *
     * You must call this as a response to
     * [signal@Message::request-certificate-password] signal, to notify @msg that
     * the [class@Gio.TlsPassword] has already been updated.
     */
    public fun tlsClientCertificatePasswordRequestComplete(): Unit =
        soup_message_tls_client_certificate_password_request_complete(soupMessagePointer.reinterpret())

    /**
     * Emitted during the @msg's connection TLS handshake
     * after an unacceptable TLS certificate has been received.
     *
     * You can return true to accept @tls_certificate despite
     * @tls_errors.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tlsPeerCertificate` the peer's #GTlsCertificate; `tlsPeerErrors` the tls errors of @tls_certificate. Returns true to accept the TLS certificate and stop other
     *   handlers from being invoked, or false to propagate the
     *   event further.
     */
    public fun connectAcceptCertificate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tlsPeerCertificate: TlsCertificate, tlsPeerErrors: TlsCertificateFlags) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "accept-certificate",
        connectAcceptCertificateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the message requires authentication.
     *
     * If credentials are available call [method@Auth.authenticate] on
     * @auth. If these credentials fail, the signal will be emitted again,
     * with @retrying set to true, which will continue until you return
     * without calling [method@Auth.authenticate] on @auth.
     *
     * Note that this may be emitted before @msg's body has been
     * fully read.
     *
     * You can authenticate @auth asynchronously by calling
     * [method@GObject.Object.ref] on @auth and returning true. The operation will
     * complete once either [method@Auth.authenticate] or
     * [method@Auth.cancel] are called.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `auth` the #SoupAuth to authenticate; `retrying` true if this is the second (or later) attempt. Returns true to stop other handlers from being invoked
     *   or false to propagate the event further.
     */
    public fun connectAuthenticate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (auth: Auth, retrying: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "authenticate",
        connectAuthenticateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted after [signal@Message::got-headers].
     *
     * If content sniffing is disabled, or no content sniffing will be
     * performed, due to the sniffer deciding to trust the
     * Content-Type sent by the server, this signal is emitted
     * immediately after [signal@Message::got-headers], and @type is
     * null.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `type` the content type that we got from sniffing; `params` a #GHashTable with the parameters
     */
    public fun connectContentSniffed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (type: String, params: HashTable) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "content-sniffed",
        connectContentSniffedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when all HTTP processing is finished for a message.
     *
     * (After [signal@Message::got_body]).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "finished",
            connectFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after receiving the complete message response body.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectGotBody(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "got-body",
            connectGotBodyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after reading a portion of the message
     * body from the network.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `chunkSize` the number of bytes read
     * @since 3.4
     */
    @SoupVersion3_4
    public fun connectGotBodyData(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (chunkSize: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "got-body-data",
        connectGotBodyDataFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted after receiving the Status-Line and response headers.
     *
     * See also [method@Message.add_header_handler] and
     * [method@Message.add_status_code_handler], which can be used to
     * connect to a subset of emissions of this signal.
     *
     * If you cancel or requeue @msg while processing this signal,
     * then the current HTTP I/O will be stopped after this signal
     * emission finished, and @msg's connection will be closed.
     * (If you need to requeue a message--eg, after handling
     * authentication or redirection--it is usually better to
     * requeue it from a [signal@Message::got-body] handler rather
     * than a [signal@Message::got_headers] handler, so that the
     * existing HTTP connection can be reused.)
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectGotHeaders(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "got-headers",
            connectGotHeadersFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after receiving a 1xx (Informational) response for
     * a (client-side) message.
     *
     * The response_headers will be filled in with the headers associated
     * with the informational response; however, those header values will be
     * erased after this signal is done.
     *
     * If you cancel or requeue @msg while processing this signal,
     * then the current HTTP I/O will be stopped after this signal
     * emission finished, and @msg's connection will be closed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectGotInformational(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "got-informational",
            connectGotInformationalFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when [class@HSTSEnforcer] has upgraded the protocol
     * for @msg to HTTPS as a result of matching its domain with
     * a HSTS policy.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectHstsEnforced(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "hsts-enforced",
            connectHstsEnforcedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to indicate that some network-related event
     * related to @msg has occurred.
     *
     * This essentially proxies the [signal@Gio.SocketClient::event] signal,
     * but only for events that occur while @msg "owns" the connection; if
     * @msg is sent on an existing persistent connection, then this signal
     * will not be emitted. (If you want to force the message to be sent on
     * a new connection, set the %SOUP_MESSAGE_NEW_CONNECTION flag on it.)
     *
     * See [signal@Gio.SocketClient::event] for more information on what
     * the different values of @event correspond to, and what
     * @connection will be in each case.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` the network event; `connection` the current state of the network connection
     */
    public fun connectNetworkEvent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (event: SocketClientEvent, connection: IoStream) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "network-event",
        connectNetworkEventFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted during the @msg's connection TLS handshake when
     * @tls_connection requests a certificate from the client.
     *
     * You can set the client certificate by calling
     * [method@Message.set_tls_client_certificate] and returning true. It's
     * possible to handle the request asynchornously by returning true and
     * call [method@Message.set_tls_client_certificate] later once the
     * certificate is available. Note that this signal is not emitted if
     * [property@Session:tls-interaction] was set, or if
     * [method@Message.set_tls_client_certificate] was called before the
     * connection TLS handshake started.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tlsConnection` the #GTlsClientConnection. Returns true to handle the request, or false to make the connection
     *   fail with %G_TLS_ERROR_CERTIFICATE_REQUIRED.
     */
    public fun connectRequestCertificate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tlsConnection: TlsClientConnection) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "request-certificate",
        connectRequestCertificateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted during the @msg's connection TLS handshake when
     * @tls_connection requests a certificate password from the client.
     *
     * You can set the certificate password on @password, then call
     * [method@Message.tls_client_certificate_password_request_complete] and
     * return true to handle the signal synchronously. It's possible to
     * handle the request asynchornously by calling
     * [method@GObject.Object.ref] on @password, then returning true and
     * call
     * [method@Message.tls_client_certificate_password_request_complete]
     * later after setting the password on @password. Note that this signal
     * is not emitted if [property@Session:tls-interaction] was set.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tlsPassword` the #GTlsPassword. Returns true to handle the request, or false to make the connection
     *   fail with %G_TLS_ERROR_CERTIFICATE_REQUIRED.
     */
    public fun connectRequestCertificatePassword(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tlsPassword: TlsPassword) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "request-certificate-password",
        connectRequestCertificatePasswordFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a request that was already sent once is now
     * being sent again.
     *
     * e.g. because the first attempt received a
     * redirection response, or because we needed to use
     * authentication.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectRestarted(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "restarted",
            connectRestartedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted just before a message is sent.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectStarting(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "starting",
            connectStartingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted immediately after writing the complete body for a
     * message.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWroteBody(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrote-body",
            connectWroteBodyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted immediately after writing a portion of the message
     * body to the network.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `chunkSize` the number of bytes written
     */
    public fun connectWroteBodyData(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (chunkSize: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "wrote-body-data",
        connectWroteBodyDataFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted immediately after writing the request headers for a
     * message.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWroteHeaders(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrote-headers",
            connectWroteHeadersFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Message> {
        override val type: GeneratedClassKGType<Message> =
            GeneratedClassKGType(soup_message_get_type()) { Message(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of Message
         *
         * @return the GType
         */
        public fun getType(): GType = soup_message_get_type()
    }
}

private val connectAcceptCertificateFunc:
    CPointer<CFunction<(CPointer<GTlsCertificate>, GTlsCertificateFlags) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            tlsPeerCertificate: CPointer<GTlsCertificate>?,
            tlsPeerErrors: GTlsCertificateFlags,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                tlsPeerCertificate: TlsCertificate,
                tlsPeerErrors: TlsCertificateFlags,
            ) -> Boolean
            >().get().invoke(
            tlsPeerCertificate!!.run {
                TlsCertificate(reinterpret())
            },
            tlsPeerErrors.run {
                TlsCertificateFlags(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectAuthenticateFunc: CPointer<CFunction<(CPointer<SoupAuth>, gboolean) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            auth: CPointer<SoupAuth>?,
            retrying: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(auth: Auth, retrying: Boolean) -> Boolean>().get().invoke(
            auth!!.run {
                Auth(reinterpret())
            },
            retrying.asBoolean()
        ).asGBoolean()
    }
        .reinterpret()

private val connectContentSniffedFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<GHashTable>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            type: CPointer<ByteVar>?,
            params: CPointer<GHashTable>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(type: String, params: HashTable) -> Unit>().get().invoke(
            type?.toKString() ?: error("Expected not null string"),
            params!!.run {
                HashTable(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectGotBodyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectGotBodyDataFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        chunkSize: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(chunkSize: guint) -> Unit>().get().invoke(chunkSize)
}
    .reinterpret()

private val connectGotHeadersFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectGotInformationalFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectHstsEnforcedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectNetworkEventFunc:
    CPointer<CFunction<(GSocketClientEvent, CPointer<GIOStream>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            event: GSocketClientEvent,
            connection: CPointer<GIOStream>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(event: SocketClientEvent, connection: IoStream) -> Unit>().get().invoke(
            event.run {
                SocketClientEvent.fromNativeValue(this)
            },
            connection!!.run {
                IoStream(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRequestCertificateFunc:
    CPointer<CFunction<(CPointer<GTlsClientConnection>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            tlsConnection: CPointer<GTlsClientConnection>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tlsConnection: TlsClientConnection) -> Boolean>().get().invoke(
            tlsConnection!!.run {
                TlsClientConnection.wrap(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectRequestCertificatePasswordFunc:
    CPointer<CFunction<(CPointer<GTlsPassword>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            tlsPassword: CPointer<GTlsPassword>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tlsPassword: TlsPassword) -> Boolean>().get().invoke(
            tlsPassword!!.run {
                TlsPassword(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectRestartedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectStartingFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectWroteBodyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectWroteBodyDataFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        chunkSize: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(chunkSize: guint) -> Unit>().get().invoke(chunkSize)
}
    .reinterpret()

private val connectWroteHeadersFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
