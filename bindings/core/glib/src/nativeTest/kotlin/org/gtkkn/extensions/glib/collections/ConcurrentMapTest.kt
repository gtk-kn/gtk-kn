/*
 * Copyright (c) 2025 gtk-kn
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

package org.gtkkn.extensions.glib.collections

import kotlin.concurrent.AtomicInt
import kotlin.native.concurrent.ObsoleteWorkersApi
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.Worker
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Unit tests for `ConcurrentMap`, ensuring correct behavior in single-threaded
 * and multi-threaded scenarios.
 *
 * ## Key Behaviors Tested:
 * - Basic operations (`get`, `put`, `remove`, `clear`).
 * - Thread-safety of `computeIfAbsent`.
 * - Consistency of `equals` and `hashCode`.
 */
@OptIn(ObsoleteWorkersApi::class)
class ConcurrentMapTest {
    /**
     * Verifies that `get` returns `null` when a key is not present.
     */
    @Test
    fun `get should return null for missing key`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()

        // Act & Assert
        assertNull(map["no-such-key"])
    }

    /**
     * Verifies that `put` adds a key-value pair to the map.
     */
    @Test
    fun `put should add a key and value`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()

        // Act
        val oldValue = map.put("one", 1)

        // Assert
        assertNull(oldValue)
        assertEquals(1, map["one"])
    }

    /**
     * Verifies that `put` returns the old value if the key exists.
     */
    @Test
    fun `put should return old value if key exists`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["one"] = 1

        // Act
        val oldValue = map.put("one", 2)

        // Assert
        assertEquals(1, oldValue)
        assertEquals(2, map["one"])
    }

    /**
     * Verifies that `remove` removes an existing entry and returns its value.
     */
    @Test
    fun `remove should return the removed value`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["one"] = 1

        // Act
        val removedValue = map.remove("one")

        // Assert
        assertEquals(1, removedValue)
        assertNull(map["one"])
    }

    /**
     * Verifies that `remove` returns `null` when the key does not exist.
     */
    @Test
    fun `remove should return null for missing key`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()

        // Act
        val removedValue = map.remove("nope")

        // Assert
        assertNull(removedValue)
    }

    /**
     * Verifies that `remove` with key and value only removes the entry if they match.
     */
    @Test
    fun `remove key and value should remove matching entry`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["one"] = 1

        // Act & Assert
        assertTrue(map.remove("one", 1))
        assertNull(map["one"])
    }

    /**
     * Verifies that `remove` with key and value does not remove the entry if the value does not match.
     */
    @Test
    fun `remove key and value should not remove entry if value does not match`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["one"] = 1

        // Act & Assert
        assertFalse(map.remove("one", 2))
        assertEquals(1, map["one"])
    }

    /**
     * Verifies that `clear` empties the map.
     */
    @Test
    fun `clear should empty the map`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["one"] = 1
        map["two"] = 2

        // Act
        map.clear()

        // Assert
        assertEquals(0, map.size)
        assertNull(map["one"])
        assertNull(map["two"])
    }

    /**
     * Verifies that `computeIfAbsent` computes the value only once in a single-threaded scenario.
     */
    @Test
    fun `computeIfAbsent should compute value only once in single-threaded scenario`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        var calls = 0

        // Act
        val result1 = map.computeIfAbsent("test") {
            calls++
            42
        }
        val result2 = map.computeIfAbsent("test") {
            calls++
            99
        }

        // Assert
        assertEquals(42, result1)
        assertEquals(42, result2)
        assertEquals(1, calls, "Block should be called exactly once.")
    }

    /**
     * Verifies that `computeIfAbsent` is thread-safe and the block is called exactly once.
     */
    @Test
    fun `computeIfAbsent should be thread-safe and compute block is called once`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        val callCount = AtomicInt(0)
        val workerCount = 10
        val workers = List(workerCount) { Worker.start() }

        // Act
        val futures = workers.map { worker ->
            worker.execute(
                TransferMode.SAFE,
                { map to callCount },
            ) { (theMap, counter) ->
                theMap.computeIfAbsent("foo") {
                    counter.addAndGet(1)
                }
            }
        }
        val results = futures.map { it.result }
        workers.forEach { it.requestTermination().result }

        // Assert
        assertTrue(results.all { it == results.first() }, "All concurrent results must match.")
        assertEquals(1, callCount.value, "Block should be called exactly once.")
        assertEquals(1, map.size)
        assertEquals(results.first(), map["foo"])
    }

    /**
     * Verifies that `equals` and `hashCode` behave consistently.
     */
    @Test
    fun `equals and hashCode should behave consistently`() {
        // Arrange
        val map1 = ConcurrentMap<String, Int>()
        val map2 = ConcurrentMap<String, Int>()

        // Act & Assert
        assertEquals(map1, map2)
        assertEquals(map1.hashCode(), map2.hashCode())

        map1["one"] = 1
        map1["two"] = 2

        assertNotEquals(map1, map2)

        map2["one"] = 1
        map2["two"] = 2

        assertEquals(map1, map2)
        assertEquals(map1.hashCode(), map2.hashCode())
    }
}
