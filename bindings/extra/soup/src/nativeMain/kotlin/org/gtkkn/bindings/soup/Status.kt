// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.toKString
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupStatus
import org.gtkkn.native.soup.soup_status_get_phrase
import org.gtkkn.native.soup.soup_status_get_type
import kotlin.String

/**
 * These represent the known HTTP status code values, plus various
 * network and internal errors.
 *
 * Note that no libsoup functions take or return this type directly;
 * any function that works with status codes will accept unrecognized
 * status codes as well.
 */
public enum class Status(public val nativeValue: SoupStatus) {
    /**
     * No status available. (Eg, the message has not
     * been sent yet)
     */
    NONE(SoupStatus.SOUP_STATUS_NONE),

    /**
     * 100 Continue (HTTP)
     */
    CONTINUE(SoupStatus.SOUP_STATUS_CONTINUE),

    /**
     * 101 Switching Protocols (HTTP)
     */
    SWITCHING_PROTOCOLS(SoupStatus.SOUP_STATUS_SWITCHING_PROTOCOLS),

    /**
     * 102 Processing (WebDAV)
     */
    PROCESSING(SoupStatus.SOUP_STATUS_PROCESSING),

    /**
     * 200 Success (HTTP). Also used by many lower-level
     * soup routines to indicate success.
     */
    OK(SoupStatus.SOUP_STATUS_OK),

    /**
     * 201 Created (HTTP)
     */
    CREATED(SoupStatus.SOUP_STATUS_CREATED),

    /**
     * 202 Accepted (HTTP)
     */
    ACCEPTED(SoupStatus.SOUP_STATUS_ACCEPTED),

    /**
     * 203 Non-Authoritative Information
     * (HTTP)
     */
    NON_AUTHORITATIVE(SoupStatus.SOUP_STATUS_NON_AUTHORITATIVE),

    /**
     * 204 No Content (HTTP)
     */
    NO_CONTENT(SoupStatus.SOUP_STATUS_NO_CONTENT),

    /**
     * 205 Reset Content (HTTP)
     */
    RESET_CONTENT(SoupStatus.SOUP_STATUS_RESET_CONTENT),

    /**
     * 206 Partial Content (HTTP)
     */
    PARTIAL_CONTENT(SoupStatus.SOUP_STATUS_PARTIAL_CONTENT),

    /**
     * 207 Multi-Status (WebDAV)
     */
    MULTI_STATUS(SoupStatus.SOUP_STATUS_MULTI_STATUS),

    /**
     * 300 Multiple Choices (HTTP)
     */
    MULTIPLE_CHOICES(SoupStatus.SOUP_STATUS_MULTIPLE_CHOICES),

    /**
     * 301 Moved Permanently (HTTP)
     */
    MOVED_PERMANENTLY(SoupStatus.SOUP_STATUS_MOVED_PERMANENTLY),

    /**
     * 302 Found (HTTP)
     */
    FOUND(SoupStatus.SOUP_STATUS_FOUND),

    /**
     * 302 Moved Temporarily (old name,
     * RFC 2068)
     */
    MOVED_TEMPORARILY(SoupStatus.SOUP_STATUS_MOVED_TEMPORARILY),

    /**
     * 303 See Other (HTTP)
     */
    SEE_OTHER(SoupStatus.SOUP_STATUS_SEE_OTHER),

    /**
     * 304 Not Modified (HTTP)
     */
    NOT_MODIFIED(SoupStatus.SOUP_STATUS_NOT_MODIFIED),

    /**
     * 305 Use Proxy (HTTP)
     */
    USE_PROXY(SoupStatus.SOUP_STATUS_USE_PROXY),

    /**
     * 306 [Unused] (HTTP)
     */
    NOT_APPEARING_IN_THIS_PROTOCOL(SoupStatus.SOUP_STATUS_NOT_APPEARING_IN_THIS_PROTOCOL),

    /**
     * 307 Temporary Redirect (HTTP)
     */
    TEMPORARY_REDIRECT(SoupStatus.SOUP_STATUS_TEMPORARY_REDIRECT),

    /**
     * 308 Permanent Redirect (HTTP)
     */
    PERMANENT_REDIRECT(SoupStatus.SOUP_STATUS_PERMANENT_REDIRECT),

    /**
     * 400 Bad Request (HTTP)
     */
    BAD_REQUEST(SoupStatus.SOUP_STATUS_BAD_REQUEST),

