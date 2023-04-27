/*
 * Copyright (c) 2023 gtk-kn
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

import org.gtkkn.bindings.glib.LogLevelFlags
import org.gtkkn.extensions.glib.flagsOf
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BitfieldTests {
    @Test
    fun testFlagsOfSingle() {
        val result = flagsOf(LogLevelFlags.LEVEL_INFO)
        assertEquals(LogLevelFlags.LEVEL_INFO, result)
    }

    @Test
    fun testFlagsOfVarargs1() {
        val expected = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_DEBUG
        val result = flagsOf(LogLevelFlags.LEVEL_INFO, LogLevelFlags.LEVEL_DEBUG)
        assertEquals(expected.mask, result.mask)
    }

    @Test
    fun testFlagsOfVarargsMultiple() {
        val expected = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_DEBUG or LogLevelFlags.LEVEL_WARNING
        val result = flagsOf(LogLevelFlags.LEVEL_INFO, LogLevelFlags.LEVEL_DEBUG, LogLevelFlags.LEVEL_WARNING)
        assertEquals(expected.mask, result.mask)
    }

    @Test
    fun testFlagsOfVarargsDifferent() {
        val illegal = LogLevelFlags.LEVEL_INFO or LogLevelFlags.LEVEL_DEBUG or LogLevelFlags.LEVEL_CRITICAL
        val result = flagsOf(LogLevelFlags.LEVEL_INFO, LogLevelFlags.LEVEL_DEBUG, LogLevelFlags.LEVEL_WARNING)
        assertNotEquals(illegal.mask, result.mask)
    }
}
