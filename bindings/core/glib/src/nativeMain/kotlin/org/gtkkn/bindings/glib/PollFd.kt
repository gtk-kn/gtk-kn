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
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GPollFD
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gushort
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_pollfd_get_type
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Represents a file descriptor, which events to poll for, and which events
 * occurred.
 */
public class PollFd(public val glibPollFdPointer: CPointer<GPollFD>, cleaner: Cleaner? = null) :
    ProxyInstance(glibPollFdPointer) {
    /**
     * the file descriptor to poll (or a HANDLE on Win32)
     */
    public var fd: gint
        get() = glibPollFdPointer.pointed.fd

        @UnsafeFieldSetter
        set(`value`) {
            glibPollFdPointer.pointed.fd = value
        }

    /**
     * a bitwise combination from #GIOCondition, specifying which
     *     events should be polled for. Typically for reading from a file
     *     descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and
     *     for writing you would use %G_IO_OUT | %G_IO_ERR.
     */
    public var events: gushort
        get() = glibPollFdPointer.pointed.events

        @UnsafeFieldSetter
        set(`value`) {
            glibPollFdPointer.pointed.events = value
        }

    /**
     * a bitwise combination of flags from #GIOCondition, returned
     *     from the poll() function to indicate which events occurred.
     */
    public var revents: gushort
        get() = glibPollFdPointer.pointed.revents

        @UnsafeFieldSetter
        set(`value`) {
            glibPollFdPointer.pointed.revents = value
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
    private constructor(
        pair: Pair<CPointer<GPollFD>, Cleaner>,
    ) : this(glibPollFdPointer = pair.first, cleaner = pair.second)

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
     * @param events a bitwise combination from #GIOCondition, specifying which
     *     events should be polled for. Typically for reading from a file
     *     descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and
     *     for writing you would use %G_IO_OUT | %G_IO_ERR.
     * @param revents a bitwise combination of flags from #GIOCondition, returned
     *     from the poll() function to indicate which events occurred.
     */
    public constructor(
        fd: gint,
        events: gushort,
        revents: gushort,
    ) : this() {
        this.fd = fd
        this.events = events
        this.revents = revents
    }

    /**
     * Allocate a new PollFd using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param fd the file descriptor to poll (or a HANDLE on Win32)
     * @param events a bitwise combination from #GIOCondition, specifying which
     *     events should be polled for. Typically for reading from a file
     *     descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and
     *     for writing you would use %G_IO_OUT | %G_IO_ERR.
     * @param revents a bitwise combination of flags from #GIOCondition, returned
     *     from the poll() function to indicate which events occurred.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        fd: gint,
        events: gushort,
        revents: gushort,
        scope: AutofreeScope,
    ) : this(scope) {
        this.fd = fd
        this.events = events
        this.revents = revents
    }

    override fun toString(): String = "PollFd(fd=$fd, events=$events, revents=$revents)"

    public companion object {
        /**
         * Get the GType of PollFD
         *
         * @return the GType
         */
        public fun getType(): GType = g_pollfd_get_type()
    }
}
