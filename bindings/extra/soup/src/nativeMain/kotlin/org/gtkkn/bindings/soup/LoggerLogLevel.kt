// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupLoggerLogLevel
import org.gtkkn.native.soup.soup_logger_log_level_get_type

/**
 * Describes the level of logging output to provide.
 */
public enum class LoggerLogLevel(public val nativeValue: SoupLoggerLogLevel) {
    /**
     * No logging
     */
    NONE(SoupLoggerLogLevel.SOUP_LOGGER_LOG_NONE),

    /**
     * Log the Request-Line or Status-Line and
     *   the Soup-Debug pseudo-headers
     */
    MINIMAL(SoupLoggerLogLevel.SOUP_LOGGER_LOG_MINIMAL),

    /**
     * Log the full request/response headers
     */
    HEADERS(SoupLoggerLogLevel.SOUP_LOGGER_LOG_HEADERS),

    /**
     * Log the full headers and request/response bodies
     */
    BODY(SoupLoggerLogLevel.SOUP_LOGGER_LOG_BODY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupLoggerLogLevel): LoggerLogLevel = when (nativeValue) {
            SoupLoggerLogLevel.SOUP_LOGGER_LOG_NONE -> NONE
            SoupLoggerLogLevel.SOUP_LOGGER_LOG_MINIMAL -> MINIMAL
            SoupLoggerLogLevel.SOUP_LOGGER_LOG_HEADERS -> HEADERS
            SoupLoggerLogLevel.SOUP_LOGGER_LOG_BODY -> BODY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LoggerLogLevel
         *
         * @return the GType
         */
        public fun getType(): GType = soup_logger_log_level_get_type()
    }
}
