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

package org.gtkkn.extensions.glib.util.log

import org.gtkkn.native.glib.GLogLevelFlags
import org.gtkkn.native.glib.G_LOG_LEVEL_CRITICAL
import org.gtkkn.native.glib.G_LOG_LEVEL_DEBUG
import org.gtkkn.native.glib.G_LOG_LEVEL_ERROR
import org.gtkkn.native.glib.G_LOG_LEVEL_INFO
import org.gtkkn.native.glib.G_LOG_LEVEL_MESSAGE
import org.gtkkn.native.glib.G_LOG_LEVEL_WARNING

/**
 * Log levels adapted from GLib log levels. Higher values indicate more severe messages.
 *
 * Mapping (lowest to highest):
 * - DEBUG   -> G_LOG_LEVEL_DEBUG
 * - INFO    -> G_LOG_LEVEL_INFO
 * - MESSAGE -> G_LOG_LEVEL_MESSAGE
 * - WARNING -> G_LOG_LEVEL_WARNING
 * - CRITICAL-> G_LOG_LEVEL_CRITICAL
 * - ERROR   -> G_LOG_LEVEL_ERROR
 */
public enum class LogLevel(
    internal val glibLevel: GLogLevelFlags,
    internal val severity: Int
) {
    CRITICAL(G_LOG_LEVEL_CRITICAL, 5),
    DEBUG(G_LOG_LEVEL_DEBUG, 1),
    ERROR(G_LOG_LEVEL_ERROR, 6),
    INFO(G_LOG_LEVEL_INFO, 2),
    MESSAGE(G_LOG_LEVEL_MESSAGE, 3),
    WARNING(G_LOG_LEVEL_WARNING, 4);

    /**
     * Converts a [LogLevel] to a single-character string representation.
     *
     * @return A single-character representation of the log level (e.g., `D` for DEBUG, `E` for ERROR).
     */
    public fun toShortString(): String = name.first().toString()
}
