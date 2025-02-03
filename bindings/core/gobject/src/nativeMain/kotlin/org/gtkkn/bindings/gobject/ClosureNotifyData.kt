// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GClosureNotifyData
import kotlin.String

/**
 * ## Skipped during bindings generation
 *
 * - field `notify`: ClosureNotify
 */
public class ClosureNotifyData(public val gobjectClosureNotifyDataPointer: CPointer<GClosureNotifyData>) :
    ProxyInstance(gobjectClosureNotifyDataPointer) {
    public var `data`: gpointer
        get() = gobjectClosureNotifyDataPointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            gobjectClosureNotifyDataPointer.pointed.data = value
        }

    /**
     * Allocate a new ClosureNotifyData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GClosureNotifyData>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new ClosureNotifyData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GClosureNotifyData>().ptr)

    /**
     * Allocate a new ClosureNotifyData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data
     */
    public constructor(`data`: gpointer) : this() {
        this.data = data
    }

    /**
     * Allocate a new ClosureNotifyData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`data`: gpointer, scope: AutofreeScope) : this(scope) {
        this.data = data
    }

    override fun toString(): String = "ClosureNotifyData(data=$data)"
}
