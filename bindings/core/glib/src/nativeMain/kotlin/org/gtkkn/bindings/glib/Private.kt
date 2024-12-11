// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GPrivate
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
 * - method `get`: Return type gpointer is unsupported
 * - parameter `value`: gpointer
 * - parameter `value`: gpointer
 * - parameter `notify`: DestroyNotify
 * - field `p`: Record field p is private
 * - field `notify`: Record field notify is private
 * - field `future`: Record field future is private
 */
public class Private(pointer: CPointer<GPrivate>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibPrivatePointer: CPointer<GPrivate> = pointer

    /**
     * Allocate a new Private.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GPrivate>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Private and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GPrivate>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Private using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GPrivate>().ptr)
}
