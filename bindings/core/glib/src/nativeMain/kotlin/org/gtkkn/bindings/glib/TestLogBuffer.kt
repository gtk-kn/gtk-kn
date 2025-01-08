// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTestLogBuffer
import org.gtkkn.native.glib.g_test_log_buffer_free
import org.gtkkn.native.glib.g_test_log_buffer_new
import org.gtkkn.native.glib.g_test_log_buffer_pop
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - parameter `bytes`: Unsupported pointer to primitive type
 */
public class TestLogBuffer(pointer: CPointer<GTestLogBuffer>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTestLogBuffer> = pointer

    /**
     * Allocate a new TestLogBuffer.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTestLogBuffer>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TestLogBuffer and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTestLogBuffer>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TestLogBuffer using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTestLogBuffer>().ptr)

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public fun free(): Unit = g_test_log_buffer_free(gPointer)

    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     */
    public fun pop(): TestLogMsg = g_test_log_buffer_pop(gPointer)!!.run {
        TestLogMsg(this)
    }

    public companion object {
        /**
         * Internal function for gtester to decode test log messages, no ABI guarantees provided.
         */
        public fun new(): TestLogBuffer = g_test_log_buffer_new()!!.run {
            TestLogBuffer(this)
        }
    }
}
