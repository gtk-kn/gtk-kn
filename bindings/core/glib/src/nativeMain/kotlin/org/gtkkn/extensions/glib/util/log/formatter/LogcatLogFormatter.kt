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

package org.gtkkn.extensions.glib.util.log.formatter

import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.extensions.glib.util.log.LogLevel
import platform.posix.getpid

/**
 * A [LogFormatter] that mimics the Android Logcat output style using `println()`.
 *
 * Depending on configuration:
 * - If [time] is true, logs are formatted as:
 *   ```
 *   <date> <time> <pid> <level> <domain>: <message>
 *   ```
 *   Example:
 *   `10-05 15:30:12.451 1234 D MyApp: A debug message`
 *
 * - If [time] is false, logs are formatted as:
 *   ```
 *   <level>/<domain>(<pid>): <message>
 *   ```
 *   Example:
 *   `D/MyApp(1234): A debug message`
 * @constructor
 * @param time Whether to include timestamps in the log output. Default is `true`.
 */
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

    override fun formatLevel(level: LogLevel): String = level.toShortString()

    override fun formatTag(tag: String): String = tag

    override fun formatMessage(message: String): String = message

    protected open fun formatTime(dateTime: DateTime): String =
        checkNotNull(dateTime.format("%m-%d %H:%M:%S.%f")).let { it.substring(0, it.length - 2) }
}
