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

import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_malloc
import org.gtkkn.native.glib.gpointer
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

/**
 * This class provides unit tests for the [ProxyInstance] class.
 *
 * The purpose of these tests is to ensure that native pointer references,
 * equality checks, and hash code calculations behave correctly in various
 * scenarios.
 */
class ProxyInstanceTest {
    /**
     * Tests that creating a [ProxyInstance] with a valid pointer
     * assigns the handle properly.
     */
    @Test
    fun `creates proxy instance with valid pointer`() {
        // Arrange
        val testPointer = createTestPointer()

        // Act
        val proxy = ProxyInstance(testPointer)

        // Assert
        assertEquals(testPointer, proxy.handle, "Expected the handle to match the allocated pointer")

        // Clean up
        g_free(testPointer)
    }

    /**
     * Tests that two [ProxyInstance] objects with the same handle
     * are considered equal.
     */
    @Test
    fun `two instances with the same pointer are equal`() {
        // Arrange
        val testPointer = createTestPointer()

        // Act
        val proxy1 = ProxyInstance(testPointer)
        val proxy2 = ProxyInstance(testPointer)

        // Assert
        assertEquals(proxy1, proxy2, "Two proxy instances sharing the same pointer should be equal")
        assertEquals(proxy1.hashCode(), proxy2.hashCode(), "Hash codes should match for the same pointer")

        // Clean up
        g_free(testPointer)
    }

    /**
     * Tests that two [ProxyInstance] objects with different handles
     * are not considered equal.
     */
    @Test
    fun `two instances with different pointers are not equal`() {
        // Arrange
        val testPointer1 = createTestPointer()
        val testPointer2 = createTestPointer()

        // Act
        val proxy1 = ProxyInstance(testPointer1)
        val proxy2 = ProxyInstance(testPointer2)

        // Assert
        assertNotEquals(proxy1, proxy2, "Proxy instances with different pointers should not be equal")
        assertNotEquals(proxy1.hashCode(), proxy2.hashCode(), "Hash codes should differ for different pointers")

        // Clean up
        g_free(testPointer1)
        g_free(testPointer2)
    }

    /**
     * Tests that comparing a [ProxyInstance] object to `null`
     * returns `false`.
     */
    @Test
    fun `comparing proxy instance to null returns false`() {
        // Arrange
        val testPointer = createTestPointer()
        val proxy = ProxyInstance(testPointer)

        // Act & Assert
        @Suppress("EqualsNullCall")
        assertFalse(proxy.equals(null), "A proxy instance should not be equal to null")

        // Clean up
        g_free(testPointer)
    }

    /**
     * Tests that comparing a [ProxyInstance] to an object of
     * a different type returns `false`.
     */
    @Test
    fun `comparing proxy instance to different type returns false`() {
        // Arrange
        val testPointer = createTestPointer()
        val proxy = ProxyInstance(testPointer)

        // Act & Assert
        assertFalse(proxy.equals("string"), "A proxy instance should not be equal to a non-ProxyInstance type")

        // Clean up
        g_free(testPointer)
    }

    /**
     * Tests the reflexivity of `equals` by comparing
     * an object with itself.
     */
    @Test
    fun `same object reference is recognized as equal`() {
        // Arrange
        val testPointer = createTestPointer()
        val proxy = ProxyInstance(testPointer)

        // Act & Assert
        assertTrue(proxy.equals(proxy), "A proxy instance should be equal to itself")

        // Clean up
        g_free(testPointer)
    }

    /**
     * Companion object containing utility methods for the tests.
     */
    companion object {
        /**
         * Allocates a single byte of native memory for testing. This memory
         * should be freed using [g_free].
         *
         * @return a non-null [gpointer] representing the allocated memory.
         */
        fun createTestPointer(): gpointer = checkNotNull(g_malloc(1.toULong()))
    }
}
