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

package org.gtkkn.extensions.glib.util.log

import org.gtkkn.bindings.glib.LogLevelFlags

/**
 * Log levels adapted from GLib log levels. Higher values indicate more severe messages.
 */
public enum class LogLevel(internal val flags: LogLevelFlags) {
    DEBUG(LogLevelFlags.LEVEL_DEBUG),
    INFO(LogLevelFlags.LEVEL_INFO),
    MESSAGE(LogLevelFlags.LEVEL_MESSAGE),
    WARNING(LogLevelFlags.LEVEL_WARNING),
    CRITICAL(LogLevelFlags.LEVEL_CRITICAL),
    ERROR(LogLevelFlags.LEVEL_ERROR);

    /**
     * Converts a [LogLevel] to a single-character string representation.
     *
     * @return A single-character representation of the log level (e.g., `D` for DEBUG, `E` for ERROR).
     */
    public fun toShortString(): String = name.first().toString()
}
