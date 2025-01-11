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

package org.gtkkn.extensions.glib.util.log.writer

import org.gtkkn.extensions.glib.util.log.Log
import org.gtkkn.extensions.glib.util.log.LogLevel
import org.gtkkn.extensions.glib.util.log.formatter.ColorLogFormatter
import org.gtkkn.extensions.glib.util.log.formatter.LogFormatter
import org.gtkkn.extensions.glib.util.log.formatter.LogcatLogFormatter
import org.gtkkn.extensions.glib.util.log.formatter.withColor
import platform.posix.SIGTRAP
import platform.posix.raise

/**
 * A LogWriter that mimics the Android Logcat output style using `println()`.
 *
 * Messages at [LogLevel.ERROR] are treated as fatal. After logging, an exception is raised to mimic `g_log` error
 * behavior.
 *
 * ### Installation Convenience Methods
 * For convenience, companion methods allow adding this writer conditionally:
 * - Use [Log.installConsoleLogWriterForDebugBuilds] for debug builds.
 * - Use [Log.installConsoleLogWriterForReleaseBuilds] for release builds.
 * - Use [Log.installConsoleLogWriter] to install for both debug and release builds.
 *
 * @constructor
 * @param minLevel The minimum log level to log. Default is [LogLevel.DEBUG].
 * @param formatter An optional [LogFormatter] to customize the log message format. Default is [LogcatLogFormatter].
 */
public class ConsoleLogWriter(
    private val minLevel: LogLevel = LogLevel.DEBUG,
    private val formatter: LogFormatter = LogcatLogFormatter().withColor()
) : LogWriter {
    override fun isLoggable(level: LogLevel): Boolean = level >= minLevel

    override fun write(level: LogLevel, domain: String, message: String) {
        println(formatter.format(level, domain, message))

        // If level is ERROR, throw an exception to mimic g_log error behavior
        if (level == LogLevel.ERROR) {
            val errorExplanation = ColorLogFormatter.applyColor(
                level = LogLevel.CRITICAL,
                text = "LogPriority.ERROR is considered fatal and will terminate the application. " +
                    "Use LogPriority.CRITICAL for non-fatal critical errors. Sending SIGTRAP.",
            )
            println(errorExplanation)
            raise(SIGTRAP)
        }
    }
}

/**
 * Installs this writer for both debug and release builds.
 *
 * By default:
 * - For **debug builds**, the minimum priority level is set to [LogLevel.DEBUG].
 * - For **release builds**, the minimum priority level is set to [LogLevel.MESSAGE].
 *
 * Debug logs can still be enabled on release builds by standard GLib `g_log` mechanism.
 * To prevent this, explicitly set [minLevel] in [Log.installConsoleLogWriterForReleaseBuilds].
 */
public fun Log.installConsoleLogWriter(
    minLevelDebug: LogLevel = LogLevel.DEBUG,
    minLevelRelease: LogLevel = defaultReleaseLogLevel,
    time: Boolean = true,
) {
    Log.installConsoleLogWriterForDebugBuilds(minLevelDebug, time)
    Log.installConsoleLogWriterForReleaseBuilds(minLevelRelease, time)
}

/**
 * Installs this writer for debug builds if the application is debuggable.
 *
 * @param minLevel The minimum log level to log. Default is [LogLevel.DEBUG].
 * @param time Whether to include timestamps in the log output. Default is `true`.
 */
public fun Log.installConsoleLogWriterForDebugBuilds(
    minLevel: LogLevel = LogLevel.DEBUG,
    time: Boolean = true,
) {
    if (Platform.isDebugBinary) {
        Log.install(ConsoleLogWriter(minLevel, LogcatLogFormatter(time = time).withColor()))
    }
}

/**
 * Installs this writer for release builds if the application is not debuggable.
 *
 * Debug logs can still be enabled on release builds using the standard GLib `g_log` mechanism:
 * ```bash
 * export G_MESSAGES_DEBUG=all
 * ```
 *
 * To prevent this behavior, explicitly set [minLevel].
 *
 * @param minLevel The minimum log level to log. Default is [LogLevel.MESSAGE] in release builds,
 *                    or [LogPriority.DEBUG] if GLib's debug mode is enabled.
 * @param time Whether to include timestamps in the log output. Default is `true`.
 */
public fun Log.installConsoleLogWriterForReleaseBuilds(
    minLevel: LogLevel = defaultReleaseLogLevel,
    time: Boolean = true,
) {
    if (!Platform.isDebugBinary) {
        Log.install(ConsoleLogWriter(minLevel, LogcatLogFormatter(time = time).withColor()))
    }
}
