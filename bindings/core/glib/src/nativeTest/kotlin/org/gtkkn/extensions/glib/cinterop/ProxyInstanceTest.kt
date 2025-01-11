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
