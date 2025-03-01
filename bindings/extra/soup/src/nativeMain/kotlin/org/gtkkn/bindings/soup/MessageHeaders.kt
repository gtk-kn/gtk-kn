// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.HashTable
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupMessageHeaders
import org.gtkkn.native.soup.soup_message_headers_append
import org.gtkkn.native.soup.soup_message_headers_clean_connection_headers
import org.gtkkn.native.soup.soup_message_headers_clear
import org.gtkkn.native.soup.soup_message_headers_foreach
import org.gtkkn.native.soup.soup_message_headers_free_ranges
import org.gtkkn.native.soup.soup_message_headers_get_content_length
import org.gtkkn.native.soup.soup_message_headers_get_encoding
import org.gtkkn.native.soup.soup_message_headers_get_expectations
import org.gtkkn.native.soup.soup_message_headers_get_headers_type
import org.gtkkn.native.soup.soup_message_headers_get_list
import org.gtkkn.native.soup.soup_message_headers_get_one
import org.gtkkn.native.soup.soup_message_headers_get_type
import org.gtkkn.native.soup.soup_message_headers_header_contains
import org.gtkkn.native.soup.soup_message_headers_header_equals
import org.gtkkn.native.soup.soup_message_headers_new
import org.gtkkn.native.soup.soup_message_headers_ref
import org.gtkkn.native.soup.soup_message_headers_remove
import org.gtkkn.native.soup.soup_message_headers_replace
import org.gtkkn.native.soup.soup_message_headers_set_content_disposition
import org.gtkkn.native.soup.soup_message_headers_set_content_length
import org.gtkkn.native.soup.soup_message_headers_set_content_range
import org.gtkkn.native.soup.soup_message_headers_set_content_type
import org.gtkkn.native.soup.soup_message_headers_set_encoding
import org.gtkkn.native.soup.soup_message_headers_set_expectations
import org.gtkkn.native.soup.soup_message_headers_set_range
import org.gtkkn.native.soup.soup_message_headers_set_ranges
import org.gtkkn.native.soup.soup_message_headers_unref
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The HTTP message headers associated with a request or response.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `disposition`: disposition: Out parameter is not supported
 * - parameter `start`: start: Out parameter is not supported
 * - parameter `params`: params: Out parameter is not supported
 * - parameter `ranges`: ranges: Out parameter is not supported
 */
