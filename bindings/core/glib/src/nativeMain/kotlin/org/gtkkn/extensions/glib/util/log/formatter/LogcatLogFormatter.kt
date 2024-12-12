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

package org.gtkkn.extensions.glib.util.log.formatter

import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.extensions.glib.util.log.LogLevel
import platform.posix.getpid

public open class LogcatLogFormatter(
    private val time: Boolean = true,
) : LogFormatter {
    final override fun format(
        level: LogLevel,
        tag: String,
        message: String
    ): String {
        // Fetch process ID
        val pid = getpid()

        // If time is true, include date/time in the output
        return buildString {
            if (time) {
                // Format: `<date> <time> <pid> <level> <tag>: <message>`
                append(formatTime(checkNotNull(DateTime.newNowLocal()))).append(' ')
                append(pid).append(' ')
                append(formatLevel(level)).append(' ')
                append(formatTag(tag)).append(": ")
                append(formatMessage(message))
            } else {
                // Format without time: `<level>/<tag>(<pid>): <message>`
                append(formatLevel(level)).append('/')
                append(formatTag(tag)).append("(")
                append(pid).append("): ")
                append(formatMessage(message))
            }
        }
    }

    override fun formatLevel(level: LogLevel): String = "${level.name.first()}"

    override fun formatTag(tag: String): String = tag

    override fun formatMessage(message: String): String = message

    protected open fun formatTime(dateTime: DateTime): String {
        val dateStr = "${dateTime.getMonth()}-${dateTime.getDayOfMonth()}"
        val timeStr =
            "${dateTime.getHour()}:${dateTime.getMinute()}:${dateTime.getSecond()}:${dateTime.getMicrosecond() / 1000}"
        return "$dateStr $timeStr"
    }
}
