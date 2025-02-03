/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.glib.cinterop

import kotlinx.cinterop.NativePtr
import kotlinx.cinterop.nativeHeap
import org.gtkkn.extensions.GtkKn
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.Cached.FreeOperation
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.takeOwnership
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.yieldOwnership
import org.gtkkn.extensions.glib.collections.ConcurrentMap
import org.gtkkn.extensions.glib.util.log.LogLevel
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.native.ref.createCleaner

/*
 * Portions of this class are inspired by the open-source project Java-GI.
 * Original source: https://github.com/jwharm/java-gi/
 */
/**
 * `MemoryCleaner` manages the cleanup of native memory associated with `Proxy` objects.
 *
 * ### Key Responsibilities
 * - Maintains a cache of all memory addresses associated with `Proxy` objects (except `GObject` instances).
 * - Releases native memory automatically when owned `Proxy` objects are garbage-collected.
 * - Supports different cleanup methods:
 *   - **Boxed Type Cleanup:** Uses `g_boxed_free` for specific data structures.
 *   - **Custom Cleanup:** Allows specifying a custom cleanup function.
 *   - **Native Heap Cleanup:** Uses `nativeHeap.free` to free memory allocated on the native heap.
 *   - **Fallback Cleanup:** Uses `g_free` as a fallback.
 * - Enables transferring ownership of native memory to and from native code.
 *
 * ### Ownership Semantics
 * - **Owned Memory:** Automatically cleaned up when the associated `Proxy` object is garbage-collected.
 * - **Non-Owned Memory:** Not automatically cleaned up; must be manually managed or transferred.
 * - Ownership can be managed using [takeOwnership] and [yieldOwnership].
 *
 * ### Thread Safety
 * All operations involving the cache are thread-safe, using a `ReentrantLock` to ensure synchronization.
 */
public object MemoryCleaner {
    /**
     * The native functions used by this cleaner to deallocate memory.
     *
     * In production, [NativeFunctionsImpl] is used, which delegates to real
     * native functions like `g_free` and `g_boxed_free`. In test environments,
     * this may be overridden with a mock implementation.
     */
    internal var nativeFunctions: NativeFunctions = NativeFunctionsImpl
    private val cache = ConcurrentMap<gpointer, Cached>()

    /**
     * Transfers ownership of the memory to the `MemoryCleaner`.
     *
     * When the associated `Proxy` object is garbage-collected, the memory will be released.
     *
     * @param proxy The `Proxy` instance.
     */
    public fun takeOwnership(proxy: Proxy) {
        log { "Taking ownership of ${proxy.getSimpleNameWithHandle()}" }
        registerOrUpdate(proxy, owned = true)
    }

    /**
     * Yields ownership of the memory, preventing automatic cleanup.
     *
     * The memory will not be released when the associated `Proxy` object is garbage-collected.
     *
     * @param proxy The `Proxy` instance.
     */
    public fun yieldOwnership(proxy: Proxy) {
        log { "Yield ownership of ${proxy.getSimpleNameWithHandle()}" }
        registerOrUpdate(proxy, owned = false)
    }

    /**
     * Sets a custom cleanup function for the specified `Proxy` instance.
     *
     * This function overrides the default cleanup mechanism (`g_free`).
     *
     * By default, it also marks the memory as owned (`owned = true`),
     * so you do not need to call [takeOwnership] explicitly.
     *
     * @param proxy The `Proxy` instance.
     * @param owned Whether the memory should be owned (default is `true`).
     * @param freeFunc A lambda function to perform the cleanup.
     */
    public fun setFreeFunc(
        proxy: Proxy,
        owned: Boolean,
        freeFunc: (gpointer) -> Unit,
    ) {
        registerOrUpdate(
            proxy = proxy,
            owned = owned,
            freeOperation = FreeOperation.CustomFreeFunction(freeFunc),
        )
    }