    /**
     * 401 Unauthorized (HTTP)
     */
    UNAUTHORIZED(SoupStatus.SOUP_STATUS_UNAUTHORIZED),

    /**
     * 402 Payment Required (HTTP)
     */
    PAYMENT_REQUIRED(SoupStatus.SOUP_STATUS_PAYMENT_REQUIRED),

    /**
     * 403 Forbidden (HTTP)
     */
    FORBIDDEN(SoupStatus.SOUP_STATUS_FORBIDDEN),

    /**
     * 404 Not Found (HTTP)
     */
    NOT_FOUND(SoupStatus.SOUP_STATUS_NOT_FOUND),

    /**
     * 405 Method Not Allowed (HTTP)
     */
    METHOD_NOT_ALLOWED(SoupStatus.SOUP_STATUS_METHOD_NOT_ALLOWED),

    /**
     * 406 Not Acceptable (HTTP)
     */
    NOT_ACCEPTABLE(SoupStatus.SOUP_STATUS_NOT_ACCEPTABLE),

    /**
     * 407 Proxy Authentication
     * Required (HTTP)
     */
    PROXY_AUTHENTICATION_REQUIRED(SoupStatus.SOUP_STATUS_PROXY_AUTHENTICATION_REQUIRED),

    /**
     * shorter alias for
     * %SOUP_STATUS_PROXY_AUTHENTICATION_REQUIRED
     */
    PROXY_UNAUTHORIZED(SoupStatus.SOUP_STATUS_PROXY_UNAUTHORIZED),

    /**
     * 408 Request Timeout (HTTP)
     */
    REQUEST_TIMEOUT(SoupStatus.SOUP_STATUS_REQUEST_TIMEOUT),

    /**
     * 409 Conflict (HTTP)
     */
    CONFLICT(SoupStatus.SOUP_STATUS_CONFLICT),

    /**
     * 410 Gone (HTTP)
     */
    GONE(SoupStatus.SOUP_STATUS_GONE),

    /**
     * 411 Length Required (HTTP)
     */
    LENGTH_REQUIRED(SoupStatus.SOUP_STATUS_LENGTH_REQUIRED),

    /**
     * 412 Precondition Failed (HTTP)
     */
    PRECONDITION_FAILED(SoupStatus.SOUP_STATUS_PRECONDITION_FAILED),

    /**
     * 413 Request Entity Too Large
     * (HTTP)
     */
    REQUEST_ENTITY_TOO_LARGE(SoupStatus.SOUP_STATUS_REQUEST_ENTITY_TOO_LARGE),

    /**
     * 414 Request-URI Too Long (HTTP)
     */
    REQUEST_URI_TOO_LONG(SoupStatus.SOUP_STATUS_REQUEST_URI_TOO_LONG),

    /**
     * 415 Unsupported Media Type
     * (HTTP)
     */
    UNSUPPORTED_MEDIA_TYPE(SoupStatus.SOUP_STATUS_UNSUPPORTED_MEDIA_TYPE),

    /**
     * 416 Requested Range
     * Not Satisfiable (HTTP)
     */
    REQUESTED_RANGE_NOT_SATISFIABLE(SoupStatus.SOUP_STATUS_REQUESTED_RANGE_NOT_SATISFIABLE),

    /**
     * shorter alias for
     * %SOUP_STATUS_REQUESTED_RANGE_NOT_SATISFIABLE
     */
    INVALID_RANGE(SoupStatus.SOUP_STATUS_INVALID_RANGE),

    /**
     * 417 Expectation Failed (HTTP)
     */
    EXPECTATION_FAILED(SoupStatus.SOUP_STATUS_EXPECTATION_FAILED),

    /**
     * 421 Misdirected Request
     */
    MISDIRECTED_REQUEST(SoupStatus.SOUP_STATUS_MISDIRECTED_REQUEST),

    /**
     * 422 Unprocessable Entity
     * (WebDAV)
     */
    UNPROCESSABLE_ENTITY(SoupStatus.SOUP_STATUS_UNPROCESSABLE_ENTITY),

    /**
     * 423 Locked (WebDAV)
     */
    LOCKED(SoupStatus.SOUP_STATUS_LOCKED),

    /**
     * 424 Failed Dependency (WebDAV)
     */
    FAILED_DEPENDENCY(SoupStatus.SOUP_STATUS_FAILED_DEPENDENCY),

