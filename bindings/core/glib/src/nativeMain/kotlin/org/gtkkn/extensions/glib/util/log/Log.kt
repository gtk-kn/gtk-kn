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
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.extensions.glib.util.log.Log.install
import org.gtkkn.extensions.glib.util.log.Log.logInternal
import org.gtkkn.extensions.glib.util.log.Log.uninstall
import org.gtkkn.extensions.glib.util.log.writer.LogWriter

/**
 * Log acts as a global, thread-safe manager for log writers.
 *
 * By default, no writers are installed, so no logs will appear.
 * To enable logging, add one or more [LogWriter]s using [install].
 * All logging calls will be delegated to the installed writers.
 *
 * You can remove a writer using [uninstall], and multiple writers
 * can be active at the same time.
 *
 * This approach solves:
 * - Having multiple loggers: Just install multiple writers.
 * - No duplication of installation logic: Add or remove writers through Log.
 * - Easy extensibility: Implement your own LogWriter to customize messages or formatting.
 */
public object Log {
    @PublishedApi
    internal val lock: ReentrantLock = ReentrantLock()

    @PublishedApi
    internal val writers: MutableSet<LogWriter> = mutableSetOf<LogWriter>()

    /**
     * A user-configurable default domain for logs. If set, any `log` call with `domain = null`
     * will use this value instead of deriving it from the caller.
     */
    public var defaultDomain: String? = null

    /**
     * Determines the default minimum level for release builds based on whether
     * GLib's debug logging is enabled.
     *
     * If GLib debug logging is enabled (via `G_MESSAGES_DEBUG`), the level defaults
     * to [LogLevel.DEBUG]. Otherwise, it defaults to [LogLevel.MESSAGE].
     *
     * @return The default minimum level for release builds.
     */
    public val defaultReleaseLogLevel: LogLevel
        get() = if (isGLogDebugEnabled()) LogLevel.DEBUG else LogLevel.MESSAGE

    /**
     * Installs a new writer to the global logging system.
     * @param writer The writer to install.
     */
    public fun install(writer: LogWriter) {
        lock.withLock {
            writers.add(writer)
        }
    }

    /**
     * Uninstalls an installed writer.
     * @param writer The writer to uninstall.
     */
    public fun uninstall(writer: LogWriter) {
        lock.withLock {
            if (writers.remove(writer)) {
                writer.close()
            }
        }
    }

    /**
     * Uninstalls all currently installed writers.
     */
    public fun uninstallAll() {
        lock.withLock {
            writers.removeAll { writer ->
                writer.close()
                true
            }
        }
    }

    @PublishedApi
    internal inline fun logInternal(level: LogLevel, domain: () -> String, message: () -> String) {
        lock.withLock {
            for (writer in writers) {
                if (writer.isLoggable(level)) {
                    writer.write(level, domain(), message())
                }
            }
        }
    }

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
}

/**
 * Inline logging functions for a flexible and efficient logging API.
 *
 * The `log` functions provide:
 * - An optional [level], defaulting to [LogLevel.DEBUG].
 * - An optional [domain], which defaults to the calling context's class name.
 * - A lambda [message], evaluated only if the logging is enabled, ensuring no unnecessary computation.
 *
 * By default, no logs will be generated unless a `LogLogger` is explicitly installed. Use a logger such
 * as [LogcatStyleLogger] or [GlibLogLogger] by calling [Log.install] to enable logging.
 * The exact format and behavior of the logs depend on the logger implementation used.
 *
 * ### Key Features
 * - **Lazy Evaluation**: The log message is a lambda that is only executed if the logger deems the message loggable.
 * - **Automatic Domain Derivation**: If [domain] is not provided, the calling class name is used as the default
 *   domain.
 * - **Simple API Surface**: The API is minimal, with a single logging function and optional parameters for
 *   customization.
 */
public inline fun Any.log(
    level: LogLevel = LogLevel.DEBUG,
    domain: String? = null,
    message: () -> String
) {
    logInternal(level, { domain ?: Log.defaultDomain ?: deriveDomainNameFromCaller() }, message)
}

/**
 * Overload of the [log] function that does not depend on `this`.
 * This is suitable for top-level functions or contexts without an available instance.
 *
 * The logging configuration (e.g., format and behavior) depends on the currently installed [Log].
 * By default, no logs will be generated unless a logger is installed.
 *
 * @param domain The domain of the log, typically identifying the context (e.g., "MyComponent").
 * @param level The level of the log message, defaulting to [LogLevel.DEBUG].
 * @param message A lambda producing the log message. Evaluated only if logging is enabled.
 */
public inline fun log(
    domain: String? = null,
    level: LogLevel = LogLevel.DEBUG,
    message: () -> String
) {
    logInternal(level, { domain ?: Log.defaultDomain ?: "TopLevel" }, message)
}

/**
 * Derives a log domain name based on the calling context's outer class.
 *
 * This utility method extracts the simple class name from the calling context.
 * For companion objects or classes without explicit names, it falls back to "Companion".
 *
 * @return A simplified domain name representing the calling context.
 */
@PublishedApi
internal fun Any.deriveDomainNameFromCaller(): String {
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
