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

package org.gtkkn.extensions.glib.util.log

import kotlinx.atomicfu.locks.ReentrantLock
import kotlinx.atomicfu.locks.withLock
import org.gtkkn.extensions.glib.util.log.writer.LogWriter

public data object Log {
    @PublishedApi
    internal val writers: MutableSet<LogWriter> = mutableSetOf<LogWriter>()

    @PublishedApi
    internal val lock: ReentrantLock = ReentrantLock()

    public inline fun install(
        debug: Boolean,
        release: Boolean,
        writer: () -> LogWriter
    ) {
        if ((debug && Platform.isDebugBinary)
            || (release && !Platform.isDebugBinary)
        ) {
            lock.withLock {
                writers += writer()
            }
        }
    }

    public fun uninstall(writer: LogWriter) {
        lock.withLock {
            if (writers.remove(writer)) writer.close()
        }
    }

    public fun uninstallAll() {
        lock.withLock {
            writers.removeAll {
                it.close()
                true
            }
        }
    }

    public inline fun d(tag: String, message: () -> String): Unit = logInternal(LogLevel.DEBUG, { tag }, message)
    public inline fun i(tag: String, message: () -> String): Unit = logInternal(LogLevel.INFO, { tag }, message)
    public inline fun m(tag: String, message: () -> String): Unit = logInternal(LogLevel.MESSAGE, { tag }, message)
    public inline fun w(tag: String, message: () -> String): Unit = logInternal(LogLevel.WARNING, { tag }, message)
    public inline fun c(tag: String, throwable: Throwable? = null, message: () -> String): Unit =
        logInternal(LogLevel.CRITICAL, { tag }) {
            if (throwable != null) {
                "${message()}\n${throwable.asLog()}"
            } else {
                message()
            }
        }

    public inline fun e(tag: String, throwable: Throwable? = null, message: () -> String): Unit =
        logInternal(LogLevel.ERROR, { tag }) {
            if (throwable != null) {
                "${message()}\n${throwable.asLog()}"
            } else {
                message()
            }
        }


    @PublishedApi
    internal inline fun logInternal(level: LogLevel, tag: () -> String, message: () -> String) {
        lock.withLock {
            for (writer in writers) {
                if (writer.isLoggable(level)) {
                    writer.write(level, tag(), message())
                }
            }
        }
    }
}

/**
 * Extension function to convert a [Throwable] into a loggable string.
 */
public fun Throwable.asLog(): String = stackTraceToString()

/**
 * Inline logging functions for a flexible and efficient logging API.
 *
 * The `log` functions provide:
 * - An optional [priority], defaulting to [log.LogPriority.DEBUG].
 * - An optional [logDomain], which defaults to the calling context's class name.
 * - A lambda [message], evaluated only if the logging is enabled, ensuring no unnecessary computation.
 *
 * By default, no logs will be generated unless a `LogLogger` is explicitly installed. Use a logger such
 * as [LogcatStyleLogger] or [GlibLogLogger] by calling [LogWriter.install] to enable logging.
 * The exact format and behavior of the logs depend on the logger implementation used.
 *
 * ### Key Features
 * - **Lazy Evaluation**: The log message is a lambda that is only executed if the logger deems the message loggable.
 * - **Automatic Domain Derivation**: If [logDomain] is not provided, the calling class name is used as the default
 *   domain.
 * - **Simple API Surface**: The API is minimal, with a single logging function and optional parameters for
 *   customization.
 */
public inline fun Any.log(
    level: LogLevel = LogLevel.DEBUG,
    tag: String? = null,
    message: () -> String
): Unit = Log.logInternal(level, { tag ?: deriveTagFromCaller() }, message)

/**
 * Overload of the [log] function that does not depend on `this`.
 * This is suitable for top-level functions or contexts without an available instance.
 *
 * The logging configuration (e.g., format and behavior) depends on the currently installed [LogWriter].
 * By default, no logs will be generated unless a logger is installed.
 *
 * @param tag The domain of the log, typically identifying the context (e.g., "MyComponent").
 * @param priority The priority of the log message, defaulting to [log.LogPriority.DEBUG].
 * @param message A lambda producing the log message. Evaluated only if logging is enabled.
 */
public inline fun log(
    tag: String,
    level: LogLevel = LogLevel.DEBUG,
    message: () -> String
): Unit = Log.logInternal(level, { tag }, message)

/**
 * Derives a log domain name based on the calling context's outer class.
 *
 * This utility method extracts the simple class name from the calling context.
 * For companion objects or classes without explicit names, it falls back to "Companion".
 *
 * @return A simplified domain name representing the calling context.
 */
@PublishedApi
internal fun Any.deriveTagFromCaller(): String {
    val nativeClass = this::class
    val fullClassName = nativeClass.simpleName.stripCompanions() ?: "$nativeClass"
    val outerClassName = fullClassName.removePrefix("class ").substringBefore('$')
    val simplerOuterClassName = outerClassName.removeSuffix(".Companion").substringAfterLast('.')
    return simplerOuterClassName.stripCompanions()
        ?: fullClassName.stripCompanions()
        ?: "Companion"
}

/**
 * Utility function to clean up and simplify class names for use as log domains.
 *
 * @return A cleaned-up version of the class name, or `null` if the name is empty or represents a "Companion".
 */
private fun String?.stripCompanions(): String? = if (isNullOrEmpty() || this == "Companion") null else this