    /**
     * 500 Internal Server Error
     * (HTTP)
     */
    INTERNAL_SERVER_ERROR(SoupStatus.SOUP_STATUS_INTERNAL_SERVER_ERROR),

    /**
     * 501 Not Implemented (HTTP)
     */
    NOT_IMPLEMENTED(SoupStatus.SOUP_STATUS_NOT_IMPLEMENTED),

    /**
     * 502 Bad Gateway (HTTP)
     */
    BAD_GATEWAY(SoupStatus.SOUP_STATUS_BAD_GATEWAY),

    /**
     * 503 Service Unavailable (HTTP)
     */
    SERVICE_UNAVAILABLE(SoupStatus.SOUP_STATUS_SERVICE_UNAVAILABLE),

    /**
     * 504 Gateway Timeout (HTTP)
     */
    GATEWAY_TIMEOUT(SoupStatus.SOUP_STATUS_GATEWAY_TIMEOUT),

    /**
     * 505 HTTP Version Not
     * Supported (HTTP)
     */
    HTTP_VERSION_NOT_SUPPORTED(SoupStatus.SOUP_STATUS_HTTP_VERSION_NOT_SUPPORTED),

    /**
     * 507 Insufficient Storage
     * (WebDAV)
     */
    INSUFFICIENT_STORAGE(SoupStatus.SOUP_STATUS_INSUFFICIENT_STORAGE),

