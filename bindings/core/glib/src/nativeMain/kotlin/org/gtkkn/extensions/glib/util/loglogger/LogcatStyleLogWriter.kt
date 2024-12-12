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

import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.extensions.glib.util.LogPriority
import org.gtkkn.extensions.glib.util.loglogger.LogConfig.defaultReleaseLogPriority
import org.gtkkn.extensions.glib.util.loglogger.LogcatStyleLogWriter.Companion.install
import org.gtkkn.extensions.glib.util.loglogger.LogcatStyleLogWriter.Companion.installOnDebuggableApp
import org.gtkkn.extensions.glib.util.loglogger.LogcatStyleLogWriter.Companion.installOnReleaseApp
import platform.posix.SIGTRAP
import platform.posix.getpid
import platform.posix.raise
import platform.posix.time

/**
 * A LogWriter that mimics the Android Logcat output style using `println()`.
 *
 * Depending on configuration:
 * - If [time] is true, logs are formatted as:
 *   ```
 *   <date> <time> <pid> <priority> <logDomain>: <message>
 *   ```
 *   Example:
 *   `2023-10-05 15:30:12.451 1234 D MyApp: A debug message`
 *
 * - If [time] is false, logs are formatted as:
 *   ```
 *   <priority>/<logDomain>(<pid>): <message>
 *   ```
 *   Example:
 *   `D/MyApp(1234): A debug message`
 *
 * If [color] is true, logs are prefixed with ANSI color codes based on the log priority.
 *
 * Messages at [LogPriority.ERROR] are treated as fatal. After logging, an exception is raised to mimic `g_log` error
 * behavior.
 *
 * The [time] and [color] configurations are set when calling the `install` functions and cannot be changed afterward.
 *
 * ### Installation Convenience Methods
 * For convenience, companion methods allow adding this writer conditionally:
 * - Use [installOnDebuggableApp] for debug builds.
 * - Use [installOnReleaseApp] for release builds.
 * - Use [install] to install for both debug and release builds.
 *
 * @constructor
 * @param minPriority The minimum log priority to log. Default is [LogPriority.DEBUG].
 * @param time Whether to include timestamps in the log output. Default is `true`.
 * @param color Whether to include ANSI color codes in the log output. Default is `true`.
 * @param messageFormatter An optional lambda function to customize the log message format. The function
 *                         receives the log [priority], [logDomain], and raw [message] as parameters and
 *                         should return the formatted message string. If `null`, the default formatting
 *                         is used. Default is `null`.
 */
