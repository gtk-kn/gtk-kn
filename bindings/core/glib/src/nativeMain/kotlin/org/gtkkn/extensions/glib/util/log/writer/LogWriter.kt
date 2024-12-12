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

/**
 * Interface for all log writers.
 *
 * Defines the contract for logging systems used in the application.
 *
 * By default, [NoLog] is used, which disables all logging. To enable logging, call [LogWriter.install] with a
 * concrete logger implementation.
 *
 * Custom loggers can implement this interface to handle logs differently, e.g., sending logs to a file, console,
 * or remote server.
 */
public interface LogWriter : AutoCloseable {
    /**
     * Determines whether a log message with the given [level] should be logged.
     *
     * If this returns `false`, the message-producing lambda in [write] will not be evaluated,
     * avoiding unnecessary computation.
     *
     * @param level The level of the log message.
     * @return `true` if the message should be logged, `false` otherwise.
     */
    public fun isLoggable(level: LogLevel): Boolean

    /**
     * Writes the given [message] with the specified [level] and [tag].
     *
     * Invocations of this method will always produce output and all [level] checks
     * are expected to be done prior to the invocation.
     *
     * @param level The level of the log message.
     * @param tag The domain associated with the log message (e.g., a component or class name).
     * @param message The log message to be recorded.
     */
    public fun write(level: LogLevel, tag: String, message: String)

    override fun close(): Unit = Unit

//    public companion object {
//        private val loggerRef = AtomicReference<LogWriter>(NoLog)
//        private val installedThrowableRef = AtomicReference<Throwable?>(null)
//        private val lock = SynchronizedObject()
//
//        /**
//         * The currently installed logger instance.
//         *
//         * By default, this is set to [NoLog], which disables all logging.
//         * To use a custom logger, call [install] with a concrete implementation.
//         */
//        public val logger: LogWriter
//            get() = loggerRef.value
//
//        /**
//         * Indicates whether a logger is currently installed.
//         *
//         * @return `true` if a logger is installed, `false` if [NoLog] is active.
//         */
//        public val isInstalled: Boolean
//            get() = installedThrowableRef.value != null
//
//        public fun canBeInstalled(): Boolean = if (isInstalled) {
//            println("Warning: A LogLogger is already installed. The installation attempt has been ignored.")
//            false
//        } else {
//            true
//        }
//
//        /**
//         * Installs the given [logger] as the active logger.
//         *
//         * If a logger is already installed, logs an error message to the new logger and replaces the old one.
//         *
//         * @param logger The logger implementation to install.
//         */
//        public fun install(logger: LogWriter) {
//            lock.withLock {
//                if (isInstalled) {
//                    logger.log(
//                        LogPriority.ERROR,
//                        "LogLogger",
//                        "Installing $logger even though a logger was previously installed here: " +
//                                installedThrowableRef.value!!.asLog(),
//                    )
//                }
//                installedThrowableRef.value = RuntimeException("Previous logger installed here")
//                loggerRef.value = logger
//            }
//        }
//
//        /**
//         * Uninstalls the current logger, reverting to the default [NoLog].
//         */
//        public fun uninstall() {
//            lock.withLock {
//                installedThrowableRef.value = null
//                loggerRef.value = NoLog
//            }
//        }
//    }
//
//    /**
//     * Default logger implementation that disables all logging.
//     *
//     * This is the initial state of [LogWriter]. Attempts to log messages with [NoLog] will NOT result in an error but
//     * it will be simply ignored.
//     */
//    private object NoLog : LogWriter {
//        override fun isLoggable(priority: LogPriority): Boolean = false
//        override fun log(priority: LogPriority, logDomain: String, message: String) {
//            error("Should never reach this line.")
//        }
//    }
}