    /**
     * 510 Not Extended (RFC 2774)
     */
    NOT_EXTENDED(SoupStatus.SOUP_STATUS_NOT_EXTENDED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupStatus): Status = when (nativeValue) {
            SoupStatus.SOUP_STATUS_NONE -> NONE
            SoupStatus.SOUP_STATUS_CONTINUE -> CONTINUE
            SoupStatus.SOUP_STATUS_SWITCHING_PROTOCOLS -> SWITCHING_PROTOCOLS
            SoupStatus.SOUP_STATUS_PROCESSING -> PROCESSING
            SoupStatus.SOUP_STATUS_OK -> OK
            SoupStatus.SOUP_STATUS_CREATED -> CREATED
            SoupStatus.SOUP_STATUS_ACCEPTED -> ACCEPTED
            SoupStatus.SOUP_STATUS_NON_AUTHORITATIVE -> NON_AUTHORITATIVE
            SoupStatus.SOUP_STATUS_NO_CONTENT -> NO_CONTENT
            SoupStatus.SOUP_STATUS_RESET_CONTENT -> RESET_CONTENT
            SoupStatus.SOUP_STATUS_PARTIAL_CONTENT -> PARTIAL_CONTENT
            SoupStatus.SOUP_STATUS_MULTI_STATUS -> MULTI_STATUS
            SoupStatus.SOUP_STATUS_MULTIPLE_CHOICES -> MULTIPLE_CHOICES
            SoupStatus.SOUP_STATUS_MOVED_PERMANENTLY -> MOVED_PERMANENTLY
            SoupStatus.SOUP_STATUS_FOUND -> FOUND
            SoupStatus.SOUP_STATUS_MOVED_TEMPORARILY -> MOVED_TEMPORARILY
            SoupStatus.SOUP_STATUS_SEE_OTHER -> SEE_OTHER
            SoupStatus.SOUP_STATUS_NOT_MODIFIED -> NOT_MODIFIED
            SoupStatus.SOUP_STATUS_USE_PROXY -> USE_PROXY
            SoupStatus.SOUP_STATUS_NOT_APPEARING_IN_THIS_PROTOCOL -> NOT_APPEARING_IN_THIS_PROTOCOL
            SoupStatus.SOUP_STATUS_TEMPORARY_REDIRECT -> TEMPORARY_REDIRECT
            SoupStatus.SOUP_STATUS_PERMANENT_REDIRECT -> PERMANENT_REDIRECT
            SoupStatus.SOUP_STATUS_BAD_REQUEST -> BAD_REQUEST
            SoupStatus.SOUP_STATUS_UNAUTHORIZED -> UNAUTHORIZED
            SoupStatus.SOUP_STATUS_PAYMENT_REQUIRED -> PAYMENT_REQUIRED
            SoupStatus.SOUP_STATUS_FORBIDDEN -> FORBIDDEN
            SoupStatus.SOUP_STATUS_NOT_FOUND -> NOT_FOUND
            SoupStatus.SOUP_STATUS_METHOD_NOT_ALLOWED -> METHOD_NOT_ALLOWED
            SoupStatus.SOUP_STATUS_NOT_ACCEPTABLE -> NOT_ACCEPTABLE
            SoupStatus.SOUP_STATUS_PROXY_AUTHENTICATION_REQUIRED -> PROXY_AUTHENTICATION_REQUIRED
            SoupStatus.SOUP_STATUS_PROXY_UNAUTHORIZED -> PROXY_UNAUTHORIZED
            SoupStatus.SOUP_STATUS_REQUEST_TIMEOUT -> REQUEST_TIMEOUT
            SoupStatus.SOUP_STATUS_CONFLICT -> CONFLICT
            SoupStatus.SOUP_STATUS_GONE -> GONE
            SoupStatus.SOUP_STATUS_LENGTH_REQUIRED -> LENGTH_REQUIRED
            SoupStatus.SOUP_STATUS_PRECONDITION_FAILED -> PRECONDITION_FAILED
            SoupStatus.SOUP_STATUS_REQUEST_ENTITY_TOO_LARGE -> REQUEST_ENTITY_TOO_LARGE
            SoupStatus.SOUP_STATUS_REQUEST_URI_TOO_LONG -> REQUEST_URI_TOO_LONG
            SoupStatus.SOUP_STATUS_UNSUPPORTED_MEDIA_TYPE -> UNSUPPORTED_MEDIA_TYPE
            SoupStatus.SOUP_STATUS_REQUESTED_RANGE_NOT_SATISFIABLE -> REQUESTED_RANGE_NOT_SATISFIABLE
            SoupStatus.SOUP_STATUS_INVALID_RANGE -> INVALID_RANGE
            SoupStatus.SOUP_STATUS_EXPECTATION_FAILED -> EXPECTATION_FAILED
            SoupStatus.SOUP_STATUS_MISDIRECTED_REQUEST -> MISDIRECTED_REQUEST
            SoupStatus.SOUP_STATUS_UNPROCESSABLE_ENTITY -> UNPROCESSABLE_ENTITY
            SoupStatus.SOUP_STATUS_LOCKED -> LOCKED
            SoupStatus.SOUP_STATUS_FAILED_DEPENDENCY -> FAILED_DEPENDENCY
            SoupStatus.SOUP_STATUS_INTERNAL_SERVER_ERROR -> INTERNAL_SERVER_ERROR
            SoupStatus.SOUP_STATUS_NOT_IMPLEMENTED -> NOT_IMPLEMENTED
            SoupStatus.SOUP_STATUS_BAD_GATEWAY -> BAD_GATEWAY
            SoupStatus.SOUP_STATUS_SERVICE_UNAVAILABLE -> SERVICE_UNAVAILABLE
            SoupStatus.SOUP_STATUS_GATEWAY_TIMEOUT -> GATEWAY_TIMEOUT
            SoupStatus.SOUP_STATUS_HTTP_VERSION_NOT_SUPPORTED -> HTTP_VERSION_NOT_SUPPORTED
            SoupStatus.SOUP_STATUS_INSUFFICIENT_STORAGE -> INSUFFICIENT_STORAGE
            SoupStatus.SOUP_STATUS_NOT_EXTENDED -> NOT_EXTENDED
            else -> error("invalid nativeValue")
        }

        /**
         * Looks up the stock HTTP description of @status_code.
         *
         * *There is no reason for you to ever use this
         * function.* If you wanted the textual description for the
         * [property@Message:status-code] of a given [class@Message], you should just
         * look at the message's [property@Message:reason-phrase]. However, you
         * should only do that for use in debugging messages; HTTP reason
         * phrases are not localized, and are not generally very descriptive
         * anyway, and so they should never be presented to the user directly.
         * Instead, you should create you own error messages based on the
         * status code, and on what you were trying to do.
         *
         * @param statusCode an HTTP status code
         * @return the (terse, English) description of @status_code
         */
        public fun getPhrase(statusCode: guint): String =
            soup_status_get_phrase(statusCode)?.toKString() ?: error("Expected not null string")

        /**
         * Get the GType of Status
         *
         * @return the GType
         */
        public fun getType(): GType = soup_status_get_type()
    }
}
