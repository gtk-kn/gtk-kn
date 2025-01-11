// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GMarkupParser
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Any of the fields in #GMarkupParser can be null, in which case they
 * will be ignored. Except for the @error function, any of these callbacks
 * can set an error; in particular the %G_MARKUP_ERROR_UNKNOWN_ELEMENT,
 * %G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE, and %G_MARKUP_ERROR_INVALID_CONTENT
 * errors are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 *
 * ## Skipped during bindings generation
 *
 * - field `start_element`: Fields with callbacks are not supported
 * - field `end_element`: Fields with callbacks are not supported
 * - field `text`: Fields with callbacks are not supported
 * - field `passthrough`: Fields with callbacks are not supported
 * - field `error`: Fields with callbacks are not supported
 */
public class MarkupParser(public val glibMarkupParserPointer: CPointer<GMarkupParser>, cleaner: Cleaner? = null) :
    ProxyInstance(glibMarkupParserPointer) {
    /**
     * Allocate a new MarkupParser.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GMarkupParser>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to MarkupParser and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GMarkupParser>, Cleaner>,
    ) : this(glibMarkupParserPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new MarkupParser using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GMarkupParser>().ptr)
}
