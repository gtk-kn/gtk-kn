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

package org.gtkkn.extensions.glib.util.log

import kotlin.test.Test
import kotlin.test.assertEquals

class LogLevelTest {
    @Test
    fun `verify enum ordinals`() {
        // Verify each enum entry's ordinal.
        assertEquals(0, LogLevel.DEBUG.ordinal, "DEBUG ordinal should be 0")
        assertEquals(1, LogLevel.INFO.ordinal, "INFO ordinal should be 1")
        assertEquals(2, LogLevel.MESSAGE.ordinal, "MESSAGE ordinal should be 2")
        assertEquals(3, LogLevel.WARNING.ordinal, "WARNING ordinal should be 3")
        assertEquals(4, LogLevel.CRITICAL.ordinal, "CRITICAL ordinal should be 4")
        assertEquals(5, LogLevel.ERROR.ordinal, "ERROR ordinal should be 5")
    }

    @Test
    fun `verify short string representations`() {
        // Check that the first letter of each LogLevel name is returned.
        assertEquals("D", LogLevel.DEBUG.toShortString(), "DEBUG should shorten to 'D'")
        assertEquals("I", LogLevel.INFO.toShortString(), "INFO should shorten to 'I'")
        assertEquals("M", LogLevel.MESSAGE.toShortString(), "MESSAGE should shorten to 'M'")
        assertEquals("W", LogLevel.WARNING.toShortString(), "WARNING should shorten to 'W'")
        assertEquals("C", LogLevel.CRITICAL.toShortString(), "CRITICAL should shorten to 'C'")
        assertEquals("E", LogLevel.ERROR.toShortString(), "ERROR should shorten to 'E'")
    }
}
