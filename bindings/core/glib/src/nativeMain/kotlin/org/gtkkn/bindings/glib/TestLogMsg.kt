// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTestLogMsg
import org.gtkkn.native.glib.g_test_log_msg_free
import org.gtkkn.native.glib.guint
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - field `strings`: Unsupported string with cType gchar**
 * - field `nums`: Unsupported pointer to primitive type
 */
public class TestLogMsg(pointer: CPointer<GTestLogMsg>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTestLogMsg> = pointer

    public var logType: TestLogType
        get() = gPointer.pointed.log_type.run {
            TestLogType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.log_type = value.nativeValue
        }

    public var nStrings: guint
        get() = gPointer.pointed.n_strings

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.n_strings = value
        }

    public var nNums: guint
        get() = gPointer.pointed.n_nums

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.n_nums = value
        }

    /**
     * Allocate a new TestLogMsg.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTestLogMsg>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TestLogMsg and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GTestLogMsg>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TestLogMsg using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTestLogMsg>().ptr)

    /**
     * Allocate a new TestLogMsg.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param logType
     * @param nStrings
     * @param nNums
     */
    public constructor(
        logType: TestLogType,
        nStrings: guint,
        nNums: guint,
    ) : this() {
        this.logType = logType
        this.nStrings = nStrings
        this.nNums = nNums
    }

    /**
     * Allocate a new TestLogMsg using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param logType
     * @param nStrings
     * @param nNums
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        logType: TestLogType,
        nStrings: guint,
        nNums: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.logType = logType
        this.nStrings = nStrings
        this.nNums = nNums
    }

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public fun free(): Unit = g_test_log_msg_free(gPointer)

    override fun toString(): String = "TestLogMsg(logType=$logType, nStrings=$nStrings, nNums=$nNums)"
}
