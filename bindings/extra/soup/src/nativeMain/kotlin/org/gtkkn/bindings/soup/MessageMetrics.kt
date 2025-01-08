// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupMessageMetrics
import org.gtkkn.native.soup.soup_message_metrics_copy
import org.gtkkn.native.soup.soup_message_metrics_free
import org.gtkkn.native.soup.soup_message_metrics_get_connect_end
import org.gtkkn.native.soup.soup_message_metrics_get_connect_start
import org.gtkkn.native.soup.soup_message_metrics_get_dns_end
import org.gtkkn.native.soup.soup_message_metrics_get_dns_start
import org.gtkkn.native.soup.soup_message_metrics_get_fetch_start
import org.gtkkn.native.soup.soup_message_metrics_get_request_body_bytes_sent
import org.gtkkn.native.soup.soup_message_metrics_get_request_body_size
import org.gtkkn.native.soup.soup_message_metrics_get_request_header_bytes_sent
import org.gtkkn.native.soup.soup_message_metrics_get_request_start
import org.gtkkn.native.soup.soup_message_metrics_get_response_body_bytes_received
import org.gtkkn.native.soup.soup_message_metrics_get_response_body_size
import org.gtkkn.native.soup.soup_message_metrics_get_response_end
import org.gtkkn.native.soup.soup_message_metrics_get_response_header_bytes_received
import org.gtkkn.native.soup.soup_message_metrics_get_response_start
import org.gtkkn.native.soup.soup_message_metrics_get_tls_start
import org.gtkkn.native.soup.soup_message_metrics_get_type
import kotlin.Unit

/**
 * Contains metrics collected while loading a [class@Message] either from the
 * network or the disk cache.
 *
 * Metrics are not collected by default for a [class@Message], you need to add the
 * flag %SOUP_MESSAGE_COLLECT_METRICS to enable the feature.
 *
 * Temporal metrics are expressed as a monotonic time and always start with a
 * fetch start event and finish with response end. All other events are optional.
 * An event can be 0 because it hasn't happened yet, because it's optional or
 * because the load failed before the event reached.
 *
 * Size metrics are expressed in bytes and are updated while the [class@Message] is
 * being loaded. You can connect to different [class@Message] signals to get the
 * final result of every value.
 */
