// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GPrivate
import org.gtkkn.native.glib.g_private_get
import org.gtkkn.native.glib.g_private_replace
import org.gtkkn.native.glib.g_private_set
import org.gtkkn.native.glib.gpointer
import kotlin.Unit

/**
 * The #GPrivate struct is an opaque data structure to represent a
 * thread-local data key. It is approximately equivalent to the
 * pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
 * TlsSetValue()/TlsGetValue() on Windows.
 *
 * If you don't already know why you might want this functionality,
 * then you probably don't need it.
 *
 * #GPrivate is a very limited resource (as far as 128 per program,
 * shared between all libraries). It is also not possible to destroy a
 * #GPrivate after it has been used. As such, it is only ever acceptable
 * to use #GPrivate in static scope, and even then sparingly so.
 *
 * See G_PRIVATE_INIT() for a couple of examples.
 *
 * The #GPrivate structure should be considered opaque.  It should only
 * be accessed via the g_private_ functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `notify`: DestroyNotify
 */
public class Private(public val glibPrivatePointer: CPointer<GPrivate>) : ProxyInstance(glibPrivatePointer) {
    /**
     * Allocate a new Private.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GPrivate>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Private using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GPrivate>().ptr)

    /**
     * Returns the current value of the thread local variable @key.
     *
     * If the value has not yet been set in this thread, null is returned.
     * Values are never copied between threads (when a new thread is
     * created, for example).
     *
     * @return the thread-local value
     */
    public fun `get`(): gpointer? = g_private_get(glibPrivatePointer)

    /**
     * Sets the thread local variable @key to have the value @value in the
     * current thread.
     *
     * This function differs from g_private_set() in the following way: if
     * the previous value was non-null then the #GDestroyNotify handler for
     * @key is run on it.
     *
     * @param value the new value
     * @since 2.32
     */
    @GLibVersion2_32
    public fun replace(`value`: gpointer? = null): Unit = g_private_replace(glibPrivatePointer, `value`)

    /**
     * Sets the thread local variable @key to have the value @value in the
     * current thread.
     *
     * This function differs from g_private_replace() in the following way:
     * the #GDestroyNotify for @key is not called on the old value.
     *
     * @param value the new value
     */
    public fun `set`(`value`: gpointer? = null): Unit = g_private_set(glibPrivatePointer, `value`)
}
