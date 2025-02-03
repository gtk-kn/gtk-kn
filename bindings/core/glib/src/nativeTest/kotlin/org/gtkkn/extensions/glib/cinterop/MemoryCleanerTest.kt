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
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_malloc
import org.gtkkn.native.glib.gpointer
import kotlin.native.internal.performGCOnCleanerWorker
import kotlin.native.ref.WeakReference
import kotlin.native.runtime.GC
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

/**
 * This class provides unit tests for the `MemoryCleaner` object.
 *
 * The purpose of these tests is to ensure that native memory management
 * for `Proxy` objects is handled correctly in various scenarios, including:
 *
 * 1. Ensuring owned memory is freed using the correct cleanup function
 *    (`g_free`, `g_boxed_free`, custom free function, or `nativeHeap.free`)
 *    when the object is garbage-collected.
 * 2. Ensuring that non-owned memory is not automatically cleaned up.
 * 3. Verifying that custom cleanup functions work as intended.
 * 4. Testing the behavior of the `Cleaner` and garbage collection mechanism.
 *
 * ### Key Concepts:
 *
 * - **Ownership Semantics:** Determines if the memory associated with a proxy
 *   is cleaned up automatically when garbage-collected. Ownership is managed
 *   using `takeOwnership` and `yieldOwnership`.
 *
 * - **Cleaner:** A Kotlin/Native mechanism that performs cleanup when an
 *   associated object is garbage-collected.
 *
 * - **Mocked Native Functions:** Used to track calls to native cleanup
 *   functions (`g_free`, `g_boxed_free`, `nativeHeap.free`), ensuring no
 *   real resources are allocated or freed.
 *
 * - **Wrapping Lambda:** Used to limit the scope of strong references,
 *   ensuring the garbage collector can collect the `ProxyInstance`.
 *
 * - **Forced Garbage Collection:** Uses `GC.collect()` and
 *   `performGCOnCleanerWorker()` to trigger garbage collection and
 *   cleaner execution.
 */
class MemoryCleanerTest {
    @BeforeTest
    fun setUp() {
        // Use the mock implementation to track calls instead of performing real native free
        MemoryCleaner.nativeFunctions = TestGLib
    }

    /**
     * Tests that a custom cleanup function is called exactly once when the
     * memory is owned and the object is garbage-collected.
     */
    @Test
    fun `custom cleanup function is called once when memory is owned and garbage-collected`() {
        // Arrange
        customFreeFuncCallCount = 0

        val testPointer = createTestPointer()

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testPointer)
            MemoryCleaner.setFreeFunc(proxy, true) { gpointer ->
                customFreeFuncCallCount += 1
                // Manually free the memory for the test
                g_free(gpointer)
            }
            proxyWeakRef = WeakReference(proxy)

