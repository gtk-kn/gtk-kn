// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketAddressEnumerator
import org.gtkkn.native.gio.g_socket_address_enumerator_get_type
import org.gtkkn.native.gio.g_socket_address_enumerator_next
import org.gtkkn.native.gio.g_socket_address_enumerator_next_async
import org.gtkkn.native.gio.g_socket_address_enumerator_next_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.Unit

/**
 * `GSocketAddressEnumerator` is an enumerator type for
 * [class@Gio.SocketAddress] instances. It is returned by enumeration functions
 * such as [method@Gio.SocketConnectable.enumerate], which returns a
 * `GSocketAddressEnumerator` to list each [class@Gio.SocketAddress] which could
 * be used to connect to that [iface@Gio.SocketConnectable].
 *
 * Enumeration is typically a blocking operation, so the asynchronous methods
 * [method@Gio.SocketAddressEnumerator.next_async] and
 * [method@Gio.SocketAddressEnumerator.next_finish] should be used where
 * possible.
 *
 * Each `GSocketAddressEnumerator` can only be enumerated once. Once
 * [method@Gio.SocketAddressEnumerator.next] has returned `NULL`, further
 * enumeration with that `GSocketAddressEnumerator` is not possible, and it can
 * be unreffed.
 */
public abstract class SocketAddressEnumerator(
    public val gioSocketAddressEnumeratorPointer: CPointer<GSocketAddressEnumerator>,
) : Object(gioSocketAddressEnumeratorPointer.reinterpret()),
    KGTyped {
    /**
     * Retrieves the next #GSocketAddress from @enumerator. Note that this
     * may block for some amount of time. (Eg, a #GNetworkAddress may need
     * to do a DNS lookup before it can return an address.) Use
     * g_socket_address_enumerator_next_async() if you need to avoid
     * blocking.
     *
     * If @enumerator is expected to yield addresses, but for some reason
     * is unable to (eg, because of a DNS error), then the first call to
     * g_socket_address_enumerator_next() will return an appropriate error
     * in *@error. However, if the first call to
     * g_socket_address_enumerator_next() succeeds, then any further
     * internal errors (other than @cancellable being triggered) will be
     * ignored.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a #GSocketAddress (owned by the caller), or null on
     *     error (in which case *@error will be set) or if there are no
     *     more addresses.
     */
    public open fun next(cancellable: Cancellable? = null): Result<SocketAddress?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_address_enumerator_next(
            gioSocketAddressEnumeratorPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        )?.run {
            SocketAddress.SocketAddressImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously retrieves the next #GSocketAddress from @enumerator
     * and then calls @callback, which must call
     * g_socket_address_enumerator_next_finish() to get the result.
     *
     * It is an error to call this multiple times before the previous callback has finished.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback to call
     *   when the request is satisfied
     */
    public open fun nextAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_socket_address_enumerator_next_async(
            gioSocketAddressEnumeratorPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Retrieves the result of a completed call to
     * g_socket_address_enumerator_next_async(). See
     * g_socket_address_enumerator_next() for more information about
     * error handling.
     *
     * @param result a #GAsyncResult
     * @return a #GSocketAddress (owned by the caller), or null on
     *     error (in which case *@error will be set) or if there are no
     *     more addresses.
     */
    public open fun nextFinish(result: AsyncResult): Result<SocketAddress?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_address_enumerator_next_finish(
            gioSocketAddressEnumeratorPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            SocketAddress.SocketAddressImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The SocketAddressEnumeratorImpl type represents a native instance of the abstract SocketAddressEnumerator class.
     *
     * @constructor Creates a new instance of SocketAddressEnumerator for the provided [CPointer].
     */
    public class SocketAddressEnumeratorImpl(pointer: CPointer<GSocketAddressEnumerator>) :
        SocketAddressEnumerator(pointer)

    public companion object : TypeCompanion<SocketAddressEnumerator> {
        override val type: GeneratedClassKGType<SocketAddressEnumerator> =
            GeneratedClassKGType(getTypeOrNull("g_socket_address_enumerator_get_type")!!) {
                SocketAddressEnumeratorImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SocketAddressEnumerator
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_address_enumerator_get_type()
    }
}
