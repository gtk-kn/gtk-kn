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

package org.gtkkn.extensions.glib.util.log

import kotlin.test.Test
import kotlin.test.assertEquals

class LogLevelTest {
    @Test
    fun ordinalDebug() {
        assertEquals(0, LogLevel.DEBUG.ordinal)
    }

    @Test
    fun ordinalInfo() {
        assertEquals(1, LogLevel.INFO.ordinal)
    }

    @Test
    fun ordinalMessage() {
        assertEquals(2, LogLevel.MESSAGE.ordinal)
    }

    @Test
    fun ordinalWarning() {
        assertEquals(3, LogLevel.WARNING.ordinal)
    }

    @Test
    fun ordinalCritical() {
        assertEquals(4, LogLevel.CRITICAL.ordinal)
    }

    @Test
    fun ordinalError() {
        assertEquals(5, LogLevel.ERROR.ordinal)
    }
}
