/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.glib.cinterop

import kotlinx.atomicfu.locks.ReentrantLock
import kotlinx.atomicfu.locks.withLock
import kotlinx.cinterop.COpaquePointer
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.setBoxedType
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.setFreeFunc
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.takeOwnership
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.yieldOwnership
import kotlin.native.ref.createCleaner

/**
 * `MemoryCleaner` manages the cleanup of native memory associated with `Proxy` objects.
 *
 * ### Key Responsibilities
 * - Maintains a cache of all memory addresses associated with `Proxy` objects (except `GObject` instances).
 * - Releases native memory automatically when owned `Proxy` objects are garbage-collected.
 * - Supports different cleanup methods:
 *   - **Boxed Type Cleanup:** Uses `g_boxed_free` for specific data structures.
 *   - **Custom Cleanup:** Allows specifying a custom cleanup function.
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
 *
 * ### Usage
 * - Register a `Proxy` object using internal mechanisms like `getOrRegister`.
 * - Configure cleanup using [setFreeFunc] for custom functions or [setBoxedType] for boxed types.
 * - Use [takeOwnership] to enable automatic cleanup or [yieldOwnership] to disable it.
 *
 * @constructor This object cannot be instantiated directly; it is a singleton.
 */
public object MemoryCleaner {
    internal var nativeFunctions: NativeFunctions = NativeFunctionsImpl
    private val cache = mutableMapOf<COpaquePointer?, Cached>()
    private val lock = ReentrantLock()

    /**
     * Registers a memory address for cleanup when its associated `Proxy` is garbage-collected.
     *
     * @param proxy The `Proxy` instance representing the native memory.
     * @return The cached metadata for the memory address.
     */
    private fun getOrRegister(proxy: Proxy): Cached {
        val cPointer = proxy.handle
        lock.withLock {
            var cached = cache[cPointer]
            if (cached == null) {
                createCleaner(proxy) { res ->
                    structFinalizer(res)
                }
                cached = Cached(
                    owned = false,
                    freeFunc = null,
                    boxedType = null,
                )
                cache[cPointer] = cached
            }
            return cached
        }
    }

    /**
     * Sets a custom cleanup function for the specified `Proxy` instance.
     *
     * This function overrides the default cleanup mechanisms (`g_boxed_free` or `g_free`).
     *
     * @param proxy The `Proxy` instance.
     * @param freeFunc A lambda function to perform the cleanup.
     */
    public fun setFreeFunc(proxy: Proxy, freeFunc: (COpaquePointer?) -> Unit) {
        lock.withLock {
            val cached = getOrRegister(proxy)
            cache[proxy.handle] = cached.copy(freeFunc = freeFunc)
        }
    }

    /**
     * Configures cleanup for a boxed type using `g_boxed_free`.
     *
     * This method is useful for data structures that require special handling.
     *
     * @param proxy The `Proxy` instance.
     * @param boxedType The `Type` representing the boxed type.
     */
    public fun setBoxedType(proxy: Proxy, boxedType: Type) {
        lock.withLock {
            val cached = getOrRegister(proxy)
            cache[proxy.handle] = cached.copy(boxedType = boxedType)
        }
    }

    /**
     * Transfers ownership of the memory to the `MemoryCleaner`.
     *
     * When the associated `Proxy` object is garbage-collected, the memory will be released.
     *
     * @param proxy The `Proxy` instance.
     */
    public fun takeOwnership(proxy: Proxy) {
        lock.withLock {
            val cached = getOrRegister(proxy)
            cache[proxy.handle] = cached.copy(owned = true)
        }
    }

    /**
     * Yields ownership of the memory, preventing automatic cleanup.
     *
     * The memory will not be released when the associated `Proxy` object is garbage-collected.
     *
     * @param proxy The `Proxy` instance.
     */
    public fun yieldOwnership(proxy: Proxy) {
        lock.withLock {
            val cached = getOrRegister(proxy)
            cache[proxy.handle] = cached.copy(owned = false)
        }
    }

    /**
     * Manually frees the memory associated with the specified address.
     *
     * This method ensures the memory is removed from the cache and releases it using the appropriate cleanup function.
     *
     * @param cPointer The memory address to free.
     */
    public fun free(cPointer: COpaquePointer?) {
        lock.withLock {
            val cached = cache[cPointer]
            if (cached != null) {
                cache.remove(cPointer)
                if (cached.owned) {
                    runFreeFunction(cPointer, cached.freeFunc, cached.boxedType)
                }
            }
        }
    }

    /**
     * Finalizes the cleanup of a `Proxy` object when it becomes unreachable.
     *
     * This method is called automatically by the `Cleaner` associated with the proxy.
     *
     * @param proxy The `Proxy` object to finalize.
     */
    private fun structFinalizer(proxy: Proxy) {
        val cPointer = proxy.handle
        lock.withLock {
            val cached = cache[cPointer]
            if (cached != null) {
                cache.remove(cPointer)
                if (cached.owned) {
                    runFreeFunction(cPointer, cached.freeFunc, cached.boxedType)
                }
            }
        }
    }

    /**
     * Executes the appropriate cleanup function for a memory address.
     *
     * The function selection follows this order:
     * 1. If a boxed type is specified, use `g_boxed_free`.
     * 2. If a custom free function is specified, use it.
     * 3. Otherwise, fallback to `g_free`.
     *
     * @param cPointer The memory address.
     * @param freeFunc The custom free function (if specified).
     * @param boxedType The boxed type (if specified).
     */
    private fun runFreeFunction(
        cPointer: COpaquePointer?,
        freeFunc: ((COpaquePointer?) -> Unit)?,
        boxedType: Type?
    ) {
        when {
            boxedType != null -> nativeFunctions.g_boxed_free(boxedType, cPointer)
            freeFunc != null -> freeFunc(cPointer)
            else -> nativeFunctions.g_free(cPointer)
        }
    }

    /**
     * Represents cached metadata for a memory address.
     *
     * @param owned Indicates if the memory is owned by the `MemoryCleaner`.
     * @param freeFunc An optional custom free function for cleanup.
     * @param boxedType An optional boxed type for cleanup using `g_boxed_free`.
     */
    private data class Cached(
        val owned: Boolean,
        val freeFunc: ((COpaquePointer?) -> Unit)?,
        val boxedType: Type?,
    )

    /**
     * Interface for native cleanup functions.
     *
     * This interface abstracts native function calls (`g_free` and `g_boxed_free`)
     * to allow for dependency injection during testing.
     *
     * - **In Testing:** A mock implementation (`TestGLib`) replaces the default
     *   `NativeFunctionsImpl` to track calls and avoid actual resource allocation or deallocation.
     * - **In Production:** The `NativeFunctionsImpl` provides the real implementation,
     *   invoking actual native cleanup functions.
     */
    @Suppress("all")
    internal interface NativeFunctions {
        fun g_free(mem: COpaquePointer?)
        fun g_boxed_free(gtype: ULong, boxed: COpaquePointer?)
    }

    /**
     * Default implementation of native cleanup functions for production use.
     *
     * This implementation directly calls the native functions `g_free` and `g_boxed_free`
     * from their respective libraries (`glib` and `gobject`).
     */
    public object NativeFunctionsImpl : NativeFunctions {
        override fun g_free(mem: COpaquePointer?) {
            org.gtkkn.native.glib.g_free(mem)
        }

        override fun g_boxed_free(gtype: ULong, boxed: COpaquePointer?) {
            org.gtkkn.native.gobject.g_boxed_free(gtype, boxed)
        }
    }
}

public typealias Type = ULong
