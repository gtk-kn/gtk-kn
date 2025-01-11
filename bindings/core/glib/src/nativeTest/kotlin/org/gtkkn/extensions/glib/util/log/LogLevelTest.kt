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
