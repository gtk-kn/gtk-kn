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
        val ansiColor = when (level) {
            LogLevel.DEBUG -> colorMap.debug
            LogLevel.INFO -> colorMap.info
            LogLevel.MESSAGE -> colorMap.message
            LogLevel.WARNING -> colorMap.warning
            LogLevel.CRITICAL -> colorMap.critical
            LogLevel.ERROR -> colorMap.error
        }
        return "${ansiColor}${base.format(level, tag, message)}${ColorMap.RESET}"
    }
}

public data class ColorMap(
    public val debug: String = WHITE,
    public val info: String = GREEN,
    public val message: String = CYAN,
    public val warning: String = YELLOW,
    public val critical: String = RED,
    public val error: String = MAGENTA,
) {
    public companion object {
        public const val WHITE: String = "\u001B[0;37m"
        public const val GREEN: String = "\u001B[0;32m"
        public const val CYAN: String = "\u001B[0;36m"
        public const val YELLOW: String = "\u001B[0;33m"
        public const val RED: String = "\u001B[0;31m"
        public const val MAGENTA: String = "\u001B[0;35m"
        public const val RESET: String = "\u001B[0m"
    }
}

public fun LogFormatter.withColor(colorMap: ColorMap = ColorMap()): LogFormatter = ColorLogFormatter(this, colorMap)
