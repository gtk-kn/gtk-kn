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

package org.gtkkn.extensions.glib.util.log.formatter

import org.gtkkn.extensions.glib.util.log.LogLevel

/**
 * A [LogFormatter] that prefixes the logs with ANSI color codes based on the log level and a [ColorMap].
 */
public class ColorLogFormatter(
    private val base: LogFormatter,
    private val colorMap: ColorMap = ColorMap(),
) : LogFormatter by base {
    override fun format(level: LogLevel, tag: String, message: String): String {
        val formattedMessage = base.format(level, tag, message)
        return applyColor(level, formattedMessage, colorMap)
    }

    public companion object {
        /**
         * Applies a color to the given string based on the log level.
         */
        internal fun applyColor(level: LogLevel, text: String, colorMap: ColorMap = ColorMap()): String {
            val ansiColor = when (level) {
                LogLevel.DEBUG -> colorMap.debug
                LogLevel.INFO -> colorMap.info
                LogLevel.MESSAGE -> colorMap.message
                LogLevel.WARNING -> colorMap.warning
                LogLevel.CRITICAL -> colorMap.critical
                LogLevel.ERROR -> colorMap.error
            }
            return "$ansiColor$text${ColorMap.RESET}"
        }
    }
}

public data class ColorMap(
    public val debug: String = GREY,
    public val info: String = GREEN,
    public val message: String = CYAN,
    public val warning: String = YELLOW,
    public val critical: String = RED,
    public val error: String = MAGENTA,
) {
    public companion object {
        public const val GREY: String = "\u001B[0;37m"
        public const val GREEN: String = "\u001B[0;32m"
        public const val CYAN: String = "\u001B[0;36m"
        public const val YELLOW: String = "\u001B[0;33m"
        public const val RED: String = "\u001B[0;31m"
        public const val MAGENTA: String = "\u001B[0;35m"
        public const val RESET: String = "\u001B[0m"
    }
}

public fun LogFormatter.withColor(colorMap: ColorMap = ColorMap()): LogFormatter = ColorLogFormatter(this, colorMap)
