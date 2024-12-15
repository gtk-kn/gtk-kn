// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GOnce
import org.gtkkn.native.glib.gpointer
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A #GOnce struct controls a one-time initialization function. Any
 * one-time initialization function must have its own unique #GOnce
 * struct.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `func`: ThreadFunc
 * - function `init_enter`: In/Out parameter is not supported
 * - parameter `location`: Unsupported pointer to primitive type
 * - parameter `location`: Unsupported pointer to primitive type
 * - function `init_leave`: In/Out parameter is not supported
 * - parameter `location`: Unsupported pointer to primitive type
 *
 * @since 2.4
 */
@GLibVersion2_4
public class Once(pointer: CPointer<GOnce>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibOncePointer: CPointer<GOnce> = pointer

    /**
     * the status of the #GOnce
     */
    public var status: OnceStatus
        get() = glibOncePointer.pointed.status.run {
            OnceStatus.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibOncePointer.pointed.status = value.nativeValue
        }

    /**
     * the value returned by the call to the function, if @status
     *          is %G_ONCE_STATUS_READY
     */
    public var retval: gpointer
        get() = glibOncePointer.pointed.retval!!

        @UnsafeFieldSetter
        set(`value`) {
            glibOncePointer.pointed.retval = value
        }

    /**
     * Allocate a new Once.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GOnce>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Once and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GOnce>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Once using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GOnce>().ptr)

    /**
     * Allocate a new Once.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param status the status of the #GOnce
     * @param retval the value returned by the call to the function, if @status
     *          is %G_ONCE_STATUS_READY
     */
    public constructor(status: OnceStatus, retval: gpointer) : this() {
        this.status = status
        this.retval = retval
    }

    /**
     * Allocate a new Once using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param status the status of the #GOnce
     * @param retval the value returned by the call to the function, if @status
     *          is %G_ONCE_STATUS_READY
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        status: OnceStatus,
        retval: gpointer,
        scope: AutofreeScope,
    ) : this(scope) {
        this.status = status
        this.retval = retval
    }

    override fun toString(): String = "Once(status=$status, retval=$retval)"
}
