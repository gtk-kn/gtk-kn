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
import kotlin.test.fail

/**
 * Unit tests for `ConcurrentMap`, ensuring correct behavior in single-threaded
 * and multi-threaded scenarios.
 *
 * ## Key Behaviors Tested:
 * - Basic operations (`get`, `put`, `remove`, `clear`).
 * - Thread-safety of `computeIfAbsent`, `computeIfPresent` and `putIfAbsent`
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
     * Verifies that `computeIfPresent` does nothing and returns `null` if the key is not present in the map.
     */
    @Test
    fun `computeIfPresent should do nothing and return null if key is missing`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()

        // Act
        val result = map.computeIfPresent("no-such-key") { _, _ ->
            fail("Block should not be called.")
        }

        // Assert
        assertNull(result)
        assertNull(map["no-such-key"])
    }

    /**
     * Verifies that `computeIfPresent` updates the value for an existing key and returns the updated value.
     */
    @Test
    fun `computeIfPresent should update value for existing key`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["key"] = 5

        // Act
        val result = map.computeIfPresent("key") { _, oldValue ->
            oldValue + 10
        }

        // Assert
        assertEquals(15, result)
        assertEquals(15, map["key"])
    }

    /**
     * Verifies that `computeIfPresent` removes the key if the remapping function returns `null`.
     */
    @Test
    fun `computeIfPresent should remove key if remapping function returns null`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["key"] = 5

        // Act
        val result = map.computeIfPresent("key") { _, _ ->
            null
        }

        // Assert
        assertNull(result)
        assertFalse(map.containsKey("key"))
    }

    /**
     * Verifies that `putIfAbsent` inserts a key-value pair if the key is not already present in the map.
     */
    @Test
    fun `putIfAbsent should insert key and value if key is missing`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()

        // Act
        val previous = map.putIfAbsent("one", 1)

        // Assert
        assertNull(previous)
        assertEquals(1, map["one"])
    }

    /**
     * Verifies that `putIfAbsent` does not overwrite an existing value and returns the current value.
     */
    @Test
    fun `putIfAbsent should not overwrite existing key and should return current value`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["one"] = 100

        // Act
        val previous = map.putIfAbsent("one", 999)

        // Assert
        assertEquals(100, previous)
        assertEquals(100, map["one"])
    }

    /**
     * Verifies that `computeIfPresent` correctly updates a value under concurrent access.
     * Multiple threads attempt to update the same key in the map, and the final result
     * should reflect all successful updates.
     */
    @Test
    fun `computeIfPresent should correctly update value under concurrent access`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        map["sharedKey"] = 0

        val workerCount = 5
        val workers = List(workerCount) { Worker.start() }

        // Each worker tries to increment the value if present.
        val futures = workers.map { worker ->
            worker.execute(
                TransferMode.SAFE,
                { map },
            ) { theMap ->
                repeat(100) {
                    theMap.computeIfPresent("sharedKey") { _, oldValue -> oldValue + 1 }
                }
            }
        }
        futures.forEach { it.result }
        workers.forEach { it.requestTermination().result }

        // Assert
        assertEquals(500, map["sharedKey"], "Final value should reflect all increments.")
    }

    /**
     * Verifies that `putIfAbsent` ensures only one thread inserts a value for a given key
     * under concurrent access, while other threads retrieve the existing value.
     */
    @Test
    fun `putIfAbsent should allow only one thread to insert value under concurrent access`() {
        // Arrange
        val map = ConcurrentMap<String, Int>()
        val workerCount = 5
        val workers = List(workerCount) { Worker.start() }

        // Each worker tries to insert the same key-value pair.
        val futures = workers.map { worker ->
            worker.execute(
                TransferMode.SAFE,
                { map },
            ) { theMap ->
                theMap.putIfAbsent("onlyOne", 999)
            }
        }
        val results = futures.map { it.result }
        workers.forEach { it.requestTermination().result }

        // Assert
        val nullResults = results.count { it == null }
        assertEquals(1, nullResults, "Only one thread should have inserted the value.")
        assertEquals(999, map["onlyOne"], "The value in the map should match the inserted value.")
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