    /**
     * Configures cleanup for a boxed type using `g_boxed_free`.
     *
     * This method is useful for data structures that require special handling.
     *
     * By default, it also marks the memory as owned (`owned = true`).
     *
     * @param proxy The [Proxy] instance.
     * @param boxedType The [GType] representing the boxed type.
     * @param owned Whether the memory should be owned (default is `true`).
     */
    public fun setBoxedType(
        proxy: Proxy,
        boxedType: GType,
        owned: Boolean,
    ) {
        registerOrUpdate(
            proxy = proxy,
            owned = owned,
            freeOperation = FreeOperation.BoxedType(boxedType),
        )
    }

    /**
     * Configures the memory to be freed from the native heap.
     *
     * This method is useful when your `Proxy` object points to memory allocated directly
     * on the Kotlin/Native heap via `nativeHeap.alloc` or similar methods.
     *
     * By default, it also marks the memory as owned (`owned = true`).
     *
     * @param proxy The `Proxy` instance representing the allocated memory.
     * @param owned Whether the memory should be owned (default is `true`).
     */
    public fun setNativeHeap(
        proxy: Proxy,
        owned: Boolean,
    ) {
        registerOrUpdate(
            proxy = proxy,
            owned = owned,
            freeOperation = FreeOperation.NativeHeap,
        )
    }

    /**
     * Manually frees the memory associated with the specified address.
     *
     * This method ensures the memory is removed from the cache and releases it using the appropriate cleanup function.
     *
     * @param cPointer The memory address to free.
     */
    public fun free(cPointer: gpointer) {
        removeAndFreeIfOwned(cPointer)
    }

    /**
     * Registers or updates a memory address with the given ownership and free operation.
     *
     * @param proxy The `Proxy` instance representing the native memory.
     * @param owned An optional override for the `owned` status.
     *              If `null`, use the existing status (or `false` if newly created).
     * @param freeOperation An optional override for the `freeOperation`.
     *                      If `null`, use the existing operation (or `GFree` if newly created).
     * @return The updated (or newly created) [Cached] data.
     */
    private fun registerOrUpdate(
        proxy: Proxy,
        owned: Boolean? = null,
        freeOperation: FreeOperation? = null
    ): Cached {
        val handle = proxy.handle
        log { "registerOrUpdate ${proxy.getSimpleNameWithHandle()}, owned=$owned, freeOp=$freeOperation" }
        var cached = cache[handle]

        if (cached == null) {
            // First time registering this pointer
            log { "Cache miss for   ${proxy.getSimpleNameWithHandle()}" }
            // The cleaner must be stored inside `proxy` to prevent premature execution, ensuring
            // that the structFinalizer is only executed when `proxy` is truly no longer reachable.
            proxy.addCleaner(createCleaner(proxy.handle) { res -> structFinalizer(res) })
            cached = Cached(
                owned = owned ?: false,
                freeOperation = freeOperation ?: FreeOperation.GFree,
            )
            cache[handle] = cached
        } else {
            // Possibly update ownership or freeOperation if there's a change
            val newOwned = owned ?: cached.owned
            val newFreeOp = freeOperation ?: cached.freeOperation

            if (newOwned != cached.owned || newFreeOp != cached.freeOperation) {
                cached = cached.copy(owned = newOwned, freeOperation = newFreeOp)
                cache[handle] = cached
                log { "Updated cache for ${proxy.getSimpleNameWithHandle()} => owned=$newOwned, freeOp=$newFreeOp" }
            } else {
                log { "No cache changes needed for ${proxy.getSimpleNameWithHandle()}" }
            }
        }
        return cached
    }

    /**
     * Finalizes the cleanup of a `Proxy` object when it becomes unreachable.
     *
     * This method is called automatically by the `Cleaner` associated with the proxy.
     *
     * @param handle The `gpointer` of the object to finalize.
     */
    private fun structFinalizer(handle: gpointer) {
        val cPointer: gpointer = handle
        removeAndFreeIfOwned(cPointer)
    }

