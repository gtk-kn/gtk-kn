/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.flagsOf
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Unit tests for the `Bitfield` interface and `flagsOf` utility function.
 */
class BitfieldTests {

    /**
     * Test combining a single flag using `flagsOf`.
     */
    @Test
    fun `flagsOf with single flag returns the same flag`() {
        val result = flagsOf(LogLevelFlags.LEVEL_INFO)
        assertEquals(LogLevelFlags.LEVEL_INFO, result, "A single flag should remain unchanged.")
    }

    /**
     * Test combining two flags using `flagsOf` and ensuring the resulting mask is correct.
     */
    @Test
    fun `flagsOf with two flags combines them correctly`() {
        val result = flagsOf(LogLevelFlags.LEVEL_INFO, LogLevelFlags.LEVEL_DEBUG)
        val expected = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_DEBUG
        assertEquals(expected.mask, result.mask, "Two flags should combine into the correct bitfield.")
    }

    /**
     * Test combining multiple flags using `flagsOf` and ensuring the resulting mask is correct.
     */
    @Test
    fun `flagsOf with multiple flags combines them correctly`() {
        val result = flagsOf(
            LogLevelFlags.LEVEL_INFO,
            LogLevelFlags.LEVEL_DEBUG,
            LogLevelFlags.LEVEL_WARNING,
        )
        val expected = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_DEBUG or LogLevelFlags.LEVEL_WARNING
        assertEquals(expected.mask, result.mask, "Multiple flags should combine into the correct bitfield.")
    }

    /**
     * Test the `or` operator directly.
     */
    @Test
    fun `bitwise OR directly combines two flags`() {
        val result = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_WARNING
        val expectedMask = LogLevelFlags.LEVEL_INFO.mask or LogLevelFlags.LEVEL_WARNING.mask
        assertEquals(expectedMask, result.mask, "Direct bitwise OR should produce the correct combined mask.")
    }

    /**
     * Test the `or` operator with multiple combinations.
     */
    @Test
    fun `bitwise OR with multiple flags combines them correctly`() {
        val result = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_DEBUG or LogLevelFlags.LEVEL_MESSAGE
        val expectedMask =
            LogLevelFlags.LEVEL_INFO.mask or LogLevelFlags.LEVEL_DEBUG.mask or LogLevelFlags.LEVEL_MESSAGE.mask
        assertEquals(expectedMask, result.mask, "Direct bitwise OR with multiple flags should combine correctly.")
    }

    /**
     * Test combining flags with internal flags using `flagsOf`.
     */
    @Test
    fun `flagsOf combines internal and log level flags`() {
        val result = flagsOf(LogLevelFlags.FLAG_FATAL, LogLevelFlags.LEVEL_INFO)
        val expected = LogLevelFlags.FLAG_FATAL or LogLevelFlags.LEVEL_INFO
        assertEquals(expected.mask, result.mask, "Internal and log level flags should combine correctly.")
    }
}
