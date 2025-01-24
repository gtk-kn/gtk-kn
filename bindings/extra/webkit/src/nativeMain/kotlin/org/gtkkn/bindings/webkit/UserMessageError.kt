// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserMessageError
import org.gtkkn.native.webkit.webkit_user_message_error_get_type
import org.gtkkn.native.webkit.webkit_user_message_error_quark

/**
 * Enum values used to denote errors happening when sending user messages.
 * @since 2.28
 */
@WebKitVersion2_28
public enum class UserMessageError(public val nativeValue: WebKitUserMessageError) {
    /**
     * The message was not handled by the receiver.
     */
    MESSAGE(WebKitUserMessageError.WEBKIT_USER_MESSAGE_UNHANDLED_MESSAGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitUserMessageError): UserMessageError = when (nativeValue) {
            WebKitUserMessageError.WEBKIT_USER_MESSAGE_UNHANDLED_MESSAGE -> MESSAGE
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the quark for the domain of user message errors.
         *
         * @return user message error domain.
         */
        public fun quark(): Quark = webkit_user_message_error_quark()

        /**
         * Get the GType of UserMessageError
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_message_error_get_type()

        public fun fromErrorOrNull(error: Error): UserMessageError? = if (error.domain != quark()) {
            null
        } else {
            UserMessageError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
