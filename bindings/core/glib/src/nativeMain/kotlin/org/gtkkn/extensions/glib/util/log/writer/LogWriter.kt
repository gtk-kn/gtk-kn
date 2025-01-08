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

import org.gtkkn.extensions.glib.util.log.LogLevel

/**
 * A LogWriter represents a destination or a mechanism for handling log messages.
 * For example, a LogWriter might print messages to the console, write them to a file,
 * or send them over the network.
 *
 * Implementations should be lightweight and fast.
 */
public interface LogWriter : AutoCloseable {
    /**
     * Determines if this writer is willing to handle messages with the given level.
     *
     * @param level The priority level of the message.
     * @return true if loggable, false otherwise.
     */
    public fun isLoggable(level: LogLevel): Boolean

    /**
     * Writes the log message. If `isLoggable` returned false, this method should ideally
     * never be called, but if it is, it should no-op.
     *
     * @param level The level of the log message.
     * @param domain A string identifying the domain (usually a class or component name).
     * @param message The actual log message.
     */
    public fun write(level: LogLevel, domain: String, message: String)

    override fun close(): Unit = Unit
}
