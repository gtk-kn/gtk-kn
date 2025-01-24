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

import org.gtkkn.bindings.glib.GLib
import org.gtkkn.extensions.glib.util.log.Log
import org.gtkkn.extensions.glib.util.log.LogLevel
import org.gtkkn.native.glib.g_log

/**
 * A [LogWriter] implementation that uses GLib's `g_log` for logging.
 *
 * This integrates with GLib's logging system and supports GLib log levels.
 *
 * ### Key Features
 * - Automatically enables `DEBUG` and `INFO` log levels if the minimum level is set below `MESSAGE`.
 * - Logs messages directly using `g_log`.
 * - Honors GLib's `G_MESSAGES_DEBUG` environment variable for enabling lower-level log messages.
 *
 * ### Installation Convenience Methods
 * For convenience, companion methods allow adding this writer conditionally:
 * - Use [install] to install for both debug and release builds.
 * - Use [installOnDebuggableApp] for debug builds.
 * - Use [installOnReleaseApp] for release builds.
 *
 * @constructor
 * @param minLevel The minimum log level to log. Default is [LogLevel.DEBUG].
 *                    Setting it below [LogPriority.MESSAGE] will enable `DEBUG` and `INFO` levels.
 */
public class GLibLogWriter(
    private val minLevel: LogLevel = LogLevel.DEBUG
) : LogWriter {
    init {
        // Enable debug-level logging in GLib if minPriority includes DEBUG or INFO
        if (minLevel < LogLevel.MESSAGE) {
            GLib.logSetDebugEnabled(true)
        }
    }

    override fun isLoggable(level: LogLevel): Boolean = level >= minLevel

    override fun write(level: LogLevel, domain: String, message: String) {
        g_log(domain, level.flags.mask, message)
    }
}

/**
 * Installs this writer for both debug and release builds.
 *
 * By default:
 * - For **debug builds**, the minimum priority level is set to [LogLevel.DEBUG].
 * - For **release builds**, the minimum priority level is set to [LogLevel.MESSAGE].
 *
 * Debug logs can still be enabled on release builds using:
 * ```bash
 * export G_MESSAGES_DEBUG=all
 * ```
 * Or restrict them to a specific domain:
 * ```bash
 * export G_MESSAGES_DEBUG=my_app
 * ```
 *
 * To prevent this behavior, explicitly set [minLevel] in [Log.installGLibLogWriterForReleaseBuilds].
 */
public fun Log.installGLibLogWriter(
    minLevelDebug: LogLevel = LogLevel.DEBUG,
    minLevelRelease: LogLevel = defaultReleaseLogLevel,
) {
    Log.installGLibLogWriterForDebugBuilds(minLevelDebug)
    Log.installGLibLogWriterForReleaseBuilds(minLevelRelease)
}

/**
 * Installs this writer for debug builds if the application is debuggable.
 *
 * @param minPriority The minimum log level to log. Default is [LogLevel.DEBUG].
 */
public fun Log.installGLibLogWriterForDebugBuilds(minPriority: LogLevel = LogLevel.DEBUG) {
    if (Platform.isDebugBinary) {
        Log.install(GLibLogWriter(minPriority))
    }
}

/**
 * Installs this writer for release builds if the application is not debuggable.
 *
 * Debug logs can still be enabled on release builds using the standard GLib `g_log` mechanism:
 * ```bash
 * export G_MESSAGES_DEBUG=all
 * ```
 * Or restrict them to a specific domain:
 * ```bash
 * export G_MESSAGES_DEBUG=my_app
 * ```
 *
 * To prevent this behavior, explicitly set [minPriority].
 *
 * @param minPriority The minimum log level to log. Default is [LogLevel.MESSAGE] in release builds,
 *                    or [LogPriority.DEBUG] if GLib debug mode is enabled.
 */
public fun Log.installGLibLogWriterForReleaseBuilds(
    minPriority: LogLevel = defaultReleaseLogLevel
) {
    if (!Platform.isDebugBinary) {
        Log.install(GLibLogWriter(minPriority))
    }
}
