// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GLogLevelFlags
import org.gtkkn.native.glib.G_LOG_FLAG_FATAL
import org.gtkkn.native.glib.G_LOG_FLAG_RECURSION
import org.gtkkn.native.glib.G_LOG_LEVEL_CRITICAL
import org.gtkkn.native.glib.G_LOG_LEVEL_DEBUG
import org.gtkkn.native.glib.G_LOG_LEVEL_ERROR
import org.gtkkn.native.glib.G_LOG_LEVEL_INFO
import org.gtkkn.native.glib.G_LOG_LEVEL_MASK
import org.gtkkn.native.glib.G_LOG_LEVEL_MESSAGE
import org.gtkkn.native.glib.G_LOG_LEVEL_WARNING

/**
 * Flags specifying the level of log messages.
 *
 * It is possible to change how GLib treats messages of the various
 * levels using [func@GLib.log_set_handler] and [func@GLib.log_set_fatal_mask].
 */
public class LogLevelFlags(public val mask: GLogLevelFlags) : Bitfield<LogLevelFlags> {
    override infix fun or(other: LogLevelFlags): LogLevelFlags = LogLevelFlags(mask or other.mask)

    public companion object {
        /**
         * internal flag
         */
        public val FLAG_RECURSION: LogLevelFlags = LogLevelFlags(G_LOG_FLAG_RECURSION)

        /**
         * internal flag
         */
        public val FLAG_FATAL: LogLevelFlags = LogLevelFlags(G_LOG_FLAG_FATAL)

        /**
         * log level for errors, see [func@GLib.error].
         *   This level is also used for messages produced by [func@GLib.assert].
         */
        public val LEVEL_ERROR: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_ERROR)

        /**
         * log level for critical warning messages, see
         *   [func@GLib.critical]. This level is also used for messages produced by
         *   [func@GLib.return_if_fail] and [func@GLib.return_val_if_fail].
         */
        public val LEVEL_CRITICAL: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_CRITICAL)

        /**
         * log level for warnings, see [func@GLib.warning]
         */
        public val LEVEL_WARNING: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_WARNING)

        /**
         * log level for messages, see [func@GLib.message]
         */
        public val LEVEL_MESSAGE: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_MESSAGE)

        /**
         * log level for informational messages, see [func@GLib.info]
         */
        public val LEVEL_INFO: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_INFO)

        /**
         * log level for debug messages, see [func@GLib.debug]
         */
        public val LEVEL_DEBUG: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_DEBUG)

        /**
         * a mask including all log levels
         */
        public val LEVEL_MASK: LogLevelFlags = LogLevelFlags(G_LOG_LEVEL_MASK)
    }
}
