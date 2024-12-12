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
import org.gtkkn.native.glib.g_log

/**
 * A [LogWriter] implementation that uses GLib's `g_log` for logging.
 *
 * This logger integrates with GLib's logging system and supports GLib log levels.
 *
 * ### Key Features
 * - Logs messages directly using `g_log`.
 * - Honors GLib's `G_MESSAGES_DEBUG` environment variable for enabling lower-level log messages.
 *
 * ### Installation
 * This logger can be installed conditionally:
 * - Use [installOnDebuggableApp] for debug builds.
 * - Use [installOnReleaseApp] for release builds.
 * - Use [install] to install for both debug and release builds.
 *
 * @constructor
 * @param minLevel The minimum log level to log. Default is [LogLevel.MESSAGE].
 */
public class GLibLogWriter(
    private val minLevel: LogLevel = getGlibLogLevel()
) : LogWriter {
    /**
     * Returns true if the given [level] is at least as severe as [minLevel].
     */
    override fun isLoggable(level: LogLevel): Boolean = level >= minLevel

    /**
     * Logs the given [message] at the specified [level] and [tag] using GLib's `g_log`.
     *
     * @param level The log priority.
     * @param tag The domain of the log message.
     * @param message The message to log.
     */
    override fun write(level: LogLevel, tag: String, message: String) {
        g_log(tag, level.flags.mask, message)
    }

    public companion object {
        /**
         * Checks glib for debug logs.
         *
         * @return [LogLevel] from glib or [default]
         */
        public fun getGlibLogLevel(default: LogLevel = LogLevel.MESSAGE): LogLevel {
            return if (isGLogDebugEnabled()) LogLevel.DEBUG else default
        }

        /**
         * Checks if GLib debug logging is enabled.
         *
         * This method returns true if GLib's `DEBUG` level is enabled via `logSetDebugEnabled` or the
         * `G_MESSAGES_DEBUG` environment variable.
         *
         * @return True if GLib debug logging is enabled, false otherwise.
         */
        private fun isGLogDebugEnabled(): Boolean =
            GLib.logGetDebugEnabled() || !GLib.getenv("G_MESSAGES_DEBUG").isNullOrBlank()
    }
}
