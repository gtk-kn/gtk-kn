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

package org.gtkkn.extensions.glib.util.loglogger

import org.gtkkn.extensions.glib.util.LogPriority
import kotlin.concurrent.AtomicReference

/**
 * A test logger implementation for logging in tests.
 */
class TestLogLogger(private val isLoggableFn: (LogPriority) -> Boolean = { true }) : LogLogger {
    private var _latestLog: AtomicReference<Log?> = AtomicReference(null)
    var latestLog: Log?
        get() = _latestLog.value
        set(value) {
            _latestLog.value = value
        }

    override fun isLoggable(priority: LogPriority): Boolean = isLoggableFn(priority)

    override fun log(priority: LogPriority, logDomain: String, message: String) {
        latestLog = Log(priority, logDomain, message)
    }
}
