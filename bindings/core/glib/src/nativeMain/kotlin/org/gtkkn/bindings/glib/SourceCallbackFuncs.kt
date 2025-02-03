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
import org.gtkkn.native.glib.GSourceCallbackFuncs

/**
 * The `GSourceCallbackFuncs` struct contains
 * functions for managing callback objects.
 *
 * ## Skipped during bindings generation
 *
 * - field `ref`: Fields with callbacks are not supported
 * - field `unref`: Fields with callbacks are not supported
 * - field `get`: Fields with callbacks are not supported
 */
public class SourceCallbackFuncs(public val glibSourceCallbackFuncsPointer: CPointer<GSourceCallbackFuncs>) :
    ProxyInstance(glibSourceCallbackFuncsPointer) {
    /**
     * Allocate a new SourceCallbackFuncs.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GSourceCallbackFuncs>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new SourceCallbackFuncs using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GSourceCallbackFuncs>().ptr)
}
