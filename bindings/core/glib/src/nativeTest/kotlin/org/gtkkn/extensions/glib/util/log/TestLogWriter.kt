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

import org.gtkkn.extensions.glib.util.log.writer.LogWriter
import kotlin.concurrent.AtomicReference

/**
 * A test logger implementation for logging in tests.
 */
class TestLogWriter(private val isLoggableFn: (LogLevel) -> Boolean = { true }) : LogWriter {
    private var _latestLog: AtomicReference<TestLog?> = AtomicReference(null)
    var latestLog: TestLog?
        get() = _latestLog.value
        set(value) {
            _latestLog.value = value
        }

    override fun isLoggable(level: LogLevel): Boolean = isLoggableFn(level)

    override fun write(level: LogLevel, domain: String, message: String) {
        latestLog = TestLog(level, domain, message)
    }
}

/**
 * Data class for storing log details.
 */
data class TestLog(
    val priority: LogLevel,
    val domain: String,
    val message: String
)
