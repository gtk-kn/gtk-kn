// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.native.gio.GOutputMessage
import org.gtkkn.native.glib.guint
import kotlin.String

/**
 * Structure used for scatter/gather data output when sending multiple
 * messages or packets in one go. You generally pass in an array of
 * #GOutputVectors and the operation will use all the buffers as if they
 * were one buffer.
 *
 * If @address is null then the message is sent to the default receiver
 * (as previously set by g_socket_connect()).
 *
 * ## Skipped during bindings generation
 *
 * - field `control_messages`: Array parameter of type SocketControlMessage is not supported
 *
 * @since 2.44
 */
@GioVersion2_44
public class OutputMessage(public val gioOutputMessagePointer: CPointer<GOutputMessage>) :
    ProxyInstance(gioOutputMessagePointer) {
    /**
     * a #GSocketAddress, or null
     */
    public var address: SocketAddress?
        get() = gioOutputMessagePointer.pointed.address?.run {
            InstanceCache.get(this, true) { SocketAddress.SocketAddressImpl(reinterpret()) }!!
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputMessagePointer.pointed.address = value?.gioSocketAddressPointer
        }

    /**
     * pointer to an array of output vectors
     */
    public var vectors: OutputVector?
        get() = gioOutputMessagePointer.pointed.vectors?.run {
            OutputVector(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputMessagePointer.pointed.vectors = value?.gioOutputVectorPointer
        }

    /**
     * the number of output vectors pointed to by @vectors.
     */
    public var numVectors: guint
        get() = gioOutputMessagePointer.pointed.num_vectors

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputMessagePointer.pointed.num_vectors = value
        }

    /**
     * initialize to 0. Will be set to the number of bytes
     *     that have been sent
     */
    public var bytesSent: guint
        get() = gioOutputMessagePointer.pointed.bytes_sent

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputMessagePointer.pointed.bytes_sent = value
        }

    /**
     * number of elements in @control_messages.
     */
    public var numControlMessages: guint
        get() = gioOutputMessagePointer.pointed.num_control_messages

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputMessagePointer.pointed.num_control_messages = value
        }

    /**
     * Allocate a new OutputMessage.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GOutputMessage>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new OutputMessage using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GOutputMessage>().ptr)

    /**
     * Allocate a new OutputMessage.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param address a #GSocketAddress, or null
     * @param vectors pointer to an array of output vectors
     * @param numVectors the number of output vectors pointed to by @vectors.
     * @param bytesSent initialize to 0. Will be set to the number of bytes
     *     that have been sent
     * @param numControlMessages number of elements in @control_messages.
     */
    public constructor(
        address: SocketAddress?,
        vectors: OutputVector?,
        numVectors: guint,
        bytesSent: guint,
        numControlMessages: guint,
    ) : this() {
        this.address = address
        this.vectors = vectors
        this.numVectors = numVectors
        this.bytesSent = bytesSent
        this.numControlMessages = numControlMessages
    }

    /**
     * Allocate a new OutputMessage using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param address a #GSocketAddress, or null
     * @param vectors pointer to an array of output vectors
     * @param numVectors the number of output vectors pointed to by @vectors.
     * @param bytesSent initialize to 0. Will be set to the number of bytes
     *     that have been sent
     * @param numControlMessages number of elements in @control_messages.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        address: SocketAddress?,
        vectors: OutputVector?,
        numVectors: guint,
        bytesSent: guint,
        numControlMessages: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.address = address
        this.vectors = vectors
        this.numVectors = numVectors
        this.bytesSent = bytesSent
        this.numControlMessages = numControlMessages
    }

    override fun toString(): String =
        "OutputMessage(address=$address, vectors=$vectors, numVectors=$numVectors, bytesSent=$bytesSent, numControlMessages=$numControlMessages)"
}
