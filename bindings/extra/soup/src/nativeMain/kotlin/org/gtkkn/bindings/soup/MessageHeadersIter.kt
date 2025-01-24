// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.soup.SoupMessageHeadersIter
import org.gtkkn.native.soup.soup_message_headers_iter_init
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
 */
public class MessageHeadersIter(
    public val soupMessageHeadersIterPointer: CPointer<SoupMessageHeadersIter>,
    cleaner: Cleaner? = null,
) : ProxyInstance(soupMessageHeadersIterPointer) {
    /**
     * Allocate a new MessageHeadersIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<SoupMessageHeadersIter>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to MessageHeadersIter and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<SoupMessageHeadersIter>, Cleaner>,
    ) : this(soupMessageHeadersIterPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new MessageHeadersIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<SoupMessageHeadersIter>().ptr)

    public companion object {
        /**
         * Initializes @iter for iterating @hdrs.
         *
         * @param iter a pointer to a %SoupMessageHeadersIter
         *   structure
         * @param hdrs a %SoupMessageHeaders
         */
        public fun `init`(iter: MessageHeadersIter, hdrs: MessageHeaders): Unit =
            soup_message_headers_iter_init(iter.soupMessageHeadersIterPointer, hdrs.soupMessageHeadersPointer)
    }
}