    /**
     * Removes a cached entry from the cache and performs the appropriate cleanup operation.
     *
     * @param cPointer The memory address.
     */
    private fun removeAndFreeIfOwned(cPointer: gpointer) {
        val cached = cache[cPointer]
        if (cached != null) {
            log { "Removing ${cPointer.rawValue} from cache" }
            cache.remove(cPointer)
            if (cached.owned) {
                runFreeOperation(cPointer, cached.freeOperation)
            }
        }
    }

    /**
     * Executes the appropriate cleanup function for a memory address.
     *
     * The function selection follows this order:
     * 1. If a boxed type is specified, use `g_boxed_free`.
     * 2. If a custom free function is specified, use it.
     * 3. If `FreeOperation.NativeHeap` is configured, use `nativeHeap.free`.
     * 4. Otherwise, fallback to `g_free`.
     *
     * @param cPointer The memory address.
     * @param freeOperation The [FreeOperation] that should be used for cleanup.
     */
    private fun runFreeOperation(
        cPointer: gpointer,
        freeOperation: FreeOperation,
    ) {
        when (freeOperation) {
            is FreeOperation.BoxedType -> {
                log { "g_boxed_free(${freeOperation.gType}, $cPointer)" }
                nativeFunctions.gBoxedFree(freeOperation.gType, cPointer)
            }

            is FreeOperation.CustomFreeFunction -> {
                log { "freeFunc(${cPointer.rawValue})" }
                freeOperation.freeFunc(cPointer)
            }

            is FreeOperation.NativeHeap -> {
                log { "nativeHeap.free(${cPointer.rawValue})" }
                nativeFunctions.nativeHeapFree(cPointer.rawValue)
            }

            is FreeOperation.GFree -> {
                log { "g_free(${cPointer.rawValue})" }
                nativeFunctions.gFree(cPointer)
            }
        }
    }

    /**
     * Logs a debug message if [debugLogs] is enabled.
     */
    private inline fun log(
        domain: String? = "MemoryCleaner",
        level: LogLevel = LogLevel.DEBUG,
        message: () -> String
    ) {
    if (GtkKn.debugLogs) {
            org.gtkkn.extensions.glib.util.log.log(domain, level, message)
        }
    }

    /**
     * Represents cached metadata for a memory address.
     *
     * @param owned Indicates if the memory is owned by the `MemoryCleaner`.
     * @param freeOperation The [FreeOperation] that should be used for cleanup.
     */
    private data class Cached(
        val owned: Boolean,
        val freeOperation: FreeOperation,
    ) {
        sealed class FreeOperation {
            data class BoxedType(val gType: GType) : FreeOperation()
            data class CustomFreeFunction(val freeFunc: ((gpointer) -> Unit)) : FreeOperation()
            data object GFree : FreeOperation()
            data object NativeHeap : FreeOperation()
        }
    }

    /**
     * Interface for native cleanup functions.
     *
     * This interface abstracts native function calls (`g_free`, `g_boxed_free`, and `nativeHeap.free`)
     * to allow for dependency injection during testing.
     *
     * - **In Testing:** A mock implementation (`TestGLib`) replaces the default
     *   `NativeFunctionsImpl` to track calls and avoid actual resource allocation/deallocation.
     * - **In Production:** The `NativeFunctionsImpl` provides the real implementation,
     *   invoking actual native cleanup functions.
     */
    internal interface NativeFunctions {
        fun gBoxedFree(gtype: ULong, boxed: gpointer)
        fun gFree(mem: gpointer)
        fun nativeHeapFree(mem: NativePtr)
    }

    /**
     * Default implementation of native cleanup functions for production use.
     *
     * This implementation directly calls the native functions `g_free`, `g_boxed_free`,
     * and `nativeHeap.free` from their respective libraries.
     */
    public object NativeFunctionsImpl : NativeFunctions {
        override fun gBoxedFree(gtype: ULong, boxed: gpointer) {
            org.gtkkn.native.gobject.g_boxed_free(gtype, boxed)
        }

        override fun gFree(mem: gpointer) {
            org.gtkkn.native.glib.g_free(mem)
        }

        override fun nativeHeapFree(mem: NativePtr) {
            nativeHeap.free(mem)
        }
    }
}
