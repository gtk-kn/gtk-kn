// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTrashStack
import kotlin.String

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.48.
 *
 * `GTrashStack` is deprecated without replacement
 * ---
 *
 * A `GTrashStack` is an efficient way to keep a stack of unused allocated
 * memory chunks. Each memory chunk is required to be large enough to hold
 * a `gpointer`. This allows the stack to be maintained without any space
 * overhead, since the stack pointers can be stored inside the memory chunks.
 *
 * There is no function to create a `GTrashStack`. A `NULL` `GTrashStack*`
 * is a perfectly valid empty stack.
 *
 * Each piece of memory that is pushed onto the stack is cast to a
 * `GTrashStack*`.
 *
 * There is no longer any good reason to use `GTrashStack`.  If you have
 * extra pieces of memory, `free()` them and allocate them again later.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `stack_p`: Unsupported pointer-to-pointer cType GTrashStack**
 * - parameter `stack_p`: Unsupported pointer-to-pointer cType GTrashStack**
 * - parameter `stack_p`: Unsupported pointer-to-pointer cType GTrashStack**
 * - parameter `stack_p`: Unsupported pointer-to-pointer cType GTrashStack**
 */
public class TrashStack(public val glibTrashStackPointer: CPointer<GTrashStack>) :
    ProxyInstance(glibTrashStackPointer) {
    /**
     * pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     */
    public var next: TrashStack?
        get() = glibTrashStackPointer.pointed.next?.run {
            TrashStack(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibTrashStackPointer.pointed.next = value?.glibTrashStackPointer
        }

    /**
     * Allocate a new TrashStack.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GTrashStack>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new TrashStack using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTrashStack>().ptr)

    /**
     * Allocate a new TrashStack.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param next pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     */
    public constructor(next: TrashStack?) : this() {
        this.next = next
    }

    /**
     * Allocate a new TrashStack using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param next pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(next: TrashStack?, scope: AutofreeScope) : this(scope) {
        this.next = next
    }

    override fun toString(): String = "TrashStack(next=$next)"
}
