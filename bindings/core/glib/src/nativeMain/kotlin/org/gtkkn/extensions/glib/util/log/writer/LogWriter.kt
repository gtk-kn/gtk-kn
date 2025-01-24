/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
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
