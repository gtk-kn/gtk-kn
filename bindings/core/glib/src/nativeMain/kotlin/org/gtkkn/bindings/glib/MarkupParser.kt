// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GMarkupParser

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
public class MarkupParser(public val glibMarkupParserPointer: CPointer<GMarkupParser>) :
    ProxyInstance(glibMarkupParserPointer) {
    /**
     * Allocate a new MarkupParser.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GMarkupParser>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new MarkupParser using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GMarkupParser>().ptr)
}
