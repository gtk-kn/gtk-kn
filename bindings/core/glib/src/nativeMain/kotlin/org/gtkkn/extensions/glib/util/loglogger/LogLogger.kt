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

import kotlinx.atomicfu.locks.ReentrantLock
import kotlinx.atomicfu.locks.withLock
import org.gtkkn.extensions.glib.util.LogPriority
import org.gtkkn.extensions.glib.util.loglogger.LogLogger.addWriter
import org.gtkkn.extensions.glib.util.loglogger.LogLogger.removeWriter

/**
 * LogLogger acts as a global, thread-safe manager for log writers.
 *
 * By default, no writers are installed, so no logs will appear.
 * To enable logging, add one or more [LogWriter]s using [addWriter].
 * All logging calls will be delegated to the installed writers.
 *
 * You can remove a writer using [removeWriter], and multiple writers
 * can be active at the same time.
 *
 * This approach solves:
 * - Having multiple loggers: Just install multiple writers.
 * - No duplication of installation logic: Add or remove writers through LogLogger.
 * - Easy extensibility: Implement your own LogWriter to customize messages or formatting.
 */
public object LogLogger {
    private val lock = ReentrantLock()
    private val writers = mutableListOf<LogWriter>()

    // Composite view of all writers
    public val logger: LogWriter = object : LogWriter {
        override fun isLoggable(priority: LogPriority): Boolean {
            lock.withLock {
                return writers.any { it.isLoggable(priority) }
            }
        }

        override fun write(priority: LogPriority, logDomain: String, message: String) {
            lock.withLock {
                writers.forEach { writer ->
                    if (writer.isLoggable(priority)) {
                        writer.write(priority, logDomain, message)
                    }
                }
            }
        }
    }

    /**
     * Adds a new writer to the global logging system.
     * @param writer The writer to add.
     */
    public fun addWriter(writer: LogWriter) {
        lock.withLock {
            writers.add(writer)
        }
    }

    /**
     * Removes an installed writer.
     * @param writer The writer to remove.
     */
    public fun removeWriter(writer: LogWriter) {
        lock.withLock {
            writers.remove(writer)
        }
    }

    /**
     * Clears all currently installed writers.
     */
    public fun clearWriters() {
        lock.withLock {
            writers.clear()
        }
    }
}
