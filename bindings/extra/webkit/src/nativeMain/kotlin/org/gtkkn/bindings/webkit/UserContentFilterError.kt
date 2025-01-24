// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserContentFilterError
import org.gtkkn.native.webkit.webkit_user_content_filter_error_get_type
import org.gtkkn.native.webkit.webkit_user_content_filter_error_quark

/**
 * Errors that can occur while compiling content filters.
 * @since 2.24
 */
@WebKitVersion2_24
public enum class UserContentFilterError(public val nativeValue: WebKitUserContentFilterError) {
    /**
     * The JSON source for a content filter is invalid.
     */
    INVALID_SOURCE(WebKitUserContentFilterError.WEBKIT_USER_CONTENT_FILTER_ERROR_INVALID_SOURCE),

    /**
     * The requested content filter could not be found.
     */
    NOT_FOUND(WebKitUserContentFilterError.WEBKIT_USER_CONTENT_FILTER_ERROR_NOT_FOUND),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitUserContentFilterError): UserContentFilterError =
            when (nativeValue) {
                WebKitUserContentFilterError.WEBKIT_USER_CONTENT_FILTER_ERROR_INVALID_SOURCE -> INVALID_SOURCE
                WebKitUserContentFilterError.WEBKIT_USER_CONTENT_FILTER_ERROR_NOT_FOUND -> NOT_FOUND
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the quark for the domain of user content filter errors.
         *
         * @return user content filter error domain.
         */
        public fun quark(): Quark = webkit_user_content_filter_error_quark()

        /**
         * Get the GType of UserContentFilterError
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_content_filter_error_get_type()

        public fun fromErrorOrNull(error: Error): UserContentFilterError? = if (error.domain != quark()) {
            null
        } else {
            UserContentFilterError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