            // No strong references to proxy beyond this point
        }()

        // Act
        // Force garbage collection
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNull(proxyWeakRef?.value, "ProxyInstance should have been collected")
        assertEquals(1, customFreeFuncCallCount, "Custom free function should have been called once.")
    }

    @Test
    fun `custom cleanup function is not called if there is still exists a strong reference to the proxy`() {
        // Arrange
        customFreeFuncCallCount = 0

        val testPointer = createTestPointer()

        var proxyStrongRef: ProxyInstance? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testPointer)
            MemoryCleaner.setFreeFunc(proxy, true) { gpointer ->
                customFreeFuncCallCount += 1
                // Manually free the memory for the test
                g_free(gpointer)
            }
            proxyStrongRef = proxy
        }()

        // Act
        // Force garbage collection
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNotNull(proxyStrongRef, "ProxyInstance should have been collected")
        assertEquals(0, customFreeFuncCallCount, "Custom free function should have been called once.")
    }

    /**
     * Tests that `g_boxed_free` is called exactly once when a boxed type
     * is owned and garbage-collected.
     */
    @Test
    fun `g_boxed_free is called once for owned boxed type during garbage collection`() {
        // Arrange
        gBoxedFreeCallCount = 0

        val testAddress = createTestPointer()

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testAddress)
            MemoryCleaner.setBoxedType(proxy, 123UL, true)
            proxyWeakRef = WeakReference(proxy)

            // No strong references to proxy beyond this point
        }()

        // Act
        // Force garbage collection
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNull(proxyWeakRef?.value, "ProxyInstance should have been collected")
        assertEquals(1, gBoxedFreeCallCount, "g_boxed_free should have been called once.")
    }

    /**
     * Tests that `g_free` is called exactly once when the memory is owned
     * and the object is garbage-collected.
     */
    @Test
    fun `g_free is called once when memory is owned and garbage-collected`() {
        // Arrange
        gFreeCallCount = 0

        val testAddress = createTestPointer()

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testAddress)
            MemoryCleaner.takeOwnership(proxy)

            // Keep a weak reference to proxy
            proxyWeakRef = WeakReference(proxy)

            // No strong references to proxy beyond this point
        }()

        // Act
        // Force garbage collection
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNull(proxyWeakRef?.value, "ProxyInstance should have been collected")
        assertEquals(1, gFreeCallCount, "g_free should have been called once.")
    }

    /**
     * Tests that `nativeHeapFree` is called exactly once when the memory is
     * owned and the object is garbage-collected, for memory allocated on the
     * Kotlin/Native heap (using `nativeHeap.alloc`).
     */
    @Test
    fun `nativeHeap free is called once when memory is owned and garbage-collected`() {
        // Arrange
        nativeHeapFreeCount = 0

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            // Allocate a `GError` on the native heap
            val gError: GError = nativeHeap.alloc<GError>()

            // Create a proxy for the allocated memory
            val proxy = ProxyInstance(gError.ptr)

            // Take ownership & configure the memory for native heap cleanup
            MemoryCleaner.setNativeHeap(proxy, true)

            // Keep a weak reference to the proxy
            proxyWeakRef = WeakReference(proxy)

            // No strong references to proxy beyond this point
        }()

        // Act
        // Force garbage collection
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNull(proxyWeakRef?.value, "ProxyInstance should have been collected")
        assertEquals(1, nativeHeapFreeCount, "nativeHeapFree should have been called once.")
    }

    /**
     * Tests that no cleanup function is called when the memory is not owned
     * and the object is garbage-collected.
     */
    @Test
    fun `no cleanup function is called when memory is not owned and garbage-collected`() {
        // Arrange
        customFreeFuncCallCount = 0
        gBoxedFreeCallCount = 0
        gFreeCallCount = 0
        nativeHeapFreeCount = 0

        val testAddress = createTestPointer()

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testAddress)
            MemoryCleaner.yieldOwnership(proxy)
            proxyWeakRef = WeakReference(proxy)

            // No strong references to proxy beyond this point
        }()

        // Act
        // Force garbage collection
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNull(proxyWeakRef?.value, "ProxyInstance should have been collected")
        assertEquals(0, customFreeFuncCallCount, "Custom free function should not have been called.")
        assertEquals(0, gBoxedFreeCallCount, "g_boxed_free should not have been called.")
        assertEquals(0, gFreeCallCount, "g_free should not have been called.")
        assertEquals(0, nativeHeapFreeCount, "nativeHeap.free should not have been called.")

        // Clean up: free the memory manually
        g_free(testAddress)
    }

    /**
     * Companion object containing counters, mock native functions, and utility
     * methods for the tests.
     */
    companion object {
        var customFreeFuncCallCount = 0
        var gBoxedFreeCallCount = 0
        var gFreeCallCount = 0
        var nativeHeapFreeCount = 0

        /**
         * Mock implementation of native functions used for testing.
         */
        object TestGLib : MemoryCleaner.NativeFunctions {
            override fun gBoxedFree(gtype: ULong, boxed: gpointer) {
                gBoxedFreeCallCount += 1
                // Free the memory allocated with g_malloc
                g_free(boxed)
            }

            override fun gFree(mem: gpointer) {
                gFreeCallCount += 1
                // Free the memory allocated with g_malloc
                g_free(mem)
            }

            override fun nativeHeapFree(mem: NativePtr) {
                nativeHeapFreeCount += 1
                nativeHeap.free(mem)
            }
        }

        /**
         * Helper method to allocate memory for testing via g_malloc.
         * For many tests, we just need to verify that `g_free` or `g_boxed_free`
         * is called, so `g_malloc` suffices. For native-heap tests, see the new
         * `nativeHeap free` test.
         */
        fun createTestPointer(): gpointer = checkNotNull(g_malloc(1.toULong()))
    }
}
