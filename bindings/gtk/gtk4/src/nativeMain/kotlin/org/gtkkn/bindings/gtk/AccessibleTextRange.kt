// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gtk.GtkAccessibleTextRange
import kotlin.String

/**
 * A range inside the text of an accessible object.
 * @since 4.14
 */
@GtkVersion4_14
public class AccessibleTextRange(public val gtkAccessibleTextRangePointer: CPointer<GtkAccessibleTextRange>) :
    ProxyInstance(gtkAccessibleTextRangePointer) {
    /**
     * the start of the range, in characters
     */
    public var start: gsize
        get() = gtkAccessibleTextRangePointer.pointed.start

        @UnsafeFieldSetter
        set(`value`) {
            gtkAccessibleTextRangePointer.pointed.start = value
        }

    /**
     * the length of the range, in characters
     */
    public var length: gsize
        get() = gtkAccessibleTextRangePointer.pointed.length

        @UnsafeFieldSetter
        set(`value`) {
            gtkAccessibleTextRangePointer.pointed.length = value
        }

    /**
     * Allocate a new AccessibleTextRange.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GtkAccessibleTextRange>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new AccessibleTextRange using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkAccessibleTextRange>().ptr)

    /**
     * Allocate a new AccessibleTextRange.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param start the start of the range, in characters
     * @param length the length of the range, in characters
     */
    public constructor(start: gsize, length: gsize) : this() {
        this.start = start
        this.length = length
    }

    /**
     * Allocate a new AccessibleTextRange using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param start the start of the range, in characters
     * @param length the length of the range, in characters
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        start: gsize,
        length: gsize,
        scope: AutofreeScope,
    ) : this(scope) {
        this.start = start
        this.length = length
    }

    override fun toString(): String = "AccessibleTextRange(start=$start, length=$length)"
}
