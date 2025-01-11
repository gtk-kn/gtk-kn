// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupMultipart
import org.gtkkn.native.soup.soup_multipart_append_form_file
import org.gtkkn.native.soup.soup_multipart_append_form_string
import org.gtkkn.native.soup.soup_multipart_append_part
import org.gtkkn.native.soup.soup_multipart_free
import org.gtkkn.native.soup.soup_multipart_get_length
import org.gtkkn.native.soup.soup_multipart_get_type
import org.gtkkn.native.soup.soup_multipart_new
import org.gtkkn.native.soup.soup_multipart_new_from_message
import kotlin.String
import kotlin.Unit

/**
 * Represents a multipart HTTP message body, parsed according to the
 * syntax of RFC 2046.
 *
 * Of particular interest to HTTP are `multipart/byte-ranges` and
 * `multipart/form-data`,
 *
 * Although the headers of a #SoupMultipart body part will contain the
 * full headers from that body part, libsoup does not interpret them
 * according to MIME rules. For example, each body part is assumed to
 * have "binary" Content-Transfer-Encoding, even if its headers
 * explicitly state otherwise. In other words, don't try to use
 * #SoupMultipart for handling real MIME multiparts.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `headers`: headers: Out parameter is not supported
 * - parameter `dest_body`: dest_body: Out parameter is not supported
 */
public class Multipart(public val soupMultipartPointer: CPointer<SoupMultipart>) :
    ProxyInstance(soupMultipartPointer) {
    /**
     * Adds a new MIME part containing @body to @multipart
     *
     * Uses "Content-Disposition: form-data", as per the HTML forms specification.
     *
     * @param controlName the name of the control associated with this file
     * @param filename the name of the file, or null if not known
     * @param contentType the MIME type of the file, or null if not known
     * @param body the file data
     */
    public fun appendFormFile(
        controlName: String,
        filename: String? = null,
        contentType: String? = null,
        body: Bytes,
    ): Unit =
        soup_multipart_append_form_file(soupMultipartPointer, controlName, filename, contentType, body.glibBytesPointer)

    /**
     * Adds a new MIME part containing @data to @multipart.
     *
     * Uses "Content-Disposition: form-data", as per the HTML forms specification.
     *
     * @param controlName the name of the control associated with @data
     * @param data the body data
     */
    public fun appendFormString(controlName: String, `data`: String): Unit =
        soup_multipart_append_form_string(soupMultipartPointer, controlName, `data`)

    /**
     * Adds a new MIME part to @multipart with the given headers and body.
     *
     * (The multipart will make its own copies of @headers and @body, so
     * you should free your copies if you are not using them for anything
     * else.)
     *
     * @param headers the MIME part headers
     * @param body the MIME part body
     */
    public fun appendPart(headers: MessageHeaders, body: Bytes): Unit =
        soup_multipart_append_part(soupMultipartPointer, headers.soupMessageHeadersPointer, body.glibBytesPointer)

    /**
     * Frees @multipart.
     */
    public fun free(): Unit = soup_multipart_free(soupMultipartPointer)

    /**
     * Gets the number of body parts in @multipart.
     *
     * @return the number of body parts in @multipart
     */
    public fun getLength(): gint = soup_multipart_get_length(soupMultipartPointer)

    public companion object {
        /**
         * Creates a new empty #SoupMultipart with a randomly-generated
         * boundary string.
         *
         * Note that @mime_type must be the full MIME type, including "multipart/".
         *
         * See also: [ctor@Message.new_from_multipart].
         *
         * @param mimeType the MIME type of the multipart to create.
         * @return a new empty #SoupMultipart of the given @mime_type
         */
        public fun new(mimeType: String): Multipart = Multipart(soup_multipart_new(mimeType)!!.reinterpret())

        /**
         * Parses @headers and @body to form a new #SoupMultipart
         *
         * @param headers the headers of the HTTP message to parse
         * @param body the body of the HTTP message to parse
         * @return a new #SoupMultipart (or null if the
         *   message couldn't be parsed or wasn't multipart).
         */
        public fun newFromMessage(headers: MessageHeaders, body: Bytes): Multipart? = Multipart(
            soup_multipart_new_from_message(
                headers.soupMessageHeadersPointer,
                body.glibBytesPointer
            )!!.reinterpret()
        )

        /**
         * Get the GType of Multipart
         *
         * @return the GType
         */
        public fun getType(): GType = soup_multipart_get_type()
    }
}
