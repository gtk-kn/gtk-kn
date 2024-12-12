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

package org.gtkkn.extensions.glib.util.log.writer

import org.gtkkn.extensions.glib.util.log.LogLevel

class TestLogWriter(
    private val isLoggable: (level: LogLevel) -> Boolean
) : LogWriter {
    constructor(minLevel: LogLevel = LogLevel.DEBUG): this({it >= minLevel})

    private val mLogs = mutableListOf<Log>()

    val logs: List<Log> get() = mLogs

    val lastLog: Log? get() = logs.lastOrNull()

    override fun isLoggable(level: LogLevel): Boolean = isLoggable(level)

    override fun write(level: LogLevel, tag: String, message: String) {
        mLogs += Log(level, tag, message)
    }

    /**
     * Data class for storing log details.
     */
    data class Log(
        val level: LogLevel,
        val tag: String,
        val message: String
    )
}