public class MessageHeaders(public val soupMessageHeadersPointer: CPointer<SoupMessageHeaders>) :
    ProxyInstance(soupMessageHeadersPointer) {
    /**
     * Creates a #SoupMessageHeaders.
     *
     * ([class@Message] does this automatically for its own headers. You would only
     * need to use this method if you are manually parsing or generating message
     * headers.)
     *
     * @param type the type of headers
     * @return a new #SoupMessageHeaders
     */
    public constructor(type: MessageHeadersType) : this(soup_message_headers_new(type.nativeValue)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Appends a new header with name @name and value @value to @hdrs.
     *
     * (If there is an existing header with name @name, then this creates a second
     * one, which is only allowed for list-valued headers; see also
     * [method@MessageHeaders.replace].)
     *
     * The caller is expected to make sure that @name and @value are
     * syntactically correct.
     *
     * @param name the header name to add
     * @param value the new value of @name
     */
    public fun append(name: String, `value`: String): Unit =
        soup_message_headers_append(soupMessageHeadersPointer, name, `value`)

    /**
     * Removes all the headers listed in the Connection header.
     */
    public fun cleanConnectionHeaders(): Unit = soup_message_headers_clean_connection_headers(soupMessageHeadersPointer)

    /**
     * Clears @hdrs.
     */
    public fun clear(): Unit = soup_message_headers_clear(soupMessageHeadersPointer)

    /**
     * Calls @func once for each header value in @hdrs.
     *
     * Beware that unlike [method@MessageHeaders.get_list], this processes the
     * headers in exactly the way they were added, rather than
     * concatenating multiple same-named headers into a single value.
     * (This is intentional; it ensures that if you call
     * [method@MessageHeaders.append] multiple times with the same name,
     * then the I/O code will output multiple copies of the header when
     * sending the message to the remote implementation, which may be
     * required for interoperability in some cases.)
     *
     * You may not modify the headers from @func.
     *
     * @param func callback function to run for each header
     */
    public fun foreach(func: MessageHeadersForeachFunc): Unit = soup_message_headers_foreach(
        soupMessageHeadersPointer,
        MessageHeadersForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Frees the array of ranges returned from [method@MessageHeaders.get_ranges].
     *
     * @param ranges an array of #SoupRange
     */
    public fun freeRanges(ranges: Range): Unit =
        soup_message_headers_free_ranges(soupMessageHeadersPointer, ranges.soupRangePointer)

    /**
     * Gets the message body length that @hdrs declare.
     *
     * This will only be non-0 if [method@MessageHeaders.get_encoding] returns
     * %SOUP_ENCODING_CONTENT_LENGTH.
     *
     * @return the message body length declared by @hdrs.
     */
    public fun getContentLength(): gint64 = soup_message_headers_get_content_length(soupMessageHeadersPointer)

    /**
     * Gets the message body encoding that @hdrs declare.
     *
     * This may not always correspond to the encoding used on the wire; eg, a HEAD
     * response may declare a Content-Length or Transfer-Encoding, but it will never
     * actually include a body.
     *
     * @return the encoding declared by @hdrs.
     */
    public fun getEncoding(): Encoding = soup_message_headers_get_encoding(soupMessageHeadersPointer).run {
        Encoding.fromNativeValue(this)
    }

    /**
     * Gets the expectations declared by @hdrs's "Expect" header.
     *
     * Currently this will either be %SOUP_EXPECTATION_CONTINUE or
     * %SOUP_EXPECTATION_UNRECOGNIZED.
     *
     * @return the contents of @hdrs's "Expect" header
     */
    public fun getExpectations(): Expectation = soup_message_headers_get_expectations(soupMessageHeadersPointer).run {
        Expectation(this)
    }

    /**
     * Gets the type of headers.
     *
     * @return the header's type.
     */
    public fun getHeadersType(): MessageHeadersType =
        soup_message_headers_get_headers_type(soupMessageHeadersPointer).run {
            MessageHeadersType.fromNativeValue(this)
        }

    /**
     * Gets the value of header @name in @hdrs.
     *
     * Use this for headers whose values are comma-delimited lists, and which are
     * therefore allowed to appear multiple times in the headers. For
     * non-list-valued headers, use [method@MessageHeaders.get_one].
     *
     * If @name appears multiple times in @hdrs,
     * [method@MessageHeaders.get_list] will concatenate all of the values
     * together, separated by commas. This is sometimes awkward to parse
     * (eg, WWW-Authenticate, Set-Cookie), but you have to be able to deal
     * with it anyway, because the HTTP spec explicitly states that this
     * transformation is allowed, and so an upstream proxy could do the
     * same thing.
     *
     * @param name header name
     * @return the header's value or null if not found.
     */
    public fun getList(name: String): String? =
        soup_message_headers_get_list(soupMessageHeadersPointer, name)?.toKString()

    /**
     * Gets the value of header @name in @hdrs.
     *
     * Use this for headers whose values are *not* comma-delimited lists, and which
     * therefore can only appear at most once in the headers. For list-valued
     * headers, use [method@MessageHeaders.get_list].
     *
     * If @hdrs does erroneously contain multiple copies of the header, it
     * is not defined which one will be returned. (Ideally, it will return
     * whichever one makes libsoup most compatible with other HTTP
     * implementations.)
     *
     * @param name header name
     * @return the header's value or null if not found.
     */
    public fun getOne(name: String): String? =
        soup_message_headers_get_one(soupMessageHeadersPointer, name)?.toKString()

    /**
     * Checks whether the list-valued header @name is present in @hdrs,
     * and contains a case-insensitive match for @token.
     *
     * (If @name is present in @hdrs, then this is equivalent to calling
     * [func@header_contains] on its value.)
     *
     * @param name header name
     * @param token token to look for
     * @return true if the header is present and contains @token,
     *   false otherwise.
     */
    public fun headerContains(name: String, token: String): Boolean =
        soup_message_headers_header_contains(soupMessageHeadersPointer, name, token).asBoolean()

    /**
     * Checks whether the header @name is present in @hdrs and is
     * (case-insensitively) equal to @value.
     *
     * @param name header name
     * @param value expected value
     * @return true if the header is present and its value is
     *   @value, false otherwise.
     */
    public fun headerEquals(name: String, `value`: String): Boolean =
        soup_message_headers_header_equals(soupMessageHeadersPointer, name, `value`).asBoolean()

    /**
     * Atomically increments the reference count of @hdrs by one.
     *
     * @return the passed in #SoupMessageHeaders
     */
    public fun ref(): MessageHeaders = soup_message_headers_ref(soupMessageHeadersPointer)!!.run {
        MessageHeaders(this)
    }

    /**
     * Removes @name from @hdrs.
     *
     * If there are multiple values for @name, they are all removed.
     *
     * @param name the header name to remove
     */
    public fun remove(name: String): Unit = soup_message_headers_remove(soupMessageHeadersPointer, name)

    /**
     * Replaces the value of the header @name in @hdrs with @value.
     *
     * See also [method@MessageHeaders.append].
     *
     * The caller is expected to make sure that @name and @value are
     * syntactically correct.
     *
     * @param name the header name to replace
     * @param value the new value of @name
     */
    public fun replace(name: String, `value`: String): Unit =
        soup_message_headers_replace(soupMessageHeadersPointer, name, `value`)

    /**
     * Sets the "Content-Disposition" header in @hdrs to @disposition,
     * optionally with additional parameters specified in @params.
     *
     * See [method@MessageHeaders.get_content_disposition] for a discussion
     * of how Content-Disposition is used in HTTP.
     *
     * @param disposition the disposition-type
     * @param params additional parameters
     */
    public fun setContentDisposition(disposition: String, params: HashTable? = null): Unit =
        soup_message_headers_set_content_disposition(
            soupMessageHeadersPointer,
            disposition,
            params?.glibHashTablePointer
        )

    /**
     * Sets the message body length that @hdrs will declare, and sets
     * @hdrs's encoding to %SOUP_ENCODING_CONTENT_LENGTH.
     *
     * You do not normally need to call this; if @hdrs is set to use
     * Content-Length encoding, libsoup will automatically set its
     * Content-Length header for you immediately before sending the
     * headers. One situation in which this method is useful is when
     * generating the response to a HEAD request; Calling
     * [method@MessageHeaders.set_content_length] allows you to put the
     * correct content length into the response without needing to waste
     * memory by filling in a response body which won't actually be sent.
     *
     * @param contentLength the message body length
     */
    public fun setContentLength(contentLength: gint64): Unit =
        soup_message_headers_set_content_length(soupMessageHeadersPointer, contentLength)

    /**
     * Sets @hdrs's Content-Range header according to the given values.
     *
     * (Note that @total_length is the total length of the entire resource
     * that this is a range of, not simply @end - @start + 1.)
     *
     * [class@Server] has built-in handling for range requests, and you do
     * not normally need to call this function youself. See
     * [method@MessageHeaders.get_ranges] for more details.
     *
     * @param start the start of the range
     * @param end the end of the range
     * @param totalLength the total length of the resource, or -1 if unknown
     */
    public fun setContentRange(start: gint64, end: gint64, totalLength: gint64): Unit =
        soup_message_headers_set_content_range(soupMessageHeadersPointer, start, end, totalLength)

    /**
     * Sets the "Content-Type" header in @hdrs to @content_type.
     *
     * Accepts additional parameters specified in @params.
     *
     * @param contentType the MIME type
     * @param params additional parameters
     */
    public fun setContentType(contentType: String, params: HashTable? = null): Unit =
        soup_message_headers_set_content_type(soupMessageHeadersPointer, contentType, params?.glibHashTablePointer)

    /**
     * Sets the message body encoding that @hdrs will declare.
     *
     * In particular, you should use this if you are going to send a request or
     * response in chunked encoding.
     *
     * @param encoding a #SoupEncoding
     */
    public fun setEncoding(encoding: Encoding): Unit =
        soup_message_headers_set_encoding(soupMessageHeadersPointer, encoding.nativeValue)

    /**
     * Sets @hdrs's "Expect" header according to @expectations.
     *
     * Currently %SOUP_EXPECTATION_CONTINUE is the only known expectation
     * value. You should set this value on a request if you are sending a
     * large message body (eg, via POST or PUT), and want to give the
     * server a chance to reject the request after seeing just the headers
     * (eg, because it will require authentication before allowing you to
     * post, or because you're POSTing to a URL that doesn't exist). This
     * saves you from having to transmit the large request body when the
     * server is just going to ignore it anyway.
     *
     * @param expectations the expectations to set
     */
    public fun setExpectations(expectations: Expectation): Unit =
        soup_message_headers_set_expectations(soupMessageHeadersPointer, expectations.mask)

    /**
     * Sets @hdrs's Range header to request the indicated range.
     *
     * @start and @end are interpreted as in a [struct@Range].
     *
     * If you need to request multiple ranges, use
     * [method@MessageHeaders.set_ranges].
     *
     * @param start the start of the range to request
     * @param end the end of the range to request
     */
    public fun setRange(start: gint64, end: gint64): Unit =
        soup_message_headers_set_range(soupMessageHeadersPointer, start, end)

    /**
     * Sets @hdrs's Range header to request the indicated ranges.
     *
     * If you only want to request a single range, you can use
     * [method@MessageHeaders.set_range].
     *
     * @param ranges an array of #SoupRange
     * @param length the length of @range
     */
    public fun setRanges(ranges: Range, length: gint): Unit =
        soup_message_headers_set_ranges(soupMessageHeadersPointer, ranges.soupRangePointer, length)

    /**
     * Atomically decrements the reference count of @hdrs by one.
     *
     * When the reference count reaches zero, the resources allocated by
     * @hdrs are freed
     */
    public fun unref(): Unit = soup_message_headers_unref(soupMessageHeadersPointer)

    public companion object {
        /**
         * Get the GType of MessageHeaders
         *
         * @return the GType
         */
        public fun getType(): GType = soup_message_headers_get_type()
    }
}
