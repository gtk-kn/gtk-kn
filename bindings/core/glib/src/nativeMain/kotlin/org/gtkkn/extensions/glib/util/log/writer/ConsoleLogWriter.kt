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

import org.gtkkn.bindings.glib.GLib
import org.gtkkn.extensions.glib.util.log.LogLevel
import org.gtkkn.extensions.glib.util.log.formatter.DefaultLogFormatter
import org.gtkkn.extensions.glib.util.log.formatter.LogFormatter

public class ConsoleLogWriter(
    private val minLevel: LogLevel = getEnvLogLevel(),
    private val formatter: LogFormatter = DefaultLogFormatter()
) : LogWriter {
    override fun isLoggable(level: LogLevel): Boolean = level >= minLevel

    override fun write(level: LogLevel, tag: String, message: String) {
        println(formatter.format(level, tag, message))
    }

    public companion object {
        /**
         * Checks env for `LOG_LEVEL`.
         *
         * @return [LogLevel] from env or [default]
         */
        public fun getEnvLogLevel(default: LogLevel = LogLevel.MESSAGE): LogLevel {
            val env = GLib.getenv("LOG_LEVEL")
            return LogLevel.entries.firstOrNull { level ->
                level.name.equals(env, ignoreCase = true)
            } ?: default
        }
    }
}
