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
import org.gtkkn.native.glib.GPollFD
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_pollfd_get_type
import org.gtkkn.native.gobject.gint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Represents a file descriptor, which events to poll for, and which events
 * occurred.
 *
 * ## Skipped during bindings generation
 *
 * - field `events`: gushort
 * - field `revents`: gushort
 */
public class PollFd(pointer: CPointer<GPollFD>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibPollFDPointer: CPointer<GPollFD> = pointer

    /**
     * the file descriptor to poll (or a HANDLE on Win32)
     */
    public var fd: gint
        get() = glibPollFDPointer.pointed.fd

        @UnsafeFieldSetter
        set(`value`) {
            glibPollFDPointer.pointed.fd = value
        }

    /**
     * Allocate a new PollFd.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GPollFD>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PollFd and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GPollFD>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PollFd using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GPollFD>().ptr)

    /**
     * Allocate a new PollFd.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param fd the file descriptor to poll (or a HANDLE on Win32)
     */
    public constructor(fd: gint) : this() {
        this.fd = fd
    }

    /**
     * Allocate a new PollFd using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param fd the file descriptor to poll (or a HANDLE on Win32)
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(fd: gint, scope: AutofreeScope) : this(scope) {
        this.fd = fd
    }

    override fun toString(): String = "PollFd(fd=$fd)"

    public companion object {
        /**
         * Get the GType of PollFD
         *
         * @return the GType
         */
        public fun getType(): GType = g_pollfd_get_type()
    }
}
