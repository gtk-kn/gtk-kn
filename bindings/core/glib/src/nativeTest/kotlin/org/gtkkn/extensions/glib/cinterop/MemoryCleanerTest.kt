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

import kotlinx.cinterop.COpaquePointer
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_malloc
import org.gtkkn.native.glib.gpointer
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
        fun createTestPointer(): gpointer = checkNotNull(g_malloc(1.toULong()))
    }
}