public class MessageMetrics(pointer: CPointer<SoupMessageMetrics>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<SoupMessageMetrics> = pointer

    /**
     * Copies @metrics.
     *
     * @return a copy of @metrics
     */
    public fun copy(): MessageMetrics = soup_message_metrics_copy(gPointer)!!.run {
        MessageMetrics(this)
    }

    /**
     * Frees @metrics.
     */
    public fun free(): Unit = soup_message_metrics_free(gPointer)

    /**
     * Get the time immediately after the [class@Message] completed the
     * connection to the server. This includes the time for the proxy
     * negotiation and TLS handshake.
     *
     * It will be 0 if no network connection was required to fetch the resource (a
     * persistent connection was used or resource was loaded from the local disk
     * cache).
     *
     * @return the connection end time
     */
    public fun getConnectEnd(): guint64 = soup_message_metrics_get_connect_end(gPointer)

    /**
     * Get the time immediately before the [class@Message] started to
     * establish the connection to the server.
     *
     * It will be 0 if no network connection was required to fetch the resource (a
     * persistent connection was used or resource was loaded from the local disk
     * cache).
     *
     * @return the connection start time
     */
    public fun getConnectStart(): guint64 = soup_message_metrics_get_connect_start(gPointer)

    /**
     * Get the time immediately after the [class@Message] completed the
     * domain lookup name for the resource.
     *
     * It will be 0 if no domain lookup was required to fetch the resource (a
     * persistent connection was used or resource was loaded from the local disk
     * cache).
     *
     * @return the domain lookup end time
     */
    public fun getDnsEnd(): guint64 = soup_message_metrics_get_dns_end(gPointer)

    /**
     * Get the time immediately before the [class@Message] started the
     * domain lookup name for the resource.
     *
     * It will be 0 if no domain lookup was required to fetch the resource (a
     * persistent connection was used or resource was loaded from the local disk
     * cache).
     *
     * @return the domain lookup start time
     */
    public fun getDnsStart(): guint64 = soup_message_metrics_get_dns_start(gPointer)

    /**
     * Get the time immediately before the [class@Message] started to
     * fetch a resource either from a remote server or local disk cache.
     *
     * @return the fetch start time
     */
    public fun getFetchStart(): guint64 = soup_message_metrics_get_fetch_start(gPointer)

    /**
     * Get the number of bytes sent to the network for the request body.
     *
     * This is the size of the body sent, after encodings are applied, so it might
     * be greater than the value returned by
     * [method@MessageMetrics.get_request_body_size]. This value is available right
     * before [signal@Message::wrote-body] signal is emitted, but you might get an
     * intermediate value if called before.
     *
     * @return the request body bytes sent
     */
    public fun getRequestBodyBytesSent(): guint64 = soup_message_metrics_get_request_body_bytes_sent(gPointer)

    /**
     * Get the request body size in bytes. This is the size of the original body
     * given to the request before any encoding is applied.
     *
     * This value is available right before [signal@Message::wrote-body] signal is
     * emitted, but you might get an intermediate value if called before.
     *
     * @return the request body size
     */
    public fun getRequestBodySize(): guint64 = soup_message_metrics_get_request_body_size(gPointer)

    /**
     * Get the number of bytes sent to the network for the request headers.
     *
     * This value is available right before [signal@Message::wrote-headers] signal
     * is emitted, but you might get an intermediate value if called before.
     *
     * @return the request headers bytes sent
     */
    public fun getRequestHeaderBytesSent(): guint64 = soup_message_metrics_get_request_header_bytes_sent(gPointer)

    /**
     * Get the time immediately before the [class@Message] started the
     * request of the resource from the server or the local disk cache.
     *
     * @return the request start time
     */
    public fun getRequestStart(): guint64 = soup_message_metrics_get_request_start(gPointer)

    /**
     * Get the number of bytes received from the network for the response body.
     *
     * This value is available right before [signal@Message::got-body] signal is
     * emitted, but you might get an intermediate value if called before. For
     * resources loaded from the disk cache this value is always 0.
     *
     * @return the response body bytes received
     */
    public fun getResponseBodyBytesReceived(): guint64 = soup_message_metrics_get_response_body_bytes_received(gPointer)

    /**
     * Get the response body size in bytes.
     *
     * This is the size of the body as given to the user after all encodings are
     * applied, so it might be greater than the value returned by
     * [method@MessageMetrics.get_response_body_bytes_received]. This value is
     * available right before [signal@Message::got-body] signal is emitted, but you
     * might get an intermediate value if called before.
     *
     * @return the response body size
     */
    public fun getResponseBodySize(): guint64 = soup_message_metrics_get_response_body_size(gPointer)

    /**
     * Get the time immediately after the [class@Message] received the last
     * bytes of the response from the server or the local disk cache.
     *
     * In case of load failure, this returns the time immediately before the
     * fetch is aborted.
     *
     * @return the response end time
     */
    public fun getResponseEnd(): guint64 = soup_message_metrics_get_response_end(gPointer)

    /**
     * Get the number of bytes received from the network for the response headers.
     *
     * This value is available right before [signal@Message::got-headers] signal
     * is emitted, but you might get an intermediate value if called before.
     * For resources loaded from the disk cache this value is always 0.
     *
     * @return the response headers bytes received
     */
    public fun getResponseHeaderBytesReceived(): guint64 =
        soup_message_metrics_get_response_header_bytes_received(gPointer)

    /**
     * Get the time immediately after the [class@Message] received the first
     * bytes of the response from the server or the local disk cache.
     *
     * @return the response start time
     */
    public fun getResponseStart(): guint64 = soup_message_metrics_get_response_start(gPointer)

    /**
     * Get the time immediately before the [class@Message] started the
     * TLS handshake.
     *
     * It will be 0 if no TLS handshake was required to fetch the resource
     * (connection was not secure, a persistent connection was used or resource was
     * loaded from the local disk cache).
     *
     * @return the tls start time
     */
    public fun getTlsStart(): guint64 = soup_message_metrics_get_tls_start(gPointer)

    public companion object {
        /**
         * Get the GType of MessageMetrics
         *
         * @return the GType
         */
        public fun getType(): GType = soup_message_metrics_get_type()
    }
}
