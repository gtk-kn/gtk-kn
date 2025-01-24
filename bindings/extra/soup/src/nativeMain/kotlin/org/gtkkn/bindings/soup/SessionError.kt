// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupSessionError
import org.gtkkn.native.soup.soup_session_error_get_type
import org.gtkkn.native.soup.soup_session_error_quark

/**
 * A #SoupSession error.
 */
public enum class SessionError(public val nativeValue: SoupSessionError) {
    /**
     * the server's response could not
     *   be parsed
     */
    PARSING(SoupSessionError.SOUP_SESSION_ERROR_PARSING),

    /**
     * the server's response was in an
     *   unsupported format
     */
    ENCODING(SoupSessionError.SOUP_SESSION_ERROR_ENCODING),

    /**
     * the message has been redirected
     *   too many times
     */
    TOO_MANY_REDIRECTS(SoupSessionError.SOUP_SESSION_ERROR_TOO_MANY_REDIRECTS),

    /**
     * the message has been restarted
     *   too many times
     */
    TOO_MANY_RESTARTS(SoupSessionError.SOUP_SESSION_ERROR_TOO_MANY_RESTARTS),

    /**
     * failed to redirect message because
     *   Location header was missing or empty in response
     */
    REDIRECT_NO_LOCATION(SoupSessionError.SOUP_SESSION_ERROR_REDIRECT_NO_LOCATION),

    /**
     * failed to redirect message because
     *   Location header contains an invalid URI
     */
    REDIRECT_BAD_URI(SoupSessionError.SOUP_SESSION_ERROR_REDIRECT_BAD_URI),

    /**
     * the message is already in the
     *   session queue. Messages can only be reused after unqueued.
     */
    MESSAGE_ALREADY_IN_QUEUE(SoupSessionError.SOUP_SESSION_ERROR_MESSAGE_ALREADY_IN_QUEUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupSessionError): SessionError = when (nativeValue) {
            SoupSessionError.SOUP_SESSION_ERROR_PARSING -> PARSING
            SoupSessionError.SOUP_SESSION_ERROR_ENCODING -> ENCODING
            SoupSessionError.SOUP_SESSION_ERROR_TOO_MANY_REDIRECTS -> TOO_MANY_REDIRECTS
            SoupSessionError.SOUP_SESSION_ERROR_TOO_MANY_RESTARTS -> TOO_MANY_RESTARTS
            SoupSessionError.SOUP_SESSION_ERROR_REDIRECT_NO_LOCATION -> REDIRECT_NO_LOCATION
            SoupSessionError.SOUP_SESSION_ERROR_REDIRECT_BAD_URI -> REDIRECT_BAD_URI
            SoupSessionError.SOUP_SESSION_ERROR_MESSAGE_ALREADY_IN_QUEUE -> MESSAGE_ALREADY_IN_QUEUE
            else -> error("invalid nativeValue")
        }

        /**
         * Registers error quark for SoupSession if needed.
         *
         * @return Error quark for SoupSession.
         */
        public fun quark(): Quark = soup_session_error_quark()

        /**
         * Get the GType of SessionError
         *
         * @return the GType
         */
        public fun getType(): GType = soup_session_error_get_type()

        public fun fromErrorOrNull(error: Error): SessionError? = if (error.domain != quark()) {
            null
        } else {
            SessionError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
