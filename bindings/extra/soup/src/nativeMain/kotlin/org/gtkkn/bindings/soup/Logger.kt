// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupLogger
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_logger_get_max_body_size
import org.gtkkn.native.soup.soup_logger_get_type
import org.gtkkn.native.soup.soup_logger_new
import org.gtkkn.native.soup.soup_logger_set_max_body_size
import org.gtkkn.native.soup.soup_logger_set_printer
import org.gtkkn.native.soup.soup_logger_set_request_filter
import org.gtkkn.native.soup.soup_logger_set_response_filter
import kotlin.Unit

/**
 * Debug logging support
 *
 * #SoupLogger watches a [class@Session] and logs the HTTP traffic that
 * it generates, for debugging purposes. Many applications use an
 * environment variable to determine whether or not to use
 * #SoupLogger, and to determine the amount of debugging output.
 *
 * To use #SoupLogger, first create a logger with [ctor@Logger.new], optionally
 * configure it with [method@Logger.set_request_filter],
 * [method@Logger.set_response_filter], and [method@Logger.set_printer], and
 * then attach it to a session (or multiple sessions) with
 * [method@Session.add_feature].
 *
 * By default, the debugging output is sent to `stdout`, and looks something
 * like:
 *
 * ```
 * > POST /unauth HTTP/1.1
 * > Soup-Debug-Timestamp: 1200171744
 * > Soup-Debug: SoupSession 1 (0x612190), SoupMessage 1 (0x617000), GSocket 1 (0x612220)
 * > Host: localhost
 * > Content-Type: text/plain
 * > Connection: close
 *
 * `&lt;` HTTP/1.1 201 Created
 * `&lt;` Soup-Debug-Timestamp: 1200171744
 * `&lt;` Soup-Debug: SoupMessage 1 (0x617000)
 * `&lt;` Date: Sun, 12 Jan 2008 21:02:24 GMT
 * `&lt;` Content-Length: 0
 * ```
 *
 * The `Soup-Debug-Timestamp` line gives the time (as a `time_t`) when the
 * request was sent, or the response fully received.
 *
 * The `Soup-Debug` line gives further debugging information about the
 * [class@Session], [class@Message], and [class@Gio.Socket] involved; the hex
 * numbers are the addresses of the objects in question (which may be useful if
 * you are running in a debugger). The decimal IDs are simply counters that
 * uniquely identify objects across the lifetime of the #SoupLogger. In
 * particular, this can be used to identify when multiple messages are sent
 * across the same connection.
 *
 * Currently, the request half of the message is logged just before
 * the first byte of the request gets written to the network (from the
 * [signal@Message::starting] signal).
 *
 * The response is logged just after the last byte of the response body is read
 * from the network (from the [signal@Message::got-body] or
 * [signal@Message::got-informational] signal), which means that the
 * [signal@Message::got-headers] signal, and anything triggered off it (such as
 * #SoupMessage::authenticate) will be emitted *before* the response headers are
 * actually logged.
 *
 * If the response doesn't happen to trigger the [signal@Message::got-body] nor
 * [signal@Message::got-informational] signals due to, for example, a
 * cancellation before receiving the last byte of the response body, the
 * response will still be logged on the event of the [signal@Message::finished]
 * signal.
 *
 * ## Skipped during bindings generation
 *
 * - method `level`: Property has no getter nor setter
 */
public class Logger(public val soupLoggerPointer: CPointer<SoupLogger>) :
    Object(soupLoggerPointer.reinterpret()),
    SessionFeature,
    KGTyped {
    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = handle.reinterpret()

    /**
     * If [property@Logger:level] is %SOUP_LOGGER_LOG_BODY, this gives
     * the maximum number of bytes of the body that will be logged.
     * (-1 means "no limit".)
     */
    public var maxBodySize: gint
        /**
         * Get the maximum body size for @logger.
         *
         * @return the maximum body size, or -1 if unlimited
         */
        get() = soup_logger_get_max_body_size(soupLoggerPointer)

        /**
         * Sets the maximum body size for @logger (-1 means no limit).
         *
         * @param maxBodySize the maximum body size to log
         */
        set(maxBodySize) = soup_logger_set_max_body_size(soupLoggerPointer, maxBodySize)

    /**
     * Creates a new #SoupLogger with the given debug level.
     *
     * If you need finer control over what message parts are and aren't
     * logged, use [method@Logger.set_request_filter] and
     * [method@Logger.set_response_filter].
     *
     * @param level the debug level
     * @return a new #SoupLogger
     */
    public constructor(level: LoggerLogLevel) : this(soup_logger_new(level.nativeValue)!!.reinterpret())

    /**
     * Sets up an alternate log printing routine, if you don't want
     * the log to go to `stdout`.
     *
     * @param printer the callback for printing logging output
     */
    public fun setPrinter(printer: LoggerPrinter): Unit = soup_logger_set_printer(
        soupLoggerPointer,
        LoggerPrinterFunc.reinterpret(),
        StableRef.create(printer).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Sets up a filter to determine the log level for a given request.
     *
     * For each HTTP request @logger will invoke @request_filter to
     * determine how much (if any) of that request to log. (If you do not
     * set a request filter, @logger will just always log requests at the
     * level passed to [ctor@Logger.new].)
     *
     * @param requestFilter the callback for request debugging
     */
    public fun setRequestFilter(requestFilter: LoggerFilter): Unit = soup_logger_set_request_filter(
        soupLoggerPointer,
        LoggerFilterFunc.reinterpret(),
        StableRef.create(requestFilter).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Sets up a filter to determine the log level for a given response.
     *
     * For each HTTP response @logger will invoke @response_filter to
     * determine how much (if any) of that response to log. (If you do not
     * set a response filter, @logger will just always log responses at
     * the level passed to [ctor@Logger.new].)
     *
     * @param responseFilter the callback for response debugging
     */
    public fun setResponseFilter(responseFilter: LoggerFilter): Unit = soup_logger_set_response_filter(
        soupLoggerPointer,
        LoggerFilterFunc.reinterpret(),
        StableRef.create(responseFilter).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    public companion object : TypeCompanion<Logger> {
        override val type: GeneratedClassKGType<Logger> =
            GeneratedClassKGType(soup_logger_get_type()) { Logger(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of Logger
         *
         * @return the GType
         */
        public fun getType(): GType = soup_logger_get_type()
    }
}