public class LogcatStyleLogWriter(
    private val minPriority: LogPriority = LogPriority.DEBUG,
    private val time: Boolean = true,
    private val color: Boolean = true,
    private val messageFormatter: ((LogPriority, String, String) -> String)? = null
) : LogWriter {
    /**
     * Returns true if the given [priority] is at least as severe as [minPriority].
     */
    override fun isLoggable(priority: LogPriority): Boolean = priority.severity >= minPriority.severity

    /**
     * Logs the given [message] at the specified [priority] and [logDomain].
     *
     * The output format and styling depend on the [time] and [color] configuration, which are set during logger
     * installation.
     *
     * @param priority The log priority.
     * @param logDomain The domain of the log message.
     * @param message The message to log.
     */
    override fun write(priority: LogPriority, logDomain: String, message: String) {
        // Fetch process ID
        val pid = getpid()
        val formattedMessage = messageFormatter?.invoke(priority, logDomain, message) ?: message
        val line = if (time) {
            val (dateStr, timeStr) = getFormattedDateTime()
            val base = "$dateStr $timeStr $pid ${priority.toShortString()} $logDomain: $formattedMessage"
            colorizeIfNeeded(priority, base)
        } else {
            val base = "${priority.toShortString()}/$logDomain($pid): $formattedMessage"
            colorizeIfNeeded(priority, base)
        }

        println(line)

        // If priority is ERROR, throw an exception to mimic g_log error behavior
        if (priority == LogPriority.ERROR) {
            println(
                colorizeIfNeeded(
                    priority = priority,
                    line = "LogPriority.ERROR is considered fatal and will terminate the application. " +
                        "Use LogPriority.CRITICAL for non-fatal critical errors. Sending SIGTRAP.",
                ),
            )
            raise(SIGTRAP)
        }
    }

    /**
     * Colorize the given [line] according to the [priority] if [color] is enabled.
     *
     * @param priority The log priority.
     * @param line The log line to colorize.
     * @return The possibly colorized log line.
     */
    private fun colorizeIfNeeded(priority: LogPriority, line: String): String {
        if (!color) return line
        val ansiColor = when (priority) {
            LogPriority.DEBUG -> DEBUG_COLOR
            LogPriority.INFO -> INFO_COLOR
            LogPriority.MESSAGE -> MESSAGE_COLOR
            LogPriority.WARNING -> WARNING_COLOR
            LogPriority.CRITICAL -> CRITICAL_COLOR
            LogPriority.ERROR -> ERROR_COLOR
        }
        return ansiColor + line + RESET_COLOR
    }

    /**
     * Gets the formatted current date and time strings.
     *
     * @return A Pair of strings containing the date (formatted as `MM-dd`) and the time (formatted as `HH:mm:ss.sss`).
     */
    private fun getFormattedDateTime(): Pair<String, String> {
        val dt = checkNotNull(DateTime.newNowLocal())
        val dateStr = "${dt.getMonth()}-${dt.getDayOfMonth()}"
        val timeStr = "${dt.getHour()}:${dt.getMinute()}:${dt.getSecond()}:${dt.getMicrosecond() / 1000}"
        return dateStr to timeStr
    }

    public companion object {
        // / ANSI color codes for each priority level.
        private const val DEBUG_COLOR = "\u001B[0;37m"    // White
        private const val INFO_COLOR = "\u001B[0;32m"     // Green
        private const val MESSAGE_COLOR = "\u001B[0;36m"  // Cyan
        private const val WARNING_COLOR = "\u001B[0;33m"  // Yellow
        private const val CRITICAL_COLOR = "\u001B[0;31m" // Red
        private const val ERROR_COLOR = "\u001B[0;35m"    // Magenta
        private const val RESET_COLOR = "\u001B[0m"       // Reset

        /**
         * Installs this writer for both debug and release builds.
         *
         * By default:
         * - For **debug builds**, the minimum priority level is set to [LogPriority.DEBUG].
         * - For **release builds**, the minimum priority level is set to [LogPriority.MESSAGE].
         *
         * Debug logs can still be enabled on release builds by standard GLib `g_log` mechanism.
         * To prevent this, explicitly set [minPriority] in [installOnReleaseApp].
         *
         * @param time Whether to include timestamps in the log output. Default is `true`.
         * @param color Whether to include ANSI color codes in the log output. Default is `true`.
         */
        public fun install(
            time: Boolean = true,
            color: Boolean = true,
        ) {
            installOnDebuggableApp(time = time, color = color)
            installOnReleaseApp(time = time, color = color)
        }

        /**
         * Installs this writer for debug builds if the application is debuggable.
         *
         * @param minPriority The minimum log priority to log. Default is [LogPriority.DEBUG].
         * @param time Whether to include timestamps in the log output. Default is `true`.
         * @param color Whether to include ANSI color codes in the log output. Default is `true`.
         */
        public fun installOnDebuggableApp(
            minPriority: LogPriority = LogPriority.DEBUG,
            time: Boolean = true,
            color: Boolean = true,
        ) {
            if (Platform.isDebugBinary) {
                LogLogger.addWriter(LogcatStyleLogWriter(minPriority, time, color))
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
         * To prevent this behavior, explicitly set [minPriority].
         *
         * @param minPriority The minimum log priority to log. Default is [LogPriority.MESSAGE] in release builds,
         *                    or [LogPriority.DEBUG] if GLib's debug mode is enabled.
         * @param time Whether to include timestamps in the log output. Default is `true`.
         * @param color Whether to include ANSI color codes in the log output. Default is `true`.
         */
        public fun installOnReleaseApp(
            minPriority: LogPriority = defaultReleaseLogPriority,
            time: Boolean = true,
            color: Boolean = true,
        ) {
            if (!Platform.isDebugBinary) {
                LogLogger.addWriter(LogcatStyleLogWriter(minPriority, time, color))
            }
        }
    }
}
