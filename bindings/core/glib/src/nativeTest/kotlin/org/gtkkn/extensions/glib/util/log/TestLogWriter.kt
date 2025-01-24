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

import org.gtkkn.extensions.glib.util.log.writer.LogWriter
import kotlin.concurrent.AtomicReference

/**
 * A test logger implementation for logging in tests.
 */
class TestLogWriter(private val isLoggableFn: (LogLevel) -> Boolean = { true }) : LogWriter {
    private var _latestLog: AtomicReference<TestLog?> = AtomicReference(null)
    var latestLog: TestLog?
        get() = _latestLog.value
        set(value) {
            _latestLog.value = value
        }

    override fun isLoggable(level: LogLevel): Boolean = isLoggableFn(level)

    override fun write(level: LogLevel, domain: String, message: String) {
        latestLog = TestLog(level, domain, message)
    }
}

/**
 * Data class for storing log details.
 */
data class TestLog(
    val priority: LogLevel,
    val domain: String,
    val message: String
)
