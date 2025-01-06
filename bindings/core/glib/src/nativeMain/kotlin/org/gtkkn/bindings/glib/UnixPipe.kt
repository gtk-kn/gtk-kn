// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_80
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GUnixPipe
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A Unix pipe. The advantage of this type over `int[2]` is that it can
 * be closed automatically when it goes out of scope, using `g_auto(GUnixPipe)`,
 * on compilers that support that feature.
 *
 * ## Skipped during bindings generation
 *
 * - field `fds`: Array parameter of type gint is not supported
 *
 * @since 2.80
 */
@GLibVersion2_80
public class UnixPipe(pointer: CPointer<GUnixPipe>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GUnixPipe> = pointer

    /**
     * Allocate a new UnixPipe.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GUnixPipe>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to UnixPipe and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GUnixPipe>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new UnixPipe using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GUnixPipe>().ptr)
}
