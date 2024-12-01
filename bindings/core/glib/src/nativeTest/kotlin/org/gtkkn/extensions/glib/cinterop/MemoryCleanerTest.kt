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

import kotlinx.cinterop.COpaquePointer
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_malloc
import kotlin.native.internal.performGCOnCleanerWorker
import kotlin.native.ref.WeakReference
import kotlin.native.runtime.GC
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * This class provides unit tests for the `MemoryCleaner` object.
 *
 * The purpose of these tests is to ensure that native memory management
 * for `Proxy` objects is handled correctly in various scenarios, including:
 *
 * 1. Ensuring owned memory is freed using the correct cleanup function
 *    (`g_free`, `g_boxed_free`, or custom free function) when the object
 *    is garbage-collected.
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
 *   functions (`g_free`, `g_boxed_free`), ensuring no real resources are
 *   allocated or freed.
 *
 * - **Wrapping Lambda:** Used to limit the scope of strong references,
 *   ensuring the garbage collector can collect the `ProxyInstance`.
 *
 * - **Forced Garbage Collection:** Uses `GC.collect()` and
 *   `performGCOnCleanerWorker()` to trigger garbage collection and
 *   cleaner execution.
 */
class MemoryCleanerTest {

    /**
     * Tests that `g_free` is called exactly once when the memory is owned
     * and the object is garbage-collected.
     */
    @Test
    fun `g_free is called once when memory is owned and garbage-collected`() {
        // Arrange
        gFreeCallCount = 0
        MemoryCleaner.nativeFunctions = TestGLib

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
     * Tests that `g_boxed_free` is called exactly once when a boxed type
     * is owned and garbage-collected.
     */
    @Test
    fun `g_boxed_free is called once for owned boxed type during garbage collection`() {
        // Arrange
        gBoxedFreeCallCount = 0
        MemoryCleaner.nativeFunctions = TestGLib

        val testAddress = createTestPointer()

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testAddress)
            MemoryCleaner.takeOwnership(proxy)
            MemoryCleaner.setBoxedType(proxy, 123UL)
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
     * Tests that a custom cleanup function is called exactly once when the
     * memory is owned and the object is garbage-collected.
     */
    @Test
    fun `custom cleanup function is called once when memory is owned and garbage-collected`() {
        // Arrange
        customFreeFuncCallCount = 0
        MemoryCleaner.nativeFunctions = TestGLib

        val testAddress = createTestPointer()

        var proxyWeakRef: WeakReference<ProxyInstance>? = null

        // Wrapping lambda to limit scope
        {
            val proxy = ProxyInstance(testAddress)
            MemoryCleaner.takeOwnership(proxy)
            MemoryCleaner.setFreeFunc(proxy) { address ->
                customFreeFuncCallCount += 1
                g_free(address)
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

    /**
     * Tests that no cleanup function is called when the memory is not owned
     * and the object is garbage-collected.
     */
    @Test
    fun `no cleanup function is called when memory is not owned and garbage-collected`() {
        // Arrange
        gFreeCallCount = 0
        gBoxedFreeCallCount = 0
        customFreeFuncCallCount = 0
        MemoryCleaner.nativeFunctions = TestGLib

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
        assertEquals(0, gFreeCallCount, "g_free should not have been called.")
        assertEquals(0, gBoxedFreeCallCount, "g_boxed_free should not have been called.")
        assertEquals(0, customFreeFuncCallCount, "Custom free function should not have been called.")

        // Clean up: free the memory manually
        g_free(testAddress)
    }

    /**
     * Companion object containing counters, mock native functions, and utility
     * methods for the tests.
     */
    companion object {
        var gFreeCallCount = 0
        var gBoxedFreeCallCount = 0
        var customFreeFuncCallCount = 0

        /**
         * Mock implementation of native functions used for testing.
         */
        object TestGLib : MemoryCleaner.NativeFunctions {
            override fun g_free(mem: COpaquePointer?) {
                gFreeCallCount += 1
                // Free the memory allocated with g_malloc
                org.gtkkn.native.glib.g_free(mem)
            }

            override fun g_boxed_free(gtype: ULong, boxed: COpaquePointer?) {
                gBoxedFreeCallCount += 1
                // Free the memory allocated with g_malloc
                org.gtkkn.native.glib.g_free(boxed)
            }
        }

        /**
         * Helper method to allocate memory for testing.
         */
        fun createTestPointer(): COpaquePointer? = g_malloc(1.toULong())
    }
}
