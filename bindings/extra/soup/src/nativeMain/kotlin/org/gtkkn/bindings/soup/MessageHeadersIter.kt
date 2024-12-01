// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.soup.SoupMessageHeadersIter
import org.gtkkn.native.soup.soup_message_headers_iter_init
import kotlin.Unit

/**
 * An opaque type used to iterate over a %SoupMessageHeaders
 * structure.
 *
 * After intializing the iterator with [func@MessageHeadersIter.init], call
 * [method@MessageHeadersIter.next] to fetch data from it.
 *
 * You may not modify the headers while iterating over them.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `name`: name: Out parameter is not supported
 * - field `dummy`: Record field dummy is private
 */
public class MessageHeadersIter(
    pointer: CPointer<SoupMessageHeadersIter>,
) : Record {
    public val soupMessageHeadersIterPointer: CPointer<SoupMessageHeadersIter> = pointer

    public companion object : RecordCompanion<MessageHeadersIter, SoupMessageHeadersIter> {
        /**
         * Initializes @iter for iterating @hdrs.
         *
         * @param iter a pointer to a %SoupMessageHeadersIter
         *   structure
         * @param hdrs a %SoupMessageHeaders
         */
        public fun `init`(
            iter: MessageHeadersIter,
            hdrs: MessageHeaders,
        ): Unit =
            soup_message_headers_iter_init(
                iter.soupMessageHeadersIterPointer.reinterpret(),
                hdrs.soupMessageHeadersPointer.reinterpret()
            )

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): MessageHeadersIter =
            MessageHeadersIter(pointer.reinterpret())
    }
}
