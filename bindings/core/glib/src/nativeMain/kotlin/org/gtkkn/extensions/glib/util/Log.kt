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

package org.gtkkn.extensions.glib.util

import org.gtkkn.extensions.glib.util.loglogger.LogLogger

/**
 * Inline logging functions for a flexible and efficient logging API.
 *
 * The `log` functions provide:
 * - An optional [priority], defaulting to [LogPriority.DEBUG].
 * - An optional [logDomain], which defaults to the calling context's class name.
 * - A lambda [message], evaluated only if the logging is enabled, ensuring no unnecessary computation.
 *
 * By default, no logs will be generated unless a `LogLogger` is explicitly installed. Use a logger such
 * as [LogcatStyleLogger] or [GlibLogLogger] by calling [LogLogger.install] to enable logging.
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
    priority: LogPriority = LogPriority.DEBUG,
    logDomain: String? = null,
    message: () -> String
) {
    val logger = LogLogger.logger
    if (logger.isLoggable(priority)) {
        val domain = logDomain ?: deriveDomainNameFromCaller()
        logger.log(priority, domain, message())
    }
}

/**
 * Overload of the [log] function that does not depend on `this`.
 * This is suitable for top-level functions or contexts without an available instance.
 *
 * The logging configuration (e.g., format and behavior) depends on the currently installed [LogLogger].
 * By default, no logs will be generated unless a logger is installed.
 *
 * @param logDomain The domain of the log, typically identifying the context (e.g., "MyComponent").
 * @param priority The priority of the log message, defaulting to [LogPriority.DEBUG].
 * @param message A lambda producing the log message. Evaluated only if logging is enabled.
 */
public inline fun log(
    logDomain: String,
    priority: LogPriority = LogPriority.DEBUG,
    message: () -> String
) {
    val logger = LogLogger.logger
    if (logger.isLoggable(priority)) {
        logger.log(priority, logDomain, message())
    }
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
