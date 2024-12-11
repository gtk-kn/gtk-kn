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

@file:OptIn(ExperimentalForeignApi::class)

package org.gtkkn.extensions.glib.util

import kotlinx.cinterop.ExperimentalForeignApi
import org.gtkkn.native.glib.GLogLevelFlags
import org.gtkkn.native.glib.G_LOG_LEVEL_CRITICAL
import org.gtkkn.native.glib.G_LOG_LEVEL_DEBUG
import org.gtkkn.native.glib.G_LOG_LEVEL_ERROR
import org.gtkkn.native.glib.G_LOG_LEVEL_INFO
import org.gtkkn.native.glib.G_LOG_LEVEL_MESSAGE
import org.gtkkn.native.glib.G_LOG_LEVEL_WARNING
import org.gtkkn.native.glib.g_log

/**
 * Utility object for logging messages at various levels using GLib's logging system.
 *
 * This object provides methods to log messages at predefined GLib log levels:
 * - Error
 * - Critical
 * - Warning
 * - Message
 * - Info
 * - Debug
 *
 * ### Note on Log Levels Below `MESSAGE`
 * By default, log levels below `MESSAGE` (e.g., `INFO` and `DEBUG`) are **disabled** in GLib.
 * If you want to enable them, you need to set the `G_MESSAGES_DEBUG` environment variable.
 *
 * #### Enabling Log Levels Below `MESSAGE`
 * To enable debug messages, set the environment variable as follows:
 *
 * ```bash
 * export G_MESSAGES_DEBUG=all
 * ```
 * or restrict it to specific log domains:
 *
 * ```bash
 * export G_MESSAGES_DEBUG=my_app
 * ```
 *
 * Refer to the GLib documentation for further details.
 *
 * ### Important Notes on Error Level
 * - Logging messages at the `ERROR` level (`G_LOG_LEVEL_ERROR`) indicates a critical failure
 *   that cannot be recovered from. In most configurations, this may cause the application
 *   to **terminate** immediately.
 * - Use the `ERROR` level **only** for unrecoverable conditions. For recoverable conditions,
 *   use `CRITICAL` or lower levels such as `WARNING`.
 *
 * ### Example Usage
 * ```kotlin
 * val domain = "my_app"
 * Log.c(domain, "This is an critical message.")
 * Log.w(domain, "This is a warning with exception", Exception("Test exception"))
 * Log.d(domain, "This is a debug message.") // Requires enabling debug messages
 * ```
 */
@OptIn(ExperimentalForeignApi::class)
public object Log {
    /**
     * Logs a message at the `ERROR` level.
     *
     * **Note**: Messages at the `ERROR` level indicate a critical failure and
     * may cause the application to terminate immediately depending on configuration.
     *
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     */
    public fun e(logDomain: String?, msg: String) {
        logMessage(logDomain, G_LOG_LEVEL_ERROR, msg)
    }

    /**
     * Logs a message and a throwable at the `ERROR` level.
     *
     * **Note**: Messages at the `ERROR` level indicate a critical failure and
     * may cause the application to terminate immediately depending on configuration.
     *
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     * @param tr The throwable to include in the log message.
     */
    public fun e(logDomain: String?, msg: String, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_ERROR, msg, tr)
    }

    /**
     * Logs a message at the `CRITICAL` level.
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     */
    public fun c(logDomain: String?, msg: String) {
        logMessage(logDomain, G_LOG_LEVEL_CRITICAL, msg)
    }

    /**
     * Logs a message and a throwable at the `CRITICAL` level.
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     * @param tr The throwable to include in the log message.
     */
    public fun c(logDomain: String?, msg: String, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_CRITICAL, msg, tr)
    }

    /**
     * Logs a message at the `WARNING` level.
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     */
    public fun w(logDomain: String?, msg: String) {
        logMessage(logDomain, G_LOG_LEVEL_WARNING, msg)
    }

    /**
     * Logs a message and a throwable at the `WARNING` level.
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     * @param tr The throwable to include in the log message.
     */
    public fun w(logDomain: String?, msg: String, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_WARNING, msg, tr)
    }

    /**
     * Logs a throwable at the `WARNING` level.
     * @param logDomain The domain of the log message.
     * @param tr The throwable to include in the log message.
     */
    public fun w(logDomain: String?, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_WARNING, "", tr)
    }

    /**
     * Logs a message at the `MESSAGE` level.
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     */
    public fun m(logDomain: String?, msg: String) {
        logMessage(logDomain, G_LOG_LEVEL_MESSAGE, msg)
    }

    /**
     * Logs a message and a throwable at the `MESSAGE` level.
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     * @param tr The throwable to include in the log message.
     */
    public fun m(logDomain: String?, msg: String, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_MESSAGE, msg, tr)
    }

    /**
     * Logs a message at the `INFO` level.
     *
     * **Note**: Messages at the `INFO` level are disabled by default. Refer to
     * [Log] for details on how to enable them.
     *
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     */
    public fun i(logDomain: String?, msg: String) {
        logMessage(logDomain, G_LOG_LEVEL_INFO, msg)
    }

    /**
     * Logs a message and a throwable at the `INFO` level.
     *
     * **Note**: Messages at the `INFO` level are disabled by default. Refer to
     * [Log] for details on how to enable them.
     *
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     * @param tr The throwable to include in the log message.
     */
    public fun i(logDomain: String?, msg: String, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_INFO, msg, tr)
    }

    /**
     * Logs a message at the `DEBUG` level.
     *
     * **Note**: Messages at the `DEBUG` level are disabled by default. Refer to
     * [Log] for details on how to enable them.
     *
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     */
    public fun d(logDomain: String?, msg: String) {
        logMessage(logDomain, G_LOG_LEVEL_DEBUG, msg)
    }

    /**
     * Logs a message and a throwable at the `DEBUG` level.
     *
     * **Note**: Messages at the `DEBUG` level are disabled by default. Refer to
     * [Log] for details on how to enable them.
     *
     * @param logDomain The domain of the log message.
     * @param msg The message to log.
     * @param tr The throwable to include in the log message.
     */
    public fun d(logDomain: String?, msg: String, tr: Throwable) {
        logMessage(logDomain, G_LOG_LEVEL_DEBUG, msg, tr)
    }

    /**
     * Internal helper function to log messages.
     *
     * This function formats the message, appends a throwable's stack trace if provided,
     * and sends the log to GLib's `g_log` function.
     *
     * @param logDomain The domain of the log message.
     * @param level The GLib log level for the message.
     * @param msg The log message.
     * @param tr An optional throwable to include in the log.
     */
    private fun logMessage(logDomain: String?, level: GLogLevelFlags, msg: String, tr: Throwable? = null) {
        val fullMessage = if (tr != null) {
            "$msg\n${tr.stackTraceToString()}"
        } else {
            msg
        }

        g_log(logDomain, level, fullMessage)
    }
}
