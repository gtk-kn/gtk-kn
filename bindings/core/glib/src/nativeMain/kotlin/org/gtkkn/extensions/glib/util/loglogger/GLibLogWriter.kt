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

import org.gtkkn.bindings.glib.GLib
import org.gtkkn.extensions.glib.util.LogPriority
import org.gtkkn.extensions.glib.util.loglogger.GLibLogWriter.Companion.install
import org.gtkkn.extensions.glib.util.loglogger.GLibLogWriter.Companion.installOnDebuggableApp
import org.gtkkn.extensions.glib.util.loglogger.GLibLogWriter.Companion.installOnReleaseApp
import org.gtkkn.extensions.glib.util.loglogger.LogConfig.defaultReleaseLogPriority
import org.gtkkn.native.glib.g_log

/**
 * A [LogWriter] implementation that uses GLib's `g_log` for logging.
 *
 * This integrates with GLib's logging system and supports GLib log levels.
 *
 * ### Key Features
 * - Automatically enables `DEBUG` and `INFO` log levels if the minimum priority is set below `MESSAGE`.
 * - Logs messages directly using `g_log`.
 * - Honors GLib's `G_MESSAGES_DEBUG` environment variable for enabling lower-level log messages.
 *
 * ### Installation Convenience Methods
 * For convenience, companion methods allow adding this writer conditionally:
 * - Use [install] to install for both debug and release builds.
 * - Use [installOnDebuggableApp] for debug builds.
 * - Use [installOnReleaseApp] for release builds.
 *
 * @constructor
 * @param minPriority The minimum log priority to log. Default is [LogPriority.DEBUG].
 *                    Setting it below [LogPriority.MESSAGE] will enable `DEBUG` and `INFO` levels.
 */
public class GLibLogWriter(
    private val minPriority: LogPriority = LogPriority.DEBUG
) : LogWriter {
    init {
        // Enable debug-level logging in GLib if minPriority includes DEBUG or INFO
        if (minPriority.severity < LogPriority.MESSAGE.severity) {
            GLib.logSetDebugEnabled(true)
        }
    }

    /**
     * Returns true if the given [priority] is at least as severe as [minPriority].
     */
    override fun isLoggable(priority: LogPriority): Boolean = priority.severity >= minPriority.severity

    /**
     * Logs the given [message] at the specified [priority] and [logDomain] using GLib's `g_log`.
     *
     * @param priority The log priority.
     * @param logDomain The domain of the log message.
     * @param message The message to log.
     */
    override fun write(priority: LogPriority, logDomain: String, message: String) {
        g_log(logDomain, priority.glibLevel, message)
    }

    public companion object {
        /**
         * Checks if GLib debug logging is enabled.
         *
         * This method returns true if GLib's `DEBUG` level is enabled via `logSetDebugEnabled` or the
         * `G_MESSAGES_DEBUG` environment variable.
         *
         * @return True if GLib debug logging is enabled, false otherwise.
         */
        public fun isGLogDebugEnabled(): Boolean =
            GLib.logGetDebugEnabled() || !GLib.getenv("G_MESSAGES_DEBUG").isNullOrBlank()

        /**
         * Installs this writer for both debug and release builds.
         *
         * By default:
         * - For **debug builds**, the minimum priority level is set to [LogPriority.DEBUG].
         * - For **release builds**, the minimum priority level is set to [LogPriority.MESSAGE].
         *
         * Debug logs can still be enabled on release builds using:
         * ```bash
         * export G_MESSAGES_DEBUG=all
         * ```
         * Or restrict them to a specific domain:
         * ```bash
         * export G_MESSAGES_DEBUG=my_app
         * ```
         *
         * To prevent this behavior, explicitly set [minPriority] in [installOnReleaseApp].
         */
        public fun install() {
            installOnDebuggableApp()
            installOnReleaseApp()
        }

        /**
         * Installs this writer for debug builds if the application is debuggable.
         *
         * @param minPriority The minimum log priority to log. Default is [LogPriority.DEBUG].
         */
        public fun installOnDebuggableApp(minPriority: LogPriority = LogPriority.DEBUG) {
            if (Platform.isDebugBinary) {
                LogLogger.addWriter(GLibLogWriter(minPriority))
            }
        }

        /**
         * Installs this writer for release builds if the application is not debuggable.
         *
         * Debug logs can still be enabled on release builds using the standard GLib `g_log` mechanism:
         * ```bash
         * export G_MESSAGES_DEBUG=all
         * ```
         * Or restrict them to a specific domain:
         * ```bash
         * export G_MESSAGES_DEBUG=my_app
         * ```
         *
         * To prevent this behavior, explicitly set [minPriority].
         *
         * @param minPriority The minimum log priority to log. Default is [LogPriority.MESSAGE] in release builds,
         *                    or [LogPriority.DEBUG] if GLib debug mode is enabled.
         */
        public fun installOnReleaseApp(
            minPriority: LogPriority = defaultReleaseLogPriority
        ) {
            if (!Platform.isDebugBinary) {
                LogLogger.addWriter(GLibLogWriter(minPriority))
            }
        }
    }
}
